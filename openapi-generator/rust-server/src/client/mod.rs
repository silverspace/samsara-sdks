#![allow(unused_extern_crates)]
extern crate tokio_core;
extern crate native_tls;
extern crate hyper_tls;
extern crate openssl;
extern crate mime;
extern crate chrono;
extern crate url;



use hyper;
use hyper::header::{Headers, ContentType};
use hyper::Uri;
use self::url::percent_encoding::{utf8_percent_encode, PATH_SEGMENT_ENCODE_SET, QUERY_ENCODE_SET};
use futures;
use futures::{Future, Stream};
use futures::{future, stream};
use self::tokio_core::reactor::Handle;
use std::borrow::Cow;
use std::io::{Read, Error, ErrorKind};
use std::error;
use std::fmt;
use std::path::Path;
use std::sync::Arc;
use std::str;
use std::str::FromStr;
use std::string::ToString;

use mimetypes;

use serde_json;


#[allow(unused_imports)]
use std::collections::{HashMap, BTreeMap};
#[allow(unused_imports)]
use swagger;

use swagger::{ApiError, XSpanId, XSpanIdString, Has, AuthData};

use {Api,
     GetAllAssetCurrentLocationsResponse,
     GetAllAssetsResponse,
     GetAssetLocationResponse,
     GetAssetReeferResponse,
     CreateDriverResponse,
     DeactivateDriverResponse,
     GetAllDeactivatedDriversResponse,
     GetDeactivatedDriverByIdResponse,
     GetDriverByIdResponse,
     ReactivateDriverByIdResponse,
     AddFleetAddressResponse,
     AddOrganizationAddressesResponse,
     CreateDispatchRouteResponse,
     CreateDriverResponse,
     CreateDriverDispatchRouteResponse,
     CreateDriverDocumentResponse,
     CreateDvirResponse,
     CreateVehicleDispatchRouteResponse,
     DeactivateDriverResponse,
     DeleteDispatchRouteByIdResponse,
     DeleteOrganizationAddressResponse,
     FetchAllDispatchRoutesResponse,
     FetchAllRouteJobUpdatesResponse,
     GetAllAssetCurrentLocationsResponse,
     GetAllAssetsResponse,
     GetAllDeactivatedDriversResponse,
     GetAssetLocationResponse,
     GetAssetReeferResponse,
     GetDeactivatedDriverByIdResponse,
     GetDispatchRouteByIdResponse,
     GetDispatchRouteHistoryResponse,
     GetDispatchRoutesByDriverIdResponse,
     GetDispatchRoutesByVehicleIdResponse,
     GetDriverByIdResponse,
     GetDriverDocumentTypesByOrgIdResponse,
     GetDriverDocumentsByOrgIdResponse,
     GetDriverSafetyScoreResponse,
     GetDvirsResponse,
     GetFleetDriversResponse,
     GetFleetDriversHosDailyLogsResponse,
     GetFleetDriversSummaryResponse,
     GetFleetHosAuthenticationLogsResponse,
     GetFleetHosLogsResponse,
     GetFleetHosLogsSummaryResponse,
     GetFleetLocationsResponse,
     GetFleetMaintenanceListResponse,
     GetFleetTripsResponse,
     GetFleetVehicleResponse,
     GetOrganizationAddressResponse,
     GetOrganizationAddressesResponse,
     GetOrganizationContactResponse,
     GetVehicleHarshEventResponse,
     GetVehicleLocationsResponse,
     GetVehicleSafetyScoreResponse,
     GetVehicleStatsResponse,
     GetVehiclesLocationsResponse,
     ListContactsResponse,
     ListFleetResponse,
     PatchFleetVehicleResponse,
     ReactivateDriverByIdResponse,
     UpdateDispatchRouteByIdResponse,
     UpdateOrganizationAddressResponse,
     UpdateVehiclesResponse,
     GetAllDataInputsResponse,
     GetDataInputResponse,
     GetMachinesResponse,
     GetMachinesHistoryResponse,
     CreateDispatchRouteResponse,
     CreateDriverDispatchRouteResponse,
     CreateVehicleDispatchRouteResponse,
     DeleteDispatchRouteByIdResponse,
     FetchAllDispatchRoutesResponse,
     FetchAllRouteJobUpdatesResponse,
     GetDispatchRouteByIdResponse,
     GetDispatchRouteHistoryResponse,
     GetDispatchRoutesByDriverIdResponse,
     GetDispatchRoutesByVehicleIdResponse,
     UpdateDispatchRouteByIdResponse,
     GetDriverSafetyScoreResponse,
     GetVehicleHarshEventResponse,
     GetVehicleSafetyScoreResponse,
     GetSensorsResponse,
     GetSensorsCargoResponse,
     GetSensorsDoorResponse,
     GetSensorsHistoryResponse,
     GetSensorsHumidityResponse,
     GetSensorsTemperatureResponse,
     CreateTagResponse,
     DeleteTagByIdResponse,
     GetAllTagsResponse,
     GetTagByIdResponse,
     ModifyTagByIdResponse,
     UpdateTagByIdResponse,
     DeleteUserByIdResponse,
     GetUserByIdResponse,
     ListUserRolesResponse,
     ListUsersResponse
     };
use models;

define_encode_set! {
    /// This encode set is used for object IDs
    ///
    /// Aside from the special characters defined in the `PATH_SEGMENT_ENCODE_SET`,
    /// the vertical bar (|) is encoded.
    pub ID_ENCODE_SET = [PATH_SEGMENT_ENCODE_SET] | {'|'}
}

/// Convert input into a base path, e.g. "http://example:123". Also checks the scheme as it goes.
fn into_base_path(input: &str, correct_scheme: Option<&'static str>) -> Result<String, ClientInitError> {
    // First convert to Uri, since a base path is a subset of Uri.
    let uri = Uri::from_str(input)?;

    let scheme = uri.scheme().ok_or(ClientInitError::InvalidScheme)?;

    // Check the scheme if necessary
    if let Some(correct_scheme) = correct_scheme {
        if scheme != correct_scheme {
            return Err(ClientInitError::InvalidScheme);
        }
    }

    let host = uri.host().ok_or_else(|| ClientInitError::MissingHost)?;
    let port = uri.port().map(|x| format!(":{}", x)).unwrap_or_default();
    Ok(format!("{}://{}{}", scheme, host, port))
}

/// A client that implements the API by making HTTP calls out to a server.
pub struct Client<F> where
  F: Future<Item=hyper::Response, Error=hyper::Error> + 'static {
    client_service: Arc<Box<hyper::client::Service<Request=hyper::Request<hyper::Body>, Response=hyper::Response, Error=hyper::Error, Future=F>>>,
    base_path: String,
}

impl<F> fmt::Debug for Client<F> where
   F: Future<Item=hyper::Response, Error=hyper::Error>  + 'static {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        write!(f, "Client {{ base_path: {} }}", self.base_path)
    }
}

impl<F> Clone for Client<F> where
   F: Future<Item=hyper::Response, Error=hyper::Error>  + 'static {
    fn clone(&self) -> Self {
        Client {
            client_service: self.client_service.clone(),
            base_path: self.base_path.clone()
        }
    }
}

impl Client<hyper::client::FutureResponse> {

    /// Create an HTTP client.
    ///
    /// # Arguments
    /// * `handle` - tokio reactor handle to use for execution
    /// * `base_path` - base path of the client API, i.e. "www.my-api-implementation.com"
    pub fn try_new_http(handle: Handle, base_path: &str) -> Result<Client<hyper::client::FutureResponse>, ClientInitError> {
        let http_connector = swagger::http_connector();
        Self::try_new_with_connector::<hyper::client::HttpConnector>(
            handle,
            base_path,
            Some("http"),
            http_connector,
        )
    }

