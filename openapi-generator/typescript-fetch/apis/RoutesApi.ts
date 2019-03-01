// tslint:disable
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


import * as runtime from '../runtime';
import {
    AllRouteJobUpdates,
    AllRouteJobUpdatesFromJSON,
    AllRouteJobUpdatesToJSON,
    DispatchRoute,
    DispatchRouteFromJSON,
    DispatchRouteToJSON,
    DispatchRouteCreate,
    DispatchRouteCreateFromJSON,
    DispatchRouteCreateToJSON,
    DispatchRouteHistory,
    DispatchRouteHistoryFromJSON,
    DispatchRouteHistoryToJSON,
} from '../models';

export interface CreateDispatchRouteRequest {
    accessToken: string;
    createDispatchRouteParams: DispatchRouteCreate;
}

export interface CreateDriverDispatchRouteRequest {
    accessToken: string;
    driverId: number;
    createDispatchRouteParams: DispatchRouteCreate;
}

export interface CreateVehicleDispatchRouteRequest {
    accessToken: string;
    vehicleId: number;
    createDispatchRouteParams: DispatchRouteCreate;
}

export interface DeleteDispatchRouteByIdRequest {
    accessToken: string;
    routeId: number;
}

export interface FetchAllDispatchRoutesRequest {
    accessToken: string;
    groupId?: number;
    endTime?: number;
    duration?: number;
}

export interface FetchAllRouteJobUpdatesRequest {
    accessToken: string;
    groupId?: number;
    sequenceId?: string;
    include?: string;
}

export interface GetDispatchRouteByIdRequest {
    accessToken: string;
    routeId: number;
}

export interface GetDispatchRouteHistoryRequest {
    accessToken: string;
    routeId: number;
    startTime?: number;
    endTime?: number;
}

export interface GetDispatchRoutesByDriverIdRequest {
    accessToken: string;
    driverId: number;
    endTime?: number;
    duration?: number;
}

export interface GetDispatchRoutesByVehicleIdRequest {
    accessToken: string;
    vehicleId: number;
    endTime?: number;
    duration?: number;
}

export interface UpdateDispatchRouteByIdRequest {
    accessToken: string;
    routeId: number;
    updateDispatchRouteParams: DispatchRoute;
}

/**
 * no description
 */
export class RoutesApi extends runtime.BaseAPI {

