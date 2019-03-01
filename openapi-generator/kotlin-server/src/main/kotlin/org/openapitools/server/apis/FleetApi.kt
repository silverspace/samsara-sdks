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

import org.openapitools.server.models.Address
import org.openapitools.server.models.AllRouteJobUpdates
import org.openapitools.server.models.AssetReeferResponse
import org.openapitools.server.models.Contact
import org.openapitools.server.models.DispatchRoute
import org.openapitools.server.models.DispatchRouteCreate
import org.openapitools.server.models.DispatchRouteHistory
import org.openapitools.server.models.Document
import org.openapitools.server.models.DocumentCreate
import org.openapitools.server.models.DocumentType
import org.openapitools.server.models.Driver
import org.openapitools.server.models.DriverDailyLogResponse
import org.openapitools.server.models.DriverForCreate
import org.openapitools.server.models.DriverSafetyScoreResponse
import org.openapitools.server.models.DriversResponse
import org.openapitools.server.models.DriversSummaryResponse
import org.openapitools.server.models.DvirBase
import org.openapitools.server.models.DvirListResponse
import org.openapitools.server.models.FleetVehicleLocation
import org.openapitools.server.models.FleetVehicleResponse
import org.openapitools.server.models.HosAuthenticationLogsResponse
import org.openapitools.server.models.HosLogsResponse
import org.openapitools.server.models.HosLogsSummaryResponse
import org.openapitools.server.models.InlineObject
import org.openapitools.server.models.InlineObject1
import org.openapitools.server.models.InlineObject10
import org.openapitools.server.models.InlineObject11
import org.openapitools.server.models.InlineObject12
import org.openapitools.server.models.InlineObject13
import org.openapitools.server.models.InlineObject14
import org.openapitools.server.models.InlineObject15
import org.openapitools.server.models.InlineObject16
import org.openapitools.server.models.InlineObject2
import org.openapitools.server.models.InlineObject3
import org.openapitools.server.models.InlineObject4
import org.openapitools.server.models.InlineObject5
import org.openapitools.server.models.InlineObject6
import org.openapitools.server.models.InlineObject7
import org.openapitools.server.models.InlineObject8
import org.openapitools.server.models.InlineObject9
import org.openapitools.server.models.InlineResponse200
import org.openapitools.server.models.InlineResponse2001
import org.openapitools.server.models.InlineResponse2002
import org.openapitools.server.models.InlineResponse2003
import org.openapitools.server.models.InlineResponse2004
import org.openapitools.server.models.InlineResponse2005
import org.openapitools.server.models.TripResponse
import org.openapitools.server.models.VehicleHarshEventResponse
import org.openapitools.server.models.VehicleSafetyScoreResponse

