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

package io.swagger.client.api

import akka.{Done, NotUsed}
import com.lightbend.lagom.scaladsl.api.transport.Method
import com.lightbend.lagom.scaladsl.api.{Service, ServiceCall}
import play.api.libs.json._
import com.lightbend.lagom.scaladsl.api.deser.PathParamSerializer

import io.swagger.client.model.Address
import io.swagger.client.model.AllRouteJobUpdates
import io.swagger.client.model.AssetReeferResponse
import io.swagger.client.model.Contact
import io.swagger.client.model.DispatchRoute
import io.swagger.client.model.DispatchRouteCreate
import io.swagger.client.model.DispatchRouteHistory
import io.swagger.client.model.Document
import io.swagger.client.model.DocumentCreate
import io.swagger.client.model.DocumentType
import io.swagger.client.model.Driver
import io.swagger.client.model.DriverDailyLogResponse
import io.swagger.client.model.DriverForCreate
import io.swagger.client.model.DriverSafetyScoreResponse
import io.swagger.client.model.DriversResponse
import io.swagger.client.model.DriversSummaryResponse
import io.swagger.client.model.DvirBase
import io.swagger.client.model.DvirListResponse
import io.swagger.client.model.FleetVehicleLocation
import io.swagger.client.model.FleetVehicleResponse
import io.swagger.client.model.HosAuthenticationLogsResponse
import io.swagger.client.model.HosLogsResponse
import io.swagger.client.model.HosLogsSummaryResponse
import io.swagger.client.model.InlineObject
import io.swagger.client.model.InlineObject1
import io.swagger.client.model.InlineObject10
import io.swagger.client.model.InlineObject11
import io.swagger.client.model.InlineObject12
import io.swagger.client.model.InlineObject13
import io.swagger.client.model.InlineObject14
import io.swagger.client.model.InlineObject15
import io.swagger.client.model.InlineObject16
import io.swagger.client.model.InlineObject2
import io.swagger.client.model.InlineObject3
import io.swagger.client.model.InlineObject4
import io.swagger.client.model.InlineObject5
import io.swagger.client.model.InlineObject6
import io.swagger.client.model.InlineObject7
import io.swagger.client.model.InlineObject8
import io.swagger.client.model.InlineObject9
import io.swagger.client.model.InlineResponse200
import io.swagger.client.model.InlineResponse2001
import io.swagger.client.model.InlineResponse2002
import io.swagger.client.model.InlineResponse2003
import io.swagger.client.model.InlineResponse2004
import io.swagger.client.model.InlineResponse2005
import io.swagger.client.model.TripResponse
import io.swagger.client.model.VehicleHarshEventResponse
import io.swagger.client.model.VehicleSafetyScoreResponse

trait FleetApi extends Service {


