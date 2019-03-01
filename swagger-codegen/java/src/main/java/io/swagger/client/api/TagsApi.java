/*
 * Samsara API
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.InlineResponse2009;
import io.swagger.client.model.Tag;
import io.swagger.client.model.TagCreate;
import io.swagger.client.model.TagModify;
import io.swagger.client.model.TagUpdate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TagsApi {
    private ApiClient apiClient;

    public TagsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TagsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createTag
     * @param accessToken Samsara API access token. (required)
     * @param tagCreateParams  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createTagCall(String accessToken, TagCreate tagCreateParams, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = tagCreateParams;

        // create path and map variables
        String localVarPath = "/tags";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createTagValidateBeforeCall(String accessToken, TagCreate tagCreateParams, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling createTag(Async)");
        }
        
        // verify the required parameter 'tagCreateParams' is set
        if (tagCreateParams == null) {
            throw new ApiException("Missing the required parameter 'tagCreateParams' when calling createTag(Async)");
        }
        

        com.squareup.okhttp.Call call = createTagCall(accessToken, tagCreateParams, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /tags
     * Create a new tag for the group.
     * @param accessToken Samsara API access token. (required)
     * @param tagCreateParams  (required)
     * @return Tag
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Tag createTag(String accessToken, TagCreate tagCreateParams) throws ApiException {
        ApiResponse<Tag> resp = createTagWithHttpInfo(accessToken, tagCreateParams);
        return resp.getData();
    }

    /**
     * /tags
     * Create a new tag for the group.
     * @param accessToken Samsara API access token. (required)
     * @param tagCreateParams  (required)
     * @return ApiResponse&lt;Tag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Tag> createTagWithHttpInfo(String accessToken, TagCreate tagCreateParams) throws ApiException {
        com.squareup.okhttp.Call call = createTagValidateBeforeCall(accessToken, tagCreateParams, null, null);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /tags (asynchronously)
     * Create a new tag for the group.
     * @param accessToken Samsara API access token. (required)
     * @param tagCreateParams  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createTagAsync(String accessToken, TagCreate tagCreateParams, final ApiCallback<Tag> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createTagValidateBeforeCall(accessToken, tagCreateParams, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteTagById
     * @param accessToken Samsara API access token. (required)
     * @param tagId ID of the tag. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteTagByIdCall(String accessToken, Long tagId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/tags/{tag_id}"
            .replaceAll("\\{" + "tag_id" + "\\}", apiClient.escapeString(tagId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteTagByIdValidateBeforeCall(String accessToken, Long tagId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling deleteTagById(Async)");
        }
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new ApiException("Missing the required parameter 'tagId' when calling deleteTagById(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteTagByIdCall(accessToken, tagId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /tags/{tag_id:[0-9]+}
     * Permanently deletes a tag.
     * @param accessToken Samsara API access token. (required)
     * @param tagId ID of the tag. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteTagById(String accessToken, Long tagId) throws ApiException {
        deleteTagByIdWithHttpInfo(accessToken, tagId);
    }

    /**
     * /tags/{tag_id:[0-9]+}
     * Permanently deletes a tag.
     * @param accessToken Samsara API access token. (required)
     * @param tagId ID of the tag. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteTagByIdWithHttpInfo(String accessToken, Long tagId) throws ApiException {
        com.squareup.okhttp.Call call = deleteTagByIdValidateBeforeCall(accessToken, tagId, null, null);
        return apiClient.execute(call);
    }

    /**
     * /tags/{tag_id:[0-9]+} (asynchronously)
     * Permanently deletes a tag.
     * @param accessToken Samsara API access token. (required)
     * @param tagId ID of the tag. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteTagByIdAsync(String accessToken, Long tagId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteTagByIdValidateBeforeCall(accessToken, tagId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getAllTags
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllTagsCall(String accessToken, Long groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/tags";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (groupId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("group_id", groupId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAllTagsValidateBeforeCall(String accessToken, Long groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getAllTags(Async)");
        }
        

        com.squareup.okhttp.Call call = getAllTagsCall(accessToken, groupId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /tags
     * Fetch all of the tags for a group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @return InlineResponse2009
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2009 getAllTags(String accessToken, Long groupId) throws ApiException {
        ApiResponse<InlineResponse2009> resp = getAllTagsWithHttpInfo(accessToken, groupId);
        return resp.getData();
    }

    /**
     * /tags
     * Fetch all of the tags for a group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @return ApiResponse&lt;InlineResponse2009&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2009> getAllTagsWithHttpInfo(String accessToken, Long groupId) throws ApiException {
        com.squareup.okhttp.Call call = getAllTagsValidateBeforeCall(accessToken, groupId, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2009>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /tags (asynchronously)
     * Fetch all of the tags for a group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllTagsAsync(String accessToken, Long groupId, final ApiCallback<InlineResponse2009> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAllTagsValidateBeforeCall(accessToken, groupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2009>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTagById
     * @param accessToken Samsara API access token. (required)
     * @param tagId ID of the tag. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTagByIdCall(String accessToken, Long tagId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/tags/{tag_id}"
            .replaceAll("\\{" + "tag_id" + "\\}", apiClient.escapeString(tagId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTagByIdValidateBeforeCall(String accessToken, Long tagId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getTagById(Async)");
        }
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new ApiException("Missing the required parameter 'tagId' when calling getTagById(Async)");
        }
        

        com.squareup.okhttp.Call call = getTagByIdCall(accessToken, tagId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /tags/{tag_id:[0-9]+}
     * Fetch a tag by id.
     * @param accessToken Samsara API access token. (required)
     * @param tagId ID of the tag. (required)
     * @return Tag
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Tag getTagById(String accessToken, Long tagId) throws ApiException {
        ApiResponse<Tag> resp = getTagByIdWithHttpInfo(accessToken, tagId);
        return resp.getData();
    }

    /**
     * /tags/{tag_id:[0-9]+}
     * Fetch a tag by id.
     * @param accessToken Samsara API access token. (required)
     * @param tagId ID of the tag. (required)
     * @return ApiResponse&lt;Tag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Tag> getTagByIdWithHttpInfo(String accessToken, Long tagId) throws ApiException {
        com.squareup.okhttp.Call call = getTagByIdValidateBeforeCall(accessToken, tagId, null, null);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /tags/{tag_id:[0-9]+} (asynchronously)
     * Fetch a tag by id.
     * @param accessToken Samsara API access token. (required)
     * @param tagId ID of the tag. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTagByIdAsync(String accessToken, Long tagId, final ApiCallback<Tag> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTagByIdValidateBeforeCall(accessToken, tagId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for modifyTagById
     * @param accessToken Samsara API access token. (required)
     * @param tagId ID of the tag. (required)
     * @param tagModifyParams  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call modifyTagByIdCall(String accessToken, Long tagId, TagModify tagModifyParams, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = tagModifyParams;

        // create path and map variables
        String localVarPath = "/tags/{tag_id}"
            .replaceAll("\\{" + "tag_id" + "\\}", apiClient.escapeString(tagId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call modifyTagByIdValidateBeforeCall(String accessToken, Long tagId, TagModify tagModifyParams, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling modifyTagById(Async)");
        }
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new ApiException("Missing the required parameter 'tagId' when calling modifyTagById(Async)");
        }
        
        // verify the required parameter 'tagModifyParams' is set
        if (tagModifyParams == null) {
            throw new ApiException("Missing the required parameter 'tagModifyParams' when calling modifyTagById(Async)");
        }
        

        com.squareup.okhttp.Call call = modifyTagByIdCall(accessToken, tagId, tagModifyParams, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /tags/{tag_id:[0-9]+}
     * Add or delete specific members from a tag, or modify the name of a tag.
     * @param accessToken Samsara API access token. (required)
     * @param tagId ID of the tag. (required)
     * @param tagModifyParams  (required)
     * @return Tag
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Tag modifyTagById(String accessToken, Long tagId, TagModify tagModifyParams) throws ApiException {
        ApiResponse<Tag> resp = modifyTagByIdWithHttpInfo(accessToken, tagId, tagModifyParams);
        return resp.getData();
    }

    /**
     * /tags/{tag_id:[0-9]+}
     * Add or delete specific members from a tag, or modify the name of a tag.
     * @param accessToken Samsara API access token. (required)
     * @param tagId ID of the tag. (required)
     * @param tagModifyParams  (required)
     * @return ApiResponse&lt;Tag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Tag> modifyTagByIdWithHttpInfo(String accessToken, Long tagId, TagModify tagModifyParams) throws ApiException {
        com.squareup.okhttp.Call call = modifyTagByIdValidateBeforeCall(accessToken, tagId, tagModifyParams, null, null);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /tags/{tag_id:[0-9]+} (asynchronously)
     * Add or delete specific members from a tag, or modify the name of a tag.
     * @param accessToken Samsara API access token. (required)
     * @param tagId ID of the tag. (required)
     * @param tagModifyParams  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call modifyTagByIdAsync(String accessToken, Long tagId, TagModify tagModifyParams, final ApiCallback<Tag> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = modifyTagByIdValidateBeforeCall(accessToken, tagId, tagModifyParams, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateTagById
     * @param accessToken Samsara API access token. (required)
     * @param tagId ID of the tag. (required)
     * @param updateTagParams  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateTagByIdCall(String accessToken, Long tagId, TagUpdate updateTagParams, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = updateTagParams;

        // create path and map variables
        String localVarPath = "/tags/{tag_id}"
            .replaceAll("\\{" + "tag_id" + "\\}", apiClient.escapeString(tagId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateTagByIdValidateBeforeCall(String accessToken, Long tagId, TagUpdate updateTagParams, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling updateTagById(Async)");
        }
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new ApiException("Missing the required parameter 'tagId' when calling updateTagById(Async)");
        }
        
        // verify the required parameter 'updateTagParams' is set
        if (updateTagParams == null) {
            throw new ApiException("Missing the required parameter 'updateTagParams' when calling updateTagById(Async)");
        }
        

        com.squareup.okhttp.Call call = updateTagByIdCall(accessToken, tagId, updateTagParams, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /tags/{tag_id:[0-9]+}
     * Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
     * @param accessToken Samsara API access token. (required)
     * @param tagId ID of the tag. (required)
     * @param updateTagParams  (required)
     * @return Tag
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Tag updateTagById(String accessToken, Long tagId, TagUpdate updateTagParams) throws ApiException {
        ApiResponse<Tag> resp = updateTagByIdWithHttpInfo(accessToken, tagId, updateTagParams);
        return resp.getData();
    }

    /**
     * /tags/{tag_id:[0-9]+}
     * Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
     * @param accessToken Samsara API access token. (required)
     * @param tagId ID of the tag. (required)
     * @param updateTagParams  (required)
     * @return ApiResponse&lt;Tag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Tag> updateTagByIdWithHttpInfo(String accessToken, Long tagId, TagUpdate updateTagParams) throws ApiException {
        com.squareup.okhttp.Call call = updateTagByIdValidateBeforeCall(accessToken, tagId, updateTagParams, null, null);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /tags/{tag_id:[0-9]+} (asynchronously)
     * Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
     * @param accessToken Samsara API access token. (required)
     * @param tagId ID of the tag. (required)
     * @param updateTagParams  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateTagByIdAsync(String accessToken, Long tagId, TagUpdate updateTagParams, final ApiCallback<Tag> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateTagByIdValidateBeforeCall(accessToken, tagId, updateTagParams, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
