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
using System.Net;
using System.Net.Mime;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IRoutesApiSync : IApiAccessor
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
        DispatchRoute CreateDriverDispatchRoute (string accessToken, long driverId, DispatchRouteCreate createDispatchRouteParams);

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
        ApiResponse<DispatchRoute> CreateDriverDispatchRouteWithHttpInfo (string accessToken, long driverId, DispatchRouteCreate createDispatchRouteParams);
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
        DispatchRoute CreateVehicleDispatchRoute (string accessToken, long vehicleId, DispatchRouteCreate createDispatchRouteParams);

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
        ApiResponse<DispatchRoute> CreateVehicleDispatchRouteWithHttpInfo (string accessToken, long vehicleId, DispatchRouteCreate createDispatchRouteParams);
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
        void DeleteDispatchRouteById (string accessToken, long routeId);

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
        ApiResponse<Object> DeleteDispatchRouteByIdWithHttpInfo (string accessToken, long routeId);
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
        DispatchRoute GetDispatchRouteById (string accessToken, long routeId);

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
        ApiResponse<DispatchRoute> GetDispatchRouteByIdWithHttpInfo (string accessToken, long routeId);
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
        DispatchRouteHistory GetDispatchRouteHistory (string accessToken, long routeId, long? startTime = null, long? endTime = null);

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
        ApiResponse<DispatchRouteHistory> GetDispatchRouteHistoryWithHttpInfo (string accessToken, long routeId, long? startTime = null, long? endTime = null);
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
        List<DispatchRoute> GetDispatchRoutesByDriverId (string accessToken, long driverId, long? endTime = null, long? duration = null);

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
        ApiResponse<List<DispatchRoute>> GetDispatchRoutesByDriverIdWithHttpInfo (string accessToken, long driverId, long? endTime = null, long? duration = null);
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
        List<DispatchRoute> GetDispatchRoutesByVehicleId (string accessToken, long vehicleId, long? endTime = null, long? duration = null);

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
        ApiResponse<List<DispatchRoute>> GetDispatchRoutesByVehicleIdWithHttpInfo (string accessToken, long vehicleId, long? endTime = null, long? duration = null);
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
        DispatchRoute UpdateDispatchRouteById (string accessToken, long routeId, DispatchRoute updateDispatchRouteParams);

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
        ApiResponse<DispatchRoute> UpdateDispatchRouteByIdWithHttpInfo (string accessToken, long routeId, DispatchRoute updateDispatchRouteParams);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IRoutesApiAsync : IApiAccessor
    {
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
        System.Threading.Tasks.Task<DispatchRoute> CreateDriverDispatchRouteAsync (string accessToken, long driverId, DispatchRouteCreate createDispatchRouteParams);

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
        System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> CreateDriverDispatchRouteAsyncWithHttpInfo (string accessToken, long driverId, DispatchRouteCreate createDispatchRouteParams);
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
        System.Threading.Tasks.Task<DispatchRoute> CreateVehicleDispatchRouteAsync (string accessToken, long vehicleId, DispatchRouteCreate createDispatchRouteParams);

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
        System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> CreateVehicleDispatchRouteAsyncWithHttpInfo (string accessToken, long vehicleId, DispatchRouteCreate createDispatchRouteParams);
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
        System.Threading.Tasks.Task DeleteDispatchRouteByIdAsync (string accessToken, long routeId);

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
        System.Threading.Tasks.Task<ApiResponse<Object>> DeleteDispatchRouteByIdAsyncWithHttpInfo (string accessToken, long routeId);
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
        System.Threading.Tasks.Task<DispatchRoute> GetDispatchRouteByIdAsync (string accessToken, long routeId);

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
        System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> GetDispatchRouteByIdAsyncWithHttpInfo (string accessToken, long routeId);
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
        System.Threading.Tasks.Task<DispatchRouteHistory> GetDispatchRouteHistoryAsync (string accessToken, long routeId, long? startTime = null, long? endTime = null);

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
        System.Threading.Tasks.Task<ApiResponse<DispatchRouteHistory>> GetDispatchRouteHistoryAsyncWithHttpInfo (string accessToken, long routeId, long? startTime = null, long? endTime = null);
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
        System.Threading.Tasks.Task<List<DispatchRoute>> GetDispatchRoutesByDriverIdAsync (string accessToken, long driverId, long? endTime = null, long? duration = null);

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
        System.Threading.Tasks.Task<ApiResponse<List<DispatchRoute>>> GetDispatchRoutesByDriverIdAsyncWithHttpInfo (string accessToken, long driverId, long? endTime = null, long? duration = null);
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
        System.Threading.Tasks.Task<List<DispatchRoute>> GetDispatchRoutesByVehicleIdAsync (string accessToken, long vehicleId, long? endTime = null, long? duration = null);

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
        System.Threading.Tasks.Task<ApiResponse<List<DispatchRoute>>> GetDispatchRoutesByVehicleIdAsyncWithHttpInfo (string accessToken, long vehicleId, long? endTime = null, long? duration = null);
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
        System.Threading.Tasks.Task<DispatchRoute> UpdateDispatchRouteByIdAsync (string accessToken, long routeId, DispatchRoute updateDispatchRouteParams);

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
        System.Threading.Tasks.Task<ApiResponse<DispatchRoute>> UpdateDispatchRouteByIdAsyncWithHttpInfo (string accessToken, long routeId, DispatchRoute updateDispatchRouteParams);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IRoutesApi : IRoutesApiSync, IRoutesApiAsync
    {

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
        public RoutesApi() : this((string) null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="RoutesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public RoutesApi(String basePath)
        {
            this.Configuration = Org.OpenAPITools.Client.Configuration.MergeConfigurations(
                Org.OpenAPITools.Client.GlobalConfiguration.Instance,
                new Org.OpenAPITools.Client.Configuration { BasePath = basePath }
            );
            this.Client = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="RoutesApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public RoutesApi(Org.OpenAPITools.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = Org.OpenAPITools.Client.Configuration.MergeConfigurations(
                Org.OpenAPITools.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="PetApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public RoutesApi(Org.OpenAPITools.Client.ISynchronousClient client,Org.OpenAPITools.Client.IAsynchronousClient asyncClient, Org.OpenAPITools.Client.IReadableConfiguration configuration)
        {
            if(client == null) throw new ArgumentNullException("client");
            if(asyncClient == null) throw new ArgumentNullException("asyncClient");
            if(configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public Org.OpenAPITools.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public Org.OpenAPITools.Client.ISynchronousClient Client { get; set; }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.BasePath;
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Org.OpenAPITools.Client.IReadableConfiguration Configuration {get; set;}

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
        /// /fleet/dispatch/routes Create a new dispatch route.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        public DispatchRoute CreateDispatchRoute (string accessToken, DispatchRouteCreate createDispatchRouteParams)
        {
             Org.OpenAPITools.Client.ApiResponse<DispatchRoute> localVarResponse = CreateDispatchRouteWithHttpInfo(accessToken, createDispatchRouteParams);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/dispatch/routes Create a new dispatch route.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>ApiResponse of DispatchRoute</returns>
        public Org.OpenAPITools.Client.ApiResponse< DispatchRoute > CreateDispatchRouteWithHttpInfo (string accessToken, DispatchRouteCreate createDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->CreateDispatchRoute");

            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling RoutesApi->CreateDispatchRoute");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = createDispatchRouteParams;


            // make the HTTP request

            var response = this.Client.Post< DispatchRoute >("/fleet/dispatch/routes", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("CreateDispatchRoute", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<DispatchRoute> localVarResponse = await CreateDispatchRouteAsyncWithHttpInfo(accessToken, createDispatchRouteParams);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/dispatch/routes Create a new dispatch route.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of ApiResponse (DispatchRoute)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<DispatchRoute>> CreateDispatchRouteAsyncWithHttpInfo (string accessToken, DispatchRouteCreate createDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->CreateDispatchRoute");

            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling RoutesApi->CreateDispatchRoute");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = createDispatchRouteParams;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<DispatchRoute>("/fleet/dispatch/routes", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("CreateDispatchRoute", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes Create a new dispatch route for the driver with driver_id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        public DispatchRoute CreateDriverDispatchRoute (string accessToken, long driverId, DispatchRouteCreate createDispatchRouteParams)
        {
             Org.OpenAPITools.Client.ApiResponse<DispatchRoute> localVarResponse = CreateDriverDispatchRouteWithHttpInfo(accessToken, driverId, createDispatchRouteParams);
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
        public Org.OpenAPITools.Client.ApiResponse< DispatchRoute > CreateDriverDispatchRouteWithHttpInfo (string accessToken, long driverId, DispatchRouteCreate createDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->CreateDriverDispatchRoute");

            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverId' when calling RoutesApi->CreateDriverDispatchRoute");

            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling RoutesApi->CreateDriverDispatchRoute");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (driverId != null)
                requestOptions.PathParameters.Add("driver_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = createDispatchRouteParams;


            // make the HTTP request

            var response = this.Client.Post< DispatchRoute >("/fleet/drivers/{driver_id}/dispatch/routes", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("CreateDriverDispatchRoute", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes Create a new dispatch route for the driver with driver_id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of DispatchRoute</returns>
        public async System.Threading.Tasks.Task<DispatchRoute> CreateDriverDispatchRouteAsync (string accessToken, long driverId, DispatchRouteCreate createDispatchRouteParams)
        {
             Org.OpenAPITools.Client.ApiResponse<DispatchRoute> localVarResponse = await CreateDriverDispatchRouteAsyncWithHttpInfo(accessToken, driverId, createDispatchRouteParams);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<DispatchRoute>> CreateDriverDispatchRouteAsyncWithHttpInfo (string accessToken, long driverId, DispatchRouteCreate createDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->CreateDriverDispatchRoute");

            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverId' when calling RoutesApi->CreateDriverDispatchRoute");

            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling RoutesApi->CreateDriverDispatchRoute");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (driverId != null)
                requestOptions.PathParameters.Add("driver_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = createDispatchRouteParams;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<DispatchRoute>("/fleet/drivers/{driver_id}/dispatch/routes", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("CreateDriverDispatchRoute", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes Create a new dispatch route for the vehicle with vehicle_id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        public DispatchRoute CreateVehicleDispatchRoute (string accessToken, long vehicleId, DispatchRouteCreate createDispatchRouteParams)
        {
             Org.OpenAPITools.Client.ApiResponse<DispatchRoute> localVarResponse = CreateVehicleDispatchRouteWithHttpInfo(accessToken, vehicleId, createDispatchRouteParams);
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
        public Org.OpenAPITools.Client.ApiResponse< DispatchRoute > CreateVehicleDispatchRouteWithHttpInfo (string accessToken, long vehicleId, DispatchRouteCreate createDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->CreateVehicleDispatchRoute");

            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'vehicleId' when calling RoutesApi->CreateVehicleDispatchRoute");

            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling RoutesApi->CreateVehicleDispatchRoute");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (vehicleId != null)
                requestOptions.PathParameters.Add("vehicle_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = createDispatchRouteParams;


            // make the HTTP request

            var response = this.Client.Post< DispatchRoute >("/fleet/vehicles/{vehicle_id}/dispatch/routes", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("CreateVehicleDispatchRoute", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes Create a new dispatch route for the vehicle with vehicle_id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>Task of DispatchRoute</returns>
        public async System.Threading.Tasks.Task<DispatchRoute> CreateVehicleDispatchRouteAsync (string accessToken, long vehicleId, DispatchRouteCreate createDispatchRouteParams)
        {
             Org.OpenAPITools.Client.ApiResponse<DispatchRoute> localVarResponse = await CreateVehicleDispatchRouteAsyncWithHttpInfo(accessToken, vehicleId, createDispatchRouteParams);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<DispatchRoute>> CreateVehicleDispatchRouteAsyncWithHttpInfo (string accessToken, long vehicleId, DispatchRouteCreate createDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->CreateVehicleDispatchRoute");

            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'vehicleId' when calling RoutesApi->CreateVehicleDispatchRoute");

            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling RoutesApi->CreateVehicleDispatchRoute");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (vehicleId != null)
                requestOptions.PathParameters.Add("vehicle_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = createDispatchRouteParams;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<DispatchRoute>("/fleet/vehicles/{vehicle_id}/dispatch/routes", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("CreateVehicleDispatchRoute", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Delete a dispatch route and its associated jobs.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns></returns>
        public void DeleteDispatchRouteById (string accessToken, long routeId)
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
        public Org.OpenAPITools.Client.ApiResponse<Object> DeleteDispatchRouteByIdWithHttpInfo (string accessToken, long routeId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->DeleteDispatchRouteById");

            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'routeId' when calling RoutesApi->DeleteDispatchRouteById");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (routeId != null)
                requestOptions.PathParameters.Add("route_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(routeId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Delete<Object>("/fleet/dispatch/routes/{route_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("DeleteDispatchRouteById", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Delete a dispatch route and its associated jobs.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeleteDispatchRouteByIdAsync (string accessToken, long routeId)
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Object>> DeleteDispatchRouteByIdAsyncWithHttpInfo (string accessToken, long routeId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->DeleteDispatchRouteById");

            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'routeId' when calling RoutesApi->DeleteDispatchRouteById");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (routeId != null)
                requestOptions.PathParameters.Add("route_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(routeId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.DeleteAsync<Object>("/fleet/dispatch/routes/{route_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("DeleteDispatchRouteById", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<List<DispatchRoute>> localVarResponse = FetchAllDispatchRoutesWithHttpInfo(accessToken, groupId, endTime, duration);
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
        public Org.OpenAPITools.Client.ApiResponse< List<DispatchRoute> > FetchAllDispatchRoutesWithHttpInfo (string accessToken, long? groupId = null, long? endTime = null, long? duration = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->FetchAllDispatchRoutes");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (groupId != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "group_id", groupId))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endTime != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "end_time", endTime))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (duration != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "duration", duration))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< List<DispatchRoute> >("/fleet/dispatch/routes", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("FetchAllDispatchRoutes", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<List<DispatchRoute>> localVarResponse = await FetchAllDispatchRoutesAsyncWithHttpInfo(accessToken, groupId, endTime, duration);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<List<DispatchRoute>>> FetchAllDispatchRoutesAsyncWithHttpInfo (string accessToken, long? groupId = null, long? endTime = null, long? duration = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->FetchAllDispatchRoutes");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (groupId != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "group_id", groupId))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endTime != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "end_time", endTime))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (duration != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "duration", duration))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<List<DispatchRoute>>("/fleet/dispatch/routes", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("FetchAllDispatchRoutes", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<AllRouteJobUpdates> localVarResponse = FetchAllRouteJobUpdatesWithHttpInfo(accessToken, groupId, sequenceId, include);
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
        public Org.OpenAPITools.Client.ApiResponse< AllRouteJobUpdates > FetchAllRouteJobUpdatesWithHttpInfo (string accessToken, long? groupId = null, string sequenceId = null, string include = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->FetchAllRouteJobUpdates");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (groupId != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "group_id", groupId))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (sequenceId != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "sequence_id", sequenceId))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (include != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "include", include))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< AllRouteJobUpdates >("/fleet/dispatch/routes/job_updates", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("FetchAllRouteJobUpdates", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<AllRouteJobUpdates> localVarResponse = await FetchAllRouteJobUpdatesAsyncWithHttpInfo(accessToken, groupId, sequenceId, include);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<AllRouteJobUpdates>> FetchAllRouteJobUpdatesAsyncWithHttpInfo (string accessToken, long? groupId = null, string sequenceId = null, string include = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->FetchAllRouteJobUpdates");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (groupId != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "group_id", groupId))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (sequenceId != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "sequence_id", sequenceId))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (include != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "include", include))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<AllRouteJobUpdates>("/fleet/dispatch/routes/job_updates", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("FetchAllRouteJobUpdates", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+} Fetch a dispatch route by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>DispatchRoute</returns>
        public DispatchRoute GetDispatchRouteById (string accessToken, long routeId)
        {
             Org.OpenAPITools.Client.ApiResponse<DispatchRoute> localVarResponse = GetDispatchRouteByIdWithHttpInfo(accessToken, routeId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+} Fetch a dispatch route by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>ApiResponse of DispatchRoute</returns>
        public Org.OpenAPITools.Client.ApiResponse< DispatchRoute > GetDispatchRouteByIdWithHttpInfo (string accessToken, long routeId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->GetDispatchRouteById");

            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'routeId' when calling RoutesApi->GetDispatchRouteById");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (routeId != null)
                requestOptions.PathParameters.Add("route_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(routeId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< DispatchRoute >("/fleet/dispatch/routes/{route_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDispatchRouteById", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+} Fetch a dispatch route by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>Task of DispatchRoute</returns>
        public async System.Threading.Tasks.Task<DispatchRoute> GetDispatchRouteByIdAsync (string accessToken, long routeId)
        {
             Org.OpenAPITools.Client.ApiResponse<DispatchRoute> localVarResponse = await GetDispatchRouteByIdAsyncWithHttpInfo(accessToken, routeId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+} Fetch a dispatch route by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>Task of ApiResponse (DispatchRoute)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<DispatchRoute>> GetDispatchRouteByIdAsyncWithHttpInfo (string accessToken, long routeId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->GetDispatchRouteById");

            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'routeId' when calling RoutesApi->GetDispatchRouteById");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (routeId != null)
                requestOptions.PathParameters.Add("route_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(routeId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<DispatchRoute>("/fleet/dispatch/routes/{route_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDispatchRouteById", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public DispatchRouteHistory GetDispatchRouteHistory (string accessToken, long routeId, long? startTime = null, long? endTime = null)
        {
             Org.OpenAPITools.Client.ApiResponse<DispatchRouteHistory> localVarResponse = GetDispatchRouteHistoryWithHttpInfo(accessToken, routeId, startTime, endTime);
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
        public Org.OpenAPITools.Client.ApiResponse< DispatchRouteHistory > GetDispatchRouteHistoryWithHttpInfo (string accessToken, long routeId, long? startTime = null, long? endTime = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->GetDispatchRouteHistory");

            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'routeId' when calling RoutesApi->GetDispatchRouteHistory");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (routeId != null)
                requestOptions.PathParameters.Add("route_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(routeId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startTime != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "start_time", startTime))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endTime != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "end_time", endTime))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< DispatchRouteHistory >("/fleet/dispatch/routes/{route_id}/history", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDispatchRouteHistory", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public async System.Threading.Tasks.Task<DispatchRouteHistory> GetDispatchRouteHistoryAsync (string accessToken, long routeId, long? startTime = null, long? endTime = null)
        {
             Org.OpenAPITools.Client.ApiResponse<DispatchRouteHistory> localVarResponse = await GetDispatchRouteHistoryAsyncWithHttpInfo(accessToken, routeId, startTime, endTime);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<DispatchRouteHistory>> GetDispatchRouteHistoryAsyncWithHttpInfo (string accessToken, long routeId, long? startTime = null, long? endTime = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->GetDispatchRouteHistory");

            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'routeId' when calling RoutesApi->GetDispatchRouteHistory");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (routeId != null)
                requestOptions.PathParameters.Add("route_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(routeId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startTime != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "start_time", startTime))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endTime != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "end_time", endTime))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<DispatchRouteHistory>("/fleet/dispatch/routes/{route_id}/history", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDispatchRouteHistory", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public List<DispatchRoute> GetDispatchRoutesByDriverId (string accessToken, long driverId, long? endTime = null, long? duration = null)
        {
             Org.OpenAPITools.Client.ApiResponse<List<DispatchRoute>> localVarResponse = GetDispatchRoutesByDriverIdWithHttpInfo(accessToken, driverId, endTime, duration);
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
        public Org.OpenAPITools.Client.ApiResponse< List<DispatchRoute> > GetDispatchRoutesByDriverIdWithHttpInfo (string accessToken, long driverId, long? endTime = null, long? duration = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->GetDispatchRoutesByDriverId");

            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverId' when calling RoutesApi->GetDispatchRoutesByDriverId");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (driverId != null)
                requestOptions.PathParameters.Add("driver_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endTime != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "end_time", endTime))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (duration != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "duration", duration))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< List<DispatchRoute> >("/fleet/drivers/{driver_id}/dispatch/routes", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDispatchRoutesByDriverId", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public async System.Threading.Tasks.Task<List<DispatchRoute>> GetDispatchRoutesByDriverIdAsync (string accessToken, long driverId, long? endTime = null, long? duration = null)
        {
             Org.OpenAPITools.Client.ApiResponse<List<DispatchRoute>> localVarResponse = await GetDispatchRoutesByDriverIdAsyncWithHttpInfo(accessToken, driverId, endTime, duration);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<List<DispatchRoute>>> GetDispatchRoutesByDriverIdAsyncWithHttpInfo (string accessToken, long driverId, long? endTime = null, long? duration = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->GetDispatchRoutesByDriverId");

            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverId' when calling RoutesApi->GetDispatchRoutesByDriverId");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (driverId != null)
                requestOptions.PathParameters.Add("driver_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endTime != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "end_time", endTime))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (duration != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "duration", duration))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<List<DispatchRoute>>("/fleet/drivers/{driver_id}/dispatch/routes", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDispatchRoutesByDriverId", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public List<DispatchRoute> GetDispatchRoutesByVehicleId (string accessToken, long vehicleId, long? endTime = null, long? duration = null)
        {
             Org.OpenAPITools.Client.ApiResponse<List<DispatchRoute>> localVarResponse = GetDispatchRoutesByVehicleIdWithHttpInfo(accessToken, vehicleId, endTime, duration);
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
        public Org.OpenAPITools.Client.ApiResponse< List<DispatchRoute> > GetDispatchRoutesByVehicleIdWithHttpInfo (string accessToken, long vehicleId, long? endTime = null, long? duration = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->GetDispatchRoutesByVehicleId");

            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'vehicleId' when calling RoutesApi->GetDispatchRoutesByVehicleId");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (vehicleId != null)
                requestOptions.PathParameters.Add("vehicle_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endTime != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "end_time", endTime))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (duration != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "duration", duration))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< List<DispatchRoute> >("/fleet/vehicles/{vehicle_id}/dispatch/routes", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDispatchRoutesByVehicleId", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public async System.Threading.Tasks.Task<List<DispatchRoute>> GetDispatchRoutesByVehicleIdAsync (string accessToken, long vehicleId, long? endTime = null, long? duration = null)
        {
             Org.OpenAPITools.Client.ApiResponse<List<DispatchRoute>> localVarResponse = await GetDispatchRoutesByVehicleIdAsyncWithHttpInfo(accessToken, vehicleId, endTime, duration);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<List<DispatchRoute>>> GetDispatchRoutesByVehicleIdAsyncWithHttpInfo (string accessToken, long vehicleId, long? endTime = null, long? duration = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->GetDispatchRoutesByVehicleId");

            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'vehicleId' when calling RoutesApi->GetDispatchRoutesByVehicleId");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (vehicleId != null)
                requestOptions.PathParameters.Add("vehicle_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endTime != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "end_time", endTime))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (duration != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "duration", duration))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<List<DispatchRoute>>("/fleet/vehicles/{vehicle_id}/dispatch/routes", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDispatchRoutesByVehicleId", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Update a dispatch route and its associated jobs.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <param name="updateDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        public DispatchRoute UpdateDispatchRouteById (string accessToken, long routeId, DispatchRoute updateDispatchRouteParams)
        {
             Org.OpenAPITools.Client.ApiResponse<DispatchRoute> localVarResponse = UpdateDispatchRouteByIdWithHttpInfo(accessToken, routeId, updateDispatchRouteParams);
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
        public Org.OpenAPITools.Client.ApiResponse< DispatchRoute > UpdateDispatchRouteByIdWithHttpInfo (string accessToken, long routeId, DispatchRoute updateDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->UpdateDispatchRouteById");

            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'routeId' when calling RoutesApi->UpdateDispatchRouteById");

            // verify the required parameter 'updateDispatchRouteParams' is set
            if (updateDispatchRouteParams == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'updateDispatchRouteParams' when calling RoutesApi->UpdateDispatchRouteById");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (routeId != null)
                requestOptions.PathParameters.Add("route_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(routeId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = updateDispatchRouteParams;


            // make the HTTP request

            var response = this.Client.Put< DispatchRoute >("/fleet/dispatch/routes/{route_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("UpdateDispatchRouteById", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Update a dispatch route and its associated jobs.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <param name="updateDispatchRouteParams"></param>
        /// <returns>Task of DispatchRoute</returns>
        public async System.Threading.Tasks.Task<DispatchRoute> UpdateDispatchRouteByIdAsync (string accessToken, long routeId, DispatchRoute updateDispatchRouteParams)
        {
             Org.OpenAPITools.Client.ApiResponse<DispatchRoute> localVarResponse = await UpdateDispatchRouteByIdAsyncWithHttpInfo(accessToken, routeId, updateDispatchRouteParams);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<DispatchRoute>> UpdateDispatchRouteByIdAsyncWithHttpInfo (string accessToken, long routeId, DispatchRoute updateDispatchRouteParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling RoutesApi->UpdateDispatchRouteById");

            // verify the required parameter 'routeId' is set
            if (routeId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'routeId' when calling RoutesApi->UpdateDispatchRouteById");

            // verify the required parameter 'updateDispatchRouteParams' is set
            if (updateDispatchRouteParams == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'updateDispatchRouteParams' when calling RoutesApi->UpdateDispatchRouteById");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (routeId != null)
                requestOptions.PathParameters.Add("route_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(routeId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = updateDispatchRouteParams;


            // make the HTTP request

            var response = await this.AsynchronousClient.PutAsync<DispatchRoute>("/fleet/dispatch/routes/{route_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("UpdateDispatchRouteById", response);
                if (exception != null) throw exception;
            }

            return response;
        }

    }
}
