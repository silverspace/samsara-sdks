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
package org.openapitools.server

import io.ktor.application.ApplicationCall
import io.ktor.http.HttpMethod
import io.ktor.locations.*
import io.ktor.pipeline.PipelineContext
import io.ktor.routing.Route
import io.ktor.routing.method
import org.openapitools.server.models.*


// NOTE: ktor-location@0.9.0 is missing extension for Route.delete. This includes it.
inline fun <reified T : Any> Route.delete(noinline body: suspend PipelineContext<Unit, ApplicationCall>.(T) -> Unit): Route {
    return location(T::class) {
        method(HttpMethod.Delete) {
            handle(body)
        }
    }
}

object Paths {
    /**
     * /fleet/assets/locations
     * Fetch current locations of all assets for the group.
     * @param accessToken Samsara API access token. 
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional, default to null)
     */
    @Location("/fleet/assets/locations") class getAllAssetCurrentLocations(val accessToken: kotlin.String, val groupId: kotlin.Long)

    /**
     * /fleet/assets
     * Fetch all of the assets for the group.
     * @param accessToken Samsara API access token. 
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional, default to null)
     */
    @Location("/fleet/assets") class getAllAssets(val accessToken: kotlin.String, val groupId: kotlin.Long)

    /**
     * /fleet/assets/{assetId:[0-9]+}/locations
     * Fetch the historical locations for the asset.
     * @param accessToken Samsara API access token. 
     * @param assetId ID of the asset 
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
     */
    @Location("/fleet/assets/{asset_id}/locations") class getAssetLocation(val accessToken: kotlin.String, val assetId: kotlin.Long, val startMs: kotlin.Long, val endMs: kotlin.Long)

    /**
     * /fleet/assets/{assetId:[0-9]+}/reefer
     * Fetch the reefer-specific stats of an asset.
     * @param accessToken Samsara API access token. 
     * @param assetId ID of the asset 
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
     */
    @Location("/fleet/assets/{asset_id}/reefer") class getAssetReefer(val accessToken: kotlin.String, val assetId: kotlin.Long, val startMs: kotlin.Long, val endMs: kotlin.Long)

    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Deactivate a driver with the given id.
     * @param accessToken Samsara API access token. 
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
     */
    @Location("/fleet/drivers/{driver_id_or_external_id}") class deactivateDriver(val accessToken: kotlin.String, val driverIdOrExternalId: kotlin.String)

    /**
     * /fleet/drivers/inactive
     * Fetch all deactivated drivers for the group.
     * @param accessToken Samsara API access token. 
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional, default to null)
     */
    @Location("/fleet/drivers/inactive") class getAllDeactivatedDrivers(val accessToken: kotlin.String, val groupId: kotlin.Long)

    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Fetch deactivated driver by id.
     * @param accessToken Samsara API access token. 
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
     */
    @Location("/fleet/drivers/inactive/{driver_id_or_external_id}") class getDeactivatedDriverById(val accessToken: kotlin.String, val driverIdOrExternalId: kotlin.String)

    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Fetch driver by id.
     * @param accessToken Samsara API access token. 
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
     */
    @Location("/fleet/drivers/{driver_id_or_external_id}") class getDriverById(val accessToken: kotlin.String, val driverIdOrExternalId: kotlin.String)

    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Deactivate a driver with the given id.
     * @param accessToken Samsara API access token. 
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
     */
    @Location("/fleet/drivers/{driver_id_or_external_id}") class deactivateDriver(val accessToken: kotlin.String, val driverIdOrExternalId: kotlin.String)

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     * Delete a dispatch route and its associated jobs.
     * @param accessToken Samsara API access token. 
     * @param routeId ID of the dispatch route. 
     */
    @Location("/fleet/dispatch/routes/{route_id}") class deleteDispatchRouteById(val accessToken: kotlin.String, val routeId: kotlin.Long)

    /**
     * /addresses/{addressId}
     * Delete an address.
     * @param accessToken Samsara API access token. 
     * @param addressId ID of the address/geofence 
     */
    @Location("/addresses/{addressId}") class deleteOrganizationAddress(val accessToken: kotlin.String, val addressId: kotlin.Long)