  final override def descriptor = {
    import Service._
    named("FleetApi").withCalls(
      restCall(Method.POST, "/fleet/add_address?accessToken", addFleetAddress _), 
      restCall(Method.POST, "/addresses?accessToken", addOrganizationAddresses _), 
      restCall(Method.POST, "/fleet/dispatch/routes?accessToken", createDispatchRoute _), 
      restCall(Method.POST, "/fleet/drivers/create?accessToken", createDriver _), 
      restCall(Method.POST, "/fleet/drivers/:driver_id/dispatch/routes?accessToken", createDriverDispatchRoute _), 
      restCall(Method.POST, "/fleet/drivers/:driver_id/documents?accessToken", createDriverDocument _), 
      restCall(Method.POST, "/fleet/maintenance/dvirs?accessToken", createDvir _), 
      restCall(Method.POST, "/fleet/vehicles/:vehicle_id/dispatch/routes?accessToken", createVehicleDispatchRoute _), 
      restCall(Method.DELETE, "/fleet/drivers/:driver_id_or_external_id?accessToken", deactivateDriver _), 
      restCall(Method.DELETE, "/fleet/dispatch/routes/:route_id?accessToken", deleteDispatchRouteById _), 
      restCall(Method.DELETE, "/addresses/:addressId?accessToken", deleteOrganizationAddress _), 
      restCall(Method.GET, "/fleet/dispatch/routes?accessToken&groupId&endTime&duration", fetchAllDispatchRoutes _), 
      restCall(Method.GET, "/fleet/dispatch/routes/job_updates?accessToken&groupId&sequenceId&include", fetchAllRouteJobUpdates _), 
      restCall(Method.GET, "/fleet/assets/locations?accessToken&groupId", getAllAssetCurrentLocations _), 
      restCall(Method.GET, "/fleet/assets?accessToken&groupId", getAllAssets _), 
      restCall(Method.GET, "/fleet/drivers/inactive?accessToken&groupId", getAllDeactivatedDrivers _), 
      restCall(Method.GET, "/fleet/assets/:asset_id/locations?accessToken&startMs&endMs", getAssetLocation _), 
      restCall(Method.GET, "/fleet/assets/:asset_id/reefer?accessToken&startMs&endMs", getAssetReefer _), 
      restCall(Method.GET, "/fleet/drivers/inactive/:driver_id_or_external_id?accessToken", getDeactivatedDriverById _), 
      restCall(Method.GET, "/fleet/dispatch/routes/:route_id?accessToken", getDispatchRouteById _), 
      restCall(Method.GET, "/fleet/dispatch/routes/:route_id/history?accessToken&startTime&endTime", getDispatchRouteHistory _), 
      restCall(Method.GET, "/fleet/drivers/:driver_id/dispatch/routes?accessToken&endTime&duration", getDispatchRoutesByDriverId _), 
      restCall(Method.GET, "/fleet/vehicles/:vehicle_id/dispatch/routes?accessToken&endTime&duration", getDispatchRoutesByVehicleId _), 
      restCall(Method.GET, "/fleet/drivers/:driver_id_or_external_id?accessToken", getDriverById _), 
      restCall(Method.GET, "/fleet/drivers/document_types", getDriverDocumentTypesByOrgId _), 
      restCall(Method.GET, "/fleet/drivers/documents?accessToken&endMs&durationMs", getDriverDocumentsByOrgId _), 
      restCall(Method.GET, "/fleet/drivers/:driverId/safety/score?accessToken&startMs&endMs", getDriverSafetyScore _), 
      restCall(Method.GET, "/fleet/maintenance/dvirs?accessToken&endMs&durationMs&groupId", getDvirs _), 
      restCall(Method.POST, "/fleet/drivers?accessToken", getFleetDrivers _), 
      restCall(Method.POST, "/fleet/drivers/:driver_id/hos_daily_logs?accessToken", getFleetDriversHosDailyLogs _), 
      restCall(Method.POST, "/fleet/drivers/summary?accessToken&snapToDayBounds", getFleetDriversSummary _), 
      restCall(Method.POST, "/fleet/hos_authentication_logs?accessToken", getFleetHosAuthenticationLogs _), 
      restCall(Method.POST, "/fleet/hos_logs?accessToken", getFleetHosLogs _), 
      restCall(Method.POST, "/fleet/hos_logs_summary?accessToken", getFleetHosLogsSummary _), 
      restCall(Method.POST, "/fleet/locations?accessToken", getFleetLocations _), 
      restCall(Method.POST, "/fleet/maintenance/list?accessToken", getFleetMaintenanceList _), 
      restCall(Method.POST, "/fleet/trips?accessToken", getFleetTrips _), 
      restCall(Method.GET, "/fleet/vehicles/:vehicle_id_or_external_id?accessToken", getFleetVehicle _), 
      restCall(Method.GET, "/addresses/:addressId?accessToken", getOrganizationAddress _), 
      restCall(Method.GET, "/addresses?accessToken", getOrganizationAddresses _), 
      restCall(Method.GET, "/contacts/:contact_id?accessToken", getOrganizationContact _), 
      restCall(Method.GET, "/fleet/vehicles/:vehicleId/safety/harsh_event?accessToken&timestamp", getVehicleHarshEvent _), 
      restCall(Method.GET, "/fleet/vehicles/:vehicle_id/locations?accessToken&startMs&endMs", getVehicleLocations _), 
      restCall(Method.GET, "/fleet/vehicles/:vehicleId/safety/score?accessToken&startMs&endMs", getVehicleSafetyScore _), 
      restCall(Method.GET, "/fleet/vehicles/stats?accessToken&startMs&endMs&series&tagIds&startingAfter&endingBefore&limit", getVehicleStats _), 
      restCall(Method.GET, "/fleet/vehicles/locations?accessToken&startMs&endMs", getVehiclesLocations _), 
      restCall(Method.GET, "/contacts?accessToken", listContacts _), 
      restCall(Method.POST, "/fleet/list?accessToken&startingAfter&endingBefore&limit", listFleet _), 
      restCall(Method.PATCH, "/fleet/vehicles/:vehicle_id_or_external_id?accessToken", patchFleetVehicle _), 
      restCall(Method.PUT, "/fleet/drivers/inactive/:driver_id_or_external_id?accessToken", reactivateDriverById _), 
      restCall(Method.PUT, "/fleet/dispatch/routes/:route_id?accessToken", updateDispatchRouteById _), 
      restCall(Method.PATCH, "/addresses/:addressId?accessToken", updateOrganizationAddress _), 
      restCall(Method.POST, "/fleet/set_data?accessToken", updateVehicles _)
    ).withAutoAcl(true)
  }

      
  /**
    * /fleet/add_address
    * This method adds an address book entry to the specified group.
    *  
    * @param accessToken Samsara API access token.  
    * @return void Body Parameter   
    */
  def addFleetAddress(accessToken:String          ): ServiceCall[InlineObject2 ,Done]
        