    /**
     * Create a new dispatch route.
     * /fleet/dispatch/routes
     */
    async createDispatchRouteRaw(requestParameters: CreateDispatchRouteRequest): Promise<runtime.ApiResponse<DispatchRoute>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling createDispatchRoute.');
        }

        if (requestParameters.createDispatchRouteParams === null || requestParameters.createDispatchRouteParams === undefined) {
            throw new runtime.RequiredError('createDispatchRouteParams','Required parameter requestParameters.createDispatchRouteParams was null or undefined when calling createDispatchRoute.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/dispatch/routes`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: DispatchRouteCreateToJSON(requestParameters.createDispatchRouteParams),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DispatchRouteFromJSON(jsonValue));
    }

    /**
     * Create a new dispatch route.
     * /fleet/dispatch/routes
     */
    async createDispatchRoute(requestParameters: CreateDispatchRouteRequest): Promise<DispatchRoute> {
        const response = await this.createDispatchRouteRaw(requestParameters);
        return await response.value();
    }

    /**
     * Create a new dispatch route for the driver with driver_id.
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     */
    async createDriverDispatchRouteRaw(requestParameters: CreateDriverDispatchRouteRequest): Promise<runtime.ApiResponse<DispatchRoute>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling createDriverDispatchRoute.');
        }

        if (requestParameters.driverId === null || requestParameters.driverId === undefined) {
            throw new runtime.RequiredError('driverId','Required parameter requestParameters.driverId was null or undefined when calling createDriverDispatchRoute.');
        }

        if (requestParameters.createDispatchRouteParams === null || requestParameters.createDispatchRouteParams === undefined) {
            throw new runtime.RequiredError('createDispatchRouteParams','Required parameter requestParameters.createDispatchRouteParams was null or undefined when calling createDriverDispatchRoute.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/drivers/{driver_id}/dispatch/routes`.replace(`{${"driver_id"}}`, encodeURIComponent(String(requestParameters.driverId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: DispatchRouteCreateToJSON(requestParameters.createDispatchRouteParams),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DispatchRouteFromJSON(jsonValue));
    }

    /**
     * Create a new dispatch route for the driver with driver_id.
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     */
    async createDriverDispatchRoute(requestParameters: CreateDriverDispatchRouteRequest): Promise<DispatchRoute> {
        const response = await this.createDriverDispatchRouteRaw(requestParameters);
        return await response.value();
    }

    /**
     * Create a new dispatch route for the vehicle with vehicle_id.
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     */
    async createVehicleDispatchRouteRaw(requestParameters: CreateVehicleDispatchRouteRequest): Promise<runtime.ApiResponse<DispatchRoute>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling createVehicleDispatchRoute.');
        }

        if (requestParameters.vehicleId === null || requestParameters.vehicleId === undefined) {
            throw new runtime.RequiredError('vehicleId','Required parameter requestParameters.vehicleId was null or undefined when calling createVehicleDispatchRoute.');
        }

        if (requestParameters.createDispatchRouteParams === null || requestParameters.createDispatchRouteParams === undefined) {
            throw new runtime.RequiredError('createDispatchRouteParams','Required parameter requestParameters.createDispatchRouteParams was null or undefined when calling createVehicleDispatchRoute.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/vehicles/{vehicle_id}/dispatch/routes`.replace(`{${"vehicle_id"}}`, encodeURIComponent(String(requestParameters.vehicleId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: DispatchRouteCreateToJSON(requestParameters.createDispatchRouteParams),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DispatchRouteFromJSON(jsonValue));
    }

    /**
     * Create a new dispatch route for the vehicle with vehicle_id.
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     */
    async createVehicleDispatchRoute(requestParameters: CreateVehicleDispatchRouteRequest): Promise<DispatchRoute> {
        const response = await this.createVehicleDispatchRouteRaw(requestParameters);
        return await response.value();
    }

    /**
     * Delete a dispatch route and its associated jobs.
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     */
    async deleteDispatchRouteByIdRaw(requestParameters: DeleteDispatchRouteByIdRequest): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling deleteDispatchRouteById.');
        }

        if (requestParameters.routeId === null || requestParameters.routeId === undefined) {
            throw new runtime.RequiredError('routeId','Required parameter requestParameters.routeId was null or undefined when calling deleteDispatchRouteById.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/dispatch/routes/{route_id}`.replace(`{${"route_id"}}`, encodeURIComponent(String(requestParameters.routeId))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Delete a dispatch route and its associated jobs.
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     */
    async deleteDispatchRouteById(requestParameters: DeleteDispatchRouteByIdRequest): Promise<void> {
        await this.deleteDispatchRouteByIdRaw(requestParameters);
    }

    /**
     * Fetch all of the dispatch routes for the group.
     * /fleet/dispatch/routes
     */
    async fetchAllDispatchRoutesRaw(requestParameters: FetchAllDispatchRoutesRequest): Promise<runtime.ApiResponse<Array<DispatchRoute>>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling fetchAllDispatchRoutes.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.groupId !== undefined) {
            queryParameters['group_id'] = requestParameters.groupId;
        }

        if (requestParameters.endTime !== undefined) {
            queryParameters['end_time'] = requestParameters.endTime;
        }

        if (requestParameters.duration !== undefined) {
            queryParameters['duration'] = requestParameters.duration;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/dispatch/routes`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(DispatchRouteFromJSON));
    }

    /**
     * Fetch all of the dispatch routes for the group.
     * /fleet/dispatch/routes
     */
    async fetchAllDispatchRoutes(requestParameters: FetchAllDispatchRoutesRequest): Promise<Array<DispatchRoute>> {
        const response = await this.fetchAllDispatchRoutesRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * /fleet/dispatch/routes/job_updates
     */
    async fetchAllRouteJobUpdatesRaw(requestParameters: FetchAllRouteJobUpdatesRequest): Promise<runtime.ApiResponse<AllRouteJobUpdates>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling fetchAllRouteJobUpdates.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.groupId !== undefined) {
            queryParameters['group_id'] = requestParameters.groupId;
        }

        if (requestParameters.sequenceId !== undefined) {
            queryParameters['sequence_id'] = requestParameters.sequenceId;
        }

        if (requestParameters.include !== undefined) {
            queryParameters['include'] = requestParameters.include;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/dispatch/routes/job_updates`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => AllRouteJobUpdatesFromJSON(jsonValue));
    }

    /**
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * /fleet/dispatch/routes/job_updates
     */
    async fetchAllRouteJobUpdates(requestParameters: FetchAllRouteJobUpdatesRequest): Promise<AllRouteJobUpdates> {
        const response = await this.fetchAllRouteJobUpdatesRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch a dispatch route by id.
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     */
    async getDispatchRouteByIdRaw(requestParameters: GetDispatchRouteByIdRequest): Promise<runtime.ApiResponse<DispatchRoute>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDispatchRouteById.');
        }

        if (requestParameters.routeId === null || requestParameters.routeId === undefined) {
            throw new runtime.RequiredError('routeId','Required parameter requestParameters.routeId was null or undefined when calling getDispatchRouteById.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/dispatch/routes/{route_id}`.replace(`{${"route_id"}}`, encodeURIComponent(String(requestParameters.routeId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DispatchRouteFromJSON(jsonValue));
    }

    /**
     * Fetch a dispatch route by id.
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     */
    async getDispatchRouteById(requestParameters: GetDispatchRouteByIdRequest): Promise<DispatchRoute> {
        const response = await this.getDispatchRouteByIdRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch the history of a dispatch route.
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     */
    async getDispatchRouteHistoryRaw(requestParameters: GetDispatchRouteHistoryRequest): Promise<runtime.ApiResponse<DispatchRouteHistory>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDispatchRouteHistory.');
        }

        if (requestParameters.routeId === null || requestParameters.routeId === undefined) {
            throw new runtime.RequiredError('routeId','Required parameter requestParameters.routeId was null or undefined when calling getDispatchRouteHistory.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.startTime !== undefined) {
            queryParameters['start_time'] = requestParameters.startTime;
        }

        if (requestParameters.endTime !== undefined) {
            queryParameters['end_time'] = requestParameters.endTime;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/dispatch/routes/{route_id}/history`.replace(`{${"route_id"}}`, encodeURIComponent(String(requestParameters.routeId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DispatchRouteHistoryFromJSON(jsonValue));
    }

    /**
     * Fetch the history of a dispatch route.
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     */
    async getDispatchRouteHistory(requestParameters: GetDispatchRouteHistoryRequest): Promise<DispatchRouteHistory> {
        const response = await this.getDispatchRouteHistoryRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch all of the dispatch routes for a given driver.
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     */
    async getDispatchRoutesByDriverIdRaw(requestParameters: GetDispatchRoutesByDriverIdRequest): Promise<runtime.ApiResponse<Array<DispatchRoute>>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDispatchRoutesByDriverId.');
        }

        if (requestParameters.driverId === null || requestParameters.driverId === undefined) {
            throw new runtime.RequiredError('driverId','Required parameter requestParameters.driverId was null or undefined when calling getDispatchRoutesByDriverId.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.endTime !== undefined) {
            queryParameters['end_time'] = requestParameters.endTime;
        }

        if (requestParameters.duration !== undefined) {
            queryParameters['duration'] = requestParameters.duration;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/drivers/{driver_id}/dispatch/routes`.replace(`{${"driver_id"}}`, encodeURIComponent(String(requestParameters.driverId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(DispatchRouteFromJSON));
    }

    /**
     * Fetch all of the dispatch routes for a given driver.
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     */
    async getDispatchRoutesByDriverId(requestParameters: GetDispatchRoutesByDriverIdRequest): Promise<Array<DispatchRoute>> {
        const response = await this.getDispatchRoutesByDriverIdRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch all of the dispatch routes for a given vehicle.
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     */
    async getDispatchRoutesByVehicleIdRaw(requestParameters: GetDispatchRoutesByVehicleIdRequest): Promise<runtime.ApiResponse<Array<DispatchRoute>>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDispatchRoutesByVehicleId.');
        }

        if (requestParameters.vehicleId === null || requestParameters.vehicleId === undefined) {
            throw new runtime.RequiredError('vehicleId','Required parameter requestParameters.vehicleId was null or undefined when calling getDispatchRoutesByVehicleId.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.endTime !== undefined) {
            queryParameters['end_time'] = requestParameters.endTime;
        }

        if (requestParameters.duration !== undefined) {
            queryParameters['duration'] = requestParameters.duration;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fleet/vehicles/{vehicle_id}/dispatch/routes`.replace(`{${"vehicle_id"}}`, encodeURIComponent(String(requestParameters.vehicleId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(DispatchRouteFromJSON));
    }

    /**
     * Fetch all of the dispatch routes for a given vehicle.
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     */
    async getDispatchRoutesByVehicleId(requestParameters: GetDispatchRoutesByVehicleIdRequest): Promise<Array<DispatchRoute>> {
        const response = await this.getDispatchRoutesByVehicleIdRaw(requestParameters);
        return await response.value();
    }

    /**
     * Update a dispatch route and its associated jobs.
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     */
    async updateDispatchRouteByIdRaw(requestParameters: UpdateDispatchRouteByIdRequest): Promise<runtime.ApiResponse<DispatchRoute>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling updateDispatchRouteById.');
        }

        if (requestParameters.routeId === null || requestParameters.routeId === undefined) {
            throw new runtime.RequiredError('routeId','Required parameter requestParameters.routeId was null or undefined when calling updateDispatchRouteById.');
        }

        if (requestParameters.updateDispatchRouteParams === null || requestParameters.updateDispatchRouteParams === undefined) {
            throw new runtime.RequiredError('updateDispatchRouteParams','Required parameter requestParameters.updateDispatchRouteParams was null or undefined when calling updateDispatchRouteById.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fleet/dispatch/routes/{route_id}`.replace(`{${"route_id"}}`, encodeURIComponent(String(requestParameters.routeId))),
            method: 'PUT',
            headers: headerParameters,
            query: queryParameters,
            body: DispatchRouteToJSON(requestParameters.updateDispatchRouteParams),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DispatchRouteFromJSON(jsonValue));
    }

    /**
     * Update a dispatch route and its associated jobs.
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     */
    async updateDispatchRouteById(requestParameters: UpdateDispatchRouteByIdRequest): Promise<DispatchRoute> {
        const response = await this.updateDispatchRouteByIdRaw(requestParameters);
        return await response.value();
    }

}
