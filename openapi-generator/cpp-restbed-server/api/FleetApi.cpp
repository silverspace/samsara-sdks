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


#include <corvusoft/restbed/byte.hpp>
#include <corvusoft/restbed/string.hpp>
#include <corvusoft/restbed/settings.hpp>
#include <corvusoft/restbed/request.hpp>

#include "FleetApi.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

FleetApi::FleetApi() {
	std::shared_ptr<FleetApiFleetAdd_addressResource> spFleetApiFleetAdd_addressResource = std::make_shared<FleetApiFleetAdd_addressResource>();
	this->publish(spFleetApiFleetAdd_addressResource);
	
	std::shared_ptr<FleetApiAddressesResource> spFleetApiAddressesResource = std::make_shared<FleetApiAddressesResource>();
	this->publish(spFleetApiAddressesResource);
	
	std::shared_ptr<FleetApiFleetDispatchRoutesResource> spFleetApiFleetDispatchRoutesResource = std::make_shared<FleetApiFleetDispatchRoutesResource>();
	this->publish(spFleetApiFleetDispatchRoutesResource);
	
	std::shared_ptr<FleetApiFleetDriversCreateResource> spFleetApiFleetDriversCreateResource = std::make_shared<FleetApiFleetDriversCreateResource>();
	this->publish(spFleetApiFleetDriversCreateResource);
	
	std::shared_ptr<FleetApiFleetDriversDriver_idDispatchRoutesResource> spFleetApiFleetDriversDriver_idDispatchRoutesResource = std::make_shared<FleetApiFleetDriversDriver_idDispatchRoutesResource>();
	this->publish(spFleetApiFleetDriversDriver_idDispatchRoutesResource);
	
	std::shared_ptr<FleetApiFleetDriversDriver_idDocumentsResource> spFleetApiFleetDriversDriver_idDocumentsResource = std::make_shared<FleetApiFleetDriversDriver_idDocumentsResource>();
	this->publish(spFleetApiFleetDriversDriver_idDocumentsResource);
	
	std::shared_ptr<FleetApiFleetMaintenanceDvirsResource> spFleetApiFleetMaintenanceDvirsResource = std::make_shared<FleetApiFleetMaintenanceDvirsResource>();
	this->publish(spFleetApiFleetMaintenanceDvirsResource);
	
	std::shared_ptr<FleetApiFleetVehiclesVehicle_idDispatchRoutesResource> spFleetApiFleetVehiclesVehicle_idDispatchRoutesResource = std::make_shared<FleetApiFleetVehiclesVehicle_idDispatchRoutesResource>();
	this->publish(spFleetApiFleetVehiclesVehicle_idDispatchRoutesResource);
	
	std::shared_ptr<FleetApiFleetDriversDriver_id_or_external_idResource> spFleetApiFleetDriversDriver_id_or_external_idResource = std::make_shared<FleetApiFleetDriversDriver_id_or_external_idResource>();
	this->publish(spFleetApiFleetDriversDriver_id_or_external_idResource);
	
	std::shared_ptr<FleetApiFleetDispatchRoutesRoute_idResource> spFleetApiFleetDispatchRoutesRoute_idResource = std::make_shared<FleetApiFleetDispatchRoutesRoute_idResource>();
	this->publish(spFleetApiFleetDispatchRoutesRoute_idResource);
	
	std::shared_ptr<FleetApiAddressesAddressIdResource> spFleetApiAddressesAddressIdResource = std::make_shared<FleetApiAddressesAddressIdResource>();
	this->publish(spFleetApiAddressesAddressIdResource);
	
	std::shared_ptr<FleetApiFleetDispatchRoutesJob_updatesResource> spFleetApiFleetDispatchRoutesJob_updatesResource = std::make_shared<FleetApiFleetDispatchRoutesJob_updatesResource>();
	this->publish(spFleetApiFleetDispatchRoutesJob_updatesResource);
	
	std::shared_ptr<FleetApiFleetAssetsLocationsResource> spFleetApiFleetAssetsLocationsResource = std::make_shared<FleetApiFleetAssetsLocationsResource>();
	this->publish(spFleetApiFleetAssetsLocationsResource);
	
	std::shared_ptr<FleetApiFleetAssetsResource> spFleetApiFleetAssetsResource = std::make_shared<FleetApiFleetAssetsResource>();
	this->publish(spFleetApiFleetAssetsResource);
	
	std::shared_ptr<FleetApiFleetDriversInactiveResource> spFleetApiFleetDriversInactiveResource = std::make_shared<FleetApiFleetDriversInactiveResource>();
	this->publish(spFleetApiFleetDriversInactiveResource);
	
	std::shared_ptr<FleetApiFleetAssetsAsset_idLocationsResource> spFleetApiFleetAssetsAsset_idLocationsResource = std::make_shared<FleetApiFleetAssetsAsset_idLocationsResource>();
	this->publish(spFleetApiFleetAssetsAsset_idLocationsResource);
	
	std::shared_ptr<FleetApiFleetAssetsAsset_idReeferResource> spFleetApiFleetAssetsAsset_idReeferResource = std::make_shared<FleetApiFleetAssetsAsset_idReeferResource>();
	this->publish(spFleetApiFleetAssetsAsset_idReeferResource);
	
	std::shared_ptr<FleetApiFleetDriversInactiveDriver_id_or_external_idResource> spFleetApiFleetDriversInactiveDriver_id_or_external_idResource = std::make_shared<FleetApiFleetDriversInactiveDriver_id_or_external_idResource>();
	this->publish(spFleetApiFleetDriversInactiveDriver_id_or_external_idResource);
	
	std::shared_ptr<FleetApiFleetDispatchRoutesRoute_idHistoryResource> spFleetApiFleetDispatchRoutesRoute_idHistoryResource = std::make_shared<FleetApiFleetDispatchRoutesRoute_idHistoryResource>();
	this->publish(spFleetApiFleetDispatchRoutesRoute_idHistoryResource);
	
	std::shared_ptr<FleetApiFleetDriversDocument_typesResource> spFleetApiFleetDriversDocument_typesResource = std::make_shared<FleetApiFleetDriversDocument_typesResource>();
	this->publish(spFleetApiFleetDriversDocument_typesResource);
	
	std::shared_ptr<FleetApiFleetDriversDocumentsResource> spFleetApiFleetDriversDocumentsResource = std::make_shared<FleetApiFleetDriversDocumentsResource>();
	this->publish(spFleetApiFleetDriversDocumentsResource);
	
	std::shared_ptr<FleetApiFleetDriversDriverIdSafetyScoreResource> spFleetApiFleetDriversDriverIdSafetyScoreResource = std::make_shared<FleetApiFleetDriversDriverIdSafetyScoreResource>();
	this->publish(spFleetApiFleetDriversDriverIdSafetyScoreResource);
	
	std::shared_ptr<FleetApiFleetDriversResource> spFleetApiFleetDriversResource = std::make_shared<FleetApiFleetDriversResource>();
	this->publish(spFleetApiFleetDriversResource);
	
	std::shared_ptr<FleetApiFleetDriversDriver_idHos_daily_logsResource> spFleetApiFleetDriversDriver_idHos_daily_logsResource = std::make_shared<FleetApiFleetDriversDriver_idHos_daily_logsResource>();
	this->publish(spFleetApiFleetDriversDriver_idHos_daily_logsResource);
	
	std::shared_ptr<FleetApiFleetDriversSummaryResource> spFleetApiFleetDriversSummaryResource = std::make_shared<FleetApiFleetDriversSummaryResource>();
	this->publish(spFleetApiFleetDriversSummaryResource);
	
	std::shared_ptr<FleetApiFleetHos_authentication_logsResource> spFleetApiFleetHos_authentication_logsResource = std::make_shared<FleetApiFleetHos_authentication_logsResource>();
	this->publish(spFleetApiFleetHos_authentication_logsResource);
	
	std::shared_ptr<FleetApiFleetHos_logsResource> spFleetApiFleetHos_logsResource = std::make_shared<FleetApiFleetHos_logsResource>();
	this->publish(spFleetApiFleetHos_logsResource);
	
	std::shared_ptr<FleetApiFleetHos_logs_summaryResource> spFleetApiFleetHos_logs_summaryResource = std::make_shared<FleetApiFleetHos_logs_summaryResource>();
	this->publish(spFleetApiFleetHos_logs_summaryResource);
	
	std::shared_ptr<FleetApiFleetLocationsResource> spFleetApiFleetLocationsResource = std::make_shared<FleetApiFleetLocationsResource>();
	this->publish(spFleetApiFleetLocationsResource);
	
	std::shared_ptr<FleetApiFleetMaintenanceListResource> spFleetApiFleetMaintenanceListResource = std::make_shared<FleetApiFleetMaintenanceListResource>();
	this->publish(spFleetApiFleetMaintenanceListResource);
	
	std::shared_ptr<FleetApiFleetTripsResource> spFleetApiFleetTripsResource = std::make_shared<FleetApiFleetTripsResource>();
	this->publish(spFleetApiFleetTripsResource);
	
	std::shared_ptr<FleetApiFleetVehiclesVehicle_id_or_external_idResource> spFleetApiFleetVehiclesVehicle_id_or_external_idResource = std::make_shared<FleetApiFleetVehiclesVehicle_id_or_external_idResource>();
	this->publish(spFleetApiFleetVehiclesVehicle_id_or_external_idResource);
	
	std::shared_ptr<FleetApiContactsContact_idResource> spFleetApiContactsContact_idResource = std::make_shared<FleetApiContactsContact_idResource>();
	this->publish(spFleetApiContactsContact_idResource);
	
	std::shared_ptr<FleetApiFleetVehiclesVehicleIdSafetyHarsh_eventResource> spFleetApiFleetVehiclesVehicleIdSafetyHarsh_eventResource = std::make_shared<FleetApiFleetVehiclesVehicleIdSafetyHarsh_eventResource>();
	this->publish(spFleetApiFleetVehiclesVehicleIdSafetyHarsh_eventResource);
	
	std::shared_ptr<FleetApiFleetVehiclesVehicle_idLocationsResource> spFleetApiFleetVehiclesVehicle_idLocationsResource = std::make_shared<FleetApiFleetVehiclesVehicle_idLocationsResource>();
	this->publish(spFleetApiFleetVehiclesVehicle_idLocationsResource);
	
	std::shared_ptr<FleetApiFleetVehiclesVehicleIdSafetyScoreResource> spFleetApiFleetVehiclesVehicleIdSafetyScoreResource = std::make_shared<FleetApiFleetVehiclesVehicleIdSafetyScoreResource>();
	this->publish(spFleetApiFleetVehiclesVehicleIdSafetyScoreResource);
	
	std::shared_ptr<FleetApiFleetVehiclesStatsResource> spFleetApiFleetVehiclesStatsResource = std::make_shared<FleetApiFleetVehiclesStatsResource>();
	this->publish(spFleetApiFleetVehiclesStatsResource);
	
	std::shared_ptr<FleetApiFleetVehiclesLocationsResource> spFleetApiFleetVehiclesLocationsResource = std::make_shared<FleetApiFleetVehiclesLocationsResource>();
	this->publish(spFleetApiFleetVehiclesLocationsResource);
	
	std::shared_ptr<FleetApiContactsResource> spFleetApiContactsResource = std::make_shared<FleetApiContactsResource>();
	this->publish(spFleetApiContactsResource);
	
	std::shared_ptr<FleetApiFleetListResource> spFleetApiFleetListResource = std::make_shared<FleetApiFleetListResource>();
	this->publish(spFleetApiFleetListResource);
	
	std::shared_ptr<FleetApiFleetSet_dataResource> spFleetApiFleetSet_dataResource = std::make_shared<FleetApiFleetSet_dataResource>();
	this->publish(spFleetApiFleetSet_dataResource);
	
}