  /**
    * /addresses
    * Add one or more addresses to the organization
    *  
    * @param accessToken Samsara API access token.  
    * @return Seq[Address] Body Parameter   
    */
  def addOrganizationAddresses(accessToken:String          ): ServiceCall[InlineObject ,Seq[Address]]
        
  /**
    * /fleet/dispatch/routes
    * Create a new dispatch route.
    *  
    * @param accessToken Samsara API access token.  
    * @return DispatchRoute Body Parameter   
    */
  def createDispatchRoute(accessToken:String          ): ServiceCall[DispatchRouteCreate ,DispatchRoute]
        
  /**
    * /fleet/drivers/create
    * Create a new driver.
    *  
    * @param accessToken Samsara API access token.  
    * @return Driver Body Parameter  Driver creation body 
    */
  def createDriver(accessToken:String          ): ServiceCall[DriverForCreate ,Driver]
        
  /**
    * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    * Create a new dispatch route for the driver with driver_id.
    *  
    * @param accessToken Samsara API access token.  
    * @param driverId ID of the driver with the associated routes.  
    * @return DispatchRoute Body Parameter   
    */
  def createDriverDispatchRoute(accessToken:String          driverId: Long): ServiceCall[DispatchRouteCreate ,DispatchRoute]
        
  /**
    * /fleet/drivers/{driver_id:[0-9]+}/documents
    * Create a driver document for the given driver.
    *  
    * @param accessToken Samsara API access token.  
    * @param driverId ID of the driver for whom the document is created.  
    * @return Document Body Parameter  To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. 
    */
  def createDriverDocument(accessToken:String          driverId: Long): ServiceCall[DocumentCreate ,Document]
        
  /**
    * /fleet/maintenance/dvirs
    * Create a new dvir, marking a vehicle or trailer safe or unsafe.
    *  
    * @param accessToken Samsara API access token.  
    * @return DvirBase Body Parameter   
    */
  def createDvir(accessToken:String          ): ServiceCall[InlineObject12 ,DvirBase]
        
  /**
    * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    * Create a new dispatch route for the vehicle with vehicle_id.
    *  
    * @param accessToken Samsara API access token.  
    * @param vehicleId ID of the vehicle with the associated routes.  
    * @return DispatchRoute Body Parameter   
    */
  def createVehicleDispatchRoute(accessToken:String          vehicleId: Long): ServiceCall[DispatchRouteCreate ,DispatchRoute]
        
  /**
    * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    * Deactivate a driver with the given id.
    *  
    * @param accessToken Samsara API access token.  
    * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
    * @return void
    */
  def deactivateDriver(accessToken:String          driverIdOrExternalId: String): ServiceCall[NotUsed ,Done]
        
  /**
    * /fleet/dispatch/routes/{route_id:[0-9]+}/
    * Delete a dispatch route and its associated jobs.
    *  
    * @param accessToken Samsara API access token.  
    * @param routeId ID of the dispatch route. 
    * @return void
    */
  def deleteDispatchRouteById(accessToken:String          routeId: Long): ServiceCall[NotUsed ,Done]
        
