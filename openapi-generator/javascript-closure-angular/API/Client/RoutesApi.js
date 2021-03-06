/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.RoutesApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  &#x60;&#x60;&#x60;curl https://api.samsara.com/&lt;version&gt;/&lt;endpoint&gt; &#x60;&#x60;&#x60;  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under &#x60;Settings-&gt;Organization-&gt;API Tokens&#x60;.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  &#x60;&#x60;&#x60;curl https://api.samsara.com/&lt;version&gt;/&lt;endpoint&gt;?access_token&#x3D;{access_token} &#x60;&#x60;&#x60;  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is &#x60;v1&#x60; and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 * Version: 1.0.0
 * Generated by: org.openapitools.codegen.languages.JavascriptClosureAngularClientCodegen
 */
goog.provide('API.Client.RoutesApi');

goog.require('API.Client.DispatchRoute');
goog.require('API.Client.DispatchRouteCreate');
goog.require('API.Client.DispatchRouteHistory');
goog.require('API.Client.allRouteJobUpdates');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.RoutesApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('RoutesApiBasePath') ?
                   /** @type {!string} */ ($injector.get('RoutesApiBasePath')) :
                   'https://api.samsara.com/v1';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('RoutesApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('RoutesApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.RoutesApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * /fleet/dispatch/routes
 * Create a new dispatch route.
 * @param {!string} accessToken Samsara API access token.
 * @param {!DispatchRouteCreate} createDispatchRouteParams 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.DispatchRoute>}
 */
