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
import DataInputHistoryResponse from '../model/DataInputHistoryResponse';
import InlineObject17 from '../model/InlineObject17';
import InlineObject18 from '../model/InlineObject18';
import InlineResponse2006 from '../model/InlineResponse2006';
import InlineResponse2007 from '../model/InlineResponse2007';
import MachineHistoryResponse from '../model/MachineHistoryResponse';

/**
* Industrial service.
* @module api/IndustrialApi
* @version 1.0.0
*/
export default class IndustrialApi {

    /**
    * Constructs a new IndustrialApi. 
    * @alias module:api/IndustrialApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the getAllDataInputs operation.
     * @callback module:api/IndustrialApi~getAllDataInputsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse2006} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /industrial/data
     * Fetch all of the data inputs for a group.
     * @param {String} accessToken Samsara API access token.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param {Number} opts.startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
     * @param {Number} opts.endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
     * @param {module:api/IndustrialApi~getAllDataInputsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InlineResponse2006}
     */
    getAllDataInputs(accessToken, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getAllDataInputs");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken,
        'group_id': opts['groupId'],
        'startMs': opts['startMs'],
        'endMs': opts['endMs']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse2006;
      return this.apiClient.callApi(
        '/industrial/data', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getDataInput operation.
     * @callback module:api/IndustrialApi~getDataInputCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DataInputHistoryResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /industrial/data/{data_input_id:[0-9]+}
     * Fetch datapoints from a given data input.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} dataInputId ID of the data input
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
     * @param {Number} opts.endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
     * @param {module:api/IndustrialApi~getDataInputCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DataInputHistoryResponse}
     */
    getDataInput(accessToken, dataInputId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getDataInput");
      }
      // verify the required parameter 'dataInputId' is set
      if (dataInputId === undefined || dataInputId === null) {
        throw new Error("Missing the required parameter 'dataInputId' when calling getDataInput");
      }

      let pathParams = {
        'data_input_id': dataInputId
      };
      let queryParams = {
        'access_token': accessToken,
        'startMs': opts['startMs'],
        'endMs': opts['endMs']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = DataInputHistoryResponse;
      return this.apiClient.callApi(
        '/industrial/data/{data_input_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getMachines operation.
     * @callback module:api/IndustrialApi~getMachinesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse2007} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /machines/list
     * Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
     * @param {String} accessToken Samsara API access token.
     * @param {module:model/InlineObject18} groupParam 
     * @param {module:api/IndustrialApi~getMachinesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InlineResponse2007}
     */
    getMachines(accessToken, groupParam, callback) {
      let postBody = groupParam;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getMachines");
      }
      // verify the required parameter 'groupParam' is set
      if (groupParam === undefined || groupParam === null) {
        throw new Error("Missing the required parameter 'groupParam' when calling getMachines");
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
      let returnType = InlineResponse2007;
      return this.apiClient.callApi(
        '/machines/list', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getMachinesHistory operation.
     * @callback module:api/IndustrialApi~getMachinesHistoryCallback
     * @param {String} error Error message, if any.
     * @param {module:model/MachineHistoryResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /machines/history
     * Get historical data for machine objects. This method returns a set of historical data for all machines in a group
     * @param {String} accessToken Samsara API access token.
     * @param {module:model/InlineObject17} historyParam 
     * @param {module:api/IndustrialApi~getMachinesHistoryCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/MachineHistoryResponse}
     */
    getMachinesHistory(accessToken, historyParam, callback) {
      let postBody = historyParam;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getMachinesHistory");
      }
      // verify the required parameter 'historyParam' is set
      if (historyParam === undefined || historyParam === null) {
        throw new Error("Missing the required parameter 'historyParam' when calling getMachinesHistory");
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
      let returnType = MachineHistoryResponse;
      return this.apiClient.callApi(
        '/machines/history', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
