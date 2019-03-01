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
package org.openapitools.client.core

import java.io.File
import java.net.URLEncoder

import scala.util.Try

sealed trait ApiReturnWithHeaders {
  def headers: Map[String, String]

  def header(name: String): Option[String] = headers.get(name)

  def getStringHeader(name: String): Option[String] = header(name)

  // workaround: return date time header in string instead of datetime object
  def getDateTimeHeader(name: String): Option[String] = header(name)

  def getIntHeader(name: String): Option[Int] = castedHeader(name, java.lang.Integer.parseInt)

  def getLongHeader(name: String): Option[Long] = castedHeader(name, java.lang.Long.parseLong)

  def getFloatHeader(name: String): Option[Float] = castedHeader(name, java.lang.Float.parseFloat)

  def getDoubleHeader(name: String): Option[Double] = castedHeader(name, java.lang.Double.parseDouble)

  def getBooleanHeader(name: String): Option[Boolean] = castedHeader(name, java.lang.Boolean.parseBoolean)

  private def castedHeader[U](name: String, conversion: String => U): Option[U] = {
    Try {
      header(name).map(conversion)
    }.get
  }
}

sealed case class ApiResponse[T](code: Int, content: T, headers: Map[String, String] = Map.empty)
  extends ApiReturnWithHeaders

sealed case class ApiError[T](code: Int, message: String, responseContent: Option[T], cause: Throwable = null, headers: Map[String, String] = Map.empty)
  extends Throwable(s"($code) $message.${responseContent.map(s => s" Content : $s").getOrElse("")}", cause)
    with ApiReturnWithHeaders

sealed case class ApiMethod(value: String)

object ApiMethods {
  val CONNECT = ApiMethod("CONNECT")
  val DELETE = ApiMethod("DELETE")
  val GET = ApiMethod("GET")
  val HEAD = ApiMethod("HEAD")
  val OPTIONS = ApiMethod("OPTIONS")
  val PATCH = ApiMethod("PATCH")
  val POST = ApiMethod("POST")
  val PUT = ApiMethod("PUT")
  val TRACE = ApiMethod("TRACE")
}

/**
 * This trait needs to be added to any model defined by the api.
 */
trait ApiModel

/**
 * Single trait defining a credential that can be transformed to a paramName / paramValue tupple
 */
sealed trait Credentials {
  def asQueryParam: Option[(String, String)] = None
}

sealed case class BasicCredentials(user: String, password: String) extends Credentials

sealed case class ApiKeyCredentials(key: ApiKeyValue, keyName: String, location: ApiKeyLocation) extends Credentials {
  override def asQueryParam: Option[(String, String)] = location match {
    case ApiKeyLocations.QUERY => Some((keyName, key.value))
    case _ => None
  }
}

sealed case class ApiKeyValue(value: String)

sealed trait ApiKeyLocation

object ApiKeyLocations {

  case object QUERY extends ApiKeyLocation

  case object HEADER extends ApiKeyLocation

}


/**
 * Case class used to unapply numeric values only in pattern matching
 *
 * @param value the string representation of the numeric value
 */
sealed case class NumericValue(value: String) {
  override def toString: String = value
}

object NumericValue {
  def unapply(n: Any): Option[NumericValue] = n match {
    case (_: Int | _: Long | _: Float | _: Double | _: Boolean | _: Byte) => Some(NumericValue(String.valueOf(n)))
    case _ => None
  }
}

/**
 * Used for params being arrays
 */
sealed case class ArrayValues(values: Seq[Any], format: CollectionFormat = CollectionFormats.CSV)

object ArrayValues {
  def apply(values: Option[Seq[Any]], format: CollectionFormat): ArrayValues =
    ArrayValues(values.getOrElse(Seq.empty), format)

  def apply(values: Option[Seq[Any]]): ArrayValues = ArrayValues(values, CollectionFormats.CSV)
}


/**
 * Defines how arrays should be rendered in query strings.
 */
sealed trait CollectionFormat

trait MergedArrayFormat extends CollectionFormat {
  def separator: String
}

object CollectionFormats {

  case object CSV extends MergedArrayFormat {
    override val separator = ","
  }

  case object TSV extends MergedArrayFormat {
    override val separator = "\t"
  }

  case object SSV extends MergedArrayFormat {
    override val separator = " "
  }

  case object PIPES extends MergedArrayFormat {
    override val separator = "|"
  }

  case object MULTI extends CollectionFormat

}

object ParametersMap {

  /**
   * Pimp parameters maps (Map[String, Any]) in order to transform them in a sequence of String -> Any tupples,
   * with valid url-encoding, arrays handling, files preservation, ...
   */
  implicit class ParametersMapImprovements(val m: Map[String, Any]) {

    def asFormattedParamsList: List[(String, Any)] = m.toList.flatMap(formattedParams)

    def asFormattedParams: Map[String, Any] = m.flatMap(formattedParams)

    private def urlEncode(v: Any) = URLEncoder.encode(String.valueOf(v), "utf-8").replaceAll("\\+", "%20")

    private def formattedParams(tuple: (String, Any)): Seq[(String, Any)] = formattedParams(tuple._1, tuple._2)

    private def formattedParams(name: String, value: Any): Seq[(String, Any)] = value match {
      case arr: ArrayValues =>
        arr.format match {
          case CollectionFormats.MULTI => arr.values.flatMap(formattedParams(name, _))
          case format: MergedArrayFormat => Seq((name, arr.values.mkString(format.separator)))
        }
      case None => Seq.empty
      case Some(opt) => formattedParams(name, opt)
      case s: Seq[Any] => formattedParams(name, ArrayValues(s))
      case v: String => Seq((name, urlEncode(v)))
      case NumericValue(v) => Seq((name, urlEncode(v)))
      case f: File => Seq((name, f))
      case m: ApiModel => Seq((name, m))
    }
  }

}
