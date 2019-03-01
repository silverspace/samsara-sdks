/**
 * Samsara API
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api

import java.text.SimpleDateFormat

import io.swagger.client.model.Address
import io.swagger.client.model.AddressParam
import io.swagger.client.model.Addresses
import io.swagger.client.model.AllRouteJobUpdates
import io.swagger.client.model.AssetLocationResponse
import io.swagger.client.model.AssetReeferResponse
import io.swagger.client.model.Contact
import io.swagger.client.model.CreateDvirParam
import io.swagger.client.model.CurrentDriver
import io.swagger.client.model.Data
import io.swagger.client.model.DispatchRoute
import io.swagger.client.model.DispatchRouteCreate
import io.swagger.client.model.DispatchRouteHistory
import io.swagger.client.model.DispatchRoutes
import io.swagger.client.model.Document
import io.swagger.client.model.DocumentCreate
import io.swagger.client.model.DocumentTypes
import io.swagger.client.model.Documents
import io.swagger.client.model.Driver
import io.swagger.client.model.DriverDailyLogResponse
import io.swagger.client.model.DriverForCreate
import io.swagger.client.model.DriverSafetyScoreResponse
import io.swagger.client.model.DriversResponse
import io.swagger.client.model.DriversSummaryParam
import io.swagger.client.model.DriversSummaryResponse
import io.swagger.client.model.DvirBase
import io.swagger.client.model.DvirListResponse
import io.swagger.client.model.ErrorResponse
import io.swagger.client.model.FleetVehicleLocations
import io.swagger.client.model.FleetVehicleResponse
import io.swagger.client.model.FleetVehiclesLocations
import io.swagger.client.model.GroupDriversParam
import io.swagger.client.model.GroupParam
import io.swagger.client.model.HosAuthenticationLogsParam
import io.swagger.client.model.HosAuthenticationLogsResponse
import io.swagger.client.model.HosLogsParam
import io.swagger.client.model.HosLogsParam1
import io.swagger.client.model.HosLogsParam2
import io.swagger.client.model.HosLogsResponse
import io.swagger.client.model.HosLogsSummaryResponse
import io.swagger.client.model.InlineResponse200
import io.swagger.client.model.InlineResponse2001
import io.swagger.client.model.InlineResponse2002
import io.swagger.client.model.InlineResponse2003
import io.swagger.client.model.InlineResponse2004
import io.swagger.client.model.InlineResponse2005
import io.swagger.client.model.ReactivateDriverParam
import io.swagger.client.model.TripResponse
import io.swagger.client.model.TripsParam
import io.swagger.client.model.VehicleHarshEventResponse
import io.swagger.client.model.VehicleSafetyScoreResponse
import io.swagger.client.model.VehicleUpdateParam
import io.swagger.client.{ApiInvoker, ApiException}

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date
import java.util.TimeZone

import scala.collection.mutable.HashMap

import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

import java.net.URI

import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

import org.json4s._

class FleetApi(
  val defBasePath: String = "https://api.samsara.com/v1",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new FleetApiAsyncHelper(client, config)

  /**
   * /fleet/add_address
   * This method adds an address book entry to the specified group.
   *
   * @param accessToken Samsara API access token. 
   * @param addressParam  
   * @return void
   */
  def addFleetAddress(accessToken: String, addressParam: AddressParam) = {
    val await = Try(Await.result(addFleetAddressAsync(accessToken, addressParam), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/add_address asynchronously
   * This method adds an address book entry to the specified group.
   *
   * @param accessToken Samsara API access token. 
   * @param addressParam  
   * @return Future(void)
   */
  def addFleetAddressAsync(accessToken: String, addressParam: AddressParam) = {
      helper.addFleetAddress(accessToken, addressParam)
  }

  /**
   * /addresses
   * Add one or more addresses to the organization
   *
   * @param accessToken Samsara API access token. 
   * @param addresses List of addresses/geofences to add. Geofences can be circular or a polygon.  For each address, only one of &#39;circle&#39; or &#39;polygon&#39; should be provided. If both are provided, the geofence will be saved as a polygon. 
   * @return List[Address]
   */
  def addOrganizationAddresses(accessToken: String, addresses: Addresses): Option[List[Address]] = {
    val await = Try(Await.result(addOrganizationAddressesAsync(accessToken, addresses), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /addresses asynchronously
   * Add one or more addresses to the organization
   *
   * @param accessToken Samsara API access token. 
   * @param addresses List of addresses/geofences to add. Geofences can be circular or a polygon.  For each address, only one of &#39;circle&#39; or &#39;polygon&#39; should be provided. If both are provided, the geofence will be saved as a polygon. 
   * @return Future(List[Address])
   */
  def addOrganizationAddressesAsync(accessToken: String, addresses: Addresses): Future[List[Address]] = {
      helper.addOrganizationAddresses(accessToken, addresses)
  }

  /**
   * /fleet/dispatch/routes
   * Create a new dispatch route.
   *
   * @param accessToken Samsara API access token. 
   * @param createDispatchRouteParams  
   * @return DispatchRoute
   */
  def createDispatchRoute(accessToken: String, createDispatchRouteParams: DispatchRouteCreate): Option[DispatchRoute] = {
    val await = Try(Await.result(createDispatchRouteAsync(accessToken, createDispatchRouteParams), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/dispatch/routes asynchronously
   * Create a new dispatch route.
   *
   * @param accessToken Samsara API access token. 
   * @param createDispatchRouteParams  
   * @return Future(DispatchRoute)
   */
  def createDispatchRouteAsync(accessToken: String, createDispatchRouteParams: DispatchRouteCreate): Future[DispatchRoute] = {
      helper.createDispatchRoute(accessToken, createDispatchRouteParams)
  }

  /**
   * /fleet/drivers/create
   * Create a new driver.
   *
   * @param accessToken Samsara API access token. 
   * @param createDriverParam Driver creation body 
   * @return Driver
   */
  def createDriver(accessToken: String, createDriverParam: DriverForCreate): Option[Driver] = {
    val await = Try(Await.result(createDriverAsync(accessToken, createDriverParam), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/drivers/create asynchronously
   * Create a new driver.
   *
   * @param accessToken Samsara API access token. 
   * @param createDriverParam Driver creation body 
   * @return Future(Driver)
   */
  def createDriverAsync(accessToken: String, createDriverParam: DriverForCreate): Future[Driver] = {
      helper.createDriver(accessToken, createDriverParam)
  }

  /**
   * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
   * Create a new dispatch route for the driver with driver_id.
   *
   * @param accessToken Samsara API access token. 
   * @param driverId ID of the driver with the associated routes. 
   * @param createDispatchRouteParams  
   * @return DispatchRoute
   */
  def createDriverDispatchRoute(accessToken: String, driverId: Long, createDispatchRouteParams: DispatchRouteCreate): Option[DispatchRoute] = {
    val await = Try(Await.result(createDriverDispatchRouteAsync(accessToken, driverId, createDispatchRouteParams), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes asynchronously
   * Create a new dispatch route for the driver with driver_id.
   *
   * @param accessToken Samsara API access token. 
   * @param driverId ID of the driver with the associated routes. 
   * @param createDispatchRouteParams  
   * @return Future(DispatchRoute)
   */
  def createDriverDispatchRouteAsync(accessToken: String, driverId: Long, createDispatchRouteParams: DispatchRouteCreate): Future[DispatchRoute] = {
      helper.createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams)
  }

  /**
   * /fleet/drivers/{driver_id:[0-9]+}/documents
   * Create a driver document for the given driver.
   *
   * @param accessToken Samsara API access token. 
   * @param driverId ID of the driver for whom the document is created. 
   * @param createDocumentParams To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. 
   * @return Document
   */
  def createDriverDocument(accessToken: String, driverId: Long, createDocumentParams: DocumentCreate): Option[Document] = {
    val await = Try(Await.result(createDriverDocumentAsync(accessToken, driverId, createDocumentParams), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/drivers/{driver_id:[0-9]+}/documents asynchronously
   * Create a driver document for the given driver.
   *
   * @param accessToken Samsara API access token. 
   * @param driverId ID of the driver for whom the document is created. 
   * @param createDocumentParams To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. 
   * @return Future(Document)
   */
  def createDriverDocumentAsync(accessToken: String, driverId: Long, createDocumentParams: DocumentCreate): Future[Document] = {
      helper.createDriverDocument(accessToken, driverId, createDocumentParams)
  }

  /**
   * /fleet/maintenance/dvirs
   * Create a new dvir, marking a vehicle or trailer safe or unsafe.
   *
   * @param accessToken Samsara API access token. 
   * @param createDvirParam DVIR creation body 
   * @return DvirBase
   */
  def createDvir(accessToken: String, createDvirParam: CreateDvirParam): Option[DvirBase] = {
    val await = Try(Await.result(createDvirAsync(accessToken, createDvirParam), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/maintenance/dvirs asynchronously
   * Create a new dvir, marking a vehicle or trailer safe or unsafe.
   *
   * @param accessToken Samsara API access token. 
   * @param createDvirParam DVIR creation body 
   * @return Future(DvirBase)
   */
  def createDvirAsync(accessToken: String, createDvirParam: CreateDvirParam): Future[DvirBase] = {
      helper.createDvir(accessToken, createDvirParam)
  }

  /**
   * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
   * Create a new dispatch route for the vehicle with vehicle_id.
   *
   * @param accessToken Samsara API access token. 
   * @param vehicleId ID of the vehicle with the associated routes. 
   * @param createDispatchRouteParams  
   * @return DispatchRoute
   */
  def createVehicleDispatchRoute(accessToken: String, vehicleId: Long, createDispatchRouteParams: DispatchRouteCreate): Option[DispatchRoute] = {
    val await = Try(Await.result(createVehicleDispatchRouteAsync(accessToken, vehicleId, createDispatchRouteParams), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes asynchronously
   * Create a new dispatch route for the vehicle with vehicle_id.
   *
   * @param accessToken Samsara API access token. 
   * @param vehicleId ID of the vehicle with the associated routes. 
   * @param createDispatchRouteParams  
   * @return Future(DispatchRoute)
   */
  def createVehicleDispatchRouteAsync(accessToken: String, vehicleId: Long, createDispatchRouteParams: DispatchRouteCreate): Future[DispatchRoute] = {
      helper.createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams)
  }

  /**
   * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
   * Deactivate a driver with the given id.
   *
   * @param accessToken Samsara API access token. 
   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
   * @return void
   */
  def deactivateDriver(accessToken: String, driverIdOrExternalId: String) = {
    val await = Try(Await.result(deactivateDriverAsync(accessToken, driverIdOrExternalId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} asynchronously
   * Deactivate a driver with the given id.
   *
   * @param accessToken Samsara API access token. 
   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
   * @return Future(void)
   */
  def deactivateDriverAsync(accessToken: String, driverIdOrExternalId: String) = {
      helper.deactivateDriver(accessToken, driverIdOrExternalId)
  }

  /**
   * /fleet/dispatch/routes/{route_id:[0-9]+}/
   * Delete a dispatch route and its associated jobs.
   *
   * @param accessToken Samsara API access token. 
   * @param routeId ID of the dispatch route. 
   * @return void
   */
  def deleteDispatchRouteById(accessToken: String, routeId: Long) = {
    val await = Try(Await.result(deleteDispatchRouteByIdAsync(accessToken, routeId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/dispatch/routes/{route_id:[0-9]+}/ asynchronously
   * Delete a dispatch route and its associated jobs.
   *
   * @param accessToken Samsara API access token. 
   * @param routeId ID of the dispatch route. 
   * @return Future(void)
   */
  def deleteDispatchRouteByIdAsync(accessToken: String, routeId: Long) = {
      helper.deleteDispatchRouteById(accessToken, routeId)
  }

  /**
   * /addresses/{addressId}
   * Delete an address.
   *
   * @param accessToken Samsara API access token. 
   * @param addressId ID of the address/geofence 
   * @return void
   */
  def deleteOrganizationAddress(accessToken: String, addressId: Long) = {
    val await = Try(Await.result(deleteOrganizationAddressAsync(accessToken, addressId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /addresses/{addressId} asynchronously
   * Delete an address.
   *
   * @param accessToken Samsara API access token. 
   * @param addressId ID of the address/geofence 
   * @return Future(void)
   */
  def deleteOrganizationAddressAsync(accessToken: String, addressId: Long) = {
      helper.deleteOrganizationAddress(accessToken, addressId)
  }

  /**
   * /fleet/dispatch/routes
   * Fetch all of the dispatch routes for the group.
   *
   * @param accessToken Samsara API access token. 
   * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
   * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
   * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
   * @return DispatchRoutes
   */
  def fetchAllDispatchRoutes(accessToken: String, groupId: Option[Long] = None, endTime: Option[Long] = None, duration: Option[Long] = None): Option[DispatchRoutes] = {
    val await = Try(Await.result(fetchAllDispatchRoutesAsync(accessToken, groupId, endTime, duration), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/dispatch/routes asynchronously
   * Fetch all of the dispatch routes for the group.
   *
   * @param accessToken Samsara API access token. 
   * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
   * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
   * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
   * @return Future(DispatchRoutes)
   */
  def fetchAllDispatchRoutesAsync(accessToken: String, groupId: Option[Long] = None, endTime: Option[Long] = None, duration: Option[Long] = None): Future[DispatchRoutes] = {
      helper.fetchAllDispatchRoutes(accessToken, groupId, endTime, duration)
  }

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
  def fetchAllRouteJobUpdates(accessToken: String, groupId: Option[Long] = None, sequenceId: Option[String] = None, include: Option[String] = None): Option[AllRouteJobUpdates] = {
    val await = Try(Await.result(fetchAllRouteJobUpdatesAsync(accessToken, groupId, sequenceId, include), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/dispatch/routes/job_updates asynchronously
   * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
   *
   * @param accessToken Samsara API access token. 
   * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
   * @param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)
   * @param include Optionally set include&#x3D;route to include route object in response payload. (optional)
   * @return Future(AllRouteJobUpdates)
   */
  def fetchAllRouteJobUpdatesAsync(accessToken: String, groupId: Option[Long] = None, sequenceId: Option[String] = None, include: Option[String] = None): Future[AllRouteJobUpdates] = {
      helper.fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include)
  }

  /**
   * /fleet/assets/locations
   * Fetch current locations of all assets for the group.
   *
   * @param accessToken Samsara API access token. 
   * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
   * @return InlineResponse2001
   */
  def getAllAssetCurrentLocations(accessToken: String, groupId: Option[Long] = None): Option[InlineResponse2001] = {
    val await = Try(Await.result(getAllAssetCurrentLocationsAsync(accessToken, groupId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/assets/locations asynchronously
   * Fetch current locations of all assets for the group.
   *
   * @param accessToken Samsara API access token. 
   * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
   * @return Future(InlineResponse2001)
   */
  def getAllAssetCurrentLocationsAsync(accessToken: String, groupId: Option[Long] = None): Future[InlineResponse2001] = {
      helper.getAllAssetCurrentLocations(accessToken, groupId)
  }

  /**
   * /fleet/assets
   * Fetch all of the assets for the group.
   *
   * @param accessToken Samsara API access token. 
   * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
   * @return InlineResponse200
   */
  def getAllAssets(accessToken: String, groupId: Option[Long] = None): Option[InlineResponse200] = {
    val await = Try(Await.result(getAllAssetsAsync(accessToken, groupId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/assets asynchronously
   * Fetch all of the assets for the group.
   *
   * @param accessToken Samsara API access token. 
   * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
   * @return Future(InlineResponse200)
   */
  def getAllAssetsAsync(accessToken: String, groupId: Option[Long] = None): Future[InlineResponse200] = {
      helper.getAllAssets(accessToken, groupId)
  }

  /**
   * /fleet/drivers/inactive
   * Fetch all deactivated drivers for the group.
   *
   * @param accessToken Samsara API access token. 
   * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
   * @return List[Driver]
   */
  def getAllDeactivatedDrivers(accessToken: String, groupId: Option[Long] = None): Option[List[Driver]] = {
    val await = Try(Await.result(getAllDeactivatedDriversAsync(accessToken, groupId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/drivers/inactive asynchronously
   * Fetch all deactivated drivers for the group.
   *
   * @param accessToken Samsara API access token. 
   * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
   * @return Future(List[Driver])
   */
  def getAllDeactivatedDriversAsync(accessToken: String, groupId: Option[Long] = None): Future[List[Driver]] = {
      helper.getAllDeactivatedDrivers(accessToken, groupId)
  }

  /**
   * /fleet/assets/{assetId:[0-9]+}/locations
   * Fetch the historical locations for the asset.
   *
   * @param accessToken Samsara API access token. 
   * @param assetId ID of the asset 
   * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
   * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
   * @return AssetLocationResponse
   */
  def getAssetLocation(accessToken: String, assetId: Long, startMs: Long, endMs: Long): Option[AssetLocationResponse] = {
    val await = Try(Await.result(getAssetLocationAsync(accessToken, assetId, startMs, endMs), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/assets/{assetId:[0-9]+}/locations asynchronously
   * Fetch the historical locations for the asset.
   *
   * @param accessToken Samsara API access token. 
   * @param assetId ID of the asset 
   * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
   * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
   * @return Future(AssetLocationResponse)
   */
  def getAssetLocationAsync(accessToken: String, assetId: Long, startMs: Long, endMs: Long): Future[AssetLocationResponse] = {
      helper.getAssetLocation(accessToken, assetId, startMs, endMs)
  }

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
  def getAssetReefer(accessToken: String, assetId: Long, startMs: Long, endMs: Long): Option[AssetReeferResponse] = {
    val await = Try(Await.result(getAssetReeferAsync(accessToken, assetId, startMs, endMs), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/assets/{assetId:[0-9]+}/reefer asynchronously
   * Fetch the reefer-specific stats of an asset.
   *
   * @param accessToken Samsara API access token. 
   * @param assetId ID of the asset 
   * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
   * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
   * @return Future(AssetReeferResponse)
   */
  def getAssetReeferAsync(accessToken: String, assetId: Long, startMs: Long, endMs: Long): Future[AssetReeferResponse] = {
      helper.getAssetReefer(accessToken, assetId, startMs, endMs)
  }

  /**
   * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
   * Fetch deactivated driver by id.
   *
   * @param accessToken Samsara API access token. 
   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
   * @return Driver
   */
  def getDeactivatedDriverById(accessToken: String, driverIdOrExternalId: String): Option[Driver] = {
    val await = Try(Await.result(getDeactivatedDriverByIdAsync(accessToken, driverIdOrExternalId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} asynchronously
   * Fetch deactivated driver by id.
   *
   * @param accessToken Samsara API access token. 
   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
   * @return Future(Driver)
   */
  def getDeactivatedDriverByIdAsync(accessToken: String, driverIdOrExternalId: String): Future[Driver] = {
      helper.getDeactivatedDriverById(accessToken, driverIdOrExternalId)
  }

  /**
   * /fleet/dispatch/routes/{route_id:[0-9]+}
   * Fetch a dispatch route by id.
   *
   * @param accessToken Samsara API access token. 
   * @param routeId ID of the dispatch route. 
   * @return DispatchRoute
   */
  def getDispatchRouteById(accessToken: String, routeId: Long): Option[DispatchRoute] = {
    val await = Try(Await.result(getDispatchRouteByIdAsync(accessToken, routeId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/dispatch/routes/{route_id:[0-9]+} asynchronously
   * Fetch a dispatch route by id.
   *
   * @param accessToken Samsara API access token. 
   * @param routeId ID of the dispatch route. 
   * @return Future(DispatchRoute)
   */
  def getDispatchRouteByIdAsync(accessToken: String, routeId: Long): Future[DispatchRoute] = {
      helper.getDispatchRouteById(accessToken, routeId)
  }

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
  def getDispatchRouteHistory(accessToken: String, routeId: Long, startTime: Option[Long] = None, endTime: Option[Long] = None): Option[DispatchRouteHistory] = {
    val await = Try(Await.result(getDispatchRouteHistoryAsync(accessToken, routeId, startTime, endTime), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/dispatch/routes/{route_id:[0-9]+}/history asynchronously
   * Fetch the history of a dispatch route.
   *
   * @param accessToken Samsara API access token. 
   * @param routeId ID of the route with history. 
   * @param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)
   * @param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)
   * @return Future(DispatchRouteHistory)
   */
  def getDispatchRouteHistoryAsync(accessToken: String, routeId: Long, startTime: Option[Long] = None, endTime: Option[Long] = None): Future[DispatchRouteHistory] = {
      helper.getDispatchRouteHistory(accessToken, routeId, startTime, endTime)
  }

  /**
   * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
   * Fetch all of the dispatch routes for a given driver.
   *
   * @param accessToken Samsara API access token. 
   * @param driverId ID of the driver with the associated routes. 
   * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
   * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
   * @return DispatchRoutes
   */
  def getDispatchRoutesByDriverId(accessToken: String, driverId: Long, endTime: Option[Long] = None, duration: Option[Long] = None): Option[DispatchRoutes] = {
    val await = Try(Await.result(getDispatchRoutesByDriverIdAsync(accessToken, driverId, endTime, duration), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes asynchronously
   * Fetch all of the dispatch routes for a given driver.
   *
   * @param accessToken Samsara API access token. 
   * @param driverId ID of the driver with the associated routes. 
   * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
   * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
   * @return Future(DispatchRoutes)
   */
  def getDispatchRoutesByDriverIdAsync(accessToken: String, driverId: Long, endTime: Option[Long] = None, duration: Option[Long] = None): Future[DispatchRoutes] = {
      helper.getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration)
  }

  /**
   * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
   * Fetch all of the dispatch routes for a given vehicle.
   *
   * @param accessToken Samsara API access token. 
   * @param vehicleId ID of the vehicle with the associated routes. 
   * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
   * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
   * @return DispatchRoutes
   */
  def getDispatchRoutesByVehicleId(accessToken: String, vehicleId: Long, endTime: Option[Long] = None, duration: Option[Long] = None): Option[DispatchRoutes] = {
    val await = Try(Await.result(getDispatchRoutesByVehicleIdAsync(accessToken, vehicleId, endTime, duration), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes asynchronously
   * Fetch all of the dispatch routes for a given vehicle.
   *
   * @param accessToken Samsara API access token. 
   * @param vehicleId ID of the vehicle with the associated routes. 
   * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
   * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
   * @return Future(DispatchRoutes)
   */
  def getDispatchRoutesByVehicleIdAsync(accessToken: String, vehicleId: Long, endTime: Option[Long] = None, duration: Option[Long] = None): Future[DispatchRoutes] = {
      helper.getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration)
  }

  /**
   * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
   * Fetch driver by id.
   *
   * @param accessToken Samsara API access token. 
   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
   * @return CurrentDriver
   */
  def getDriverById(accessToken: String, driverIdOrExternalId: String): Option[CurrentDriver] = {
    val await = Try(Await.result(getDriverByIdAsync(accessToken, driverIdOrExternalId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} asynchronously
   * Fetch driver by id.
   *
   * @param accessToken Samsara API access token. 
   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
   * @return Future(CurrentDriver)
   */
  def getDriverByIdAsync(accessToken: String, driverIdOrExternalId: String): Future[CurrentDriver] = {
      helper.getDriverById(accessToken, driverIdOrExternalId)
  }

  /**
   * /fleet/drivers/document_types
   * Fetch all of the document types.
   *
   * @return DocumentTypes
   */
  def getDriverDocumentTypesByOrgId(): Option[DocumentTypes] = {
    val await = Try(Await.result(getDriverDocumentTypesByOrgIdAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/drivers/document_types asynchronously
   * Fetch all of the document types.
   *
   * @return Future(DocumentTypes)
   */
  def getDriverDocumentTypesByOrgIdAsync(): Future[DocumentTypes] = {
      helper.getDriverDocumentTypesByOrgId()
  }

  /**
   * /fleet/drivers/documents
   * Fetch all of the documents.
   *
   * @param accessToken Samsara API access token. 
   * @param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)
   * @param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)
   * @return Documents
   */
  def getDriverDocumentsByOrgId(accessToken: String, endMs: Option[Long] = None, durationMs: Option[Long] = None): Option[Documents] = {
    val await = Try(Await.result(getDriverDocumentsByOrgIdAsync(accessToken, endMs, durationMs), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/drivers/documents asynchronously
   * Fetch all of the documents.
   *
   * @param accessToken Samsara API access token. 
   * @param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)
   * @param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)
   * @return Future(Documents)
   */
  def getDriverDocumentsByOrgIdAsync(accessToken: String, endMs: Option[Long] = None, durationMs: Option[Long] = None): Future[Documents] = {
      helper.getDriverDocumentsByOrgId(accessToken, endMs, durationMs)
  }

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
  def getDriverSafetyScore(driverId: Long, accessToken: String, startMs: Long, endMs: Long): Option[DriverSafetyScoreResponse] = {
    val await = Try(Await.result(getDriverSafetyScoreAsync(driverId, accessToken, startMs, endMs), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/drivers/{driverId:[0-9]+}/safety/score asynchronously
   * Fetch the safety score for the driver.
   *
   * @param driverId ID of the driver 
   * @param accessToken Samsara API access token. 
   * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
   * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
   * @return Future(DriverSafetyScoreResponse)
   */
  def getDriverSafetyScoreAsync(driverId: Long, accessToken: String, startMs: Long, endMs: Long): Future[DriverSafetyScoreResponse] = {
      helper.getDriverSafetyScore(driverId, accessToken, startMs, endMs)
  }

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
  def getDvirs(accessToken: String, endMs: Integer, durationMs: Integer, groupId: Option[Integer] = None): Option[DvirListResponse] = {
    val await = Try(Await.result(getDvirsAsync(accessToken, endMs, durationMs, groupId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/maintenance/dvirs asynchronously
   * Get DVIRs for the org within provided time constraints
   *
   * @param accessToken Samsara API access token. 
   * @param endMs time in millis until the last dvir log. 
   * @param durationMs time in millis which corresponds to the duration before the end_ms. 
   * @param groupId Group ID to query. (optional)
   * @return Future(DvirListResponse)
   */
  def getDvirsAsync(accessToken: String, endMs: Integer, durationMs: Integer, groupId: Option[Integer] = None): Future[DvirListResponse] = {
      helper.getDvirs(accessToken, endMs, durationMs, groupId)
  }

  /**
   * /fleet/drivers
   * Get all the drivers for the specified group.
   *
   * @param accessToken Samsara API access token. 
   * @param groupDriversParam  
   * @return DriversResponse
   */
  def getFleetDrivers(accessToken: String, groupDriversParam: GroupDriversParam): Option[DriversResponse] = {
    val await = Try(Await.result(getFleetDriversAsync(accessToken, groupDriversParam), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/drivers asynchronously
   * Get all the drivers for the specified group.
   *
   * @param accessToken Samsara API access token. 
   * @param groupDriversParam  
   * @return Future(DriversResponse)
   */
  def getFleetDriversAsync(accessToken: String, groupDriversParam: GroupDriversParam): Future[DriversResponse] = {
      helper.getFleetDrivers(accessToken, groupDriversParam)
  }

  /**
   * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
   * Get summarized daily HOS charts for a specified driver.
   *
   * @param accessToken Samsara API access token. 
   * @param driverId ID of the driver with HOS logs. 
   * @param hosLogsParam  
   * @return DriverDailyLogResponse
   */
  def getFleetDriversHosDailyLogs(accessToken: String, driverId: Long, hosLogsParam: HosLogsParam): Option[DriverDailyLogResponse] = {
    val await = Try(Await.result(getFleetDriversHosDailyLogsAsync(accessToken, driverId, hosLogsParam), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs asynchronously
   * Get summarized daily HOS charts for a specified driver.
   *
   * @param accessToken Samsara API access token. 
   * @param driverId ID of the driver with HOS logs. 
   * @param hosLogsParam  
   * @return Future(DriverDailyLogResponse)
   */
  def getFleetDriversHosDailyLogsAsync(accessToken: String, driverId: Long, hosLogsParam: HosLogsParam): Future[DriverDailyLogResponse] = {
      helper.getFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam)
  }

  /**
   * /fleet/drivers/summary
   * Get the distance and time each driver in an organization has driven in a given time period.
   *
   * @param accessToken Samsara API access token. 
   * @param driversSummaryParam Org ID and time range to query. 
   * @param snapToDayBounds Snap query result to HOS day boundaries. (optional)
   * @return DriversSummaryResponse
   */
  def getFleetDriversSummary(accessToken: String, driversSummaryParam: DriversSummaryParam, snapToDayBounds: Option[Boolean] = None): Option[DriversSummaryResponse] = {
    val await = Try(Await.result(getFleetDriversSummaryAsync(accessToken, driversSummaryParam, snapToDayBounds), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/drivers/summary asynchronously
   * Get the distance and time each driver in an organization has driven in a given time period.
   *
   * @param accessToken Samsara API access token. 
   * @param driversSummaryParam Org ID and time range to query. 
   * @param snapToDayBounds Snap query result to HOS day boundaries. (optional)
   * @return Future(DriversSummaryResponse)
   */
  def getFleetDriversSummaryAsync(accessToken: String, driversSummaryParam: DriversSummaryParam, snapToDayBounds: Option[Boolean] = None): Future[DriversSummaryResponse] = {
      helper.getFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds)
  }

  /**
   * /fleet/hos_authentication_logs
   * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
   *
   * @param accessToken Samsara API access token. 
   * @param hosAuthenticationLogsParam  
   * @return HosAuthenticationLogsResponse
   */
  def getFleetHosAuthenticationLogs(accessToken: String, hosAuthenticationLogsParam: HosAuthenticationLogsParam): Option[HosAuthenticationLogsResponse] = {
    val await = Try(Await.result(getFleetHosAuthenticationLogsAsync(accessToken, hosAuthenticationLogsParam), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/hos_authentication_logs asynchronously
   * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
   *
   * @param accessToken Samsara API access token. 
   * @param hosAuthenticationLogsParam  
   * @return Future(HosAuthenticationLogsResponse)
   */
  def getFleetHosAuthenticationLogsAsync(accessToken: String, hosAuthenticationLogsParam: HosAuthenticationLogsParam): Future[HosAuthenticationLogsResponse] = {
      helper.getFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam)
  }

  /**
   * /fleet/hos_logs
   * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
   *
   * @param accessToken Samsara API access token. 
   * @param hosLogsParam  
   * @return HosLogsResponse
   */
  def getFleetHosLogs(accessToken: String, hosLogsParam: HosLogsParam1): Option[HosLogsResponse] = {
    val await = Try(Await.result(getFleetHosLogsAsync(accessToken, hosLogsParam), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/hos_logs asynchronously
   * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
   *
   * @param accessToken Samsara API access token. 
   * @param hosLogsParam  
   * @return Future(HosLogsResponse)
   */
  def getFleetHosLogsAsync(accessToken: String, hosLogsParam: HosLogsParam1): Future[HosLogsResponse] = {
      helper.getFleetHosLogs(accessToken, hosLogsParam)
  }

  /**
   * /fleet/hos_logs_summary
   * Get the current HOS status for all drivers in the group.
   *
   * @param accessToken Samsara API access token. 
   * @param hosLogsParam  
   * @return HosLogsSummaryResponse
   */
  def getFleetHosLogsSummary(accessToken: String, hosLogsParam: HosLogsParam2): Option[HosLogsSummaryResponse] = {
    val await = Try(Await.result(getFleetHosLogsSummaryAsync(accessToken, hosLogsParam), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/hos_logs_summary asynchronously
   * Get the current HOS status for all drivers in the group.
   *
   * @param accessToken Samsara API access token. 
   * @param hosLogsParam  
   * @return Future(HosLogsSummaryResponse)
   */
  def getFleetHosLogsSummaryAsync(accessToken: String, hosLogsParam: HosLogsParam2): Future[HosLogsSummaryResponse] = {
      helper.getFleetHosLogsSummary(accessToken, hosLogsParam)
  }

  /**
   * /fleet/locations
   * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
   *
   * @param accessToken Samsara API access token. 
   * @param groupParam Group ID to query. 
   * @return InlineResponse2003
   */
  def getFleetLocations(accessToken: String, groupParam: GroupParam): Option[InlineResponse2003] = {
    val await = Try(Await.result(getFleetLocationsAsync(accessToken, groupParam), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/locations asynchronously
   * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
   *
   * @param accessToken Samsara API access token. 
   * @param groupParam Group ID to query. 
   * @return Future(InlineResponse2003)
   */
  def getFleetLocationsAsync(accessToken: String, groupParam: GroupParam): Future[InlineResponse2003] = {
      helper.getFleetLocations(accessToken, groupParam)
  }

  /**
   * /fleet/maintenance/list
   * Get list of the vehicles with any engine faults or check light data.
   *
   * @param accessToken Samsara API access token. 
   * @param groupParam Group ID to query. 
   * @return InlineResponse2004
   */
  def getFleetMaintenanceList(accessToken: String, groupParam: GroupParam): Option[InlineResponse2004] = {
    val await = Try(Await.result(getFleetMaintenanceListAsync(accessToken, groupParam), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/maintenance/list asynchronously
   * Get list of the vehicles with any engine faults or check light data.
   *
   * @param accessToken Samsara API access token. 
   * @param groupParam Group ID to query. 
   * @return Future(InlineResponse2004)
   */
  def getFleetMaintenanceListAsync(accessToken: String, groupParam: GroupParam): Future[InlineResponse2004] = {
      helper.getFleetMaintenanceList(accessToken, groupParam)
  }

  /**
   * /fleet/trips
   * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
   *
   * @param accessToken Samsara API access token. 
   * @param tripsParam Group ID, vehicle ID and time range to query. 
   * @return TripResponse
   */
  def getFleetTrips(accessToken: String, tripsParam: TripsParam): Option[TripResponse] = {
    val await = Try(Await.result(getFleetTripsAsync(accessToken, tripsParam), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/trips asynchronously
   * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
   *
   * @param accessToken Samsara API access token. 
   * @param tripsParam Group ID, vehicle ID and time range to query. 
   * @return Future(TripResponse)
   */
  def getFleetTripsAsync(accessToken: String, tripsParam: TripsParam): Future[TripResponse] = {
      helper.getFleetTrips(accessToken, tripsParam)
  }

  /**
   * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
   * Gets a specific vehicle.
   *
   * @param accessToken Samsara API access token. 
   * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. 
   * @return FleetVehicleResponse
   */
  def getFleetVehicle(accessToken: String, vehicleIdOrExternalId: String): Option[FleetVehicleResponse] = {
    val await = Try(Await.result(getFleetVehicleAsync(accessToken, vehicleIdOrExternalId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+} asynchronously
   * Gets a specific vehicle.
   *
   * @param accessToken Samsara API access token. 
   * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. 
   * @return Future(FleetVehicleResponse)
   */
  def getFleetVehicleAsync(accessToken: String, vehicleIdOrExternalId: String): Future[FleetVehicleResponse] = {
      helper.getFleetVehicle(accessToken, vehicleIdOrExternalId)
  }

  /**
   * /addresses/{addressId}
   * Fetch an address by its id.
   *
   * @param accessToken Samsara API access token. 
   * @param addressId ID of the address/geofence 
   * @return Address
   */
  def getOrganizationAddress(accessToken: String, addressId: Long): Option[Address] = {
    val await = Try(Await.result(getOrganizationAddressAsync(accessToken, addressId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /addresses/{addressId} asynchronously
   * Fetch an address by its id.
   *
   * @param accessToken Samsara API access token. 
   * @param addressId ID of the address/geofence 
   * @return Future(Address)
   */
  def getOrganizationAddressAsync(accessToken: String, addressId: Long): Future[Address] = {
      helper.getOrganizationAddress(accessToken, addressId)
  }

  /**
   * /addresses
   * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
   *
   * @param accessToken Samsara API access token. 
   * @return List[Address]
   */
  def getOrganizationAddresses(accessToken: String): Option[List[Address]] = {
    val await = Try(Await.result(getOrganizationAddressesAsync(accessToken), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /addresses asynchronously
   * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
   *
   * @param accessToken Samsara API access token. 
   * @return Future(List[Address])
   */
  def getOrganizationAddressesAsync(accessToken: String): Future[List[Address]] = {
      helper.getOrganizationAddresses(accessToken)
  }

  /**
   * /contacts/{contact_id}
   * Fetch a contact by its id.
   *
   * @param accessToken Samsara API access token. 
   * @param contactId ID of the contact 
   * @return Contact
   */
  def getOrganizationContact(accessToken: String, contactId: Long): Option[Contact] = {
    val await = Try(Await.result(getOrganizationContactAsync(accessToken, contactId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /contacts/{contact_id} asynchronously
   * Fetch a contact by its id.
   *
   * @param accessToken Samsara API access token. 
   * @param contactId ID of the contact 
   * @return Future(Contact)
   */
  def getOrganizationContactAsync(accessToken: String, contactId: Long): Future[Contact] = {
      helper.getOrganizationContact(accessToken, contactId)
  }

  /**
   * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
   * Fetch harsh event details for a vehicle.
   *
   * @param vehicleId ID of the vehicle 
   * @param accessToken Samsara API access token. 
   * @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event. 
   * @return VehicleHarshEventResponse
   */
  def getVehicleHarshEvent(vehicleId: Long, accessToken: String, timestamp: Long): Option[VehicleHarshEventResponse] = {
    val await = Try(Await.result(getVehicleHarshEventAsync(vehicleId, accessToken, timestamp), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event asynchronously
   * Fetch harsh event details for a vehicle.
   *
   * @param vehicleId ID of the vehicle 
   * @param accessToken Samsara API access token. 
   * @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event. 
   * @return Future(VehicleHarshEventResponse)
   */
  def getVehicleHarshEventAsync(vehicleId: Long, accessToken: String, timestamp: Long): Future[VehicleHarshEventResponse] = {
      helper.getVehicleHarshEvent(vehicleId, accessToken, timestamp)
  }

  /**
   * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
   * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
   *
   * @param accessToken Samsara API access token. 
   * @param vehicleId ID of the vehicle with the associated routes. 
   * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) 
   * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) 
   * @return FleetVehicleLocations
   */
  def getVehicleLocations(accessToken: String, vehicleId: Long, startMs: Long, endMs: Long): Option[FleetVehicleLocations] = {
    val await = Try(Await.result(getVehicleLocationsAsync(accessToken, vehicleId, startMs, endMs), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/vehicles/{vehicle_id:[0-9]+}/locations asynchronously
   * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
   *
   * @param accessToken Samsara API access token. 
   * @param vehicleId ID of the vehicle with the associated routes. 
   * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) 
   * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) 
   * @return Future(FleetVehicleLocations)
   */
  def getVehicleLocationsAsync(accessToken: String, vehicleId: Long, startMs: Long, endMs: Long): Future[FleetVehicleLocations] = {
      helper.getVehicleLocations(accessToken, vehicleId, startMs, endMs)
  }

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
  def getVehicleSafetyScore(vehicleId: Long, accessToken: String, startMs: Long, endMs: Long): Option[VehicleSafetyScoreResponse] = {
    val await = Try(Await.result(getVehicleSafetyScoreAsync(vehicleId, accessToken, startMs, endMs), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score asynchronously
   * Fetch the safety score for the vehicle.
   *
   * @param vehicleId ID of the vehicle 
   * @param accessToken Samsara API access token. 
   * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
   * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
   * @return Future(VehicleSafetyScoreResponse)
   */
  def getVehicleSafetyScoreAsync(vehicleId: Long, accessToken: String, startMs: Long, endMs: Long): Future[VehicleSafetyScoreResponse] = {
      helper.getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs)
  }

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
  def getVehicleStats(accessToken: String, startMs: Integer, endMs: Integer, series: Option[String] = None, tagIds: Option[String] = None, startingAfter: Option[String] = None, endingBefore: Option[String] = None, limit: Option[Long] = None): Option[InlineResponse2005] = {
    val await = Try(Await.result(getVehicleStatsAsync(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/vehicles/stats asynchronously
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
   * @return Future(InlineResponse2005)
   */
  def getVehicleStatsAsync(accessToken: String, startMs: Integer, endMs: Integer, series: Option[String] = None, tagIds: Option[String] = None, startingAfter: Option[String] = None, endingBefore: Option[String] = None, limit: Option[Long] = None): Future[InlineResponse2005] = {
      helper.getVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit)
  }

  /**
   * /fleet/vehicles/locations
   * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
   *
   * @param accessToken Samsara API access token. 
   * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) 
   * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) 
   * @return FleetVehiclesLocations
   */
  def getVehiclesLocations(accessToken: String, startMs: Integer, endMs: Integer): Option[FleetVehiclesLocations] = {
    val await = Try(Await.result(getVehiclesLocationsAsync(accessToken, startMs, endMs), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/vehicles/locations asynchronously
   * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
   *
   * @param accessToken Samsara API access token. 
   * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) 
   * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) 
   * @return Future(FleetVehiclesLocations)
   */
  def getVehiclesLocationsAsync(accessToken: String, startMs: Integer, endMs: Integer): Future[FleetVehiclesLocations] = {
      helper.getVehiclesLocations(accessToken, startMs, endMs)
  }

  /**
   * /contacts
   * Fetch all contacts for the organization.
   *
   * @param accessToken Samsara API access token. 
   * @return List[Contact]
   */
  def listContacts(accessToken: String): Option[List[Contact]] = {
    val await = Try(Await.result(listContactsAsync(accessToken), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /contacts asynchronously
   * Fetch all contacts for the organization.
   *
   * @param accessToken Samsara API access token. 
   * @return Future(List[Contact])
   */
  def listContactsAsync(accessToken: String): Future[List[Contact]] = {
      helper.listContacts(accessToken)
  }

  /**
   * /fleet/list
   * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
   *
   * @param accessToken Samsara API access token. 
   * @param groupParam Group ID to query. 
   * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
   * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
   * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
   * @return InlineResponse2002
   */
  def listFleet(accessToken: String, groupParam: GroupParam, startingAfter: Option[String] = None, endingBefore: Option[String] = None, limit: Option[Long] = None): Option[InlineResponse2002] = {
    val await = Try(Await.result(listFleetAsync(accessToken, groupParam, startingAfter, endingBefore, limit), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/list asynchronously
   * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
   *
   * @param accessToken Samsara API access token. 
   * @param groupParam Group ID to query. 
   * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
   * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
   * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
   * @return Future(InlineResponse2002)
   */
  def listFleetAsync(accessToken: String, groupParam: GroupParam, startingAfter: Option[String] = None, endingBefore: Option[String] = None, limit: Option[Long] = None): Future[InlineResponse2002] = {
      helper.listFleet(accessToken, groupParam, startingAfter, endingBefore, limit)
  }

  /**
   * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
   * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
   *
   * @param accessToken Samsara API access token. 
   * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. 
   * @param data  
   * @return FleetVehicleResponse
   */
  def patchFleetVehicle(accessToken: String, vehicleIdOrExternalId: String, data: Data): Option[FleetVehicleResponse] = {
    val await = Try(Await.result(patchFleetVehicleAsync(accessToken, vehicleIdOrExternalId, data), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+} asynchronously
   * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
   *
   * @param accessToken Samsara API access token. 
   * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. 
   * @param data  
   * @return Future(FleetVehicleResponse)
   */
  def patchFleetVehicleAsync(accessToken: String, vehicleIdOrExternalId: String, data: Data): Future[FleetVehicleResponse] = {
      helper.patchFleetVehicle(accessToken, vehicleIdOrExternalId, data)
  }

  /**
   * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
   * Reactivate the inactive driver having id.
   *
   * @param accessToken Samsara API access token. 
   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
   * @param reactivateDriverParam Driver reactivation body 
   * @return CurrentDriver
   */
  def reactivateDriverById(accessToken: String, driverIdOrExternalId: String, reactivateDriverParam: ReactivateDriverParam): Option[CurrentDriver] = {
    val await = Try(Await.result(reactivateDriverByIdAsync(accessToken, driverIdOrExternalId, reactivateDriverParam), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} asynchronously
   * Reactivate the inactive driver having id.
   *
   * @param accessToken Samsara API access token. 
   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
   * @param reactivateDriverParam Driver reactivation body 
   * @return Future(CurrentDriver)
   */
  def reactivateDriverByIdAsync(accessToken: String, driverIdOrExternalId: String, reactivateDriverParam: ReactivateDriverParam): Future[CurrentDriver] = {
      helper.reactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam)
  }

  /**
   * /fleet/dispatch/routes/{route_id:[0-9]+}/
   * Update a dispatch route and its associated jobs.
   *
   * @param accessToken Samsara API access token. 
   * @param routeId ID of the dispatch route. 
   * @param updateDispatchRouteParams  
   * @return DispatchRoute
   */
  def updateDispatchRouteById(accessToken: String, routeId: Long, updateDispatchRouteParams: DispatchRoute): Option[DispatchRoute] = {
    val await = Try(Await.result(updateDispatchRouteByIdAsync(accessToken, routeId, updateDispatchRouteParams), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/dispatch/routes/{route_id:[0-9]+}/ asynchronously
   * Update a dispatch route and its associated jobs.
   *
   * @param accessToken Samsara API access token. 
   * @param routeId ID of the dispatch route. 
   * @param updateDispatchRouteParams  
   * @return Future(DispatchRoute)
   */
  def updateDispatchRouteByIdAsync(accessToken: String, routeId: Long, updateDispatchRouteParams: DispatchRoute): Future[DispatchRoute] = {
      helper.updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams)
  }

  /**
   * /addresses/{addressId}
   * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
   *
   * @param accessToken Samsara API access token. 
   * @param address Update parts of an address&#39;s value. If the geofence &#39;circle&#39; or &#39;polygon&#39; key is specified, the update will change the type of geofence accordingly. 
   * @param addressId ID of the address/geofence 
   * @return void
   */
  def updateOrganizationAddress(accessToken: String, address: Address, addressId: Long) = {
    val await = Try(Await.result(updateOrganizationAddressAsync(accessToken, address, addressId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /addresses/{addressId} asynchronously
   * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
   *
   * @param accessToken Samsara API access token. 
   * @param address Update parts of an address&#39;s value. If the geofence &#39;circle&#39; or &#39;polygon&#39; key is specified, the update will change the type of geofence accordingly. 
   * @param addressId ID of the address/geofence 
   * @return Future(void)
   */
  def updateOrganizationAddressAsync(accessToken: String, address: Address, addressId: Long) = {
      helper.updateOrganizationAddress(accessToken, address, addressId)
  }

  /**
   * /fleet/set_data
   * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
   *
   * @param accessToken Samsara API access token. 
   * @param vehicleUpdateParam  
   * @return void
   */
  def updateVehicles(accessToken: String, vehicleUpdateParam: VehicleUpdateParam) = {
    val await = Try(Await.result(updateVehiclesAsync(accessToken, vehicleUpdateParam), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/set_data asynchronously
   * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
   *
   * @param accessToken Samsara API access token. 
   * @param vehicleUpdateParam  
   * @return Future(void)
   */
  def updateVehiclesAsync(accessToken: String, vehicleUpdateParam: VehicleUpdateParam) = {
      helper.updateVehicles(accessToken, vehicleUpdateParam)
  }

}

class FleetApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def addFleetAddress(accessToken: String,
    addressParam: AddressParam)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[AddressParam]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/fleet/add_address"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->addFleetAddress")

    if (addressParam == null) throw new Exception("Missing required parameter 'addressParam' when calling FleetApi->addFleetAddress")
    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(addressParam))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def addOrganizationAddresses(accessToken: String,
    addresses: Addresses)(implicit reader: ClientResponseReader[List[Address]], writer: RequestWriter[Addresses]): Future[List[Address]] = {
    // create path and map variables
    val path = (addFmt("/addresses"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->addOrganizationAddresses")

    if (addresses == null) throw new Exception("Missing required parameter 'addresses' when calling FleetApi->addOrganizationAddresses")
    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(addresses))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createDispatchRoute(accessToken: String,
    createDispatchRouteParams: DispatchRouteCreate)(implicit reader: ClientResponseReader[DispatchRoute], writer: RequestWriter[DispatchRouteCreate]): Future[DispatchRoute] = {
    // create path and map variables
    val path = (addFmt("/fleet/dispatch/routes"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->createDispatchRoute")

    if (createDispatchRouteParams == null) throw new Exception("Missing required parameter 'createDispatchRouteParams' when calling FleetApi->createDispatchRoute")
    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(createDispatchRouteParams))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createDriver(accessToken: String,
    createDriverParam: DriverForCreate)(implicit reader: ClientResponseReader[Driver], writer: RequestWriter[DriverForCreate]): Future[Driver] = {
    // create path and map variables
    val path = (addFmt("/fleet/drivers/create"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->createDriver")

    if (createDriverParam == null) throw new Exception("Missing required parameter 'createDriverParam' when calling FleetApi->createDriver")
    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(createDriverParam))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createDriverDispatchRoute(accessToken: String,
    driverId: Long,
    createDispatchRouteParams: DispatchRouteCreate)(implicit reader: ClientResponseReader[DispatchRoute], writer: RequestWriter[DispatchRouteCreate]): Future[DispatchRoute] = {
    // create path and map variables
    val path = (addFmt("/fleet/drivers/{driver_id}/dispatch/routes")
      replaceAll("\\{" + "driver_id" + "\\}", driverId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->createDriverDispatchRoute")

    if (createDispatchRouteParams == null) throw new Exception("Missing required parameter 'createDispatchRouteParams' when calling FleetApi->createDriverDispatchRoute")
    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(createDispatchRouteParams))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createDriverDocument(accessToken: String,
    driverId: Long,
    createDocumentParams: DocumentCreate)(implicit reader: ClientResponseReader[Document], writer: RequestWriter[DocumentCreate]): Future[Document] = {
    // create path and map variables
    val path = (addFmt("/fleet/drivers/{driver_id}/documents")
      replaceAll("\\{" + "driver_id" + "\\}", driverId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->createDriverDocument")

    if (createDocumentParams == null) throw new Exception("Missing required parameter 'createDocumentParams' when calling FleetApi->createDriverDocument")
    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(createDocumentParams))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createDvir(accessToken: String,
    createDvirParam: CreateDvirParam)(implicit reader: ClientResponseReader[DvirBase], writer: RequestWriter[CreateDvirParam]): Future[DvirBase] = {
    // create path and map variables
    val path = (addFmt("/fleet/maintenance/dvirs"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->createDvir")

    if (createDvirParam == null) throw new Exception("Missing required parameter 'createDvirParam' when calling FleetApi->createDvir")
    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(createDvirParam))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createVehicleDispatchRoute(accessToken: String,
    vehicleId: Long,
    createDispatchRouteParams: DispatchRouteCreate)(implicit reader: ClientResponseReader[DispatchRoute], writer: RequestWriter[DispatchRouteCreate]): Future[DispatchRoute] = {
    // create path and map variables
    val path = (addFmt("/fleet/vehicles/{vehicle_id}/dispatch/routes")
      replaceAll("\\{" + "vehicle_id" + "\\}", vehicleId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->createVehicleDispatchRoute")

    if (createDispatchRouteParams == null) throw new Exception("Missing required parameter 'createDispatchRouteParams' when calling FleetApi->createVehicleDispatchRoute")
    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(createDispatchRouteParams))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deactivateDriver(accessToken: String,
    driverIdOrExternalId: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/fleet/drivers/{driver_id_or_external_id}")
      replaceAll("\\{" + "driver_id_or_external_id" + "\\}", driverIdOrExternalId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->deactivateDriver")

    if (driverIdOrExternalId == null) throw new Exception("Missing required parameter 'driverIdOrExternalId' when calling FleetApi->deactivateDriver")

    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteDispatchRouteById(accessToken: String,
    routeId: Long)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/fleet/dispatch/routes/{route_id}")
      replaceAll("\\{" + "route_id" + "\\}", routeId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->deleteDispatchRouteById")

    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteOrganizationAddress(accessToken: String,
    addressId: Long)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/addresses/{addressId}")
      replaceAll("\\{" + "addressId" + "\\}", addressId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->deleteOrganizationAddress")

    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def fetchAllDispatchRoutes(accessToken: String,
    groupId: Option[Long] = None,
    endTime: Option[Long] = None,
    duration: Option[Long] = None
    )(implicit reader: ClientResponseReader[DispatchRoutes]): Future[DispatchRoutes] = {
    // create path and map variables
    val path = (addFmt("/fleet/dispatch/routes"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->fetchAllDispatchRoutes")

    queryParams += "access_token" -> accessToken.toString
    groupId match {
      case Some(param) => queryParams += "group_id" -> param.toString
      case _ => queryParams
    }
    endTime match {
      case Some(param) => queryParams += "end_time" -> param.toString
      case _ => queryParams
    }
    duration match {
      case Some(param) => queryParams += "duration" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def fetchAllRouteJobUpdates(accessToken: String,
    groupId: Option[Long] = None,
    sequenceId: Option[String] = None,
    include: Option[String] = None
    )(implicit reader: ClientResponseReader[AllRouteJobUpdates]): Future[AllRouteJobUpdates] = {
    // create path and map variables
    val path = (addFmt("/fleet/dispatch/routes/job_updates"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->fetchAllRouteJobUpdates")

    queryParams += "access_token" -> accessToken.toString
    groupId match {
      case Some(param) => queryParams += "group_id" -> param.toString
      case _ => queryParams
    }
    sequenceId match {
      case Some(param) => queryParams += "sequence_id" -> param.toString
      case _ => queryParams
    }
    include match {
      case Some(param) => queryParams += "include" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getAllAssetCurrentLocations(accessToken: String,
    groupId: Option[Long] = None
    )(implicit reader: ClientResponseReader[InlineResponse2001]): Future[InlineResponse2001] = {
    // create path and map variables
    val path = (addFmt("/fleet/assets/locations"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getAllAssetCurrentLocations")

    queryParams += "access_token" -> accessToken.toString
    groupId match {
      case Some(param) => queryParams += "group_id" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getAllAssets(accessToken: String,
    groupId: Option[Long] = None
    )(implicit reader: ClientResponseReader[InlineResponse200]): Future[InlineResponse200] = {
    // create path and map variables
    val path = (addFmt("/fleet/assets"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getAllAssets")

    queryParams += "access_token" -> accessToken.toString
    groupId match {
      case Some(param) => queryParams += "group_id" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getAllDeactivatedDrivers(accessToken: String,
    groupId: Option[Long] = None
    )(implicit reader: ClientResponseReader[List[Driver]]): Future[List[Driver]] = {
    // create path and map variables
    val path = (addFmt("/fleet/drivers/inactive"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getAllDeactivatedDrivers")

    queryParams += "access_token" -> accessToken.toString
    groupId match {
      case Some(param) => queryParams += "group_id" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getAssetLocation(accessToken: String,
    assetId: Long,
    startMs: Long,
    endMs: Long)(implicit reader: ClientResponseReader[AssetLocationResponse]): Future[AssetLocationResponse] = {
    // create path and map variables
    val path = (addFmt("/fleet/assets/{asset_id}/locations")
      replaceAll("\\{" + "asset_id" + "\\}", assetId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getAssetLocation")

    queryParams += "access_token" -> accessToken.toString
    queryParams += "startMs" -> startMs.toString
    queryParams += "endMs" -> endMs.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getAssetReefer(accessToken: String,
    assetId: Long,
    startMs: Long,
    endMs: Long)(implicit reader: ClientResponseReader[AssetReeferResponse]): Future[AssetReeferResponse] = {
    // create path and map variables
    val path = (addFmt("/fleet/assets/{asset_id}/reefer")
      replaceAll("\\{" + "asset_id" + "\\}", assetId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getAssetReefer")

    queryParams += "access_token" -> accessToken.toString
    queryParams += "startMs" -> startMs.toString
    queryParams += "endMs" -> endMs.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getDeactivatedDriverById(accessToken: String,
    driverIdOrExternalId: String)(implicit reader: ClientResponseReader[Driver]): Future[Driver] = {
    // create path and map variables
    val path = (addFmt("/fleet/drivers/inactive/{driver_id_or_external_id}")
      replaceAll("\\{" + "driver_id_or_external_id" + "\\}", driverIdOrExternalId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getDeactivatedDriverById")

    if (driverIdOrExternalId == null) throw new Exception("Missing required parameter 'driverIdOrExternalId' when calling FleetApi->getDeactivatedDriverById")

    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getDispatchRouteById(accessToken: String,
    routeId: Long)(implicit reader: ClientResponseReader[DispatchRoute]): Future[DispatchRoute] = {
    // create path and map variables
    val path = (addFmt("/fleet/dispatch/routes/{route_id}")
      replaceAll("\\{" + "route_id" + "\\}", routeId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getDispatchRouteById")

    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getDispatchRouteHistory(accessToken: String,
    routeId: Long,
    startTime: Option[Long] = None,
    endTime: Option[Long] = None
    )(implicit reader: ClientResponseReader[DispatchRouteHistory]): Future[DispatchRouteHistory] = {
    // create path and map variables
    val path = (addFmt("/fleet/dispatch/routes/{route_id}/history")
      replaceAll("\\{" + "route_id" + "\\}", routeId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getDispatchRouteHistory")

    queryParams += "access_token" -> accessToken.toString
    startTime match {
      case Some(param) => queryParams += "start_time" -> param.toString
      case _ => queryParams
    }
    endTime match {
      case Some(param) => queryParams += "end_time" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getDispatchRoutesByDriverId(accessToken: String,
    driverId: Long,
    endTime: Option[Long] = None,
    duration: Option[Long] = None
    )(implicit reader: ClientResponseReader[DispatchRoutes]): Future[DispatchRoutes] = {
    // create path and map variables
    val path = (addFmt("/fleet/drivers/{driver_id}/dispatch/routes")
      replaceAll("\\{" + "driver_id" + "\\}", driverId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getDispatchRoutesByDriverId")

    queryParams += "access_token" -> accessToken.toString
    endTime match {
      case Some(param) => queryParams += "end_time" -> param.toString
      case _ => queryParams
    }
    duration match {
      case Some(param) => queryParams += "duration" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getDispatchRoutesByVehicleId(accessToken: String,
    vehicleId: Long,
    endTime: Option[Long] = None,
    duration: Option[Long] = None
    )(implicit reader: ClientResponseReader[DispatchRoutes]): Future[DispatchRoutes] = {
    // create path and map variables
    val path = (addFmt("/fleet/vehicles/{vehicle_id}/dispatch/routes")
      replaceAll("\\{" + "vehicle_id" + "\\}", vehicleId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getDispatchRoutesByVehicleId")

    queryParams += "access_token" -> accessToken.toString
    endTime match {
      case Some(param) => queryParams += "end_time" -> param.toString
      case _ => queryParams
    }
    duration match {
      case Some(param) => queryParams += "duration" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getDriverById(accessToken: String,
    driverIdOrExternalId: String)(implicit reader: ClientResponseReader[CurrentDriver]): Future[CurrentDriver] = {
    // create path and map variables
    val path = (addFmt("/fleet/drivers/{driver_id_or_external_id}")
      replaceAll("\\{" + "driver_id_or_external_id" + "\\}", driverIdOrExternalId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getDriverById")

    if (driverIdOrExternalId == null) throw new Exception("Missing required parameter 'driverIdOrExternalId' when calling FleetApi->getDriverById")

    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getDriverDocumentTypesByOrgId()(implicit reader: ClientResponseReader[DocumentTypes]): Future[DocumentTypes] = {
    // create path and map variables
    val path = (addFmt("/fleet/drivers/document_types"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getDriverDocumentsByOrgId(accessToken: String,
    endMs: Option[Long] = None,
    durationMs: Option[Long] = None
    )(implicit reader: ClientResponseReader[Documents]): Future[Documents] = {
    // create path and map variables
    val path = (addFmt("/fleet/drivers/documents"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getDriverDocumentsByOrgId")

    queryParams += "access_token" -> accessToken.toString
    endMs match {
      case Some(param) => queryParams += "endMs" -> param.toString
      case _ => queryParams
    }
    durationMs match {
      case Some(param) => queryParams += "durationMs" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getDriverSafetyScore(driverId: Long,
    accessToken: String,
    startMs: Long,
    endMs: Long)(implicit reader: ClientResponseReader[DriverSafetyScoreResponse]): Future[DriverSafetyScoreResponse] = {
    // create path and map variables
    val path = (addFmt("/fleet/drivers/{driverId}/safety/score")
      replaceAll("\\{" + "driverId" + "\\}", driverId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getDriverSafetyScore")

    queryParams += "access_token" -> accessToken.toString
    queryParams += "startMs" -> startMs.toString
    queryParams += "endMs" -> endMs.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getDvirs(accessToken: String,
    endMs: Integer,
    durationMs: Integer,
    groupId: Option[Integer] = None
    )(implicit reader: ClientResponseReader[DvirListResponse]): Future[DvirListResponse] = {
    // create path and map variables
    val path = (addFmt("/fleet/maintenance/dvirs"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getDvirs")

    queryParams += "access_token" -> accessToken.toString
    queryParams += "end_ms" -> endMs.toString
    queryParams += "duration_ms" -> durationMs.toString
    groupId match {
      case Some(param) => queryParams += "group_id" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getFleetDrivers(accessToken: String,
    groupDriversParam: GroupDriversParam)(implicit reader: ClientResponseReader[DriversResponse], writer: RequestWriter[GroupDriversParam]): Future[DriversResponse] = {
    // create path and map variables
    val path = (addFmt("/fleet/drivers"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getFleetDrivers")

    if (groupDriversParam == null) throw new Exception("Missing required parameter 'groupDriversParam' when calling FleetApi->getFleetDrivers")
    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(groupDriversParam))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getFleetDriversHosDailyLogs(accessToken: String,
    driverId: Long,
    hosLogsParam: HosLogsParam)(implicit reader: ClientResponseReader[DriverDailyLogResponse], writer: RequestWriter[HosLogsParam]): Future[DriverDailyLogResponse] = {
    // create path and map variables
    val path = (addFmt("/fleet/drivers/{driver_id}/hos_daily_logs")
      replaceAll("\\{" + "driver_id" + "\\}", driverId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getFleetDriversHosDailyLogs")

    if (hosLogsParam == null) throw new Exception("Missing required parameter 'hosLogsParam' when calling FleetApi->getFleetDriversHosDailyLogs")
    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(hosLogsParam))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getFleetDriversSummary(accessToken: String,
    driversSummaryParam: DriversSummaryParam,
    snapToDayBounds: Option[Boolean] = None
    )(implicit reader: ClientResponseReader[DriversSummaryResponse], writer: RequestWriter[DriversSummaryParam]): Future[DriversSummaryResponse] = {
    // create path and map variables
    val path = (addFmt("/fleet/drivers/summary"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getFleetDriversSummary")

    if (driversSummaryParam == null) throw new Exception("Missing required parameter 'driversSummaryParam' when calling FleetApi->getFleetDriversSummary")
    queryParams += "access_token" -> accessToken.toString
    snapToDayBounds match {
      case Some(param) => queryParams += "snap_to_day_bounds" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(driversSummaryParam))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getFleetHosAuthenticationLogs(accessToken: String,
    hosAuthenticationLogsParam: HosAuthenticationLogsParam)(implicit reader: ClientResponseReader[HosAuthenticationLogsResponse], writer: RequestWriter[HosAuthenticationLogsParam]): Future[HosAuthenticationLogsResponse] = {
    // create path and map variables
    val path = (addFmt("/fleet/hos_authentication_logs"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getFleetHosAuthenticationLogs")

    if (hosAuthenticationLogsParam == null) throw new Exception("Missing required parameter 'hosAuthenticationLogsParam' when calling FleetApi->getFleetHosAuthenticationLogs")
    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(hosAuthenticationLogsParam))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getFleetHosLogs(accessToken: String,
    hosLogsParam: HosLogsParam1)(implicit reader: ClientResponseReader[HosLogsResponse], writer: RequestWriter[HosLogsParam1]): Future[HosLogsResponse] = {
    // create path and map variables
    val path = (addFmt("/fleet/hos_logs"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getFleetHosLogs")

    if (hosLogsParam == null) throw new Exception("Missing required parameter 'hosLogsParam' when calling FleetApi->getFleetHosLogs")
    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(hosLogsParam))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getFleetHosLogsSummary(accessToken: String,
    hosLogsParam: HosLogsParam2)(implicit reader: ClientResponseReader[HosLogsSummaryResponse], writer: RequestWriter[HosLogsParam2]): Future[HosLogsSummaryResponse] = {
    // create path and map variables
    val path = (addFmt("/fleet/hos_logs_summary"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getFleetHosLogsSummary")

    if (hosLogsParam == null) throw new Exception("Missing required parameter 'hosLogsParam' when calling FleetApi->getFleetHosLogsSummary")
    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(hosLogsParam))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getFleetLocations(accessToken: String,
    groupParam: GroupParam)(implicit reader: ClientResponseReader[InlineResponse2003], writer: RequestWriter[GroupParam]): Future[InlineResponse2003] = {
    // create path and map variables
    val path = (addFmt("/fleet/locations"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getFleetLocations")

    if (groupParam == null) throw new Exception("Missing required parameter 'groupParam' when calling FleetApi->getFleetLocations")
    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(groupParam))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getFleetMaintenanceList(accessToken: String,
    groupParam: GroupParam)(implicit reader: ClientResponseReader[InlineResponse2004], writer: RequestWriter[GroupParam]): Future[InlineResponse2004] = {
    // create path and map variables
    val path = (addFmt("/fleet/maintenance/list"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getFleetMaintenanceList")

    if (groupParam == null) throw new Exception("Missing required parameter 'groupParam' when calling FleetApi->getFleetMaintenanceList")
    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(groupParam))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getFleetTrips(accessToken: String,
    tripsParam: TripsParam)(implicit reader: ClientResponseReader[TripResponse], writer: RequestWriter[TripsParam]): Future[TripResponse] = {
    // create path and map variables
    val path = (addFmt("/fleet/trips"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getFleetTrips")

    if (tripsParam == null) throw new Exception("Missing required parameter 'tripsParam' when calling FleetApi->getFleetTrips")
    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(tripsParam))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getFleetVehicle(accessToken: String,
    vehicleIdOrExternalId: String)(implicit reader: ClientResponseReader[FleetVehicleResponse]): Future[FleetVehicleResponse] = {
    // create path and map variables
    val path = (addFmt("/fleet/vehicles/{vehicle_id_or_external_id}")
      replaceAll("\\{" + "vehicle_id_or_external_id" + "\\}", vehicleIdOrExternalId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getFleetVehicle")

    if (vehicleIdOrExternalId == null) throw new Exception("Missing required parameter 'vehicleIdOrExternalId' when calling FleetApi->getFleetVehicle")

    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getOrganizationAddress(accessToken: String,
    addressId: Long)(implicit reader: ClientResponseReader[Address]): Future[Address] = {
    // create path and map variables
    val path = (addFmt("/addresses/{addressId}")
      replaceAll("\\{" + "addressId" + "\\}", addressId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getOrganizationAddress")

    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getOrganizationAddresses(accessToken: String)(implicit reader: ClientResponseReader[List[Address]]): Future[List[Address]] = {
    // create path and map variables
    val path = (addFmt("/addresses"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getOrganizationAddresses")

    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getOrganizationContact(accessToken: String,
    contactId: Long)(implicit reader: ClientResponseReader[Contact]): Future[Contact] = {
    // create path and map variables
    val path = (addFmt("/contacts/{contact_id}")
      replaceAll("\\{" + "contact_id" + "\\}", contactId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getOrganizationContact")

    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getVehicleHarshEvent(vehicleId: Long,
    accessToken: String,
    timestamp: Long)(implicit reader: ClientResponseReader[VehicleHarshEventResponse]): Future[VehicleHarshEventResponse] = {
    // create path and map variables
    val path = (addFmt("/fleet/vehicles/{vehicleId}/safety/harsh_event")
      replaceAll("\\{" + "vehicleId" + "\\}", vehicleId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getVehicleHarshEvent")

    queryParams += "access_token" -> accessToken.toString
    queryParams += "timestamp" -> timestamp.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getVehicleLocations(accessToken: String,
    vehicleId: Long,
    startMs: Long,
    endMs: Long)(implicit reader: ClientResponseReader[FleetVehicleLocations]): Future[FleetVehicleLocations] = {
    // create path and map variables
    val path = (addFmt("/fleet/vehicles/{vehicle_id}/locations")
      replaceAll("\\{" + "vehicle_id" + "\\}", vehicleId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getVehicleLocations")

    queryParams += "access_token" -> accessToken.toString
    queryParams += "startMs" -> startMs.toString
    queryParams += "endMs" -> endMs.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getVehicleSafetyScore(vehicleId: Long,
    accessToken: String,
    startMs: Long,
    endMs: Long)(implicit reader: ClientResponseReader[VehicleSafetyScoreResponse]): Future[VehicleSafetyScoreResponse] = {
    // create path and map variables
    val path = (addFmt("/fleet/vehicles/{vehicleId}/safety/score")
      replaceAll("\\{" + "vehicleId" + "\\}", vehicleId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getVehicleSafetyScore")

    queryParams += "access_token" -> accessToken.toString
    queryParams += "startMs" -> startMs.toString
    queryParams += "endMs" -> endMs.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getVehicleStats(accessToken: String,
    startMs: Integer,
    endMs: Integer,
    series: Option[String] = None,
    tagIds: Option[String] = None,
    startingAfter: Option[String] = None,
    endingBefore: Option[String] = None,
    limit: Option[Long] = None
    )(implicit reader: ClientResponseReader[InlineResponse2005]): Future[InlineResponse2005] = {
    // create path and map variables
    val path = (addFmt("/fleet/vehicles/stats"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getVehicleStats")

    queryParams += "access_token" -> accessToken.toString
    queryParams += "startMs" -> startMs.toString
    queryParams += "endMs" -> endMs.toString
    series match {
      case Some(param) => queryParams += "series" -> param.toString
      case _ => queryParams
    }
    tagIds match {
      case Some(param) => queryParams += "tagIds" -> param.toString
      case _ => queryParams
    }
    startingAfter match {
      case Some(param) => queryParams += "startingAfter" -> param.toString
      case _ => queryParams
    }
    endingBefore match {
      case Some(param) => queryParams += "endingBefore" -> param.toString
      case _ => queryParams
    }
    limit match {
      case Some(param) => queryParams += "limit" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getVehiclesLocations(accessToken: String,
    startMs: Integer,
    endMs: Integer)(implicit reader: ClientResponseReader[FleetVehiclesLocations]): Future[FleetVehiclesLocations] = {
    // create path and map variables
    val path = (addFmt("/fleet/vehicles/locations"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->getVehiclesLocations")

    queryParams += "access_token" -> accessToken.toString
    queryParams += "startMs" -> startMs.toString
    queryParams += "endMs" -> endMs.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def listContacts(accessToken: String)(implicit reader: ClientResponseReader[List[Contact]]): Future[List[Contact]] = {
    // create path and map variables
    val path = (addFmt("/contacts"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->listContacts")

    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def listFleet(accessToken: String,
    groupParam: GroupParam,
    startingAfter: Option[String] = None,
    endingBefore: Option[String] = None,
    limit: Option[Long] = None
    )(implicit reader: ClientResponseReader[InlineResponse2002], writer: RequestWriter[GroupParam]): Future[InlineResponse2002] = {
    // create path and map variables
    val path = (addFmt("/fleet/list"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->listFleet")

    if (groupParam == null) throw new Exception("Missing required parameter 'groupParam' when calling FleetApi->listFleet")
    queryParams += "access_token" -> accessToken.toString
    startingAfter match {
      case Some(param) => queryParams += "startingAfter" -> param.toString
      case _ => queryParams
    }
    endingBefore match {
      case Some(param) => queryParams += "endingBefore" -> param.toString
      case _ => queryParams
    }
    limit match {
      case Some(param) => queryParams += "limit" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(groupParam))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def patchFleetVehicle(accessToken: String,
    vehicleIdOrExternalId: String,
    data: Data)(implicit reader: ClientResponseReader[FleetVehicleResponse], writer: RequestWriter[Data]): Future[FleetVehicleResponse] = {
    // create path and map variables
    val path = (addFmt("/fleet/vehicles/{vehicle_id_or_external_id}")
      replaceAll("\\{" + "vehicle_id_or_external_id" + "\\}", vehicleIdOrExternalId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->patchFleetVehicle")

    if (vehicleIdOrExternalId == null) throw new Exception("Missing required parameter 'vehicleIdOrExternalId' when calling FleetApi->patchFleetVehicle")

    if (data == null) throw new Exception("Missing required parameter 'data' when calling FleetApi->patchFleetVehicle")
    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(data))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def reactivateDriverById(accessToken: String,
    driverIdOrExternalId: String,
    reactivateDriverParam: ReactivateDriverParam)(implicit reader: ClientResponseReader[CurrentDriver], writer: RequestWriter[ReactivateDriverParam]): Future[CurrentDriver] = {
    // create path and map variables
    val path = (addFmt("/fleet/drivers/inactive/{driver_id_or_external_id}")
      replaceAll("\\{" + "driver_id_or_external_id" + "\\}", driverIdOrExternalId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->reactivateDriverById")

    if (driverIdOrExternalId == null) throw new Exception("Missing required parameter 'driverIdOrExternalId' when calling FleetApi->reactivateDriverById")

    if (reactivateDriverParam == null) throw new Exception("Missing required parameter 'reactivateDriverParam' when calling FleetApi->reactivateDriverById")
    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(reactivateDriverParam))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateDispatchRouteById(accessToken: String,
    routeId: Long,
    updateDispatchRouteParams: DispatchRoute)(implicit reader: ClientResponseReader[DispatchRoute], writer: RequestWriter[DispatchRoute]): Future[DispatchRoute] = {
    // create path and map variables
    val path = (addFmt("/fleet/dispatch/routes/{route_id}")
      replaceAll("\\{" + "route_id" + "\\}", routeId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->updateDispatchRouteById")

    if (updateDispatchRouteParams == null) throw new Exception("Missing required parameter 'updateDispatchRouteParams' when calling FleetApi->updateDispatchRouteById")
    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(updateDispatchRouteParams))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateOrganizationAddress(accessToken: String,
    address: Address,
    addressId: Long)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Address]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/addresses/{addressId}")
      replaceAll("\\{" + "addressId" + "\\}", addressId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->updateOrganizationAddress")

    if (address == null) throw new Exception("Missing required parameter 'address' when calling FleetApi->updateOrganizationAddress")
    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(address))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateVehicles(accessToken: String,
    vehicleUpdateParam: VehicleUpdateParam)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[VehicleUpdateParam]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/fleet/set_data"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling FleetApi->updateVehicles")

    if (vehicleUpdateParam == null) throw new Exception("Missing required parameter 'vehicleUpdateParam' when calling FleetApi->updateVehicles")
    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(vehicleUpdateParam))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
