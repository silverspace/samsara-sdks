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
    DataInputHistoryResponse,
    InlineObject17,
    InlineObject18,
    InlineResponse2006,
    InlineResponse2007,
    MachineHistoryResponse,
} from '../models';

export interface GetAllDataInputsRequest {
    accessToken: string;
    groupId?: number;
    startMs?: number;
    endMs?: number;
}

export interface GetDataInputRequest {
    accessToken: string;
    dataInputId: number;
    startMs?: number;
    endMs?: number;
}

export interface GetMachinesRequest {
    accessToken: string;
    groupParam: InlineObject18;
}

export interface GetMachinesHistoryRequest {
    accessToken: string;
    historyParam: InlineObject17;
}

/**
 * no description
 */
export class IndustrialApi extends BaseAPI {

    /**
     * Fetch all of the data inputs for a group.
     * /industrial/data
     */
    getAllDataInputsRaw(requestParameters: GetAllDataInputsRequest): Observable<InlineResponse2006> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getAllDataInputs.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.groupId !== undefined && requestParameters.groupId !== null) {
            queryParameters['group_id'] = requestParameters.groupId;
        }

        if (requestParameters.startMs !== undefined && requestParameters.startMs !== null) {
            queryParameters['startMs'] = requestParameters.startMs;
        }

        if (requestParameters.endMs !== undefined && requestParameters.endMs !== null) {
            queryParameters['endMs'] = requestParameters.endMs;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<InlineResponse2006>({
            path: `/industrial/data`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch all of the data inputs for a group.
     * /industrial/data
     */
    getAllDataInputs(requestParameters: GetAllDataInputsRequest): Observable<InlineResponse2006> {
        return this.getAllDataInputsRaw(requestParameters);
    }

    /**
     * Fetch datapoints from a given data input.
     * /industrial/data/{data_input_id:[0-9]+}
     */
    getDataInputRaw(requestParameters: GetDataInputRequest): Observable<DataInputHistoryResponse> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDataInput.');
        }

        if (requestParameters.dataInputId === null || requestParameters.dataInputId === undefined) {
            throw new RequiredError('dataInputId','Required parameter requestParameters.dataInputId was null or undefined when calling getDataInput.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.startMs !== undefined && requestParameters.startMs !== null) {
            queryParameters['startMs'] = requestParameters.startMs;
        }

        if (requestParameters.endMs !== undefined && requestParameters.endMs !== null) {
            queryParameters['endMs'] = requestParameters.endMs;
        }

        const headerParameters: HttpHeaders = {};

        return this.request<DataInputHistoryResponse>({
            path: `/industrial/data/{data_input_id}`.replace(`{${"data_input_id"}}`, encodeURIComponent(String(requestParameters.dataInputId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });
    }

    /**
     * Fetch datapoints from a given data input.
     * /industrial/data/{data_input_id:[0-9]+}
     */
    getDataInput(requestParameters: GetDataInputRequest): Observable<DataInputHistoryResponse> {
        return this.getDataInputRaw(requestParameters);
    }

    /**
     * Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
     * /machines/list
     */
    getMachinesRaw(requestParameters: GetMachinesRequest): Observable<InlineResponse2007> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getMachines.');
        }

        if (requestParameters.groupParam === null || requestParameters.groupParam === undefined) {
            throw new RequiredError('groupParam','Required parameter requestParameters.groupParam was null or undefined when calling getMachines.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<InlineResponse2007>({
            path: `/machines/list`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.groupParam,
        });
    }

    /**
     * Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
     * /machines/list
     */
    getMachines(requestParameters: GetMachinesRequest): Observable<InlineResponse2007> {
        return this.getMachinesRaw(requestParameters);
    }

    /**
     * Get historical data for machine objects. This method returns a set of historical data for all machines in a group
     * /machines/history
     */
    getMachinesHistoryRaw(requestParameters: GetMachinesHistoryRequest): Observable<MachineHistoryResponse> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getMachinesHistory.');
        }

        if (requestParameters.historyParam === null || requestParameters.historyParam === undefined) {
            throw new RequiredError('historyParam','Required parameter requestParameters.historyParam was null or undefined when calling getMachinesHistory.');
        }

        const queryParameters: HttpQuery = {};

        if (requestParameters.accessToken !== undefined && requestParameters.accessToken !== null) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: HttpHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        return this.request<MachineHistoryResponse>({
            path: `/machines/history`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters.historyParam,
        });
    }

    /**
     * Get historical data for machine objects. This method returns a set of historical data for all machines in a group
     * /machines/history
     */
    getMachinesHistory(requestParameters: GetMachinesHistoryRequest): Observable<MachineHistoryResponse> {
        return this.getMachinesHistoryRaw(requestParameters);
    }

}
