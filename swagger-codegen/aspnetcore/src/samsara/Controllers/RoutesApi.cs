/*
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |- -- -- -- -- -- --|- -- -- -- -- -- -- -- -|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.WebUtilities;
using Microsoft.Extensions.Logging;
using Microsoft.Extensions.Primitives;
using Swashbuckle.AspNetCore.SwaggerGen;
using Newtonsoft.Json;
using System.ComponentModel.DataAnnotations;
using samsara.Attributes;
using samsara.Models;

namespace samsara.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    public class RoutesApiController : Controller
    { 
        /// <summary>
        /// /fleet/dispatch/routes
        /// </summary>
        /// <remarks>Create a new dispatch route.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <response code="200">Created route object including the new route ID.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPost]
        [Route("/v1/fleet/dispatch/routes")]
        [ValidateModelState]
        [SwaggerOperation("CreateDispatchRoute")]
        [SwaggerResponse(statusCode: 200, type: typeof(DispatchRoute), description: "Created route object including the new route ID.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult CreateDispatchRoute([FromQuery][Required()]string accessToken, [FromBody]DispatchRouteCreate createDispatchRouteParams)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DispatchRoute));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "\"\"";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DispatchRoute>(exampleJson)
            : default(DispatchRoute);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>Create a new dispatch route for the driver with driver_id.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <response code="200">Created route object including the new route ID.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPost]
        [Route("/v1/fleet/drivers/{driver_id}/dispatch/routes")]
        [ValidateModelState]
        [SwaggerOperation("CreateDriverDispatchRoute")]
        [SwaggerResponse(statusCode: 200, type: typeof(DispatchRoute), description: "Created route object including the new route ID.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult CreateDriverDispatchRoute([FromQuery][Required()]string accessToken, [FromRoute][Required]long? driverId, [FromBody]DispatchRouteCreate createDispatchRouteParams)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DispatchRoute));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "\"\"";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DispatchRoute>(exampleJson)
            : default(DispatchRoute);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>Create a new dispatch route for the vehicle with vehicle_id.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <response code="200">Created route object including the new route ID.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPost]
        [Route("/v1/fleet/vehicles/{vehicle_id}/dispatch/routes")]
        [ValidateModelState]
        [SwaggerOperation("CreateVehicleDispatchRoute")]
        [SwaggerResponse(statusCode: 200, type: typeof(DispatchRoute), description: "Created route object including the new route ID.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult CreateVehicleDispatchRoute([FromQuery][Required()]string accessToken, [FromRoute][Required]long? vehicleId, [FromBody]DispatchRouteCreate createDispatchRouteParams)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DispatchRoute));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "\"\"";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DispatchRoute>(exampleJson)
            : default(DispatchRoute);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/
        /// </summary>
        /// <remarks>Delete a dispatch route and its associated jobs.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <response code="200">Successfully deleted the dispatch route. No response body is returned.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpDelete]
        [Route("/v1/fleet/dispatch/routes/{route_id}")]
        [ValidateModelState]
        [SwaggerOperation("DeleteDispatchRouteById")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult DeleteDispatchRouteById([FromQuery][Required()]string accessToken, [FromRoute][Required]long? routeId)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));


            throw new NotImplementedException();
        }

        /// <summary>
        /// /fleet/dispatch/routes
        /// </summary>
        /// <remarks>Fetch all of the dispatch routes for the group.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon).</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.</param>
        /// <response code="200">All dispatch route objects for the group.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/fleet/dispatch/routes")]
        [ValidateModelState]
        [SwaggerOperation("FetchAllDispatchRoutes")]
        [SwaggerResponse(statusCode: 200, type: typeof(DispatchRoutes), description: "All dispatch route objects for the group.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult FetchAllDispatchRoutes([FromQuery][Required()]string accessToken, [FromQuery]long? groupId, [FromQuery]long? endTime, [FromQuery]long? duration)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DispatchRoutes));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "\"\"";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DispatchRoutes>(exampleJson)
            : default(DispatchRoutes);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/dispatch/routes/job_updates
        /// </summary>
        /// <remarks>Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon).</param>
        /// <param name="sequenceId">Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.</param>
        /// <param name="include">Optionally set include&#x3D;route to include route object in response payload.</param>
        /// <response code="200">All job updates on routes.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/fleet/dispatch/routes/job_updates")]
        [ValidateModelState]
        [SwaggerOperation("FetchAllRouteJobUpdates")]
        [SwaggerResponse(statusCode: 200, type: typeof(AllRouteJobUpdates), description: "All job updates on routes.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult FetchAllRouteJobUpdates([FromQuery][Required()]string accessToken, [FromQuery]long? groupId, [FromQuery]string sequenceId, [FromQuery]string include)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(AllRouteJobUpdates));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"job_updates\" : [ {\n    \"prev_job_state\" : \"JobState_EnRoute\",\n    \"route_id\" : 556,\n    \"route\" : \"\",\n    \"changed_at_ms\" : 1462881998034,\n    \"job_state\" : \"JobState_Arrived\",\n    \"job_id\" : 773\n  }, {\n    \"prev_job_state\" : \"JobState_EnRoute\",\n    \"route_id\" : 556,\n    \"route\" : \"\",\n    \"changed_at_ms\" : 1462881998034,\n    \"job_state\" : \"JobState_Arrived\",\n    \"job_id\" : 773\n  } ],\n  \"sequence_id\" : \"eyJpZCI6MywiY3JlYXRlZF9hdCI6MTQ5OTQyOTIyMDAwMn0=\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<AllRouteJobUpdates>(exampleJson)
            : default(AllRouteJobUpdates);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}
        /// </summary>
        /// <remarks>Fetch a dispatch route by id.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <response code="200">The dispatch route corresponding to route_id.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/fleet/dispatch/routes/{route_id}")]
        [ValidateModelState]
        [SwaggerOperation("GetDispatchRouteById")]
        [SwaggerResponse(statusCode: 200, type: typeof(DispatchRoute), description: "The dispatch route corresponding to route_id.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetDispatchRouteById([FromQuery][Required()]string accessToken, [FromRoute][Required]long? routeId)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DispatchRoute));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "\"\"";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DispatchRoute>(exampleJson)
            : default(DispatchRoute);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/history
        /// </summary>
        /// <remarks>Fetch the history of a dispatch route.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the route with history.</param>
        /// <param name="startTime">Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.</param>
        /// <param name="endTime">Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.</param>
        /// <response code="200">The historical route state changes between start_time and end_time.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/fleet/dispatch/routes/{route_id}/history")]
        [ValidateModelState]
        [SwaggerOperation("GetDispatchRouteHistory")]
        [SwaggerResponse(statusCode: 200, type: typeof(DispatchRouteHistory), description: "The historical route state changes between start_time and end_time.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetDispatchRouteHistory([FromQuery][Required()]string accessToken, [FromRoute][Required]long? routeId, [FromQuery]long? startTime, [FromQuery]long? endTime)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DispatchRouteHistory));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"history\" : [ {\n    \"route\" : \"\",\n    \"changed_at_ms\" : 1499411220000\n  }, {\n    \"route\" : \"\",\n    \"changed_at_ms\" : 1499411220000\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DispatchRouteHistory>(exampleJson)
            : default(DispatchRouteHistory);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>Fetch all of the dispatch routes for a given driver.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.</param>
        /// <response code="200">Returns the dispatch routes for the given driver_id.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/fleet/drivers/{driver_id}/dispatch/routes")]
        [ValidateModelState]
        [SwaggerOperation("GetDispatchRoutesByDriverId")]
        [SwaggerResponse(statusCode: 200, type: typeof(DispatchRoutes), description: "Returns the dispatch routes for the given driver_id.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetDispatchRoutesByDriverId([FromQuery][Required()]string accessToken, [FromRoute][Required]long? driverId, [FromQuery]long? endTime, [FromQuery]long? duration)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DispatchRoutes));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "\"\"";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DispatchRoutes>(exampleJson)
            : default(DispatchRoutes);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
        /// </summary>
        /// <remarks>Fetch all of the dispatch routes for a given vehicle.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.</param>
        /// <response code="200">Returns all of the dispatch routes for the given vehicle_id.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/fleet/vehicles/{vehicle_id}/dispatch/routes")]
        [ValidateModelState]
        [SwaggerOperation("GetDispatchRoutesByVehicleId")]
        [SwaggerResponse(statusCode: 200, type: typeof(DispatchRoutes), description: "Returns all of the dispatch routes for the given vehicle_id.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetDispatchRoutesByVehicleId([FromQuery][Required()]string accessToken, [FromRoute][Required]long? vehicleId, [FromQuery]long? endTime, [FromQuery]long? duration)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DispatchRoutes));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "\"\"";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DispatchRoutes>(exampleJson)
            : default(DispatchRoutes);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/
        /// </summary>
        /// <remarks>Update a dispatch route and its associated jobs.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <param name="updateDispatchRouteParams"></param>
        /// <response code="200">Update the dispatch route. Allowable updates include setting job state, adding or removing jobs, and changing job locations and times.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPut]
        [Route("/v1/fleet/dispatch/routes/{route_id}")]
        [ValidateModelState]
        [SwaggerOperation("UpdateDispatchRouteById")]
        [SwaggerResponse(statusCode: 200, type: typeof(DispatchRoute), description: "Update the dispatch route. Allowable updates include setting job state, adding or removing jobs, and changing job locations and times.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult UpdateDispatchRouteById([FromQuery][Required()]string accessToken, [FromRoute][Required]long? routeId, [FromBody]DispatchRoute updateDispatchRouteParams)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DispatchRoute));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "\"\"";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DispatchRoute>(exampleJson)
            : default(DispatchRoute);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
