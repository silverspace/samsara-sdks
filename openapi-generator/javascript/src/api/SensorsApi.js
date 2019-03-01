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
import CargoResponse from '../model/CargoResponse';
import DoorResponse from '../model/DoorResponse';
import HumidityResponse from '../model/HumidityResponse';
import InlineObject19 from '../model/InlineObject19';
import InlineObject20 from '../model/InlineObject20';
import InlineObject21 from '../model/InlineObject21';
import InlineObject22 from '../model/InlineObject22';
import InlineObject23 from '../model/InlineObject23';
import InlineObject24 from '../model/InlineObject24';
import InlineResponse2008 from '../model/InlineResponse2008';
import SensorHistoryResponse from '../model/SensorHistoryResponse';
import TemperatureResponse from '../model/TemperatureResponse';

/**
* Sensors service.
* @module api/SensorsApi
* @version 1.0.0
*/
export default class SensorsApi {

    /**
    * Constructs a new SensorsApi. 
    * @alias module:api/SensorsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the getSensors operation.
     * @callback module:api/SensorsApi~getSensorsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse2008} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /sensors/list
     * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
     * @param {String} accessToken Samsara API access token.
     * @param {module:model/InlineObject23} groupParam 
     * @param {module:api/SensorsApi~getSensorsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InlineResponse2008}
     */
    getSensors(accessToken, groupParam, callback) {
      let postBody = groupParam;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getSensors");
      }
      // verify the required parameter 'groupParam' is set
      if (groupParam === undefined || groupParam === null) {
        throw new Error("Missing the required parameter 'groupParam' when calling getSensors");
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
      let returnType = InlineResponse2008;
      return this.apiClient.callApi(
        '/sensors/list', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getSensorsCargo operation.
     * @callback module:api/SensorsApi~getSensorsCargoCallback
     * @param {String} error Error message, if any.
     * @param {module:model/CargoResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /sensors/cargo
     * Get cargo monitor status (empty / full) for requested sensors.
     * @param {String} accessToken Samsara API access token.
     * @param {module:model/InlineObject19} sensorParam 
     * @param {module:api/SensorsApi~getSensorsCargoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/CargoResponse}
     */
    getSensorsCargo(accessToken, sensorParam, callback) {
      let postBody = sensorParam;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getSensorsCargo");
      }
      // verify the required parameter 'sensorParam' is set
      if (sensorParam === undefined || sensorParam === null) {
        throw new Error("Missing the required parameter 'sensorParam' when calling getSensorsCargo");
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
      let returnType = CargoResponse;
      return this.apiClient.callApi(
        '/sensors/cargo', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getSensorsDoor operation.
     * @callback module:api/SensorsApi~getSensorsDoorCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DoorResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /sensors/door
     * Get door monitor status (closed / open) for requested sensors.
     * @param {String} accessToken Samsara API access token.
     * @param {module:model/InlineObject20} sensorParam 
     * @param {module:api/SensorsApi~getSensorsDoorCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DoorResponse}
     */
    getSensorsDoor(accessToken, sensorParam, callback) {
      let postBody = sensorParam;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getSensorsDoor");
      }
      // verify the required parameter 'sensorParam' is set
      if (sensorParam === undefined || sensorParam === null) {
        throw new Error("Missing the required parameter 'sensorParam' when calling getSensorsDoor");
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
      let returnType = DoorResponse;
      return this.apiClient.callApi(
        '/sensors/door', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getSensorsHistory operation.
     * @callback module:api/SensorsApi~getSensorsHistoryCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SensorHistoryResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /sensors/history
     * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
     * @param {String} accessToken Samsara API access token.
     * @param {module:model/InlineObject21} historyParam 
     * @param {module:api/SensorsApi~getSensorsHistoryCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/SensorHistoryResponse}
     */
    getSensorsHistory(accessToken, historyParam, callback) {
      let postBody = historyParam;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getSensorsHistory");
      }
      // verify the required parameter 'historyParam' is set
      if (historyParam === undefined || historyParam === null) {
        throw new Error("Missing the required parameter 'historyParam' when calling getSensorsHistory");
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
      let returnType = SensorHistoryResponse;
      return this.apiClient.callApi(
        '/sensors/history', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getSensorsHumidity operation.
     * @callback module:api/SensorsApi~getSensorsHumidityCallback
     * @param {String} error Error message, if any.
     * @param {module:model/HumidityResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /sensors/humidity
     * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
     * @param {String} accessToken Samsara API access token.
     * @param {module:model/InlineObject22} sensorParam 
     * @param {module:api/SensorsApi~getSensorsHumidityCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/HumidityResponse}
     */
    getSensorsHumidity(accessToken, sensorParam, callback) {
      let postBody = sensorParam;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getSensorsHumidity");
      }
      // verify the required parameter 'sensorParam' is set
      if (sensorParam === undefined || sensorParam === null) {
        throw new Error("Missing the required parameter 'sensorParam' when calling getSensorsHumidity");
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
      let returnType = HumidityResponse;
      return this.apiClient.callApi(
        '/sensors/humidity', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getSensorsTemperature operation.
     * @callback module:api/SensorsApi~getSensorsTemperatureCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TemperatureResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /sensors/temperature
     * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
     * @param {String} accessToken Samsara API access token.
     * @param {module:model/InlineObject24} sensorParam 
     * @param {module:api/SensorsApi~getSensorsTemperatureCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TemperatureResponse}
     */
    getSensorsTemperature(accessToken, sensorParam, callback) {
      let postBody = sensorParam;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getSensorsTemperature");
      }
      // verify the required parameter 'sensorParam' is set
      if (sensorParam === undefined || sensorParam === null) {
        throw new Error("Missing the required parameter 'sensorParam' when calling getSensorsTemperature");
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
      let returnType = TemperatureResponse;
      return this.apiClient.callApi(
        '/sensors/temperature', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