FleetApi::~FleetApi() {}

void FleetApi::startService(int const& port) {
	std::shared_ptr<restbed::Settings> settings = std::make_shared<restbed::Settings>();
	settings->set_port(port);
	settings->set_root("/v1");
	
	this->start(settings);
}

void FleetApi::stopService() {
	this->stop();
}

FleetApiFleetAdd_addressResource::FleetApiFleetAdd_addressResource()
{
	this->set_path("/fleet/add_address/");
	this->set_method_handler("POST",
		std::bind(&FleetApiFleetAdd_addressResource::POST_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetAdd_addressResource::~FleetApiFleetAdd_addressResource()
{
}

void FleetApiFleetAdd_addressResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));
			/**
			 * Get body params or form params here from the requestBody string
			 */
			
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Address was successfully added. No response body is returned.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}



FleetApiAddressesResource::FleetApiAddressesResource()
{
	this->set_path("/addresses/");
	this->set_method_handler("POST",
		std::bind(&FleetApiAddressesResource::POST_method_handler, this,
			std::placeholders::_1));
	this->set_method_handler("GET",
		std::bind(&FleetApiAddressesResource::GET_method_handler, this,
			std::placeholders::_1));
}

FleetApiAddressesResource::~FleetApiAddressesResource()
{
}

void FleetApiAddressesResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));
			/**
			 * Get body params or form params here from the requestBody string
			 */
			
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "List of added addresses/geofences. For each address entry, the geofence field will only be populated with either &#39;circle&#39; or &#39;polygon&#39;, depending on the geofence type. Circle geofences added without a specific lat/lng are geocoded asynchronously, and will be 0,0 in the immediate response.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}

void FleetApiAddressesResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();

			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				std::shared_ptr<Address> response = NULL;
				session->close(200, "List of addresses/geofences. For each address entry, the geofence field will only be populated with either &#39;circle&#39; or &#39;polygon&#39;, depending on the geofence type.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				std::shared_ptr<std::string> response = NULL;
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}


FleetApiFleetDispatchRoutesResource::FleetApiFleetDispatchRoutesResource()
{
	this->set_path("/fleet/dispatch/routes/");
	this->set_method_handler("POST",
		std::bind(&FleetApiFleetDispatchRoutesResource::POST_method_handler, this,
			std::placeholders::_1));
	this->set_method_handler("GET",
		std::bind(&FleetApiFleetDispatchRoutesResource::GET_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetDispatchRoutesResource::~FleetApiFleetDispatchRoutesResource()
{
}

void FleetApiFleetDispatchRoutesResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));
			/**
			 * Get body params or form params here from the requestBody string
			 */
			
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Created route object including the new route ID.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}

void FleetApiFleetDispatchRoutesResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();

			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");
			const int64_t groupId = request->get_query_parameter("groupId", 0L);
			const int64_t endTime = request->get_query_parameter("endTime", 0L);
			const int64_t duration = request->get_query_parameter("duration", 0L);

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				std::shared_ptr<DispatchRoute> response = NULL;
				session->close(200, "All dispatch route objects for the group.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				std::shared_ptr<std::string> response = NULL;
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}


FleetApiFleetDriversCreateResource::FleetApiFleetDriversCreateResource()
{
	this->set_path("/fleet/drivers/create/");
	this->set_method_handler("POST",
		std::bind(&FleetApiFleetDriversCreateResource::POST_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetDriversCreateResource::~FleetApiFleetDriversCreateResource()
{
}

void FleetApiFleetDriversCreateResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));
			/**
			 * Get body params or form params here from the requestBody string
			 */
			
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Returns the successfully created the driver.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}



FleetApiFleetDriversDriver_idDispatchRoutesResource::FleetApiFleetDriversDriver_idDispatchRoutesResource()
{
	this->set_path("/fleet/drivers/{driver_id: .*}/dispatch/routes/");
	this->set_method_handler("POST",
		std::bind(&FleetApiFleetDriversDriver_idDispatchRoutesResource::POST_method_handler, this,
			std::placeholders::_1));
	this->set_method_handler("GET",
		std::bind(&FleetApiFleetDriversDriver_idDispatchRoutesResource::GET_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetDriversDriver_idDispatchRoutesResource::~FleetApiFleetDriversDriver_idDispatchRoutesResource()
{
}

void FleetApiFleetDriversDriver_idDispatchRoutesResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));
			/**
			 * Get body params or form params here from the requestBody string
			 */
			
			// Getting the path params
			const int64_t driverId = request->get_path_parameter("driverId", 0L);
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Created route object including the new route ID.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}

void FleetApiFleetDriversDriver_idDispatchRoutesResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();

			// Getting the path params
			const int64_t driverId = request->get_path_parameter("driverId", 0L);
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");
			const int64_t endTime = request->get_query_parameter("endTime", 0L);
			const int64_t duration = request->get_query_parameter("duration", 0L);

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				std::shared_ptr<DispatchRoute> response = NULL;
				session->close(200, "Returns the dispatch routes for the given driver_id.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				std::shared_ptr<std::string> response = NULL;
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}