    /**
     * /fleet/dispatch/routes
     * Fetch all of the dispatch routes for the group.
     * @param accessToken Samsara API access token. 
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional, default to null)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional, default to null)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional, default to null)
     */
    @Location("/fleet/dispatch/routes") class fetchAllDispatchRoutes(val accessToken: kotlin.String, val groupId: kotlin.Long, val endTime: kotlin.Long, val duration: kotlin.Long)

    /**
     * /fleet/dispatch/routes/job_updates
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * @param accessToken Samsara API access token. 
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional, default to null)
     * @param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional, default to null)
     * @param include Optionally set include&#x3D;route to include route object in response payload. (optional, default to null)
     */
    @Location("/fleet/dispatch/routes/job_updates") class fetchAllRouteJobUpdates(val accessToken: kotlin.String, val groupId: kotlin.Long, val sequenceId: kotlin.String, val include: kotlin.String)

    /**
     * /fleet/assets/locations
     * Fetch current locations of all assets for the group.
     * @param accessToken Samsara API access token. 
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional, default to null)
     */
    @Location("/fleet/assets/locations") class getAllAssetCurrentLocations(val accessToken: kotlin.String, val groupId: kotlin.Long)

    /**
     * /fleet/assets
     * Fetch all of the assets for the group.
     * @param accessToken Samsara API access token. 
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional, default to null)
     */
    @Location("/fleet/assets") class getAllAssets(val accessToken: kotlin.String, val groupId: kotlin.Long)

    /**
     * /fleet/drivers/inactive
     * Fetch all deactivated drivers for the group.
     * @param accessToken Samsara API access token. 
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional, default to null)
     */
    @Location("/fleet/drivers/inactive") class getAllDeactivatedDrivers(val accessToken: kotlin.String, val groupId: kotlin.Long)

    /**
     * /fleet/assets/{assetId:[0-9]+}/locations
     * Fetch the historical locations for the asset.
     * @param accessToken Samsara API access token. 
     * @param assetId ID of the asset 
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
     */
    @Location("/fleet/assets/{asset_id}/locations") class getAssetLocation(val accessToken: kotlin.String, val assetId: kotlin.Long, val startMs: kotlin.Long, val endMs: kotlin.Long)

