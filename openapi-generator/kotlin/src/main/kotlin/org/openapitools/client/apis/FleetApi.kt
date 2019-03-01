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
package org.openapitools.client.apis

import org.openapitools.client.models.Address
import org.openapitools.client.models.AllRouteJobUpdates
import org.openapitools.client.models.AssetReeferResponse
import org.openapitools.client.models.Contact
import org.openapitools.client.models.DispatchRoute
import org.openapitools.client.models.DispatchRouteCreate
import org.openapitools.client.models.DispatchRouteHistory
import org.openapitools.client.models.Document
import org.openapitools.client.models.DocumentCreate
import org.openapitools.client.models.DocumentType
import org.openapitools.client.models.Driver
import org.openapitools.client.models.DriverDailyLogResponse
import org.openapitools.client.models.DriverForCreate
import org.openapitools.client.models.DriverSafetyScoreResponse
import org.openapitools.client.models.DriversResponse
import org.openapitools.client.models.DriversSummaryResponse
import org.openapitools.client.models.DvirBase
import org.openapitools.client.models.DvirListResponse
import org.openapitools.client.models.FleetVehicleLocation
import org.openapitools.client.models.FleetVehicleResponse
import org.openapitools.client.models.HosAuthenticationLogsResponse
import org.openapitools.client.models.HosLogsResponse
import org.openapitools.client.models.HosLogsSummaryResponse
import org.openapitools.client.models.InlineObject
import org.openapitools.client.models.InlineObject1
import org.openapitools.client.models.InlineObject10
import org.openapitools.client.models.InlineObject11
import org.openapitools.client.models.InlineObject12
import org.openapitools.client.models.InlineObject13
import org.openapitools.client.models.InlineObject14
import org.openapitools.client.models.InlineObject15
import org.openapitools.client.models.InlineObject16
import org.openapitools.client.models.InlineObject2
import org.openapitools.client.models.InlineObject3
import org.openapitools.client.models.InlineObject4
import org.openapitools.client.models.InlineObject5
import org.openapitools.client.models.InlineObject6
import org.openapitools.client.models.InlineObject7
import org.openapitools.client.models.InlineObject8
import org.openapitools.client.models.InlineObject9
import org.openapitools.client.models.InlineResponse200
import org.openapitools.client.models.InlineResponse2001
import org.openapitools.client.models.InlineResponse2002
import org.openapitools.client.models.InlineResponse2003
import org.openapitools.client.models.InlineResponse2004
import org.openapitools.client.models.InlineResponse2005
import org.openapitools.client.models.TripResponse
import org.openapitools.client.models.VehicleHarshEventResponse
import org.openapitools.client.models.VehicleSafetyScoreResponse

import org.openapitools.client.infrastructure.*

class FleetApi(basePath: kotlin.String = "https://api.samsara.com/v1") : ApiClient(basePath) {

