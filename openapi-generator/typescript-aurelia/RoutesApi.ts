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
 */

import { autoinject } from 'aurelia-framework';
import { HttpClient } from 'aurelia-http-client';
import { Api } from './Api';
import { AuthStorage } from './AuthStorage';
import {
  AllRouteJobUpdates,
  DispatchRouteCreate,
  DispatchRoute,
  DispatchRouteHistory,
} from './models';

/**
 * createDispatchRoute - parameters interface
 */
export interface ICreateDispatchRouteParams {
  accessToken: string;
  createDispatchRouteParams: DispatchRouteCreate;
}

/**
 * createDriverDispatchRoute - parameters interface
 */
export interface ICreateDriverDispatchRouteParams {
  accessToken: string;
  driverId: number;
  createDispatchRouteParams: DispatchRouteCreate;
}

/**
 * createVehicleDispatchRoute - parameters interface
 */
export interface ICreateVehicleDispatchRouteParams {
  accessToken: string;
  vehicleId: number;
  createDispatchRouteParams: DispatchRouteCreate;
}

/**
 * deleteDispatchRouteById - parameters interface
 */
export interface IDeleteDispatchRouteByIdParams {
  accessToken: string;
  routeId: number;
}

/**
 * fetchAllDispatchRoutes - parameters interface
 */
export interface IFetchAllDispatchRoutesParams {
  accessToken: string;
  groupId?: number;
  endTime?: number;
  duration?: number;
}

/**
 * fetchAllRouteJobUpdates - parameters interface
 */
export interface IFetchAllRouteJobUpdatesParams {
  accessToken: string;
  groupId?: number;
  sequenceId?: string;
  include?: string;
}

/**
 * getDispatchRouteById - parameters interface
 */
export interface IGetDispatchRouteByIdParams {
  accessToken: string;
  routeId: number;
}

/**
 * getDispatchRouteHistory - parameters interface
 */
export interface IGetDispatchRouteHistoryParams {
  accessToken: string;
  routeId: number;
  startTime?: number;
  endTime?: number;
}

/**
 * getDispatchRoutesByDriverId - parameters interface
 */
export interface IGetDispatchRoutesByDriverIdParams {
  accessToken: string;
  driverId: number;
  endTime?: number;
  duration?: number;
}

/**
 * getDispatchRoutesByVehicleId - parameters interface
 */
export interface IGetDispatchRoutesByVehicleIdParams {
  accessToken: string;
  vehicleId: number;
  endTime?: number;
  duration?: number;
}

/**
 * updateDispatchRouteById - parameters interface
 */
export interface IUpdateDispatchRouteByIdParams {
  accessToken: string;
  routeId: number;
  updateDispatchRouteParams: DispatchRoute;
}

/**
 * RoutesApi - API class
 */
@autoinject()
export class RoutesApi extends Api {

