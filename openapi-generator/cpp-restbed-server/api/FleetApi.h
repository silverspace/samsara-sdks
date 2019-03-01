/**
 * Samsara API
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 4.0.0-SNAPSHOT.
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


#include <memory>
#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/service.hpp>

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

class  FleetApi: public restbed::Service
{
public:
	FleetApi();
	~FleetApi();
	void startService(int const& port);
	void stopService();
};


/// <summary>
/// /fleet/add_address
/// </summary>
/// <remarks>
/// This method adds an address book entry to the specified group.
/// </remarks>
class  FleetApiFleetAdd_addressResource: public restbed::Resource
{
public:
	FleetApiFleetAdd_addressResource();
    virtual ~FleetApiFleetAdd_addressResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /addresses
/// </summary>
/// <remarks>
/// Add one or more addresses to the organization
/// </remarks>
class  FleetApiAddressesResource: public restbed::Resource
{
public:
	FleetApiAddressesResource();
    virtual ~FleetApiAddressesResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/dispatch/routes
/// </summary>
/// <remarks>
/// Create a new dispatch route.
/// </remarks>
class  FleetApiFleetDispatchRoutesResource: public restbed::Resource
{
public:
	FleetApiFleetDispatchRoutesResource();
    virtual ~FleetApiFleetDispatchRoutesResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/drivers/create
/// </summary>
/// <remarks>
/// Create a new driver.
/// </remarks>
class  FleetApiFleetDriversCreateResource: public restbed::Resource
{
public:
	FleetApiFleetDriversCreateResource();
    virtual ~FleetApiFleetDriversCreateResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
/// </summary>
/// <remarks>
/// Create a new dispatch route for the driver with driver_id.
/// </remarks>
class  FleetApiFleetDriversDriver_idDispatchRoutesResource: public restbed::Resource
{
public:
	FleetApiFleetDriversDriver_idDispatchRoutesResource();
    virtual ~FleetApiFleetDriversDriver_idDispatchRoutesResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/drivers/{driver_id:[0-9]+}/documents
/// </summary>
/// <remarks>
/// Create a driver document for the given driver.
/// </remarks>
class  FleetApiFleetDriversDriver_idDocumentsResource: public restbed::Resource
{
public:
	FleetApiFleetDriversDriver_idDocumentsResource();
    virtual ~FleetApiFleetDriversDriver_idDocumentsResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/maintenance/dvirs
/// </summary>
/// <remarks>
/// Create a new dvir, marking a vehicle or trailer safe or unsafe.
/// </remarks>
class  FleetApiFleetMaintenanceDvirsResource: public restbed::Resource
{
public:
	FleetApiFleetMaintenanceDvirsResource();
    virtual ~FleetApiFleetMaintenanceDvirsResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
/// </summary>
/// <remarks>
/// Create a new dispatch route for the vehicle with vehicle_id.
/// </remarks>
class  FleetApiFleetVehiclesVehicle_idDispatchRoutesResource: public restbed::Resource
{
public:
	FleetApiFleetVehiclesVehicle_idDispatchRoutesResource();
    virtual ~FleetApiFleetVehiclesVehicle_idDispatchRoutesResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
/// </summary>
/// <remarks>
/// Deactivate a driver with the given id.
/// </remarks>
class  FleetApiFleetDriversDriver_id_or_external_idResource: public restbed::Resource
{
public:
	FleetApiFleetDriversDriver_id_or_external_idResource();
    virtual ~FleetApiFleetDriversDriver_id_or_external_idResource();
    void DELETE_method_handler(const std::shared_ptr<restbed::Session> session);
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/dispatch/routes/{route_id:[0-9]+}/
/// </summary>
/// <remarks>
/// Delete a dispatch route and its associated jobs.
/// </remarks>
class  FleetApiFleetDispatchRoutesRoute_idResource: public restbed::Resource
{
public:
	FleetApiFleetDispatchRoutesRoute_idResource();
    virtual ~FleetApiFleetDispatchRoutesRoute_idResource();
    void DELETE_method_handler(const std::shared_ptr<restbed::Session> session);
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
    void PUT_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /addresses/{addressId}
/// </summary>
/// <remarks>
/// Delete an address.
/// </remarks>
class  FleetApiAddressesAddressIdResource: public restbed::Resource
{
public:
	FleetApiAddressesAddressIdResource();
    virtual ~FleetApiAddressesAddressIdResource();
    void DELETE_method_handler(const std::shared_ptr<restbed::Session> session);
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
    void PATCH_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/dispatch/routes/job_updates
/// </summary>
/// <remarks>
/// Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
/// </remarks>
class  FleetApiFleetDispatchRoutesJob_updatesResource: public restbed::Resource
{
public:
	FleetApiFleetDispatchRoutesJob_updatesResource();
    virtual ~FleetApiFleetDispatchRoutesJob_updatesResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/assets/locations
/// </summary>
/// <remarks>
/// Fetch current locations of all assets for the group.
/// </remarks>
class  FleetApiFleetAssetsLocationsResource: public restbed::Resource
{
public:
	FleetApiFleetAssetsLocationsResource();
    virtual ~FleetApiFleetAssetsLocationsResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/assets
/// </summary>
/// <remarks>
/// Fetch all of the assets for the group.
/// </remarks>
class  FleetApiFleetAssetsResource: public restbed::Resource
{
public:
	FleetApiFleetAssetsResource();
    virtual ~FleetApiFleetAssetsResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/drivers/inactive
/// </summary>
/// <remarks>
/// Fetch all deactivated drivers for the group.
/// </remarks>
class  FleetApiFleetDriversInactiveResource: public restbed::Resource
{
public:
	FleetApiFleetDriversInactiveResource();
    virtual ~FleetApiFleetDriversInactiveResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/assets/{assetId:[0-9]+}/locations
/// </summary>
/// <remarks>
/// Fetch the historical locations for the asset.
/// </remarks>
class  FleetApiFleetAssetsAsset_idLocationsResource: public restbed::Resource
{
public:
	FleetApiFleetAssetsAsset_idLocationsResource();
    virtual ~FleetApiFleetAssetsAsset_idLocationsResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/assets/{assetId:[0-9]+}/reefer
/// </summary>
/// <remarks>
/// Fetch the reefer-specific stats of an asset.
/// </remarks>
class  FleetApiFleetAssetsAsset_idReeferResource: public restbed::Resource
{
public:
	FleetApiFleetAssetsAsset_idReeferResource();
    virtual ~FleetApiFleetAssetsAsset_idReeferResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
/// </summary>
/// <remarks>
/// Fetch deactivated driver by id.
/// </remarks>
class  FleetApiFleetDriversInactiveDriver_id_or_external_idResource: public restbed::Resource
{
public:
	FleetApiFleetDriversInactiveDriver_id_or_external_idResource();
    virtual ~FleetApiFleetDriversInactiveDriver_id_or_external_idResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
    void PUT_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/dispatch/routes/{route_id:[0-9]+}/history
/// </summary>
/// <remarks>
/// Fetch the history of a dispatch route.
/// </remarks>
class  FleetApiFleetDispatchRoutesRoute_idHistoryResource: public restbed::Resource
{
public:
	FleetApiFleetDispatchRoutesRoute_idHistoryResource();
    virtual ~FleetApiFleetDispatchRoutesRoute_idHistoryResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/drivers/document_types
/// </summary>
/// <remarks>
/// Fetch all of the document types.
/// </remarks>
class  FleetApiFleetDriversDocument_typesResource: public restbed::Resource
{
public:
	FleetApiFleetDriversDocument_typesResource();
    virtual ~FleetApiFleetDriversDocument_typesResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/drivers/documents
/// </summary>
/// <remarks>
/// Fetch all of the documents.
/// </remarks>
class  FleetApiFleetDriversDocumentsResource: public restbed::Resource
{
public:
	FleetApiFleetDriversDocumentsResource();
    virtual ~FleetApiFleetDriversDocumentsResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/drivers/{driverId:[0-9]+}/safety/score
/// </summary>
/// <remarks>
/// Fetch the safety score for the driver.
/// </remarks>
class  FleetApiFleetDriversDriverIdSafetyScoreResource: public restbed::Resource
{
public:
	FleetApiFleetDriversDriverIdSafetyScoreResource();
    virtual ~FleetApiFleetDriversDriverIdSafetyScoreResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/drivers
/// </summary>
/// <remarks>
/// Get all the drivers for the specified group.
/// </remarks>
class  FleetApiFleetDriversResource: public restbed::Resource
{
public:
	FleetApiFleetDriversResource();
    virtual ~FleetApiFleetDriversResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
/// </summary>
/// <remarks>
/// Get summarized daily HOS charts for a specified driver.
/// </remarks>
class  FleetApiFleetDriversDriver_idHos_daily_logsResource: public restbed::Resource
{
public:
	FleetApiFleetDriversDriver_idHos_daily_logsResource();
    virtual ~FleetApiFleetDriversDriver_idHos_daily_logsResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/drivers/summary
/// </summary>
/// <remarks>
/// Get the distance and time each driver in an organization has driven in a given time period.
/// </remarks>
class  FleetApiFleetDriversSummaryResource: public restbed::Resource
{
public:
	FleetApiFleetDriversSummaryResource();
    virtual ~FleetApiFleetDriversSummaryResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/hos_authentication_logs
/// </summary>
/// <remarks>
/// Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
/// </remarks>
class  FleetApiFleetHos_authentication_logsResource: public restbed::Resource
{
public:
	FleetApiFleetHos_authentication_logsResource();
    virtual ~FleetApiFleetHos_authentication_logsResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/hos_logs
/// </summary>
/// <remarks>
/// Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
/// </remarks>
class  FleetApiFleetHos_logsResource: public restbed::Resource
{
public:
	FleetApiFleetHos_logsResource();
    virtual ~FleetApiFleetHos_logsResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/hos_logs_summary
/// </summary>
/// <remarks>
/// Get the current HOS status for all drivers in the group.
/// </remarks>
class  FleetApiFleetHos_logs_summaryResource: public restbed::Resource
{
public:
	FleetApiFleetHos_logs_summaryResource();
    virtual ~FleetApiFleetHos_logs_summaryResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/locations
/// </summary>
/// <remarks>
/// Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
/// </remarks>
class  FleetApiFleetLocationsResource: public restbed::Resource
{
public:
	FleetApiFleetLocationsResource();
    virtual ~FleetApiFleetLocationsResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/maintenance/list
/// </summary>
/// <remarks>
/// Get list of the vehicles with any engine faults or check light data.
/// </remarks>
class  FleetApiFleetMaintenanceListResource: public restbed::Resource
{
public:
	FleetApiFleetMaintenanceListResource();
    virtual ~FleetApiFleetMaintenanceListResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/trips
/// </summary>
/// <remarks>
/// Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
/// </remarks>
class  FleetApiFleetTripsResource: public restbed::Resource
{
public:
	FleetApiFleetTripsResource();
    virtual ~FleetApiFleetTripsResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
/// </summary>
/// <remarks>
/// Gets a specific vehicle.
/// </remarks>
class  FleetApiFleetVehiclesVehicle_id_or_external_idResource: public restbed::Resource
{
public:
	FleetApiFleetVehiclesVehicle_id_or_external_idResource();
    virtual ~FleetApiFleetVehiclesVehicle_id_or_external_idResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
    void PATCH_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /contacts/{contact_id}
/// </summary>
/// <remarks>
/// Fetch a contact by its id.
/// </remarks>
class  FleetApiContactsContact_idResource: public restbed::Resource
{
public:
	FleetApiContactsContact_idResource();
    virtual ~FleetApiContactsContact_idResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
/// </summary>
/// <remarks>
/// Fetch harsh event details for a vehicle.
/// </remarks>
class  FleetApiFleetVehiclesVehicleIdSafetyHarsh_eventResource: public restbed::Resource
{
public:
	FleetApiFleetVehiclesVehicleIdSafetyHarsh_eventResource();
    virtual ~FleetApiFleetVehiclesVehicleIdSafetyHarsh_eventResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/vehicles/{vehicle_id:[0-9]+}/locations
/// </summary>
/// <remarks>
/// Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
/// </remarks>
class  FleetApiFleetVehiclesVehicle_idLocationsResource: public restbed::Resource
{
public:
	FleetApiFleetVehiclesVehicle_idLocationsResource();
    virtual ~FleetApiFleetVehiclesVehicle_idLocationsResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
/// </summary>
/// <remarks>
/// Fetch the safety score for the vehicle.
/// </remarks>
class  FleetApiFleetVehiclesVehicleIdSafetyScoreResource: public restbed::Resource
{
public:
	FleetApiFleetVehiclesVehicleIdSafetyScoreResource();
    virtual ~FleetApiFleetVehiclesVehicleIdSafetyScoreResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/vehicles/stats
/// </summary>
/// <remarks>
/// Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
/// </remarks>
class  FleetApiFleetVehiclesStatsResource: public restbed::Resource
{
public:
	FleetApiFleetVehiclesStatsResource();
    virtual ~FleetApiFleetVehiclesStatsResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/vehicles/locations
/// </summary>
/// <remarks>
/// Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
/// </remarks>
class  FleetApiFleetVehiclesLocationsResource: public restbed::Resource
{
public:
	FleetApiFleetVehiclesLocationsResource();
    virtual ~FleetApiFleetVehiclesLocationsResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /contacts
/// </summary>
/// <remarks>
/// Fetch all contacts for the organization.
/// </remarks>
class  FleetApiContactsResource: public restbed::Resource
{
public:
	FleetApiContactsResource();
    virtual ~FleetApiContactsResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/list
/// </summary>
/// <remarks>
/// Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
/// </remarks>
class  FleetApiFleetListResource: public restbed::Resource
{
public:
	FleetApiFleetListResource();
    virtual ~FleetApiFleetListResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// /fleet/set_data
/// </summary>
/// <remarks>
/// This method enables the mutation of metadata for vehicles in the Samsara Cloud.
/// </remarks>
class  FleetApiFleetSet_dataResource: public restbed::Resource
{
public:
	FleetApiFleetSet_dataResource();
    virtual ~FleetApiFleetSet_dataResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
};


}
}
}
}

#endif /* FleetApi_H_ */

