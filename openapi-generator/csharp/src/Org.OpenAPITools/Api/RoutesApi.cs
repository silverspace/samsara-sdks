/* 
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |- -- -- -- -- -- --|- -- -- -- -- -- -- -- -|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IRoutesApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// /fleet/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Create a new dispatch route.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        DispatchRoute CreateDispatchRoute (string accessToken, DispatchRouteCreate createDispatchRouteParams);

        /// <summary>
        /// /fleet/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Create a new dispatch route.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>ApiResponse of DispatchRoute</returns>
        ApiResponse<DispatchRoute> CreateDispatchRouteWithHttpInfo (string accessToken, DispatchRouteCreate createDispatchRouteParams);
        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Create a new dispatch route for the driver with driver_id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        DispatchRoute CreateDriverDispatchRoute (string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams);

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Create a new dispatch route for the driver with driver_id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>ApiResponse of DispatchRoute</returns>
        ApiResponse<DispatchRoute> CreateDriverDispatchRouteWithHttpInfo (string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams);
        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Create a new dispatch route for the vehicle with vehicle_id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        DispatchRoute CreateVehicleDispatchRoute (string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams);

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Create a new dispatch route for the vehicle with vehicle_id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>ApiResponse of DispatchRoute</returns>
        ApiResponse<DispatchRoute> CreateVehicleDispatchRouteWithHttpInfo (string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams);
        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/
        /// </summary>
        /// <remarks>
        /// Delete a dispatch route and its associated jobs.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns></returns>
        void DeleteDispatchRouteById (string accessToken, long? routeId);

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/
        /// </summary>
        /// <remarks>
        /// Delete a dispatch route and its associated jobs.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> DeleteDispatchRouteByIdWithHttpInfo (string accessToken, long? routeId);
        /// <summary>
        /// /fleet/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Fetch all of the dispatch routes for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>List&lt;DispatchRoute&gt;</returns>
        List<DispatchRoute> FetchAllDispatchRoutes (string accessToken, long? groupId = null, long? endTime = null, long? duration = null);

        /// <summary>
        /// /fleet/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Fetch all of the dispatch routes for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>ApiResponse of List&lt;DispatchRoute&gt;</returns>
        ApiResponse<List<DispatchRoute>> FetchAllDispatchRoutesWithHttpInfo (string accessToken, long? groupId = null, long? endTime = null, long? duration = null);
        /// <summary>
        /// /fleet/dispatch/routes/job_updates
        /// </summary>
        /// <remarks>
        /// Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="sequenceId">Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)</param>
        /// <param name="include">Optionally set include&#x3D;route to include route object in response payload. (optional)</param>
        /// <returns>AllRouteJobUpdates</returns>
        AllRouteJobUpdates FetchAllRouteJobUpdates (string accessToken, long? groupId = null, string sequenceId = null, string include = null);

        /// <summary>
        /// /fleet/dispatch/routes/job_updates
        /// </summary>
        /// <remarks>
        /// Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="sequenceId">Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)</param>
        /// <param name="include">Optionally set include&#x3D;route to include route object in response payload. (optional)</param>
        /// <returns>ApiResponse of AllRouteJobUpdates</returns>
        ApiResponse<AllRouteJobUpdates> FetchAllRouteJobUpdatesWithHttpInfo (string accessToken, long? groupId = null, string sequenceId = null, string include = null);
        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch a dispatch route by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>DispatchRoute</returns>
        DispatchRoute GetDispatchRouteById (string accessToken, long? routeId);

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch a dispatch route by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>ApiResponse of DispatchRoute</returns>
        ApiResponse<DispatchRoute> GetDispatchRouteByIdWithHttpInfo (string accessToken, long? routeId);
        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/history
        /// </summary>
        /// <remarks>
        /// Fetch the history of a dispatch route.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the route with history.</param>
        /// <param name="startTime">Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)</param>
        /// <param name="endTime">Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)</param>
        /// <returns>DispatchRouteHistory</returns>
        DispatchRouteHistory GetDispatchRouteHistory (string accessToken, long? routeId, long? startTime = null, long? endTime = null);

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/history
        /// </summary>
        /// <remarks>
        /// Fetch the history of a dispatch route.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the route with history.</param>
        /// <param name="startTime">Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)</param>
        /// <param name="endTime">Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)</param>
        /// <returns>ApiResponse of DispatchRouteHistory</returns>
        ApiResponse<DispatchRouteHistory> GetDispatchRouteHistoryWithHttpInfo (string accessToken, long? routeId, long? startTime = null, long? endTime = null);
        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Fetch all of the dispatch routes for a given driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>List&lt;DispatchRoute&gt;</returns>
        List<DispatchRoute> GetDispatchRoutesByDriverId (string accessToken, long? driverId, long? endTime = null, long? duration = null);

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Fetch all of the dispatch routes for a given driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>ApiResponse of List&lt;DispatchRoute&gt;</returns>
        ApiResponse<List<DispatchRoute>> GetDispatchRoutesByDriverIdWithHttpInfo (string accessToken, long? driverId, long? endTime = null, long? duration = null);
        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Fetch all of the dispatch routes for a given vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>List&lt;DispatchRoute&gt;</returns>
        List<DispatchRoute> GetDispatchRoutesByVehicleId (string accessToken, long? vehicleId, long? endTime = null, long? duration = null);

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Fetch all of the dispatch routes for a given vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>ApiResponse of List&lt;DispatchRoute&gt;</returns>
        ApiResponse<List<DispatchRoute>> GetDispatchRoutesByVehicleIdWithHttpInfo (string accessToken, long? vehicleId, long? endTime = null, long? duration = null);
        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/
        /// </summary>
        /// <remarks>
        /// Update a dispatch route and its associated jobs.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <param name="updateDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        DispatchRoute UpdateDispatchRouteById (string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams);

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/
        /// </summary>
        /// <remarks>
        /// Update a dispatch route and its associated jobs.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <param name="updateDispatchRouteParams"></param>
        /// <returns>ApiResponse of DispatchRoute</returns>
        ApiResponse<DispatchRoute> UpdateDispatchRouteByIdWithHttpInfo (string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// /fleet/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Create a new dispatch route.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of DispatchRoute</returns>
        System.Threading.Tasks.Task<DispatchRoute> CreateDispatchRouteAsync (string accessToken, DispatchRouteCreate createDispatchRouteParams);

        /// <summary>
        /// /fleet/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Create a new dispatch route.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of ApiResponse (DispatchRoute)</returns>
        System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> CreateDispatchRouteAsyncWithHttpInfo (string accessToken, DispatchRouteCreate createDispatchRouteParams);
        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Create a new dispatch route for the driver with driver_id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of DispatchRoute</returns>
        System.Threading.Tasks.Task<DispatchRoute> CreateDriverDispatchRouteAsync (string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams);

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Create a new dispatch route for the driver with driver_id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of ApiResponse (DispatchRoute)</returns>
        System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> CreateDriverDispatchRouteAsyncWithHttpInfo (string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams);
        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Create a new dispatch route for the vehicle with vehicle_id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of DispatchRoute</returns>
        System.Threading.Tasks.Task<DispatchRoute> CreateVehicleDispatchRouteAsync (string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams);

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Create a new dispatch route for the vehicle with vehicle_id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of ApiResponse (DispatchRoute)</returns>
        System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> CreateVehicleDispatchRouteAsyncWithHttpInfo (string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams);
        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/
        /// </summary>
        /// <remarks>
        /// Delete a dispatch route and its associated jobs.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task DeleteDispatchRouteByIdAsync (string accessToken, long? routeId);

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/
        /// </summary>
        /// <remarks>
        /// Delete a dispatch route and its associated jobs.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> DeleteDispatchRouteByIdAsyncWithHttpInfo (string accessToken, long? routeId);
        /// <summary>
        /// /fleet/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Fetch all of the dispatch routes for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of List&lt;DispatchRoute&gt;</returns>
        System.Threading.Tasks.Task<List<DispatchRoute>> FetchAllDispatchRoutesAsync (string accessToken, long? groupId = null, long? endTime = null, long? duration = null);

        /// <summary>
        /// /fleet/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Fetch all of the dispatch routes for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;DispatchRoute&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<DispatchRoute>>> FetchAllDispatchRoutesAsyncWithHttpInfo (string accessToken, long? groupId = null, long? endTime = null, long? duration = null);
        /// <summary>
        /// /fleet/dispatch/routes/job_updates
        /// </summary>
        /// <remarks>
        /// Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="sequenceId">Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)</param>
        /// <param name="include">Optionally set include&#x3D;route to include route object in response payload. (optional)</param>
        /// <returns>Task of AllRouteJobUpdates</returns>
        System.Threading.Tasks.Task<AllRouteJobUpdates> FetchAllRouteJobUpdatesAsync (string accessToken, long? groupId = null, string sequenceId = null, string include = null);

        /// <summary>
        /// /fleet/dispatch/routes/job_updates
        /// </summary>
        /// <remarks>
        /// Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="sequenceId">Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)</param>
        /// <param name="include">Optionally set include&#x3D;route to include route object in response payload. (optional)</param>
        /// <returns>Task of ApiResponse (AllRouteJobUpdates)</returns>
        System.Threading.Tasks.Task<ApiResponse<AllRouteJobUpdates>> FetchAllRouteJobUpdatesAsyncWithHttpInfo (string accessToken, long? groupId = null, string sequenceId = null, string include = null);
        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch a dispatch route by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>Task of DispatchRoute</returns>
        System.Threading.Tasks.Task<DispatchRoute> GetDispatchRouteByIdAsync (string accessToken, long? routeId);

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch a dispatch route by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>Task of ApiResponse (DispatchRoute)</returns>
        System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> GetDispatchRouteByIdAsyncWithHttpInfo (string accessToken, long? routeId);
        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/history
        /// </summary>
        /// <remarks>
        /// Fetch the history of a dispatch route.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the route with history.</param>
        /// <param name="startTime">Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)</param>
        /// <param name="endTime">Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)</param>
        /// <returns>Task of DispatchRouteHistory</returns>
        System.Threading.Tasks.Task<DispatchRouteHistory> GetDispatchRouteHistoryAsync (string accessToken, long? routeId, long? startTime = null, long? endTime = null);

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/history
        /// </summary>
        /// <remarks>
        /// Fetch the history of a dispatch route.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the route with history.</param>
        /// <param name="startTime">Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)</param>
        /// <param name="endTime">Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)</param>
        /// <returns>Task of ApiResponse (DispatchRouteHistory)</returns>
        System.Threading.Tasks.Task<ApiResponse<DispatchRouteHistory>> GetDispatchRouteHistoryAsyncWithHttpInfo (string accessToken, long? routeId, long? startTime = null, long? endTime = null);
        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Fetch all of the dispatch routes for a given driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of List&lt;DispatchRoute&gt;</returns>
        System.Threading.Tasks.Task<List<DispatchRoute>> GetDispatchRoutesByDriverIdAsync (string accessToken, long? driverId, long? endTime = null, long? duration = null);

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Fetch all of the dispatch routes for a given driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;DispatchRoute&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<DispatchRoute>>> GetDispatchRoutesByDriverIdAsyncWithHttpInfo (string accessToken, long? driverId, long? endTime = null, long? duration = null);
        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Fetch all of the dispatch routes for a given vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of List&lt;DispatchRoute&gt;</returns>
        System.Threading.Tasks.Task<List<DispatchRoute>> GetDispatchRoutesByVehicleIdAsync (string accessToken, long? vehicleId, long? endTime = null, long? duration = null);

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>
        /// Fetch all of the dispatch routes for a given vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;DispatchRoute&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<DispatchRoute>>> GetDispatchRoutesByVehicleIdAsyncWithHttpInfo (string accessToken, long? vehicleId, long? endTime = null, long? duration = null);
        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/
        /// </summary>
        /// <remarks>
        /// Update a dispatch route and its associated jobs.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <param name="updateDispatchRouteParams"></param>
        /// <returns>Task of DispatchRoute</returns>
        System.Threading.Tasks.Task<DispatchRoute> UpdateDispatchRouteByIdAsync (string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams);

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/
        /// </summary>
        /// <remarks>
        /// Update a dispatch route and its associated jobs.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <param name="updateDispatchRouteParams"></param>
        /// <returns>Task of ApiResponse (DispatchRoute)</returns>
        System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> UpdateDispatchRouteByIdAsyncWithHttpInfo (string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class RoutesApi : IRoutesApi
    {
        private Org.OpenAPITools.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="RoutesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public RoutesApi(String basePath)
        {
            this.Configuration = new Org.OpenAPITools.Client.Configuration { BasePath = basePath };

            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="RoutesApi"/> class
        /// </summary>
        /// <returns></returns>
        public RoutesApi()
        {
            this.Configuration = Org.OpenAPITools.Client.Configuration.Default;

            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="RoutesApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public RoutesApi(Org.OpenAPITools.Client.Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = Org.OpenAPITools.Client.Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        [Obsolete("SetBasePath is deprecated, please do 'Configuration.ApiClient = new ApiClient(\"http://new-path\")' instead.")]
        public void SetBasePath(String basePath)
        {
            // do nothing
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Org.OpenAPITools.Client.Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public Org.OpenAPITools.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public IDictionary<String, String> DefaultHeader()
        {
            return new ReadOnlyDictionary<string, string>(this.Configuration.DefaultHeader);
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        /// /fleet/dispatch/routes Create a new dispatch route.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        public DispatchRoute CreateDispatchRoute (string accessToken, DispatchRouteCreate createDispatchRouteParams)
        {
             ApiResponse<DispatchRoute> localVarResponse = CreateDispatchRouteWithHttpInfo(accessToken, createDispatchRouteParams);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/dispatch/routes Create a new dispatch route.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>ApiResponse of DispatchRoute</returns>
        public ApiResponse< DispatchRoute > CreateDispatchRouteWithHttpInfo (string accessToken, DispatchRouteCreate createDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->CreateDispatchRoute");
            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null)
                throw new ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling RoutesApi->CreateDispatchRoute");

            var localVarPath = "/fleet/dispatch/routes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (createDispatchRouteParams != null && createDispatchRouteParams.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(createDispatchRouteParams); // http body (model) parameter
            }
            else
            {
                localVarPostBody = createDispatchRouteParams; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateDispatchRoute", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DispatchRoute>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DispatchRoute) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DispatchRoute)));
        }

        /// <summary>
        /// /fleet/dispatch/routes Create a new dispatch route.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of DispatchRoute</returns>
        public async System.Threading.Tasks.Task<DispatchRoute> CreateDispatchRouteAsync (string accessToken, DispatchRouteCreate createDispatchRouteParams)
        {
             ApiResponse<DispatchRoute> localVarResponse = await CreateDispatchRouteAsyncWithHttpInfo(accessToken, createDispatchRouteParams);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/dispatch/routes Create a new dispatch route.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of ApiResponse (DispatchRoute)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> CreateDispatchRouteAsyncWithHttpInfo (string accessToken, DispatchRouteCreate createDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->CreateDispatchRoute");
            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null)
                throw new ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling RoutesApi->CreateDispatchRoute");

            var localVarPath = "/fleet/dispatch/routes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (createDispatchRouteParams != null && createDispatchRouteParams.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(createDispatchRouteParams); // http body (model) parameter
            }
            else
            {
                localVarPostBody = createDispatchRouteParams; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateDispatchRoute", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DispatchRoute>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DispatchRoute) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DispatchRoute)));
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes Create a new dispatch route for the driver with driver_id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        public DispatchRoute CreateDriverDispatchRoute (string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams)
        {
             ApiResponse<DispatchRoute> localVarResponse = CreateDriverDispatchRouteWithHttpInfo(accessToken, driverId, createDispatchRouteParams);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes Create a new dispatch route for the driver with driver_id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>ApiResponse of DispatchRoute</returns>
        public ApiResponse< DispatchRoute > CreateDriverDispatchRouteWithHttpInfo (string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->CreateDriverDispatchRoute");
            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new ApiException(400, "Missing required parameter 'driverId' when calling RoutesApi->CreateDriverDispatchRoute");
            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null)
                throw new ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling RoutesApi->CreateDriverDispatchRoute");

            var localVarPath = "/fleet/drivers/{driver_id}/dispatch/routes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (driverId != null) localVarPathParams.Add("driver_id", this.Configuration.ApiClient.ParameterToString(driverId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (createDispatchRouteParams != null && createDispatchRouteParams.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(createDispatchRouteParams); // http body (model) parameter
            }
            else
            {
                localVarPostBody = createDispatchRouteParams; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateDriverDispatchRoute", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DispatchRoute>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DispatchRoute) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DispatchRoute)));
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes Create a new dispatch route for the driver with driver_id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of DispatchRoute</returns>
        public async System.Threading.Tasks.Task<DispatchRoute> CreateDriverDispatchRouteAsync (string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams)
        {
             ApiResponse<DispatchRoute> localVarResponse = await CreateDriverDispatchRouteAsyncWithHttpInfo(accessToken, driverId, createDispatchRouteParams);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes Create a new dispatch route for the driver with driver_id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of ApiResponse (DispatchRoute)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> CreateDriverDispatchRouteAsyncWithHttpInfo (string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->CreateDriverDispatchRoute");
            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new ApiException(400, "Missing required parameter 'driverId' when calling RoutesApi->CreateDriverDispatchRoute");
            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null)
                throw new ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling RoutesApi->CreateDriverDispatchRoute");

            var localVarPath = "/fleet/drivers/{driver_id}/dispatch/routes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (driverId != null) localVarPathParams.Add("driver_id", this.Configuration.ApiClient.ParameterToString(driverId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (createDispatchRouteParams != null && createDispatchRouteParams.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(createDispatchRouteParams); // http body (model) parameter
            }
            else
            {
                localVarPostBody = createDispatchRouteParams; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateDriverDispatchRoute", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DispatchRoute>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DispatchRoute) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DispatchRoute)));
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes Create a new dispatch route for the vehicle with vehicle_id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        public DispatchRoute CreateVehicleDispatchRoute (string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams)
        {
             ApiResponse<DispatchRoute> localVarResponse = CreateVehicleDispatchRouteWithHttpInfo(accessToken, vehicleId, createDispatchRouteParams);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes Create a new dispatch route for the vehicle with vehicle_id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>ApiResponse of DispatchRoute</returns>
        public ApiResponse< DispatchRoute > CreateVehicleDispatchRouteWithHttpInfo (string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->CreateVehicleDispatchRoute");
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new ApiException(400, "Missing required parameter 'vehicleId' when calling RoutesApi->CreateVehicleDispatchRoute");
            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null)
                throw new ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling RoutesApi->CreateVehicleDispatchRoute");

            var localVarPath = "/fleet/vehicles/{vehicle_id}/dispatch/routes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (vehicleId != null) localVarPathParams.Add("vehicle_id", this.Configuration.ApiClient.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (createDispatchRouteParams != null && createDispatchRouteParams.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(createDispatchRouteParams); // http body (model) parameter
            }
            else
            {
                localVarPostBody = createDispatchRouteParams; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateVehicleDispatchRoute", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DispatchRoute>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DispatchRoute) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DispatchRoute)));
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes Create a new dispatch route for the vehicle with vehicle_id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of DispatchRoute</returns>
        public async System.Threading.Tasks.Task<DispatchRoute> CreateVehicleDispatchRouteAsync (string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams)
        {
             ApiResponse<DispatchRoute> localVarResponse = await CreateVehicleDispatchRouteAsyncWithHttpInfo(accessToken, vehicleId, createDispatchRouteParams);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes Create a new dispatch route for the vehicle with vehicle_id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of ApiResponse (DispatchRoute)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> CreateVehicleDispatchRouteAsyncWithHttpInfo (string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->CreateVehicleDispatchRoute");
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new ApiException(400, "Missing required parameter 'vehicleId' when calling RoutesApi->CreateVehicleDispatchRoute");
            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null)
                throw new ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling RoutesApi->CreateVehicleDispatchRoute");

            var localVarPath = "/fleet/vehicles/{vehicle_id}/dispatch/routes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (vehicleId != null) localVarPathParams.Add("vehicle_id", this.Configuration.ApiClient.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (createDispatchRouteParams != null && createDispatchRouteParams.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(createDispatchRouteParams); // http body (model) parameter
            }
            else
            {
                localVarPostBody = createDispatchRouteParams; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateVehicleDispatchRoute", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DispatchRoute>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DispatchRoute) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DispatchRoute)));
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Delete a dispatch route and its associated jobs.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns></returns>
        public void DeleteDispatchRouteById (string accessToken, long? routeId)
        {
             DeleteDispatchRouteByIdWithHttpInfo(accessToken, routeId);
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Delete a dispatch route and its associated jobs.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> DeleteDispatchRouteByIdWithHttpInfo (string accessToken, long? routeId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->DeleteDispatchRouteById");
            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new ApiException(400, "Missing required parameter 'routeId' when calling RoutesApi->DeleteDispatchRouteById");

            var localVarPath = "/fleet/dispatch/routes/{route_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (routeId != null) localVarPathParams.Add("route_id", this.Configuration.ApiClient.ParameterToString(routeId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeleteDispatchRouteById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Delete a dispatch route and its associated jobs.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeleteDispatchRouteByIdAsync (string accessToken, long? routeId)
        {
             await DeleteDispatchRouteByIdAsyncWithHttpInfo(accessToken, routeId);

        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Delete a dispatch route and its associated jobs.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> DeleteDispatchRouteByIdAsyncWithHttpInfo (string accessToken, long? routeId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->DeleteDispatchRouteById");
            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new ApiException(400, "Missing required parameter 'routeId' when calling RoutesApi->DeleteDispatchRouteById");

            var localVarPath = "/fleet/dispatch/routes/{route_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (routeId != null) localVarPathParams.Add("route_id", this.Configuration.ApiClient.ParameterToString(routeId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeleteDispatchRouteById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// /fleet/dispatch/routes Fetch all of the dispatch routes for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>List&lt;DispatchRoute&gt;</returns>
        public List<DispatchRoute> FetchAllDispatchRoutes (string accessToken, long? groupId = null, long? endTime = null, long? duration = null)
        {
             ApiResponse<List<DispatchRoute>> localVarResponse = FetchAllDispatchRoutesWithHttpInfo(accessToken, groupId, endTime, duration);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/dispatch/routes Fetch all of the dispatch routes for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>ApiResponse of List&lt;DispatchRoute&gt;</returns>
        public ApiResponse< List<DispatchRoute> > FetchAllDispatchRoutesWithHttpInfo (string accessToken, long? groupId = null, long? endTime = null, long? duration = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->FetchAllDispatchRoutes");

            var localVarPath = "/fleet/dispatch/routes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "group_id", groupId)); // query parameter
            if (endTime != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "end_time", endTime)); // query parameter
            if (duration != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "duration", duration)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("FetchAllDispatchRoutes", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<DispatchRoute>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<DispatchRoute>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<DispatchRoute>)));
        }

        /// <summary>
        /// /fleet/dispatch/routes Fetch all of the dispatch routes for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of List&lt;DispatchRoute&gt;</returns>
        public async System.Threading.Tasks.Task<List<DispatchRoute>> FetchAllDispatchRoutesAsync (string accessToken, long? groupId = null, long? endTime = null, long? duration = null)
        {
             ApiResponse<List<DispatchRoute>> localVarResponse = await FetchAllDispatchRoutesAsyncWithHttpInfo(accessToken, groupId, endTime, duration);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/dispatch/routes Fetch all of the dispatch routes for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;DispatchRoute&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<DispatchRoute>>> FetchAllDispatchRoutesAsyncWithHttpInfo (string accessToken, long? groupId = null, long? endTime = null, long? duration = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->FetchAllDispatchRoutes");

            var localVarPath = "/fleet/dispatch/routes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "group_id", groupId)); // query parameter
            if (endTime != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "end_time", endTime)); // query parameter
            if (duration != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "duration", duration)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("FetchAllDispatchRoutes", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<DispatchRoute>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<DispatchRoute>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<DispatchRoute>)));
        }

        /// <summary>
        /// /fleet/dispatch/routes/job_updates Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="sequenceId">Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)</param>
        /// <param name="include">Optionally set include&#x3D;route to include route object in response payload. (optional)</param>
        /// <returns>AllRouteJobUpdates</returns>
        public AllRouteJobUpdates FetchAllRouteJobUpdates (string accessToken, long? groupId = null, string sequenceId = null, string include = null)
        {
             ApiResponse<AllRouteJobUpdates> localVarResponse = FetchAllRouteJobUpdatesWithHttpInfo(accessToken, groupId, sequenceId, include);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/dispatch/routes/job_updates Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="sequenceId">Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)</param>
        /// <param name="include">Optionally set include&#x3D;route to include route object in response payload. (optional)</param>
        /// <returns>ApiResponse of AllRouteJobUpdates</returns>
        public ApiResponse< AllRouteJobUpdates > FetchAllRouteJobUpdatesWithHttpInfo (string accessToken, long? groupId = null, string sequenceId = null, string include = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->FetchAllRouteJobUpdates");

            var localVarPath = "/fleet/dispatch/routes/job_updates";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "group_id", groupId)); // query parameter
            if (sequenceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "sequence_id", sequenceId)); // query parameter
            if (include != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "include", include)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("FetchAllRouteJobUpdates", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<AllRouteJobUpdates>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (AllRouteJobUpdates) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(AllRouteJobUpdates)));
        }

        /// <summary>
        /// /fleet/dispatch/routes/job_updates Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="sequenceId">Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)</param>
        /// <param name="include">Optionally set include&#x3D;route to include route object in response payload. (optional)</param>
        /// <returns>Task of AllRouteJobUpdates</returns>
        public async System.Threading.Tasks.Task<AllRouteJobUpdates> FetchAllRouteJobUpdatesAsync (string accessToken, long? groupId = null, string sequenceId = null, string include = null)
        {
             ApiResponse<AllRouteJobUpdates> localVarResponse = await FetchAllRouteJobUpdatesAsyncWithHttpInfo(accessToken, groupId, sequenceId, include);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/dispatch/routes/job_updates Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="sequenceId">Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)</param>
        /// <param name="include">Optionally set include&#x3D;route to include route object in response payload. (optional)</param>
        /// <returns>Task of ApiResponse (AllRouteJobUpdates)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<AllRouteJobUpdates>> FetchAllRouteJobUpdatesAsyncWithHttpInfo (string accessToken, long? groupId = null, string sequenceId = null, string include = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->FetchAllRouteJobUpdates");

            var localVarPath = "/fleet/dispatch/routes/job_updates";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "group_id", groupId)); // query parameter
            if (sequenceId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "sequence_id", sequenceId)); // query parameter
            if (include != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "include", include)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("FetchAllRouteJobUpdates", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<AllRouteJobUpdates>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (AllRouteJobUpdates) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(AllRouteJobUpdates)));
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+} Fetch a dispatch route by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>DispatchRoute</returns>
        public DispatchRoute GetDispatchRouteById (string accessToken, long? routeId)
        {
             ApiResponse<DispatchRoute> localVarResponse = GetDispatchRouteByIdWithHttpInfo(accessToken, routeId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+} Fetch a dispatch route by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>ApiResponse of DispatchRoute</returns>
        public ApiResponse< DispatchRoute > GetDispatchRouteByIdWithHttpInfo (string accessToken, long? routeId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->GetDispatchRouteById");
            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new ApiException(400, "Missing required parameter 'routeId' when calling RoutesApi->GetDispatchRouteById");

            var localVarPath = "/fleet/dispatch/routes/{route_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (routeId != null) localVarPathParams.Add("route_id", this.Configuration.ApiClient.ParameterToString(routeId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDispatchRouteById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DispatchRoute>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DispatchRoute) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DispatchRoute)));
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+} Fetch a dispatch route by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>Task of DispatchRoute</returns>
        public async System.Threading.Tasks.Task<DispatchRoute> GetDispatchRouteByIdAsync (string accessToken, long? routeId)
        {
             ApiResponse<DispatchRoute> localVarResponse = await GetDispatchRouteByIdAsyncWithHttpInfo(accessToken, routeId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+} Fetch a dispatch route by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>Task of ApiResponse (DispatchRoute)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> GetDispatchRouteByIdAsyncWithHttpInfo (string accessToken, long? routeId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->GetDispatchRouteById");
            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new ApiException(400, "Missing required parameter 'routeId' when calling RoutesApi->GetDispatchRouteById");

            var localVarPath = "/fleet/dispatch/routes/{route_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (routeId != null) localVarPathParams.Add("route_id", this.Configuration.ApiClient.ParameterToString(routeId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDispatchRouteById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DispatchRoute>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DispatchRoute) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DispatchRoute)));
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/history Fetch the history of a dispatch route.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the route with history.</param>
        /// <param name="startTime">Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)</param>
        /// <param name="endTime">Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)</param>
        /// <returns>DispatchRouteHistory</returns>
        public DispatchRouteHistory GetDispatchRouteHistory (string accessToken, long? routeId, long? startTime = null, long? endTime = null)
        {
             ApiResponse<DispatchRouteHistory> localVarResponse = GetDispatchRouteHistoryWithHttpInfo(accessToken, routeId, startTime, endTime);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/history Fetch the history of a dispatch route.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the route with history.</param>
        /// <param name="startTime">Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)</param>
        /// <param name="endTime">Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)</param>
        /// <returns>ApiResponse of DispatchRouteHistory</returns>
        public ApiResponse< DispatchRouteHistory > GetDispatchRouteHistoryWithHttpInfo (string accessToken, long? routeId, long? startTime = null, long? endTime = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->GetDispatchRouteHistory");
            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new ApiException(400, "Missing required parameter 'routeId' when calling RoutesApi->GetDispatchRouteHistory");

            var localVarPath = "/fleet/dispatch/routes/{route_id}/history";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (routeId != null) localVarPathParams.Add("route_id", this.Configuration.ApiClient.ParameterToString(routeId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (startTime != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "start_time", startTime)); // query parameter
            if (endTime != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "end_time", endTime)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDispatchRouteHistory", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DispatchRouteHistory>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DispatchRouteHistory) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DispatchRouteHistory)));
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/history Fetch the history of a dispatch route.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the route with history.</param>
        /// <param name="startTime">Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)</param>
        /// <param name="endTime">Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)</param>
        /// <returns>Task of DispatchRouteHistory</returns>
        public async System.Threading.Tasks.Task<DispatchRouteHistory> GetDispatchRouteHistoryAsync (string accessToken, long? routeId, long? startTime = null, long? endTime = null)
        {
             ApiResponse<DispatchRouteHistory> localVarResponse = await GetDispatchRouteHistoryAsyncWithHttpInfo(accessToken, routeId, startTime, endTime);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/history Fetch the history of a dispatch route.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the route with history.</param>
        /// <param name="startTime">Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)</param>
        /// <param name="endTime">Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)</param>
        /// <returns>Task of ApiResponse (DispatchRouteHistory)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<DispatchRouteHistory>> GetDispatchRouteHistoryAsyncWithHttpInfo (string accessToken, long? routeId, long? startTime = null, long? endTime = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->GetDispatchRouteHistory");
            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new ApiException(400, "Missing required parameter 'routeId' when calling RoutesApi->GetDispatchRouteHistory");

            var localVarPath = "/fleet/dispatch/routes/{route_id}/history";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (routeId != null) localVarPathParams.Add("route_id", this.Configuration.ApiClient.ParameterToString(routeId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (startTime != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "start_time", startTime)); // query parameter
            if (endTime != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "end_time", endTime)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDispatchRouteHistory", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DispatchRouteHistory>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DispatchRouteHistory) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DispatchRouteHistory)));
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes Fetch all of the dispatch routes for a given driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>List&lt;DispatchRoute&gt;</returns>
        public List<DispatchRoute> GetDispatchRoutesByDriverId (string accessToken, long? driverId, long? endTime = null, long? duration = null)
        {
             ApiResponse<List<DispatchRoute>> localVarResponse = GetDispatchRoutesByDriverIdWithHttpInfo(accessToken, driverId, endTime, duration);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes Fetch all of the dispatch routes for a given driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>ApiResponse of List&lt;DispatchRoute&gt;</returns>
        public ApiResponse< List<DispatchRoute> > GetDispatchRoutesByDriverIdWithHttpInfo (string accessToken, long? driverId, long? endTime = null, long? duration = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->GetDispatchRoutesByDriverId");
            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new ApiException(400, "Missing required parameter 'driverId' when calling RoutesApi->GetDispatchRoutesByDriverId");

            var localVarPath = "/fleet/drivers/{driver_id}/dispatch/routes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (driverId != null) localVarPathParams.Add("driver_id", this.Configuration.ApiClient.ParameterToString(driverId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (endTime != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "end_time", endTime)); // query parameter
            if (duration != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "duration", duration)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDispatchRoutesByDriverId", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<DispatchRoute>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<DispatchRoute>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<DispatchRoute>)));
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes Fetch all of the dispatch routes for a given driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of List&lt;DispatchRoute&gt;</returns>
        public async System.Threading.Tasks.Task<List<DispatchRoute>> GetDispatchRoutesByDriverIdAsync (string accessToken, long? driverId, long? endTime = null, long? duration = null)
        {
             ApiResponse<List<DispatchRoute>> localVarResponse = await GetDispatchRoutesByDriverIdAsyncWithHttpInfo(accessToken, driverId, endTime, duration);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes Fetch all of the dispatch routes for a given driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;DispatchRoute&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<DispatchRoute>>> GetDispatchRoutesByDriverIdAsyncWithHttpInfo (string accessToken, long? driverId, long? endTime = null, long? duration = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->GetDispatchRoutesByDriverId");
            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new ApiException(400, "Missing required parameter 'driverId' when calling RoutesApi->GetDispatchRoutesByDriverId");

            var localVarPath = "/fleet/drivers/{driver_id}/dispatch/routes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (driverId != null) localVarPathParams.Add("driver_id", this.Configuration.ApiClient.ParameterToString(driverId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (endTime != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "end_time", endTime)); // query parameter
            if (duration != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "duration", duration)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDispatchRoutesByDriverId", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<DispatchRoute>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<DispatchRoute>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<DispatchRoute>)));
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes Fetch all of the dispatch routes for a given vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>List&lt;DispatchRoute&gt;</returns>
        public List<DispatchRoute> GetDispatchRoutesByVehicleId (string accessToken, long? vehicleId, long? endTime = null, long? duration = null)
        {
             ApiResponse<List<DispatchRoute>> localVarResponse = GetDispatchRoutesByVehicleIdWithHttpInfo(accessToken, vehicleId, endTime, duration);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes Fetch all of the dispatch routes for a given vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>ApiResponse of List&lt;DispatchRoute&gt;</returns>
        public ApiResponse< List<DispatchRoute> > GetDispatchRoutesByVehicleIdWithHttpInfo (string accessToken, long? vehicleId, long? endTime = null, long? duration = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->GetDispatchRoutesByVehicleId");
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new ApiException(400, "Missing required parameter 'vehicleId' when calling RoutesApi->GetDispatchRoutesByVehicleId");

            var localVarPath = "/fleet/vehicles/{vehicle_id}/dispatch/routes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (vehicleId != null) localVarPathParams.Add("vehicle_id", this.Configuration.ApiClient.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (endTime != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "end_time", endTime)); // query parameter
            if (duration != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "duration", duration)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDispatchRoutesByVehicleId", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<DispatchRoute>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<DispatchRoute>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<DispatchRoute>)));
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes Fetch all of the dispatch routes for a given vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of List&lt;DispatchRoute&gt;</returns>
        public async System.Threading.Tasks.Task<List<DispatchRoute>> GetDispatchRoutesByVehicleIdAsync (string accessToken, long? vehicleId, long? endTime = null, long? duration = null)
        {
             ApiResponse<List<DispatchRoute>> localVarResponse = await GetDispatchRoutesByVehicleIdAsyncWithHttpInfo(accessToken, vehicleId, endTime, duration);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes Fetch all of the dispatch routes for a given vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;DispatchRoute&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<DispatchRoute>>> GetDispatchRoutesByVehicleIdAsyncWithHttpInfo (string accessToken, long? vehicleId, long? endTime = null, long? duration = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->GetDispatchRoutesByVehicleId");
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new ApiException(400, "Missing required parameter 'vehicleId' when calling RoutesApi->GetDispatchRoutesByVehicleId");

            var localVarPath = "/fleet/vehicles/{vehicle_id}/dispatch/routes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (vehicleId != null) localVarPathParams.Add("vehicle_id", this.Configuration.ApiClient.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (endTime != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "end_time", endTime)); // query parameter
            if (duration != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "duration", duration)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDispatchRoutesByVehicleId", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<DispatchRoute>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<DispatchRoute>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<DispatchRoute>)));
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Update a dispatch route and its associated jobs.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <param name="updateDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        public DispatchRoute UpdateDispatchRouteById (string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams)
        {
             ApiResponse<DispatchRoute> localVarResponse = UpdateDispatchRouteByIdWithHttpInfo(accessToken, routeId, updateDispatchRouteParams);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Update a dispatch route and its associated jobs.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <param name="updateDispatchRouteParams"></param>
        /// <returns>ApiResponse of DispatchRoute</returns>
        public ApiResponse< DispatchRoute > UpdateDispatchRouteByIdWithHttpInfo (string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->UpdateDispatchRouteById");
            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new ApiException(400, "Missing required parameter 'routeId' when calling RoutesApi->UpdateDispatchRouteById");
            // verify the required parameter 'updateDispatchRouteParams' is set
            if (updateDispatchRouteParams == null)
                throw new ApiException(400, "Missing required parameter 'updateDispatchRouteParams' when calling RoutesApi->UpdateDispatchRouteById");

            var localVarPath = "/fleet/dispatch/routes/{route_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (routeId != null) localVarPathParams.Add("route_id", this.Configuration.ApiClient.ParameterToString(routeId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (updateDispatchRouteParams != null && updateDispatchRouteParams.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(updateDispatchRouteParams); // http body (model) parameter
            }
            else
            {
                localVarPostBody = updateDispatchRouteParams; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("UpdateDispatchRouteById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DispatchRoute>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DispatchRoute) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DispatchRoute)));
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Update a dispatch route and its associated jobs.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <param name="updateDispatchRouteParams"></param>
        /// <returns>Task of DispatchRoute</returns>
        public async System.Threading.Tasks.Task<DispatchRoute> UpdateDispatchRouteByIdAsync (string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams)
        {
             ApiResponse<DispatchRoute> localVarResponse = await UpdateDispatchRouteByIdAsyncWithHttpInfo(accessToken, routeId, updateDispatchRouteParams);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Update a dispatch route and its associated jobs.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <param name="updateDispatchRouteParams"></param>
        /// <returns>Task of ApiResponse (DispatchRoute)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> UpdateDispatchRouteByIdAsyncWithHttpInfo (string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->UpdateDispatchRouteById");
            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new ApiException(400, "Missing required parameter 'routeId' when calling RoutesApi->UpdateDispatchRouteById");
            // verify the required parameter 'updateDispatchRouteParams' is set
            if (updateDispatchRouteParams == null)
                throw new ApiException(400, "Missing required parameter 'updateDispatchRouteParams' when calling RoutesApi->UpdateDispatchRouteById");

            var localVarPath = "/fleet/dispatch/routes/{route_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (routeId != null) localVarPathParams.Add("route_id", this.Configuration.ApiClient.ParameterToString(routeId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (updateDispatchRouteParams != null && updateDispatchRouteParams.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(updateDispatchRouteParams); // http body (model) parameter
            }
            else
            {
                localVarPostBody = updateDispatchRouteParams; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("UpdateDispatchRouteById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DispatchRoute>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DispatchRoute) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DispatchRoute)));
        }

    }
}