    /**
    * /fleet/add_address
    * This method adds an address book entry to the specified group.
    * @param accessToken Samsara API access token. 
    * @param addressParam  
    * @return void
    */
    fun addFleetAddress(accessToken: kotlin.String, addressParam: InlineObject2) : Unit {
        val localVariableBody: kotlin.Any? = addressParam
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fleet/add_address",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /addresses
    * Add one or more addresses to the organization
    * @param accessToken Samsara API access token. 
    * @param addresses  
    * @return kotlin.Array<Address>
    */
    @Suppress("UNCHECKED_CAST")
    fun addOrganizationAddresses(accessToken: kotlin.String, addresses: InlineObject) : kotlin.Array<Address> {
        val localVariableBody: kotlin.Any? = addresses
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/addresses",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Address>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Address>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/dispatch/routes
    * Create a new dispatch route.
    * @param accessToken Samsara API access token. 
    * @param createDispatchRouteParams  
    * @return DispatchRoute
    */
    @Suppress("UNCHECKED_CAST")
    fun createDispatchRoute(accessToken: kotlin.String, createDispatchRouteParams: DispatchRouteCreate) : DispatchRoute {
        val localVariableBody: kotlin.Any? = createDispatchRouteParams
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fleet/dispatch/routes",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<DispatchRoute>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as DispatchRoute
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/drivers/create
    * Create a new driver.
    * @param accessToken Samsara API access token. 
    * @param createDriverParam Driver creation body 
    * @return Driver
    */
    @Suppress("UNCHECKED_CAST")
    fun createDriver(accessToken: kotlin.String, createDriverParam: DriverForCreate) : Driver {
        val localVariableBody: kotlin.Any? = createDriverParam
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fleet/drivers/create",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Driver>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Driver
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    * Create a new dispatch route for the driver with driver_id.
    * @param accessToken Samsara API access token. 
    * @param driverId ID of the driver with the associated routes. 
    * @param createDispatchRouteParams  
    * @return DispatchRoute
    */
    @Suppress("UNCHECKED_CAST")
    fun createDriverDispatchRoute(accessToken: kotlin.String, driverId: kotlin.Long, createDispatchRouteParams: DispatchRouteCreate) : DispatchRoute {
        val localVariableBody: kotlin.Any? = createDispatchRouteParams
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fleet/drivers/{driver_id}/dispatch/routes".replace("{"+"driver_id"+"}", "$driverId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<DispatchRoute>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as DispatchRoute
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/drivers/{driver_id:[0-9]+}/documents
    * Create a driver document for the given driver.
    * @param accessToken Samsara API access token. 
    * @param driverId ID of the driver for whom the document is created. 
    * @param createDocumentParams To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. 
    * @return Document
    */
    @Suppress("UNCHECKED_CAST")
    fun createDriverDocument(accessToken: kotlin.String, driverId: kotlin.Long, createDocumentParams: DocumentCreate) : Document {
        val localVariableBody: kotlin.Any? = createDocumentParams
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fleet/drivers/{driver_id}/documents".replace("{"+"driver_id"+"}", "$driverId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Document>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Document
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/maintenance/dvirs
    * Create a new dvir, marking a vehicle or trailer safe or unsafe.
    * @param accessToken Samsara API access token. 
    * @param createDvirParam  
    * @return DvirBase
    */
    @Suppress("UNCHECKED_CAST")
    fun createDvir(accessToken: kotlin.String, createDvirParam: InlineObject12) : DvirBase {
        val localVariableBody: kotlin.Any? = createDvirParam
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fleet/maintenance/dvirs",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<DvirBase>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as DvirBase
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    * Create a new dispatch route for the vehicle with vehicle_id.
    * @param accessToken Samsara API access token. 
    * @param vehicleId ID of the vehicle with the associated routes. 
    * @param createDispatchRouteParams  
    * @return DispatchRoute
    */
    @Suppress("UNCHECKED_CAST")
    fun createVehicleDispatchRoute(accessToken: kotlin.String, vehicleId: kotlin.Long, createDispatchRouteParams: DispatchRouteCreate) : DispatchRoute {
        val localVariableBody: kotlin.Any? = createDispatchRouteParams
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fleet/vehicles/{vehicle_id}/dispatch/routes".replace("{"+"vehicle_id"+"}", "$vehicleId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<DispatchRoute>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as DispatchRoute
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    * Deactivate a driver with the given id.
    * @param accessToken Samsara API access token. 
    * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
    * @return void
    */
    fun deactivateDriver(accessToken: kotlin.String, driverIdOrExternalId: kotlin.String) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/fleet/drivers/{driver_id_or_external_id}".replace("{"+"driver_id_or_external_id"+"}", "$driverIdOrExternalId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/dispatch/routes/{route_id:[0-9]+}/
    * Delete a dispatch route and its associated jobs.
    * @param accessToken Samsara API access token. 
    * @param routeId ID of the dispatch route. 
    * @return void
    */
    fun deleteDispatchRouteById(accessToken: kotlin.String, routeId: kotlin.Long) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/fleet/dispatch/routes/{route_id}".replace("{"+"route_id"+"}", "$routeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /addresses/{addressId}
    * Delete an address.
    * @param accessToken Samsara API access token. 
    * @param addressId ID of the address/geofence 
    * @return void
    */
    fun deleteOrganizationAddress(accessToken: kotlin.String, addressId: kotlin.Long) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/addresses/{addressId}".replace("{"+"addressId"+"}", "$addressId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/dispatch/routes
    * Fetch all of the dispatch routes for the group.
    * @param accessToken Samsara API access token. 
    * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional, default to null)
    * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional, default to null)
    * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional, default to null)
    * @return kotlin.Array<DispatchRoute>
    */
    @Suppress("UNCHECKED_CAST")
    fun fetchAllDispatchRoutes(accessToken: kotlin.String, groupId: kotlin.Long, endTime: kotlin.Long, duration: kotlin.Long) : kotlin.Array<DispatchRoute> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"), "group_id" to listOf("$groupId"), "end_time" to listOf("$endTime"), "duration" to listOf("$duration"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fleet/dispatch/routes",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<DispatchRoute>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<DispatchRoute>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/dispatch/routes/job_updates
    * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
    * @param accessToken Samsara API access token. 
    * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional, default to null)
    * @param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional, default to null)
    * @param include Optionally set include&#x3D;route to include route object in response payload. (optional, default to null)
    * @return AllRouteJobUpdates
    */
    @Suppress("UNCHECKED_CAST")
    fun fetchAllRouteJobUpdates(accessToken: kotlin.String, groupId: kotlin.Long, sequenceId: kotlin.String, include: kotlin.String) : AllRouteJobUpdates {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"), "group_id" to listOf("$groupId"), "sequence_id" to listOf("$sequenceId"), "include" to listOf("$include"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fleet/dispatch/routes/job_updates",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<AllRouteJobUpdates>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as AllRouteJobUpdates
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/assets/locations
    * Fetch current locations of all assets for the group.
    * @param accessToken Samsara API access token. 
    * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional, default to null)
    * @return InlineResponse2001
    */
    @Suppress("UNCHECKED_CAST")
    fun getAllAssetCurrentLocations(accessToken: kotlin.String, groupId: kotlin.Long) : InlineResponse2001 {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"), "group_id" to listOf("$groupId"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fleet/assets/locations",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<InlineResponse2001>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as InlineResponse2001
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/assets
    * Fetch all of the assets for the group.
    * @param accessToken Samsara API access token. 
    * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional, default to null)
    * @return InlineResponse200
    */
    @Suppress("UNCHECKED_CAST")
    fun getAllAssets(accessToken: kotlin.String, groupId: kotlin.Long) : InlineResponse200 {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"), "group_id" to listOf("$groupId"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fleet/assets",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<InlineResponse200>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as InlineResponse200
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/drivers/inactive
    * Fetch all deactivated drivers for the group.
    * @param accessToken Samsara API access token. 
    * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional, default to null)
    * @return kotlin.Array<Driver>
    */
    @Suppress("UNCHECKED_CAST")
    fun getAllDeactivatedDrivers(accessToken: kotlin.String, groupId: kotlin.Long) : kotlin.Array<Driver> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"), "group_id" to listOf("$groupId"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fleet/drivers/inactive",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Driver>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Driver>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/assets/{assetId:[0-9]+}/locations
    * Fetch the historical locations for the asset.
    * @param accessToken Samsara API access token. 
    * @param assetId ID of the asset 
    * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
    * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
    * @return kotlin.Array<kotlin.Any>
    */
    @Suppress("UNCHECKED_CAST")
    fun getAssetLocation(accessToken: kotlin.String, assetId: kotlin.Long, startMs: kotlin.Long, endMs: kotlin.Long) : kotlin.Array<kotlin.Any> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"), "startMs" to listOf("$startMs"), "endMs" to listOf("$endMs"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fleet/assets/{asset_id}/locations".replace("{"+"asset_id"+"}", "$assetId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<kotlin.Any>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<kotlin.Any>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/assets/{assetId:[0-9]+}/reefer
    * Fetch the reefer-specific stats of an asset.
    * @param accessToken Samsara API access token. 
    * @param assetId ID of the asset 
    * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
    * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
    * @return AssetReeferResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun getAssetReefer(accessToken: kotlin.String, assetId: kotlin.Long, startMs: kotlin.Long, endMs: kotlin.Long) : AssetReeferResponse {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"), "startMs" to listOf("$startMs"), "endMs" to listOf("$endMs"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fleet/assets/{asset_id}/reefer".replace("{"+"asset_id"+"}", "$assetId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<AssetReeferResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as AssetReeferResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    * Fetch deactivated driver by id.
    * @param accessToken Samsara API access token. 
    * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
    * @return Driver
    */
    @Suppress("UNCHECKED_CAST")
    fun getDeactivatedDriverById(accessToken: kotlin.String, driverIdOrExternalId: kotlin.String) : Driver {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fleet/drivers/inactive/{driver_id_or_external_id}".replace("{"+"driver_id_or_external_id"+"}", "$driverIdOrExternalId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Driver>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Driver
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/dispatch/routes/{route_id:[0-9]+}
    * Fetch a dispatch route by id.
    * @param accessToken Samsara API access token. 
    * @param routeId ID of the dispatch route. 
    * @return DispatchRoute
    */
    @Suppress("UNCHECKED_CAST")
    fun getDispatchRouteById(accessToken: kotlin.String, routeId: kotlin.Long) : DispatchRoute {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fleet/dispatch/routes/{route_id}".replace("{"+"route_id"+"}", "$routeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<DispatchRoute>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as DispatchRoute
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/dispatch/routes/{route_id:[0-9]+}/history
    * Fetch the history of a dispatch route.
    * @param accessToken Samsara API access token. 
    * @param routeId ID of the route with history. 
    * @param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional, default to null)
    * @param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional, default to null)
    * @return DispatchRouteHistory
    */
    @Suppress("UNCHECKED_CAST")
    fun getDispatchRouteHistory(accessToken: kotlin.String, routeId: kotlin.Long, startTime: kotlin.Long, endTime: kotlin.Long) : DispatchRouteHistory {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"), "start_time" to listOf("$startTime"), "end_time" to listOf("$endTime"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fleet/dispatch/routes/{route_id}/history".replace("{"+"route_id"+"}", "$routeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<DispatchRouteHistory>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as DispatchRouteHistory
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    * Fetch all of the dispatch routes for a given driver.
    * @param accessToken Samsara API access token. 
    * @param driverId ID of the driver with the associated routes. 
    * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional, default to null)
    * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional, default to null)
    * @return kotlin.Array<DispatchRoute>
    */
    @Suppress("UNCHECKED_CAST")
    fun getDispatchRoutesByDriverId(accessToken: kotlin.String, driverId: kotlin.Long, endTime: kotlin.Long, duration: kotlin.Long) : kotlin.Array<DispatchRoute> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"), "end_time" to listOf("$endTime"), "duration" to listOf("$duration"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fleet/drivers/{driver_id}/dispatch/routes".replace("{"+"driver_id"+"}", "$driverId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<DispatchRoute>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<DispatchRoute>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    * Fetch all of the dispatch routes for a given vehicle.
    * @param accessToken Samsara API access token. 
    * @param vehicleId ID of the vehicle with the associated routes. 
    * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional, default to null)
    * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional, default to null)
    * @return kotlin.Array<DispatchRoute>
    */
    @Suppress("UNCHECKED_CAST")
    fun getDispatchRoutesByVehicleId(accessToken: kotlin.String, vehicleId: kotlin.Long, endTime: kotlin.Long, duration: kotlin.Long) : kotlin.Array<DispatchRoute> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"), "end_time" to listOf("$endTime"), "duration" to listOf("$duration"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fleet/vehicles/{vehicle_id}/dispatch/routes".replace("{"+"vehicle_id"+"}", "$vehicleId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<DispatchRoute>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<DispatchRoute>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    * Fetch driver by id.
    * @param accessToken Samsara API access token. 
    * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
    * @return Driver
    */
    @Suppress("UNCHECKED_CAST")
    fun getDriverById(accessToken: kotlin.String, driverIdOrExternalId: kotlin.String) : Driver {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fleet/drivers/{driver_id_or_external_id}".replace("{"+"driver_id_or_external_id"+"}", "$driverIdOrExternalId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Driver>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Driver
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/drivers/document_types
    * Fetch all of the document types.
    * @return kotlin.Array<DocumentType>
    */
    @Suppress("UNCHECKED_CAST")
    fun getDriverDocumentTypesByOrgId() : kotlin.Array<DocumentType> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fleet/drivers/document_types",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<DocumentType>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<DocumentType>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/drivers/documents
    * Fetch all of the documents.
    * @param accessToken Samsara API access token. 
    * @param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional, default to null)
    * @param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional, default to null)
    * @return kotlin.Array<Document>
    */
    @Suppress("UNCHECKED_CAST")
    fun getDriverDocumentsByOrgId(accessToken: kotlin.String, endMs: kotlin.Long, durationMs: kotlin.Long) : kotlin.Array<Document> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"), "endMs" to listOf("$endMs"), "durationMs" to listOf("$durationMs"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fleet/drivers/documents",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Document>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Document>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/drivers/{driverId:[0-9]+}/safety/score
    * Fetch the safety score for the driver.
    * @param driverId ID of the driver 
    * @param accessToken Samsara API access token. 
    * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
    * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
    * @return DriverSafetyScoreResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun getDriverSafetyScore(driverId: kotlin.Long, accessToken: kotlin.String, startMs: kotlin.Long, endMs: kotlin.Long) : DriverSafetyScoreResponse {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"), "startMs" to listOf("$startMs"), "endMs" to listOf("$endMs"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fleet/drivers/{driverId}/safety/score".replace("{"+"driverId"+"}", "$driverId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<DriverSafetyScoreResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as DriverSafetyScoreResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/maintenance/dvirs
    * Get DVIRs for the org within provided time constraints
    * @param accessToken Samsara API access token. 
    * @param endMs time in millis until the last dvir log. 
    * @param durationMs time in millis which corresponds to the duration before the end_ms. 
    * @param groupId Group ID to query. (optional, default to null)
    * @return DvirListResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun getDvirs(accessToken: kotlin.String, endMs: kotlin.Int, durationMs: kotlin.Int, groupId: kotlin.Int) : DvirListResponse {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"), "end_ms" to listOf("$endMs"), "duration_ms" to listOf("$durationMs"), "group_id" to listOf("$groupId"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fleet/maintenance/dvirs",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<DvirListResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as DvirListResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/drivers
    * Get all the drivers for the specified group.
    * @param accessToken Samsara API access token. 
    * @param groupDriversParam  
    * @return DriversResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun getFleetDrivers(accessToken: kotlin.String, groupDriversParam: InlineObject3) : DriversResponse {
        val localVariableBody: kotlin.Any? = groupDriversParam
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fleet/drivers",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<DriversResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as DriversResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
    * Get summarized daily HOS charts for a specified driver.
    * @param accessToken Samsara API access token. 
    * @param driverId ID of the driver with HOS logs. 
    * @param hosLogsParam  
    * @return DriverDailyLogResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun getFleetDriversHosDailyLogs(accessToken: kotlin.String, driverId: kotlin.Long, hosLogsParam: InlineObject6) : DriverDailyLogResponse {
        val localVariableBody: kotlin.Any? = hosLogsParam
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fleet/drivers/{driver_id}/hos_daily_logs".replace("{"+"driver_id"+"}", "$driverId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<DriverDailyLogResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as DriverDailyLogResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/drivers/summary
    * Get the distance and time each driver in an organization has driven in a given time period.
    * @param accessToken Samsara API access token. 
    * @param driversSummaryParam  
    * @param snapToDayBounds Snap query result to HOS day boundaries. (optional, default to null)
    * @return DriversSummaryResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun getFleetDriversSummary(accessToken: kotlin.String, driversSummaryParam: InlineObject5, snapToDayBounds: kotlin.Boolean) : DriversSummaryResponse {
        val localVariableBody: kotlin.Any? = driversSummaryParam
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"), "snap_to_day_bounds" to listOf("$snapToDayBounds"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fleet/drivers/summary",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<DriversSummaryResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as DriversSummaryResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/hos_authentication_logs
    * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
    * @param accessToken Samsara API access token. 
    * @param hosAuthenticationLogsParam  
    * @return HosAuthenticationLogsResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun getFleetHosAuthenticationLogs(accessToken: kotlin.String, hosAuthenticationLogsParam: InlineObject7) : HosAuthenticationLogsResponse {
        val localVariableBody: kotlin.Any? = hosAuthenticationLogsParam
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fleet/hos_authentication_logs",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<HosAuthenticationLogsResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as HosAuthenticationLogsResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/hos_logs
    * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
    * @param accessToken Samsara API access token. 
    * @param hosLogsParam  
    * @return HosLogsResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun getFleetHosLogs(accessToken: kotlin.String, hosLogsParam: InlineObject8) : HosLogsResponse {
        val localVariableBody: kotlin.Any? = hosLogsParam
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fleet/hos_logs",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<HosLogsResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as HosLogsResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/hos_logs_summary
    * Get the current HOS status for all drivers in the group.
    * @param accessToken Samsara API access token. 
    * @param hosLogsParam  
    * @return HosLogsSummaryResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun getFleetHosLogsSummary(accessToken: kotlin.String, hosLogsParam: InlineObject9) : HosLogsSummaryResponse {
        val localVariableBody: kotlin.Any? = hosLogsParam
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fleet/hos_logs_summary",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<HosLogsSummaryResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as HosLogsSummaryResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/locations
    * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
    * @param accessToken Samsara API access token. 
    * @param groupParam  
    * @return InlineResponse2003
    */
    @Suppress("UNCHECKED_CAST")
    fun getFleetLocations(accessToken: kotlin.String, groupParam: InlineObject11) : InlineResponse2003 {
        val localVariableBody: kotlin.Any? = groupParam
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fleet/locations",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<InlineResponse2003>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as InlineResponse2003
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/maintenance/list
    * Get list of the vehicles with any engine faults or check light data.
    * @param accessToken Samsara API access token. 
    * @param groupParam  
    * @return InlineResponse2004
    */
    @Suppress("UNCHECKED_CAST")
    fun getFleetMaintenanceList(accessToken: kotlin.String, groupParam: InlineObject13) : InlineResponse2004 {
        val localVariableBody: kotlin.Any? = groupParam
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fleet/maintenance/list",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<InlineResponse2004>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as InlineResponse2004
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/trips
    * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
    * @param accessToken Samsara API access token. 
    * @param tripsParam  
    * @return TripResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun getFleetTrips(accessToken: kotlin.String, tripsParam: InlineObject15) : TripResponse {
        val localVariableBody: kotlin.Any? = tripsParam
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fleet/trips",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<TripResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as TripResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    * Gets a specific vehicle.
    * @param accessToken Samsara API access token. 
    * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. 
    * @return FleetVehicleResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun getFleetVehicle(accessToken: kotlin.String, vehicleIdOrExternalId: kotlin.String) : FleetVehicleResponse {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fleet/vehicles/{vehicle_id_or_external_id}".replace("{"+"vehicle_id_or_external_id"+"}", "$vehicleIdOrExternalId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<FleetVehicleResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as FleetVehicleResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /addresses/{addressId}
    * Fetch an address by its id.
    * @param accessToken Samsara API access token. 
    * @param addressId ID of the address/geofence 
    * @return Address
    */
    @Suppress("UNCHECKED_CAST")
    fun getOrganizationAddress(accessToken: kotlin.String, addressId: kotlin.Long) : Address {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/addresses/{addressId}".replace("{"+"addressId"+"}", "$addressId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Address>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Address
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /addresses
    * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
    * @param accessToken Samsara API access token. 
    * @return kotlin.Array<Address>
    */
    @Suppress("UNCHECKED_CAST")
    fun getOrganizationAddresses(accessToken: kotlin.String) : kotlin.Array<Address> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/addresses",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Address>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Address>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /contacts/{contact_id}
    * Fetch a contact by its id.
    * @param accessToken Samsara API access token. 
    * @param contactId ID of the contact 
    * @return Contact
    */
    @Suppress("UNCHECKED_CAST")
    fun getOrganizationContact(accessToken: kotlin.String, contactId: kotlin.Long) : Contact {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/contacts/{contact_id}".replace("{"+"contact_id"+"}", "$contactId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Contact>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Contact
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
    * Fetch harsh event details for a vehicle.
    * @param vehicleId ID of the vehicle 
    * @param accessToken Samsara API access token. 
    * @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event. 
    * @return VehicleHarshEventResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun getVehicleHarshEvent(vehicleId: kotlin.Long, accessToken: kotlin.String, timestamp: kotlin.Long) : VehicleHarshEventResponse {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"), "timestamp" to listOf("$timestamp"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fleet/vehicles/{vehicleId}/safety/harsh_event".replace("{"+"vehicleId"+"}", "$vehicleId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<VehicleHarshEventResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as VehicleHarshEventResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
    * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
    * @param accessToken Samsara API access token. 
    * @param vehicleId ID of the vehicle with the associated routes. 
    * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) 
    * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) 
    * @return kotlin.Array<FleetVehicleLocation>
    */
    @Suppress("UNCHECKED_CAST")
    fun getVehicleLocations(accessToken: kotlin.String, vehicleId: kotlin.Long, startMs: kotlin.Long, endMs: kotlin.Long) : kotlin.Array<FleetVehicleLocation> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"), "startMs" to listOf("$startMs"), "endMs" to listOf("$endMs"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fleet/vehicles/{vehicle_id}/locations".replace("{"+"vehicle_id"+"}", "$vehicleId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<FleetVehicleLocation>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<FleetVehicleLocation>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
    * Fetch the safety score for the vehicle.
    * @param vehicleId ID of the vehicle 
    * @param accessToken Samsara API access token. 
    * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
    * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
    * @return VehicleSafetyScoreResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun getVehicleSafetyScore(vehicleId: kotlin.Long, accessToken: kotlin.String, startMs: kotlin.Long, endMs: kotlin.Long) : VehicleSafetyScoreResponse {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"), "startMs" to listOf("$startMs"), "endMs" to listOf("$endMs"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fleet/vehicles/{vehicleId}/safety/score".replace("{"+"vehicleId"+"}", "$vehicleId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<VehicleSafetyScoreResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as VehicleSafetyScoreResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/vehicles/stats
    * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
    * @param accessToken Samsara API access token. 
    * @param startMs Time in Unix epoch milliseconds for the start of the query. 
    * @param endMs Time in Unix epoch milliseconds for the end of the query. 
    * @param series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional, default to null)
    * @param tagIds Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional, default to null)
    * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional, default to null)
    * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional, default to null)
    * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional, default to null)
    * @return InlineResponse2005
    */
    @Suppress("UNCHECKED_CAST")
    fun getVehicleStats(accessToken: kotlin.String, startMs: kotlin.Int, endMs: kotlin.Int, series: kotlin.String, tagIds: kotlin.String, startingAfter: kotlin.String, endingBefore: kotlin.String, limit: kotlin.Long) : InlineResponse2005 {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"), "startMs" to listOf("$startMs"), "endMs" to listOf("$endMs"), "series" to listOf("$series"), "tagIds" to listOf("$tagIds"), "startingAfter" to listOf("$startingAfter"), "endingBefore" to listOf("$endingBefore"), "limit" to listOf("$limit"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fleet/vehicles/stats",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<InlineResponse2005>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as InlineResponse2005
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/vehicles/locations
    * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
    * @param accessToken Samsara API access token. 
    * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) 
    * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) 
    * @return kotlin.Array<kotlin.Any>
    */
    @Suppress("UNCHECKED_CAST")
    fun getVehiclesLocations(accessToken: kotlin.String, startMs: kotlin.Int, endMs: kotlin.Int) : kotlin.Array<kotlin.Any> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"), "startMs" to listOf("$startMs"), "endMs" to listOf("$endMs"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fleet/vehicles/locations",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<kotlin.Any>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<kotlin.Any>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /contacts
    * Fetch all contacts for the organization.
    * @param accessToken Samsara API access token. 
    * @return kotlin.Array<Contact>
    */
    @Suppress("UNCHECKED_CAST")
    fun listContacts(accessToken: kotlin.String) : kotlin.Array<Contact> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/contacts",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Contact>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Contact>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/list
    * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
    * @param accessToken Samsara API access token. 
    * @param groupParam  
    * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional, default to null)
    * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional, default to null)
    * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional, default to null)
    * @return InlineResponse2002
    */
    @Suppress("UNCHECKED_CAST")
    fun listFleet(accessToken: kotlin.String, groupParam: InlineObject10, startingAfter: kotlin.String, endingBefore: kotlin.String, limit: kotlin.Long) : InlineResponse2002 {
        val localVariableBody: kotlin.Any? = groupParam
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"), "startingAfter" to listOf("$startingAfter"), "endingBefore" to listOf("$endingBefore"), "limit" to listOf("$limit"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fleet/list",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<InlineResponse2002>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as InlineResponse2002
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
    * @param accessToken Samsara API access token. 
    * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. 
    * @param &#x60;data&#x60;  
    * @return FleetVehicleResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun patchFleetVehicle(accessToken: kotlin.String, vehicleIdOrExternalId: kotlin.String, &#x60;data&#x60;: InlineObject16) : FleetVehicleResponse {
        val localVariableBody: kotlin.Any? = &#x60;data&#x60;
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PATCH,
            "/fleet/vehicles/{vehicle_id_or_external_id}".replace("{"+"vehicle_id_or_external_id"+"}", "$vehicleIdOrExternalId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<FleetVehicleResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as FleetVehicleResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    * Reactivate the inactive driver having id.
    * @param accessToken Samsara API access token. 
    * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
    * @param reactivateDriverParam  
    * @return Driver
    */
    @Suppress("UNCHECKED_CAST")
    fun reactivateDriverById(accessToken: kotlin.String, driverIdOrExternalId: kotlin.String, reactivateDriverParam: InlineObject4) : Driver {
        val localVariableBody: kotlin.Any? = reactivateDriverParam
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/fleet/drivers/inactive/{driver_id_or_external_id}".replace("{"+"driver_id_or_external_id"+"}", "$driverIdOrExternalId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Driver>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Driver
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/dispatch/routes/{route_id:[0-9]+}/
    * Update a dispatch route and its associated jobs.
    * @param accessToken Samsara API access token. 
    * @param routeId ID of the dispatch route. 
    * @param updateDispatchRouteParams  
    * @return DispatchRoute
    */
    @Suppress("UNCHECKED_CAST")
    fun updateDispatchRouteById(accessToken: kotlin.String, routeId: kotlin.Long, updateDispatchRouteParams: DispatchRoute) : DispatchRoute {
        val localVariableBody: kotlin.Any? = updateDispatchRouteParams
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/fleet/dispatch/routes/{route_id}".replace("{"+"route_id"+"}", "$routeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<DispatchRoute>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as DispatchRoute
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /addresses/{addressId}
    * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
    * @param accessToken Samsara API access token. 
    * @param addressId ID of the address/geofence 
    * @param address  
    * @return void
    */
    fun updateOrganizationAddress(accessToken: kotlin.String, addressId: kotlin.Long, address: InlineObject1) : Unit {
        val localVariableBody: kotlin.Any? = address
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PATCH,
            "/addresses/{addressId}".replace("{"+"addressId"+"}", "$addressId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * /fleet/set_data
    * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
    * @param accessToken Samsara API access token. 
    * @param vehicleUpdateParam  
    * @return void
    */
    fun updateVehicles(accessToken: kotlin.String, vehicleUpdateParam: InlineObject14) : Unit {
        val localVariableBody: kotlin.Any? = vehicleUpdateParam
        val localVariableQuery: MultiValueMap = mapOf("access_token" to listOf("$accessToken"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fleet/set_data",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}
