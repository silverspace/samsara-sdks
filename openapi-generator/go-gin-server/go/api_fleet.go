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
	"net/http"

	"github.com/gin-gonic/gin"
)

// AddFleetAddress - /fleet/add_address
func AddFleetAddress(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// AddOrganizationAddresses - /addresses
func AddOrganizationAddresses(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// CreateDispatchRoute - /fleet/dispatch/routes
func CreateDispatchRoute(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// CreateDriver - /fleet/drivers/create
func CreateDriver(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// CreateDriverDispatchRoute - /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
func CreateDriverDispatchRoute(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// CreateDriverDocument - /fleet/drivers/{driver_id:[0-9]+}/documents
func CreateDriverDocument(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// CreateDvir - /fleet/maintenance/dvirs
func CreateDvir(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// CreateVehicleDispatchRoute - /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
func CreateVehicleDispatchRoute(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// DeactivateDriver - /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
func DeactivateDriver(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// DeleteDispatchRouteById - /fleet/dispatch/routes/{route_id:[0-9]+}/
func DeleteDispatchRouteById(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// DeleteOrganizationAddress - /addresses/{addressId}
func DeleteOrganizationAddress(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// FetchAllDispatchRoutes - /fleet/dispatch/routes
func FetchAllDispatchRoutes(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// FetchAllRouteJobUpdates - /fleet/dispatch/routes/job_updates
func FetchAllRouteJobUpdates(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetAllAssetCurrentLocations - /fleet/assets/locations
func GetAllAssetCurrentLocations(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetAllAssets - /fleet/assets
func GetAllAssets(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetAllDeactivatedDrivers - /fleet/drivers/inactive
func GetAllDeactivatedDrivers(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetAssetLocation - /fleet/assets/{assetId:[0-9]+}/locations
func GetAssetLocation(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetAssetReefer - /fleet/assets/{assetId:[0-9]+}/reefer
func GetAssetReefer(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetDeactivatedDriverById - /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
func GetDeactivatedDriverById(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetDispatchRouteById - /fleet/dispatch/routes/{route_id:[0-9]+}
func GetDispatchRouteById(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetDispatchRouteHistory - /fleet/dispatch/routes/{route_id:[0-9]+}/history
func GetDispatchRouteHistory(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetDispatchRoutesByDriverId - /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
func GetDispatchRoutesByDriverId(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetDispatchRoutesByVehicleId - /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
func GetDispatchRoutesByVehicleId(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetDriverById - /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
func GetDriverById(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetDriverDocumentTypesByOrgId - /fleet/drivers/document_types
func GetDriverDocumentTypesByOrgId(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetDriverDocumentsByOrgId - /fleet/drivers/documents
func GetDriverDocumentsByOrgId(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetDriverSafetyScore - /fleet/drivers/{driverId:[0-9]+}/safety/score
func GetDriverSafetyScore(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetDvirs - /fleet/maintenance/dvirs
func GetDvirs(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetFleetDrivers - /fleet/drivers
func GetFleetDrivers(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetFleetDriversHosDailyLogs - /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
func GetFleetDriversHosDailyLogs(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetFleetDriversSummary - /fleet/drivers/summary
func GetFleetDriversSummary(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetFleetHosAuthenticationLogs - /fleet/hos_authentication_logs
func GetFleetHosAuthenticationLogs(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetFleetHosLogs - /fleet/hos_logs
func GetFleetHosLogs(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetFleetHosLogsSummary - /fleet/hos_logs_summary
func GetFleetHosLogsSummary(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetFleetLocations - /fleet/locations
func GetFleetLocations(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetFleetMaintenanceList - /fleet/maintenance/list
func GetFleetMaintenanceList(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetFleetTrips - /fleet/trips
func GetFleetTrips(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetFleetVehicle - /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
func GetFleetVehicle(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetOrganizationAddress - /addresses/{addressId}
func GetOrganizationAddress(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetOrganizationAddresses - /addresses
func GetOrganizationAddresses(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetOrganizationContact - /contacts/{contact_id}
func GetOrganizationContact(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetVehicleHarshEvent - /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
func GetVehicleHarshEvent(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetVehicleLocations - /fleet/vehicles/{vehicle_id:[0-9]+}/locations
func GetVehicleLocations(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetVehicleSafetyScore - /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
func GetVehicleSafetyScore(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetVehicleStats - /fleet/vehicles/stats
func GetVehicleStats(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// GetVehiclesLocations - /fleet/vehicles/locations
func GetVehiclesLocations(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// ListContacts - /contacts
func ListContacts(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// ListFleet - /fleet/list
func ListFleet(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// PatchFleetVehicle - /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
func PatchFleetVehicle(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// ReactivateDriverById - /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
func ReactivateDriverById(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// UpdateDispatchRouteById - /fleet/dispatch/routes/{route_id:[0-9]+}/
func UpdateDispatchRouteById(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// UpdateOrganizationAddress - /addresses/{addressId}
func UpdateOrganizationAddress(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}

// UpdateVehicles - /fleet/set_data
func UpdateVehicles(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}
