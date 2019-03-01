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
package org.openapitools.client.api

import org.openapitools.client.model.Address
import org.openapitools.client.model.AllRouteJobUpdates
import org.openapitools.client.model.AssetReeferResponse
import org.openapitools.client.model.Contact
import org.openapitools.client.model.DispatchRoute
import org.openapitools.client.model.DispatchRouteCreate
import org.openapitools.client.model.DispatchRouteHistory
import org.openapitools.client.model.Document
import org.openapitools.client.model.DocumentCreate
import org.openapitools.client.model.DocumentType
import org.openapitools.client.model.Driver
import org.openapitools.client.model.DriverDailyLogResponse
import org.openapitools.client.model.DriverForCreate
import org.openapitools.client.model.DriverSafetyScoreResponse
import org.openapitools.client.model.DriversResponse
import org.openapitools.client.model.DriversSummaryResponse
import org.openapitools.client.model.DvirBase
import org.openapitools.client.model.DvirListResponse
import org.openapitools.client.model.FleetVehicleLocation
import org.openapitools.client.model.FleetVehicleResponse
import org.openapitools.client.model.HosAuthenticationLogsResponse
import org.openapitools.client.model.HosLogsResponse
import org.openapitools.client.model.HosLogsSummaryResponse
import org.openapitools.client.model.InlineObject
import org.openapitools.client.model.InlineObject1
import org.openapitools.client.model.InlineObject10
import org.openapitools.client.model.InlineObject11
import org.openapitools.client.model.InlineObject12
import org.openapitools.client.model.InlineObject13
import org.openapitools.client.model.InlineObject14
import org.openapitools.client.model.InlineObject15
import org.openapitools.client.model.InlineObject16
import org.openapitools.client.model.InlineObject2
import org.openapitools.client.model.InlineObject3
import org.openapitools.client.model.InlineObject4
import org.openapitools.client.model.InlineObject5
import org.openapitools.client.model.InlineObject6
import org.openapitools.client.model.InlineObject7
import org.openapitools.client.model.InlineObject8
import org.openapitools.client.model.InlineObject9
import org.openapitools.client.model.InlineResponse200
import org.openapitools.client.model.InlineResponse2001
import org.openapitools.client.model.InlineResponse2002
import org.openapitools.client.model.InlineResponse2003
import org.openapitools.client.model.InlineResponse2004
import org.openapitools.client.model.InlineResponse2005
import org.openapitools.client.model.TripResponse
import org.openapitools.client.model.VehicleHarshEventResponse
import org.openapitools.client.model.VehicleSafetyScoreResponse
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object FleetApi {

  /**
   * This method adds an address book entry to the specified group.
   * 
   * Expected answers:
   *   code 200 :  (Address was successfully added. No response body is returned.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param addressParam 
   */
  def addFleetAddress(accessToken: String, addressParam: InlineObject2): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.samsara.com/v1", "/fleet/add_address", "application/json")
      .withBody(addressParam)
      .withQueryParam("access_token", accessToken)
      .withSuccessResponse[Unit](200)
      .withDefaultErrorResponse[String]
        /**
   * Add one or more addresses to the organization
   * 
   * Expected answers:
   *   code 200 : Seq[Address] (List of added addresses/geofences. For each address entry, the geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type. Circle geofences added without a specific lat/lng are geocoded asynchronously, and will be 0,0 in the immediate response.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param addresses 
   */
  def addOrganizationAddresses(accessToken: String, addresses: InlineObject): ApiRequest[Seq[Address]] =
    ApiRequest[Seq[Address]](ApiMethods.POST, "https://api.samsara.com/v1", "/addresses", "application/json")
      .withBody(addresses)
      .withQueryParam("access_token", accessToken)
      .withSuccessResponse[Seq[Address]](200)
      .withDefaultErrorResponse[String]
        /**
   * Create a new dispatch route.
   * 
   * Expected answers:
   *   code 200 : DispatchRoute (Created route object including the new route ID.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param createDispatchRouteParams 
   */
  def createDispatchRoute(accessToken: String, createDispatchRouteParams: DispatchRouteCreate): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.samsara.com/v1", "/fleet/dispatch/routes", "application/json")
      .withBody(createDispatchRouteParams)
      .withQueryParam("access_token", accessToken)
      .withSuccessResponse[DispatchRoute](200)
      .withDefaultErrorResponse[String]
        /**
   * Create a new driver.
   * 
   * Expected answers:
   *   code 200 : Driver (Returns the successfully created the driver.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param createDriverParam Driver creation body
   */
  def createDriver(accessToken: String, createDriverParam: DriverForCreate): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.samsara.com/v1", "/fleet/drivers/create", "application/json")
      .withBody(createDriverParam)
      .withQueryParam("access_token", accessToken)
      .withSuccessResponse[Driver](200)
      .withDefaultErrorResponse[String]
        /**
   * Create a new dispatch route for the driver with driver_id.
   * 
   * Expected answers:
   *   code 200 : DispatchRoute (Created route object including the new route ID.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param driverId ID of the driver with the associated routes.
   * @param createDispatchRouteParams 
   */
  def createDriverDispatchRoute(accessToken: String, driverId: Long, createDispatchRouteParams: DispatchRouteCreate): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.samsara.com/v1", "/fleet/drivers/{driver_id}/dispatch/routes", "application/json")
      .withBody(createDispatchRouteParams)
      .withQueryParam("access_token", accessToken)
      .withPathParam("driver_id", driverId)
      .withSuccessResponse[DispatchRoute](200)
      .withDefaultErrorResponse[String]
        /**
   * Create a driver document for the given driver.
   * 
   * Expected answers:
   *   code 200 : Document (Returns the created document.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param driverId ID of the driver for whom the document is created.
   * @param createDocumentParams To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
   */
  def createDriverDocument(accessToken: String, driverId: Long, createDocumentParams: DocumentCreate): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.samsara.com/v1", "/fleet/drivers/{driver_id}/documents", "application/json")
      .withBody(createDocumentParams)
      .withQueryParam("access_token", accessToken)
      .withPathParam("driver_id", driverId)
      .withSuccessResponse[Document](200)
      .withDefaultErrorResponse[String]
        /**
   * Create a new dvir, marking a vehicle or trailer safe or unsafe.
   * 
   * Expected answers:
   *   code 200 : DvirBase (Newly created DVIR.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param createDvirParam 
   */
  def createDvir(accessToken: String, createDvirParam: InlineObject12): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.samsara.com/v1", "/fleet/maintenance/dvirs", "application/json")
      .withBody(createDvirParam)
      .withQueryParam("access_token", accessToken)
      .withSuccessResponse[DvirBase](200)
      .withDefaultErrorResponse[String]
        /**
   * Create a new dispatch route for the vehicle with vehicle_id.
   * 
   * Expected answers:
   *   code 200 : DispatchRoute (Created route object including the new route ID.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param vehicleId ID of the vehicle with the associated routes.
   * @param createDispatchRouteParams 
   */
  def createVehicleDispatchRoute(accessToken: String, vehicleId: Long, createDispatchRouteParams: DispatchRouteCreate): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.samsara.com/v1", "/fleet/vehicles/{vehicle_id}/dispatch/routes", "application/json")
      .withBody(createDispatchRouteParams)
      .withQueryParam("access_token", accessToken)
      .withPathParam("vehicle_id", vehicleId)
      .withSuccessResponse[DispatchRoute](200)
      .withDefaultErrorResponse[String]
        /**
   * Deactivate a driver with the given id.
   * 
   * Expected answers:
   *   code 200 :  (Successfully deactivated the driver, which is now referenced by /fleet/drivers/inactive/{driver_id}.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
   */
  def deactivateDriver(accessToken: String, driverIdOrExternalId: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.DELETE, "https://api.samsara.com/v1", "/fleet/drivers/{driver_id_or_external_id}", "application/json")
      .withQueryParam("access_token", accessToken)
      .withPathParam("driver_id_or_external_id", driverIdOrExternalId)
      .withSuccessResponse[Unit](200)
      .withDefaultErrorResponse[String]
        /**
   * Delete a dispatch route and its associated jobs.
   * 
   * Expected answers:
   *   code 200 :  (Successfully deleted the dispatch route. No response body is returned.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param routeId ID of the dispatch route.
   */
  def deleteDispatchRouteById(accessToken: String, routeId: Long): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.DELETE, "https://api.samsara.com/v1", "/fleet/dispatch/routes/{route_id}", "application/json")
      .withQueryParam("access_token", accessToken)
      .withPathParam("route_id", routeId)
      .withSuccessResponse[Unit](200)
      .withDefaultErrorResponse[String]
        /**
   * Delete an address.
   * 
   * Expected answers:
   *   code 200 :  (Address was successfully deleted. No response body is returned.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param addressId ID of the address/geofence
   */
  def deleteOrganizationAddress(accessToken: String, addressId: Long): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.DELETE, "https://api.samsara.com/v1", "/addresses/{addressId}", "application/json")
      .withQueryParam("access_token", accessToken)
      .withPathParam("addressId", addressId)
      .withSuccessResponse[Unit](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch all of the dispatch routes for the group.
   * 
   * Expected answers:
   *   code 200 : Seq[DispatchRoute] (All dispatch route objects for the group.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param groupId Optional group ID if the organization has multiple groups (uncommon).
   * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
   * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
   */
  def fetchAllDispatchRoutes(accessToken: String, groupId: Option[Long] = None, endTime: Option[Long] = None, duration: Option[Long] = None): ApiRequest[Seq[DispatchRoute]] =
    ApiRequest[Seq[DispatchRoute]](ApiMethods.GET, "https://api.samsara.com/v1", "/fleet/dispatch/routes", "application/json")
      .withQueryParam("access_token", accessToken)
      .withQueryParam("group_id", groupId)
      .withQueryParam("end_time", endTime)
      .withQueryParam("duration", duration)
      .withSuccessResponse[Seq[DispatchRoute]](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
   * 
   * Expected answers:
   *   code 200 : AllRouteJobUpdates (All job updates on routes.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param groupId Optional group ID if the organization has multiple groups (uncommon).
   * @param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
   * @param include Optionally set include=route to include route object in response payload.
   */
  def fetchAllRouteJobUpdates(accessToken: String, groupId: Option[Long] = None, sequenceId: Option[String] = None, include: Option[String] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.samsara.com/v1", "/fleet/dispatch/routes/job_updates", "application/json")
      .withQueryParam("access_token", accessToken)
      .withQueryParam("group_id", groupId)
      .withQueryParam("sequence_id", sequenceId)
      .withQueryParam("include", include)
      .withSuccessResponse[AllRouteJobUpdates](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch current locations of all assets for the group.
   * 
   * Expected answers:
   *   code 200 : InlineResponse2001 (List of assets and their current locations.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param groupId Optional group ID if the organization has multiple groups (uncommon).
   */
  def getAllAssetCurrentLocations(accessToken: String, groupId: Option[Long] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.samsara.com/v1", "/fleet/assets/locations", "application/json")
      .withQueryParam("access_token", accessToken)
      .withQueryParam("group_id", groupId)
      .withSuccessResponse[InlineResponse2001](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch all of the assets for the group.
   * 
   * Expected answers:
   *   code 200 : InlineResponse200 (List of assets.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param groupId Optional group ID if the organization has multiple groups (uncommon).
   */
  def getAllAssets(accessToken: String, groupId: Option[Long] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.samsara.com/v1", "/fleet/assets", "application/json")
      .withQueryParam("access_token", accessToken)
      .withQueryParam("group_id", groupId)
      .withSuccessResponse[InlineResponse200](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch all deactivated drivers for the group.
   * 
   * Expected answers:
   *   code 200 : Seq[Driver] (Returns an array of all deactivated drivers for the group. Deactivated drivers are referenced at /fleet/drivers/inactive/{driver_id})
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param groupId Optional group ID if the organization has multiple groups (uncommon).
   */
  def getAllDeactivatedDrivers(accessToken: String, groupId: Option[Long] = None): ApiRequest[Seq[Driver]] =
    ApiRequest[Seq[Driver]](ApiMethods.GET, "https://api.samsara.com/v1", "/fleet/drivers/inactive", "application/json")
      .withQueryParam("access_token", accessToken)
      .withQueryParam("group_id", groupId)
      .withSuccessResponse[Seq[Driver]](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch the historical locations for the asset.
   * 
   * Expected answers:
   *   code 200 : Seq[Any] (Asset location details.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param assetId ID of the asset
   * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
   * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
   */
  def getAssetLocation(accessToken: String, assetId: Long, startMs: Long, endMs: Long): ApiRequest[Seq[Any]] =
    ApiRequest[Seq[Any]](ApiMethods.GET, "https://api.samsara.com/v1", "/fleet/assets/{asset_id}/locations", "application/json")
      .withQueryParam("access_token", accessToken)
      .withQueryParam("startMs", startMs)
      .withQueryParam("endMs", endMs)
      .withPathParam("asset_id", assetId)
      .withSuccessResponse[Seq[Any]](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch the reefer-specific stats of an asset.
   * 
   * Expected answers:
   *   code 200 : AssetReeferResponse (Reefer-specific asset details.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param assetId ID of the asset
   * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
   * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
   */
  def getAssetReefer(accessToken: String, assetId: Long, startMs: Long, endMs: Long): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.samsara.com/v1", "/fleet/assets/{asset_id}/reefer", "application/json")
      .withQueryParam("access_token", accessToken)
      .withQueryParam("startMs", startMs)
      .withQueryParam("endMs", endMs)
      .withPathParam("asset_id", assetId)
      .withSuccessResponse[AssetReeferResponse](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch deactivated driver by id.
   * 
   * Expected answers:
   *   code 200 : Driver (Returns the deactivated driver with the given driver_id.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
   */
  def getDeactivatedDriverById(accessToken: String, driverIdOrExternalId: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.samsara.com/v1", "/fleet/drivers/inactive/{driver_id_or_external_id}", "application/json")
      .withQueryParam("access_token", accessToken)
      .withPathParam("driver_id_or_external_id", driverIdOrExternalId)
      .withSuccessResponse[Driver](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch a dispatch route by id.
   * 
   * Expected answers:
   *   code 200 : DispatchRoute (The dispatch route corresponding to route_id.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param routeId ID of the dispatch route.
   */
  def getDispatchRouteById(accessToken: String, routeId: Long): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.samsara.com/v1", "/fleet/dispatch/routes/{route_id}", "application/json")
      .withQueryParam("access_token", accessToken)
      .withPathParam("route_id", routeId)
      .withSuccessResponse[DispatchRoute](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch the history of a dispatch route.
   * 
   * Expected answers:
   *   code 200 : DispatchRouteHistory (The historical route state changes between start_time and end_time.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param routeId ID of the route with history.
   * @param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
   * @param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
   */
  def getDispatchRouteHistory(accessToken: String, routeId: Long, startTime: Option[Long] = None, endTime: Option[Long] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.samsara.com/v1", "/fleet/dispatch/routes/{route_id}/history", "application/json")
      .withQueryParam("access_token", accessToken)
      .withQueryParam("start_time", startTime)
      .withQueryParam("end_time", endTime)
      .withPathParam("route_id", routeId)
      .withSuccessResponse[DispatchRouteHistory](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch all of the dispatch routes for a given driver.
   * 
   * Expected answers:
   *   code 200 : Seq[DispatchRoute] (Returns the dispatch routes for the given driver_id.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param driverId ID of the driver with the associated routes.
   * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
   * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
   */
  def getDispatchRoutesByDriverId(accessToken: String, driverId: Long, endTime: Option[Long] = None, duration: Option[Long] = None): ApiRequest[Seq[DispatchRoute]] =
    ApiRequest[Seq[DispatchRoute]](ApiMethods.GET, "https://api.samsara.com/v1", "/fleet/drivers/{driver_id}/dispatch/routes", "application/json")
      .withQueryParam("access_token", accessToken)
      .withQueryParam("end_time", endTime)
      .withQueryParam("duration", duration)
      .withPathParam("driver_id", driverId)
      .withSuccessResponse[Seq[DispatchRoute]](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch all of the dispatch routes for a given vehicle.
   * 
   * Expected answers:
   *   code 200 : Seq[DispatchRoute] (Returns all of the dispatch routes for the given vehicle_id.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param vehicleId ID of the vehicle with the associated routes.
   * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
   * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
   */
  def getDispatchRoutesByVehicleId(accessToken: String, vehicleId: Long, endTime: Option[Long] = None, duration: Option[Long] = None): ApiRequest[Seq[DispatchRoute]] =
    ApiRequest[Seq[DispatchRoute]](ApiMethods.GET, "https://api.samsara.com/v1", "/fleet/vehicles/{vehicle_id}/dispatch/routes", "application/json")
      .withQueryParam("access_token", accessToken)
      .withQueryParam("end_time", endTime)
      .withQueryParam("duration", duration)
      .withPathParam("vehicle_id", vehicleId)
      .withSuccessResponse[Seq[DispatchRoute]](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch driver by id.
   * 
   * Expected answers:
   *   code 200 : Driver (Returns the driver for the given driver_id.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
   */
  def getDriverById(accessToken: String, driverIdOrExternalId: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.samsara.com/v1", "/fleet/drivers/{driver_id_or_external_id}", "application/json")
      .withQueryParam("access_token", accessToken)
      .withPathParam("driver_id_or_external_id", driverIdOrExternalId)
      .withSuccessResponse[Driver](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch all of the document types.
   * 
   * Expected answers:
   *   code 200 : Seq[DocumentType] (Returns all of the document types.)
   *   code 0 : String (Unexpected error.)
   */
  def getDriverDocumentTypesByOrgId(): ApiRequest[Seq[DocumentType]] =
    ApiRequest[Seq[DocumentType]](ApiMethods.GET, "https://api.samsara.com/v1", "/fleet/drivers/document_types", "application/json")
      .withSuccessResponse[Seq[DocumentType]](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch all of the documents.
   * 
   * Expected answers:
   *   code 200 : Seq[Document] (Returns all of the documents.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
   * @param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
   */
  def getDriverDocumentsByOrgId(accessToken: String, endMs: Option[Long] = None, durationMs: Option[Long] = None): ApiRequest[Seq[Document]] =
    ApiRequest[Seq[Document]](ApiMethods.GET, "https://api.samsara.com/v1", "/fleet/drivers/documents", "application/json")
      .withQueryParam("access_token", accessToken)
      .withQueryParam("endMs", endMs)
      .withQueryParam("durationMs", durationMs)
      .withSuccessResponse[Seq[Document]](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch the safety score for the driver.
   * 
   * Expected answers:
   *   code 200 : DriverSafetyScoreResponse (Safety score details.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param driverId ID of the driver
   * @param accessToken Samsara API access token.
   * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
   * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
   */
  def getDriverSafetyScore(driverId: Long, accessToken: String, startMs: Long, endMs: Long): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.samsara.com/v1", "/fleet/drivers/{driverId}/safety/score", "application/json")
      .withQueryParam("access_token", accessToken)
      .withQueryParam("startMs", startMs)
      .withQueryParam("endMs", endMs)
      .withPathParam("driverId", driverId)
      .withSuccessResponse[DriverSafetyScoreResponse](200)
      .withDefaultErrorResponse[String]
        /**
   * Get DVIRs for the org within provided time constraints
   * 
   * Expected answers:
   *   code 200 : DvirListResponse (DVIRs for the specified duration.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param endMs time in millis until the last dvir log.
   * @param durationMs time in millis which corresponds to the duration before the end_ms.
   * @param groupId Group ID to query.
   */
  def getDvirs(accessToken: String, endMs: Int, durationMs: Int, groupId: Option[Int] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.samsara.com/v1", "/fleet/maintenance/dvirs", "application/json")
      .withQueryParam("access_token", accessToken)
      .withQueryParam("end_ms", endMs)
      .withQueryParam("duration_ms", durationMs)
      .withQueryParam("group_id", groupId)
      .withSuccessResponse[DvirListResponse](200)
      .withDefaultErrorResponse[String]
        /**
   * Get all the drivers for the specified group.
   * 
   * Expected answers:
   *   code 200 : DriversResponse (All drivers in the group.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param groupDriversParam 
   */
  def getFleetDrivers(accessToken: String, groupDriversParam: InlineObject3): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.samsara.com/v1", "/fleet/drivers", "application/json")
      .withBody(groupDriversParam)
      .withQueryParam("access_token", accessToken)
      .withSuccessResponse[DriversResponse](200)
      .withDefaultErrorResponse[String]
        /**
   * Get summarized daily HOS charts for a specified driver.
   * 
   * Expected answers:
   *   code 200 : DriverDailyLogResponse (Distance traveled and time active for each driver in the organization over the specified time period.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param driverId ID of the driver with HOS logs.
   * @param hosLogsParam 
   */
  def getFleetDriversHosDailyLogs(accessToken: String, driverId: Long, hosLogsParam: InlineObject6): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.samsara.com/v1", "/fleet/drivers/{driver_id}/hos_daily_logs", "application/json")
      .withBody(hosLogsParam)
      .withQueryParam("access_token", accessToken)
      .withPathParam("driver_id", driverId)
      .withSuccessResponse[DriverDailyLogResponse](200)
      .withDefaultErrorResponse[String]
        /**
   * Get the distance and time each driver in an organization has driven in a given time period.
   * 
   * Expected answers:
   *   code 200 : DriversSummaryResponse (Distance traveled and time active for each driver in the organization over the specified time period.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param driversSummaryParam 
   * @param snapToDayBounds Snap query result to HOS day boundaries.
   */
  def getFleetDriversSummary(accessToken: String, driversSummaryParam: InlineObject5, snapToDayBounds: Option[Boolean] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.samsara.com/v1", "/fleet/drivers/summary", "application/json")
      .withBody(driversSummaryParam)
      .withQueryParam("access_token", accessToken)
      .withQueryParam("snap_to_day_bounds", snapToDayBounds)
      .withSuccessResponse[DriversSummaryResponse](200)
      .withDefaultErrorResponse[String]
        /**
   * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
   * 
   * Expected answers:
   *   code 200 : HosAuthenticationLogsResponse (HOS authentication logs for the specified driver.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param hosAuthenticationLogsParam 
   */
  def getFleetHosAuthenticationLogs(accessToken: String, hosAuthenticationLogsParam: InlineObject7): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.samsara.com/v1", "/fleet/hos_authentication_logs", "application/json")
      .withBody(hosAuthenticationLogsParam)
      .withQueryParam("access_token", accessToken)
      .withSuccessResponse[HosAuthenticationLogsResponse](200)
      .withDefaultErrorResponse[String]
        /**
   * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
   * 
   * Expected answers:
   *   code 200 : HosLogsResponse (HOS logs for the specified driver.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param hosLogsParam 
   */
  def getFleetHosLogs(accessToken: String, hosLogsParam: InlineObject8): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.samsara.com/v1", "/fleet/hos_logs", "application/json")
      .withBody(hosLogsParam)
      .withQueryParam("access_token", accessToken)
      .withSuccessResponse[HosLogsResponse](200)
      .withDefaultErrorResponse[String]
        /**
   * Get the current HOS status for all drivers in the group.
   * 
   * Expected answers:
   *   code 200 : HosLogsSummaryResponse (HOS logs for the specified driver.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param hosLogsParam 
   */
  def getFleetHosLogsSummary(accessToken: String, hosLogsParam: InlineObject9): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.samsara.com/v1", "/fleet/hos_logs_summary", "application/json")
      .withBody(hosLogsParam)
      .withQueryParam("access_token", accessToken)
      .withSuccessResponse[HosLogsSummaryResponse](200)
      .withDefaultErrorResponse[String]
        /**
   * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
   * 
   * Expected answers:
   *   code 200 : InlineResponse2003 (List of vehicle objects containing their location and the time at which that location was logged.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param groupParam 
   */
  def getFleetLocations(accessToken: String, groupParam: InlineObject11): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.samsara.com/v1", "/fleet/locations", "application/json")
      .withBody(groupParam)
      .withQueryParam("access_token", accessToken)
      .withSuccessResponse[InlineResponse2003](200)
      .withDefaultErrorResponse[String]
        /**
   * Get list of the vehicles with any engine faults or check light data.
   * 
   * Expected answers:
   *   code 200 : InlineResponse2004 (List of vehicles and maintenance information about each.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param groupParam 
   */
  def getFleetMaintenanceList(accessToken: String, groupParam: InlineObject13): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.samsara.com/v1", "/fleet/maintenance/list", "application/json")
      .withBody(groupParam)
      .withQueryParam("access_token", accessToken)
      .withSuccessResponse[InlineResponse2004](200)
      .withDefaultErrorResponse[String]
        /**
   * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
   * 
   * Expected answers:
   *   code 200 : TripResponse (List of trips taken by the requested vehicle within the specified timeframe.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param tripsParam 
   */
  def getFleetTrips(accessToken: String, tripsParam: InlineObject15): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.samsara.com/v1", "/fleet/trips", "application/json")
      .withBody(tripsParam)
      .withQueryParam("access_token", accessToken)
      .withSuccessResponse[TripResponse](200)
      .withDefaultErrorResponse[String]
        /**
   * Gets a specific vehicle.
   * 
   * Expected answers:
   *   code 200 : FleetVehicleResponse (The specified vehicle.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
   */
  def getFleetVehicle(accessToken: String, vehicleIdOrExternalId: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.samsara.com/v1", "/fleet/vehicles/{vehicle_id_or_external_id}", "application/json")
      .withQueryParam("access_token", accessToken)
      .withPathParam("vehicle_id_or_external_id", vehicleIdOrExternalId)
      .withSuccessResponse[FleetVehicleResponse](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch an address by its id.
   * 
   * Expected answers:
   *   code 200 : Address (The address/geofence. The geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param addressId ID of the address/geofence
   */
  def getOrganizationAddress(accessToken: String, addressId: Long): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.samsara.com/v1", "/addresses/{addressId}", "application/json")
      .withQueryParam("access_token", accessToken)
      .withPathParam("addressId", addressId)
      .withSuccessResponse[Address](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
   * 
   * Expected answers:
   *   code 200 : Seq[Address] (List of addresses/geofences. For each address entry, the geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   */
  def getOrganizationAddresses(accessToken: String): ApiRequest[Seq[Address]] =
    ApiRequest[Seq[Address]](ApiMethods.GET, "https://api.samsara.com/v1", "/addresses", "application/json")
      .withQueryParam("access_token", accessToken)
      .withSuccessResponse[Seq[Address]](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch a contact by its id.
   * 
   * Expected answers:
   *   code 200 : Contact (The contact.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param contactId ID of the contact
   */
  def getOrganizationContact(accessToken: String, contactId: Long): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.samsara.com/v1", "/contacts/{contact_id}", "application/json")
      .withQueryParam("access_token", accessToken)
      .withPathParam("contact_id", contactId)
      .withSuccessResponse[Contact](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch harsh event details for a vehicle.
   * 
   * Expected answers:
   *   code 200 : VehicleHarshEventResponse (Harsh event details.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param vehicleId ID of the vehicle
   * @param accessToken Samsara API access token.
   * @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event.
   */
  def getVehicleHarshEvent(vehicleId: Long, accessToken: String, timestamp: Long): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.samsara.com/v1", "/fleet/vehicles/{vehicleId}/safety/harsh_event", "application/json")
      .withQueryParam("access_token", accessToken)
      .withQueryParam("timestamp", timestamp)
      .withPathParam("vehicleId", vehicleId)
      .withSuccessResponse[VehicleHarshEventResponse](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
   * 
   * Expected answers:
   *   code 200 : Seq[FleetVehicleLocation] (Returns locations for a given vehicle between a start/end time, with a maximum query duration of one hour.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param vehicleId ID of the vehicle with the associated routes.
   * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
   * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
   */
  def getVehicleLocations(accessToken: String, vehicleId: Long, startMs: Long, endMs: Long): ApiRequest[Seq[FleetVehicleLocation]] =
    ApiRequest[Seq[FleetVehicleLocation]](ApiMethods.GET, "https://api.samsara.com/v1", "/fleet/vehicles/{vehicle_id}/locations", "application/json")
      .withQueryParam("access_token", accessToken)
      .withQueryParam("startMs", startMs)
      .withQueryParam("endMs", endMs)
      .withPathParam("vehicle_id", vehicleId)
      .withSuccessResponse[Seq[FleetVehicleLocation]](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch the safety score for the vehicle.
   * 
   * Expected answers:
   *   code 200 : VehicleSafetyScoreResponse (Safety score details.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param vehicleId ID of the vehicle
   * @param accessToken Samsara API access token.
   * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
   * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
   */
  def getVehicleSafetyScore(vehicleId: Long, accessToken: String, startMs: Long, endMs: Long): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.samsara.com/v1", "/fleet/vehicles/{vehicleId}/safety/score", "application/json")
      .withQueryParam("access_token", accessToken)
      .withQueryParam("startMs", startMs)
      .withQueryParam("endMs", endMs)
      .withPathParam("vehicleId", vehicleId)
      .withSuccessResponse[VehicleSafetyScoreResponse](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
   * 
   * Expected answers:
   *   code 200 : InlineResponse2005 (Returns engine state and/or aux input data for all vehicles in the group between a start/end time.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param startMs Time in Unix epoch milliseconds for the start of the query.
   * @param endMs Time in Unix epoch milliseconds for the end of the query.
   * @param series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2
   * @param tagIds Comma-separated list of tag ids. Example: tagIds=1,2,3
   * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
   * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
   * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.
   */
  def getVehicleStats(accessToken: String, startMs: Int, endMs: Int, series: Option[String] = None, tagIds: Option[String] = None, startingAfter: Option[String] = None, endingBefore: Option[String] = None, limit: Option[Long] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://api.samsara.com/v1", "/fleet/vehicles/stats", "application/json")
      .withQueryParam("access_token", accessToken)
      .withQueryParam("startMs", startMs)
      .withQueryParam("endMs", endMs)
      .withQueryParam("series", series)
      .withQueryParam("tagIds", tagIds)
      .withQueryParam("startingAfter", startingAfter)
      .withQueryParam("endingBefore", endingBefore)
      .withQueryParam("limit", limit)
      .withSuccessResponse[InlineResponse2005](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
   * 
   * Expected answers:
   *   code 200 : Seq[Any] (Returns locations for a given vehicle between a start/end time, with a maximum query duration of 30 minutes.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
   * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
   */
  def getVehiclesLocations(accessToken: String, startMs: Int, endMs: Int): ApiRequest[Seq[Any]] =
    ApiRequest[Seq[Any]](ApiMethods.GET, "https://api.samsara.com/v1", "/fleet/vehicles/locations", "application/json")
      .withQueryParam("access_token", accessToken)
      .withQueryParam("startMs", startMs)
      .withQueryParam("endMs", endMs)
      .withSuccessResponse[Seq[Any]](200)
      .withDefaultErrorResponse[String]
        /**
   * Fetch all contacts for the organization.
   * 
   * Expected answers:
   *   code 200 : Seq[Contact] (List of contacts.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   */
  def listContacts(accessToken: String): ApiRequest[Seq[Contact]] =
    ApiRequest[Seq[Contact]](ApiMethods.GET, "https://api.samsara.com/v1", "/contacts", "application/json")
      .withQueryParam("access_token", accessToken)
      .withSuccessResponse[Seq[Contact]](200)
      .withDefaultErrorResponse[String]
        /**
   * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
   * 
   * Expected answers:
   *   code 200 : InlineResponse2002 (List of vehicles and information about each.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param groupParam 
   * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
   * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
   * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.
   */
  def listFleet(accessToken: String, groupParam: InlineObject10, startingAfter: Option[String] = None, endingBefore: Option[String] = None, limit: Option[Long] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.samsara.com/v1", "/fleet/list", "application/json")
      .withBody(groupParam)
      .withQueryParam("access_token", accessToken)
      .withQueryParam("startingAfter", startingAfter)
      .withQueryParam("endingBefore", endingBefore)
      .withQueryParam("limit", limit)
      .withSuccessResponse[InlineResponse2002](200)
      .withDefaultErrorResponse[String]
        /**
   * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
   * 
   * Expected answers:
   *   code 200 : FleetVehicleResponse (The updated vehicle.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
   * @param data 
   */
  def patchFleetVehicle(accessToken: String, vehicleIdOrExternalId: String, data: InlineObject16): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.PATCH, "https://api.samsara.com/v1", "/fleet/vehicles/{vehicle_id_or_external_id}", "application/json")
      .withBody(data)
      .withQueryParam("access_token", accessToken)
      .withPathParam("vehicle_id_or_external_id", vehicleIdOrExternalId)
      .withSuccessResponse[FleetVehicleResponse](200)
      .withDefaultErrorResponse[String]
        /**
   * Reactivate the inactive driver having id.
   * 
   * Expected answers:
   *   code 200 : Driver (Returns the reactivated driver, which is now available at /fleet/drivers/{driver_id}.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
   * @param reactivateDriverParam 
   */
  def reactivateDriverById(accessToken: String, driverIdOrExternalId: String, reactivateDriverParam: InlineObject4): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.PUT, "https://api.samsara.com/v1", "/fleet/drivers/inactive/{driver_id_or_external_id}", "application/json")
      .withBody(reactivateDriverParam)
      .withQueryParam("access_token", accessToken)
      .withPathParam("driver_id_or_external_id", driverIdOrExternalId)
      .withSuccessResponse[Driver](200)
      .withDefaultErrorResponse[String]
        /**
   * Update a dispatch route and its associated jobs.
   * 
   * Expected answers:
   *   code 200 : DispatchRoute (Update the dispatch route. Allowable updates include setting job state, adding or removing jobs, and changing job locations and times.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param routeId ID of the dispatch route.
   * @param updateDispatchRouteParams 
   */
  def updateDispatchRouteById(accessToken: String, routeId: Long, updateDispatchRouteParams: DispatchRoute): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.PUT, "https://api.samsara.com/v1", "/fleet/dispatch/routes/{route_id}", "application/json")
      .withBody(updateDispatchRouteParams)
      .withQueryParam("access_token", accessToken)
      .withPathParam("route_id", routeId)
      .withSuccessResponse[DispatchRoute](200)
      .withDefaultErrorResponse[String]
        /**
   * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
   * 
   * Expected answers:
   *   code 200 :  (Address was successfully updated. No response body is returned.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param addressId ID of the address/geofence
   * @param address 
   */
  def updateOrganizationAddress(accessToken: String, addressId: Long, address: InlineObject1): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.PATCH, "https://api.samsara.com/v1", "/addresses/{addressId}", "application/json")
      .withBody(address)
      .withQueryParam("access_token", accessToken)
      .withPathParam("addressId", addressId)
      .withSuccessResponse[Unit](200)
      .withDefaultErrorResponse[String]
        /**
   * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
   * 
   * Expected answers:
   *   code 200 :  (Vehicles were successfully updated. No response body is returned.)
   *   code 0 : String (Unexpected error.)
   * 
   * @param accessToken Samsara API access token.
   * @param vehicleUpdateParam 
   */
  def updateVehicles(accessToken: String, vehicleUpdateParam: InlineObject14): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://api.samsara.com/v1", "/fleet/set_data", "application/json")
      .withBody(vehicleUpdateParam)
      .withQueryParam("access_token", accessToken)
      .withSuccessResponse[Unit](200)
      .withDefaultErrorResponse[String]
      

}

