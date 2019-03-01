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


import io.swagger.client.model.CargoResponse;
import io.swagger.client.model.DoorResponse;
import io.swagger.client.model.GroupParam;
import io.swagger.client.model.HistoryParam1;
import io.swagger.client.model.HumidityResponse;
import io.swagger.client.model.InlineResponse2008;
import io.swagger.client.model.SensorHistoryResponse;
import io.swagger.client.model.SensorParam;
import io.swagger.client.model.TemperatureResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SensorsApi {
    private ApiClient apiClient;

    public SensorsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SensorsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getSensors
     * @param accessToken Samsara API access token. (required)
     * @param groupParam Group ID to query. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSensorsCall(String accessToken, GroupParam groupParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = groupParam;

        // create path and map variables
        String localVarPath = "/sensors/list";

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
    private com.squareup.okhttp.Call getSensorsValidateBeforeCall(String accessToken, GroupParam groupParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getSensors(Async)");
        }
        
        // verify the required parameter 'groupParam' is set
        if (groupParam == null) {
            throw new ApiException("Missing the required parameter 'groupParam' when calling getSensors(Async)");
        }
        

        com.squareup.okhttp.Call call = getSensorsCall(accessToken, groupParam, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /sensors/list
     * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam Group ID to query. (required)
     * @return InlineResponse2008
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2008 getSensors(String accessToken, GroupParam groupParam) throws ApiException {
        ApiResponse<InlineResponse2008> resp = getSensorsWithHttpInfo(accessToken, groupParam);
        return resp.getData();
    }

    /**
     * /sensors/list
     * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam Group ID to query. (required)
     * @return ApiResponse&lt;InlineResponse2008&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2008> getSensorsWithHttpInfo(String accessToken, GroupParam groupParam) throws ApiException {
        com.squareup.okhttp.Call call = getSensorsValidateBeforeCall(accessToken, groupParam, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2008>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /sensors/list (asynchronously)
     * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam Group ID to query. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSensorsAsync(String accessToken, GroupParam groupParam, final ApiCallback<InlineResponse2008> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSensorsValidateBeforeCall(accessToken, groupParam, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2008>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSensorsCargo
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam Group ID and list of sensor IDs to query. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSensorsCargoCall(String accessToken, SensorParam sensorParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = sensorParam;

        // create path and map variables
        String localVarPath = "/sensors/cargo";

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
    private com.squareup.okhttp.Call getSensorsCargoValidateBeforeCall(String accessToken, SensorParam sensorParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getSensorsCargo(Async)");
        }
        
        // verify the required parameter 'sensorParam' is set
        if (sensorParam == null) {
            throw new ApiException("Missing the required parameter 'sensorParam' when calling getSensorsCargo(Async)");
        }
        

        com.squareup.okhttp.Call call = getSensorsCargoCall(accessToken, sensorParam, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /sensors/cargo
     * Get cargo monitor status (empty / full) for requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam Group ID and list of sensor IDs to query. (required)
     * @return CargoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CargoResponse getSensorsCargo(String accessToken, SensorParam sensorParam) throws ApiException {
        ApiResponse<CargoResponse> resp = getSensorsCargoWithHttpInfo(accessToken, sensorParam);
        return resp.getData();
    }

    /**
     * /sensors/cargo
     * Get cargo monitor status (empty / full) for requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam Group ID and list of sensor IDs to query. (required)
     * @return ApiResponse&lt;CargoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CargoResponse> getSensorsCargoWithHttpInfo(String accessToken, SensorParam sensorParam) throws ApiException {
        com.squareup.okhttp.Call call = getSensorsCargoValidateBeforeCall(accessToken, sensorParam, null, null);
        Type localVarReturnType = new TypeToken<CargoResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /sensors/cargo (asynchronously)
     * Get cargo monitor status (empty / full) for requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam Group ID and list of sensor IDs to query. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSensorsCargoAsync(String accessToken, SensorParam sensorParam, final ApiCallback<CargoResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSensorsCargoValidateBeforeCall(accessToken, sensorParam, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CargoResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSensorsDoor
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam Group ID and list of sensor IDs to query. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSensorsDoorCall(String accessToken, SensorParam sensorParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = sensorParam;

        // create path and map variables
        String localVarPath = "/sensors/door";

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
    private com.squareup.okhttp.Call getSensorsDoorValidateBeforeCall(String accessToken, SensorParam sensorParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getSensorsDoor(Async)");
        }
        
        // verify the required parameter 'sensorParam' is set
        if (sensorParam == null) {
            throw new ApiException("Missing the required parameter 'sensorParam' when calling getSensorsDoor(Async)");
        }
        

        com.squareup.okhttp.Call call = getSensorsDoorCall(accessToken, sensorParam, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /sensors/door
     * Get door monitor status (closed / open) for requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam Group ID and list of sensor IDs to query. (required)
     * @return DoorResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DoorResponse getSensorsDoor(String accessToken, SensorParam sensorParam) throws ApiException {
        ApiResponse<DoorResponse> resp = getSensorsDoorWithHttpInfo(accessToken, sensorParam);
        return resp.getData();
    }

    /**
     * /sensors/door
     * Get door monitor status (closed / open) for requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam Group ID and list of sensor IDs to query. (required)
     * @return ApiResponse&lt;DoorResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DoorResponse> getSensorsDoorWithHttpInfo(String accessToken, SensorParam sensorParam) throws ApiException {
        com.squareup.okhttp.Call call = getSensorsDoorValidateBeforeCall(accessToken, sensorParam, null, null);
        Type localVarReturnType = new TypeToken<DoorResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /sensors/door (asynchronously)
     * Get door monitor status (closed / open) for requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam Group ID and list of sensor IDs to query. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSensorsDoorAsync(String accessToken, SensorParam sensorParam, final ApiCallback<DoorResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSensorsDoorValidateBeforeCall(accessToken, sensorParam, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DoorResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSensorsHistory
     * @param accessToken Samsara API access token. (required)
     * @param historyParam Group ID, time range and resolution, and list of sensor ID, field pairs to query. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSensorsHistoryCall(String accessToken, HistoryParam1 historyParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = historyParam;

        // create path and map variables
        String localVarPath = "/sensors/history";

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
    private com.squareup.okhttp.Call getSensorsHistoryValidateBeforeCall(String accessToken, HistoryParam1 historyParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getSensorsHistory(Async)");
        }
        
        // verify the required parameter 'historyParam' is set
        if (historyParam == null) {
            throw new ApiException("Missing the required parameter 'historyParam' when calling getSensorsHistory(Async)");
        }
        

        com.squareup.okhttp.Call call = getSensorsHistoryCall(accessToken, historyParam, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /sensors/history
     * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
     * @param accessToken Samsara API access token. (required)
     * @param historyParam Group ID, time range and resolution, and list of sensor ID, field pairs to query. (required)
     * @return SensorHistoryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SensorHistoryResponse getSensorsHistory(String accessToken, HistoryParam1 historyParam) throws ApiException {
        ApiResponse<SensorHistoryResponse> resp = getSensorsHistoryWithHttpInfo(accessToken, historyParam);
        return resp.getData();
    }

    /**
     * /sensors/history
     * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
     * @param accessToken Samsara API access token. (required)
     * @param historyParam Group ID, time range and resolution, and list of sensor ID, field pairs to query. (required)
     * @return ApiResponse&lt;SensorHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SensorHistoryResponse> getSensorsHistoryWithHttpInfo(String accessToken, HistoryParam1 historyParam) throws ApiException {
        com.squareup.okhttp.Call call = getSensorsHistoryValidateBeforeCall(accessToken, historyParam, null, null);
        Type localVarReturnType = new TypeToken<SensorHistoryResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /sensors/history (asynchronously)
     * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
     * @param accessToken Samsara API access token. (required)
     * @param historyParam Group ID, time range and resolution, and list of sensor ID, field pairs to query. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSensorsHistoryAsync(String accessToken, HistoryParam1 historyParam, final ApiCallback<SensorHistoryResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSensorsHistoryValidateBeforeCall(accessToken, historyParam, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SensorHistoryResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSensorsHumidity
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam Group ID and list of sensor IDs to query. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSensorsHumidityCall(String accessToken, SensorParam sensorParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = sensorParam;

        // create path and map variables
        String localVarPath = "/sensors/humidity";

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
    private com.squareup.okhttp.Call getSensorsHumidityValidateBeforeCall(String accessToken, SensorParam sensorParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getSensorsHumidity(Async)");
        }
        
        // verify the required parameter 'sensorParam' is set
        if (sensorParam == null) {
            throw new ApiException("Missing the required parameter 'sensorParam' when calling getSensorsHumidity(Async)");
        }
        

        com.squareup.okhttp.Call call = getSensorsHumidityCall(accessToken, sensorParam, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /sensors/humidity
     * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam Group ID and list of sensor IDs to query. (required)
     * @return HumidityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HumidityResponse getSensorsHumidity(String accessToken, SensorParam sensorParam) throws ApiException {
        ApiResponse<HumidityResponse> resp = getSensorsHumidityWithHttpInfo(accessToken, sensorParam);
        return resp.getData();
    }

    /**
     * /sensors/humidity
     * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam Group ID and list of sensor IDs to query. (required)
     * @return ApiResponse&lt;HumidityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HumidityResponse> getSensorsHumidityWithHttpInfo(String accessToken, SensorParam sensorParam) throws ApiException {
        com.squareup.okhttp.Call call = getSensorsHumidityValidateBeforeCall(accessToken, sensorParam, null, null);
        Type localVarReturnType = new TypeToken<HumidityResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /sensors/humidity (asynchronously)
     * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam Group ID and list of sensor IDs to query. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSensorsHumidityAsync(String accessToken, SensorParam sensorParam, final ApiCallback<HumidityResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSensorsHumidityValidateBeforeCall(accessToken, sensorParam, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HumidityResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSensorsTemperature
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam Group ID and list of sensor IDs to query. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSensorsTemperatureCall(String accessToken, SensorParam sensorParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = sensorParam;

        // create path and map variables
        String localVarPath = "/sensors/temperature";

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
    private com.squareup.okhttp.Call getSensorsTemperatureValidateBeforeCall(String accessToken, SensorParam sensorParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getSensorsTemperature(Async)");
        }
        
        // verify the required parameter 'sensorParam' is set
        if (sensorParam == null) {
            throw new ApiException("Missing the required parameter 'sensorParam' when calling getSensorsTemperature(Async)");
        }
        

        com.squareup.okhttp.Call call = getSensorsTemperatureCall(accessToken, sensorParam, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /sensors/temperature
     * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam Group ID and list of sensor IDs to query. (required)
     * @return TemperatureResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TemperatureResponse getSensorsTemperature(String accessToken, SensorParam sensorParam) throws ApiException {
        ApiResponse<TemperatureResponse> resp = getSensorsTemperatureWithHttpInfo(accessToken, sensorParam);
        return resp.getData();
    }

    /**
     * /sensors/temperature
     * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam Group ID and list of sensor IDs to query. (required)
     * @return ApiResponse&lt;TemperatureResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TemperatureResponse> getSensorsTemperatureWithHttpInfo(String accessToken, SensorParam sensorParam) throws ApiException {
        com.squareup.okhttp.Call call = getSensorsTemperatureValidateBeforeCall(accessToken, sensorParam, null, null);
        Type localVarReturnType = new TypeToken<TemperatureResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /sensors/temperature (asynchronously)
     * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam Group ID and list of sensor IDs to query. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSensorsTemperatureAsync(String accessToken, SensorParam sensorParam, final ApiCallback<TemperatureResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSensorsTemperatureValidateBeforeCall(accessToken, sensorParam, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TemperatureResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
