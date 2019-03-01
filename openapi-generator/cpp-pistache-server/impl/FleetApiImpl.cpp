/**
* Samsara API
* # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
*
* OpenAPI spec version: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/

#include "FleetApiImpl.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

FleetApiImpl::FleetApiImpl(std::shared_ptr<Pistache::Rest::Router> rtr)
    : FleetApi(rtr)
    { }

void FleetApiImpl::add_fleet_address(const Pistache::Optional<std::string> &accessToken, const Inline_object_2 &addressParam, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::add_organization_addresses(const Pistache::Optional<std::string> &accessToken, const Inline_object &addresses, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::create_dispatch_route(const Pistache::Optional<std::string> &accessToken, const DispatchRouteCreate &createDispatchRouteParams, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::create_driver(const Pistache::Optional<std::string> &accessToken, const DriverForCreate &createDriverParam, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::create_driver_dispatch_route(const Pistache::Optional<std::string> &accessToken, const int64_t &driverId, const DispatchRouteCreate &createDispatchRouteParams, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::create_driver_document(const Pistache::Optional<std::string> &accessToken, const int64_t &driverId, const DocumentCreate &createDocumentParams, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::create_dvir(const Pistache::Optional<std::string> &accessToken, const Inline_object_12 &createDvirParam, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::create_vehicle_dispatch_route(const Pistache::Optional<std::string> &accessToken, const int64_t &vehicleId, const DispatchRouteCreate &createDispatchRouteParams, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::deactivate_driver(const Pistache::Optional<std::string> &accessToken, const std::string &driverIdOrExternalId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::delete_dispatch_route_by_id(const Pistache::Optional<std::string> &accessToken, const int64_t &routeId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::delete_organization_address(const Pistache::Optional<std::string> &accessToken, const int64_t &addressId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::fetch_all_dispatch_routes(const Pistache::Optional<std::string> &accessToken, const Pistache::Optional<int64_t> &groupId, const Pistache::Optional<int64_t> &endTime, const Pistache::Optional<int64_t> &duration, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::fetch_all_route_job_updates(const Pistache::Optional<std::string> &accessToken, const Pistache::Optional<int64_t> &groupId, const Pistache::Optional<std::string> &sequenceId, const Pistache::Optional<std::string> &include, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_all_asset_current_locations(const Pistache::Optional<std::string> &accessToken, const Pistache::Optional<int64_t> &groupId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_all_assets(const Pistache::Optional<std::string> &accessToken, const Pistache::Optional<int64_t> &groupId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_all_deactivated_drivers(const Pistache::Optional<std::string> &accessToken, const Pistache::Optional<int64_t> &groupId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_asset_location(const Pistache::Optional<std::string> &accessToken, const int64_t &assetId, const Pistache::Optional<int64_t> &startMs, const Pistache::Optional<int64_t> &endMs, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_asset_reefer(const Pistache::Optional<std::string> &accessToken, const int64_t &assetId, const Pistache::Optional<int64_t> &startMs, const Pistache::Optional<int64_t> &endMs, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_deactivated_driver_by_id(const Pistache::Optional<std::string> &accessToken, const std::string &driverIdOrExternalId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_dispatch_route_by_id(const Pistache::Optional<std::string> &accessToken, const int64_t &routeId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_dispatch_route_history(const Pistache::Optional<std::string> &accessToken, const int64_t &routeId, const Pistache::Optional<int64_t> &startTime, const Pistache::Optional<int64_t> &endTime, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_dispatch_routes_by_driver_id(const Pistache::Optional<std::string> &accessToken, const int64_t &driverId, const Pistache::Optional<int64_t> &endTime, const Pistache::Optional<int64_t> &duration, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_dispatch_routes_by_vehicle_id(const Pistache::Optional<std::string> &accessToken, const int64_t &vehicleId, const Pistache::Optional<int64_t> &endTime, const Pistache::Optional<int64_t> &duration, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_driver_by_id(const Pistache::Optional<std::string> &accessToken, const std::string &driverIdOrExternalId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_driver_document_types_by_org_id(Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_driver_documents_by_org_id(const Pistache::Optional<std::string> &accessToken, const Pistache::Optional<int64_t> &endMs, const Pistache::Optional<int64_t> &durationMs, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_driver_safety_score(const int64_t &driverId, const Pistache::Optional<std::string> &accessToken, const Pistache::Optional<int64_t> &startMs, const Pistache::Optional<int64_t> &endMs, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_dvirs(const Pistache::Optional<std::string> &accessToken, const Pistache::Optional<int32_t> &endMs, const Pistache::Optional<int32_t> &durationMs, const Pistache::Optional<int32_t> &groupId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_fleet_drivers(const Pistache::Optional<std::string> &accessToken, const Inline_object_3 &groupDriversParam, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_fleet_drivers_hos_daily_logs(const Pistache::Optional<std::string> &accessToken, const int64_t &driverId, const Inline_object_6 &hosLogsParam, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_fleet_drivers_summary(const Pistache::Optional<std::string> &accessToken, const Inline_object_5 &driversSummaryParam, const Pistache::Optional<bool> &snapToDayBounds, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_fleet_hos_authentication_logs(const Pistache::Optional<std::string> &accessToken, const Inline_object_7 &hosAuthenticationLogsParam, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_fleet_hos_logs(const Pistache::Optional<std::string> &accessToken, const Inline_object_8 &hosLogsParam, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_fleet_hos_logs_summary(const Pistache::Optional<std::string> &accessToken, const Inline_object_9 &hosLogsParam, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_fleet_locations(const Pistache::Optional<std::string> &accessToken, const Inline_object_11 &groupParam, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_fleet_maintenance_list(const Pistache::Optional<std::string> &accessToken, const Inline_object_13 &groupParam, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_fleet_trips(const Pistache::Optional<std::string> &accessToken, const Inline_object_15 &tripsParam, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_fleet_vehicle(const Pistache::Optional<std::string> &accessToken, const std::string &vehicleIdOrExternalId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_organization_address(const Pistache::Optional<std::string> &accessToken, const int64_t &addressId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_organization_addresses(const Pistache::Optional<std::string> &accessToken, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_organization_contact(const Pistache::Optional<std::string> &accessToken, const int64_t &contactId, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_vehicle_harsh_event(const int64_t &vehicleId, const Pistache::Optional<std::string> &accessToken, const Pistache::Optional<int64_t> &timestamp, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_vehicle_locations(const Pistache::Optional<std::string> &accessToken, const int64_t &vehicleId, const Pistache::Optional<int64_t> &startMs, const Pistache::Optional<int64_t> &endMs, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_vehicle_safety_score(const int64_t &vehicleId, const Pistache::Optional<std::string> &accessToken, const Pistache::Optional<int64_t> &startMs, const Pistache::Optional<int64_t> &endMs, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_vehicle_stats(const Pistache::Optional<std::string> &accessToken, const Pistache::Optional<int32_t> &startMs, const Pistache::Optional<int32_t> &endMs, const Pistache::Optional<std::string> &series, const Pistache::Optional<std::string> &tagIds, const Pistache::Optional<std::string> &startingAfter, const Pistache::Optional<std::string> &endingBefore, const Pistache::Optional<int64_t> &limit, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::get_vehicles_locations(const Pistache::Optional<std::string> &accessToken, const Pistache::Optional<int32_t> &startMs, const Pistache::Optional<int32_t> &endMs, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::list_contacts(const Pistache::Optional<std::string> &accessToken, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::list_fleet(const Pistache::Optional<std::string> &accessToken, const Inline_object_10 &groupParam, const Pistache::Optional<std::string> &startingAfter, const Pistache::Optional<std::string> &endingBefore, const Pistache::Optional<int64_t> &limit, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::patch_fleet_vehicle(const Pistache::Optional<std::string> &accessToken, const std::string &vehicleIdOrExternalId, const Inline_object_16 &data, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::reactivate_driver_by_id(const Pistache::Optional<std::string> &accessToken, const std::string &driverIdOrExternalId, const Inline_object_4 &reactivateDriverParam, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::update_dispatch_route_by_id(const Pistache::Optional<std::string> &accessToken, const int64_t &routeId, const DispatchRoute &updateDispatchRouteParams, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::update_organization_address(const Pistache::Optional<std::string> &accessToken, const int64_t &addressId, const Inline_object_1 &address, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void FleetApiImpl::update_vehicles(const Pistache::Optional<std::string> &accessToken, const Inline_object_14 &vehicleUpdateParam, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}

}
}
}
}

