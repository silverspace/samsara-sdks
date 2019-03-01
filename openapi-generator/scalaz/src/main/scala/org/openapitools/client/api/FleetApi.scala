package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import java.io.File
import java.net.URLEncoder
import java.util.UUID

import org.http4s._
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.http4s.client._
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.headers._

import org.joda.time.DateTime

import scalaz.concurrent.Task

import HelperCodecs._

object FleetApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def addFleetAddress(host: String, accessToken: String, addressParam: InlineObject2)(implicit accessTokenQuery: QueryParam[String]): Task[Unit] = {
    val path = "/fleet/add_address"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(addressParam)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def addOrganizationAddresses(host: String, accessToken: String, addresses: InlineObject)(implicit accessTokenQuery: QueryParam[String]): Task[List[Address]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Address]] = jsonOf[List[Address]]

    val path = "/addresses"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(addresses)
      resp          <- client.expect[List[Address]](req)

    } yield resp
  }
  
  def createDispatchRoute(host: String, accessToken: String, createDispatchRouteParams: DispatchRouteCreate)(implicit accessTokenQuery: QueryParam[String]): Task[DispatchRoute] = {
    implicit val returnTypeDecoder: EntityDecoder[DispatchRoute] = jsonOf[DispatchRoute]

    val path = "/fleet/dispatch/routes"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createDispatchRouteParams)
      resp          <- client.expect[DispatchRoute](req)

    } yield resp
  }
  
  def createDriver(host: String, accessToken: String, createDriverParam: DriverForCreate)(implicit accessTokenQuery: QueryParam[String]): Task[Driver] = {
    implicit val returnTypeDecoder: EntityDecoder[Driver] = jsonOf[Driver]

    val path = "/fleet/drivers/create"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createDriverParam)
      resp          <- client.expect[Driver](req)

    } yield resp
  }
  
  def createDriverDispatchRoute(host: String, accessToken: String, driverId: Long, createDispatchRouteParams: DispatchRouteCreate)(implicit accessTokenQuery: QueryParam[String]): Task[DispatchRoute] = {
    implicit val returnTypeDecoder: EntityDecoder[DispatchRoute] = jsonOf[DispatchRoute]

    val path = "/fleet/drivers/{driver_id}/dispatch/routes".replaceAll("\\{" + "driver_id" + "\\}",escape(driverId.toString))
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createDispatchRouteParams)
      resp          <- client.expect[DispatchRoute](req)

    } yield resp
  }
  
  def createDriverDocument(host: String, accessToken: String, driverId: Long, createDocumentParams: DocumentCreate)(implicit accessTokenQuery: QueryParam[String]): Task[Document] = {
    implicit val returnTypeDecoder: EntityDecoder[Document] = jsonOf[Document]

    val path = "/fleet/drivers/{driver_id}/documents".replaceAll("\\{" + "driver_id" + "\\}",escape(driverId.toString))
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createDocumentParams)
      resp          <- client.expect[Document](req)

    } yield resp
  }
  
  def createDvir(host: String, accessToken: String, createDvirParam: InlineObject12)(implicit accessTokenQuery: QueryParam[String]): Task[DvirBase] = {
    implicit val returnTypeDecoder: EntityDecoder[DvirBase] = jsonOf[DvirBase]

    val path = "/fleet/maintenance/dvirs"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createDvirParam)
      resp          <- client.expect[DvirBase](req)

    } yield resp
  }
  
  def createVehicleDispatchRoute(host: String, accessToken: String, vehicleId: Long, createDispatchRouteParams: DispatchRouteCreate)(implicit accessTokenQuery: QueryParam[String]): Task[DispatchRoute] = {
    implicit val returnTypeDecoder: EntityDecoder[DispatchRoute] = jsonOf[DispatchRoute]

    val path = "/fleet/vehicles/{vehicle_id}/dispatch/routes".replaceAll("\\{" + "vehicle_id" + "\\}",escape(vehicleId.toString))
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createDispatchRouteParams)
      resp          <- client.expect[DispatchRoute](req)

    } yield resp
  }
  
  def deactivateDriver(host: String, accessToken: String, driverIdOrExternalId: String)(implicit accessTokenQuery: QueryParam[String]): Task[Unit] = {
    val path = "/fleet/drivers/{driver_id_or_external_id}".replaceAll("\\{" + "driver_id_or_external_id" + "\\}",escape(driverIdOrExternalId.toString))
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def deleteDispatchRouteById(host: String, accessToken: String, routeId: Long)(implicit accessTokenQuery: QueryParam[String]): Task[Unit] = {
    val path = "/fleet/dispatch/routes/{route_id}".replaceAll("\\{" + "route_id" + "\\}",escape(routeId.toString))
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def deleteOrganizationAddress(host: String, accessToken: String, addressId: Long)(implicit accessTokenQuery: QueryParam[String]): Task[Unit] = {
    val path = "/addresses/{addressId}".replaceAll("\\{" + "addressId" + "\\}",escape(addressId.toString))
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def fetchAllDispatchRoutes(host: String, accessToken: String, groupId: Long, endTime: Long, duration: Long)(implicit accessTokenQuery: QueryParam[String], groupIdQuery: QueryParam[Long], endTimeQuery: QueryParam[Long], durationQuery: QueryParam[Long]): Task[List[DispatchRoute]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[DispatchRoute]] = jsonOf[List[DispatchRoute]]

    val path = "/fleet/dispatch/routes"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("groupId", Some(group_idQuery.toParamString(group_id))), ("endTime", Some(end_timeQuery.toParamString(end_time))), ("duration", Some(durationQuery.toParamString(duration))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[DispatchRoute]](req)

    } yield resp
  }
  
  def fetchAllRouteJobUpdates(host: String, accessToken: String, groupId: Long, sequenceId: String, include: String)(implicit accessTokenQuery: QueryParam[String], groupIdQuery: QueryParam[Long], sequenceIdQuery: QueryParam[String], includeQuery: QueryParam[String]): Task[AllRouteJobUpdates] = {
    implicit val returnTypeDecoder: EntityDecoder[AllRouteJobUpdates] = jsonOf[AllRouteJobUpdates]

    val path = "/fleet/dispatch/routes/job_updates"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("groupId", Some(group_idQuery.toParamString(group_id))), ("sequenceId", Some(sequence_idQuery.toParamString(sequence_id))), ("include", Some(includeQuery.toParamString(include))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AllRouteJobUpdates](req)

    } yield resp
  }
  
  def getAllAssetCurrentLocations(host: String, accessToken: String, groupId: Long)(implicit accessTokenQuery: QueryParam[String], groupIdQuery: QueryParam[Long]): Task[InlineResponse2001] = {
    implicit val returnTypeDecoder: EntityDecoder[InlineResponse2001] = jsonOf[InlineResponse2001]

    val path = "/fleet/assets/locations"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("groupId", Some(group_idQuery.toParamString(group_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[InlineResponse2001](req)

    } yield resp
  }
  
  def getAllAssets(host: String, accessToken: String, groupId: Long)(implicit accessTokenQuery: QueryParam[String], groupIdQuery: QueryParam[Long]): Task[InlineResponse200] = {
    implicit val returnTypeDecoder: EntityDecoder[InlineResponse200] = jsonOf[InlineResponse200]

    val path = "/fleet/assets"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("groupId", Some(group_idQuery.toParamString(group_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[InlineResponse200](req)

    } yield resp
  }
  
  def getAllDeactivatedDrivers(host: String, accessToken: String, groupId: Long)(implicit accessTokenQuery: QueryParam[String], groupIdQuery: QueryParam[Long]): Task[List[Driver]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Driver]] = jsonOf[List[Driver]]

    val path = "/fleet/drivers/inactive"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("groupId", Some(group_idQuery.toParamString(group_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[Driver]](req)

    } yield resp
  }
  
  def getAssetLocation(host: String, accessToken: String, assetId: Long, startMs: Long, endMs: Long)(implicit accessTokenQuery: QueryParam[String], startMsQuery: QueryParam[Long], endMsQuery: QueryParam[Long]): Task[List[Any]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Any]] = jsonOf[List[Any]]

    val path = "/fleet/assets/{asset_id}/locations".replaceAll("\\{" + "asset_id" + "\\}",escape(assetId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("startMs", Some(startMsQuery.toParamString(startMs))), ("endMs", Some(endMsQuery.toParamString(endMs))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[Any]](req)

    } yield resp
  }
  
  def getAssetReefer(host: String, accessToken: String, assetId: Long, startMs: Long, endMs: Long)(implicit accessTokenQuery: QueryParam[String], startMsQuery: QueryParam[Long], endMsQuery: QueryParam[Long]): Task[AssetReeferResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AssetReeferResponse] = jsonOf[AssetReeferResponse]

    val path = "/fleet/assets/{asset_id}/reefer".replaceAll("\\{" + "asset_id" + "\\}",escape(assetId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("startMs", Some(startMsQuery.toParamString(startMs))), ("endMs", Some(endMsQuery.toParamString(endMs))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AssetReeferResponse](req)

    } yield resp
  }
  
  def getDeactivatedDriverById(host: String, accessToken: String, driverIdOrExternalId: String)(implicit accessTokenQuery: QueryParam[String]): Task[Driver] = {
    implicit val returnTypeDecoder: EntityDecoder[Driver] = jsonOf[Driver]

    val path = "/fleet/drivers/inactive/{driver_id_or_external_id}".replaceAll("\\{" + "driver_id_or_external_id" + "\\}",escape(driverIdOrExternalId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Driver](req)

    } yield resp
  }
  
  def getDispatchRouteById(host: String, accessToken: String, routeId: Long)(implicit accessTokenQuery: QueryParam[String]): Task[DispatchRoute] = {
    implicit val returnTypeDecoder: EntityDecoder[DispatchRoute] = jsonOf[DispatchRoute]

    val path = "/fleet/dispatch/routes/{route_id}".replaceAll("\\{" + "route_id" + "\\}",escape(routeId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[DispatchRoute](req)

    } yield resp
  }
  
  def getDispatchRouteHistory(host: String, accessToken: String, routeId: Long, startTime: Long, endTime: Long)(implicit accessTokenQuery: QueryParam[String], startTimeQuery: QueryParam[Long], endTimeQuery: QueryParam[Long]): Task[DispatchRouteHistory] = {
    implicit val returnTypeDecoder: EntityDecoder[DispatchRouteHistory] = jsonOf[DispatchRouteHistory]

    val path = "/fleet/dispatch/routes/{route_id}/history".replaceAll("\\{" + "route_id" + "\\}",escape(routeId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("startTime", Some(start_timeQuery.toParamString(start_time))), ("endTime", Some(end_timeQuery.toParamString(end_time))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[DispatchRouteHistory](req)

    } yield resp
  }
  
  def getDispatchRoutesByDriverId(host: String, accessToken: String, driverId: Long, endTime: Long, duration: Long)(implicit accessTokenQuery: QueryParam[String], endTimeQuery: QueryParam[Long], durationQuery: QueryParam[Long]): Task[List[DispatchRoute]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[DispatchRoute]] = jsonOf[List[DispatchRoute]]

    val path = "/fleet/drivers/{driver_id}/dispatch/routes".replaceAll("\\{" + "driver_id" + "\\}",escape(driverId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("endTime", Some(end_timeQuery.toParamString(end_time))), ("duration", Some(durationQuery.toParamString(duration))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[DispatchRoute]](req)

    } yield resp
  }
  
  def getDispatchRoutesByVehicleId(host: String, accessToken: String, vehicleId: Long, endTime: Long, duration: Long)(implicit accessTokenQuery: QueryParam[String], endTimeQuery: QueryParam[Long], durationQuery: QueryParam[Long]): Task[List[DispatchRoute]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[DispatchRoute]] = jsonOf[List[DispatchRoute]]

    val path = "/fleet/vehicles/{vehicle_id}/dispatch/routes".replaceAll("\\{" + "vehicle_id" + "\\}",escape(vehicleId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("endTime", Some(end_timeQuery.toParamString(end_time))), ("duration", Some(durationQuery.toParamString(duration))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[DispatchRoute]](req)

    } yield resp
  }
  
  def getDriverById(host: String, accessToken: String, driverIdOrExternalId: String)(implicit accessTokenQuery: QueryParam[String]): Task[Driver] = {
    implicit val returnTypeDecoder: EntityDecoder[Driver] = jsonOf[Driver]

    val path = "/fleet/drivers/{driver_id_or_external_id}".replaceAll("\\{" + "driver_id_or_external_id" + "\\}",escape(driverIdOrExternalId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Driver](req)

    } yield resp
  }
  
  def getDriverDocumentTypesByOrgId(host: String): Task[List[DocumentType]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[DocumentType]] = jsonOf[List[DocumentType]]

    val path = "/fleet/drivers/document_types"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[DocumentType]](req)

    } yield resp
  }
  
  def getDriverDocumentsByOrgId(host: String, accessToken: String, endMs: Long, durationMs: Long)(implicit accessTokenQuery: QueryParam[String], endMsQuery: QueryParam[Long], durationMsQuery: QueryParam[Long]): Task[List[Document]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Document]] = jsonOf[List[Document]]

    val path = "/fleet/drivers/documents"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("endMs", Some(endMsQuery.toParamString(endMs))), ("durationMs", Some(durationMsQuery.toParamString(durationMs))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[Document]](req)

    } yield resp
  }
  
  def getDriverSafetyScore(host: String, driverId: Long, accessToken: String, startMs: Long, endMs: Long)(implicit accessTokenQuery: QueryParam[String], startMsQuery: QueryParam[Long], endMsQuery: QueryParam[Long]): Task[DriverSafetyScoreResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DriverSafetyScoreResponse] = jsonOf[DriverSafetyScoreResponse]

    val path = "/fleet/drivers/{driverId}/safety/score".replaceAll("\\{" + "driverId" + "\\}",escape(driverId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("startMs", Some(startMsQuery.toParamString(startMs))), ("endMs", Some(endMsQuery.toParamString(endMs))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[DriverSafetyScoreResponse](req)

    } yield resp
  }
  
  def getDvirs(host: String, accessToken: String, endMs: Integer, durationMs: Integer, groupId: Integer)(implicit accessTokenQuery: QueryParam[String], endMsQuery: QueryParam[Integer], durationMsQuery: QueryParam[Integer], groupIdQuery: QueryParam[Integer]): Task[DvirListResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DvirListResponse] = jsonOf[DvirListResponse]

    val path = "/fleet/maintenance/dvirs"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("endMs", Some(end_msQuery.toParamString(end_ms))), ("durationMs", Some(duration_msQuery.toParamString(duration_ms))), ("groupId", Some(group_idQuery.toParamString(group_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[DvirListResponse](req)

    } yield resp
  }
  
  def getFleetDrivers(host: String, accessToken: String, groupDriversParam: InlineObject3)(implicit accessTokenQuery: QueryParam[String]): Task[DriversResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DriversResponse] = jsonOf[DriversResponse]

    val path = "/fleet/drivers"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(groupDriversParam)
      resp          <- client.expect[DriversResponse](req)

    } yield resp
  }
  
  def getFleetDriversHosDailyLogs(host: String, accessToken: String, driverId: Long, hosLogsParam: InlineObject6)(implicit accessTokenQuery: QueryParam[String]): Task[DriverDailyLogResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DriverDailyLogResponse] = jsonOf[DriverDailyLogResponse]

    val path = "/fleet/drivers/{driver_id}/hos_daily_logs".replaceAll("\\{" + "driver_id" + "\\}",escape(driverId.toString))
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(hosLogsParam)
      resp          <- client.expect[DriverDailyLogResponse](req)

    } yield resp
  }
  
  def getFleetDriversSummary(host: String, accessToken: String, driversSummaryParam: InlineObject5, snapToDayBounds: Boolean)(implicit accessTokenQuery: QueryParam[String], snapToDayBoundsQuery: QueryParam[Boolean]): Task[DriversSummaryResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DriversSummaryResponse] = jsonOf[DriversSummaryResponse]

    val path = "/fleet/drivers/summary"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("snapToDayBounds", Some(snap_to_day_boundsQuery.toParamString(snap_to_day_bounds))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(driversSummaryParam)
      resp          <- client.expect[DriversSummaryResponse](req)

    } yield resp
  }
  
  def getFleetHosAuthenticationLogs(host: String, accessToken: String, hosAuthenticationLogsParam: InlineObject7)(implicit accessTokenQuery: QueryParam[String]): Task[HosAuthenticationLogsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[HosAuthenticationLogsResponse] = jsonOf[HosAuthenticationLogsResponse]

    val path = "/fleet/hos_authentication_logs"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(hosAuthenticationLogsParam)
      resp          <- client.expect[HosAuthenticationLogsResponse](req)

    } yield resp
  }
  
  def getFleetHosLogs(host: String, accessToken: String, hosLogsParam: InlineObject8)(implicit accessTokenQuery: QueryParam[String]): Task[HosLogsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[HosLogsResponse] = jsonOf[HosLogsResponse]

    val path = "/fleet/hos_logs"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(hosLogsParam)
      resp          <- client.expect[HosLogsResponse](req)

    } yield resp
  }
  
  def getFleetHosLogsSummary(host: String, accessToken: String, hosLogsParam: InlineObject9)(implicit accessTokenQuery: QueryParam[String]): Task[HosLogsSummaryResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[HosLogsSummaryResponse] = jsonOf[HosLogsSummaryResponse]

    val path = "/fleet/hos_logs_summary"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(hosLogsParam)
      resp          <- client.expect[HosLogsSummaryResponse](req)

    } yield resp
  }
  
  def getFleetLocations(host: String, accessToken: String, groupParam: InlineObject11)(implicit accessTokenQuery: QueryParam[String]): Task[InlineResponse2003] = {
    implicit val returnTypeDecoder: EntityDecoder[InlineResponse2003] = jsonOf[InlineResponse2003]

    val path = "/fleet/locations"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(groupParam)
      resp          <- client.expect[InlineResponse2003](req)

    } yield resp
  }
  
  def getFleetMaintenanceList(host: String, accessToken: String, groupParam: InlineObject13)(implicit accessTokenQuery: QueryParam[String]): Task[InlineResponse2004] = {
    implicit val returnTypeDecoder: EntityDecoder[InlineResponse2004] = jsonOf[InlineResponse2004]

    val path = "/fleet/maintenance/list"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(groupParam)
      resp          <- client.expect[InlineResponse2004](req)

    } yield resp
  }
  
  def getFleetTrips(host: String, accessToken: String, tripsParam: InlineObject15)(implicit accessTokenQuery: QueryParam[String]): Task[TripResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[TripResponse] = jsonOf[TripResponse]

    val path = "/fleet/trips"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(tripsParam)
      resp          <- client.expect[TripResponse](req)

    } yield resp
  }
  
  def getFleetVehicle(host: String, accessToken: String, vehicleIdOrExternalId: String)(implicit accessTokenQuery: QueryParam[String]): Task[FleetVehicleResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[FleetVehicleResponse] = jsonOf[FleetVehicleResponse]

    val path = "/fleet/vehicles/{vehicle_id_or_external_id}".replaceAll("\\{" + "vehicle_id_or_external_id" + "\\}",escape(vehicleIdOrExternalId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[FleetVehicleResponse](req)

    } yield resp
  }
  
  def getOrganizationAddress(host: String, accessToken: String, addressId: Long)(implicit accessTokenQuery: QueryParam[String]): Task[Address] = {
    implicit val returnTypeDecoder: EntityDecoder[Address] = jsonOf[Address]

    val path = "/addresses/{addressId}".replaceAll("\\{" + "addressId" + "\\}",escape(addressId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Address](req)

    } yield resp
  }
  
  def getOrganizationAddresses(host: String, accessToken: String)(implicit accessTokenQuery: QueryParam[String]): Task[List[Address]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Address]] = jsonOf[List[Address]]

    val path = "/addresses"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[Address]](req)

    } yield resp
  }
  
  def getOrganizationContact(host: String, accessToken: String, contactId: Long)(implicit accessTokenQuery: QueryParam[String]): Task[Contact] = {
    implicit val returnTypeDecoder: EntityDecoder[Contact] = jsonOf[Contact]

    val path = "/contacts/{contact_id}".replaceAll("\\{" + "contact_id" + "\\}",escape(contactId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Contact](req)

    } yield resp
  }
  
  def getVehicleHarshEvent(host: String, vehicleId: Long, accessToken: String, timestamp: Long)(implicit accessTokenQuery: QueryParam[String], timestampQuery: QueryParam[Long]): Task[VehicleHarshEventResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[VehicleHarshEventResponse] = jsonOf[VehicleHarshEventResponse]

    val path = "/fleet/vehicles/{vehicleId}/safety/harsh_event".replaceAll("\\{" + "vehicleId" + "\\}",escape(vehicleId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("timestamp", Some(timestampQuery.toParamString(timestamp))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[VehicleHarshEventResponse](req)

    } yield resp
  }
  
  def getVehicleLocations(host: String, accessToken: String, vehicleId: Long, startMs: Long, endMs: Long)(implicit accessTokenQuery: QueryParam[String], startMsQuery: QueryParam[Long], endMsQuery: QueryParam[Long]): Task[List[FleetVehicleLocation]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[FleetVehicleLocation]] = jsonOf[List[FleetVehicleLocation]]

    val path = "/fleet/vehicles/{vehicle_id}/locations".replaceAll("\\{" + "vehicle_id" + "\\}",escape(vehicleId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("startMs", Some(startMsQuery.toParamString(startMs))), ("endMs", Some(endMsQuery.toParamString(endMs))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[FleetVehicleLocation]](req)

    } yield resp
  }
  
  def getVehicleSafetyScore(host: String, vehicleId: Long, accessToken: String, startMs: Long, endMs: Long)(implicit accessTokenQuery: QueryParam[String], startMsQuery: QueryParam[Long], endMsQuery: QueryParam[Long]): Task[VehicleSafetyScoreResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[VehicleSafetyScoreResponse] = jsonOf[VehicleSafetyScoreResponse]

    val path = "/fleet/vehicles/{vehicleId}/safety/score".replaceAll("\\{" + "vehicleId" + "\\}",escape(vehicleId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("startMs", Some(startMsQuery.toParamString(startMs))), ("endMs", Some(endMsQuery.toParamString(endMs))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[VehicleSafetyScoreResponse](req)

    } yield resp
  }
  
  def getVehicleStats(host: String, accessToken: String, startMs: Integer, endMs: Integer, series: String, tagIds: String, startingAfter: String, endingBefore: String, limit: Long)(implicit accessTokenQuery: QueryParam[String], startMsQuery: QueryParam[Integer], endMsQuery: QueryParam[Integer], seriesQuery: QueryParam[String], tagIdsQuery: QueryParam[String], startingAfterQuery: QueryParam[String], endingBeforeQuery: QueryParam[String], limitQuery: QueryParam[Long]): Task[InlineResponse2005] = {
    implicit val returnTypeDecoder: EntityDecoder[InlineResponse2005] = jsonOf[InlineResponse2005]

    val path = "/fleet/vehicles/stats"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("startMs", Some(startMsQuery.toParamString(startMs))), ("endMs", Some(endMsQuery.toParamString(endMs))), ("series", Some(seriesQuery.toParamString(series))), ("tagIds", Some(tagIdsQuery.toParamString(tagIds))), ("startingAfter", Some(startingAfterQuery.toParamString(startingAfter))), ("endingBefore", Some(endingBeforeQuery.toParamString(endingBefore))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[InlineResponse2005](req)

    } yield resp
  }
  
  def getVehiclesLocations(host: String, accessToken: String, startMs: Integer, endMs: Integer)(implicit accessTokenQuery: QueryParam[String], startMsQuery: QueryParam[Integer], endMsQuery: QueryParam[Integer]): Task[List[Any]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Any]] = jsonOf[List[Any]]

    val path = "/fleet/vehicles/locations"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("startMs", Some(startMsQuery.toParamString(startMs))), ("endMs", Some(endMsQuery.toParamString(endMs))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[Any]](req)

    } yield resp
  }
  
  def listContacts(host: String, accessToken: String)(implicit accessTokenQuery: QueryParam[String]): Task[List[Contact]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Contact]] = jsonOf[List[Contact]]

    val path = "/contacts"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[Contact]](req)

    } yield resp
  }
  
  def listFleet(host: String, accessToken: String, groupParam: InlineObject10, startingAfter: String, endingBefore: String, limit: Long)(implicit accessTokenQuery: QueryParam[String], startingAfterQuery: QueryParam[String], endingBeforeQuery: QueryParam[String], limitQuery: QueryParam[Long]): Task[InlineResponse2002] = {
    implicit val returnTypeDecoder: EntityDecoder[InlineResponse2002] = jsonOf[InlineResponse2002]

    val path = "/fleet/list"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("startingAfter", Some(startingAfterQuery.toParamString(startingAfter))), ("endingBefore", Some(endingBeforeQuery.toParamString(endingBefore))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(groupParam)
      resp          <- client.expect[InlineResponse2002](req)

    } yield resp
  }
  
  def patchFleetVehicle(host: String, accessToken: String, vehicleIdOrExternalId: String, data: InlineObject16)(implicit accessTokenQuery: QueryParam[String]): Task[FleetVehicleResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[FleetVehicleResponse] = jsonOf[FleetVehicleResponse]

    val path = "/fleet/vehicles/{vehicle_id_or_external_id}".replaceAll("\\{" + "vehicle_id_or_external_id" + "\\}",escape(vehicleIdOrExternalId.toString))
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(data)
      resp          <- client.expect[FleetVehicleResponse](req)

    } yield resp
  }
  
  def reactivateDriverById(host: String, accessToken: String, driverIdOrExternalId: String, reactivateDriverParam: InlineObject4)(implicit accessTokenQuery: QueryParam[String]): Task[Driver] = {
    implicit val returnTypeDecoder: EntityDecoder[Driver] = jsonOf[Driver]

    val path = "/fleet/drivers/inactive/{driver_id_or_external_id}".replaceAll("\\{" + "driver_id_or_external_id" + "\\}",escape(driverIdOrExternalId.toString))
    
    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(reactivateDriverParam)
      resp          <- client.expect[Driver](req)

    } yield resp
  }
  
  def updateDispatchRouteById(host: String, accessToken: String, routeId: Long, updateDispatchRouteParams: DispatchRoute)(implicit accessTokenQuery: QueryParam[String]): Task[DispatchRoute] = {
    implicit val returnTypeDecoder: EntityDecoder[DispatchRoute] = jsonOf[DispatchRoute]

    val path = "/fleet/dispatch/routes/{route_id}".replaceAll("\\{" + "route_id" + "\\}",escape(routeId.toString))
    
    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateDispatchRouteParams)
      resp          <- client.expect[DispatchRoute](req)

    } yield resp
  }
  
  def updateOrganizationAddress(host: String, accessToken: String, addressId: Long, address: InlineObject1)(implicit accessTokenQuery: QueryParam[String]): Task[Unit] = {
    val path = "/addresses/{addressId}".replaceAll("\\{" + "addressId" + "\\}",escape(addressId.toString))
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(address)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def updateVehicles(host: String, accessToken: String, vehicleUpdateParam: InlineObject14)(implicit accessTokenQuery: QueryParam[String]): Task[Unit] = {
    val path = "/fleet/set_data"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(vehicleUpdateParam)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
}

class HttpServiceFleetApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def addFleetAddress(accessToken: String, addressParam: InlineObject2)(implicit accessTokenQuery: QueryParam[String]): Task[Unit] = {
    val path = "/fleet/add_address"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(addressParam)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def addOrganizationAddresses(accessToken: String, addresses: InlineObject)(implicit accessTokenQuery: QueryParam[String]): Task[List[Address]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Address]] = jsonOf[List[Address]]

    val path = "/addresses"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(addresses)
      resp          <- client.expect[List[Address]](req)

    } yield resp
  }
  
  def createDispatchRoute(accessToken: String, createDispatchRouteParams: DispatchRouteCreate)(implicit accessTokenQuery: QueryParam[String]): Task[DispatchRoute] = {
    implicit val returnTypeDecoder: EntityDecoder[DispatchRoute] = jsonOf[DispatchRoute]

    val path = "/fleet/dispatch/routes"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createDispatchRouteParams)
      resp          <- client.expect[DispatchRoute](req)

    } yield resp
  }
  
  def createDriver(accessToken: String, createDriverParam: DriverForCreate)(implicit accessTokenQuery: QueryParam[String]): Task[Driver] = {
    implicit val returnTypeDecoder: EntityDecoder[Driver] = jsonOf[Driver]

    val path = "/fleet/drivers/create"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createDriverParam)
      resp          <- client.expect[Driver](req)

    } yield resp
  }
  
  def createDriverDispatchRoute(accessToken: String, driverId: Long, createDispatchRouteParams: DispatchRouteCreate)(implicit accessTokenQuery: QueryParam[String]): Task[DispatchRoute] = {
    implicit val returnTypeDecoder: EntityDecoder[DispatchRoute] = jsonOf[DispatchRoute]

    val path = "/fleet/drivers/{driver_id}/dispatch/routes".replaceAll("\\{" + "driver_id" + "\\}",escape(driverId.toString))
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createDispatchRouteParams)
      resp          <- client.expect[DispatchRoute](req)

    } yield resp
  }
  
  def createDriverDocument(accessToken: String, driverId: Long, createDocumentParams: DocumentCreate)(implicit accessTokenQuery: QueryParam[String]): Task[Document] = {
    implicit val returnTypeDecoder: EntityDecoder[Document] = jsonOf[Document]

    val path = "/fleet/drivers/{driver_id}/documents".replaceAll("\\{" + "driver_id" + "\\}",escape(driverId.toString))
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createDocumentParams)
      resp          <- client.expect[Document](req)

    } yield resp
  }
  
  def createDvir(accessToken: String, createDvirParam: InlineObject12)(implicit accessTokenQuery: QueryParam[String]): Task[DvirBase] = {
    implicit val returnTypeDecoder: EntityDecoder[DvirBase] = jsonOf[DvirBase]

    val path = "/fleet/maintenance/dvirs"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createDvirParam)
      resp          <- client.expect[DvirBase](req)

    } yield resp
  }
  
  def createVehicleDispatchRoute(accessToken: String, vehicleId: Long, createDispatchRouteParams: DispatchRouteCreate)(implicit accessTokenQuery: QueryParam[String]): Task[DispatchRoute] = {
    implicit val returnTypeDecoder: EntityDecoder[DispatchRoute] = jsonOf[DispatchRoute]

    val path = "/fleet/vehicles/{vehicle_id}/dispatch/routes".replaceAll("\\{" + "vehicle_id" + "\\}",escape(vehicleId.toString))
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createDispatchRouteParams)
      resp          <- client.expect[DispatchRoute](req)

    } yield resp
  }
  
  def deactivateDriver(accessToken: String, driverIdOrExternalId: String)(implicit accessTokenQuery: QueryParam[String]): Task[Unit] = {
    val path = "/fleet/drivers/{driver_id_or_external_id}".replaceAll("\\{" + "driver_id_or_external_id" + "\\}",escape(driverIdOrExternalId.toString))
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def deleteDispatchRouteById(accessToken: String, routeId: Long)(implicit accessTokenQuery: QueryParam[String]): Task[Unit] = {
    val path = "/fleet/dispatch/routes/{route_id}".replaceAll("\\{" + "route_id" + "\\}",escape(routeId.toString))
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def deleteOrganizationAddress(accessToken: String, addressId: Long)(implicit accessTokenQuery: QueryParam[String]): Task[Unit] = {
    val path = "/addresses/{addressId}".replaceAll("\\{" + "addressId" + "\\}",escape(addressId.toString))
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def fetchAllDispatchRoutes(accessToken: String, groupId: Long, endTime: Long, duration: Long)(implicit accessTokenQuery: QueryParam[String], groupIdQuery: QueryParam[Long], endTimeQuery: QueryParam[Long], durationQuery: QueryParam[Long]): Task[List[DispatchRoute]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[DispatchRoute]] = jsonOf[List[DispatchRoute]]

    val path = "/fleet/dispatch/routes"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("groupId", Some(group_idQuery.toParamString(group_id))), ("endTime", Some(end_timeQuery.toParamString(end_time))), ("duration", Some(durationQuery.toParamString(duration))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[DispatchRoute]](req)

    } yield resp
  }
  
  def fetchAllRouteJobUpdates(accessToken: String, groupId: Long, sequenceId: String, include: String)(implicit accessTokenQuery: QueryParam[String], groupIdQuery: QueryParam[Long], sequenceIdQuery: QueryParam[String], includeQuery: QueryParam[String]): Task[AllRouteJobUpdates] = {
    implicit val returnTypeDecoder: EntityDecoder[AllRouteJobUpdates] = jsonOf[AllRouteJobUpdates]

    val path = "/fleet/dispatch/routes/job_updates"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("groupId", Some(group_idQuery.toParamString(group_id))), ("sequenceId", Some(sequence_idQuery.toParamString(sequence_id))), ("include", Some(includeQuery.toParamString(include))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AllRouteJobUpdates](req)

    } yield resp
  }
  
  def getAllAssetCurrentLocations(accessToken: String, groupId: Long)(implicit accessTokenQuery: QueryParam[String], groupIdQuery: QueryParam[Long]): Task[InlineResponse2001] = {
    implicit val returnTypeDecoder: EntityDecoder[InlineResponse2001] = jsonOf[InlineResponse2001]

    val path = "/fleet/assets/locations"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("groupId", Some(group_idQuery.toParamString(group_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[InlineResponse2001](req)

    } yield resp
  }
  
  def getAllAssets(accessToken: String, groupId: Long)(implicit accessTokenQuery: QueryParam[String], groupIdQuery: QueryParam[Long]): Task[InlineResponse200] = {
    implicit val returnTypeDecoder: EntityDecoder[InlineResponse200] = jsonOf[InlineResponse200]

    val path = "/fleet/assets"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("groupId", Some(group_idQuery.toParamString(group_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[InlineResponse200](req)

    } yield resp
  }
  
  def getAllDeactivatedDrivers(accessToken: String, groupId: Long)(implicit accessTokenQuery: QueryParam[String], groupIdQuery: QueryParam[Long]): Task[List[Driver]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Driver]] = jsonOf[List[Driver]]

    val path = "/fleet/drivers/inactive"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("groupId", Some(group_idQuery.toParamString(group_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[Driver]](req)

    } yield resp
  }
  
  def getAssetLocation(accessToken: String, assetId: Long, startMs: Long, endMs: Long)(implicit accessTokenQuery: QueryParam[String], startMsQuery: QueryParam[Long], endMsQuery: QueryParam[Long]): Task[List[Any]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Any]] = jsonOf[List[Any]]

    val path = "/fleet/assets/{asset_id}/locations".replaceAll("\\{" + "asset_id" + "\\}",escape(assetId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("startMs", Some(startMsQuery.toParamString(startMs))), ("endMs", Some(endMsQuery.toParamString(endMs))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[Any]](req)

    } yield resp
  }
  
  def getAssetReefer(accessToken: String, assetId: Long, startMs: Long, endMs: Long)(implicit accessTokenQuery: QueryParam[String], startMsQuery: QueryParam[Long], endMsQuery: QueryParam[Long]): Task[AssetReeferResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AssetReeferResponse] = jsonOf[AssetReeferResponse]

    val path = "/fleet/assets/{asset_id}/reefer".replaceAll("\\{" + "asset_id" + "\\}",escape(assetId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("startMs", Some(startMsQuery.toParamString(startMs))), ("endMs", Some(endMsQuery.toParamString(endMs))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AssetReeferResponse](req)

    } yield resp
  }
  
  def getDeactivatedDriverById(accessToken: String, driverIdOrExternalId: String)(implicit accessTokenQuery: QueryParam[String]): Task[Driver] = {
    implicit val returnTypeDecoder: EntityDecoder[Driver] = jsonOf[Driver]

    val path = "/fleet/drivers/inactive/{driver_id_or_external_id}".replaceAll("\\{" + "driver_id_or_external_id" + "\\}",escape(driverIdOrExternalId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Driver](req)

    } yield resp
  }
  
  def getDispatchRouteById(accessToken: String, routeId: Long)(implicit accessTokenQuery: QueryParam[String]): Task[DispatchRoute] = {
    implicit val returnTypeDecoder: EntityDecoder[DispatchRoute] = jsonOf[DispatchRoute]

    val path = "/fleet/dispatch/routes/{route_id}".replaceAll("\\{" + "route_id" + "\\}",escape(routeId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[DispatchRoute](req)

    } yield resp
  }
  
  def getDispatchRouteHistory(accessToken: String, routeId: Long, startTime: Long, endTime: Long)(implicit accessTokenQuery: QueryParam[String], startTimeQuery: QueryParam[Long], endTimeQuery: QueryParam[Long]): Task[DispatchRouteHistory] = {
    implicit val returnTypeDecoder: EntityDecoder[DispatchRouteHistory] = jsonOf[DispatchRouteHistory]

    val path = "/fleet/dispatch/routes/{route_id}/history".replaceAll("\\{" + "route_id" + "\\}",escape(routeId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("startTime", Some(start_timeQuery.toParamString(start_time))), ("endTime", Some(end_timeQuery.toParamString(end_time))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[DispatchRouteHistory](req)

    } yield resp
  }
  
  def getDispatchRoutesByDriverId(accessToken: String, driverId: Long, endTime: Long, duration: Long)(implicit accessTokenQuery: QueryParam[String], endTimeQuery: QueryParam[Long], durationQuery: QueryParam[Long]): Task[List[DispatchRoute]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[DispatchRoute]] = jsonOf[List[DispatchRoute]]

    val path = "/fleet/drivers/{driver_id}/dispatch/routes".replaceAll("\\{" + "driver_id" + "\\}",escape(driverId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("endTime", Some(end_timeQuery.toParamString(end_time))), ("duration", Some(durationQuery.toParamString(duration))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[DispatchRoute]](req)

    } yield resp
  }
  
  def getDispatchRoutesByVehicleId(accessToken: String, vehicleId: Long, endTime: Long, duration: Long)(implicit accessTokenQuery: QueryParam[String], endTimeQuery: QueryParam[Long], durationQuery: QueryParam[Long]): Task[List[DispatchRoute]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[DispatchRoute]] = jsonOf[List[DispatchRoute]]

    val path = "/fleet/vehicles/{vehicle_id}/dispatch/routes".replaceAll("\\{" + "vehicle_id" + "\\}",escape(vehicleId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("endTime", Some(end_timeQuery.toParamString(end_time))), ("duration", Some(durationQuery.toParamString(duration))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[DispatchRoute]](req)

    } yield resp
  }
  
  def getDriverById(accessToken: String, driverIdOrExternalId: String)(implicit accessTokenQuery: QueryParam[String]): Task[Driver] = {
    implicit val returnTypeDecoder: EntityDecoder[Driver] = jsonOf[Driver]

    val path = "/fleet/drivers/{driver_id_or_external_id}".replaceAll("\\{" + "driver_id_or_external_id" + "\\}",escape(driverIdOrExternalId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Driver](req)

    } yield resp
  }
  
  def getDriverDocumentTypesByOrgId(): Task[List[DocumentType]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[DocumentType]] = jsonOf[List[DocumentType]]

    val path = "/fleet/drivers/document_types"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[DocumentType]](req)

    } yield resp
  }
  
  def getDriverDocumentsByOrgId(accessToken: String, endMs: Long, durationMs: Long)(implicit accessTokenQuery: QueryParam[String], endMsQuery: QueryParam[Long], durationMsQuery: QueryParam[Long]): Task[List[Document]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Document]] = jsonOf[List[Document]]

    val path = "/fleet/drivers/documents"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("endMs", Some(endMsQuery.toParamString(endMs))), ("durationMs", Some(durationMsQuery.toParamString(durationMs))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[Document]](req)

    } yield resp
  }
  
  def getDriverSafetyScore(driverId: Long, accessToken: String, startMs: Long, endMs: Long)(implicit accessTokenQuery: QueryParam[String], startMsQuery: QueryParam[Long], endMsQuery: QueryParam[Long]): Task[DriverSafetyScoreResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DriverSafetyScoreResponse] = jsonOf[DriverSafetyScoreResponse]

    val path = "/fleet/drivers/{driverId}/safety/score".replaceAll("\\{" + "driverId" + "\\}",escape(driverId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("startMs", Some(startMsQuery.toParamString(startMs))), ("endMs", Some(endMsQuery.toParamString(endMs))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[DriverSafetyScoreResponse](req)

    } yield resp
  }
  
  def getDvirs(accessToken: String, endMs: Integer, durationMs: Integer, groupId: Integer)(implicit accessTokenQuery: QueryParam[String], endMsQuery: QueryParam[Integer], durationMsQuery: QueryParam[Integer], groupIdQuery: QueryParam[Integer]): Task[DvirListResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DvirListResponse] = jsonOf[DvirListResponse]

    val path = "/fleet/maintenance/dvirs"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("endMs", Some(end_msQuery.toParamString(end_ms))), ("durationMs", Some(duration_msQuery.toParamString(duration_ms))), ("groupId", Some(group_idQuery.toParamString(group_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[DvirListResponse](req)

    } yield resp
  }
  
  def getFleetDrivers(accessToken: String, groupDriversParam: InlineObject3)(implicit accessTokenQuery: QueryParam[String]): Task[DriversResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DriversResponse] = jsonOf[DriversResponse]

    val path = "/fleet/drivers"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(groupDriversParam)
      resp          <- client.expect[DriversResponse](req)

    } yield resp
  }
  
  def getFleetDriversHosDailyLogs(accessToken: String, driverId: Long, hosLogsParam: InlineObject6)(implicit accessTokenQuery: QueryParam[String]): Task[DriverDailyLogResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DriverDailyLogResponse] = jsonOf[DriverDailyLogResponse]

    val path = "/fleet/drivers/{driver_id}/hos_daily_logs".replaceAll("\\{" + "driver_id" + "\\}",escape(driverId.toString))
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(hosLogsParam)
      resp          <- client.expect[DriverDailyLogResponse](req)

    } yield resp
  }
  
  def getFleetDriversSummary(accessToken: String, driversSummaryParam: InlineObject5, snapToDayBounds: Boolean)(implicit accessTokenQuery: QueryParam[String], snapToDayBoundsQuery: QueryParam[Boolean]): Task[DriversSummaryResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DriversSummaryResponse] = jsonOf[DriversSummaryResponse]

    val path = "/fleet/drivers/summary"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("snapToDayBounds", Some(snap_to_day_boundsQuery.toParamString(snap_to_day_bounds))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(driversSummaryParam)
      resp          <- client.expect[DriversSummaryResponse](req)

    } yield resp
  }
  
  def getFleetHosAuthenticationLogs(accessToken: String, hosAuthenticationLogsParam: InlineObject7)(implicit accessTokenQuery: QueryParam[String]): Task[HosAuthenticationLogsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[HosAuthenticationLogsResponse] = jsonOf[HosAuthenticationLogsResponse]

    val path = "/fleet/hos_authentication_logs"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(hosAuthenticationLogsParam)
      resp          <- client.expect[HosAuthenticationLogsResponse](req)

    } yield resp
  }
  
  def getFleetHosLogs(accessToken: String, hosLogsParam: InlineObject8)(implicit accessTokenQuery: QueryParam[String]): Task[HosLogsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[HosLogsResponse] = jsonOf[HosLogsResponse]

    val path = "/fleet/hos_logs"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(hosLogsParam)
      resp          <- client.expect[HosLogsResponse](req)

    } yield resp
  }
  
  def getFleetHosLogsSummary(accessToken: String, hosLogsParam: InlineObject9)(implicit accessTokenQuery: QueryParam[String]): Task[HosLogsSummaryResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[HosLogsSummaryResponse] = jsonOf[HosLogsSummaryResponse]

    val path = "/fleet/hos_logs_summary"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(hosLogsParam)
      resp          <- client.expect[HosLogsSummaryResponse](req)

    } yield resp
  }
  
  def getFleetLocations(accessToken: String, groupParam: InlineObject11)(implicit accessTokenQuery: QueryParam[String]): Task[InlineResponse2003] = {
    implicit val returnTypeDecoder: EntityDecoder[InlineResponse2003] = jsonOf[InlineResponse2003]

    val path = "/fleet/locations"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(groupParam)
      resp          <- client.expect[InlineResponse2003](req)

    } yield resp
  }
  
  def getFleetMaintenanceList(accessToken: String, groupParam: InlineObject13)(implicit accessTokenQuery: QueryParam[String]): Task[InlineResponse2004] = {
    implicit val returnTypeDecoder: EntityDecoder[InlineResponse2004] = jsonOf[InlineResponse2004]

    val path = "/fleet/maintenance/list"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(groupParam)
      resp          <- client.expect[InlineResponse2004](req)

    } yield resp
  }
  
  def getFleetTrips(accessToken: String, tripsParam: InlineObject15)(implicit accessTokenQuery: QueryParam[String]): Task[TripResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[TripResponse] = jsonOf[TripResponse]

    val path = "/fleet/trips"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(tripsParam)
      resp          <- client.expect[TripResponse](req)

    } yield resp
  }
  
  def getFleetVehicle(accessToken: String, vehicleIdOrExternalId: String)(implicit accessTokenQuery: QueryParam[String]): Task[FleetVehicleResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[FleetVehicleResponse] = jsonOf[FleetVehicleResponse]

    val path = "/fleet/vehicles/{vehicle_id_or_external_id}".replaceAll("\\{" + "vehicle_id_or_external_id" + "\\}",escape(vehicleIdOrExternalId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[FleetVehicleResponse](req)

    } yield resp
  }
  
  def getOrganizationAddress(accessToken: String, addressId: Long)(implicit accessTokenQuery: QueryParam[String]): Task[Address] = {
    implicit val returnTypeDecoder: EntityDecoder[Address] = jsonOf[Address]

    val path = "/addresses/{addressId}".replaceAll("\\{" + "addressId" + "\\}",escape(addressId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Address](req)

    } yield resp
  }
  
  def getOrganizationAddresses(accessToken: String)(implicit accessTokenQuery: QueryParam[String]): Task[List[Address]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Address]] = jsonOf[List[Address]]

    val path = "/addresses"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[Address]](req)

    } yield resp
  }
  
  def getOrganizationContact(accessToken: String, contactId: Long)(implicit accessTokenQuery: QueryParam[String]): Task[Contact] = {
    implicit val returnTypeDecoder: EntityDecoder[Contact] = jsonOf[Contact]

    val path = "/contacts/{contact_id}".replaceAll("\\{" + "contact_id" + "\\}",escape(contactId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Contact](req)

    } yield resp
  }
  
  def getVehicleHarshEvent(vehicleId: Long, accessToken: String, timestamp: Long)(implicit accessTokenQuery: QueryParam[String], timestampQuery: QueryParam[Long]): Task[VehicleHarshEventResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[VehicleHarshEventResponse] = jsonOf[VehicleHarshEventResponse]

    val path = "/fleet/vehicles/{vehicleId}/safety/harsh_event".replaceAll("\\{" + "vehicleId" + "\\}",escape(vehicleId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("timestamp", Some(timestampQuery.toParamString(timestamp))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[VehicleHarshEventResponse](req)

    } yield resp
  }
  
  def getVehicleLocations(accessToken: String, vehicleId: Long, startMs: Long, endMs: Long)(implicit accessTokenQuery: QueryParam[String], startMsQuery: QueryParam[Long], endMsQuery: QueryParam[Long]): Task[List[FleetVehicleLocation]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[FleetVehicleLocation]] = jsonOf[List[FleetVehicleLocation]]

    val path = "/fleet/vehicles/{vehicle_id}/locations".replaceAll("\\{" + "vehicle_id" + "\\}",escape(vehicleId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("startMs", Some(startMsQuery.toParamString(startMs))), ("endMs", Some(endMsQuery.toParamString(endMs))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[FleetVehicleLocation]](req)

    } yield resp
  }
  
  def getVehicleSafetyScore(vehicleId: Long, accessToken: String, startMs: Long, endMs: Long)(implicit accessTokenQuery: QueryParam[String], startMsQuery: QueryParam[Long], endMsQuery: QueryParam[Long]): Task[VehicleSafetyScoreResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[VehicleSafetyScoreResponse] = jsonOf[VehicleSafetyScoreResponse]

    val path = "/fleet/vehicles/{vehicleId}/safety/score".replaceAll("\\{" + "vehicleId" + "\\}",escape(vehicleId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("startMs", Some(startMsQuery.toParamString(startMs))), ("endMs", Some(endMsQuery.toParamString(endMs))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[VehicleSafetyScoreResponse](req)

    } yield resp
  }
  
  def getVehicleStats(accessToken: String, startMs: Integer, endMs: Integer, series: String, tagIds: String, startingAfter: String, endingBefore: String, limit: Long)(implicit accessTokenQuery: QueryParam[String], startMsQuery: QueryParam[Integer], endMsQuery: QueryParam[Integer], seriesQuery: QueryParam[String], tagIdsQuery: QueryParam[String], startingAfterQuery: QueryParam[String], endingBeforeQuery: QueryParam[String], limitQuery: QueryParam[Long]): Task[InlineResponse2005] = {
    implicit val returnTypeDecoder: EntityDecoder[InlineResponse2005] = jsonOf[InlineResponse2005]

    val path = "/fleet/vehicles/stats"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("startMs", Some(startMsQuery.toParamString(startMs))), ("endMs", Some(endMsQuery.toParamString(endMs))), ("series", Some(seriesQuery.toParamString(series))), ("tagIds", Some(tagIdsQuery.toParamString(tagIds))), ("startingAfter", Some(startingAfterQuery.toParamString(startingAfter))), ("endingBefore", Some(endingBeforeQuery.toParamString(endingBefore))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[InlineResponse2005](req)

    } yield resp
  }
  
  def getVehiclesLocations(accessToken: String, startMs: Integer, endMs: Integer)(implicit accessTokenQuery: QueryParam[String], startMsQuery: QueryParam[Integer], endMsQuery: QueryParam[Integer]): Task[List[Any]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Any]] = jsonOf[List[Any]]

    val path = "/fleet/vehicles/locations"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("startMs", Some(startMsQuery.toParamString(startMs))), ("endMs", Some(endMsQuery.toParamString(endMs))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[Any]](req)

    } yield resp
  }
  
  def listContacts(accessToken: String)(implicit accessTokenQuery: QueryParam[String]): Task[List[Contact]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Contact]] = jsonOf[List[Contact]]

    val path = "/contacts"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[Contact]](req)

    } yield resp
  }
  
  def listFleet(accessToken: String, groupParam: InlineObject10, startingAfter: String, endingBefore: String, limit: Long)(implicit accessTokenQuery: QueryParam[String], startingAfterQuery: QueryParam[String], endingBeforeQuery: QueryParam[String], limitQuery: QueryParam[Long]): Task[InlineResponse2002] = {
    implicit val returnTypeDecoder: EntityDecoder[InlineResponse2002] = jsonOf[InlineResponse2002]

    val path = "/fleet/list"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("startingAfter", Some(startingAfterQuery.toParamString(startingAfter))), ("endingBefore", Some(endingBeforeQuery.toParamString(endingBefore))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(groupParam)
      resp          <- client.expect[InlineResponse2002](req)

    } yield resp
  }
  
  def patchFleetVehicle(accessToken: String, vehicleIdOrExternalId: String, data: InlineObject16)(implicit accessTokenQuery: QueryParam[String]): Task[FleetVehicleResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[FleetVehicleResponse] = jsonOf[FleetVehicleResponse]

    val path = "/fleet/vehicles/{vehicle_id_or_external_id}".replaceAll("\\{" + "vehicle_id_or_external_id" + "\\}",escape(vehicleIdOrExternalId.toString))
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(data)
      resp          <- client.expect[FleetVehicleResponse](req)

    } yield resp
  }
  
  def reactivateDriverById(accessToken: String, driverIdOrExternalId: String, reactivateDriverParam: InlineObject4)(implicit accessTokenQuery: QueryParam[String]): Task[Driver] = {
    implicit val returnTypeDecoder: EntityDecoder[Driver] = jsonOf[Driver]

    val path = "/fleet/drivers/inactive/{driver_id_or_external_id}".replaceAll("\\{" + "driver_id_or_external_id" + "\\}",escape(driverIdOrExternalId.toString))
    
    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(reactivateDriverParam)
      resp          <- client.expect[Driver](req)

    } yield resp
  }
  
  def updateDispatchRouteById(accessToken: String, routeId: Long, updateDispatchRouteParams: DispatchRoute)(implicit accessTokenQuery: QueryParam[String]): Task[DispatchRoute] = {
    implicit val returnTypeDecoder: EntityDecoder[DispatchRoute] = jsonOf[DispatchRoute]

    val path = "/fleet/dispatch/routes/{route_id}".replaceAll("\\{" + "route_id" + "\\}",escape(routeId.toString))
    
    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateDispatchRouteParams)
      resp          <- client.expect[DispatchRoute](req)

    } yield resp
  }
  
  def updateOrganizationAddress(accessToken: String, addressId: Long, address: InlineObject1)(implicit accessTokenQuery: QueryParam[String]): Task[Unit] = {
    val path = "/addresses/{addressId}".replaceAll("\\{" + "addressId" + "\\}",escape(addressId.toString))
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(address)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def updateVehicles(accessToken: String, vehicleUpdateParam: InlineObject14)(implicit accessTokenQuery: QueryParam[String]): Task[Unit] = {
    val path = "/fleet/set_data"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(vehicleUpdateParam)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
}