  /**
    * /addresses/{addressId}
    * Delete an address.
    *  
    * @param accessToken Samsara API access token.  
    * @param addressId ID of the address/geofence 
    * @return void
    */
  def deleteOrganizationAddress(accessToken:String          addressId: Long): ServiceCall[NotUsed ,Done]
        
  /**
    * /fleet/dispatch/routes
    * Fetch all of the dispatch routes for the group.
    *  
    * @param accessToken Samsara API access token.  
    * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional) 
    * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional) 
    * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
    * @return Seq[DispatchRoute]
    */
  def fetchAllDispatchRoutes(accessToken:String          ,groupId:           Option[Long] = None,endTime:           Option[Long] = None,duration:           Option[Long] = None): ServiceCall[NotUsed ,Seq[DispatchRoute]]
        
  /**
    * /fleet/dispatch/routes/job_updates
    * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
    *  
    * @param accessToken Samsara API access token.  
    * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional) 
    * @param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional) 
    * @param include Optionally set include&#x3D;route to include route object in response payload. (optional)
    * @return AllRouteJobUpdates
    */
  def fetchAllRouteJobUpdates(accessToken:String          ,groupId:           Option[Long] = None,sequenceId:           Option[String] = None,include:           Option[String] = None): ServiceCall[NotUsed ,AllRouteJobUpdates]
        
  /**
    * /fleet/assets/locations
    * Fetch current locations of all assets for the group.
    *  
    * @param accessToken Samsara API access token.  
    * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
    * @return InlineResponse2001
    */
  def getAllAssetCurrentLocations(accessToken:String          ,groupId:           Option[Long] = None): ServiceCall[NotUsed ,InlineResponse2001]
        
  /**
    * /fleet/assets
    * Fetch all of the assets for the group.
    *  
    * @param accessToken Samsara API access token.  
    * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
    * @return InlineResponse200
    */
  def getAllAssets(accessToken:String          ,groupId:           Option[Long] = None): ServiceCall[NotUsed ,InlineResponse200]
        
  /**
    * /fleet/drivers/inactive
    * Fetch all deactivated drivers for the group.
    *  
    * @param accessToken Samsara API access token.  
    * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
    * @return Seq[Driver]
    */
  def getAllDeactivatedDrivers(accessToken:String          ,groupId:           Option[Long] = None): ServiceCall[NotUsed ,Seq[Driver]]
        
  /**
    * /fleet/assets/{assetId:[0-9]+}/locations
    * Fetch the historical locations for the asset.
    *  
    * @param accessToken Samsara API access token.  
    * @param assetId ID of the asset  
    * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.  
    * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
    * @return Seq[Any]
    */
  def getAssetLocation(accessToken:String          ,startMs:Long          ,endMs:Long          assetId: Long): ServiceCall[NotUsed ,Seq[Any]]
        
  /**
    * /fleet/assets/{assetId:[0-9]+}/reefer
    * Fetch the reefer-specific stats of an asset.
    *  
    * @param accessToken Samsara API access token.  
    * @param assetId ID of the asset  
    * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.  
    * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
    * @return AssetReeferResponse
    */
  def getAssetReefer(accessToken:String          ,startMs:Long          ,endMs:Long          assetId: Long): ServiceCall[NotUsed ,AssetReeferResponse]
        
  /**
    * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    * Fetch deactivated driver by id.
    *  
    * @param accessToken Samsara API access token.  
    * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
    * @return Driver
    */
  def getDeactivatedDriverById(accessToken:String          driverIdOrExternalId: String): ServiceCall[NotUsed ,Driver]
        
  /**
    * /fleet/dispatch/routes/{route_id:[0-9]+}
    * Fetch a dispatch route by id.
    *  
    * @param accessToken Samsara API access token.  
    * @param routeId ID of the dispatch route. 
    * @return DispatchRoute
    */
  def getDispatchRouteById(accessToken:String          routeId: Long): ServiceCall[NotUsed ,DispatchRoute]
        