    /// Create a client with a TLS connection to the server.
    ///
    /// # Arguments
    /// * `handle` - tokio reactor handle to use for execution
    /// * `base_path` - base path of the client API, i.e. "www.my-api-implementation.com"
    /// * `ca_certificate` - Path to CA certificate used to authenticate the server
    pub fn try_new_https<CA>(
        handle: Handle,
        base_path: &str,
        ca_certificate: CA,
    ) -> Result<Client<hyper::client::FutureResponse>, ClientInitError>
    where
        CA: AsRef<Path>,
    {
        let https_connector = swagger::https_connector(ca_certificate);
        Self::try_new_with_connector::<hyper_tls::HttpsConnector<hyper::client::HttpConnector>>(
            handle,
            base_path,
            Some("https"),
            https_connector,
        )
    }

    /// Create a client with a mutually authenticated TLS connection to the server.
    ///
    /// # Arguments
    /// * `handle` - tokio reactor handle to use for execution
    /// * `base_path` - base path of the client API, i.e. "www.my-api-implementation.com"
    /// * `ca_certificate` - Path to CA certificate used to authenticate the server
    /// * `client_key` - Path to the client private key
    /// * `client_certificate` - Path to the client's public certificate associated with the private key
    pub fn try_new_https_mutual<CA, K, C>(
        handle: Handle,
        base_path: &str,
        ca_certificate: CA,
        client_key: K,
        client_certificate: C,
    ) -> Result<Client<hyper::client::FutureResponse>, ClientInitError>
    where
        CA: AsRef<Path>,
        K: AsRef<Path>,
        C: AsRef<Path>,
    {
        let https_connector =
            swagger::https_mutual_connector(ca_certificate, client_key, client_certificate);
        Self::try_new_with_connector::<hyper_tls::HttpsConnector<hyper::client::HttpConnector>>(
            handle,
            base_path,
            Some("https"),
            https_connector,
        )
    }

    /// Create a client with a custom implementation of hyper::client::Connect.
    ///
    /// Intended for use with custom implementations of connect for e.g. protocol logging
    /// or similar functionality which requires wrapping the transport layer. When wrapping a TCP connection,
    /// this function should be used in conjunction with
    /// `swagger::{http_connector, https_connector, https_mutual_connector}`.
    ///
    /// For ordinary tcp connections, prefer the use of `try_new_http`, `try_new_https`
    /// and `try_new_https_mutual`, to avoid introducing a dependency on the underlying transport layer.
    ///
    /// # Arguments
    ///
    /// * `handle` - tokio reactor handle to use for execution
    /// * `base_path` - base path of the client API, i.e. "www.my-api-implementation.com"
    /// * `protocol` - Which protocol to use when constructing the request url, e.g. `Some("http")`
    /// * `connector_fn` - Function which returns an implementation of `hyper::client::Connect`
    pub fn try_new_with_connector<C>(
        handle: Handle,
        base_path: &str,
        protocol: Option<&'static str>,
        connector_fn: Box<Fn(&Handle) -> C + Send + Sync>,
    ) -> Result<Client<hyper::client::FutureResponse>, ClientInitError>
    where
        C: hyper::client::Connect + hyper::client::Service,
    {
        let connector = connector_fn(&handle);
        let client_service = Box::new(hyper::Client::configure().connector(connector).build(
            &handle,
        ));

        Ok(Client {
            client_service: Arc::new(client_service),
            base_path: into_base_path(base_path, protocol)?,
        })
    }

    /// Constructor for creating a `Client` by passing in a pre-made `hyper` client.
    ///
    /// One should avoid relying on this function if possible, since it adds a dependency on the underlying transport
    /// implementation, which it would be better to abstract away. Therefore, using this function may lead to a loss of
    /// code generality, which may make it harder to move the application to a serverless environment, for example.
    ///
    /// The reason for this function's existence is to support legacy test code, which did mocking at the hyper layer.
    /// This is not a recommended way to write new tests. If other reasons are found for using this function, they
    /// should be mentioned here.
    #[deprecated(note="Use try_new_with_client_service instead")]
    pub fn try_new_with_hyper_client(
        hyper_client: Arc<Box<hyper::client::Service<Request=hyper::Request<hyper::Body>, Response=hyper::Response, Error=hyper::Error, Future=hyper::client::FutureResponse>>>,
        handle: Handle,
        base_path: &str
    ) -> Result<Client<hyper::client::FutureResponse>, ClientInitError>
    {
        Ok(Client {
            client_service: hyper_client,
            base_path: into_base_path(base_path, None)?,
        })
    }
}

impl<F> Client<F> where
    F: Future<Item=hyper::Response, Error=hyper::Error>  + 'static
{
    /// Constructor for creating a `Client` by passing in a pre-made `hyper` client Service.
    ///
    /// This allows adding custom wrappers around the underlying transport, for example for logging.
    pub fn try_new_with_client_service(client_service: Arc<Box<hyper::client::Service<Request=hyper::Request<hyper::Body>, Response=hyper::Response, Error=hyper::Error, Future=F>>>,
                                       handle: Handle,
                                       base_path: &str)
                                    -> Result<Client<F>, ClientInitError>
    {
        Ok(Client {
            client_service: client_service,
            base_path: into_base_path(base_path, None)?,
        })
    }
}

