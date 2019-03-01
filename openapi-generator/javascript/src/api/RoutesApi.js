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
 *
 */


import ApiClient from "../ApiClient";
import AllRouteJobUpdates from '../model/AllRouteJobUpdates';
import DispatchRoute from '../model/DispatchRoute';
import DispatchRouteCreate from '../model/DispatchRouteCreate';
import DispatchRouteHistory from '../model/DispatchRouteHistory';

/**
* Routes service.
* @module api/RoutesApi
* @version 1.0.0
*/
export default class RoutesApi {

    /**
    * Constructs a new RoutesApi. 
    * @alias module:api/RoutesApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the createDispatchRoute operation.
     * @callback module:api/RoutesApi~createDispatchRouteCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DispatchRoute} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/dispatch/routes
     * Create a new dispatch route.
     * @param {String} accessToken Samsara API access token.
     * @param {module:model/DispatchRouteCreate} createDispatchRouteParams 
     * @param {module:api/RoutesApi~createDispatchRouteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DispatchRoute}
     */
    createDispatchRoute(accessToken, createDispatchRouteParams, callback) {
      let postBody = createDispatchRouteParams;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling createDispatchRoute");
      }
      // verify the required parameter 'createDispatchRouteParams' is set
      if (createDispatchRouteParams === undefined || createDispatchRouteParams === null) {
        throw new Error("Missing the required parameter 'createDispatchRouteParams' when calling createDispatchRoute");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = DispatchRoute;
      return this.apiClient.callApi(
        '/fleet/dispatch/routes', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the createDriverDispatchRoute operation.
     * @callback module:api/RoutesApi~createDriverDispatchRouteCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DispatchRoute} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * Create a new dispatch route for the driver with driver_id.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} driverId ID of the driver with the associated routes.
     * @param {module:model/DispatchRouteCreate} createDispatchRouteParams 
     * @param {module:api/RoutesApi~createDriverDispatchRouteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DispatchRoute}
     */
    createDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams, callback) {
      let postBody = createDispatchRouteParams;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling createDriverDispatchRoute");
      }
      // verify the required parameter 'driverId' is set
      if (driverId === undefined || driverId === null) {
        throw new Error("Missing the required parameter 'driverId' when calling createDriverDispatchRoute");
      }
      // verify the required parameter 'createDispatchRouteParams' is set
      if (createDispatchRouteParams === undefined || createDispatchRouteParams === null) {
        throw new Error("Missing the required parameter 'createDispatchRouteParams' when calling createDriverDispatchRoute");
      }

      let pathParams = {
        'driver_id': driverId
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = DispatchRoute;
      return this.apiClient.callApi(
        '/fleet/drivers/{driver_id}/dispatch/routes', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the createVehicleDispatchRoute operation.
     * @callback module:api/RoutesApi~createVehicleDispatchRouteCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DispatchRoute} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * Create a new dispatch route for the vehicle with vehicle_id.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} vehicleId ID of the vehicle with the associated routes.
     * @param {module:model/DispatchRouteCreate} createDispatchRouteParams 
     * @param {module:api/RoutesApi~createVehicleDispatchRouteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DispatchRoute}
     */
    createVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams, callback) {
      let postBody = createDispatchRouteParams;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling createVehicleDispatchRoute");
      }
      // verify the required parameter 'vehicleId' is set
      if (vehicleId === undefined || vehicleId === null) {
        throw new Error("Missing the required parameter 'vehicleId' when calling createVehicleDispatchRoute");
      }
      // verify the required parameter 'createDispatchRouteParams' is set
      if (createDispatchRouteParams === undefined || createDispatchRouteParams === null) {
        throw new Error("Missing the required parameter 'createDispatchRouteParams' when calling createVehicleDispatchRoute");
      }

      let pathParams = {
        'vehicle_id': vehicleId
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = DispatchRoute;
      return this.apiClient.callApi(
        '/fleet/vehicles/{vehicle_id}/dispatch/routes', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteDispatchRouteById operation.
     * @callback module:api/RoutesApi~deleteDispatchRouteByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     * Delete a dispatch route and its associated jobs.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} routeId ID of the dispatch route.
     * @param {module:api/RoutesApi~deleteDispatchRouteByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteDispatchRouteById(accessToken, routeId, callback) {
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling deleteDispatchRouteById");
      }
      // verify the required parameter 'routeId' is set
      if (routeId === undefined || routeId === null) {
        throw new Error("Missing the required parameter 'routeId' when calling deleteDispatchRouteById");
      }

      let pathParams = {
        'route_id': routeId
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = null;
      return this.apiClient.callApi(
        '/fleet/dispatch/routes/{route_id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the fetchAllDispatchRoutes operation.
     * @callback module:api/RoutesApi~fetchAllDispatchRoutesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/DispatchRoute>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/dispatch/routes
     * Fetch all of the dispatch routes for the group.
     * @param {String} accessToken Samsara API access token.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param {Number} opts.endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param {Number} opts.duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     * @param {module:api/RoutesApi~fetchAllDispatchRoutesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/DispatchRoute>}
     */
    fetchAllDispatchRoutes(accessToken, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling fetchAllDispatchRoutes");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken,
        'group_id': opts['groupId'],
        'end_time': opts['endTime'],
        'duration': opts['duration']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = [DispatchRoute];
      return this.apiClient.callApi(
        '/fleet/dispatch/routes', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the fetchAllRouteJobUpdates operation.
     * @callback module:api/RoutesApi~fetchAllRouteJobUpdatesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AllRouteJobUpdates} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/dispatch/routes/job_updates
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * @param {String} accessToken Samsara API access token.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param {String} opts.sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
     * @param {String} opts.include Optionally set include&#x3D;route to include route object in response payload.
     * @param {module:api/RoutesApi~fetchAllRouteJobUpdatesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AllRouteJobUpdates}
     */
    fetchAllRouteJobUpdates(accessToken, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling fetchAllRouteJobUpdates");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken,
        'group_id': opts['groupId'],
        'sequence_id': opts['sequenceId'],
        'include': opts['include']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = AllRouteJobUpdates;
      return this.apiClient.callApi(
        '/fleet/dispatch/routes/job_updates', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getDispatchRouteById operation.
     * @callback module:api/RoutesApi~getDispatchRouteByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DispatchRoute} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     * Fetch a dispatch route by id.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} routeId ID of the dispatch route.
     * @param {module:api/RoutesApi~getDispatchRouteByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DispatchRoute}
     */
    getDispatchRouteById(accessToken, routeId, callback) {
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getDispatchRouteById");
      }
      // verify the required parameter 'routeId' is set
      if (routeId === undefined || routeId === null) {
        throw new Error("Missing the required parameter 'routeId' when calling getDispatchRouteById");
      }

      let pathParams = {
        'route_id': routeId
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = DispatchRoute;
      return this.apiClient.callApi(
        '/fleet/dispatch/routes/{route_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getDispatchRouteHistory operation.
     * @callback module:api/RoutesApi~getDispatchRouteHistoryCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DispatchRouteHistory} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     * Fetch the history of a dispatch route.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} routeId ID of the route with history.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
     * @param {Number} opts.endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
     * @param {module:api/RoutesApi~getDispatchRouteHistoryCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DispatchRouteHistory}
     */
    getDispatchRouteHistory(accessToken, routeId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getDispatchRouteHistory");
      }
      // verify the required parameter 'routeId' is set
      if (routeId === undefined || routeId === null) {
        throw new Error("Missing the required parameter 'routeId' when calling getDispatchRouteHistory");
      }

      let pathParams = {
        'route_id': routeId
      };
      let queryParams = {
        'access_token': accessToken,
        'start_time': opts['startTime'],
        'end_time': opts['endTime']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = DispatchRouteHistory;
      return this.apiClient.callApi(
        '/fleet/dispatch/routes/{route_id}/history', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getDispatchRoutesByDriverId operation.
     * @callback module:api/RoutesApi~getDispatchRoutesByDriverIdCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/DispatchRoute>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * Fetch all of the dispatch routes for a given driver.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} driverId ID of the driver with the associated routes.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param {Number} opts.duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     * @param {module:api/RoutesApi~getDispatchRoutesByDriverIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/DispatchRoute>}
     */
    getDispatchRoutesByDriverId(accessToken, driverId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getDispatchRoutesByDriverId");
      }
      // verify the required parameter 'driverId' is set
      if (driverId === undefined || driverId === null) {
        throw new Error("Missing the required parameter 'driverId' when calling getDispatchRoutesByDriverId");
      }

      let pathParams = {
        'driver_id': driverId
      };
      let queryParams = {
        'access_token': accessToken,
        'end_time': opts['endTime'],
        'duration': opts['duration']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = [DispatchRoute];
      return this.apiClient.callApi(
        '/fleet/drivers/{driver_id}/dispatch/routes', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getDispatchRoutesByVehicleId operation.
     * @callback module:api/RoutesApi~getDispatchRoutesByVehicleIdCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/DispatchRoute>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * Fetch all of the dispatch routes for a given vehicle.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} vehicleId ID of the vehicle with the associated routes.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param {Number} opts.duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     * @param {module:api/RoutesApi~getDispatchRoutesByVehicleIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/DispatchRoute>}
     */
    getDispatchRoutesByVehicleId(accessToken, vehicleId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getDispatchRoutesByVehicleId");
      }
      // verify the required parameter 'vehicleId' is set
      if (vehicleId === undefined || vehicleId === null) {
        throw new Error("Missing the required parameter 'vehicleId' when calling getDispatchRoutesByVehicleId");
      }

      let pathParams = {
        'vehicle_id': vehicleId
      };
      let queryParams = {
        'access_token': accessToken,
        'end_time': opts['endTime'],
        'duration': opts['duration']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = [DispatchRoute];
      return this.apiClient.callApi(
        '/fleet/vehicles/{vehicle_id}/dispatch/routes', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the updateDispatchRouteById operation.
     * @callback module:api/RoutesApi~updateDispatchRouteByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DispatchRoute} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     * Update a dispatch route and its associated jobs.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} routeId ID of the dispatch route.
     * @param {module:model/DispatchRoute} updateDispatchRouteParams 
     * @param {module:api/RoutesApi~updateDispatchRouteByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DispatchRoute}
     */
    updateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams, callback) {
      let postBody = updateDispatchRouteParams;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling updateDispatchRouteById");
      }
      // verify the required parameter 'routeId' is set
      if (routeId === undefined || routeId === null) {
        throw new Error("Missing the required parameter 'routeId' when calling updateDispatchRouteById");
      }
      // verify the required parameter 'updateDispatchRouteParams' is set
      if (updateDispatchRouteParams === undefined || updateDispatchRouteParams === null) {
        throw new Error("Missing the required parameter 'updateDispatchRouteParams' when calling updateDispatchRouteById");
      }

      let pathParams = {
        'route_id': routeId
      };
      let queryParams = {
        'access_token': accessToken
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = DispatchRoute;
      return this.apiClient.callApi(
        '/fleet/dispatch/routes/{route_id}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
