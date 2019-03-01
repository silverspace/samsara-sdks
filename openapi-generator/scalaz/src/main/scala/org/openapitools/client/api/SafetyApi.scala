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

object SafetyApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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
  
}

class HttpServiceSafetyApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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
  
}
