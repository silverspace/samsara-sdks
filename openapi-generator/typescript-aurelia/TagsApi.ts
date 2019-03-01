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

import { autoinject } from 'aurelia-framework';
import { HttpClient } from 'aurelia-http-client';
import { Api } from './Api';
import { AuthStorage } from './AuthStorage';
import {
  InlineResponse2009,
  TagCreate,
  Tag,
  TagModify,
  TagUpdate,
} from './models';

/**
 * createTag - parameters interface
 */
export interface ICreateTagParams {
  accessToken: string;
  tagCreateParams: TagCreate;
}

/**
 * deleteTagById - parameters interface
 */
export interface IDeleteTagByIdParams {
  accessToken: string;
  tagId: number;
}

/**
 * getAllTags - parameters interface
 */
export interface IGetAllTagsParams {
  accessToken: string;
  groupId?: number;
}

/**
 * getTagById - parameters interface
 */
export interface IGetTagByIdParams {
  accessToken: string;
  tagId: number;
}

/**
 * modifyTagById - parameters interface
 */
export interface IModifyTagByIdParams {
  accessToken: string;
  tagId: number;
  tagModifyParams: TagModify;
}

/**
 * updateTagById - parameters interface
 */
export interface IUpdateTagByIdParams {
  accessToken: string;
  tagId: number;
  updateTagParams: TagUpdate;
}

/**
 * TagsApi - API class
 */
@autoinject()
export class TagsApi extends Api {

  /**
   * Creates a new TagsApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * /tags
   * Create a new tag for the group.
   * @param params.accessToken Samsara API access token.
   * @param params.tagCreateParams 
   */
  async createTag(params: ICreateTagParams): Promise<Tag> {
    // Verify required parameters are set
    this.ensureParamIsSet('createTag', params, 'accessToken');
    this.ensureParamIsSet('createTag', params, 'tagCreateParams');

    // Create URL to call
    const url = `${this.basePath}/tags`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['tagCreateParams'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /tags/{tag_id:[0-9]+}
   * Permanently deletes a tag.
   * @param params.accessToken Samsara API access token.
   * @param params.tagId ID of the tag.
   */
  async deleteTagById(params: IDeleteTagByIdParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('deleteTagById', params, 'accessToken');
    this.ensureParamIsSet('deleteTagById', params, 'tagId');

    // Create URL to call
    const url = `${this.basePath}/tags/{tag_id}`
      .replace(`{${'tag_id'}}`, encodeURIComponent(`${params['tagId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asDelete()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /tags
   * Fetch all of the tags for a group.
   * @param params.accessToken Samsara API access token.
   * @param params.groupId Optional group ID if the organization has multiple groups (uncommon).
   */
  async getAllTags(params: IGetAllTagsParams): Promise<InlineResponse2009> {
    // Verify required parameters are set
    this.ensureParamIsSet('getAllTags', params, 'accessToken');

    // Create URL to call
    const url = `${this.basePath}/tags`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
        'group_id': params['groupId'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /tags/{tag_id:[0-9]+}
   * Fetch a tag by id.
   * @param params.accessToken Samsara API access token.
   * @param params.tagId ID of the tag.
   */
  async getTagById(params: IGetTagByIdParams): Promise<Tag> {
    // Verify required parameters are set
    this.ensureParamIsSet('getTagById', params, 'accessToken');
    this.ensureParamIsSet('getTagById', params, 'tagId');

    // Create URL to call
    const url = `${this.basePath}/tags/{tag_id}`
      .replace(`{${'tag_id'}}`, encodeURIComponent(`${params['tagId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /tags/{tag_id:[0-9]+}
   * Add or delete specific members from a tag, or modify the name of a tag.
   * @param params.accessToken Samsara API access token.
   * @param params.tagId ID of the tag.
   * @param params.tagModifyParams 
   */
  async modifyTagById(params: IModifyTagByIdParams): Promise<Tag> {
    // Verify required parameters are set
    this.ensureParamIsSet('modifyTagById', params, 'accessToken');
    this.ensureParamIsSet('modifyTagById', params, 'tagId');
    this.ensureParamIsSet('modifyTagById', params, 'tagModifyParams');

    // Create URL to call
    const url = `${this.basePath}/tags/{tag_id}`
      .replace(`{${'tag_id'}}`, encodeURIComponent(`${params['tagId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPatch()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['tagModifyParams'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * /tags/{tag_id:[0-9]+}
   * Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
   * @param params.accessToken Samsara API access token.
   * @param params.tagId ID of the tag.
   * @param params.updateTagParams 
   */
  async updateTagById(params: IUpdateTagByIdParams): Promise<Tag> {
    // Verify required parameters are set
    this.ensureParamIsSet('updateTagById', params, 'accessToken');
    this.ensureParamIsSet('updateTagById', params, 'tagId');
    this.ensureParamIsSet('updateTagById', params, 'updateTagParams');

    // Create URL to call
    const url = `${this.basePath}/tags/{tag_id}`
      .replace(`{${'tag_id'}}`, encodeURIComponent(`${params['tagId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPut()
      // Set query parameters
      .withParams({ 
        'access_token': params['accessToken'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['updateTagParams'] || {}))

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

}

