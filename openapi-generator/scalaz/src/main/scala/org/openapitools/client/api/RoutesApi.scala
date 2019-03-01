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

object RoutesApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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
  
}

class HttpServiceRoutesApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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
  
}
