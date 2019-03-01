/**
 * Samsara API
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */


package org.openapitools.server.api

import org.openapitools.server.model.Address
import org.openapitools.server.model.AllRouteJobUpdates
import org.openapitools.server.model.AssetReeferResponse
import org.openapitools.server.model.Contact
import org.openapitools.server.model.DispatchRoute
import org.openapitools.server.model.DispatchRouteCreate
import org.openapitools.server.model.DispatchRouteHistory
import org.openapitools.server.model.Document
import org.openapitools.server.model.DocumentCreate
import org.openapitools.server.model.DocumentType
import org.openapitools.server.model.Driver
import org.openapitools.server.model.DriverDailyLogResponse
import org.openapitools.server.model.DriverForCreate
import org.openapitools.server.model.DriverSafetyScoreResponse
import org.openapitools.server.model.DriversResponse
import org.openapitools.server.model.DriversSummaryResponse
import org.openapitools.server.model.DvirBase
import org.openapitools.server.model.DvirListResponse
import org.openapitools.server.model.FleetVehicleLocation
import org.openapitools.server.model.FleetVehicleResponse
import org.openapitools.server.model.HosAuthenticationLogsResponse
import org.openapitools.server.model.HosLogsResponse
import org.openapitools.server.model.HosLogsSummaryResponse
import org.openapitools.server.model.InlineObject
import org.openapitools.server.model.InlineObject1
import org.openapitools.server.model.InlineObject10
import org.openapitools.server.model.InlineObject11
import org.openapitools.server.model.InlineObject12
import org.openapitools.server.model.InlineObject13
import org.openapitools.server.model.InlineObject14
import org.openapitools.server.model.InlineObject15
import org.openapitools.server.model.InlineObject16
import org.openapitools.server.model.InlineObject2
import org.openapitools.server.model.InlineObject3
import org.openapitools.server.model.InlineObject4
import org.openapitools.server.model.InlineObject5
import org.openapitools.server.model.InlineObject6
import org.openapitools.server.model.InlineObject7
import org.openapitools.server.model.InlineObject8
import org.openapitools.server.model.InlineObject9
import org.openapitools.server.model.InlineResponse200
import org.openapitools.server.model.InlineResponse2001
import org.openapitools.server.model.InlineResponse2002
import org.openapitools.server.model.InlineResponse2003
import org.openapitools.server.model.InlineResponse2004
import org.openapitools.server.model.InlineResponse2005
import org.openapitools.server.model.TripResponse
import org.openapitools.server.model.VehicleHarshEventResponse
import org.openapitools.server.model.VehicleSafetyScoreResponse

import java.io.File

import org.scalatra.ScalatraServlet
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{ FileUploadSupport, MultipartConfig, SizeConstraintExceededException }

import scala.collection.JavaConverters._

