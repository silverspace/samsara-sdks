#![allow(unused_extern_crates)]
extern crate serde_ignored;
extern crate tokio_core;
extern crate native_tls;
extern crate hyper_tls;
extern crate openssl;
extern crate mime;
extern crate uuid;
extern crate chrono;
extern crate percent_encoding;
extern crate url;


use std::sync::Arc;
use std::marker::PhantomData;
use futures::{Future, future, Stream, stream};
use hyper;
use hyper::{Request, Response, Error, StatusCode};
use hyper::header::{Headers, ContentType};
use self::url::form_urlencoded;
use mimetypes;

use serde_json;


#[allow(unused_imports)]
use std::collections::{HashMap, BTreeMap};
#[allow(unused_imports)]
use swagger;
use std::io;

#[allow(unused_imports)]
use std::collections::BTreeSet;

pub use swagger::auth::Authorization;
use swagger::{ApiError, XSpanId, XSpanIdString, Has, RequestParser};
use swagger::auth::Scopes;

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
#[allow(unused_imports)]
use models;

pub mod context;

header! { (Warning, "Warning") => [String] }

mod paths {
    extern crate regex;

    lazy_static! {
        pub static ref GLOBAL_REGEX_SET: regex::RegexSet = regex::RegexSet::new(&[
            r"^/v1/addresses$",
            r"^/v1/addresses/(?P<addressId>[^/?#]*)$",
            r"^/v1/contacts$",
            r"^/v1/contacts/(?P<contact_id>[^/?#]*)$",
            r"^/v1/fleet/add_address$",
            r"^/v1/fleet/assets$",
            r"^/v1/fleet/assets/locations$",
            r"^/v1/fleet/assets/(?P<asset_id>[^/?#]*)/locations$",
            r"^/v1/fleet/assets/(?P<asset_id>[^/?#]*)/reefer$",
            r"^/v1/fleet/dispatch/routes$",
            r"^/v1/fleet/dispatch/routes/job_updates$",
            r"^/v1/fleet/dispatch/routes/(?P<route_id>[^/?#]*)$",
            r"^/v1/fleet/dispatch/routes/(?P<route_id>[^/?#]*)/history$",
            r"^/v1/fleet/drivers$",
            r"^/v1/fleet/drivers/create$",
            r"^/v1/fleet/drivers/document_types$",
            r"^/v1/fleet/drivers/documents$",
            r"^/v1/fleet/drivers/inactive$",
            r"^/v1/fleet/drivers/inactive/(?P<driver_id_or_external_id>[^/?#]*)$",
            r"^/v1/fleet/drivers/summary$",
            r"^/v1/fleet/drivers/(?P<driverId>[^/?#]*)/safety/score$",
            r"^/v1/fleet/drivers/(?P<driver_id_or_external_id>[^/?#]*)$",
            r"^/v1/fleet/drivers/(?P<driver_id>[^/?#]*)/dispatch/routes$",
            r"^/v1/fleet/drivers/(?P<driver_id>[^/?#]*)/documents$",
            r"^/v1/fleet/drivers/(?P<driver_id>[^/?#]*)/hos_daily_logs$",
            r"^/v1/fleet/hos_authentication_logs$",
            r"^/v1/fleet/hos_logs$",
            r"^/v1/fleet/hos_logs_summary$",
            r"^/v1/fleet/list$",
            r"^/v1/fleet/locations$",
            r"^/v1/fleet/maintenance/dvirs$",
            r"^/v1/fleet/maintenance/list$",
            r"^/v1/fleet/set_data$",
            r"^/v1/fleet/trips$",
            r"^/v1/fleet/vehicles/locations$",
            r"^/v1/fleet/vehicles/stats$",
            r"^/v1/fleet/vehicles/(?P<vehicleId>[^/?#]*)/safety/harsh_event$",
            r"^/v1/fleet/vehicles/(?P<vehicleId>[^/?#]*)/safety/score$",
            r"^/v1/fleet/vehicles/(?P<vehicle_id_or_external_id>[^/?#]*)$",
            r"^/v1/fleet/vehicles/(?P<vehicle_id>[^/?#]*)/dispatch/routes$",
            r"^/v1/fleet/vehicles/(?P<vehicle_id>[^/?#]*)/locations$",
            r"^/v1/industrial/data$",
            r"^/v1/industrial/data/(?P<data_input_id>[^/?#]*)$",
            r"^/v1/machines/history$",
            r"^/v1/machines/list$",
            r"^/v1/sensors/cargo$",
            r"^/v1/sensors/door$",
            r"^/v1/sensors/history$",
            r"^/v1/sensors/humidity$",
            r"^/v1/sensors/list$",
            r"^/v1/sensors/temperature$",
            r"^/v1/tags$",
            r"^/v1/tags/(?P<tag_id>[^/?#]*)$",
            r"^/v1/user_roles$",
            r"^/v1/users$",
            r"^/v1/users/(?P<userId>[^/?#]*)$"
        ]).unwrap();
    }
    pub static ID_ADDRESSES: usize = 0;
    pub static ID_ADDRESSES_ADDRESSID: usize = 1;
    lazy_static! {
        pub static ref REGEX_ADDRESSES_ADDRESSID: regex::Regex = regex::Regex::new(r"^/v1/addresses/(?P<addressId>[^/?#]*)$").unwrap();
    }
    pub static ID_CONTACTS: usize = 2;
    pub static ID_CONTACTS_CONTACT_ID: usize = 3;
    lazy_static! {
        pub static ref REGEX_CONTACTS_CONTACT_ID: regex::Regex = regex::Regex::new(r"^/v1/contacts/(?P<contact_id>[^/?#]*)$").unwrap();
    }
    pub static ID_FLEET_ADD_ADDRESS: usize = 4;
    pub static ID_FLEET_ASSETS: usize = 5;
    pub static ID_FLEET_ASSETS_LOCATIONS: usize = 6;
    pub static ID_FLEET_ASSETS_ASSET_ID_LOCATIONS: usize = 7;
    lazy_static! {
        pub static ref REGEX_FLEET_ASSETS_ASSET_ID_LOCATIONS: regex::Regex = regex::Regex::new(r"^/v1/fleet/assets/(?P<asset_id>[^/?#]*)/locations$").unwrap();
    }
    pub static ID_FLEET_ASSETS_ASSET_ID_REEFER: usize = 8;
    lazy_static! {
        pub static ref REGEX_FLEET_ASSETS_ASSET_ID_REEFER: regex::Regex = regex::Regex::new(r"^/v1/fleet/assets/(?P<asset_id>[^/?#]*)/reefer$").unwrap();
    }
    pub static ID_FLEET_DISPATCH_ROUTES: usize = 9;
    pub static ID_FLEET_DISPATCH_ROUTES_JOB_UPDATES: usize = 10;
    pub static ID_FLEET_DISPATCH_ROUTES_ROUTE_ID: usize = 11;
    lazy_static! {
        pub static ref REGEX_FLEET_DISPATCH_ROUTES_ROUTE_ID: regex::Regex = regex::Regex::new(r"^/v1/fleet/dispatch/routes/(?P<route_id>[^/?#]*)$").unwrap();
    }
    pub static ID_FLEET_DISPATCH_ROUTES_ROUTE_ID_HISTORY: usize = 12;
    lazy_static! {
        pub static ref REGEX_FLEET_DISPATCH_ROUTES_ROUTE_ID_HISTORY: regex::Regex = regex::Regex::new(r"^/v1/fleet/dispatch/routes/(?P<route_id>[^/?#]*)/history$").unwrap();
    }
    pub static ID_FLEET_DRIVERS: usize = 13;
    pub static ID_FLEET_DRIVERS_CREATE: usize = 14;
    pub static ID_FLEET_DRIVERS_DOCUMENT_TYPES: usize = 15;
    pub static ID_FLEET_DRIVERS_DOCUMENTS: usize = 16;
    pub static ID_FLEET_DRIVERS_INACTIVE: usize = 17;
    pub static ID_FLEET_DRIVERS_INACTIVE_DRIVER_ID_OR_EXTERNAL_ID: usize = 18;
    lazy_static! {
        pub static ref REGEX_FLEET_DRIVERS_INACTIVE_DRIVER_ID_OR_EXTERNAL_ID: regex::Regex = regex::Regex::new(r"^/v1/fleet/drivers/inactive/(?P<driver_id_or_external_id>[^/?#]*)$").unwrap();
    }
    pub static ID_FLEET_DRIVERS_SUMMARY: usize = 19;
    pub static ID_FLEET_DRIVERS_DRIVERID_SAFETY_SCORE: usize = 20;
    lazy_static! {
        pub static ref REGEX_FLEET_DRIVERS_DRIVERID_SAFETY_SCORE: regex::Regex = regex::Regex::new(r"^/v1/fleet/drivers/(?P<driverId>[^/?#]*)/safety/score$").unwrap();
    }
    pub static ID_FLEET_DRIVERS_DRIVER_ID_OR_EXTERNAL_ID: usize = 21;
    lazy_static! {
        pub static ref REGEX_FLEET_DRIVERS_DRIVER_ID_OR_EXTERNAL_ID: regex::Regex = regex::Regex::new(r"^/v1/fleet/drivers/(?P<driver_id_or_external_id>[^/?#]*)$").unwrap();
    }
    pub static ID_FLEET_DRIVERS_DRIVER_ID_DISPATCH_ROUTES: usize = 22;
    lazy_static! {
        pub static ref REGEX_FLEET_DRIVERS_DRIVER_ID_DISPATCH_ROUTES: regex::Regex = regex::Regex::new(r"^/v1/fleet/drivers/(?P<driver_id>[^/?#]*)/dispatch/routes$").unwrap();
    }
    pub static ID_FLEET_DRIVERS_DRIVER_ID_DOCUMENTS: usize = 23;
    lazy_static! {
        pub static ref REGEX_FLEET_DRIVERS_DRIVER_ID_DOCUMENTS: regex::Regex = regex::Regex::new(r"^/v1/fleet/drivers/(?P<driver_id>[^/?#]*)/documents$").unwrap();
    }
    pub static ID_FLEET_DRIVERS_DRIVER_ID_HOS_DAILY_LOGS: usize = 24;
    lazy_static! {
        pub static ref REGEX_FLEET_DRIVERS_DRIVER_ID_HOS_DAILY_LOGS: regex::Regex = regex::Regex::new(r"^/v1/fleet/drivers/(?P<driver_id>[^/?#]*)/hos_daily_logs$").unwrap();
    }
    pub static ID_FLEET_HOS_AUTHENTICATION_LOGS: usize = 25;
    pub static ID_FLEET_HOS_LOGS: usize = 26;
    pub static ID_FLEET_HOS_LOGS_SUMMARY: usize = 27;
    pub static ID_FLEET_LIST: usize = 28;
    pub static ID_FLEET_LOCATIONS: usize = 29;
    pub static ID_FLEET_MAINTENANCE_DVIRS: usize = 30;
    pub static ID_FLEET_MAINTENANCE_LIST: usize = 31;
    pub static ID_FLEET_SET_DATA: usize = 32;
    pub static ID_FLEET_TRIPS: usize = 33;
    pub static ID_FLEET_VEHICLES_LOCATIONS: usize = 34;
    pub static ID_FLEET_VEHICLES_STATS: usize = 35;
    pub static ID_FLEET_VEHICLES_VEHICLEID_SAFETY_HARSH_EVENT: usize = 36;
    lazy_static! {
        pub static ref REGEX_FLEET_VEHICLES_VEHICLEID_SAFETY_HARSH_EVENT: regex::Regex = regex::Regex::new(r"^/v1/fleet/vehicles/(?P<vehicleId>[^/?#]*)/safety/harsh_event$").unwrap();
    }
    pub static ID_FLEET_VEHICLES_VEHICLEID_SAFETY_SCORE: usize = 37;
    lazy_static! {
        pub static ref REGEX_FLEET_VEHICLES_VEHICLEID_SAFETY_SCORE: regex::Regex = regex::Regex::new(r"^/v1/fleet/vehicles/(?P<vehicleId>[^/?#]*)/safety/score$").unwrap();
    }
    pub static ID_FLEET_VEHICLES_VEHICLE_ID_OR_EXTERNAL_ID: usize = 38;
    lazy_static! {
        pub static ref REGEX_FLEET_VEHICLES_VEHICLE_ID_OR_EXTERNAL_ID: regex::Regex = regex::Regex::new(r"^/v1/fleet/vehicles/(?P<vehicle_id_or_external_id>[^/?#]*)$").unwrap();
    }
    pub static ID_FLEET_VEHICLES_VEHICLE_ID_DISPATCH_ROUTES: usize = 39;
    lazy_static! {
        pub static ref REGEX_FLEET_VEHICLES_VEHICLE_ID_DISPATCH_ROUTES: regex::Regex = regex::Regex::new(r"^/v1/fleet/vehicles/(?P<vehicle_id>[^/?#]*)/dispatch/routes$").unwrap();
    }
    pub static ID_FLEET_VEHICLES_VEHICLE_ID_LOCATIONS: usize = 40;
    lazy_static! {
        pub static ref REGEX_FLEET_VEHICLES_VEHICLE_ID_LOCATIONS: regex::Regex = regex::Regex::new(r"^/v1/fleet/vehicles/(?P<vehicle_id>[^/?#]*)/locations$").unwrap();
    }
    pub static ID_INDUSTRIAL_DATA: usize = 41;
    pub static ID_INDUSTRIAL_DATA_DATA_INPUT_ID: usize = 42;
    lazy_static! {
        pub static ref REGEX_INDUSTRIAL_DATA_DATA_INPUT_ID: regex::Regex = regex::Regex::new(r"^/v1/industrial/data/(?P<data_input_id>[^/?#]*)$").unwrap();
    }
    pub static ID_MACHINES_HISTORY: usize = 43;
    pub static ID_MACHINES_LIST: usize = 44;
    pub static ID_SENSORS_CARGO: usize = 45;
    pub static ID_SENSORS_DOOR: usize = 46;
    pub static ID_SENSORS_HISTORY: usize = 47;
    pub static ID_SENSORS_HUMIDITY: usize = 48;
    pub static ID_SENSORS_LIST: usize = 49;
    pub static ID_SENSORS_TEMPERATURE: usize = 50;
    pub static ID_TAGS: usize = 51;
    pub static ID_TAGS_TAG_ID: usize = 52;
    lazy_static! {
        pub static ref REGEX_TAGS_TAG_ID: regex::Regex = regex::Regex::new(r"^/v1/tags/(?P<tag_id>[^/?#]*)$").unwrap();
    }
    pub static ID_USER_ROLES: usize = 53;
    pub static ID_USERS: usize = 54;
    pub static ID_USERS_USERID: usize = 55;
    lazy_static! {
        pub static ref REGEX_USERS_USERID: regex::Regex = regex::Regex::new(r"^/v1/users/(?P<userId>[^/?#]*)$").unwrap();
    }
}

pub struct NewService<T, C> {
    api_impl: Arc<T>,
    marker: PhantomData<C>,
}

impl<T, C> NewService<T, C>
where
    T: Api<C> + Clone + 'static,
    C: Has<XSpanIdString>  + 'static
{
    pub fn new<U: Into<Arc<T>>>(api_impl: U) -> NewService<T, C> {
        NewService{api_impl: api_impl.into(), marker: PhantomData}
    }
}

impl<T, C> hyper::server::NewService for NewService<T, C>
where
    T: Api<C> + Clone + 'static,
    C: Has<XSpanIdString>  + 'static
{
    type Request = (Request, C);
    type Response = Response;
    type Error = Error;
    type Instance = Service<T, C>;

    fn new_service(&self) -> Result<Self::Instance, io::Error> {
        Ok(Service::new(self.api_impl.clone()))
    }
}

pub struct Service<T, C> {
    api_impl: Arc<T>,
    marker: PhantomData<C>,
}

impl<T, C> Service<T, C>
where
    T: Api<C> + Clone + 'static,
    C: Has<XSpanIdString>  + 'static {
    pub fn new<U: Into<Arc<T>>>(api_impl: U) -> Service<T, C> {
        Service{api_impl: api_impl.into(), marker: PhantomData}
    }
}

