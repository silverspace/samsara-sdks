/*
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */

use std::rc::Rc;
use std::borrow::Borrow;

use hyper;
use serde_json;
use futures::Future;

use super::{Error, configuration};
use super::request as __internal_request;

pub struct FleetApiClient<C: hyper::client::Connect> {
    configuration: Rc<configuration::Configuration<C>>,
}

impl<C: hyper::client::Connect> FleetApiClient<C> {
    pub fn new(configuration: Rc<configuration::Configuration<C>>) -> FleetApiClient<C> {
        FleetApiClient {
            configuration: configuration,
        }
    }
}

pub trait FleetApi {
    fn add_fleet_address(&self, access_token: &str, address_param: ::models::InlineObject2) -> Box<Future<Item = (), Error = Error<serde_json::Value>>>;
    fn add_organization_addresses(&self, access_token: &str, addresses: ::models::InlineObject) -> Box<Future<Item = Vec<::models::Address>, Error = Error<serde_json::Value>>>;
    fn create_dispatch_route(&self, access_token: &str, create_dispatch_route_params: ::models::DispatchRouteCreate) -> Box<Future<Item = ::models::DispatchRoute, Error = Error<serde_json::Value>>>;
    fn create_driver(&self, access_token: &str, create_driver_param: ::models::DriverForCreate) -> Box<Future<Item = ::models::Driver, Error = Error<serde_json::Value>>>;
    fn create_driver_dispatch_route(&self, access_token: &str, driver_id: i64, create_dispatch_route_params: ::models::DispatchRouteCreate) -> Box<Future<Item = ::models::DispatchRoute, Error = Error<serde_json::Value>>>;
    fn create_driver_document(&self, access_token: &str, driver_id: i64, create_document_params: ::models::DocumentCreate) -> Box<Future<Item = ::models::Document, Error = Error<serde_json::Value>>>;
    fn create_dvir(&self, access_token: &str, create_dvir_param: ::models::InlineObject12) -> Box<Future<Item = ::models::DvirBase, Error = Error<serde_json::Value>>>;
    fn create_vehicle_dispatch_route(&self, access_token: &str, vehicle_id: i64, create_dispatch_route_params: ::models::DispatchRouteCreate) -> Box<Future<Item = ::models::DispatchRoute, Error = Error<serde_json::Value>>>;
    fn deactivate_driver(&self, access_token: &str, driver_id_or_external_id: &str) -> Box<Future<Item = (), Error = Error<serde_json::Value>>>;
    fn delete_dispatch_route_by_id(&self, access_token: &str, route_id: i64) -> Box<Future<Item = (), Error = Error<serde_json::Value>>>;
    fn delete_organization_address(&self, access_token: &str, address_id: i64) -> Box<Future<Item = (), Error = Error<serde_json::Value>>>;
    fn fetch_all_dispatch_routes(&self, access_token: &str, group_id: i64, end_time: i64, duration: i64) -> Box<Future<Item = Vec<::models::DispatchRoute>, Error = Error<serde_json::Value>>>;
    fn fetch_all_route_job_updates(&self, access_token: &str, group_id: i64, sequence_id: &str, include: &str) -> Box<Future<Item = ::models::AllRouteJobUpdates, Error = Error<serde_json::Value>>>;
    fn get_all_asset_current_locations(&self, access_token: &str, group_id: i64) -> Box<Future<Item = ::models::InlineResponse2001, Error = Error<serde_json::Value>>>;
    fn get_all_assets(&self, access_token: &str, group_id: i64) -> Box<Future<Item = ::models::InlineResponse200, Error = Error<serde_json::Value>>>;
    fn get_all_deactivated_drivers(&self, access_token: &str, group_id: i64) -> Box<Future<Item = Vec<::models::Driver>, Error = Error<serde_json::Value>>>;
    fn get_asset_location(&self, access_token: &str, asset_id: i64, start_ms: i64, end_ms: i64) -> Box<Future<Item = Vec<Value>, Error = Error<serde_json::Value>>>;
    fn get_asset_reefer(&self, access_token: &str, asset_id: i64, start_ms: i64, end_ms: i64) -> Box<Future<Item = ::models::AssetReeferResponse, Error = Error<serde_json::Value>>>;
    fn get_deactivated_driver_by_id(&self, access_token: &str, driver_id_or_external_id: &str) -> Box<Future<Item = ::models::Driver, Error = Error<serde_json::Value>>>;
    fn get_dispatch_route_by_id(&self, access_token: &str, route_id: i64) -> Box<Future<Item = ::models::DispatchRoute, Error = Error<serde_json::Value>>>;
    fn get_dispatch_route_history(&self, access_token: &str, route_id: i64, start_time: i64, end_time: i64) -> Box<Future<Item = ::models::DispatchRouteHistory, Error = Error<serde_json::Value>>>;
    fn get_dispatch_routes_by_driver_id(&self, access_token: &str, driver_id: i64, end_time: i64, duration: i64) -> Box<Future<Item = Vec<::models::DispatchRoute>, Error = Error<serde_json::Value>>>;
    fn get_dispatch_routes_by_vehicle_id(&self, access_token: &str, vehicle_id: i64, end_time: i64, duration: i64) -> Box<Future<Item = Vec<::models::DispatchRoute>, Error = Error<serde_json::Value>>>;
    fn get_driver_by_id(&self, access_token: &str, driver_id_or_external_id: &str) -> Box<Future<Item = ::models::Driver, Error = Error<serde_json::Value>>>;
    fn get_driver_document_types_by_org_id(&self, ) -> Box<Future<Item = Vec<::models::DocumentType>, Error = Error<serde_json::Value>>>;
    fn get_driver_documents_by_org_id(&self, access_token: &str, end_ms: i64, duration_ms: i64) -> Box<Future<Item = Vec<::models::Document>, Error = Error<serde_json::Value>>>;
    fn get_driver_safety_score(&self, driver_id: i64, access_token: &str, start_ms: i64, end_ms: i64) -> Box<Future<Item = ::models::DriverSafetyScoreResponse, Error = Error<serde_json::Value>>>;
    fn get_dvirs(&self, access_token: &str, end_ms: i32, duration_ms: i32, group_id: i32) -> Box<Future<Item = ::models::DvirListResponse, Error = Error<serde_json::Value>>>;
    fn get_fleet_drivers(&self, access_token: &str, group_drivers_param: ::models::InlineObject3) -> Box<Future<Item = ::models::DriversResponse, Error = Error<serde_json::Value>>>;
    fn get_fleet_drivers_hos_daily_logs(&self, access_token: &str, driver_id: i64, hos_logs_param: ::models::InlineObject6) -> Box<Future<Item = ::models::DriverDailyLogResponse, Error = Error<serde_json::Value>>>;
    fn get_fleet_drivers_summary(&self, access_token: &str, drivers_summary_param: ::models::InlineObject5, snap_to_day_bounds: bool) -> Box<Future<Item = ::models::DriversSummaryResponse, Error = Error<serde_json::Value>>>;
    fn get_fleet_hos_authentication_logs(&self, access_token: &str, hos_authentication_logs_param: ::models::InlineObject7) -> Box<Future<Item = ::models::HosAuthenticationLogsResponse, Error = Error<serde_json::Value>>>;
    fn get_fleet_hos_logs(&self, access_token: &str, hos_logs_param: ::models::InlineObject8) -> Box<Future<Item = ::models::HosLogsResponse, Error = Error<serde_json::Value>>>;
    fn get_fleet_hos_logs_summary(&self, access_token: &str, hos_logs_param: ::models::InlineObject9) -> Box<Future<Item = ::models::HosLogsSummaryResponse, Error = Error<serde_json::Value>>>;
    fn get_fleet_locations(&self, access_token: &str, group_param: ::models::InlineObject11) -> Box<Future<Item = ::models::InlineResponse2003, Error = Error<serde_json::Value>>>;
    fn get_fleet_maintenance_list(&self, access_token: &str, group_param: ::models::InlineObject13) -> Box<Future<Item = ::models::InlineResponse2004, Error = Error<serde_json::Value>>>;
    fn get_fleet_trips(&self, access_token: &str, trips_param: ::models::InlineObject15) -> Box<Future<Item = ::models::TripResponse, Error = Error<serde_json::Value>>>;
    fn get_fleet_vehicle(&self, access_token: &str, vehicle_id_or_external_id: &str) -> Box<Future<Item = ::models::FleetVehicleResponse, Error = Error<serde_json::Value>>>;
    fn get_organization_address(&self, access_token: &str, address_id: i64) -> Box<Future<Item = ::models::Address, Error = Error<serde_json::Value>>>;
    fn get_organization_addresses(&self, access_token: &str) -> Box<Future<Item = Vec<::models::Address>, Error = Error<serde_json::Value>>>;
    fn get_organization_contact(&self, access_token: &str, contact_id: i64) -> Box<Future<Item = ::models::Contact, Error = Error<serde_json::Value>>>;
    fn get_vehicle_harsh_event(&self, vehicle_id: i64, access_token: &str, timestamp: i64) -> Box<Future<Item = ::models::VehicleHarshEventResponse, Error = Error<serde_json::Value>>>;
    fn get_vehicle_locations(&self, access_token: &str, vehicle_id: i64, start_ms: i64, end_ms: i64) -> Box<Future<Item = Vec<::models::FleetVehicleLocation>, Error = Error<serde_json::Value>>>;
    fn get_vehicle_safety_score(&self, vehicle_id: i64, access_token: &str, start_ms: i64, end_ms: i64) -> Box<Future<Item = ::models::VehicleSafetyScoreResponse, Error = Error<serde_json::Value>>>;
    fn get_vehicle_stats(&self, access_token: &str, start_ms: i32, end_ms: i32, series: &str, tag_ids: &str, starting_after: &str, ending_before: &str, limit: i64) -> Box<Future<Item = ::models::InlineResponse2005, Error = Error<serde_json::Value>>>;
    fn get_vehicles_locations(&self, access_token: &str, start_ms: i32, end_ms: i32) -> Box<Future<Item = Vec<Value>, Error = Error<serde_json::Value>>>;
    fn list_contacts(&self, access_token: &str) -> Box<Future<Item = Vec<::models::Contact>, Error = Error<serde_json::Value>>>;
    fn list_fleet(&self, access_token: &str, group_param: ::models::InlineObject10, starting_after: &str, ending_before: &str, limit: i64) -> Box<Future<Item = ::models::InlineResponse2002, Error = Error<serde_json::Value>>>;
    fn patch_fleet_vehicle(&self, access_token: &str, vehicle_id_or_external_id: &str, data: ::models::InlineObject16) -> Box<Future<Item = ::models::FleetVehicleResponse, Error = Error<serde_json::Value>>>;
    fn reactivate_driver_by_id(&self, access_token: &str, driver_id_or_external_id: &str, reactivate_driver_param: ::models::InlineObject4) -> Box<Future<Item = ::models::Driver, Error = Error<serde_json::Value>>>;
    fn update_dispatch_route_by_id(&self, access_token: &str, route_id: i64, update_dispatch_route_params: ::models::DispatchRoute) -> Box<Future<Item = ::models::DispatchRoute, Error = Error<serde_json::Value>>>;
    fn update_organization_address(&self, access_token: &str, address_id: i64, address: ::models::InlineObject1) -> Box<Future<Item = (), Error = Error<serde_json::Value>>>;
    fn update_vehicles(&self, access_token: &str, vehicle_update_param: ::models::InlineObject14) -> Box<Future<Item = (), Error = Error<serde_json::Value>>>;
}


