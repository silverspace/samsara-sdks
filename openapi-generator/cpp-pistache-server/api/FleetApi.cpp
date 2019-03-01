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

#include "FleetApi.h"
#include "Helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::helpers;
using namespace org::openapitools::server::model;

FleetApi::FleetApi(std::shared_ptr<Pistache::Rest::Router> rtr) { 
    router = rtr;
};

void FleetApi::init() {
    setupRoutes();
}

void FleetApi::setupRoutes() {
    using namespace Pistache::Rest;

    Routes::Post(*router, base + "/fleet/add_address", Routes::bind(&FleetApi::add_fleet_address_handler, this));
    Routes::Post(*router, base + "/addresses", Routes::bind(&FleetApi::add_organization_addresses_handler, this));
    Routes::Post(*router, base + "/fleet/dispatch/routes", Routes::bind(&FleetApi::create_dispatch_route_handler, this));
    Routes::Post(*router, base + "/fleet/drivers/create", Routes::bind(&FleetApi::create_driver_handler, this));
    Routes::Post(*router, base + "/fleet/drivers/:driver_id/dispatch/routes", Routes::bind(&FleetApi::create_driver_dispatch_route_handler, this));
    Routes::Post(*router, base + "/fleet/drivers/:driver_id/documents", Routes::bind(&FleetApi::create_driver_document_handler, this));
    Routes::Post(*router, base + "/fleet/maintenance/dvirs", Routes::bind(&FleetApi::create_dvir_handler, this));
    Routes::Post(*router, base + "/fleet/vehicles/:vehicle_id/dispatch/routes", Routes::bind(&FleetApi::create_vehicle_dispatch_route_handler, this));
    Routes::Delete(*router, base + "/fleet/drivers/:driver_id_or_external_id", Routes::bind(&FleetApi::deactivate_driver_handler, this));
    Routes::Delete(*router, base + "/fleet/dispatch/routes/:route_id", Routes::bind(&FleetApi::delete_dispatch_route_by_id_handler, this));
    Routes::Delete(*router, base + "/addresses/:addressId", Routes::bind(&FleetApi::delete_organization_address_handler, this));
    Routes::Get(*router, base + "/fleet/dispatch/routes", Routes::bind(&FleetApi::fetch_all_dispatch_routes_handler, this));
    Routes::Get(*router, base + "/fleet/dispatch/routes/job_updates", Routes::bind(&FleetApi::fetch_all_route_job_updates_handler, this));
    Routes::Get(*router, base + "/fleet/assets/locations", Routes::bind(&FleetApi::get_all_asset_current_locations_handler, this));
    Routes::Get(*router, base + "/fleet/assets", Routes::bind(&FleetApi::get_all_assets_handler, this));
    Routes::Get(*router, base + "/fleet/drivers/inactive", Routes::bind(&FleetApi::get_all_deactivated_drivers_handler, this));
    Routes::Get(*router, base + "/fleet/assets/:asset_id/locations", Routes::bind(&FleetApi::get_asset_location_handler, this));
    Routes::Get(*router, base + "/fleet/assets/:asset_id/reefer", Routes::bind(&FleetApi::get_asset_reefer_handler, this));
    Routes::Get(*router, base + "/fleet/drivers/inactive/:driver_id_or_external_id", Routes::bind(&FleetApi::get_deactivated_driver_by_id_handler, this));
    Routes::Get(*router, base + "/fleet/dispatch/routes/:route_id", Routes::bind(&FleetApi::get_dispatch_route_by_id_handler, this));
    Routes::Get(*router, base + "/fleet/dispatch/routes/:route_id/history", Routes::bind(&FleetApi::get_dispatch_route_history_handler, this));
    Routes::Get(*router, base + "/fleet/drivers/:driver_id/dispatch/routes", Routes::bind(&FleetApi::get_dispatch_routes_by_driver_id_handler, this));
    Routes::Get(*router, base + "/fleet/vehicles/:vehicle_id/dispatch/routes", Routes::bind(&FleetApi::get_dispatch_routes_by_vehicle_id_handler, this));
    Routes::Get(*router, base + "/fleet/drivers/:driver_id_or_external_id", Routes::bind(&FleetApi::get_driver_by_id_handler, this));
    Routes::Get(*router, base + "/fleet/drivers/document_types", Routes::bind(&FleetApi::get_driver_document_types_by_org_id_handler, this));
    Routes::Get(*router, base + "/fleet/drivers/documents", Routes::bind(&FleetApi::get_driver_documents_by_org_id_handler, this));
    Routes::Get(*router, base + "/fleet/drivers/:driverId/safety/score", Routes::bind(&FleetApi::get_driver_safety_score_handler, this));
    Routes::Get(*router, base + "/fleet/maintenance/dvirs", Routes::bind(&FleetApi::get_dvirs_handler, this));
    Routes::Post(*router, base + "/fleet/drivers", Routes::bind(&FleetApi::get_fleet_drivers_handler, this));
    Routes::Post(*router, base + "/fleet/drivers/:driver_id/hos_daily_logs", Routes::bind(&FleetApi::get_fleet_drivers_hos_daily_logs_handler, this));
    Routes::Post(*router, base + "/fleet/drivers/summary", Routes::bind(&FleetApi::get_fleet_drivers_summary_handler, this));
    Routes::Post(*router, base + "/fleet/hos_authentication_logs", Routes::bind(&FleetApi::get_fleet_hos_authentication_logs_handler, this));
    Routes::Post(*router, base + "/fleet/hos_logs", Routes::bind(&FleetApi::get_fleet_hos_logs_handler, this));
    Routes::Post(*router, base + "/fleet/hos_logs_summary", Routes::bind(&FleetApi::get_fleet_hos_logs_summary_handler, this));
    Routes::Post(*router, base + "/fleet/locations", Routes::bind(&FleetApi::get_fleet_locations_handler, this));
    Routes::Post(*router, base + "/fleet/maintenance/list", Routes::bind(&FleetApi::get_fleet_maintenance_list_handler, this));
    Routes::Post(*router, base + "/fleet/trips", Routes::bind(&FleetApi::get_fleet_trips_handler, this));
    Routes::Get(*router, base + "/fleet/vehicles/:vehicle_id_or_external_id", Routes::bind(&FleetApi::get_fleet_vehicle_handler, this));
    Routes::Get(*router, base + "/addresses/:addressId", Routes::bind(&FleetApi::get_organization_address_handler, this));
    Routes::Get(*router, base + "/addresses", Routes::bind(&FleetApi::get_organization_addresses_handler, this));
    Routes::Get(*router, base + "/contacts/:contact_id", Routes::bind(&FleetApi::get_organization_contact_handler, this));
    Routes::Get(*router, base + "/fleet/vehicles/:vehicleId/safety/harsh_event", Routes::bind(&FleetApi::get_vehicle_harsh_event_handler, this));
    Routes::Get(*router, base + "/fleet/vehicles/:vehicle_id/locations", Routes::bind(&FleetApi::get_vehicle_locations_handler, this));
    Routes::Get(*router, base + "/fleet/vehicles/:vehicleId/safety/score", Routes::bind(&FleetApi::get_vehicle_safety_score_handler, this));
    Routes::Get(*router, base + "/fleet/vehicles/stats", Routes::bind(&FleetApi::get_vehicle_stats_handler, this));
    Routes::Get(*router, base + "/fleet/vehicles/locations", Routes::bind(&FleetApi::get_vehicles_locations_handler, this));
    Routes::Get(*router, base + "/contacts", Routes::bind(&FleetApi::list_contacts_handler, this));
    Routes::Post(*router, base + "/fleet/list", Routes::bind(&FleetApi::list_fleet_handler, this));
    Routes::Patch(*router, base + "/fleet/vehicles/:vehicle_id_or_external_id", Routes::bind(&FleetApi::patch_fleet_vehicle_handler, this));
    Routes::Put(*router, base + "/fleet/drivers/inactive/:driver_id_or_external_id", Routes::bind(&FleetApi::reactivate_driver_by_id_handler, this));
    Routes::Put(*router, base + "/fleet/dispatch/routes/:route_id", Routes::bind(&FleetApi::update_dispatch_route_by_id_handler, this));
    Routes::Patch(*router, base + "/addresses/:addressId", Routes::bind(&FleetApi::update_organization_address_handler, this));
    Routes::Post(*router, base + "/fleet/set_data", Routes::bind(&FleetApi::update_vehicles_handler, this));

    // Default handler, called when a route is not found
    router->addCustomHandler(Routes::bind(&FleetApi::fleet_api_default_handler, this));
}

