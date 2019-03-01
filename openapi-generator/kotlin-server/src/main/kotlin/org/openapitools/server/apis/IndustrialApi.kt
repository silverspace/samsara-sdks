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
package org.openapitools.server.apis

import com.google.gson.Gson
import io.ktor.application.call
import io.ktor.auth.UserIdPrincipal
import io.ktor.auth.authentication
import io.ktor.auth.basicAuthentication
import io.ktor.auth.oauth
import io.ktor.auth.OAuthAccessTokenResponse
import io.ktor.auth.OAuthServerSettings
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.locations.*
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.*

import kotlinx.coroutines.experimental.asCoroutineDispatcher

import org.openapitools.server.ApplicationAuthProviders
import org.openapitools.server.Paths
import org.openapitools.server.ApplicationExecutors
import org.openapitools.server.HTTP.client
import org.openapitools.server.infrastructure.ApiPrincipal
import org.openapitools.server.infrastructure.apiKeyAuth

// ktor 0.9.x is missing io.ktor.locations.DELETE, this adds it.
// see https://github.com/ktorio/ktor/issues/288
import org.openapitools.server.delete

import org.openapitools.server.models.DataInputHistoryResponse
import org.openapitools.server.models.InlineObject17
import org.openapitools.server.models.InlineObject18
import org.openapitools.server.models.InlineResponse2006
import org.openapitools.server.models.InlineResponse2007
import org.openapitools.server.models.MachineHistoryResponse

fun Route.IndustrialApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    get<Paths.getAllDataInputs> {  it: Paths.getAllDataInputs ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "dataInputs" : [ {
            "name" : "Pump Flow",
            "id" : 12345,
            "points" : [ {
              "value" : 12.332,
              "timeMs" : 1453449599999
            }, {
              "value" : 12.332,
              "timeMs" : 1453449599999
            } ]
          }, {
            "name" : "Pump Flow",
            "id" : 12345,
            "points" : [ {
              "value" : 12.332,
              "timeMs" : 1453449599999
            }, {
              "value" : 12.332,
              "timeMs" : 1453449599999
            } ]
          } ]
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getDataInput> {  it: Paths.getDataInput ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "name" : "Pump Flow",
          "id" : 12345,
          "points" : [ {
            "value" : 12.332,
            "timeMs" : 1453449599999
          }, {
            "value" : 12.332,
            "timeMs" : 1453449599999
          } ]
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    route("/machines/list") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "machines" : [ {
                "notes" : "This is in the left hallway behind the conveyor belt",
                "name" : "Freezer ABC",
                "id" : 123
              }, {
                "notes" : "This is in the left hallway behind the conveyor belt",
                "name" : "Freezer ABC",
                "id" : 123
              } ]
            }"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    route("/machines/history") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "machines" : [ {
                "name" : "1/3 HP Motor",
                "id" : 1,
                "vibrations" : [ {
                  "X" : 0.01,
                  "Y" : 1.23,
                  "Z" : 2.55,
                  "time" : 1453449599999
                }, {
                  "X" : 0.01,
                  "Y" : 1.23,
                  "Z" : 2.55,
                  "time" : 1453449599999
                } ]
              }, {
                "name" : "1/3 HP Motor",
                "id" : 1,
                "vibrations" : [ {
                  "X" : 0.01,
                  "Y" : 1.23,
                  "Z" : 2.55,
                  "time" : 1453449599999
                }, {
                  "X" : 0.01,
                  "Y" : 1.23,
                  "Z" : 2.55,
                  "time" : 1453449599999
                } ]
              } ]
            }"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    
}
