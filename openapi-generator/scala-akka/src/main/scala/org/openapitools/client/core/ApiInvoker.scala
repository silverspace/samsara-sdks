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
import java.security.cert.X509Certificate
import javax.net.ssl._

import akka.actor.ActorSystem
import akka.io.IO
import akka.pattern.ask
import akka.util.Timeout
import org.joda.time.DateTime
import org.joda.time.format.ISODateTimeFormat
import org.json4s.JsonAST.JString
import org.json4s._
import org.json4s.jackson.JsonMethods._
import org.json4s.jackson.Serialization
import spray.can.Http
import spray.can.Http.HostConnectorSetup
import spray.client.pipelining
import spray.client.pipelining._
import spray.http.HttpEncodings._
import spray.http.HttpHeaders.{RawHeader, `Accept-Encoding`}
import spray.http.Uri.Query
import spray.http._
import spray.http.parser.HttpParser
import spray.httpx.encoding.{Deflate, Encoder, Gzip}
import spray.httpx.unmarshalling._
import spray.io.ClientSSLEngineProvider

import scala.concurrent.{ExecutionContext, ExecutionContextExecutor, Future}
import scala.reflect.ClassTag
import scala.util.control.NonFatal

object ApiInvoker {

  def apply()(implicit system: ActorSystem): ApiInvoker =
    apply(DefaultFormats + DateTimeSerializer)
  def apply(serializers: Traversable[Serializer[_]])(implicit system: ActorSystem): ApiInvoker =
    apply(DefaultFormats + DateTimeSerializer ++ serializers)
  def apply(formats: Formats)(implicit system: ActorSystem): ApiInvoker = new ApiInvoker(formats)

  case class CustomStatusCode(value: Int, reason: String = "Application-defined status code", isSuccess: Boolean = true)

  def addCustomStatusCode(code: CustomStatusCode): Unit = addCustomStatusCode(code.value, code.reason, code.isSuccess)

  def addCustomStatusCode(code: Int, reason: String = "Application defined code", isSuccess: Boolean = true): Unit = {
    StatusCodes.getForKey(code) foreach { _ =>
      StatusCodes.registerCustom(code, reason, reason, isSuccess, allowsEntity = true)
    }
  }

  /**
   * Allows request execution without calling apiInvoker.execute(request)
   * request.response can be used to get a future of the ApiResponse generated.
   * request.result can be used to get a future of the expected ApiResponse content. If content doesn't match, a
   *    Future will failed with a ClassCastException
   * @param request the apiRequest to be executed
   */
  implicit class ApiRequestImprovements[T](request: ApiRequest[T]) {

    def response(invoker: ApiInvoker)(implicit ec: ExecutionContext, system: ActorSystem): Future[ApiResponse[T]] =
      response(ec, system, invoker)

    def response(implicit ec: ExecutionContext, system: ActorSystem, invoker: ApiInvoker): Future[ApiResponse[T]] =
      invoker.execute(request)

    def result[U <: T](implicit c: ClassTag[U], ec: ExecutionContext, system: ActorSystem, invoker: ApiInvoker): Future[U] =
      invoker.execute(request).map(_.content).mapTo[U]

  }

  /**
   * Allows transformation from ApiMethod to spray HttpMethods
   * @param method the ApiMethod to be converted
   */
  implicit class ApiMethodExtensions(val method: ApiMethod) {
    def toSprayMethod: HttpMethod = HttpMethods.getForKey(method.value).getOrElse(HttpMethods.GET)
  }

  case object DateTimeSerializer extends CustomSerializer[DateTime](format => ( {
    case JString(s) =>
      ISODateTimeFormat.dateOptionalTimeParser().parseDateTime(s)
  }, {
    case d: DateTime =>
      JString(ISODateTimeFormat.dateTime().print(d))
  }))
}

class ApiInvoker(formats: Formats)(implicit system: ActorSystem) extends UntrustedSslContext with CustomContentTypes {

  import org.openapitools.client.core.ApiInvoker._
  import org.openapitools.client.core.ParametersMap._

  implicit val ec: ExecutionContextExecutor = system.dispatcher
  implicit val jsonFormats: Formats = formats

  def settings = ApiSettings(system)

  import spray.http.MessagePredicate._