  /**
    * /fleet/dispatch/routes/{route_id:[0-9]+}/history
    * Fetch the history of a dispatch route.
    *  
    * @param accessToken Samsara API access token.  
    * @param routeId ID of the route with history.  
    * @param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional) 
    * @param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)
    * @return DispatchRouteHistory
    */
  def getDispatchRouteHistory(accessToken:String          ,startTime:           Option[Long] = None,endTime:           Option[Long] = NonerouteId: Long): ServiceCall[NotUsed ,DispatchRouteHistory]
        
  /**
    * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    * Fetch all of the dispatch routes for a given driver.
    *  
    * @param accessToken Samsara API access token.  
    * @param driverId ID of the driver with the associated routes.  
    * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional) 
    * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
    * @return Seq[DispatchRoute]
    */
  def getDispatchRoutesByDriverId(accessToken:String          ,endTime:           Option[Long] = None,duration:           Option[Long] = NonedriverId: Long): ServiceCall[NotUsed ,Seq[DispatchRoute]]
        
  /**
    * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    * Fetch all of the dispatch routes for a given vehicle.
    *  
    * @param accessToken Samsara API access token.  
    * @param vehicleId ID of the vehicle with the associated routes.  
    * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional) 
    * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
    * @return Seq[DispatchRoute]
    */
  def getDispatchRoutesByVehicleId(accessToken:String          ,endTime:           Option[Long] = None,duration:           Option[Long] = NonevehicleId: Long): ServiceCall[NotUsed ,Seq[DispatchRoute]]
        
  /**
    * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    * Fetch driver by id.
    *  
    * @param accessToken Samsara API access token.  
    * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
    * @return Driver
    */
  def getDriverById(accessToken:String          driverIdOrExternalId: String): ServiceCall[NotUsed ,Driver]
  
  /**
    * /fleet/drivers/document_types
    * Fetch all of the document types.
    * 
    * @return Seq[DocumentType]
    */
  def getDriverDocumentTypesByOrgId(): ServiceCall[NotUsed ,Seq[DocumentType]]
        
  /**
    * /fleet/drivers/documents
    * Fetch all of the documents.
    *  
    * @param accessToken Samsara API access token.  
    * @param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional) 
    * @param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)
    * @return Seq[Document]
    */
  def getDriverDocumentsByOrgId(accessToken:String          ,endMs:           Option[Long] = None,durationMs:           Option[Long] = None): ServiceCall[NotUsed ,Seq[Document]]
        
  /**
    * /fleet/drivers/{driverId:[0-9]+}/safety/score
    * Fetch the safety score for the driver.
    *  
    * @param driverId ID of the driver  
    * @param accessToken Samsara API access token.  
    * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.  
    * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
    * @return DriverSafetyScoreResponse
    */
  def getDriverSafetyScore(accessToken:String          ,startMs:Long          ,endMs:Long          driverId: Long): ServiceCall[NotUsed ,DriverSafetyScoreResponse]
        
  /**
    * /fleet/maintenance/dvirs
    * Get DVIRs for the org within provided time constraints
    *  
    * @param accessToken Samsara API access token.  
    * @param endMs time in millis until the last dvir log.  
    * @param durationMs time in millis which corresponds to the duration before the end_ms.  
    * @param groupId Group ID to query. (optional)
    * @return DvirListResponse
    */
  def getDvirs(accessToken:String          ,endMs:Int          ,durationMs:Int          ,groupId:           Option[Int] = None): ServiceCall[NotUsed ,DvirListResponse]
        
  /**
    * /fleet/drivers
    * Get all the drivers for the specified group.
    *  
    * @param accessToken Samsara API access token.  
    * @return DriversResponse Body Parameter   
    */
  def getFleetDrivers(accessToken:String          ): ServiceCall[InlineObject3 ,DriversResponse]
        
  /**
    * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
    * Get summarized daily HOS charts for a specified driver.
    *  
    * @param accessToken Samsara API access token.  
    * @param driverId ID of the driver with HOS logs.  
    * @return DriverDailyLogResponse Body Parameter   
    */
  def getFleetDriversHosDailyLogs(accessToken:String          driverId: Long): ServiceCall[InlineObject6 ,DriverDailyLogResponse]
        
