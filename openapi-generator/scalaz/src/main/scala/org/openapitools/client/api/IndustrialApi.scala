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

object IndustrialApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getAllDataInputs(host: String, accessToken: String, groupId: Long, startMs: Long, endMs: Long)(implicit accessTokenQuery: QueryParam[String], groupIdQuery: QueryParam[Long], startMsQuery: QueryParam[Long], endMsQuery: QueryParam[Long]): Task[InlineResponse2006] = {
    implicit val returnTypeDecoder: EntityDecoder[InlineResponse2006] = jsonOf[InlineResponse2006]

    val path = "/industrial/data"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("groupId", Some(group_idQuery.toParamString(group_id))), ("startMs", Some(startMsQuery.toParamString(startMs))), ("endMs", Some(endMsQuery.toParamString(endMs))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[InlineResponse2006](req)

    } yield resp
  }
  
  def getDataInput(host: String, accessToken: String, dataInputId: Long, startMs: Long, endMs: Long)(implicit accessTokenQuery: QueryParam[String], startMsQuery: QueryParam[Long], endMsQuery: QueryParam[Long]): Task[DataInputHistoryResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DataInputHistoryResponse] = jsonOf[DataInputHistoryResponse]

    val path = "/industrial/data/{data_input_id}".replaceAll("\\{" + "data_input_id" + "\\}",escape(dataInputId.toString))
    
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
      resp          <- client.expect[DataInputHistoryResponse](req)

    } yield resp
  }
  
  def getMachines(host: String, accessToken: String, groupParam: InlineObject18)(implicit accessTokenQuery: QueryParam[String]): Task[InlineResponse2007] = {
    implicit val returnTypeDecoder: EntityDecoder[InlineResponse2007] = jsonOf[InlineResponse2007]

    val path = "/machines/list"
    
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
      resp          <- client.expect[InlineResponse2007](req)

    } yield resp
  }
  
  def getMachinesHistory(host: String, accessToken: String, historyParam: InlineObject17)(implicit accessTokenQuery: QueryParam[String]): Task[MachineHistoryResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[MachineHistoryResponse] = jsonOf[MachineHistoryResponse]

    val path = "/machines/history"
    
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
      resp          <- client.expect[MachineHistoryResponse](req)

    } yield resp
  }
  
}

class HttpServiceIndustrialApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getAllDataInputs(accessToken: String, groupId: Long, startMs: Long, endMs: Long)(implicit accessTokenQuery: QueryParam[String], groupIdQuery: QueryParam[Long], startMsQuery: QueryParam[Long], endMsQuery: QueryParam[Long]): Task[InlineResponse2006] = {
    implicit val returnTypeDecoder: EntityDecoder[InlineResponse2006] = jsonOf[InlineResponse2006]

    val path = "/industrial/data"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))), ("groupId", Some(group_idQuery.toParamString(group_id))), ("startMs", Some(startMsQuery.toParamString(startMs))), ("endMs", Some(endMsQuery.toParamString(endMs))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[InlineResponse2006](req)

    } yield resp
  }
  
  def getDataInput(accessToken: String, dataInputId: Long, startMs: Long, endMs: Long)(implicit accessTokenQuery: QueryParam[String], startMsQuery: QueryParam[Long], endMsQuery: QueryParam[Long]): Task[DataInputHistoryResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DataInputHistoryResponse] = jsonOf[DataInputHistoryResponse]

    val path = "/industrial/data/{data_input_id}".replaceAll("\\{" + "data_input_id" + "\\}",escape(dataInputId.toString))
    
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
      resp          <- client.expect[DataInputHistoryResponse](req)

    } yield resp
  }
  
  def getMachines(accessToken: String, groupParam: InlineObject18)(implicit accessTokenQuery: QueryParam[String]): Task[InlineResponse2007] = {
    implicit val returnTypeDecoder: EntityDecoder[InlineResponse2007] = jsonOf[InlineResponse2007]

    val path = "/machines/list"
    
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
      resp          <- client.expect[InlineResponse2007](req)

    } yield resp
  }
  
  def getMachinesHistory(accessToken: String, historyParam: InlineObject17)(implicit accessTokenQuery: QueryParam[String]): Task[MachineHistoryResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[MachineHistoryResponse] = jsonOf[MachineHistoryResponse]

    val path = "/machines/history"
    
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
      resp          <- client.expect[MachineHistoryResponse](req)

    } yield resp
  }
  
}
