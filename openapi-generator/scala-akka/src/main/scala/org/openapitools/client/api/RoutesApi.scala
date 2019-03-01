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

import org.openapitools.client.model.AllRouteJobUpdates
import org.openapitools.client.model.DispatchRoute
import org.openapitools.client.model.DispatchRouteCreate
import org.openapitools.client.model.DispatchRouteHistory
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object RoutesApi {

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
      

}

