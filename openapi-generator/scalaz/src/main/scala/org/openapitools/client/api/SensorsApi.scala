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

object SensorsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getSensors(host: String, accessToken: String, groupParam: InlineObject23)(implicit accessTokenQuery: QueryParam[String]): Task[InlineResponse2008] = {
    implicit val returnTypeDecoder: EntityDecoder[InlineResponse2008] = jsonOf[InlineResponse2008]

    val path = "/sensors/list"
    
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
      resp          <- client.expect[InlineResponse2008](req)

    } yield resp
  }
  
  def getSensorsCargo(host: String, accessToken: String, sensorParam: InlineObject19)(implicit accessTokenQuery: QueryParam[String]): Task[CargoResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CargoResponse] = jsonOf[CargoResponse]

    val path = "/sensors/cargo"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(sensorParam)
      resp          <- client.expect[CargoResponse](req)

    } yield resp
  }
  
  def getSensorsDoor(host: String, accessToken: String, sensorParam: InlineObject20)(implicit accessTokenQuery: QueryParam[String]): Task[DoorResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DoorResponse] = jsonOf[DoorResponse]

    val path = "/sensors/door"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(sensorParam)
      resp          <- client.expect[DoorResponse](req)

    } yield resp
  }
  
  def getSensorsHistory(host: String, accessToken: String, historyParam: InlineObject21)(implicit accessTokenQuery: QueryParam[String]): Task[SensorHistoryResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SensorHistoryResponse] = jsonOf[SensorHistoryResponse]

    val path = "/sensors/history"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(historyParam)
      resp          <- client.expect[SensorHistoryResponse](req)

    } yield resp
  }
  
  def getSensorsHumidity(host: String, accessToken: String, sensorParam: InlineObject22)(implicit accessTokenQuery: QueryParam[String]): Task[HumidityResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[HumidityResponse] = jsonOf[HumidityResponse]

    val path = "/sensors/humidity"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(sensorParam)
      resp          <- client.expect[HumidityResponse](req)

    } yield resp
  }
  
  def getSensorsTemperature(host: String, accessToken: String, sensorParam: InlineObject24)(implicit accessTokenQuery: QueryParam[String]): Task[TemperatureResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[TemperatureResponse] = jsonOf[TemperatureResponse]

    val path = "/sensors/temperature"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(sensorParam)
      resp          <- client.expect[TemperatureResponse](req)

    } yield resp
  }
  
}

class HttpServiceSensorsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getSensors(accessToken: String, groupParam: InlineObject23)(implicit accessTokenQuery: QueryParam[String]): Task[InlineResponse2008] = {
    implicit val returnTypeDecoder: EntityDecoder[InlineResponse2008] = jsonOf[InlineResponse2008]

    val path = "/sensors/list"
    
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
      resp          <- client.expect[InlineResponse2008](req)

    } yield resp
  }
  
  def getSensorsCargo(accessToken: String, sensorParam: InlineObject19)(implicit accessTokenQuery: QueryParam[String]): Task[CargoResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CargoResponse] = jsonOf[CargoResponse]

    val path = "/sensors/cargo"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(sensorParam)
      resp          <- client.expect[CargoResponse](req)

    } yield resp
  }
  
  def getSensorsDoor(accessToken: String, sensorParam: InlineObject20)(implicit accessTokenQuery: QueryParam[String]): Task[DoorResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DoorResponse] = jsonOf[DoorResponse]

    val path = "/sensors/door"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(sensorParam)
      resp          <- client.expect[DoorResponse](req)

    } yield resp
  }
  
  def getSensorsHistory(accessToken: String, historyParam: InlineObject21)(implicit accessTokenQuery: QueryParam[String]): Task[SensorHistoryResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SensorHistoryResponse] = jsonOf[SensorHistoryResponse]

    val path = "/sensors/history"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(historyParam)
      resp          <- client.expect[SensorHistoryResponse](req)

    } yield resp
  }
  
  def getSensorsHumidity(accessToken: String, sensorParam: InlineObject22)(implicit accessTokenQuery: QueryParam[String]): Task[HumidityResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[HumidityResponse] = jsonOf[HumidityResponse]

    val path = "/sensors/humidity"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(sensorParam)
      resp          <- client.expect[HumidityResponse](req)

    } yield resp
  }
  
  def getSensorsTemperature(accessToken: String, sensorParam: InlineObject24)(implicit accessTokenQuery: QueryParam[String]): Task[TemperatureResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[TemperatureResponse] = jsonOf[TemperatureResponse]

    val path = "/sensors/temperature"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(sensorParam)
      resp          <- client.expect[TemperatureResponse](req)

    } yield resp
  }
  
}
