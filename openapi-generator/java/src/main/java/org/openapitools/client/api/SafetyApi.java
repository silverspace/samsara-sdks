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


import org.openapitools.client.model.DriverSafetyScoreResponse;
import org.openapitools.client.model.VehicleHarshEventResponse;
import org.openapitools.client.model.VehicleSafetyScoreResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SafetyApi {
    private ApiClient localVarApiClient;

    public SafetyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SafetyApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getDriverSafetyScore
     * @param driverId ID of the driver (required)
     * @param accessToken Samsara API access token. (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getDriverSafetyScoreCall(Long driverId, String accessToken, Long startMs, Long endMs, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/drivers/{driverId}/safety/score"
            .replaceAll("\\{" + "driverId" + "\\}", localVarApiClient.escapeString(driverId.toString()));

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
    private okhttp3.Call getDriverSafetyScoreValidateBeforeCall(Long driverId, String accessToken, Long startMs, Long endMs, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'driverId' is set
        if (driverId == null) {
            throw new ApiException("Missing the required parameter 'driverId' when calling getDriverSafetyScore(Async)");
        }
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getDriverSafetyScore(Async)");
        }
        
        // verify the required parameter 'startMs' is set
        if (startMs == null) {
            throw new ApiException("Missing the required parameter 'startMs' when calling getDriverSafetyScore(Async)");
        }
        
        // verify the required parameter 'endMs' is set
        if (endMs == null) {
            throw new ApiException("Missing the required parameter 'endMs' when calling getDriverSafetyScore(Async)");
        }
        

        okhttp3.Call localVarCall = getDriverSafetyScoreCall(driverId, accessToken, startMs, endMs, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     * Fetch the safety score for the driver.
     * @param driverId ID of the driver (required)
     * @param accessToken Samsara API access token. (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @return DriverSafetyScoreResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DriverSafetyScoreResponse getDriverSafetyScore(Long driverId, String accessToken, Long startMs, Long endMs) throws ApiException {
        ApiResponse<DriverSafetyScoreResponse> localVarResp = getDriverSafetyScoreWithHttpInfo(driverId, accessToken, startMs, endMs);
        return localVarResp.getData();
    }

    /**
     * /fleet/drivers/{driverId:[0-9]+}/safety/score
     * Fetch the safety score for the driver.
     * @param driverId ID of the driver (required)
     * @param accessToken Samsara API access token. (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @return ApiResponse&lt;DriverSafetyScoreResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DriverSafetyScoreResponse> getDriverSafetyScoreWithHttpInfo(Long driverId, String accessToken, Long startMs, Long endMs) throws ApiException {
        okhttp3.Call localVarCall = getDriverSafetyScoreValidateBeforeCall(driverId, accessToken, startMs, endMs, null, null);
        Type localVarReturnType = new TypeToken<DriverSafetyScoreResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/drivers/{driverId:[0-9]+}/safety/score (asynchronously)
     * Fetch the safety score for the driver.
     * @param driverId ID of the driver (required)
     * @param accessToken Samsara API access token. (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getDriverSafetyScoreAsync(Long driverId, String accessToken, Long startMs, Long endMs, final ApiCallback<DriverSafetyScoreResponse> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getDriverSafetyScoreValidateBeforeCall(driverId, accessToken, startMs, endMs, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<DriverSafetyScoreResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVehicleHarshEvent
     * @param vehicleId ID of the vehicle (required)
     * @param accessToken Samsara API access token. (required)
     * @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event. (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getVehicleHarshEventCall(Long vehicleId, String accessToken, Long timestamp, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/vehicles/{vehicleId}/safety/harsh_event"
            .replaceAll("\\{" + "vehicleId" + "\\}", localVarApiClient.escapeString(vehicleId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("access_token", accessToken));
        }

        if (timestamp != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("timestamp", timestamp));
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
    private okhttp3.Call getVehicleHarshEventValidateBeforeCall(Long vehicleId, String accessToken, Long timestamp, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'vehicleId' is set
        if (vehicleId == null) {
            throw new ApiException("Missing the required parameter 'vehicleId' when calling getVehicleHarshEvent(Async)");
        }
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getVehicleHarshEvent(Async)");
        }
        
        // verify the required parameter 'timestamp' is set
        if (timestamp == null) {
            throw new ApiException("Missing the required parameter 'timestamp' when calling getVehicleHarshEvent(Async)");
        }
        

        okhttp3.Call localVarCall = getVehicleHarshEventCall(vehicleId, accessToken, timestamp, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     * Fetch harsh event details for a vehicle.
     * @param vehicleId ID of the vehicle (required)
     * @param accessToken Samsara API access token. (required)
     * @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event. (required)
     * @return VehicleHarshEventResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VehicleHarshEventResponse getVehicleHarshEvent(Long vehicleId, String accessToken, Long timestamp) throws ApiException {
        ApiResponse<VehicleHarshEventResponse> localVarResp = getVehicleHarshEventWithHttpInfo(vehicleId, accessToken, timestamp);
        return localVarResp.getData();
    }

    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
     * Fetch harsh event details for a vehicle.
     * @param vehicleId ID of the vehicle (required)
     * @param accessToken Samsara API access token. (required)
     * @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event. (required)
     * @return ApiResponse&lt;VehicleHarshEventResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VehicleHarshEventResponse> getVehicleHarshEventWithHttpInfo(Long vehicleId, String accessToken, Long timestamp) throws ApiException {
        okhttp3.Call localVarCall = getVehicleHarshEventValidateBeforeCall(vehicleId, accessToken, timestamp, null, null);
        Type localVarReturnType = new TypeToken<VehicleHarshEventResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event (asynchronously)
     * Fetch harsh event details for a vehicle.
     * @param vehicleId ID of the vehicle (required)
     * @param accessToken Samsara API access token. (required)
     * @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getVehicleHarshEventAsync(Long vehicleId, String accessToken, Long timestamp, final ApiCallback<VehicleHarshEventResponse> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getVehicleHarshEventValidateBeforeCall(vehicleId, accessToken, timestamp, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<VehicleHarshEventResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVehicleSafetyScore
     * @param vehicleId ID of the vehicle (required)
     * @param accessToken Samsara API access token. (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getVehicleSafetyScoreCall(Long vehicleId, String accessToken, Long startMs, Long endMs, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/vehicles/{vehicleId}/safety/score"
            .replaceAll("\\{" + "vehicleId" + "\\}", localVarApiClient.escapeString(vehicleId.toString()));

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
    private okhttp3.Call getVehicleSafetyScoreValidateBeforeCall(Long vehicleId, String accessToken, Long startMs, Long endMs, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'vehicleId' is set
        if (vehicleId == null) {
            throw new ApiException("Missing the required parameter 'vehicleId' when calling getVehicleSafetyScore(Async)");
        }
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getVehicleSafetyScore(Async)");
        }
        
        // verify the required parameter 'startMs' is set
        if (startMs == null) {
            throw new ApiException("Missing the required parameter 'startMs' when calling getVehicleSafetyScore(Async)");
        }
        
        // verify the required parameter 'endMs' is set
        if (endMs == null) {
            throw new ApiException("Missing the required parameter 'endMs' when calling getVehicleSafetyScore(Async)");
        }
        

        okhttp3.Call localVarCall = getVehicleSafetyScoreCall(vehicleId, accessToken, startMs, endMs, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     * Fetch the safety score for the vehicle.
     * @param vehicleId ID of the vehicle (required)
     * @param accessToken Samsara API access token. (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @return VehicleSafetyScoreResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VehicleSafetyScoreResponse getVehicleSafetyScore(Long vehicleId, String accessToken, Long startMs, Long endMs) throws ApiException {
        ApiResponse<VehicleSafetyScoreResponse> localVarResp = getVehicleSafetyScoreWithHttpInfo(vehicleId, accessToken, startMs, endMs);
        return localVarResp.getData();
    }

    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
     * Fetch the safety score for the vehicle.
     * @param vehicleId ID of the vehicle (required)
     * @param accessToken Samsara API access token. (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @return ApiResponse&lt;VehicleSafetyScoreResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VehicleSafetyScoreResponse> getVehicleSafetyScoreWithHttpInfo(Long vehicleId, String accessToken, Long startMs, Long endMs) throws ApiException {
        okhttp3.Call localVarCall = getVehicleSafetyScoreValidateBeforeCall(vehicleId, accessToken, startMs, endMs, null, null);
        Type localVarReturnType = new TypeToken<VehicleSafetyScoreResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score (asynchronously)
     * Fetch the safety score for the vehicle.
     * @param vehicleId ID of the vehicle (required)
     * @param accessToken Samsara API access token. (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getVehicleSafetyScoreAsync(Long vehicleId, String accessToken, Long startMs, Long endMs, final ApiCallback<VehicleSafetyScoreResponse> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getVehicleSafetyScoreValidateBeforeCall(vehicleId, accessToken, startMs, endMs, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<VehicleSafetyScoreResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
