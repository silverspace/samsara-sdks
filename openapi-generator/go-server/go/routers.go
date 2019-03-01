/*
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"fmt"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

type Route struct {
	Name        string
	Method      string
	Pattern     string
	HandlerFunc http.HandlerFunc
}

type Routes []Route

func NewRouter() *mux.Router {
	router := mux.NewRouter().StrictSlash(true)
	for _, route := range routes {
		var handler http.Handler
		handler = route.HandlerFunc
		handler = Logger(handler, route.Name)

		router.
			Methods(route.Method).
			Path(route.Pattern).
			Name(route.Name).
			Handler(handler)
	}

	return router
}

func Index(w http.ResponseWriter, r *http.Request) {
	fmt.Fprintf(w, "Hello World!")
}

var routes = Routes{
	{
		"Index",
		"GET",
		"/v1/",
		Index,
	},

	{
		"GetAllAssetCurrentLocations",
		strings.ToUpper("Get"),
		"/v1/fleet/assets/locations",
		GetAllAssetCurrentLocations,
	},

	{
		"GetAllAssets",
		strings.ToUpper("Get"),
		"/v1/fleet/assets",
		GetAllAssets,
	},

	{
		"GetAssetLocation",
		strings.ToUpper("Get"),
		"/v1/fleet/assets/{asset_id}/locations",
		GetAssetLocation,
	},

	{
		"GetAssetReefer",
		strings.ToUpper("Get"),
		"/v1/fleet/assets/{asset_id}/reefer",
		GetAssetReefer,
	},

	{
		"CreateDriver",
		strings.ToUpper("Post"),
		"/v1/fleet/drivers/create",
		CreateDriver,
	},

	{
		"DeactivateDriver",
		strings.ToUpper("Delete"),
		"/v1/fleet/drivers/{driver_id_or_external_id}",
		DeactivateDriver,
	},

	{
		"GetAllDeactivatedDrivers",
		strings.ToUpper("Get"),
		"/v1/fleet/drivers/inactive",
		GetAllDeactivatedDrivers,
	},

	{
		"GetDeactivatedDriverById",
		strings.ToUpper("Get"),
		"/v1/fleet/drivers/inactive/{driver_id_or_external_id}",
		GetDeactivatedDriverById,
	},

	{
		"GetDriverById",
		strings.ToUpper("Get"),
		"/v1/fleet/drivers/{driver_id_or_external_id}",
		GetDriverById,
	},

	{
		"ReactivateDriverById",
		strings.ToUpper("Put"),
		"/v1/fleet/drivers/inactive/{driver_id_or_external_id}",
		ReactivateDriverById,
	},

	{
		"AddFleetAddress",
		strings.ToUpper("Post"),
		"/v1/fleet/add_address",
		AddFleetAddress,
	},

	{
		"AddOrganizationAddresses",
		strings.ToUpper("Post"),
		"/v1/addresses",
		AddOrganizationAddresses,
	},

	{
		"CreateDispatchRoute",
		strings.ToUpper("Post"),
		"/v1/fleet/dispatch/routes",
		CreateDispatchRoute,
	},

	{
		"CreateDriver",
		strings.ToUpper("Post"),
		"/v1/fleet/drivers/create",
		CreateDriver,
	},

	{
		"CreateDriverDispatchRoute",
		strings.ToUpper("Post"),
		"/v1/fleet/drivers/{driver_id}/dispatch/routes",
		CreateDriverDispatchRoute,
	},

	{
		"CreateDriverDocument",
		strings.ToUpper("Post"),
		"/v1/fleet/drivers/{driver_id}/documents",
		CreateDriverDocument,
	},

	{
		"CreateDvir",
		strings.ToUpper("Post"),
		"/v1/fleet/maintenance/dvirs",
		CreateDvir,
	},

	{
		"CreateVehicleDispatchRoute",
		strings.ToUpper("Post"),
		"/v1/fleet/vehicles/{vehicle_id}/dispatch/routes",
		CreateVehicleDispatchRoute,
	},

	{
		"DeactivateDriver",
		strings.ToUpper("Delete"),
		"/v1/fleet/drivers/{driver_id_or_external_id}",
		DeactivateDriver,
	},

	{
		"DeleteDispatchRouteById",
		strings.ToUpper("Delete"),
		"/v1/fleet/dispatch/routes/{route_id}",
		DeleteDispatchRouteById,
	},

	{
		"DeleteOrganizationAddress",
		strings.ToUpper("Delete"),
		"/v1/addresses/{addressId}",
		DeleteOrganizationAddress,
	},

	{
		"FetchAllDispatchRoutes",
		strings.ToUpper("Get"),
		"/v1/fleet/dispatch/routes",
		FetchAllDispatchRoutes,
	},

	{
		"FetchAllRouteJobUpdates",
		strings.ToUpper("Get"),
		"/v1/fleet/dispatch/routes/job_updates",
		FetchAllRouteJobUpdates,
	},

	{
		"GetAllAssetCurrentLocations",
		strings.ToUpper("Get"),
		"/v1/fleet/assets/locations",
		GetAllAssetCurrentLocations,
	},

	{
		"GetAllAssets",
		strings.ToUpper("Get"),
		"/v1/fleet/assets",
		GetAllAssets,
	},

	{
		"GetAllDeactivatedDrivers",
		strings.ToUpper("Get"),
		"/v1/fleet/drivers/inactive",
		GetAllDeactivatedDrivers,
	},

	{
		"GetAssetLocation",
		strings.ToUpper("Get"),
		"/v1/fleet/assets/{asset_id}/locations",
		GetAssetLocation,
	},

	{
		"GetAssetReefer",
		strings.ToUpper("Get"),
		"/v1/fleet/assets/{asset_id}/reefer",
		GetAssetReefer,
	},

	{
		"GetDeactivatedDriverById",
		strings.ToUpper("Get"),
		"/v1/fleet/drivers/inactive/{driver_id_or_external_id}",
		GetDeactivatedDriverById,
	},

	{
		"GetDispatchRouteById",
		strings.ToUpper("Get"),
		"/v1/fleet/dispatch/routes/{route_id}",
		GetDispatchRouteById,
	},

	{
		"GetDispatchRouteHistory",
		strings.ToUpper("Get"),
		"/v1/fleet/dispatch/routes/{route_id}/history",
		GetDispatchRouteHistory,
	},

	{
		"GetDispatchRoutesByDriverId",
		strings.ToUpper("Get"),
		"/v1/fleet/drivers/{driver_id}/dispatch/routes",
		GetDispatchRoutesByDriverId,
	},

	{
		"GetDispatchRoutesByVehicleId",
		strings.ToUpper("Get"),
		"/v1/fleet/vehicles/{vehicle_id}/dispatch/routes",
		GetDispatchRoutesByVehicleId,
	},

	{
		"GetDriverById",
		strings.ToUpper("Get"),
		"/v1/fleet/drivers/{driver_id_or_external_id}",
		GetDriverById,
	},

	{
		"GetDriverDocumentTypesByOrgId",
		strings.ToUpper("Get"),
		"/v1/fleet/drivers/document_types",
		GetDriverDocumentTypesByOrgId,
	},

	{
		"GetDriverDocumentsByOrgId",
		strings.ToUpper("Get"),
		"/v1/fleet/drivers/documents",
		GetDriverDocumentsByOrgId,
	},

	{
		"GetDriverSafetyScore",
		strings.ToUpper("Get"),
		"/v1/fleet/drivers/{driverId}/safety/score",
		GetDriverSafetyScore,
	},

	{
		"GetDvirs",
		strings.ToUpper("Get"),
		"/v1/fleet/maintenance/dvirs",
		GetDvirs,
	},

	{
		"GetFleetDrivers",
		strings.ToUpper("Post"),
		"/v1/fleet/drivers",
		GetFleetDrivers,
	},

	{
		"GetFleetDriversHosDailyLogs",
		strings.ToUpper("Post"),
		"/v1/fleet/drivers/{driver_id}/hos_daily_logs",
		GetFleetDriversHosDailyLogs,
	},

	{
		"GetFleetDriversSummary",
		strings.ToUpper("Post"),
		"/v1/fleet/drivers/summary",
		GetFleetDriversSummary,
	},

	{
		"GetFleetHosAuthenticationLogs",
		strings.ToUpper("Post"),
		"/v1/fleet/hos_authentication_logs",
		GetFleetHosAuthenticationLogs,
	},

	{
		"GetFleetHosLogs",
		strings.ToUpper("Post"),
		"/v1/fleet/hos_logs",
		GetFleetHosLogs,
	},

	{
		"GetFleetHosLogsSummary",
		strings.ToUpper("Post"),
		"/v1/fleet/hos_logs_summary",
		GetFleetHosLogsSummary,
	},

	{
		"GetFleetLocations",
		strings.ToUpper("Post"),
		"/v1/fleet/locations",
		GetFleetLocations,
	},

	{
		"GetFleetMaintenanceList",
		strings.ToUpper("Post"),
		"/v1/fleet/maintenance/list",
		GetFleetMaintenanceList,
	},

	{
		"GetFleetTrips",
		strings.ToUpper("Post"),
		"/v1/fleet/trips",
		GetFleetTrips,
	},

	{
		"GetFleetVehicle",
		strings.ToUpper("Get"),
		"/v1/fleet/vehicles/{vehicle_id_or_external_id}",
		GetFleetVehicle,
	},

	{
		"GetOrganizationAddress",
		strings.ToUpper("Get"),
		"/v1/addresses/{addressId}",
		GetOrganizationAddress,
	},

	{
		"GetOrganizationAddresses",
		strings.ToUpper("Get"),
		"/v1/addresses",
		GetOrganizationAddresses,
	},

	{
		"GetOrganizationContact",
		strings.ToUpper("Get"),
		"/v1/contacts/{contact_id}",
		GetOrganizationContact,
	},

	{
		"GetVehicleHarshEvent",
		strings.ToUpper("Get"),
		"/v1/fleet/vehicles/{vehicleId}/safety/harsh_event",
		GetVehicleHarshEvent,
	},

	{
		"GetVehicleLocations",
		strings.ToUpper("Get"),
		"/v1/fleet/vehicles/{vehicle_id}/locations",
		GetVehicleLocations,
	},

	{
		"GetVehicleSafetyScore",
		strings.ToUpper("Get"),
		"/v1/fleet/vehicles/{vehicleId}/safety/score",
		GetVehicleSafetyScore,
	},

	{
		"GetVehicleStats",
		strings.ToUpper("Get"),
		"/v1/fleet/vehicles/stats",
		GetVehicleStats,
	},

	{
		"GetVehiclesLocations",
		strings.ToUpper("Get"),
		"/v1/fleet/vehicles/locations",
		GetVehiclesLocations,
	},

	{
		"ListContacts",
		strings.ToUpper("Get"),
		"/v1/contacts",
		ListContacts,
	},

	{
		"ListFleet",
		strings.ToUpper("Post"),
		"/v1/fleet/list",
		ListFleet,
	},

	{
		"PatchFleetVehicle",
		strings.ToUpper("Patch"),
		"/v1/fleet/vehicles/{vehicle_id_or_external_id}",
		PatchFleetVehicle,
	},

	{
		"ReactivateDriverById",
		strings.ToUpper("Put"),
		"/v1/fleet/drivers/inactive/{driver_id_or_external_id}",
		ReactivateDriverById,
	},

	{
		"UpdateDispatchRouteById",
		strings.ToUpper("Put"),
		"/v1/fleet/dispatch/routes/{route_id}",
		UpdateDispatchRouteById,
	},

	{
		"UpdateOrganizationAddress",
		strings.ToUpper("Patch"),
		"/v1/addresses/{addressId}",
		UpdateOrganizationAddress,
	},

	{
		"UpdateVehicles",
		strings.ToUpper("Post"),
		"/v1/fleet/set_data",
		UpdateVehicles,
	},

	{
		"GetAllDataInputs",
		strings.ToUpper("Get"),
		"/v1/industrial/data",
		GetAllDataInputs,
	},

	{
		"GetDataInput",
		strings.ToUpper("Get"),
		"/v1/industrial/data/{data_input_id}",
		GetDataInput,
	},

	{
		"GetMachines",
		strings.ToUpper("Post"),
		"/v1/machines/list",
		GetMachines,
	},

	{
		"GetMachinesHistory",
		strings.ToUpper("Post"),
		"/v1/machines/history",
		GetMachinesHistory,
	},

	{
		"CreateDispatchRoute",
		strings.ToUpper("Post"),
		"/v1/fleet/dispatch/routes",
		CreateDispatchRoute,
	},

	{
		"CreateDriverDispatchRoute",
		strings.ToUpper("Post"),
		"/v1/fleet/drivers/{driver_id}/dispatch/routes",
		CreateDriverDispatchRoute,
	},

	{
		"CreateVehicleDispatchRoute",
		strings.ToUpper("Post"),
		"/v1/fleet/vehicles/{vehicle_id}/dispatch/routes",
		CreateVehicleDispatchRoute,
	},

	{
		"DeleteDispatchRouteById",
		strings.ToUpper("Delete"),
		"/v1/fleet/dispatch/routes/{route_id}",
		DeleteDispatchRouteById,
	},

	{
		"FetchAllDispatchRoutes",
		strings.ToUpper("Get"),
		"/v1/fleet/dispatch/routes",
		FetchAllDispatchRoutes,
	},

	{
		"FetchAllRouteJobUpdates",
		strings.ToUpper("Get"),
		"/v1/fleet/dispatch/routes/job_updates",
		FetchAllRouteJobUpdates,
	},

	{
		"GetDispatchRouteById",
		strings.ToUpper("Get"),
		"/v1/fleet/dispatch/routes/{route_id}",
		GetDispatchRouteById,
	},

	{
		"GetDispatchRouteHistory",
		strings.ToUpper("Get"),
		"/v1/fleet/dispatch/routes/{route_id}/history",
		GetDispatchRouteHistory,
	},

	{
		"GetDispatchRoutesByDriverId",
		strings.ToUpper("Get"),
		"/v1/fleet/drivers/{driver_id}/dispatch/routes",
		GetDispatchRoutesByDriverId,
	},

	{
		"GetDispatchRoutesByVehicleId",
		strings.ToUpper("Get"),
		"/v1/fleet/vehicles/{vehicle_id}/dispatch/routes",
		GetDispatchRoutesByVehicleId,
	},

	{
		"UpdateDispatchRouteById",
		strings.ToUpper("Put"),
		"/v1/fleet/dispatch/routes/{route_id}",
		UpdateDispatchRouteById,
	},

	{
		"GetDriverSafetyScore",
		strings.ToUpper("Get"),
		"/v1/fleet/drivers/{driverId}/safety/score",
		GetDriverSafetyScore,
	},

	{
		"GetVehicleHarshEvent",
		strings.ToUpper("Get"),
		"/v1/fleet/vehicles/{vehicleId}/safety/harsh_event",
		GetVehicleHarshEvent,
	},

	{
		"GetVehicleSafetyScore",
		strings.ToUpper("Get"),
		"/v1/fleet/vehicles/{vehicleId}/safety/score",
		GetVehicleSafetyScore,
	},

	{
		"GetSensors",
		strings.ToUpper("Post"),
		"/v1/sensors/list",
		GetSensors,
	},

	{
		"GetSensorsCargo",
		strings.ToUpper("Post"),
		"/v1/sensors/cargo",
		GetSensorsCargo,
	},

	{
		"GetSensorsDoor",
		strings.ToUpper("Post"),
		"/v1/sensors/door",
		GetSensorsDoor,
	},

	{
		"GetSensorsHistory",
		strings.ToUpper("Post"),
		"/v1/sensors/history",
		GetSensorsHistory,
	},

	{
		"GetSensorsHumidity",
		strings.ToUpper("Post"),
		"/v1/sensors/humidity",
		GetSensorsHumidity,
	},

	{
		"GetSensorsTemperature",
		strings.ToUpper("Post"),
		"/v1/sensors/temperature",
		GetSensorsTemperature,
	},

	{
		"CreateTag",
		strings.ToUpper("Post"),
		"/v1/tags",
		CreateTag,
	},

	{
		"DeleteTagById",
		strings.ToUpper("Delete"),
		"/v1/tags/{tag_id}",
		DeleteTagById,
	},

	{
		"GetAllTags",
		strings.ToUpper("Get"),
		"/v1/tags",
		GetAllTags,
	},

	{
		"GetTagById",
		strings.ToUpper("Get"),
		"/v1/tags/{tag_id}",
		GetTagById,
	},

	{
		"ModifyTagById",
		strings.ToUpper("Patch"),
		"/v1/tags/{tag_id}",
		ModifyTagById,
	},

	{
		"UpdateTagById",
		strings.ToUpper("Put"),
		"/v1/tags/{tag_id}",
		UpdateTagById,
	},

	{
		"DeleteUserById",
		strings.ToUpper("Delete"),
		"/v1/users/{userId}",
		DeleteUserById,
	},

	{
		"GetUserById",
		strings.ToUpper("Get"),
		"/v1/users/{userId}",
		GetUserById,
	},

	{
		"ListUserRoles",
		strings.ToUpper("Get"),
		"/v1/user_roles",
		ListUserRoles,
	},

	{
		"ListUsers",
		strings.ToUpper("Get"),
		"/v1/users",
		ListUsers,
	},
}
