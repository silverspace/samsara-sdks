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

import { Observable } from 'rxjs';
import { BaseAPI, RequiredError, HttpHeaders, HttpQuery, COLLECTION_FORMATS } from '../runtime';
import {
    AllRouteJobUpdates,
    DispatchRoute,
    DispatchRouteCreate,
    DispatchRouteHistory,
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
export class RoutesApi extends BaseAPI {

    /**
     * Create a new dispatch route.
     * /fleet/dispatch/routes
     */
    createDispatchRouteRaw(requestParameters: CreateDispatchRouteRequest): Observable<DispatchRoute> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling createDispatchRoute.');
        }

        if (requestParameters.createDispatchRouteParams === null || requestParameters.createDispatchRouteParams === undefined) {
            throw new RequiredError('createDispatchRouteParams','Required parameter requestParameters.createDispatchRouteParams was null or undefined when calling createDispatchRoute.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<DispatchRoute>({
            path: `/fleet/dispatch/routes`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.createDispatchRouteParams,
        });
    }

    /**
     * Create a new dispatch route.
     * /fleet/dispatch/routes
     */
    createDispatchRoute(requestParameters: CreateDispatchRouteRequest): Observable<DispatchRoute> {
        return this.createDispatchRouteRaw(requestParameters);
    }

    /**
     * Create a new dispatch route for the driver with driver_id.
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     */
    createDriverDispatchRouteRaw(requestParameters: CreateDriverDispatchRouteRequest): Observable<DispatchRoute> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling createDriverDispatchRoute.');
        }

        if (requestParameters.driverId === null || requestParameters.driverId === undefined) {
            throw new RequiredError('driverId','Required parameter requestParameters.driverId was null or undefined when calling createDriverDispatchRoute.');
        }

        if (requestParameters.createDispatchRouteParams === null || requestParameters.createDispatchRouteParams === undefined) {
            throw new RequiredError('createDispatchRouteParams','Required parameter requestParameters.createDispatchRouteParams was null or undefined when calling createDriverDispatchRoute.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<DispatchRoute>({
            path: `/fleet/drivers/{driver_id}/dispatch/routes`.replace(`{${"driver_id"}}`, encodeURIComponent(String(requestParameters.driverId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.createDispatchRouteParams,
        });
    }

    /**
     * Create a new dispatch route for the driver with driver_id.
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     */
    createDriverDispatchRoute(requestParameters: CreateDriverDispatchRouteRequest): Observable<DispatchRoute> {
        return this.createDriverDispatchRouteRaw(requestParameters);
    }

    /**
     * Create a new dispatch route for the vehicle with vehicle_id.
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     */
    createVehicleDispatchRouteRaw(requestParameters: CreateVehicleDispatchRouteRequest): Observable<DispatchRoute> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling createVehicleDispatchRoute.');
        }

        if (requestParameters.vehicleId === null || requestParameters.vehicleId === undefined) {
            throw new RequiredError('vehicleId','Required parameter requestParameters.vehicleId was null or undefined when calling createVehicleDispatchRoute.');
        }

        if (requestParameters.createDispatchRouteParams === null || requestParameters.createDispatchRouteParams === undefined) {
            throw new RequiredError('createDispatchRouteParams','Required parameter requestParameters.createDispatchRouteParams was null or undefined when calling createVehicleDispatchRoute.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<DispatchRoute>({
            path: `/fleet/vehicles/{vehicle_id}/dispatch/routes`.replace(`{${"vehicle_id"}}`, encodeURIComponent(String(requestParameters.vehicleId))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.createDispatchRouteParams,
        });
    }

    /**
     * Create a new dispatch route for the vehicle with vehicle_id.
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     */
    createVehicleDispatchRoute(requestParameters: CreateVehicleDispatchRouteRequest): Observable<DispatchRoute> {
        return this.createVehicleDispatchRouteRaw(requestParameters);
    }

    /**
     * Delete a dispatch route and its associated jobs.
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     */
    deleteDispatchRouteByIdRaw(requestParameters: DeleteDispatchRouteByIdRequest): Observable<void> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling deleteDispatchRouteById.');
        }

        if (requestParameters.routeId === null || requestParameters.routeId === undefined) {
            throw new RequiredError('routeId','Required parameter requestParameters.routeId was null or undefined when calling deleteDispatchRouteById.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<void>({
            path: `/fleet/dispatch/routes/{route_id}`.replace(`{${"route_id"}}`, encodeURIComponent(String(requestParameters.routeId))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Delete a dispatch route and its associated jobs.
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     */
    deleteDispatchRouteById(requestParameters: DeleteDispatchRouteByIdRequest): Observable<void> {
        return this.deleteDispatchRouteByIdRaw(requestParameters);
    }

    /**
     * Fetch all of the dispatch routes for the group.
     * /fleet/dispatch/routes
     */
    fetchAllDispatchRoutesRaw(requestParameters: FetchAllDispatchRoutesRequest): Observable<Array<DispatchRoute>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling fetchAllDispatchRoutes.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.groupId !== undefined && requestParameters.groupId !== null) {
            queryParameters['group_id'] = requestParameters.groupId;
        }

        if (requestParameters.endTime !== undefined && requestParameters.endTime !== null) {
            queryParameters['end_time'] = requestParameters.endTime;
        }

        if (requestParameters.duration !== undefined && requestParameters.duration !== null) {
            queryParameters['duration'] = requestParameters.duration;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<Array<DispatchRoute>>({
            path: `/fleet/dispatch/routes`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch all of the dispatch routes for the group.
     * /fleet/dispatch/routes
     */
    fetchAllDispatchRoutes(requestParameters: FetchAllDispatchRoutesRequest): Observable<Array<DispatchRoute>> {
        return this.fetchAllDispatchRoutesRaw(requestParameters);
    }

    /**
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * /fleet/dispatch/routes/job_updates
     */
    fetchAllRouteJobUpdatesRaw(requestParameters: FetchAllRouteJobUpdatesRequest): Observable<AllRouteJobUpdates> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling fetchAllRouteJobUpdates.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.groupId !== undefined && requestParameters.groupId !== null) {
            queryParameters['group_id'] = requestParameters.groupId;
        }

        if (requestParameters.sequenceId !== undefined && requestParameters.sequenceId !== null) {
            queryParameters['sequence_id'] = requestParameters.sequenceId;
        }

        if (requestParameters.include !== undefined && requestParameters.include !== null) {
            queryParameters['include'] = requestParameters.include;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<AllRouteJobUpdates>({
            path: `/fleet/dispatch/routes/job_updates`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * /fleet/dispatch/routes/job_updates
     */
    fetchAllRouteJobUpdates(requestParameters: FetchAllRouteJobUpdatesRequest): Observable<AllRouteJobUpdates> {
        return this.fetchAllRouteJobUpdatesRaw(requestParameters);
    }

    /**
     * Fetch a dispatch route by id.
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     */
    getDispatchRouteByIdRaw(requestParameters: GetDispatchRouteByIdRequest): Observable<DispatchRoute> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDispatchRouteById.');
        }

        if (requestParameters.routeId === null || requestParameters.routeId === undefined) {
            throw new RequiredError('routeId','Required parameter requestParameters.routeId was null or undefined when calling getDispatchRouteById.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<DispatchRoute>({
            path: `/fleet/dispatch/routes/{route_id}`.replace(`{${"route_id"}}`, encodeURIComponent(String(requestParameters.routeId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch a dispatch route by id.
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     */
    getDispatchRouteById(requestParameters: GetDispatchRouteByIdRequest): Observable<DispatchRoute> {
        return this.getDispatchRouteByIdRaw(requestParameters);
    }

    /**
     * Fetch the history of a dispatch route.
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     */
    getDispatchRouteHistoryRaw(requestParameters: GetDispatchRouteHistoryRequest): Observable<DispatchRouteHistory> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDispatchRouteHistory.');
        }

        if (requestParameters.routeId === null || requestParameters.routeId === undefined) {
            throw new RequiredError('routeId','Required parameter requestParameters.routeId was null or undefined when calling getDispatchRouteHistory.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.startTime !== undefined && requestParameters.startTime !== null) {
            queryParameters['start_time'] = requestParameters.startTime;
        }

        if (requestParameters.endTime !== undefined && requestParameters.endTime !== null) {
            queryParameters['end_time'] = requestParameters.endTime;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<DispatchRouteHistory>({
            path: `/fleet/dispatch/routes/{route_id}/history`.replace(`{${"route_id"}}`, encodeURIComponent(String(requestParameters.routeId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch the history of a dispatch route.
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     */
    getDispatchRouteHistory(requestParameters: GetDispatchRouteHistoryRequest): Observable<DispatchRouteHistory> {
        return this.getDispatchRouteHistoryRaw(requestParameters);
    }

    /**
     * Fetch all of the dispatch routes for a given driver.
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     */
    getDispatchRoutesByDriverIdRaw(requestParameters: GetDispatchRoutesByDriverIdRequest): Observable<Array<DispatchRoute>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDispatchRoutesByDriverId.');
        }

        if (requestParameters.driverId === null || requestParameters.driverId === undefined) {
            throw new RequiredError('driverId','Required parameter requestParameters.driverId was null or undefined when calling getDispatchRoutesByDriverId.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.endTime !== undefined && requestParameters.endTime !== null) {
            queryParameters['end_time'] = requestParameters.endTime;
        }

        if (requestParameters.duration !== undefined && requestParameters.duration !== null) {
            queryParameters['duration'] = requestParameters.duration;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<Array<DispatchRoute>>({
            path: `/fleet/drivers/{driver_id}/dispatch/routes`.replace(`{${"driver_id"}}`, encodeURIComponent(String(requestParameters.driverId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch all of the dispatch routes for a given driver.
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     */
    getDispatchRoutesByDriverId(requestParameters: GetDispatchRoutesByDriverIdRequest): Observable<Array<DispatchRoute>> {
        return this.getDispatchRoutesByDriverIdRaw(requestParameters);
    }

    /**
     * Fetch all of the dispatch routes for a given vehicle.
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     */
    getDispatchRoutesByVehicleIdRaw(requestParameters: GetDispatchRoutesByVehicleIdRequest): Observable<Array<DispatchRoute>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDispatchRoutesByVehicleId.');
        }

        if (requestParameters.vehicleId === null || requestParameters.vehicleId === undefined) {
            throw new RequiredError('vehicleId','Required parameter requestParameters.vehicleId was null or undefined when calling getDispatchRoutesByVehicleId.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.endTime !== undefined && requestParameters.endTime !== null) {
            queryParameters['end_time'] = requestParameters.endTime;
        }

        if (requestParameters.duration !== undefined && requestParameters.duration !== null) {
            queryParameters['duration'] = requestParameters.duration;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<Array<DispatchRoute>>({
            path: `/fleet/vehicles/{vehicle_id}/dispatch/routes`.replace(`{${"vehicle_id"}}`, encodeURIComponent(String(requestParameters.vehicleId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch all of the dispatch routes for a given vehicle.
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     */
    getDispatchRoutesByVehicleId(requestParameters: GetDispatchRoutesByVehicleIdRequest): Observable<Array<DispatchRoute>> {
        return this.getDispatchRoutesByVehicleIdRaw(requestParameters);
    }

    /**
     * Update a dispatch route and its associated jobs.
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     */
    updateDispatchRouteByIdRaw(requestParameters: UpdateDispatchRouteByIdRequest): Observable<DispatchRoute> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling updateDispatchRouteById.');
        }

        if (requestParameters.routeId === null || requestParameters.routeId === undefined) {
            throw new RequiredError('routeId','Required parameter requestParameters.routeId was null or undefined when calling updateDispatchRouteById.');
        }

        if (requestParameters.updateDispatchRouteParams === null || requestParameters.updateDispatchRouteParams === undefined) {
            throw new RequiredError('updateDispatchRouteParams','Required parameter requestParameters.updateDispatchRouteParams was null or undefined when calling updateDispatchRouteById.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<DispatchRoute>({
            path: `/fleet/dispatch/routes/{route_id}`.replace(`{${"route_id"}}`, encodeURIComponent(String(requestParameters.routeId))),
            method: 'PUT',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.updateDispatchRouteParams,
        });
    }

    /**
     * Update a dispatch route and its associated jobs.
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     */
    updateDispatchRouteById(requestParameters: UpdateDispatchRouteByIdRequest): Observable<DispatchRoute> {
        return this.updateDispatchRouteByIdRaw(requestParameters);
    }

}
