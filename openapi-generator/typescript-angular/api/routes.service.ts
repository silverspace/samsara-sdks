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
/* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams,
         HttpResponse, HttpEvent }                           from '@angular/common/http';
import { CustomHttpUrlEncodingCodec }                        from '../encoder';

import { Observable }                                        from 'rxjs';

import { AllRouteJobUpdates } from '../model/allRouteJobUpdates';
import { DispatchRoute } from '../model/dispatchRoute';
import { DispatchRouteCreate } from '../model/dispatchRouteCreate';
import { DispatchRouteHistory } from '../model/dispatchRouteHistory';

import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';


@Injectable({
  providedIn: 'root'
})
export class RoutesService {

    protected basePath = 'https://api.samsara.com/v1';
    public defaultHeaders = new HttpHeaders();
    public configuration = new Configuration();

    constructor(protected httpClient: HttpClient, @Optional()@Inject(BASE_PATH) basePath: string, @Optional() configuration: Configuration) {

        if (configuration) {
            this.configuration = configuration;
            this.configuration.basePath = configuration.basePath || basePath || this.basePath;

        } else {
            this.configuration.basePath = basePath || this.basePath;
        }
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        for (const consume of consumes) {
            if (form === consume) {
                return true;
            }
        }
        return false;
    }


    /**
     * /fleet/dispatch/routes
     * Create a new dispatch route.
     * @param accessToken Samsara API access token.
     * @param createDispatchRouteParams 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public createDispatchRoute(accessToken: string, createDispatchRouteParams: DispatchRouteCreate, observe?: 'body', reportProgress?: boolean): Observable<DispatchRoute>;
    public createDispatchRoute(accessToken: string, createDispatchRouteParams: DispatchRouteCreate, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<DispatchRoute>>;
    public createDispatchRoute(accessToken: string, createDispatchRouteParams: DispatchRouteCreate, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<DispatchRoute>>;
    public createDispatchRoute(accessToken: string, createDispatchRouteParams: DispatchRouteCreate, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createDispatchRoute.');
        }
        if (createDispatchRouteParams === null || createDispatchRouteParams === undefined) {
            throw new Error('Required parameter createDispatchRouteParams was null or undefined when calling createDispatchRoute.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected !== undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post<DispatchRoute>(`${this.configuration.basePath}/fleet/dispatch/routes`,
            createDispatchRouteParams,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * Create a new dispatch route for the driver with driver_id.
     * @param accessToken Samsara API access token.
     * @param driverId ID of the driver with the associated routes.
     * @param createDispatchRouteParams 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public createDriverDispatchRoute(accessToken: string, driverId: number, createDispatchRouteParams: DispatchRouteCreate, observe?: 'body', reportProgress?: boolean): Observable<DispatchRoute>;
    public createDriverDispatchRoute(accessToken: string, driverId: number, createDispatchRouteParams: DispatchRouteCreate, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<DispatchRoute>>;
    public createDriverDispatchRoute(accessToken: string, driverId: number, createDispatchRouteParams: DispatchRouteCreate, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<DispatchRoute>>;
    public createDriverDispatchRoute(accessToken: string, driverId: number, createDispatchRouteParams: DispatchRouteCreate, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createDriverDispatchRoute.');
        }
        if (driverId === null || driverId === undefined) {
            throw new Error('Required parameter driverId was null or undefined when calling createDriverDispatchRoute.');
        }
        if (createDispatchRouteParams === null || createDispatchRouteParams === undefined) {
            throw new Error('Required parameter createDispatchRouteParams was null or undefined when calling createDriverDispatchRoute.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected !== undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post<DispatchRoute>(`${this.configuration.basePath}/fleet/drivers/${encodeURIComponent(String(driverId))}/dispatch/routes`,
            createDispatchRouteParams,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * Create a new dispatch route for the vehicle with vehicle_id.
     * @param accessToken Samsara API access token.
     * @param vehicleId ID of the vehicle with the associated routes.
     * @param createDispatchRouteParams 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public createVehicleDispatchRoute(accessToken: string, vehicleId: number, createDispatchRouteParams: DispatchRouteCreate, observe?: 'body', reportProgress?: boolean): Observable<DispatchRoute>;
    public createVehicleDispatchRoute(accessToken: string, vehicleId: number, createDispatchRouteParams: DispatchRouteCreate, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<DispatchRoute>>;
    public createVehicleDispatchRoute(accessToken: string, vehicleId: number, createDispatchRouteParams: DispatchRouteCreate, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<DispatchRoute>>;
    public createVehicleDispatchRoute(accessToken: string, vehicleId: number, createDispatchRouteParams: DispatchRouteCreate, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createVehicleDispatchRoute.');
        }
        if (vehicleId === null || vehicleId === undefined) {
            throw new Error('Required parameter vehicleId was null or undefined when calling createVehicleDispatchRoute.');
        }
        if (createDispatchRouteParams === null || createDispatchRouteParams === undefined) {
            throw new Error('Required parameter createDispatchRouteParams was null or undefined when calling createVehicleDispatchRoute.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected !== undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post<DispatchRoute>(`${this.configuration.basePath}/fleet/vehicles/${encodeURIComponent(String(vehicleId))}/dispatch/routes`,
            createDispatchRouteParams,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     * Delete a dispatch route and its associated jobs.
     * @param accessToken Samsara API access token.
     * @param routeId ID of the dispatch route.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public deleteDispatchRouteById(accessToken: string, routeId: number, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public deleteDispatchRouteById(accessToken: string, routeId: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public deleteDispatchRouteById(accessToken: string, routeId: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public deleteDispatchRouteById(accessToken: string, routeId: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling deleteDispatchRouteById.');
        }
        if (routeId === null || routeId === undefined) {
            throw new Error('Required parameter routeId was null or undefined when calling deleteDispatchRouteById.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.delete<any>(`${this.configuration.basePath}/fleet/dispatch/routes/${encodeURIComponent(String(routeId))}`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * /fleet/dispatch/routes
     * Fetch all of the dispatch routes for the group.
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public fetchAllDispatchRoutes(accessToken: string, groupId?: number, endTime?: number, duration?: number, observe?: 'body', reportProgress?: boolean): Observable<Array<DispatchRoute>>;
    public fetchAllDispatchRoutes(accessToken: string, groupId?: number, endTime?: number, duration?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<DispatchRoute>>>;
    public fetchAllDispatchRoutes(accessToken: string, groupId?: number, endTime?: number, duration?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<DispatchRoute>>>;
    public fetchAllDispatchRoutes(accessToken: string, groupId?: number, endTime?: number, duration?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling fetchAllDispatchRoutes.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }
        if (groupId !== undefined && groupId !== null) {
            queryParameters = queryParameters.set('group_id', <any>groupId);
        }
        if (endTime !== undefined && endTime !== null) {
            queryParameters = queryParameters.set('end_time', <any>endTime);
        }
        if (duration !== undefined && duration !== null) {
            queryParameters = queryParameters.set('duration', <any>duration);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.get<Array<DispatchRoute>>(`${this.configuration.basePath}/fleet/dispatch/routes`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * /fleet/dispatch/routes/job_updates
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
     * @param include Optionally set include&#x3D;route to include route object in response payload.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public fetchAllRouteJobUpdates(accessToken: string, groupId?: number, sequenceId?: string, include?: string, observe?: 'body', reportProgress?: boolean): Observable<AllRouteJobUpdates>;
    public fetchAllRouteJobUpdates(accessToken: string, groupId?: number, sequenceId?: string, include?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<AllRouteJobUpdates>>;
    public fetchAllRouteJobUpdates(accessToken: string, groupId?: number, sequenceId?: string, include?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<AllRouteJobUpdates>>;
    public fetchAllRouteJobUpdates(accessToken: string, groupId?: number, sequenceId?: string, include?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling fetchAllRouteJobUpdates.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }
        if (groupId !== undefined && groupId !== null) {
            queryParameters = queryParameters.set('group_id', <any>groupId);
        }
        if (sequenceId !== undefined && sequenceId !== null) {
            queryParameters = queryParameters.set('sequence_id', <any>sequenceId);
        }
        if (include !== undefined && include !== null) {
            queryParameters = queryParameters.set('include', <any>include);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.get<AllRouteJobUpdates>(`${this.configuration.basePath}/fleet/dispatch/routes/job_updates`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     * Fetch a dispatch route by id.
     * @param accessToken Samsara API access token.
     * @param routeId ID of the dispatch route.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getDispatchRouteById(accessToken: string, routeId: number, observe?: 'body', reportProgress?: boolean): Observable<DispatchRoute>;
    public getDispatchRouteById(accessToken: string, routeId: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<DispatchRoute>>;
    public getDispatchRouteById(accessToken: string, routeId: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<DispatchRoute>>;
    public getDispatchRouteById(accessToken: string, routeId: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDispatchRouteById.');
        }
        if (routeId === null || routeId === undefined) {
            throw new Error('Required parameter routeId was null or undefined when calling getDispatchRouteById.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.get<DispatchRoute>(`${this.configuration.basePath}/fleet/dispatch/routes/${encodeURIComponent(String(routeId))}`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     * Fetch the history of a dispatch route.
     * @param accessToken Samsara API access token.
     * @param routeId ID of the route with history.
     * @param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
     * @param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getDispatchRouteHistory(accessToken: string, routeId: number, startTime?: number, endTime?: number, observe?: 'body', reportProgress?: boolean): Observable<DispatchRouteHistory>;
    public getDispatchRouteHistory(accessToken: string, routeId: number, startTime?: number, endTime?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<DispatchRouteHistory>>;
    public getDispatchRouteHistory(accessToken: string, routeId: number, startTime?: number, endTime?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<DispatchRouteHistory>>;
    public getDispatchRouteHistory(accessToken: string, routeId: number, startTime?: number, endTime?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDispatchRouteHistory.');
        }
        if (routeId === null || routeId === undefined) {
            throw new Error('Required parameter routeId was null or undefined when calling getDispatchRouteHistory.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }
        if (startTime !== undefined && startTime !== null) {
            queryParameters = queryParameters.set('start_time', <any>startTime);
        }
        if (endTime !== undefined && endTime !== null) {
            queryParameters = queryParameters.set('end_time', <any>endTime);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.get<DispatchRouteHistory>(`${this.configuration.basePath}/fleet/dispatch/routes/${encodeURIComponent(String(routeId))}/history`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * Fetch all of the dispatch routes for a given driver.
     * @param accessToken Samsara API access token.
     * @param driverId ID of the driver with the associated routes.
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getDispatchRoutesByDriverId(accessToken: string, driverId: number, endTime?: number, duration?: number, observe?: 'body', reportProgress?: boolean): Observable<Array<DispatchRoute>>;
    public getDispatchRoutesByDriverId(accessToken: string, driverId: number, endTime?: number, duration?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<DispatchRoute>>>;
    public getDispatchRoutesByDriverId(accessToken: string, driverId: number, endTime?: number, duration?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<DispatchRoute>>>;
    public getDispatchRoutesByDriverId(accessToken: string, driverId: number, endTime?: number, duration?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDispatchRoutesByDriverId.');
        }
        if (driverId === null || driverId === undefined) {
            throw new Error('Required parameter driverId was null or undefined when calling getDispatchRoutesByDriverId.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }
        if (endTime !== undefined && endTime !== null) {
            queryParameters = queryParameters.set('end_time', <any>endTime);
        }
        if (duration !== undefined && duration !== null) {
            queryParameters = queryParameters.set('duration', <any>duration);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.get<Array<DispatchRoute>>(`${this.configuration.basePath}/fleet/drivers/${encodeURIComponent(String(driverId))}/dispatch/routes`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * Fetch all of the dispatch routes for a given vehicle.
     * @param accessToken Samsara API access token.
     * @param vehicleId ID of the vehicle with the associated routes.
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getDispatchRoutesByVehicleId(accessToken: string, vehicleId: number, endTime?: number, duration?: number, observe?: 'body', reportProgress?: boolean): Observable<Array<DispatchRoute>>;
    public getDispatchRoutesByVehicleId(accessToken: string, vehicleId: number, endTime?: number, duration?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<DispatchRoute>>>;
    public getDispatchRoutesByVehicleId(accessToken: string, vehicleId: number, endTime?: number, duration?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<DispatchRoute>>>;
    public getDispatchRoutesByVehicleId(accessToken: string, vehicleId: number, endTime?: number, duration?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDispatchRoutesByVehicleId.');
        }
        if (vehicleId === null || vehicleId === undefined) {
            throw new Error('Required parameter vehicleId was null or undefined when calling getDispatchRoutesByVehicleId.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }
        if (endTime !== undefined && endTime !== null) {
            queryParameters = queryParameters.set('end_time', <any>endTime);
        }
        if (duration !== undefined && duration !== null) {
            queryParameters = queryParameters.set('duration', <any>duration);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.get<Array<DispatchRoute>>(`${this.configuration.basePath}/fleet/vehicles/${encodeURIComponent(String(vehicleId))}/dispatch/routes`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     * Update a dispatch route and its associated jobs.
     * @param accessToken Samsara API access token.
     * @param routeId ID of the dispatch route.
     * @param updateDispatchRouteParams 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public updateDispatchRouteById(accessToken: string, routeId: number, updateDispatchRouteParams: DispatchRoute, observe?: 'body', reportProgress?: boolean): Observable<DispatchRoute>;
    public updateDispatchRouteById(accessToken: string, routeId: number, updateDispatchRouteParams: DispatchRoute, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<DispatchRoute>>;
    public updateDispatchRouteById(accessToken: string, routeId: number, updateDispatchRouteParams: DispatchRoute, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<DispatchRoute>>;
    public updateDispatchRouteById(accessToken: string, routeId: number, updateDispatchRouteParams: DispatchRoute, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling updateDispatchRouteById.');
        }
        if (routeId === null || routeId === undefined) {
            throw new Error('Required parameter routeId was null or undefined when calling updateDispatchRouteById.');
        }
        if (updateDispatchRouteParams === null || updateDispatchRouteParams === undefined) {
            throw new Error('Required parameter updateDispatchRouteParams was null or undefined when calling updateDispatchRouteById.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected !== undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.put<DispatchRoute>(`${this.configuration.basePath}/fleet/dispatch/routes/${encodeURIComponent(String(routeId))}`,
            updateDispatchRouteParams,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

}
