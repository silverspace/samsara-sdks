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

object TagsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def createTag(host: String, accessToken: String, tagCreateParams: TagCreate)(implicit accessTokenQuery: QueryParam[String]): Task[Tag] = {
    implicit val returnTypeDecoder: EntityDecoder[Tag] = jsonOf[Tag]

    val path = "/tags"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(tagCreateParams)
      resp          <- client.expect[Tag](req)

    } yield resp
  }
  
  def deleteTagById(host: String, accessToken: String, tagId: Long)(implicit accessTokenQuery: QueryParam[String]): Task[Unit] = {
    val path = "/tags/{tag_id}".replaceAll("\\{" + "tag_id" + "\\}",escape(tagId.toString))
    
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
  
  def getAllTags(host: String, accessToken: String, groupId: Long)(implicit accessTokenQuery: QueryParam[String], groupIdQuery: QueryParam[Long]): Task[InlineResponse2009] = {
    implicit val returnTypeDecoder: EntityDecoder[InlineResponse2009] = jsonOf[InlineResponse2009]

    val path = "/tags"
    
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
      resp          <- client.expect[InlineResponse2009](req)

    } yield resp
  }
  
  def getTagById(host: String, accessToken: String, tagId: Long)(implicit accessTokenQuery: QueryParam[String]): Task[Tag] = {
    implicit val returnTypeDecoder: EntityDecoder[Tag] = jsonOf[Tag]

    val path = "/tags/{tag_id}".replaceAll("\\{" + "tag_id" + "\\}",escape(tagId.toString))
    
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
      resp          <- client.expect[Tag](req)

    } yield resp
  }
  
  def modifyTagById(host: String, accessToken: String, tagId: Long, tagModifyParams: TagModify)(implicit accessTokenQuery: QueryParam[String]): Task[Tag] = {
    implicit val returnTypeDecoder: EntityDecoder[Tag] = jsonOf[Tag]

    val path = "/tags/{tag_id}".replaceAll("\\{" + "tag_id" + "\\}",escape(tagId.toString))
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(tagModifyParams)
      resp          <- client.expect[Tag](req)

    } yield resp
  }
  
  def updateTagById(host: String, accessToken: String, tagId: Long, updateTagParams: TagUpdate)(implicit accessTokenQuery: QueryParam[String]): Task[Tag] = {
    implicit val returnTypeDecoder: EntityDecoder[Tag] = jsonOf[Tag]

    val path = "/tags/{tag_id}".replaceAll("\\{" + "tag_id" + "\\}",escape(tagId.toString))
    
    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateTagParams)
      resp          <- client.expect[Tag](req)

    } yield resp
  }
  
}

class HttpServiceTagsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def createTag(accessToken: String, tagCreateParams: TagCreate)(implicit accessTokenQuery: QueryParam[String]): Task[Tag] = {
    implicit val returnTypeDecoder: EntityDecoder[Tag] = jsonOf[Tag]

    val path = "/tags"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(tagCreateParams)
      resp          <- client.expect[Tag](req)

    } yield resp
  }
  
  def deleteTagById(accessToken: String, tagId: Long)(implicit accessTokenQuery: QueryParam[String]): Task[Unit] = {
    val path = "/tags/{tag_id}".replaceAll("\\{" + "tag_id" + "\\}",escape(tagId.toString))
    
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
  
  def getAllTags(accessToken: String, groupId: Long)(implicit accessTokenQuery: QueryParam[String], groupIdQuery: QueryParam[Long]): Task[InlineResponse2009] = {
    implicit val returnTypeDecoder: EntityDecoder[InlineResponse2009] = jsonOf[InlineResponse2009]

    val path = "/tags"
    
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
      resp          <- client.expect[InlineResponse2009](req)

    } yield resp
  }
  
  def getTagById(accessToken: String, tagId: Long)(implicit accessTokenQuery: QueryParam[String]): Task[Tag] = {
    implicit val returnTypeDecoder: EntityDecoder[Tag] = jsonOf[Tag]

    val path = "/tags/{tag_id}".replaceAll("\\{" + "tag_id" + "\\}",escape(tagId.toString))
    
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
      resp          <- client.expect[Tag](req)

    } yield resp
  }
  
  def modifyTagById(accessToken: String, tagId: Long, tagModifyParams: TagModify)(implicit accessTokenQuery: QueryParam[String]): Task[Tag] = {
    implicit val returnTypeDecoder: EntityDecoder[Tag] = jsonOf[Tag]

    val path = "/tags/{tag_id}".replaceAll("\\{" + "tag_id" + "\\}",escape(tagId.toString))
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(tagModifyParams)
      resp          <- client.expect[Tag](req)

    } yield resp
  }
  
  def updateTagById(accessToken: String, tagId: Long, updateTagParams: TagUpdate)(implicit accessTokenQuery: QueryParam[String]): Task[Tag] = {
    implicit val returnTypeDecoder: EntityDecoder[Tag] = jsonOf[Tag]

    val path = "/tags/{tag_id}".replaceAll("\\{" + "tag_id" + "\\}",escape(tagId.toString))
    
    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("accessToken", Some(access_tokenQuery.toParamString(access_token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateTagParams)
      resp          <- client.expect[Tag](req)

    } yield resp
  }
  
}