impl<C: hyper::client::Connect>FleetApi for FleetApiClient<C> {
    fn add_fleet_address(&self, access_token: &str, address_param: ::models::InlineObject2) -> Box<Future<Item = (), Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Post, "/fleet/add_address".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_body_param(address_param)
            .returns_nothing()
            .execute(self.configuration.borrow())
    }

    fn add_organization_addresses(&self, access_token: &str, addresses: ::models::InlineObject) -> Box<Future<Item = Vec<::models::Address>, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Post, "/addresses".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_body_param(addresses)
            .execute(self.configuration.borrow())
    }

    fn create_dispatch_route(&self, access_token: &str, create_dispatch_route_params: ::models::DispatchRouteCreate) -> Box<Future<Item = ::models::DispatchRoute, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Post, "/fleet/dispatch/routes".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_body_param(create_dispatch_route_params)
            .execute(self.configuration.borrow())
    }

    fn create_driver(&self, access_token: &str, create_driver_param: ::models::DriverForCreate) -> Box<Future<Item = ::models::Driver, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Post, "/fleet/drivers/create".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_body_param(create_driver_param)
            .execute(self.configuration.borrow())
    }

    fn create_driver_dispatch_route(&self, access_token: &str, driver_id: i64, create_dispatch_route_params: ::models::DispatchRouteCreate) -> Box<Future<Item = ::models::DispatchRoute, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Post, "/fleet/drivers/{driver_id}/dispatch/routes".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_path_param("driver_id".to_string(), driver_id.to_string())
            .with_body_param(create_dispatch_route_params)
            .execute(self.configuration.borrow())
    }

    fn create_driver_document(&self, access_token: &str, driver_id: i64, create_document_params: ::models::DocumentCreate) -> Box<Future<Item = ::models::Document, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Post, "/fleet/drivers/{driver_id}/documents".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_path_param("driver_id".to_string(), driver_id.to_string())
            .with_body_param(create_document_params)
            .execute(self.configuration.borrow())
    }

    fn create_dvir(&self, access_token: &str, create_dvir_param: ::models::InlineObject12) -> Box<Future<Item = ::models::DvirBase, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Post, "/fleet/maintenance/dvirs".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_body_param(create_dvir_param)
            .execute(self.configuration.borrow())
    }

    fn create_vehicle_dispatch_route(&self, access_token: &str, vehicle_id: i64, create_dispatch_route_params: ::models::DispatchRouteCreate) -> Box<Future<Item = ::models::DispatchRoute, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Post, "/fleet/vehicles/{vehicle_id}/dispatch/routes".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_path_param("vehicle_id".to_string(), vehicle_id.to_string())
            .with_body_param(create_dispatch_route_params)
            .execute(self.configuration.borrow())
    }

    fn deactivate_driver(&self, access_token: &str, driver_id_or_external_id: &str) -> Box<Future<Item = (), Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Delete, "/fleet/drivers/{driver_id_or_external_id}".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_path_param("driver_id_or_external_id".to_string(), driver_id_or_external_id.to_string())
            .returns_nothing()
            .execute(self.configuration.borrow())
    }

    fn delete_dispatch_route_by_id(&self, access_token: &str, route_id: i64) -> Box<Future<Item = (), Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Delete, "/fleet/dispatch/routes/{route_id}".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_path_param("route_id".to_string(), route_id.to_string())
            .returns_nothing()
            .execute(self.configuration.borrow())
    }

    fn delete_organization_address(&self, access_token: &str, address_id: i64) -> Box<Future<Item = (), Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Delete, "/addresses/{addressId}".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_path_param("addressId".to_string(), address_id.to_string())
            .returns_nothing()
            .execute(self.configuration.borrow())
    }

    fn fetch_all_dispatch_routes(&self, access_token: &str, group_id: i64, end_time: i64, duration: i64) -> Box<Future<Item = Vec<::models::DispatchRoute>, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/fleet/dispatch/routes".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_query_param("group_id".to_string(), group_id.to_string())
            .with_query_param("end_time".to_string(), end_time.to_string())
            .with_query_param("duration".to_string(), duration.to_string())
            .execute(self.configuration.borrow())
    }

    fn fetch_all_route_job_updates(&self, access_token: &str, group_id: i64, sequence_id: &str, include: &str) -> Box<Future<Item = ::models::AllRouteJobUpdates, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/fleet/dispatch/routes/job_updates".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_query_param("group_id".to_string(), group_id.to_string())
            .with_query_param("sequence_id".to_string(), sequence_id.to_string())
            .with_query_param("include".to_string(), include.to_string())
            .execute(self.configuration.borrow())
    }

    fn get_all_asset_current_locations(&self, access_token: &str, group_id: i64) -> Box<Future<Item = ::models::InlineResponse2001, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/fleet/assets/locations".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_query_param("group_id".to_string(), group_id.to_string())
            .execute(self.configuration.borrow())
    }

    fn get_all_assets(&self, access_token: &str, group_id: i64) -> Box<Future<Item = ::models::InlineResponse200, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/fleet/assets".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_query_param("group_id".to_string(), group_id.to_string())
            .execute(self.configuration.borrow())
    }

    fn get_all_deactivated_drivers(&self, access_token: &str, group_id: i64) -> Box<Future<Item = Vec<::models::Driver>, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/fleet/drivers/inactive".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_query_param("group_id".to_string(), group_id.to_string())
            .execute(self.configuration.borrow())
    }

    fn get_asset_location(&self, access_token: &str, asset_id: i64, start_ms: i64, end_ms: i64) -> Box<Future<Item = Vec<Value>, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/fleet/assets/{asset_id}/locations".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_query_param("startMs".to_string(), start_ms.to_string())
            .with_query_param("endMs".to_string(), end_ms.to_string())
            .with_path_param("asset_id".to_string(), asset_id.to_string())
            .execute(self.configuration.borrow())
    }

    fn get_asset_reefer(&self, access_token: &str, asset_id: i64, start_ms: i64, end_ms: i64) -> Box<Future<Item = ::models::AssetReeferResponse, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/fleet/assets/{asset_id}/reefer".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_query_param("startMs".to_string(), start_ms.to_string())
            .with_query_param("endMs".to_string(), end_ms.to_string())
            .with_path_param("asset_id".to_string(), asset_id.to_string())
            .execute(self.configuration.borrow())
    }

    fn get_deactivated_driver_by_id(&self, access_token: &str, driver_id_or_external_id: &str) -> Box<Future<Item = ::models::Driver, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/fleet/drivers/inactive/{driver_id_or_external_id}".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_path_param("driver_id_or_external_id".to_string(), driver_id_or_external_id.to_string())
            .execute(self.configuration.borrow())
    }

    fn get_dispatch_route_by_id(&self, access_token: &str, route_id: i64) -> Box<Future<Item = ::models::DispatchRoute, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/fleet/dispatch/routes/{route_id}".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_path_param("route_id".to_string(), route_id.to_string())
            .execute(self.configuration.borrow())
    }

    fn get_dispatch_route_history(&self, access_token: &str, route_id: i64, start_time: i64, end_time: i64) -> Box<Future<Item = ::models::DispatchRouteHistory, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/fleet/dispatch/routes/{route_id}/history".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_query_param("start_time".to_string(), start_time.to_string())
            .with_query_param("end_time".to_string(), end_time.to_string())
            .with_path_param("route_id".to_string(), route_id.to_string())
            .execute(self.configuration.borrow())
    }

    fn get_dispatch_routes_by_driver_id(&self, access_token: &str, driver_id: i64, end_time: i64, duration: i64) -> Box<Future<Item = Vec<::models::DispatchRoute>, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/fleet/drivers/{driver_id}/dispatch/routes".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_query_param("end_time".to_string(), end_time.to_string())
            .with_query_param("duration".to_string(), duration.to_string())
            .with_path_param("driver_id".to_string(), driver_id.to_string())
            .execute(self.configuration.borrow())
    }

    fn get_dispatch_routes_by_vehicle_id(&self, access_token: &str, vehicle_id: i64, end_time: i64, duration: i64) -> Box<Future<Item = Vec<::models::DispatchRoute>, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/fleet/vehicles/{vehicle_id}/dispatch/routes".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_query_param("end_time".to_string(), end_time.to_string())
            .with_query_param("duration".to_string(), duration.to_string())
            .with_path_param("vehicle_id".to_string(), vehicle_id.to_string())
            .execute(self.configuration.borrow())
    }

    fn get_driver_by_id(&self, access_token: &str, driver_id_or_external_id: &str) -> Box<Future<Item = ::models::Driver, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/fleet/drivers/{driver_id_or_external_id}".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_path_param("driver_id_or_external_id".to_string(), driver_id_or_external_id.to_string())
            .execute(self.configuration.borrow())
    }

    fn get_driver_document_types_by_org_id(&self, ) -> Box<Future<Item = Vec<::models::DocumentType>, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/fleet/drivers/document_types".to_string())
            .execute(self.configuration.borrow())
    }

    fn get_driver_documents_by_org_id(&self, access_token: &str, end_ms: i64, duration_ms: i64) -> Box<Future<Item = Vec<::models::Document>, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/fleet/drivers/documents".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_query_param("endMs".to_string(), end_ms.to_string())
            .with_query_param("durationMs".to_string(), duration_ms.to_string())
            .execute(self.configuration.borrow())
    }

    fn get_driver_safety_score(&self, driver_id: i64, access_token: &str, start_ms: i64, end_ms: i64) -> Box<Future<Item = ::models::DriverSafetyScoreResponse, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/fleet/drivers/{driverId}/safety/score".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_query_param("startMs".to_string(), start_ms.to_string())
            .with_query_param("endMs".to_string(), end_ms.to_string())
            .with_path_param("driverId".to_string(), driver_id.to_string())
            .execute(self.configuration.borrow())
    }

    fn get_dvirs(&self, access_token: &str, end_ms: i32, duration_ms: i32, group_id: i32) -> Box<Future<Item = ::models::DvirListResponse, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/fleet/maintenance/dvirs".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_query_param("end_ms".to_string(), end_ms.to_string())
            .with_query_param("duration_ms".to_string(), duration_ms.to_string())
            .with_query_param("group_id".to_string(), group_id.to_string())
            .execute(self.configuration.borrow())
    }

    fn get_fleet_drivers(&self, access_token: &str, group_drivers_param: ::models::InlineObject3) -> Box<Future<Item = ::models::DriversResponse, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Post, "/fleet/drivers".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_body_param(group_drivers_param)
            .execute(self.configuration.borrow())
    }

    fn get_fleet_drivers_hos_daily_logs(&self, access_token: &str, driver_id: i64, hos_logs_param: ::models::InlineObject6) -> Box<Future<Item = ::models::DriverDailyLogResponse, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Post, "/fleet/drivers/{driver_id}/hos_daily_logs".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_path_param("driver_id".to_string(), driver_id.to_string())
            .with_body_param(hos_logs_param)
            .execute(self.configuration.borrow())
    }

    fn get_fleet_drivers_summary(&self, access_token: &str, drivers_summary_param: ::models::InlineObject5, snap_to_day_bounds: bool) -> Box<Future<Item = ::models::DriversSummaryResponse, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Post, "/fleet/drivers/summary".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_query_param("snap_to_day_bounds".to_string(), snap_to_day_bounds.to_string())
            .with_body_param(drivers_summary_param)
            .execute(self.configuration.borrow())
    }

    fn get_fleet_hos_authentication_logs(&self, access_token: &str, hos_authentication_logs_param: ::models::InlineObject7) -> Box<Future<Item = ::models::HosAuthenticationLogsResponse, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Post, "/fleet/hos_authentication_logs".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_body_param(hos_authentication_logs_param)
            .execute(self.configuration.borrow())
    }

    fn get_fleet_hos_logs(&self, access_token: &str, hos_logs_param: ::models::InlineObject8) -> Box<Future<Item = ::models::HosLogsResponse, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Post, "/fleet/hos_logs".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_body_param(hos_logs_param)
            .execute(self.configuration.borrow())
    }

    fn get_fleet_hos_logs_summary(&self, access_token: &str, hos_logs_param: ::models::InlineObject9) -> Box<Future<Item = ::models::HosLogsSummaryResponse, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Post, "/fleet/hos_logs_summary".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_body_param(hos_logs_param)
            .execute(self.configuration.borrow())
    }

    fn get_fleet_locations(&self, access_token: &str, group_param: ::models::InlineObject11) -> Box<Future<Item = ::models::InlineResponse2003, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Post, "/fleet/locations".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_body_param(group_param)
            .execute(self.configuration.borrow())
    }

    fn get_fleet_maintenance_list(&self, access_token: &str, group_param: ::models::InlineObject13) -> Box<Future<Item = ::models::InlineResponse2004, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Post, "/fleet/maintenance/list".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_body_param(group_param)
            .execute(self.configuration.borrow())
    }

    fn get_fleet_trips(&self, access_token: &str, trips_param: ::models::InlineObject15) -> Box<Future<Item = ::models::TripResponse, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Post, "/fleet/trips".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_body_param(trips_param)
            .execute(self.configuration.borrow())
    }

    fn get_fleet_vehicle(&self, access_token: &str, vehicle_id_or_external_id: &str) -> Box<Future<Item = ::models::FleetVehicleResponse, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/fleet/vehicles/{vehicle_id_or_external_id}".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_path_param("vehicle_id_or_external_id".to_string(), vehicle_id_or_external_id.to_string())
            .execute(self.configuration.borrow())
    }

    fn get_organization_address(&self, access_token: &str, address_id: i64) -> Box<Future<Item = ::models::Address, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/addresses/{addressId}".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_path_param("addressId".to_string(), address_id.to_string())
            .execute(self.configuration.borrow())
    }

    fn get_organization_addresses(&self, access_token: &str) -> Box<Future<Item = Vec<::models::Address>, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/addresses".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .execute(self.configuration.borrow())
    }

    fn get_organization_contact(&self, access_token: &str, contact_id: i64) -> Box<Future<Item = ::models::Contact, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/contacts/{contact_id}".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_path_param("contact_id".to_string(), contact_id.to_string())
            .execute(self.configuration.borrow())
    }

    fn get_vehicle_harsh_event(&self, vehicle_id: i64, access_token: &str, timestamp: i64) -> Box<Future<Item = ::models::VehicleHarshEventResponse, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/fleet/vehicles/{vehicleId}/safety/harsh_event".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_query_param("timestamp".to_string(), timestamp.to_string())
            .with_path_param("vehicleId".to_string(), vehicle_id.to_string())
            .execute(self.configuration.borrow())
    }

    fn get_vehicle_locations(&self, access_token: &str, vehicle_id: i64, start_ms: i64, end_ms: i64) -> Box<Future<Item = Vec<::models::FleetVehicleLocation>, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/fleet/vehicles/{vehicle_id}/locations".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_query_param("startMs".to_string(), start_ms.to_string())
            .with_query_param("endMs".to_string(), end_ms.to_string())
            .with_path_param("vehicle_id".to_string(), vehicle_id.to_string())
            .execute(self.configuration.borrow())
    }

    fn get_vehicle_safety_score(&self, vehicle_id: i64, access_token: &str, start_ms: i64, end_ms: i64) -> Box<Future<Item = ::models::VehicleSafetyScoreResponse, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/fleet/vehicles/{vehicleId}/safety/score".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_query_param("startMs".to_string(), start_ms.to_string())
            .with_query_param("endMs".to_string(), end_ms.to_string())
            .with_path_param("vehicleId".to_string(), vehicle_id.to_string())
            .execute(self.configuration.borrow())
    }

    fn get_vehicle_stats(&self, access_token: &str, start_ms: i32, end_ms: i32, series: &str, tag_ids: &str, starting_after: &str, ending_before: &str, limit: i64) -> Box<Future<Item = ::models::InlineResponse2005, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/fleet/vehicles/stats".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_query_param("startMs".to_string(), start_ms.to_string())
            .with_query_param("endMs".to_string(), end_ms.to_string())
            .with_query_param("series".to_string(), series.to_string())
            .with_query_param("tagIds".to_string(), tag_ids.to_string())
            .with_query_param("startingAfter".to_string(), starting_after.to_string())
            .with_query_param("endingBefore".to_string(), ending_before.to_string())
            .with_query_param("limit".to_string(), limit.to_string())
            .execute(self.configuration.borrow())
    }

    fn get_vehicles_locations(&self, access_token: &str, start_ms: i32, end_ms: i32) -> Box<Future<Item = Vec<Value>, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/fleet/vehicles/locations".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_query_param("startMs".to_string(), start_ms.to_string())
            .with_query_param("endMs".to_string(), end_ms.to_string())
            .execute(self.configuration.borrow())
    }

    fn list_contacts(&self, access_token: &str) -> Box<Future<Item = Vec<::models::Contact>, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Get, "/contacts".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .execute(self.configuration.borrow())
    }

    fn list_fleet(&self, access_token: &str, group_param: ::models::InlineObject10, starting_after: &str, ending_before: &str, limit: i64) -> Box<Future<Item = ::models::InlineResponse2002, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Post, "/fleet/list".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_query_param("startingAfter".to_string(), starting_after.to_string())
            .with_query_param("endingBefore".to_string(), ending_before.to_string())
            .with_query_param("limit".to_string(), limit.to_string())
            .with_body_param(group_param)
            .execute(self.configuration.borrow())
    }

    fn patch_fleet_vehicle(&self, access_token: &str, vehicle_id_or_external_id: &str, data: ::models::InlineObject16) -> Box<Future<Item = ::models::FleetVehicleResponse, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Patch, "/fleet/vehicles/{vehicle_id_or_external_id}".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_path_param("vehicle_id_or_external_id".to_string(), vehicle_id_or_external_id.to_string())
            .with_body_param(data)
            .execute(self.configuration.borrow())
    }

    fn reactivate_driver_by_id(&self, access_token: &str, driver_id_or_external_id: &str, reactivate_driver_param: ::models::InlineObject4) -> Box<Future<Item = ::models::Driver, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Put, "/fleet/drivers/inactive/{driver_id_or_external_id}".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_path_param("driver_id_or_external_id".to_string(), driver_id_or_external_id.to_string())
            .with_body_param(reactivate_driver_param)
            .execute(self.configuration.borrow())
    }

    fn update_dispatch_route_by_id(&self, access_token: &str, route_id: i64, update_dispatch_route_params: ::models::DispatchRoute) -> Box<Future<Item = ::models::DispatchRoute, Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Put, "/fleet/dispatch/routes/{route_id}".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_path_param("route_id".to_string(), route_id.to_string())
            .with_body_param(update_dispatch_route_params)
            .execute(self.configuration.borrow())
    }

    fn update_organization_address(&self, access_token: &str, address_id: i64, address: ::models::InlineObject1) -> Box<Future<Item = (), Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Patch, "/addresses/{addressId}".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_path_param("addressId".to_string(), address_id.to_string())
            .with_body_param(address)
            .returns_nothing()
            .execute(self.configuration.borrow())
    }

    fn update_vehicles(&self, access_token: &str, vehicle_update_param: ::models::InlineObject14) -> Box<Future<Item = (), Error = Error<serde_json::Value>>> {
        __internal_request::Request::new(hyper::Method::Post, "/fleet/set_data".to_string())
            .with_query_param("access_token".to_string(), access_token.to_string())
            .with_body_param(vehicle_update_param)
            .returns_nothing()
            .execute(self.configuration.borrow())
    }

}
