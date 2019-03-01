/**
 * Samsara API
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client

import com.sun.jersey.api.client.Client
import com.sun.jersey.api.client.ClientResponse
import com.sun.jersey.api.client.config.ClientConfig
import com.sun.jersey.api.client.config.DefaultClientConfig
import com.sun.jersey.api.client.filter.LoggingFilter

import com.sun.jersey.core.util.MultivaluedMapImpl
import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import java.io.File
import java.net.URLEncoder
import java.util.UUID
import javax.ws.rs.core.MediaType

import scala.collection.JavaConverters._
import scala.collection.mutable

import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.fasterxml.jackson.datatype.joda.JodaModule
import com.fasterxml.jackson.core.JsonGenerator.Feature
import com.fasterxml.jackson.databind._
import com.fasterxml.jackson.annotation._
import com.fasterxml.jackson.databind.annotation.JsonSerialize

object ScalaJsonUtil {
  def getJsonMapper: ObjectMapper = {
    val mapper = new ObjectMapper()
    mapper.registerModule(new DefaultScalaModule())
    mapper.registerModule(new JodaModule())
    mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL)
    mapper.setSerializationInclusion(JsonInclude.Include.NON_DEFAULT)
    mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
    mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY)
    mapper
  }
}

class ApiInvoker(val mapper: ObjectMapper = ScalaJsonUtil.getJsonMapper,
  httpHeaders: mutable.HashMap[String, String] = mutable.HashMap(),
  hostMap: mutable.HashMap[String, Client] = mutable.HashMap(),
  asyncHttpClient: Boolean = false,
  authScheme: String = "",
  authPreemptive: Boolean = false
) {

  var defaultHeaders: mutable.HashMap[String, String] = httpHeaders

  def escape(value: String): String = {
    URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")
  }
  def escape(values: List[String]): String = {
     values.map(escape).mkString(",")
  }

  def escape(value: Long): String = value.toString
  def escape(value: Double): String = value.toString
  def escape(value: Float): String = value.toString
  def escape(value: UUID): String = value.toString

  def deserialize(json: String, containerType: String, cls: Class[_]) = {
    if (cls == classOf[String]) {
      json match {
        case s: String =>
          if (s.startsWith("\"") && s.endsWith("\"") && s.length > 1) {
            s.substring(1, s.length - 1)
          } else {
            s
          }
        case _ => null
      }
    } else {
      containerType.toLowerCase match {
        case "array" =>
          val typeInfo = mapper.getTypeFactory.constructCollectionType(classOf[java.util.List[_]], cls)
          val response = mapper.readValue(json, typeInfo).asInstanceOf[java.util.List[_]]
          response.asScala.toList
        case "list" =>
          val typeInfo = mapper.getTypeFactory.constructCollectionType(classOf[java.util.List[_]], cls)
          val response = mapper.readValue(json, typeInfo).asInstanceOf[java.util.List[_]]
          response.asScala.toList
        case _ =>
          json match {
            case e: String if "\"\"" == e => null
            case _ => mapper.readValue(json, cls)
          }
      }
    }
  }

  def serialize(obj: AnyRef): String = {
    if (obj != null) {
      obj match {
        case e: List[_] => mapper.writeValueAsString(obj.asInstanceOf[List[_]].asJava)
        case _ => mapper.writeValueAsString(obj)
      }
    } else {
        null
    }
  }

  def invokeApi(
    host: String,
    path: String,
    method: String,
    queryParams: Map[String, String],
    formParams: Map[String, String],
    body: AnyRef,
    headerParams: Map[String, String],
    contentType: String
): String = {
    val client = getClient(host)

    val querystring = queryParams.filter(k => k._2 != null).map(k => escape(k._1) + "=" + escape(k._2)).mkString("?", "&", "")
    val builder = client.resource(host + path + querystring).accept(contentType)
    headerParams.map(p => builder.header(p._1, p._2))
    defaultHeaders.foreach(p => {
      if (!headerParams.contains(p._1) && p._2 != null) {
        builder.header(p._1, p._2)
      }
    })
    var formData: MultivaluedMapImpl = null
    if (contentType == "application/x-www-form-urlencoded") {
      formData = new MultivaluedMapImpl()
      formParams.foreach(p => formData.add(p._1, p._2))
    }

    val response: ClientResponse = method match {
      case "GET" => builder.get(classOf[ClientResponse])
      case "POST" =>
        if (formData != null && formData.size() > 0) {
            builder.post(classOf[ClientResponse], formData)
        } else if (body != null && body.isInstanceOf[File]) {
          val file = body.asInstanceOf[File]
          val form = new FormDataMultiPart()
          form.field("filename", file.getName)
          form.bodyPart(new FileDataBodyPart("file", file, MediaType.MULTIPART_FORM_DATA_TYPE))
          builder.post(classOf[ClientResponse], form)
        } else {
          if (body == null) {
            builder.post(classOf[ClientResponse], serialize(body))
          } else {
            builder.`type`(contentType).post(classOf[ClientResponse], serialize(body))
          }
        }
      case "PUT" =>
        if (formData != null) {
            builder.post(classOf[ClientResponse], formData)
        } else if (body == null) {
            builder.put(classOf[ClientResponse], null)
        } else {
            builder.`type`(contentType).put(classOf[ClientResponse], serialize(body))
        }
      case "DELETE" => builder.delete(classOf[ClientResponse])
      case "PATCH" =>
        if(formData != null) {
          builder.header("X-HTTP-Method-Override", "PATCH").post(classOf[ClientResponse], formData)
        } else if(body == null) {
          builder.header("X-HTTP-Method-Override", "PATCH").post(classOf[ClientResponse], null)
        } else {
          builder.header("X-HTTP-Method-Override", "PATCH").`type`(contentType).post(classOf[ClientResponse], serialize(body))
        }
      case _ => null
    }
    response.getStatusInfo.getStatusCode match {
      case 204 => ""
      case code: Int if Range(200, 299).contains(code) =>
        if (response.hasEntity) {
          response.getEntity(classOf[String])
        } else {
          ""
        }
      case _ =>
        val entity = if (response.hasEntity) {
          response.getEntity(classOf[String])
        } else {
          "no data"
        }
        throw new ApiException(response.getStatusInfo.getStatusCode, entity)
    }
  }

  def getClient(host: String): Client = {
    if (hostMap.contains(host)) {
      hostMap(host)
    } else {
      val client = newClient(host)
      // client.addFilter(new LoggingFilter())
      hostMap += host -> client
      client
    }
  }

  def newClient(host: String): Client = if (asyncHttpClient) {
    import com.ning.http.client.Realm
    import org.sonatype.spice.jersey.client.ahc.AhcHttpClient
    import org.sonatype.spice.jersey.client.ahc.config.DefaultAhcConfig

    val config: DefaultAhcConfig = new DefaultAhcConfig()
    if (!authScheme.isEmpty) {
      val authSchemeEnum = Realm.AuthScheme.valueOf(authScheme)
      config
        .getAsyncHttpClientConfigBuilder
        .setRealm(new Realm.RealmBuilder().setScheme(authSchemeEnum)
        .setUsePreemptiveAuth(authPreemptive).build)
    }
    AhcHttpClient.create(config)
  } else {
     Client.create()
  }
}

object ApiInvoker extends ApiInvoker(
  mapper = ScalaJsonUtil.getJsonMapper,
  httpHeaders = mutable.HashMap(),
  hostMap = mutable.HashMap(),
  asyncHttpClient = false,
  authScheme = "",
  authPreemptive = false
)

class ApiException(val code: Int, msg: String) extends RuntimeException(msg)
