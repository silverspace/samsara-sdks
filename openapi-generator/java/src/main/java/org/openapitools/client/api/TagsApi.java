/*
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


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.InlineResponse2009;
import org.openapitools.client.model.Tag;
import org.openapitools.client.model.TagCreate;
import org.openapitools.client.model.TagModify;
import org.openapitools.client.model.TagUpdate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TagsApi {
    private ApiClient localVarApiClient;

    public TagsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TagsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createTag
     * @param accessToken Samsara API access token. (required)
     * @param tagCreateParams  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call createTagCall(String accessToken, TagCreate tagCreateParams, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = tagCreateParams;

        // create path and map variables
        String localVarPath = "/tags";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("access_token", accessToken));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (_progressListener != null) {
            localVarApiClient.setHttpClient(localVarApiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), _progressListener))
                            .build();
                }
            }).build());
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createTagValidateBeforeCall(String accessToken, TagCreate tagCreateParams, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling createTag(Async)");
        }
        
        // verify the required parameter 'tagCreateParams' is set
        if (tagCreateParams == null) {
            throw new ApiException("Missing the required parameter 'tagCreateParams' when calling createTag(Async)");
        }
        

        okhttp3.Call localVarCall = createTagCall(accessToken, tagCreateParams, _progressListener, _progressRequestListener);
        return localVarCall;

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
        ApiResponse<Tag> localVarResp = createTagWithHttpInfo(accessToken, tagCreateParams);
        return localVarResp.getData();
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
        okhttp3.Call localVarCall = createTagValidateBeforeCall(accessToken, tagCreateParams, null, null);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /tags (asynchronously)
     * Create a new tag for the group.
     * @param accessToken Samsara API access token. (required)
     * @param tagCreateParams  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call createTagAsync(String accessToken, TagCreate tagCreateParams, final ApiCallback<Tag> _callback) throws ApiException {

        ProgressResponseBody.ProgressListener _progressListener = null;
        ProgressRequestBody.ProgressRequestListener _progressRequestListener = null;

        if (_callback != null) {
            _progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    _callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            _progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    _callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call localVarCall = createTagValidateBeforeCall(accessToken, tagCreateParams, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteTagById
     * @param accessToken Samsara API access token. (required)
     * @param tagId ID of the tag. (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call deleteTagByIdCall(String accessToken, Long tagId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/tags/{tag_id}"
            .replaceAll("\\{" + "tag_id" + "\\}", localVarApiClient.escapeString(tagId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("access_token", accessToken));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (_progressListener != null) {
            localVarApiClient.setHttpClient(localVarApiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), _progressListener))
                            .build();
                }
            }).build());
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteTagByIdValidateBeforeCall(String accessToken, Long tagId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling deleteTagById(Async)");
        }
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new ApiException("Missing the required parameter 'tagId' when calling deleteTagById(Async)");
        }
        

        okhttp3.Call localVarCall = deleteTagByIdCall(accessToken, tagId, _progressListener, _progressRequestListener);
        return localVarCall;

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
        okhttp3.Call localVarCall = deleteTagByIdValidateBeforeCall(accessToken, tagId, null, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * /tags/{tag_id:[0-9]+} (asynchronously)
     * Permanently deletes a tag.
     * @param accessToken Samsara API access token. (required)
     * @param tagId ID of the tag. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call deleteTagByIdAsync(String accessToken, Long tagId, final ApiCallback<Void> _callback) throws ApiException {

        ProgressResponseBody.ProgressListener _progressListener = null;
        ProgressRequestBody.ProgressRequestListener _progressRequestListener = null;

        if (_callback != null) {
            _progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    _callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            _progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    _callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call localVarCall = deleteTagByIdValidateBeforeCall(accessToken, tagId, _progressListener, _progressRequestListener);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAllTags
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getAllTagsCall(String accessToken, Long groupId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/tags";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("access_token", accessToken));
        }

        if (groupId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("group_id", groupId));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (_progressListener != null) {
            localVarApiClient.setHttpClient(localVarApiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), _progressListener))
                            .build();
                }
            }).build());
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAllTagsValidateBeforeCall(String accessToken, Long groupId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getAllTags(Async)");
        }
        

        okhttp3.Call localVarCall = getAllTagsCall(accessToken, groupId, _progressListener, _progressRequestListener);
        return localVarCall;

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
        ApiResponse<InlineResponse2009> localVarResp = getAllTagsWithHttpInfo(accessToken, groupId);
        return localVarResp.getData();
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
        okhttp3.Call localVarCall = getAllTagsValidateBeforeCall(accessToken, groupId, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2009>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /tags (asynchronously)
     * Fetch all of the tags for a group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getAllTagsAsync(String accessToken, Long groupId, final ApiCallback<InlineResponse2009> _callback) throws ApiException {

        ProgressResponseBody.ProgressListener _progressListener = null;
        ProgressRequestBody.ProgressRequestListener _progressRequestListener = null;

        if (_callback != null) {
            _progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    _callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            _progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    _callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call localVarCall = getAllTagsValidateBeforeCall(accessToken, groupId, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2009>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getTagById
     * @param accessToken Samsara API access token. (required)
     * @param tagId ID of the tag. (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getTagByIdCall(String accessToken, Long tagId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/tags/{tag_id}"
            .replaceAll("\\{" + "tag_id" + "\\}", localVarApiClient.escapeString(tagId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("access_token", accessToken));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (_progressListener != null) {
            localVarApiClient.setHttpClient(localVarApiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), _progressListener))
                            .build();
                }
            }).build());
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTagByIdValidateBeforeCall(String accessToken, Long tagId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getTagById(Async)");
        }
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new ApiException("Missing the required parameter 'tagId' when calling getTagById(Async)");
        }
        

        okhttp3.Call localVarCall = getTagByIdCall(accessToken, tagId, _progressListener, _progressRequestListener);
        return localVarCall;

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
        ApiResponse<Tag> localVarResp = getTagByIdWithHttpInfo(accessToken, tagId);
        return localVarResp.getData();
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
        okhttp3.Call localVarCall = getTagByIdValidateBeforeCall(accessToken, tagId, null, null);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /tags/{tag_id:[0-9]+} (asynchronously)
     * Fetch a tag by id.
     * @param accessToken Samsara API access token. (required)
     * @param tagId ID of the tag. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getTagByIdAsync(String accessToken, Long tagId, final ApiCallback<Tag> _callback) throws ApiException {

        ProgressResponseBody.ProgressListener _progressListener = null;
        ProgressRequestBody.ProgressRequestListener _progressRequestListener = null;

        if (_callback != null) {
            _progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    _callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            _progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    _callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call localVarCall = getTagByIdValidateBeforeCall(accessToken, tagId, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for modifyTagById
     * @param accessToken Samsara API access token. (required)
     * @param tagId ID of the tag. (required)
     * @param tagModifyParams  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call modifyTagByIdCall(String accessToken, Long tagId, TagModify tagModifyParams, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = tagModifyParams;

        // create path and map variables
        String localVarPath = "/tags/{tag_id}"
            .replaceAll("\\{" + "tag_id" + "\\}", localVarApiClient.escapeString(tagId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("access_token", accessToken));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (_progressListener != null) {
            localVarApiClient.setHttpClient(localVarApiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), _progressListener))
                            .build();
                }
            }).build());
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call modifyTagByIdValidateBeforeCall(String accessToken, Long tagId, TagModify tagModifyParams, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
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
        

        okhttp3.Call localVarCall = modifyTagByIdCall(accessToken, tagId, tagModifyParams, _progressListener, _progressRequestListener);
        return localVarCall;

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
        ApiResponse<Tag> localVarResp = modifyTagByIdWithHttpInfo(accessToken, tagId, tagModifyParams);
        return localVarResp.getData();
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
        okhttp3.Call localVarCall = modifyTagByIdValidateBeforeCall(accessToken, tagId, tagModifyParams, null, null);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /tags/{tag_id:[0-9]+} (asynchronously)
     * Add or delete specific members from a tag, or modify the name of a tag.
     * @param accessToken Samsara API access token. (required)
     * @param tagId ID of the tag. (required)
     * @param tagModifyParams  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call modifyTagByIdAsync(String accessToken, Long tagId, TagModify tagModifyParams, final ApiCallback<Tag> _callback) throws ApiException {

        ProgressResponseBody.ProgressListener _progressListener = null;
        ProgressRequestBody.ProgressRequestListener _progressRequestListener = null;

        if (_callback != null) {
            _progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    _callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            _progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    _callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call localVarCall = modifyTagByIdValidateBeforeCall(accessToken, tagId, tagModifyParams, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateTagById
     * @param accessToken Samsara API access token. (required)
     * @param tagId ID of the tag. (required)
     * @param updateTagParams  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call updateTagByIdCall(String accessToken, Long tagId, TagUpdate updateTagParams, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = updateTagParams;

        // create path and map variables
        String localVarPath = "/tags/{tag_id}"
            .replaceAll("\\{" + "tag_id" + "\\}", localVarApiClient.escapeString(tagId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("access_token", accessToken));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (_progressListener != null) {
            localVarApiClient.setHttpClient(localVarApiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), _progressListener))
                            .build();
                }
            }).build());
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateTagByIdValidateBeforeCall(String accessToken, Long tagId, TagUpdate updateTagParams, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
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
        

        okhttp3.Call localVarCall = updateTagByIdCall(accessToken, tagId, updateTagParams, _progressListener, _progressRequestListener);
        return localVarCall;

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
        ApiResponse<Tag> localVarResp = updateTagByIdWithHttpInfo(accessToken, tagId, updateTagParams);
        return localVarResp.getData();
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
        okhttp3.Call localVarCall = updateTagByIdValidateBeforeCall(accessToken, tagId, updateTagParams, null, null);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /tags/{tag_id:[0-9]+} (asynchronously)
     * Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
     * @param accessToken Samsara API access token. (required)
     * @param tagId ID of the tag. (required)
     * @param updateTagParams  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call updateTagByIdAsync(String accessToken, Long tagId, TagUpdate updateTagParams, final ApiCallback<Tag> _callback) throws ApiException {

        ProgressResponseBody.ProgressListener _progressListener = null;
        ProgressRequestBody.ProgressRequestListener _progressRequestListener = null;

        if (_callback != null) {
            _progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    _callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            _progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    _callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call localVarCall = updateTagByIdValidateBeforeCall(accessToken, tagId, updateTagParams, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
