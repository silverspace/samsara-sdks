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

object UsersApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deleteUserById(host: String, accessToken: String, userId: Long)(implicit accessTokenQuery: QueryParam[String]): Task[Unit] = {
    val path = "/users/{userId}".replaceAll("\\{" + "userId" + "\\}",escape(userId.toString))
    
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
  
  def getUserById(host: String, accessToken: String, userId: Long)(implicit accessTokenQuery: QueryParam[String]): Task[User] = {
    implicit val returnTypeDecoder: EntityDecoder[User] = jsonOf[User]

    val path = "/users/{userId}".replaceAll("\\{" + "userId" + "\\}",escape(userId.toString))
    
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
      resp          <- client.expect[User](req)

    } yield resp
  }
  
  def listUserRoles(host: String, accessToken: String)(implicit accessTokenQuery: QueryParam[String]): Task[List[UserRole]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[UserRole]] = jsonOf[List[UserRole]]

    val path = "/user_roles"
    
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
      resp          <- client.expect[List[UserRole]](req)

    } yield resp
  }
  
  def listUsers(host: String, accessToken: String)(implicit accessTokenQuery: QueryParam[String]): Task[List[User]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[User]] = jsonOf[List[User]]

    val path = "/users"
    
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
      resp          <- client.expect[List[User]](req)

    } yield resp
  }
  
}

class HttpServiceUsersApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deleteUserById(accessToken: String, userId: Long)(implicit accessTokenQuery: QueryParam[String]): Task[Unit] = {
    val path = "/users/{userId}".replaceAll("\\{" + "userId" + "\\}",escape(userId.toString))
    
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
  
  def getUserById(accessToken: String, userId: Long)(implicit accessTokenQuery: QueryParam[String]): Task[User] = {
    implicit val returnTypeDecoder: EntityDecoder[User] = jsonOf[User]

    val path = "/users/{userId}".replaceAll("\\{" + "userId" + "\\}",escape(userId.toString))
    
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
      resp          <- client.expect[User](req)

    } yield resp
  }
  
  def listUserRoles(accessToken: String)(implicit accessTokenQuery: QueryParam[String]): Task[List[UserRole]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[UserRole]] = jsonOf[List[UserRole]]

    val path = "/user_roles"
    
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
      resp          <- client.expect[List[UserRole]](req)

    } yield resp
  }
  
  def listUsers(accessToken: String)(implicit accessTokenQuery: QueryParam[String]): Task[List[User]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[User]] = jsonOf[List[User]]

    val path = "/users"
    
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
      resp          <- client.expect[List[User]](req)

    } yield resp
  }
  
}
