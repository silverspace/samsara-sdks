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

import { Driver } from '../model/driver';
import { DriverForCreate } from '../model/driverForCreate';
import { InlineObject4 } from '../model/inlineObject4';

import { COLLECTION_FORMATS }  from '../variables';



@injectable()
export class DriversService {
    private basePath: string = 'https://api.samsara.com/v1';

    constructor(@inject("IApiHttpClient") private httpClient: IHttpClient,
        @inject("IAPIConfiguration") private APIConfiguration: IAPIConfiguration ) {
        if(this.APIConfiguration.basePath)
            this.basePath = this.APIConfiguration.basePath;
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

}
