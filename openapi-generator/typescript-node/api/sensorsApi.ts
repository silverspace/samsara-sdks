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

import localVarRequest = require('request');
import http = require('http');
import Promise = require('bluebird');

/* tslint:disable:no-unused-locals */
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

import { ObjectSerializer, Authentication, HttpBasicAuth, ApiKeyAuth, OAuth, VoidAuth } from '../model/models';

let defaultBasePath = 'https://api.samsara.com/v1';

// ===============================================
// This file is autogenerated - Please do not edit
// ===============================================

export enum SensorsApiApiKeys {
}

export class SensorsApi {
    protected _basePath = defaultBasePath;
    protected defaultHeaders : any = {};
    protected _useQuerystring : boolean = false;

    protected authentications = {
        'default': <Authentication>new VoidAuth(),
    }

    constructor(basePath?: string);
    constructor(basePathOrUsername: string, password?: string, basePath?: string) {
        if (password) {
            if (basePath) {
                this.basePath = basePath;
            }
        } else {
            if (basePathOrUsername) {
                this.basePath = basePathOrUsername
            }
        }
    }

    set useQuerystring(value: boolean) {
        this._useQuerystring = value;
    }

    set basePath(basePath: string) {
        this._basePath = basePath;
    }

    get basePath() {
        return this._basePath;
    }

    public setDefaultAuthentication(auth: Authentication) {
        this.authentications.default = auth;
    }

    public setApiKey(key: SensorsApiApiKeys, value: string) {
        (this.authentications as any)[SensorsApiApiKeys[key]].apiKey = value;
    }

    /**
     * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
     * @summary /sensors/list
     * @param accessToken Samsara API access token.
     * @param groupParam 
     */
    public getSensors (accessToken: string, groupParam: InlineObject23, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: InlineResponse2008;  }> {
        const localVarPath = this.basePath + '/sensors/list';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getSensors.');
        }

        // verify required parameter 'groupParam' is not null or undefined
        if (groupParam === null || groupParam === undefined) {
            throw new Error('Required parameter groupParam was null or undefined when calling getSensors.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(groupParam, "InlineObject23")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: InlineResponse2008;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "InlineResponse2008");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get cargo monitor status (empty / full) for requested sensors.
     * @summary /sensors/cargo
     * @param accessToken Samsara API access token.
     * @param sensorParam 
     */
    public getSensorsCargo (accessToken: string, sensorParam: InlineObject19, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: CargoResponse;  }> {
        const localVarPath = this.basePath + '/sensors/cargo';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getSensorsCargo.');
        }

        // verify required parameter 'sensorParam' is not null or undefined
        if (sensorParam === null || sensorParam === undefined) {
            throw new Error('Required parameter sensorParam was null or undefined when calling getSensorsCargo.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(sensorParam, "InlineObject19")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: CargoResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "CargoResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get door monitor status (closed / open) for requested sensors.
     * @summary /sensors/door
     * @param accessToken Samsara API access token.
     * @param sensorParam 
     */
    public getSensorsDoor (accessToken: string, sensorParam: InlineObject20, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: DoorResponse;  }> {
        const localVarPath = this.basePath + '/sensors/door';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getSensorsDoor.');
        }

        // verify required parameter 'sensorParam' is not null or undefined
        if (sensorParam === null || sensorParam === undefined) {
            throw new Error('Required parameter sensorParam was null or undefined when calling getSensorsDoor.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(sensorParam, "InlineObject20")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DoorResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DoorResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
     * @summary /sensors/history
     * @param accessToken Samsara API access token.
     * @param historyParam 
     */
    public getSensorsHistory (accessToken: string, historyParam: InlineObject21, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: SensorHistoryResponse;  }> {
        const localVarPath = this.basePath + '/sensors/history';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getSensorsHistory.');
        }

        // verify required parameter 'historyParam' is not null or undefined
        if (historyParam === null || historyParam === undefined) {
            throw new Error('Required parameter historyParam was null or undefined when calling getSensorsHistory.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(historyParam, "InlineObject21")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: SensorHistoryResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "SensorHistoryResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
     * @summary /sensors/humidity
     * @param accessToken Samsara API access token.
     * @param sensorParam 
     */
    public getSensorsHumidity (accessToken: string, sensorParam: InlineObject22, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: HumidityResponse;  }> {
        const localVarPath = this.basePath + '/sensors/humidity';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getSensorsHumidity.');
        }

        // verify required parameter 'sensorParam' is not null or undefined
        if (sensorParam === null || sensorParam === undefined) {
            throw new Error('Required parameter sensorParam was null or undefined when calling getSensorsHumidity.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(sensorParam, "InlineObject22")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: HumidityResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "HumidityResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
     * @summary /sensors/temperature
     * @param accessToken Samsara API access token.
     * @param sensorParam 
     */
    public getSensorsTemperature (accessToken: string, sensorParam: InlineObject24, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: TemperatureResponse;  }> {
        const localVarPath = this.basePath + '/sensors/temperature';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getSensorsTemperature.');
        }

        // verify required parameter 'sensorParam' is not null or undefined
        if (sensorParam === null || sensorParam === undefined) {
            throw new Error('Required parameter sensorParam was null or undefined when calling getSensorsTemperature.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(sensorParam, "InlineObject24")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: TemperatureResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "TemperatureResponse");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
}
