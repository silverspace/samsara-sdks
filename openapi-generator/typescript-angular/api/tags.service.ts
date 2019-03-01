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

import { Inject, Injectable, Optional }                      from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams,
         HttpResponse, HttpEvent }                           from '@angular/common/http';
import { CustomHttpUrlEncodingCodec }                        from '../encoder';

import { Observable }                                        from 'rxjs';

import { InlineResponse2009 } from '../model/inlineResponse2009';
import { Tag } from '../model/tag';
import { TagCreate } from '../model/tagCreate';
import { TagModify } from '../model/tagModify';
import { TagUpdate } from '../model/tagUpdate';

import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';


@Injectable({
  providedIn: 'root'
})
export class TagsService {

    protected basePath = 'https://api.samsara.com/v1';
    public defaultHeaders = new HttpHeaders();
    public configuration = new Configuration();

    constructor(protected httpClient: HttpClient, @Optional()@Inject(BASE_PATH) basePath: string, @Optional() configuration: Configuration) {

        if (configuration) {
            this.configuration = configuration;
            this.configuration.basePath = configuration.basePath || basePath || this.basePath;

        } else {
            this.configuration.basePath = basePath || this.basePath;
        }
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        for (const consume of consumes) {
            if (form === consume) {
                return true;
            }
        }
        return false;
    }


    /**
     * /tags
     * Create a new tag for the group.
     * @param accessToken Samsara API access token.
     * @param tagCreateParams 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public createTag(accessToken: string, tagCreateParams: TagCreate, observe?: 'body', reportProgress?: boolean): Observable<Tag>;
    public createTag(accessToken: string, tagCreateParams: TagCreate, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Tag>>;
    public createTag(accessToken: string, tagCreateParams: TagCreate, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Tag>>;
    public createTag(accessToken: string, tagCreateParams: TagCreate, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling createTag.');
        }
        if (tagCreateParams === null || tagCreateParams === undefined) {
            throw new Error('Required parameter tagCreateParams was null or undefined when calling createTag.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected !== undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post<Tag>(`${this.configuration.basePath}/tags`,
            tagCreateParams,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * /tags/{tag_id:[0-9]+}
     * Permanently deletes a tag.
     * @param accessToken Samsara API access token.
     * @param tagId ID of the tag.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public deleteTagById(accessToken: string, tagId: number, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public deleteTagById(accessToken: string, tagId: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public deleteTagById(accessToken: string, tagId: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public deleteTagById(accessToken: string, tagId: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling deleteTagById.');
        }
        if (tagId === null || tagId === undefined) {
            throw new Error('Required parameter tagId was null or undefined when calling deleteTagById.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.delete<any>(`${this.configuration.basePath}/tags/${encodeURIComponent(String(tagId))}`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * /tags
     * Fetch all of the tags for a group.
     * @param accessToken Samsara API access token.
     * @param groupId Optional group ID if the organization has multiple groups (uncommon).
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getAllTags(accessToken: string, groupId?: number, observe?: 'body', reportProgress?: boolean): Observable<InlineResponse2009>;
    public getAllTags(accessToken: string, groupId?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<InlineResponse2009>>;
    public getAllTags(accessToken: string, groupId?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<InlineResponse2009>>;
    public getAllTags(accessToken: string, groupId?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getAllTags.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }
        if (groupId !== undefined && groupId !== null) {
            queryParameters = queryParameters.set('group_id', <any>groupId);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.get<InlineResponse2009>(`${this.configuration.basePath}/tags`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * /tags/{tag_id:[0-9]+}
     * Fetch a tag by id.
     * @param accessToken Samsara API access token.
     * @param tagId ID of the tag.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getTagById(accessToken: string, tagId: number, observe?: 'body', reportProgress?: boolean): Observable<Tag>;
    public getTagById(accessToken: string, tagId: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Tag>>;
    public getTagById(accessToken: string, tagId: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Tag>>;
    public getTagById(accessToken: string, tagId: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling getTagById.');
        }
        if (tagId === null || tagId === undefined) {
            throw new Error('Required parameter tagId was null or undefined when calling getTagById.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.get<Tag>(`${this.configuration.basePath}/tags/${encodeURIComponent(String(tagId))}`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * /tags/{tag_id:[0-9]+}
     * Add or delete specific members from a tag, or modify the name of a tag.
     * @param accessToken Samsara API access token.
     * @param tagId ID of the tag.
     * @param tagModifyParams 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public modifyTagById(accessToken: string, tagId: number, tagModifyParams: TagModify, observe?: 'body', reportProgress?: boolean): Observable<Tag>;
    public modifyTagById(accessToken: string, tagId: number, tagModifyParams: TagModify, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Tag>>;
    public modifyTagById(accessToken: string, tagId: number, tagModifyParams: TagModify, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Tag>>;
    public modifyTagById(accessToken: string, tagId: number, tagModifyParams: TagModify, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling modifyTagById.');
        }
        if (tagId === null || tagId === undefined) {
            throw new Error('Required parameter tagId was null or undefined when calling modifyTagById.');
        }
        if (tagModifyParams === null || tagModifyParams === undefined) {
            throw new Error('Required parameter tagModifyParams was null or undefined when calling modifyTagById.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected !== undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.patch<Tag>(`${this.configuration.basePath}/tags/${encodeURIComponent(String(tagId))}`,
            tagModifyParams,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * /tags/{tag_id:[0-9]+}
     * Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
     * @param accessToken Samsara API access token.
     * @param tagId ID of the tag.
     * @param updateTagParams 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public updateTagById(accessToken: string, tagId: number, updateTagParams: TagUpdate, observe?: 'body', reportProgress?: boolean): Observable<Tag>;
    public updateTagById(accessToken: string, tagId: number, updateTagParams: TagUpdate, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Tag>>;
    public updateTagById(accessToken: string, tagId: number, updateTagParams: TagUpdate, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Tag>>;
    public updateTagById(accessToken: string, tagId: number, updateTagParams: TagUpdate, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (accessToken === null || accessToken === undefined) {
            throw new Error('Required parameter accessToken was null or undefined when calling updateTagById.');
        }
        if (tagId === null || tagId === undefined) {
            throw new Error('Required parameter tagId was null or undefined when calling updateTagById.');
        }
        if (updateTagParams === null || updateTagParams === undefined) {
            throw new Error('Required parameter updateTagParams was null or undefined when calling updateTagById.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (accessToken !== undefined && accessToken !== null) {
            queryParameters = queryParameters.set('access_token', <any>accessToken);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected !== undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.put<Tag>(`${this.configuration.basePath}/tags/${encodeURIComponent(String(tagId))}`,
            updateTagParams,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

}