API.Client.RoutesApi.prototype.createDispatchRoute = function(accessToken, createDispatchRouteParams, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/fleet/dispatch/routes';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'accessToken' is set
  if (!accessToken) {
    throw new Error('Missing required parameter accessToken when calling createDispatchRoute');
  }
  // verify required parameter 'createDispatchRouteParams' is set
  if (!createDispatchRouteParams) {
    throw new Error('Missing required parameter createDispatchRouteParams when calling createDispatchRoute');
  }
  if (accessToken !== undefined) {
    queryParameters['access_token'] = accessToken;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: createDispatchRouteParams,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
 * Create a new dispatch route for the driver with driver_id.
 * @param {!string} accessToken Samsara API access token.
 * @param {!number} driverId ID of the driver with the associated routes.
 * @param {!DispatchRouteCreate} createDispatchRouteParams 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.DispatchRoute>}
 */
API.Client.RoutesApi.prototype.createDriverDispatchRoute = function(accessToken, driverId, createDispatchRouteParams, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/fleet/drivers/{driver_id}/dispatch/routes'
      .replace('{' + 'driver_id' + '}', String(driverId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'accessToken' is set
  if (!accessToken) {
    throw new Error('Missing required parameter accessToken when calling createDriverDispatchRoute');
  }
  // verify required parameter 'driverId' is set
  if (!driverId) {
    throw new Error('Missing required parameter driverId when calling createDriverDispatchRoute');
  }
  // verify required parameter 'createDispatchRouteParams' is set
  if (!createDispatchRouteParams) {
    throw new Error('Missing required parameter createDispatchRouteParams when calling createDriverDispatchRoute');
  }
  if (accessToken !== undefined) {
    queryParameters['access_token'] = accessToken;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: createDispatchRouteParams,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
 * Create a new dispatch route for the vehicle with vehicle_id.
 * @param {!string} accessToken Samsara API access token.
 * @param {!number} vehicleId ID of the vehicle with the associated routes.
 * @param {!DispatchRouteCreate} createDispatchRouteParams 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.DispatchRoute>}
 */
API.Client.RoutesApi.prototype.createVehicleDispatchRoute = function(accessToken, vehicleId, createDispatchRouteParams, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/fleet/vehicles/{vehicle_id}/dispatch/routes'
      .replace('{' + 'vehicle_id' + '}', String(vehicleId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'accessToken' is set
  if (!accessToken) {
    throw new Error('Missing required parameter accessToken when calling createVehicleDispatchRoute');
  }
  // verify required parameter 'vehicleId' is set
  if (!vehicleId) {
    throw new Error('Missing required parameter vehicleId when calling createVehicleDispatchRoute');
  }
  // verify required parameter 'createDispatchRouteParams' is set
  if (!createDispatchRouteParams) {
    throw new Error('Missing required parameter createDispatchRouteParams when calling createVehicleDispatchRoute');
  }
  if (accessToken !== undefined) {
    queryParameters['access_token'] = accessToken;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: createDispatchRouteParams,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * /fleet/dispatch/routes/{route_id:[0-9]+}/
 * Delete a dispatch route and its associated jobs.
 * @param {!string} accessToken Samsara API access token.
 * @param {!number} routeId ID of the dispatch route.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.RoutesApi.prototype.deleteDispatchRouteById = function(accessToken, routeId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/fleet/dispatch/routes/{route_id}'
      .replace('{' + 'route_id' + '}', String(routeId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'accessToken' is set
  if (!accessToken) {
    throw new Error('Missing required parameter accessToken when calling deleteDispatchRouteById');
  }
  // verify required parameter 'routeId' is set
  if (!routeId) {
    throw new Error('Missing required parameter routeId when calling deleteDispatchRouteById');
  }
  if (accessToken !== undefined) {
    queryParameters['access_token'] = accessToken;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'DELETE',
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
 * /fleet/dispatch/routes
 * Fetch all of the dispatch routes for the group.
 * @param {!string} accessToken Samsara API access token.
 * @param {!number=} opt_groupId Optional group ID if the organization has multiple groups (uncommon).
 * @param {!number=} opt_endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
 * @param {!number=} opt_duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.DispatchRoute>>}
 */
API.Client.RoutesApi.prototype.fetchAllDispatchRoutes = function(accessToken, opt_groupId, opt_endTime, opt_duration, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/fleet/dispatch/routes';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'accessToken' is set
  if (!accessToken) {
    throw new Error('Missing required parameter accessToken when calling fetchAllDispatchRoutes');
  }
  if (accessToken !== undefined) {
    queryParameters['access_token'] = accessToken;
  }

  if (opt_groupId !== undefined) {
    queryParameters['group_id'] = opt_groupId;
  }

  if (opt_endTime !== undefined) {
    queryParameters['end_time'] = opt_endTime;
  }

  if (opt_duration !== undefined) {
    queryParameters['duration'] = opt_duration;
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
 * /fleet/dispatch/routes/job_updates
 * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
 * @param {!string} accessToken Samsara API access token.
 * @param {!number=} opt_groupId Optional group ID if the organization has multiple groups (uncommon).
 * @param {!string=} opt_sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
 * @param {!string=} opt_include Optionally set include&#x3D;route to include route object in response payload.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.allRouteJobUpdates>}
 */
API.Client.RoutesApi.prototype.fetchAllRouteJobUpdates = function(accessToken, opt_groupId, opt_sequenceId, opt_include, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/fleet/dispatch/routes/job_updates';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'accessToken' is set
  if (!accessToken) {
    throw new Error('Missing required parameter accessToken when calling fetchAllRouteJobUpdates');
  }
  if (accessToken !== undefined) {
    queryParameters['access_token'] = accessToken;
  }

  if (opt_groupId !== undefined) {
    queryParameters['group_id'] = opt_groupId;
  }

  if (opt_sequenceId !== undefined) {
    queryParameters['sequence_id'] = opt_sequenceId;
  }

  if (opt_include !== undefined) {
    queryParameters['include'] = opt_include;
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
 * /fleet/dispatch/routes/{route_id:[0-9]+}
 * Fetch a dispatch route by id.
 * @param {!string} accessToken Samsara API access token.
 * @param {!number} routeId ID of the dispatch route.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.DispatchRoute>}
 */
API.Client.RoutesApi.prototype.getDispatchRouteById = function(accessToken, routeId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/fleet/dispatch/routes/{route_id}'
      .replace('{' + 'route_id' + '}', String(routeId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'accessToken' is set
  if (!accessToken) {
    throw new Error('Missing required parameter accessToken when calling getDispatchRouteById');
  }
  // verify required parameter 'routeId' is set
  if (!routeId) {
    throw new Error('Missing required parameter routeId when calling getDispatchRouteById');
  }
  if (accessToken !== undefined) {
    queryParameters['access_token'] = accessToken;
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
 * /fleet/dispatch/routes/{route_id:[0-9]+}/history
 * Fetch the history of a dispatch route.
 * @param {!string} accessToken Samsara API access token.
 * @param {!number} routeId ID of the route with history.
 * @param {!number=} opt_startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
 * @param {!number=} opt_endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.DispatchRouteHistory>}
 */
API.Client.RoutesApi.prototype.getDispatchRouteHistory = function(accessToken, routeId, opt_startTime, opt_endTime, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/fleet/dispatch/routes/{route_id}/history'
      .replace('{' + 'route_id' + '}', String(routeId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'accessToken' is set
  if (!accessToken) {
    throw new Error('Missing required parameter accessToken when calling getDispatchRouteHistory');
  }
  // verify required parameter 'routeId' is set
  if (!routeId) {
    throw new Error('Missing required parameter routeId when calling getDispatchRouteHistory');
  }
  if (accessToken !== undefined) {
    queryParameters['access_token'] = accessToken;
  }

  if (opt_startTime !== undefined) {
    queryParameters['start_time'] = opt_startTime;
  }

  if (opt_endTime !== undefined) {
    queryParameters['end_time'] = opt_endTime;
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
 * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
 * Fetch all of the dispatch routes for a given driver.
 * @param {!string} accessToken Samsara API access token.
 * @param {!number} driverId ID of the driver with the associated routes.
 * @param {!number=} opt_endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
 * @param {!number=} opt_duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.DispatchRoute>>}
 */
API.Client.RoutesApi.prototype.getDispatchRoutesByDriverId = function(accessToken, driverId, opt_endTime, opt_duration, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/fleet/drivers/{driver_id}/dispatch/routes'
      .replace('{' + 'driver_id' + '}', String(driverId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'accessToken' is set
  if (!accessToken) {
    throw new Error('Missing required parameter accessToken when calling getDispatchRoutesByDriverId');
  }
  // verify required parameter 'driverId' is set
  if (!driverId) {
    throw new Error('Missing required parameter driverId when calling getDispatchRoutesByDriverId');
  }
  if (accessToken !== undefined) {
    queryParameters['access_token'] = accessToken;
  }

  if (opt_endTime !== undefined) {
    queryParameters['end_time'] = opt_endTime;
  }

  if (opt_duration !== undefined) {
    queryParameters['duration'] = opt_duration;
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
 * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
 * Fetch all of the dispatch routes for a given vehicle.
 * @param {!string} accessToken Samsara API access token.
 * @param {!number} vehicleId ID of the vehicle with the associated routes.
 * @param {!number=} opt_endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
 * @param {!number=} opt_duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.DispatchRoute>>}
 */
API.Client.RoutesApi.prototype.getDispatchRoutesByVehicleId = function(accessToken, vehicleId, opt_endTime, opt_duration, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/fleet/vehicles/{vehicle_id}/dispatch/routes'
      .replace('{' + 'vehicle_id' + '}', String(vehicleId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'accessToken' is set
  if (!accessToken) {
    throw new Error('Missing required parameter accessToken when calling getDispatchRoutesByVehicleId');
  }
  // verify required parameter 'vehicleId' is set
  if (!vehicleId) {
    throw new Error('Missing required parameter vehicleId when calling getDispatchRoutesByVehicleId');
  }
  if (accessToken !== undefined) {
    queryParameters['access_token'] = accessToken;
  }

  if (opt_endTime !== undefined) {
    queryParameters['end_time'] = opt_endTime;
  }

  if (opt_duration !== undefined) {
    queryParameters['duration'] = opt_duration;
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
 * /fleet/dispatch/routes/{route_id:[0-9]+}/
 * Update a dispatch route and its associated jobs.
 * @param {!string} accessToken Samsara API access token.
 * @param {!number} routeId ID of the dispatch route.
 * @param {!DispatchRoute} updateDispatchRouteParams 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.DispatchRoute>}
 */
API.Client.RoutesApi.prototype.updateDispatchRouteById = function(accessToken, routeId, updateDispatchRouteParams, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/fleet/dispatch/routes/{route_id}'
      .replace('{' + 'route_id' + '}', String(routeId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'accessToken' is set
  if (!accessToken) {
    throw new Error('Missing required parameter accessToken when calling updateDispatchRouteById');
  }
  // verify required parameter 'routeId' is set
  if (!routeId) {
    throw new Error('Missing required parameter routeId when calling updateDispatchRouteById');
  }
  // verify required parameter 'updateDispatchRouteParams' is set
  if (!updateDispatchRouteParams) {
    throw new Error('Missing required parameter updateDispatchRouteParams when calling updateDispatchRouteById');
  }
  if (accessToken !== undefined) {
    queryParameters['access_token'] = accessToken;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'PUT',
    url: path,
    json: true,
    data: updateDispatchRouteParams,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}
