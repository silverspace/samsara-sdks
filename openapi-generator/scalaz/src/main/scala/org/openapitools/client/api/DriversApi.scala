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

object DriversApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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
  
}

class HttpServiceDriversApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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
  
}