class FleetApi(implicit val swagger: Swagger) extends ScalatraServlet
  with FileUploadSupport
  with JacksonJsonSupport
  with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "FleetApi"

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val addFleetAddressOperation = (apiOperation[Unit]("addFleetAddress")
    summary "/fleet/add_address"
    parameters(queryParam[String]("accessToken").description(""), bodyParam[InlineObject2]("addressParam").description(""))
  )

  post("/fleet/add_address", operation(addFleetAddressOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    //println("addressParam: " + addressParam)
  }

  

  val addOrganizationAddressesOperation = (apiOperation[List[Address]]("addOrganizationAddresses")
    summary "/addresses"
    parameters(queryParam[String]("accessToken").description(""), bodyParam[InlineObject]("addresses").description(""))
  )

  post("/addresses", operation(addOrganizationAddressesOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    //println("addresses: " + addresses)
  }

  

  val createDispatchRouteOperation = (apiOperation[DispatchRoute]("createDispatchRoute")
    summary "/fleet/dispatch/routes"
    parameters(queryParam[String]("accessToken").description(""), bodyParam[DispatchRouteCreate]("createDispatchRouteParams").description(""))
  )

  post("/fleet/dispatch/routes", operation(createDispatchRouteOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    //println("createDispatchRouteParams: " + createDispatchRouteParams)
  }

  

  val createDriverOperation = (apiOperation[Driver]("createDriver")
    summary "/fleet/drivers/create"
    parameters(queryParam[String]("accessToken").description(""), bodyParam[DriverForCreate]("createDriverParam").description(""))
  )

  post("/fleet/drivers/create", operation(createDriverOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    //println("createDriverParam: " + createDriverParam)
  }

  

  val createDriverDispatchRouteOperation = (apiOperation[DispatchRoute]("createDriverDispatchRoute")
    summary "/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes"
    parameters(queryParam[String]("accessToken").description(""), pathParam[Long]("driverId").description(""), bodyParam[DispatchRouteCreate]("createDispatchRouteParams").description(""))
  )

  post("/fleet/drivers/:driver_id/dispatch/routes", operation(createDriverDispatchRouteOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    val driverId = params.getOrElse("driverId", halt(400))
    //println("driverId: " + driverId)
    //println("createDispatchRouteParams: " + createDispatchRouteParams)
  }

  

  val createDriverDocumentOperation = (apiOperation[Document]("createDriverDocument")
    summary "/fleet/drivers/{driver_id:[0-9]+}/documents"
    parameters(queryParam[String]("accessToken").description(""), pathParam[Long]("driverId").description(""), bodyParam[DocumentCreate]("createDocumentParams").description(""))
  )

  post("/fleet/drivers/:driver_id/documents", operation(createDriverDocumentOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    val driverId = params.getOrElse("driverId", halt(400))
    //println("driverId: " + driverId)
    //println("createDocumentParams: " + createDocumentParams)
  }

  

  val createDvirOperation = (apiOperation[DvirBase]("createDvir")
    summary "/fleet/maintenance/dvirs"
    parameters(queryParam[String]("accessToken").description(""), bodyParam[InlineObject12]("createDvirParam").description(""))
  )

  post("/fleet/maintenance/dvirs", operation(createDvirOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    //println("createDvirParam: " + createDvirParam)
  }

  

  val createVehicleDispatchRouteOperation = (apiOperation[DispatchRoute]("createVehicleDispatchRoute")
    summary "/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes"
    parameters(queryParam[String]("accessToken").description(""), pathParam[Long]("vehicleId").description(""), bodyParam[DispatchRouteCreate]("createDispatchRouteParams").description(""))
  )

  post("/fleet/vehicles/:vehicle_id/dispatch/routes", operation(createVehicleDispatchRouteOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    val vehicleId = params.getOrElse("vehicleId", halt(400))
    //println("vehicleId: " + vehicleId)
    //println("createDispatchRouteParams: " + createDispatchRouteParams)
  }

  

  val deactivateDriverOperation = (apiOperation[Unit]("deactivateDriver")
    summary "/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}"
    parameters(queryParam[String]("accessToken").description(""), pathParam[String]("driverIdOrExternalId").description(""))
  )

  delete("/fleet/drivers/:driver_id_or_external_id", operation(deactivateDriverOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    val driverIdOrExternalId = params.getOrElse("driverIdOrExternalId", halt(400))
    //println("driverIdOrExternalId: " + driverIdOrExternalId)
  }

  

  val deleteDispatchRouteByIdOperation = (apiOperation[Unit]("deleteDispatchRouteById")
    summary "/fleet/dispatch/routes/{route_id:[0-9]+}/"
    parameters(queryParam[String]("accessToken").description(""), pathParam[Long]("routeId").description(""))
  )

  delete("/fleet/dispatch/routes/:route_id", operation(deleteDispatchRouteByIdOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    val routeId = params.getOrElse("routeId", halt(400))
    //println("routeId: " + routeId)
  }

  

  val deleteOrganizationAddressOperation = (apiOperation[Unit]("deleteOrganizationAddress")
    summary "/addresses/{addressId}"
    parameters(queryParam[String]("accessToken").description(""), pathParam[Long]("addressId").description(""))
  )

  delete("/addresses/:addressId", operation(deleteOrganizationAddressOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    val addressId = params.getOrElse("addressId", halt(400))
    //println("addressId: " + addressId)
  }

  

  val fetchAllDispatchRoutesOperation = (apiOperation[List[DispatchRoute]]("fetchAllDispatchRoutes")
    summary "/fleet/dispatch/routes"
    parameters(queryParam[String]("accessToken").description(""), queryParam[Long]("groupId").description("").optional, queryParam[Long]("endTime").description("").optional, queryParam[Long]("duration").description("").optional)
  )

  get("/fleet/dispatch/routes", operation(fetchAllDispatchRoutesOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
            val groupId = params.getAs[Long]("groupId")

    //println("groupId: " + groupId)
            val endTime = params.getAs[Long]("endTime")

    //println("endTime: " + endTime)
            val duration = params.getAs[Long]("duration")

    //println("duration: " + duration)
  }

  

  val fetchAllRouteJobUpdatesOperation = (apiOperation[AllRouteJobUpdates]("fetchAllRouteJobUpdates")
    summary "/fleet/dispatch/routes/job_updates"
    parameters(queryParam[String]("accessToken").description(""), queryParam[Long]("groupId").description("").optional, queryParam[String]("sequenceId").description("").optional, queryParam[String]("include").description("").optional)
  )

  get("/fleet/dispatch/routes/job_updates", operation(fetchAllRouteJobUpdatesOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
            val groupId = params.getAs[Long]("groupId")

    //println("groupId: " + groupId)
            val sequenceId = params.getAs[String]("sequenceId")

    //println("sequenceId: " + sequenceId)
            val include = params.getAs[String]("include")

    //println("include: " + include)
  }

  

  val getAllAssetCurrentLocationsOperation = (apiOperation[InlineResponse2001]("getAllAssetCurrentLocations")
    summary "/fleet/assets/locations"
    parameters(queryParam[String]("accessToken").description(""), queryParam[Long]("groupId").description("").optional)
  )

  get("/fleet/assets/locations", operation(getAllAssetCurrentLocationsOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
            val groupId = params.getAs[Long]("groupId")

    //println("groupId: " + groupId)
  }

  

  val getAllAssetsOperation = (apiOperation[InlineResponse200]("getAllAssets")
    summary "/fleet/assets"
    parameters(queryParam[String]("accessToken").description(""), queryParam[Long]("groupId").description("").optional)
  )

  get("/fleet/assets", operation(getAllAssetsOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
            val groupId = params.getAs[Long]("groupId")

    //println("groupId: " + groupId)
  }

  

  val getAllDeactivatedDriversOperation = (apiOperation[List[Driver]]("getAllDeactivatedDrivers")
    summary "/fleet/drivers/inactive"
    parameters(queryParam[String]("accessToken").description(""), queryParam[Long]("groupId").description("").optional)
  )

  get("/fleet/drivers/inactive", operation(getAllDeactivatedDriversOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
            val groupId = params.getAs[Long]("groupId")

    //println("groupId: " + groupId)
  }

  

  val getAssetLocationOperation = (apiOperation[List[Object]]("getAssetLocation")
    summary "/fleet/assets/{assetId:[0-9]+}/locations"
    parameters(queryParam[String]("accessToken").description(""), pathParam[Long]("assetId").description(""), queryParam[Long]("startMs").description(""), queryParam[Long]("endMs").description(""))
  )

  get("/fleet/assets/:asset_id/locations", operation(getAssetLocationOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    val assetId = params.getOrElse("assetId", halt(400))
    //println("assetId: " + assetId)
            val startMs = params.getAs[Long]("startMs")

    //println("startMs: " + startMs)
            val endMs = params.getAs[Long]("endMs")

    //println("endMs: " + endMs)
  }

  

  val getAssetReeferOperation = (apiOperation[AssetReeferResponse]("getAssetReefer")
    summary "/fleet/assets/{assetId:[0-9]+}/reefer"
    parameters(queryParam[String]("accessToken").description(""), pathParam[Long]("assetId").description(""), queryParam[Long]("startMs").description(""), queryParam[Long]("endMs").description(""))
  )

  get("/fleet/assets/:asset_id/reefer", operation(getAssetReeferOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    val assetId = params.getOrElse("assetId", halt(400))
    //println("assetId: " + assetId)
            val startMs = params.getAs[Long]("startMs")

    //println("startMs: " + startMs)
            val endMs = params.getAs[Long]("endMs")

    //println("endMs: " + endMs)
  }

  

  val getDeactivatedDriverByIdOperation = (apiOperation[Driver]("getDeactivatedDriverById")
    summary "/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}"
    parameters(queryParam[String]("accessToken").description(""), pathParam[String]("driverIdOrExternalId").description(""))
  )

  get("/fleet/drivers/inactive/:driver_id_or_external_id", operation(getDeactivatedDriverByIdOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    val driverIdOrExternalId = params.getOrElse("driverIdOrExternalId", halt(400))
    //println("driverIdOrExternalId: " + driverIdOrExternalId)
  }

  

  val getDispatchRouteByIdOperation = (apiOperation[DispatchRoute]("getDispatchRouteById")
    summary "/fleet/dispatch/routes/{route_id:[0-9]+}"
    parameters(queryParam[String]("accessToken").description(""), pathParam[Long]("routeId").description(""))
  )

  get("/fleet/dispatch/routes/:route_id", operation(getDispatchRouteByIdOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    val routeId = params.getOrElse("routeId", halt(400))
    //println("routeId: " + routeId)
  }

  

  val getDispatchRouteHistoryOperation = (apiOperation[DispatchRouteHistory]("getDispatchRouteHistory")
    summary "/fleet/dispatch/routes/{route_id:[0-9]+}/history"
    parameters(queryParam[String]("accessToken").description(""), pathParam[Long]("routeId").description(""), queryParam[Long]("startTime").description("").optional, queryParam[Long]("endTime").description("").optional)
  )

  get("/fleet/dispatch/routes/:route_id/history", operation(getDispatchRouteHistoryOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    val routeId = params.getOrElse("routeId", halt(400))
    //println("routeId: " + routeId)
            val startTime = params.getAs[Long]("startTime")

    //println("startTime: " + startTime)
            val endTime = params.getAs[Long]("endTime")

    //println("endTime: " + endTime)
  }

  

  val getDispatchRoutesByDriverIdOperation = (apiOperation[List[DispatchRoute]]("getDispatchRoutesByDriverId")
    summary "/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes"
    parameters(queryParam[String]("accessToken").description(""), pathParam[Long]("driverId").description(""), queryParam[Long]("endTime").description("").optional, queryParam[Long]("duration").description("").optional)
  )

  get("/fleet/drivers/:driver_id/dispatch/routes", operation(getDispatchRoutesByDriverIdOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    val driverId = params.getOrElse("driverId", halt(400))
    //println("driverId: " + driverId)
            val endTime = params.getAs[Long]("endTime")

    //println("endTime: " + endTime)
            val duration = params.getAs[Long]("duration")

    //println("duration: " + duration)
  }

  

  val getDispatchRoutesByVehicleIdOperation = (apiOperation[List[DispatchRoute]]("getDispatchRoutesByVehicleId")
    summary "/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes"
    parameters(queryParam[String]("accessToken").description(""), pathParam[Long]("vehicleId").description(""), queryParam[Long]("endTime").description("").optional, queryParam[Long]("duration").description("").optional)
  )

  get("/fleet/vehicles/:vehicle_id/dispatch/routes", operation(getDispatchRoutesByVehicleIdOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    val vehicleId = params.getOrElse("vehicleId", halt(400))
    //println("vehicleId: " + vehicleId)
            val endTime = params.getAs[Long]("endTime")

    //println("endTime: " + endTime)
            val duration = params.getAs[Long]("duration")

    //println("duration: " + duration)
  }

  

  val getDriverByIdOperation = (apiOperation[Driver]("getDriverById")
    summary "/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}"
    parameters(queryParam[String]("accessToken").description(""), pathParam[String]("driverIdOrExternalId").description(""))
  )

  get("/fleet/drivers/:driver_id_or_external_id", operation(getDriverByIdOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    val driverIdOrExternalId = params.getOrElse("driverIdOrExternalId", halt(400))
    //println("driverIdOrExternalId: " + driverIdOrExternalId)
  }

  

  val getDriverDocumentTypesByOrgIdOperation = (apiOperation[List[DocumentType]]("getDriverDocumentTypesByOrgId")
    summary "/fleet/drivers/document_types"
    parameters()
  )

  get("/fleet/drivers/document_types", operation(getDriverDocumentTypesByOrgIdOperation)) {
  }

  

  val getDriverDocumentsByOrgIdOperation = (apiOperation[List[Document]]("getDriverDocumentsByOrgId")
    summary "/fleet/drivers/documents"
    parameters(queryParam[String]("accessToken").description(""), queryParam[Long]("endMs").description("").optional, queryParam[Long]("durationMs").description("").optional)
  )

  get("/fleet/drivers/documents", operation(getDriverDocumentsByOrgIdOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
            val endMs = params.getAs[Long]("endMs")

    //println("endMs: " + endMs)
            val durationMs = params.getAs[Long]("durationMs")

    //println("durationMs: " + durationMs)
  }

  

  val getDriverSafetyScoreOperation = (apiOperation[DriverSafetyScoreResponse]("getDriverSafetyScore")
    summary "/fleet/drivers/{driverId:[0-9]+}/safety/score"
    parameters(pathParam[Long]("driverId").description(""), queryParam[String]("accessToken").description(""), queryParam[Long]("startMs").description(""), queryParam[Long]("endMs").description(""))
  )

  get("/fleet/drivers/:driverId/safety/score", operation(getDriverSafetyScoreOperation)) {
    val driverId = params.getOrElse("driverId", halt(400))
    //println("driverId: " + driverId)
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
            val startMs = params.getAs[Long]("startMs")

    //println("startMs: " + startMs)
            val endMs = params.getAs[Long]("endMs")

    //println("endMs: " + endMs)
  }

  

  val getDvirsOperation = (apiOperation[DvirListResponse]("getDvirs")
    summary "/fleet/maintenance/dvirs"
    parameters(queryParam[String]("accessToken").description(""), queryParam[Int]("endMs").description(""), queryParam[Int]("durationMs").description(""), queryParam[Int]("groupId").description("").optional)
  )

  get("/fleet/maintenance/dvirs", operation(getDvirsOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
            val endMs = params.getAs[Int]("endMs")

    //println("endMs: " + endMs)
            val durationMs = params.getAs[Int]("durationMs")

    //println("durationMs: " + durationMs)
            val groupId = params.getAs[Int]("groupId")

    //println("groupId: " + groupId)
  }

  

  val getFleetDriversOperation = (apiOperation[DriversResponse]("getFleetDrivers")
    summary "/fleet/drivers"
    parameters(queryParam[String]("accessToken").description(""), bodyParam[InlineObject3]("groupDriversParam").description(""))
  )

  post("/fleet/drivers", operation(getFleetDriversOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    //println("groupDriversParam: " + groupDriversParam)
  }

  

  val getFleetDriversHosDailyLogsOperation = (apiOperation[DriverDailyLogResponse]("getFleetDriversHosDailyLogs")
    summary "/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs"
    parameters(queryParam[String]("accessToken").description(""), pathParam[Long]("driverId").description(""), bodyParam[InlineObject6]("hosLogsParam").description(""))
  )

  post("/fleet/drivers/:driver_id/hos_daily_logs", operation(getFleetDriversHosDailyLogsOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    val driverId = params.getOrElse("driverId", halt(400))
    //println("driverId: " + driverId)
    //println("hosLogsParam: " + hosLogsParam)
  }

  

  val getFleetDriversSummaryOperation = (apiOperation[DriversSummaryResponse]("getFleetDriversSummary")
    summary "/fleet/drivers/summary"
    parameters(queryParam[String]("accessToken").description(""), bodyParam[InlineObject5]("driversSummaryParam").description(""), queryParam[Boolean]("snapToDayBounds").description("").optional)
  )

  post("/fleet/drivers/summary", operation(getFleetDriversSummaryOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    //println("driversSummaryParam: " + driversSummaryParam)
            val snapToDayBounds = params.getAs[Boolean]("snapToDayBounds")

    //println("snapToDayBounds: " + snapToDayBounds)
  }

  

  val getFleetHosAuthenticationLogsOperation = (apiOperation[HosAuthenticationLogsResponse]("getFleetHosAuthenticationLogs")
    summary "/fleet/hos_authentication_logs"
    parameters(queryParam[String]("accessToken").description(""), bodyParam[InlineObject7]("hosAuthenticationLogsParam").description(""))
  )

  post("/fleet/hos_authentication_logs", operation(getFleetHosAuthenticationLogsOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    //println("hosAuthenticationLogsParam: " + hosAuthenticationLogsParam)
  }

  

  val getFleetHosLogsOperation = (apiOperation[HosLogsResponse]("getFleetHosLogs")
    summary "/fleet/hos_logs"
    parameters(queryParam[String]("accessToken").description(""), bodyParam[InlineObject8]("hosLogsParam").description(""))
  )

  post("/fleet/hos_logs", operation(getFleetHosLogsOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    //println("hosLogsParam: " + hosLogsParam)
  }

  

  val getFleetHosLogsSummaryOperation = (apiOperation[HosLogsSummaryResponse]("getFleetHosLogsSummary")
    summary "/fleet/hos_logs_summary"
    parameters(queryParam[String]("accessToken").description(""), bodyParam[InlineObject9]("hosLogsParam").description(""))
  )

  post("/fleet/hos_logs_summary", operation(getFleetHosLogsSummaryOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    //println("hosLogsParam: " + hosLogsParam)
  }

  

  val getFleetLocationsOperation = (apiOperation[InlineResponse2003]("getFleetLocations")
    summary "/fleet/locations"
    parameters(queryParam[String]("accessToken").description(""), bodyParam[InlineObject11]("groupParam").description(""))
  )

  post("/fleet/locations", operation(getFleetLocationsOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    //println("groupParam: " + groupParam)
  }

  

  val getFleetMaintenanceListOperation = (apiOperation[InlineResponse2004]("getFleetMaintenanceList")
    summary "/fleet/maintenance/list"
    parameters(queryParam[String]("accessToken").description(""), bodyParam[InlineObject13]("groupParam").description(""))
  )

  post("/fleet/maintenance/list", operation(getFleetMaintenanceListOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    //println("groupParam: " + groupParam)
  }

  

  val getFleetTripsOperation = (apiOperation[TripResponse]("getFleetTrips")
    summary "/fleet/trips"
    parameters(queryParam[String]("accessToken").description(""), bodyParam[InlineObject15]("tripsParam").description(""))
  )

  post("/fleet/trips", operation(getFleetTripsOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    //println("tripsParam: " + tripsParam)
  }

  

  val getFleetVehicleOperation = (apiOperation[FleetVehicleResponse]("getFleetVehicle")
    summary "/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}"
    parameters(queryParam[String]("accessToken").description(""), pathParam[String]("vehicleIdOrExternalId").description(""))
  )

  get("/fleet/vehicles/:vehicle_id_or_external_id", operation(getFleetVehicleOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    val vehicleIdOrExternalId = params.getOrElse("vehicleIdOrExternalId", halt(400))
    //println("vehicleIdOrExternalId: " + vehicleIdOrExternalId)
  }

  

  val getOrganizationAddressOperation = (apiOperation[Address]("getOrganizationAddress")
    summary "/addresses/{addressId}"
    parameters(queryParam[String]("accessToken").description(""), pathParam[Long]("addressId").description(""))
  )

  get("/addresses/:addressId", operation(getOrganizationAddressOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    val addressId = params.getOrElse("addressId", halt(400))
    //println("addressId: " + addressId)
  }

  

  val getOrganizationAddressesOperation = (apiOperation[List[Address]]("getOrganizationAddresses")
    summary "/addresses"
    parameters(queryParam[String]("accessToken").description(""))
  )

  get("/addresses", operation(getOrganizationAddressesOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
  }

  

  val getOrganizationContactOperation = (apiOperation[Contact]("getOrganizationContact")
    summary "/contacts/{contact_id}"
    parameters(queryParam[String]("accessToken").description(""), pathParam[Long]("contactId").description(""))
  )

  get("/contacts/:contact_id", operation(getOrganizationContactOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    val contactId = params.getOrElse("contactId", halt(400))
    //println("contactId: " + contactId)
  }

  

  val getVehicleHarshEventOperation = (apiOperation[VehicleHarshEventResponse]("getVehicleHarshEvent")
    summary "/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event"
    parameters(pathParam[Long]("vehicleId").description(""), queryParam[String]("accessToken").description(""), queryParam[Long]("timestamp").description(""))
  )

  get("/fleet/vehicles/:vehicleId/safety/harsh_event", operation(getVehicleHarshEventOperation)) {
    val vehicleId = params.getOrElse("vehicleId", halt(400))
    //println("vehicleId: " + vehicleId)
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
            val timestamp = params.getAs[Long]("timestamp")

    //println("timestamp: " + timestamp)
  }

  

  val getVehicleLocationsOperation = (apiOperation[List[FleetVehicleLocation]]("getVehicleLocations")
    summary "/fleet/vehicles/{vehicle_id:[0-9]+}/locations"
    parameters(queryParam[String]("accessToken").description(""), pathParam[Long]("vehicleId").description(""), queryParam[Long]("startMs").description(""), queryParam[Long]("endMs").description(""))
  )

  get("/fleet/vehicles/:vehicle_id/locations", operation(getVehicleLocationsOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    val vehicleId = params.getOrElse("vehicleId", halt(400))
    //println("vehicleId: " + vehicleId)
            val startMs = params.getAs[Long]("startMs")

    //println("startMs: " + startMs)
            val endMs = params.getAs[Long]("endMs")

    //println("endMs: " + endMs)
  }

  

  val getVehicleSafetyScoreOperation = (apiOperation[VehicleSafetyScoreResponse]("getVehicleSafetyScore")
    summary "/fleet/vehicles/{vehicleId:[0-9]+}/safety/score"
    parameters(pathParam[Long]("vehicleId").description(""), queryParam[String]("accessToken").description(""), queryParam[Long]("startMs").description(""), queryParam[Long]("endMs").description(""))
  )

  get("/fleet/vehicles/:vehicleId/safety/score", operation(getVehicleSafetyScoreOperation)) {
    val vehicleId = params.getOrElse("vehicleId", halt(400))
    //println("vehicleId: " + vehicleId)
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
            val startMs = params.getAs[Long]("startMs")

    //println("startMs: " + startMs)
            val endMs = params.getAs[Long]("endMs")

    //println("endMs: " + endMs)
  }

  

  val getVehicleStatsOperation = (apiOperation[InlineResponse2005]("getVehicleStats")
    summary "/fleet/vehicles/stats"
    parameters(queryParam[String]("accessToken").description(""), queryParam[Int]("startMs").description(""), queryParam[Int]("endMs").description(""), queryParam[String]("series").description("").optional, queryParam[String]("tagIds").description("").optional, queryParam[String]("startingAfter").description("").optional, queryParam[String]("endingBefore").description("").optional, queryParam[Long]("limit").description("").optional)
  )

  get("/fleet/vehicles/stats", operation(getVehicleStatsOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
            val startMs = params.getAs[Int]("startMs")

    //println("startMs: " + startMs)
            val endMs = params.getAs[Int]("endMs")

    //println("endMs: " + endMs)
            val series = params.getAs[String]("series")

    //println("series: " + series)
            val tagIds = params.getAs[String]("tagIds")

    //println("tagIds: " + tagIds)
            val startingAfter = params.getAs[String]("startingAfter")

    //println("startingAfter: " + startingAfter)
            val endingBefore = params.getAs[String]("endingBefore")

    //println("endingBefore: " + endingBefore)
            val limit = params.getAs[Long]("limit")

    //println("limit: " + limit)
  }

  

  val getVehiclesLocationsOperation = (apiOperation[List[Object]]("getVehiclesLocations")
    summary "/fleet/vehicles/locations"
    parameters(queryParam[String]("accessToken").description(""), queryParam[Int]("startMs").description(""), queryParam[Int]("endMs").description(""))
  )

  get("/fleet/vehicles/locations", operation(getVehiclesLocationsOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
            val startMs = params.getAs[Int]("startMs")

    //println("startMs: " + startMs)
            val endMs = params.getAs[Int]("endMs")

    //println("endMs: " + endMs)
  }

  

  val listContactsOperation = (apiOperation[List[Contact]]("listContacts")
    summary "/contacts"
    parameters(queryParam[String]("accessToken").description(""))
  )

  get("/contacts", operation(listContactsOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
  }

  

  val listFleetOperation = (apiOperation[InlineResponse2002]("listFleet")
    summary "/fleet/list"
    parameters(queryParam[String]("accessToken").description(""), bodyParam[InlineObject10]("groupParam").description(""), queryParam[String]("startingAfter").description("").optional, queryParam[String]("endingBefore").description("").optional, queryParam[Long]("limit").description("").optional)
  )

  post("/fleet/list", operation(listFleetOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    //println("groupParam: " + groupParam)
            val startingAfter = params.getAs[String]("startingAfter")

    //println("startingAfter: " + startingAfter)
            val endingBefore = params.getAs[String]("endingBefore")

    //println("endingBefore: " + endingBefore)
            val limit = params.getAs[Long]("limit")

    //println("limit: " + limit)
  }

  

  val patchFleetVehicleOperation = (apiOperation[FleetVehicleResponse]("patchFleetVehicle")
    summary "/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}"
    parameters(queryParam[String]("accessToken").description(""), pathParam[String]("vehicleIdOrExternalId").description(""), bodyParam[InlineObject16]("data").description(""))
  )

  patch("/fleet/vehicles/:vehicle_id_or_external_id", operation(patchFleetVehicleOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    val vehicleIdOrExternalId = params.getOrElse("vehicleIdOrExternalId", halt(400))
    //println("vehicleIdOrExternalId: " + vehicleIdOrExternalId)
    //println("data: " + data)
  }

  

  val reactivateDriverByIdOperation = (apiOperation[Driver]("reactivateDriverById")
    summary "/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}"
    parameters(queryParam[String]("accessToken").description(""), pathParam[String]("driverIdOrExternalId").description(""), bodyParam[InlineObject4]("reactivateDriverParam").description(""))
  )

  put("/fleet/drivers/inactive/:driver_id_or_external_id", operation(reactivateDriverByIdOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    val driverIdOrExternalId = params.getOrElse("driverIdOrExternalId", halt(400))
    //println("driverIdOrExternalId: " + driverIdOrExternalId)
    //println("reactivateDriverParam: " + reactivateDriverParam)
  }

  

  val updateDispatchRouteByIdOperation = (apiOperation[DispatchRoute]("updateDispatchRouteById")
    summary "/fleet/dispatch/routes/{route_id:[0-9]+}/"
    parameters(queryParam[String]("accessToken").description(""), pathParam[Long]("routeId").description(""), bodyParam[DispatchRoute]("updateDispatchRouteParams").description(""))
  )

  put("/fleet/dispatch/routes/:route_id", operation(updateDispatchRouteByIdOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    val routeId = params.getOrElse("routeId", halt(400))
    //println("routeId: " + routeId)
    //println("updateDispatchRouteParams: " + updateDispatchRouteParams)
  }

  

  val updateOrganizationAddressOperation = (apiOperation[Unit]("updateOrganizationAddress")
    summary "/addresses/{addressId}"
    parameters(queryParam[String]("accessToken").description(""), pathParam[Long]("addressId").description(""), bodyParam[InlineObject1]("address").description(""))
  )

  patch("/addresses/:addressId", operation(updateOrganizationAddressOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    val addressId = params.getOrElse("addressId", halt(400))
    //println("addressId: " + addressId)
    //println("address: " + address)
  }

  

  val updateVehiclesOperation = (apiOperation[Unit]("updateVehicles")
    summary "/fleet/set_data"
    parameters(queryParam[String]("accessToken").description(""), bodyParam[InlineObject14]("vehicleUpdateParam").description(""))
  )

  post("/fleet/set_data", operation(updateVehiclesOperation)) {
            val accessToken = params.getAs[String]("accessToken")

    //println("accessToken: " + accessToken)
    //println("vehicleUpdateParam: " + vehicleUpdateParam)
  }

}