void FleetApi::add_fleet_address_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the body param
    
    Inline_object_2 addressParam;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      addressParam.fromJson(request_body);
    
      this->add_fleet_address(accessToken, addressParam, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::add_organization_addresses_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the body param
    
    Inline_object addresses;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      addresses.fromJson(request_body);
    
      this->add_organization_addresses(accessToken, addresses, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::create_dispatch_route_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the body param
    
    DispatchRouteCreate createDispatchRouteParams;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      createDispatchRouteParams.fromJson(request_body);
    
      this->create_dispatch_route(accessToken, createDispatchRouteParams, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::create_driver_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the body param
    
    DriverForCreate createDriverParam;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      createDriverParam.fromJson(request_body);
    
      this->create_driver(accessToken, createDriverParam, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::create_driver_dispatch_route_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto driverId = request.param(":driverId").as<int64_t>();
    
    // Getting the body param
    
    DispatchRouteCreate createDispatchRouteParams;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      createDispatchRouteParams.fromJson(request_body);
    
      this->create_driver_dispatch_route(accessToken, driverId, createDispatchRouteParams, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::create_driver_document_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto driverId = request.param(":driverId").as<int64_t>();
    
    // Getting the body param
    
    DocumentCreate createDocumentParams;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      createDocumentParams.fromJson(request_body);
    
      this->create_driver_document(accessToken, driverId, createDocumentParams, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::create_dvir_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the body param
    
    Inline_object_12 createDvirParam;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      createDvirParam.fromJson(request_body);
    
      this->create_dvir(accessToken, createDvirParam, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::create_vehicle_dispatch_route_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto vehicleId = request.param(":vehicleId").as<int64_t>();
    
    // Getting the body param
    
    DispatchRouteCreate createDispatchRouteParams;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      createDispatchRouteParams.fromJson(request_body);
    
      this->create_vehicle_dispatch_route(accessToken, vehicleId, createDispatchRouteParams, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::deactivate_driver_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto driverIdOrExternalId = request.param(":driverIdOrExternalId").as<std::string>();
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      this->deactivate_driver(accessToken, driverIdOrExternalId, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::delete_dispatch_route_by_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto routeId = request.param(":routeId").as<int64_t>();
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      this->delete_dispatch_route_by_id(accessToken, routeId, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::delete_organization_address_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto addressId = request.param(":addressId").as<int64_t>();
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      this->delete_organization_address(accessToken, addressId, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::fetch_all_dispatch_routes_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    auto groupIdQuery = request.query().get("group_id");
    Pistache::Optional<int64_t> groupId;
    if(!groupIdQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(groupIdQuery.get(), value)){
            groupId = Pistache::Some(value);
        }
    }
    auto endTimeQuery = request.query().get("end_time");
    Pistache::Optional<int64_t> endTime;
    if(!endTimeQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(endTimeQuery.get(), value)){
            endTime = Pistache::Some(value);
        }
    }
    auto durationQuery = request.query().get("duration");
    Pistache::Optional<int64_t> duration;
    if(!durationQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(durationQuery.get(), value)){
            duration = Pistache::Some(value);
        }
    }
    
    try {
      this->fetch_all_dispatch_routes(accessToken, groupId, endTime, duration, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::fetch_all_route_job_updates_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    auto groupIdQuery = request.query().get("group_id");
    Pistache::Optional<int64_t> groupId;
    if(!groupIdQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(groupIdQuery.get(), value)){
            groupId = Pistache::Some(value);
        }
    }
    auto sequenceIdQuery = request.query().get("sequence_id");
    Pistache::Optional<std::string> sequenceId;
    if(!sequenceIdQuery.isEmpty()){
        std::string value;
        if(fromStringValue(sequenceIdQuery.get(), value)){
            sequenceId = Pistache::Some(value);
        }
    }
    auto includeQuery = request.query().get("include");
    Pistache::Optional<std::string> include;
    if(!includeQuery.isEmpty()){
        std::string value;
        if(fromStringValue(includeQuery.get(), value)){
            include = Pistache::Some(value);
        }
    }
    
    try {
      this->fetch_all_route_job_updates(accessToken, groupId, sequenceId, include, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_all_asset_current_locations_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    auto groupIdQuery = request.query().get("group_id");
    Pistache::Optional<int64_t> groupId;
    if(!groupIdQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(groupIdQuery.get(), value)){
            groupId = Pistache::Some(value);
        }
    }
    
    try {
      this->get_all_asset_current_locations(accessToken, groupId, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_all_assets_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    auto groupIdQuery = request.query().get("group_id");
    Pistache::Optional<int64_t> groupId;
    if(!groupIdQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(groupIdQuery.get(), value)){
            groupId = Pistache::Some(value);
        }
    }
    
    try {
      this->get_all_assets(accessToken, groupId, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_all_deactivated_drivers_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    auto groupIdQuery = request.query().get("group_id");
    Pistache::Optional<int64_t> groupId;
    if(!groupIdQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(groupIdQuery.get(), value)){
            groupId = Pistache::Some(value);
        }
    }
    
    try {
      this->get_all_deactivated_drivers(accessToken, groupId, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_asset_location_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto assetId = request.param(":assetId").as<int64_t>();
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    auto startMsQuery = request.query().get("startMs");
    Pistache::Optional<int64_t> startMs;
    if(!startMsQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(startMsQuery.get(), value)){
            startMs = Pistache::Some(value);
        }
    }
    auto endMsQuery = request.query().get("endMs");
    Pistache::Optional<int64_t> endMs;
    if(!endMsQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(endMsQuery.get(), value)){
            endMs = Pistache::Some(value);
        }
    }
    
    try {
      this->get_asset_location(accessToken, assetId, startMs, endMs, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_asset_reefer_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto assetId = request.param(":assetId").as<int64_t>();
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    auto startMsQuery = request.query().get("startMs");
    Pistache::Optional<int64_t> startMs;
    if(!startMsQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(startMsQuery.get(), value)){
            startMs = Pistache::Some(value);
        }
    }
    auto endMsQuery = request.query().get("endMs");
    Pistache::Optional<int64_t> endMs;
    if(!endMsQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(endMsQuery.get(), value)){
            endMs = Pistache::Some(value);
        }
    }
    
    try {
      this->get_asset_reefer(accessToken, assetId, startMs, endMs, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_deactivated_driver_by_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto driverIdOrExternalId = request.param(":driverIdOrExternalId").as<std::string>();
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      this->get_deactivated_driver_by_id(accessToken, driverIdOrExternalId, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_dispatch_route_by_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto routeId = request.param(":routeId").as<int64_t>();
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      this->get_dispatch_route_by_id(accessToken, routeId, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_dispatch_route_history_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto routeId = request.param(":routeId").as<int64_t>();
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    auto startTimeQuery = request.query().get("start_time");
    Pistache::Optional<int64_t> startTime;
    if(!startTimeQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(startTimeQuery.get(), value)){
            startTime = Pistache::Some(value);
        }
    }
    auto endTimeQuery = request.query().get("end_time");
    Pistache::Optional<int64_t> endTime;
    if(!endTimeQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(endTimeQuery.get(), value)){
            endTime = Pistache::Some(value);
        }
    }
    
    try {
      this->get_dispatch_route_history(accessToken, routeId, startTime, endTime, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_dispatch_routes_by_driver_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto driverId = request.param(":driverId").as<int64_t>();
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    auto endTimeQuery = request.query().get("end_time");
    Pistache::Optional<int64_t> endTime;
    if(!endTimeQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(endTimeQuery.get(), value)){
            endTime = Pistache::Some(value);
        }
    }
    auto durationQuery = request.query().get("duration");
    Pistache::Optional<int64_t> duration;
    if(!durationQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(durationQuery.get(), value)){
            duration = Pistache::Some(value);
        }
    }
    
    try {
      this->get_dispatch_routes_by_driver_id(accessToken, driverId, endTime, duration, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_dispatch_routes_by_vehicle_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto vehicleId = request.param(":vehicleId").as<int64_t>();
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    auto endTimeQuery = request.query().get("end_time");
    Pistache::Optional<int64_t> endTime;
    if(!endTimeQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(endTimeQuery.get(), value)){
            endTime = Pistache::Some(value);
        }
    }
    auto durationQuery = request.query().get("duration");
    Pistache::Optional<int64_t> duration;
    if(!durationQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(durationQuery.get(), value)){
            duration = Pistache::Some(value);
        }
    }
    
    try {
      this->get_dispatch_routes_by_vehicle_id(accessToken, vehicleId, endTime, duration, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_driver_by_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto driverIdOrExternalId = request.param(":driverIdOrExternalId").as<std::string>();
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      this->get_driver_by_id(accessToken, driverIdOrExternalId, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_driver_document_types_by_org_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    try {
      this->get_driver_document_types_by_org_id(response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_driver_documents_by_org_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    auto endMsQuery = request.query().get("endMs");
    Pistache::Optional<int64_t> endMs;
    if(!endMsQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(endMsQuery.get(), value)){
            endMs = Pistache::Some(value);
        }
    }
    auto durationMsQuery = request.query().get("durationMs");
    Pistache::Optional<int64_t> durationMs;
    if(!durationMsQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(durationMsQuery.get(), value)){
            durationMs = Pistache::Some(value);
        }
    }
    
    try {
      this->get_driver_documents_by_org_id(accessToken, endMs, durationMs, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_driver_safety_score_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto driverId = request.param(":driverId").as<int64_t>();
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    auto startMsQuery = request.query().get("startMs");
    Pistache::Optional<int64_t> startMs;
    if(!startMsQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(startMsQuery.get(), value)){
            startMs = Pistache::Some(value);
        }
    }
    auto endMsQuery = request.query().get("endMs");
    Pistache::Optional<int64_t> endMs;
    if(!endMsQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(endMsQuery.get(), value)){
            endMs = Pistache::Some(value);
        }
    }
    
    try {
      this->get_driver_safety_score(driverId, accessToken, startMs, endMs, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_dvirs_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    auto endMsQuery = request.query().get("end_ms");
    Pistache::Optional<int32_t> endMs;
    if(!endMsQuery.isEmpty()){
        int32_t value;
        if(fromStringValue(endMsQuery.get(), value)){
            endMs = Pistache::Some(value);
        }
    }
    auto durationMsQuery = request.query().get("duration_ms");
    Pistache::Optional<int32_t> durationMs;
    if(!durationMsQuery.isEmpty()){
        int32_t value;
        if(fromStringValue(durationMsQuery.get(), value)){
            durationMs = Pistache::Some(value);
        }
    }
    auto groupIdQuery = request.query().get("group_id");
    Pistache::Optional<int32_t> groupId;
    if(!groupIdQuery.isEmpty()){
        int32_t value;
        if(fromStringValue(groupIdQuery.get(), value)){
            groupId = Pistache::Some(value);
        }
    }
    
    try {
      this->get_dvirs(accessToken, endMs, durationMs, groupId, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_fleet_drivers_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the body param
    
    Inline_object_3 groupDriversParam;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      groupDriversParam.fromJson(request_body);
    
      this->get_fleet_drivers(accessToken, groupDriversParam, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_fleet_drivers_hos_daily_logs_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto driverId = request.param(":driverId").as<int64_t>();
    
    // Getting the body param
    
    Inline_object_6 hosLogsParam;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      hosLogsParam.fromJson(request_body);
    
      this->get_fleet_drivers_hos_daily_logs(accessToken, driverId, hosLogsParam, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_fleet_drivers_summary_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the body param
    
    Inline_object_5 driversSummaryParam;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    auto snapToDayBoundsQuery = request.query().get("snap_to_day_bounds");
    Pistache::Optional<bool> snapToDayBounds;
    if(!snapToDayBoundsQuery.isEmpty()){
        bool value;
        if(fromStringValue(snapToDayBoundsQuery.get(), value)){
            snapToDayBounds = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      driversSummaryParam.fromJson(request_body);
    
      this->get_fleet_drivers_summary(accessToken, driversSummaryParam, snapToDayBounds, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_fleet_hos_authentication_logs_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the body param
    
    Inline_object_7 hosAuthenticationLogsParam;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      hosAuthenticationLogsParam.fromJson(request_body);
    
      this->get_fleet_hos_authentication_logs(accessToken, hosAuthenticationLogsParam, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_fleet_hos_logs_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the body param
    
    Inline_object_8 hosLogsParam;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      hosLogsParam.fromJson(request_body);
    
      this->get_fleet_hos_logs(accessToken, hosLogsParam, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_fleet_hos_logs_summary_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the body param
    
    Inline_object_9 hosLogsParam;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      hosLogsParam.fromJson(request_body);
    
      this->get_fleet_hos_logs_summary(accessToken, hosLogsParam, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_fleet_locations_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the body param
    
    Inline_object_11 groupParam;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      groupParam.fromJson(request_body);
    
      this->get_fleet_locations(accessToken, groupParam, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_fleet_maintenance_list_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the body param
    
    Inline_object_13 groupParam;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      groupParam.fromJson(request_body);
    
      this->get_fleet_maintenance_list(accessToken, groupParam, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_fleet_trips_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the body param
    
    Inline_object_15 tripsParam;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      tripsParam.fromJson(request_body);
    
      this->get_fleet_trips(accessToken, tripsParam, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_fleet_vehicle_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto vehicleIdOrExternalId = request.param(":vehicleIdOrExternalId").as<std::string>();
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      this->get_fleet_vehicle(accessToken, vehicleIdOrExternalId, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_organization_address_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto addressId = request.param(":addressId").as<int64_t>();
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      this->get_organization_address(accessToken, addressId, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_organization_addresses_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      this->get_organization_addresses(accessToken, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_organization_contact_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto contactId = request.param(":contactId").as<int64_t>();
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      this->get_organization_contact(accessToken, contactId, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_vehicle_harsh_event_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto vehicleId = request.param(":vehicleId").as<int64_t>();
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    auto timestampQuery = request.query().get("timestamp");
    Pistache::Optional<int64_t> timestamp;
    if(!timestampQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(timestampQuery.get(), value)){
            timestamp = Pistache::Some(value);
        }
    }
    
    try {
      this->get_vehicle_harsh_event(vehicleId, accessToken, timestamp, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_vehicle_locations_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto vehicleId = request.param(":vehicleId").as<int64_t>();
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    auto startMsQuery = request.query().get("startMs");
    Pistache::Optional<int64_t> startMs;
    if(!startMsQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(startMsQuery.get(), value)){
            startMs = Pistache::Some(value);
        }
    }
    auto endMsQuery = request.query().get("endMs");
    Pistache::Optional<int64_t> endMs;
    if(!endMsQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(endMsQuery.get(), value)){
            endMs = Pistache::Some(value);
        }
    }
    
    try {
      this->get_vehicle_locations(accessToken, vehicleId, startMs, endMs, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_vehicle_safety_score_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto vehicleId = request.param(":vehicleId").as<int64_t>();
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    auto startMsQuery = request.query().get("startMs");
    Pistache::Optional<int64_t> startMs;
    if(!startMsQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(startMsQuery.get(), value)){
            startMs = Pistache::Some(value);
        }
    }
    auto endMsQuery = request.query().get("endMs");
    Pistache::Optional<int64_t> endMs;
    if(!endMsQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(endMsQuery.get(), value)){
            endMs = Pistache::Some(value);
        }
    }
    
    try {
      this->get_vehicle_safety_score(vehicleId, accessToken, startMs, endMs, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_vehicle_stats_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    auto startMsQuery = request.query().get("startMs");
    Pistache::Optional<int32_t> startMs;
    if(!startMsQuery.isEmpty()){
        int32_t value;
        if(fromStringValue(startMsQuery.get(), value)){
            startMs = Pistache::Some(value);
        }
    }
    auto endMsQuery = request.query().get("endMs");
    Pistache::Optional<int32_t> endMs;
    if(!endMsQuery.isEmpty()){
        int32_t value;
        if(fromStringValue(endMsQuery.get(), value)){
            endMs = Pistache::Some(value);
        }
    }
    auto seriesQuery = request.query().get("series");
    Pistache::Optional<std::string> series;
    if(!seriesQuery.isEmpty()){
        std::string value;
        if(fromStringValue(seriesQuery.get(), value)){
            series = Pistache::Some(value);
        }
    }
    auto tagIdsQuery = request.query().get("tagIds");
    Pistache::Optional<std::string> tagIds;
    if(!tagIdsQuery.isEmpty()){
        std::string value;
        if(fromStringValue(tagIdsQuery.get(), value)){
            tagIds = Pistache::Some(value);
        }
    }
    auto startingAfterQuery = request.query().get("startingAfter");
    Pistache::Optional<std::string> startingAfter;
    if(!startingAfterQuery.isEmpty()){
        std::string value;
        if(fromStringValue(startingAfterQuery.get(), value)){
            startingAfter = Pistache::Some(value);
        }
    }
    auto endingBeforeQuery = request.query().get("endingBefore");
    Pistache::Optional<std::string> endingBefore;
    if(!endingBeforeQuery.isEmpty()){
        std::string value;
        if(fromStringValue(endingBeforeQuery.get(), value)){
            endingBefore = Pistache::Some(value);
        }
    }
    auto limitQuery = request.query().get("limit");
    Pistache::Optional<int64_t> limit;
    if(!limitQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(limitQuery.get(), value)){
            limit = Pistache::Some(value);
        }
    }
    
    try {
      this->get_vehicle_stats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::get_vehicles_locations_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    auto startMsQuery = request.query().get("startMs");
    Pistache::Optional<int32_t> startMs;
    if(!startMsQuery.isEmpty()){
        int32_t value;
        if(fromStringValue(startMsQuery.get(), value)){
            startMs = Pistache::Some(value);
        }
    }
    auto endMsQuery = request.query().get("endMs");
    Pistache::Optional<int32_t> endMs;
    if(!endMsQuery.isEmpty()){
        int32_t value;
        if(fromStringValue(endMsQuery.get(), value)){
            endMs = Pistache::Some(value);
        }
    }
    
    try {
      this->get_vehicles_locations(accessToken, startMs, endMs, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::list_contacts_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      this->list_contacts(accessToken, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::list_fleet_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the body param
    
    Inline_object_10 groupParam;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    auto startingAfterQuery = request.query().get("startingAfter");
    Pistache::Optional<std::string> startingAfter;
    if(!startingAfterQuery.isEmpty()){
        std::string value;
        if(fromStringValue(startingAfterQuery.get(), value)){
            startingAfter = Pistache::Some(value);
        }
    }
    auto endingBeforeQuery = request.query().get("endingBefore");
    Pistache::Optional<std::string> endingBefore;
    if(!endingBeforeQuery.isEmpty()){
        std::string value;
        if(fromStringValue(endingBeforeQuery.get(), value)){
            endingBefore = Pistache::Some(value);
        }
    }
    auto limitQuery = request.query().get("limit");
    Pistache::Optional<int64_t> limit;
    if(!limitQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(limitQuery.get(), value)){
            limit = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      groupParam.fromJson(request_body);
    
      this->list_fleet(accessToken, groupParam, startingAfter, endingBefore, limit, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::patch_fleet_vehicle_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto vehicleIdOrExternalId = request.param(":vehicleIdOrExternalId").as<std::string>();
    
    // Getting the body param
    
    Inline_object_16 data;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      data.fromJson(request_body);
    
      this->patch_fleet_vehicle(accessToken, vehicleIdOrExternalId, data, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::reactivate_driver_by_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto driverIdOrExternalId = request.param(":driverIdOrExternalId").as<std::string>();
    
    // Getting the body param
    
    Inline_object_4 reactivateDriverParam;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      reactivateDriverParam.fromJson(request_body);
    
      this->reactivate_driver_by_id(accessToken, driverIdOrExternalId, reactivateDriverParam, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::update_dispatch_route_by_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto routeId = request.param(":routeId").as<int64_t>();
    
    // Getting the body param
    
    DispatchRoute updateDispatchRouteParams;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      updateDispatchRouteParams.fromJson(request_body);
    
      this->update_dispatch_route_by_id(accessToken, routeId, updateDispatchRouteParams, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::update_organization_address_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto addressId = request.param(":addressId").as<int64_t>();
    
    // Getting the body param
    
    Inline_object_1 address;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      address.fromJson(request_body);
    
      this->update_organization_address(accessToken, addressId, address, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void FleetApi::update_vehicles_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the body param
    
    Inline_object_14 vehicleUpdateParam;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      vehicleUpdateParam.fromJson(request_body);
    
      this->update_vehicles(accessToken, vehicleUpdateParam, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}

void FleetApi::fleet_api_default_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    response.send(Pistache::Http::Code::Not_Found, "The requested method does not exist");
}

}
}
}
}

