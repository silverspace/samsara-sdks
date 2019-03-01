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

import { CargoResponse } from '../model/cargoResponse';
import { DoorResponse } from '../model/doorResponse';
import { HumidityResponse } from '../model/humidityResponse';
import { InlineObject19 } from '../model/inlineObject19';
import { InlineObject20 } from '../model/inlineObject20';
import { InlineObject21 } from '../model/inlineObject21';
import { InlineObject22 } from '../model/inlineObject22';
import { InlineObject23 } from '../model/inlineObject23';
import { InlineObject24 } from '../model/inlineObject24';
import { InlineResponse2008 } from '../model/inlineResponse2008';
import { SensorHistoryResponse } from '../model/sensorHistoryResponse';
import { TemperatureResponse } from '../model/temperatureResponse';

import { COLLECTION_FORMATS }  from '../variables';



@injectable()
export class SensorsService {
    private basePath: string = 'https://api.samsara.com/v1';

    constructor(@inject("IApiHttpClient") private httpClient: IHttpClient,
        @inject("IAPIConfiguration") private APIConfiguration: IAPIConfiguration ) {
        if(this.APIConfiguration.basePath)
            this.basePath = this.APIConfiguration.basePath;
    }

    /**
     * /sensors/list
     * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
     * @param accessToken Samsara API access token.
     * @param groupParam 
     
     */
    public getSensors(accessToken: string, groupParam: InlineObject23, observe?: 'body', headers?: Headers): Observable<InlineResponse2008>;
    public getSensors(accessToken: string, groupParam: InlineObject23, observe?: 'response', headers?: Headers): Observable<HttpResponse<InlineResponse2008>>;
    public getSensors(accessToken: string, groupParam: InlineObject23, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getSensors.');
        }

        if (!groupParam){
            throw new Error('Required parameter groupParam was null or undefined when calling getSensors.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<InlineResponse2008>> = this.httpClient.post(`${this.basePath}/sensors/list?${queryParameters.join('&')}`, groupParam , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <InlineResponse2008>(httpResponse.response));
        }
        return response;
    }


    /**
     * /sensors/cargo
     * Get cargo monitor status (empty / full) for requested sensors.
     * @param accessToken Samsara API access token.
     * @param sensorParam 
     
     */
    public getSensorsCargo(accessToken: string, sensorParam: InlineObject19, observe?: 'body', headers?: Headers): Observable<CargoResponse>;
    public getSensorsCargo(accessToken: string, sensorParam: InlineObject19, observe?: 'response', headers?: Headers): Observable<HttpResponse<CargoResponse>>;
    public getSensorsCargo(accessToken: string, sensorParam: InlineObject19, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getSensorsCargo.');
        }

        if (!sensorParam){
            throw new Error('Required parameter sensorParam was null or undefined when calling getSensorsCargo.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<CargoResponse>> = this.httpClient.post(`${this.basePath}/sensors/cargo?${queryParameters.join('&')}`, sensorParam , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <CargoResponse>(httpResponse.response));
        }
        return response;
    }


    /**
     * /sensors/door
     * Get door monitor status (closed / open) for requested sensors.
     * @param accessToken Samsara API access token.
     * @param sensorParam 
     
     */
    public getSensorsDoor(accessToken: string, sensorParam: InlineObject20, observe?: 'body', headers?: Headers): Observable<DoorResponse>;
    public getSensorsDoor(accessToken: string, sensorParam: InlineObject20, observe?: 'response', headers?: Headers): Observable<HttpResponse<DoorResponse>>;
    public getSensorsDoor(accessToken: string, sensorParam: InlineObject20, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getSensorsDoor.');
        }

        if (!sensorParam){
            throw new Error('Required parameter sensorParam was null or undefined when calling getSensorsDoor.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<DoorResponse>> = this.httpClient.post(`${this.basePath}/sensors/door?${queryParameters.join('&')}`, sensorParam , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <DoorResponse>(httpResponse.response));
        }
        return response;
    }


    /**
     * /sensors/history
     * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
     * @param accessToken Samsara API access token.
     * @param historyParam 
     
     */
    public getSensorsHistory(accessToken: string, historyParam: InlineObject21, observe?: 'body', headers?: Headers): Observable<SensorHistoryResponse>;
    public getSensorsHistory(accessToken: string, historyParam: InlineObject21, observe?: 'response', headers?: Headers): Observable<HttpResponse<SensorHistoryResponse>>;
    public getSensorsHistory(accessToken: string, historyParam: InlineObject21, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getSensorsHistory.');
        }

        if (!historyParam){
            throw new Error('Required parameter historyParam was null or undefined when calling getSensorsHistory.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<SensorHistoryResponse>> = this.httpClient.post(`${this.basePath}/sensors/history?${queryParameters.join('&')}`, historyParam , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <SensorHistoryResponse>(httpResponse.response));
        }
        return response;
    }


    /**
     * /sensors/humidity
     * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
     * @param accessToken Samsara API access token.
     * @param sensorParam 
     
     */
    public getSensorsHumidity(accessToken: string, sensorParam: InlineObject22, observe?: 'body', headers?: Headers): Observable<HumidityResponse>;
    public getSensorsHumidity(accessToken: string, sensorParam: InlineObject22, observe?: 'response', headers?: Headers): Observable<HttpResponse<HumidityResponse>>;
    public getSensorsHumidity(accessToken: string, sensorParam: InlineObject22, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getSensorsHumidity.');
        }

        if (!sensorParam){
            throw new Error('Required parameter sensorParam was null or undefined when calling getSensorsHumidity.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<HumidityResponse>> = this.httpClient.post(`${this.basePath}/sensors/humidity?${queryParameters.join('&')}`, sensorParam , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <HumidityResponse>(httpResponse.response));
        }
        return response;
    }


    /**
     * /sensors/temperature
     * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
     * @param accessToken Samsara API access token.
     * @param sensorParam 
     
     */
    public getSensorsTemperature(accessToken: string, sensorParam: InlineObject24, observe?: 'body', headers?: Headers): Observable<TemperatureResponse>;
    public getSensorsTemperature(accessToken: string, sensorParam: InlineObject24, observe?: 'response', headers?: Headers): Observable<HttpResponse<TemperatureResponse>>;
    public getSensorsTemperature(accessToken: string, sensorParam: InlineObject24, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getSensorsTemperature.');
        }

        if (!sensorParam){
            throw new Error('Required parameter sensorParam was null or undefined when calling getSensorsTemperature.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<TemperatureResponse>> = this.httpClient.post(`${this.basePath}/sensors/temperature?${queryParameters.join('&')}`, sensorParam , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <TemperatureResponse>(httpResponse.response));
        }
        return response;
    }

}