  /**
    * /fleet/drivers/summary
    * Get the distance and time each driver in an organization has driven in a given time period.
    *  
    * @param accessToken Samsara API access token.   
    * @param snapToDayBounds Snap query result to HOS day boundaries. (optional)
    * @return DriversSummaryResponse Body Parameter   
    */
  def getFleetDriversSummary(accessToken:String          ,snapToDayBounds:           Option[Boolean] = None): ServiceCall[InlineObject5 ,DriversSummaryResponse]
        
  /**
    * /fleet/hos_authentication_logs
    * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
    *  
    * @param accessToken Samsara API access token.  
    * @return HosAuthenticationLogsResponse Body Parameter   
    */
  def getFleetHosAuthenticationLogs(accessToken:String          ): ServiceCall[InlineObject7 ,HosAuthenticationLogsResponse]
        
  /**
    * /fleet/hos_logs
    * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
    *  
    * @param accessToken Samsara API access token.  
    * @return HosLogsResponse Body Parameter   
    */
  def getFleetHosLogs(accessToken:String          ): ServiceCall[InlineObject8 ,HosLogsResponse]
        
  /**
    * /fleet/hos_logs_summary
    * Get the current HOS status for all drivers in the group.
    *  
    * @param accessToken Samsara API access token.  
    * @return HosLogsSummaryResponse Body Parameter   
    */
  def getFleetHosLogsSummary(accessToken:String          ): ServiceCall[InlineObject9 ,HosLogsSummaryResponse]
        
  /**
    * /fleet/locations
    * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
    *  
    * @param accessToken Samsara API access token.  
    * @return InlineResponse2003 Body Parameter   
    */
  def getFleetLocations(accessToken:String          ): ServiceCall[InlineObject11 ,InlineResponse2003]
        
  /**
    * /fleet/maintenance/list
    * Get list of the vehicles with any engine faults or check light data.
    *  
    * @param accessToken Samsara API access token.  
    * @return InlineResponse2004 Body Parameter   
    */
  def getFleetMaintenanceList(accessToken:String          ): ServiceCall[InlineObject13 ,InlineResponse2004]
        
  /**
    * /fleet/trips
    * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
    *  
    * @param accessToken Samsara API access token.  
    * @return TripResponse Body Parameter   
    */
  def getFleetTrips(accessToken:String          ): ServiceCall[InlineObject15 ,TripResponse]
        
  /**
    * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    * Gets a specific vehicle.
    *  
    * @param accessToken Samsara API access token.  
    * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. 
    * @return FleetVehicleResponse
    */
  def getFleetVehicle(accessToken:String          vehicleIdOrExternalId: String): ServiceCall[NotUsed ,FleetVehicleResponse]
        
  /**
    * /addresses/{addressId}
    * Fetch an address by its id.
    *  
    * @param accessToken Samsara API access token.  
    * @param addressId ID of the address/geofence 
    * @return Address
    */
  def getOrganizationAddress(accessToken:String          addressId: Long): ServiceCall[NotUsed ,Address]
        
  /**
    * /addresses
    * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
    *  
    * @param accessToken Samsara API access token. 
    * @return Seq[Address]
    */
  def getOrganizationAddresses(accessToken:String          ): ServiceCall[NotUsed ,Seq[Address]]
        
  /**
    * /contacts/{contact_id}
    * Fetch a contact by its id.
    *  
    * @param accessToken Samsara API access token.  
    * @param contactId ID of the contact 
    * @return Contact
    */
  def getOrganizationContact(accessToken:String          contactId: Long): ServiceCall[NotUsed ,Contact]
        
  /**
    * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
    * Fetch harsh event details for a vehicle.
    *  
    * @param vehicleId ID of the vehicle  
    * @param accessToken Samsara API access token.  
    * @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event. 
    * @return VehicleHarshEventResponse
    */
  def getVehicleHarshEvent(accessToken:String          ,timestamp:Long          vehicleId: Long): ServiceCall[NotUsed ,VehicleHarshEventResponse]
        
  /**
    * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
    * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
    *  
    * @param accessToken Samsara API access token.  
    * @param vehicleId ID of the vehicle with the associated routes.  
    * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)  
    * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) 
    * @return Seq[FleetVehicleLocation]
    */
  def getVehicleLocations(accessToken:String          ,startMs:Long          ,endMs:Long          vehicleId: Long): ServiceCall[NotUsed ,Seq[FleetVehicleLocation]]
        
