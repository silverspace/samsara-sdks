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
import DriverSafetyScoreResponse from '../model/DriverSafetyScoreResponse';
import VehicleHarshEventResponse from '../model/VehicleHarshEventResponse';
import VehicleSafetyScoreResponse from '../model/VehicleSafetyScoreResponse';

/**
* Safety service.
* @module api/SafetyApi
* @version 1.0.0
*/
export default class SafetyApi {

    /**
    * Constructs a new SafetyApi. 
    * @alias module:api/SafetyApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the getDriverSafetyScore operation.
     * @callback module:api/SafetyApi~getDriverSafetyScoreCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DriverSafetyScoreResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     * Fetch the safety score for the driver.
     * @param {Number} driverId ID of the driver
     * @param {String} accessToken Samsara API access token.
     * @param {Number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param {Number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param {module:api/SafetyApi~getDriverSafetyScoreCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DriverSafetyScoreResponse}
     */
    getDriverSafetyScore(driverId, accessToken, startMs, endMs, callback) {
      let postBody = null;
      // verify the required parameter 'driverId' is set
      if (driverId === undefined || driverId === null) {
        throw new Error("Missing the required parameter 'driverId' when calling getDriverSafetyScore");
      }
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getDriverSafetyScore");
      }
      // verify the required parameter 'startMs' is set
      if (startMs === undefined || startMs === null) {
        throw new Error("Missing the required parameter 'startMs' when calling getDriverSafetyScore");
      }
      // verify the required parameter 'endMs' is set
      if (endMs === undefined || endMs === null) {
        throw new Error("Missing the required parameter 'endMs' when calling getDriverSafetyScore");
      }

      let pathParams = {
        'driverId': driverId
      };
      let queryParams = {
        'access_token': accessToken,
        'startMs': startMs,
        'endMs': endMs
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = DriverSafetyScoreResponse;
      return this.apiClient.callApi(
        '/fleet/drivers/{driverId}/safety/score', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getVehicleHarshEvent operation.
     * @callback module:api/SafetyApi~getVehicleHarshEventCallback
     * @param {String} error Error message, if any.
     * @param {module:model/VehicleHarshEventResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     * Fetch harsh event details for a vehicle.
     * @param {Number} vehicleId ID of the vehicle
     * @param {String} accessToken Samsara API access token.
     * @param {Number} timestamp Timestamp in milliseconds representing the timestamp of a harsh event.
     * @param {module:api/SafetyApi~getVehicleHarshEventCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/VehicleHarshEventResponse}
     */
    getVehicleHarshEvent(vehicleId, accessToken, timestamp, callback) {
      let postBody = null;
      // verify the required parameter 'vehicleId' is set
      if (vehicleId === undefined || vehicleId === null) {
        throw new Error("Missing the required parameter 'vehicleId' when calling getVehicleHarshEvent");
      }
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getVehicleHarshEvent");
      }
      // verify the required parameter 'timestamp' is set
      if (timestamp === undefined || timestamp === null) {
        throw new Error("Missing the required parameter 'timestamp' when calling getVehicleHarshEvent");
      }

      let pathParams = {
        'vehicleId': vehicleId
      };
      let queryParams = {
        'access_token': accessToken,
        'timestamp': timestamp
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = VehicleHarshEventResponse;
      return this.apiClient.callApi(
        '/fleet/vehicles/{vehicleId}/safety/harsh_event', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getVehicleSafetyScore operation.
     * @callback module:api/SafetyApi~getVehicleSafetyScoreCallback
     * @param {String} error Error message, if any.
     * @param {module:model/VehicleSafetyScoreResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     * Fetch the safety score for the vehicle.
     * @param {Number} vehicleId ID of the vehicle
     * @param {String} accessToken Samsara API access token.
     * @param {Number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param {Number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param {module:api/SafetyApi~getVehicleSafetyScoreCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/VehicleSafetyScoreResponse}
     */
    getVehicleSafetyScore(vehicleId, accessToken, startMs, endMs, callback) {
      let postBody = null;
      // verify the required parameter 'vehicleId' is set
      if (vehicleId === undefined || vehicleId === null) {
        throw new Error("Missing the required parameter 'vehicleId' when calling getVehicleSafetyScore");
      }
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getVehicleSafetyScore");
      }
      // verify the required parameter 'startMs' is set
      if (startMs === undefined || startMs === null) {
        throw new Error("Missing the required parameter 'startMs' when calling getVehicleSafetyScore");
      }
      // verify the required parameter 'endMs' is set
      if (endMs === undefined || endMs === null) {
        throw new Error("Missing the required parameter 'endMs' when calling getVehicleSafetyScore");
      }

      let pathParams = {
        'vehicleId': vehicleId
      };
      let queryParams = {
        'access_token': accessToken,
        'startMs': startMs,
        'endMs': endMs
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = VehicleSafetyScoreResponse;
      return this.apiClient.callApi(
        '/fleet/vehicles/{vehicleId}/safety/score', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
