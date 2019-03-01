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
    public class FleetApiController : Controller
    { 
        /// <summary>
        /// /fleet/add_address
        /// </summary>
        /// <remarks>This method adds an address book entry to the specified group.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressParam"></param>
        /// <response code="200">Address was successfully added. No response body is returned.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPost]
        [Route("/v1/fleet/add_address")]
        [ValidateModelState]
        [SwaggerOperation("AddFleetAddress")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult AddFleetAddress([FromQuery][Required()]string accessToken, [FromBody]AddressParam addressParam)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));


            throw new NotImplementedException();
        }

        /// <summary>
        /// /addresses
        /// </summary>
        /// <remarks>Add one or more addresses to the organization</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addresses">List of addresses/geofences to add. Geofences can be circular or a polygon.  For each address, only one of &#39;circle&#39; or &#39;polygon&#39; should be provided. If both are provided, the geofence will be saved as a polygon.</param>
        /// <response code="200">List of added addresses/geofences. For each address entry, the geofence field will only be populated with either &#39;circle&#39; or &#39;polygon&#39;, depending on the geofence type. Circle geofences added without a specific lat/lng are geocoded asynchronously, and will be 0,0 in the immediate response.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPost]
        [Route("/v1/addresses")]
        [ValidateModelState]
        [SwaggerOperation("AddOrganizationAddresses")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<Address>), description: "List of added addresses/geofences. For each address entry, the geofence field will only be populated with either &#39;circle&#39; or &#39;polygon&#39;, depending on the geofence type. Circle geofences added without a specific lat/lng are geocoded asynchronously, and will be 0,0 in the immediate response.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult AddOrganizationAddresses([FromQuery][Required()]string accessToken, [FromBody]Addresses addresses)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<Address>));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "[ {\n  \"tags\" : [ {\n    \"id\" : 12345,\n    \"name\" : \"Broken Vehicles\"\n  }, {\n    \"id\" : 12345,\n    \"name\" : \"Broken Vehicles\"\n  } ],\n  \"id\" : 123,\n  \"geofence\" : {\n    \"polygon\" : {\n      \"vertices\" : [ {\n        \"longitude\" : -122.403098,\n        \"latitude\" : 37.765363\n      }, {\n        \"longitude\" : -122.403098,\n        \"latitude\" : 37.765363\n      } ]\n    },\n    \"circle\" : {\n      \"radiusMeters\" : 250,\n      \"longitude\" : -122.403098,\n      \"latitude\" : 37.765363\n    }\n  },\n  \"name\" : \"Samsara HQ\",\n  \"formattedAddress\" : \"350 Rhode Island St, San Francisco, CA\",\n  \"notes\" : \"Delivery site 1\",\n  \"contacts\" : [ {\n    \"id\" : 123,\n    \"lastName\" : \"Jones\",\n    \"phone\" : \"111-222-3344\",\n    \"email\" : \"jane.jones@yahoo.com\",\n    \"firstName\" : \"Jane\"\n  }, {\n    \"id\" : 123,\n    \"lastName\" : \"Jones\",\n    \"phone\" : \"111-222-3344\",\n    \"email\" : \"jane.jones@yahoo.com\",\n    \"firstName\" : \"Jane\"\n  } ]\n}, {\n  \"tags\" : [ {\n    \"id\" : 12345,\n    \"name\" : \"Broken Vehicles\"\n  }, {\n    \"id\" : 12345,\n    \"name\" : \"Broken Vehicles\"\n  } ],\n  \"id\" : 123,\n  \"geofence\" : {\n    \"polygon\" : {\n      \"vertices\" : [ {\n        \"longitude\" : -122.403098,\n        \"latitude\" : 37.765363\n      }, {\n        \"longitude\" : -122.403098,\n        \"latitude\" : 37.765363\n      } ]\n    },\n    \"circle\" : {\n      \"radiusMeters\" : 250,\n      \"longitude\" : -122.403098,\n      \"latitude\" : 37.765363\n    }\n  },\n  \"name\" : \"Samsara HQ\",\n  \"formattedAddress\" : \"350 Rhode Island St, San Francisco, CA\",\n  \"notes\" : \"Delivery site 1\",\n  \"contacts\" : [ {\n    \"id\" : 123,\n    \"lastName\" : \"Jones\",\n    \"phone\" : \"111-222-3344\",\n    \"email\" : \"jane.jones@yahoo.com\",\n    \"firstName\" : \"Jane\"\n  }, {\n    \"id\" : 123,\n    \"lastName\" : \"Jones\",\n    \"phone\" : \"111-222-3344\",\n    \"email\" : \"jane.jones@yahoo.com\",\n    \"firstName\" : \"Jane\"\n  } ]\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<Address>>(exampleJson)
            : default(List<Address>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

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
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult CreateDriver([FromQuery][Required()]string accessToken, [FromBody]DriverForCreate createDriverParam)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Driver));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "\"\"";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Driver>(exampleJson)
            : default(Driver);
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
        /// /fleet/drivers/{driver_id:[0-9]+}/documents
        /// </summary>
        /// <remarks>Create a driver document for the given driver.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver for whom the document is created.</param>
        /// <param name="createDocumentParams">To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.</param>
        /// <response code="200">Returns the created document.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPost]
        [Route("/v1/fleet/drivers/{driver_id}/documents")]
        [ValidateModelState]
        [SwaggerOperation("CreateDriverDocument")]
        [SwaggerResponse(statusCode: 200, type: typeof(Document), description: "Returns the created document.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult CreateDriverDocument([FromQuery][Required()]string accessToken, [FromRoute][Required]long? driverId, [FromBody]DocumentCreate createDocumentParams)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Document));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "\"\"";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Document>(exampleJson)
            : default(Document);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/maintenance/dvirs
        /// </summary>
        /// <remarks>Create a new dvir, marking a vehicle or trailer safe or unsafe.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDvirParam">DVIR creation body</param>
        /// <response code="200">Newly created DVIR.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPost]
        [Route("/v1/fleet/maintenance/dvirs")]
        [ValidateModelState]
        [SwaggerOperation("CreateDvir")]
        [SwaggerResponse(statusCode: 200, type: typeof(DvirBase), description: "Newly created DVIR.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult CreateDvir([FromQuery][Required()]string accessToken, [FromBody]CreateDvirParam createDvirParam)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DvirBase));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"vehicleDefects\" : [ {\n    \"defectType\" : \"Air Compressor\",\n    \"comment\" : \"Air Compressor not working\"\n  }, {\n    \"defectType\" : \"Air Compressor\",\n    \"comment\" : \"Air Compressor not working\"\n  } ],\n  \"defectsNeedNotBeCorrected\" : false,\n  \"authorSignature\" : {\n    \"username\" : \"jsmith\",\n    \"mechanicUserId\" : 14849,\n    \"email\" : \"j.smith@yahoo.com\",\n    \"signedAt\" : 12535500000,\n    \"name\" : \"John Smith\",\n    \"driverId\" : 2581,\n    \"type\" : \"driver\"\n  },\n  \"inspectionType\" : \"pre trip\",\n  \"odometerMiles\" : 49912,\n  \"vehicle\" : {\n    \"id\" : 19,\n    \"name\" : \"Storer's vehicle 19\"\n  },\n  \"timeMs\" : 1453449599999,\n  \"defectsCorrected\" : true,\n  \"mechanicNotes\" : \"The vehicle is now safe.\",\n  \"id\" : 19,\n  \"nextDriverSignature\" : {\n    \"username\" : \"jsmith\",\n    \"email\" : \"j.smith@yahoo.com\",\n    \"signedAt\" : 12535500000,\n    \"name\" : \"John Smith\",\n    \"driverId\" : 2581,\n    \"type\" : \"driver\"\n  },\n  \"trailerName\" : \"Storer's Trailer 19\",\n  \"vehicleCondition\" : \"SATISFACTORY\",\n  \"mechanicOrAgentSignature\" : {\n    \"username\" : \"jsmith\",\n    \"mechanicUserId\" : 14849,\n    \"email\" : \"j.smith@yahoo.com\",\n    \"signedAt\" : 12535500000,\n    \"name\" : \"John Smith\",\n    \"driverId\" : 2581,\n    \"type\" : \"driver\"\n  },\n  \"trailerDefects\" : [ {\n    \"defectType\" : \"Air Compressor\",\n    \"comment\" : \"Air Compressor not working\"\n  }, {\n    \"defectType\" : \"Air Compressor\",\n    \"comment\" : \"Air Compressor not working\"\n  } ],\n  \"trailerId\" : 19\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DvirBase>(exampleJson)
            : default(DvirBase);
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
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult DeactivateDriver([FromQuery][Required()]string accessToken, [FromRoute][Required]string driverIdOrExternalId)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));


            throw new NotImplementedException();
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
        /// /addresses/{addressId}
        /// </summary>
        /// <remarks>Delete an address.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <response code="200">Address was successfully deleted. No response body is returned.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpDelete]
        [Route("/v1/addresses/{addressId}")]
        [ValidateModelState]
        [SwaggerOperation("DeleteOrganizationAddress")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult DeleteOrganizationAddress([FromQuery][Required()]string accessToken, [FromRoute][Required]long? addressId)
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
        /// /fleet/assets/locations
        /// </summary>
        /// <remarks>Fetch current locations of all assets for the group.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon).</param>
        /// <response code="200">List of assets and their current locations.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/fleet/assets/locations")]
        [ValidateModelState]
        [SwaggerOperation("GetAllAssetCurrentLocations")]
        [SwaggerResponse(statusCode: 200, type: typeof(InlineResponse2001), description: "List of assets and their current locations.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetAllAssetCurrentLocations([FromQuery][Required()]string accessToken, [FromQuery]long? groupId)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(InlineResponse2001));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"assets\" : [ {\n    \"id\" : 1,\n    \"engineHours\" : 104,\n    \"location\" : [ {\n      \"speedMilesPerHour\" : 35.0,\n      \"location\" : \"525 York, San Francisco, CA\",\n      \"longitude\" : -122.7,\n      \"latitude\" : 37.0,\n      \"timeMs\" : 12314151\n    }, {\n      \"speedMilesPerHour\" : 35.0,\n      \"location\" : \"525 York, San Francisco, CA\",\n      \"longitude\" : -122.7,\n      \"latitude\" : 37.0,\n      \"timeMs\" : 12314151\n    } ],\n    \"name\" : \"Trailer 123\",\n    \"cable\" : [ {\n      \"assetType\" : \"Reefer (Thermo King)\"\n    }, {\n      \"assetType\" : \"Reefer (Thermo King)\"\n    } ]\n  }, {\n    \"id\" : 1,\n    \"engineHours\" : 104,\n    \"location\" : [ {\n      \"speedMilesPerHour\" : 35.0,\n      \"location\" : \"525 York, San Francisco, CA\",\n      \"longitude\" : -122.7,\n      \"latitude\" : 37.0,\n      \"timeMs\" : 12314151\n    }, {\n      \"speedMilesPerHour\" : 35.0,\n      \"location\" : \"525 York, San Francisco, CA\",\n      \"longitude\" : -122.7,\n      \"latitude\" : 37.0,\n      \"timeMs\" : 12314151\n    } ],\n    \"name\" : \"Trailer 123\",\n    \"cable\" : [ {\n      \"assetType\" : \"Reefer (Thermo King)\"\n    }, {\n      \"assetType\" : \"Reefer (Thermo King)\"\n    } ]\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<InlineResponse2001>(exampleJson)
            : default(InlineResponse2001);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/assets
        /// </summary>
        /// <remarks>Fetch all of the assets for the group.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon).</param>
        /// <response code="200">List of assets.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/fleet/assets")]
        [ValidateModelState]
        [SwaggerOperation("GetAllAssets")]
        [SwaggerResponse(statusCode: 200, type: typeof(InlineResponse200), description: "List of assets.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetAllAssets([FromQuery][Required()]string accessToken, [FromQuery]long? groupId)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(InlineResponse200));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"assets\" : [ {\n    \"id\" : 1,\n    \"assetSerialNumber\" : \"SNTEST123\",\n    \"engineHours\" : 104,\n    \"name\" : \"Trailer 123\",\n    \"cable\" : [ {\n      \"assetType\" : \"Reefer (Thermo King)\"\n    }, {\n      \"assetType\" : \"Reefer (Thermo King)\"\n    } ]\n  }, {\n    \"id\" : 1,\n    \"assetSerialNumber\" : \"SNTEST123\",\n    \"engineHours\" : 104,\n    \"name\" : \"Trailer 123\",\n    \"cable\" : [ {\n      \"assetType\" : \"Reefer (Thermo King)\"\n    }, {\n      \"assetType\" : \"Reefer (Thermo King)\"\n    } ]\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<InlineResponse200>(exampleJson)
            : default(InlineResponse200);
            //TODO: Change the data returned
            return new ObjectResult(example);
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
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetAllDeactivatedDrivers([FromQuery][Required()]string accessToken, [FromQuery]long? groupId)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<Driver>));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "[ \"\", \"\" ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<Driver>>(exampleJson)
            : default(List<Driver>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/assets/{assetId:[0-9]+}/locations
        /// </summary>
        /// <remarks>Fetch the historical locations for the asset.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="assetId">ID of the asset</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <response code="200">Asset location details.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/fleet/assets/{asset_id}/locations")]
        [ValidateModelState]
        [SwaggerOperation("GetAssetLocation")]
        [SwaggerResponse(statusCode: 200, type: typeof(AssetLocationResponse), description: "Asset location details.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetAssetLocation([FromQuery][Required()]string accessToken, [FromRoute][Required]long? assetId, [FromQuery][Required()]long? startMs, [FromQuery][Required()]long? endMs)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(AssetLocationResponse));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "\"\"";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<AssetLocationResponse>(exampleJson)
            : default(AssetLocationResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/assets/{assetId:[0-9]+}/reefer
        /// </summary>
        /// <remarks>Fetch the reefer-specific stats of an asset.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="assetId">ID of the asset</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <response code="200">Reefer-specific asset details.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/fleet/assets/{asset_id}/reefer")]
        [ValidateModelState]
        [SwaggerOperation("GetAssetReefer")]
        [SwaggerResponse(statusCode: 200, type: typeof(AssetReeferResponse), description: "Reefer-specific asset details.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetAssetReefer([FromQuery][Required()]string accessToken, [FromRoute][Required]long? assetId, [FromQuery][Required()]long? startMs, [FromQuery][Required()]long? endMs)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(AssetReeferResponse));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"id\" : 1,\n  \"reeferStats\" : {\n    \"powerStatus\" : [ {\n      \"status\" : \"Active (Continuous)\",\n      \"changedAtMs\" : 1453449599999\n    }, {\n      \"status\" : \"Active (Continuous)\",\n      \"changedAtMs\" : 1453449599999\n    } ],\n    \"engineHours\" : [ {\n      \"engineHours\" : 1200,\n      \"changedAtMs\" : 1453449599999\n    }, {\n      \"engineHours\" : 1200,\n      \"changedAtMs\" : 1453449599999\n    } ],\n    \"returnAirTemp\" : [ {\n      \"changedAtMs\" : 1453449599999,\n      \"tempInMilliC\" : 31110\n    }, {\n      \"changedAtMs\" : 1453449599999,\n      \"tempInMilliC\" : 31110\n    } ],\n    \"fuelPercentage\" : [ {\n      \"fuelPercentage\" : 99,\n      \"changedAtMs\" : 1453449599999\n    }, {\n      \"fuelPercentage\" : 99,\n      \"changedAtMs\" : 1453449599999\n    } ],\n    \"setPoint\" : [ {\n      \"changedAtMs\" : 1453449599999,\n      \"tempInMilliC\" : 31110\n    }, {\n      \"changedAtMs\" : 1453449599999,\n      \"tempInMilliC\" : 31110\n    } ],\n    \"alarms\" : [ {\n      \"changedAtMs\" : 1453449599999,\n      \"alarms\" : [ {\n        \"description\" : \"Check Return Air Sensor\",\n        \"severity\" : 1,\n        \"operatorAction\" : \"Check and repair at end of trip\",\n        \"alarmCode\" : 102\n      }, {\n        \"description\" : \"Check Return Air Sensor\",\n        \"severity\" : 1,\n        \"operatorAction\" : \"Check and repair at end of trip\",\n        \"alarmCode\" : 102\n      } ]\n    }, {\n      \"changedAtMs\" : 1453449599999,\n      \"alarms\" : [ {\n        \"description\" : \"Check Return Air Sensor\",\n        \"severity\" : 1,\n        \"operatorAction\" : \"Check and repair at end of trip\",\n        \"alarmCode\" : 102\n      }, {\n        \"description\" : \"Check Return Air Sensor\",\n        \"severity\" : 1,\n        \"operatorAction\" : \"Check and repair at end of trip\",\n        \"alarmCode\" : 102\n      } ]\n    } ]\n  },\n  \"assetType\" : \"Reefer (Thermo King)\",\n  \"name\" : \"Reefer 123\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<AssetReeferResponse>(exampleJson)
            : default(AssetReeferResponse);
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
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetDeactivatedDriverById([FromQuery][Required()]string accessToken, [FromRoute][Required]string driverIdOrExternalId)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Driver));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "\"\"";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Driver>(exampleJson)
            : default(Driver);
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
        [SwaggerResponse(statusCode: 200, type: typeof(CurrentDriver), description: "Returns the driver for the given driver_id.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetDriverById([FromQuery][Required()]string accessToken, [FromRoute][Required]string driverIdOrExternalId)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(CurrentDriver));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "\"\"";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<CurrentDriver>(exampleJson)
            : default(CurrentDriver);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/drivers/document_types
        /// </summary>
        /// <remarks>Fetch all of the document types.</remarks>
        /// <response code="200">Returns all of the document types.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/fleet/drivers/document_types")]
        [ValidateModelState]
        [SwaggerOperation("GetDriverDocumentTypesByOrgId")]
        [SwaggerResponse(statusCode: 200, type: typeof(DocumentTypes), description: "Returns all of the document types.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetDriverDocumentTypesByOrgId()
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DocumentTypes));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "\"\"";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DocumentTypes>(exampleJson)
            : default(DocumentTypes);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/drivers/documents
        /// </summary>
        /// <remarks>Fetch all of the documents.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="endMs">Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.</param>
        /// <param name="durationMs">Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.</param>
        /// <response code="200">Returns all of the documents.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/fleet/drivers/documents")]
        [ValidateModelState]
        [SwaggerOperation("GetDriverDocumentsByOrgId")]
        [SwaggerResponse(statusCode: 200, type: typeof(Documents), description: "Returns all of the documents.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetDriverDocumentsByOrgId([FromQuery][Required()]string accessToken, [FromQuery]long? endMs, [FromQuery]long? durationMs)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Documents));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "\"\"";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Documents>(exampleJson)
            : default(Documents);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/drivers/{driverId:[0-9]+}/safety/score
        /// </summary>
        /// <remarks>Fetch the safety score for the driver.</remarks>
        /// <param name="driverId">ID of the driver</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <response code="200">Safety score details.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/fleet/drivers/{driverId}/safety/score")]
        [ValidateModelState]
        [SwaggerOperation("GetDriverSafetyScore")]
        [SwaggerResponse(statusCode: 200, type: typeof(DriverSafetyScoreResponse), description: "Safety score details.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetDriverSafetyScore([FromRoute][Required]long? driverId, [FromQuery][Required()]string accessToken, [FromQuery][Required()]long? startMs, [FromQuery][Required()]long? endMs)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DriverSafetyScoreResponse));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"totalTimeDrivenMs\" : 19708293,\n  \"timeOverSpeedLimitMs\" : 3769,\n  \"harshBrakingCount\" : 2,\n  \"harshEvents\" : [ {\n    \"harshEventType\" : \"Harsh Braking\",\n    \"vehicleId\" : 212014918086169,\n    \"timestampMs\" : 1535590776000\n  }, {\n    \"harshEventType\" : \"Harsh Braking\",\n    \"vehicleId\" : 212014918086169,\n    \"timestampMs\" : 1535590776000\n  } ],\n  \"harshTurningCount\" : 0,\n  \"totalHarshEventCount\" : 3,\n  \"driverId\" : 1234,\n  \"safetyScore\" : 97,\n  \"crashCount\" : 0,\n  \"harshAccelCount\" : 1,\n  \"safetyScoreRank\" : \"26\",\n  \"totalDistanceDrivenMeters\" : 291836\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DriverSafetyScoreResponse>(exampleJson)
            : default(DriverSafetyScoreResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/maintenance/dvirs
        /// </summary>
        /// <remarks>Get DVIRs for the org within provided time constraints</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="endMs">time in millis until the last dvir log.</param>
        /// <param name="durationMs">time in millis which corresponds to the duration before the end_ms.</param>
        /// <param name="groupId">Group ID to query.</param>
        /// <response code="200">DVIRs for the specified duration.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/fleet/maintenance/dvirs")]
        [ValidateModelState]
        [SwaggerOperation("GetDvirs")]
        [SwaggerResponse(statusCode: 200, type: typeof(DvirListResponse), description: "DVIRs for the specified duration.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetDvirs([FromQuery][Required()]string accessToken, [FromQuery][Required()]int? endMs, [FromQuery][Required()]int? durationMs, [FromQuery]int? groupId)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DvirListResponse));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"dvirs\" : [ {\n    \"vehicleDefects\" : [ {\n      \"defectType\" : \"Air Compressor\",\n      \"comment\" : \"Air Compressor not working\"\n    }, {\n      \"defectType\" : \"Air Compressor\",\n      \"comment\" : \"Air Compressor not working\"\n    } ],\n    \"defectsNeedNotBeCorrected\" : false,\n    \"authorSignature\" : {\n      \"username\" : \"jsmith\",\n      \"mechanicUserId\" : 14849,\n      \"email\" : \"j.smith@yahoo.com\",\n      \"signedAt\" : 12535500000,\n      \"name\" : \"John Smith\",\n      \"driverId\" : 2581,\n      \"type\" : \"driver\"\n    },\n    \"inspectionType\" : \"pre trip\",\n    \"odometerMiles\" : 49912,\n    \"vehicle\" : {\n      \"id\" : 19,\n      \"name\" : \"Storer's vehicle 19\"\n    },\n    \"timeMs\" : 1453449599999,\n    \"defectsCorrected\" : true,\n    \"mechanicNotes\" : \"The vehicle is now safe.\",\n    \"id\" : 19,\n    \"nextDriverSignature\" : {\n      \"username\" : \"jsmith\",\n      \"email\" : \"j.smith@yahoo.com\",\n      \"signedAt\" : 12535500000,\n      \"name\" : \"John Smith\",\n      \"driverId\" : 2581,\n      \"type\" : \"driver\"\n    },\n    \"trailerName\" : \"Storer's Trailer 19\",\n    \"vehicleCondition\" : \"SATISFACTORY\",\n    \"mechanicOrAgentSignature\" : {\n      \"username\" : \"jsmith\",\n      \"mechanicUserId\" : 14849,\n      \"email\" : \"j.smith@yahoo.com\",\n      \"signedAt\" : 12535500000,\n      \"name\" : \"John Smith\",\n      \"driverId\" : 2581,\n      \"type\" : \"driver\"\n    },\n    \"trailerDefects\" : [ {\n      \"defectType\" : \"Air Compressor\",\n      \"comment\" : \"Air Compressor not working\"\n    }, {\n      \"defectType\" : \"Air Compressor\",\n      \"comment\" : \"Air Compressor not working\"\n    } ],\n    \"trailerId\" : 19\n  }, {\n    \"vehicleDefects\" : [ {\n      \"defectType\" : \"Air Compressor\",\n      \"comment\" : \"Air Compressor not working\"\n    }, {\n      \"defectType\" : \"Air Compressor\",\n      \"comment\" : \"Air Compressor not working\"\n    } ],\n    \"defectsNeedNotBeCorrected\" : false,\n    \"authorSignature\" : {\n      \"username\" : \"jsmith\",\n      \"mechanicUserId\" : 14849,\n      \"email\" : \"j.smith@yahoo.com\",\n      \"signedAt\" : 12535500000,\n      \"name\" : \"John Smith\",\n      \"driverId\" : 2581,\n      \"type\" : \"driver\"\n    },\n    \"inspectionType\" : \"pre trip\",\n    \"odometerMiles\" : 49912,\n    \"vehicle\" : {\n      \"id\" : 19,\n      \"name\" : \"Storer's vehicle 19\"\n    },\n    \"timeMs\" : 1453449599999,\n    \"defectsCorrected\" : true,\n    \"mechanicNotes\" : \"The vehicle is now safe.\",\n    \"id\" : 19,\n    \"nextDriverSignature\" : {\n      \"username\" : \"jsmith\",\n      \"email\" : \"j.smith@yahoo.com\",\n      \"signedAt\" : 12535500000,\n      \"name\" : \"John Smith\",\n      \"driverId\" : 2581,\n      \"type\" : \"driver\"\n    },\n    \"trailerName\" : \"Storer's Trailer 19\",\n    \"vehicleCondition\" : \"SATISFACTORY\",\n    \"mechanicOrAgentSignature\" : {\n      \"username\" : \"jsmith\",\n      \"mechanicUserId\" : 14849,\n      \"email\" : \"j.smith@yahoo.com\",\n      \"signedAt\" : 12535500000,\n      \"name\" : \"John Smith\",\n      \"driverId\" : 2581,\n      \"type\" : \"driver\"\n    },\n    \"trailerDefects\" : [ {\n      \"defectType\" : \"Air Compressor\",\n      \"comment\" : \"Air Compressor not working\"\n    }, {\n      \"defectType\" : \"Air Compressor\",\n      \"comment\" : \"Air Compressor not working\"\n    } ],\n    \"trailerId\" : 19\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DvirListResponse>(exampleJson)
            : default(DvirListResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/drivers
        /// </summary>
        /// <remarks>Get all the drivers for the specified group.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupDriversParam"></param>
        /// <response code="200">All drivers in the group.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPost]
        [Route("/v1/fleet/drivers")]
        [ValidateModelState]
        [SwaggerOperation("GetFleetDrivers")]
        [SwaggerResponse(statusCode: 200, type: typeof(DriversResponse), description: "All drivers in the group.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetFleetDrivers([FromQuery][Required()]string accessToken, [FromBody]GroupDriversParam groupDriversParam)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DriversResponse));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"drivers\" : [ \"\", \"\" ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DriversResponse>(exampleJson)
            : default(DriversResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
        /// </summary>
        /// <remarks>Get summarized daily HOS charts for a specified driver.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with HOS logs.</param>
        /// <param name="hosLogsParam"></param>
        /// <response code="200">Distance traveled and time active for each driver in the organization over the specified time period.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPost]
        [Route("/v1/fleet/drivers/{driver_id}/hos_daily_logs")]
        [ValidateModelState]
        [SwaggerOperation("GetFleetDriversHosDailyLogs")]
        [SwaggerResponse(statusCode: 200, type: typeof(DriverDailyLogResponse), description: "Distance traveled and time active for each driver in the organization over the specified time period.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetFleetDriversHosDailyLogs([FromQuery][Required()]string accessToken, [FromRoute][Required]long? driverId, [FromBody]HosLogsParam hosLogsParam)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DriverDailyLogResponse));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"days\" : [ {\n    \"distanceMiles\" : 123.24,\n    \"vehicleIds\" : [ 192319, 12958 ],\n    \"activeMs\" : 691200,\n    \"certified\" : true,\n    \"trailerIds\" : [ 10293, 192933 ],\n    \"certifiedAtMs\" : 0,\n    \"startMs\" : 1473750000000,\n    \"activeHours\" : 5.4,\n    \"endMs\" : 1473836400000\n  }, {\n    \"distanceMiles\" : 123.24,\n    \"vehicleIds\" : [ 192319, 12958 ],\n    \"activeMs\" : 691200,\n    \"certified\" : true,\n    \"trailerIds\" : [ 10293, 192933 ],\n    \"certifiedAtMs\" : 0,\n    \"startMs\" : 1473750000000,\n    \"activeHours\" : 5.4,\n    \"endMs\" : 1473836400000\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DriverDailyLogResponse>(exampleJson)
            : default(DriverDailyLogResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/drivers/summary
        /// </summary>
        /// <remarks>Get the distance and time each driver in an organization has driven in a given time period.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driversSummaryParam">Org ID and time range to query.</param>
        /// <param name="snapToDayBounds">Snap query result to HOS day boundaries.</param>
        /// <response code="200">Distance traveled and time active for each driver in the organization over the specified time period.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPost]
        [Route("/v1/fleet/drivers/summary")]
        [ValidateModelState]
        [SwaggerOperation("GetFleetDriversSummary")]
        [SwaggerResponse(statusCode: 200, type: typeof(DriversSummaryResponse), description: "Distance traveled and time active for each driver in the organization over the specified time period.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetFleetDriversSummary([FromQuery][Required()]string accessToken, [FromBody]DriversSummaryParam driversSummaryParam, [FromQuery]bool? snapToDayBounds)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DriversSummaryResponse));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"Summaries\" : [ {\n    \"distanceMiles\" : 123.24,\n    \"groupId\" : 111,\n    \"onDutyMs\" : 21600000,\n    \"activeMs\" : 43200000,\n    \"driverId\" : 444,\n    \"driveMs\" : 21600000,\n    \"driverUsername\" : \"fjacobs\",\n    \"driverName\" : \"Fred Jacobs\"\n  }, {\n    \"distanceMiles\" : 123.24,\n    \"groupId\" : 111,\n    \"onDutyMs\" : 21600000,\n    \"activeMs\" : 43200000,\n    \"driverId\" : 444,\n    \"driveMs\" : 21600000,\n    \"driverUsername\" : \"fjacobs\",\n    \"driverName\" : \"Fred Jacobs\"\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DriversSummaryResponse>(exampleJson)
            : default(DriversSummaryResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/hos_authentication_logs
        /// </summary>
        /// <remarks>Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosAuthenticationLogsParam"></param>
        /// <response code="200">HOS authentication logs for the specified driver.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPost]
        [Route("/v1/fleet/hos_authentication_logs")]
        [ValidateModelState]
        [SwaggerOperation("GetFleetHosAuthenticationLogs")]
        [SwaggerResponse(statusCode: 200, type: typeof(HosAuthenticationLogsResponse), description: "HOS authentication logs for the specified driver.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetFleetHosAuthenticationLogs([FromQuery][Required()]string accessToken, [FromBody]HosAuthenticationLogsParam hosAuthenticationLogsParam)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(HosAuthenticationLogsResponse));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"authenticationLogs\" : [ {\n    \"happenedAtMs\" : 1462881998034,\n    \"address\" : \"123 Main St., Ahwatukee, Arizona 85044\",\n    \"state\" : \"Arizona\",\n    \"actionType\" : \"signin\",\n    \"city\" : \"Ahwatukee\",\n    \"addressName\" : \"Garage Number 3\"\n  }, {\n    \"happenedAtMs\" : 1462881998034,\n    \"address\" : \"123 Main St., Ahwatukee, Arizona 85044\",\n    \"state\" : \"Arizona\",\n    \"actionType\" : \"signin\",\n    \"city\" : \"Ahwatukee\",\n    \"addressName\" : \"Garage Number 3\"\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<HosAuthenticationLogsResponse>(exampleJson)
            : default(HosAuthenticationLogsResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/hos_logs
        /// </summary>
        /// <remarks>Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosLogsParam"></param>
        /// <response code="200">HOS logs for the specified driver.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPost]
        [Route("/v1/fleet/hos_logs")]
        [ValidateModelState]
        [SwaggerOperation("GetFleetHosLogs")]
        [SwaggerResponse(statusCode: 200, type: typeof(HosLogsResponse), description: "HOS logs for the specified driver.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetFleetHosLogs([FromQuery][Required()]string accessToken, [FromBody]HosLogsParam1 hosLogsParam)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(HosLogsResponse));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"logs\" : [ {\n    \"groupId\" : 101,\n    \"logStartMs\" : 1462881998034,\n    \"codriverIds\" : [ 445, 445 ],\n    \"vehicleId\" : 112,\n    \"remark\" : \"Lunch Break\",\n    \"statusType\" : \"OFF_DUTY\",\n    \"driverId\" : 444,\n    \"locLng\" : -98.502888123,\n    \"locName\" : \"McLean Site A\",\n    \"locLat\" : 23.413702345,\n    \"locCity\" : \"Ahwatukee\",\n    \"locState\" : \"Arizona\"\n  }, {\n    \"groupId\" : 101,\n    \"logStartMs\" : 1462881998034,\n    \"codriverIds\" : [ 445, 445 ],\n    \"vehicleId\" : 112,\n    \"remark\" : \"Lunch Break\",\n    \"statusType\" : \"OFF_DUTY\",\n    \"driverId\" : 444,\n    \"locLng\" : -98.502888123,\n    \"locName\" : \"McLean Site A\",\n    \"locLat\" : 23.413702345,\n    \"locCity\" : \"Ahwatukee\",\n    \"locState\" : \"Arizona\"\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<HosLogsResponse>(exampleJson)
            : default(HosLogsResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/hos_logs_summary
        /// </summary>
        /// <remarks>Get the current HOS status for all drivers in the group.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosLogsParam"></param>
        /// <response code="200">HOS logs for the specified driver.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPost]
        [Route("/v1/fleet/hos_logs_summary")]
        [ValidateModelState]
        [SwaggerOperation("GetFleetHosLogsSummary")]
        [SwaggerResponse(statusCode: 200, type: typeof(HosLogsSummaryResponse), description: "HOS logs for the specified driver.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetFleetHosLogsSummary([FromQuery][Required()]string accessToken, [FromBody]HosLogsParam2 hosLogsParam)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(HosLogsSummaryResponse));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"drivers\" : [ {\n    \"timeUntilBreak\" : 28800000,\n    \"dutyStatus\" : \"OFF_DUTY\",\n    \"vehicleName\" : \"Vehicle 1\",\n    \"shiftDriveRemaining\" : 39600000,\n    \"driverId\" : 444,\n    \"cycleTomorrow\" : 252000000,\n    \"shiftRemaining\" : 50400000,\n    \"drivingInViolationToday\" : 39600000,\n    \"timeInCurrentStatus\" : 5000,\n    \"cycleRemaining\" : 252000000,\n    \"drivingInViolationCycle\" : 50400000,\n    \"driverName\" : \"Fred Jacobs\"\n  }, {\n    \"timeUntilBreak\" : 28800000,\n    \"dutyStatus\" : \"OFF_DUTY\",\n    \"vehicleName\" : \"Vehicle 1\",\n    \"shiftDriveRemaining\" : 39600000,\n    \"driverId\" : 444,\n    \"cycleTomorrow\" : 252000000,\n    \"shiftRemaining\" : 50400000,\n    \"drivingInViolationToday\" : 39600000,\n    \"timeInCurrentStatus\" : 5000,\n    \"cycleRemaining\" : 252000000,\n    \"drivingInViolationCycle\" : 50400000,\n    \"driverName\" : \"Fred Jacobs\"\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<HosLogsSummaryResponse>(exampleJson)
            : default(HosLogsSummaryResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/locations
        /// </summary>
        /// <remarks>Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam">Group ID to query.</param>
        /// <response code="200">List of vehicle objects containing their location and the time at which that location was logged.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPost]
        [Route("/v1/fleet/locations")]
        [ValidateModelState]
        [SwaggerOperation("GetFleetLocations")]
        [SwaggerResponse(statusCode: 200, type: typeof(InlineResponse2003), description: "List of vehicle objects containing their location and the time at which that location was logged.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetFleetLocations([FromQuery][Required()]string accessToken, [FromBody]GroupParam groupParam)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(InlineResponse2003));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"groupId\" : 101,\n  \"vehicles\" : [ {\n    \"id\" : 112,\n    \"time\" : 1462881998034,\n    \"onTrip\" : true,\n    \"speed\" : 64.37,\n    \"location\" : \"1 Main St, Dallas, TX\",\n    \"vin\" : \"JTNBB46KX73011966\",\n    \"name\" : \"Truck A7\",\n    \"odometerMeters\" : 71774705,\n    \"longitude\" : 32.897,\n    \"latitude\" : 123.456,\n    \"heading\" : 246.42\n  }, {\n    \"id\" : 112,\n    \"time\" : 1462881998034,\n    \"onTrip\" : true,\n    \"speed\" : 64.37,\n    \"location\" : \"1 Main St, Dallas, TX\",\n    \"vin\" : \"JTNBB46KX73011966\",\n    \"name\" : \"Truck A7\",\n    \"odometerMeters\" : 71774705,\n    \"longitude\" : 32.897,\n    \"latitude\" : 123.456,\n    \"heading\" : 246.42\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<InlineResponse2003>(exampleJson)
            : default(InlineResponse2003);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/maintenance/list
        /// </summary>
        /// <remarks>Get list of the vehicles with any engine faults or check light data.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam">Group ID to query.</param>
        /// <response code="200">List of vehicles and maintenance information about each.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPost]
        [Route("/v1/fleet/maintenance/list")]
        [ValidateModelState]
        [SwaggerOperation("GetFleetMaintenanceList")]
        [SwaggerResponse(statusCode: 200, type: typeof(InlineResponse2004), description: "List of vehicles and maintenance information about each.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetFleetMaintenanceList([FromQuery][Required()]string accessToken, [FromBody]GroupParam groupParam)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(InlineResponse2004));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"vehicles\" : [ {\n    \"passenger\" : {\n      \"diagnosticTroubleCodes\" : [ {\n        \"dtcShortCode\" : \"dtcShortCode\",\n        \"dtcDescription\" : \"dtcDescription\",\n        \"dtcId\" : 5\n      }, {\n        \"dtcShortCode\" : \"dtcShortCode\",\n        \"dtcDescription\" : \"dtcDescription\",\n        \"dtcId\" : 5\n      } ],\n      \"checkEngineLight\" : {\n        \"isOn\" : true\n      }\n    },\n    \"id\" : 112,\n    \"j1939\" : {\n      \"diagnosticTroubleCodes\" : [ {\n        \"spnDescription\" : \"spnDescription\",\n        \"occurrenceCount\" : 6,\n        \"fmiId\" : 0,\n        \"txId\" : 5,\n        \"fmiText\" : \"fmiText\",\n        \"spnId\" : 1\n      }, {\n        \"spnDescription\" : \"spnDescription\",\n        \"occurrenceCount\" : 6,\n        \"fmiId\" : 0,\n        \"txId\" : 5,\n        \"fmiText\" : \"fmiText\",\n        \"spnId\" : 1\n      } ],\n      \"checkEngineLight\" : {\n        \"emissionsIsOn\" : true,\n        \"stopIsOn\" : true,\n        \"warningIsOn\" : true,\n        \"protectIsOn\" : true\n      }\n    }\n  }, {\n    \"passenger\" : {\n      \"diagnosticTroubleCodes\" : [ {\n        \"dtcShortCode\" : \"dtcShortCode\",\n        \"dtcDescription\" : \"dtcDescription\",\n        \"dtcId\" : 5\n      }, {\n        \"dtcShortCode\" : \"dtcShortCode\",\n        \"dtcDescription\" : \"dtcDescription\",\n        \"dtcId\" : 5\n      } ],\n      \"checkEngineLight\" : {\n        \"isOn\" : true\n      }\n    },\n    \"id\" : 112,\n    \"j1939\" : {\n      \"diagnosticTroubleCodes\" : [ {\n        \"spnDescription\" : \"spnDescription\",\n        \"occurrenceCount\" : 6,\n        \"fmiId\" : 0,\n        \"txId\" : 5,\n        \"fmiText\" : \"fmiText\",\n        \"spnId\" : 1\n      }, {\n        \"spnDescription\" : \"spnDescription\",\n        \"occurrenceCount\" : 6,\n        \"fmiId\" : 0,\n        \"txId\" : 5,\n        \"fmiText\" : \"fmiText\",\n        \"spnId\" : 1\n      } ],\n      \"checkEngineLight\" : {\n        \"emissionsIsOn\" : true,\n        \"stopIsOn\" : true,\n        \"warningIsOn\" : true,\n        \"protectIsOn\" : true\n      }\n    }\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<InlineResponse2004>(exampleJson)
            : default(InlineResponse2004);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/trips
        /// </summary>
        /// <remarks>Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tripsParam">Group ID, vehicle ID and time range to query.</param>
        /// <response code="200">List of trips taken by the requested vehicle within the specified timeframe.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPost]
        [Route("/v1/fleet/trips")]
        [ValidateModelState]
        [SwaggerOperation("GetFleetTrips")]
        [SwaggerResponse(statusCode: 200, type: typeof(TripResponse), description: "List of trips taken by the requested vehicle within the specified timeframe.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetFleetTrips([FromQuery][Required()]string accessToken, [FromBody]TripsParam tripsParam)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(TripResponse));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"trips\" : [ {\n    \"startAddress\" : \"Ramen Tatsunoya\",\n    \"endOdometer\" : 210430500,\n    \"distanceMeters\" : 2500,\n    \"startCoordinates\" : {\n      \"longitude\" : -98.502888123,\n      \"latitude\" : 29.443702345\n    },\n    \"startLocation\" : \"16 N Fair Oaks Ave, Pasadena, CA 91103\",\n    \"fuelConsumedMl\" : 75700,\n    \"endCoordinates\" : {\n      \"longitude\" : -91.502888123,\n      \"latitude\" : 23.413702345\n    },\n    \"tollMeters\" : 32000,\n    \"endLocation\" : \"571 S Lake Ave, Pasadena, CA 91101\",\n    \"driverId\" : 719,\n    \"endAddress\" : \"Winchell's Donuts House\",\n    \"startOdometer\" : 210430450,\n    \"startMs\" : 1462878398034,\n    \"endMs\" : 1462881998034\n  }, {\n    \"startAddress\" : \"Ramen Tatsunoya\",\n    \"endOdometer\" : 210430500,\n    \"distanceMeters\" : 2500,\n    \"startCoordinates\" : {\n      \"longitude\" : -98.502888123,\n      \"latitude\" : 29.443702345\n    },\n    \"startLocation\" : \"16 N Fair Oaks Ave, Pasadena, CA 91103\",\n    \"fuelConsumedMl\" : 75700,\n    \"endCoordinates\" : {\n      \"longitude\" : -91.502888123,\n      \"latitude\" : 23.413702345\n    },\n    \"tollMeters\" : 32000,\n    \"endLocation\" : \"571 S Lake Ave, Pasadena, CA 91101\",\n    \"driverId\" : 719,\n    \"endAddress\" : \"Winchell's Donuts House\",\n    \"startOdometer\" : 210430450,\n    \"startMs\" : 1462878398034,\n    \"endMs\" : 1462881998034\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<TripResponse>(exampleJson)
            : default(TripResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>Gets a specific vehicle.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleIdOrExternalId">ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.</param>
        /// <response code="200">The specified vehicle.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/fleet/vehicles/{vehicle_id_or_external_id}")]
        [ValidateModelState]
        [SwaggerOperation("GetFleetVehicle")]
        [SwaggerResponse(statusCode: 200, type: typeof(FleetVehicleResponse), description: "The specified vehicle.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetFleetVehicle([FromQuery][Required()]string accessToken, [FromRoute][Required]string vehicleIdOrExternalId)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(FleetVehicleResponse));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"id\" : 112,\n  \"externalIds\" : {\n    \"maintenanceId\" : \"ABFS18600\"\n  },\n  \"harshAccelSetting\" : \"Heavy\",\n  \"name\" : \"Truck A7\",\n  \"vehicleInfo\" : {\n    \"model\" : \"Odyssey\",\n    \"vin\" : \"1FUJA6BD31LJ09646\",\n    \"year\" : 1997,\n    \"make\" : \"Honda\"\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<FleetVehicleResponse>(exampleJson)
            : default(FleetVehicleResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /addresses/{addressId}
        /// </summary>
        /// <remarks>Fetch an address by its id.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <response code="200">The address/geofence. The geofence field will only be populated with either &#39;circle&#39; or &#39;polygon&#39;, depending on the geofence type.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/addresses/{addressId}")]
        [ValidateModelState]
        [SwaggerOperation("GetOrganizationAddress")]
        [SwaggerResponse(statusCode: 200, type: typeof(Address), description: "The address/geofence. The geofence field will only be populated with either &#39;circle&#39; or &#39;polygon&#39;, depending on the geofence type.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetOrganizationAddress([FromQuery][Required()]string accessToken, [FromRoute][Required]long? addressId)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Address));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"tags\" : [ {\n    \"id\" : 12345,\n    \"name\" : \"Broken Vehicles\"\n  }, {\n    \"id\" : 12345,\n    \"name\" : \"Broken Vehicles\"\n  } ],\n  \"id\" : 123,\n  \"geofence\" : {\n    \"polygon\" : {\n      \"vertices\" : [ {\n        \"longitude\" : -122.403098,\n        \"latitude\" : 37.765363\n      }, {\n        \"longitude\" : -122.403098,\n        \"latitude\" : 37.765363\n      } ]\n    },\n    \"circle\" : {\n      \"radiusMeters\" : 250,\n      \"longitude\" : -122.403098,\n      \"latitude\" : 37.765363\n    }\n  },\n  \"name\" : \"Samsara HQ\",\n  \"formattedAddress\" : \"350 Rhode Island St, San Francisco, CA\",\n  \"notes\" : \"Delivery site 1\",\n  \"contacts\" : [ {\n    \"id\" : 123,\n    \"lastName\" : \"Jones\",\n    \"phone\" : \"111-222-3344\",\n    \"email\" : \"jane.jones@yahoo.com\",\n    \"firstName\" : \"Jane\"\n  }, {\n    \"id\" : 123,\n    \"lastName\" : \"Jones\",\n    \"phone\" : \"111-222-3344\",\n    \"email\" : \"jane.jones@yahoo.com\",\n    \"firstName\" : \"Jane\"\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Address>(exampleJson)
            : default(Address);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /addresses
        /// </summary>
        /// <remarks>Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <response code="200">List of addresses/geofences. For each address entry, the geofence field will only be populated with either &#39;circle&#39; or &#39;polygon&#39;, depending on the geofence type.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/addresses")]
        [ValidateModelState]
        [SwaggerOperation("GetOrganizationAddresses")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<Address>), description: "List of addresses/geofences. For each address entry, the geofence field will only be populated with either &#39;circle&#39; or &#39;polygon&#39;, depending on the geofence type.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetOrganizationAddresses([FromQuery][Required()]string accessToken)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<Address>));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "[ {\n  \"tags\" : [ {\n    \"id\" : 12345,\n    \"name\" : \"Broken Vehicles\"\n  }, {\n    \"id\" : 12345,\n    \"name\" : \"Broken Vehicles\"\n  } ],\n  \"id\" : 123,\n  \"geofence\" : {\n    \"polygon\" : {\n      \"vertices\" : [ {\n        \"longitude\" : -122.403098,\n        \"latitude\" : 37.765363\n      }, {\n        \"longitude\" : -122.403098,\n        \"latitude\" : 37.765363\n      } ]\n    },\n    \"circle\" : {\n      \"radiusMeters\" : 250,\n      \"longitude\" : -122.403098,\n      \"latitude\" : 37.765363\n    }\n  },\n  \"name\" : \"Samsara HQ\",\n  \"formattedAddress\" : \"350 Rhode Island St, San Francisco, CA\",\n  \"notes\" : \"Delivery site 1\",\n  \"contacts\" : [ {\n    \"id\" : 123,\n    \"lastName\" : \"Jones\",\n    \"phone\" : \"111-222-3344\",\n    \"email\" : \"jane.jones@yahoo.com\",\n    \"firstName\" : \"Jane\"\n  }, {\n    \"id\" : 123,\n    \"lastName\" : \"Jones\",\n    \"phone\" : \"111-222-3344\",\n    \"email\" : \"jane.jones@yahoo.com\",\n    \"firstName\" : \"Jane\"\n  } ]\n}, {\n  \"tags\" : [ {\n    \"id\" : 12345,\n    \"name\" : \"Broken Vehicles\"\n  }, {\n    \"id\" : 12345,\n    \"name\" : \"Broken Vehicles\"\n  } ],\n  \"id\" : 123,\n  \"geofence\" : {\n    \"polygon\" : {\n      \"vertices\" : [ {\n        \"longitude\" : -122.403098,\n        \"latitude\" : 37.765363\n      }, {\n        \"longitude\" : -122.403098,\n        \"latitude\" : 37.765363\n      } ]\n    },\n    \"circle\" : {\n      \"radiusMeters\" : 250,\n      \"longitude\" : -122.403098,\n      \"latitude\" : 37.765363\n    }\n  },\n  \"name\" : \"Samsara HQ\",\n  \"formattedAddress\" : \"350 Rhode Island St, San Francisco, CA\",\n  \"notes\" : \"Delivery site 1\",\n  \"contacts\" : [ {\n    \"id\" : 123,\n    \"lastName\" : \"Jones\",\n    \"phone\" : \"111-222-3344\",\n    \"email\" : \"jane.jones@yahoo.com\",\n    \"firstName\" : \"Jane\"\n  }, {\n    \"id\" : 123,\n    \"lastName\" : \"Jones\",\n    \"phone\" : \"111-222-3344\",\n    \"email\" : \"jane.jones@yahoo.com\",\n    \"firstName\" : \"Jane\"\n  } ]\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<Address>>(exampleJson)
            : default(List<Address>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /contacts/{contact_id}
        /// </summary>
        /// <remarks>Fetch a contact by its id.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="contactId">ID of the contact</param>
        /// <response code="200">The contact.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/contacts/{contact_id}")]
        [ValidateModelState]
        [SwaggerOperation("GetOrganizationContact")]
        [SwaggerResponse(statusCode: 200, type: typeof(Contact), description: "The contact.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetOrganizationContact([FromQuery][Required()]string accessToken, [FromRoute][Required]long? contactId)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Contact));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"id\" : 123,\n  \"lastName\" : \"Jones\",\n  \"phone\" : \"111-222-3344\",\n  \"email\" : \"jane.jones@yahoo.com\",\n  \"firstName\" : \"Jane\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Contact>(exampleJson)
            : default(Contact);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
        /// </summary>
        /// <remarks>Fetch harsh event details for a vehicle.</remarks>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="timestamp">Timestamp in milliseconds representing the timestamp of a harsh event.</param>
        /// <response code="200">Harsh event details.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/fleet/vehicles/{vehicleId}/safety/harsh_event")]
        [ValidateModelState]
        [SwaggerOperation("GetVehicleHarshEvent")]
        [SwaggerResponse(statusCode: 200, type: typeof(VehicleHarshEventResponse), description: "Harsh event details.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetVehicleHarshEvent([FromRoute][Required]long? vehicleId, [FromQuery][Required()]string accessToken, [FromQuery][Required()]long? timestamp)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(VehicleHarshEventResponse));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"harshEventType\" : \"Harsh Braking\",\n  \"location\" : {\n    \"address\" : \"350 Rhode Island St, San Francisco, CA\",\n    \"longitude\" : \"-96.14907287\",\n    \"latitude\" : \"33.07614328\"\n  },\n  \"incidentReportUrl\" : \"https://cloud.samsara.com/groups/1234/fleet/reports/safety/vehicle/212123456789012/incident/1539201882984\",\n  \"downloadTrackedInwardVideoUrl\" : \"https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-driver-123456789.tracked.mp4?...\",\n  \"isDistracted\" : true,\n  \"downloadInwardVideoUrl\" : \"https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-driver-123456789.mp4?...\",\n  \"downloadForwardVideoUrl\" : \"https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-123456789.mp4?...\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<VehicleHarshEventResponse>(exampleJson)
            : default(VehicleHarshEventResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/locations
        /// </summary>
        /// <remarks>Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)</param>
        /// <response code="200">Returns locations for a given vehicle between a start/end time, with a maximum query duration of one hour.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/fleet/vehicles/{vehicle_id}/locations")]
        [ValidateModelState]
        [SwaggerOperation("GetVehicleLocations")]
        [SwaggerResponse(statusCode: 200, type: typeof(FleetVehicleLocations), description: "Returns locations for a given vehicle between a start/end time, with a maximum query duration of one hour.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetVehicleLocations([FromQuery][Required()]string accessToken, [FromRoute][Required]long? vehicleId, [FromQuery][Required()]long? startMs, [FromQuery][Required()]long? endMs)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(FleetVehicleLocations));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "\"\"";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<FleetVehicleLocations>(exampleJson)
            : default(FleetVehicleLocations);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
        /// </summary>
        /// <remarks>Fetch the safety score for the vehicle.</remarks>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <response code="200">Safety score details.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/fleet/vehicles/{vehicleId}/safety/score")]
        [ValidateModelState]
        [SwaggerOperation("GetVehicleSafetyScore")]
        [SwaggerResponse(statusCode: 200, type: typeof(VehicleSafetyScoreResponse), description: "Safety score details.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetVehicleSafetyScore([FromRoute][Required]long? vehicleId, [FromQuery][Required()]string accessToken, [FromQuery][Required()]long? startMs, [FromQuery][Required()]long? endMs)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(VehicleSafetyScoreResponse));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"totalTimeDrivenMs\" : 19708293,\n  \"timeOverSpeedLimitMs\" : 3769,\n  \"harshBrakingCount\" : 2,\n  \"harshEvents\" : [ {\n    \"harshEventType\" : \"Harsh Braking\",\n    \"vehicleId\" : 212014918086169,\n    \"timestampMs\" : 1535590776000\n  }, {\n    \"harshEventType\" : \"Harsh Braking\",\n    \"vehicleId\" : 212014918086169,\n    \"timestampMs\" : 1535590776000\n  } ],\n  \"vehicleId\" : 4321,\n  \"harshTurningCount\" : 0,\n  \"totalHarshEventCount\" : 3,\n  \"safetyScore\" : 97,\n  \"crashCount\" : 0,\n  \"harshAccelCount\" : 1,\n  \"safetyScoreRank\" : \"26\",\n  \"totalDistanceDrivenMeters\" : 291836\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<VehicleSafetyScoreResponse>(exampleJson)
            : default(VehicleSafetyScoreResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/vehicles/stats
        /// </summary>
        /// <remarks>Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query.</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query.</param>
        /// <param name="series">Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2</param>
        /// <param name="tagIds">Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3</param>
        /// <param name="startingAfter">Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.</param>
        /// <param name="endingBefore">Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.</param>
        /// <param name="limit">Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.</param>
        /// <response code="200">Returns engine state and/or aux input data for all vehicles in the group between a start/end time.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/fleet/vehicles/stats")]
        [ValidateModelState]
        [SwaggerOperation("GetVehicleStats")]
        [SwaggerResponse(statusCode: 200, type: typeof(InlineResponse2005), description: "Returns engine state and/or aux input data for all vehicles in the group between a start/end time.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetVehicleStats([FromQuery][Required()]string accessToken, [FromQuery][Required()]int? startMs, [FromQuery][Required()]int? endMs, [FromQuery]string series, [FromQuery]string tagIds, [FromQuery]string startingAfter, [FromQuery]string endingBefore, [FromQuery]long? limit)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(InlineResponse2005));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"vehicleStats\" : [ {\n    \"auxInput1\" : {\n      \"values\" : [ {\n        \"value\" : true,\n        \"timeMs\" : 1.546542978484E12\n      }, {\n        \"value\" : true,\n        \"timeMs\" : 1.546542978484E12\n      } ],\n      \"name\" : \"Boom\"\n    },\n    \"vehicleId\" : 112,\n    \"auxInput2\" : {\n      \"values\" : [ {\n        \"value\" : true,\n        \"timeMs\" : 1.546542978484E12\n      }, {\n        \"value\" : true,\n        \"timeMs\" : 1.546542978484E12\n      } ],\n      \"name\" : \"Boom\"\n    },\n    \"engineState\" : [ {\n      \"value\" : \"Running\",\n      \"timeMs\" : 1.546542978484E12\n    }, {\n      \"value\" : \"Running\",\n      \"timeMs\" : 1.546542978484E12\n    } ]\n  }, {\n    \"auxInput1\" : {\n      \"values\" : [ {\n        \"value\" : true,\n        \"timeMs\" : 1.546542978484E12\n      }, {\n        \"value\" : true,\n        \"timeMs\" : 1.546542978484E12\n      } ],\n      \"name\" : \"Boom\"\n    },\n    \"vehicleId\" : 112,\n    \"auxInput2\" : {\n      \"values\" : [ {\n        \"value\" : true,\n        \"timeMs\" : 1.546542978484E12\n      }, {\n        \"value\" : true,\n        \"timeMs\" : 1.546542978484E12\n      } ],\n      \"name\" : \"Boom\"\n    },\n    \"engineState\" : [ {\n      \"value\" : \"Running\",\n      \"timeMs\" : 1.546542978484E12\n    }, {\n      \"value\" : \"Running\",\n      \"timeMs\" : 1.546542978484E12\n    } ]\n  } ],\n  \"pagination\" : {\n    \"hasNextPage\" : true,\n    \"startCursor\" : \"MTU5MTEzNjA2OTU0MzQ3\",\n    \"endCursor\" : \"MTU5MTEzNjA2OTU0MzQ3\",\n    \"hasPrevPage\" : true\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<InlineResponse2005>(exampleJson)
            : default(InlineResponse2005);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/vehicles/locations
        /// </summary>
        /// <remarks>Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)</param>
        /// <response code="200">Returns locations for a given vehicle between a start/end time, with a maximum query duration of 30 minutes.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/fleet/vehicles/locations")]
        [ValidateModelState]
        [SwaggerOperation("GetVehiclesLocations")]
        [SwaggerResponse(statusCode: 200, type: typeof(FleetVehiclesLocations), description: "Returns locations for a given vehicle between a start/end time, with a maximum query duration of 30 minutes.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult GetVehiclesLocations([FromQuery][Required()]string accessToken, [FromQuery][Required()]int? startMs, [FromQuery][Required()]int? endMs)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(FleetVehiclesLocations));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "\"\"";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<FleetVehiclesLocations>(exampleJson)
            : default(FleetVehiclesLocations);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /contacts
        /// </summary>
        /// <remarks>Fetch all contacts for the organization.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <response code="200">List of contacts.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpGet]
        [Route("/v1/contacts")]
        [ValidateModelState]
        [SwaggerOperation("ListContacts")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<Contact>), description: "List of contacts.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult ListContacts([FromQuery][Required()]string accessToken)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<Contact>));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "[ {\n  \"id\" : 123,\n  \"lastName\" : \"Jones\",\n  \"phone\" : \"111-222-3344\",\n  \"email\" : \"jane.jones@yahoo.com\",\n  \"firstName\" : \"Jane\"\n}, {\n  \"id\" : 123,\n  \"lastName\" : \"Jones\",\n  \"phone\" : \"111-222-3344\",\n  \"email\" : \"jane.jones@yahoo.com\",\n  \"firstName\" : \"Jane\"\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<Contact>>(exampleJson)
            : default(List<Contact>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/list
        /// </summary>
        /// <remarks>Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam">Group ID to query.</param>
        /// <param name="startingAfter">Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.</param>
        /// <param name="endingBefore">Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.</param>
        /// <param name="limit">Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.</param>
        /// <response code="200">List of vehicles and information about each.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPost]
        [Route("/v1/fleet/list")]
        [ValidateModelState]
        [SwaggerOperation("ListFleet")]
        [SwaggerResponse(statusCode: 200, type: typeof(InlineResponse2002), description: "List of vehicles and information about each.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult ListFleet([FromQuery][Required()]string accessToken, [FromBody]GroupParam groupParam, [FromQuery]string startingAfter, [FromQuery]string endingBefore, [FromQuery]long? limit)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(InlineResponse2002));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"groupId\" : 101,\n  \"vehicles\" : [ {\n    \"id\" : 112,\n    \"fuelLevelPercent\" : 0.3,\n    \"engineHours\" : 1500,\n    \"vin\" : \"1FUJA6BD31LJ09646\",\n    \"name\" : \"Truck A7\",\n    \"odometerMeters\" : 60130000,\n    \"note\" : \"Red truck 2015 M16\"\n  }, {\n    \"id\" : 112,\n    \"fuelLevelPercent\" : 0.3,\n    \"engineHours\" : 1500,\n    \"vin\" : \"1FUJA6BD31LJ09646\",\n    \"name\" : \"Truck A7\",\n    \"odometerMeters\" : 60130000,\n    \"note\" : \"Red truck 2015 M16\"\n  } ],\n  \"pagination\" : {\n    \"hasNextPage\" : true,\n    \"startCursor\" : \"MTU5MTEzNjA2OTU0MzQ3\",\n    \"endCursor\" : \"MTU5MTEzNjA2OTU0MzQ3\",\n    \"hasPrevPage\" : true\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<InlineResponse2002>(exampleJson)
            : default(InlineResponse2002);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleIdOrExternalId">ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.</param>
        /// <param name="data"></param>
        /// <response code="200">The updated vehicle.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPatch]
        [Route("/v1/fleet/vehicles/{vehicle_id_or_external_id}")]
        [ValidateModelState]
        [SwaggerOperation("PatchFleetVehicle")]
        [SwaggerResponse(statusCode: 200, type: typeof(FleetVehicleResponse), description: "The updated vehicle.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult PatchFleetVehicle([FromQuery][Required()]string accessToken, [FromRoute][Required]string vehicleIdOrExternalId, [FromBody]Data data)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(FleetVehicleResponse));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"id\" : 112,\n  \"externalIds\" : {\n    \"maintenanceId\" : \"ABFS18600\"\n  },\n  \"harshAccelSetting\" : \"Heavy\",\n  \"name\" : \"Truck A7\",\n  \"vehicleInfo\" : {\n    \"model\" : \"Odyssey\",\n    \"vin\" : \"1FUJA6BD31LJ09646\",\n    \"year\" : 1997,\n    \"make\" : \"Honda\"\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<FleetVehicleResponse>(exampleJson)
            : default(FleetVehicleResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>Reactivate the inactive driver having id.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <param name="reactivateDriverParam">Driver reactivation body</param>
        /// <response code="200">Returns the reactivated driver, which is now available at /fleet/drivers/{driver_id}.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPut]
        [Route("/v1/fleet/drivers/inactive/{driver_id_or_external_id}")]
        [ValidateModelState]
        [SwaggerOperation("ReactivateDriverById")]
        [SwaggerResponse(statusCode: 200, type: typeof(CurrentDriver), description: "Returns the reactivated driver, which is now available at /fleet/drivers/{driver_id}.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult ReactivateDriverById([FromQuery][Required()]string accessToken, [FromRoute][Required]string driverIdOrExternalId, [FromBody]ReactivateDriverParam reactivateDriverParam)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(CurrentDriver));

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));

            string exampleJson = null;
            exampleJson = "\"\"";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<CurrentDriver>(exampleJson)
            : default(CurrentDriver);
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

        /// <summary>
        /// /addresses/{addressId}
        /// </summary>
        /// <remarks>Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="address">Update parts of an address&#39;s value. If the geofence &#39;circle&#39; or &#39;polygon&#39; key is specified, the update will change the type of geofence accordingly.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <response code="200">Address was successfully updated. No response body is returned.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPatch]
        [Route("/v1/addresses/{addressId}")]
        [ValidateModelState]
        [SwaggerOperation("UpdateOrganizationAddress")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult UpdateOrganizationAddress([FromQuery][Required()]string accessToken, [FromBody]Address address, [FromRoute][Required]long? addressId)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));


            throw new NotImplementedException();
        }

        /// <summary>
        /// /fleet/set_data
        /// </summary>
        /// <remarks>This method enables the mutation of metadata for vehicles in the Samsara Cloud.</remarks>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleUpdateParam"></param>
        /// <response code="200">Vehicles were successfully updated. No response body is returned.</response>
        /// <response code="0">Unexpected error.</response>
        [HttpPost]
        [Route("/v1/fleet/set_data")]
        [ValidateModelState]
        [SwaggerOperation("UpdateVehicles")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error.")]
        public virtual IActionResult UpdateVehicles([FromQuery][Required()]string accessToken, [FromBody]VehicleUpdateParam vehicleUpdateParam)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));


            throw new NotImplementedException();
        }
    }
}
