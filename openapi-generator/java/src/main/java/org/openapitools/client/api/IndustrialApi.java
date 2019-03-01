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


import org.openapitools.client.model.DataInputHistoryResponse;
import org.openapitools.client.model.InlineObject17;
import org.openapitools.client.model.InlineObject18;
import org.openapitools.client.model.InlineResponse2006;
import org.openapitools.client.model.InlineResponse2007;
import org.openapitools.client.model.MachineHistoryResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndustrialApi {
    private ApiClient localVarApiClient;

    public IndustrialApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IndustrialApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getAllDataInputs
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)
     * @param endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getAllDataInputsCall(String accessToken, Long groupId, Long startMs, Long endMs, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/industrial/data";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("access_token", accessToken));
        }

        if (groupId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("group_id", groupId));
        }

        if (startMs != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startMs", startMs));
        }

        if (endMs != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("endMs", endMs));
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
    private okhttp3.Call getAllDataInputsValidateBeforeCall(String accessToken, Long groupId, Long startMs, Long endMs, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getAllDataInputs(Async)");
        }
        

        okhttp3.Call localVarCall = getAllDataInputsCall(accessToken, groupId, startMs, endMs, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /industrial/data
     * Fetch all of the data inputs for a group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)
     * @param endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)
     * @return InlineResponse2006
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2006 getAllDataInputs(String accessToken, Long groupId, Long startMs, Long endMs) throws ApiException {
        ApiResponse<InlineResponse2006> localVarResp = getAllDataInputsWithHttpInfo(accessToken, groupId, startMs, endMs);
        return localVarResp.getData();
    }

    /**
     * /industrial/data
     * Fetch all of the data inputs for a group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)
     * @param endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)
     * @return ApiResponse&lt;InlineResponse2006&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2006> getAllDataInputsWithHttpInfo(String accessToken, Long groupId, Long startMs, Long endMs) throws ApiException {
        okhttp3.Call localVarCall = getAllDataInputsValidateBeforeCall(accessToken, groupId, startMs, endMs, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2006>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /industrial/data (asynchronously)
     * Fetch all of the data inputs for a group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)
     * @param endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getAllDataInputsAsync(String accessToken, Long groupId, Long startMs, Long endMs, final ApiCallback<InlineResponse2006> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getAllDataInputsValidateBeforeCall(accessToken, groupId, startMs, endMs, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2006>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDataInput
     * @param accessToken Samsara API access token. (required)
     * @param dataInputId ID of the data input (required)
     * @param startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)
     * @param endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getDataInputCall(String accessToken, Long dataInputId, Long startMs, Long endMs, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/industrial/data/{data_input_id}"
            .replaceAll("\\{" + "data_input_id" + "\\}", localVarApiClient.escapeString(dataInputId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("access_token", accessToken));
        }

        if (startMs != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startMs", startMs));
        }

        if (endMs != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("endMs", endMs));
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
    private okhttp3.Call getDataInputValidateBeforeCall(String accessToken, Long dataInputId, Long startMs, Long endMs, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getDataInput(Async)");
        }
        
        // verify the required parameter 'dataInputId' is set
        if (dataInputId == null) {
            throw new ApiException("Missing the required parameter 'dataInputId' when calling getDataInput(Async)");
        }
        

        okhttp3.Call localVarCall = getDataInputCall(accessToken, dataInputId, startMs, endMs, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /industrial/data/{data_input_id:[0-9]+}
     * Fetch datapoints from a given data input.
     * @param accessToken Samsara API access token. (required)
     * @param dataInputId ID of the data input (required)
     * @param startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)
     * @param endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)
     * @return DataInputHistoryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DataInputHistoryResponse getDataInput(String accessToken, Long dataInputId, Long startMs, Long endMs) throws ApiException {
        ApiResponse<DataInputHistoryResponse> localVarResp = getDataInputWithHttpInfo(accessToken, dataInputId, startMs, endMs);
        return localVarResp.getData();
    }

    /**
     * /industrial/data/{data_input_id:[0-9]+}
     * Fetch datapoints from a given data input.
     * @param accessToken Samsara API access token. (required)
     * @param dataInputId ID of the data input (required)
     * @param startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)
     * @param endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)
     * @return ApiResponse&lt;DataInputHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DataInputHistoryResponse> getDataInputWithHttpInfo(String accessToken, Long dataInputId, Long startMs, Long endMs) throws ApiException {
        okhttp3.Call localVarCall = getDataInputValidateBeforeCall(accessToken, dataInputId, startMs, endMs, null, null);
        Type localVarReturnType = new TypeToken<DataInputHistoryResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /industrial/data/{data_input_id:[0-9]+} (asynchronously)
     * Fetch datapoints from a given data input.
     * @param accessToken Samsara API access token. (required)
     * @param dataInputId ID of the data input (required)
     * @param startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)
     * @param endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getDataInputAsync(String accessToken, Long dataInputId, Long startMs, Long endMs, final ApiCallback<DataInputHistoryResponse> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getDataInputValidateBeforeCall(accessToken, dataInputId, startMs, endMs, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<DataInputHistoryResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getMachines
     * @param accessToken Samsara API access token. (required)
     * @param groupParam  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getMachinesCall(String accessToken, InlineObject18 groupParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = groupParam;

        // create path and map variables
        String localVarPath = "/machines/list";

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
    private okhttp3.Call getMachinesValidateBeforeCall(String accessToken, InlineObject18 groupParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getMachines(Async)");
        }
        
        // verify the required parameter 'groupParam' is set
        if (groupParam == null) {
            throw new ApiException("Missing the required parameter 'groupParam' when calling getMachines(Async)");
        }
        

        okhttp3.Call localVarCall = getMachinesCall(accessToken, groupParam, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /machines/list
     * Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam  (required)
     * @return InlineResponse2007
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2007 getMachines(String accessToken, InlineObject18 groupParam) throws ApiException {
        ApiResponse<InlineResponse2007> localVarResp = getMachinesWithHttpInfo(accessToken, groupParam);
        return localVarResp.getData();
    }

    /**
     * /machines/list
     * Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam  (required)
     * @return ApiResponse&lt;InlineResponse2007&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2007> getMachinesWithHttpInfo(String accessToken, InlineObject18 groupParam) throws ApiException {
        okhttp3.Call localVarCall = getMachinesValidateBeforeCall(accessToken, groupParam, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2007>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /machines/list (asynchronously)
     * Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getMachinesAsync(String accessToken, InlineObject18 groupParam, final ApiCallback<InlineResponse2007> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getMachinesValidateBeforeCall(accessToken, groupParam, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2007>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getMachinesHistory
     * @param accessToken Samsara API access token. (required)
     * @param historyParam  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getMachinesHistoryCall(String accessToken, InlineObject17 historyParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = historyParam;

        // create path and map variables
        String localVarPath = "/machines/history";

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
    private okhttp3.Call getMachinesHistoryValidateBeforeCall(String accessToken, InlineObject17 historyParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getMachinesHistory(Async)");
        }
        
        // verify the required parameter 'historyParam' is set
        if (historyParam == null) {
            throw new ApiException("Missing the required parameter 'historyParam' when calling getMachinesHistory(Async)");
        }
        

        okhttp3.Call localVarCall = getMachinesHistoryCall(accessToken, historyParam, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /machines/history
     * Get historical data for machine objects. This method returns a set of historical data for all machines in a group
     * @param accessToken Samsara API access token. (required)
     * @param historyParam  (required)
     * @return MachineHistoryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MachineHistoryResponse getMachinesHistory(String accessToken, InlineObject17 historyParam) throws ApiException {
        ApiResponse<MachineHistoryResponse> localVarResp = getMachinesHistoryWithHttpInfo(accessToken, historyParam);
        return localVarResp.getData();
    }

    /**
     * /machines/history
     * Get historical data for machine objects. This method returns a set of historical data for all machines in a group
     * @param accessToken Samsara API access token. (required)
     * @param historyParam  (required)
     * @return ApiResponse&lt;MachineHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MachineHistoryResponse> getMachinesHistoryWithHttpInfo(String accessToken, InlineObject17 historyParam) throws ApiException {
        okhttp3.Call localVarCall = getMachinesHistoryValidateBeforeCall(accessToken, historyParam, null, null);
        Type localVarReturnType = new TypeToken<MachineHistoryResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /machines/history (asynchronously)
     * Get historical data for machine objects. This method returns a set of historical data for all machines in a group
     * @param accessToken Samsara API access token. (required)
     * @param historyParam  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getMachinesHistoryAsync(String accessToken, InlineObject17 historyParam, final ApiCallback<MachineHistoryResponse> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getMachinesHistoryValidateBeforeCall(accessToken, historyParam, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<MachineHistoryResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
