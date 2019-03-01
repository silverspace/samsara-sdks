/**
 * Samsara API
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
/* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams,
         HttpResponse, HttpEvent }                           from '@angular/common/http';
import { CustomHttpUrlEncodingCodec }                        from '../encoder';

import { Observable }                                        from 'rxjs/Observable';

import { Address } from '../model/address';
import { AddressParam } from '../model/addressParam';
import { Addresses } from '../model/addresses';
import { AllRouteJobUpdates } from '../model/allRouteJobUpdates';
import { AssetLocationResponse } from '../model/assetLocationResponse';
import { AssetReeferResponse } from '../model/assetReeferResponse';
import { Contact } from '../model/contact';
import { CreateDvirParam } from '../model/createDvirParam';
import { CurrentDriver } from '../model/currentDriver';
import { Data } from '../model/data';
import { DispatchRoute } from '../model/dispatchRoute';
import { DispatchRouteCreate } from '../model/dispatchRouteCreate';
import { DispatchRouteHistory } from '../model/dispatchRouteHistory';
import { DispatchRoutes } from '../model/dispatchRoutes';
import { Document } from '../model/document';
import { DocumentCreate } from '../model/documentCreate';
import { DocumentTypes } from '../model/documentTypes';
import { Documents } from '../model/documents';
import { Driver } from '../model/driver';
import { DriverDailyLogResponse } from '../model/driverDailyLogResponse';
import { DriverForCreate } from '../model/driverForCreate';
import { DriverSafetyScoreResponse } from '../model/driverSafetyScoreResponse';
import { DriversResponse } from '../model/driversResponse';
import { DriversSummaryParam } from '../model/driversSummaryParam';
import { DriversSummaryResponse } from '../model/driversSummaryResponse';
import { DvirBase } from '../model/dvirBase';
import { DvirListResponse } from '../model/dvirListResponse';
import { ErrorResponse } from '../model/errorResponse';
import { FleetVehicleLocations } from '../model/fleetVehicleLocations';
import { FleetVehicleResponse } from '../model/fleetVehicleResponse';
import { FleetVehiclesLocations } from '../model/fleetVehiclesLocations';
import { GroupDriversParam } from '../model/groupDriversParam';
import { GroupParam } from '../model/groupParam';
import { HosAuthenticationLogsParam } from '../model/hosAuthenticationLogsParam';
import { HosAuthenticationLogsResponse } from '../model/hosAuthenticationLogsResponse';
import { HosLogsParam } from '../model/hosLogsParam';
import { HosLogsParam1 } from '../model/hosLogsParam1';
import { HosLogsParam2 } from '../model/hosLogsParam2';
import { HosLogsResponse } from '../model/hosLogsResponse';
import { HosLogsSummaryResponse } from '../model/hosLogsSummaryResponse';
import { InlineResponse200 } from '../model/inlineResponse200';
import { InlineResponse2001 } from '../model/inlineResponse2001';
import { InlineResponse2002 } from '../model/inlineResponse2002';
import { InlineResponse2003 } from '../model/inlineResponse2003';
import { InlineResponse2004 } from '../model/inlineResponse2004';
import { InlineResponse2005 } from '../model/inlineResponse2005';
import { ReactivateDriverParam } from '../model/reactivateDriverParam';
import { TripResponse } from '../model/tripResponse';
import { TripsParam } from '../model/tripsParam';
import { VehicleHarshEventResponse } from '../model/vehicleHarshEventResponse';
import { VehicleSafetyScoreResponse } from '../model/vehicleSafetyScoreResponse';
import { VehicleUpdateParam } from '../model/vehicleUpdateParam';

import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';


@Injectable()
export class FleetService {

    protected basePath = 'https://api.samsara.com/v1';
    public defaultHeaders = new HttpHeaders();
    public configuration = new Configuration();

    constructor(protected httpClient: HttpClient, @Optional()@Inject(BASE_PATH) basePath: string, @Optional() configuration: Configuration) {
        if (basePath) {
            this.basePath = basePath;
        }
        if (configuration) {
            this.configuration = configuration;
            this.basePath = basePath || configuration.basePath || this.basePath;
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
     * /fleet/add_address
     * This method adds an address book entry to the specified group.
     * @param accessToken Samsara API access token.
     * @param addressParam 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public addFleetAddress(accessToken: string, addressParam: AddressParam, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public addFleetAddress(accessToken: string, addressParam: AddressParam, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public addFleetAddress(accessToken: string, addressParam: AddressParam, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public addFleetAddress(accessToken: string, addressParam: AddressParam, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling addFleetAddress.');
        }

        if (addressParam === null || addressParam === undefined) {
            throw new Error('Required parameter addressParam was null or undefined when calling addFleetAddress.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post<any>(`${this.basePath}/fleet/add_address`,
            addressParam,
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
     * /addresses
     * Add one or more addresses to the organization
     * @param accessToken Samsara API access token.
     * @param addresses List of addresses/geofences to add. Geofences can be circular or a polygon.  For each address, only one of &#39;circle&#39; or &#39;polygon&#39; should be provided. If both are provided, the geofence will be saved as a polygon.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public addOrganizationAddresses(accessToken: string, addresses: Addresses, observe?: 'body', reportProgress?: boolean): Observable<Array<Address>>;
    public addOrganizationAddresses(accessToken: string, addresses: Addresses, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<Address>>>;
    public addOrganizationAddresses(accessToken: string, addresses: Addresses, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<Address>>>;
    public addOrganizationAddresses(accessToken: string, addresses: Addresses, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling addOrganizationAddresses.');
        }

        if (addresses === null || addresses === undefined) {
            throw new Error('Required parameter addresses was null or undefined when calling addOrganizationAddresses.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post<Array<Address>>(`${this.basePath}/addresses`,
            addresses,
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
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post<DispatchRoute>(`${this.basePath}/fleet/dispatch/routes`,
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
     * /fleet/drivers/create
     * Create a new driver.
     * @param accessToken Samsara API access token.
     * @param createDriverParam Driver creation body
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public createDriver(accessToken: string, createDriverParam: DriverForCreate, observe?: 'body', reportProgress?: boolean): Observable<Driver>;
    public createDriver(accessToken: string, createDriverParam: DriverForCreate, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Driver>>;
    public createDriver(accessToken: string, createDriverParam: DriverForCreate, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Driver>>;
    public createDriver(accessToken: string, createDriverParam: DriverForCreate, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createDriver.');
        }

        if (createDriverParam === null || createDriverParam === undefined) {
            throw new Error('Required parameter createDriverParam was null or undefined when calling createDriver.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post<Driver>(`${this.basePath}/fleet/drivers/create`,
            createDriverParam,
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
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post<DispatchRoute>(`${this.basePath}/fleet/drivers/${encodeURIComponent(String(driverId))}/dispatch/routes`,
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
     * /fleet/drivers/{driver_id:[0-9]+}/documents
     * Create a driver document for the given driver.
     * @param accessToken Samsara API access token.
     * @param driverId ID of the driver for whom the document is created.
     * @param createDocumentParams To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public createDriverDocument(accessToken: string, driverId: number, createDocumentParams: DocumentCreate, observe?: 'body', reportProgress?: boolean): Observable<Document>;
    public createDriverDocument(accessToken: string, driverId: number, createDocumentParams: DocumentCreate, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Document>>;
    public createDriverDocument(accessToken: string, driverId: number, createDocumentParams: DocumentCreate, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Document>>;
    public createDriverDocument(accessToken: string, driverId: number, createDocumentParams: DocumentCreate, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createDriverDocument.');
        }

        if (driverId === null || driverId === undefined) {
            throw new Error('Required parameter driverId was null or undefined when calling createDriverDocument.');
        }

        if (createDocumentParams === null || createDocumentParams === undefined) {
            throw new Error('Required parameter createDocumentParams was null or undefined when calling createDriverDocument.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post<Document>(`${this.basePath}/fleet/drivers/${encodeURIComponent(String(driverId))}/documents`,
            createDocumentParams,
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
     * /fleet/maintenance/dvirs
     * Create a new dvir, marking a vehicle or trailer safe or unsafe.
     * @param accessToken Samsara API access token.
     * @param createDvirParam DVIR creation body
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public createDvir(accessToken: string, createDvirParam: CreateDvirParam, observe?: 'body', reportProgress?: boolean): Observable<DvirBase>;
    public createDvir(accessToken: string, createDvirParam: CreateDvirParam, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<DvirBase>>;
    public createDvir(accessToken: string, createDvirParam: CreateDvirParam, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<DvirBase>>;
    public createDvir(accessToken: string, createDvirParam: CreateDvirParam, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createDvir.');
        }

        if (createDvirParam === null || createDvirParam === undefined) {
            throw new Error('Required parameter createDvirParam was null or undefined when calling createDvir.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post<DvirBase>(`${this.basePath}/fleet/maintenance/dvirs`,
            createDvirParam,
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
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post<DispatchRoute>(`${this.basePath}/fleet/vehicles/${encodeURIComponent(String(vehicleId))}/dispatch/routes`,
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
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Deactivate a driver with the given id.
     * @param accessToken Samsara API access token.
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public deactivateDriver(accessToken: string, driverIdOrExternalId: string, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public deactivateDriver(accessToken: string, driverIdOrExternalId: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public deactivateDriver(accessToken: string, driverIdOrExternalId: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public deactivateDriver(accessToken: string, driverIdOrExternalId: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling deactivateDriver.');
        }

        if (driverIdOrExternalId === null || driverIdOrExternalId === undefined) {
            throw new Error('Required parameter driverIdOrExternalId was null or undefined when calling deactivateDriver.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.delete<any>(`${this.basePath}/fleet/drivers/${encodeURIComponent(String(driverIdOrExternalId))}`,
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
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.delete<any>(`${this.basePath}/fleet/dispatch/routes/${encodeURIComponent(String(routeId))}`,
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
     * /addresses/{addressId}
     * Delete an address.
     * @param accessToken Samsara API access token.
     * @param addressId ID of the address/geofence
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public deleteOrganizationAddress(accessToken: string, addressId: number, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public deleteOrganizationAddress(accessToken: string, addressId: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public deleteOrganizationAddress(accessToken: string, addressId: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public deleteOrganizationAddress(accessToken: string, addressId: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling deleteOrganizationAddress.');
        }

        if (addressId === null || addressId === undefined) {
            throw new Error('Required parameter addressId was null or undefined when calling deleteOrganizationAddress.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.delete<any>(`${this.basePath}/addresses/${encodeURIComponent(String(addressId))}`,
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
    public fetchAllDispatchRoutes(accessToken: string, groupId?: number, endTime?: number, duration?: number, observe?: 'body', reportProgress?: boolean): Observable<DispatchRoutes>;
    public fetchAllDispatchRoutes(accessToken: string, groupId?: number, endTime?: number, duration?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<DispatchRoutes>>;
    public fetchAllDispatchRoutes(accessToken: string, groupId?: number, endTime?: number, duration?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<DispatchRoutes>>;
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
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<DispatchRoutes>(`${this.basePath}/fleet/dispatch/routes`,
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
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<AllRouteJobUpdates>(`${this.basePath}/fleet/dispatch/routes/job_updates`,
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
     * /fleet/assets/locations
     * Fetch current locations of all assets for the group.
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getAllAssetCurrentLocations(accessToken: string, groupId?: number, observe?: 'body', reportProgress?: boolean): Observable<InlineResponse2001>;
    public getAllAssetCurrentLocations(accessToken: string, groupId?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<InlineResponse2001>>;
    public getAllAssetCurrentLocations(accessToken: string, groupId?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<InlineResponse2001>>;
    public getAllAssetCurrentLocations(accessToken: string, groupId?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getAllAssetCurrentLocations.');
        }


        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }
        if (groupId !== undefined && groupId !== null) {
            queryParameters = queryParameters.set('group_id', <any>groupId);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<InlineResponse2001>(`${this.basePath}/fleet/assets/locations`,
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
     * /fleet/assets
     * Fetch all of the assets for the group.
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getAllAssets(accessToken: string, groupId?: number, observe?: 'body', reportProgress?: boolean): Observable<InlineResponse200>;
    public getAllAssets(accessToken: string, groupId?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<InlineResponse200>>;
    public getAllAssets(accessToken: string, groupId?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<InlineResponse200>>;
    public getAllAssets(accessToken: string, groupId?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getAllAssets.');
        }


        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }
        if (groupId !== undefined && groupId !== null) {
            queryParameters = queryParameters.set('group_id', <any>groupId);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<InlineResponse200>(`${this.basePath}/fleet/assets`,
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
     * /fleet/drivers/inactive
     * Fetch all deactivated drivers for the group.
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getAllDeactivatedDrivers(accessToken: string, groupId?: number, observe?: 'body', reportProgress?: boolean): Observable<Array<Driver>>;
    public getAllDeactivatedDrivers(accessToken: string, groupId?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<Driver>>>;
    public getAllDeactivatedDrivers(accessToken: string, groupId?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<Driver>>>;
    public getAllDeactivatedDrivers(accessToken: string, groupId?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getAllDeactivatedDrivers.');
        }


        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }
        if (groupId !== undefined && groupId !== null) {
            queryParameters = queryParameters.set('group_id', <any>groupId);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<Array<Driver>>(`${this.basePath}/fleet/drivers/inactive`,
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
     * /fleet/assets/{assetId:[0-9]+}/locations
     * Fetch the historical locations for the asset.
     * @param accessToken Samsara API access token.
     * @param assetId ID of the asset
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getAssetLocation(accessToken: string, assetId: number, startMs: number, endMs: number, observe?: 'body', reportProgress?: boolean): Observable<AssetLocationResponse>;
    public getAssetLocation(accessToken: string, assetId: number, startMs: number, endMs: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<AssetLocationResponse>>;
    public getAssetLocation(accessToken: string, assetId: number, startMs: number, endMs: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<AssetLocationResponse>>;
    public getAssetLocation(accessToken: string, assetId: number, startMs: number, endMs: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getAssetLocation.');
        }

        if (assetId === null || assetId === undefined) {
            throw new Error('Required parameter assetId was null or undefined when calling getAssetLocation.');
        }

        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getAssetLocation.');
        }

        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getAssetLocation.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }
        if (startMs !== undefined && startMs !== null) {
            queryParameters = queryParameters.set('startMs', <any>startMs);
        }
        if (endMs !== undefined && endMs !== null) {
            queryParameters = queryParameters.set('endMs', <any>endMs);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<AssetLocationResponse>(`${this.basePath}/fleet/assets/${encodeURIComponent(String(assetId))}/locations`,
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
     * /fleet/assets/{assetId:[0-9]+}/reefer
     * Fetch the reefer-specific stats of an asset.
     * @param accessToken Samsara API access token.
     * @param assetId ID of the asset
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getAssetReefer(accessToken: string, assetId: number, startMs: number, endMs: number, observe?: 'body', reportProgress?: boolean): Observable<AssetReeferResponse>;
    public getAssetReefer(accessToken: string, assetId: number, startMs: number, endMs: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<AssetReeferResponse>>;
    public getAssetReefer(accessToken: string, assetId: number, startMs: number, endMs: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<AssetReeferResponse>>;
    public getAssetReefer(accessToken: string, assetId: number, startMs: number, endMs: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getAssetReefer.');
        }

        if (assetId === null || assetId === undefined) {
            throw new Error('Required parameter assetId was null or undefined when calling getAssetReefer.');
        }

        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getAssetReefer.');
        }

        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getAssetReefer.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }
        if (startMs !== undefined && startMs !== null) {
            queryParameters = queryParameters.set('startMs', <any>startMs);
        }
        if (endMs !== undefined && endMs !== null) {
            queryParameters = queryParameters.set('endMs', <any>endMs);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<AssetReeferResponse>(`${this.basePath}/fleet/assets/${encodeURIComponent(String(assetId))}/reefer`,
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
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Fetch deactivated driver by id.
     * @param accessToken Samsara API access token.
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getDeactivatedDriverById(accessToken: string, driverIdOrExternalId: string, observe?: 'body', reportProgress?: boolean): Observable<Driver>;
    public getDeactivatedDriverById(accessToken: string, driverIdOrExternalId: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Driver>>;
    public getDeactivatedDriverById(accessToken: string, driverIdOrExternalId: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Driver>>;
    public getDeactivatedDriverById(accessToken: string, driverIdOrExternalId: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDeactivatedDriverById.');
        }

        if (driverIdOrExternalId === null || driverIdOrExternalId === undefined) {
            throw new Error('Required parameter driverIdOrExternalId was null or undefined when calling getDeactivatedDriverById.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<Driver>(`${this.basePath}/fleet/drivers/inactive/${encodeURIComponent(String(driverIdOrExternalId))}`,
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
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<DispatchRoute>(`${this.basePath}/fleet/dispatch/routes/${encodeURIComponent(String(routeId))}`,
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
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<DispatchRouteHistory>(`${this.basePath}/fleet/dispatch/routes/${encodeURIComponent(String(routeId))}/history`,
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
    public getDispatchRoutesByDriverId(accessToken: string, driverId: number, endTime?: number, duration?: number, observe?: 'body', reportProgress?: boolean): Observable<DispatchRoutes>;
    public getDispatchRoutesByDriverId(accessToken: string, driverId: number, endTime?: number, duration?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<DispatchRoutes>>;
    public getDispatchRoutesByDriverId(accessToken: string, driverId: number, endTime?: number, duration?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<DispatchRoutes>>;
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
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<DispatchRoutes>(`${this.basePath}/fleet/drivers/${encodeURIComponent(String(driverId))}/dispatch/routes`,
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
    public getDispatchRoutesByVehicleId(accessToken: string, vehicleId: number, endTime?: number, duration?: number, observe?: 'body', reportProgress?: boolean): Observable<DispatchRoutes>;
    public getDispatchRoutesByVehicleId(accessToken: string, vehicleId: number, endTime?: number, duration?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<DispatchRoutes>>;
    public getDispatchRoutesByVehicleId(accessToken: string, vehicleId: number, endTime?: number, duration?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<DispatchRoutes>>;
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
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<DispatchRoutes>(`${this.basePath}/fleet/vehicles/${encodeURIComponent(String(vehicleId))}/dispatch/routes`,
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
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Fetch driver by id.
     * @param accessToken Samsara API access token.
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getDriverById(accessToken: string, driverIdOrExternalId: string, observe?: 'body', reportProgress?: boolean): Observable<CurrentDriver>;
    public getDriverById(accessToken: string, driverIdOrExternalId: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<CurrentDriver>>;
    public getDriverById(accessToken: string, driverIdOrExternalId: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<CurrentDriver>>;
    public getDriverById(accessToken: string, driverIdOrExternalId: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDriverById.');
        }

        if (driverIdOrExternalId === null || driverIdOrExternalId === undefined) {
            throw new Error('Required parameter driverIdOrExternalId was null or undefined when calling getDriverById.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<CurrentDriver>(`${this.basePath}/fleet/drivers/${encodeURIComponent(String(driverIdOrExternalId))}`,
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
     * /fleet/drivers/document_types
     * Fetch all of the document types.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getDriverDocumentTypesByOrgId(observe?: 'body', reportProgress?: boolean): Observable<DocumentTypes>;
    public getDriverDocumentTypesByOrgId(observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<DocumentTypes>>;
    public getDriverDocumentTypesByOrgId(observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<DocumentTypes>>;
    public getDriverDocumentTypesByOrgId(observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<DocumentTypes>(`${this.basePath}/fleet/drivers/document_types`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * /fleet/drivers/documents
     * Fetch all of the documents.
     * @param accessToken Samsara API access token.
     * @param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
     * @param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getDriverDocumentsByOrgId(accessToken: string, endMs?: number, durationMs?: number, observe?: 'body', reportProgress?: boolean): Observable<Documents>;
    public getDriverDocumentsByOrgId(accessToken: string, endMs?: number, durationMs?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Documents>>;
    public getDriverDocumentsByOrgId(accessToken: string, endMs?: number, durationMs?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Documents>>;
    public getDriverDocumentsByOrgId(accessToken: string, endMs?: number, durationMs?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDriverDocumentsByOrgId.');
        }



        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }
        if (endMs !== undefined && endMs !== null) {
            queryParameters = queryParameters.set('endMs', <any>endMs);
        }
        if (durationMs !== undefined && durationMs !== null) {
            queryParameters = queryParameters.set('durationMs', <any>durationMs);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<Documents>(`${this.basePath}/fleet/drivers/documents`,
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
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     * Fetch the safety score for the driver.
     * @param driverId ID of the driver
     * @param accessToken Samsara API access token.
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getDriverSafetyScore(driverId: number, accessToken: string, startMs: number, endMs: number, observe?: 'body', reportProgress?: boolean): Observable<DriverSafetyScoreResponse>;
    public getDriverSafetyScore(driverId: number, accessToken: string, startMs: number, endMs: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<DriverSafetyScoreResponse>>;
    public getDriverSafetyScore(driverId: number, accessToken: string, startMs: number, endMs: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<DriverSafetyScoreResponse>>;
    public getDriverSafetyScore(driverId: number, accessToken: string, startMs: number, endMs: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (driverId === null || driverId === undefined) {
            throw new Error('Required parameter driverId was null or undefined when calling getDriverSafetyScore.');
        }

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDriverSafetyScore.');
        }

        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getDriverSafetyScore.');
        }

        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getDriverSafetyScore.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }
        if (startMs !== undefined && startMs !== null) {
            queryParameters = queryParameters.set('startMs', <any>startMs);
        }
        if (endMs !== undefined && endMs !== null) {
            queryParameters = queryParameters.set('endMs', <any>endMs);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<DriverSafetyScoreResponse>(`${this.basePath}/fleet/drivers/${encodeURIComponent(String(driverId))}/safety/score`,
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
     * /fleet/maintenance/dvirs
     * Get DVIRs for the org within provided time constraints
     * @param accessToken Samsara API access token.
     * @param endMs time in millis until the last dvir log.
     * @param durationMs time in millis which corresponds to the duration before the end_ms.
     * @param groupId Group ID to query.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getDvirs(accessToken: string, endMs: number, durationMs: number, groupId?: number, observe?: 'body', reportProgress?: boolean): Observable<DvirListResponse>;
    public getDvirs(accessToken: string, endMs: number, durationMs: number, groupId?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<DvirListResponse>>;
    public getDvirs(accessToken: string, endMs: number, durationMs: number, groupId?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<DvirListResponse>>;
    public getDvirs(accessToken: string, endMs: number, durationMs: number, groupId?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDvirs.');
        }

        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getDvirs.');
        }

        if (durationMs === null || durationMs === undefined) {
            throw new Error('Required parameter durationMs was null or undefined when calling getDvirs.');
        }


        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }
        if (endMs !== undefined && endMs !== null) {
            queryParameters = queryParameters.set('end_ms', <any>endMs);
        }
        if (durationMs !== undefined && durationMs !== null) {
            queryParameters = queryParameters.set('duration_ms', <any>durationMs);
        }
        if (groupId !== undefined && groupId !== null) {
            queryParameters = queryParameters.set('group_id', <any>groupId);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<DvirListResponse>(`${this.basePath}/fleet/maintenance/dvirs`,
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
     * /fleet/drivers
     * Get all the drivers for the specified group.
     * @param accessToken Samsara API access token.
     * @param groupDriversParam 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getFleetDrivers(accessToken: string, groupDriversParam: GroupDriversParam, observe?: 'body', reportProgress?: boolean): Observable<DriversResponse>;
    public getFleetDrivers(accessToken: string, groupDriversParam: GroupDriversParam, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<DriversResponse>>;
    public getFleetDrivers(accessToken: string, groupDriversParam: GroupDriversParam, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<DriversResponse>>;
    public getFleetDrivers(accessToken: string, groupDriversParam: GroupDriversParam, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetDrivers.');
        }

        if (groupDriversParam === null || groupDriversParam === undefined) {
            throw new Error('Required parameter groupDriversParam was null or undefined when calling getFleetDrivers.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post<DriversResponse>(`${this.basePath}/fleet/drivers`,
            groupDriversParam,
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
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     * Get summarized daily HOS charts for a specified driver.
     * @param accessToken Samsara API access token.
     * @param driverId ID of the driver with HOS logs.
     * @param hosLogsParam 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getFleetDriversHosDailyLogs(accessToken: string, driverId: number, hosLogsParam: HosLogsParam, observe?: 'body', reportProgress?: boolean): Observable<DriverDailyLogResponse>;
    public getFleetDriversHosDailyLogs(accessToken: string, driverId: number, hosLogsParam: HosLogsParam, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<DriverDailyLogResponse>>;
    public getFleetDriversHosDailyLogs(accessToken: string, driverId: number, hosLogsParam: HosLogsParam, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<DriverDailyLogResponse>>;
    public getFleetDriversHosDailyLogs(accessToken: string, driverId: number, hosLogsParam: HosLogsParam, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetDriversHosDailyLogs.');
        }

        if (driverId === null || driverId === undefined) {
            throw new Error('Required parameter driverId was null or undefined when calling getFleetDriversHosDailyLogs.');
        }

        if (hosLogsParam === null || hosLogsParam === undefined) {
            throw new Error('Required parameter hosLogsParam was null or undefined when calling getFleetDriversHosDailyLogs.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post<DriverDailyLogResponse>(`${this.basePath}/fleet/drivers/${encodeURIComponent(String(driverId))}/hos_daily_logs`,
            hosLogsParam,
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
     * /fleet/drivers/summary
     * Get the distance and time each driver in an organization has driven in a given time period.
     * @param accessToken Samsara API access token.
     * @param driversSummaryParam Org ID and time range to query.
     * @param snapToDayBounds Snap query result to HOS day boundaries.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getFleetDriversSummary(accessToken: string, driversSummaryParam: DriversSummaryParam, snapToDayBounds?: boolean, observe?: 'body', reportProgress?: boolean): Observable<DriversSummaryResponse>;
    public getFleetDriversSummary(accessToken: string, driversSummaryParam: DriversSummaryParam, snapToDayBounds?: boolean, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<DriversSummaryResponse>>;
    public getFleetDriversSummary(accessToken: string, driversSummaryParam: DriversSummaryParam, snapToDayBounds?: boolean, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<DriversSummaryResponse>>;
    public getFleetDriversSummary(accessToken: string, driversSummaryParam: DriversSummaryParam, snapToDayBounds?: boolean, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetDriversSummary.');
        }

        if (driversSummaryParam === null || driversSummaryParam === undefined) {
            throw new Error('Required parameter driversSummaryParam was null or undefined when calling getFleetDriversSummary.');
        }


        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }
        if (snapToDayBounds !== undefined && snapToDayBounds !== null) {
            queryParameters = queryParameters.set('snap_to_day_bounds', <any>snapToDayBounds);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post<DriversSummaryResponse>(`${this.basePath}/fleet/drivers/summary`,
            driversSummaryParam,
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
     * /fleet/hos_authentication_logs
     * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
     * @param accessToken Samsara API access token.
     * @param hosAuthenticationLogsParam 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getFleetHosAuthenticationLogs(accessToken: string, hosAuthenticationLogsParam: HosAuthenticationLogsParam, observe?: 'body', reportProgress?: boolean): Observable<HosAuthenticationLogsResponse>;
    public getFleetHosAuthenticationLogs(accessToken: string, hosAuthenticationLogsParam: HosAuthenticationLogsParam, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<HosAuthenticationLogsResponse>>;
    public getFleetHosAuthenticationLogs(accessToken: string, hosAuthenticationLogsParam: HosAuthenticationLogsParam, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<HosAuthenticationLogsResponse>>;
    public getFleetHosAuthenticationLogs(accessToken: string, hosAuthenticationLogsParam: HosAuthenticationLogsParam, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetHosAuthenticationLogs.');
        }

        if (hosAuthenticationLogsParam === null || hosAuthenticationLogsParam === undefined) {
            throw new Error('Required parameter hosAuthenticationLogsParam was null or undefined when calling getFleetHosAuthenticationLogs.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post<HosAuthenticationLogsResponse>(`${this.basePath}/fleet/hos_authentication_logs`,
            hosAuthenticationLogsParam,
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
     * /fleet/hos_logs
     * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
     * @param accessToken Samsara API access token.
     * @param hosLogsParam 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getFleetHosLogs(accessToken: string, hosLogsParam: HosLogsParam1, observe?: 'body', reportProgress?: boolean): Observable<HosLogsResponse>;
    public getFleetHosLogs(accessToken: string, hosLogsParam: HosLogsParam1, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<HosLogsResponse>>;
    public getFleetHosLogs(accessToken: string, hosLogsParam: HosLogsParam1, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<HosLogsResponse>>;
    public getFleetHosLogs(accessToken: string, hosLogsParam: HosLogsParam1, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetHosLogs.');
        }

        if (hosLogsParam === null || hosLogsParam === undefined) {
            throw new Error('Required parameter hosLogsParam was null or undefined when calling getFleetHosLogs.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post<HosLogsResponse>(`${this.basePath}/fleet/hos_logs`,
            hosLogsParam,
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
     * /fleet/hos_logs_summary
     * Get the current HOS status for all drivers in the group.
     * @param accessToken Samsara API access token.
     * @param hosLogsParam 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getFleetHosLogsSummary(accessToken: string, hosLogsParam: HosLogsParam2, observe?: 'body', reportProgress?: boolean): Observable<HosLogsSummaryResponse>;
    public getFleetHosLogsSummary(accessToken: string, hosLogsParam: HosLogsParam2, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<HosLogsSummaryResponse>>;
    public getFleetHosLogsSummary(accessToken: string, hosLogsParam: HosLogsParam2, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<HosLogsSummaryResponse>>;
    public getFleetHosLogsSummary(accessToken: string, hosLogsParam: HosLogsParam2, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetHosLogsSummary.');
        }

        if (hosLogsParam === null || hosLogsParam === undefined) {
            throw new Error('Required parameter hosLogsParam was null or undefined when calling getFleetHosLogsSummary.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post<HosLogsSummaryResponse>(`${this.basePath}/fleet/hos_logs_summary`,
            hosLogsParam,
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
     * /fleet/locations
     * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
     * @param accessToken Samsara API access token.
     * @param groupParam Group ID to query.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getFleetLocations(accessToken: string, groupParam: GroupParam, observe?: 'body', reportProgress?: boolean): Observable<InlineResponse2003>;
    public getFleetLocations(accessToken: string, groupParam: GroupParam, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<InlineResponse2003>>;
    public getFleetLocations(accessToken: string, groupParam: GroupParam, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<InlineResponse2003>>;
    public getFleetLocations(accessToken: string, groupParam: GroupParam, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetLocations.');
        }

        if (groupParam === null || groupParam === undefined) {
            throw new Error('Required parameter groupParam was null or undefined when calling getFleetLocations.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post<InlineResponse2003>(`${this.basePath}/fleet/locations`,
            groupParam,
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
     * /fleet/maintenance/list
     * Get list of the vehicles with any engine faults or check light data.
     * @param accessToken Samsara API access token.
     * @param groupParam Group ID to query.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getFleetMaintenanceList(accessToken: string, groupParam: GroupParam, observe?: 'body', reportProgress?: boolean): Observable<InlineResponse2004>;
    public getFleetMaintenanceList(accessToken: string, groupParam: GroupParam, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<InlineResponse2004>>;
    public getFleetMaintenanceList(accessToken: string, groupParam: GroupParam, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<InlineResponse2004>>;
    public getFleetMaintenanceList(accessToken: string, groupParam: GroupParam, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetMaintenanceList.');
        }

        if (groupParam === null || groupParam === undefined) {
            throw new Error('Required parameter groupParam was null or undefined when calling getFleetMaintenanceList.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post<InlineResponse2004>(`${this.basePath}/fleet/maintenance/list`,
            groupParam,
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
     * /fleet/trips
     * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
     * @param accessToken Samsara API access token.
     * @param tripsParam Group ID, vehicle ID and time range to query.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getFleetTrips(accessToken: string, tripsParam: TripsParam, observe?: 'body', reportProgress?: boolean): Observable<TripResponse>;
    public getFleetTrips(accessToken: string, tripsParam: TripsParam, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<TripResponse>>;
    public getFleetTrips(accessToken: string, tripsParam: TripsParam, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<TripResponse>>;
    public getFleetTrips(accessToken: string, tripsParam: TripsParam, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetTrips.');
        }

        if (tripsParam === null || tripsParam === undefined) {
            throw new Error('Required parameter tripsParam was null or undefined when calling getFleetTrips.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post<TripResponse>(`${this.basePath}/fleet/trips`,
            tripsParam,
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
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Gets a specific vehicle.
     * @param accessToken Samsara API access token.
     * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, observe?: 'body', reportProgress?: boolean): Observable<FleetVehicleResponse>;
    public getFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<FleetVehicleResponse>>;
    public getFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<FleetVehicleResponse>>;
    public getFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetVehicle.');
        }

        if (vehicleIdOrExternalId === null || vehicleIdOrExternalId === undefined) {
            throw new Error('Required parameter vehicleIdOrExternalId was null or undefined when calling getFleetVehicle.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<FleetVehicleResponse>(`${this.basePath}/fleet/vehicles/${encodeURIComponent(String(vehicleIdOrExternalId))}`,
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
     * /addresses/{addressId}
     * Fetch an address by its id.
     * @param accessToken Samsara API access token.
     * @param addressId ID of the address/geofence
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getOrganizationAddress(accessToken: string, addressId: number, observe?: 'body', reportProgress?: boolean): Observable<Address>;
    public getOrganizationAddress(accessToken: string, addressId: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Address>>;
    public getOrganizationAddress(accessToken: string, addressId: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Address>>;
    public getOrganizationAddress(accessToken: string, addressId: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getOrganizationAddress.');
        }

        if (addressId === null || addressId === undefined) {
            throw new Error('Required parameter addressId was null or undefined when calling getOrganizationAddress.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<Address>(`${this.basePath}/addresses/${encodeURIComponent(String(addressId))}`,
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
     * /addresses
     * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
     * @param accessToken Samsara API access token.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getOrganizationAddresses(accessToken: string, observe?: 'body', reportProgress?: boolean): Observable<Array<Address>>;
    public getOrganizationAddresses(accessToken: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<Address>>>;
    public getOrganizationAddresses(accessToken: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<Address>>>;
    public getOrganizationAddresses(accessToken: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getOrganizationAddresses.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<Array<Address>>(`${this.basePath}/addresses`,
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
     * /contacts/{contact_id}
     * Fetch a contact by its id.
     * @param accessToken Samsara API access token.
     * @param contactId ID of the contact
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getOrganizationContact(accessToken: string, contactId: number, observe?: 'body', reportProgress?: boolean): Observable<Contact>;
    public getOrganizationContact(accessToken: string, contactId: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Contact>>;
    public getOrganizationContact(accessToken: string, contactId: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Contact>>;
    public getOrganizationContact(accessToken: string, contactId: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getOrganizationContact.');
        }

        if (contactId === null || contactId === undefined) {
            throw new Error('Required parameter contactId was null or undefined when calling getOrganizationContact.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<Contact>(`${this.basePath}/contacts/${encodeURIComponent(String(contactId))}`,
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
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     * Fetch harsh event details for a vehicle.
     * @param vehicleId ID of the vehicle
     * @param accessToken Samsara API access token.
     * @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getVehicleHarshEvent(vehicleId: number, accessToken: string, timestamp: number, observe?: 'body', reportProgress?: boolean): Observable<VehicleHarshEventResponse>;
    public getVehicleHarshEvent(vehicleId: number, accessToken: string, timestamp: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<VehicleHarshEventResponse>>;
    public getVehicleHarshEvent(vehicleId: number, accessToken: string, timestamp: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<VehicleHarshEventResponse>>;
    public getVehicleHarshEvent(vehicleId: number, accessToken: string, timestamp: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (vehicleId === null || vehicleId === undefined) {
            throw new Error('Required parameter vehicleId was null or undefined when calling getVehicleHarshEvent.');
        }

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getVehicleHarshEvent.');
        }

        if (timestamp === null || timestamp === undefined) {
            throw new Error('Required parameter timestamp was null or undefined when calling getVehicleHarshEvent.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }
        if (timestamp !== undefined && timestamp !== null) {
            queryParameters = queryParameters.set('timestamp', <any>timestamp);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<VehicleHarshEventResponse>(`${this.basePath}/fleet/vehicles/${encodeURIComponent(String(vehicleId))}/safety/harsh_event`,
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
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
     * @param accessToken Samsara API access token.
     * @param vehicleId ID of the vehicle with the associated routes.
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getVehicleLocations(accessToken: string, vehicleId: number, startMs: number, endMs: number, observe?: 'body', reportProgress?: boolean): Observable<FleetVehicleLocations>;
    public getVehicleLocations(accessToken: string, vehicleId: number, startMs: number, endMs: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<FleetVehicleLocations>>;
    public getVehicleLocations(accessToken: string, vehicleId: number, startMs: number, endMs: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<FleetVehicleLocations>>;
    public getVehicleLocations(accessToken: string, vehicleId: number, startMs: number, endMs: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getVehicleLocations.');
        }

        if (vehicleId === null || vehicleId === undefined) {
            throw new Error('Required parameter vehicleId was null or undefined when calling getVehicleLocations.');
        }

        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getVehicleLocations.');
        }

        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getVehicleLocations.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }
        if (startMs !== undefined && startMs !== null) {
            queryParameters = queryParameters.set('startMs', <any>startMs);
        }
        if (endMs !== undefined && endMs !== null) {
            queryParameters = queryParameters.set('endMs', <any>endMs);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<FleetVehicleLocations>(`${this.basePath}/fleet/vehicles/${encodeURIComponent(String(vehicleId))}/locations`,
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
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     * Fetch the safety score for the vehicle.
     * @param vehicleId ID of the vehicle
     * @param accessToken Samsara API access token.
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getVehicleSafetyScore(vehicleId: number, accessToken: string, startMs: number, endMs: number, observe?: 'body', reportProgress?: boolean): Observable<VehicleSafetyScoreResponse>;
    public getVehicleSafetyScore(vehicleId: number, accessToken: string, startMs: number, endMs: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<VehicleSafetyScoreResponse>>;
    public getVehicleSafetyScore(vehicleId: number, accessToken: string, startMs: number, endMs: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<VehicleSafetyScoreResponse>>;
    public getVehicleSafetyScore(vehicleId: number, accessToken: string, startMs: number, endMs: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (vehicleId === null || vehicleId === undefined) {
            throw new Error('Required parameter vehicleId was null or undefined when calling getVehicleSafetyScore.');
        }

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getVehicleSafetyScore.');
        }

        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getVehicleSafetyScore.');
        }

        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getVehicleSafetyScore.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }
        if (startMs !== undefined && startMs !== null) {
            queryParameters = queryParameters.set('startMs', <any>startMs);
        }
        if (endMs !== undefined && endMs !== null) {
            queryParameters = queryParameters.set('endMs', <any>endMs);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<VehicleSafetyScoreResponse>(`${this.basePath}/fleet/vehicles/${encodeURIComponent(String(vehicleId))}/safety/score`,
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
     * /fleet/vehicles/stats
     * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
     * @param accessToken Samsara API access token.
     * @param startMs Time in Unix epoch milliseconds for the start of the query.
     * @param endMs Time in Unix epoch milliseconds for the end of the query.
     * @param series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2
     * @param tagIds Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3
     * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
     * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
     * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getVehicleStats(accessToken: string, startMs: number, endMs: number, series?: 'engineState' | 'auxInput1' | 'auxInput2', tagIds?: string, startingAfter?: string, endingBefore?: string, limit?: number, observe?: 'body', reportProgress?: boolean): Observable<InlineResponse2005>;
    public getVehicleStats(accessToken: string, startMs: number, endMs: number, series?: 'engineState' | 'auxInput1' | 'auxInput2', tagIds?: string, startingAfter?: string, endingBefore?: string, limit?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<InlineResponse2005>>;
    public getVehicleStats(accessToken: string, startMs: number, endMs: number, series?: 'engineState' | 'auxInput1' | 'auxInput2', tagIds?: string, startingAfter?: string, endingBefore?: string, limit?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<InlineResponse2005>>;
    public getVehicleStats(accessToken: string, startMs: number, endMs: number, series?: 'engineState' | 'auxInput1' | 'auxInput2', tagIds?: string, startingAfter?: string, endingBefore?: string, limit?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getVehicleStats.');
        }

        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getVehicleStats.');
        }

        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getVehicleStats.');
        }






        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }
        if (startMs !== undefined && startMs !== null) {
            queryParameters = queryParameters.set('startMs', <any>startMs);
        }
        if (endMs !== undefined && endMs !== null) {
            queryParameters = queryParameters.set('endMs', <any>endMs);
        }
        if (series !== undefined && series !== null) {
            queryParameters = queryParameters.set('series', <any>series);
        }
        if (tagIds !== undefined && tagIds !== null) {
            queryParameters = queryParameters.set('tagIds', <any>tagIds);
        }
        if (startingAfter !== undefined && startingAfter !== null) {
            queryParameters = queryParameters.set('startingAfter', <any>startingAfter);
        }
        if (endingBefore !== undefined && endingBefore !== null) {
            queryParameters = queryParameters.set('endingBefore', <any>endingBefore);
        }
        if (limit !== undefined && limit !== null) {
            queryParameters = queryParameters.set('limit', <any>limit);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<InlineResponse2005>(`${this.basePath}/fleet/vehicles/stats`,
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
     * /fleet/vehicles/locations
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
     * @param accessToken Samsara API access token.
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getVehiclesLocations(accessToken: string, startMs: number, endMs: number, observe?: 'body', reportProgress?: boolean): Observable<FleetVehiclesLocations>;
    public getVehiclesLocations(accessToken: string, startMs: number, endMs: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<FleetVehiclesLocations>>;
    public getVehiclesLocations(accessToken: string, startMs: number, endMs: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<FleetVehiclesLocations>>;
    public getVehiclesLocations(accessToken: string, startMs: number, endMs: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getVehiclesLocations.');
        }

        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getVehiclesLocations.');
        }

        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getVehiclesLocations.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }
        if (startMs !== undefined && startMs !== null) {
            queryParameters = queryParameters.set('startMs', <any>startMs);
        }
        if (endMs !== undefined && endMs !== null) {
            queryParameters = queryParameters.set('endMs', <any>endMs);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<FleetVehiclesLocations>(`${this.basePath}/fleet/vehicles/locations`,
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
     * /contacts
     * Fetch all contacts for the organization.
     * @param accessToken Samsara API access token.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public listContacts(accessToken: string, observe?: 'body', reportProgress?: boolean): Observable<Array<Contact>>;
    public listContacts(accessToken: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<Contact>>>;
    public listContacts(accessToken: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<Contact>>>;
    public listContacts(accessToken: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling listContacts.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];

        return this.httpClient.get<Array<Contact>>(`${this.basePath}/contacts`,
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
     * /fleet/list
     * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
     * @param accessToken Samsara API access token.
     * @param groupParam Group ID to query.
     * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
     * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
     * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public listFleet(accessToken: string, groupParam: GroupParam, startingAfter?: string, endingBefore?: string, limit?: number, observe?: 'body', reportProgress?: boolean): Observable<InlineResponse2002>;
    public listFleet(accessToken: string, groupParam: GroupParam, startingAfter?: string, endingBefore?: string, limit?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<InlineResponse2002>>;
    public listFleet(accessToken: string, groupParam: GroupParam, startingAfter?: string, endingBefore?: string, limit?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<InlineResponse2002>>;
    public listFleet(accessToken: string, groupParam: GroupParam, startingAfter?: string, endingBefore?: string, limit?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling listFleet.');
        }

        if (groupParam === null || groupParam === undefined) {
            throw new Error('Required parameter groupParam was null or undefined when calling listFleet.');
        }




        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }
        if (startingAfter !== undefined && startingAfter !== null) {
            queryParameters = queryParameters.set('startingAfter', <any>startingAfter);
        }
        if (endingBefore !== undefined && endingBefore !== null) {
            queryParameters = queryParameters.set('endingBefore', <any>endingBefore);
        }
        if (limit !== undefined && limit !== null) {
            queryParameters = queryParameters.set('limit', <any>limit);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post<InlineResponse2002>(`${this.basePath}/fleet/list`,
            groupParam,
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
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
     * @param accessToken Samsara API access token.
     * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
     * @param data 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public patchFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, data: Data, observe?: 'body', reportProgress?: boolean): Observable<FleetVehicleResponse>;
    public patchFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, data: Data, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<FleetVehicleResponse>>;
    public patchFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, data: Data, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<FleetVehicleResponse>>;
    public patchFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, data: Data, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling patchFleetVehicle.');
        }

        if (vehicleIdOrExternalId === null || vehicleIdOrExternalId === undefined) {
            throw new Error('Required parameter vehicleIdOrExternalId was null or undefined when calling patchFleetVehicle.');
        }

        if (data === null || data === undefined) {
            throw new Error('Required parameter data was null or undefined when calling patchFleetVehicle.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json',
            'application/merge-patch+json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.patch<FleetVehicleResponse>(`${this.basePath}/fleet/vehicles/${encodeURIComponent(String(vehicleIdOrExternalId))}`,
            data,
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
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Reactivate the inactive driver having id.
     * @param accessToken Samsara API access token.
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param reactivateDriverParam Driver reactivation body
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public reactivateDriverById(accessToken: string, driverIdOrExternalId: string, reactivateDriverParam: ReactivateDriverParam, observe?: 'body', reportProgress?: boolean): Observable<CurrentDriver>;
    public reactivateDriverById(accessToken: string, driverIdOrExternalId: string, reactivateDriverParam: ReactivateDriverParam, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<CurrentDriver>>;
    public reactivateDriverById(accessToken: string, driverIdOrExternalId: string, reactivateDriverParam: ReactivateDriverParam, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<CurrentDriver>>;
    public reactivateDriverById(accessToken: string, driverIdOrExternalId: string, reactivateDriverParam: ReactivateDriverParam, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling reactivateDriverById.');
        }

        if (driverIdOrExternalId === null || driverIdOrExternalId === undefined) {
            throw new Error('Required parameter driverIdOrExternalId was null or undefined when calling reactivateDriverById.');
        }

        if (reactivateDriverParam === null || reactivateDriverParam === undefined) {
            throw new Error('Required parameter reactivateDriverParam was null or undefined when calling reactivateDriverById.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.put<CurrentDriver>(`${this.basePath}/fleet/drivers/inactive/${encodeURIComponent(String(driverIdOrExternalId))}`,
            reactivateDriverParam,
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
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.put<DispatchRoute>(`${this.basePath}/fleet/dispatch/routes/${encodeURIComponent(String(routeId))}`,
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

    /**
     * /addresses/{addressId}
     * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
     * @param accessToken Samsara API access token.
     * @param address Update parts of an address&#39;s value. If the geofence &#39;circle&#39; or &#39;polygon&#39; key is specified, the update will change the type of geofence accordingly.
     * @param addressId ID of the address/geofence
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public updateOrganizationAddress(accessToken: string, address: Address, addressId: number, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public updateOrganizationAddress(accessToken: string, address: Address, addressId: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public updateOrganizationAddress(accessToken: string, address: Address, addressId: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public updateOrganizationAddress(accessToken: string, address: Address, addressId: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling updateOrganizationAddress.');
        }

        if (address === null || address === undefined) {
            throw new Error('Required parameter address was null or undefined when calling updateOrganizationAddress.');
        }

        if (addressId === null || addressId === undefined) {
            throw new Error('Required parameter addressId was null or undefined when calling updateOrganizationAddress.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.patch<any>(`${this.basePath}/addresses/${encodeURIComponent(String(addressId))}`,
            address,
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
     * /fleet/set_data
     * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
     * @param accessToken Samsara API access token.
     * @param vehicleUpdateParam 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public updateVehicles(accessToken: string, vehicleUpdateParam: VehicleUpdateParam, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public updateVehicles(accessToken: string, vehicleUpdateParam: VehicleUpdateParam, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public updateVehicles(accessToken: string, vehicleUpdateParam: VehicleUpdateParam, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public updateVehicles(accessToken: string, vehicleUpdateParam: VehicleUpdateParam, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling updateVehicles.');
        }

        if (vehicleUpdateParam === null || vehicleUpdateParam === undefined) {
            throw new Error('Required parameter vehicleUpdateParam was null or undefined when calling updateVehicles.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post<any>(`${this.basePath}/fleet/set_data`,
            vehicleUpdateParam,
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