impl<F, C> Api<C> for Client<F> where
    F: Future<Item=hyper::Response, Error=hyper::Error>  + 'static,
    C: Has<XSpanIdString> {

    fn get_all_asset_current_locations(&self, param_access_token: String, param_group_id: Option<i64>, context: &C) -> Box<Future<Item=GetAllAssetCurrentLocationsResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/assets/locations",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        if let Some(group_id) = param_group_id {
            query_string.append_pair("group_id", &group_id.to_string());
        }
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::InlineResponse2001>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAllAssetCurrentLocationsResponse::ListOfAssetsAndTheirCurrentLocations(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAllAssetCurrentLocationsResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_all_assets(&self, param_access_token: String, param_group_id: Option<i64>, context: &C) -> Box<Future<Item=GetAllAssetsResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/assets",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        if let Some(group_id) = param_group_id {
            query_string.append_pair("group_id", &group_id.to_string());
        }
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::InlineResponse200>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAllAssetsResponse::ListOfAssets(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAllAssetsResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_asset_location(&self, param_access_token: String, param_asset_id: i64, param_start_ms: i64, param_end_ms: i64, context: &C) -> Box<Future<Item=GetAssetLocationResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/assets/{asset_id}/locations",
            self.base_path, asset_id=utf8_percent_encode(&param_asset_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        query_string.append_pair("startMs", &param_start_ms.to_string());
        query_string.append_pair("endMs", &param_end_ms.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Vec<object>>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAssetLocationResponse::AssetLocationDetails(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAssetLocationResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_asset_reefer(&self, param_access_token: String, param_asset_id: i64, param_start_ms: i64, param_end_ms: i64, context: &C) -> Box<Future<Item=GetAssetReeferResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/assets/{asset_id}/reefer",
            self.base_path, asset_id=utf8_percent_encode(&param_asset_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        query_string.append_pair("startMs", &param_start_ms.to_string());
        query_string.append_pair("endMs", &param_end_ms.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::AssetReeferResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAssetReeferResponse::Reefer(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAssetReeferResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn create_driver(&self, param_access_token: String, param_create_driver_param: models::DriverForCreate, context: &C) -> Box<Future<Item=CreateDriverResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/drivers/create",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        // Body parameter

        let body = serde_json::to_string(&param_create_driver_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::CREATE_DRIVER.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::Driver>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            CreateDriverResponse::ReturnsTheSuccessfullyCreatedTheDriver(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            CreateDriverResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn deactivate_driver(&self, param_access_token: String, param_driver_id_or_external_id: String, context: &C) -> Box<Future<Item=DeactivateDriverResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/drivers/{driver_id_or_external_id}",
            self.base_path, driver_id_or_external_id=utf8_percent_encode(&param_driver_id_or_external_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Delete, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            DeactivateDriverResponse::SuccessfullyDeactivatedTheDriver
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            DeactivateDriverResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_all_deactivated_drivers(&self, param_access_token: String, param_group_id: Option<i64>, context: &C) -> Box<Future<Item=GetAllDeactivatedDriversResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/drivers/inactive",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        if let Some(group_id) = param_group_id {
            query_string.append_pair("group_id", &group_id.to_string());
        }
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Vec<models::Driver>>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAllDeactivatedDriversResponse::ReturnsAnArrayOfAllDeactivatedDriversForTheGroup(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAllDeactivatedDriversResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_deactivated_driver_by_id(&self, param_access_token: String, param_driver_id_or_external_id: String, context: &C) -> Box<Future<Item=GetDeactivatedDriverByIdResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/drivers/inactive/{driver_id_or_external_id}",
            self.base_path, driver_id_or_external_id=utf8_percent_encode(&param_driver_id_or_external_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::Driver>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDeactivatedDriverByIdResponse::ReturnsTheDeactivatedDriverWithTheGivenDriver(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDeactivatedDriverByIdResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_driver_by_id(&self, param_access_token: String, param_driver_id_or_external_id: String, context: &C) -> Box<Future<Item=GetDriverByIdResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/drivers/{driver_id_or_external_id}",
            self.base_path, driver_id_or_external_id=utf8_percent_encode(&param_driver_id_or_external_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::Driver>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDriverByIdResponse::ReturnsTheDriverForTheGivenDriver(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDriverByIdResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn reactivate_driver_by_id(&self, param_access_token: String, param_driver_id_or_external_id: String, param_reactivate_driver_param: models::InlineObject4, context: &C) -> Box<Future<Item=ReactivateDriverByIdResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/drivers/inactive/{driver_id_or_external_id}",
            self.base_path, driver_id_or_external_id=utf8_percent_encode(&param_driver_id_or_external_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Put, uri);


        let body = serde_json::to_string(&param_reactivate_driver_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::REACTIVATE_DRIVER_BY_ID.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::Driver>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            ReactivateDriverByIdResponse::ReturnsTheReactivatedDriver(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            ReactivateDriverByIdResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn add_fleet_address(&self, param_access_token: String, param_address_param: models::InlineObject2, context: &C) -> Box<Future<Item=AddFleetAddressResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/add_address",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        // Body parameter

        let body = serde_json::to_string(&param_address_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::ADD_FLEET_ADDRESS.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            AddFleetAddressResponse::AddressWasSuccessfullyAdded
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            AddFleetAddressResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn add_organization_addresses(&self, param_access_token: String, param_addresses: models::InlineObject, context: &C) -> Box<Future<Item=AddOrganizationAddressesResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/addresses",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_addresses).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::ADD_ORGANIZATION_ADDRESSES.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Vec<models::Address>>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            AddOrganizationAddressesResponse::ListOfAddedAddresses(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            AddOrganizationAddressesResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn create_dispatch_route(&self, param_access_token: String, param_create_dispatch_route_params: models::DispatchRouteCreate, context: &C) -> Box<Future<Item=CreateDispatchRouteResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/dispatch/routes",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_create_dispatch_route_params).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::CREATE_DISPATCH_ROUTE.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::DispatchRoute>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            CreateDispatchRouteResponse::CreatedRouteObjectIncludingTheNewRouteID(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            CreateDispatchRouteResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn create_driver(&self, param_access_token: String, param_create_driver_param: models::DriverForCreate, context: &C) -> Box<Future<Item=CreateDriverResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/drivers/create",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_create_driver_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::CREATE_DRIVER.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::Driver>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            CreateDriverResponse::ReturnsTheSuccessfullyCreatedTheDriver(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            CreateDriverResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn create_driver_dispatch_route(&self, param_access_token: String, param_driver_id: i64, param_create_dispatch_route_params: models::DispatchRouteCreate, context: &C) -> Box<Future<Item=CreateDriverDispatchRouteResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/drivers/{driver_id}/dispatch/routes",
            self.base_path, driver_id=utf8_percent_encode(&param_driver_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_create_dispatch_route_params).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::CREATE_DRIVER_DISPATCH_ROUTE.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::DispatchRoute>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            CreateDriverDispatchRouteResponse::CreatedRouteObjectIncludingTheNewRouteID(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            CreateDriverDispatchRouteResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn create_driver_document(&self, param_access_token: String, param_driver_id: i64, param_create_document_params: models::DocumentCreate, context: &C) -> Box<Future<Item=CreateDriverDocumentResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/drivers/{driver_id}/documents",
            self.base_path, driver_id=utf8_percent_encode(&param_driver_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_create_document_params).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::CREATE_DRIVER_DOCUMENT.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::Document>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            CreateDriverDocumentResponse::ReturnsTheCreatedDocument(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            CreateDriverDocumentResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn create_dvir(&self, param_access_token: String, param_create_dvir_param: models::InlineObject12, context: &C) -> Box<Future<Item=CreateDvirResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/maintenance/dvirs",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_create_dvir_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::CREATE_DVIR.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::DvirBase>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            CreateDvirResponse::NewlyCreatedDVIR(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            CreateDvirResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn create_vehicle_dispatch_route(&self, param_access_token: String, param_vehicle_id: i64, param_create_dispatch_route_params: models::DispatchRouteCreate, context: &C) -> Box<Future<Item=CreateVehicleDispatchRouteResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/vehicles/{vehicle_id}/dispatch/routes",
            self.base_path, vehicle_id=utf8_percent_encode(&param_vehicle_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_create_dispatch_route_params).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::CREATE_VEHICLE_DISPATCH_ROUTE.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::DispatchRoute>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            CreateVehicleDispatchRouteResponse::CreatedRouteObjectIncludingTheNewRouteID(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            CreateVehicleDispatchRouteResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn deactivate_driver(&self, param_access_token: String, param_driver_id_or_external_id: String, context: &C) -> Box<Future<Item=DeactivateDriverResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/drivers/{driver_id_or_external_id}",
            self.base_path, driver_id_or_external_id=utf8_percent_encode(&param_driver_id_or_external_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Delete, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            DeactivateDriverResponse::SuccessfullyDeactivatedTheDriver
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            DeactivateDriverResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn delete_dispatch_route_by_id(&self, param_access_token: String, param_route_id: i64, context: &C) -> Box<Future<Item=DeleteDispatchRouteByIdResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/dispatch/routes/{route_id}",
            self.base_path, route_id=utf8_percent_encode(&param_route_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Delete, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            DeleteDispatchRouteByIdResponse::SuccessfullyDeletedTheDispatchRoute
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            DeleteDispatchRouteByIdResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn delete_organization_address(&self, param_access_token: String, param_address_id: i64, context: &C) -> Box<Future<Item=DeleteOrganizationAddressResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/addresses/{addressId}",
            self.base_path, addressId=utf8_percent_encode(&param_address_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Delete, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            DeleteOrganizationAddressResponse::AddressWasSuccessfullyDeleted
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            DeleteOrganizationAddressResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn fetch_all_dispatch_routes(&self, param_access_token: String, param_group_id: Option<i64>, param_end_time: Option<i64>, param_duration: Option<i64>, context: &C) -> Box<Future<Item=FetchAllDispatchRoutesResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/dispatch/routes",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        if let Some(group_id) = param_group_id {
            query_string.append_pair("group_id", &group_id.to_string());
        }
        if let Some(end_time) = param_end_time {
            query_string.append_pair("end_time", &end_time.to_string());
        }
        if let Some(duration) = param_duration {
            query_string.append_pair("duration", &duration.to_string());
        }
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Vec<models::DispatchRoute>>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            FetchAllDispatchRoutesResponse::AllDispatchRouteObjectsForTheGroup(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            FetchAllDispatchRoutesResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn fetch_all_route_job_updates(&self, param_access_token: String, param_group_id: Option<i64>, param_sequence_id: Option<String>, param_include: Option<String>, context: &C) -> Box<Future<Item=FetchAllRouteJobUpdatesResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/dispatch/routes/job_updates",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        if let Some(group_id) = param_group_id {
            query_string.append_pair("group_id", &group_id.to_string());
        }
        if let Some(sequence_id) = param_sequence_id {
            query_string.append_pair("sequence_id", &sequence_id.to_string());
        }
        if let Some(include) = param_include {
            query_string.append_pair("include", &include.to_string());
        }
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::AllRouteJobUpdates>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            FetchAllRouteJobUpdatesResponse::AllJobUpdatesOnRoutes(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            FetchAllRouteJobUpdatesResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_all_asset_current_locations(&self, param_access_token: String, param_group_id: Option<i64>, context: &C) -> Box<Future<Item=GetAllAssetCurrentLocationsResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/assets/locations",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        if let Some(group_id) = param_group_id {
            query_string.append_pair("group_id", &group_id.to_string());
        }
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::InlineResponse2001>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAllAssetCurrentLocationsResponse::ListOfAssetsAndTheirCurrentLocations(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAllAssetCurrentLocationsResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_all_assets(&self, param_access_token: String, param_group_id: Option<i64>, context: &C) -> Box<Future<Item=GetAllAssetsResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/assets",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        if let Some(group_id) = param_group_id {
            query_string.append_pair("group_id", &group_id.to_string());
        }
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::InlineResponse200>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAllAssetsResponse::ListOfAssets(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAllAssetsResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_all_deactivated_drivers(&self, param_access_token: String, param_group_id: Option<i64>, context: &C) -> Box<Future<Item=GetAllDeactivatedDriversResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/drivers/inactive",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        if let Some(group_id) = param_group_id {
            query_string.append_pair("group_id", &group_id.to_string());
        }
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Vec<models::Driver>>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAllDeactivatedDriversResponse::ReturnsAnArrayOfAllDeactivatedDriversForTheGroup(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAllDeactivatedDriversResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_asset_location(&self, param_access_token: String, param_asset_id: i64, param_start_ms: i64, param_end_ms: i64, context: &C) -> Box<Future<Item=GetAssetLocationResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/assets/{asset_id}/locations",
            self.base_path, asset_id=utf8_percent_encode(&param_asset_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        query_string.append_pair("startMs", &param_start_ms.to_string());
        query_string.append_pair("endMs", &param_end_ms.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Vec<object>>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAssetLocationResponse::AssetLocationDetails(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAssetLocationResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_asset_reefer(&self, param_access_token: String, param_asset_id: i64, param_start_ms: i64, param_end_ms: i64, context: &C) -> Box<Future<Item=GetAssetReeferResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/assets/{asset_id}/reefer",
            self.base_path, asset_id=utf8_percent_encode(&param_asset_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        query_string.append_pair("startMs", &param_start_ms.to_string());
        query_string.append_pair("endMs", &param_end_ms.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::AssetReeferResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAssetReeferResponse::Reefer(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAssetReeferResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_deactivated_driver_by_id(&self, param_access_token: String, param_driver_id_or_external_id: String, context: &C) -> Box<Future<Item=GetDeactivatedDriverByIdResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/drivers/inactive/{driver_id_or_external_id}",
            self.base_path, driver_id_or_external_id=utf8_percent_encode(&param_driver_id_or_external_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::Driver>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDeactivatedDriverByIdResponse::ReturnsTheDeactivatedDriverWithTheGivenDriver(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDeactivatedDriverByIdResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_dispatch_route_by_id(&self, param_access_token: String, param_route_id: i64, context: &C) -> Box<Future<Item=GetDispatchRouteByIdResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/dispatch/routes/{route_id}",
            self.base_path, route_id=utf8_percent_encode(&param_route_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::DispatchRoute>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDispatchRouteByIdResponse::TheDispatchRouteCorrespondingToRoute(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDispatchRouteByIdResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_dispatch_route_history(&self, param_access_token: String, param_route_id: i64, param_start_time: Option<i64>, param_end_time: Option<i64>, context: &C) -> Box<Future<Item=GetDispatchRouteHistoryResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/dispatch/routes/{route_id}/history",
            self.base_path, route_id=utf8_percent_encode(&param_route_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        if let Some(start_time) = param_start_time {
            query_string.append_pair("start_time", &start_time.to_string());
        }
        if let Some(end_time) = param_end_time {
            query_string.append_pair("end_time", &end_time.to_string());
        }
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::DispatchRouteHistory>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDispatchRouteHistoryResponse::TheHistoricalRouteStateChangesBetweenStart(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDispatchRouteHistoryResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_dispatch_routes_by_driver_id(&self, param_access_token: String, param_driver_id: i64, param_end_time: Option<i64>, param_duration: Option<i64>, context: &C) -> Box<Future<Item=GetDispatchRoutesByDriverIdResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/drivers/{driver_id}/dispatch/routes",
            self.base_path, driver_id=utf8_percent_encode(&param_driver_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        if let Some(end_time) = param_end_time {
            query_string.append_pair("end_time", &end_time.to_string());
        }
        if let Some(duration) = param_duration {
            query_string.append_pair("duration", &duration.to_string());
        }
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Vec<models::DispatchRoute>>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDispatchRoutesByDriverIdResponse::ReturnsTheDispatchRoutesForTheGivenDriver(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDispatchRoutesByDriverIdResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_dispatch_routes_by_vehicle_id(&self, param_access_token: String, param_vehicle_id: i64, param_end_time: Option<i64>, param_duration: Option<i64>, context: &C) -> Box<Future<Item=GetDispatchRoutesByVehicleIdResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/vehicles/{vehicle_id}/dispatch/routes",
            self.base_path, vehicle_id=utf8_percent_encode(&param_vehicle_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        if let Some(end_time) = param_end_time {
            query_string.append_pair("end_time", &end_time.to_string());
        }
        if let Some(duration) = param_duration {
            query_string.append_pair("duration", &duration.to_string());
        }
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Vec<models::DispatchRoute>>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDispatchRoutesByVehicleIdResponse::ReturnsAllOfTheDispatchRoutesForTheGivenVehicle(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDispatchRoutesByVehicleIdResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_driver_by_id(&self, param_access_token: String, param_driver_id_or_external_id: String, context: &C) -> Box<Future<Item=GetDriverByIdResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/drivers/{driver_id_or_external_id}",
            self.base_path, driver_id_or_external_id=utf8_percent_encode(&param_driver_id_or_external_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::Driver>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDriverByIdResponse::ReturnsTheDriverForTheGivenDriver(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDriverByIdResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_driver_document_types_by_org_id(&self, context: &C) -> Box<Future<Item=GetDriverDocumentTypesByOrgIdResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/drivers/document_types",
            self.base_path
        );

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Vec<models::DocumentType>>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDriverDocumentTypesByOrgIdResponse::ReturnsAllOfTheDocumentTypes(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDriverDocumentTypesByOrgIdResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_driver_documents_by_org_id(&self, param_access_token: String, param_end_ms: Option<i64>, param_duration_ms: Option<i64>, context: &C) -> Box<Future<Item=GetDriverDocumentsByOrgIdResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/drivers/documents",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        if let Some(end_ms) = param_end_ms {
            query_string.append_pair("endMs", &end_ms.to_string());
        }
        if let Some(duration_ms) = param_duration_ms {
            query_string.append_pair("durationMs", &duration_ms.to_string());
        }
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Vec<models::Document>>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDriverDocumentsByOrgIdResponse::ReturnsAllOfTheDocuments(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDriverDocumentsByOrgIdResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_driver_safety_score(&self, param_driver_id: i64, param_access_token: String, param_start_ms: i64, param_end_ms: i64, context: &C) -> Box<Future<Item=GetDriverSafetyScoreResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/drivers/{driverId}/safety/score",
            self.base_path, driverId=utf8_percent_encode(&param_driver_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        query_string.append_pair("startMs", &param_start_ms.to_string());
        query_string.append_pair("endMs", &param_end_ms.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::DriverSafetyScoreResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDriverSafetyScoreResponse::SafetyScoreDetails(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDriverSafetyScoreResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_dvirs(&self, param_access_token: String, param_end_ms: i32, param_duration_ms: i32, param_group_id: Option<i32>, context: &C) -> Box<Future<Item=GetDvirsResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/maintenance/dvirs",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        query_string.append_pair("end_ms", &param_end_ms.to_string());
        query_string.append_pair("duration_ms", &param_duration_ms.to_string());
        if let Some(group_id) = param_group_id {
            query_string.append_pair("group_id", &group_id.to_string());
        }
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::DvirListResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDvirsResponse::DVIRsForTheSpecifiedDuration(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDvirsResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_fleet_drivers(&self, param_access_token: String, param_group_drivers_param: models::InlineObject3, context: &C) -> Box<Future<Item=GetFleetDriversResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/drivers",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_group_drivers_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::GET_FLEET_DRIVERS.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::DriversResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetFleetDriversResponse::AllDriversInTheGroup(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetFleetDriversResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_fleet_drivers_hos_daily_logs(&self, param_access_token: String, param_driver_id: i64, param_hos_logs_param: models::InlineObject6, context: &C) -> Box<Future<Item=GetFleetDriversHosDailyLogsResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/drivers/{driver_id}/hos_daily_logs",
            self.base_path, driver_id=utf8_percent_encode(&param_driver_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_hos_logs_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::GET_FLEET_DRIVERS_HOS_DAILY_LOGS.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::DriverDailyLogResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetFleetDriversHosDailyLogsResponse::DistanceTraveledAndTimeActiveForEachDriverInTheOrganizationOverTheSpecifiedTimePeriod(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetFleetDriversHosDailyLogsResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_fleet_drivers_summary(&self, param_access_token: String, param_drivers_summary_param: models::InlineObject5, param_snap_to_day_bounds: Option<bool>, context: &C) -> Box<Future<Item=GetFleetDriversSummaryResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/drivers/summary",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        if let Some(snap_to_day_bounds) = param_snap_to_day_bounds {
            query_string.append_pair("snap_to_day_bounds", &snap_to_day_bounds.to_string());
        }
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_drivers_summary_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::GET_FLEET_DRIVERS_SUMMARY.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::DriversSummaryResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetFleetDriversSummaryResponse::DistanceTraveledAndTimeActiveForEachDriverInTheOrganizationOverTheSpecifiedTimePeriod(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetFleetDriversSummaryResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_fleet_hos_authentication_logs(&self, param_access_token: String, param_hos_authentication_logs_param: models::InlineObject7, context: &C) -> Box<Future<Item=GetFleetHosAuthenticationLogsResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/hos_authentication_logs",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_hos_authentication_logs_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::GET_FLEET_HOS_AUTHENTICATION_LOGS.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::HosAuthenticationLogsResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetFleetHosAuthenticationLogsResponse::HOSAuthenticationLogsForTheSpecifiedDriver(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetFleetHosAuthenticationLogsResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_fleet_hos_logs(&self, param_access_token: String, param_hos_logs_param: models::InlineObject8, context: &C) -> Box<Future<Item=GetFleetHosLogsResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/hos_logs",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_hos_logs_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::GET_FLEET_HOS_LOGS.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::HosLogsResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetFleetHosLogsResponse::HOSLogsForTheSpecifiedDriver(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetFleetHosLogsResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_fleet_hos_logs_summary(&self, param_access_token: String, param_hos_logs_param: models::InlineObject9, context: &C) -> Box<Future<Item=GetFleetHosLogsSummaryResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/hos_logs_summary",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_hos_logs_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::GET_FLEET_HOS_LOGS_SUMMARY.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::HosLogsSummaryResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetFleetHosLogsSummaryResponse::HOSLogsForTheSpecifiedDriver(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetFleetHosLogsSummaryResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_fleet_locations(&self, param_access_token: String, param_group_param: models::InlineObject11, context: &C) -> Box<Future<Item=GetFleetLocationsResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/locations",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_group_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::GET_FLEET_LOCATIONS.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::InlineResponse2003>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetFleetLocationsResponse::ListOfVehicleObjectsContainingTheirLocationAndTheTimeAtWhichThatLocationWasLogged(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetFleetLocationsResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_fleet_maintenance_list(&self, param_access_token: String, param_group_param: models::InlineObject13, context: &C) -> Box<Future<Item=GetFleetMaintenanceListResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/maintenance/list",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_group_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::GET_FLEET_MAINTENANCE_LIST.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::InlineResponse2004>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetFleetMaintenanceListResponse::ListOfVehiclesAndMaintenanceInformationAboutEach(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetFleetMaintenanceListResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_fleet_trips(&self, param_access_token: String, param_trips_param: models::InlineObject15, context: &C) -> Box<Future<Item=GetFleetTripsResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/trips",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_trips_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::GET_FLEET_TRIPS.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::TripResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetFleetTripsResponse::ListOfTripsTakenByTheRequestedVehicleWithinTheSpecifiedTimeframe(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetFleetTripsResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_fleet_vehicle(&self, param_access_token: String, param_vehicle_id_or_external_id: String, context: &C) -> Box<Future<Item=GetFleetVehicleResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/vehicles/{vehicle_id_or_external_id}",
            self.base_path, vehicle_id_or_external_id=utf8_percent_encode(&param_vehicle_id_or_external_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::FleetVehicleResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetFleetVehicleResponse::TheSpecifiedVehicle(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetFleetVehicleResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_organization_address(&self, param_access_token: String, param_address_id: i64, context: &C) -> Box<Future<Item=GetOrganizationAddressResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/addresses/{addressId}",
            self.base_path, addressId=utf8_percent_encode(&param_address_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::Address>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetOrganizationAddressResponse::TheAddress(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetOrganizationAddressResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_organization_addresses(&self, param_access_token: String, context: &C) -> Box<Future<Item=GetOrganizationAddressesResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/addresses",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Vec<models::Address>>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetOrganizationAddressesResponse::ListOfAddresses(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetOrganizationAddressesResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_organization_contact(&self, param_access_token: String, param_contact_id: i64, context: &C) -> Box<Future<Item=GetOrganizationContactResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/contacts/{contact_id}",
            self.base_path, contact_id=utf8_percent_encode(&param_contact_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::Contact>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetOrganizationContactResponse::TheContact(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetOrganizationContactResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_vehicle_harsh_event(&self, param_vehicle_id: i64, param_access_token: String, param_timestamp: i64, context: &C) -> Box<Future<Item=GetVehicleHarshEventResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/vehicles/{vehicleId}/safety/harsh_event",
            self.base_path, vehicleId=utf8_percent_encode(&param_vehicle_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        query_string.append_pair("timestamp", &param_timestamp.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::VehicleHarshEventResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetVehicleHarshEventResponse::HarshEventDetails(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetVehicleHarshEventResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_vehicle_locations(&self, param_access_token: String, param_vehicle_id: i64, param_start_ms: i64, param_end_ms: i64, context: &C) -> Box<Future<Item=GetVehicleLocationsResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/vehicles/{vehicle_id}/locations",
            self.base_path, vehicle_id=utf8_percent_encode(&param_vehicle_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        query_string.append_pair("startMs", &param_start_ms.to_string());
        query_string.append_pair("endMs", &param_end_ms.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Vec<models::FleetVehicleLocation>>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetVehicleLocationsResponse::ReturnsLocationsForAGivenVehicleBetweenAStart(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetVehicleLocationsResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_vehicle_safety_score(&self, param_vehicle_id: i64, param_access_token: String, param_start_ms: i64, param_end_ms: i64, context: &C) -> Box<Future<Item=GetVehicleSafetyScoreResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/vehicles/{vehicleId}/safety/score",
            self.base_path, vehicleId=utf8_percent_encode(&param_vehicle_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        query_string.append_pair("startMs", &param_start_ms.to_string());
        query_string.append_pair("endMs", &param_end_ms.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::VehicleSafetyScoreResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetVehicleSafetyScoreResponse::SafetyScoreDetails(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetVehicleSafetyScoreResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_vehicle_stats(&self, param_access_token: String, param_start_ms: i32, param_end_ms: i32, param_series: Option<String>, param_tag_ids: Option<String>, param_starting_after: Option<String>, param_ending_before: Option<String>, param_limit: Option<i64>, context: &C) -> Box<Future<Item=GetVehicleStatsResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/vehicles/stats",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        query_string.append_pair("startMs", &param_start_ms.to_string());
        query_string.append_pair("endMs", &param_end_ms.to_string());
        if let Some(series) = param_series {
            query_string.append_pair("series", &series.to_string());
        }
        if let Some(tag_ids) = param_tag_ids {
            query_string.append_pair("tagIds", &tag_ids.to_string());
        }
        if let Some(starting_after) = param_starting_after {
            query_string.append_pair("startingAfter", &starting_after.to_string());
        }
        if let Some(ending_before) = param_ending_before {
            query_string.append_pair("endingBefore", &ending_before.to_string());
        }
        if let Some(limit) = param_limit {
            query_string.append_pair("limit", &limit.to_string());
        }
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::InlineResponse2005>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetVehicleStatsResponse::ReturnsEngineStateAnd(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetVehicleStatsResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_vehicles_locations(&self, param_access_token: String, param_start_ms: i32, param_end_ms: i32, context: &C) -> Box<Future<Item=GetVehiclesLocationsResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/vehicles/locations",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        query_string.append_pair("startMs", &param_start_ms.to_string());
        query_string.append_pair("endMs", &param_end_ms.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Vec<object>>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetVehiclesLocationsResponse::ReturnsLocationsForAGivenVehicleBetweenAStart(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetVehiclesLocationsResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn list_contacts(&self, param_access_token: String, context: &C) -> Box<Future<Item=ListContactsResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/contacts",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Vec<models::Contact>>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            ListContactsResponse::ListOfContacts(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            ListContactsResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn list_fleet(&self, param_access_token: String, param_group_param: models::InlineObject10, param_starting_after: Option<String>, param_ending_before: Option<String>, param_limit: Option<i64>, context: &C) -> Box<Future<Item=ListFleetResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/list",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        if let Some(starting_after) = param_starting_after {
            query_string.append_pair("startingAfter", &starting_after.to_string());
        }
        if let Some(ending_before) = param_ending_before {
            query_string.append_pair("endingBefore", &ending_before.to_string());
        }
        if let Some(limit) = param_limit {
            query_string.append_pair("limit", &limit.to_string());
        }
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_group_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::LIST_FLEET.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::InlineResponse2002>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            ListFleetResponse::ListOfVehiclesAndInformationAboutEach(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            ListFleetResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn patch_fleet_vehicle(&self, param_access_token: String, param_vehicle_id_or_external_id: String, param_data: models::InlineObject16, context: &C) -> Box<Future<Item=PatchFleetVehicleResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/vehicles/{vehicle_id_or_external_id}",
            self.base_path, vehicle_id_or_external_id=utf8_percent_encode(&param_vehicle_id_or_external_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Patch, uri);


        let body = serde_json::to_string(&param_data).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::PATCH_FLEET_VEHICLE.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::FleetVehicleResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            PatchFleetVehicleResponse::TheUpdatedVehicle(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            PatchFleetVehicleResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn reactivate_driver_by_id(&self, param_access_token: String, param_driver_id_or_external_id: String, param_reactivate_driver_param: models::InlineObject4, context: &C) -> Box<Future<Item=ReactivateDriverByIdResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/drivers/inactive/{driver_id_or_external_id}",
            self.base_path, driver_id_or_external_id=utf8_percent_encode(&param_driver_id_or_external_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Put, uri);


        let body = serde_json::to_string(&param_reactivate_driver_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::REACTIVATE_DRIVER_BY_ID.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::Driver>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            ReactivateDriverByIdResponse::ReturnsTheReactivatedDriver(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            ReactivateDriverByIdResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn update_dispatch_route_by_id(&self, param_access_token: String, param_route_id: i64, param_update_dispatch_route_params: models::DispatchRoute, context: &C) -> Box<Future<Item=UpdateDispatchRouteByIdResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/dispatch/routes/{route_id}",
            self.base_path, route_id=utf8_percent_encode(&param_route_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Put, uri);


        let body = serde_json::to_string(&param_update_dispatch_route_params).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::UPDATE_DISPATCH_ROUTE_BY_ID.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::DispatchRoute>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            UpdateDispatchRouteByIdResponse::UpdateTheDispatchRoute(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            UpdateDispatchRouteByIdResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn update_organization_address(&self, param_access_token: String, param_address_id: i64, param_address: models::InlineObject1, context: &C) -> Box<Future<Item=UpdateOrganizationAddressResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/addresses/{addressId}",
            self.base_path, addressId=utf8_percent_encode(&param_address_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Patch, uri);


        let body = serde_json::to_string(&param_address).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::UPDATE_ORGANIZATION_ADDRESS.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            UpdateOrganizationAddressResponse::AddressWasSuccessfullyUpdated
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            UpdateOrganizationAddressResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn update_vehicles(&self, param_access_token: String, param_vehicle_update_param: models::InlineObject14, context: &C) -> Box<Future<Item=UpdateVehiclesResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/set_data",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_vehicle_update_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::UPDATE_VEHICLES.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            UpdateVehiclesResponse::VehiclesWereSuccessfullyUpdated
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            UpdateVehiclesResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_all_data_inputs(&self, param_access_token: String, param_group_id: Option<i64>, param_start_ms: Option<i64>, param_end_ms: Option<i64>, context: &C) -> Box<Future<Item=GetAllDataInputsResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/industrial/data",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        if let Some(group_id) = param_group_id {
            query_string.append_pair("group_id", &group_id.to_string());
        }
        if let Some(start_ms) = param_start_ms {
            query_string.append_pair("startMs", &start_ms.to_string());
        }
        if let Some(end_ms) = param_end_ms {
            query_string.append_pair("endMs", &end_ms.to_string());
        }
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::InlineResponse2006>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAllDataInputsResponse::ListOfDataInputs(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAllDataInputsResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_data_input(&self, param_access_token: String, param_data_input_id: i64, param_start_ms: Option<i64>, param_end_ms: Option<i64>, context: &C) -> Box<Future<Item=GetDataInputResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/industrial/data/{data_input_id}",
            self.base_path, data_input_id=utf8_percent_encode(&param_data_input_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        if let Some(start_ms) = param_start_ms {
            query_string.append_pair("startMs", &start_ms.to_string());
        }
        if let Some(end_ms) = param_end_ms {
            query_string.append_pair("endMs", &end_ms.to_string());
        }
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::DataInputHistoryResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDataInputResponse::ReturnsDatapointsForTheGivenDataInput(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDataInputResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_machines(&self, param_access_token: String, param_group_param: models::InlineObject18, context: &C) -> Box<Future<Item=GetMachinesResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/machines/list",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_group_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::GET_MACHINES.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::InlineResponse2007>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetMachinesResponse::ListOfMachineObjects(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetMachinesResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_machines_history(&self, param_access_token: String, param_history_param: models::InlineObject17, context: &C) -> Box<Future<Item=GetMachinesHistoryResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/machines/history",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_history_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::GET_MACHINES_HISTORY.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::MachineHistoryResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetMachinesHistoryResponse::ListOfMachineResultsObjects(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetMachinesHistoryResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn create_dispatch_route(&self, param_access_token: String, param_create_dispatch_route_params: models::DispatchRouteCreate, context: &C) -> Box<Future<Item=CreateDispatchRouteResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/dispatch/routes",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        // Body parameter

        let body = serde_json::to_string(&param_create_dispatch_route_params).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::CREATE_DISPATCH_ROUTE.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::DispatchRoute>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            CreateDispatchRouteResponse::CreatedRouteObjectIncludingTheNewRouteID(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            CreateDispatchRouteResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn create_driver_dispatch_route(&self, param_access_token: String, param_driver_id: i64, param_create_dispatch_route_params: models::DispatchRouteCreate, context: &C) -> Box<Future<Item=CreateDriverDispatchRouteResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/drivers/{driver_id}/dispatch/routes",
            self.base_path, driver_id=utf8_percent_encode(&param_driver_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_create_dispatch_route_params).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::CREATE_DRIVER_DISPATCH_ROUTE.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::DispatchRoute>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            CreateDriverDispatchRouteResponse::CreatedRouteObjectIncludingTheNewRouteID(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            CreateDriverDispatchRouteResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn create_vehicle_dispatch_route(&self, param_access_token: String, param_vehicle_id: i64, param_create_dispatch_route_params: models::DispatchRouteCreate, context: &C) -> Box<Future<Item=CreateVehicleDispatchRouteResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/vehicles/{vehicle_id}/dispatch/routes",
            self.base_path, vehicle_id=utf8_percent_encode(&param_vehicle_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_create_dispatch_route_params).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::CREATE_VEHICLE_DISPATCH_ROUTE.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::DispatchRoute>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            CreateVehicleDispatchRouteResponse::CreatedRouteObjectIncludingTheNewRouteID(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            CreateVehicleDispatchRouteResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn delete_dispatch_route_by_id(&self, param_access_token: String, param_route_id: i64, context: &C) -> Box<Future<Item=DeleteDispatchRouteByIdResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/dispatch/routes/{route_id}",
            self.base_path, route_id=utf8_percent_encode(&param_route_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Delete, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            DeleteDispatchRouteByIdResponse::SuccessfullyDeletedTheDispatchRoute
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            DeleteDispatchRouteByIdResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn fetch_all_dispatch_routes(&self, param_access_token: String, param_group_id: Option<i64>, param_end_time: Option<i64>, param_duration: Option<i64>, context: &C) -> Box<Future<Item=FetchAllDispatchRoutesResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/dispatch/routes",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        if let Some(group_id) = param_group_id {
            query_string.append_pair("group_id", &group_id.to_string());
        }
        if let Some(end_time) = param_end_time {
            query_string.append_pair("end_time", &end_time.to_string());
        }
        if let Some(duration) = param_duration {
            query_string.append_pair("duration", &duration.to_string());
        }
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Vec<models::DispatchRoute>>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            FetchAllDispatchRoutesResponse::AllDispatchRouteObjectsForTheGroup(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            FetchAllDispatchRoutesResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn fetch_all_route_job_updates(&self, param_access_token: String, param_group_id: Option<i64>, param_sequence_id: Option<String>, param_include: Option<String>, context: &C) -> Box<Future<Item=FetchAllRouteJobUpdatesResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/dispatch/routes/job_updates",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        if let Some(group_id) = param_group_id {
            query_string.append_pair("group_id", &group_id.to_string());
        }
        if let Some(sequence_id) = param_sequence_id {
            query_string.append_pair("sequence_id", &sequence_id.to_string());
        }
        if let Some(include) = param_include {
            query_string.append_pair("include", &include.to_string());
        }
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::AllRouteJobUpdates>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            FetchAllRouteJobUpdatesResponse::AllJobUpdatesOnRoutes(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            FetchAllRouteJobUpdatesResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_dispatch_route_by_id(&self, param_access_token: String, param_route_id: i64, context: &C) -> Box<Future<Item=GetDispatchRouteByIdResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/dispatch/routes/{route_id}",
            self.base_path, route_id=utf8_percent_encode(&param_route_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::DispatchRoute>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDispatchRouteByIdResponse::TheDispatchRouteCorrespondingToRoute(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDispatchRouteByIdResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_dispatch_route_history(&self, param_access_token: String, param_route_id: i64, param_start_time: Option<i64>, param_end_time: Option<i64>, context: &C) -> Box<Future<Item=GetDispatchRouteHistoryResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/dispatch/routes/{route_id}/history",
            self.base_path, route_id=utf8_percent_encode(&param_route_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        if let Some(start_time) = param_start_time {
            query_string.append_pair("start_time", &start_time.to_string());
        }
        if let Some(end_time) = param_end_time {
            query_string.append_pair("end_time", &end_time.to_string());
        }
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::DispatchRouteHistory>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDispatchRouteHistoryResponse::TheHistoricalRouteStateChangesBetweenStart(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDispatchRouteHistoryResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_dispatch_routes_by_driver_id(&self, param_access_token: String, param_driver_id: i64, param_end_time: Option<i64>, param_duration: Option<i64>, context: &C) -> Box<Future<Item=GetDispatchRoutesByDriverIdResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/drivers/{driver_id}/dispatch/routes",
            self.base_path, driver_id=utf8_percent_encode(&param_driver_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        if let Some(end_time) = param_end_time {
            query_string.append_pair("end_time", &end_time.to_string());
        }
        if let Some(duration) = param_duration {
            query_string.append_pair("duration", &duration.to_string());
        }
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Vec<models::DispatchRoute>>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDispatchRoutesByDriverIdResponse::ReturnsTheDispatchRoutesForTheGivenDriver(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDispatchRoutesByDriverIdResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_dispatch_routes_by_vehicle_id(&self, param_access_token: String, param_vehicle_id: i64, param_end_time: Option<i64>, param_duration: Option<i64>, context: &C) -> Box<Future<Item=GetDispatchRoutesByVehicleIdResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/vehicles/{vehicle_id}/dispatch/routes",
            self.base_path, vehicle_id=utf8_percent_encode(&param_vehicle_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        if let Some(end_time) = param_end_time {
            query_string.append_pair("end_time", &end_time.to_string());
        }
        if let Some(duration) = param_duration {
            query_string.append_pair("duration", &duration.to_string());
        }
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Vec<models::DispatchRoute>>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDispatchRoutesByVehicleIdResponse::ReturnsAllOfTheDispatchRoutesForTheGivenVehicle(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDispatchRoutesByVehicleIdResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn update_dispatch_route_by_id(&self, param_access_token: String, param_route_id: i64, param_update_dispatch_route_params: models::DispatchRoute, context: &C) -> Box<Future<Item=UpdateDispatchRouteByIdResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/dispatch/routes/{route_id}",
            self.base_path, route_id=utf8_percent_encode(&param_route_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Put, uri);


        let body = serde_json::to_string(&param_update_dispatch_route_params).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::UPDATE_DISPATCH_ROUTE_BY_ID.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::DispatchRoute>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            UpdateDispatchRouteByIdResponse::UpdateTheDispatchRoute(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            UpdateDispatchRouteByIdResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_driver_safety_score(&self, param_driver_id: i64, param_access_token: String, param_start_ms: i64, param_end_ms: i64, context: &C) -> Box<Future<Item=GetDriverSafetyScoreResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/drivers/{driverId}/safety/score",
            self.base_path, driverId=utf8_percent_encode(&param_driver_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        query_string.append_pair("startMs", &param_start_ms.to_string());
        query_string.append_pair("endMs", &param_end_ms.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::DriverSafetyScoreResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDriverSafetyScoreResponse::SafetyScoreDetails(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetDriverSafetyScoreResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_vehicle_harsh_event(&self, param_vehicle_id: i64, param_access_token: String, param_timestamp: i64, context: &C) -> Box<Future<Item=GetVehicleHarshEventResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/vehicles/{vehicleId}/safety/harsh_event",
            self.base_path, vehicleId=utf8_percent_encode(&param_vehicle_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        query_string.append_pair("timestamp", &param_timestamp.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::VehicleHarshEventResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetVehicleHarshEventResponse::HarshEventDetails(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetVehicleHarshEventResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_vehicle_safety_score(&self, param_vehicle_id: i64, param_access_token: String, param_start_ms: i64, param_end_ms: i64, context: &C) -> Box<Future<Item=GetVehicleSafetyScoreResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/fleet/vehicles/{vehicleId}/safety/score",
            self.base_path, vehicleId=utf8_percent_encode(&param_vehicle_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        query_string.append_pair("startMs", &param_start_ms.to_string());
        query_string.append_pair("endMs", &param_end_ms.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::VehicleSafetyScoreResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetVehicleSafetyScoreResponse::SafetyScoreDetails(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetVehicleSafetyScoreResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_sensors(&self, param_access_token: String, param_group_param: models::InlineObject23, context: &C) -> Box<Future<Item=GetSensorsResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/sensors/list",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        // Body parameter

        let body = serde_json::to_string(&param_group_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::GET_SENSORS.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::InlineResponse2008>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetSensorsResponse::ListOfSensorObjects(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetSensorsResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_sensors_cargo(&self, param_access_token: String, param_sensor_param: models::InlineObject19, context: &C) -> Box<Future<Item=GetSensorsCargoResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/sensors/cargo",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_sensor_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::GET_SENSORS_CARGO.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::CargoResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetSensorsCargoResponse::ListOfSensorObjectsContainingTheCurrentCargoStatusReportedByEachSensor(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetSensorsCargoResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_sensors_door(&self, param_access_token: String, param_sensor_param: models::InlineObject20, context: &C) -> Box<Future<Item=GetSensorsDoorResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/sensors/door",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_sensor_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::GET_SENSORS_DOOR.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::DoorResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetSensorsDoorResponse::ListOfSensorObjectsContainingTheCurrentDoorStatusReportedByEachSensor(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetSensorsDoorResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_sensors_history(&self, param_access_token: String, param_history_param: models::InlineObject21, context: &C) -> Box<Future<Item=GetSensorsHistoryResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/sensors/history",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_history_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::GET_SENSORS_HISTORY.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::SensorHistoryResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetSensorsHistoryResponse::ListOfResultsObjects(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetSensorsHistoryResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_sensors_humidity(&self, param_access_token: String, param_sensor_param: models::InlineObject22, context: &C) -> Box<Future<Item=GetSensorsHumidityResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/sensors/humidity",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_sensor_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::GET_SENSORS_HUMIDITY.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::HumidityResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetSensorsHumidityResponse::ListOfSensorObjectsContainingTheCurrentHumidityReportedByEachSensor(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetSensorsHumidityResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_sensors_temperature(&self, param_access_token: String, param_sensor_param: models::InlineObject24, context: &C) -> Box<Future<Item=GetSensorsTemperatureResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/sensors/temperature",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        let body = serde_json::to_string(&param_sensor_param).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::GET_SENSORS_TEMPERATURE.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::TemperatureResponse>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetSensorsTemperatureResponse::ListOfSensorObjectsContainingTheCurrentTemperatureReportedByEachSensor(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetSensorsTemperatureResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn create_tag(&self, param_access_token: String, param_tag_create_params: models::TagCreate, context: &C) -> Box<Future<Item=CreateTagResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/tags",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Post, uri);


        // Body parameter

        let body = serde_json::to_string(&param_tag_create_params).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::CREATE_TAG.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::Tag>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            CreateTagResponse::NewlyCreatedTagObject(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            CreateTagResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn delete_tag_by_id(&self, param_access_token: String, param_tag_id: i64, context: &C) -> Box<Future<Item=DeleteTagByIdResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/tags/{tag_id}",
            self.base_path, tag_id=utf8_percent_encode(&param_tag_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Delete, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            DeleteTagByIdResponse::SuccessfullyDeletedTheTag
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            DeleteTagByIdResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_all_tags(&self, param_access_token: String, param_group_id: Option<i64>, context: &C) -> Box<Future<Item=GetAllTagsResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/tags",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        if let Some(group_id) = param_group_id {
            query_string.append_pair("group_id", &group_id.to_string());
        }
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::InlineResponse2009>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAllTagsResponse::ListOfTags(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetAllTagsResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_tag_by_id(&self, param_access_token: String, param_tag_id: i64, context: &C) -> Box<Future<Item=GetTagByIdResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/tags/{tag_id}",
            self.base_path, tag_id=utf8_percent_encode(&param_tag_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::Tag>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetTagByIdResponse::TheTagCorrespondingToTag(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetTagByIdResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn modify_tag_by_id(&self, param_access_token: String, param_tag_id: i64, param_tag_modify_params: models::TagModify, context: &C) -> Box<Future<Item=ModifyTagByIdResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/tags/{tag_id}",
            self.base_path, tag_id=utf8_percent_encode(&param_tag_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Patch, uri);


        let body = serde_json::to_string(&param_tag_modify_params).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::MODIFY_TAG_BY_ID.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::Tag>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            ModifyTagByIdResponse::TheUpdatedTagData(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            ModifyTagByIdResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn update_tag_by_id(&self, param_access_token: String, param_tag_id: i64, param_update_tag_params: models::TagUpdate, context: &C) -> Box<Future<Item=UpdateTagByIdResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/tags/{tag_id}",
            self.base_path, tag_id=utf8_percent_encode(&param_tag_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Put, uri);


        let body = serde_json::to_string(&param_update_tag_params).expect("impossible to fail to serialize");


        request.set_body(body.into_bytes());


        request.headers_mut().set(ContentType(mimetypes::requests::UPDATE_TAG_BY_ID.clone()));
        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::Tag>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            UpdateTagByIdResponse::TheUpdatedTagData(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            UpdateTagByIdResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn delete_user_by_id(&self, param_access_token: String, param_user_id: i64, context: &C) -> Box<Future<Item=DeleteUserByIdResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/users/{userId}",
            self.base_path, userId=utf8_percent_encode(&param_user_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Delete, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            DeleteUserByIdResponse::TheUserWasSuccessfullyRemoved
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            DeleteUserByIdResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_user_by_id(&self, param_access_token: String, param_user_id: i64, context: &C) -> Box<Future<Item=GetUserByIdResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/users/{userId}",
            self.base_path, userId=utf8_percent_encode(&param_user_id.to_string(), ID_ENCODE_SET)
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<models::User>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetUserByIdResponse::UserRecord(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            GetUserByIdResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn list_user_roles(&self, param_access_token: String, context: &C) -> Box<Future<Item=ListUserRolesResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/user_roles",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Vec<models::UserRole>>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            ListUserRolesResponse::ListOfUserRoles(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            ListUserRolesResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn list_users(&self, param_access_token: String, context: &C) -> Box<Future<Item=ListUsersResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/v1/users",
            self.base_path
        );
        
        // Query parameters
        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("access_token", &param_access_token.to_string());
        
        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);



        request.headers_mut().set(XSpanId((context as &Has<XSpanIdString>).get().0.clone()));


        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<Vec<models::User>>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            ListUsersResponse::ListOfUsers(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                0 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body| str::from_utf8(&body)
                                             .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                                             .and_then(|body|

                                                 serde_json::from_str::<String>(body)
                                                     .map_err(|e| e.into())

                                             ))
                        .map(move |body|
                            ListUsersResponse::UnexpectedError(body)
                        )
                    ) as Box<Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<Future<Item=_, Error=_>>
                }
            }
        }))

    }

}

#[derive(Debug)]
pub enum ClientInitError {
    InvalidScheme,
    InvalidUri(hyper::error::UriError),
    MissingHost,
    SslError(openssl::error::ErrorStack)
}

impl From<hyper::error::UriError> for ClientInitError {
    fn from(err: hyper::error::UriError) -> ClientInitError {
        ClientInitError::InvalidUri(err)
    }
}

impl From<openssl::error::ErrorStack> for ClientInitError {
    fn from(err: openssl::error::ErrorStack) -> ClientInitError {
        ClientInitError::SslError(err)
    }
}

impl fmt::Display for ClientInitError {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        (self as &fmt::Debug).fmt(f)
    }
}

impl error::Error for ClientInitError {
    fn description(&self) -> &str {
        "Failed to produce a hyper client."
    }
}