FleetApiFleetDriversDriver_idDocumentsResource::FleetApiFleetDriversDriver_idDocumentsResource()
{
	this->set_path("/fleet/drivers/{driver_id: .*}/documents/");
	this->set_method_handler("POST",
		std::bind(&FleetApiFleetDriversDriver_idDocumentsResource::POST_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetDriversDriver_idDocumentsResource::~FleetApiFleetDriversDriver_idDocumentsResource()
{
}

void FleetApiFleetDriversDriver_idDocumentsResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));
			/**
			 * Get body params or form params here from the requestBody string
			 */
			
			// Getting the path params
			const int64_t driverId = request->get_path_parameter("driverId", 0L);
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Returns the created document.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}



FleetApiFleetMaintenanceDvirsResource::FleetApiFleetMaintenanceDvirsResource()
{
	this->set_path("/fleet/maintenance/dvirs/");
	this->set_method_handler("POST",
		std::bind(&FleetApiFleetMaintenanceDvirsResource::POST_method_handler, this,
			std::placeholders::_1));
	this->set_method_handler("GET",
		std::bind(&FleetApiFleetMaintenanceDvirsResource::GET_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetMaintenanceDvirsResource::~FleetApiFleetMaintenanceDvirsResource()
{
}

void FleetApiFleetMaintenanceDvirsResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));
			/**
			 * Get body params or form params here from the requestBody string
			 */
			
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Newly created DVIR.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}

void FleetApiFleetMaintenanceDvirsResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();

			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");
			const int32_t endMs = request->get_query_parameter("endMs", 0);
			const int32_t durationMs = request->get_query_parameter("durationMs", 0);
			const int32_t groupId = request->get_query_parameter("groupId", 0);

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				std::shared_ptr<DvirListResponse> response = NULL;
				session->close(200, "DVIRs for the specified duration.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				std::shared_ptr<std::string> response = NULL;
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}


FleetApiFleetVehiclesVehicle_idDispatchRoutesResource::FleetApiFleetVehiclesVehicle_idDispatchRoutesResource()
{
	this->set_path("/fleet/vehicles/{vehicle_id: .*}/dispatch/routes/");
	this->set_method_handler("POST",
		std::bind(&FleetApiFleetVehiclesVehicle_idDispatchRoutesResource::POST_method_handler, this,
			std::placeholders::_1));
	this->set_method_handler("GET",
		std::bind(&FleetApiFleetVehiclesVehicle_idDispatchRoutesResource::GET_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetVehiclesVehicle_idDispatchRoutesResource::~FleetApiFleetVehiclesVehicle_idDispatchRoutesResource()
{
}

void FleetApiFleetVehiclesVehicle_idDispatchRoutesResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));
			/**
			 * Get body params or form params here from the requestBody string
			 */
			
			// Getting the path params
			const int64_t vehicleId = request->get_path_parameter("vehicleId", 0L);
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Created route object including the new route ID.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}

void FleetApiFleetVehiclesVehicle_idDispatchRoutesResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();

			// Getting the path params
			const int64_t vehicleId = request->get_path_parameter("vehicleId", 0L);
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");
			const int64_t endTime = request->get_query_parameter("endTime", 0L);
			const int64_t duration = request->get_query_parameter("duration", 0L);

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				std::shared_ptr<DispatchRoute> response = NULL;
				session->close(200, "Returns all of the dispatch routes for the given vehicle_id.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				std::shared_ptr<std::string> response = NULL;
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}


FleetApiFleetDriversDriver_id_or_external_idResource::FleetApiFleetDriversDriver_id_or_external_idResource()
{
	this->set_path("/fleet/drivers/{driver_id_or_external_id: .*}/");
	this->set_method_handler("DELETE",
		std::bind(&FleetApiFleetDriversDriver_id_or_external_idResource::DELETE_method_handler, this,
			std::placeholders::_1));
	this->set_method_handler("GET",
		std::bind(&FleetApiFleetDriversDriver_id_or_external_idResource::GET_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetDriversDriver_id_or_external_idResource::~FleetApiFleetDriversDriver_id_or_external_idResource()
{
}

void FleetApiFleetDriversDriver_id_or_external_idResource::DELETE_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
			
			// Getting the path params
			const std::string driverIdOrExternalId = request->get_path_parameter("driverIdOrExternalId", "");
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Successfully deactivated the driver, which is now referenced by /fleet/drivers/inactive/{driver_id}.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}

void FleetApiFleetDriversDriver_id_or_external_idResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();

			// Getting the path params
			const std::string driverIdOrExternalId = request->get_path_parameter("driverIdOrExternalId", "");
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				std::shared_ptr<Driver> response = NULL;
				session->close(200, "Returns the driver for the given driver_id.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				std::shared_ptr<std::string> response = NULL;
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}


FleetApiFleetDispatchRoutesRoute_idResource::FleetApiFleetDispatchRoutesRoute_idResource()
{
	this->set_path("/fleet/dispatch/routes/{route_id: .*}/");
	this->set_method_handler("DELETE",
		std::bind(&FleetApiFleetDispatchRoutesRoute_idResource::DELETE_method_handler, this,
			std::placeholders::_1));
	this->set_method_handler("GET",
		std::bind(&FleetApiFleetDispatchRoutesRoute_idResource::GET_method_handler, this,
			std::placeholders::_1));
	this->set_method_handler("PUT",
		std::bind(&FleetApiFleetDispatchRoutesRoute_idResource::PUT_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetDispatchRoutesRoute_idResource::~FleetApiFleetDispatchRoutesRoute_idResource()
{
}

void FleetApiFleetDispatchRoutesRoute_idResource::DELETE_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
			
			// Getting the path params
			const int64_t routeId = request->get_path_parameter("routeId", 0L);
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Successfully deleted the dispatch route. No response body is returned.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}

void FleetApiFleetDispatchRoutesRoute_idResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();

			// Getting the path params
			const int64_t routeId = request->get_path_parameter("routeId", 0L);
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				std::shared_ptr<DispatchRoute> response = NULL;
				session->close(200, "The dispatch route corresponding to route_id.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				std::shared_ptr<std::string> response = NULL;
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}
void FleetApiFleetDispatchRoutesRoute_idResource::PUT_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));

			// Getting the path params
			const int64_t routeId = request->get_path_parameter("routeId", 0L);
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				std::shared_ptr<DispatchRoute> response = NULL;
				session->close(200, "Update the dispatch route. Allowable updates include setting job state, adding or removing jobs, and changing job locations and times.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				std::shared_ptr<std::string> response = NULL;
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}


FleetApiAddressesAddressIdResource::FleetApiAddressesAddressIdResource()
{
	this->set_path("/addresses/{addressId: .*}/");
	this->set_method_handler("DELETE",
		std::bind(&FleetApiAddressesAddressIdResource::DELETE_method_handler, this,
			std::placeholders::_1));
	this->set_method_handler("GET",
		std::bind(&FleetApiAddressesAddressIdResource::GET_method_handler, this,
			std::placeholders::_1));
	this->set_method_handler("PATCH",
		std::bind(&FleetApiAddressesAddressIdResource::PATCH_method_handler, this,
			std::placeholders::_1));
}

FleetApiAddressesAddressIdResource::~FleetApiAddressesAddressIdResource()
{
}

void FleetApiAddressesAddressIdResource::DELETE_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
			
			// Getting the path params
			const int64_t addressId = request->get_path_parameter("addressId", 0L);
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Address was successfully deleted. No response body is returned.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}

void FleetApiAddressesAddressIdResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();

			// Getting the path params
			const int64_t addressId = request->get_path_parameter("addressId", 0L);
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				std::shared_ptr<Address> response = NULL;
				session->close(200, "The address/geofence. The geofence field will only be populated with either &#39;circle&#39; or &#39;polygon&#39;, depending on the geofence type.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				std::shared_ptr<std::string> response = NULL;
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}
void FleetApiAddressesAddressIdResource::PATCH_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));

			// Getting the path params
			const int64_t addressId = request->get_path_parameter("addressId", 0L);
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Address was successfully updated. No response body is returned.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				std::shared_ptr<std::string> response = NULL;
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}