  /**
   * Creates a new RoutesApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * /fleet/dispatch/routes
   * Create a new dispatch route.
   * @param params.accessToken Samsara API access token.
   * @param params.createDispatchRouteParams 
   */
  async createDispatchRoute(params: ICreateDispatchRouteParams): Promise<DispatchRoute> {
    // Verify required parameters are set
    this.ensureParamIsSet('createDispatchRoute', params, 'accessToken');
    this.ensureParamIsSet('createDispatchRoute', params, 'createDispatchRouteParams');

    // Create URL to call
    const url = `${this.basePath}/fleet/dispatch/routes`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['createDispatchRouteParams'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
   * Create a new dispatch route for the driver with driver_id.
   * @param params.accessToken Samsara API access token.
   * @param params.driverId ID of the driver with the associated routes.
   * @param params.createDispatchRouteParams 
   */
  async createDriverDispatchRoute(params: ICreateDriverDispatchRouteParams): Promise<DispatchRoute> {
    // Verify required parameters are set
    this.ensureParamIsSet('createDriverDispatchRoute', params, 'accessToken');
    this.ensureParamIsSet('createDriverDispatchRoute', params, 'driverId');
    this.ensureParamIsSet('createDriverDispatchRoute', params, 'createDispatchRouteParams');

    // Create URL to call
    const url = `${this.basePath}/fleet/drivers/{driver_id}/dispatch/routes`
      .replace(`{${'driver_id'}}`, encodeURIComponent(`${params['driverId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['createDispatchRouteParams'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
   * Create a new dispatch route for the vehicle with vehicle_id.
   * @param params.accessToken Samsara API access token.
   * @param params.vehicleId ID of the vehicle with the associated routes.
   * @param params.createDispatchRouteParams 
   */
  async createVehicleDispatchRoute(params: ICreateVehicleDispatchRouteParams): Promise<DispatchRoute> {
    // Verify required parameters are set
    this.ensureParamIsSet('createVehicleDispatchRoute', params, 'accessToken');
    this.ensureParamIsSet('createVehicleDispatchRoute', params, 'vehicleId');
    this.ensureParamIsSet('createVehicleDispatchRoute', params, 'createDispatchRouteParams');

    // Create URL to call
    const url = `${this.basePath}/fleet/vehicles/{vehicle_id}/dispatch/routes`
      .replace(`{${'vehicle_id'}}`, encodeURIComponent(`${params['vehicleId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['createDispatchRouteParams'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/dispatch/routes/{route_id:[0-9]+}/
   * Delete a dispatch route and its associated jobs.
   * @param params.accessToken Samsara API access token.
   * @param params.routeId ID of the dispatch route.
   */
  async deleteDispatchRouteById(params: IDeleteDispatchRouteByIdParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('deleteDispatchRouteById', params, 'accessToken');
    this.ensureParamIsSet('deleteDispatchRouteById', params, 'routeId');

    // Create URL to call
    const url = `${this.basePath}/fleet/dispatch/routes/{route_id}`
      .replace(`{${'route_id'}}`, encodeURIComponent(`${params['routeId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asDelete()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/dispatch/routes
   * Fetch all of the dispatch routes for the group.
   * @param params.accessToken Samsara API access token.
   * @param params.groupId Optional group ID if the organization has multiple groups (uncommon).
   * @param params.endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
   * @param params.duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
   */
  async fetchAllDispatchRoutes(params: IFetchAllDispatchRoutesParams): Promise<Array<DispatchRoute>> {
    // Verify required parameters are set
    this.ensureParamIsSet('fetchAllDispatchRoutes', params, 'accessToken');

    // Create URL to call
    const url = `${this.basePath}/fleet/dispatch/routes`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'group_id': params['groupId'],
        'end_time': params['endTime'],
        'duration': params['duration'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/dispatch/routes/job_updates
   * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
   * @param params.accessToken Samsara API access token.
   * @param params.groupId Optional group ID if the organization has multiple groups (uncommon).
   * @param params.sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
   * @param params.include Optionally set include&#x3D;route to include route object in response payload.
   */
  async fetchAllRouteJobUpdates(params: IFetchAllRouteJobUpdatesParams): Promise<AllRouteJobUpdates> {
    // Verify required parameters are set
    this.ensureParamIsSet('fetchAllRouteJobUpdates', params, 'accessToken');

    // Create URL to call
    const url = `${this.basePath}/fleet/dispatch/routes/job_updates`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'group_id': params['groupId'],
        'sequence_id': params['sequenceId'],
        'include': params['include'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/dispatch/routes/{route_id:[0-9]+}
   * Fetch a dispatch route by id.
   * @param params.accessToken Samsara API access token.
   * @param params.routeId ID of the dispatch route.
   */
  async getDispatchRouteById(params: IGetDispatchRouteByIdParams): Promise<DispatchRoute> {
    // Verify required parameters are set
    this.ensureParamIsSet('getDispatchRouteById', params, 'accessToken');
    this.ensureParamIsSet('getDispatchRouteById', params, 'routeId');

    // Create URL to call
    const url = `${this.basePath}/fleet/dispatch/routes/{route_id}`
      .replace(`{${'route_id'}}`, encodeURIComponent(`${params['routeId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/dispatch/routes/{route_id:[0-9]+}/history
   * Fetch the history of a dispatch route.
   * @param params.accessToken Samsara API access token.
   * @param params.routeId ID of the route with history.
   * @param params.startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
   * @param params.endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
   */
  async getDispatchRouteHistory(params: IGetDispatchRouteHistoryParams): Promise<DispatchRouteHistory> {
    // Verify required parameters are set
    this.ensureParamIsSet('getDispatchRouteHistory', params, 'accessToken');
    this.ensureParamIsSet('getDispatchRouteHistory', params, 'routeId');

    // Create URL to call
    const url = `${this.basePath}/fleet/dispatch/routes/{route_id}/history`
      .replace(`{${'route_id'}}`, encodeURIComponent(`${params['routeId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'start_time': params['startTime'],
        'end_time': params['endTime'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
   * Fetch all of the dispatch routes for a given driver.
   * @param params.accessToken Samsara API access token.
   * @param params.driverId ID of the driver with the associated routes.
   * @param params.endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
   * @param params.duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
   */
  async getDispatchRoutesByDriverId(params: IGetDispatchRoutesByDriverIdParams): Promise<Array<DispatchRoute>> {
    // Verify required parameters are set
    this.ensureParamIsSet('getDispatchRoutesByDriverId', params, 'accessToken');
    this.ensureParamIsSet('getDispatchRoutesByDriverId', params, 'driverId');

    // Create URL to call
    const url = `${this.basePath}/fleet/drivers/{driver_id}/dispatch/routes`
      .replace(`{${'driver_id'}}`, encodeURIComponent(`${params['driverId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'end_time': params['endTime'],
        'duration': params['duration'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
   * Fetch all of the dispatch routes for a given vehicle.
   * @param params.accessToken Samsara API access token.
   * @param params.vehicleId ID of the vehicle with the associated routes.
   * @param params.endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
   * @param params.duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
   */
  async getDispatchRoutesByVehicleId(params: IGetDispatchRoutesByVehicleIdParams): Promise<Array<DispatchRoute>> {
    // Verify required parameters are set
    this.ensureParamIsSet('getDispatchRoutesByVehicleId', params, 'accessToken');
    this.ensureParamIsSet('getDispatchRoutesByVehicleId', params, 'vehicleId');

    // Create URL to call
    const url = `${this.basePath}/fleet/vehicles/{vehicle_id}/dispatch/routes`
      .replace(`{${'vehicle_id'}}`, encodeURIComponent(`${params['vehicleId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'end_time': params['endTime'],
        'duration': params['duration'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /fleet/dispatch/routes/{route_id:[0-9]+}/
   * Update a dispatch route and its associated jobs.
   * @param params.accessToken Samsara API access token.
   * @param params.routeId ID of the dispatch route.
   * @param params.updateDispatchRouteParams 
   */
  async updateDispatchRouteById(params: IUpdateDispatchRouteByIdParams): Promise<DispatchRoute> {
    // Verify required parameters are set
    this.ensureParamIsSet('updateDispatchRouteById', params, 'accessToken');
    this.ensureParamIsSet('updateDispatchRouteById', params, 'routeId');
    this.ensureParamIsSet('updateDispatchRouteById', params, 'updateDispatchRouteParams');

    // Create URL to call
    const url = `${this.basePath}/fleet/dispatch/routes/{route_id}`
      .replace(`{${'route_id'}}`, encodeURIComponent(`${params['routeId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPut()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['updateDispatchRouteParams'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

}

