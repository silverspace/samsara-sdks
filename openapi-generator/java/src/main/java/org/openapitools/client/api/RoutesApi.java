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


import org.openapitools.client.model.AllRouteJobUpdates;
import org.openapitools.client.model.DispatchRoute;
import org.openapitools.client.model.DispatchRouteCreate;
import org.openapitools.client.model.DispatchRouteHistory;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoutesApi {
    private ApiClient localVarApiClient;

    public RoutesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RoutesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createDispatchRoute
     * @param accessToken Samsara API access token. (required)
     * @param createDispatchRouteParams  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call createDispatchRouteCall(String accessToken, DispatchRouteCreate createDispatchRouteParams, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = createDispatchRouteParams;

        // create path and map variables
        String localVarPath = "/fleet/dispatch/routes";

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
    private okhttp3.Call createDispatchRouteValidateBeforeCall(String accessToken, DispatchRouteCreate createDispatchRouteParams, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling createDispatchRoute(Async)");
        }
        
        // verify the required parameter 'createDispatchRouteParams' is set
        if (createDispatchRouteParams == null) {
            throw new ApiException("Missing the required parameter 'createDispatchRouteParams' when calling createDispatchRoute(Async)");
        }
        

        okhttp3.Call localVarCall = createDispatchRouteCall(accessToken, createDispatchRouteParams, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/dispatch/routes
     * Create a new dispatch route.
     * @param accessToken Samsara API access token. (required)
     * @param createDispatchRouteParams  (required)
     * @return DispatchRoute
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DispatchRoute createDispatchRoute(String accessToken, DispatchRouteCreate createDispatchRouteParams) throws ApiException {
        ApiResponse<DispatchRoute> localVarResp = createDispatchRouteWithHttpInfo(accessToken, createDispatchRouteParams);
        return localVarResp.getData();
    }

    /**
     * /fleet/dispatch/routes
     * Create a new dispatch route.
     * @param accessToken Samsara API access token. (required)
     * @param createDispatchRouteParams  (required)
     * @return ApiResponse&lt;DispatchRoute&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DispatchRoute> createDispatchRouteWithHttpInfo(String accessToken, DispatchRouteCreate createDispatchRouteParams) throws ApiException {
        okhttp3.Call localVarCall = createDispatchRouteValidateBeforeCall(accessToken, createDispatchRouteParams, null, null);
        Type localVarReturnType = new TypeToken<DispatchRoute>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/dispatch/routes (asynchronously)
     * Create a new dispatch route.
     * @param accessToken Samsara API access token. (required)
     * @param createDispatchRouteParams  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call createDispatchRouteAsync(String accessToken, DispatchRouteCreate createDispatchRouteParams, final ApiCallback<DispatchRoute> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = createDispatchRouteValidateBeforeCall(accessToken, createDispatchRouteParams, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<DispatchRoute>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createDriverDispatchRoute
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver with the associated routes. (required)
     * @param createDispatchRouteParams  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call createDriverDispatchRouteCall(String accessToken, Long driverId, DispatchRouteCreate createDispatchRouteParams, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = createDispatchRouteParams;

        // create path and map variables
        String localVarPath = "/fleet/drivers/{driver_id}/dispatch/routes"
            .replaceAll("\\{" + "driver_id" + "\\}", localVarApiClient.escapeString(driverId.toString()));

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
    private okhttp3.Call createDriverDispatchRouteValidateBeforeCall(String accessToken, Long driverId, DispatchRouteCreate createDispatchRouteParams, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling createDriverDispatchRoute(Async)");
        }
        
        // verify the required parameter 'driverId' is set
        if (driverId == null) {
            throw new ApiException("Missing the required parameter 'driverId' when calling createDriverDispatchRoute(Async)");
        }
        
        // verify the required parameter 'createDispatchRouteParams' is set
        if (createDispatchRouteParams == null) {
            throw new ApiException("Missing the required parameter 'createDispatchRouteParams' when calling createDriverDispatchRoute(Async)");
        }
        

        okhttp3.Call localVarCall = createDriverDispatchRouteCall(accessToken, driverId, createDispatchRouteParams, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * Create a new dispatch route for the driver with driver_id.
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver with the associated routes. (required)
     * @param createDispatchRouteParams  (required)
     * @return DispatchRoute
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DispatchRoute createDriverDispatchRoute(String accessToken, Long driverId, DispatchRouteCreate createDispatchRouteParams) throws ApiException {
        ApiResponse<DispatchRoute> localVarResp = createDriverDispatchRouteWithHttpInfo(accessToken, driverId, createDispatchRouteParams);
        return localVarResp.getData();
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * Create a new dispatch route for the driver with driver_id.
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver with the associated routes. (required)
     * @param createDispatchRouteParams  (required)
     * @return ApiResponse&lt;DispatchRoute&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DispatchRoute> createDriverDispatchRouteWithHttpInfo(String accessToken, Long driverId, DispatchRouteCreate createDispatchRouteParams) throws ApiException {
        okhttp3.Call localVarCall = createDriverDispatchRouteValidateBeforeCall(accessToken, driverId, createDispatchRouteParams, null, null);
        Type localVarReturnType = new TypeToken<DispatchRoute>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes (asynchronously)
     * Create a new dispatch route for the driver with driver_id.
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver with the associated routes. (required)
     * @param createDispatchRouteParams  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call createDriverDispatchRouteAsync(String accessToken, Long driverId, DispatchRouteCreate createDispatchRouteParams, final ApiCallback<DispatchRoute> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = createDriverDispatchRouteValidateBeforeCall(accessToken, driverId, createDispatchRouteParams, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<DispatchRoute>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createVehicleDispatchRoute
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param createDispatchRouteParams  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call createVehicleDispatchRouteCall(String accessToken, Long vehicleId, DispatchRouteCreate createDispatchRouteParams, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = createDispatchRouteParams;

        // create path and map variables
        String localVarPath = "/fleet/vehicles/{vehicle_id}/dispatch/routes"
            .replaceAll("\\{" + "vehicle_id" + "\\}", localVarApiClient.escapeString(vehicleId.toString()));

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
    private okhttp3.Call createVehicleDispatchRouteValidateBeforeCall(String accessToken, Long vehicleId, DispatchRouteCreate createDispatchRouteParams, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling createVehicleDispatchRoute(Async)");
        }
        
        // verify the required parameter 'vehicleId' is set
        if (vehicleId == null) {
            throw new ApiException("Missing the required parameter 'vehicleId' when calling createVehicleDispatchRoute(Async)");
        }
        
        // verify the required parameter 'createDispatchRouteParams' is set
        if (createDispatchRouteParams == null) {
            throw new ApiException("Missing the required parameter 'createDispatchRouteParams' when calling createVehicleDispatchRoute(Async)");
        }
        

        okhttp3.Call localVarCall = createVehicleDispatchRouteCall(accessToken, vehicleId, createDispatchRouteParams, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * Create a new dispatch route for the vehicle with vehicle_id.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param createDispatchRouteParams  (required)
     * @return DispatchRoute
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DispatchRoute createVehicleDispatchRoute(String accessToken, Long vehicleId, DispatchRouteCreate createDispatchRouteParams) throws ApiException {
        ApiResponse<DispatchRoute> localVarResp = createVehicleDispatchRouteWithHttpInfo(accessToken, vehicleId, createDispatchRouteParams);
        return localVarResp.getData();
    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * Create a new dispatch route for the vehicle with vehicle_id.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param createDispatchRouteParams  (required)
     * @return ApiResponse&lt;DispatchRoute&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DispatchRoute> createVehicleDispatchRouteWithHttpInfo(String accessToken, Long vehicleId, DispatchRouteCreate createDispatchRouteParams) throws ApiException {
        okhttp3.Call localVarCall = createVehicleDispatchRouteValidateBeforeCall(accessToken, vehicleId, createDispatchRouteParams, null, null);
        Type localVarReturnType = new TypeToken<DispatchRoute>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes (asynchronously)
     * Create a new dispatch route for the vehicle with vehicle_id.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param createDispatchRouteParams  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call createVehicleDispatchRouteAsync(String accessToken, Long vehicleId, DispatchRouteCreate createDispatchRouteParams, final ApiCallback<DispatchRoute> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = createVehicleDispatchRouteValidateBeforeCall(accessToken, vehicleId, createDispatchRouteParams, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<DispatchRoute>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteDispatchRouteById
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the dispatch route. (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call deleteDispatchRouteByIdCall(String accessToken, Long routeId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/dispatch/routes/{route_id}"
            .replaceAll("\\{" + "route_id" + "\\}", localVarApiClient.escapeString(routeId.toString()));

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
    private okhttp3.Call deleteDispatchRouteByIdValidateBeforeCall(String accessToken, Long routeId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling deleteDispatchRouteById(Async)");
        }
        
        // verify the required parameter 'routeId' is set
        if (routeId == null) {
            throw new ApiException("Missing the required parameter 'routeId' when calling deleteDispatchRouteById(Async)");
        }
        

        okhttp3.Call localVarCall = deleteDispatchRouteByIdCall(accessToken, routeId, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     * Delete a dispatch route and its associated jobs.
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the dispatch route. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteDispatchRouteById(String accessToken, Long routeId) throws ApiException {
        deleteDispatchRouteByIdWithHttpInfo(accessToken, routeId);
    }

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     * Delete a dispatch route and its associated jobs.
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the dispatch route. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteDispatchRouteByIdWithHttpInfo(String accessToken, Long routeId) throws ApiException {
        okhttp3.Call localVarCall = deleteDispatchRouteByIdValidateBeforeCall(accessToken, routeId, null, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/ (asynchronously)
     * Delete a dispatch route and its associated jobs.
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the dispatch route. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call deleteDispatchRouteByIdAsync(String accessToken, Long routeId, final ApiCallback<Void> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = deleteDispatchRouteByIdValidateBeforeCall(accessToken, routeId, _progressListener, _progressRequestListener);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for fetchAllDispatchRoutes
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call fetchAllDispatchRoutesCall(String accessToken, Long groupId, Long endTime, Long duration, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/dispatch/routes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("access_token", accessToken));
        }

        if (groupId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("group_id", groupId));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (duration != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("duration", duration));
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
    private okhttp3.Call fetchAllDispatchRoutesValidateBeforeCall(String accessToken, Long groupId, Long endTime, Long duration, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling fetchAllDispatchRoutes(Async)");
        }
        

        okhttp3.Call localVarCall = fetchAllDispatchRoutesCall(accessToken, groupId, endTime, duration, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/dispatch/routes
     * Fetch all of the dispatch routes for the group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @return List&lt;DispatchRoute&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<DispatchRoute> fetchAllDispatchRoutes(String accessToken, Long groupId, Long endTime, Long duration) throws ApiException {
        ApiResponse<List<DispatchRoute>> localVarResp = fetchAllDispatchRoutesWithHttpInfo(accessToken, groupId, endTime, duration);
        return localVarResp.getData();
    }

    /**
     * /fleet/dispatch/routes
     * Fetch all of the dispatch routes for the group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @return ApiResponse&lt;List&lt;DispatchRoute&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<DispatchRoute>> fetchAllDispatchRoutesWithHttpInfo(String accessToken, Long groupId, Long endTime, Long duration) throws ApiException {
        okhttp3.Call localVarCall = fetchAllDispatchRoutesValidateBeforeCall(accessToken, groupId, endTime, duration, null, null);
        Type localVarReturnType = new TypeToken<List<DispatchRoute>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/dispatch/routes (asynchronously)
     * Fetch all of the dispatch routes for the group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call fetchAllDispatchRoutesAsync(String accessToken, Long groupId, Long endTime, Long duration, final ApiCallback<List<DispatchRoute>> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = fetchAllDispatchRoutesValidateBeforeCall(accessToken, groupId, endTime, duration, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<List<DispatchRoute>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for fetchAllRouteJobUpdates
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)
     * @param include Optionally set include&#x3D;route to include route object in response payload. (optional)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call fetchAllRouteJobUpdatesCall(String accessToken, Long groupId, String sequenceId, String include, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/dispatch/routes/job_updates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("access_token", accessToken));
        }

        if (groupId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("group_id", groupId));
        }

        if (sequenceId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sequence_id", sequenceId));
        }

        if (include != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include", include));
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
    private okhttp3.Call fetchAllRouteJobUpdatesValidateBeforeCall(String accessToken, Long groupId, String sequenceId, String include, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling fetchAllRouteJobUpdates(Async)");
        }
        

        okhttp3.Call localVarCall = fetchAllRouteJobUpdatesCall(accessToken, groupId, sequenceId, include, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/dispatch/routes/job_updates
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)
     * @param include Optionally set include&#x3D;route to include route object in response payload. (optional)
     * @return AllRouteJobUpdates
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AllRouteJobUpdates fetchAllRouteJobUpdates(String accessToken, Long groupId, String sequenceId, String include) throws ApiException {
        ApiResponse<AllRouteJobUpdates> localVarResp = fetchAllRouteJobUpdatesWithHttpInfo(accessToken, groupId, sequenceId, include);
        return localVarResp.getData();
    }

    /**
     * /fleet/dispatch/routes/job_updates
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)
     * @param include Optionally set include&#x3D;route to include route object in response payload. (optional)
     * @return ApiResponse&lt;AllRouteJobUpdates&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AllRouteJobUpdates> fetchAllRouteJobUpdatesWithHttpInfo(String accessToken, Long groupId, String sequenceId, String include) throws ApiException {
        okhttp3.Call localVarCall = fetchAllRouteJobUpdatesValidateBeforeCall(accessToken, groupId, sequenceId, include, null, null);
        Type localVarReturnType = new TypeToken<AllRouteJobUpdates>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/dispatch/routes/job_updates (asynchronously)
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)
     * @param include Optionally set include&#x3D;route to include route object in response payload. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call fetchAllRouteJobUpdatesAsync(String accessToken, Long groupId, String sequenceId, String include, final ApiCallback<AllRouteJobUpdates> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = fetchAllRouteJobUpdatesValidateBeforeCall(accessToken, groupId, sequenceId, include, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<AllRouteJobUpdates>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDispatchRouteById
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the dispatch route. (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getDispatchRouteByIdCall(String accessToken, Long routeId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/dispatch/routes/{route_id}"
            .replaceAll("\\{" + "route_id" + "\\}", localVarApiClient.escapeString(routeId.toString()));

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
    private okhttp3.Call getDispatchRouteByIdValidateBeforeCall(String accessToken, Long routeId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getDispatchRouteById(Async)");
        }
        
        // verify the required parameter 'routeId' is set
        if (routeId == null) {
            throw new ApiException("Missing the required parameter 'routeId' when calling getDispatchRouteById(Async)");
        }
        

        okhttp3.Call localVarCall = getDispatchRouteByIdCall(accessToken, routeId, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     * Fetch a dispatch route by id.
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the dispatch route. (required)
     * @return DispatchRoute
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DispatchRoute getDispatchRouteById(String accessToken, Long routeId) throws ApiException {
        ApiResponse<DispatchRoute> localVarResp = getDispatchRouteByIdWithHttpInfo(accessToken, routeId);
        return localVarResp.getData();
    }

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}
     * Fetch a dispatch route by id.
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the dispatch route. (required)
     * @return ApiResponse&lt;DispatchRoute&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DispatchRoute> getDispatchRouteByIdWithHttpInfo(String accessToken, Long routeId) throws ApiException {
        okhttp3.Call localVarCall = getDispatchRouteByIdValidateBeforeCall(accessToken, routeId, null, null);
        Type localVarReturnType = new TypeToken<DispatchRoute>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+} (asynchronously)
     * Fetch a dispatch route by id.
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the dispatch route. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getDispatchRouteByIdAsync(String accessToken, Long routeId, final ApiCallback<DispatchRoute> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getDispatchRouteByIdValidateBeforeCall(accessToken, routeId, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<DispatchRoute>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDispatchRouteHistory
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the route with history. (required)
     * @param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)
     * @param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getDispatchRouteHistoryCall(String accessToken, Long routeId, Long startTime, Long endTime, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/dispatch/routes/{route_id}/history"
            .replaceAll("\\{" + "route_id" + "\\}", localVarApiClient.escapeString(routeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("access_token", accessToken));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
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
    private okhttp3.Call getDispatchRouteHistoryValidateBeforeCall(String accessToken, Long routeId, Long startTime, Long endTime, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getDispatchRouteHistory(Async)");
        }
        
        // verify the required parameter 'routeId' is set
        if (routeId == null) {
            throw new ApiException("Missing the required parameter 'routeId' when calling getDispatchRouteHistory(Async)");
        }
        

        okhttp3.Call localVarCall = getDispatchRouteHistoryCall(accessToken, routeId, startTime, endTime, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     * Fetch the history of a dispatch route.
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the route with history. (required)
     * @param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)
     * @param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)
     * @return DispatchRouteHistory
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DispatchRouteHistory getDispatchRouteHistory(String accessToken, Long routeId, Long startTime, Long endTime) throws ApiException {
        ApiResponse<DispatchRouteHistory> localVarResp = getDispatchRouteHistoryWithHttpInfo(accessToken, routeId, startTime, endTime);
        return localVarResp.getData();
    }

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history
     * Fetch the history of a dispatch route.
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the route with history. (required)
     * @param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)
     * @param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)
     * @return ApiResponse&lt;DispatchRouteHistory&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DispatchRouteHistory> getDispatchRouteHistoryWithHttpInfo(String accessToken, Long routeId, Long startTime, Long endTime) throws ApiException {
        okhttp3.Call localVarCall = getDispatchRouteHistoryValidateBeforeCall(accessToken, routeId, startTime, endTime, null, null);
        Type localVarReturnType = new TypeToken<DispatchRouteHistory>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history (asynchronously)
     * Fetch the history of a dispatch route.
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the route with history. (required)
     * @param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)
     * @param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getDispatchRouteHistoryAsync(String accessToken, Long routeId, Long startTime, Long endTime, final ApiCallback<DispatchRouteHistory> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getDispatchRouteHistoryValidateBeforeCall(accessToken, routeId, startTime, endTime, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<DispatchRouteHistory>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDispatchRoutesByDriverId
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver with the associated routes. (required)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getDispatchRoutesByDriverIdCall(String accessToken, Long driverId, Long endTime, Long duration, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/drivers/{driver_id}/dispatch/routes"
            .replaceAll("\\{" + "driver_id" + "\\}", localVarApiClient.escapeString(driverId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("access_token", accessToken));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (duration != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("duration", duration));
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
    private okhttp3.Call getDispatchRoutesByDriverIdValidateBeforeCall(String accessToken, Long driverId, Long endTime, Long duration, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getDispatchRoutesByDriverId(Async)");
        }
        
        // verify the required parameter 'driverId' is set
        if (driverId == null) {
            throw new ApiException("Missing the required parameter 'driverId' when calling getDispatchRoutesByDriverId(Async)");
        }
        

        okhttp3.Call localVarCall = getDispatchRoutesByDriverIdCall(accessToken, driverId, endTime, duration, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * Fetch all of the dispatch routes for a given driver.
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver with the associated routes. (required)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @return List&lt;DispatchRoute&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<DispatchRoute> getDispatchRoutesByDriverId(String accessToken, Long driverId, Long endTime, Long duration) throws ApiException {
        ApiResponse<List<DispatchRoute>> localVarResp = getDispatchRoutesByDriverIdWithHttpInfo(accessToken, driverId, endTime, duration);
        return localVarResp.getData();
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * Fetch all of the dispatch routes for a given driver.
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver with the associated routes. (required)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @return ApiResponse&lt;List&lt;DispatchRoute&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<DispatchRoute>> getDispatchRoutesByDriverIdWithHttpInfo(String accessToken, Long driverId, Long endTime, Long duration) throws ApiException {
        okhttp3.Call localVarCall = getDispatchRoutesByDriverIdValidateBeforeCall(accessToken, driverId, endTime, duration, null, null);
        Type localVarReturnType = new TypeToken<List<DispatchRoute>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes (asynchronously)
     * Fetch all of the dispatch routes for a given driver.
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver with the associated routes. (required)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getDispatchRoutesByDriverIdAsync(String accessToken, Long driverId, Long endTime, Long duration, final ApiCallback<List<DispatchRoute>> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getDispatchRoutesByDriverIdValidateBeforeCall(accessToken, driverId, endTime, duration, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<List<DispatchRoute>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDispatchRoutesByVehicleId
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getDispatchRoutesByVehicleIdCall(String accessToken, Long vehicleId, Long endTime, Long duration, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/vehicles/{vehicle_id}/dispatch/routes"
            .replaceAll("\\{" + "vehicle_id" + "\\}", localVarApiClient.escapeString(vehicleId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("access_token", accessToken));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (duration != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("duration", duration));
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
    private okhttp3.Call getDispatchRoutesByVehicleIdValidateBeforeCall(String accessToken, Long vehicleId, Long endTime, Long duration, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getDispatchRoutesByVehicleId(Async)");
        }
        
        // verify the required parameter 'vehicleId' is set
        if (vehicleId == null) {
            throw new ApiException("Missing the required parameter 'vehicleId' when calling getDispatchRoutesByVehicleId(Async)");
        }
        

        okhttp3.Call localVarCall = getDispatchRoutesByVehicleIdCall(accessToken, vehicleId, endTime, duration, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * Fetch all of the dispatch routes for a given vehicle.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @return List&lt;DispatchRoute&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<DispatchRoute> getDispatchRoutesByVehicleId(String accessToken, Long vehicleId, Long endTime, Long duration) throws ApiException {
        ApiResponse<List<DispatchRoute>> localVarResp = getDispatchRoutesByVehicleIdWithHttpInfo(accessToken, vehicleId, endTime, duration);
        return localVarResp.getData();
    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * Fetch all of the dispatch routes for a given vehicle.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @return ApiResponse&lt;List&lt;DispatchRoute&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<DispatchRoute>> getDispatchRoutesByVehicleIdWithHttpInfo(String accessToken, Long vehicleId, Long endTime, Long duration) throws ApiException {
        okhttp3.Call localVarCall = getDispatchRoutesByVehicleIdValidateBeforeCall(accessToken, vehicleId, endTime, duration, null, null);
        Type localVarReturnType = new TypeToken<List<DispatchRoute>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes (asynchronously)
     * Fetch all of the dispatch routes for a given vehicle.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getDispatchRoutesByVehicleIdAsync(String accessToken, Long vehicleId, Long endTime, Long duration, final ApiCallback<List<DispatchRoute>> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getDispatchRoutesByVehicleIdValidateBeforeCall(accessToken, vehicleId, endTime, duration, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<List<DispatchRoute>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateDispatchRouteById
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the dispatch route. (required)
     * @param updateDispatchRouteParams  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call updateDispatchRouteByIdCall(String accessToken, Long routeId, DispatchRoute updateDispatchRouteParams, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = updateDispatchRouteParams;

        // create path and map variables
        String localVarPath = "/fleet/dispatch/routes/{route_id}"
            .replaceAll("\\{" + "route_id" + "\\}", localVarApiClient.escapeString(routeId.toString()));

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
    private okhttp3.Call updateDispatchRouteByIdValidateBeforeCall(String accessToken, Long routeId, DispatchRoute updateDispatchRouteParams, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling updateDispatchRouteById(Async)");
        }
        
        // verify the required parameter 'routeId' is set
        if (routeId == null) {
            throw new ApiException("Missing the required parameter 'routeId' when calling updateDispatchRouteById(Async)");
        }
        
        // verify the required parameter 'updateDispatchRouteParams' is set
        if (updateDispatchRouteParams == null) {
            throw new ApiException("Missing the required parameter 'updateDispatchRouteParams' when calling updateDispatchRouteById(Async)");
        }
        

        okhttp3.Call localVarCall = updateDispatchRouteByIdCall(accessToken, routeId, updateDispatchRouteParams, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     * Update a dispatch route and its associated jobs.
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the dispatch route. (required)
     * @param updateDispatchRouteParams  (required)
     * @return DispatchRoute
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DispatchRoute updateDispatchRouteById(String accessToken, Long routeId, DispatchRoute updateDispatchRouteParams) throws ApiException {
        ApiResponse<DispatchRoute> localVarResp = updateDispatchRouteByIdWithHttpInfo(accessToken, routeId, updateDispatchRouteParams);
        return localVarResp.getData();
    }

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/
     * Update a dispatch route and its associated jobs.
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the dispatch route. (required)
     * @param updateDispatchRouteParams  (required)
     * @return ApiResponse&lt;DispatchRoute&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DispatchRoute> updateDispatchRouteByIdWithHttpInfo(String accessToken, Long routeId, DispatchRoute updateDispatchRouteParams) throws ApiException {
        okhttp3.Call localVarCall = updateDispatchRouteByIdValidateBeforeCall(accessToken, routeId, updateDispatchRouteParams, null, null);
        Type localVarReturnType = new TypeToken<DispatchRoute>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/ (asynchronously)
     * Update a dispatch route and its associated jobs.
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the dispatch route. (required)
     * @param updateDispatchRouteParams  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call updateDispatchRouteByIdAsync(String accessToken, Long routeId, DispatchRoute updateDispatchRouteParams, final ApiCallback<DispatchRoute> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = updateDispatchRouteByIdValidateBeforeCall(accessToken, routeId, updateDispatchRouteParams, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<DispatchRoute>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