FleetApiFleetDispatchRoutesJob_updatesResource::FleetApiFleetDispatchRoutesJob_updatesResource()
{
	this->set_path("/fleet/dispatch/routes/job_updates/");
	this->set_method_handler("GET",
		std::bind(&FleetApiFleetDispatchRoutesJob_updatesResource::GET_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetDispatchRoutesJob_updatesResource::~FleetApiFleetDispatchRoutesJob_updatesResource()
{
}

void FleetApiFleetDispatchRoutesJob_updatesResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
			
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");
			const int64_t groupId = request->get_query_parameter("groupId", 0L);
			const std::string sequenceId = request->get_query_parameter("sequenceId", "");
			const std::string include = request->get_query_parameter("include", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "All job updates on routes.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}



FleetApiFleetAssetsLocationsResource::FleetApiFleetAssetsLocationsResource()
{
	this->set_path("/fleet/assets/locations/");
	this->set_method_handler("GET",
		std::bind(&FleetApiFleetAssetsLocationsResource::GET_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetAssetsLocationsResource::~FleetApiFleetAssetsLocationsResource()
{
}

void FleetApiFleetAssetsLocationsResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
			
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");
			const int64_t groupId = request->get_query_parameter("groupId", 0L);

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "List of assets and their current locations.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}



FleetApiFleetAssetsResource::FleetApiFleetAssetsResource()
{
	this->set_path("/fleet/assets/");
	this->set_method_handler("GET",
		std::bind(&FleetApiFleetAssetsResource::GET_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetAssetsResource::~FleetApiFleetAssetsResource()
{
}

void FleetApiFleetAssetsResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
			
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");
			const int64_t groupId = request->get_query_parameter("groupId", 0L);

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "List of assets.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}



FleetApiFleetDriversInactiveResource::FleetApiFleetDriversInactiveResource()
{
	this->set_path("/fleet/drivers/inactive/");
	this->set_method_handler("GET",
		std::bind(&FleetApiFleetDriversInactiveResource::GET_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetDriversInactiveResource::~FleetApiFleetDriversInactiveResource()
{
}

void FleetApiFleetDriversInactiveResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
			
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");
			const int64_t groupId = request->get_query_parameter("groupId", 0L);

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Returns an array of all deactivated drivers for the group. Deactivated drivers are referenced at /fleet/drivers/inactive/{driver_id}", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}



FleetApiFleetAssetsAsset_idLocationsResource::FleetApiFleetAssetsAsset_idLocationsResource()
{
	this->set_path("/fleet/assets/{asset_id: .*}/locations/");
	this->set_method_handler("GET",
		std::bind(&FleetApiFleetAssetsAsset_idLocationsResource::GET_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetAssetsAsset_idLocationsResource::~FleetApiFleetAssetsAsset_idLocationsResource()
{
}

void FleetApiFleetAssetsAsset_idLocationsResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
			
			// Getting the path params
			const int64_t assetId = request->get_path_parameter("assetId", 0L);
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");
			const int64_t startMs = request->get_query_parameter("startMs", 0L);
			const int64_t endMs = request->get_query_parameter("endMs", 0L);

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Asset location details.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}



FleetApiFleetAssetsAsset_idReeferResource::FleetApiFleetAssetsAsset_idReeferResource()
{
	this->set_path("/fleet/assets/{asset_id: .*}/reefer/");
	this->set_method_handler("GET",
		std::bind(&FleetApiFleetAssetsAsset_idReeferResource::GET_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetAssetsAsset_idReeferResource::~FleetApiFleetAssetsAsset_idReeferResource()
{
}

void FleetApiFleetAssetsAsset_idReeferResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
			
			// Getting the path params
			const int64_t assetId = request->get_path_parameter("assetId", 0L);
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");
			const int64_t startMs = request->get_query_parameter("startMs", 0L);
			const int64_t endMs = request->get_query_parameter("endMs", 0L);

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Reefer-specific asset details.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}



FleetApiFleetDriversInactiveDriver_id_or_external_idResource::FleetApiFleetDriversInactiveDriver_id_or_external_idResource()
{
	this->set_path("/fleet/drivers/inactive/{driver_id_or_external_id: .*}/");
	this->set_method_handler("GET",
		std::bind(&FleetApiFleetDriversInactiveDriver_id_or_external_idResource::GET_method_handler, this,
			std::placeholders::_1));
	this->set_method_handler("PUT",
		std::bind(&FleetApiFleetDriversInactiveDriver_id_or_external_idResource::PUT_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetDriversInactiveDriver_id_or_external_idResource::~FleetApiFleetDriversInactiveDriver_id_or_external_idResource()
{
}

void FleetApiFleetDriversInactiveDriver_id_or_external_idResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
			
			// Getting the path params
			const std::string driverIdOrExternalId = request->get_path_parameter("driverIdOrExternalId", "");
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Returns the deactivated driver with the given driver_id.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}

void FleetApiFleetDriversInactiveDriver_id_or_external_idResource::PUT_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));

			// Getting the path params
			const std::string driverIdOrExternalId = request->get_path_parameter("driverIdOrExternalId", "");
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				std::shared_ptr<Driver> response = NULL;
				session->close(200, "Returns the reactivated driver, which is now available at /fleet/drivers/{driver_id}.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				std::shared_ptr<std::string> response = NULL;
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}


FleetApiFleetDispatchRoutesRoute_idHistoryResource::FleetApiFleetDispatchRoutesRoute_idHistoryResource()
{
	this->set_path("/fleet/dispatch/routes/{route_id: .*}/history/");
	this->set_method_handler("GET",
		std::bind(&FleetApiFleetDispatchRoutesRoute_idHistoryResource::GET_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetDispatchRoutesRoute_idHistoryResource::~FleetApiFleetDispatchRoutesRoute_idHistoryResource()
{
}

void FleetApiFleetDispatchRoutesRoute_idHistoryResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
			
			// Getting the path params
			const int64_t routeId = request->get_path_parameter("routeId", 0L);
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");
			const int64_t startTime = request->get_query_parameter("startTime", 0L);
			const int64_t endTime = request->get_query_parameter("endTime", 0L);

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "The historical route state changes between start_time and end_time.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}



FleetApiFleetDriversDocument_typesResource::FleetApiFleetDriversDocument_typesResource()
{
	this->set_path("/fleet/drivers/document_types/");
	this->set_method_handler("GET",
		std::bind(&FleetApiFleetDriversDocument_typesResource::GET_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetDriversDocument_typesResource::~FleetApiFleetDriversDocument_typesResource()
{
}

void FleetApiFleetDriversDocument_typesResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
			
			

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Returns all of the document types.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}



FleetApiFleetDriversDocumentsResource::FleetApiFleetDriversDocumentsResource()
{
	this->set_path("/fleet/drivers/documents/");
	this->set_method_handler("GET",
		std::bind(&FleetApiFleetDriversDocumentsResource::GET_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetDriversDocumentsResource::~FleetApiFleetDriversDocumentsResource()
{
}

void FleetApiFleetDriversDocumentsResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
			
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");
			const int64_t endMs = request->get_query_parameter("endMs", 0L);
			const int64_t durationMs = request->get_query_parameter("durationMs", 0L);

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Returns all of the documents.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}



FleetApiFleetDriversDriverIdSafetyScoreResource::FleetApiFleetDriversDriverIdSafetyScoreResource()
{
	this->set_path("/fleet/drivers/{driverId: .*}/safety/score/");
	this->set_method_handler("GET",
		std::bind(&FleetApiFleetDriversDriverIdSafetyScoreResource::GET_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetDriversDriverIdSafetyScoreResource::~FleetApiFleetDriversDriverIdSafetyScoreResource()
{
}

void FleetApiFleetDriversDriverIdSafetyScoreResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
			
			// Getting the path params
			const int64_t driverId = request->get_path_parameter("driverId", 0L);
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");
			const int64_t startMs = request->get_query_parameter("startMs", 0L);
			const int64_t endMs = request->get_query_parameter("endMs", 0L);

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Safety score details.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}



FleetApiFleetDriversResource::FleetApiFleetDriversResource()
{
	this->set_path("/fleet/drivers/");
	this->set_method_handler("POST",
		std::bind(&FleetApiFleetDriversResource::POST_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetDriversResource::~FleetApiFleetDriversResource()
{
}

void FleetApiFleetDriversResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));
			/**
			 * Get body params or form params here from the requestBody string
			 */
			
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "All drivers in the group.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}



FleetApiFleetDriversDriver_idHos_daily_logsResource::FleetApiFleetDriversDriver_idHos_daily_logsResource()
{
	this->set_path("/fleet/drivers/{driver_id: .*}/hos_daily_logs/");
	this->set_method_handler("POST",
		std::bind(&FleetApiFleetDriversDriver_idHos_daily_logsResource::POST_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetDriversDriver_idHos_daily_logsResource::~FleetApiFleetDriversDriver_idHos_daily_logsResource()
{
}

void FleetApiFleetDriversDriver_idHos_daily_logsResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));
			/**
			 * Get body params or form params here from the requestBody string
			 */
			
			// Getting the path params
			const int64_t driverId = request->get_path_parameter("driverId", 0L);
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Distance traveled and time active for each driver in the organization over the specified time period.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}



FleetApiFleetDriversSummaryResource::FleetApiFleetDriversSummaryResource()
{
	this->set_path("/fleet/drivers/summary/");
	this->set_method_handler("POST",
		std::bind(&FleetApiFleetDriversSummaryResource::POST_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetDriversSummaryResource::~FleetApiFleetDriversSummaryResource()
{
}

void FleetApiFleetDriversSummaryResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));
			/**
			 * Get body params or form params here from the requestBody string
			 */
			
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");
			const bool snapToDayBounds = request->get_query_parameter("snapToDayBounds", false);

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Distance traveled and time active for each driver in the organization over the specified time period.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}



FleetApiFleetHos_authentication_logsResource::FleetApiFleetHos_authentication_logsResource()
{
	this->set_path("/fleet/hos_authentication_logs/");
	this->set_method_handler("POST",
		std::bind(&FleetApiFleetHos_authentication_logsResource::POST_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetHos_authentication_logsResource::~FleetApiFleetHos_authentication_logsResource()
{
}

void FleetApiFleetHos_authentication_logsResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));
			/**
			 * Get body params or form params here from the requestBody string
			 */
			
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "HOS authentication logs for the specified driver.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}



FleetApiFleetHos_logsResource::FleetApiFleetHos_logsResource()
{
	this->set_path("/fleet/hos_logs/");
	this->set_method_handler("POST",
		std::bind(&FleetApiFleetHos_logsResource::POST_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetHos_logsResource::~FleetApiFleetHos_logsResource()
{
}

void FleetApiFleetHos_logsResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));
			/**
			 * Get body params or form params here from the requestBody string
			 */
			
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "HOS logs for the specified driver.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}



FleetApiFleetHos_logs_summaryResource::FleetApiFleetHos_logs_summaryResource()
{
	this->set_path("/fleet/hos_logs_summary/");
	this->set_method_handler("POST",
		std::bind(&FleetApiFleetHos_logs_summaryResource::POST_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetHos_logs_summaryResource::~FleetApiFleetHos_logs_summaryResource()
{
}

void FleetApiFleetHos_logs_summaryResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));
			/**
			 * Get body params or form params here from the requestBody string
			 */
			
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "HOS logs for the specified driver.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}



FleetApiFleetLocationsResource::FleetApiFleetLocationsResource()
{
	this->set_path("/fleet/locations/");
	this->set_method_handler("POST",
		std::bind(&FleetApiFleetLocationsResource::POST_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetLocationsResource::~FleetApiFleetLocationsResource()
{
}

void FleetApiFleetLocationsResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));
			/**
			 * Get body params or form params here from the requestBody string
			 */
			
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "List of vehicle objects containing their location and the time at which that location was logged.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}



FleetApiFleetMaintenanceListResource::FleetApiFleetMaintenanceListResource()
{
	this->set_path("/fleet/maintenance/list/");
	this->set_method_handler("POST",
		std::bind(&FleetApiFleetMaintenanceListResource::POST_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetMaintenanceListResource::~FleetApiFleetMaintenanceListResource()
{
}

void FleetApiFleetMaintenanceListResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));
			/**
			 * Get body params or form params here from the requestBody string
			 */
			
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "List of vehicles and maintenance information about each.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}



FleetApiFleetTripsResource::FleetApiFleetTripsResource()
{
	this->set_path("/fleet/trips/");
	this->set_method_handler("POST",
		std::bind(&FleetApiFleetTripsResource::POST_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetTripsResource::~FleetApiFleetTripsResource()
{
}

void FleetApiFleetTripsResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));
			/**
			 * Get body params or form params here from the requestBody string
			 */
			
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "List of trips taken by the requested vehicle within the specified timeframe.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}



FleetApiFleetVehiclesVehicle_id_or_external_idResource::FleetApiFleetVehiclesVehicle_id_or_external_idResource()
{
	this->set_path("/fleet/vehicles/{vehicle_id_or_external_id: .*}/");
	this->set_method_handler("GET",
		std::bind(&FleetApiFleetVehiclesVehicle_id_or_external_idResource::GET_method_handler, this,
			std::placeholders::_1));
	this->set_method_handler("PATCH",
		std::bind(&FleetApiFleetVehiclesVehicle_id_or_external_idResource::PATCH_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetVehiclesVehicle_id_or_external_idResource::~FleetApiFleetVehiclesVehicle_id_or_external_idResource()
{
}

void FleetApiFleetVehiclesVehicle_id_or_external_idResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
			
			// Getting the path params
			const std::string vehicleIdOrExternalId = request->get_path_parameter("vehicleIdOrExternalId", "");
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "The specified vehicle.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}

void FleetApiFleetVehiclesVehicle_id_or_external_idResource::PATCH_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));

			// Getting the path params
			const std::string vehicleIdOrExternalId = request->get_path_parameter("vehicleIdOrExternalId", "");
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				std::shared_ptr<FleetVehicleResponse> response = NULL;
				session->close(200, "The updated vehicle.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				std::shared_ptr<std::string> response = NULL;
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}


FleetApiContactsContact_idResource::FleetApiContactsContact_idResource()
{
	this->set_path("/contacts/{contact_id: .*}/");
	this->set_method_handler("GET",
		std::bind(&FleetApiContactsContact_idResource::GET_method_handler, this,
			std::placeholders::_1));
}

FleetApiContactsContact_idResource::~FleetApiContactsContact_idResource()
{
}

void FleetApiContactsContact_idResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
			
			// Getting the path params
			const int64_t contactId = request->get_path_parameter("contactId", 0L);
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "The contact.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}



FleetApiFleetVehiclesVehicleIdSafetyHarsh_eventResource::FleetApiFleetVehiclesVehicleIdSafetyHarsh_eventResource()
{
	this->set_path("/fleet/vehicles/{vehicleId: .*}/safety/harsh_event/");
	this->set_method_handler("GET",
		std::bind(&FleetApiFleetVehiclesVehicleIdSafetyHarsh_eventResource::GET_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetVehiclesVehicleIdSafetyHarsh_eventResource::~FleetApiFleetVehiclesVehicleIdSafetyHarsh_eventResource()
{
}

void FleetApiFleetVehiclesVehicleIdSafetyHarsh_eventResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
			
			// Getting the path params
			const int64_t vehicleId = request->get_path_parameter("vehicleId", 0L);
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");
			const int64_t timestamp = request->get_query_parameter("timestamp", 0L);

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Harsh event details.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}



FleetApiFleetVehiclesVehicle_idLocationsResource::FleetApiFleetVehiclesVehicle_idLocationsResource()
{
	this->set_path("/fleet/vehicles/{vehicle_id: .*}/locations/");
	this->set_method_handler("GET",
		std::bind(&FleetApiFleetVehiclesVehicle_idLocationsResource::GET_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetVehiclesVehicle_idLocationsResource::~FleetApiFleetVehiclesVehicle_idLocationsResource()
{
}

void FleetApiFleetVehiclesVehicle_idLocationsResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
			
			// Getting the path params
			const int64_t vehicleId = request->get_path_parameter("vehicleId", 0L);
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");
			const int64_t startMs = request->get_query_parameter("startMs", 0L);
			const int64_t endMs = request->get_query_parameter("endMs", 0L);

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Returns locations for a given vehicle between a start/end time, with a maximum query duration of one hour.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}



FleetApiFleetVehiclesVehicleIdSafetyScoreResource::FleetApiFleetVehiclesVehicleIdSafetyScoreResource()
{
	this->set_path("/fleet/vehicles/{vehicleId: .*}/safety/score/");
	this->set_method_handler("GET",
		std::bind(&FleetApiFleetVehiclesVehicleIdSafetyScoreResource::GET_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetVehiclesVehicleIdSafetyScoreResource::~FleetApiFleetVehiclesVehicleIdSafetyScoreResource()
{
}

void FleetApiFleetVehiclesVehicleIdSafetyScoreResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
			
			// Getting the path params
			const int64_t vehicleId = request->get_path_parameter("vehicleId", 0L);
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");
			const int64_t startMs = request->get_query_parameter("startMs", 0L);
			const int64_t endMs = request->get_query_parameter("endMs", 0L);

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Safety score details.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}



FleetApiFleetVehiclesStatsResource::FleetApiFleetVehiclesStatsResource()
{
	this->set_path("/fleet/vehicles/stats/");
	this->set_method_handler("GET",
		std::bind(&FleetApiFleetVehiclesStatsResource::GET_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetVehiclesStatsResource::~FleetApiFleetVehiclesStatsResource()
{
}

void FleetApiFleetVehiclesStatsResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
			
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");
			const int32_t startMs = request->get_query_parameter("startMs", 0);
			const int32_t endMs = request->get_query_parameter("endMs", 0);
			const std::string series = request->get_query_parameter("series", "");
			const std::string tagIds = request->get_query_parameter("tagIds", "");
			const std::string startingAfter = request->get_query_parameter("startingAfter", "");
			const std::string endingBefore = request->get_query_parameter("endingBefore", "");
			const int64_t limit = request->get_query_parameter("limit", 0L);

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Returns engine state and/or aux input data for all vehicles in the group between a start/end time.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}



FleetApiFleetVehiclesLocationsResource::FleetApiFleetVehiclesLocationsResource()
{
	this->set_path("/fleet/vehicles/locations/");
	this->set_method_handler("GET",
		std::bind(&FleetApiFleetVehiclesLocationsResource::GET_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetVehiclesLocationsResource::~FleetApiFleetVehiclesLocationsResource()
{
}

void FleetApiFleetVehiclesLocationsResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
			
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");
			const int32_t startMs = request->get_query_parameter("startMs", 0);
			const int32_t endMs = request->get_query_parameter("endMs", 0);

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Returns locations for a given vehicle between a start/end time, with a maximum query duration of 30 minutes.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}



FleetApiContactsResource::FleetApiContactsResource()
{
	this->set_path("/contacts/");
	this->set_method_handler("GET",
		std::bind(&FleetApiContactsResource::GET_method_handler, this,
			std::placeholders::_1));
}

FleetApiContactsResource::~FleetApiContactsResource()
{
}

void FleetApiContactsResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
			
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "List of contacts.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}



FleetApiFleetListResource::FleetApiFleetListResource()
{
	this->set_path("/fleet/list/");
	this->set_method_handler("POST",
		std::bind(&FleetApiFleetListResource::POST_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetListResource::~FleetApiFleetListResource()
{
}

void FleetApiFleetListResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));
			/**
			 * Get body params or form params here from the requestBody string
			 */
			
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");
			const std::string startingAfter = request->get_query_parameter("startingAfter", "");
			const std::string endingBefore = request->get_query_parameter("endingBefore", "");
			const int64_t limit = request->get_query_parameter("limit", 0L);

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "List of vehicles and information about each.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}



FleetApiFleetSet_dataResource::FleetApiFleetSet_dataResource()
{
	this->set_path("/fleet/set_data/");
	this->set_method_handler("POST",
		std::bind(&FleetApiFleetSet_dataResource::POST_method_handler, this,
			std::placeholders::_1));
}

FleetApiFleetSet_dataResource::~FleetApiFleetSet_dataResource()
{
}

void FleetApiFleetSet_dataResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));
			/**
			 * Get body params or form params here from the requestBody string
			 */
			
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Vehicles were successfully updated. No response body is returned.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}




}
}
}
}

