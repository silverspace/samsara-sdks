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

import { ObjectSerializer, Authentication, HttpBasicAuth, ApiKeyAuth, OAuth, VoidAuth } from '../model/models';

let defaultBasePath = 'https://api.samsara.com/v1';

// ===============================================
// This file is autogenerated - Please do not edit
// ===============================================

export enum FleetApiApiKeys {
}

export class FleetApi {
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

    public setApiKey(key: FleetApiApiKeys, value: string) {
        (this.authentications as any)[FleetApiApiKeys[key]].apiKey = value;
    }

    /**
     * This method adds an address book entry to the specified group.
     * @summary /fleet/add_address
     * @param accessToken Samsara API access token.
     * @param addressParam 
     */
    public addFleetAddress (accessToken: string, addressParam: InlineObject2, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body?: any;  }> {
        const localVarPath = this.basePath + '/fleet/add_address';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling addFleetAddress.');
        }

        // verify required parameter 'addressParam' is not null or undefined
        if (addressParam === null || addressParam === undefined) {
            throw new Error('Required parameter addressParam was null or undefined when calling addFleetAddress.');
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
            body: ObjectSerializer.serialize(addressParam, "InlineObject2")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body?: any;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
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
     * Add one or more addresses to the organization
     * @summary /addresses
     * @param accessToken Samsara API access token.
     * @param addresses 
     */
    public addOrganizationAddresses (accessToken: string, addresses: InlineObject, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: Array<Address>;  }> {
        const localVarPath = this.basePath + '/addresses';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling addOrganizationAddresses.');
        }

        // verify required parameter 'addresses' is not null or undefined
        if (addresses === null || addresses === undefined) {
            throw new Error('Required parameter addresses was null or undefined when calling addOrganizationAddresses.');
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
            body: ObjectSerializer.serialize(addresses, "InlineObject")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Array<Address>;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Array<Address>");
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
     * Create a new dispatch route.
     * @summary /fleet/dispatch/routes
     * @param accessToken Samsara API access token.
     * @param createDispatchRouteParams 
     */
    public createDispatchRoute (accessToken: string, createDispatchRouteParams: DispatchRouteCreate, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: DispatchRoute;  }> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createDispatchRoute.');
        }

        // verify required parameter 'createDispatchRouteParams' is not null or undefined
        if (createDispatchRouteParams === null || createDispatchRouteParams === undefined) {
            throw new Error('Required parameter createDispatchRouteParams was null or undefined when calling createDispatchRoute.');
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
            body: ObjectSerializer.serialize(createDispatchRouteParams, "DispatchRouteCreate")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DispatchRoute;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DispatchRoute");
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
     * Create a new driver.
     * @summary /fleet/drivers/create
     * @param accessToken Samsara API access token.
     * @param createDriverParam Driver creation body
     */
    public createDriver (accessToken: string, createDriverParam: DriverForCreate, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: Driver;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/create';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createDriver.');
        }

        // verify required parameter 'createDriverParam' is not null or undefined
        if (createDriverParam === null || createDriverParam === undefined) {
            throw new Error('Required parameter createDriverParam was null or undefined when calling createDriver.');
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
            body: ObjectSerializer.serialize(createDriverParam, "DriverForCreate")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Driver;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Driver");
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
     * Create a new dispatch route for the driver with driver_id.
     * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * @param accessToken Samsara API access token.
     * @param driverId ID of the driver with the associated routes.
     * @param createDispatchRouteParams 
     */
    public createDriverDispatchRoute (accessToken: string, driverId: number, createDispatchRouteParams: DispatchRouteCreate, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: DispatchRoute;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/{driver_id}/dispatch/routes'
            .replace('{' + 'driver_id' + '}', encodeURIComponent(String(driverId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

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
            body: ObjectSerializer.serialize(createDispatchRouteParams, "DispatchRouteCreate")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DispatchRoute;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DispatchRoute");
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
     * Create a driver document for the given driver.
     * @summary /fleet/drivers/{driver_id:[0-9]+}/documents
     * @param accessToken Samsara API access token.
     * @param driverId ID of the driver for whom the document is created.
     * @param createDocumentParams To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
     */
    public createDriverDocument (accessToken: string, driverId: number, createDocumentParams: DocumentCreate, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: Document;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/{driver_id}/documents'
            .replace('{' + 'driver_id' + '}', encodeURIComponent(String(driverId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createDriverDocument.');
        }

        // verify required parameter 'driverId' is not null or undefined
        if (driverId === null || driverId === undefined) {
            throw new Error('Required parameter driverId was null or undefined when calling createDriverDocument.');
        }

        // verify required parameter 'createDocumentParams' is not null or undefined
        if (createDocumentParams === null || createDocumentParams === undefined) {
            throw new Error('Required parameter createDocumentParams was null or undefined when calling createDriverDocument.');
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
            body: ObjectSerializer.serialize(createDocumentParams, "DocumentCreate")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Document;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Document");
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
     * Create a new dvir, marking a vehicle or trailer safe or unsafe.
     * @summary /fleet/maintenance/dvirs
     * @param accessToken Samsara API access token.
     * @param createDvirParam 
     */
    public createDvir (accessToken: string, createDvirParam: InlineObject12, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: DvirBase;  }> {
        const localVarPath = this.basePath + '/fleet/maintenance/dvirs';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createDvir.');
        }

        // verify required parameter 'createDvirParam' is not null or undefined
        if (createDvirParam === null || createDvirParam === undefined) {
            throw new Error('Required parameter createDvirParam was null or undefined when calling createDvir.');
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
            body: ObjectSerializer.serialize(createDvirParam, "InlineObject12")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DvirBase;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DvirBase");
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
     * Create a new dispatch route for the vehicle with vehicle_id.
     * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * @param accessToken Samsara API access token.
     * @param vehicleId ID of the vehicle with the associated routes.
     * @param createDispatchRouteParams 
     */
    public createVehicleDispatchRoute (accessToken: string, vehicleId: number, createDispatchRouteParams: DispatchRouteCreate, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: DispatchRoute;  }> {
        const localVarPath = this.basePath + '/fleet/vehicles/{vehicle_id}/dispatch/routes'
            .replace('{' + 'vehicle_id' + '}', encodeURIComponent(String(vehicleId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

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
            body: ObjectSerializer.serialize(createDispatchRouteParams, "DispatchRouteCreate")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DispatchRoute;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DispatchRoute");
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
     * Deactivate a driver with the given id.
     * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param accessToken Samsara API access token.
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     */
    public deactivateDriver (accessToken: string, driverIdOrExternalId: string, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body?: any;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/{driver_id_or_external_id}'
            .replace('{' + 'driver_id_or_external_id' + '}', encodeURIComponent(String(driverIdOrExternalId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling deactivateDriver.');
        }

        // verify required parameter 'driverIdOrExternalId' is not null or undefined
        if (driverIdOrExternalId === null || driverIdOrExternalId === undefined) {
            throw new Error('Required parameter driverIdOrExternalId was null or undefined when calling deactivateDriver.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'DELETE',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body?: any;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
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
     * Delete a dispatch route and its associated jobs.
     * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
     * @param accessToken Samsara API access token.
     * @param routeId ID of the dispatch route.
     */
    public deleteDispatchRouteById (accessToken: string, routeId: number, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body?: any;  }> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes/{route_id}'
            .replace('{' + 'route_id' + '}', encodeURIComponent(String(routeId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling deleteDispatchRouteById.');
        }

        // verify required parameter 'routeId' is not null or undefined
        if (routeId === null || routeId === undefined) {
            throw new Error('Required parameter routeId was null or undefined when calling deleteDispatchRouteById.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'DELETE',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body?: any;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
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
     * Delete an address.
     * @summary /addresses/{addressId}
     * @param accessToken Samsara API access token.
     * @param addressId ID of the address/geofence
     */
    public deleteOrganizationAddress (accessToken: string, addressId: number, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body?: any;  }> {
        const localVarPath = this.basePath + '/addresses/{addressId}'
            .replace('{' + 'addressId' + '}', encodeURIComponent(String(addressId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling deleteOrganizationAddress.');
        }

        // verify required parameter 'addressId' is not null or undefined
        if (addressId === null || addressId === undefined) {
            throw new Error('Required parameter addressId was null or undefined when calling deleteOrganizationAddress.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'DELETE',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body?: any;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
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
     * Fetch all of the dispatch routes for the group.
     * @summary /fleet/dispatch/routes
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     */
    public fetchAllDispatchRoutes (accessToken: string, groupId?: number, endTime?: number, duration?: number, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: Array<DispatchRoute>;  }> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling fetchAllDispatchRoutes.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (groupId !== undefined) {
            localVarQueryParameters['group_id'] = ObjectSerializer.serialize(groupId, "number");
        }

        if (endTime !== undefined) {
            localVarQueryParameters['end_time'] = ObjectSerializer.serialize(endTime, "number");
        }

        if (duration !== undefined) {
            localVarQueryParameters['duration'] = ObjectSerializer.serialize(duration, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Array<DispatchRoute>;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Array<DispatchRoute>");
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
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * @summary /fleet/dispatch/routes/job_updates
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
     * @param include Optionally set include&#x3D;route to include route object in response payload.
     */
    public fetchAllRouteJobUpdates (accessToken: string, groupId?: number, sequenceId?: string, include?: string, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: AllRouteJobUpdates;  }> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes/job_updates';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling fetchAllRouteJobUpdates.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (groupId !== undefined) {
            localVarQueryParameters['group_id'] = ObjectSerializer.serialize(groupId, "number");
        }

        if (sequenceId !== undefined) {
            localVarQueryParameters['sequence_id'] = ObjectSerializer.serialize(sequenceId, "string");
        }

        if (include !== undefined) {
            localVarQueryParameters['include'] = ObjectSerializer.serialize(include, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: AllRouteJobUpdates;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "AllRouteJobUpdates");
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
     * Fetch current locations of all assets for the group.
     * @summary /fleet/assets/locations
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     */
    public getAllAssetCurrentLocations (accessToken: string, groupId?: number, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: InlineResponse2001;  }> {
        const localVarPath = this.basePath + '/fleet/assets/locations';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getAllAssetCurrentLocations.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (groupId !== undefined) {
            localVarQueryParameters['group_id'] = ObjectSerializer.serialize(groupId, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: InlineResponse2001;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "InlineResponse2001");
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
     * Fetch all of the assets for the group.
     * @summary /fleet/assets
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     */
    public getAllAssets (accessToken: string, groupId?: number, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: InlineResponse200;  }> {
        const localVarPath = this.basePath + '/fleet/assets';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getAllAssets.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (groupId !== undefined) {
            localVarQueryParameters['group_id'] = ObjectSerializer.serialize(groupId, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: InlineResponse200;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "InlineResponse200");
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
     * Fetch all deactivated drivers for the group.
     * @summary /fleet/drivers/inactive
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     */
    public getAllDeactivatedDrivers (accessToken: string, groupId?: number, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: Array<Driver>;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/inactive';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getAllDeactivatedDrivers.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (groupId !== undefined) {
            localVarQueryParameters['group_id'] = ObjectSerializer.serialize(groupId, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Array<Driver>;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Array<Driver>");
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
     * Fetch the historical locations for the asset.
     * @summary /fleet/assets/{assetId:[0-9]+}/locations
     * @param accessToken Samsara API access token.
     * @param assetId ID of the asset
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     */
    public getAssetLocation (accessToken: string, assetId: number, startMs: number, endMs: number, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: Array<any>;  }> {
        const localVarPath = this.basePath + '/fleet/assets/{asset_id}/locations'
            .replace('{' + 'asset_id' + '}', encodeURIComponent(String(assetId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getAssetLocation.');
        }

        // verify required parameter 'assetId' is not null or undefined
        if (assetId === null || assetId === undefined) {
            throw new Error('Required parameter assetId was null or undefined when calling getAssetLocation.');
        }

        // verify required parameter 'startMs' is not null or undefined
        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getAssetLocation.');
        }

        // verify required parameter 'endMs' is not null or undefined
        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getAssetLocation.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (startMs !== undefined) {
            localVarQueryParameters['startMs'] = ObjectSerializer.serialize(startMs, "number");
        }

        if (endMs !== undefined) {
            localVarQueryParameters['endMs'] = ObjectSerializer.serialize(endMs, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Array<any>;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Array<any>");
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
     * Fetch the reefer-specific stats of an asset.
     * @summary /fleet/assets/{assetId:[0-9]+}/reefer
     * @param accessToken Samsara API access token.
     * @param assetId ID of the asset
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     */
    public getAssetReefer (accessToken: string, assetId: number, startMs: number, endMs: number, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: AssetReeferResponse;  }> {
        const localVarPath = this.basePath + '/fleet/assets/{asset_id}/reefer'
            .replace('{' + 'asset_id' + '}', encodeURIComponent(String(assetId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getAssetReefer.');
        }

        // verify required parameter 'assetId' is not null or undefined
        if (assetId === null || assetId === undefined) {
            throw new Error('Required parameter assetId was null or undefined when calling getAssetReefer.');
        }

        // verify required parameter 'startMs' is not null or undefined
        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getAssetReefer.');
        }

        // verify required parameter 'endMs' is not null or undefined
        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getAssetReefer.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (startMs !== undefined) {
            localVarQueryParameters['startMs'] = ObjectSerializer.serialize(startMs, "number");
        }

        if (endMs !== undefined) {
            localVarQueryParameters['endMs'] = ObjectSerializer.serialize(endMs, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: AssetReeferResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "AssetReeferResponse");
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
     * Fetch deactivated driver by id.
     * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param accessToken Samsara API access token.
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     */
    public getDeactivatedDriverById (accessToken: string, driverIdOrExternalId: string, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: Driver;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/inactive/{driver_id_or_external_id}'
            .replace('{' + 'driver_id_or_external_id' + '}', encodeURIComponent(String(driverIdOrExternalId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDeactivatedDriverById.');
        }

        // verify required parameter 'driverIdOrExternalId' is not null or undefined
        if (driverIdOrExternalId === null || driverIdOrExternalId === undefined) {
            throw new Error('Required parameter driverIdOrExternalId was null or undefined when calling getDeactivatedDriverById.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Driver;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Driver");
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
     * Fetch a dispatch route by id.
     * @summary /fleet/dispatch/routes/{route_id:[0-9]+}
     * @param accessToken Samsara API access token.
     * @param routeId ID of the dispatch route.
     */
    public getDispatchRouteById (accessToken: string, routeId: number, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: DispatchRoute;  }> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes/{route_id}'
            .replace('{' + 'route_id' + '}', encodeURIComponent(String(routeId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDispatchRouteById.');
        }

        // verify required parameter 'routeId' is not null or undefined
        if (routeId === null || routeId === undefined) {
            throw new Error('Required parameter routeId was null or undefined when calling getDispatchRouteById.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DispatchRoute;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DispatchRoute");
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
     * Fetch the history of a dispatch route.
     * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/history
     * @param accessToken Samsara API access token.
     * @param routeId ID of the route with history.
     * @param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
     * @param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
     */
    public getDispatchRouteHistory (accessToken: string, routeId: number, startTime?: number, endTime?: number, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: DispatchRouteHistory;  }> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes/{route_id}/history'
            .replace('{' + 'route_id' + '}', encodeURIComponent(String(routeId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDispatchRouteHistory.');
        }

        // verify required parameter 'routeId' is not null or undefined
        if (routeId === null || routeId === undefined) {
            throw new Error('Required parameter routeId was null or undefined when calling getDispatchRouteHistory.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (startTime !== undefined) {
            localVarQueryParameters['start_time'] = ObjectSerializer.serialize(startTime, "number");
        }

        if (endTime !== undefined) {
            localVarQueryParameters['end_time'] = ObjectSerializer.serialize(endTime, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DispatchRouteHistory;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DispatchRouteHistory");
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
     * Fetch all of the dispatch routes for a given driver.
     * @summary /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * @param accessToken Samsara API access token.
     * @param driverId ID of the driver with the associated routes.
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     */
    public getDispatchRoutesByDriverId (accessToken: string, driverId: number, endTime?: number, duration?: number, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: Array<DispatchRoute>;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/{driver_id}/dispatch/routes'
            .replace('{' + 'driver_id' + '}', encodeURIComponent(String(driverId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDispatchRoutesByDriverId.');
        }

        // verify required parameter 'driverId' is not null or undefined
        if (driverId === null || driverId === undefined) {
            throw new Error('Required parameter driverId was null or undefined when calling getDispatchRoutesByDriverId.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (endTime !== undefined) {
            localVarQueryParameters['end_time'] = ObjectSerializer.serialize(endTime, "number");
        }

        if (duration !== undefined) {
            localVarQueryParameters['duration'] = ObjectSerializer.serialize(duration, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Array<DispatchRoute>;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Array<DispatchRoute>");
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
     * Fetch all of the dispatch routes for a given vehicle.
     * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * @param accessToken Samsara API access token.
     * @param vehicleId ID of the vehicle with the associated routes.
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
     */
    public getDispatchRoutesByVehicleId (accessToken: string, vehicleId: number, endTime?: number, duration?: number, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: Array<DispatchRoute>;  }> {
        const localVarPath = this.basePath + '/fleet/vehicles/{vehicle_id}/dispatch/routes'
            .replace('{' + 'vehicle_id' + '}', encodeURIComponent(String(vehicleId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDispatchRoutesByVehicleId.');
        }

        // verify required parameter 'vehicleId' is not null or undefined
        if (vehicleId === null || vehicleId === undefined) {
            throw new Error('Required parameter vehicleId was null or undefined when calling getDispatchRoutesByVehicleId.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (endTime !== undefined) {
            localVarQueryParameters['end_time'] = ObjectSerializer.serialize(endTime, "number");
        }

        if (duration !== undefined) {
            localVarQueryParameters['duration'] = ObjectSerializer.serialize(duration, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Array<DispatchRoute>;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Array<DispatchRoute>");
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
     * Fetch driver by id.
     * @summary /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param accessToken Samsara API access token.
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     */
    public getDriverById (accessToken: string, driverIdOrExternalId: string, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: Driver;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/{driver_id_or_external_id}'
            .replace('{' + 'driver_id_or_external_id' + '}', encodeURIComponent(String(driverIdOrExternalId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDriverById.');
        }

        // verify required parameter 'driverIdOrExternalId' is not null or undefined
        if (driverIdOrExternalId === null || driverIdOrExternalId === undefined) {
            throw new Error('Required parameter driverIdOrExternalId was null or undefined when calling getDriverById.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Driver;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Driver");
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
     * Fetch all of the document types.
     * @summary /fleet/drivers/document_types
     */
    public getDriverDocumentTypesByOrgId (options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: Array<DocumentType>;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/document_types';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Array<DocumentType>;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Array<DocumentType>");
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
     * Fetch all of the documents.
     * @summary /fleet/drivers/documents
     * @param accessToken Samsara API access token.
     * @param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
     * @param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
     */
    public getDriverDocumentsByOrgId (accessToken: string, endMs?: number, durationMs?: number, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: Array<Document>;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/documents';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDriverDocumentsByOrgId.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (endMs !== undefined) {
            localVarQueryParameters['endMs'] = ObjectSerializer.serialize(endMs, "number");
        }

        if (durationMs !== undefined) {
            localVarQueryParameters['durationMs'] = ObjectSerializer.serialize(durationMs, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Array<Document>;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Array<Document>");
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
     * Fetch the safety score for the driver.
     * @summary /fleet/drivers/{driverId:[0-9]+}/safety/score
     * @param driverId ID of the driver
     * @param accessToken Samsara API access token.
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     */
    public getDriverSafetyScore (driverId: number, accessToken: string, startMs: number, endMs: number, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: DriverSafetyScoreResponse;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/{driverId}/safety/score'
            .replace('{' + 'driverId' + '}', encodeURIComponent(String(driverId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'driverId' is not null or undefined
        if (driverId === null || driverId === undefined) {
            throw new Error('Required parameter driverId was null or undefined when calling getDriverSafetyScore.');
        }

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDriverSafetyScore.');
        }

        // verify required parameter 'startMs' is not null or undefined
        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getDriverSafetyScore.');
        }

        // verify required parameter 'endMs' is not null or undefined
        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getDriverSafetyScore.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (startMs !== undefined) {
            localVarQueryParameters['startMs'] = ObjectSerializer.serialize(startMs, "number");
        }

        if (endMs !== undefined) {
            localVarQueryParameters['endMs'] = ObjectSerializer.serialize(endMs, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DriverSafetyScoreResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DriverSafetyScoreResponse");
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
     * Get DVIRs for the org within provided time constraints
     * @summary /fleet/maintenance/dvirs
     * @param accessToken Samsara API access token.
     * @param endMs time in millis until the last dvir log.
     * @param durationMs time in millis which corresponds to the duration before the end_ms.
     * @param groupId Group ID to query.
     */
    public getDvirs (accessToken: string, endMs: number, durationMs: number, groupId?: number, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: DvirListResponse;  }> {
        const localVarPath = this.basePath + '/fleet/maintenance/dvirs';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getDvirs.');
        }

        // verify required parameter 'endMs' is not null or undefined
        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getDvirs.');
        }

        // verify required parameter 'durationMs' is not null or undefined
        if (durationMs === null || durationMs === undefined) {
            throw new Error('Required parameter durationMs was null or undefined when calling getDvirs.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (endMs !== undefined) {
            localVarQueryParameters['end_ms'] = ObjectSerializer.serialize(endMs, "number");
        }

        if (durationMs !== undefined) {
            localVarQueryParameters['duration_ms'] = ObjectSerializer.serialize(durationMs, "number");
        }

        if (groupId !== undefined) {
            localVarQueryParameters['group_id'] = ObjectSerializer.serialize(groupId, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DvirListResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DvirListResponse");
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
     * Get all the drivers for the specified group.
     * @summary /fleet/drivers
     * @param accessToken Samsara API access token.
     * @param groupDriversParam 
     */
    public getFleetDrivers (accessToken: string, groupDriversParam: InlineObject3, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: DriversResponse;  }> {
        const localVarPath = this.basePath + '/fleet/drivers';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetDrivers.');
        }

        // verify required parameter 'groupDriversParam' is not null or undefined
        if (groupDriversParam === null || groupDriversParam === undefined) {
            throw new Error('Required parameter groupDriversParam was null or undefined when calling getFleetDrivers.');
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
            body: ObjectSerializer.serialize(groupDriversParam, "InlineObject3")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DriversResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DriversResponse");
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
     * Get summarized daily HOS charts for a specified driver.
     * @summary /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     * @param accessToken Samsara API access token.
     * @param driverId ID of the driver with HOS logs.
     * @param hosLogsParam 
     */
    public getFleetDriversHosDailyLogs (accessToken: string, driverId: number, hosLogsParam: InlineObject6, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: DriverDailyLogResponse;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/{driver_id}/hos_daily_logs'
            .replace('{' + 'driver_id' + '}', encodeURIComponent(String(driverId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetDriversHosDailyLogs.');
        }

        // verify required parameter 'driverId' is not null or undefined
        if (driverId === null || driverId === undefined) {
            throw new Error('Required parameter driverId was null or undefined when calling getFleetDriversHosDailyLogs.');
        }

        // verify required parameter 'hosLogsParam' is not null or undefined
        if (hosLogsParam === null || hosLogsParam === undefined) {
            throw new Error('Required parameter hosLogsParam was null or undefined when calling getFleetDriversHosDailyLogs.');
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
            body: ObjectSerializer.serialize(hosLogsParam, "InlineObject6")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DriverDailyLogResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DriverDailyLogResponse");
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
     * Get the distance and time each driver in an organization has driven in a given time period.
     * @summary /fleet/drivers/summary
     * @param accessToken Samsara API access token.
     * @param driversSummaryParam 
     * @param snapToDayBounds Snap query result to HOS day boundaries.
     */
    public getFleetDriversSummary (accessToken: string, driversSummaryParam: InlineObject5, snapToDayBounds?: boolean, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: DriversSummaryResponse;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/summary';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetDriversSummary.');
        }

        // verify required parameter 'driversSummaryParam' is not null or undefined
        if (driversSummaryParam === null || driversSummaryParam === undefined) {
            throw new Error('Required parameter driversSummaryParam was null or undefined when calling getFleetDriversSummary.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (snapToDayBounds !== undefined) {
            localVarQueryParameters['snap_to_day_bounds'] = ObjectSerializer.serialize(snapToDayBounds, "boolean");
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
            body: ObjectSerializer.serialize(driversSummaryParam, "InlineObject5")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DriversSummaryResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DriversSummaryResponse");
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
     * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
     * @summary /fleet/hos_authentication_logs
     * @param accessToken Samsara API access token.
     * @param hosAuthenticationLogsParam 
     */
    public getFleetHosAuthenticationLogs (accessToken: string, hosAuthenticationLogsParam: InlineObject7, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: HosAuthenticationLogsResponse;  }> {
        const localVarPath = this.basePath + '/fleet/hos_authentication_logs';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetHosAuthenticationLogs.');
        }

        // verify required parameter 'hosAuthenticationLogsParam' is not null or undefined
        if (hosAuthenticationLogsParam === null || hosAuthenticationLogsParam === undefined) {
            throw new Error('Required parameter hosAuthenticationLogsParam was null or undefined when calling getFleetHosAuthenticationLogs.');
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
            body: ObjectSerializer.serialize(hosAuthenticationLogsParam, "InlineObject7")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: HosAuthenticationLogsResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "HosAuthenticationLogsResponse");
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
     * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
     * @summary /fleet/hos_logs
     * @param accessToken Samsara API access token.
     * @param hosLogsParam 
     */
    public getFleetHosLogs (accessToken: string, hosLogsParam: InlineObject8, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: HosLogsResponse;  }> {
        const localVarPath = this.basePath + '/fleet/hos_logs';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetHosLogs.');
        }

        // verify required parameter 'hosLogsParam' is not null or undefined
        if (hosLogsParam === null || hosLogsParam === undefined) {
            throw new Error('Required parameter hosLogsParam was null or undefined when calling getFleetHosLogs.');
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
            body: ObjectSerializer.serialize(hosLogsParam, "InlineObject8")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: HosLogsResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "HosLogsResponse");
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
     * Get the current HOS status for all drivers in the group.
     * @summary /fleet/hos_logs_summary
     * @param accessToken Samsara API access token.
     * @param hosLogsParam 
     */
    public getFleetHosLogsSummary (accessToken: string, hosLogsParam: InlineObject9, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: HosLogsSummaryResponse;  }> {
        const localVarPath = this.basePath + '/fleet/hos_logs_summary';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetHosLogsSummary.');
        }

        // verify required parameter 'hosLogsParam' is not null or undefined
        if (hosLogsParam === null || hosLogsParam === undefined) {
            throw new Error('Required parameter hosLogsParam was null or undefined when calling getFleetHosLogsSummary.');
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
            body: ObjectSerializer.serialize(hosLogsParam, "InlineObject9")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: HosLogsSummaryResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "HosLogsSummaryResponse");
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
     * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
     * @summary /fleet/locations
     * @param accessToken Samsara API access token.
     * @param groupParam 
     */
    public getFleetLocations (accessToken: string, groupParam: InlineObject11, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: InlineResponse2003;  }> {
        const localVarPath = this.basePath + '/fleet/locations';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetLocations.');
        }

        // verify required parameter 'groupParam' is not null or undefined
        if (groupParam === null || groupParam === undefined) {
            throw new Error('Required parameter groupParam was null or undefined when calling getFleetLocations.');
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
            body: ObjectSerializer.serialize(groupParam, "InlineObject11")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: InlineResponse2003;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "InlineResponse2003");
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
     * Get list of the vehicles with any engine faults or check light data.
     * @summary /fleet/maintenance/list
     * @param accessToken Samsara API access token.
     * @param groupParam 
     */
    public getFleetMaintenanceList (accessToken: string, groupParam: InlineObject13, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: InlineResponse2004;  }> {
        const localVarPath = this.basePath + '/fleet/maintenance/list';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetMaintenanceList.');
        }

        // verify required parameter 'groupParam' is not null or undefined
        if (groupParam === null || groupParam === undefined) {
            throw new Error('Required parameter groupParam was null or undefined when calling getFleetMaintenanceList.');
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
            body: ObjectSerializer.serialize(groupParam, "InlineObject13")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: InlineResponse2004;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "InlineResponse2004");
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
     * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
     * @summary /fleet/trips
     * @param accessToken Samsara API access token.
     * @param tripsParam 
     */
    public getFleetTrips (accessToken: string, tripsParam: InlineObject15, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: TripResponse;  }> {
        const localVarPath = this.basePath + '/fleet/trips';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetTrips.');
        }

        // verify required parameter 'tripsParam' is not null or undefined
        if (tripsParam === null || tripsParam === undefined) {
            throw new Error('Required parameter tripsParam was null or undefined when calling getFleetTrips.');
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
            body: ObjectSerializer.serialize(tripsParam, "InlineObject15")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: TripResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "TripResponse");
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
     * Gets a specific vehicle.
     * @summary /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param accessToken Samsara API access token.
     * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
     */
    public getFleetVehicle (accessToken: string, vehicleIdOrExternalId: string, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: FleetVehicleResponse;  }> {
        const localVarPath = this.basePath + '/fleet/vehicles/{vehicle_id_or_external_id}'
            .replace('{' + 'vehicle_id_or_external_id' + '}', encodeURIComponent(String(vehicleIdOrExternalId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getFleetVehicle.');
        }

        // verify required parameter 'vehicleIdOrExternalId' is not null or undefined
        if (vehicleIdOrExternalId === null || vehicleIdOrExternalId === undefined) {
            throw new Error('Required parameter vehicleIdOrExternalId was null or undefined when calling getFleetVehicle.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: FleetVehicleResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "FleetVehicleResponse");
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
     * Fetch an address by its id.
     * @summary /addresses/{addressId}
     * @param accessToken Samsara API access token.
     * @param addressId ID of the address/geofence
     */
    public getOrganizationAddress (accessToken: string, addressId: number, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: Address;  }> {
        const localVarPath = this.basePath + '/addresses/{addressId}'
            .replace('{' + 'addressId' + '}', encodeURIComponent(String(addressId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getOrganizationAddress.');
        }

        // verify required parameter 'addressId' is not null or undefined
        if (addressId === null || addressId === undefined) {
            throw new Error('Required parameter addressId was null or undefined when calling getOrganizationAddress.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Address;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Address");
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
     * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
     * @summary /addresses
     * @param accessToken Samsara API access token.
     */
    public getOrganizationAddresses (accessToken: string, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: Array<Address>;  }> {
        const localVarPath = this.basePath + '/addresses';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getOrganizationAddresses.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Array<Address>;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Array<Address>");
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
     * Fetch a contact by its id.
     * @summary /contacts/{contact_id}
     * @param accessToken Samsara API access token.
     * @param contactId ID of the contact
     */
    public getOrganizationContact (accessToken: string, contactId: number, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: Contact;  }> {
        const localVarPath = this.basePath + '/contacts/{contact_id}'
            .replace('{' + 'contact_id' + '}', encodeURIComponent(String(contactId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getOrganizationContact.');
        }

        // verify required parameter 'contactId' is not null or undefined
        if (contactId === null || contactId === undefined) {
            throw new Error('Required parameter contactId was null or undefined when calling getOrganizationContact.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Contact;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Contact");
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
     * Fetch harsh event details for a vehicle.
     * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     * @param vehicleId ID of the vehicle
     * @param accessToken Samsara API access token.
     * @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event.
     */
    public getVehicleHarshEvent (vehicleId: number, accessToken: string, timestamp: number, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: VehicleHarshEventResponse;  }> {
        const localVarPath = this.basePath + '/fleet/vehicles/{vehicleId}/safety/harsh_event'
            .replace('{' + 'vehicleId' + '}', encodeURIComponent(String(vehicleId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'vehicleId' is not null or undefined
        if (vehicleId === null || vehicleId === undefined) {
            throw new Error('Required parameter vehicleId was null or undefined when calling getVehicleHarshEvent.');
        }

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getVehicleHarshEvent.');
        }

        // verify required parameter 'timestamp' is not null or undefined
        if (timestamp === null || timestamp === undefined) {
            throw new Error('Required parameter timestamp was null or undefined when calling getVehicleHarshEvent.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (timestamp !== undefined) {
            localVarQueryParameters['timestamp'] = ObjectSerializer.serialize(timestamp, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: VehicleHarshEventResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "VehicleHarshEventResponse");
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
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
     * @summary /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     * @param accessToken Samsara API access token.
     * @param vehicleId ID of the vehicle with the associated routes.
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
     */
    public getVehicleLocations (accessToken: string, vehicleId: number, startMs: number, endMs: number, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: Array<FleetVehicleLocation>;  }> {
        const localVarPath = this.basePath + '/fleet/vehicles/{vehicle_id}/locations'
            .replace('{' + 'vehicle_id' + '}', encodeURIComponent(String(vehicleId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getVehicleLocations.');
        }

        // verify required parameter 'vehicleId' is not null or undefined
        if (vehicleId === null || vehicleId === undefined) {
            throw new Error('Required parameter vehicleId was null or undefined when calling getVehicleLocations.');
        }

        // verify required parameter 'startMs' is not null or undefined
        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getVehicleLocations.');
        }

        // verify required parameter 'endMs' is not null or undefined
        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getVehicleLocations.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (startMs !== undefined) {
            localVarQueryParameters['startMs'] = ObjectSerializer.serialize(startMs, "number");
        }

        if (endMs !== undefined) {
            localVarQueryParameters['endMs'] = ObjectSerializer.serialize(endMs, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Array<FleetVehicleLocation>;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Array<FleetVehicleLocation>");
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
     * Fetch the safety score for the vehicle.
     * @summary /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     * @param vehicleId ID of the vehicle
     * @param accessToken Samsara API access token.
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
     */
    public getVehicleSafetyScore (vehicleId: number, accessToken: string, startMs: number, endMs: number, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: VehicleSafetyScoreResponse;  }> {
        const localVarPath = this.basePath + '/fleet/vehicles/{vehicleId}/safety/score'
            .replace('{' + 'vehicleId' + '}', encodeURIComponent(String(vehicleId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'vehicleId' is not null or undefined
        if (vehicleId === null || vehicleId === undefined) {
            throw new Error('Required parameter vehicleId was null or undefined when calling getVehicleSafetyScore.');
        }

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getVehicleSafetyScore.');
        }

        // verify required parameter 'startMs' is not null or undefined
        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getVehicleSafetyScore.');
        }

        // verify required parameter 'endMs' is not null or undefined
        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getVehicleSafetyScore.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (startMs !== undefined) {
            localVarQueryParameters['startMs'] = ObjectSerializer.serialize(startMs, "number");
        }

        if (endMs !== undefined) {
            localVarQueryParameters['endMs'] = ObjectSerializer.serialize(endMs, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: VehicleSafetyScoreResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "VehicleSafetyScoreResponse");
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
     * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
     * @summary /fleet/vehicles/stats
     * @param accessToken Samsara API access token.
     * @param startMs Time in Unix epoch milliseconds for the start of the query.
     * @param endMs Time in Unix epoch milliseconds for the end of the query.
     * @param series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2
     * @param tagIds Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3
     * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
     * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
     * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
     */
    public getVehicleStats (accessToken: string, startMs: number, endMs: number, series?: 'engineState' | 'auxInput1' | 'auxInput2', tagIds?: string, startingAfter?: string, endingBefore?: string, limit?: number, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: InlineResponse2005;  }> {
        const localVarPath = this.basePath + '/fleet/vehicles/stats';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getVehicleStats.');
        }

        // verify required parameter 'startMs' is not null or undefined
        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getVehicleStats.');
        }

        // verify required parameter 'endMs' is not null or undefined
        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getVehicleStats.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (startMs !== undefined) {
            localVarQueryParameters['startMs'] = ObjectSerializer.serialize(startMs, "number");
        }

        if (endMs !== undefined) {
            localVarQueryParameters['endMs'] = ObjectSerializer.serialize(endMs, "number");
        }

        if (series !== undefined) {
            localVarQueryParameters['series'] = ObjectSerializer.serialize(series, "'engineState' | 'auxInput1' | 'auxInput2'");
        }

        if (tagIds !== undefined) {
            localVarQueryParameters['tagIds'] = ObjectSerializer.serialize(tagIds, "string");
        }

        if (startingAfter !== undefined) {
            localVarQueryParameters['startingAfter'] = ObjectSerializer.serialize(startingAfter, "string");
        }

        if (endingBefore !== undefined) {
            localVarQueryParameters['endingBefore'] = ObjectSerializer.serialize(endingBefore, "string");
        }

        if (limit !== undefined) {
            localVarQueryParameters['limit'] = ObjectSerializer.serialize(limit, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: InlineResponse2005;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "InlineResponse2005");
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
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
     * @summary /fleet/vehicles/locations
     * @param accessToken Samsara API access token.
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
     */
    public getVehiclesLocations (accessToken: string, startMs: number, endMs: number, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: Array<any>;  }> {
        const localVarPath = this.basePath + '/fleet/vehicles/locations';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getVehiclesLocations.');
        }

        // verify required parameter 'startMs' is not null or undefined
        if (startMs === null || startMs === undefined) {
            throw new Error('Required parameter startMs was null or undefined when calling getVehiclesLocations.');
        }

        // verify required parameter 'endMs' is not null or undefined
        if (endMs === null || endMs === undefined) {
            throw new Error('Required parameter endMs was null or undefined when calling getVehiclesLocations.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (startMs !== undefined) {
            localVarQueryParameters['startMs'] = ObjectSerializer.serialize(startMs, "number");
        }

        if (endMs !== undefined) {
            localVarQueryParameters['endMs'] = ObjectSerializer.serialize(endMs, "number");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Array<any>;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Array<any>");
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
     * Fetch all contacts for the organization.
     * @summary /contacts
     * @param accessToken Samsara API access token.
     */
    public listContacts (accessToken: string, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: Array<Contact>;  }> {
        const localVarPath = this.basePath + '/contacts';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling listContacts.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Array<Contact>;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Array<Contact>");
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
     * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
     * @summary /fleet/list
     * @param accessToken Samsara API access token.
     * @param groupParam 
     * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
     * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
     * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
     */
    public listFleet (accessToken: string, groupParam: InlineObject10, startingAfter?: string, endingBefore?: string, limit?: number, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: InlineResponse2002;  }> {
        const localVarPath = this.basePath + '/fleet/list';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling listFleet.');
        }

        // verify required parameter 'groupParam' is not null or undefined
        if (groupParam === null || groupParam === undefined) {
            throw new Error('Required parameter groupParam was null or undefined when calling listFleet.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        if (startingAfter !== undefined) {
            localVarQueryParameters['startingAfter'] = ObjectSerializer.serialize(startingAfter, "string");
        }

        if (endingBefore !== undefined) {
            localVarQueryParameters['endingBefore'] = ObjectSerializer.serialize(endingBefore, "string");
        }

        if (limit !== undefined) {
            localVarQueryParameters['limit'] = ObjectSerializer.serialize(limit, "number");
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
            body: ObjectSerializer.serialize(groupParam, "InlineObject10")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: InlineResponse2002;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "InlineResponse2002");
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
     * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
     * @summary /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param accessToken Samsara API access token.
     * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
     * @param data 
     */
    public patchFleetVehicle (accessToken: string, vehicleIdOrExternalId: string, data: InlineObject16, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: FleetVehicleResponse;  }> {
        const localVarPath = this.basePath + '/fleet/vehicles/{vehicle_id_or_external_id}'
            .replace('{' + 'vehicle_id_or_external_id' + '}', encodeURIComponent(String(vehicleIdOrExternalId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling patchFleetVehicle.');
        }

        // verify required parameter 'vehicleIdOrExternalId' is not null or undefined
        if (vehicleIdOrExternalId === null || vehicleIdOrExternalId === undefined) {
            throw new Error('Required parameter vehicleIdOrExternalId was null or undefined when calling patchFleetVehicle.');
        }

        // verify required parameter 'data' is not null or undefined
        if (data === null || data === undefined) {
            throw new Error('Required parameter data was null or undefined when calling patchFleetVehicle.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'PATCH',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(data, "InlineObject16")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: FleetVehicleResponse;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "FleetVehicleResponse");
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
     * Reactivate the inactive driver having id.
     * @summary /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * @param accessToken Samsara API access token.
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
     * @param reactivateDriverParam 
     */
    public reactivateDriverById (accessToken: string, driverIdOrExternalId: string, reactivateDriverParam: InlineObject4, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: Driver;  }> {
        const localVarPath = this.basePath + '/fleet/drivers/inactive/{driver_id_or_external_id}'
            .replace('{' + 'driver_id_or_external_id' + '}', encodeURIComponent(String(driverIdOrExternalId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling reactivateDriverById.');
        }

        // verify required parameter 'driverIdOrExternalId' is not null or undefined
        if (driverIdOrExternalId === null || driverIdOrExternalId === undefined) {
            throw new Error('Required parameter driverIdOrExternalId was null or undefined when calling reactivateDriverById.');
        }

        // verify required parameter 'reactivateDriverParam' is not null or undefined
        if (reactivateDriverParam === null || reactivateDriverParam === undefined) {
            throw new Error('Required parameter reactivateDriverParam was null or undefined when calling reactivateDriverById.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'PUT',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(reactivateDriverParam, "InlineObject4")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: Driver;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "Driver");
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
     * Update a dispatch route and its associated jobs.
     * @summary /fleet/dispatch/routes/{route_id:[0-9]+}/
     * @param accessToken Samsara API access token.
     * @param routeId ID of the dispatch route.
     * @param updateDispatchRouteParams 
     */
    public updateDispatchRouteById (accessToken: string, routeId: number, updateDispatchRouteParams: DispatchRoute, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: DispatchRoute;  }> {
        const localVarPath = this.basePath + '/fleet/dispatch/routes/{route_id}'
            .replace('{' + 'route_id' + '}', encodeURIComponent(String(routeId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

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
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'PUT',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(updateDispatchRouteParams, "DispatchRoute")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: DispatchRoute;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "DispatchRoute");
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
     * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
     * @summary /addresses/{addressId}
     * @param accessToken Samsara API access token.
     * @param addressId ID of the address/geofence
     * @param address 
     */
    public updateOrganizationAddress (accessToken: string, addressId: number, address: InlineObject1, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body?: any;  }> {
        const localVarPath = this.basePath + '/addresses/{addressId}'
            .replace('{' + 'addressId' + '}', encodeURIComponent(String(addressId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling updateOrganizationAddress.');
        }

        // verify required parameter 'addressId' is not null or undefined
        if (addressId === null || addressId === undefined) {
            throw new Error('Required parameter addressId was null or undefined when calling updateOrganizationAddress.');
        }

        // verify required parameter 'address' is not null or undefined
        if (address === null || address === undefined) {
            throw new Error('Required parameter address was null or undefined when calling updateOrganizationAddress.');
        }

        if (accessToken !== undefined) {
            localVarQueryParameters['access_token'] = ObjectSerializer.serialize(accessToken, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'PATCH',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(address, "InlineObject1")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body?: any;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
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
     * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
     * @summary /fleet/set_data
     * @param accessToken Samsara API access token.
     * @param vehicleUpdateParam 
     */
    public updateVehicles (accessToken: string, vehicleUpdateParam: InlineObject14, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body?: any;  }> {
        const localVarPath = this.basePath + '/fleet/set_data';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'accessToken' is not null or undefined
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling updateVehicles.');
        }

        // verify required parameter 'vehicleUpdateParam' is not null or undefined
        if (vehicleUpdateParam === null || vehicleUpdateParam === undefined) {
            throw new Error('Required parameter vehicleUpdateParam was null or undefined when calling updateVehicles.');
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
            body: ObjectSerializer.serialize(vehicleUpdateParam, "InlineObject14")
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body?: any;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
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
