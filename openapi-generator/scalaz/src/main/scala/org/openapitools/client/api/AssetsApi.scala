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

object AssetsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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
  
}

class HttpServiceAssetsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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
  
}
