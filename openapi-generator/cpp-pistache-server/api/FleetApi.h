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
/*
 * FleetApi.h
 *
 * 
 */

#ifndef FleetApi_H_
#define FleetApi_H_


#include <pistache/http.h>
#include <pistache/router.h>
#include <pistache/http_headers.h>
#include <pistache/optional.h>


#include "Address.h"
#include "AllRouteJobUpdates.h"
#include "AssetReeferResponse.h"
#include "Contact.h"
#include "DispatchRoute.h"
#include "DispatchRouteCreate.h"
#include "DispatchRouteHistory.h"
#include "Document.h"
#include "DocumentCreate.h"
#include "DocumentType.h"
#include "Driver.h"
#include "DriverDailyLogResponse.h"
#include "DriverForCreate.h"
#include "DriverSafetyScoreResponse.h"
#include "DriversResponse.h"
#include "DriversSummaryResponse.h"
#include "DvirBase.h"
#include "DvirListResponse.h"
#include "FleetVehicleLocation.h"
#include "FleetVehicleResponse.h"
#include "HosAuthenticationLogsResponse.h"
#include "HosLogsResponse.h"
#include "HosLogsSummaryResponse.h"
#include "Inline_object.h"
#include "Inline_object_1.h"
#include "Inline_object_10.h"
#include "Inline_object_11.h"
#include "Inline_object_12.h"
#include "Inline_object_13.h"
#include "Inline_object_14.h"
#include "Inline_object_15.h"
#include "Inline_object_16.h"
#include "Inline_object_2.h"
#include "Inline_object_3.h"
#include "Inline_object_4.h"
#include "Inline_object_5.h"
#include "Inline_object_6.h"
#include "Inline_object_7.h"
#include "Inline_object_8.h"
#include "Inline_object_9.h"
#include "Inline_response_200.h"
#include "Inline_response_200_1.h"
#include "Inline_response_200_2.h"
#include "Inline_response_200_3.h"
#include "Inline_response_200_4.h"
#include "Inline_response_200_5.h"
#include "Object.h"
#include "TripResponse.h"
#include "VehicleHarshEventResponse.h"
#include "VehicleSafetyScoreResponse.h"
#include <string>

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

class  FleetApi {
public:
    FleetApi(std::shared_ptr<Pistache::Rest::Router>);
    virtual ~FleetApi() {}
    void init();

    const std::string base = "/v1";

private:
    void setupRoutes();

