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

import { Observable } from "rxjs/Observable";
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';
import IHttpClient from "../IHttpClient";
import { inject, injectable } from "inversify";
import { IAPIConfiguration } from "../IAPIConfiguration";
import { Headers } from "../Headers";
import HttpResponse from "../HttpResponse";

import { Address } from '../model/address';
import { AllRouteJobUpdates } from '../model/allRouteJobUpdates';
import { AssetReeferResponse } from '../model/assetReeferResponse';
import { Contact } from '../model/contact';
import { DispatchRoute } from '../model/dispatchRoute';
import { DispatchRouteCreate } from '../model/dispatchRouteCreate';
import { DispatchRouteHistory } from '../model/dispatchRouteHistory';
import { Document } from '../model/document';
import { DocumentCreate } from '../model/documentCreate';
import { DocumentType } from '../model/documentType';
import { Driver } from '../model/driver';
import { DriverDailyLogResponse } from '../model/driverDailyLogResponse';
import { DriverForCreate } from '../model/driverForCreate';
import { DriverSafetyScoreResponse } from '../model/driverSafetyScoreResponse';
import { DriversResponse } from '../model/driversResponse';
import { DriversSummaryResponse } from '../model/driversSummaryResponse';
import { DvirBase } from '../model/dvirBase';
import { DvirListResponse } from '../model/dvirListResponse';
import { FleetVehicleLocation } from '../model/fleetVehicleLocation';
import { FleetVehicleResponse } from '../model/fleetVehicleResponse';
import { HosAuthenticationLogsResponse } from '../model/hosAuthenticationLogsResponse';
import { HosLogsResponse } from '../model/hosLogsResponse';
import { HosLogsSummaryResponse } from '../model/hosLogsSummaryResponse';
import { InlineObject } from '../model/inlineObject';
import { InlineObject1 } from '../model/inlineObject1';
import { InlineObject10 } from '../model/inlineObject10';
import { InlineObject11 } from '../model/inlineObject11';
import { InlineObject12 } from '../model/inlineObject12';
import { InlineObject13 } from '../model/inlineObject13';
import { InlineObject14 } from '../model/inlineObject14';
import { InlineObject15 } from '../model/inlineObject15';
import { InlineObject16 } from '../model/inlineObject16';
import { InlineObject2 } from '../model/inlineObject2';
import { InlineObject3 } from '../model/inlineObject3';
import { InlineObject4 } from '../model/inlineObject4';
import { InlineObject5 } from '../model/inlineObject5';
import { InlineObject6 } from '../model/inlineObject6';
import { InlineObject7 } from '../model/inlineObject7';
import { InlineObject8 } from '../model/inlineObject8';
import { InlineObject9 } from '../model/inlineObject9';
import { InlineResponse200 } from '../model/inlineResponse200';
import { InlineResponse2001 } from '../model/inlineResponse2001';
import { InlineResponse2002 } from '../model/inlineResponse2002';
import { InlineResponse2003 } from '../model/inlineResponse2003';
import { InlineResponse2004 } from '../model/inlineResponse2004';
import { InlineResponse2005 } from '../model/inlineResponse2005';
import { TripResponse } from '../model/tripResponse';
import { VehicleHarshEventResponse } from '../model/vehicleHarshEventResponse';
import { VehicleSafetyScoreResponse } from '../model/vehicleSafetyScoreResponse';

import { COLLECTION_FORMATS }  from '../variables';



@injectable()
export class FleetService {
    private basePath: string = 'https://api.samsara.com/v1';

    constructor(@inject("IApiHttpClient") private httpClient: IHttpClient,
        @inject("IAPIConfiguration") private APIConfiguration: IAPIConfiguration ) {
        if(this.APIConfiguration.basePath)
            this.basePath = this.APIConfiguration.basePath;
    }

    /**
     * /fleet/add_address
     * This method adds an address book entry to the specified group.
     * @param accessToken Samsara API access token.
     * @param addressParam 
     
     */
    public addFleetAddress(accessToken: string, addressParam: InlineObject2, observe?: 'body', headers?: Headers): Observable<any>;
    public addFleetAddress(accessToken: string, addressParam: InlineObject2, observe?: 'response', headers?: Headers): Observable<HttpResponse<any>>;
    public addFleetAddress(accessToken: string, addressParam: InlineObject2, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling addFleetAddress.');
        }

        if (!addressParam){
            throw new Error('Required parameter addressParam was null or undefined when calling addFleetAddress.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<any>> = this.httpClient.post(`${this.basePath}/fleet/add_address?${queryParameters.join('&')}`, addressParam , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <any>(httpResponse.response));
        }
        return response;
    }


    /**
     * /addresses
     * Add one or more addresses to the organization
     * @param accessToken Samsara API access token.
     * @param addresses 
     
     */
    public addOrganizationAddresses(accessToken: string, addresses: InlineObject, observe?: 'body', headers?: Headers): Observable<Array<Address>>;
    public addOrganizationAddresses(accessToken: string, addresses: InlineObject, observe?: 'response', headers?: Headers): Observable<HttpResponse<Array<Address>>>;
    public addOrganizationAddresses(accessToken: string, addresses: InlineObject, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling addOrganizationAddresses.');
        }

