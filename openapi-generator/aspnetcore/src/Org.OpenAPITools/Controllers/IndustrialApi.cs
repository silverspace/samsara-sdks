/*
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |- -- -- -- -- -- --|- -- -- -- -- -- -- -- -|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Collections.Generic;
using Microsoft.AspNetCore.Mvc;
using Swashbuckle.AspNetCore.Annotations;
using Swashbuckle.AspNetCore.SwaggerGen;
using Newtonsoft.Json;
using System.ComponentModel.DataAnnotations;
using Org.OpenAPITools.Attributes;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    public class IndustrialApiController : ControllerBase
    { 
        /// <summary>
        /// /industrial/data
        /// </summary>
        /// <remarks>Fetch all of the data inputs for a group.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon).</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.</param>
        /// <response code="200">List of data inputs.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/industrial/data")]
        [ValidateModelState]
        [SwaggerOperation("GetAllDataInputs")]
        [SwaggerResponse(statusCode: 200, type: typeof(InlineResponse2006), description: "List of data inputs.")]
        [SwaggerResponse(statusCode: 0, type: typeof(string), description: "Unexpected error.")]
        public virtual IActionResult GetAllDataInputs([FromQuery][Required()]string accessToken, [FromQuery]long? groupId, [FromQuery]long? startMs, [FromQuery]long? endMs)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(InlineResponse2006));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(string));

            string exampleJson = null;
            exampleJson = "{\n  \"dataInputs\" : [ {\n    \"name\" : \"Pump Flow\",\n    \"id\" : 12345,\n    \"points\" : [ {\n      \"value\" : 12.332,\n      \"timeMs\" : 1453449599999\n    }, {\n      \"value\" : 12.332,\n      \"timeMs\" : 1453449599999\n    } ]\n  }, {\n    \"name\" : \"Pump Flow\",\n    \"id\" : 12345,\n    \"points\" : [ {\n      \"value\" : 12.332,\n      \"timeMs\" : 1453449599999\n    }, {\n      \"value\" : 12.332,\n      \"timeMs\" : 1453449599999\n    } ]\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<InlineResponse2006>(exampleJson)
            : default(InlineResponse2006);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /industrial/data/{data_input_id:[0-9]+}
        /// </summary>
        /// <remarks>Fetch datapoints from a given data input.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="dataInputId">ID of the data input</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.</param>
        /// <response code="200">Returns datapoints for the given data input</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/industrial/data/{data_input_id}")]
        [ValidateModelState]
        [SwaggerOperation("GetDataInput")]
        [SwaggerResponse(statusCode: 200, type: typeof(DataInputHistoryResponse), description: "Returns datapoints for the given data input")]
        [SwaggerResponse(statusCode: 0, type: typeof(string), description: "Unexpected error.")]
        public virtual IActionResult GetDataInput([FromQuery][Required()]string accessToken, [FromRoute][Required]long? dataInputId, [FromQuery]long? startMs, [FromQuery]long? endMs)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DataInputHistoryResponse));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(string));

            string exampleJson = null;
            exampleJson = "{\n  \"name\" : \"Pump Flow\",\n  \"id\" : 12345,\n  \"points\" : [ {\n    \"value\" : 12.332,\n    \"timeMs\" : 1453449599999\n  }, {\n    \"value\" : 12.332,\n    \"timeMs\" : 1453449599999\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DataInputHistoryResponse>(exampleJson)
            : default(DataInputHistoryResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /machines/list
        /// </summary>
        /// <remarks>Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <response code="200">List of machine objects.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPost]
        [Route("/v1/machines/list")]
        [ValidateModelState]
        [SwaggerOperation("GetMachines")]
        [SwaggerResponse(statusCode: 200, type: typeof(InlineResponse2007), description: "List of machine objects.")]
        [SwaggerResponse(statusCode: 0, type: typeof(string), description: "Unexpected error.")]
        public virtual IActionResult GetMachines([FromQuery][Required()]string accessToken, [FromBody]InlineObject18 groupParam)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(InlineResponse2007));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(string));

            string exampleJson = null;
            exampleJson = "{\n  \"machines\" : [ {\n    \"notes\" : \"This is in the left hallway behind the conveyor belt\",\n    \"name\" : \"Freezer ABC\",\n    \"id\" : 123\n  }, {\n    \"notes\" : \"This is in the left hallway behind the conveyor belt\",\n    \"name\" : \"Freezer ABC\",\n    \"id\" : 123\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<InlineResponse2007>(exampleJson)
            : default(InlineResponse2007);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /machines/history
        /// </summary>
        /// <remarks>Get historical data for machine objects. This method returns a set of historical data for all machines in a group</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam"></param>
        /// <response code="200">List of machine results objects, each containing a time and a datapoint.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPost]
        [Route("/v1/machines/history")]
        [ValidateModelState]
        [SwaggerOperation("GetMachinesHistory")]
        [SwaggerResponse(statusCode: 200, type: typeof(MachineHistoryResponse), description: "List of machine results objects, each containing a time and a datapoint.")]
        [SwaggerResponse(statusCode: 0, type: typeof(string), description: "Unexpected error.")]
        public virtual IActionResult GetMachinesHistory([FromQuery][Required()]string accessToken, [FromBody]InlineObject17 historyParam)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(MachineHistoryResponse));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(string));

            string exampleJson = null;
            exampleJson = "{\n  \"machines\" : [ {\n    \"name\" : \"1/3 HP Motor\",\n    \"id\" : 1,\n    \"vibrations\" : [ {\n      \"X\" : 0.01,\n      \"Y\" : 1.23,\n      \"Z\" : 2.55,\n      \"time\" : 1453449599999\n    }, {\n      \"X\" : 0.01,\n      \"Y\" : 1.23,\n      \"Z\" : 2.55,\n      \"time\" : 1453449599999\n    } ]\n  }, {\n    \"name\" : \"1/3 HP Motor\",\n    \"id\" : 1,\n    \"vibrations\" : [ {\n      \"X\" : 0.01,\n      \"Y\" : 1.23,\n      \"Z\" : 2.55,\n      \"time\" : 1453449599999\n    }, {\n      \"X\" : 0.01,\n      \"Y\" : 1.23,\n      \"Z\" : 2.55,\n      \"time\" : 1453449599999\n    } ]\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<MachineHistoryResponse>(exampleJson)
            : default(MachineHistoryResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