  /**
    * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
    * Fetch the safety score for the vehicle.
    *  
    * @param vehicleId ID of the vehicle  
    * @param accessToken Samsara API access token.  
    * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.  
    * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
    * @return VehicleSafetyScoreResponse
    */
  def getVehicleSafetyScore(accessToken:String          ,startMs:Long          ,endMs:Long          vehicleId: Long): ServiceCall[NotUsed ,VehicleSafetyScoreResponse]
        
  /**
    * /fleet/vehicles/stats
    * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
    *  
    * @param accessToken Samsara API access token.  
    * @param startMs Time in Unix epoch milliseconds for the start of the query.  
    * @param endMs Time in Unix epoch milliseconds for the end of the query.  
    * @param series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional) 
    * @param tagIds Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional) 
    * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional) 
    * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional) 
    * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
    * @return InlineResponse2005
    */
  def getVehicleStats(accessToken:String          ,startMs:Int          ,endMs:Int          ,series: Option[FleetApiSeriesEnum.FleetApiSeriesEnum]tagIds:           Option[String] = None,startingAfter:           Option[String] = None,endingBefore:           Option[String] = None,limit:           Option[Long] = None): ServiceCall[NotUsed ,InlineResponse2005]
        
  /**
    * /fleet/vehicles/locations
    * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
    *  
    * @param accessToken Samsara API access token.  
    * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)  
    * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) 
    * @return Seq[Any]
    */
  def getVehiclesLocations(accessToken:String          ,startMs:Int          ,endMs:Int          ): ServiceCall[NotUsed ,Seq[Any]]
        
  /**
    * /contacts
    * Fetch all contacts for the organization.
    *  
    * @param accessToken Samsara API access token. 
    * @return Seq[Contact]
    */
  def listContacts(accessToken:String          ): ServiceCall[NotUsed ,Seq[Contact]]
        
  /**
    * /fleet/list
    * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
    *  
    * @param accessToken Samsara API access token.   
    * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional) 
    * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional) 
    * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
    * @return InlineResponse2002 Body Parameter   
    */
  def listFleet(accessToken:String          ,startingAfter:           Option[String] = None,endingBefore:           Option[String] = None,limit:           Option[Long] = None): ServiceCall[InlineObject10 ,InlineResponse2002]
        
  /**
    * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
    *  
    * @param accessToken Samsara API access token.  
    * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.  
    * @return FleetVehicleResponse Body Parameter   
    */
  def patchFleetVehicle(accessToken:String          vehicleIdOrExternalId: String): ServiceCall[InlineObject16 ,FleetVehicleResponse]
        
  /**
    * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    * Reactivate the inactive driver having id.
    *  
    * @param accessToken Samsara API access token.  
    * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.  
    * @return Driver Body Parameter   
    */
  def reactivateDriverById(accessToken:String          driverIdOrExternalId: String): ServiceCall[InlineObject4 ,Driver]
        
  /**
    * /fleet/dispatch/routes/{route_id:[0-9]+}/
    * Update a dispatch route and its associated jobs.
    *  
    * @param accessToken Samsara API access token.  
    * @param routeId ID of the dispatch route.  
    * @return DispatchRoute Body Parameter   
    */
  def updateDispatchRouteById(accessToken:String          routeId: Long): ServiceCall[DispatchRoute ,DispatchRoute]
        
  /**
    * /addresses/{addressId}
    * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
    *  
    * @param accessToken Samsara API access token.  
    * @param addressId ID of the address/geofence  
    * @return void Body Parameter   
    */
  def updateOrganizationAddress(accessToken:String          addressId: Long): ServiceCall[InlineObject1 ,Done]
        
  /**
    * /fleet/set_data
    * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
    *  
    * @param accessToken Samsara API access token.  
    * @return void Body Parameter   
    */
  def updateVehicles(accessToken:String          ): ServiceCall[InlineObject14 ,Done]
  

        object FleetApiSeriesEnum extends Enumeration {
        val   engineState, auxInput1, auxInput2 = Value     
        type FleetApiSeriesEnum = Value
        implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[FleetApiSeriesEnum.type])
        implicit val pathParamSerializer: PathParamSerializer[FleetApiSeriesEnum] = PathParamSerializer.required("FleetApiSeriesEnum")(withName)(_.toString)
        }
  }

