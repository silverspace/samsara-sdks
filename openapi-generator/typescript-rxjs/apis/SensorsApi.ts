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
    CargoResponse,
    DoorResponse,
    HumidityResponse,
    InlineObject19,
    InlineObject20,
    InlineObject21,
    InlineObject22,
    InlineObject23,
    InlineObject24,
    InlineResponse2008,
    SensorHistoryResponse,
    TemperatureResponse,
} from '../models';

export interface GetSensorsRequest {
    accessToken: string;
    groupParam: InlineObject23;
}

export interface GetSensorsCargoRequest {
    accessToken: string;
    sensorParam: InlineObject19;
}

export interface GetSensorsDoorRequest {
    accessToken: string;
    sensorParam: InlineObject20;
}

export interface GetSensorsHistoryRequest {
    accessToken: string;
    historyParam: InlineObject21;
}

export interface GetSensorsHumidityRequest {
    accessToken: string;
    sensorParam: InlineObject22;
}

export interface GetSensorsTemperatureRequest {
    accessToken: string;
    sensorParam: InlineObject24;
}

/**
 * no description
 */
export class SensorsApi extends BaseAPI {

    /**
     * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
     * /sensors/list
     */
    getSensorsRaw(requestParameters: GetSensorsRequest): Observable<InlineResponse2008> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getSensors.');
        }

        if (requestParameters.groupParam === null || requestParameters.groupParam === undefined) {
            throw new RequiredError('groupParam','Required parameter requestParameters.groupParam was null or undefined when calling getSensors.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<InlineResponse2008>({
            path: `/sensors/list`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.groupParam,
        });
    }

    /**
     * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
     * /sensors/list
     */
    getSensors(requestParameters: GetSensorsRequest): Observable<InlineResponse2008> {
        return this.getSensorsRaw(requestParameters);
    }

    /**
     * Get cargo monitor status (empty / full) for requested sensors.
     * /sensors/cargo
     */
    getSensorsCargoRaw(requestParameters: GetSensorsCargoRequest): Observable<CargoResponse> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getSensorsCargo.');
        }

        if (requestParameters.sensorParam === null || requestParameters.sensorParam === undefined) {
            throw new RequiredError('sensorParam','Required parameter requestParameters.sensorParam was null or undefined when calling getSensorsCargo.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<CargoResponse>({
            path: `/sensors/cargo`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.sensorParam,
        });
    }

    /**
     * Get cargo monitor status (empty / full) for requested sensors.
     * /sensors/cargo
     */
    getSensorsCargo(requestParameters: GetSensorsCargoRequest): Observable<CargoResponse> {
        return this.getSensorsCargoRaw(requestParameters);
    }

    /**
     * Get door monitor status (closed / open) for requested sensors.
     * /sensors/door
     */
    getSensorsDoorRaw(requestParameters: GetSensorsDoorRequest): Observable<DoorResponse> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getSensorsDoor.');
        }

        if (requestParameters.sensorParam === null || requestParameters.sensorParam === undefined) {
            throw new RequiredError('sensorParam','Required parameter requestParameters.sensorParam was null or undefined when calling getSensorsDoor.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<DoorResponse>({
            path: `/sensors/door`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.sensorParam,
        });
    }

    /**
     * Get door monitor status (closed / open) for requested sensors.
     * /sensors/door
     */
    getSensorsDoor(requestParameters: GetSensorsDoorRequest): Observable<DoorResponse> {
        return this.getSensorsDoorRaw(requestParameters);
    }

    /**
     * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
     * /sensors/history
     */
    getSensorsHistoryRaw(requestParameters: GetSensorsHistoryRequest): Observable<SensorHistoryResponse> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getSensorsHistory.');
        }

        if (requestParameters.historyParam === null || requestParameters.historyParam === undefined) {
            throw new RequiredError('historyParam','Required parameter requestParameters.historyParam was null or undefined when calling getSensorsHistory.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<SensorHistoryResponse>({
            path: `/sensors/history`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.historyParam,
        });
    }

    /**
     * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
     * /sensors/history
     */
    getSensorsHistory(requestParameters: GetSensorsHistoryRequest): Observable<SensorHistoryResponse> {
        return this.getSensorsHistoryRaw(requestParameters);
    }

    /**
     * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
     * /sensors/humidity
     */
    getSensorsHumidityRaw(requestParameters: GetSensorsHumidityRequest): Observable<HumidityResponse> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getSensorsHumidity.');
        }

        if (requestParameters.sensorParam === null || requestParameters.sensorParam === undefined) {
            throw new RequiredError('sensorParam','Required parameter requestParameters.sensorParam was null or undefined when calling getSensorsHumidity.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<HumidityResponse>({
            path: `/sensors/humidity`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.sensorParam,
        });
    }

    /**
     * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
     * /sensors/humidity
     */
    getSensorsHumidity(requestParameters: GetSensorsHumidityRequest): Observable<HumidityResponse> {
        return this.getSensorsHumidityRaw(requestParameters);
    }

    /**
     * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
     * /sensors/temperature
     */
    getSensorsTemperatureRaw(requestParameters: GetSensorsTemperatureRequest): Observable<TemperatureResponse> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getSensorsTemperature.');
        }

        if (requestParameters.sensorParam === null || requestParameters.sensorParam === undefined) {
            throw new RequiredError('sensorParam','Required parameter requestParameters.sensorParam was null or undefined when calling getSensorsTemperature.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<TemperatureResponse>({
            path: `/sensors/temperature`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.sensorParam,
        });
    }

    /**
     * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
     * /sensors/temperature
     */
    getSensorsTemperature(requestParameters: GetSensorsTemperatureRequest): Observable<TemperatureResponse> {
        return this.getSensorsTemperatureRaw(requestParameters);
    }

}
