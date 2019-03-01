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
import AssetReeferResponse from '../model/AssetReeferResponse';
import InlineResponse200 from '../model/InlineResponse200';
import InlineResponse2001 from '../model/InlineResponse2001';

/**
* Assets service.
* @module api/AssetsApi
* @version 1.0.0
*/
export default class AssetsApi {

    /**
    * Constructs a new AssetsApi. 
    * @alias module:api/AssetsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the getAllAssetCurrentLocations operation.
     * @callback module:api/AssetsApi~getAllAssetCurrentLocationsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse2001} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/assets/locations
     * Fetch current locations of all assets for the group.
     * @param {String} accessToken Samsara API access token.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param {module:api/AssetsApi~getAllAssetCurrentLocationsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InlineResponse2001}
     */
    getAllAssetCurrentLocations(accessToken, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getAllAssetCurrentLocations");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken,
        'group_id': opts['groupId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse2001;
      return this.apiClient.callApi(
        '/fleet/assets/locations', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getAllAssets operation.
     * @callback module:api/AssetsApi~getAllAssetsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/assets
     * Fetch all of the assets for the group.
     * @param {String} accessToken Samsara API access token.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param {module:api/AssetsApi~getAllAssetsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InlineResponse200}
     */
    getAllAssets(accessToken, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getAllAssets");
      }

      let pathParams = {
      };
      let queryParams = {
        'access_token': accessToken,
        'group_id': opts['groupId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;
      return this.apiClient.callApi(
        '/fleet/assets', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getAssetLocation operation.
     * @callback module:api/AssetsApi~getAssetLocationCallback
     * @param {String} error Error message, if any.
     * @param {Array.<Object>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/assets/{assetId:[0-9]+}/locations
     * Fetch the historical locations for the asset.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} assetId ID of the asset
     * @param {Number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param {Number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param {module:api/AssetsApi~getAssetLocationCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<Object>}
     */
    getAssetLocation(accessToken, assetId, startMs, endMs, callback) {
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getAssetLocation");
      }
      // verify the required parameter 'assetId' is set
      if (assetId === undefined || assetId === null) {
        throw new Error("Missing the required parameter 'assetId' when calling getAssetLocation");
      }
      // verify the required parameter 'startMs' is set
      if (startMs === undefined || startMs === null) {
        throw new Error("Missing the required parameter 'startMs' when calling getAssetLocation");
      }
      // verify the required parameter 'endMs' is set
      if (endMs === undefined || endMs === null) {
        throw new Error("Missing the required parameter 'endMs' when calling getAssetLocation");
      }

      let pathParams = {
        'asset_id': assetId
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
      let returnType = [Object];
      return this.apiClient.callApi(
        '/fleet/assets/{asset_id}/locations', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getAssetReefer operation.
     * @callback module:api/AssetsApi~getAssetReeferCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AssetReeferResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * /fleet/assets/{assetId:[0-9]+}/reefer
     * Fetch the reefer-specific stats of an asset.
     * @param {String} accessToken Samsara API access token.
     * @param {Number} assetId ID of the asset
     * @param {Number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param {Number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param {module:api/AssetsApi~getAssetReeferCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AssetReeferResponse}
     */
    getAssetReefer(accessToken, assetId, startMs, endMs, callback) {
      let postBody = null;
      // verify the required parameter 'accessToken' is set
      if (accessToken === undefined || accessToken === null) {
        throw new Error("Missing the required parameter 'accessToken' when calling getAssetReefer");
      }
      // verify the required parameter 'assetId' is set
      if (assetId === undefined || assetId === null) {
        throw new Error("Missing the required parameter 'assetId' when calling getAssetReefer");
      }
      // verify the required parameter 'startMs' is set
      if (startMs === undefined || startMs === null) {
        throw new Error("Missing the required parameter 'startMs' when calling getAssetReefer");
      }
      // verify the required parameter 'endMs' is set
      if (endMs === undefined || endMs === null) {
        throw new Error("Missing the required parameter 'endMs' when calling getAssetReefer");
      }

      let pathParams = {
        'asset_id': assetId
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
      let returnType = AssetReeferResponse;
      return this.apiClient.callApi(
        '/fleet/assets/{asset_id}/reefer', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
