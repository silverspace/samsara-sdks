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

import { InlineResponse2009 } from '../model/inlineResponse2009';
import { Tag } from '../model/tag';
import { TagCreate } from '../model/tagCreate';
import { TagModify } from '../model/tagModify';
import { TagUpdate } from '../model/tagUpdate';

import { COLLECTION_FORMATS }  from '../variables';



@injectable()
export class TagsService {
    private basePath: string = 'https://api.samsara.com/v1';

    constructor(@inject("IApiHttpClient") private httpClient: IHttpClient,
        @inject("IAPIConfiguration") private APIConfiguration: IAPIConfiguration ) {
        if(this.APIConfiguration.basePath)
            this.basePath = this.APIConfiguration.basePath;
    }

    /**
     * /tags
     * Create a new tag for the group.
     * @param accessToken Samsara API access token.
     * @param tagCreateParams 
     
     */
    public createTag(accessToken: string, tagCreateParams: TagCreate, observe?: 'body', headers?: Headers): Observable<Tag>;
    public createTag(accessToken: string, tagCreateParams: TagCreate, observe?: 'response', headers?: Headers): Observable<HttpResponse<Tag>>;
    public createTag(accessToken: string, tagCreateParams: TagCreate, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling createTag.');
        }

        if (!tagCreateParams){
            throw new Error('Required parameter tagCreateParams was null or undefined when calling createTag.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<Tag>> = this.httpClient.post(`${this.basePath}/tags?${queryParameters.join('&')}`, tagCreateParams , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Tag>(httpResponse.response));
        }
        return response;
    }


    /**
     * /tags/{tag_id:[0-9]+}
     * Permanently deletes a tag.
     * @param accessToken Samsara API access token.
     * @param tagId ID of the tag.
     
     */
    public deleteTagById(accessToken: string, tagId: number, observe?: 'body', headers?: Headers): Observable<any>;
    public deleteTagById(accessToken: string, tagId: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<any>>;
    public deleteTagById(accessToken: string, tagId: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling deleteTagById.');
        }

        if (!tagId){
            throw new Error('Required parameter tagId was null or undefined when calling deleteTagById.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<any>> = this.httpClient.delete(`${this.basePath}/tags/${encodeURIComponent(String(tagId))}?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <any>(httpResponse.response));
        }
        return response;
    }


    /**
     * /tags
     * Fetch all of the tags for a group.
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     
     */
    public getAllTags(accessToken: string, groupId?: number, observe?: 'body', headers?: Headers): Observable<InlineResponse2009>;
    public getAllTags(accessToken: string, groupId?: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<InlineResponse2009>>;
    public getAllTags(accessToken: string, groupId?: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getAllTags.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }
        if (groupId !== undefined) {
            queryParameters.push("groupId="+encodeURIComponent(String(groupId)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<InlineResponse2009>> = this.httpClient.get(`${this.basePath}/tags?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <InlineResponse2009>(httpResponse.response));
        }
        return response;
    }


    /**
     * /tags/{tag_id:[0-9]+}
     * Fetch a tag by id.
     * @param accessToken Samsara API access token.
     * @param tagId ID of the tag.
     
     */
    public getTagById(accessToken: string, tagId: number, observe?: 'body', headers?: Headers): Observable<Tag>;
    public getTagById(accessToken: string, tagId: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<Tag>>;
    public getTagById(accessToken: string, tagId: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling getTagById.');
        }

        if (!tagId){
            throw new Error('Required parameter tagId was null or undefined when calling getTagById.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<Tag>> = this.httpClient.get(`${this.basePath}/tags/${encodeURIComponent(String(tagId))}?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Tag>(httpResponse.response));
        }
        return response;
    }


    /**
     * /tags/{tag_id:[0-9]+}
     * Add or delete specific members from a tag, or modify the name of a tag.
     * @param accessToken Samsara API access token.
     * @param tagId ID of the tag.
     * @param tagModifyParams 
     
     */
    public modifyTagById(accessToken: string, tagId: number, tagModifyParams: TagModify, observe?: 'body', headers?: Headers): Observable<Tag>;
    public modifyTagById(accessToken: string, tagId: number, tagModifyParams: TagModify, observe?: 'response', headers?: Headers): Observable<HttpResponse<Tag>>;
    public modifyTagById(accessToken: string, tagId: number, tagModifyParams: TagModify, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling modifyTagById.');
        }

        if (!tagId){
            throw new Error('Required parameter tagId was null or undefined when calling modifyTagById.');
        }

        if (!tagModifyParams){
            throw new Error('Required parameter tagModifyParams was null or undefined when calling modifyTagById.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<Tag>> = this.httpClient.patch(`${this.basePath}/tags/${encodeURIComponent(String(tagId))}?${queryParameters.join('&')}`, tagModifyParams , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Tag>(httpResponse.response));
        }
        return response;
    }


    /**
     * /tags/{tag_id:[0-9]+}
     * Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
     * @param accessToken Samsara API access token.
     * @param tagId ID of the tag.
     * @param updateTagParams 
     
     */
    public updateTagById(accessToken: string, tagId: number, updateTagParams: TagUpdate, observe?: 'body', headers?: Headers): Observable<Tag>;
    public updateTagById(accessToken: string, tagId: number, updateTagParams: TagUpdate, observe?: 'response', headers?: Headers): Observable<HttpResponse<Tag>>;
    public updateTagById(accessToken: string, tagId: number, updateTagParams: TagUpdate, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessToken){
            throw new Error('Required parameter accessToken was null or undefined when calling updateTagById.');
        }

        if (!tagId){
            throw new Error('Required parameter tagId was null or undefined when calling updateTagById.');
        }

        if (!updateTagParams){
            throw new Error('Required parameter updateTagParams was null or undefined when calling updateTagById.');
        }

        let queryParameters: string[] = [];
        if (accessToken !== undefined) {
            queryParameters.push("accessToken="+encodeURIComponent(String(accessToken)));
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<Tag>> = this.httpClient.put(`${this.basePath}/tags/${encodeURIComponent(String(tagId))}?${queryParameters.join('&')}`, updateTagParams , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Tag>(httpResponse.response));
        }
        return response;
    }

}