    /**
     * /fleet/assets/{assetId:[0-9]+}/reefer
     * Fetch the reefer-specific stats of an asset.
     * @param accessToken Samsara API access token. 
     * @param assetId ID of the asset 
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
     */
    @Location("/fleet/assets/{asset_id}/reefer") class getAssetReefer(val accessToken: kotlin.String, val assetId: kotlin.Long, val startMs: kotlin.Long, val endMs: kotlin.Long)

    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Fetch deactivated driver by id.
     * @param accessToken Samsara API access token. 
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
     */
    @Location("/fleet/drivers/inactive/{driver_id_or_external_id}") class getDeactivatedDriverById(val accessToken: kotlin.String, val driverIdOrExternalId: kotlin.String)

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     * Fetch a dispatch route by id.
     * @param accessToken Samsara API access token. 
     * @param routeId ID of the dispatch route. 
     */
    @Location("/fleet/dispatch/routes/{route_id}") class getDispatchRouteById(val accessToken: kotlin.String, val routeId: kotlin.Long)

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     * Fetch the history of a dispatch route.
     * @param accessToken Samsara API access token. 
     * @param routeId ID of the route with history. 
     * @param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional, default to null)
     * @param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional, default to null)
     */
    @Location("/fleet/dispatch/routes/{route_id}/history") class getDispatchRouteHistory(val accessToken: kotlin.String, val routeId: kotlin.Long, val startTime: kotlin.Long, val endTime: kotlin.Long)

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * Fetch all of the dispatch routes for a given driver.
     * @param accessToken Samsara API access token. 
     * @param driverId ID of the driver with the associated routes. 
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional, default to null)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional, default to null)
     */
    @Location("/fleet/drivers/{driver_id}/dispatch/routes") class getDispatchRoutesByDriverId(val accessToken: kotlin.String, val driverId: kotlin.Long, val endTime: kotlin.Long, val duration: kotlin.Long)

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * Fetch all of the dispatch routes for a given vehicle.
     * @param accessToken Samsara API access token. 
     * @param vehicleId ID of the vehicle with the associated routes. 
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional, default to null)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional, default to null)
     */
    @Location("/fleet/vehicles/{vehicle_id}/dispatch/routes") class getDispatchRoutesByVehicleId(val accessToken: kotlin.String, val vehicleId: kotlin.Long, val endTime: kotlin.Long, val duration: kotlin.Long)

    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Fetch driver by id.
     * @param accessToken Samsara API access token. 
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
     */
    @Location("/fleet/drivers/{driver_id_or_external_id}") class getDriverById(val accessToken: kotlin.String, val driverIdOrExternalId: kotlin.String)

    /**
     * /fleet/drivers/document_types
     * Fetch all of the document types.
     */
    @Location("/fleet/drivers/document_types") class getDriverDocumentTypesByOrgId()

    /**
     * /fleet/drivers/documents
     * Fetch all of the documents.
     * @param accessToken Samsara API access token. 
     * @param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional, default to null)
     * @param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional, default to null)
     */
    @Location("/fleet/drivers/documents") class getDriverDocumentsByOrgId(val accessToken: kotlin.String, val endMs: kotlin.Long, val durationMs: kotlin.Long)

    /**
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     * Fetch the safety score for the driver.
     * @param driverId ID of the driver 
     * @param accessToken Samsara API access token. 
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
     */
    @Location("/fleet/drivers/{driverId}/safety/score") class getDriverSafetyScore(val driverId: kotlin.Long, val accessToken: kotlin.String, val startMs: kotlin.Long, val endMs: kotlin.Long)

    /**
     * /fleet/maintenance/dvirs
     * Get DVIRs for the org within provided time constraints
     * @param accessToken Samsara API access token. 
     * @param endMs time in millis until the last dvir log. 
     * @param durationMs time in millis which corresponds to the duration before the end_ms. 
     * @param groupId Group ID to query. (optional, default to null)
     */
    @Location("/fleet/maintenance/dvirs") class getDvirs(val accessToken: kotlin.String, val endMs: kotlin.Int, val durationMs: kotlin.Int, val groupId: kotlin.Int)

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Gets a specific vehicle.
     * @param accessToken Samsara API access token. 
     * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. 
     */
    @Location("/fleet/vehicles/{vehicle_id_or_external_id}") class getFleetVehicle(val accessToken: kotlin.String, val vehicleIdOrExternalId: kotlin.String)

    /**
     * /addresses/{addressId}
     * Fetch an address by its id.
     * @param accessToken Samsara API access token. 
     * @param addressId ID of the address/geofence 
     */
    @Location("/addresses/{addressId}") class getOrganizationAddress(val accessToken: kotlin.String, val addressId: kotlin.Long)

    /**
     * /addresses
     * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
     * @param accessToken Samsara API access token. 
     */
    @Location("/addresses") class getOrganizationAddresses(val accessToken: kotlin.String)

    /**
     * /contacts/{contact_id}
     * Fetch a contact by its id.
     * @param accessToken Samsara API access token. 
     * @param contactId ID of the contact 
     */
    @Location("/contacts/{contact_id}") class getOrganizationContact(val accessToken: kotlin.String, val contactId: kotlin.Long)

    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     * Fetch harsh event details for a vehicle.
     * @param vehicleId ID of the vehicle 
     * @param accessToken Samsara API access token. 
     * @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event. 
     */
    @Location("/fleet/vehicles/{vehicleId}/safety/harsh_event") class getVehicleHarshEvent(val vehicleId: kotlin.Long, val accessToken: kotlin.String, val timestamp: kotlin.Long)

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
     * @param accessToken Samsara API access token. 
     * @param vehicleId ID of the vehicle with the associated routes. 
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) 
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) 
     */
    @Location("/fleet/vehicles/{vehicle_id}/locations") class getVehicleLocations(val accessToken: kotlin.String, val vehicleId: kotlin.Long, val startMs: kotlin.Long, val endMs: kotlin.Long)

    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     * Fetch the safety score for the vehicle.
     * @param vehicleId ID of the vehicle 
     * @param accessToken Samsara API access token. 
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
     */
    @Location("/fleet/vehicles/{vehicleId}/safety/score") class getVehicleSafetyScore(val vehicleId: kotlin.Long, val accessToken: kotlin.String, val startMs: kotlin.Long, val endMs: kotlin.Long)

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
     */
    @Location("/fleet/vehicles/stats") class getVehicleStats(val accessToken: kotlin.String, val startMs: kotlin.Int, val endMs: kotlin.Int, val series: kotlin.String, val tagIds: kotlin.String, val startingAfter: kotlin.String, val endingBefore: kotlin.String, val limit: kotlin.Long)

    /**
     * /fleet/vehicles/locations
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
     * @param accessToken Samsara API access token. 
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) 
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) 
     */
    @Location("/fleet/vehicles/locations") class getVehiclesLocations(val accessToken: kotlin.String, val startMs: kotlin.Int, val endMs: kotlin.Int)

    /**
     * /contacts
     * Fetch all contacts for the organization.
     * @param accessToken Samsara API access token. 
     */
    @Location("/contacts") class listContacts(val accessToken: kotlin.String)

    /**
     * /industrial/data
     * Fetch all of the data inputs for a group.
     * @param accessToken Samsara API access token. 
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional, default to null)
     * @param startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional, default to null)
     * @param endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional, default to null)
     */
    @Location("/industrial/data") class getAllDataInputs(val accessToken: kotlin.String, val groupId: kotlin.Long, val startMs: kotlin.Long, val endMs: kotlin.Long)

    /**
     * /industrial/data/{data_input_id:[0-9]+}
     * Fetch datapoints from a given data input.
     * @param accessToken Samsara API access token. 
     * @param dataInputId ID of the data input 
     * @param startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional, default to null)
     * @param endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional, default to null)
     */
    @Location("/industrial/data/{data_input_id}") class getDataInput(val accessToken: kotlin.String, val dataInputId: kotlin.Long, val startMs: kotlin.Long, val endMs: kotlin.Long)

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     * Delete a dispatch route and its associated jobs.
     * @param accessToken Samsara API access token. 
     * @param routeId ID of the dispatch route. 
     */
    @Location("/fleet/dispatch/routes/{route_id}") class deleteDispatchRouteById(val accessToken: kotlin.String, val routeId: kotlin.Long)

    /**
     * /fleet/dispatch/routes
     * Fetch all of the dispatch routes for the group.
     * @param accessToken Samsara API access token. 
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional, default to null)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional, default to null)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional, default to null)
     */
    @Location("/fleet/dispatch/routes") class fetchAllDispatchRoutes(val accessToken: kotlin.String, val groupId: kotlin.Long, val endTime: kotlin.Long, val duration: kotlin.Long)

    /**
     * /fleet/dispatch/routes/job_updates
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * @param accessToken Samsara API access token. 
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional, default to null)
     * @param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional, default to null)
     * @param include Optionally set include&#x3D;route to include route object in response payload. (optional, default to null)
     */
    @Location("/fleet/dispatch/routes/job_updates") class fetchAllRouteJobUpdates(val accessToken: kotlin.String, val groupId: kotlin.Long, val sequenceId: kotlin.String, val include: kotlin.String)

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     * Fetch a dispatch route by id.
     * @param accessToken Samsara API access token. 
     * @param routeId ID of the dispatch route. 
     */
    @Location("/fleet/dispatch/routes/{route_id}") class getDispatchRouteById(val accessToken: kotlin.String, val routeId: kotlin.Long)

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     * Fetch the history of a dispatch route.
     * @param accessToken Samsara API access token. 
     * @param routeId ID of the route with history. 
     * @param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional, default to null)
     * @param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional, default to null)
     */
    @Location("/fleet/dispatch/routes/{route_id}/history") class getDispatchRouteHistory(val accessToken: kotlin.String, val routeId: kotlin.Long, val startTime: kotlin.Long, val endTime: kotlin.Long)

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * Fetch all of the dispatch routes for a given driver.
     * @param accessToken Samsara API access token. 
     * @param driverId ID of the driver with the associated routes. 
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional, default to null)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional, default to null)
     */
    @Location("/fleet/drivers/{driver_id}/dispatch/routes") class getDispatchRoutesByDriverId(val accessToken: kotlin.String, val driverId: kotlin.Long, val endTime: kotlin.Long, val duration: kotlin.Long)

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * Fetch all of the dispatch routes for a given vehicle.
     * @param accessToken Samsara API access token. 
     * @param vehicleId ID of the vehicle with the associated routes. 
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional, default to null)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional, default to null)
     */
    @Location("/fleet/vehicles/{vehicle_id}/dispatch/routes") class getDispatchRoutesByVehicleId(val accessToken: kotlin.String, val vehicleId: kotlin.Long, val endTime: kotlin.Long, val duration: kotlin.Long)

    /**
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     * Fetch the safety score for the driver.
     * @param driverId ID of the driver 
     * @param accessToken Samsara API access token. 
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
     */
    @Location("/fleet/drivers/{driverId}/safety/score") class getDriverSafetyScore(val driverId: kotlin.Long, val accessToken: kotlin.String, val startMs: kotlin.Long, val endMs: kotlin.Long)

    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     * Fetch harsh event details for a vehicle.
     * @param vehicleId ID of the vehicle 
     * @param accessToken Samsara API access token. 
     * @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event. 
     */
    @Location("/fleet/vehicles/{vehicleId}/safety/harsh_event") class getVehicleHarshEvent(val vehicleId: kotlin.Long, val accessToken: kotlin.String, val timestamp: kotlin.Long)

    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     * Fetch the safety score for the vehicle.
     * @param vehicleId ID of the vehicle 
     * @param accessToken Samsara API access token. 
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
     */
    @Location("/fleet/vehicles/{vehicleId}/safety/score") class getVehicleSafetyScore(val vehicleId: kotlin.Long, val accessToken: kotlin.String, val startMs: kotlin.Long, val endMs: kotlin.Long)

    /**
     * /tags/{tag_id:[0-9]+}
     * Permanently deletes a tag.
     * @param accessToken Samsara API access token. 
     * @param tagId ID of the tag. 
     */
    @Location("/tags/{tag_id}") class deleteTagById(val accessToken: kotlin.String, val tagId: kotlin.Long)

    /**
     * /tags
     * Fetch all of the tags for a group.
     * @param accessToken Samsara API access token. 
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional, default to null)
     */
    @Location("/tags") class getAllTags(val accessToken: kotlin.String, val groupId: kotlin.Long)

    /**
     * /tags/{tag_id:[0-9]+}
     * Fetch a tag by id.
     * @param accessToken Samsara API access token. 
     * @param tagId ID of the tag. 
     */
    @Location("/tags/{tag_id}") class getTagById(val accessToken: kotlin.String, val tagId: kotlin.Long)

    /**
     * /users/{userId:[0-9]+}
     * Remove a user from the organization.
     * @param accessToken Samsara API access token. 
     * @param userId ID of the user. 
     */
    @Location("/users/{userId}") class deleteUserById(val accessToken: kotlin.String, val userId: kotlin.Long)

    /**
     * /users/{userId:[0-9]+}
     * Get a user.
     * @param accessToken Samsara API access token. 
     * @param userId ID of the user. 
     */
    @Location("/users/{userId}") class getUserById(val accessToken: kotlin.String, val userId: kotlin.Long)

    /**
     * /user_roles
     * Get all roles in the organization.
     * @param accessToken Samsara API access token. 
     */
    @Location("/user_roles") class listUserRoles(val accessToken: kotlin.String)

    /**
     * /users
     * List all users in the organization.
     * @param accessToken Samsara API access token. 
     */
    @Location("/users") class listUsers(val accessToken: kotlin.String)

}
