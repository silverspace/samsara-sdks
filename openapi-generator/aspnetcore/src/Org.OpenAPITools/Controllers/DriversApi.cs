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
    public class DriversApiController : ControllerBase
    { 
        /// <summary>
        /// /fleet/drivers/create
        /// </summary>
        /// <remarks>Create a new driver.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDriverParam">Driver creation body</param>
        /// <response code="200">Returns the successfully created the driver.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPost]
        [Route("/v1/fleet/drivers/create")]
        [ValidateModelState]
        [SwaggerOperation("CreateDriver")]
        [SwaggerResponse(statusCode: 200, type: typeof(Driver), description: "Returns the successfully created the driver.")]
        [SwaggerResponse(statusCode: 0, type: typeof(string), description: "Unexpected error.")]
        public virtual IActionResult CreateDriver([FromQuery][Required()]string accessToken, [FromBody]DriverForCreate createDriverParam)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Driver));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(string));

            string exampleJson = null;
            exampleJson = "null";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Driver>(exampleJson)
            : default(Driver);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>Deactivate a driver with the given id.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <response code="200">Successfully deactivated the driver, which is now referenced by /fleet/drivers/inactive/{driver_id}.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpDelete]
        [Route("/v1/fleet/drivers/{driver_id_or_external_id}")]
        [ValidateModelState]
        [SwaggerOperation("DeactivateDriver")]
        [SwaggerResponse(statusCode: 0, type: typeof(string), description: "Unexpected error.")]
        public virtual IActionResult DeactivateDriver([FromQuery][Required()]string accessToken, [FromRoute][Required]string driverIdOrExternalId)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(string));


            throw new NotImplementedException();
        }

        /// <summary>
        /// /fleet/drivers/inactive
        /// </summary>
        /// <remarks>Fetch all deactivated drivers for the group.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon).</param>
        /// <response code="200">Returns an array of all deactivated drivers for the group. Deactivated drivers are referenced at /fleet/drivers/inactive/{driver_id}</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/fleet/drivers/inactive")]
        [ValidateModelState]
        [SwaggerOperation("GetAllDeactivatedDrivers")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<Driver>), description: "Returns an array of all deactivated drivers for the group. Deactivated drivers are referenced at /fleet/drivers/inactive/{driver_id}")]
        [SwaggerResponse(statusCode: 0, type: typeof(string), description: "Unexpected error.")]
        public virtual IActionResult GetAllDeactivatedDrivers([FromQuery][Required()]string accessToken, [FromQuery]long? groupId)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<Driver>));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(string));

            string exampleJson = null;
            exampleJson = "null";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<Driver>>(exampleJson)
            : default(List<Driver>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>Fetch deactivated driver by id.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <response code="200">Returns the deactivated driver with the given driver_id.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/fleet/drivers/inactive/{driver_id_or_external_id}")]
        [ValidateModelState]
        [SwaggerOperation("GetDeactivatedDriverById")]
        [SwaggerResponse(statusCode: 200, type: typeof(Driver), description: "Returns the deactivated driver with the given driver_id.")]
        [SwaggerResponse(statusCode: 0, type: typeof(string), description: "Unexpected error.")]
        public virtual IActionResult GetDeactivatedDriverById([FromQuery][Required()]string accessToken, [FromRoute][Required]string driverIdOrExternalId)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Driver));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(string));

            string exampleJson = null;
            exampleJson = "null";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Driver>(exampleJson)
            : default(Driver);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>Fetch driver by id.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <response code="200">Returns the driver for the given driver_id.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/fleet/drivers/{driver_id_or_external_id}")]
        [ValidateModelState]
        [SwaggerOperation("GetDriverById")]
        [SwaggerResponse(statusCode: 200, type: typeof(Driver), description: "Returns the driver for the given driver_id.")]
        [SwaggerResponse(statusCode: 0, type: typeof(string), description: "Unexpected error.")]
        public virtual IActionResult GetDriverById([FromQuery][Required()]string accessToken, [FromRoute][Required]string driverIdOrExternalId)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Driver));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(string));

            string exampleJson = null;
            exampleJson = "null";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Driver>(exampleJson)
            : default(Driver);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>Reactivate the inactive driver having id.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <param name="reactivateDriverParam"></param>
        /// <response code="200">Returns the reactivated driver, which is now available at /fleet/drivers/{driver_id}.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPut]
        [Route("/v1/fleet/drivers/inactive/{driver_id_or_external_id}")]
        [ValidateModelState]
        [SwaggerOperation("ReactivateDriverById")]
        [SwaggerResponse(statusCode: 200, type: typeof(Driver), description: "Returns the reactivated driver, which is now available at /fleet/drivers/{driver_id}.")]
        [SwaggerResponse(statusCode: 0, type: typeof(string), description: "Unexpected error.")]
        public virtual IActionResult ReactivateDriverById([FromQuery][Required()]string accessToken, [FromRoute][Required]string driverIdOrExternalId, [FromBody]InlineObject4 reactivateDriverParam)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Driver));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(string));

            string exampleJson = null;
            exampleJson = "null";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Driver>(exampleJson)
            : default(Driver);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