  val CompressionFilter: MessagePredicate= MessagePredicate({ _ => settings.compressionEnabled}) &&
    Encoder.DefaultFilter && minEntitySize(settings.compressionSizeThreshold)

  settings.customCodes.foreach(addCustomStatusCode)

  private def addAuthentication(credentialsSeq: Seq[Credentials]): pipelining.RequestTransformer =
    request =>
      credentialsSeq.foldLeft(request) {
        case (req, BasicCredentials(login, password)) =>
          req ~> addCredentials(BasicHttpCredentials(login, password))
        case (req, ApiKeyCredentials(keyValue, keyName, ApiKeyLocations.HEADER)) =>
          req ~> addHeader(RawHeader(keyName, keyValue.value))
        case (req, _) => req
      }

  private def addHeaders(headers: Map[String, Any]): pipelining.RequestTransformer = { request =>

    val rawHeaders = for {
      (name, value) <- headers.asFormattedParams
      header = RawHeader(name, String.valueOf(value))
    } yield header

    request.withHeaders(rawHeaders.toList)
  }

  private def bodyPart(name: String, value: Any): BodyPart = {
    value match {
      case f: File =>
        BodyPart(f, name)
      case v: String =>
        BodyPart(HttpEntity(String.valueOf(v)))
      case NumericValue(v) =>
        BodyPart(HttpEntity(String.valueOf(v)))
      case m: ApiModel =>
        BodyPart(HttpEntity(Serialization.write(m)))
    }
  }

  private def formDataContent(request: ApiRequest[_]) = {
    val params = request.formParams.asFormattedParams
    if (params.isEmpty)
      None
    else
      Some(
        normalizedContentType(request.contentType).mediaType match {
          case MediaTypes.`multipart/form-data` =>
            MultipartFormData(params.map { case (name, value) => (name, bodyPart(name, value))})
          case MediaTypes.`application/x-www-form-urlencoded` =>
            FormData(params.mapValues(String.valueOf))
          case m: MediaType => // Default : application/x-www-form-urlencoded.
            FormData(params.mapValues(String.valueOf))
        }
      )
  }

  private def bodyContent(request: ApiRequest[_]): Option[Any] = {
    request.bodyParam.map(Extraction.decompose).map(compact)
  }

  private def createRequest(uri: Uri, request: ApiRequest[_]): HttpRequest = {

    val builder = new RequestBuilder(request.method.toSprayMethod)
    val httpRequest = request.method.toSprayMethod match {
      case HttpMethods.GET | HttpMethods.DELETE => builder.apply(uri)
      case HttpMethods.POST | HttpMethods.PUT =>
        formDataContent(request) orElse bodyContent(request) match {
          case Some(c: FormData) =>
            builder.apply(uri, c)
          case Some(c: MultipartFormData) =>
            builder.apply(uri, c)
          case Some(c: String) =>
            builder.apply(uri, HttpEntity(normalizedContentType(request.contentType), c))
          case _ =>
            builder.apply(uri, HttpEntity(normalizedContentType(request.contentType), " "))
        }
      case _ => builder.apply(uri)
    }

    httpRequest ~>
      addHeaders(request.headerParams) ~>
      addAuthentication(request.credentials) ~>
      encode(Gzip(CompressionFilter))
  }

  def makeQuery(r: ApiRequest[_]): Query = {
    r.credentials.foldLeft(r.queryParams) {
      case (params, ApiKeyCredentials(key, keyName, ApiKeyLocations.QUERY)) =>
        params + (keyName -> key.value)
      case (params, _) => params
    }.asFormattedParams
      .mapValues(String.valueOf)
      .foldRight[Query](Uri.Query.Empty) {
      case ((name, value), acc) => acc.+:(name, value)
    }
  }

  def makeUri(r: ApiRequest[_]): Uri = {
    val opPath = r.operationPath.replaceAll("\\{format\\}", "json")
    val opPathWithParams = r.pathParams.asFormattedParams
      .mapValues(String.valueOf)
      .foldLeft(opPath) {
      case (path, (name, value)) => path.replaceAll(s"\\{$name\\}", value)
    }
    val query = makeQuery(r)

    Uri(r.basePath + opPathWithParams).withQuery(query)
  }

