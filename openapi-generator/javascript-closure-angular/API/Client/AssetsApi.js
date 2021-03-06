/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.AssetsApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  &#x60;&#x60;&#x60;curl https://api.samsara.com/&lt;version&gt;/&lt;endpoint&gt; &#x60;&#x60;&#x60;  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under &#x60;Settings-&gt;Organization-&gt;API Tokens&#x60;.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  &#x60;&#x60;&#x60;curl https://api.samsara.com/&lt;version&gt;/&lt;endpoint&gt;?access_token&#x3D;{access_token} &#x60;&#x60;&#x60;  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is &#x60;v1&#x60; and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 * Version: 1.0.0
 * Generated by: org.openapitools.codegen.languages.JavascriptClosureAngularClientCodegen
 */
goog.provide('API.Client.AssetsApi');

goog.require('API.Client.AssetReeferResponse');
goog.require('API.Client.inline_response_200');
goog.require('API.Client.inline_response_200_1');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.AssetsApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('AssetsApiBasePath') ?
                   /** @type {!string} */ ($injector.get('AssetsApiBasePath')) :
                   'https://api.samsara.com/v1';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('AssetsApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('AssetsApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.AssetsApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * /fleet/assets/locations
 * Fetch current locations of all assets for the group.
 * @param {!string} accessToken Samsara API access token.
 * @param {!number=} opt_groupId Optional group ID if the organization has multiple groups (uncommon).
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.inline_response_200_1>}
 */
API.Client.AssetsApi.prototype.getAllAssetCurrentLocations = function(accessToken, opt_groupId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/fleet/assets/locations';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'accessToken' is set
  if (!accessToken) {
    throw new Error('Missing required parameter accessToken when calling getAllAssetCurrentLocations');
  }
  if (accessToken !== undefined) {
    queryParameters['access_token'] = accessToken;
  }

  if (opt_groupId !== undefined) {
    queryParameters['group_id'] = opt_groupId;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * /fleet/assets
 * Fetch all of the assets for the group.
 * @param {!string} accessToken Samsara API access token.
 * @param {!number=} opt_groupId Optional group ID if the organization has multiple groups (uncommon).
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.inline_response_200>}
 */
API.Client.AssetsApi.prototype.getAllAssets = function(accessToken, opt_groupId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/fleet/assets';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'accessToken' is set
  if (!accessToken) {
    throw new Error('Missing required parameter accessToken when calling getAllAssets');
  }
  if (accessToken !== undefined) {
    queryParameters['access_token'] = accessToken;
  }

  if (opt_groupId !== undefined) {
    queryParameters['group_id'] = opt_groupId;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * /fleet/assets/{assetId:[0-9]+}/locations
 * Fetch the historical locations for the asset.
 * @param {!string} accessToken Samsara API access token.
 * @param {!number} assetId ID of the asset
 * @param {!number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
 * @param {!number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.Object>>}
 */
API.Client.AssetsApi.prototype.getAssetLocation = function(accessToken, assetId, startMs, endMs, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/fleet/assets/{asset_id}/locations'
      .replace('{' + 'asset_id' + '}', String(assetId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'accessToken' is set
  if (!accessToken) {
    throw new Error('Missing required parameter accessToken when calling getAssetLocation');
  }
  // verify required parameter 'assetId' is set
  if (!assetId) {
    throw new Error('Missing required parameter assetId when calling getAssetLocation');
  }
  // verify required parameter 'startMs' is set
  if (!startMs) {
    throw new Error('Missing required parameter startMs when calling getAssetLocation');
  }
  // verify required parameter 'endMs' is set
  if (!endMs) {
    throw new Error('Missing required parameter endMs when calling getAssetLocation');
  }
  if (accessToken !== undefined) {
    queryParameters['access_token'] = accessToken;
  }

  if (startMs !== undefined) {
    queryParameters['startMs'] = startMs;
  }

  if (endMs !== undefined) {
    queryParameters['endMs'] = endMs;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * /fleet/assets/{assetId:[0-9]+}/reefer
 * Fetch the reefer-specific stats of an asset.
 * @param {!string} accessToken Samsara API access token.
 * @param {!number} assetId ID of the asset
 * @param {!number} startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
 * @param {!number} endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.AssetReeferResponse>}
 */
API.Client.AssetsApi.prototype.getAssetReefer = function(accessToken, assetId, startMs, endMs, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/fleet/assets/{asset_id}/reefer'
      .replace('{' + 'asset_id' + '}', String(assetId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'accessToken' is set
  if (!accessToken) {
    throw new Error('Missing required parameter accessToken when calling getAssetReefer');
  }
  // verify required parameter 'assetId' is set
  if (!assetId) {
    throw new Error('Missing required parameter assetId when calling getAssetReefer');
  }
  // verify required parameter 'startMs' is set
  if (!startMs) {
    throw new Error('Missing required parameter startMs when calling getAssetReefer');
  }
  // verify required parameter 'endMs' is set
  if (!endMs) {
    throw new Error('Missing required parameter endMs when calling getAssetReefer');
  }
  if (accessToken !== undefined) {
    queryParameters['access_token'] = accessToken;
  }

  if (startMs !== undefined) {
    queryParameters['startMs'] = startMs;
  }

  if (endMs !== undefined) {
    queryParameters['endMs'] = endMs;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}
