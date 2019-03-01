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

import * as models from '../model/models';

/* tslint:disable:no-unused-variable member-ordering */

export class RoutesApi {
    protected basePath = 'https://api.samsara.com/v1';
    public defaultHeaders : any = {};

    static $inject: string[] = ['$http', '$httpParamSerializer', 'basePath'];

    constructor(protected $http: ng.IHttpService, protected $httpParamSerializer?: (d: any) => any, basePath?: string) {
        if (basePath !== undefined) {
            this.basePath = basePath;
        }
    }

    /**
     * Create a new dispatch route.
     * @summary /fleet/dispatch/routes
     * @param accessToken Samsara API access token.
     * @param createDispatchRouteParams 
     */
    public createDispatchRoute (accessToken: string, createDispatchRouteParams: models.models.DispatchRouteCreate, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.DispatchRoute> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes';

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createDispatchRoute.');
        }

        // verify required parameter 'createDispatchRouteParams' is not null or undefined
        if (createDispatchRouteParams === null || createDispatchRouteParams === undefined) {
            throw new Error('Required parameter createDispatchRouteParams was null or undefined when calling createDispatchRoute.');
        }

        if (accessToken !== undefined) {
            queryParameters['access_token'] = accessToken;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'POST',
            url: localVarPath,
            data: createDispatchRouteParams,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Create a new dispatch route for the driver with driver_id.
     * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * @param accessToken Samsara API access token.
     * @param driverId ID of the driver with the associated routes.
     * @param createDispatchRouteParams 
     */
    public createDriverDispatchRoute (accessToken: string, driverId: number, createDispatchRouteParams: models.models.DispatchRouteCreate, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.DispatchRoute> {
        const localVarPath = this.basePath + '/fleet/drivers/{driver_id}/dispatch/routes'
            .replace('{' + 'driver_id' + '}', encodeURIComponent(String(driverId)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createDriverDispatchRoute.');
        }

        // verify required parameter 'driverId' is not null or undefined
        if (driverId === null || driverId === undefined) {
            throw new Error('Required parameter driverId was null or undefined when calling createDriverDispatchRoute.');
        }

        // verify required parameter 'createDispatchRouteParams' is not null or undefined
        if (createDispatchRouteParams === null || createDispatchRouteParams === undefined) {
            throw new Error('Required parameter createDispatchRouteParams was null or undefined when calling createDriverDispatchRoute.');
        }

        if (accessToken !== undefined) {
            queryParameters['access_token'] = accessToken;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'POST',
            url: localVarPath,
            data: createDispatchRouteParams,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Create a new dispatch route for the vehicle with vehicle_id.
     * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * @param accessToken Samsara API access token.
     * @param vehicleId ID of the vehicle with the associated routes.
     * @param createDispatchRouteParams 
     */
    public createVehicleDispatchRoute (accessToken: string, vehicleId: number, createDispatchRouteParams: models.models.DispatchRouteCreate, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.DispatchRoute> {
        const localVarPath = this.basePath + '/fleet/vehicles/{vehicle_id}/dispatch/routes'
            .replace('{' + 'vehicle_id' + '}', encodeURIComponent(String(vehicleId)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createVehicleDispatchRoute.');
        }

        // verify required parameter 'vehicleId' is not null or undefined
        if (vehicleId === null || vehicleId === undefined) {
            throw new Error('Required parameter vehicleId was null or undefined when calling createVehicleDispatchRoute.');
        }

        // verify required parameter 'createDispatchRouteParams' is not null or undefined
        if (createDispatchRouteParams === null || createDispatchRouteParams === undefined) {
            throw new Error('Required parameter createDispatchRouteParams was null or undefined when calling createVehicleDispatchRoute.');
        }

        if (accessToken !== undefined) {
            queryParameters['access_token'] = accessToken;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'POST',
            url: localVarPath,
            data: createDispatchRouteParams,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Delete a dispatch route and its associated jobs.
     * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
     * @param accessToken Samsara API access token.
     * @param routeId ID of the dispatch route.
     */
    public deleteDispatchRouteById (accessToken: string, routeId: number, extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes/{route_id}'
            .replace('{' + 'route_id' + '}', encodeURIComponent(String(routeId)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling deleteDispatchRouteById.');
        }

        // verify required parameter 'routeId' is not null or undefined
        if (routeId === null || routeId === undefined) {
            throw new Error('Required parameter routeId was null or undefined when calling deleteDispatchRouteById.');
        }

        if (accessToken !== undefined) {
            queryParameters['access_token'] = accessToken;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'DELETE',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Fetch all of the dispatch routes for the group.
     * @summary /fleet/dispatch/routes
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     */
    public fetchAllDispatchRoutes (accessToken: string, groupId?: number, endTime?: number, duration?: number, extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<models.DispatchRoute>> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes';

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling fetchAllDispatchRoutes.');
        }

        if (accessToken !== undefined) {
            queryParameters['access_token'] = accessToken;
        }

        if (groupId !== undefined) {
            queryParameters['group_id'] = groupId;
        }

        if (endTime !== undefined) {
            queryParameters['end_time'] = endTime;
        }

        if (duration !== undefined) {
            queryParameters['duration'] = duration;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'GET',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * @summary /fleet/dispatch/routes/job_updates
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
     * @param include Optionally set include&#x3D;route to include route object in response payload.
     */
    public fetchAllRouteJobUpdates (accessToken: string, groupId?: number, sequenceId?: string, include?: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.AllRouteJobUpdates> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes/job_updates';

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling fetchAllRouteJobUpdates.');
        }

        if (accessToken !== undefined) {
            queryParameters['access_token'] = accessToken;
        }

        if (groupId !== undefined) {
            queryParameters['group_id'] = groupId;
        }

        if (sequenceId !== undefined) {
            queryParameters['sequence_id'] = sequenceId;
        }

        if (include !== undefined) {
            queryParameters['include'] = include;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'GET',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Fetch a dispatch route by id.
     * @summary /fleet/dispatch/routes/{route_id:[0-9]+}
     * @param accessToken Samsara API access token.
     * @param routeId ID of the dispatch route.
     */
    public getDispatchRouteById (accessToken: string, routeId: number, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.DispatchRoute> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes/{route_id}'
            .replace('{' + 'route_id' + '}', encodeURIComponent(String(routeId)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDispatchRouteById.');
        }

        // verify required parameter 'routeId' is not null or undefined
        if (routeId === null || routeId === undefined) {
            throw new Error('Required parameter routeId was null or undefined when calling getDispatchRouteById.');
        }

        if (accessToken !== undefined) {
            queryParameters['access_token'] = accessToken;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'GET',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Fetch the history of a dispatch route.
     * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/history
     * @param accessToken Samsara API access token.
     * @param routeId ID of the route with history.
     * @param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
     * @param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
     */
    public getDispatchRouteHistory (accessToken: string, routeId: number, startTime?: number, endTime?: number, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.DispatchRouteHistory> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes/{route_id}/history'
            .replace('{' + 'route_id' + '}', encodeURIComponent(String(routeId)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDispatchRouteHistory.');
        }

        // verify required parameter 'routeId' is not null or undefined
        if (routeId === null || routeId === undefined) {
            throw new Error('Required parameter routeId was null or undefined when calling getDispatchRouteHistory.');
        }

        if (accessToken !== undefined) {
            queryParameters['access_token'] = accessToken;
        }

        if (startTime !== undefined) {
            queryParameters['start_time'] = startTime;
        }

        if (endTime !== undefined) {
            queryParameters['end_time'] = endTime;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'GET',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Fetch all of the dispatch routes for a given driver.
     * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * @param accessToken Samsara API access token.
     * @param driverId ID of the driver with the associated routes.
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     */
    public getDispatchRoutesByDriverId (accessToken: string, driverId: number, endTime?: number, duration?: number, extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<models.DispatchRoute>> {
        const localVarPath = this.basePath + '/fleet/drivers/{driver_id}/dispatch/routes'
            .replace('{' + 'driver_id' + '}', encodeURIComponent(String(driverId)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDispatchRoutesByDriverId.');
        }

        // verify required parameter 'driverId' is not null or undefined
        if (driverId === null || driverId === undefined) {
            throw new Error('Required parameter driverId was null or undefined when calling getDispatchRoutesByDriverId.');
        }

        if (accessToken !== undefined) {
            queryParameters['access_token'] = accessToken;
        }

        if (endTime !== undefined) {
            queryParameters['end_time'] = endTime;
        }

        if (duration !== undefined) {
            queryParameters['duration'] = duration;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'GET',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Fetch all of the dispatch routes for a given vehicle.
     * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * @param accessToken Samsara API access token.
     * @param vehicleId ID of the vehicle with the associated routes.
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     */
    public getDispatchRoutesByVehicleId (accessToken: string, vehicleId: number, endTime?: number, duration?: number, extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<models.DispatchRoute>> {
        const localVarPath = this.basePath + '/fleet/vehicles/{vehicle_id}/dispatch/routes'
            .replace('{' + 'vehicle_id' + '}', encodeURIComponent(String(vehicleId)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDispatchRoutesByVehicleId.');
        }

        // verify required parameter 'vehicleId' is not null or undefined
        if (vehicleId === null || vehicleId === undefined) {
            throw new Error('Required parameter vehicleId was null or undefined when calling getDispatchRoutesByVehicleId.');
        }

        if (accessToken !== undefined) {
            queryParameters['access_token'] = accessToken;
        }

        if (endTime !== undefined) {
            queryParameters['end_time'] = endTime;
        }

        if (duration !== undefined) {
            queryParameters['duration'] = duration;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'GET',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Update a dispatch route and its associated jobs.
     * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
     * @param accessToken Samsara API access token.
     * @param routeId ID of the dispatch route.
     * @param updateDispatchRouteParams 
     */
    public updateDispatchRouteById (accessToken: string, routeId: number, updateDispatchRouteParams: models.models.DispatchRoute, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.DispatchRoute> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes/{route_id}'
            .replace('{' + 'route_id' + '}', encodeURIComponent(String(routeId)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling updateDispatchRouteById.');
        }

        // verify required parameter 'routeId' is not null or undefined
        if (routeId === null || routeId === undefined) {
            throw new Error('Required parameter routeId was null or undefined when calling updateDispatchRouteById.');
        }

        // verify required parameter 'updateDispatchRouteParams' is not null or undefined
        if (updateDispatchRouteParams === null || updateDispatchRouteParams === undefined) {
            throw new Error('Required parameter updateDispatchRouteParams was null or undefined when calling updateDispatchRouteById.');
        }

        if (accessToken !== undefined) {
            queryParameters['access_token'] = accessToken;
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'PUT',
            url: localVarPath,
            data: updateDispatchRouteParams,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
}
