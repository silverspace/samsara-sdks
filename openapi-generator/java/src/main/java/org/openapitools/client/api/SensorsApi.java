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


import org.openapitools.client.model.CargoResponse;
import org.openapitools.client.model.DoorResponse;
import org.openapitools.client.model.HumidityResponse;
import org.openapitools.client.model.InlineObject19;
import org.openapitools.client.model.InlineObject20;
import org.openapitools.client.model.InlineObject21;
import org.openapitools.client.model.InlineObject22;
import org.openapitools.client.model.InlineObject23;
import org.openapitools.client.model.InlineObject24;
import org.openapitools.client.model.InlineResponse2008;
import org.openapitools.client.model.SensorHistoryResponse;
import org.openapitools.client.model.TemperatureResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SensorsApi {
    private ApiClient localVarApiClient;

    public SensorsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SensorsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getSensors
     * @param accessToken Samsara API access token. (required)
     * @param groupParam  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getSensorsCall(String accessToken, InlineObject23 groupParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = groupParam;

        // create path and map variables
        String localVarPath = "/sensors/list";

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
    private okhttp3.Call getSensorsValidateBeforeCall(String accessToken, InlineObject23 groupParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getSensors(Async)");
        }
        
        // verify the required parameter 'groupParam' is set
        if (groupParam == null) {
            throw new ApiException("Missing the required parameter 'groupParam' when calling getSensors(Async)");
        }
        

        okhttp3.Call localVarCall = getSensorsCall(accessToken, groupParam, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /sensors/list
     * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam  (required)
     * @return InlineResponse2008
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2008 getSensors(String accessToken, InlineObject23 groupParam) throws ApiException {
        ApiResponse<InlineResponse2008> localVarResp = getSensorsWithHttpInfo(accessToken, groupParam);
        return localVarResp.getData();
    }

    /**
     * /sensors/list
     * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam  (required)
     * @return ApiResponse&lt;InlineResponse2008&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2008> getSensorsWithHttpInfo(String accessToken, InlineObject23 groupParam) throws ApiException {
        okhttp3.Call localVarCall = getSensorsValidateBeforeCall(accessToken, groupParam, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2008>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /sensors/list (asynchronously)
     * Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getSensorsAsync(String accessToken, InlineObject23 groupParam, final ApiCallback<InlineResponse2008> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getSensorsValidateBeforeCall(accessToken, groupParam, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2008>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSensorsCargo
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getSensorsCargoCall(String accessToken, InlineObject19 sensorParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = sensorParam;

        // create path and map variables
        String localVarPath = "/sensors/cargo";

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
    private okhttp3.Call getSensorsCargoValidateBeforeCall(String accessToken, InlineObject19 sensorParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getSensorsCargo(Async)");
        }
        
        // verify the required parameter 'sensorParam' is set
        if (sensorParam == null) {
            throw new ApiException("Missing the required parameter 'sensorParam' when calling getSensorsCargo(Async)");
        }
        

        okhttp3.Call localVarCall = getSensorsCargoCall(accessToken, sensorParam, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /sensors/cargo
     * Get cargo monitor status (empty / full) for requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam  (required)
     * @return CargoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CargoResponse getSensorsCargo(String accessToken, InlineObject19 sensorParam) throws ApiException {
        ApiResponse<CargoResponse> localVarResp = getSensorsCargoWithHttpInfo(accessToken, sensorParam);
        return localVarResp.getData();
    }

    /**
     * /sensors/cargo
     * Get cargo monitor status (empty / full) for requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam  (required)
     * @return ApiResponse&lt;CargoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CargoResponse> getSensorsCargoWithHttpInfo(String accessToken, InlineObject19 sensorParam) throws ApiException {
        okhttp3.Call localVarCall = getSensorsCargoValidateBeforeCall(accessToken, sensorParam, null, null);
        Type localVarReturnType = new TypeToken<CargoResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /sensors/cargo (asynchronously)
     * Get cargo monitor status (empty / full) for requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getSensorsCargoAsync(String accessToken, InlineObject19 sensorParam, final ApiCallback<CargoResponse> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getSensorsCargoValidateBeforeCall(accessToken, sensorParam, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<CargoResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSensorsDoor
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getSensorsDoorCall(String accessToken, InlineObject20 sensorParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = sensorParam;

        // create path and map variables
        String localVarPath = "/sensors/door";

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
    private okhttp3.Call getSensorsDoorValidateBeforeCall(String accessToken, InlineObject20 sensorParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getSensorsDoor(Async)");
        }
        
        // verify the required parameter 'sensorParam' is set
        if (sensorParam == null) {
            throw new ApiException("Missing the required parameter 'sensorParam' when calling getSensorsDoor(Async)");
        }
        

        okhttp3.Call localVarCall = getSensorsDoorCall(accessToken, sensorParam, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /sensors/door
     * Get door monitor status (closed / open) for requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam  (required)
     * @return DoorResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DoorResponse getSensorsDoor(String accessToken, InlineObject20 sensorParam) throws ApiException {
        ApiResponse<DoorResponse> localVarResp = getSensorsDoorWithHttpInfo(accessToken, sensorParam);
        return localVarResp.getData();
    }

    /**
     * /sensors/door
     * Get door monitor status (closed / open) for requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam  (required)
     * @return ApiResponse&lt;DoorResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DoorResponse> getSensorsDoorWithHttpInfo(String accessToken, InlineObject20 sensorParam) throws ApiException {
        okhttp3.Call localVarCall = getSensorsDoorValidateBeforeCall(accessToken, sensorParam, null, null);
        Type localVarReturnType = new TypeToken<DoorResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /sensors/door (asynchronously)
     * Get door monitor status (closed / open) for requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getSensorsDoorAsync(String accessToken, InlineObject20 sensorParam, final ApiCallback<DoorResponse> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getSensorsDoorValidateBeforeCall(accessToken, sensorParam, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<DoorResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSensorsHistory
     * @param accessToken Samsara API access token. (required)
     * @param historyParam  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getSensorsHistoryCall(String accessToken, InlineObject21 historyParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = historyParam;

        // create path and map variables
        String localVarPath = "/sensors/history";

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
    private okhttp3.Call getSensorsHistoryValidateBeforeCall(String accessToken, InlineObject21 historyParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getSensorsHistory(Async)");
        }
        
        // verify the required parameter 'historyParam' is set
        if (historyParam == null) {
            throw new ApiException("Missing the required parameter 'historyParam' when calling getSensorsHistory(Async)");
        }
        

        okhttp3.Call localVarCall = getSensorsHistoryCall(accessToken, historyParam, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /sensors/history
     * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
     * @param accessToken Samsara API access token. (required)
     * @param historyParam  (required)
     * @return SensorHistoryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SensorHistoryResponse getSensorsHistory(String accessToken, InlineObject21 historyParam) throws ApiException {
        ApiResponse<SensorHistoryResponse> localVarResp = getSensorsHistoryWithHttpInfo(accessToken, historyParam);
        return localVarResp.getData();
    }

    /**
     * /sensors/history
     * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
     * @param accessToken Samsara API access token. (required)
     * @param historyParam  (required)
     * @return ApiResponse&lt;SensorHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SensorHistoryResponse> getSensorsHistoryWithHttpInfo(String accessToken, InlineObject21 historyParam) throws ApiException {
        okhttp3.Call localVarCall = getSensorsHistoryValidateBeforeCall(accessToken, historyParam, null, null);
        Type localVarReturnType = new TypeToken<SensorHistoryResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /sensors/history (asynchronously)
     * Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
     * @param accessToken Samsara API access token. (required)
     * @param historyParam  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getSensorsHistoryAsync(String accessToken, InlineObject21 historyParam, final ApiCallback<SensorHistoryResponse> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getSensorsHistoryValidateBeforeCall(accessToken, historyParam, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<SensorHistoryResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSensorsHumidity
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getSensorsHumidityCall(String accessToken, InlineObject22 sensorParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = sensorParam;

        // create path and map variables
        String localVarPath = "/sensors/humidity";

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
    private okhttp3.Call getSensorsHumidityValidateBeforeCall(String accessToken, InlineObject22 sensorParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getSensorsHumidity(Async)");
        }
        
        // verify the required parameter 'sensorParam' is set
        if (sensorParam == null) {
            throw new ApiException("Missing the required parameter 'sensorParam' when calling getSensorsHumidity(Async)");
        }
        

        okhttp3.Call localVarCall = getSensorsHumidityCall(accessToken, sensorParam, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /sensors/humidity
     * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam  (required)
     * @return HumidityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HumidityResponse getSensorsHumidity(String accessToken, InlineObject22 sensorParam) throws ApiException {
        ApiResponse<HumidityResponse> localVarResp = getSensorsHumidityWithHttpInfo(accessToken, sensorParam);
        return localVarResp.getData();
    }

    /**
     * /sensors/humidity
     * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam  (required)
     * @return ApiResponse&lt;HumidityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HumidityResponse> getSensorsHumidityWithHttpInfo(String accessToken, InlineObject22 sensorParam) throws ApiException {
        okhttp3.Call localVarCall = getSensorsHumidityValidateBeforeCall(accessToken, sensorParam, null, null);
        Type localVarReturnType = new TypeToken<HumidityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /sensors/humidity (asynchronously)
     * Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getSensorsHumidityAsync(String accessToken, InlineObject22 sensorParam, final ApiCallback<HumidityResponse> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getSensorsHumidityValidateBeforeCall(accessToken, sensorParam, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<HumidityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSensorsTemperature
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getSensorsTemperatureCall(String accessToken, InlineObject24 sensorParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = sensorParam;

        // create path and map variables
        String localVarPath = "/sensors/temperature";

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
    private okhttp3.Call getSensorsTemperatureValidateBeforeCall(String accessToken, InlineObject24 sensorParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getSensorsTemperature(Async)");
        }
        
        // verify the required parameter 'sensorParam' is set
        if (sensorParam == null) {
            throw new ApiException("Missing the required parameter 'sensorParam' when calling getSensorsTemperature(Async)");
        }
        

        okhttp3.Call localVarCall = getSensorsTemperatureCall(accessToken, sensorParam, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /sensors/temperature
     * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam  (required)
     * @return TemperatureResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TemperatureResponse getSensorsTemperature(String accessToken, InlineObject24 sensorParam) throws ApiException {
        ApiResponse<TemperatureResponse> localVarResp = getSensorsTemperatureWithHttpInfo(accessToken, sensorParam);
        return localVarResp.getData();
    }

    /**
     * /sensors/temperature
     * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam  (required)
     * @return ApiResponse&lt;TemperatureResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TemperatureResponse> getSensorsTemperatureWithHttpInfo(String accessToken, InlineObject24 sensorParam) throws ApiException {
        okhttp3.Call localVarCall = getSensorsTemperatureValidateBeforeCall(accessToken, sensorParam, null, null);
        Type localVarReturnType = new TypeToken<TemperatureResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /sensors/temperature (asynchronously)
     * Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
     * @param accessToken Samsara API access token. (required)
     * @param sensorParam  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getSensorsTemperatureAsync(String accessToken, InlineObject24 sensorParam, final ApiCallback<TemperatureResponse> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getSensorsTemperatureValidateBeforeCall(accessToken, sensorParam, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<TemperatureResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