  def execute[T](r: ApiRequest[T]): Future[ApiResponse[T]] = {
    try {
      implicit val timeout: Timeout = settings.connectionTimeout

      val uri = makeUri(r)

      val connector = HostConnectorSetup(
        uri.authority.host.toString,
        uri.effectivePort,
        sslEncryption = "https".equals(uri.scheme),
        defaultHeaders = settings.defaultHeaders ++ List(`Accept-Encoding`(gzip, deflate)))

      val request = createRequest(uri, r)

      for {
        Http.HostConnectorInfo(hostConnector, _) <- IO(Http) ? connector
        response <- hostConnector.ask(request).mapTo[HttpResponse]
      } yield {
        response ~> decode(Deflate) ~> decode(Gzip) ~> unmarshallApiResponse(r)
      }
    }
    catch {
      case NonFatal(x) => Future.failed(x)
    }
  }

  def unmarshallApiResponse[T](request: ApiRequest[T])(response: HttpResponse): ApiResponse[T] = {
    request.responseForCode(response.status.intValue) match {
      case Some( (manifest: Manifest[T], state: ResponseState) ) =>
        entityUnmarshaller(manifest)(response.entity) match {
          case Right(value) ⇒
            state match {
              case ResponseState.Success =>
                ApiResponse(response.status.intValue, value, response.headers.map(header => (header.name, header.value)).toMap)
              case ResponseState.Error =>
                throw ApiError(response.status.intValue, "Error response received",
                  Some(value),
                  headers = response.headers.map(header => (header.name, header.value)).toMap)
            }

          case Left(MalformedContent(error, Some(cause))) ⇒
            throw ApiError(response.status.intValue, s"Unable to unmarshall content to [$manifest]", Some(response.entity.toString), cause)

          case Left(MalformedContent(error, None)) ⇒
            throw ApiError(response.status.intValue, s"Unable to unmarshall content to [$manifest]", Some(response.entity.toString))

          case Left(ContentExpected) ⇒
            throw ApiError(response.status.intValue, s"Unable to unmarshall empty response to [$manifest]", Some(response.entity.toString))
        }

      case _ => throw ApiError(response.status.intValue, "Unexpected response code", Some(response.entity.toString))
    }
  }

  def entityUnmarshaller[T](implicit mf: Manifest[T]): Unmarshaller[T] =
    Unmarshaller[T](MediaTypes.`application/json`) {
      case x: HttpEntity.NonEmpty ⇒
        parse(x.asString(defaultCharset = HttpCharsets.`UTF-8`))
          .noNulls
          .camelizeKeys
          .extract[T]
    }

}

sealed trait CustomContentTypes {

  def normalizedContentType(original: String): ContentType =
    MediaTypes.forExtension(original) map (ContentType(_)) getOrElse parseContentType(original)

  def parseContentType(contentType: String): ContentType = {
    val contentTypeAsRawHeader = HttpHeaders.RawHeader("Content-Type", contentType)
    val parsedContentTypeHeader = HttpParser.parseHeader(contentTypeAsRawHeader)
    (parsedContentTypeHeader: @unchecked) match {
      case Right(ct: HttpHeaders.`Content-Type`) =>
        ct.contentType
      case Left(error: ErrorInfo) =>
        throw new IllegalArgumentException(
          s"Error converting '$contentType' to a ContentType header: '${error.summary}'")
    }
  }
}

sealed trait UntrustedSslContext {
  this: ApiInvoker =>

  implicit lazy val trustfulSslContext: SSLContext = {
    settings.alwaysTrustCertificates match {
      case false =>
        SSLContext.getDefault

      case true =>
        class IgnoreX509TrustManager extends X509TrustManager {
          def checkClientTrusted(chain: Array[X509Certificate], authType: String): Unit = {}

          def checkServerTrusted(chain: Array[X509Certificate], authType: String): Unit = {}

          def getAcceptedIssuers = null
        }

        val context = SSLContext.getInstance("TLS")
        context.init(null, Array(new IgnoreX509TrustManager), null)
        context
    }
  }

  implicit val clientSSLEngineProvider =
    ClientSSLEngineProvider {
      _ =>
        val engine = trustfulSslContext.createSSLEngine()
        engine.setUseClientMode(true)
        engine
    }
}