impl<T, C> hyper::server::Service for Service<T, C>
where
    T: Api<C> + Clone + 'static,
    C: Has<XSpanIdString>  + 'static
{
    type Request = (Request, C);
    type Response = Response;
    type Error = Error;
    type Future = Box<Future<Item=Response, Error=Error>>;

    fn call(&self, (req, mut context): Self::Request) -> Self::Future {
        let api_impl = self.api_impl.clone();
        let (method, uri, _, headers, body) = req.deconstruct();
        let path = paths::GLOBAL_REGEX_SET.matches(uri.path());

        // This match statement is duplicated below in `parse_operation_id()`.
        // Please update both places if changing how this code is autogenerated.
        match &method {

            // GetAllAssetCurrentLocations - GET /fleet/assets/locations
            &hyper::Method::Get if path.matched(paths::ID_FLEET_ASSETS_LOCATIONS) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_group_id = query_params.iter().filter(|e| e.0 == "group_id").map(|e| e.1.to_owned())

                    .nth(0);

                let param_group_id = param_group_id.and_then(|param_group_id| param_group_id.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.get_all_asset_current_locations(param_access_token, param_group_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAllAssetCurrentLocationsResponse::ListOfAssetsAndTheirCurrentLocations

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ALL_ASSET_CURRENT_LOCATIONS_LIST_OF_ASSETS_AND_THEIR_CURRENT_LOCATIONS.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetAllAssetCurrentLocationsResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ALL_ASSET_CURRENT_LOCATIONS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetAllAssets - GET /fleet/assets
            &hyper::Method::Get if path.matched(paths::ID_FLEET_ASSETS) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_group_id = query_params.iter().filter(|e| e.0 == "group_id").map(|e| e.1.to_owned())

                    .nth(0);

                let param_group_id = param_group_id.and_then(|param_group_id| param_group_id.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.get_all_assets(param_access_token, param_group_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAllAssetsResponse::ListOfAssets

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ALL_ASSETS_LIST_OF_ASSETS.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetAllAssetsResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ALL_ASSETS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetAssetLocation - GET /fleet/assets/{asset_id}/locations
            &hyper::Method::Get if path.matched(paths::ID_FLEET_ASSETS_ASSET_ID_LOCATIONS) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_ASSETS_ASSET_ID_LOCATIONS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_ASSETS_ASSET_ID_LOCATIONS in set but failed match against \"{}\"", path, paths::REGEX_FLEET_ASSETS_ASSET_ID_LOCATIONS.as_str())
                    );

                let param_asset_id = match percent_encoding::percent_decode(path_params["asset_id"].as_bytes()).decode_utf8() {
                    Ok(param_asset_id) => match param_asset_id.parse::<i64>() {
                        Ok(param_asset_id) => param_asset_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter asset_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["asset_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_start_ms = query_params.iter().filter(|e| e.0 == "startMs").map(|e| e.1.to_owned())

                    .nth(0);
                let param_start_ms = match param_start_ms {
                    Some(param_start_ms) => match param_start_ms.parse::<i64>() {
                        Ok(param_start_ms) => param_start_ms,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter startMs - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter startMs"))),
                };
                let param_end_ms = query_params.iter().filter(|e| e.0 == "endMs").map(|e| e.1.to_owned())

                    .nth(0);
                let param_end_ms = match param_end_ms {
                    Some(param_end_ms) => match param_end_ms.parse::<i64>() {
                        Ok(param_end_ms) => param_end_ms,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter endMs - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter endMs"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_asset_location(param_access_token, param_asset_id, param_start_ms, param_end_ms, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAssetLocationResponse::AssetLocationDetails

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ASSET_LOCATION_ASSET_LOCATION_DETAILS.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetAssetLocationResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ASSET_LOCATION_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetAssetReefer - GET /fleet/assets/{asset_id}/reefer
            &hyper::Method::Get if path.matched(paths::ID_FLEET_ASSETS_ASSET_ID_REEFER) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_ASSETS_ASSET_ID_REEFER
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_ASSETS_ASSET_ID_REEFER in set but failed match against \"{}\"", path, paths::REGEX_FLEET_ASSETS_ASSET_ID_REEFER.as_str())
                    );

                let param_asset_id = match percent_encoding::percent_decode(path_params["asset_id"].as_bytes()).decode_utf8() {
                    Ok(param_asset_id) => match param_asset_id.parse::<i64>() {
                        Ok(param_asset_id) => param_asset_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter asset_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["asset_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_start_ms = query_params.iter().filter(|e| e.0 == "startMs").map(|e| e.1.to_owned())

                    .nth(0);
                let param_start_ms = match param_start_ms {
                    Some(param_start_ms) => match param_start_ms.parse::<i64>() {
                        Ok(param_start_ms) => param_start_ms,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter startMs - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter startMs"))),
                };
                let param_end_ms = query_params.iter().filter(|e| e.0 == "endMs").map(|e| e.1.to_owned())

                    .nth(0);
                let param_end_ms = match param_end_ms {
                    Some(param_end_ms) => match param_end_ms.parse::<i64>() {
                        Ok(param_end_ms) => param_end_ms,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter endMs - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter endMs"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_asset_reefer(param_access_token, param_asset_id, param_start_ms, param_end_ms, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAssetReeferResponse::Reefer

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ASSET_REEFER_REEFER.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetAssetReeferResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ASSET_REEFER_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // CreateDriver - POST /fleet/drivers/create
            &hyper::Method::Post if path.matched(paths::ID_FLEET_DRIVERS_CREATE) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_create_driver_param: Option<models::DriverForCreate> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_driver_param) => param_create_driver_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter createDriverParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_create_driver_param = match param_create_driver_param {
                                    Some(param_create_driver_param) => param_create_driver_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter createDriverParam"))),
                                };


                                Box::new(api_impl.create_driver(param_access_token, param_create_driver_param, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateDriverResponse::ReturnsTheSuccessfullyCreatedTheDriver

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::CREATE_DRIVER_RETURNS_THE_SUCCESSFULLY_CREATED_THE_DRIVER.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                CreateDriverResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::CREATE_DRIVER_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter createDriverParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // DeactivateDriver - DELETE /fleet/drivers/{driver_id_or_external_id}
            &hyper::Method::Delete if path.matched(paths::ID_FLEET_DRIVERS_DRIVER_ID_OR_EXTERNAL_ID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_DRIVERS_DRIVER_ID_OR_EXTERNAL_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_DRIVERS_DRIVER_ID_OR_EXTERNAL_ID in set but failed match against \"{}\"", path, paths::REGEX_FLEET_DRIVERS_DRIVER_ID_OR_EXTERNAL_ID.as_str())
                    );

                let param_driver_id_or_external_id = match percent_encoding::percent_decode(path_params["driver_id_or_external_id"].as_bytes()).decode_utf8() {
                    Ok(param_driver_id_or_external_id) => match param_driver_id_or_external_id.parse::<String>() {
                        Ok(param_driver_id_or_external_id) => param_driver_id_or_external_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter driver_id_or_external_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["driver_id_or_external_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.deactivate_driver(param_access_token, param_driver_id_or_external_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeactivateDriverResponse::SuccessfullyDeactivatedTheDriver


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                },
                                                DeactivateDriverResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::DEACTIVATE_DRIVER_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetAllDeactivatedDrivers - GET /fleet/drivers/inactive
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DRIVERS_INACTIVE) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_group_id = query_params.iter().filter(|e| e.0 == "group_id").map(|e| e.1.to_owned())

                    .nth(0);

                let param_group_id = param_group_id.and_then(|param_group_id| param_group_id.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.get_all_deactivated_drivers(param_access_token, param_group_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAllDeactivatedDriversResponse::ReturnsAnArrayOfAllDeactivatedDriversForTheGroup

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ALL_DEACTIVATED_DRIVERS_RETURNS_AN_ARRAY_OF_ALL_DEACTIVATED_DRIVERS_FOR_THE_GROUP.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetAllDeactivatedDriversResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ALL_DEACTIVATED_DRIVERS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetDeactivatedDriverById - GET /fleet/drivers/inactive/{driver_id_or_external_id}
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DRIVERS_INACTIVE_DRIVER_ID_OR_EXTERNAL_ID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_DRIVERS_INACTIVE_DRIVER_ID_OR_EXTERNAL_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_DRIVERS_INACTIVE_DRIVER_ID_OR_EXTERNAL_ID in set but failed match against \"{}\"", path, paths::REGEX_FLEET_DRIVERS_INACTIVE_DRIVER_ID_OR_EXTERNAL_ID.as_str())
                    );

                let param_driver_id_or_external_id = match percent_encoding::percent_decode(path_params["driver_id_or_external_id"].as_bytes()).decode_utf8() {
                    Ok(param_driver_id_or_external_id) => match param_driver_id_or_external_id.parse::<String>() {
                        Ok(param_driver_id_or_external_id) => param_driver_id_or_external_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter driver_id_or_external_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["driver_id_or_external_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_deactivated_driver_by_id(param_access_token, param_driver_id_or_external_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetDeactivatedDriverByIdResponse::ReturnsTheDeactivatedDriverWithTheGivenDriver

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DEACTIVATED_DRIVER_BY_ID_RETURNS_THE_DEACTIVATED_DRIVER_WITH_THE_GIVEN_DRIVER.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetDeactivatedDriverByIdResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DEACTIVATED_DRIVER_BY_ID_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetDriverById - GET /fleet/drivers/{driver_id_or_external_id}
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DRIVERS_DRIVER_ID_OR_EXTERNAL_ID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_DRIVERS_DRIVER_ID_OR_EXTERNAL_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_DRIVERS_DRIVER_ID_OR_EXTERNAL_ID in set but failed match against \"{}\"", path, paths::REGEX_FLEET_DRIVERS_DRIVER_ID_OR_EXTERNAL_ID.as_str())
                    );

                let param_driver_id_or_external_id = match percent_encoding::percent_decode(path_params["driver_id_or_external_id"].as_bytes()).decode_utf8() {
                    Ok(param_driver_id_or_external_id) => match param_driver_id_or_external_id.parse::<String>() {
                        Ok(param_driver_id_or_external_id) => param_driver_id_or_external_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter driver_id_or_external_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["driver_id_or_external_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_driver_by_id(param_access_token, param_driver_id_or_external_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetDriverByIdResponse::ReturnsTheDriverForTheGivenDriver

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DRIVER_BY_ID_RETURNS_THE_DRIVER_FOR_THE_GIVEN_DRIVER.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetDriverByIdResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DRIVER_BY_ID_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // ReactivateDriverById - PUT /fleet/drivers/inactive/{driver_id_or_external_id}
            &hyper::Method::Put if path.matched(paths::ID_FLEET_DRIVERS_INACTIVE_DRIVER_ID_OR_EXTERNAL_ID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_DRIVERS_INACTIVE_DRIVER_ID_OR_EXTERNAL_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_DRIVERS_INACTIVE_DRIVER_ID_OR_EXTERNAL_ID in set but failed match against \"{}\"", path, paths::REGEX_FLEET_DRIVERS_INACTIVE_DRIVER_ID_OR_EXTERNAL_ID.as_str())
                    );

                let param_driver_id_or_external_id = match percent_encoding::percent_decode(path_params["driver_id_or_external_id"].as_bytes()).decode_utf8() {
                    Ok(param_driver_id_or_external_id) => match param_driver_id_or_external_id.parse::<String>() {
                        Ok(param_driver_id_or_external_id) => param_driver_id_or_external_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter driver_id_or_external_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["driver_id_or_external_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_reactivate_driver_param: Option<models::InlineObject4> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_reactivate_driver_param) => param_reactivate_driver_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter reactivateDriverParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_reactivate_driver_param = match param_reactivate_driver_param {
                                    Some(param_reactivate_driver_param) => param_reactivate_driver_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter reactivateDriverParam"))),
                                };


                                Box::new(api_impl.reactivate_driver_by_id(param_access_token, param_driver_id_or_external_id, param_reactivate_driver_param, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ReactivateDriverByIdResponse::ReturnsTheReactivatedDriver

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::REACTIVATE_DRIVER_BY_ID_RETURNS_THE_REACTIVATED_DRIVER.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                ReactivateDriverByIdResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::REACTIVATE_DRIVER_BY_ID_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter reactivateDriverParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // AddFleetAddress - POST /fleet/add_address
            &hyper::Method::Post if path.matched(paths::ID_FLEET_ADD_ADDRESS) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_address_param: Option<models::InlineObject2> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_address_param) => param_address_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter addressParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_address_param = match param_address_param {
                                    Some(param_address_param) => param_address_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter addressParam"))),
                                };


                                Box::new(api_impl.add_fleet_address(param_access_token, param_address_param, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                AddFleetAddressResponse::AddressWasSuccessfullyAdded


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                },
                                                AddFleetAddressResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::ADD_FLEET_ADDRESS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter addressParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // AddOrganizationAddresses - POST /addresses
            &hyper::Method::Post if path.matched(paths::ID_ADDRESSES) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_addresses: Option<models::InlineObject> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_addresses) => param_addresses,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter addresses - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_addresses = match param_addresses {
                                    Some(param_addresses) => param_addresses,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter addresses"))),
                                };


                                Box::new(api_impl.add_organization_addresses(param_access_token, param_addresses, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                AddOrganizationAddressesResponse::ListOfAddedAddresses

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::ADD_ORGANIZATION_ADDRESSES_LIST_OF_ADDED_ADDRESSES.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                AddOrganizationAddressesResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::ADD_ORGANIZATION_ADDRESSES_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter addresses: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // CreateDispatchRoute - POST /fleet/dispatch/routes
            &hyper::Method::Post if path.matched(paths::ID_FLEET_DISPATCH_ROUTES) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_create_dispatch_route_params: Option<models::DispatchRouteCreate> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_dispatch_route_params) => param_create_dispatch_route_params,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter createDispatchRouteParams - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_create_dispatch_route_params = match param_create_dispatch_route_params {
                                    Some(param_create_dispatch_route_params) => param_create_dispatch_route_params,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter createDispatchRouteParams"))),
                                };


                                Box::new(api_impl.create_dispatch_route(param_access_token, param_create_dispatch_route_params, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateDispatchRouteResponse::CreatedRouteObjectIncludingTheNewRouteID

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::CREATE_DISPATCH_ROUTE_CREATED_ROUTE_OBJECT_INCLUDING_THE_NEW_ROUTE_ID.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                CreateDispatchRouteResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::CREATE_DISPATCH_ROUTE_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter createDispatchRouteParams: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // CreateDriver - POST /fleet/drivers/create
            &hyper::Method::Post if path.matched(paths::ID_FLEET_DRIVERS_CREATE) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_create_driver_param: Option<models::DriverForCreate> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_driver_param) => param_create_driver_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter createDriverParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_create_driver_param = match param_create_driver_param {
                                    Some(param_create_driver_param) => param_create_driver_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter createDriverParam"))),
                                };


                                Box::new(api_impl.create_driver(param_access_token, param_create_driver_param, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateDriverResponse::ReturnsTheSuccessfullyCreatedTheDriver

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::CREATE_DRIVER_RETURNS_THE_SUCCESSFULLY_CREATED_THE_DRIVER.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                CreateDriverResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::CREATE_DRIVER_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter createDriverParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // CreateDriverDispatchRoute - POST /fleet/drivers/{driver_id}/dispatch/routes
            &hyper::Method::Post if path.matched(paths::ID_FLEET_DRIVERS_DRIVER_ID_DISPATCH_ROUTES) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_DRIVERS_DRIVER_ID_DISPATCH_ROUTES
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_DRIVERS_DRIVER_ID_DISPATCH_ROUTES in set but failed match against \"{}\"", path, paths::REGEX_FLEET_DRIVERS_DRIVER_ID_DISPATCH_ROUTES.as_str())
                    );

                let param_driver_id = match percent_encoding::percent_decode(path_params["driver_id"].as_bytes()).decode_utf8() {
                    Ok(param_driver_id) => match param_driver_id.parse::<i64>() {
                        Ok(param_driver_id) => param_driver_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter driver_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["driver_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_create_dispatch_route_params: Option<models::DispatchRouteCreate> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_dispatch_route_params) => param_create_dispatch_route_params,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter createDispatchRouteParams - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_create_dispatch_route_params = match param_create_dispatch_route_params {
                                    Some(param_create_dispatch_route_params) => param_create_dispatch_route_params,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter createDispatchRouteParams"))),
                                };


                                Box::new(api_impl.create_driver_dispatch_route(param_access_token, param_driver_id, param_create_dispatch_route_params, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateDriverDispatchRouteResponse::CreatedRouteObjectIncludingTheNewRouteID

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::CREATE_DRIVER_DISPATCH_ROUTE_CREATED_ROUTE_OBJECT_INCLUDING_THE_NEW_ROUTE_ID.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                CreateDriverDispatchRouteResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::CREATE_DRIVER_DISPATCH_ROUTE_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter createDispatchRouteParams: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // CreateDriverDocument - POST /fleet/drivers/{driver_id}/documents
            &hyper::Method::Post if path.matched(paths::ID_FLEET_DRIVERS_DRIVER_ID_DOCUMENTS) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_DRIVERS_DRIVER_ID_DOCUMENTS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_DRIVERS_DRIVER_ID_DOCUMENTS in set but failed match against \"{}\"", path, paths::REGEX_FLEET_DRIVERS_DRIVER_ID_DOCUMENTS.as_str())
                    );

                let param_driver_id = match percent_encoding::percent_decode(path_params["driver_id"].as_bytes()).decode_utf8() {
                    Ok(param_driver_id) => match param_driver_id.parse::<i64>() {
                        Ok(param_driver_id) => param_driver_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter driver_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["driver_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_create_document_params: Option<models::DocumentCreate> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_document_params) => param_create_document_params,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter createDocumentParams - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_create_document_params = match param_create_document_params {
                                    Some(param_create_document_params) => param_create_document_params,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter createDocumentParams"))),
                                };


                                Box::new(api_impl.create_driver_document(param_access_token, param_driver_id, param_create_document_params, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateDriverDocumentResponse::ReturnsTheCreatedDocument

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::CREATE_DRIVER_DOCUMENT_RETURNS_THE_CREATED_DOCUMENT.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                CreateDriverDocumentResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::CREATE_DRIVER_DOCUMENT_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter createDocumentParams: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // CreateDvir - POST /fleet/maintenance/dvirs
            &hyper::Method::Post if path.matched(paths::ID_FLEET_MAINTENANCE_DVIRS) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_create_dvir_param: Option<models::InlineObject12> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_dvir_param) => param_create_dvir_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter createDvirParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_create_dvir_param = match param_create_dvir_param {
                                    Some(param_create_dvir_param) => param_create_dvir_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter createDvirParam"))),
                                };


                                Box::new(api_impl.create_dvir(param_access_token, param_create_dvir_param, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateDvirResponse::NewlyCreatedDVIR

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::CREATE_DVIR_NEWLY_CREATED_DVIR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                CreateDvirResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::CREATE_DVIR_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter createDvirParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // CreateVehicleDispatchRoute - POST /fleet/vehicles/{vehicle_id}/dispatch/routes
            &hyper::Method::Post if path.matched(paths::ID_FLEET_VEHICLES_VEHICLE_ID_DISPATCH_ROUTES) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_VEHICLES_VEHICLE_ID_DISPATCH_ROUTES
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_VEHICLES_VEHICLE_ID_DISPATCH_ROUTES in set but failed match against \"{}\"", path, paths::REGEX_FLEET_VEHICLES_VEHICLE_ID_DISPATCH_ROUTES.as_str())
                    );

                let param_vehicle_id = match percent_encoding::percent_decode(path_params["vehicle_id"].as_bytes()).decode_utf8() {
                    Ok(param_vehicle_id) => match param_vehicle_id.parse::<i64>() {
                        Ok(param_vehicle_id) => param_vehicle_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter vehicle_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["vehicle_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_create_dispatch_route_params: Option<models::DispatchRouteCreate> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_dispatch_route_params) => param_create_dispatch_route_params,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter createDispatchRouteParams - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_create_dispatch_route_params = match param_create_dispatch_route_params {
                                    Some(param_create_dispatch_route_params) => param_create_dispatch_route_params,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter createDispatchRouteParams"))),
                                };


                                Box::new(api_impl.create_vehicle_dispatch_route(param_access_token, param_vehicle_id, param_create_dispatch_route_params, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateVehicleDispatchRouteResponse::CreatedRouteObjectIncludingTheNewRouteID

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::CREATE_VEHICLE_DISPATCH_ROUTE_CREATED_ROUTE_OBJECT_INCLUDING_THE_NEW_ROUTE_ID.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                CreateVehicleDispatchRouteResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::CREATE_VEHICLE_DISPATCH_ROUTE_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter createDispatchRouteParams: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // DeactivateDriver - DELETE /fleet/drivers/{driver_id_or_external_id}
            &hyper::Method::Delete if path.matched(paths::ID_FLEET_DRIVERS_DRIVER_ID_OR_EXTERNAL_ID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_DRIVERS_DRIVER_ID_OR_EXTERNAL_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_DRIVERS_DRIVER_ID_OR_EXTERNAL_ID in set but failed match against \"{}\"", path, paths::REGEX_FLEET_DRIVERS_DRIVER_ID_OR_EXTERNAL_ID.as_str())
                    );

                let param_driver_id_or_external_id = match percent_encoding::percent_decode(path_params["driver_id_or_external_id"].as_bytes()).decode_utf8() {
                    Ok(param_driver_id_or_external_id) => match param_driver_id_or_external_id.parse::<String>() {
                        Ok(param_driver_id_or_external_id) => param_driver_id_or_external_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter driver_id_or_external_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["driver_id_or_external_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.deactivate_driver(param_access_token, param_driver_id_or_external_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeactivateDriverResponse::SuccessfullyDeactivatedTheDriver


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                },
                                                DeactivateDriverResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::DEACTIVATE_DRIVER_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // DeleteDispatchRouteById - DELETE /fleet/dispatch/routes/{route_id}
            &hyper::Method::Delete if path.matched(paths::ID_FLEET_DISPATCH_ROUTES_ROUTE_ID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_DISPATCH_ROUTES_ROUTE_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_DISPATCH_ROUTES_ROUTE_ID in set but failed match against \"{}\"", path, paths::REGEX_FLEET_DISPATCH_ROUTES_ROUTE_ID.as_str())
                    );

                let param_route_id = match percent_encoding::percent_decode(path_params["route_id"].as_bytes()).decode_utf8() {
                    Ok(param_route_id) => match param_route_id.parse::<i64>() {
                        Ok(param_route_id) => param_route_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter route_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["route_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.delete_dispatch_route_by_id(param_access_token, param_route_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteDispatchRouteByIdResponse::SuccessfullyDeletedTheDispatchRoute


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                },
                                                DeleteDispatchRouteByIdResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::DELETE_DISPATCH_ROUTE_BY_ID_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // DeleteOrganizationAddress - DELETE /addresses/{addressId}
            &hyper::Method::Delete if path.matched(paths::ID_ADDRESSES_ADDRESSID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_ADDRESSES_ADDRESSID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ADDRESSES_ADDRESSID in set but failed match against \"{}\"", path, paths::REGEX_ADDRESSES_ADDRESSID.as_str())
                    );

                let param_address_id = match percent_encoding::percent_decode(path_params["addressId"].as_bytes()).decode_utf8() {
                    Ok(param_address_id) => match param_address_id.parse::<i64>() {
                        Ok(param_address_id) => param_address_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter addressId: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["addressId"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.delete_organization_address(param_access_token, param_address_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteOrganizationAddressResponse::AddressWasSuccessfullyDeleted


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                },
                                                DeleteOrganizationAddressResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::DELETE_ORGANIZATION_ADDRESS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // FetchAllDispatchRoutes - GET /fleet/dispatch/routes
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DISPATCH_ROUTES) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_group_id = query_params.iter().filter(|e| e.0 == "group_id").map(|e| e.1.to_owned())

                    .nth(0);

                let param_group_id = param_group_id.and_then(|param_group_id| param_group_id.parse::<>().ok());
                let param_end_time = query_params.iter().filter(|e| e.0 == "end_time").map(|e| e.1.to_owned())

                    .nth(0);

                let param_end_time = param_end_time.and_then(|param_end_time| param_end_time.parse::<>().ok());
                let param_duration = query_params.iter().filter(|e| e.0 == "duration").map(|e| e.1.to_owned())

                    .nth(0);

                let param_duration = param_duration.and_then(|param_duration| param_duration.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.fetch_all_dispatch_routes(param_access_token, param_group_id, param_end_time, param_duration, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                FetchAllDispatchRoutesResponse::AllDispatchRouteObjectsForTheGroup

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::FETCH_ALL_DISPATCH_ROUTES_ALL_DISPATCH_ROUTE_OBJECTS_FOR_THE_GROUP.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                FetchAllDispatchRoutesResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::FETCH_ALL_DISPATCH_ROUTES_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // FetchAllRouteJobUpdates - GET /fleet/dispatch/routes/job_updates
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DISPATCH_ROUTES_JOB_UPDATES) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_group_id = query_params.iter().filter(|e| e.0 == "group_id").map(|e| e.1.to_owned())

                    .nth(0);

                let param_group_id = param_group_id.and_then(|param_group_id| param_group_id.parse::<>().ok());
                let param_sequence_id = query_params.iter().filter(|e| e.0 == "sequence_id").map(|e| e.1.to_owned())

                    .nth(0);

                let param_sequence_id = param_sequence_id.and_then(|param_sequence_id| param_sequence_id.parse::<>().ok());
                let param_include = query_params.iter().filter(|e| e.0 == "include").map(|e| e.1.to_owned())

                    .nth(0);

                let param_include = param_include.and_then(|param_include| param_include.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.fetch_all_route_job_updates(param_access_token, param_group_id, param_sequence_id, param_include, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                FetchAllRouteJobUpdatesResponse::AllJobUpdatesOnRoutes

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::FETCH_ALL_ROUTE_JOB_UPDATES_ALL_JOB_UPDATES_ON_ROUTES.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                FetchAllRouteJobUpdatesResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::FETCH_ALL_ROUTE_JOB_UPDATES_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetAllAssetCurrentLocations - GET /fleet/assets/locations
            &hyper::Method::Get if path.matched(paths::ID_FLEET_ASSETS_LOCATIONS) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_group_id = query_params.iter().filter(|e| e.0 == "group_id").map(|e| e.1.to_owned())

                    .nth(0);

                let param_group_id = param_group_id.and_then(|param_group_id| param_group_id.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.get_all_asset_current_locations(param_access_token, param_group_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAllAssetCurrentLocationsResponse::ListOfAssetsAndTheirCurrentLocations

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ALL_ASSET_CURRENT_LOCATIONS_LIST_OF_ASSETS_AND_THEIR_CURRENT_LOCATIONS.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetAllAssetCurrentLocationsResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ALL_ASSET_CURRENT_LOCATIONS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetAllAssets - GET /fleet/assets
            &hyper::Method::Get if path.matched(paths::ID_FLEET_ASSETS) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_group_id = query_params.iter().filter(|e| e.0 == "group_id").map(|e| e.1.to_owned())

                    .nth(0);

                let param_group_id = param_group_id.and_then(|param_group_id| param_group_id.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.get_all_assets(param_access_token, param_group_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAllAssetsResponse::ListOfAssets

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ALL_ASSETS_LIST_OF_ASSETS.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetAllAssetsResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ALL_ASSETS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetAllDeactivatedDrivers - GET /fleet/drivers/inactive
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DRIVERS_INACTIVE) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_group_id = query_params.iter().filter(|e| e.0 == "group_id").map(|e| e.1.to_owned())

                    .nth(0);

                let param_group_id = param_group_id.and_then(|param_group_id| param_group_id.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.get_all_deactivated_drivers(param_access_token, param_group_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAllDeactivatedDriversResponse::ReturnsAnArrayOfAllDeactivatedDriversForTheGroup

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ALL_DEACTIVATED_DRIVERS_RETURNS_AN_ARRAY_OF_ALL_DEACTIVATED_DRIVERS_FOR_THE_GROUP.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetAllDeactivatedDriversResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ALL_DEACTIVATED_DRIVERS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetAssetLocation - GET /fleet/assets/{asset_id}/locations
            &hyper::Method::Get if path.matched(paths::ID_FLEET_ASSETS_ASSET_ID_LOCATIONS) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_ASSETS_ASSET_ID_LOCATIONS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_ASSETS_ASSET_ID_LOCATIONS in set but failed match against \"{}\"", path, paths::REGEX_FLEET_ASSETS_ASSET_ID_LOCATIONS.as_str())
                    );

                let param_asset_id = match percent_encoding::percent_decode(path_params["asset_id"].as_bytes()).decode_utf8() {
                    Ok(param_asset_id) => match param_asset_id.parse::<i64>() {
                        Ok(param_asset_id) => param_asset_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter asset_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["asset_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_start_ms = query_params.iter().filter(|e| e.0 == "startMs").map(|e| e.1.to_owned())

                    .nth(0);
                let param_start_ms = match param_start_ms {
                    Some(param_start_ms) => match param_start_ms.parse::<i64>() {
                        Ok(param_start_ms) => param_start_ms,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter startMs - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter startMs"))),
                };
                let param_end_ms = query_params.iter().filter(|e| e.0 == "endMs").map(|e| e.1.to_owned())

                    .nth(0);
                let param_end_ms = match param_end_ms {
                    Some(param_end_ms) => match param_end_ms.parse::<i64>() {
                        Ok(param_end_ms) => param_end_ms,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter endMs - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter endMs"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_asset_location(param_access_token, param_asset_id, param_start_ms, param_end_ms, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAssetLocationResponse::AssetLocationDetails

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ASSET_LOCATION_ASSET_LOCATION_DETAILS.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetAssetLocationResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ASSET_LOCATION_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetAssetReefer - GET /fleet/assets/{asset_id}/reefer
            &hyper::Method::Get if path.matched(paths::ID_FLEET_ASSETS_ASSET_ID_REEFER) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_ASSETS_ASSET_ID_REEFER
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_ASSETS_ASSET_ID_REEFER in set but failed match against \"{}\"", path, paths::REGEX_FLEET_ASSETS_ASSET_ID_REEFER.as_str())
                    );

                let param_asset_id = match percent_encoding::percent_decode(path_params["asset_id"].as_bytes()).decode_utf8() {
                    Ok(param_asset_id) => match param_asset_id.parse::<i64>() {
                        Ok(param_asset_id) => param_asset_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter asset_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["asset_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_start_ms = query_params.iter().filter(|e| e.0 == "startMs").map(|e| e.1.to_owned())

                    .nth(0);
                let param_start_ms = match param_start_ms {
                    Some(param_start_ms) => match param_start_ms.parse::<i64>() {
                        Ok(param_start_ms) => param_start_ms,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter startMs - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter startMs"))),
                };
                let param_end_ms = query_params.iter().filter(|e| e.0 == "endMs").map(|e| e.1.to_owned())

                    .nth(0);
                let param_end_ms = match param_end_ms {
                    Some(param_end_ms) => match param_end_ms.parse::<i64>() {
                        Ok(param_end_ms) => param_end_ms,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter endMs - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter endMs"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_asset_reefer(param_access_token, param_asset_id, param_start_ms, param_end_ms, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAssetReeferResponse::Reefer

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ASSET_REEFER_REEFER.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetAssetReeferResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ASSET_REEFER_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetDeactivatedDriverById - GET /fleet/drivers/inactive/{driver_id_or_external_id}
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DRIVERS_INACTIVE_DRIVER_ID_OR_EXTERNAL_ID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_DRIVERS_INACTIVE_DRIVER_ID_OR_EXTERNAL_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_DRIVERS_INACTIVE_DRIVER_ID_OR_EXTERNAL_ID in set but failed match against \"{}\"", path, paths::REGEX_FLEET_DRIVERS_INACTIVE_DRIVER_ID_OR_EXTERNAL_ID.as_str())
                    );

                let param_driver_id_or_external_id = match percent_encoding::percent_decode(path_params["driver_id_or_external_id"].as_bytes()).decode_utf8() {
                    Ok(param_driver_id_or_external_id) => match param_driver_id_or_external_id.parse::<String>() {
                        Ok(param_driver_id_or_external_id) => param_driver_id_or_external_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter driver_id_or_external_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["driver_id_or_external_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_deactivated_driver_by_id(param_access_token, param_driver_id_or_external_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetDeactivatedDriverByIdResponse::ReturnsTheDeactivatedDriverWithTheGivenDriver

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DEACTIVATED_DRIVER_BY_ID_RETURNS_THE_DEACTIVATED_DRIVER_WITH_THE_GIVEN_DRIVER.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetDeactivatedDriverByIdResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DEACTIVATED_DRIVER_BY_ID_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetDispatchRouteById - GET /fleet/dispatch/routes/{route_id}
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DISPATCH_ROUTES_ROUTE_ID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_DISPATCH_ROUTES_ROUTE_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_DISPATCH_ROUTES_ROUTE_ID in set but failed match against \"{}\"", path, paths::REGEX_FLEET_DISPATCH_ROUTES_ROUTE_ID.as_str())
                    );

                let param_route_id = match percent_encoding::percent_decode(path_params["route_id"].as_bytes()).decode_utf8() {
                    Ok(param_route_id) => match param_route_id.parse::<i64>() {
                        Ok(param_route_id) => param_route_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter route_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["route_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_dispatch_route_by_id(param_access_token, param_route_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetDispatchRouteByIdResponse::TheDispatchRouteCorrespondingToRoute

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DISPATCH_ROUTE_BY_ID_THE_DISPATCH_ROUTE_CORRESPONDING_TO_ROUTE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetDispatchRouteByIdResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DISPATCH_ROUTE_BY_ID_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetDispatchRouteHistory - GET /fleet/dispatch/routes/{route_id}/history
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DISPATCH_ROUTES_ROUTE_ID_HISTORY) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_DISPATCH_ROUTES_ROUTE_ID_HISTORY
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_DISPATCH_ROUTES_ROUTE_ID_HISTORY in set but failed match against \"{}\"", path, paths::REGEX_FLEET_DISPATCH_ROUTES_ROUTE_ID_HISTORY.as_str())
                    );

                let param_route_id = match percent_encoding::percent_decode(path_params["route_id"].as_bytes()).decode_utf8() {
                    Ok(param_route_id) => match param_route_id.parse::<i64>() {
                        Ok(param_route_id) => param_route_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter route_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["route_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_start_time = query_params.iter().filter(|e| e.0 == "start_time").map(|e| e.1.to_owned())

                    .nth(0);

                let param_start_time = param_start_time.and_then(|param_start_time| param_start_time.parse::<>().ok());
                let param_end_time = query_params.iter().filter(|e| e.0 == "end_time").map(|e| e.1.to_owned())

                    .nth(0);

                let param_end_time = param_end_time.and_then(|param_end_time| param_end_time.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.get_dispatch_route_history(param_access_token, param_route_id, param_start_time, param_end_time, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetDispatchRouteHistoryResponse::TheHistoricalRouteStateChangesBetweenStart

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DISPATCH_ROUTE_HISTORY_THE_HISTORICAL_ROUTE_STATE_CHANGES_BETWEEN_START.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetDispatchRouteHistoryResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DISPATCH_ROUTE_HISTORY_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetDispatchRoutesByDriverId - GET /fleet/drivers/{driver_id}/dispatch/routes
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DRIVERS_DRIVER_ID_DISPATCH_ROUTES) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_DRIVERS_DRIVER_ID_DISPATCH_ROUTES
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_DRIVERS_DRIVER_ID_DISPATCH_ROUTES in set but failed match against \"{}\"", path, paths::REGEX_FLEET_DRIVERS_DRIVER_ID_DISPATCH_ROUTES.as_str())
                    );

                let param_driver_id = match percent_encoding::percent_decode(path_params["driver_id"].as_bytes()).decode_utf8() {
                    Ok(param_driver_id) => match param_driver_id.parse::<i64>() {
                        Ok(param_driver_id) => param_driver_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter driver_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["driver_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_end_time = query_params.iter().filter(|e| e.0 == "end_time").map(|e| e.1.to_owned())

                    .nth(0);

                let param_end_time = param_end_time.and_then(|param_end_time| param_end_time.parse::<>().ok());
                let param_duration = query_params.iter().filter(|e| e.0 == "duration").map(|e| e.1.to_owned())

                    .nth(0);

                let param_duration = param_duration.and_then(|param_duration| param_duration.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.get_dispatch_routes_by_driver_id(param_access_token, param_driver_id, param_end_time, param_duration, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetDispatchRoutesByDriverIdResponse::ReturnsTheDispatchRoutesForTheGivenDriver

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DISPATCH_ROUTES_BY_DRIVER_ID_RETURNS_THE_DISPATCH_ROUTES_FOR_THE_GIVEN_DRIVER.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetDispatchRoutesByDriverIdResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DISPATCH_ROUTES_BY_DRIVER_ID_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetDispatchRoutesByVehicleId - GET /fleet/vehicles/{vehicle_id}/dispatch/routes
            &hyper::Method::Get if path.matched(paths::ID_FLEET_VEHICLES_VEHICLE_ID_DISPATCH_ROUTES) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_VEHICLES_VEHICLE_ID_DISPATCH_ROUTES
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_VEHICLES_VEHICLE_ID_DISPATCH_ROUTES in set but failed match against \"{}\"", path, paths::REGEX_FLEET_VEHICLES_VEHICLE_ID_DISPATCH_ROUTES.as_str())
                    );

                let param_vehicle_id = match percent_encoding::percent_decode(path_params["vehicle_id"].as_bytes()).decode_utf8() {
                    Ok(param_vehicle_id) => match param_vehicle_id.parse::<i64>() {
                        Ok(param_vehicle_id) => param_vehicle_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter vehicle_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["vehicle_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_end_time = query_params.iter().filter(|e| e.0 == "end_time").map(|e| e.1.to_owned())

                    .nth(0);

                let param_end_time = param_end_time.and_then(|param_end_time| param_end_time.parse::<>().ok());
                let param_duration = query_params.iter().filter(|e| e.0 == "duration").map(|e| e.1.to_owned())

                    .nth(0);

                let param_duration = param_duration.and_then(|param_duration| param_duration.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.get_dispatch_routes_by_vehicle_id(param_access_token, param_vehicle_id, param_end_time, param_duration, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetDispatchRoutesByVehicleIdResponse::ReturnsAllOfTheDispatchRoutesForTheGivenVehicle

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DISPATCH_ROUTES_BY_VEHICLE_ID_RETURNS_ALL_OF_THE_DISPATCH_ROUTES_FOR_THE_GIVEN_VEHICLE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetDispatchRoutesByVehicleIdResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DISPATCH_ROUTES_BY_VEHICLE_ID_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetDriverById - GET /fleet/drivers/{driver_id_or_external_id}
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DRIVERS_DRIVER_ID_OR_EXTERNAL_ID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_DRIVERS_DRIVER_ID_OR_EXTERNAL_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_DRIVERS_DRIVER_ID_OR_EXTERNAL_ID in set but failed match against \"{}\"", path, paths::REGEX_FLEET_DRIVERS_DRIVER_ID_OR_EXTERNAL_ID.as_str())
                    );

                let param_driver_id_or_external_id = match percent_encoding::percent_decode(path_params["driver_id_or_external_id"].as_bytes()).decode_utf8() {
                    Ok(param_driver_id_or_external_id) => match param_driver_id_or_external_id.parse::<String>() {
                        Ok(param_driver_id_or_external_id) => param_driver_id_or_external_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter driver_id_or_external_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["driver_id_or_external_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_driver_by_id(param_access_token, param_driver_id_or_external_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetDriverByIdResponse::ReturnsTheDriverForTheGivenDriver

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DRIVER_BY_ID_RETURNS_THE_DRIVER_FOR_THE_GIVEN_DRIVER.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetDriverByIdResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DRIVER_BY_ID_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetDriverDocumentTypesByOrgId - GET /fleet/drivers/document_types
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DRIVERS_DOCUMENT_TYPES) => {







                Box::new({
                        {{

                                Box::new(api_impl.get_driver_document_types_by_org_id(&context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetDriverDocumentTypesByOrgIdResponse::ReturnsAllOfTheDocumentTypes

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DRIVER_DOCUMENT_TYPES_BY_ORG_ID_RETURNS_ALL_OF_THE_DOCUMENT_TYPES.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetDriverDocumentTypesByOrgIdResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DRIVER_DOCUMENT_TYPES_BY_ORG_ID_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetDriverDocumentsByOrgId - GET /fleet/drivers/documents
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DRIVERS_DOCUMENTS) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_end_ms = query_params.iter().filter(|e| e.0 == "endMs").map(|e| e.1.to_owned())

                    .nth(0);

                let param_end_ms = param_end_ms.and_then(|param_end_ms| param_end_ms.parse::<>().ok());
                let param_duration_ms = query_params.iter().filter(|e| e.0 == "durationMs").map(|e| e.1.to_owned())

                    .nth(0);

                let param_duration_ms = param_duration_ms.and_then(|param_duration_ms| param_duration_ms.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.get_driver_documents_by_org_id(param_access_token, param_end_ms, param_duration_ms, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetDriverDocumentsByOrgIdResponse::ReturnsAllOfTheDocuments

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DRIVER_DOCUMENTS_BY_ORG_ID_RETURNS_ALL_OF_THE_DOCUMENTS.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetDriverDocumentsByOrgIdResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DRIVER_DOCUMENTS_BY_ORG_ID_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetDriverSafetyScore - GET /fleet/drivers/{driverId}/safety/score
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DRIVERS_DRIVERID_SAFETY_SCORE) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_DRIVERS_DRIVERID_SAFETY_SCORE
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_DRIVERS_DRIVERID_SAFETY_SCORE in set but failed match against \"{}\"", path, paths::REGEX_FLEET_DRIVERS_DRIVERID_SAFETY_SCORE.as_str())
                    );

                let param_driver_id = match percent_encoding::percent_decode(path_params["driverId"].as_bytes()).decode_utf8() {
                    Ok(param_driver_id) => match param_driver_id.parse::<i64>() {
                        Ok(param_driver_id) => param_driver_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter driverId: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["driverId"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_start_ms = query_params.iter().filter(|e| e.0 == "startMs").map(|e| e.1.to_owned())

                    .nth(0);
                let param_start_ms = match param_start_ms {
                    Some(param_start_ms) => match param_start_ms.parse::<i64>() {
                        Ok(param_start_ms) => param_start_ms,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter startMs - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter startMs"))),
                };
                let param_end_ms = query_params.iter().filter(|e| e.0 == "endMs").map(|e| e.1.to_owned())

                    .nth(0);
                let param_end_ms = match param_end_ms {
                    Some(param_end_ms) => match param_end_ms.parse::<i64>() {
                        Ok(param_end_ms) => param_end_ms,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter endMs - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter endMs"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_driver_safety_score(param_driver_id, param_access_token, param_start_ms, param_end_ms, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetDriverSafetyScoreResponse::SafetyScoreDetails

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DRIVER_SAFETY_SCORE_SAFETY_SCORE_DETAILS.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetDriverSafetyScoreResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DRIVER_SAFETY_SCORE_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetDvirs - GET /fleet/maintenance/dvirs
            &hyper::Method::Get if path.matched(paths::ID_FLEET_MAINTENANCE_DVIRS) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_end_ms = query_params.iter().filter(|e| e.0 == "end_ms").map(|e| e.1.to_owned())

                    .nth(0);
                let param_end_ms = match param_end_ms {
                    Some(param_end_ms) => match param_end_ms.parse::<i32>() {
                        Ok(param_end_ms) => param_end_ms,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter end_ms - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter end_ms"))),
                };
                let param_duration_ms = query_params.iter().filter(|e| e.0 == "duration_ms").map(|e| e.1.to_owned())

                    .nth(0);
                let param_duration_ms = match param_duration_ms {
                    Some(param_duration_ms) => match param_duration_ms.parse::<i32>() {
                        Ok(param_duration_ms) => param_duration_ms,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter duration_ms - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter duration_ms"))),
                };
                let param_group_id = query_params.iter().filter(|e| e.0 == "group_id").map(|e| e.1.to_owned())

                    .nth(0);

                let param_group_id = param_group_id.and_then(|param_group_id| param_group_id.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.get_dvirs(param_access_token, param_end_ms, param_duration_ms, param_group_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetDvirsResponse::DVIRsForTheSpecifiedDuration

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DVIRS_DVI_RS_FOR_THE_SPECIFIED_DURATION.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetDvirsResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DVIRS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetFleetDrivers - POST /fleet/drivers
            &hyper::Method::Post if path.matched(paths::ID_FLEET_DRIVERS) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_group_drivers_param: Option<models::InlineObject3> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_group_drivers_param) => param_group_drivers_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter groupDriversParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_group_drivers_param = match param_group_drivers_param {
                                    Some(param_group_drivers_param) => param_group_drivers_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter groupDriversParam"))),
                                };


                                Box::new(api_impl.get_fleet_drivers(param_access_token, param_group_drivers_param, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetFleetDriversResponse::AllDriversInTheGroup

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_FLEET_DRIVERS_ALL_DRIVERS_IN_THE_GROUP.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetFleetDriversResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_FLEET_DRIVERS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter groupDriversParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // GetFleetDriversHosDailyLogs - POST /fleet/drivers/{driver_id}/hos_daily_logs
            &hyper::Method::Post if path.matched(paths::ID_FLEET_DRIVERS_DRIVER_ID_HOS_DAILY_LOGS) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_DRIVERS_DRIVER_ID_HOS_DAILY_LOGS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_DRIVERS_DRIVER_ID_HOS_DAILY_LOGS in set but failed match against \"{}\"", path, paths::REGEX_FLEET_DRIVERS_DRIVER_ID_HOS_DAILY_LOGS.as_str())
                    );

                let param_driver_id = match percent_encoding::percent_decode(path_params["driver_id"].as_bytes()).decode_utf8() {
                    Ok(param_driver_id) => match param_driver_id.parse::<i64>() {
                        Ok(param_driver_id) => param_driver_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter driver_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["driver_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_hos_logs_param: Option<models::InlineObject6> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_hos_logs_param) => param_hos_logs_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter hosLogsParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_hos_logs_param = match param_hos_logs_param {
                                    Some(param_hos_logs_param) => param_hos_logs_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter hosLogsParam"))),
                                };


                                Box::new(api_impl.get_fleet_drivers_hos_daily_logs(param_access_token, param_driver_id, param_hos_logs_param, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetFleetDriversHosDailyLogsResponse::DistanceTraveledAndTimeActiveForEachDriverInTheOrganizationOverTheSpecifiedTimePeriod

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_FLEET_DRIVERS_HOS_DAILY_LOGS_DISTANCE_TRAVELED_AND_TIME_ACTIVE_FOR_EACH_DRIVER_IN_THE_ORGANIZATION_OVER_THE_SPECIFIED_TIME_PERIOD.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetFleetDriversHosDailyLogsResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_FLEET_DRIVERS_HOS_DAILY_LOGS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter hosLogsParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // GetFleetDriversSummary - POST /fleet/drivers/summary
            &hyper::Method::Post if path.matched(paths::ID_FLEET_DRIVERS_SUMMARY) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_snap_to_day_bounds = query_params.iter().filter(|e| e.0 == "snap_to_day_bounds").map(|e| e.1.to_owned())

                    .nth(0);

                let param_snap_to_day_bounds = param_snap_to_day_bounds.and_then(|param_snap_to_day_bounds| param_snap_to_day_bounds.parse::<>().ok());


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_drivers_summary_param: Option<models::InlineObject5> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_drivers_summary_param) => param_drivers_summary_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter driversSummaryParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_drivers_summary_param = match param_drivers_summary_param {
                                    Some(param_drivers_summary_param) => param_drivers_summary_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter driversSummaryParam"))),
                                };


                                Box::new(api_impl.get_fleet_drivers_summary(param_access_token, param_drivers_summary_param, param_snap_to_day_bounds, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetFleetDriversSummaryResponse::DistanceTraveledAndTimeActiveForEachDriverInTheOrganizationOverTheSpecifiedTimePeriod

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_FLEET_DRIVERS_SUMMARY_DISTANCE_TRAVELED_AND_TIME_ACTIVE_FOR_EACH_DRIVER_IN_THE_ORGANIZATION_OVER_THE_SPECIFIED_TIME_PERIOD.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetFleetDriversSummaryResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_FLEET_DRIVERS_SUMMARY_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter driversSummaryParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // GetFleetHosAuthenticationLogs - POST /fleet/hos_authentication_logs
            &hyper::Method::Post if path.matched(paths::ID_FLEET_HOS_AUTHENTICATION_LOGS) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_hos_authentication_logs_param: Option<models::InlineObject7> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_hos_authentication_logs_param) => param_hos_authentication_logs_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter hosAuthenticationLogsParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_hos_authentication_logs_param = match param_hos_authentication_logs_param {
                                    Some(param_hos_authentication_logs_param) => param_hos_authentication_logs_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter hosAuthenticationLogsParam"))),
                                };


                                Box::new(api_impl.get_fleet_hos_authentication_logs(param_access_token, param_hos_authentication_logs_param, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetFleetHosAuthenticationLogsResponse::HOSAuthenticationLogsForTheSpecifiedDriver

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_FLEET_HOS_AUTHENTICATION_LOGS_HOS_AUTHENTICATION_LOGS_FOR_THE_SPECIFIED_DRIVER.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetFleetHosAuthenticationLogsResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_FLEET_HOS_AUTHENTICATION_LOGS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter hosAuthenticationLogsParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // GetFleetHosLogs - POST /fleet/hos_logs
            &hyper::Method::Post if path.matched(paths::ID_FLEET_HOS_LOGS) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_hos_logs_param: Option<models::InlineObject8> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_hos_logs_param) => param_hos_logs_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter hosLogsParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_hos_logs_param = match param_hos_logs_param {
                                    Some(param_hos_logs_param) => param_hos_logs_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter hosLogsParam"))),
                                };


                                Box::new(api_impl.get_fleet_hos_logs(param_access_token, param_hos_logs_param, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetFleetHosLogsResponse::HOSLogsForTheSpecifiedDriver

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_FLEET_HOS_LOGS_HOS_LOGS_FOR_THE_SPECIFIED_DRIVER.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetFleetHosLogsResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_FLEET_HOS_LOGS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter hosLogsParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // GetFleetHosLogsSummary - POST /fleet/hos_logs_summary
            &hyper::Method::Post if path.matched(paths::ID_FLEET_HOS_LOGS_SUMMARY) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_hos_logs_param: Option<models::InlineObject9> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_hos_logs_param) => param_hos_logs_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter hosLogsParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_hos_logs_param = match param_hos_logs_param {
                                    Some(param_hos_logs_param) => param_hos_logs_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter hosLogsParam"))),
                                };


                                Box::new(api_impl.get_fleet_hos_logs_summary(param_access_token, param_hos_logs_param, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetFleetHosLogsSummaryResponse::HOSLogsForTheSpecifiedDriver

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_FLEET_HOS_LOGS_SUMMARY_HOS_LOGS_FOR_THE_SPECIFIED_DRIVER.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetFleetHosLogsSummaryResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_FLEET_HOS_LOGS_SUMMARY_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter hosLogsParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // GetFleetLocations - POST /fleet/locations
            &hyper::Method::Post if path.matched(paths::ID_FLEET_LOCATIONS) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_group_param: Option<models::InlineObject11> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_group_param) => param_group_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter groupParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_group_param = match param_group_param {
                                    Some(param_group_param) => param_group_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter groupParam"))),
                                };


                                Box::new(api_impl.get_fleet_locations(param_access_token, param_group_param, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetFleetLocationsResponse::ListOfVehicleObjectsContainingTheirLocationAndTheTimeAtWhichThatLocationWasLogged

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_FLEET_LOCATIONS_LIST_OF_VEHICLE_OBJECTS_CONTAINING_THEIR_LOCATION_AND_THE_TIME_AT_WHICH_THAT_LOCATION_WAS_LOGGED.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetFleetLocationsResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_FLEET_LOCATIONS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter groupParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // GetFleetMaintenanceList - POST /fleet/maintenance/list
            &hyper::Method::Post if path.matched(paths::ID_FLEET_MAINTENANCE_LIST) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_group_param: Option<models::InlineObject13> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_group_param) => param_group_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter groupParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_group_param = match param_group_param {
                                    Some(param_group_param) => param_group_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter groupParam"))),
                                };


                                Box::new(api_impl.get_fleet_maintenance_list(param_access_token, param_group_param, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetFleetMaintenanceListResponse::ListOfVehiclesAndMaintenanceInformationAboutEach

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_FLEET_MAINTENANCE_LIST_LIST_OF_VEHICLES_AND_MAINTENANCE_INFORMATION_ABOUT_EACH.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetFleetMaintenanceListResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_FLEET_MAINTENANCE_LIST_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter groupParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // GetFleetTrips - POST /fleet/trips
            &hyper::Method::Post if path.matched(paths::ID_FLEET_TRIPS) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_trips_param: Option<models::InlineObject15> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_trips_param) => param_trips_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter tripsParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_trips_param = match param_trips_param {
                                    Some(param_trips_param) => param_trips_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter tripsParam"))),
                                };


                                Box::new(api_impl.get_fleet_trips(param_access_token, param_trips_param, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetFleetTripsResponse::ListOfTripsTakenByTheRequestedVehicleWithinTheSpecifiedTimeframe

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_FLEET_TRIPS_LIST_OF_TRIPS_TAKEN_BY_THE_REQUESTED_VEHICLE_WITHIN_THE_SPECIFIED_TIMEFRAME.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetFleetTripsResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_FLEET_TRIPS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter tripsParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // GetFleetVehicle - GET /fleet/vehicles/{vehicle_id_or_external_id}
            &hyper::Method::Get if path.matched(paths::ID_FLEET_VEHICLES_VEHICLE_ID_OR_EXTERNAL_ID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_VEHICLES_VEHICLE_ID_OR_EXTERNAL_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_VEHICLES_VEHICLE_ID_OR_EXTERNAL_ID in set but failed match against \"{}\"", path, paths::REGEX_FLEET_VEHICLES_VEHICLE_ID_OR_EXTERNAL_ID.as_str())
                    );

                let param_vehicle_id_or_external_id = match percent_encoding::percent_decode(path_params["vehicle_id_or_external_id"].as_bytes()).decode_utf8() {
                    Ok(param_vehicle_id_or_external_id) => match param_vehicle_id_or_external_id.parse::<String>() {
                        Ok(param_vehicle_id_or_external_id) => param_vehicle_id_or_external_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter vehicle_id_or_external_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["vehicle_id_or_external_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_fleet_vehicle(param_access_token, param_vehicle_id_or_external_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetFleetVehicleResponse::TheSpecifiedVehicle

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_FLEET_VEHICLE_THE_SPECIFIED_VEHICLE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetFleetVehicleResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_FLEET_VEHICLE_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetOrganizationAddress - GET /addresses/{addressId}
            &hyper::Method::Get if path.matched(paths::ID_ADDRESSES_ADDRESSID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_ADDRESSES_ADDRESSID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ADDRESSES_ADDRESSID in set but failed match against \"{}\"", path, paths::REGEX_ADDRESSES_ADDRESSID.as_str())
                    );

                let param_address_id = match percent_encoding::percent_decode(path_params["addressId"].as_bytes()).decode_utf8() {
                    Ok(param_address_id) => match param_address_id.parse::<i64>() {
                        Ok(param_address_id) => param_address_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter addressId: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["addressId"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_organization_address(param_access_token, param_address_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetOrganizationAddressResponse::TheAddress

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ORGANIZATION_ADDRESS_THE_ADDRESS.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetOrganizationAddressResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ORGANIZATION_ADDRESS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetOrganizationAddresses - GET /addresses
            &hyper::Method::Get if path.matched(paths::ID_ADDRESSES) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_organization_addresses(param_access_token, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetOrganizationAddressesResponse::ListOfAddresses

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ORGANIZATION_ADDRESSES_LIST_OF_ADDRESSES.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetOrganizationAddressesResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ORGANIZATION_ADDRESSES_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetOrganizationContact - GET /contacts/{contact_id}
            &hyper::Method::Get if path.matched(paths::ID_CONTACTS_CONTACT_ID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_CONTACTS_CONTACT_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE CONTACTS_CONTACT_ID in set but failed match against \"{}\"", path, paths::REGEX_CONTACTS_CONTACT_ID.as_str())
                    );

                let param_contact_id = match percent_encoding::percent_decode(path_params["contact_id"].as_bytes()).decode_utf8() {
                    Ok(param_contact_id) => match param_contact_id.parse::<i64>() {
                        Ok(param_contact_id) => param_contact_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter contact_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["contact_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_organization_contact(param_access_token, param_contact_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetOrganizationContactResponse::TheContact

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ORGANIZATION_CONTACT_THE_CONTACT.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetOrganizationContactResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ORGANIZATION_CONTACT_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetVehicleHarshEvent - GET /fleet/vehicles/{vehicleId}/safety/harsh_event
            &hyper::Method::Get if path.matched(paths::ID_FLEET_VEHICLES_VEHICLEID_SAFETY_HARSH_EVENT) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_VEHICLES_VEHICLEID_SAFETY_HARSH_EVENT
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_VEHICLES_VEHICLEID_SAFETY_HARSH_EVENT in set but failed match against \"{}\"", path, paths::REGEX_FLEET_VEHICLES_VEHICLEID_SAFETY_HARSH_EVENT.as_str())
                    );

                let param_vehicle_id = match percent_encoding::percent_decode(path_params["vehicleId"].as_bytes()).decode_utf8() {
                    Ok(param_vehicle_id) => match param_vehicle_id.parse::<i64>() {
                        Ok(param_vehicle_id) => param_vehicle_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter vehicleId: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["vehicleId"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_timestamp = query_params.iter().filter(|e| e.0 == "timestamp").map(|e| e.1.to_owned())

                    .nth(0);
                let param_timestamp = match param_timestamp {
                    Some(param_timestamp) => match param_timestamp.parse::<i64>() {
                        Ok(param_timestamp) => param_timestamp,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter timestamp - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter timestamp"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_vehicle_harsh_event(param_vehicle_id, param_access_token, param_timestamp, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetVehicleHarshEventResponse::HarshEventDetails

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_VEHICLE_HARSH_EVENT_HARSH_EVENT_DETAILS.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetVehicleHarshEventResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_VEHICLE_HARSH_EVENT_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetVehicleLocations - GET /fleet/vehicles/{vehicle_id}/locations
            &hyper::Method::Get if path.matched(paths::ID_FLEET_VEHICLES_VEHICLE_ID_LOCATIONS) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_VEHICLES_VEHICLE_ID_LOCATIONS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_VEHICLES_VEHICLE_ID_LOCATIONS in set but failed match against \"{}\"", path, paths::REGEX_FLEET_VEHICLES_VEHICLE_ID_LOCATIONS.as_str())
                    );

                let param_vehicle_id = match percent_encoding::percent_decode(path_params["vehicle_id"].as_bytes()).decode_utf8() {
                    Ok(param_vehicle_id) => match param_vehicle_id.parse::<i64>() {
                        Ok(param_vehicle_id) => param_vehicle_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter vehicle_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["vehicle_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_start_ms = query_params.iter().filter(|e| e.0 == "startMs").map(|e| e.1.to_owned())

                    .nth(0);
                let param_start_ms = match param_start_ms {
                    Some(param_start_ms) => match param_start_ms.parse::<i64>() {
                        Ok(param_start_ms) => param_start_ms,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter startMs - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter startMs"))),
                };
                let param_end_ms = query_params.iter().filter(|e| e.0 == "endMs").map(|e| e.1.to_owned())

                    .nth(0);
                let param_end_ms = match param_end_ms {
                    Some(param_end_ms) => match param_end_ms.parse::<i64>() {
                        Ok(param_end_ms) => param_end_ms,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter endMs - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter endMs"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_vehicle_locations(param_access_token, param_vehicle_id, param_start_ms, param_end_ms, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetVehicleLocationsResponse::ReturnsLocationsForAGivenVehicleBetweenAStart

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_VEHICLE_LOCATIONS_RETURNS_LOCATIONS_FOR_A_GIVEN_VEHICLE_BETWEEN_A_START.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetVehicleLocationsResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_VEHICLE_LOCATIONS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetVehicleSafetyScore - GET /fleet/vehicles/{vehicleId}/safety/score
            &hyper::Method::Get if path.matched(paths::ID_FLEET_VEHICLES_VEHICLEID_SAFETY_SCORE) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_VEHICLES_VEHICLEID_SAFETY_SCORE
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_VEHICLES_VEHICLEID_SAFETY_SCORE in set but failed match against \"{}\"", path, paths::REGEX_FLEET_VEHICLES_VEHICLEID_SAFETY_SCORE.as_str())
                    );

                let param_vehicle_id = match percent_encoding::percent_decode(path_params["vehicleId"].as_bytes()).decode_utf8() {
                    Ok(param_vehicle_id) => match param_vehicle_id.parse::<i64>() {
                        Ok(param_vehicle_id) => param_vehicle_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter vehicleId: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["vehicleId"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_start_ms = query_params.iter().filter(|e| e.0 == "startMs").map(|e| e.1.to_owned())

                    .nth(0);
                let param_start_ms = match param_start_ms {
                    Some(param_start_ms) => match param_start_ms.parse::<i64>() {
                        Ok(param_start_ms) => param_start_ms,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter startMs - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter startMs"))),
                };
                let param_end_ms = query_params.iter().filter(|e| e.0 == "endMs").map(|e| e.1.to_owned())

                    .nth(0);
                let param_end_ms = match param_end_ms {
                    Some(param_end_ms) => match param_end_ms.parse::<i64>() {
                        Ok(param_end_ms) => param_end_ms,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter endMs - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter endMs"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_vehicle_safety_score(param_vehicle_id, param_access_token, param_start_ms, param_end_ms, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetVehicleSafetyScoreResponse::SafetyScoreDetails

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_VEHICLE_SAFETY_SCORE_SAFETY_SCORE_DETAILS.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetVehicleSafetyScoreResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_VEHICLE_SAFETY_SCORE_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetVehicleStats - GET /fleet/vehicles/stats
            &hyper::Method::Get if path.matched(paths::ID_FLEET_VEHICLES_STATS) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_start_ms = query_params.iter().filter(|e| e.0 == "startMs").map(|e| e.1.to_owned())

                    .nth(0);
                let param_start_ms = match param_start_ms {
                    Some(param_start_ms) => match param_start_ms.parse::<i32>() {
                        Ok(param_start_ms) => param_start_ms,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter startMs - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter startMs"))),
                };
                let param_end_ms = query_params.iter().filter(|e| e.0 == "endMs").map(|e| e.1.to_owned())

                    .nth(0);
                let param_end_ms = match param_end_ms {
                    Some(param_end_ms) => match param_end_ms.parse::<i32>() {
                        Ok(param_end_ms) => param_end_ms,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter endMs - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter endMs"))),
                };
                let param_series = query_params.iter().filter(|e| e.0 == "series").map(|e| e.1.to_owned())

                    .nth(0);

                let param_series = param_series.and_then(|param_series| param_series.parse::<>().ok());
                let param_tag_ids = query_params.iter().filter(|e| e.0 == "tagIds").map(|e| e.1.to_owned())

                    .nth(0);

                let param_tag_ids = param_tag_ids.and_then(|param_tag_ids| param_tag_ids.parse::<>().ok());
                let param_starting_after = query_params.iter().filter(|e| e.0 == "startingAfter").map(|e| e.1.to_owned())

                    .nth(0);

                let param_starting_after = param_starting_after.and_then(|param_starting_after| param_starting_after.parse::<>().ok());
                let param_ending_before = query_params.iter().filter(|e| e.0 == "endingBefore").map(|e| e.1.to_owned())

                    .nth(0);

                let param_ending_before = param_ending_before.and_then(|param_ending_before| param_ending_before.parse::<>().ok());
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.to_owned())

                    .nth(0);

                let param_limit = param_limit.and_then(|param_limit| param_limit.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.get_vehicle_stats(param_access_token, param_start_ms, param_end_ms, param_series, param_tag_ids, param_starting_after, param_ending_before, param_limit, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetVehicleStatsResponse::ReturnsEngineStateAnd

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_VEHICLE_STATS_RETURNS_ENGINE_STATE_AND.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetVehicleStatsResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_VEHICLE_STATS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetVehiclesLocations - GET /fleet/vehicles/locations
            &hyper::Method::Get if path.matched(paths::ID_FLEET_VEHICLES_LOCATIONS) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_start_ms = query_params.iter().filter(|e| e.0 == "startMs").map(|e| e.1.to_owned())

                    .nth(0);
                let param_start_ms = match param_start_ms {
                    Some(param_start_ms) => match param_start_ms.parse::<i32>() {
                        Ok(param_start_ms) => param_start_ms,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter startMs - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter startMs"))),
                };
                let param_end_ms = query_params.iter().filter(|e| e.0 == "endMs").map(|e| e.1.to_owned())

                    .nth(0);
                let param_end_ms = match param_end_ms {
                    Some(param_end_ms) => match param_end_ms.parse::<i32>() {
                        Ok(param_end_ms) => param_end_ms,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter endMs - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter endMs"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_vehicles_locations(param_access_token, param_start_ms, param_end_ms, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetVehiclesLocationsResponse::ReturnsLocationsForAGivenVehicleBetweenAStart

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_VEHICLES_LOCATIONS_RETURNS_LOCATIONS_FOR_A_GIVEN_VEHICLE_BETWEEN_A_START.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetVehiclesLocationsResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_VEHICLES_LOCATIONS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // ListContacts - GET /contacts
            &hyper::Method::Get if path.matched(paths::ID_CONTACTS) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.list_contacts(param_access_token, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListContactsResponse::ListOfContacts

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::LIST_CONTACTS_LIST_OF_CONTACTS.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                ListContactsResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::LIST_CONTACTS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // ListFleet - POST /fleet/list
            &hyper::Method::Post if path.matched(paths::ID_FLEET_LIST) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_starting_after = query_params.iter().filter(|e| e.0 == "startingAfter").map(|e| e.1.to_owned())

                    .nth(0);

                let param_starting_after = param_starting_after.and_then(|param_starting_after| param_starting_after.parse::<>().ok());
                let param_ending_before = query_params.iter().filter(|e| e.0 == "endingBefore").map(|e| e.1.to_owned())

                    .nth(0);

                let param_ending_before = param_ending_before.and_then(|param_ending_before| param_ending_before.parse::<>().ok());
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.to_owned())

                    .nth(0);

                let param_limit = param_limit.and_then(|param_limit| param_limit.parse::<>().ok());


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_group_param: Option<models::InlineObject10> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_group_param) => param_group_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter groupParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_group_param = match param_group_param {
                                    Some(param_group_param) => param_group_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter groupParam"))),
                                };


                                Box::new(api_impl.list_fleet(param_access_token, param_group_param, param_starting_after, param_ending_before, param_limit, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListFleetResponse::ListOfVehiclesAndInformationAboutEach

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::LIST_FLEET_LIST_OF_VEHICLES_AND_INFORMATION_ABOUT_EACH.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                ListFleetResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::LIST_FLEET_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter groupParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // PatchFleetVehicle - PATCH /fleet/vehicles/{vehicle_id_or_external_id}
            &hyper::Method::Patch if path.matched(paths::ID_FLEET_VEHICLES_VEHICLE_ID_OR_EXTERNAL_ID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_VEHICLES_VEHICLE_ID_OR_EXTERNAL_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_VEHICLES_VEHICLE_ID_OR_EXTERNAL_ID in set but failed match against \"{}\"", path, paths::REGEX_FLEET_VEHICLES_VEHICLE_ID_OR_EXTERNAL_ID.as_str())
                    );

                let param_vehicle_id_or_external_id = match percent_encoding::percent_decode(path_params["vehicle_id_or_external_id"].as_bytes()).decode_utf8() {
                    Ok(param_vehicle_id_or_external_id) => match param_vehicle_id_or_external_id.parse::<String>() {
                        Ok(param_vehicle_id_or_external_id) => param_vehicle_id_or_external_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter vehicle_id_or_external_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["vehicle_id_or_external_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_data: Option<models::InlineObject16> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_data) => param_data,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter data - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_data = match param_data {
                                    Some(param_data) => param_data,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter data"))),
                                };


                                Box::new(api_impl.patch_fleet_vehicle(param_access_token, param_vehicle_id_or_external_id, param_data, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PatchFleetVehicleResponse::TheUpdatedVehicle

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::PATCH_FLEET_VEHICLE_THE_UPDATED_VEHICLE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                PatchFleetVehicleResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::PATCH_FLEET_VEHICLE_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter data: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // ReactivateDriverById - PUT /fleet/drivers/inactive/{driver_id_or_external_id}
            &hyper::Method::Put if path.matched(paths::ID_FLEET_DRIVERS_INACTIVE_DRIVER_ID_OR_EXTERNAL_ID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_DRIVERS_INACTIVE_DRIVER_ID_OR_EXTERNAL_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_DRIVERS_INACTIVE_DRIVER_ID_OR_EXTERNAL_ID in set but failed match against \"{}\"", path, paths::REGEX_FLEET_DRIVERS_INACTIVE_DRIVER_ID_OR_EXTERNAL_ID.as_str())
                    );

                let param_driver_id_or_external_id = match percent_encoding::percent_decode(path_params["driver_id_or_external_id"].as_bytes()).decode_utf8() {
                    Ok(param_driver_id_or_external_id) => match param_driver_id_or_external_id.parse::<String>() {
                        Ok(param_driver_id_or_external_id) => param_driver_id_or_external_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter driver_id_or_external_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["driver_id_or_external_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_reactivate_driver_param: Option<models::InlineObject4> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_reactivate_driver_param) => param_reactivate_driver_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter reactivateDriverParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_reactivate_driver_param = match param_reactivate_driver_param {
                                    Some(param_reactivate_driver_param) => param_reactivate_driver_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter reactivateDriverParam"))),
                                };


                                Box::new(api_impl.reactivate_driver_by_id(param_access_token, param_driver_id_or_external_id, param_reactivate_driver_param, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ReactivateDriverByIdResponse::ReturnsTheReactivatedDriver

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::REACTIVATE_DRIVER_BY_ID_RETURNS_THE_REACTIVATED_DRIVER.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                ReactivateDriverByIdResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::REACTIVATE_DRIVER_BY_ID_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter reactivateDriverParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // UpdateDispatchRouteById - PUT /fleet/dispatch/routes/{route_id}
            &hyper::Method::Put if path.matched(paths::ID_FLEET_DISPATCH_ROUTES_ROUTE_ID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_DISPATCH_ROUTES_ROUTE_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_DISPATCH_ROUTES_ROUTE_ID in set but failed match against \"{}\"", path, paths::REGEX_FLEET_DISPATCH_ROUTES_ROUTE_ID.as_str())
                    );

                let param_route_id = match percent_encoding::percent_decode(path_params["route_id"].as_bytes()).decode_utf8() {
                    Ok(param_route_id) => match param_route_id.parse::<i64>() {
                        Ok(param_route_id) => param_route_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter route_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["route_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_update_dispatch_route_params: Option<models::DispatchRoute> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_update_dispatch_route_params) => param_update_dispatch_route_params,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter updateDispatchRouteParams - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_update_dispatch_route_params = match param_update_dispatch_route_params {
                                    Some(param_update_dispatch_route_params) => param_update_dispatch_route_params,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter updateDispatchRouteParams"))),
                                };


                                Box::new(api_impl.update_dispatch_route_by_id(param_access_token, param_route_id, param_update_dispatch_route_params, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UpdateDispatchRouteByIdResponse::UpdateTheDispatchRoute

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::UPDATE_DISPATCH_ROUTE_BY_ID_UPDATE_THE_DISPATCH_ROUTE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                UpdateDispatchRouteByIdResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::UPDATE_DISPATCH_ROUTE_BY_ID_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter updateDispatchRouteParams: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // UpdateOrganizationAddress - PATCH /addresses/{addressId}
            &hyper::Method::Patch if path.matched(paths::ID_ADDRESSES_ADDRESSID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_ADDRESSES_ADDRESSID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ADDRESSES_ADDRESSID in set but failed match against \"{}\"", path, paths::REGEX_ADDRESSES_ADDRESSID.as_str())
                    );

                let param_address_id = match percent_encoding::percent_decode(path_params["addressId"].as_bytes()).decode_utf8() {
                    Ok(param_address_id) => match param_address_id.parse::<i64>() {
                        Ok(param_address_id) => param_address_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter addressId: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["addressId"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_address: Option<models::InlineObject1> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_address) => param_address,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter address - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_address = match param_address {
                                    Some(param_address) => param_address,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter address"))),
                                };


                                Box::new(api_impl.update_organization_address(param_access_token, param_address_id, param_address, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UpdateOrganizationAddressResponse::AddressWasSuccessfullyUpdated


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                },
                                                UpdateOrganizationAddressResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::UPDATE_ORGANIZATION_ADDRESS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter address: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // UpdateVehicles - POST /fleet/set_data
            &hyper::Method::Post if path.matched(paths::ID_FLEET_SET_DATA) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_vehicle_update_param: Option<models::InlineObject14> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_vehicle_update_param) => param_vehicle_update_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter vehicleUpdateParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_vehicle_update_param = match param_vehicle_update_param {
                                    Some(param_vehicle_update_param) => param_vehicle_update_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter vehicleUpdateParam"))),
                                };


                                Box::new(api_impl.update_vehicles(param_access_token, param_vehicle_update_param, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UpdateVehiclesResponse::VehiclesWereSuccessfullyUpdated


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                },
                                                UpdateVehiclesResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::UPDATE_VEHICLES_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter vehicleUpdateParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // GetAllDataInputs - GET /industrial/data
            &hyper::Method::Get if path.matched(paths::ID_INDUSTRIAL_DATA) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_group_id = query_params.iter().filter(|e| e.0 == "group_id").map(|e| e.1.to_owned())

                    .nth(0);

                let param_group_id = param_group_id.and_then(|param_group_id| param_group_id.parse::<>().ok());
                let param_start_ms = query_params.iter().filter(|e| e.0 == "startMs").map(|e| e.1.to_owned())

                    .nth(0);

                let param_start_ms = param_start_ms.and_then(|param_start_ms| param_start_ms.parse::<>().ok());
                let param_end_ms = query_params.iter().filter(|e| e.0 == "endMs").map(|e| e.1.to_owned())

                    .nth(0);

                let param_end_ms = param_end_ms.and_then(|param_end_ms| param_end_ms.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.get_all_data_inputs(param_access_token, param_group_id, param_start_ms, param_end_ms, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAllDataInputsResponse::ListOfDataInputs

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ALL_DATA_INPUTS_LIST_OF_DATA_INPUTS.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetAllDataInputsResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ALL_DATA_INPUTS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetDataInput - GET /industrial/data/{data_input_id}
            &hyper::Method::Get if path.matched(paths::ID_INDUSTRIAL_DATA_DATA_INPUT_ID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_INDUSTRIAL_DATA_DATA_INPUT_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE INDUSTRIAL_DATA_DATA_INPUT_ID in set but failed match against \"{}\"", path, paths::REGEX_INDUSTRIAL_DATA_DATA_INPUT_ID.as_str())
                    );

                let param_data_input_id = match percent_encoding::percent_decode(path_params["data_input_id"].as_bytes()).decode_utf8() {
                    Ok(param_data_input_id) => match param_data_input_id.parse::<i64>() {
                        Ok(param_data_input_id) => param_data_input_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter data_input_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["data_input_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_start_ms = query_params.iter().filter(|e| e.0 == "startMs").map(|e| e.1.to_owned())

                    .nth(0);

                let param_start_ms = param_start_ms.and_then(|param_start_ms| param_start_ms.parse::<>().ok());
                let param_end_ms = query_params.iter().filter(|e| e.0 == "endMs").map(|e| e.1.to_owned())

                    .nth(0);

                let param_end_ms = param_end_ms.and_then(|param_end_ms| param_end_ms.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.get_data_input(param_access_token, param_data_input_id, param_start_ms, param_end_ms, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetDataInputResponse::ReturnsDatapointsForTheGivenDataInput

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DATA_INPUT_RETURNS_DATAPOINTS_FOR_THE_GIVEN_DATA_INPUT.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetDataInputResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DATA_INPUT_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetMachines - POST /machines/list
            &hyper::Method::Post if path.matched(paths::ID_MACHINES_LIST) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_group_param: Option<models::InlineObject18> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_group_param) => param_group_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter groupParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_group_param = match param_group_param {
                                    Some(param_group_param) => param_group_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter groupParam"))),
                                };


                                Box::new(api_impl.get_machines(param_access_token, param_group_param, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetMachinesResponse::ListOfMachineObjects

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_MACHINES_LIST_OF_MACHINE_OBJECTS.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetMachinesResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_MACHINES_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter groupParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // GetMachinesHistory - POST /machines/history
            &hyper::Method::Post if path.matched(paths::ID_MACHINES_HISTORY) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_history_param: Option<models::InlineObject17> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_history_param) => param_history_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter historyParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_history_param = match param_history_param {
                                    Some(param_history_param) => param_history_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter historyParam"))),
                                };


                                Box::new(api_impl.get_machines_history(param_access_token, param_history_param, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetMachinesHistoryResponse::ListOfMachineResultsObjects

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_MACHINES_HISTORY_LIST_OF_MACHINE_RESULTS_OBJECTS.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetMachinesHistoryResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_MACHINES_HISTORY_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter historyParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // CreateDispatchRoute - POST /fleet/dispatch/routes
            &hyper::Method::Post if path.matched(paths::ID_FLEET_DISPATCH_ROUTES) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_create_dispatch_route_params: Option<models::DispatchRouteCreate> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_dispatch_route_params) => param_create_dispatch_route_params,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter createDispatchRouteParams - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_create_dispatch_route_params = match param_create_dispatch_route_params {
                                    Some(param_create_dispatch_route_params) => param_create_dispatch_route_params,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter createDispatchRouteParams"))),
                                };


                                Box::new(api_impl.create_dispatch_route(param_access_token, param_create_dispatch_route_params, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateDispatchRouteResponse::CreatedRouteObjectIncludingTheNewRouteID

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::CREATE_DISPATCH_ROUTE_CREATED_ROUTE_OBJECT_INCLUDING_THE_NEW_ROUTE_ID.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                CreateDispatchRouteResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::CREATE_DISPATCH_ROUTE_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter createDispatchRouteParams: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // CreateDriverDispatchRoute - POST /fleet/drivers/{driver_id}/dispatch/routes
            &hyper::Method::Post if path.matched(paths::ID_FLEET_DRIVERS_DRIVER_ID_DISPATCH_ROUTES) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_DRIVERS_DRIVER_ID_DISPATCH_ROUTES
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_DRIVERS_DRIVER_ID_DISPATCH_ROUTES in set but failed match against \"{}\"", path, paths::REGEX_FLEET_DRIVERS_DRIVER_ID_DISPATCH_ROUTES.as_str())
                    );

                let param_driver_id = match percent_encoding::percent_decode(path_params["driver_id"].as_bytes()).decode_utf8() {
                    Ok(param_driver_id) => match param_driver_id.parse::<i64>() {
                        Ok(param_driver_id) => param_driver_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter driver_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["driver_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_create_dispatch_route_params: Option<models::DispatchRouteCreate> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_dispatch_route_params) => param_create_dispatch_route_params,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter createDispatchRouteParams - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_create_dispatch_route_params = match param_create_dispatch_route_params {
                                    Some(param_create_dispatch_route_params) => param_create_dispatch_route_params,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter createDispatchRouteParams"))),
                                };


                                Box::new(api_impl.create_driver_dispatch_route(param_access_token, param_driver_id, param_create_dispatch_route_params, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateDriverDispatchRouteResponse::CreatedRouteObjectIncludingTheNewRouteID

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::CREATE_DRIVER_DISPATCH_ROUTE_CREATED_ROUTE_OBJECT_INCLUDING_THE_NEW_ROUTE_ID.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                CreateDriverDispatchRouteResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::CREATE_DRIVER_DISPATCH_ROUTE_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter createDispatchRouteParams: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // CreateVehicleDispatchRoute - POST /fleet/vehicles/{vehicle_id}/dispatch/routes
            &hyper::Method::Post if path.matched(paths::ID_FLEET_VEHICLES_VEHICLE_ID_DISPATCH_ROUTES) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_VEHICLES_VEHICLE_ID_DISPATCH_ROUTES
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_VEHICLES_VEHICLE_ID_DISPATCH_ROUTES in set but failed match against \"{}\"", path, paths::REGEX_FLEET_VEHICLES_VEHICLE_ID_DISPATCH_ROUTES.as_str())
                    );

                let param_vehicle_id = match percent_encoding::percent_decode(path_params["vehicle_id"].as_bytes()).decode_utf8() {
                    Ok(param_vehicle_id) => match param_vehicle_id.parse::<i64>() {
                        Ok(param_vehicle_id) => param_vehicle_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter vehicle_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["vehicle_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_create_dispatch_route_params: Option<models::DispatchRouteCreate> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_dispatch_route_params) => param_create_dispatch_route_params,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter createDispatchRouteParams - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_create_dispatch_route_params = match param_create_dispatch_route_params {
                                    Some(param_create_dispatch_route_params) => param_create_dispatch_route_params,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter createDispatchRouteParams"))),
                                };


                                Box::new(api_impl.create_vehicle_dispatch_route(param_access_token, param_vehicle_id, param_create_dispatch_route_params, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateVehicleDispatchRouteResponse::CreatedRouteObjectIncludingTheNewRouteID

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::CREATE_VEHICLE_DISPATCH_ROUTE_CREATED_ROUTE_OBJECT_INCLUDING_THE_NEW_ROUTE_ID.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                CreateVehicleDispatchRouteResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::CREATE_VEHICLE_DISPATCH_ROUTE_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter createDispatchRouteParams: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // DeleteDispatchRouteById - DELETE /fleet/dispatch/routes/{route_id}
            &hyper::Method::Delete if path.matched(paths::ID_FLEET_DISPATCH_ROUTES_ROUTE_ID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_DISPATCH_ROUTES_ROUTE_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_DISPATCH_ROUTES_ROUTE_ID in set but failed match against \"{}\"", path, paths::REGEX_FLEET_DISPATCH_ROUTES_ROUTE_ID.as_str())
                    );

                let param_route_id = match percent_encoding::percent_decode(path_params["route_id"].as_bytes()).decode_utf8() {
                    Ok(param_route_id) => match param_route_id.parse::<i64>() {
                        Ok(param_route_id) => param_route_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter route_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["route_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.delete_dispatch_route_by_id(param_access_token, param_route_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteDispatchRouteByIdResponse::SuccessfullyDeletedTheDispatchRoute


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                },
                                                DeleteDispatchRouteByIdResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::DELETE_DISPATCH_ROUTE_BY_ID_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // FetchAllDispatchRoutes - GET /fleet/dispatch/routes
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DISPATCH_ROUTES) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_group_id = query_params.iter().filter(|e| e.0 == "group_id").map(|e| e.1.to_owned())

                    .nth(0);

                let param_group_id = param_group_id.and_then(|param_group_id| param_group_id.parse::<>().ok());
                let param_end_time = query_params.iter().filter(|e| e.0 == "end_time").map(|e| e.1.to_owned())

                    .nth(0);

                let param_end_time = param_end_time.and_then(|param_end_time| param_end_time.parse::<>().ok());
                let param_duration = query_params.iter().filter(|e| e.0 == "duration").map(|e| e.1.to_owned())

                    .nth(0);

                let param_duration = param_duration.and_then(|param_duration| param_duration.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.fetch_all_dispatch_routes(param_access_token, param_group_id, param_end_time, param_duration, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                FetchAllDispatchRoutesResponse::AllDispatchRouteObjectsForTheGroup

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::FETCH_ALL_DISPATCH_ROUTES_ALL_DISPATCH_ROUTE_OBJECTS_FOR_THE_GROUP.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                FetchAllDispatchRoutesResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::FETCH_ALL_DISPATCH_ROUTES_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // FetchAllRouteJobUpdates - GET /fleet/dispatch/routes/job_updates
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DISPATCH_ROUTES_JOB_UPDATES) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_group_id = query_params.iter().filter(|e| e.0 == "group_id").map(|e| e.1.to_owned())

                    .nth(0);

                let param_group_id = param_group_id.and_then(|param_group_id| param_group_id.parse::<>().ok());
                let param_sequence_id = query_params.iter().filter(|e| e.0 == "sequence_id").map(|e| e.1.to_owned())

                    .nth(0);

                let param_sequence_id = param_sequence_id.and_then(|param_sequence_id| param_sequence_id.parse::<>().ok());
                let param_include = query_params.iter().filter(|e| e.0 == "include").map(|e| e.1.to_owned())

                    .nth(0);

                let param_include = param_include.and_then(|param_include| param_include.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.fetch_all_route_job_updates(param_access_token, param_group_id, param_sequence_id, param_include, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                FetchAllRouteJobUpdatesResponse::AllJobUpdatesOnRoutes

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::FETCH_ALL_ROUTE_JOB_UPDATES_ALL_JOB_UPDATES_ON_ROUTES.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                FetchAllRouteJobUpdatesResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::FETCH_ALL_ROUTE_JOB_UPDATES_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetDispatchRouteById - GET /fleet/dispatch/routes/{route_id}
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DISPATCH_ROUTES_ROUTE_ID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_DISPATCH_ROUTES_ROUTE_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_DISPATCH_ROUTES_ROUTE_ID in set but failed match against \"{}\"", path, paths::REGEX_FLEET_DISPATCH_ROUTES_ROUTE_ID.as_str())
                    );

                let param_route_id = match percent_encoding::percent_decode(path_params["route_id"].as_bytes()).decode_utf8() {
                    Ok(param_route_id) => match param_route_id.parse::<i64>() {
                        Ok(param_route_id) => param_route_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter route_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["route_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_dispatch_route_by_id(param_access_token, param_route_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetDispatchRouteByIdResponse::TheDispatchRouteCorrespondingToRoute

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DISPATCH_ROUTE_BY_ID_THE_DISPATCH_ROUTE_CORRESPONDING_TO_ROUTE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetDispatchRouteByIdResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DISPATCH_ROUTE_BY_ID_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetDispatchRouteHistory - GET /fleet/dispatch/routes/{route_id}/history
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DISPATCH_ROUTES_ROUTE_ID_HISTORY) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_DISPATCH_ROUTES_ROUTE_ID_HISTORY
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_DISPATCH_ROUTES_ROUTE_ID_HISTORY in set but failed match against \"{}\"", path, paths::REGEX_FLEET_DISPATCH_ROUTES_ROUTE_ID_HISTORY.as_str())
                    );

                let param_route_id = match percent_encoding::percent_decode(path_params["route_id"].as_bytes()).decode_utf8() {
                    Ok(param_route_id) => match param_route_id.parse::<i64>() {
                        Ok(param_route_id) => param_route_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter route_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["route_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_start_time = query_params.iter().filter(|e| e.0 == "start_time").map(|e| e.1.to_owned())

                    .nth(0);

                let param_start_time = param_start_time.and_then(|param_start_time| param_start_time.parse::<>().ok());
                let param_end_time = query_params.iter().filter(|e| e.0 == "end_time").map(|e| e.1.to_owned())

                    .nth(0);

                let param_end_time = param_end_time.and_then(|param_end_time| param_end_time.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.get_dispatch_route_history(param_access_token, param_route_id, param_start_time, param_end_time, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetDispatchRouteHistoryResponse::TheHistoricalRouteStateChangesBetweenStart

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DISPATCH_ROUTE_HISTORY_THE_HISTORICAL_ROUTE_STATE_CHANGES_BETWEEN_START.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetDispatchRouteHistoryResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DISPATCH_ROUTE_HISTORY_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetDispatchRoutesByDriverId - GET /fleet/drivers/{driver_id}/dispatch/routes
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DRIVERS_DRIVER_ID_DISPATCH_ROUTES) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_DRIVERS_DRIVER_ID_DISPATCH_ROUTES
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_DRIVERS_DRIVER_ID_DISPATCH_ROUTES in set but failed match against \"{}\"", path, paths::REGEX_FLEET_DRIVERS_DRIVER_ID_DISPATCH_ROUTES.as_str())
                    );

                let param_driver_id = match percent_encoding::percent_decode(path_params["driver_id"].as_bytes()).decode_utf8() {
                    Ok(param_driver_id) => match param_driver_id.parse::<i64>() {
                        Ok(param_driver_id) => param_driver_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter driver_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["driver_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_end_time = query_params.iter().filter(|e| e.0 == "end_time").map(|e| e.1.to_owned())

                    .nth(0);

                let param_end_time = param_end_time.and_then(|param_end_time| param_end_time.parse::<>().ok());
                let param_duration = query_params.iter().filter(|e| e.0 == "duration").map(|e| e.1.to_owned())

                    .nth(0);

                let param_duration = param_duration.and_then(|param_duration| param_duration.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.get_dispatch_routes_by_driver_id(param_access_token, param_driver_id, param_end_time, param_duration, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetDispatchRoutesByDriverIdResponse::ReturnsTheDispatchRoutesForTheGivenDriver

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DISPATCH_ROUTES_BY_DRIVER_ID_RETURNS_THE_DISPATCH_ROUTES_FOR_THE_GIVEN_DRIVER.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetDispatchRoutesByDriverIdResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DISPATCH_ROUTES_BY_DRIVER_ID_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetDispatchRoutesByVehicleId - GET /fleet/vehicles/{vehicle_id}/dispatch/routes
            &hyper::Method::Get if path.matched(paths::ID_FLEET_VEHICLES_VEHICLE_ID_DISPATCH_ROUTES) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_VEHICLES_VEHICLE_ID_DISPATCH_ROUTES
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_VEHICLES_VEHICLE_ID_DISPATCH_ROUTES in set but failed match against \"{}\"", path, paths::REGEX_FLEET_VEHICLES_VEHICLE_ID_DISPATCH_ROUTES.as_str())
                    );

                let param_vehicle_id = match percent_encoding::percent_decode(path_params["vehicle_id"].as_bytes()).decode_utf8() {
                    Ok(param_vehicle_id) => match param_vehicle_id.parse::<i64>() {
                        Ok(param_vehicle_id) => param_vehicle_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter vehicle_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["vehicle_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_end_time = query_params.iter().filter(|e| e.0 == "end_time").map(|e| e.1.to_owned())

                    .nth(0);

                let param_end_time = param_end_time.and_then(|param_end_time| param_end_time.parse::<>().ok());
                let param_duration = query_params.iter().filter(|e| e.0 == "duration").map(|e| e.1.to_owned())

                    .nth(0);

                let param_duration = param_duration.and_then(|param_duration| param_duration.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.get_dispatch_routes_by_vehicle_id(param_access_token, param_vehicle_id, param_end_time, param_duration, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetDispatchRoutesByVehicleIdResponse::ReturnsAllOfTheDispatchRoutesForTheGivenVehicle

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DISPATCH_ROUTES_BY_VEHICLE_ID_RETURNS_ALL_OF_THE_DISPATCH_ROUTES_FOR_THE_GIVEN_VEHICLE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetDispatchRoutesByVehicleIdResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DISPATCH_ROUTES_BY_VEHICLE_ID_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // UpdateDispatchRouteById - PUT /fleet/dispatch/routes/{route_id}
            &hyper::Method::Put if path.matched(paths::ID_FLEET_DISPATCH_ROUTES_ROUTE_ID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_DISPATCH_ROUTES_ROUTE_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_DISPATCH_ROUTES_ROUTE_ID in set but failed match against \"{}\"", path, paths::REGEX_FLEET_DISPATCH_ROUTES_ROUTE_ID.as_str())
                    );

                let param_route_id = match percent_encoding::percent_decode(path_params["route_id"].as_bytes()).decode_utf8() {
                    Ok(param_route_id) => match param_route_id.parse::<i64>() {
                        Ok(param_route_id) => param_route_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter route_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["route_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_update_dispatch_route_params: Option<models::DispatchRoute> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_update_dispatch_route_params) => param_update_dispatch_route_params,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter updateDispatchRouteParams - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_update_dispatch_route_params = match param_update_dispatch_route_params {
                                    Some(param_update_dispatch_route_params) => param_update_dispatch_route_params,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter updateDispatchRouteParams"))),
                                };


                                Box::new(api_impl.update_dispatch_route_by_id(param_access_token, param_route_id, param_update_dispatch_route_params, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UpdateDispatchRouteByIdResponse::UpdateTheDispatchRoute

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::UPDATE_DISPATCH_ROUTE_BY_ID_UPDATE_THE_DISPATCH_ROUTE.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                UpdateDispatchRouteByIdResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::UPDATE_DISPATCH_ROUTE_BY_ID_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter updateDispatchRouteParams: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // GetDriverSafetyScore - GET /fleet/drivers/{driverId}/safety/score
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DRIVERS_DRIVERID_SAFETY_SCORE) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_DRIVERS_DRIVERID_SAFETY_SCORE
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_DRIVERS_DRIVERID_SAFETY_SCORE in set but failed match against \"{}\"", path, paths::REGEX_FLEET_DRIVERS_DRIVERID_SAFETY_SCORE.as_str())
                    );

                let param_driver_id = match percent_encoding::percent_decode(path_params["driverId"].as_bytes()).decode_utf8() {
                    Ok(param_driver_id) => match param_driver_id.parse::<i64>() {
                        Ok(param_driver_id) => param_driver_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter driverId: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["driverId"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_start_ms = query_params.iter().filter(|e| e.0 == "startMs").map(|e| e.1.to_owned())

                    .nth(0);
                let param_start_ms = match param_start_ms {
                    Some(param_start_ms) => match param_start_ms.parse::<i64>() {
                        Ok(param_start_ms) => param_start_ms,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter startMs - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter startMs"))),
                };
                let param_end_ms = query_params.iter().filter(|e| e.0 == "endMs").map(|e| e.1.to_owned())

                    .nth(0);
                let param_end_ms = match param_end_ms {
                    Some(param_end_ms) => match param_end_ms.parse::<i64>() {
                        Ok(param_end_ms) => param_end_ms,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter endMs - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter endMs"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_driver_safety_score(param_driver_id, param_access_token, param_start_ms, param_end_ms, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetDriverSafetyScoreResponse::SafetyScoreDetails

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DRIVER_SAFETY_SCORE_SAFETY_SCORE_DETAILS.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetDriverSafetyScoreResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_DRIVER_SAFETY_SCORE_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetVehicleHarshEvent - GET /fleet/vehicles/{vehicleId}/safety/harsh_event
            &hyper::Method::Get if path.matched(paths::ID_FLEET_VEHICLES_VEHICLEID_SAFETY_HARSH_EVENT) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_VEHICLES_VEHICLEID_SAFETY_HARSH_EVENT
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_VEHICLES_VEHICLEID_SAFETY_HARSH_EVENT in set but failed match against \"{}\"", path, paths::REGEX_FLEET_VEHICLES_VEHICLEID_SAFETY_HARSH_EVENT.as_str())
                    );

                let param_vehicle_id = match percent_encoding::percent_decode(path_params["vehicleId"].as_bytes()).decode_utf8() {
                    Ok(param_vehicle_id) => match param_vehicle_id.parse::<i64>() {
                        Ok(param_vehicle_id) => param_vehicle_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter vehicleId: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["vehicleId"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_timestamp = query_params.iter().filter(|e| e.0 == "timestamp").map(|e| e.1.to_owned())

                    .nth(0);
                let param_timestamp = match param_timestamp {
                    Some(param_timestamp) => match param_timestamp.parse::<i64>() {
                        Ok(param_timestamp) => param_timestamp,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter timestamp - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter timestamp"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_vehicle_harsh_event(param_vehicle_id, param_access_token, param_timestamp, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetVehicleHarshEventResponse::HarshEventDetails

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_VEHICLE_HARSH_EVENT_HARSH_EVENT_DETAILS.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetVehicleHarshEventResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_VEHICLE_HARSH_EVENT_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetVehicleSafetyScore - GET /fleet/vehicles/{vehicleId}/safety/score
            &hyper::Method::Get if path.matched(paths::ID_FLEET_VEHICLES_VEHICLEID_SAFETY_SCORE) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_FLEET_VEHICLES_VEHICLEID_SAFETY_SCORE
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FLEET_VEHICLES_VEHICLEID_SAFETY_SCORE in set but failed match against \"{}\"", path, paths::REGEX_FLEET_VEHICLES_VEHICLEID_SAFETY_SCORE.as_str())
                    );

                let param_vehicle_id = match percent_encoding::percent_decode(path_params["vehicleId"].as_bytes()).decode_utf8() {
                    Ok(param_vehicle_id) => match param_vehicle_id.parse::<i64>() {
                        Ok(param_vehicle_id) => param_vehicle_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter vehicleId: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["vehicleId"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_start_ms = query_params.iter().filter(|e| e.0 == "startMs").map(|e| e.1.to_owned())

                    .nth(0);
                let param_start_ms = match param_start_ms {
                    Some(param_start_ms) => match param_start_ms.parse::<i64>() {
                        Ok(param_start_ms) => param_start_ms,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter startMs - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter startMs"))),
                };
                let param_end_ms = query_params.iter().filter(|e| e.0 == "endMs").map(|e| e.1.to_owned())

                    .nth(0);
                let param_end_ms = match param_end_ms {
                    Some(param_end_ms) => match param_end_ms.parse::<i64>() {
                        Ok(param_end_ms) => param_end_ms,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter endMs - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter endMs"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_vehicle_safety_score(param_vehicle_id, param_access_token, param_start_ms, param_end_ms, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetVehicleSafetyScoreResponse::SafetyScoreDetails

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_VEHICLE_SAFETY_SCORE_SAFETY_SCORE_DETAILS.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetVehicleSafetyScoreResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_VEHICLE_SAFETY_SCORE_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetSensors - POST /sensors/list
            &hyper::Method::Post if path.matched(paths::ID_SENSORS_LIST) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_group_param: Option<models::InlineObject23> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_group_param) => param_group_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter groupParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_group_param = match param_group_param {
                                    Some(param_group_param) => param_group_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter groupParam"))),
                                };


                                Box::new(api_impl.get_sensors(param_access_token, param_group_param, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetSensorsResponse::ListOfSensorObjects

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_SENSORS_LIST_OF_SENSOR_OBJECTS.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetSensorsResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_SENSORS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter groupParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // GetSensorsCargo - POST /sensors/cargo
            &hyper::Method::Post if path.matched(paths::ID_SENSORS_CARGO) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_sensor_param: Option<models::InlineObject19> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_sensor_param) => param_sensor_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter sensorParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_sensor_param = match param_sensor_param {
                                    Some(param_sensor_param) => param_sensor_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter sensorParam"))),
                                };


                                Box::new(api_impl.get_sensors_cargo(param_access_token, param_sensor_param, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetSensorsCargoResponse::ListOfSensorObjectsContainingTheCurrentCargoStatusReportedByEachSensor

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_SENSORS_CARGO_LIST_OF_SENSOR_OBJECTS_CONTAINING_THE_CURRENT_CARGO_STATUS_REPORTED_BY_EACH_SENSOR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetSensorsCargoResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_SENSORS_CARGO_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter sensorParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // GetSensorsDoor - POST /sensors/door
            &hyper::Method::Post if path.matched(paths::ID_SENSORS_DOOR) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_sensor_param: Option<models::InlineObject20> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_sensor_param) => param_sensor_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter sensorParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_sensor_param = match param_sensor_param {
                                    Some(param_sensor_param) => param_sensor_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter sensorParam"))),
                                };


                                Box::new(api_impl.get_sensors_door(param_access_token, param_sensor_param, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetSensorsDoorResponse::ListOfSensorObjectsContainingTheCurrentDoorStatusReportedByEachSensor

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_SENSORS_DOOR_LIST_OF_SENSOR_OBJECTS_CONTAINING_THE_CURRENT_DOOR_STATUS_REPORTED_BY_EACH_SENSOR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetSensorsDoorResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_SENSORS_DOOR_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter sensorParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // GetSensorsHistory - POST /sensors/history
            &hyper::Method::Post if path.matched(paths::ID_SENSORS_HISTORY) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_history_param: Option<models::InlineObject21> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_history_param) => param_history_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter historyParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_history_param = match param_history_param {
                                    Some(param_history_param) => param_history_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter historyParam"))),
                                };


                                Box::new(api_impl.get_sensors_history(param_access_token, param_history_param, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetSensorsHistoryResponse::ListOfResultsObjects

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_SENSORS_HISTORY_LIST_OF_RESULTS_OBJECTS.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetSensorsHistoryResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_SENSORS_HISTORY_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter historyParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // GetSensorsHumidity - POST /sensors/humidity
            &hyper::Method::Post if path.matched(paths::ID_SENSORS_HUMIDITY) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_sensor_param: Option<models::InlineObject22> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_sensor_param) => param_sensor_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter sensorParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_sensor_param = match param_sensor_param {
                                    Some(param_sensor_param) => param_sensor_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter sensorParam"))),
                                };


                                Box::new(api_impl.get_sensors_humidity(param_access_token, param_sensor_param, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetSensorsHumidityResponse::ListOfSensorObjectsContainingTheCurrentHumidityReportedByEachSensor

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_SENSORS_HUMIDITY_LIST_OF_SENSOR_OBJECTS_CONTAINING_THE_CURRENT_HUMIDITY_REPORTED_BY_EACH_SENSOR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetSensorsHumidityResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_SENSORS_HUMIDITY_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter sensorParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // GetSensorsTemperature - POST /sensors/temperature
            &hyper::Method::Post if path.matched(paths::ID_SENSORS_TEMPERATURE) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_sensor_param: Option<models::InlineObject24> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_sensor_param) => param_sensor_param,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter sensorParam - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_sensor_param = match param_sensor_param {
                                    Some(param_sensor_param) => param_sensor_param,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter sensorParam"))),
                                };


                                Box::new(api_impl.get_sensors_temperature(param_access_token, param_sensor_param, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetSensorsTemperatureResponse::ListOfSensorObjectsContainingTheCurrentTemperatureReportedByEachSensor

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_SENSORS_TEMPERATURE_LIST_OF_SENSOR_OBJECTS_CONTAINING_THE_CURRENT_TEMPERATURE_REPORTED_BY_EACH_SENSOR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetSensorsTemperatureResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_SENSORS_TEMPERATURE_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter sensorParam: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // CreateTag - POST /tags
            &hyper::Method::Post if path.matched(paths::ID_TAGS) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_tag_create_params: Option<models::TagCreate> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_tag_create_params) => param_tag_create_params,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter tagCreateParams - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_tag_create_params = match param_tag_create_params {
                                    Some(param_tag_create_params) => param_tag_create_params,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter tagCreateParams"))),
                                };


                                Box::new(api_impl.create_tag(param_access_token, param_tag_create_params, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateTagResponse::NewlyCreatedTagObject

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::CREATE_TAG_NEWLY_CREATED_TAG_OBJECT.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                CreateTagResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::CREATE_TAG_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter tagCreateParams: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // DeleteTagById - DELETE /tags/{tag_id}
            &hyper::Method::Delete if path.matched(paths::ID_TAGS_TAG_ID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_TAGS_TAG_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE TAGS_TAG_ID in set but failed match against \"{}\"", path, paths::REGEX_TAGS_TAG_ID.as_str())
                    );

                let param_tag_id = match percent_encoding::percent_decode(path_params["tag_id"].as_bytes()).decode_utf8() {
                    Ok(param_tag_id) => match param_tag_id.parse::<i64>() {
                        Ok(param_tag_id) => param_tag_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter tag_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["tag_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.delete_tag_by_id(param_access_token, param_tag_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteTagByIdResponse::SuccessfullyDeletedTheTag


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                },
                                                DeleteTagByIdResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::DELETE_TAG_BY_ID_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetAllTags - GET /tags
            &hyper::Method::Get if path.matched(paths::ID_TAGS) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };
                let param_group_id = query_params.iter().filter(|e| e.0 == "group_id").map(|e| e.1.to_owned())

                    .nth(0);

                let param_group_id = param_group_id.and_then(|param_group_id| param_group_id.parse::<>().ok());



                Box::new({
                        {{

                                Box::new(api_impl.get_all_tags(param_access_token, param_group_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAllTagsResponse::ListOfTags

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ALL_TAGS_LIST_OF_TAGS.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetAllTagsResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ALL_TAGS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetTagById - GET /tags/{tag_id}
            &hyper::Method::Get if path.matched(paths::ID_TAGS_TAG_ID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_TAGS_TAG_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE TAGS_TAG_ID in set but failed match against \"{}\"", path, paths::REGEX_TAGS_TAG_ID.as_str())
                    );

                let param_tag_id = match percent_encoding::percent_decode(path_params["tag_id"].as_bytes()).decode_utf8() {
                    Ok(param_tag_id) => match param_tag_id.parse::<i64>() {
                        Ok(param_tag_id) => param_tag_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter tag_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["tag_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_tag_by_id(param_access_token, param_tag_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetTagByIdResponse::TheTagCorrespondingToTag

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_TAG_BY_ID_THE_TAG_CORRESPONDING_TO_TAG.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetTagByIdResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_TAG_BY_ID_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // ModifyTagById - PATCH /tags/{tag_id}
            &hyper::Method::Patch if path.matched(paths::ID_TAGS_TAG_ID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_TAGS_TAG_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE TAGS_TAG_ID in set but failed match against \"{}\"", path, paths::REGEX_TAGS_TAG_ID.as_str())
                    );

                let param_tag_id = match percent_encoding::percent_decode(path_params["tag_id"].as_bytes()).decode_utf8() {
                    Ok(param_tag_id) => match param_tag_id.parse::<i64>() {
                        Ok(param_tag_id) => param_tag_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter tag_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["tag_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_tag_modify_params: Option<models::TagModify> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_tag_modify_params) => param_tag_modify_params,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter tagModifyParams - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_tag_modify_params = match param_tag_modify_params {
                                    Some(param_tag_modify_params) => param_tag_modify_params,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter tagModifyParams"))),
                                };


                                Box::new(api_impl.modify_tag_by_id(param_access_token, param_tag_id, param_tag_modify_params, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ModifyTagByIdResponse::TheUpdatedTagData

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::MODIFY_TAG_BY_ID_THE_UPDATED_TAG_DATA.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                ModifyTagByIdResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::MODIFY_TAG_BY_ID_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter tagModifyParams: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // UpdateTagById - PUT /tags/{tag_id}
            &hyper::Method::Put if path.matched(paths::ID_TAGS_TAG_ID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_TAGS_TAG_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE TAGS_TAG_ID in set but failed match against \"{}\"", path, paths::REGEX_TAGS_TAG_ID.as_str())
                    );

                let param_tag_id = match percent_encoding::percent_decode(path_params["tag_id"].as_bytes()).decode_utf8() {
                    Ok(param_tag_id) => match param_tag_id.parse::<i64>() {
                        Ok(param_tag_id) => param_tag_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter tag_id: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["tag_id"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };


                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {

                                let mut unused_elements = Vec::new();
                                let param_update_tag_params: Option<models::TagUpdate> = if !body.is_empty() {

                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);

                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_update_tag_params) => param_update_tag_params,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter updateTagParams - doesn't match schema: {}", e)))),
                                    }

                                } else {
                                    None
                                };
                                let param_update_tag_params = match param_update_tag_params {
                                    Some(param_update_tag_params) => param_update_tag_params,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter updateTagParams"))),
                                };


                                Box::new(api_impl.update_tag_by_id(param_access_token, param_tag_id, param_update_tag_params, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UpdateTagByIdResponse::TheUpdatedTagData

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::UPDATE_TAG_BY_ID_THE_UPDATED_TAG_DATA.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                UpdateTagByIdResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::UPDATE_TAG_BY_ID_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))


                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter updateTagParams: {}", e)))),
                        }
                    })
                ) as Box<Future<Item=Response, Error=Error>>

            },


            // DeleteUserById - DELETE /users/{userId}
            &hyper::Method::Delete if path.matched(paths::ID_USERS_USERID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_USERS_USERID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE USERS_USERID in set but failed match against \"{}\"", path, paths::REGEX_USERS_USERID.as_str())
                    );

                let param_user_id = match percent_encoding::percent_decode(path_params["userId"].as_bytes()).decode_utf8() {
                    Ok(param_user_id) => match param_user_id.parse::<i64>() {
                        Ok(param_user_id) => param_user_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter userId: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["userId"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.delete_user_by_id(param_access_token, param_user_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteUserByIdResponse::TheUserWasSuccessfullyRemoved


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                },
                                                DeleteUserByIdResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::DELETE_USER_BY_ID_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetUserById - GET /users/{userId}
            &hyper::Method::Get if path.matched(paths::ID_USERS_USERID) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_USERS_USERID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE USERS_USERID in set but failed match against \"{}\"", path, paths::REGEX_USERS_USERID.as_str())
                    );

                let param_user_id = match percent_encoding::percent_decode(path_params["userId"].as_bytes()).decode_utf8() {
                    Ok(param_user_id) => match param_user_id.parse::<i64>() {
                        Ok(param_user_id) => param_user_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter userId: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["userId"]))))
                };



                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.get_user_by_id(param_access_token, param_user_id, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetUserByIdResponse::UserRecord

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_USER_BY_ID_USER_RECORD.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetUserByIdResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_USER_BY_ID_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // ListUserRoles - GET /user_roles
            &hyper::Method::Get if path.matched(paths::ID_USER_ROLES) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.list_user_roles(param_access_token, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListUserRolesResponse::ListOfUserRoles

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::LIST_USER_ROLES_LIST_OF_USER_ROLES.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                ListUserRolesResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::LIST_USER_ROLES_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // ListUsers - GET /users
            &hyper::Method::Get if path.matched(paths::ID_USERS) => {





                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_access_token = query_params.iter().filter(|e| e.0 == "access_token").map(|e| e.1.to_owned())

                    .nth(0);
                let param_access_token = match param_access_token {
                    Some(param_access_token) => match param_access_token.parse::<String>() {
                        Ok(param_access_token) => param_access_token,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter access_token - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter access_token"))),
                };



                Box::new({
                        {{

                                Box::new(api_impl.list_users(param_access_token, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListUsersResponse::ListOfUsers

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::LIST_USERS_LIST_OF_USERS.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                ListUsersResponse::UnexpectedError

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::LIST_USERS_UNEXPECTED_ERROR.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            _ => Box::new(future::ok(Response::new().with_status(StatusCode::NotFound))) as Box<Future<Item=Response, Error=Error>>,
        }
    }
}

impl<T, C> Clone for Service<T, C>
{
    fn clone(&self) -> Self {
        Service {
            api_impl: self.api_impl.clone(),
            marker: self.marker.clone(),
        }
    }
}

/// Request parser for `Api`.
pub struct ApiRequestParser;
impl RequestParser for ApiRequestParser {
    fn parse_operation_id(request: &Request) -> Result<&'static str, ()> {
        let path = paths::GLOBAL_REGEX_SET.matches(request.uri().path());
        match request.method() {

            // GetAllAssetCurrentLocations - GET /fleet/assets/locations
            &hyper::Method::Get if path.matched(paths::ID_FLEET_ASSETS_LOCATIONS) => Ok("GetAllAssetCurrentLocations"),

            // GetAllAssets - GET /fleet/assets
            &hyper::Method::Get if path.matched(paths::ID_FLEET_ASSETS) => Ok("GetAllAssets"),

            // GetAssetLocation - GET /fleet/assets/{asset_id}/locations
            &hyper::Method::Get if path.matched(paths::ID_FLEET_ASSETS_ASSET_ID_LOCATIONS) => Ok("GetAssetLocation"),

            // GetAssetReefer - GET /fleet/assets/{asset_id}/reefer
            &hyper::Method::Get if path.matched(paths::ID_FLEET_ASSETS_ASSET_ID_REEFER) => Ok("GetAssetReefer"),

            // CreateDriver - POST /fleet/drivers/create
            &hyper::Method::Post if path.matched(paths::ID_FLEET_DRIVERS_CREATE) => Ok("CreateDriver"),

            // DeactivateDriver - DELETE /fleet/drivers/{driver_id_or_external_id}
            &hyper::Method::Delete if path.matched(paths::ID_FLEET_DRIVERS_DRIVER_ID_OR_EXTERNAL_ID) => Ok("DeactivateDriver"),

            // GetAllDeactivatedDrivers - GET /fleet/drivers/inactive
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DRIVERS_INACTIVE) => Ok("GetAllDeactivatedDrivers"),

            // GetDeactivatedDriverById - GET /fleet/drivers/inactive/{driver_id_or_external_id}
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DRIVERS_INACTIVE_DRIVER_ID_OR_EXTERNAL_ID) => Ok("GetDeactivatedDriverById"),

            // GetDriverById - GET /fleet/drivers/{driver_id_or_external_id}
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DRIVERS_DRIVER_ID_OR_EXTERNAL_ID) => Ok("GetDriverById"),

            // ReactivateDriverById - PUT /fleet/drivers/inactive/{driver_id_or_external_id}
            &hyper::Method::Put if path.matched(paths::ID_FLEET_DRIVERS_INACTIVE_DRIVER_ID_OR_EXTERNAL_ID) => Ok("ReactivateDriverById"),

            // AddFleetAddress - POST /fleet/add_address
            &hyper::Method::Post if path.matched(paths::ID_FLEET_ADD_ADDRESS) => Ok("AddFleetAddress"),

            // AddOrganizationAddresses - POST /addresses
            &hyper::Method::Post if path.matched(paths::ID_ADDRESSES) => Ok("AddOrganizationAddresses"),

            // CreateDispatchRoute - POST /fleet/dispatch/routes
            &hyper::Method::Post if path.matched(paths::ID_FLEET_DISPATCH_ROUTES) => Ok("CreateDispatchRoute"),

            // CreateDriver - POST /fleet/drivers/create
            &hyper::Method::Post if path.matched(paths::ID_FLEET_DRIVERS_CREATE) => Ok("CreateDriver"),

            // CreateDriverDispatchRoute - POST /fleet/drivers/{driver_id}/dispatch/routes
            &hyper::Method::Post if path.matched(paths::ID_FLEET_DRIVERS_DRIVER_ID_DISPATCH_ROUTES) => Ok("CreateDriverDispatchRoute"),

            // CreateDriverDocument - POST /fleet/drivers/{driver_id}/documents
            &hyper::Method::Post if path.matched(paths::ID_FLEET_DRIVERS_DRIVER_ID_DOCUMENTS) => Ok("CreateDriverDocument"),

            // CreateDvir - POST /fleet/maintenance/dvirs
            &hyper::Method::Post if path.matched(paths::ID_FLEET_MAINTENANCE_DVIRS) => Ok("CreateDvir"),

            // CreateVehicleDispatchRoute - POST /fleet/vehicles/{vehicle_id}/dispatch/routes
            &hyper::Method::Post if path.matched(paths::ID_FLEET_VEHICLES_VEHICLE_ID_DISPATCH_ROUTES) => Ok("CreateVehicleDispatchRoute"),

            // DeactivateDriver - DELETE /fleet/drivers/{driver_id_or_external_id}
            &hyper::Method::Delete if path.matched(paths::ID_FLEET_DRIVERS_DRIVER_ID_OR_EXTERNAL_ID) => Ok("DeactivateDriver"),

            // DeleteDispatchRouteById - DELETE /fleet/dispatch/routes/{route_id}
            &hyper::Method::Delete if path.matched(paths::ID_FLEET_DISPATCH_ROUTES_ROUTE_ID) => Ok("DeleteDispatchRouteById"),

            // DeleteOrganizationAddress - DELETE /addresses/{addressId}
            &hyper::Method::Delete if path.matched(paths::ID_ADDRESSES_ADDRESSID) => Ok("DeleteOrganizationAddress"),

            // FetchAllDispatchRoutes - GET /fleet/dispatch/routes
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DISPATCH_ROUTES) => Ok("FetchAllDispatchRoutes"),

            // FetchAllRouteJobUpdates - GET /fleet/dispatch/routes/job_updates
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DISPATCH_ROUTES_JOB_UPDATES) => Ok("FetchAllRouteJobUpdates"),

            // GetAllAssetCurrentLocations - GET /fleet/assets/locations
            &hyper::Method::Get if path.matched(paths::ID_FLEET_ASSETS_LOCATIONS) => Ok("GetAllAssetCurrentLocations"),

            // GetAllAssets - GET /fleet/assets
            &hyper::Method::Get if path.matched(paths::ID_FLEET_ASSETS) => Ok("GetAllAssets"),

            // GetAllDeactivatedDrivers - GET /fleet/drivers/inactive
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DRIVERS_INACTIVE) => Ok("GetAllDeactivatedDrivers"),

            // GetAssetLocation - GET /fleet/assets/{asset_id}/locations
            &hyper::Method::Get if path.matched(paths::ID_FLEET_ASSETS_ASSET_ID_LOCATIONS) => Ok("GetAssetLocation"),

            // GetAssetReefer - GET /fleet/assets/{asset_id}/reefer
            &hyper::Method::Get if path.matched(paths::ID_FLEET_ASSETS_ASSET_ID_REEFER) => Ok("GetAssetReefer"),

            // GetDeactivatedDriverById - GET /fleet/drivers/inactive/{driver_id_or_external_id}
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DRIVERS_INACTIVE_DRIVER_ID_OR_EXTERNAL_ID) => Ok("GetDeactivatedDriverById"),

            // GetDispatchRouteById - GET /fleet/dispatch/routes/{route_id}
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DISPATCH_ROUTES_ROUTE_ID) => Ok("GetDispatchRouteById"),

            // GetDispatchRouteHistory - GET /fleet/dispatch/routes/{route_id}/history
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DISPATCH_ROUTES_ROUTE_ID_HISTORY) => Ok("GetDispatchRouteHistory"),

            // GetDispatchRoutesByDriverId - GET /fleet/drivers/{driver_id}/dispatch/routes
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DRIVERS_DRIVER_ID_DISPATCH_ROUTES) => Ok("GetDispatchRoutesByDriverId"),

            // GetDispatchRoutesByVehicleId - GET /fleet/vehicles/{vehicle_id}/dispatch/routes
            &hyper::Method::Get if path.matched(paths::ID_FLEET_VEHICLES_VEHICLE_ID_DISPATCH_ROUTES) => Ok("GetDispatchRoutesByVehicleId"),

            // GetDriverById - GET /fleet/drivers/{driver_id_or_external_id}
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DRIVERS_DRIVER_ID_OR_EXTERNAL_ID) => Ok("GetDriverById"),

            // GetDriverDocumentTypesByOrgId - GET /fleet/drivers/document_types
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DRIVERS_DOCUMENT_TYPES) => Ok("GetDriverDocumentTypesByOrgId"),

            // GetDriverDocumentsByOrgId - GET /fleet/drivers/documents
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DRIVERS_DOCUMENTS) => Ok("GetDriverDocumentsByOrgId"),

            // GetDriverSafetyScore - GET /fleet/drivers/{driverId}/safety/score
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DRIVERS_DRIVERID_SAFETY_SCORE) => Ok("GetDriverSafetyScore"),

            // GetDvirs - GET /fleet/maintenance/dvirs
            &hyper::Method::Get if path.matched(paths::ID_FLEET_MAINTENANCE_DVIRS) => Ok("GetDvirs"),

            // GetFleetDrivers - POST /fleet/drivers
            &hyper::Method::Post if path.matched(paths::ID_FLEET_DRIVERS) => Ok("GetFleetDrivers"),

            // GetFleetDriversHosDailyLogs - POST /fleet/drivers/{driver_id}/hos_daily_logs
            &hyper::Method::Post if path.matched(paths::ID_FLEET_DRIVERS_DRIVER_ID_HOS_DAILY_LOGS) => Ok("GetFleetDriversHosDailyLogs"),

            // GetFleetDriversSummary - POST /fleet/drivers/summary
            &hyper::Method::Post if path.matched(paths::ID_FLEET_DRIVERS_SUMMARY) => Ok("GetFleetDriversSummary"),

            // GetFleetHosAuthenticationLogs - POST /fleet/hos_authentication_logs
            &hyper::Method::Post if path.matched(paths::ID_FLEET_HOS_AUTHENTICATION_LOGS) => Ok("GetFleetHosAuthenticationLogs"),

            // GetFleetHosLogs - POST /fleet/hos_logs
            &hyper::Method::Post if path.matched(paths::ID_FLEET_HOS_LOGS) => Ok("GetFleetHosLogs"),

            // GetFleetHosLogsSummary - POST /fleet/hos_logs_summary
            &hyper::Method::Post if path.matched(paths::ID_FLEET_HOS_LOGS_SUMMARY) => Ok("GetFleetHosLogsSummary"),

            // GetFleetLocations - POST /fleet/locations
            &hyper::Method::Post if path.matched(paths::ID_FLEET_LOCATIONS) => Ok("GetFleetLocations"),

            // GetFleetMaintenanceList - POST /fleet/maintenance/list
            &hyper::Method::Post if path.matched(paths::ID_FLEET_MAINTENANCE_LIST) => Ok("GetFleetMaintenanceList"),

            // GetFleetTrips - POST /fleet/trips
            &hyper::Method::Post if path.matched(paths::ID_FLEET_TRIPS) => Ok("GetFleetTrips"),

            // GetFleetVehicle - GET /fleet/vehicles/{vehicle_id_or_external_id}
            &hyper::Method::Get if path.matched(paths::ID_FLEET_VEHICLES_VEHICLE_ID_OR_EXTERNAL_ID) => Ok("GetFleetVehicle"),

            // GetOrganizationAddress - GET /addresses/{addressId}
            &hyper::Method::Get if path.matched(paths::ID_ADDRESSES_ADDRESSID) => Ok("GetOrganizationAddress"),

            // GetOrganizationAddresses - GET /addresses
            &hyper::Method::Get if path.matched(paths::ID_ADDRESSES) => Ok("GetOrganizationAddresses"),

            // GetOrganizationContact - GET /contacts/{contact_id}
            &hyper::Method::Get if path.matched(paths::ID_CONTACTS_CONTACT_ID) => Ok("GetOrganizationContact"),

            // GetVehicleHarshEvent - GET /fleet/vehicles/{vehicleId}/safety/harsh_event
            &hyper::Method::Get if path.matched(paths::ID_FLEET_VEHICLES_VEHICLEID_SAFETY_HARSH_EVENT) => Ok("GetVehicleHarshEvent"),

            // GetVehicleLocations - GET /fleet/vehicles/{vehicle_id}/locations
            &hyper::Method::Get if path.matched(paths::ID_FLEET_VEHICLES_VEHICLE_ID_LOCATIONS) => Ok("GetVehicleLocations"),

            // GetVehicleSafetyScore - GET /fleet/vehicles/{vehicleId}/safety/score
            &hyper::Method::Get if path.matched(paths::ID_FLEET_VEHICLES_VEHICLEID_SAFETY_SCORE) => Ok("GetVehicleSafetyScore"),

            // GetVehicleStats - GET /fleet/vehicles/stats
            &hyper::Method::Get if path.matched(paths::ID_FLEET_VEHICLES_STATS) => Ok("GetVehicleStats"),

            // GetVehiclesLocations - GET /fleet/vehicles/locations
            &hyper::Method::Get if path.matched(paths::ID_FLEET_VEHICLES_LOCATIONS) => Ok("GetVehiclesLocations"),

            // ListContacts - GET /contacts
            &hyper::Method::Get if path.matched(paths::ID_CONTACTS) => Ok("ListContacts"),

            // ListFleet - POST /fleet/list
            &hyper::Method::Post if path.matched(paths::ID_FLEET_LIST) => Ok("ListFleet"),

            // PatchFleetVehicle - PATCH /fleet/vehicles/{vehicle_id_or_external_id}
            &hyper::Method::Patch if path.matched(paths::ID_FLEET_VEHICLES_VEHICLE_ID_OR_EXTERNAL_ID) => Ok("PatchFleetVehicle"),

            // ReactivateDriverById - PUT /fleet/drivers/inactive/{driver_id_or_external_id}
            &hyper::Method::Put if path.matched(paths::ID_FLEET_DRIVERS_INACTIVE_DRIVER_ID_OR_EXTERNAL_ID) => Ok("ReactivateDriverById"),

            // UpdateDispatchRouteById - PUT /fleet/dispatch/routes/{route_id}
            &hyper::Method::Put if path.matched(paths::ID_FLEET_DISPATCH_ROUTES_ROUTE_ID) => Ok("UpdateDispatchRouteById"),

            // UpdateOrganizationAddress - PATCH /addresses/{addressId}
            &hyper::Method::Patch if path.matched(paths::ID_ADDRESSES_ADDRESSID) => Ok("UpdateOrganizationAddress"),

            // UpdateVehicles - POST /fleet/set_data
            &hyper::Method::Post if path.matched(paths::ID_FLEET_SET_DATA) => Ok("UpdateVehicles"),

            // GetAllDataInputs - GET /industrial/data
            &hyper::Method::Get if path.matched(paths::ID_INDUSTRIAL_DATA) => Ok("GetAllDataInputs"),

            // GetDataInput - GET /industrial/data/{data_input_id}
            &hyper::Method::Get if path.matched(paths::ID_INDUSTRIAL_DATA_DATA_INPUT_ID) => Ok("GetDataInput"),

            // GetMachines - POST /machines/list
            &hyper::Method::Post if path.matched(paths::ID_MACHINES_LIST) => Ok("GetMachines"),

            // GetMachinesHistory - POST /machines/history
            &hyper::Method::Post if path.matched(paths::ID_MACHINES_HISTORY) => Ok("GetMachinesHistory"),

            // CreateDispatchRoute - POST /fleet/dispatch/routes
            &hyper::Method::Post if path.matched(paths::ID_FLEET_DISPATCH_ROUTES) => Ok("CreateDispatchRoute"),

            // CreateDriverDispatchRoute - POST /fleet/drivers/{driver_id}/dispatch/routes
            &hyper::Method::Post if path.matched(paths::ID_FLEET_DRIVERS_DRIVER_ID_DISPATCH_ROUTES) => Ok("CreateDriverDispatchRoute"),

            // CreateVehicleDispatchRoute - POST /fleet/vehicles/{vehicle_id}/dispatch/routes
            &hyper::Method::Post if path.matched(paths::ID_FLEET_VEHICLES_VEHICLE_ID_DISPATCH_ROUTES) => Ok("CreateVehicleDispatchRoute"),

            // DeleteDispatchRouteById - DELETE /fleet/dispatch/routes/{route_id}
            &hyper::Method::Delete if path.matched(paths::ID_FLEET_DISPATCH_ROUTES_ROUTE_ID) => Ok("DeleteDispatchRouteById"),

            // FetchAllDispatchRoutes - GET /fleet/dispatch/routes
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DISPATCH_ROUTES) => Ok("FetchAllDispatchRoutes"),

            // FetchAllRouteJobUpdates - GET /fleet/dispatch/routes/job_updates
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DISPATCH_ROUTES_JOB_UPDATES) => Ok("FetchAllRouteJobUpdates"),

            // GetDispatchRouteById - GET /fleet/dispatch/routes/{route_id}
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DISPATCH_ROUTES_ROUTE_ID) => Ok("GetDispatchRouteById"),

            // GetDispatchRouteHistory - GET /fleet/dispatch/routes/{route_id}/history
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DISPATCH_ROUTES_ROUTE_ID_HISTORY) => Ok("GetDispatchRouteHistory"),

            // GetDispatchRoutesByDriverId - GET /fleet/drivers/{driver_id}/dispatch/routes
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DRIVERS_DRIVER_ID_DISPATCH_ROUTES) => Ok("GetDispatchRoutesByDriverId"),

            // GetDispatchRoutesByVehicleId - GET /fleet/vehicles/{vehicle_id}/dispatch/routes
            &hyper::Method::Get if path.matched(paths::ID_FLEET_VEHICLES_VEHICLE_ID_DISPATCH_ROUTES) => Ok("GetDispatchRoutesByVehicleId"),

            // UpdateDispatchRouteById - PUT /fleet/dispatch/routes/{route_id}
            &hyper::Method::Put if path.matched(paths::ID_FLEET_DISPATCH_ROUTES_ROUTE_ID) => Ok("UpdateDispatchRouteById"),

            // GetDriverSafetyScore - GET /fleet/drivers/{driverId}/safety/score
            &hyper::Method::Get if path.matched(paths::ID_FLEET_DRIVERS_DRIVERID_SAFETY_SCORE) => Ok("GetDriverSafetyScore"),

            // GetVehicleHarshEvent - GET /fleet/vehicles/{vehicleId}/safety/harsh_event
            &hyper::Method::Get if path.matched(paths::ID_FLEET_VEHICLES_VEHICLEID_SAFETY_HARSH_EVENT) => Ok("GetVehicleHarshEvent"),

            // GetVehicleSafetyScore - GET /fleet/vehicles/{vehicleId}/safety/score
            &hyper::Method::Get if path.matched(paths::ID_FLEET_VEHICLES_VEHICLEID_SAFETY_SCORE) => Ok("GetVehicleSafetyScore"),

            // GetSensors - POST /sensors/list
            &hyper::Method::Post if path.matched(paths::ID_SENSORS_LIST) => Ok("GetSensors"),

            // GetSensorsCargo - POST /sensors/cargo
            &hyper::Method::Post if path.matched(paths::ID_SENSORS_CARGO) => Ok("GetSensorsCargo"),

            // GetSensorsDoor - POST /sensors/door
            &hyper::Method::Post if path.matched(paths::ID_SENSORS_DOOR) => Ok("GetSensorsDoor"),

            // GetSensorsHistory - POST /sensors/history
            &hyper::Method::Post if path.matched(paths::ID_SENSORS_HISTORY) => Ok("GetSensorsHistory"),

            // GetSensorsHumidity - POST /sensors/humidity
            &hyper::Method::Post if path.matched(paths::ID_SENSORS_HUMIDITY) => Ok("GetSensorsHumidity"),

            // GetSensorsTemperature - POST /sensors/temperature
            &hyper::Method::Post if path.matched(paths::ID_SENSORS_TEMPERATURE) => Ok("GetSensorsTemperature"),

            // CreateTag - POST /tags
            &hyper::Method::Post if path.matched(paths::ID_TAGS) => Ok("CreateTag"),

            // DeleteTagById - DELETE /tags/{tag_id}
            &hyper::Method::Delete if path.matched(paths::ID_TAGS_TAG_ID) => Ok("DeleteTagById"),

            // GetAllTags - GET /tags
            &hyper::Method::Get if path.matched(paths::ID_TAGS) => Ok("GetAllTags"),

            // GetTagById - GET /tags/{tag_id}
            &hyper::Method::Get if path.matched(paths::ID_TAGS_TAG_ID) => Ok("GetTagById"),

            // ModifyTagById - PATCH /tags/{tag_id}
            &hyper::Method::Patch if path.matched(paths::ID_TAGS_TAG_ID) => Ok("ModifyTagById"),

            // UpdateTagById - PUT /tags/{tag_id}
            &hyper::Method::Put if path.matched(paths::ID_TAGS_TAG_ID) => Ok("UpdateTagById"),

            // DeleteUserById - DELETE /users/{userId}
            &hyper::Method::Delete if path.matched(paths::ID_USERS_USERID) => Ok("DeleteUserById"),

            // GetUserById - GET /users/{userId}
            &hyper::Method::Get if path.matched(paths::ID_USERS_USERID) => Ok("GetUserById"),

            // ListUserRoles - GET /user_roles
            &hyper::Method::Get if path.matched(paths::ID_USER_ROLES) => Ok("ListUserRoles"),

            // ListUsers - GET /users
            &hyper::Method::Get if path.matched(paths::ID_USERS) => Ok("ListUsers"),
            _ => Err(()),
        }
    }
}