    void add_fleet_address_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void add_organization_addresses_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void create_dispatch_route_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void create_driver_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void create_driver_dispatch_route_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void create_driver_document_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void create_dvir_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void create_vehicle_dispatch_route_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void deactivate_driver_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void delete_dispatch_route_by_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void delete_organization_address_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void fetch_all_dispatch_routes_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void fetch_all_route_job_updates_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_all_asset_current_locations_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_all_assets_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_all_deactivated_drivers_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_asset_location_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_asset_reefer_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_deactivated_driver_by_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_dispatch_route_by_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_dispatch_route_history_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_dispatch_routes_by_driver_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_dispatch_routes_by_vehicle_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_driver_by_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_driver_document_types_by_org_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_driver_documents_by_org_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_driver_safety_score_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_dvirs_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_fleet_drivers_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_fleet_drivers_hos_daily_logs_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_fleet_drivers_summary_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_fleet_hos_authentication_logs_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_fleet_hos_logs_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_fleet_hos_logs_summary_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_fleet_locations_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_fleet_maintenance_list_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_fleet_trips_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_fleet_vehicle_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_organization_address_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_organization_addresses_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_organization_contact_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_vehicle_harsh_event_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_vehicle_locations_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_vehicle_safety_score_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_vehicle_stats_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_vehicles_locations_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void list_contacts_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void list_fleet_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void patch_fleet_vehicle_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void reactivate_driver_by_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void update_dispatch_route_by_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void update_organization_address_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void update_vehicles_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void fleet_api_default_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);

    std::shared_ptr<Pistache::Rest::Router> router;

    /// <summary>
    /// /fleet/add_address
    /// </summary>
    /// <remarks>
    /// This method adds an address book entry to the specified group.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="addressParam"></param>
    virtual void add_fleet_address(const Pistache::Optional<std::string> &accessToken, const Inline_object_2 &addressParam, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /addresses
    /// </summary>
    /// <remarks>
    /// Add one or more addresses to the organization
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="addresses"></param>
    virtual void add_organization_addresses(const Pistache::Optional<std::string> &accessToken, const Inline_object &addresses, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/dispatch/routes
    /// </summary>
    /// <remarks>
    /// Create a new dispatch route.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="createDispatchRouteParams"></param>
    virtual void create_dispatch_route(const Pistache::Optional<std::string> &accessToken, const DispatchRouteCreate &createDispatchRouteParams, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/drivers/create
    /// </summary>
    /// <remarks>
    /// Create a new driver.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="createDriverParam">Driver creation body</param>
    virtual void create_driver(const Pistache::Optional<std::string> &accessToken, const DriverForCreate &createDriverParam, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    /// </summary>
    /// <remarks>
    /// Create a new dispatch route for the driver with driver_id.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="driverId">ID of the driver with the associated routes.</param>
    /// <param name="createDispatchRouteParams"></param>
    virtual void create_driver_dispatch_route(const Pistache::Optional<std::string> &accessToken, const int64_t &driverId, const DispatchRouteCreate &createDispatchRouteParams, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/drivers/{driver_id:[0-9]+}/documents
    /// </summary>
    /// <remarks>
    /// Create a driver document for the given driver.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="driverId">ID of the driver for whom the document is created.</param>
    /// <param name="createDocumentParams">To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.</param>
    virtual void create_driver_document(const Pistache::Optional<std::string> &accessToken, const int64_t &driverId, const DocumentCreate &createDocumentParams, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/maintenance/dvirs
    /// </summary>
    /// <remarks>
    /// Create a new dvir, marking a vehicle or trailer safe or unsafe.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="createDvirParam"></param>
    virtual void create_dvir(const Pistache::Optional<std::string> &accessToken, const Inline_object_12 &createDvirParam, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    /// </summary>
    /// <remarks>
    /// Create a new dispatch route for the vehicle with vehicle_id.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
    /// <param name="createDispatchRouteParams"></param>
    virtual void create_vehicle_dispatch_route(const Pistache::Optional<std::string> &accessToken, const int64_t &vehicleId, const DispatchRouteCreate &createDispatchRouteParams, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    /// </summary>
    /// <remarks>
    /// Deactivate a driver with the given id.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
    virtual void deactivate_driver(const Pistache::Optional<std::string> &accessToken, const std::string &driverIdOrExternalId, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/dispatch/routes/{route_id:[0-9]+}/
    /// </summary>
    /// <remarks>
    /// Delete a dispatch route and its associated jobs.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="routeId">ID of the dispatch route.</param>
    virtual void delete_dispatch_route_by_id(const Pistache::Optional<std::string> &accessToken, const int64_t &routeId, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /addresses/{addressId}
    /// </summary>
    /// <remarks>
    /// Delete an address.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="addressId">ID of the address/geofence</param>
    virtual void delete_organization_address(const Pistache::Optional<std::string> &accessToken, const int64_t &addressId, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/dispatch/routes
    /// </summary>
    /// <remarks>
    /// Fetch all of the dispatch routes for the group.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional, default to 0L)</param>
    /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional, default to 0L)</param>
    /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional, default to 0L)</param>
    virtual void fetch_all_dispatch_routes(const Pistache::Optional<std::string> &accessToken, const Pistache::Optional<int64_t> &groupId, const Pistache::Optional<int64_t> &endTime, const Pistache::Optional<int64_t> &duration, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/dispatch/routes/job_updates
    /// </summary>
    /// <remarks>
    /// Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional, default to 0L)</param>
    /// <param name="sequenceId">Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional, default to &quot;&quot;)</param>
    /// <param name="include">Optionally set include&#x3D;route to include route object in response payload. (optional, default to &quot;&quot;)</param>
    virtual void fetch_all_route_job_updates(const Pistache::Optional<std::string> &accessToken, const Pistache::Optional<int64_t> &groupId, const Pistache::Optional<std::string> &sequenceId, const Pistache::Optional<std::string> &include, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/assets/locations
    /// </summary>
    /// <remarks>
    /// Fetch current locations of all assets for the group.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional, default to 0L)</param>
    virtual void get_all_asset_current_locations(const Pistache::Optional<std::string> &accessToken, const Pistache::Optional<int64_t> &groupId, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/assets
    /// </summary>
    /// <remarks>
    /// Fetch all of the assets for the group.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional, default to 0L)</param>
    virtual void get_all_assets(const Pistache::Optional<std::string> &accessToken, const Pistache::Optional<int64_t> &groupId, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/drivers/inactive
    /// </summary>
    /// <remarks>
    /// Fetch all deactivated drivers for the group.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional, default to 0L)</param>
    virtual void get_all_deactivated_drivers(const Pistache::Optional<std::string> &accessToken, const Pistache::Optional<int64_t> &groupId, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/assets/{assetId:[0-9]+}/locations
    /// </summary>
    /// <remarks>
    /// Fetch the historical locations for the asset.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="assetId">ID of the asset</param>
    /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
    /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
    virtual void get_asset_location(const Pistache::Optional<std::string> &accessToken, const int64_t &assetId, const Pistache::Optional<int64_t> &startMs, const Pistache::Optional<int64_t> &endMs, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/assets/{assetId:[0-9]+}/reefer
    /// </summary>
    /// <remarks>
    /// Fetch the reefer-specific stats of an asset.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="assetId">ID of the asset</param>
    /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
    /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
    virtual void get_asset_reefer(const Pistache::Optional<std::string> &accessToken, const int64_t &assetId, const Pistache::Optional<int64_t> &startMs, const Pistache::Optional<int64_t> &endMs, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    /// </summary>
    /// <remarks>
    /// Fetch deactivated driver by id.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
    virtual void get_deactivated_driver_by_id(const Pistache::Optional<std::string> &accessToken, const std::string &driverIdOrExternalId, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/dispatch/routes/{route_id:[0-9]+}
    /// </summary>
    /// <remarks>
    /// Fetch a dispatch route by id.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="routeId">ID of the dispatch route.</param>
    virtual void get_dispatch_route_by_id(const Pistache::Optional<std::string> &accessToken, const int64_t &routeId, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/dispatch/routes/{route_id:[0-9]+}/history
    /// </summary>
    /// <remarks>
    /// Fetch the history of a dispatch route.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="routeId">ID of the route with history.</param>
    /// <param name="startTime">Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional, default to 0L)</param>
    /// <param name="endTime">Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional, default to 0L)</param>
    virtual void get_dispatch_route_history(const Pistache::Optional<std::string> &accessToken, const int64_t &routeId, const Pistache::Optional<int64_t> &startTime, const Pistache::Optional<int64_t> &endTime, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    /// </summary>
    /// <remarks>
    /// Fetch all of the dispatch routes for a given driver.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="driverId">ID of the driver with the associated routes.</param>
    /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional, default to 0L)</param>
    /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional, default to 0L)</param>
    virtual void get_dispatch_routes_by_driver_id(const Pistache::Optional<std::string> &accessToken, const int64_t &driverId, const Pistache::Optional<int64_t> &endTime, const Pistache::Optional<int64_t> &duration, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    /// </summary>
    /// <remarks>
    /// Fetch all of the dispatch routes for a given vehicle.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
    /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional, default to 0L)</param>
    /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional, default to 0L)</param>
    virtual void get_dispatch_routes_by_vehicle_id(const Pistache::Optional<std::string> &accessToken, const int64_t &vehicleId, const Pistache::Optional<int64_t> &endTime, const Pistache::Optional<int64_t> &duration, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    /// </summary>
    /// <remarks>
    /// Fetch driver by id.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
    virtual void get_driver_by_id(const Pistache::Optional<std::string> &accessToken, const std::string &driverIdOrExternalId, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/drivers/document_types
    /// </summary>
    /// <remarks>
    /// Fetch all of the document types.
    /// </remarks>
    virtual void get_driver_document_types_by_org_id(Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/drivers/documents
    /// </summary>
    /// <remarks>
    /// Fetch all of the documents.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="endMs">Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional, default to 0L)</param>
    /// <param name="durationMs">Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional, default to 0L)</param>
    virtual void get_driver_documents_by_org_id(const Pistache::Optional<std::string> &accessToken, const Pistache::Optional<int64_t> &endMs, const Pistache::Optional<int64_t> &durationMs, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/drivers/{driverId:[0-9]+}/safety/score
    /// </summary>
    /// <remarks>
    /// Fetch the safety score for the driver.
    /// </remarks>
    /// <param name="driverId">ID of the driver</param>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
    /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
    virtual void get_driver_safety_score(const int64_t &driverId, const Pistache::Optional<std::string> &accessToken, const Pistache::Optional<int64_t> &startMs, const Pistache::Optional<int64_t> &endMs, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/maintenance/dvirs
    /// </summary>
    /// <remarks>
    /// Get DVIRs for the org within provided time constraints
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="endMs">time in millis until the last dvir log.</param>
    /// <param name="durationMs">time in millis which corresponds to the duration before the end_ms.</param>
    /// <param name="groupId">Group ID to query. (optional, default to 0)</param>
    virtual void get_dvirs(const Pistache::Optional<std::string> &accessToken, const Pistache::Optional<int32_t> &endMs, const Pistache::Optional<int32_t> &durationMs, const Pistache::Optional<int32_t> &groupId, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/drivers
    /// </summary>
    /// <remarks>
    /// Get all the drivers for the specified group.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="groupDriversParam"></param>
    virtual void get_fleet_drivers(const Pistache::Optional<std::string> &accessToken, const Inline_object_3 &groupDriversParam, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
    /// </summary>
    /// <remarks>
    /// Get summarized daily HOS charts for a specified driver.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="driverId">ID of the driver with HOS logs.</param>
    /// <param name="hosLogsParam"></param>
    virtual void get_fleet_drivers_hos_daily_logs(const Pistache::Optional<std::string> &accessToken, const int64_t &driverId, const Inline_object_6 &hosLogsParam, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/drivers/summary
    /// </summary>
    /// <remarks>
    /// Get the distance and time each driver in an organization has driven in a given time period.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="driversSummaryParam"></param>
    /// <param name="snapToDayBounds">Snap query result to HOS day boundaries. (optional, default to false)</param>
    virtual void get_fleet_drivers_summary(const Pistache::Optional<std::string> &accessToken, const Inline_object_5 &driversSummaryParam, const Pistache::Optional<bool> &snapToDayBounds, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/hos_authentication_logs
    /// </summary>
    /// <remarks>
    /// Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="hosAuthenticationLogsParam"></param>
    virtual void get_fleet_hos_authentication_logs(const Pistache::Optional<std::string> &accessToken, const Inline_object_7 &hosAuthenticationLogsParam, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/hos_logs
    /// </summary>
    /// <remarks>
    /// Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="hosLogsParam"></param>
    virtual void get_fleet_hos_logs(const Pistache::Optional<std::string> &accessToken, const Inline_object_8 &hosLogsParam, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/hos_logs_summary
    /// </summary>
    /// <remarks>
    /// Get the current HOS status for all drivers in the group.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="hosLogsParam"></param>
    virtual void get_fleet_hos_logs_summary(const Pistache::Optional<std::string> &accessToken, const Inline_object_9 &hosLogsParam, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/locations
    /// </summary>
    /// <remarks>
    /// Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="groupParam"></param>
    virtual void get_fleet_locations(const Pistache::Optional<std::string> &accessToken, const Inline_object_11 &groupParam, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/maintenance/list
    /// </summary>
    /// <remarks>
    /// Get list of the vehicles with any engine faults or check light data.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="groupParam"></param>
    virtual void get_fleet_maintenance_list(const Pistache::Optional<std::string> &accessToken, const Inline_object_13 &groupParam, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/trips
    /// </summary>
    /// <remarks>
    /// Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="tripsParam"></param>
    virtual void get_fleet_trips(const Pistache::Optional<std::string> &accessToken, const Inline_object_15 &tripsParam, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    /// </summary>
    /// <remarks>
    /// Gets a specific vehicle.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="vehicleIdOrExternalId">ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.</param>
    virtual void get_fleet_vehicle(const Pistache::Optional<std::string> &accessToken, const std::string &vehicleIdOrExternalId, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /addresses/{addressId}
    /// </summary>
    /// <remarks>
    /// Fetch an address by its id.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="addressId">ID of the address/geofence</param>
    virtual void get_organization_address(const Pistache::Optional<std::string> &accessToken, const int64_t &addressId, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /addresses
    /// </summary>
    /// <remarks>
    /// Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    virtual void get_organization_addresses(const Pistache::Optional<std::string> &accessToken, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /contacts/{contact_id}
    /// </summary>
    /// <remarks>
    /// Fetch a contact by its id.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="contactId">ID of the contact</param>
    virtual void get_organization_contact(const Pistache::Optional<std::string> &accessToken, const int64_t &contactId, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
    /// </summary>
    /// <remarks>
    /// Fetch harsh event details for a vehicle.
    /// </remarks>
    /// <param name="vehicleId">ID of the vehicle</param>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="timestamp">Timestamp in milliseconds representing the timestamp of a harsh event.</param>
    virtual void get_vehicle_harsh_event(const int64_t &vehicleId, const Pistache::Optional<std::string> &accessToken, const Pistache::Optional<int64_t> &timestamp, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/vehicles/{vehicle_id:[0-9]+}/locations
    /// </summary>
    /// <remarks>
    /// Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
    /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)</param>
    /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)</param>
    virtual void get_vehicle_locations(const Pistache::Optional<std::string> &accessToken, const int64_t &vehicleId, const Pistache::Optional<int64_t> &startMs, const Pistache::Optional<int64_t> &endMs, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
    /// </summary>
    /// <remarks>
    /// Fetch the safety score for the vehicle.
    /// </remarks>
    /// <param name="vehicleId">ID of the vehicle</param>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
    /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
    virtual void get_vehicle_safety_score(const int64_t &vehicleId, const Pistache::Optional<std::string> &accessToken, const Pistache::Optional<int64_t> &startMs, const Pistache::Optional<int64_t> &endMs, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/vehicles/stats
    /// </summary>
    /// <remarks>
    /// Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query.</param>
    /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query.</param>
    /// <param name="series">Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional, default to &quot;&quot;)</param>
    /// <param name="tagIds">Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional, default to &quot;&quot;)</param>
    /// <param name="startingAfter">Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional, default to &quot;&quot;)</param>
    /// <param name="endingBefore">Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional, default to &quot;&quot;)</param>
    /// <param name="limit">Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional, default to 0L)</param>
    virtual void get_vehicle_stats(const Pistache::Optional<std::string> &accessToken, const Pistache::Optional<int32_t> &startMs, const Pistache::Optional<int32_t> &endMs, const Pistache::Optional<std::string> &series, const Pistache::Optional<std::string> &tagIds, const Pistache::Optional<std::string> &startingAfter, const Pistache::Optional<std::string> &endingBefore, const Pistache::Optional<int64_t> &limit, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/vehicles/locations
    /// </summary>
    /// <remarks>
    /// Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)</param>
    /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)</param>
    virtual void get_vehicles_locations(const Pistache::Optional<std::string> &accessToken, const Pistache::Optional<int32_t> &startMs, const Pistache::Optional<int32_t> &endMs, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /contacts
    /// </summary>
    /// <remarks>
    /// Fetch all contacts for the organization.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    virtual void list_contacts(const Pistache::Optional<std::string> &accessToken, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/list
    /// </summary>
    /// <remarks>
    /// Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="groupParam"></param>
    /// <param name="startingAfter">Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional, default to &quot;&quot;)</param>
    /// <param name="endingBefore">Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional, default to &quot;&quot;)</param>
    /// <param name="limit">Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional, default to 0L)</param>
    virtual void list_fleet(const Pistache::Optional<std::string> &accessToken, const Inline_object_10 &groupParam, const Pistache::Optional<std::string> &startingAfter, const Pistache::Optional<std::string> &endingBefore, const Pistache::Optional<int64_t> &limit, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    /// </summary>
    /// <remarks>
    /// Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="vehicleIdOrExternalId">ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.</param>
    /// <param name="data"></param>
    virtual void patch_fleet_vehicle(const Pistache::Optional<std::string> &accessToken, const std::string &vehicleIdOrExternalId, const Inline_object_16 &data, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    /// </summary>
    /// <remarks>
    /// Reactivate the inactive driver having id.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
    /// <param name="reactivateDriverParam"></param>
    virtual void reactivate_driver_by_id(const Pistache::Optional<std::string> &accessToken, const std::string &driverIdOrExternalId, const Inline_object_4 &reactivateDriverParam, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/dispatch/routes/{route_id:[0-9]+}/
    /// </summary>
    /// <remarks>
    /// Update a dispatch route and its associated jobs.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="routeId">ID of the dispatch route.</param>
    /// <param name="updateDispatchRouteParams"></param>
    virtual void update_dispatch_route_by_id(const Pistache::Optional<std::string> &accessToken, const int64_t &routeId, const DispatchRoute &updateDispatchRouteParams, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /addresses/{addressId}
    /// </summary>
    /// <remarks>
    /// Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="addressId">ID of the address/geofence</param>
    /// <param name="address"></param>
    virtual void update_organization_address(const Pistache::Optional<std::string> &accessToken, const int64_t &addressId, const Inline_object_1 &address, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// /fleet/set_data
    /// </summary>
    /// <remarks>
    /// This method enables the mutation of metadata for vehicles in the Samsara Cloud.
    /// </remarks>
    /// <param name="accessToken">Samsara API access token.</param>
    /// <param name="vehicleUpdateParam"></param>
    virtual void update_vehicles(const Pistache::Optional<std::string> &accessToken, const Inline_object_14 &vehicleUpdateParam, Pistache::Http::ResponseWriter &response) = 0;

};

}
}
}
}

#endif /* FleetApi_H_ */

