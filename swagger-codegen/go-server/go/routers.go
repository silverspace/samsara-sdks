/*
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * API version: 1.0.0
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package samsara

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
	Route{
		"Index",
		"GET",
		"/v1/",
		Index,
	},

	Route{
		"GetAllAssetCurrentLocations",
		strings.ToUpper("Get"),
		"/v1/fleet/assets/locations",
		GetAllAssetCurrentLocations,
	},

	Route{
		"GetAllAssets",
		strings.ToUpper("Get"),
		"/v1/fleet/assets",
		GetAllAssets,
	},

	Route{
		"GetAssetLocation",
		strings.ToUpper("Get"),
		"/v1/fleet/assets/{asset_id}/locations",
		GetAssetLocation,
	},

	Route{
		"GetAssetReefer",
		strings.ToUpper("Get"),
		"/v1/fleet/assets/{asset_id}/reefer",
		GetAssetReefer,
	},

	Route{
		"CreateDriver",
		strings.ToUpper("Post"),
		"/v1/fleet/drivers/create",
		CreateDriver,
	},

	Route{
		"DeactivateDriver",
		strings.ToUpper("Delete"),
		"/v1/fleet/drivers/{driver_id_or_external_id}",
		DeactivateDriver,
	},

	Route{
		"GetAllDeactivatedDrivers",
		strings.ToUpper("Get"),
		"/v1/fleet/drivers/inactive",
		GetAllDeactivatedDrivers,
	},

	Route{
		"GetDeactivatedDriverById",
		strings.ToUpper("Get"),
		"/v1/fleet/drivers/inactive/{driver_id_or_external_id}",
		GetDeactivatedDriverById,
	},

	Route{
		"GetDriverById",
		strings.ToUpper("Get"),
		"/v1/fleet/drivers/{driver_id_or_external_id}",
		GetDriverById,
	},

	Route{
		"ReactivateDriverById",
		strings.ToUpper("Put"),
		"/v1/fleet/drivers/inactive/{driver_id_or_external_id}",
		ReactivateDriverById,
	},

	Route{
		"AddFleetAddress",
		strings.ToUpper("Post"),
		"/v1/fleet/add_address",
		AddFleetAddress,
	},

	Route{
		"AddOrganizationAddresses",
		strings.ToUpper("Post"),
		"/v1/addresses",
		AddOrganizationAddresses,
	},

	Route{
		"CreateDispatchRoute",
		strings.ToUpper("Post"),
		"/v1/fleet/dispatch/routes",
		CreateDispatchRoute,
	},

	Route{
		"CreateDriver",
		strings.ToUpper("Post"),
		"/v1/fleet/drivers/create",
		CreateDriver,
	},

	Route{
		"CreateDriverDispatchRoute",
		strings.ToUpper("Post"),
		"/v1/fleet/drivers/{driver_id}/dispatch/routes",
		CreateDriverDispatchRoute,
	},

	Route{
		"CreateDriverDocument",
		strings.ToUpper("Post"),
		"/v1/fleet/drivers/{driver_id}/documents",
		CreateDriverDocument,
	},

	Route{
		"CreateDvir",
		strings.ToUpper("Post"),
		"/v1/fleet/maintenance/dvirs",
		CreateDvir,
	},

	Route{
		"CreateVehicleDispatchRoute",
		strings.ToUpper("Post"),
		"/v1/fleet/vehicles/{vehicle_id}/dispatch/routes",
		CreateVehicleDispatchRoute,
	},

	Route{
		"DeactivateDriver",
		strings.ToUpper("Delete"),
		"/v1/fleet/drivers/{driver_id_or_external_id}",
		DeactivateDriver,
	},

	Route{
		"DeleteDispatchRouteById",
		strings.ToUpper("Delete"),
		"/v1/fleet/dispatch/routes/{route_id}",
		DeleteDispatchRouteById,
	},

	Route{
		"DeleteOrganizationAddress",
		strings.ToUpper("Delete"),
		"/v1/addresses/{addressId}",
		DeleteOrganizationAddress,
	},

	Route{
		"FetchAllDispatchRoutes",
		strings.ToUpper("Get"),
		"/v1/fleet/dispatch/routes",
		FetchAllDispatchRoutes,
	},

	Route{
		"FetchAllRouteJobUpdates",
		strings.ToUpper("Get"),
		"/v1/fleet/dispatch/routes/job_updates",
		FetchAllRouteJobUpdates,
	},

	Route{
		"GetAllAssetCurrentLocations",
		strings.ToUpper("Get"),
		"/v1/fleet/assets/locations",
		GetAllAssetCurrentLocations,
	},

	Route{
		"GetAllAssets",
		strings.ToUpper("Get"),
		"/v1/fleet/assets",
		GetAllAssets,
	},

	Route{
		"GetAllDeactivatedDrivers",
		strings.ToUpper("Get"),
		"/v1/fleet/drivers/inactive",
		GetAllDeactivatedDrivers,
	},

	Route{
		"GetAssetLocation",
		strings.ToUpper("Get"),
		"/v1/fleet/assets/{asset_id}/locations",
		GetAssetLocation,
	},

	Route{
		"GetAssetReefer",
		strings.ToUpper("Get"),
		"/v1/fleet/assets/{asset_id}/reefer",
		GetAssetReefer,
	},

	Route{
		"GetDeactivatedDriverById",
		strings.ToUpper("Get"),
		"/v1/fleet/drivers/inactive/{driver_id_or_external_id}",
		GetDeactivatedDriverById,
	},

	Route{
		"GetDispatchRouteById",
		strings.ToUpper("Get"),
		"/v1/fleet/dispatch/routes/{route_id}",
		GetDispatchRouteById,
	},

	Route{
		"GetDispatchRouteHistory",
		strings.ToUpper("Get"),
		"/v1/fleet/dispatch/routes/{route_id}/history",
		GetDispatchRouteHistory,
	},

	Route{
		"GetDispatchRoutesByDriverId",
		strings.ToUpper("Get"),
		"/v1/fleet/drivers/{driver_id}/dispatch/routes",
		GetDispatchRoutesByDriverId,
	},

	Route{
		"GetDispatchRoutesByVehicleId",
		strings.ToUpper("Get"),
		"/v1/fleet/vehicles/{vehicle_id}/dispatch/routes",
		GetDispatchRoutesByVehicleId,
	},

	Route{
		"GetDriverById",
		strings.ToUpper("Get"),
		"/v1/fleet/drivers/{driver_id_or_external_id}",
		GetDriverById,
	},

	Route{
		"GetDriverDocumentTypesByOrgId",
		strings.ToUpper("Get"),
		"/v1/fleet/drivers/document_types",
		GetDriverDocumentTypesByOrgId,
	},

	Route{
		"GetDriverDocumentsByOrgId",
		strings.ToUpper("Get"),
		"/v1/fleet/drivers/documents",
		GetDriverDocumentsByOrgId,
	},

	Route{
		"GetDriverSafetyScore",
		strings.ToUpper("Get"),
		"/v1/fleet/drivers/{driverId}/safety/score",
		GetDriverSafetyScore,
	},

	Route{
		"GetDvirs",
		strings.ToUpper("Get"),
		"/v1/fleet/maintenance/dvirs",
		GetDvirs,
	},

	Route{
		"GetFleetDrivers",
		strings.ToUpper("Post"),
		"/v1/fleet/drivers",
		GetFleetDrivers,
	},

	Route{
		"GetFleetDriversHosDailyLogs",
		strings.ToUpper("Post"),
		"/v1/fleet/drivers/{driver_id}/hos_daily_logs",
		GetFleetDriversHosDailyLogs,
	},

	Route{
		"GetFleetDriversSummary",
		strings.ToUpper("Post"),
		"/v1/fleet/drivers/summary",
		GetFleetDriversSummary,
	},

	Route{
		"GetFleetHosAuthenticationLogs",
		strings.ToUpper("Post"),
		"/v1/fleet/hos_authentication_logs",
		GetFleetHosAuthenticationLogs,
	},

	Route{
		"GetFleetHosLogs",
		strings.ToUpper("Post"),
		"/v1/fleet/hos_logs",
		GetFleetHosLogs,
	},

	Route{
		"GetFleetHosLogsSummary",
		strings.ToUpper("Post"),
		"/v1/fleet/hos_logs_summary",
		GetFleetHosLogsSummary,
	},

	Route{
		"GetFleetLocations",
		strings.ToUpper("Post"),
		"/v1/fleet/locations",
		GetFleetLocations,
	},

	Route{
		"GetFleetMaintenanceList",
		strings.ToUpper("Post"),
		"/v1/fleet/maintenance/list",
		GetFleetMaintenanceList,
	},

	Route{
		"GetFleetTrips",
		strings.ToUpper("Post"),
		"/v1/fleet/trips",
		GetFleetTrips,
	},

	Route{
		"GetFleetVehicle",
		strings.ToUpper("Get"),
		"/v1/fleet/vehicles/{vehicle_id_or_external_id}",
		GetFleetVehicle,
	},

	Route{
		"GetOrganizationAddress",
		strings.ToUpper("Get"),
		"/v1/addresses/{addressId}",
		GetOrganizationAddress,
	},

	Route{
		"GetOrganizationAddresses",
		strings.ToUpper("Get"),
		"/v1/addresses",
		GetOrganizationAddresses,
	},

	Route{
		"GetOrganizationContact",
		strings.ToUpper("Get"),
		"/v1/contacts/{contact_id}",
		GetOrganizationContact,
	},

	Route{
		"GetVehicleHarshEvent",
		strings.ToUpper("Get"),
		"/v1/fleet/vehicles/{vehicleId}/safety/harsh_event",
		GetVehicleHarshEvent,
	},

	Route{
		"GetVehicleLocations",
		strings.ToUpper("Get"),
		"/v1/fleet/vehicles/{vehicle_id}/locations",
		GetVehicleLocations,
	},

	Route{
		"GetVehicleSafetyScore",
		strings.ToUpper("Get"),
		"/v1/fleet/vehicles/{vehicleId}/safety/score",
		GetVehicleSafetyScore,
	},

	Route{
		"GetVehicleStats",
		strings.ToUpper("Get"),
		"/v1/fleet/vehicles/stats",
		GetVehicleStats,
	},

	Route{
		"GetVehiclesLocations",
		strings.ToUpper("Get"),
		"/v1/fleet/vehicles/locations",
		GetVehiclesLocations,
	},

	Route{
		"ListContacts",
		strings.ToUpper("Get"),
		"/v1/contacts",
		ListContacts,
	},

	Route{
		"ListFleet",
		strings.ToUpper("Post"),
		"/v1/fleet/list",
		ListFleet,
	},

	Route{
		"PatchFleetVehicle",
		strings.ToUpper("Patch"),
		"/v1/fleet/vehicles/{vehicle_id_or_external_id}",
		PatchFleetVehicle,
	},

	Route{
		"ReactivateDriverById",
		strings.ToUpper("Put"),
		"/v1/fleet/drivers/inactive/{driver_id_or_external_id}",
		ReactivateDriverById,
	},

	Route{
		"UpdateDispatchRouteById",
		strings.ToUpper("Put"),
		"/v1/fleet/dispatch/routes/{route_id}",
		UpdateDispatchRouteById,
	},

	Route{
		"UpdateOrganizationAddress",
		strings.ToUpper("Patch"),
		"/v1/addresses/{addressId}",
		UpdateOrganizationAddress,
	},

	Route{
		"UpdateVehicles",
		strings.ToUpper("Post"),
		"/v1/fleet/set_data",
		UpdateVehicles,
	},

	Route{
		"GetAllDataInputs",
		strings.ToUpper("Get"),
		"/v1/industrial/data",
		GetAllDataInputs,
	},

	Route{
		"GetDataInput",
		strings.ToUpper("Get"),
		"/v1/industrial/data/{data_input_id}",
		GetDataInput,
	},

	Route{
		"GetMachines",
		strings.ToUpper("Post"),
		"/v1/machines/list",
		GetMachines,
	},

	Route{
		"GetMachinesHistory",
		strings.ToUpper("Post"),
		"/v1/machines/history",
		GetMachinesHistory,
	},

	Route{
		"CreateDispatchRoute",
		strings.ToUpper("Post"),
		"/v1/fleet/dispatch/routes",
		CreateDispatchRoute,
	},

	Route{
		"CreateDriverDispatchRoute",
		strings.ToUpper("Post"),
		"/v1/fleet/drivers/{driver_id}/dispatch/routes",
		CreateDriverDispatchRoute,
	},

	Route{
		"CreateVehicleDispatchRoute",
		strings.ToUpper("Post"),
		"/v1/fleet/vehicles/{vehicle_id}/dispatch/routes",
		CreateVehicleDispatchRoute,
	},

	Route{
		"DeleteDispatchRouteById",
		strings.ToUpper("Delete"),
		"/v1/fleet/dispatch/routes/{route_id}",
		DeleteDispatchRouteById,
	},

	Route{
		"FetchAllDispatchRoutes",
		strings.ToUpper("Get"),
		"/v1/fleet/dispatch/routes",
		FetchAllDispatchRoutes,
	},

	Route{
		"FetchAllRouteJobUpdates",
		strings.ToUpper("Get"),
		"/v1/fleet/dispatch/routes/job_updates",
		FetchAllRouteJobUpdates,
	},

	Route{
		"GetDispatchRouteById",
		strings.ToUpper("Get"),
		"/v1/fleet/dispatch/routes/{route_id}",
		GetDispatchRouteById,
	},

	Route{
		"GetDispatchRouteHistory",
		strings.ToUpper("Get"),
		"/v1/fleet/dispatch/routes/{route_id}/history",
		GetDispatchRouteHistory,
	},

	Route{
		"GetDispatchRoutesByDriverId",
		strings.ToUpper("Get"),
		"/v1/fleet/drivers/{driver_id}/dispatch/routes",
		GetDispatchRoutesByDriverId,
	},

	Route{
		"GetDispatchRoutesByVehicleId",
		strings.ToUpper("Get"),
		"/v1/fleet/vehicles/{vehicle_id}/dispatch/routes",
		GetDispatchRoutesByVehicleId,
	},

	Route{
		"UpdateDispatchRouteById",
		strings.ToUpper("Put"),
		"/v1/fleet/dispatch/routes/{route_id}",
		UpdateDispatchRouteById,
	},

	Route{
		"GetDriverSafetyScore",
		strings.ToUpper("Get"),
		"/v1/fleet/drivers/{driverId}/safety/score",
		GetDriverSafetyScore,
	},

	Route{
		"GetVehicleHarshEvent",
		strings.ToUpper("Get"),
		"/v1/fleet/vehicles/{vehicleId}/safety/harsh_event",
		GetVehicleHarshEvent,
	},

	Route{
		"GetVehicleSafetyScore",
		strings.ToUpper("Get"),
		"/v1/fleet/vehicles/{vehicleId}/safety/score",
		GetVehicleSafetyScore,
	},

	Route{
		"GetSensors",
		strings.ToUpper("Post"),
		"/v1/sensors/list",
		GetSensors,
	},

	Route{
		"GetSensorsCargo",
		strings.ToUpper("Post"),
		"/v1/sensors/cargo",
		GetSensorsCargo,
	},

	Route{
		"GetSensorsDoor",
		strings.ToUpper("Post"),
		"/v1/sensors/door",
		GetSensorsDoor,
	},

	Route{
		"GetSensorsHistory",
		strings.ToUpper("Post"),
		"/v1/sensors/history",
		GetSensorsHistory,
	},

	Route{
		"GetSensorsHumidity",
		strings.ToUpper("Post"),
		"/v1/sensors/humidity",
		GetSensorsHumidity,
	},

	Route{
		"GetSensorsTemperature",
		strings.ToUpper("Post"),
		"/v1/sensors/temperature",
		GetSensorsTemperature,
	},

	Route{
		"CreateTag",
		strings.ToUpper("Post"),
		"/v1/tags",
		CreateTag,
	},

	Route{
		"DeleteTagById",
		strings.ToUpper("Delete"),
		"/v1/tags/{tag_id}",
		DeleteTagById,
	},

	Route{
		"GetAllTags",
		strings.ToUpper("Get"),
		"/v1/tags",
		GetAllTags,
	},

	Route{
		"GetTagById",
		strings.ToUpper("Get"),
		"/v1/tags/{tag_id}",
		GetTagById,
	},

	Route{
		"ModifyTagById",
		strings.ToUpper("Patch"),
		"/v1/tags/{tag_id}",
		ModifyTagById,
	},

	Route{
		"UpdateTagById",
		strings.ToUpper("Put"),
		"/v1/tags/{tag_id}",
		UpdateTagById,
	},

	Route{
		"DeleteUserById",
		strings.ToUpper("Delete"),
		"/v1/users/{userId}",
		DeleteUserById,
	},

	Route{
		"GetUserById",
		strings.ToUpper("Get"),
		"/v1/users/{userId}",
		GetUserById,
	},

	Route{
		"ListUserRoles",
		strings.ToUpper("Get"),
		"/v1/user_roles",
		ListUserRoles,
	},

	Route{
		"ListUsers",
		strings.ToUpper("Get"),
		"/v1/users",
		ListUsers,
	},
}