fun Route.FleetApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    route("/fleet/add_address") {
        post {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    

    route("/addresses") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "notes" : "Delivery site 1",
              "formattedAddress" : "350 Rhode Island St, San Francisco, CA",
              "geofence" : {
                "polygon" : {
                  "vertices" : [ {
                    "latitude" : 37.765363,
                    "longitude" : -122.403098
                  }, {
                    "latitude" : 37.765363,
                    "longitude" : -122.403098
                  } ]
                },
                "circle" : {
                  "latitude" : 37.765363,
                  "radiusMeters" : 250,
                  "longitude" : -122.403098
                }
              },
              "name" : "Samsara HQ",
              "id" : 123,
              "contacts" : [ {
                "firstName" : "Jane",
                "lastName" : "Jones",
                "phone" : "111-222-3344",
                "id" : 123,
                "email" : "jane.jones@yahoo.com"
              }, {
                "firstName" : "Jane",
                "lastName" : "Jones",
                "phone" : "111-222-3344",
                "id" : 123,
                "email" : "jane.jones@yahoo.com"
              } ],
              "tags" : [ {
                "name" : "Broken Vehicles",
                "id" : 12345
              }, {
                "name" : "Broken Vehicles",
                "id" : 12345
              } ]
            }"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    route("/fleet/dispatch/routes") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """null"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    route("/fleet/drivers/create") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """null"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    route("/fleet/drivers/{driver_id}/dispatch/routes") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """null"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    route("/fleet/drivers/{driver_id}/documents") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """null"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    route("/fleet/maintenance/dvirs") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "defectsNeedNotBeCorrected" : false,
              "defectsCorrected" : true,
              "vehicleCondition" : "SATISFACTORY",
              "inspectionType" : "pre trip",
              "trailerDefects" : [ {
                "comment" : "Air Compressor not working",
                "defectType" : "Air Compressor"
              }, {
                "comment" : "Air Compressor not working",
                "defectType" : "Air Compressor"
              } ],
              "mechanicOrAgentSignature" : {
                "mechanicUserId" : 14849,
                "driverId" : 2581,
                "name" : "John Smith",
                "signedAt" : 12535500000,
                "type" : "driver",
                "email" : "j.smith@yahoo.com",
                "username" : "jsmith"
              },
              "mechanicNotes" : "The vehicle is now safe.",
              "vehicle" : {
                "name" : "Storer's vehicle 19",
                "id" : 19
              },
              "authorSignature" : {
                "mechanicUserId" : 14849,
                "driverId" : 2581,
                "name" : "John Smith",
                "signedAt" : 12535500000,
                "type" : "driver",
                "email" : "j.smith@yahoo.com",
                "username" : "jsmith"
              },
              "odometerMiles" : 49912,
              "vehicleDefects" : [ {
                "comment" : "Air Compressor not working",
                "defectType" : "Air Compressor"
              }, {
                "comment" : "Air Compressor not working",
                "defectType" : "Air Compressor"
              } ],
              "nextDriverSignature" : {
                "driverId" : 2581,
                "name" : "John Smith",
                "signedAt" : 12535500000,
                "type" : "driver",
                "email" : "j.smith@yahoo.com",
                "username" : "jsmith"
              },
              "trailerName" : "Storer's Trailer 19",
              "id" : 19,
              "trailerId" : 19,
              "timeMs" : 1453449599999
            }"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    route("/fleet/vehicles/{vehicle_id}/dispatch/routes") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """null"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    delete<Paths.deactivateDriver> {  it: Paths.deactivateDriver ->
        call.respond(HttpStatusCode.NotImplemented)
    }
    

    delete<Paths.deleteDispatchRouteById> {  it: Paths.deleteDispatchRouteById ->
        call.respond(HttpStatusCode.NotImplemented)
    }
    

    delete<Paths.deleteOrganizationAddress> {  it: Paths.deleteOrganizationAddress ->
        call.respond(HttpStatusCode.NotImplemented)
    }
    

    get<Paths.fetchAllDispatchRoutes> {  it: Paths.fetchAllDispatchRoutes ->
        val exampleContentType = "application/json"
        val exampleContentString = """null"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.fetchAllRouteJobUpdates> {  it: Paths.fetchAllRouteJobUpdates ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "sequence_id" : "eyJpZCI6MywiY3JlYXRlZF9hdCI6MTQ5OTQyOTIyMDAwMn0=",
          "job_updates" : [ {
            "changed_at_ms" : 1462881998034,
            "route_id" : 556,
            "job_id" : 773,
            "prev_job_state" : "JobState_EnRoute",
            "job_state" : "JobState_Arrived"
          }, {
            "changed_at_ms" : 1462881998034,
            "route_id" : 556,
            "job_id" : 773,
            "prev_job_state" : "JobState_EnRoute",
            "job_state" : "JobState_Arrived"
          } ]
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getAllAssetCurrentLocations> {  it: Paths.getAllAssetCurrentLocations ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "assets" : [ {
            "engineHours" : 104,
            "name" : "Trailer 123",
            "location" : [ {
              "latitude" : 37.0,
              "speedMilesPerHour" : 35.0,
              "location" : "525 York, San Francisco, CA",
              "longitude" : -122.7,
              "timeMs" : 12314151
            }, {
              "latitude" : 37.0,
              "speedMilesPerHour" : 35.0,
              "location" : "525 York, San Francisco, CA",
              "longitude" : -122.7,
              "timeMs" : 12314151
            } ],
            "id" : 1,
            "cable" : [ {
              "assetType" : "Reefer (Thermo King)"
            }, {
              "assetType" : "Reefer (Thermo King)"
            } ]
          }, {
            "engineHours" : 104,
            "name" : "Trailer 123",
            "location" : [ {
              "latitude" : 37.0,
              "speedMilesPerHour" : 35.0,
              "location" : "525 York, San Francisco, CA",
              "longitude" : -122.7,
              "timeMs" : 12314151
            }, {
              "latitude" : 37.0,
              "speedMilesPerHour" : 35.0,
              "location" : "525 York, San Francisco, CA",
              "longitude" : -122.7,
              "timeMs" : 12314151
            } ],
            "id" : 1,
            "cable" : [ {
              "assetType" : "Reefer (Thermo King)"
            }, {
              "assetType" : "Reefer (Thermo King)"
            } ]
          } ]
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getAllAssets> {  it: Paths.getAllAssets ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "assets" : [ {
            "assetSerialNumber" : "SNTEST123",
            "engineHours" : 104,
            "name" : "Trailer 123",
            "id" : 1,
            "cable" : [ {
              "assetType" : "Reefer (Thermo King)"
            }, {
              "assetType" : "Reefer (Thermo King)"
            } ]
          }, {
            "assetSerialNumber" : "SNTEST123",
            "engineHours" : 104,
            "name" : "Trailer 123",
            "id" : 1,
            "cable" : [ {
              "assetType" : "Reefer (Thermo King)"
            }, {
              "assetType" : "Reefer (Thermo King)"
            } ]
          } ]
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getAllDeactivatedDrivers> {  it: Paths.getAllDeactivatedDrivers ->
        val exampleContentType = "application/json"
        val exampleContentString = """null"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getAssetLocation> {  it: Paths.getAssetLocation ->
        val exampleContentType = "application/json"
        val exampleContentString = """"{}""""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getAssetReefer> {  it: Paths.getAssetReefer ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "reeferStats" : {
            "fuelPercentage" : [ {
              "fuelPercentage" : 99,
              "changedAtMs" : 1453449599999
            }, {
              "fuelPercentage" : 99,
              "changedAtMs" : 1453449599999
            } ],
            "powerStatus" : [ {
              "changedAtMs" : 1453449599999,
              "status" : "Active (Continuous)"
            }, {
              "changedAtMs" : 1453449599999,
              "status" : "Active (Continuous)"
            } ],
            "engineHours" : [ {
              "engineHours" : 1200,
              "changedAtMs" : 1453449599999
            }, {
              "engineHours" : 1200,
              "changedAtMs" : 1453449599999
            } ],
            "setPoint" : [ {
              "tempInMilliC" : 31110,
              "changedAtMs" : 1453449599999
            }, {
              "tempInMilliC" : 31110,
              "changedAtMs" : 1453449599999
            } ],
            "returnAirTemp" : [ {
              "tempInMilliC" : 31110,
              "changedAtMs" : 1453449599999
            }, {
              "tempInMilliC" : 31110,
              "changedAtMs" : 1453449599999
            } ],
            "alarms" : [ {
              "alarms" : [ {
                "severity" : 1,
                "operatorAction" : "Check and repair at end of trip",
                "description" : "Check Return Air Sensor",
                "alarmCode" : 102
              }, {
                "severity" : 1,
                "operatorAction" : "Check and repair at end of trip",
                "description" : "Check Return Air Sensor",
                "alarmCode" : 102
              } ],
              "changedAtMs" : 1453449599999
            }, {
              "alarms" : [ {
                "severity" : 1,
                "operatorAction" : "Check and repair at end of trip",
                "description" : "Check Return Air Sensor",
                "alarmCode" : 102
              }, {
                "severity" : 1,
                "operatorAction" : "Check and repair at end of trip",
                "description" : "Check Return Air Sensor",
                "alarmCode" : 102
              } ],
              "changedAtMs" : 1453449599999
            } ]
          },
          "name" : "Reefer 123",
          "id" : 1,
          "assetType" : "Reefer (Thermo King)"
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getDeactivatedDriverById> {  it: Paths.getDeactivatedDriverById ->
        val exampleContentType = "application/json"
        val exampleContentString = """null"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getDispatchRouteById> {  it: Paths.getDispatchRouteById ->
        val exampleContentType = "application/json"
        val exampleContentString = """null"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getDispatchRouteHistory> {  it: Paths.getDispatchRouteHistory ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "history" : [ {
            "changed_at_ms" : 1499411220000
          }, {
            "changed_at_ms" : 1499411220000
          } ]
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getDispatchRoutesByDriverId> {  it: Paths.getDispatchRoutesByDriverId ->
        val exampleContentType = "application/json"
        val exampleContentString = """null"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getDispatchRoutesByVehicleId> {  it: Paths.getDispatchRoutesByVehicleId ->
        val exampleContentType = "application/json"
        val exampleContentString = """null"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getDriverById> {  it: Paths.getDriverById ->
        val exampleContentType = "application/json"
        val exampleContentString = """null"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getDriverDocumentTypesByOrgId> {  it: Paths.getDriverDocumentTypesByOrgId ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "fieldTypes" : [ null, null ],
          "name" : "Fuel Receipt",
          "uuid" : "4aff772c-a7bb-45e6-8e41-6a53e34feb83",
          "orgId" : 773
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getDriverDocumentsByOrgId> {  it: Paths.getDriverDocumentsByOrgId ->
        val exampleContentType = "application/json"
        val exampleContentString = """null"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getDriverSafetyScore> {  it: Paths.getDriverSafetyScore ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "crashCount" : 0,
          "driverId" : 1234,
          "harshAccelCount" : 1,
          "harshEvents" : [ {
            "harshEventType" : "Harsh Braking",
            "vehicleId" : 212014918086169,
            "timestampMs" : 1535590776000
          }, {
            "harshEventType" : "Harsh Braking",
            "vehicleId" : 212014918086169,
            "timestampMs" : 1535590776000
          } ],
          "totalDistanceDrivenMeters" : 291836,
          "safetyScore" : 97,
          "totalHarshEventCount" : 3,
          "totalTimeDrivenMs" : 19708293,
          "harshTurningCount" : 0,
          "timeOverSpeedLimitMs" : 3769,
          "harshBrakingCount" : 2,
          "safetyScoreRank" : "26"
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getDvirs> {  it: Paths.getDvirs ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "dvirs" : [ {
            "defectsNeedNotBeCorrected" : false,
            "defectsCorrected" : true,
            "vehicleCondition" : "SATISFACTORY",
            "inspectionType" : "pre trip",
            "trailerDefects" : [ {
              "comment" : "Air Compressor not working",
              "defectType" : "Air Compressor"
            }, {
              "comment" : "Air Compressor not working",
              "defectType" : "Air Compressor"
            } ],
            "mechanicOrAgentSignature" : {
              "mechanicUserId" : 14849,
              "driverId" : 2581,
              "name" : "John Smith",
              "signedAt" : 12535500000,
              "type" : "driver",
              "email" : "j.smith@yahoo.com",
              "username" : "jsmith"
            },
            "mechanicNotes" : "The vehicle is now safe.",
            "vehicle" : {
              "name" : "Storer's vehicle 19",
              "id" : 19
            },
            "authorSignature" : {
              "mechanicUserId" : 14849,
              "driverId" : 2581,
              "name" : "John Smith",
              "signedAt" : 12535500000,
              "type" : "driver",
              "email" : "j.smith@yahoo.com",
              "username" : "jsmith"
            },
            "odometerMiles" : 49912,
            "vehicleDefects" : [ {
              "comment" : "Air Compressor not working",
              "defectType" : "Air Compressor"
            }, {
              "comment" : "Air Compressor not working",
              "defectType" : "Air Compressor"
            } ],
            "nextDriverSignature" : {
              "driverId" : 2581,
              "name" : "John Smith",
              "signedAt" : 12535500000,
              "type" : "driver",
              "email" : "j.smith@yahoo.com",
              "username" : "jsmith"
            },
            "trailerName" : "Storer's Trailer 19",
            "id" : 19,
            "trailerId" : 19,
            "timeMs" : 1453449599999
          }, {
            "defectsNeedNotBeCorrected" : false,
            "defectsCorrected" : true,
            "vehicleCondition" : "SATISFACTORY",
            "inspectionType" : "pre trip",
            "trailerDefects" : [ {
              "comment" : "Air Compressor not working",
              "defectType" : "Air Compressor"
            }, {
              "comment" : "Air Compressor not working",
              "defectType" : "Air Compressor"
            } ],
            "mechanicOrAgentSignature" : {
              "mechanicUserId" : 14849,
              "driverId" : 2581,
              "name" : "John Smith",
              "signedAt" : 12535500000,
              "type" : "driver",
              "email" : "j.smith@yahoo.com",
              "username" : "jsmith"
            },
            "mechanicNotes" : "The vehicle is now safe.",
            "vehicle" : {
              "name" : "Storer's vehicle 19",
              "id" : 19
            },
            "authorSignature" : {
              "mechanicUserId" : 14849,
              "driverId" : 2581,
              "name" : "John Smith",
              "signedAt" : 12535500000,
              "type" : "driver",
              "email" : "j.smith@yahoo.com",
              "username" : "jsmith"
            },
            "odometerMiles" : 49912,
            "vehicleDefects" : [ {
              "comment" : "Air Compressor not working",
              "defectType" : "Air Compressor"
            }, {
              "comment" : "Air Compressor not working",
              "defectType" : "Air Compressor"
            } ],
            "nextDriverSignature" : {
              "driverId" : 2581,
              "name" : "John Smith",
              "signedAt" : 12535500000,
              "type" : "driver",
              "email" : "j.smith@yahoo.com",
              "username" : "jsmith"
            },
            "trailerName" : "Storer's Trailer 19",
            "id" : 19,
            "trailerId" : 19,
            "timeMs" : 1453449599999
          } ]
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    route("/fleet/drivers") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "drivers" : [ null, null ]
            }"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    route("/fleet/drivers/{driver_id}/hos_daily_logs") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "days" : [ {
                "certifiedAtMs" : 0,
                "endMs" : 1473836400000,
                "startMs" : 1473750000000,
                "trailerIds" : [ 10293, 192933 ],
                "activeHours" : 5.4,
                "distanceMiles" : 123.24,
                "activeMs" : 691200,
                "certified" : true,
                "vehicleIds" : [ 192319, 12958 ]
              }, {
                "certifiedAtMs" : 0,
                "endMs" : 1473836400000,
                "startMs" : 1473750000000,
                "trailerIds" : [ 10293, 192933 ],
                "activeHours" : 5.4,
                "distanceMiles" : 123.24,
                "activeMs" : 691200,
                "certified" : true,
                "vehicleIds" : [ 192319, 12958 ]
              } ]
            }"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    route("/fleet/drivers/summary") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "Summaries" : [ {
                "driverId" : 444,
                "distanceMiles" : 123.24,
                "driveMs" : 21600000,
                "activeMs" : 43200000,
                "driverUsername" : "fjacobs",
                "groupId" : 111,
                "driverName" : "Fred Jacobs",
                "onDutyMs" : 21600000
              }, {
                "driverId" : 444,
                "distanceMiles" : 123.24,
                "driveMs" : 21600000,
                "activeMs" : 43200000,
                "driverUsername" : "fjacobs",
                "groupId" : 111,
                "driverName" : "Fred Jacobs",
                "onDutyMs" : 21600000
              } ]
            }"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    route("/fleet/hos_authentication_logs") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "authenticationLogs" : [ {
                "actionType" : "signin",
                "address" : "123 Main St., Ahwatukee, Arizona 85044",
                "city" : "Ahwatukee",
                "happenedAtMs" : 1462881998034,
                "addressName" : "Garage Number 3",
                "state" : "Arizona"
              }, {
                "actionType" : "signin",
                "address" : "123 Main St., Ahwatukee, Arizona 85044",
                "city" : "Ahwatukee",
                "happenedAtMs" : 1462881998034,
                "addressName" : "Garage Number 3",
                "state" : "Arizona"
              } ]
            }"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    route("/fleet/hos_logs") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "logs" : [ {
                "locLng" : -98.502888123,
                "logStartMs" : 1462881998034,
                "driverId" : 444,
                "statusType" : "OFF_DUTY",
                "locCity" : "Ahwatukee",
                "groupId" : 101,
                "locName" : "McLean Site A",
                "locLat" : 23.413702345,
                "remark" : "Lunch Break",
                "locState" : "Arizona",
                "vehicleId" : 112,
                "codriverIds" : [ 445, 445 ]
              }, {
                "locLng" : -98.502888123,
                "logStartMs" : 1462881998034,
                "driverId" : 444,
                "statusType" : "OFF_DUTY",
                "locCity" : "Ahwatukee",
                "groupId" : 101,
                "locName" : "McLean Site A",
                "locLat" : 23.413702345,
                "remark" : "Lunch Break",
                "locState" : "Arizona",
                "vehicleId" : 112,
                "codriverIds" : [ 445, 445 ]
              } ]
            }"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    route("/fleet/hos_logs_summary") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "drivers" : [ {
                "timeUntilBreak" : 28800000,
                "vehicleName" : "Vehicle 1",
                "drivingInViolationToday" : 39600000,
                "driverId" : 444,
                "cycleRemaining" : 252000000,
                "driverName" : "Fred Jacobs",
                "dutyStatus" : "OFF_DUTY",
                "cycleTomorrow" : 252000000,
                "shiftDriveRemaining" : 39600000,
                "timeInCurrentStatus" : 5000,
                "drivingInViolationCycle" : 50400000,
                "shiftRemaining" : 50400000
              }, {
                "timeUntilBreak" : 28800000,
                "vehicleName" : "Vehicle 1",
                "drivingInViolationToday" : 39600000,
                "driverId" : 444,
                "cycleRemaining" : 252000000,
                "driverName" : "Fred Jacobs",
                "dutyStatus" : "OFF_DUTY",
                "cycleTomorrow" : 252000000,
                "shiftDriveRemaining" : 39600000,
                "timeInCurrentStatus" : 5000,
                "drivingInViolationCycle" : 50400000,
                "shiftRemaining" : 50400000
              } ]
            }"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    route("/fleet/locations") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "groupId" : 101,
              "vehicles" : [ {
                "heading" : 246.42,
                "latitude" : 123.456,
                "name" : "Truck A7",
                "location" : "1 Main St, Dallas, TX",
                "odometerMeters" : 71774705,
                "vin" : "JTNBB46KX73011966",
                "id" : 112,
                "onTrip" : true,
                "time" : 1462881998034,
                "speed" : 64.37,
                "longitude" : 32.897
              }, {
                "heading" : 246.42,
                "latitude" : 123.456,
                "name" : "Truck A7",
                "location" : "1 Main St, Dallas, TX",
                "odometerMeters" : 71774705,
                "vin" : "JTNBB46KX73011966",
                "id" : 112,
                "onTrip" : true,
                "time" : 1462881998034,
                "speed" : 64.37,
                "longitude" : 32.897
              } ]
            }"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    route("/fleet/maintenance/list") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "vehicles" : [ {
                "j1939" : {
                  "checkEngineLight" : {
                    "protectIsOn" : true,
                    "stopIsOn" : true,
                    "warningIsOn" : true,
                    "emissionsIsOn" : true
                  },
                  "diagnosticTroubleCodes" : [ {
                    "spnDescription" : "spnDescription",
                    "fmiText" : "fmiText",
                    "spnId" : 0,
                    "occurrenceCount" : 6,
                    "txId" : 1,
                    "fmiId" : 5
                  }, {
                    "spnDescription" : "spnDescription",
                    "fmiText" : "fmiText",
                    "spnId" : 0,
                    "occurrenceCount" : 6,
                    "txId" : 1,
                    "fmiId" : 5
                  } ]
                },
                "passenger" : {
                  "checkEngineLight" : {
                    "isOn" : true
                  },
                  "diagnosticTroubleCodes" : [ {
                    "dtcShortCode" : "dtcShortCode",
                    "dtcId" : 5,
                    "dtcDescription" : "dtcDescription"
                  }, {
                    "dtcShortCode" : "dtcShortCode",
                    "dtcId" : 5,
                    "dtcDescription" : "dtcDescription"
                  } ]
                },
                "id" : 112
              }, {
                "j1939" : {
                  "checkEngineLight" : {
                    "protectIsOn" : true,
                    "stopIsOn" : true,
                    "warningIsOn" : true,
                    "emissionsIsOn" : true
                  },
                  "diagnosticTroubleCodes" : [ {
                    "spnDescription" : "spnDescription",
                    "fmiText" : "fmiText",
                    "spnId" : 0,
                    "occurrenceCount" : 6,
                    "txId" : 1,
                    "fmiId" : 5
                  }, {
                    "spnDescription" : "spnDescription",
                    "fmiText" : "fmiText",
                    "spnId" : 0,
                    "occurrenceCount" : 6,
                    "txId" : 1,
                    "fmiId" : 5
                  } ]
                },
                "passenger" : {
                  "checkEngineLight" : {
                    "isOn" : true
                  },
                  "diagnosticTroubleCodes" : [ {
                    "dtcShortCode" : "dtcShortCode",
                    "dtcId" : 5,
                    "dtcDescription" : "dtcDescription"
                  }, {
                    "dtcShortCode" : "dtcShortCode",
                    "dtcId" : 5,
                    "dtcDescription" : "dtcDescription"
                  } ]
                },
                "id" : 112
              } ]
            }"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    route("/fleet/trips") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "trips" : [ {
                "endOdometer" : 210430500,
                "distanceMeters" : 2500,
                "endMs" : 1462881998034,
                "startMs" : 1462878398034,
                "fuelConsumedMl" : 75700,
                "startAddress" : "Ramen Tatsunoya",
                "startCoordinates" : {
                  "latitude" : 29.443702345,
                  "longitude" : -98.502888123
                },
                "endCoordinates" : {
                  "latitude" : 23.413702345,
                  "longitude" : -91.502888123
                },
                "startOdometer" : 210430450,
                "driverId" : 719,
                "startLocation" : "16 N Fair Oaks Ave, Pasadena, CA 91103",
                "tollMeters" : 32000,
                "endAddress" : "Winchell's Donuts House",
                "endLocation" : "571 S Lake Ave, Pasadena, CA 91101"
              }, {
                "endOdometer" : 210430500,
                "distanceMeters" : 2500,
                "endMs" : 1462881998034,
                "startMs" : 1462878398034,
                "fuelConsumedMl" : 75700,
                "startAddress" : "Ramen Tatsunoya",
                "startCoordinates" : {
                  "latitude" : 29.443702345,
                  "longitude" : -98.502888123
                },
                "endCoordinates" : {
                  "latitude" : 23.413702345,
                  "longitude" : -91.502888123
                },
                "startOdometer" : 210430450,
                "driverId" : 719,
                "startLocation" : "16 N Fair Oaks Ave, Pasadena, CA 91103",
                "tollMeters" : 32000,
                "endAddress" : "Winchell's Donuts House",
                "endLocation" : "571 S Lake Ave, Pasadena, CA 91101"
              } ]
            }"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    get<Paths.getFleetVehicle> {  it: Paths.getFleetVehicle ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "harshAccelSetting" : "Heavy",
          "externalIds" : {
            "maintenanceId" : "ABFS18600"
          },
          "name" : "Truck A7",
          "vehicleInfo" : {
            "year" : 1997,
            "model" : "Odyssey",
            "vin" : "1FUJA6BD31LJ09646",
            "make" : "Honda"
          },
          "id" : 112
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getOrganizationAddress> {  it: Paths.getOrganizationAddress ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "notes" : "Delivery site 1",
          "formattedAddress" : "350 Rhode Island St, San Francisco, CA",
          "geofence" : {
            "polygon" : {
              "vertices" : [ {
                "latitude" : 37.765363,
                "longitude" : -122.403098
              }, {
                "latitude" : 37.765363,
                "longitude" : -122.403098
              } ]
            },
            "circle" : {
              "latitude" : 37.765363,
              "radiusMeters" : 250,
              "longitude" : -122.403098
            }
          },
          "name" : "Samsara HQ",
          "id" : 123,
          "contacts" : [ {
            "firstName" : "Jane",
            "lastName" : "Jones",
            "phone" : "111-222-3344",
            "id" : 123,
            "email" : "jane.jones@yahoo.com"
          }, {
            "firstName" : "Jane",
            "lastName" : "Jones",
            "phone" : "111-222-3344",
            "id" : 123,
            "email" : "jane.jones@yahoo.com"
          } ],
          "tags" : [ {
            "name" : "Broken Vehicles",
            "id" : 12345
          }, {
            "name" : "Broken Vehicles",
            "id" : 12345
          } ]
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getOrganizationAddresses> {  it: Paths.getOrganizationAddresses ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "notes" : "Delivery site 1",
          "formattedAddress" : "350 Rhode Island St, San Francisco, CA",
          "geofence" : {
            "polygon" : {
              "vertices" : [ {
                "latitude" : 37.765363,
                "longitude" : -122.403098
              }, {
                "latitude" : 37.765363,
                "longitude" : -122.403098
              } ]
            },
            "circle" : {
              "latitude" : 37.765363,
              "radiusMeters" : 250,
              "longitude" : -122.403098
            }
          },
          "name" : "Samsara HQ",
          "id" : 123,
          "contacts" : [ {
            "firstName" : "Jane",
            "lastName" : "Jones",
            "phone" : "111-222-3344",
            "id" : 123,
            "email" : "jane.jones@yahoo.com"
          }, {
            "firstName" : "Jane",
            "lastName" : "Jones",
            "phone" : "111-222-3344",
            "id" : 123,
            "email" : "jane.jones@yahoo.com"
          } ],
          "tags" : [ {
            "name" : "Broken Vehicles",
            "id" : 12345
          }, {
            "name" : "Broken Vehicles",
            "id" : 12345
          } ]
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getOrganizationContact> {  it: Paths.getOrganizationContact ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "firstName" : "Jane",
          "lastName" : "Jones",
          "phone" : "111-222-3344",
          "id" : 123,
          "email" : "jane.jones@yahoo.com"
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getVehicleHarshEvent> {  it: Paths.getVehicleHarshEvent ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "downloadForwardVideoUrl" : "https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-123456789.mp4?...",
          "downloadInwardVideoUrl" : "https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-driver-123456789.mp4?...",
          "incidentReportUrl" : "https://cloud.samsara.com/groups/1234/fleet/reports/safety/vehicle/212123456789012/incident/1539201882984",
          "harshEventType" : "Harsh Braking",
          "location" : {
            "address" : "350 Rhode Island St, San Francisco, CA",
            "latitude" : "33.07614328",
            "longitude" : "-96.14907287"
          },
          "downloadTrackedInwardVideoUrl" : "https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-driver-123456789.tracked.mp4?...",
          "isDistracted" : true
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getVehicleLocations> {  it: Paths.getVehicleLocations ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "latitude" : 37.2,
          "speedMilesPerHour" : 35.2,
          "location" : "525 York, San Francisco, CA",
          "longitude" : -122.5,
          "timeMs" : 1535586471332
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getVehicleSafetyScore> {  it: Paths.getVehicleSafetyScore ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "crashCount" : 0,
          "harshAccelCount" : 1,
          "harshEvents" : [ {
            "harshEventType" : "Harsh Braking",
            "vehicleId" : 212014918086169,
            "timestampMs" : 1535590776000
          }, {
            "harshEventType" : "Harsh Braking",
            "vehicleId" : 212014918086169,
            "timestampMs" : 1535590776000
          } ],
          "totalDistanceDrivenMeters" : 291836,
          "safetyScore" : 97,
          "totalHarshEventCount" : 3,
          "totalTimeDrivenMs" : 19708293,
          "vehicleId" : 4321,
          "harshTurningCount" : 0,
          "timeOverSpeedLimitMs" : 3769,
          "harshBrakingCount" : 2,
          "safetyScoreRank" : "26"
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getVehicleStats> {  it: Paths.getVehicleStats ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "pagination" : {
            "hasPrevPage" : true,
            "hasNextPage" : true,
            "endCursor" : "MTU5MTEzNjA2OTU0MzQ3",
            "startCursor" : "MTU5MTEzNjA2OTU0MzQ3"
          },
          "vehicleStats" : [ {
            "engineState" : [ {
              "value" : "Running",
              "timeMs" : 1546542978484
            }, {
              "value" : "Running",
              "timeMs" : 1546542978484
            } ],
            "auxInput2" : {
              "values" : [ {
                "value" : true,
                "timeMs" : 1546542978484
              }, {
                "value" : true,
                "timeMs" : 1546542978484
              } ],
              "name" : "Boom"
            },
            "vehicleId" : 112,
            "auxInput1" : {
              "values" : [ {
                "value" : true,
                "timeMs" : 1546542978484
              }, {
                "value" : true,
                "timeMs" : 1546542978484
              } ],
              "name" : "Boom"
            }
          }, {
            "engineState" : [ {
              "value" : "Running",
              "timeMs" : 1546542978484
            }, {
              "value" : "Running",
              "timeMs" : 1546542978484
            } ],
            "auxInput2" : {
              "values" : [ {
                "value" : true,
                "timeMs" : 1546542978484
              }, {
                "value" : true,
                "timeMs" : 1546542978484
              } ],
              "name" : "Boom"
            },
            "vehicleId" : 112,
            "auxInput1" : {
              "values" : [ {
                "value" : true,
                "timeMs" : 1546542978484
              }, {
                "value" : true,
                "timeMs" : 1546542978484
              } ],
              "name" : "Boom"
            }
          } ]
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.getVehiclesLocations> {  it: Paths.getVehiclesLocations ->
        val exampleContentType = "application/json"
        val exampleContentString = """"{}""""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.listContacts> {  it: Paths.listContacts ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "firstName" : "Jane",
          "lastName" : "Jones",
          "phone" : "111-222-3344",
          "id" : 123,
          "email" : "jane.jones@yahoo.com"
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    route("/fleet/list") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "pagination" : {
                "hasPrevPage" : true,
                "hasNextPage" : true,
                "endCursor" : "MTU5MTEzNjA2OTU0MzQ3",
                "startCursor" : "MTU5MTEzNjA2OTU0MzQ3"
              },
              "groupId" : 101,
              "vehicles" : [ {
                "note" : "Red truck 2015 M16",
                "engineHours" : 1500,
                "name" : "Truck A7",
                "fuelLevelPercent" : 0.3,
                "odometerMeters" : 60130000,
                "vin" : "1FUJA6BD31LJ09646",
                "id" : 112
              }, {
                "note" : "Red truck 2015 M16",
                "engineHours" : 1500,
                "name" : "Truck A7",
                "fuelLevelPercent" : 0.3,
                "odometerMeters" : 60130000,
                "vin" : "1FUJA6BD31LJ09646",
                "id" : 112
              } ]
            }"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    route("/fleet/vehicles/{vehicle_id_or_external_id}") {
        patch {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "harshAccelSetting" : "Heavy",
              "externalIds" : {
                "maintenanceId" : "ABFS18600"
              },
              "name" : "Truck A7",
              "vehicleInfo" : {
                "year" : 1997,
                "model" : "Odyssey",
                "vin" : "1FUJA6BD31LJ09646",
                "make" : "Honda"
              },
              "id" : 112
            }"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    route("/fleet/drivers/inactive/{driver_id_or_external_id}") {
        put {
            val exampleContentType = "application/json"
            val exampleContentString = """null"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    route("/fleet/dispatch/routes/{route_id}") {
        put {
            val exampleContentType = "application/json"
            val exampleContentString = """null"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    route("/addresses/{addressId}") {
        patch {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    

    route("/fleet/set_data") {
        post {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    
}
