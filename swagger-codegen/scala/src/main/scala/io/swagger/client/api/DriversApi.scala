/**
 * Samsara API
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api

import java.text.SimpleDateFormat

import io.swagger.client.model.CurrentDriver
import io.swagger.client.model.Driver
import io.swagger.client.model.DriverForCreate
import io.swagger.client.model.ErrorResponse
import io.swagger.client.model.ReactivateDriverParam
import io.swagger.client.{ApiInvoker, ApiException}

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date
import java.util.TimeZone

import scala.collection.mutable.HashMap

import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

import java.net.URI

import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

import org.json4s._

class DriversApi(
  val defBasePath: String = "https://api.samsara.com/v1",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new DriversApiAsyncHelper(client, config)

  /**
   * /fleet/drivers/create
   * Create a new driver.
   *
   * @param accessToken Samsara API access token. 
   * @param createDriverParam Driver creation body 
   * @return Driver
   */
  def createDriver(accessToken: String, createDriverParam: DriverForCreate): Option[Driver] = {
    val await = Try(Await.result(createDriverAsync(accessToken, createDriverParam), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/drivers/create asynchronously
   * Create a new driver.
   *
   * @param accessToken Samsara API access token. 
   * @param createDriverParam Driver creation body 
   * @return Future(Driver)
   */
  def createDriverAsync(accessToken: String, createDriverParam: DriverForCreate): Future[Driver] = {
      helper.createDriver(accessToken, createDriverParam)
  }

  /**
   * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
   * Deactivate a driver with the given id.
   *
   * @param accessToken Samsara API access token. 
   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
   * @return void
   */
  def deactivateDriver(accessToken: String, driverIdOrExternalId: String) = {
    val await = Try(Await.result(deactivateDriverAsync(accessToken, driverIdOrExternalId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} asynchronously
   * Deactivate a driver with the given id.
   *
   * @param accessToken Samsara API access token. 
   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
   * @return Future(void)
   */
  def deactivateDriverAsync(accessToken: String, driverIdOrExternalId: String) = {
      helper.deactivateDriver(accessToken, driverIdOrExternalId)
  }

  /**
   * /fleet/drivers/inactive
   * Fetch all deactivated drivers for the group.
   *
   * @param accessToken Samsara API access token. 
   * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
   * @return List[Driver]
   */
  def getAllDeactivatedDrivers(accessToken: String, groupId: Option[Long] = None): Option[List[Driver]] = {
    val await = Try(Await.result(getAllDeactivatedDriversAsync(accessToken, groupId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/drivers/inactive asynchronously
   * Fetch all deactivated drivers for the group.
   *
   * @param accessToken Samsara API access token. 
   * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
   * @return Future(List[Driver])
   */
  def getAllDeactivatedDriversAsync(accessToken: String, groupId: Option[Long] = None): Future[List[Driver]] = {
      helper.getAllDeactivatedDrivers(accessToken, groupId)
  }

  /**
   * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
   * Fetch deactivated driver by id.
   *
   * @param accessToken Samsara API access token. 
   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
   * @return Driver
   */
  def getDeactivatedDriverById(accessToken: String, driverIdOrExternalId: String): Option[Driver] = {
    val await = Try(Await.result(getDeactivatedDriverByIdAsync(accessToken, driverIdOrExternalId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} asynchronously
   * Fetch deactivated driver by id.
   *
   * @param accessToken Samsara API access token. 
   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
   * @return Future(Driver)
   */
  def getDeactivatedDriverByIdAsync(accessToken: String, driverIdOrExternalId: String): Future[Driver] = {
      helper.getDeactivatedDriverById(accessToken, driverIdOrExternalId)
  }

  /**
   * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
   * Fetch driver by id.
   *
   * @param accessToken Samsara API access token. 
   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
   * @return CurrentDriver
   */
  def getDriverById(accessToken: String, driverIdOrExternalId: String): Option[CurrentDriver] = {
    val await = Try(Await.result(getDriverByIdAsync(accessToken, driverIdOrExternalId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} asynchronously
   * Fetch driver by id.
   *
   * @param accessToken Samsara API access token. 
   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
   * @return Future(CurrentDriver)
   */
  def getDriverByIdAsync(accessToken: String, driverIdOrExternalId: String): Future[CurrentDriver] = {
      helper.getDriverById(accessToken, driverIdOrExternalId)
  }

  /**
   * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
   * Reactivate the inactive driver having id.
   *
   * @param accessToken Samsara API access token. 
   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
   * @param reactivateDriverParam Driver reactivation body 
   * @return CurrentDriver
   */
  def reactivateDriverById(accessToken: String, driverIdOrExternalId: String, reactivateDriverParam: ReactivateDriverParam): Option[CurrentDriver] = {
    val await = Try(Await.result(reactivateDriverByIdAsync(accessToken, driverIdOrExternalId, reactivateDriverParam), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} asynchronously
   * Reactivate the inactive driver having id.
   *
   * @param accessToken Samsara API access token. 
   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
   * @param reactivateDriverParam Driver reactivation body 
   * @return Future(CurrentDriver)
   */
  def reactivateDriverByIdAsync(accessToken: String, driverIdOrExternalId: String, reactivateDriverParam: ReactivateDriverParam): Future[CurrentDriver] = {
      helper.reactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam)
  }

}

class DriversApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createDriver(accessToken: String,
    createDriverParam: DriverForCreate)(implicit reader: ClientResponseReader[Driver], writer: RequestWriter[DriverForCreate]): Future[Driver] = {
    // create path and map variables
    val path = (addFmt("/fleet/drivers/create"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling DriversApi->createDriver")

    if (createDriverParam == null) throw new Exception("Missing required parameter 'createDriverParam' when calling DriversApi->createDriver")
    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(createDriverParam))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deactivateDriver(accessToken: String,
    driverIdOrExternalId: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/fleet/drivers/{driver_id_or_external_id}")
      replaceAll("\\{" + "driver_id_or_external_id" + "\\}", driverIdOrExternalId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling DriversApi->deactivateDriver")

    if (driverIdOrExternalId == null) throw new Exception("Missing required parameter 'driverIdOrExternalId' when calling DriversApi->deactivateDriver")

    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getAllDeactivatedDrivers(accessToken: String,
    groupId: Option[Long] = None
    )(implicit reader: ClientResponseReader[List[Driver]]): Future[List[Driver]] = {
    // create path and map variables
    val path = (addFmt("/fleet/drivers/inactive"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling DriversApi->getAllDeactivatedDrivers")

    queryParams += "access_token" -> accessToken.toString
    groupId match {
      case Some(param) => queryParams += "group_id" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getDeactivatedDriverById(accessToken: String,
    driverIdOrExternalId: String)(implicit reader: ClientResponseReader[Driver]): Future[Driver] = {
    // create path and map variables
    val path = (addFmt("/fleet/drivers/inactive/{driver_id_or_external_id}")
      replaceAll("\\{" + "driver_id_or_external_id" + "\\}", driverIdOrExternalId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling DriversApi->getDeactivatedDriverById")

    if (driverIdOrExternalId == null) throw new Exception("Missing required parameter 'driverIdOrExternalId' when calling DriversApi->getDeactivatedDriverById")

    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getDriverById(accessToken: String,
    driverIdOrExternalId: String)(implicit reader: ClientResponseReader[CurrentDriver]): Future[CurrentDriver] = {
    // create path and map variables
    val path = (addFmt("/fleet/drivers/{driver_id_or_external_id}")
      replaceAll("\\{" + "driver_id_or_external_id" + "\\}", driverIdOrExternalId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling DriversApi->getDriverById")

    if (driverIdOrExternalId == null) throw new Exception("Missing required parameter 'driverIdOrExternalId' when calling DriversApi->getDriverById")

    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def reactivateDriverById(accessToken: String,
    driverIdOrExternalId: String,
    reactivateDriverParam: ReactivateDriverParam)(implicit reader: ClientResponseReader[CurrentDriver], writer: RequestWriter[ReactivateDriverParam]): Future[CurrentDriver] = {
    // create path and map variables
    val path = (addFmt("/fleet/drivers/inactive/{driver_id_or_external_id}")
      replaceAll("\\{" + "driver_id_or_external_id" + "\\}", driverIdOrExternalId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessToken == null) throw new Exception("Missing required parameter 'accessToken' when calling DriversApi->reactivateDriverById")

    if (driverIdOrExternalId == null) throw new Exception("Missing required parameter 'driverIdOrExternalId' when calling DriversApi->reactivateDriverById")

    if (reactivateDriverParam == null) throw new Exception("Missing required parameter 'reactivateDriverParam' when calling DriversApi->reactivateDriverById")
    queryParams += "access_token" -> accessToken.toString

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(reactivateDriverParam))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
