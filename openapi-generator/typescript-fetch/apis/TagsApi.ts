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
    InlineResponse2009,
    InlineResponse2009FromJSON,
    InlineResponse2009ToJSON,
    Tag,
    TagFromJSON,
    TagToJSON,
    TagCreate,
    TagCreateFromJSON,
    TagCreateToJSON,
    TagModify,
    TagModifyFromJSON,
    TagModifyToJSON,
    TagUpdate,
    TagUpdateFromJSON,
    TagUpdateToJSON,
} from '../models';

export interface CreateTagRequest {
    accessToken: string;
    tagCreateParams: TagCreate;
}

export interface DeleteTagByIdRequest {
    accessToken: string;
    tagId: number;
}

export interface GetAllTagsRequest {
    accessToken: string;
    groupId?: number;
}

export interface GetTagByIdRequest {
    accessToken: string;
    tagId: number;
}

export interface ModifyTagByIdRequest {
    accessToken: string;
    tagId: number;
    tagModifyParams: TagModify;
}

export interface UpdateTagByIdRequest {
    accessToken: string;
    tagId: number;
    updateTagParams: TagUpdate;
}

/**
 * no description
 */
export class TagsApi extends runtime.BaseAPI {

    /**
     * Create a new tag for the group.
     * /tags
     */
    async createTagRaw(requestParameters: CreateTagRequest): Promise<runtime.ApiResponse<Tag>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling createTag.');
        }

        if (requestParameters.tagCreateParams === null || requestParameters.tagCreateParams === undefined) {
            throw new runtime.RequiredError('tagCreateParams','Required parameter requestParameters.tagCreateParams was null or undefined when calling createTag.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/tags`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: TagCreateToJSON(requestParameters.tagCreateParams),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => TagFromJSON(jsonValue));
    }

    /**
     * Create a new tag for the group.
     * /tags
     */
    async createTag(requestParameters: CreateTagRequest): Promise<Tag> {
        const response = await this.createTagRaw(requestParameters);
        return await response.value();
    }

    /**
     * Permanently deletes a tag.
     * /tags/{tag_id:[0-9]+}
     */
    async deleteTagByIdRaw(requestParameters: DeleteTagByIdRequest): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling deleteTagById.');
        }

        if (requestParameters.tagId === null || requestParameters.tagId === undefined) {
            throw new runtime.RequiredError('tagId','Required parameter requestParameters.tagId was null or undefined when calling deleteTagById.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/tags/{tag_id}`.replace(`{${"tag_id"}}`, encodeURIComponent(String(requestParameters.tagId))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Permanently deletes a tag.
     * /tags/{tag_id:[0-9]+}
     */
    async deleteTagById(requestParameters: DeleteTagByIdRequest): Promise<void> {
        await this.deleteTagByIdRaw(requestParameters);
    }

    /**
     * Fetch all of the tags for a group.
     * /tags
     */
    async getAllTagsRaw(requestParameters: GetAllTagsRequest): Promise<runtime.ApiResponse<InlineResponse2009>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getAllTags.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        if (requestParameters.groupId !== undefined) {
            queryParameters['group_id'] = requestParameters.groupId;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/tags`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => InlineResponse2009FromJSON(jsonValue));
    }

    /**
     * Fetch all of the tags for a group.
     * /tags
     */
    async getAllTags(requestParameters: GetAllTagsRequest): Promise<InlineResponse2009> {
        const response = await this.getAllTagsRaw(requestParameters);
        return await response.value();
    }

    /**
     * Fetch a tag by id.
     * /tags/{tag_id:[0-9]+}
     */
    async getTagByIdRaw(requestParameters: GetTagByIdRequest): Promise<runtime.ApiResponse<Tag>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling getTagById.');
        }

        if (requestParameters.tagId === null || requestParameters.tagId === undefined) {
            throw new runtime.RequiredError('tagId','Required parameter requestParameters.tagId was null or undefined when calling getTagById.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/tags/{tag_id}`.replace(`{${"tag_id"}}`, encodeURIComponent(String(requestParameters.tagId))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => TagFromJSON(jsonValue));
    }

    /**
     * Fetch a tag by id.
     * /tags/{tag_id:[0-9]+}
     */
    async getTagById(requestParameters: GetTagByIdRequest): Promise<Tag> {
        const response = await this.getTagByIdRaw(requestParameters);
        return await response.value();
    }

    /**
     * Add or delete specific members from a tag, or modify the name of a tag.
     * /tags/{tag_id:[0-9]+}
     */
    async modifyTagByIdRaw(requestParameters: ModifyTagByIdRequest): Promise<runtime.ApiResponse<Tag>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling modifyTagById.');
        }

        if (requestParameters.tagId === null || requestParameters.tagId === undefined) {
            throw new runtime.RequiredError('tagId','Required parameter requestParameters.tagId was null or undefined when calling modifyTagById.');
        }

        if (requestParameters.tagModifyParams === null || requestParameters.tagModifyParams === undefined) {
            throw new runtime.RequiredError('tagModifyParams','Required parameter requestParameters.tagModifyParams was null or undefined when calling modifyTagById.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/tags/{tag_id}`.replace(`{${"tag_id"}}`, encodeURIComponent(String(requestParameters.tagId))),
            method: 'PATCH',
            headers: headerParameters,
            query: queryParameters,
            body: TagModifyToJSON(requestParameters.tagModifyParams),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => TagFromJSON(jsonValue));
    }

    /**
     * Add or delete specific members from a tag, or modify the name of a tag.
     * /tags/{tag_id:[0-9]+}
     */
    async modifyTagById(requestParameters: ModifyTagByIdRequest): Promise<Tag> {
        const response = await this.modifyTagByIdRaw(requestParameters);
        return await response.value();
    }

    /**
     * Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
     * /tags/{tag_id:[0-9]+}
     */
    async updateTagByIdRaw(requestParameters: UpdateTagByIdRequest): Promise<runtime.ApiResponse<Tag>> {
        if (requestParameters.accessToken === null || requestParameters.accessToken === undefined) {
            throw new runtime.RequiredError('accessToken','Required parameter requestParameters.accessToken was null or undefined when calling updateTagById.');
        }

        if (requestParameters.tagId === null || requestParameters.tagId === undefined) {
            throw new runtime.RequiredError('tagId','Required parameter requestParameters.tagId was null or undefined when calling updateTagById.');
        }

        if (requestParameters.updateTagParams === null || requestParameters.updateTagParams === undefined) {
            throw new runtime.RequiredError('updateTagParams','Required parameter requestParameters.updateTagParams was null or undefined when calling updateTagById.');
        }

        const queryParameters: runtime.HTTPQuery = {};

        if (requestParameters.accessToken !== undefined) {
            queryParameters['access_token'] = requestParameters.accessToken;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/tags/{tag_id}`.replace(`{${"tag_id"}}`, encodeURIComponent(String(requestParameters.tagId))),
            method: 'PUT',
            headers: headerParameters,
            query: queryParameters,
            body: TagUpdateToJSON(requestParameters.updateTagParams),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => TagFromJSON(jsonValue));
    }

    /**
     * Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
     * /tags/{tag_id:[0-9]+}
     */
    async updateTagById(requestParameters: UpdateTagByIdRequest): Promise<Tag> {
        const response = await this.updateTagByIdRaw(requestParameters);
        return await response.value();
    }

}