        if (!addresses){
            throw new Error('Required parameter addresses was null or undefined when calling addOrganizationAddresses.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<Array<Address>>> = this.httpClient.post(`${this.basePath}/addresses?${queryParameters.join('&')}`, addresses , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Array<Address>>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/dispatch/routes
     * Create a new dispatch route.
     * @param accessToken Samsara API access token.
     * @param createDispatchRouteParams 
     
     */
    public createDispatchRoute(accessToken: string, createDispatchRouteParams: DispatchRouteCreate, observe?: 'body', headers?: Headers): Observable<DispatchRoute>;
    public createDispatchRoute(accessToken: string, createDispatchRouteParams: DispatchRouteCreate, observe?: 'response', headers?: Headers): Observable<HttpResponse<DispatchRoute>>;
    public createDispatchRoute(accessToken: string, createDispatchRouteParams: DispatchRouteCreate, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling createDispatchRoute.');
        }

        if (!createDispatchRouteParams){
            throw new Error('Required parameter createDispatchRouteParams was null or undefined when calling createDispatchRoute.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<DispatchRoute>> = this.httpClient.post(`${this.basePath}/fleet/dispatch/routes?${queryParameters.join('&')}`, createDispatchRouteParams , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <DispatchRoute>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/drivers/create
     * Create a new driver.
     * @param accessToken Samsara API access token.
     * @param createDriverParam Driver creation body
     
     */
    public createDriver(accessToken: string, createDriverParam: DriverForCreate, observe?: 'body', headers?: Headers): Observable<Driver>;
    public createDriver(accessToken: string, createDriverParam: DriverForCreate, observe?: 'response', headers?: Headers): Observable<HttpResponse<Driver>>;
    public createDriver(accessToken: string, createDriverParam: DriverForCreate, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling createDriver.');
        }

        if (!createDriverParam){
            throw new Error('Required parameter createDriverParam was null or undefined when calling createDriver.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<Driver>> = this.httpClient.post(`${this.basePath}/fleet/drivers/create?${queryParameters.join('&')}`, createDriverParam , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Driver>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * Create a new dispatch route for the driver with driver_id.
     * @param accessToken Samsara API access token.
     * @param driverId ID of the driver with the associated routes.
     * @param createDispatchRouteParams 
     
     */
    public createDriverDispatchRoute(accessToken: string, driverId: number, createDispatchRouteParams: DispatchRouteCreate, observe?: 'body', headers?: Headers): Observable<DispatchRoute>;
    public createDriverDispatchRoute(accessToken: string, driverId: number, createDispatchRouteParams: DispatchRouteCreate, observe?: 'response', headers?: Headers): Observable<HttpResponse<DispatchRoute>>;
    public createDriverDispatchRoute(accessToken: string, driverId: number, createDispatchRouteParams: DispatchRouteCreate, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling createDriverDispatchRoute.');
        }

        if (!driverId){
            throw new Error('Required parameter driverId was null or undefined when calling createDriverDispatchRoute.');
        }

        if (!createDispatchRouteParams){
            throw new Error('Required parameter createDispatchRouteParams was null or undefined when calling createDriverDispatchRoute.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<DispatchRoute>> = this.httpClient.post(`${this.basePath}/fleet/drivers/${encodeURIComponent(String(driverId))}/dispatch/routes?${queryParameters.join('&')}`, createDispatchRouteParams , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <DispatchRoute>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/drivers/{driver_id:[0-9]+}/documents
     * Create a driver document for the given driver.
     * @param accessToken Samsara API access token.
     * @param driverId ID of the driver for whom the document is created.
     * @param createDocumentParams To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
     
     */
    public createDriverDocument(accessToken: string, driverId: number, createDocumentParams: DocumentCreate, observe?: 'body', headers?: Headers): Observable<Document>;
    public createDriverDocument(accessToken: string, driverId: number, createDocumentParams: DocumentCreate, observe?: 'response', headers?: Headers): Observable<HttpResponse<Document>>;
    public createDriverDocument(accessToken: string, driverId: number, createDocumentParams: DocumentCreate, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling createDriverDocument.');
        }

        if (!driverId){
            throw new Error('Required parameter driverId was null or undefined when calling createDriverDocument.');
        }

        if (!createDocumentParams){
            throw new Error('Required parameter createDocumentParams was null or undefined when calling createDriverDocument.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<Document>> = this.httpClient.post(`${this.basePath}/fleet/drivers/${encodeURIComponent(String(driverId))}/documents?${queryParameters.join('&')}`, createDocumentParams , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Document>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/maintenance/dvirs
     * Create a new dvir, marking a vehicle or trailer safe or unsafe.
     * @param accessToken Samsara API access token.
     * @param createDvirParam 
     
     */
    public createDvir(accessToken: string, createDvirParam: InlineObject12, observe?: 'body', headers?: Headers): Observable<DvirBase>;
    public createDvir(accessToken: string, createDvirParam: InlineObject12, observe?: 'response', headers?: Headers): Observable<HttpResponse<DvirBase>>;
    public createDvir(accessToken: string, createDvirParam: InlineObject12, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling createDvir.');
        }

        if (!createDvirParam){
            throw new Error('Required parameter createDvirParam was null or undefined when calling createDvir.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<DvirBase>> = this.httpClient.post(`${this.basePath}/fleet/maintenance/dvirs?${queryParameters.join('&')}`, createDvirParam , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <DvirBase>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * Create a new dispatch route for the vehicle with vehicle_id.
     * @param accessToken Samsara API access token.
     * @param vehicleId ID of the vehicle with the associated routes.
     * @param createDispatchRouteParams 
     
     */
    public createVehicleDispatchRoute(accessToken: string, vehicleId: number, createDispatchRouteParams: DispatchRouteCreate, observe?: 'body', headers?: Headers): Observable<DispatchRoute>;
    public createVehicleDispatchRoute(accessToken: string, vehicleId: number, createDispatchRouteParams: DispatchRouteCreate, observe?: 'response', headers?: Headers): Observable<HttpResponse<DispatchRoute>>;
    public createVehicleDispatchRoute(accessToken: string, vehicleId: number, createDispatchRouteParams: DispatchRouteCreate, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling createVehicleDispatchRoute.');
        }

        if (!vehicleId){
            throw new Error('Required parameter vehicleId was null or undefined when calling createVehicleDispatchRoute.');
        }

        if (!createDispatchRouteParams){
            throw new Error('Required parameter createDispatchRouteParams was null or undefined when calling createVehicleDispatchRoute.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<DispatchRoute>> = this.httpClient.post(`${this.basePath}/fleet/vehicles/${encodeURIComponent(String(vehicleId))}/dispatch/routes?${queryParameters.join('&')}`, createDispatchRouteParams , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <DispatchRoute>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Deactivate a driver with the given id.
     * @param accessToken Samsara API access token.
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     
     */
    public deactivateDriver(accessToken: string, driverIdOrExternalId: string, observe?: 'body', headers?: Headers): Observable<any>;
    public deactivateDriver(accessToken: string, driverIdOrExternalId: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<any>>;
    public deactivateDriver(accessToken: string, driverIdOrExternalId: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling deactivateDriver.');
        }

        if (!driverIdOrExternalId){
            throw new Error('Required parameter driverIdOrExternalId was null or undefined when calling deactivateDriver.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<any>> = this.httpClient.delete(`${this.basePath}/fleet/drivers/${encodeURIComponent(String(driverIdOrExternalId))}?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <any>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     * Delete a dispatch route and its associated jobs.
     * @param accessToken Samsara API access token.
     * @param routeId ID of the dispatch route.
     
     */
    public deleteDispatchRouteById(accessToken: string, routeId: number, observe?: 'body', headers?: Headers): Observable<any>;
    public deleteDispatchRouteById(accessToken: string, routeId: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<any>>;
    public deleteDispatchRouteById(accessToken: string, routeId: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling deleteDispatchRouteById.');
        }

        if (!routeId){
            throw new Error('Required parameter routeId was null or undefined when calling deleteDispatchRouteById.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<any>> = this.httpClient.delete(`${this.basePath}/fleet/dispatch/routes/${encodeURIComponent(String(routeId))}?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <any>(httpResponse.response));
        }
        return response;
    }


    /**
     * /addresses/{addressId}
     * Delete an address.
     * @param accessToken Samsara API access token.
     * @param addressId ID of the address/geofence
     
     */
    public deleteOrganizationAddress(accessToken: string, addressId: number, observe?: 'body', headers?: Headers): Observable<any>;
    public deleteOrganizationAddress(accessToken: string, addressId: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<any>>;
    public deleteOrganizationAddress(accessToken: string, addressId: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling deleteOrganizationAddress.');
        }

        if (!addressId){
            throw new Error('Required parameter addressId was null or undefined when calling deleteOrganizationAddress.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<any>> = this.httpClient.delete(`${this.basePath}/addresses/${encodeURIComponent(String(addressId))}?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <any>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/dispatch/routes
     * Fetch all of the dispatch routes for the group.
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     
     */
    public fetchAllDispatchRoutes(accessToken: string, groupId?: number, endTime?: number, duration?: number, observe?: 'body', headers?: Headers): Observable<Array<DispatchRoute>>;
    public fetchAllDispatchRoutes(accessToken: string, groupId?: number, endTime?: number, duration?: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<Array<DispatchRoute>>>;
    public fetchAllDispatchRoutes(accessToken: string, groupId?: number, endTime?: number, duration?: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling fetchAllDispatchRoutes.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }
        if (groupId !== undefined) {
            queryParameters.push("groupId="+encodeURIComponent(String(groupId)));
        }
        if (endTime !== undefined) {
            queryParameters.push("endTime="+encodeURIComponent(String(endTime)));
        }
        if (duration !== undefined) {
            queryParameters.push("duration="+encodeURIComponent(String(duration)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<Array<DispatchRoute>>> = this.httpClient.get(`${this.basePath}/fleet/dispatch/routes?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Array<DispatchRoute>>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/dispatch/routes/job_updates
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
     * @param include Optionally set include&#x3D;route to include route object in response payload.
     
     */
    public fetchAllRouteJobUpdates(accessToken: string, groupId?: number, sequenceId?: string, include?: string, observe?: 'body', headers?: Headers): Observable<AllRouteJobUpdates>;
    public fetchAllRouteJobUpdates(accessToken: string, groupId?: number, sequenceId?: string, include?: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<AllRouteJobUpdates>>;
    public fetchAllRouteJobUpdates(accessToken: string, groupId?: number, sequenceId?: string, include?: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling fetchAllRouteJobUpdates.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }
        if (groupId !== undefined) {
            queryParameters.push("groupId="+encodeURIComponent(String(groupId)));
        }
        if (sequenceId !== undefined) {
            queryParameters.push("sequenceId="+encodeURIComponent(String(sequenceId)));
        }
        if (include !== undefined) {
            queryParameters.push("include="+encodeURIComponent(String(include)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<AllRouteJobUpdates>> = this.httpClient.get(`${this.basePath}/fleet/dispatch/routes/job_updates?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <AllRouteJobUpdates>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/assets/locations
     * Fetch current locations of all assets for the group.
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     
     */
    public getAllAssetCurrentLocations(accessToken: string, groupId?: number, observe?: 'body', headers?: Headers): Observable<InlineResponse2001>;
    public getAllAssetCurrentLocations(accessToken: string, groupId?: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<InlineResponse2001>>;
    public getAllAssetCurrentLocations(accessToken: string, groupId?: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getAllAssetCurrentLocations.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }
        if (groupId !== undefined) {
            queryParameters.push("groupId="+encodeURIComponent(String(groupId)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<InlineResponse2001>> = this.httpClient.get(`${this.basePath}/fleet/assets/locations?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <InlineResponse2001>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/assets
     * Fetch all of the assets for the group.
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     
     */
    public getAllAssets(accessToken: string, groupId?: number, observe?: 'body', headers?: Headers): Observable<InlineResponse200>;
    public getAllAssets(accessToken: string, groupId?: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<InlineResponse200>>;
    public getAllAssets(accessToken: string, groupId?: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getAllAssets.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }
        if (groupId !== undefined) {
            queryParameters.push("groupId="+encodeURIComponent(String(groupId)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<InlineResponse200>> = this.httpClient.get(`${this.basePath}/fleet/assets?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <InlineResponse200>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/drivers/inactive
     * Fetch all deactivated drivers for the group.
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     
     */
    public getAllDeactivatedDrivers(accessToken: string, groupId?: number, observe?: 'body', headers?: Headers): Observable<Array<Driver>>;
    public getAllDeactivatedDrivers(accessToken: string, groupId?: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<Array<Driver>>>;
    public getAllDeactivatedDrivers(accessToken: string, groupId?: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getAllDeactivatedDrivers.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }
        if (groupId !== undefined) {
            queryParameters.push("groupId="+encodeURIComponent(String(groupId)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<Array<Driver>>> = this.httpClient.get(`${this.basePath}/fleet/drivers/inactive?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Array<Driver>>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/assets/{assetId:[0-9]+}/locations
     * Fetch the historical locations for the asset.
     * @param accessToken Samsara API access token.
     * @param assetId ID of the asset
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     
     */
    public getAssetLocation(accessToken: string, assetId: number, startMs: number, endMs: number, observe?: 'body', headers?: Headers): Observable<Array<any>>;
    public getAssetLocation(accessToken: string, assetId: number, startMs: number, endMs: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<Array<any>>>;
    public getAssetLocation(accessToken: string, assetId: number, startMs: number, endMs: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getAssetLocation.');
        }

        if (!assetId){
            throw new Error('Required parameter assetId was null or undefined when calling getAssetLocation.');
        }

        if (!startMs){
            throw new Error('Required parameter startMs was null or undefined when calling getAssetLocation.');
        }

        if (!endMs){
            throw new Error('Required parameter endMs was null or undefined when calling getAssetLocation.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }
        if (startMs !== undefined) {
            queryParameters.push("startMs="+encodeURIComponent(String(startMs)));
        }
        if (endMs !== undefined) {
            queryParameters.push("endMs="+encodeURIComponent(String(endMs)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<Array<any>>> = this.httpClient.get(`${this.basePath}/fleet/assets/${encodeURIComponent(String(assetId))}/locations?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Array<any>>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/assets/{assetId:[0-9]+}/reefer
     * Fetch the reefer-specific stats of an asset.
     * @param accessToken Samsara API access token.
     * @param assetId ID of the asset
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     
     */
    public getAssetReefer(accessToken: string, assetId: number, startMs: number, endMs: number, observe?: 'body', headers?: Headers): Observable<AssetReeferResponse>;
    public getAssetReefer(accessToken: string, assetId: number, startMs: number, endMs: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<AssetReeferResponse>>;
    public getAssetReefer(accessToken: string, assetId: number, startMs: number, endMs: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getAssetReefer.');
        }

        if (!assetId){
            throw new Error('Required parameter assetId was null or undefined when calling getAssetReefer.');
        }

        if (!startMs){
            throw new Error('Required parameter startMs was null or undefined when calling getAssetReefer.');
        }

        if (!endMs){
            throw new Error('Required parameter endMs was null or undefined when calling getAssetReefer.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }
        if (startMs !== undefined) {
            queryParameters.push("startMs="+encodeURIComponent(String(startMs)));
        }
        if (endMs !== undefined) {
            queryParameters.push("endMs="+encodeURIComponent(String(endMs)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<AssetReeferResponse>> = this.httpClient.get(`${this.basePath}/fleet/assets/${encodeURIComponent(String(assetId))}/reefer?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <AssetReeferResponse>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Fetch deactivated driver by id.
     * @param accessToken Samsara API access token.
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     
     */
    public getDeactivatedDriverById(accessToken: string, driverIdOrExternalId: string, observe?: 'body', headers?: Headers): Observable<Driver>;
    public getDeactivatedDriverById(accessToken: string, driverIdOrExternalId: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<Driver>>;
    public getDeactivatedDriverById(accessToken: string, driverIdOrExternalId: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getDeactivatedDriverById.');
        }

        if (!driverIdOrExternalId){
            throw new Error('Required parameter driverIdOrExternalId was null or undefined when calling getDeactivatedDriverById.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<Driver>> = this.httpClient.get(`${this.basePath}/fleet/drivers/inactive/${encodeURIComponent(String(driverIdOrExternalId))}?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Driver>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     * Fetch a dispatch route by id.
     * @param accessToken Samsara API access token.
     * @param routeId ID of the dispatch route.
     
     */
    public getDispatchRouteById(accessToken: string, routeId: number, observe?: 'body', headers?: Headers): Observable<DispatchRoute>;
    public getDispatchRouteById(accessToken: string, routeId: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<DispatchRoute>>;
    public getDispatchRouteById(accessToken: string, routeId: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getDispatchRouteById.');
        }

        if (!routeId){
            throw new Error('Required parameter routeId was null or undefined when calling getDispatchRouteById.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<DispatchRoute>> = this.httpClient.get(`${this.basePath}/fleet/dispatch/routes/${encodeURIComponent(String(routeId))}?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <DispatchRoute>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     * Fetch the history of a dispatch route.
     * @param accessToken Samsara API access token.
     * @param routeId ID of the route with history.
     * @param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
     * @param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
     
     */
    public getDispatchRouteHistory(accessToken: string, routeId: number, startTime?: number, endTime?: number, observe?: 'body', headers?: Headers): Observable<DispatchRouteHistory>;
    public getDispatchRouteHistory(accessToken: string, routeId: number, startTime?: number, endTime?: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<DispatchRouteHistory>>;
    public getDispatchRouteHistory(accessToken: string, routeId: number, startTime?: number, endTime?: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getDispatchRouteHistory.');
        }

        if (!routeId){
            throw new Error('Required parameter routeId was null or undefined when calling getDispatchRouteHistory.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }
        if (startTime !== undefined) {
            queryParameters.push("startTime="+encodeURIComponent(String(startTime)));
        }
        if (endTime !== undefined) {
            queryParameters.push("endTime="+encodeURIComponent(String(endTime)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<DispatchRouteHistory>> = this.httpClient.get(`${this.basePath}/fleet/dispatch/routes/${encodeURIComponent(String(routeId))}/history?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <DispatchRouteHistory>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * Fetch all of the dispatch routes for a given driver.
     * @param accessToken Samsara API access token.
     * @param driverId ID of the driver with the associated routes.
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     
     */
    public getDispatchRoutesByDriverId(accessToken: string, driverId: number, endTime?: number, duration?: number, observe?: 'body', headers?: Headers): Observable<Array<DispatchRoute>>;
    public getDispatchRoutesByDriverId(accessToken: string, driverId: number, endTime?: number, duration?: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<Array<DispatchRoute>>>;
    public getDispatchRoutesByDriverId(accessToken: string, driverId: number, endTime?: number, duration?: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getDispatchRoutesByDriverId.');
        }

        if (!driverId){
            throw new Error('Required parameter driverId was null or undefined when calling getDispatchRoutesByDriverId.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }
        if (endTime !== undefined) {
            queryParameters.push("endTime="+encodeURIComponent(String(endTime)));
        }
        if (duration !== undefined) {
            queryParameters.push("duration="+encodeURIComponent(String(duration)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<Array<DispatchRoute>>> = this.httpClient.get(`${this.basePath}/fleet/drivers/${encodeURIComponent(String(driverId))}/dispatch/routes?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Array<DispatchRoute>>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * Fetch all of the dispatch routes for a given vehicle.
     * @param accessToken Samsara API access token.
     * @param vehicleId ID of the vehicle with the associated routes.
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     
     */
    public getDispatchRoutesByVehicleId(accessToken: string, vehicleId: number, endTime?: number, duration?: number, observe?: 'body', headers?: Headers): Observable<Array<DispatchRoute>>;
    public getDispatchRoutesByVehicleId(accessToken: string, vehicleId: number, endTime?: number, duration?: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<Array<DispatchRoute>>>;
    public getDispatchRoutesByVehicleId(accessToken: string, vehicleId: number, endTime?: number, duration?: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getDispatchRoutesByVehicleId.');
        }

        if (!vehicleId){
            throw new Error('Required parameter vehicleId was null or undefined when calling getDispatchRoutesByVehicleId.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }
        if (endTime !== undefined) {
            queryParameters.push("endTime="+encodeURIComponent(String(endTime)));
        }
        if (duration !== undefined) {
            queryParameters.push("duration="+encodeURIComponent(String(duration)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<Array<DispatchRoute>>> = this.httpClient.get(`${this.basePath}/fleet/vehicles/${encodeURIComponent(String(vehicleId))}/dispatch/routes?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Array<DispatchRoute>>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Fetch driver by id.
     * @param accessToken Samsara API access token.
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     
     */
    public getDriverById(accessToken: string, driverIdOrExternalId: string, observe?: 'body', headers?: Headers): Observable<Driver>;
    public getDriverById(accessToken: string, driverIdOrExternalId: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<Driver>>;
    public getDriverById(accessToken: string, driverIdOrExternalId: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getDriverById.');
        }

        if (!driverIdOrExternalId){
            throw new Error('Required parameter driverIdOrExternalId was null or undefined when calling getDriverById.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<Driver>> = this.httpClient.get(`${this.basePath}/fleet/drivers/${encodeURIComponent(String(driverIdOrExternalId))}?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Driver>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/drivers/document_types
     * Fetch all of the document types.
     
     */
    public getDriverDocumentTypesByOrgId(observe?: 'body', headers?: Headers): Observable<Array<DocumentType>>;
    public getDriverDocumentTypesByOrgId(observe?: 'response', headers?: Headers): Observable<HttpResponse<Array<DocumentType>>>;
    public getDriverDocumentTypesByOrgId(observe: any = 'body', headers: Headers = {}): Observable<any> {
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<Array<DocumentType>>> = this.httpClient.get(`${this.basePath}/fleet/drivers/document_types`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Array<DocumentType>>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/drivers/documents
     * Fetch all of the documents.
     * @param accessToken Samsara API access token.
     * @param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
     * @param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
     
     */
    public getDriverDocumentsByOrgId(accessToken: string, endMs?: number, durationMs?: number, observe?: 'body', headers?: Headers): Observable<Array<Document>>;
    public getDriverDocumentsByOrgId(accessToken: string, endMs?: number, durationMs?: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<Array<Document>>>;
    public getDriverDocumentsByOrgId(accessToken: string, endMs?: number, durationMs?: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getDriverDocumentsByOrgId.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }
        if (endMs !== undefined) {
            queryParameters.push("endMs="+encodeURIComponent(String(endMs)));
        }
        if (durationMs !== undefined) {
            queryParameters.push("durationMs="+encodeURIComponent(String(durationMs)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<Array<Document>>> = this.httpClient.get(`${this.basePath}/fleet/drivers/documents?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Array<Document>>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     * Fetch the safety score for the driver.
     * @param driverId ID of the driver
     * @param accessToken Samsara API access token.
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     
     */
    public getDriverSafetyScore(driverId: number, accessToken: string, startMs: number, endMs: number, observe?: 'body', headers?: Headers): Observable<DriverSafetyScoreResponse>;
    public getDriverSafetyScore(driverId: number, accessToken: string, startMs: number, endMs: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<DriverSafetyScoreResponse>>;
    public getDriverSafetyScore(driverId: number, accessToken: string, startMs: number, endMs: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!driverId){
            throw new Error('Required parameter driverId was null or undefined when calling getDriverSafetyScore.');
        }

        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getDriverSafetyScore.');
        }

        if (!startMs){
            throw new Error('Required parameter startMs was null or undefined when calling getDriverSafetyScore.');
        }

        if (!endMs){
            throw new Error('Required parameter endMs was null or undefined when calling getDriverSafetyScore.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }
        if (startMs !== undefined) {
            queryParameters.push("startMs="+encodeURIComponent(String(startMs)));
        }
        if (endMs !== undefined) {
            queryParameters.push("endMs="+encodeURIComponent(String(endMs)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<DriverSafetyScoreResponse>> = this.httpClient.get(`${this.basePath}/fleet/drivers/${encodeURIComponent(String(driverId))}/safety/score?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <DriverSafetyScoreResponse>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/maintenance/dvirs
     * Get DVIRs for the org within provided time constraints
     * @param accessToken Samsara API access token.
     * @param endMs time in millis until the last dvir log.
     * @param durationMs time in millis which corresponds to the duration before the end_ms.
     * @param groupId Group ID to query.
     
     */
    public getDvirs(accessToken: string, endMs: number, durationMs: number, groupId?: number, observe?: 'body', headers?: Headers): Observable<DvirListResponse>;
    public getDvirs(accessToken: string, endMs: number, durationMs: number, groupId?: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<DvirListResponse>>;
    public getDvirs(accessToken: string, endMs: number, durationMs: number, groupId?: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getDvirs.');
        }

        if (!endMs){
            throw new Error('Required parameter endMs was null or undefined when calling getDvirs.');
        }

        if (!durationMs){
            throw new Error('Required parameter durationMs was null or undefined when calling getDvirs.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }
        if (endMs !== undefined) {
            queryParameters.push("endMs="+encodeURIComponent(String(endMs)));
        }
        if (durationMs !== undefined) {
            queryParameters.push("durationMs="+encodeURIComponent(String(durationMs)));
        }
        if (groupId !== undefined) {
            queryParameters.push("groupId="+encodeURIComponent(String(groupId)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<DvirListResponse>> = this.httpClient.get(`${this.basePath}/fleet/maintenance/dvirs?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <DvirListResponse>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/drivers
     * Get all the drivers for the specified group.
     * @param accessToken Samsara API access token.
     * @param groupDriversParam 
     
     */
    public getFleetDrivers(accessToken: string, groupDriversParam: InlineObject3, observe?: 'body', headers?: Headers): Observable<DriversResponse>;
    public getFleetDrivers(accessToken: string, groupDriversParam: InlineObject3, observe?: 'response', headers?: Headers): Observable<HttpResponse<DriversResponse>>;
    public getFleetDrivers(accessToken: string, groupDriversParam: InlineObject3, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetDrivers.');
        }

        if (!groupDriversParam){
            throw new Error('Required parameter groupDriversParam was null or undefined when calling getFleetDrivers.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<DriversResponse>> = this.httpClient.post(`${this.basePath}/fleet/drivers?${queryParameters.join('&')}`, groupDriversParam , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <DriversResponse>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     * Get summarized daily HOS charts for a specified driver.
     * @param accessToken Samsara API access token.
     * @param driverId ID of the driver with HOS logs.
     * @param hosLogsParam 
     
     */
    public getFleetDriversHosDailyLogs(accessToken: string, driverId: number, hosLogsParam: InlineObject6, observe?: 'body', headers?: Headers): Observable<DriverDailyLogResponse>;
    public getFleetDriversHosDailyLogs(accessToken: string, driverId: number, hosLogsParam: InlineObject6, observe?: 'response', headers?: Headers): Observable<HttpResponse<DriverDailyLogResponse>>;
    public getFleetDriversHosDailyLogs(accessToken: string, driverId: number, hosLogsParam: InlineObject6, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetDriversHosDailyLogs.');
        }

        if (!driverId){
            throw new Error('Required parameter driverId was null or undefined when calling getFleetDriversHosDailyLogs.');
        }

        if (!hosLogsParam){
            throw new Error('Required parameter hosLogsParam was null or undefined when calling getFleetDriversHosDailyLogs.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<DriverDailyLogResponse>> = this.httpClient.post(`${this.basePath}/fleet/drivers/${encodeURIComponent(String(driverId))}/hos_daily_logs?${queryParameters.join('&')}`, hosLogsParam , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <DriverDailyLogResponse>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/drivers/summary
     * Get the distance and time each driver in an organization has driven in a given time period.
     * @param accessToken Samsara API access token.
     * @param driversSummaryParam 
     * @param snapToDayBounds Snap query result to HOS day boundaries.
     
     */
    public getFleetDriversSummary(accessToken: string, driversSummaryParam: InlineObject5, snapToDayBounds?: boolean, observe?: 'body', headers?: Headers): Observable<DriversSummaryResponse>;
    public getFleetDriversSummary(accessToken: string, driversSummaryParam: InlineObject5, snapToDayBounds?: boolean, observe?: 'response', headers?: Headers): Observable<HttpResponse<DriversSummaryResponse>>;
    public getFleetDriversSummary(accessToken: string, driversSummaryParam: InlineObject5, snapToDayBounds?: boolean, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetDriversSummary.');
        }

        if (!driversSummaryParam){
            throw new Error('Required parameter driversSummaryParam was null or undefined when calling getFleetDriversSummary.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }
        if (snapToDayBounds !== undefined) {
            queryParameters.push("snapToDayBounds="+encodeURIComponent(String(snapToDayBounds)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<DriversSummaryResponse>> = this.httpClient.post(`${this.basePath}/fleet/drivers/summary?${queryParameters.join('&')}`, driversSummaryParam , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <DriversSummaryResponse>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/hos_authentication_logs
     * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
     * @param accessToken Samsara API access token.
     * @param hosAuthenticationLogsParam 
     
     */
    public getFleetHosAuthenticationLogs(accessToken: string, hosAuthenticationLogsParam: InlineObject7, observe?: 'body', headers?: Headers): Observable<HosAuthenticationLogsResponse>;
    public getFleetHosAuthenticationLogs(accessToken: string, hosAuthenticationLogsParam: InlineObject7, observe?: 'response', headers?: Headers): Observable<HttpResponse<HosAuthenticationLogsResponse>>;
    public getFleetHosAuthenticationLogs(accessToken: string, hosAuthenticationLogsParam: InlineObject7, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetHosAuthenticationLogs.');
        }

        if (!hosAuthenticationLogsParam){
            throw new Error('Required parameter hosAuthenticationLogsParam was null or undefined when calling getFleetHosAuthenticationLogs.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<HosAuthenticationLogsResponse>> = this.httpClient.post(`${this.basePath}/fleet/hos_authentication_logs?${queryParameters.join('&')}`, hosAuthenticationLogsParam , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <HosAuthenticationLogsResponse>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/hos_logs
     * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
     * @param accessToken Samsara API access token.
     * @param hosLogsParam 
     
     */
    public getFleetHosLogs(accessToken: string, hosLogsParam: InlineObject8, observe?: 'body', headers?: Headers): Observable<HosLogsResponse>;
    public getFleetHosLogs(accessToken: string, hosLogsParam: InlineObject8, observe?: 'response', headers?: Headers): Observable<HttpResponse<HosLogsResponse>>;
    public getFleetHosLogs(accessToken: string, hosLogsParam: InlineObject8, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetHosLogs.');
        }

        if (!hosLogsParam){
            throw new Error('Required parameter hosLogsParam was null or undefined when calling getFleetHosLogs.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<HosLogsResponse>> = this.httpClient.post(`${this.basePath}/fleet/hos_logs?${queryParameters.join('&')}`, hosLogsParam , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <HosLogsResponse>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/hos_logs_summary
     * Get the current HOS status for all drivers in the group.
     * @param accessToken Samsara API access token.
     * @param hosLogsParam 
     
     */
    public getFleetHosLogsSummary(accessToken: string, hosLogsParam: InlineObject9, observe?: 'body', headers?: Headers): Observable<HosLogsSummaryResponse>;
    public getFleetHosLogsSummary(accessToken: string, hosLogsParam: InlineObject9, observe?: 'response', headers?: Headers): Observable<HttpResponse<HosLogsSummaryResponse>>;
    public getFleetHosLogsSummary(accessToken: string, hosLogsParam: InlineObject9, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetHosLogsSummary.');
        }

        if (!hosLogsParam){
            throw new Error('Required parameter hosLogsParam was null or undefined when calling getFleetHosLogsSummary.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<HosLogsSummaryResponse>> = this.httpClient.post(`${this.basePath}/fleet/hos_logs_summary?${queryParameters.join('&')}`, hosLogsParam , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <HosLogsSummaryResponse>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/locations
     * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
     * @param accessToken Samsara API access token.
     * @param groupParam 
     
     */
    public getFleetLocations(accessToken: string, groupParam: InlineObject11, observe?: 'body', headers?: Headers): Observable<InlineResponse2003>;
    public getFleetLocations(accessToken: string, groupParam: InlineObject11, observe?: 'response', headers?: Headers): Observable<HttpResponse<InlineResponse2003>>;
    public getFleetLocations(accessToken: string, groupParam: InlineObject11, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetLocations.');
        }

        if (!groupParam){
            throw new Error('Required parameter groupParam was null or undefined when calling getFleetLocations.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<InlineResponse2003>> = this.httpClient.post(`${this.basePath}/fleet/locations?${queryParameters.join('&')}`, groupParam , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <InlineResponse2003>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/maintenance/list
     * Get list of the vehicles with any engine faults or check light data.
     * @param accessToken Samsara API access token.
     * @param groupParam 
     
     */
    public getFleetMaintenanceList(accessToken: string, groupParam: InlineObject13, observe?: 'body', headers?: Headers): Observable<InlineResponse2004>;
    public getFleetMaintenanceList(accessToken: string, groupParam: InlineObject13, observe?: 'response', headers?: Headers): Observable<HttpResponse<InlineResponse2004>>;
    public getFleetMaintenanceList(accessToken: string, groupParam: InlineObject13, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetMaintenanceList.');
        }

        if (!groupParam){
            throw new Error('Required parameter groupParam was null or undefined when calling getFleetMaintenanceList.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<InlineResponse2004>> = this.httpClient.post(`${this.basePath}/fleet/maintenance/list?${queryParameters.join('&')}`, groupParam , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <InlineResponse2004>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/trips
     * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
     * @param accessToken Samsara API access token.
     * @param tripsParam 
     
     */
    public getFleetTrips(accessToken: string, tripsParam: InlineObject15, observe?: 'body', headers?: Headers): Observable<TripResponse>;
    public getFleetTrips(accessToken: string, tripsParam: InlineObject15, observe?: 'response', headers?: Headers): Observable<HttpResponse<TripResponse>>;
    public getFleetTrips(accessToken: string, tripsParam: InlineObject15, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetTrips.');
        }

        if (!tripsParam){
            throw new Error('Required parameter tripsParam was null or undefined when calling getFleetTrips.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<TripResponse>> = this.httpClient.post(`${this.basePath}/fleet/trips?${queryParameters.join('&')}`, tripsParam , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <TripResponse>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Gets a specific vehicle.
     * @param accessToken Samsara API access token.
     * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
     
     */
    public getFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, observe?: 'body', headers?: Headers): Observable<FleetVehicleResponse>;
    public getFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<FleetVehicleResponse>>;
    public getFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetVehicle.');
        }

        if (!vehicleIdOrExternalId){
            throw new Error('Required parameter vehicleIdOrExternalId was null or undefined when calling getFleetVehicle.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<FleetVehicleResponse>> = this.httpClient.get(`${this.basePath}/fleet/vehicles/${encodeURIComponent(String(vehicleIdOrExternalId))}?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <FleetVehicleResponse>(httpResponse.response));
        }
        return response;
    }


    /**
     * /addresses/{addressId}
     * Fetch an address by its id.
     * @param accessToken Samsara API access token.
     * @param addressId ID of the address/geofence
     
     */
    public getOrganizationAddress(accessToken: string, addressId: number, observe?: 'body', headers?: Headers): Observable<Address>;
    public getOrganizationAddress(accessToken: string, addressId: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<Address>>;
    public getOrganizationAddress(accessToken: string, addressId: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getOrganizationAddress.');
        }

        if (!addressId){
            throw new Error('Required parameter addressId was null or undefined when calling getOrganizationAddress.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<Address>> = this.httpClient.get(`${this.basePath}/addresses/${encodeURIComponent(String(addressId))}?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Address>(httpResponse.response));
        }
        return response;
    }


    /**
     * /addresses
     * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
     * @param accessToken Samsara API access token.
     
     */
    public getOrganizationAddresses(accessToken: string, observe?: 'body', headers?: Headers): Observable<Array<Address>>;
    public getOrganizationAddresses(accessToken: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<Array<Address>>>;
    public getOrganizationAddresses(accessToken: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getOrganizationAddresses.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<Array<Address>>> = this.httpClient.get(`${this.basePath}/addresses?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Array<Address>>(httpResponse.response));
        }
        return response;
    }


    /**
     * /contacts/{contact_id}
     * Fetch a contact by its id.
     * @param accessToken Samsara API access token.
     * @param contactId ID of the contact
     
     */
    public getOrganizationContact(accessToken: string, contactId: number, observe?: 'body', headers?: Headers): Observable<Contact>;
    public getOrganizationContact(accessToken: string, contactId: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<Contact>>;
    public getOrganizationContact(accessToken: string, contactId: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getOrganizationContact.');
        }

        if (!contactId){
            throw new Error('Required parameter contactId was null or undefined when calling getOrganizationContact.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<Contact>> = this.httpClient.get(`${this.basePath}/contacts/${encodeURIComponent(String(contactId))}?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Contact>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     * Fetch harsh event details for a vehicle.
     * @param vehicleId ID of the vehicle
     * @param accessToken Samsara API access token.
     * @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event.
     
     */
    public getVehicleHarshEvent(vehicleId: number, accessToken: string, timestamp: number, observe?: 'body', headers?: Headers): Observable<VehicleHarshEventResponse>;
    public getVehicleHarshEvent(vehicleId: number, accessToken: string, timestamp: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<VehicleHarshEventResponse>>;
    public getVehicleHarshEvent(vehicleId: number, accessToken: string, timestamp: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!vehicleId){
            throw new Error('Required parameter vehicleId was null or undefined when calling getVehicleHarshEvent.');
        }

        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getVehicleHarshEvent.');
        }

        if (!timestamp){
            throw new Error('Required parameter timestamp was null or undefined when calling getVehicleHarshEvent.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }
        if (timestamp !== undefined) {
            queryParameters.push("timestamp="+encodeURIComponent(String(timestamp)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<VehicleHarshEventResponse>> = this.httpClient.get(`${this.basePath}/fleet/vehicles/${encodeURIComponent(String(vehicleId))}/safety/harsh_event?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <VehicleHarshEventResponse>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
     * @param accessToken Samsara API access token.
     * @param vehicleId ID of the vehicle with the associated routes.
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
     
     */
    public getVehicleLocations(accessToken: string, vehicleId: number, startMs: number, endMs: number, observe?: 'body', headers?: Headers): Observable<Array<FleetVehicleLocation>>;
    public getVehicleLocations(accessToken: string, vehicleId: number, startMs: number, endMs: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<Array<FleetVehicleLocation>>>;
    public getVehicleLocations(accessToken: string, vehicleId: number, startMs: number, endMs: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getVehicleLocations.');
        }

        if (!vehicleId){
            throw new Error('Required parameter vehicleId was null or undefined when calling getVehicleLocations.');
        }

        if (!startMs){
            throw new Error('Required parameter startMs was null or undefined when calling getVehicleLocations.');
        }

        if (!endMs){
            throw new Error('Required parameter endMs was null or undefined when calling getVehicleLocations.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }
        if (startMs !== undefined) {
            queryParameters.push("startMs="+encodeURIComponent(String(startMs)));
        }
        if (endMs !== undefined) {
            queryParameters.push("endMs="+encodeURIComponent(String(endMs)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<Array<FleetVehicleLocation>>> = this.httpClient.get(`${this.basePath}/fleet/vehicles/${encodeURIComponent(String(vehicleId))}/locations?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Array<FleetVehicleLocation>>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     * Fetch the safety score for the vehicle.
     * @param vehicleId ID of the vehicle
     * @param accessToken Samsara API access token.
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     
     */
    public getVehicleSafetyScore(vehicleId: number, accessToken: string, startMs: number, endMs: number, observe?: 'body', headers?: Headers): Observable<VehicleSafetyScoreResponse>;
    public getVehicleSafetyScore(vehicleId: number, accessToken: string, startMs: number, endMs: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<VehicleSafetyScoreResponse>>;
    public getVehicleSafetyScore(vehicleId: number, accessToken: string, startMs: number, endMs: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!vehicleId){
            throw new Error('Required parameter vehicleId was null or undefined when calling getVehicleSafetyScore.');
        }

        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getVehicleSafetyScore.');
        }

        if (!startMs){
            throw new Error('Required parameter startMs was null or undefined when calling getVehicleSafetyScore.');
        }

        if (!endMs){
            throw new Error('Required parameter endMs was null or undefined when calling getVehicleSafetyScore.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }
        if (startMs !== undefined) {
            queryParameters.push("startMs="+encodeURIComponent(String(startMs)));
        }
        if (endMs !== undefined) {
            queryParameters.push("endMs="+encodeURIComponent(String(endMs)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<VehicleSafetyScoreResponse>> = this.httpClient.get(`${this.basePath}/fleet/vehicles/${encodeURIComponent(String(vehicleId))}/safety/score?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <VehicleSafetyScoreResponse>(httpResponse.response));
        }
        return response;
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
     
     */
    public getVehicleStats(accessToken: string, startMs: number, endMs: number, series?: 'engineState' | 'auxInput1' | 'auxInput2', tagIds?: string, startingAfter?: string, endingBefore?: string, limit?: number, observe?: 'body', headers?: Headers): Observable<InlineResponse2005>;
    public getVehicleStats(accessToken: string, startMs: number, endMs: number, series?: 'engineState' | 'auxInput1' | 'auxInput2', tagIds?: string, startingAfter?: string, endingBefore?: string, limit?: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<InlineResponse2005>>;
    public getVehicleStats(accessToken: string, startMs: number, endMs: number, series?: 'engineState' | 'auxInput1' | 'auxInput2', tagIds?: string, startingAfter?: string, endingBefore?: string, limit?: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getVehicleStats.');
        }

        if (!startMs){
            throw new Error('Required parameter startMs was null or undefined when calling getVehicleStats.');
        }

        if (!endMs){
            throw new Error('Required parameter endMs was null or undefined when calling getVehicleStats.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }
        if (startMs !== undefined) {
            queryParameters.push("startMs="+encodeURIComponent(String(startMs)));
        }
        if (endMs !== undefined) {
            queryParameters.push("endMs="+encodeURIComponent(String(endMs)));
        }
        if (series !== undefined) {
            queryParameters.push("series="+encodeURIComponent(String(series)));
        }
        if (tagIds !== undefined) {
            queryParameters.push("tagIds="+encodeURIComponent(String(tagIds)));
        }
        if (startingAfter !== undefined) {
            queryParameters.push("startingAfter="+encodeURIComponent(String(startingAfter)));
        }
        if (endingBefore !== undefined) {
            queryParameters.push("endingBefore="+encodeURIComponent(String(endingBefore)));
        }
        if (limit !== undefined) {
            queryParameters.push("limit="+encodeURIComponent(String(limit)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<InlineResponse2005>> = this.httpClient.get(`${this.basePath}/fleet/vehicles/stats?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <InlineResponse2005>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/vehicles/locations
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
     * @param accessToken Samsara API access token.
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
     
     */
    public getVehiclesLocations(accessToken: string, startMs: number, endMs: number, observe?: 'body', headers?: Headers): Observable<Array<any>>;
    public getVehiclesLocations(accessToken: string, startMs: number, endMs: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<Array<any>>>;
    public getVehiclesLocations(accessToken: string, startMs: number, endMs: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getVehiclesLocations.');
        }

        if (!startMs){
            throw new Error('Required parameter startMs was null or undefined when calling getVehiclesLocations.');
        }

        if (!endMs){
            throw new Error('Required parameter endMs was null or undefined when calling getVehiclesLocations.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }
        if (startMs !== undefined) {
            queryParameters.push("startMs="+encodeURIComponent(String(startMs)));
        }
        if (endMs !== undefined) {
            queryParameters.push("endMs="+encodeURIComponent(String(endMs)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<Array<any>>> = this.httpClient.get(`${this.basePath}/fleet/vehicles/locations?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Array<any>>(httpResponse.response));
        }
        return response;
    }


    /**
     * /contacts
     * Fetch all contacts for the organization.
     * @param accessToken Samsara API access token.
     
     */
    public listContacts(accessToken: string, observe?: 'body', headers?: Headers): Observable<Array<Contact>>;
    public listContacts(accessToken: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<Array<Contact>>>;
    public listContacts(accessToken: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling listContacts.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<Array<Contact>>> = this.httpClient.get(`${this.basePath}/contacts?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Array<Contact>>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/list
     * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
     * @param accessToken Samsara API access token.
     * @param groupParam 
     * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
     * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
     * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
     
     */
    public listFleet(accessToken: string, groupParam: InlineObject10, startingAfter?: string, endingBefore?: string, limit?: number, observe?: 'body', headers?: Headers): Observable<InlineResponse2002>;
    public listFleet(accessToken: string, groupParam: InlineObject10, startingAfter?: string, endingBefore?: string, limit?: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<InlineResponse2002>>;
    public listFleet(accessToken: string, groupParam: InlineObject10, startingAfter?: string, endingBefore?: string, limit?: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling listFleet.');
        }

        if (!groupParam){
            throw new Error('Required parameter groupParam was null or undefined when calling listFleet.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }
        if (startingAfter !== undefined) {
            queryParameters.push("startingAfter="+encodeURIComponent(String(startingAfter)));
        }
        if (endingBefore !== undefined) {
            queryParameters.push("endingBefore="+encodeURIComponent(String(endingBefore)));
        }
        if (limit !== undefined) {
            queryParameters.push("limit="+encodeURIComponent(String(limit)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<InlineResponse2002>> = this.httpClient.post(`${this.basePath}/fleet/list?${queryParameters.join('&')}`, groupParam , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <InlineResponse2002>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
     * @param accessToken Samsara API access token.
     * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
     * @param data 
     
     */
    public patchFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, data: InlineObject16, observe?: 'body', headers?: Headers): Observable<FleetVehicleResponse>;
    public patchFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, data: InlineObject16, observe?: 'response', headers?: Headers): Observable<HttpResponse<FleetVehicleResponse>>;
    public patchFleetVehicle(accessToken: string, vehicleIdOrExternalId: string, data: InlineObject16, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling patchFleetVehicle.');
        }

        if (!vehicleIdOrExternalId){
            throw new Error('Required parameter vehicleIdOrExternalId was null or undefined when calling patchFleetVehicle.');
        }

        if (!data){
            throw new Error('Required parameter data was null or undefined when calling patchFleetVehicle.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<FleetVehicleResponse>> = this.httpClient.patch(`${this.basePath}/fleet/vehicles/${encodeURIComponent(String(vehicleIdOrExternalId))}?${queryParameters.join('&')}`, data , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <FleetVehicleResponse>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Reactivate the inactive driver having id.
     * @param accessToken Samsara API access token.
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param reactivateDriverParam 
     
     */
    public reactivateDriverById(accessToken: string, driverIdOrExternalId: string, reactivateDriverParam: InlineObject4, observe?: 'body', headers?: Headers): Observable<Driver>;
    public reactivateDriverById(accessToken: string, driverIdOrExternalId: string, reactivateDriverParam: InlineObject4, observe?: 'response', headers?: Headers): Observable<HttpResponse<Driver>>;
    public reactivateDriverById(accessToken: string, driverIdOrExternalId: string, reactivateDriverParam: InlineObject4, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling reactivateDriverById.');
        }

        if (!driverIdOrExternalId){
            throw new Error('Required parameter driverIdOrExternalId was null or undefined when calling reactivateDriverById.');
        }

        if (!reactivateDriverParam){
            throw new Error('Required parameter reactivateDriverParam was null or undefined when calling reactivateDriverById.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<Driver>> = this.httpClient.put(`${this.basePath}/fleet/drivers/inactive/${encodeURIComponent(String(driverIdOrExternalId))}?${queryParameters.join('&')}`, reactivateDriverParam , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Driver>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     * Update a dispatch route and its associated jobs.
     * @param accessToken Samsara API access token.
     * @param routeId ID of the dispatch route.
     * @param updateDispatchRouteParams 
     
     */
    public updateDispatchRouteById(accessToken: string, routeId: number, updateDispatchRouteParams: DispatchRoute, observe?: 'body', headers?: Headers): Observable<DispatchRoute>;
    public updateDispatchRouteById(accessToken: string, routeId: number, updateDispatchRouteParams: DispatchRoute, observe?: 'response', headers?: Headers): Observable<HttpResponse<DispatchRoute>>;
    public updateDispatchRouteById(accessToken: string, routeId: number, updateDispatchRouteParams: DispatchRoute, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling updateDispatchRouteById.');
        }

        if (!routeId){
            throw new Error('Required parameter routeId was null or undefined when calling updateDispatchRouteById.');
        }

        if (!updateDispatchRouteParams){
            throw new Error('Required parameter updateDispatchRouteParams was null or undefined when calling updateDispatchRouteById.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<DispatchRoute>> = this.httpClient.put(`${this.basePath}/fleet/dispatch/routes/${encodeURIComponent(String(routeId))}?${queryParameters.join('&')}`, updateDispatchRouteParams , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <DispatchRoute>(httpResponse.response));
        }
        return response;
    }


    /**
     * /addresses/{addressId}
     * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
     * @param accessToken Samsara API access token.
     * @param addressId ID of the address/geofence
     * @param address 
     
     */
    public updateOrganizationAddress(accessToken: string, addressId: number, address: InlineObject1, observe?: 'body', headers?: Headers): Observable<any>;
    public updateOrganizationAddress(accessToken: string, addressId: number, address: InlineObject1, observe?: 'response', headers?: Headers): Observable<HttpResponse<any>>;
    public updateOrganizationAddress(accessToken: string, addressId: number, address: InlineObject1, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling updateOrganizationAddress.');
        }

        if (!addressId){
            throw new Error('Required parameter addressId was null or undefined when calling updateOrganizationAddress.');
        }

        if (!address){
            throw new Error('Required parameter address was null or undefined when calling updateOrganizationAddress.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<any>> = this.httpClient.patch(`${this.basePath}/addresses/${encodeURIComponent(String(addressId))}?${queryParameters.join('&')}`, address , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <any>(httpResponse.response));
        }
        return response;
    }


    /**
     * /fleet/set_data
     * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
     * @param accessToken Samsara API access token.
     * @param vehicleUpdateParam 
     
     */
    public updateVehicles(accessToken: string, vehicleUpdateParam: InlineObject14, observe?: 'body', headers?: Headers): Observable<any>;
    public updateVehicles(accessToken: string, vehicleUpdateParam: InlineObject14, observe?: 'response', headers?: Headers): Observable<HttpResponse<any>>;
    public updateVehicles(accessToken: string, vehicleUpdateParam: InlineObject14, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling updateVehicles.');
        }

        if (!vehicleUpdateParam){
            throw new Error('Required parameter vehicleUpdateParam was null or undefined when calling updateVehicles.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<any>> = this.httpClient.post(`${this.basePath}/fleet/set_data?${queryParameters.join('&')}`, vehicleUpdateParam , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <any>(httpResponse.response));
        }
        return response;
    }

}
