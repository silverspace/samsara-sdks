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


import * as runtime from '../runtime';
import {
    DataInputHistoryResponse,
    DataInputHistoryResponseFromJSON,
    DataInputHistoryResponseToJSON,
    InlineObject17,
    InlineObject17FromJSON,
    InlineObject17ToJSON,
    InlineObject18,
    InlineObject18FromJSON,
    InlineObject18ToJSON,
    InlineResponse2006,
    InlineResponse2006FromJSON,
    InlineResponse2006ToJSON,
    InlineResponse2007,
    InlineResponse2007FromJSON,
    InlineResponse2007ToJSON,
    MachineHistoryResponse,
    MachineHistoryResponseFromJSON,
    MachineHistoryResponseToJSON,
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
export class IndustrialApi extends runtime.BaseAPI {

    /**
     * Fetch all of the data inputs for a group.
     * /industrial/data
     */
    async getAllDataInputsRaw(requestParameters: GetAllDataInputsRequest): Promise<runtime.ApiResponse<InlineResponse2006>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getAllDataInputs.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.groupId !== undefined) {
            queryParameters['group_id'] = requestParameters.groupId;
        }

        if (requestParameters.startMs !== undefined) {
            queryParameters['startMs'] = requestParameters.startMs;
        }

        if (requestParameters.endMs !== undefined) {
            queryParameters['endMs'] = requestParameters.endMs;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/industrial/data`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => InlineResponse2006FromJSON(jsonValue));
    }

    /**
     * Fetch all of the data inputs for a group.
     * /industrial/data
     */
    async getAllDataInputs(requestParameters: GetAllDataInputsRequest): Promise<InlineResponse2006> {
        const response = await this.getAllDataInputsRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch datapoints from a given data input.
     * /industrial/data/{data_input_id:[0-9]+}
     */
    async getDataInputRaw(requestParameters: GetDataInputRequest): Promise<runtime.ApiResponse<DataInputHistoryResponse>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getDataInput.');
        }

        if (requestParameters.dataInputId === null || requestParameters.dataInputId === undefined) {
            throw new runtime.RequiredError('dataInputId','Required parameter requestParameters.dataInputId was null or undefined when calling getDataInput.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.startMs !== undefined) {
            queryParameters['startMs'] = requestParameters.startMs;
        }

        if (requestParameters.endMs !== undefined) {
            queryParameters['endMs'] = requestParameters.endMs;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/industrial/data/{data_input_id}`.replace(`{${"data_input_id"}}`, encodeURIComponent(String(requestParameters.dataInputId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DataInputHistoryResponseFromJSON(jsonValue));
    }

    /**
     * Fetch datapoints from a given data input.
     * /industrial/data/{data_input_id:[0-9]+}
     */
    async getDataInput(requestParameters: GetDataInputRequest): Promise<DataInputHistoryResponse> {
        const response = await this.getDataInputRaw(requestParameters);
        return await response.value();
    }

    /**
     * Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
     * /machines/list
     */
    async getMachinesRaw(requestParameters: GetMachinesRequest): Promise<runtime.ApiResponse<InlineResponse2007>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getMachines.');
        }

        if (requestParameters.groupParam === null || requestParameters.groupParam === undefined) {
            throw new runtime.RequiredError('groupParam','Required parameter requestParameters.groupParam was null or undefined when calling getMachines.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/machines/list`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: InlineObject18ToJSON(requestParameters.groupParam),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => InlineResponse2007FromJSON(jsonValue));
    }

    /**
     * Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
     * /machines/list
     */
    async getMachines(requestParameters: GetMachinesRequest): Promise<InlineResponse2007> {
        const response = await this.getMachinesRaw(requestParameters);
        return await response.value();
    }

    /**
     * Get historical data for machine objects. This method returns a set of historical data for all machines in a group
     * /machines/history
     */
    async getMachinesHistoryRaw(requestParameters: GetMachinesHistoryRequest): Promise<runtime.ApiResponse<MachineHistoryResponse>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getMachinesHistory.');
        }

        if (requestParameters.historyParam === null || requestParameters.historyParam === undefined) {
            throw new runtime.RequiredError('historyParam','Required parameter requestParameters.historyParam was null or undefined when calling getMachinesHistory.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/machines/history`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: InlineObject17ToJSON(requestParameters.historyParam),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => MachineHistoryResponseFromJSON(jsonValue));
    }

    /**
     * Get historical data for machine objects. This method returns a set of historical data for all machines in a group
     * /machines/history
     */
    async getMachinesHistory(requestParameters: GetMachinesHistoryRequest): Promise<MachineHistoryResponse> {
        const response = await this.getMachinesHistoryRaw(requestParameters);
        return await response.value();
    }

}
