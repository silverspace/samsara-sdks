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


import org.openapitools.client.model.Driver;
import org.openapitools.client.model.DriverForCreate;
import org.openapitools.client.model.InlineObject4;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DriversApi {
    private ApiClient localVarApiClient;

    public DriversApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DriversApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createDriver
     * @param accessToken Samsara API access token. (required)
     * @param createDriverParam Driver creation body (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call createDriverCall(String accessToken, DriverForCreate createDriverParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = createDriverParam;

        // create path and map variables
        String localVarPath = "/fleet/drivers/create";

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
    private okhttp3.Call createDriverValidateBeforeCall(String accessToken, DriverForCreate createDriverParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling createDriver(Async)");
        }
        
        // verify the required parameter 'createDriverParam' is set
        if (createDriverParam == null) {
            throw new ApiException("Missing the required parameter 'createDriverParam' when calling createDriver(Async)");
        }
        

        okhttp3.Call localVarCall = createDriverCall(accessToken, createDriverParam, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/drivers/create
     * Create a new driver.
     * @param accessToken Samsara API access token. (required)
     * @param createDriverParam Driver creation body (required)
     * @return Driver
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Driver createDriver(String accessToken, DriverForCreate createDriverParam) throws ApiException {
        ApiResponse<Driver> localVarResp = createDriverWithHttpInfo(accessToken, createDriverParam);
        return localVarResp.getData();
    }

    /**
     * /fleet/drivers/create
     * Create a new driver.
     * @param accessToken Samsara API access token. (required)
     * @param createDriverParam Driver creation body (required)
     * @return ApiResponse&lt;Driver&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Driver> createDriverWithHttpInfo(String accessToken, DriverForCreate createDriverParam) throws ApiException {
        okhttp3.Call localVarCall = createDriverValidateBeforeCall(accessToken, createDriverParam, null, null);
        Type localVarReturnType = new TypeToken<Driver>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/drivers/create (asynchronously)
     * Create a new driver.
     * @param accessToken Samsara API access token. (required)
     * @param createDriverParam Driver creation body (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call createDriverAsync(String accessToken, DriverForCreate createDriverParam, final ApiCallback<Driver> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = createDriverValidateBeforeCall(accessToken, createDriverParam, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<Driver>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deactivateDriver
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call deactivateDriverCall(String accessToken, String driverIdOrExternalId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/drivers/{driver_id_or_external_id}"
            .replaceAll("\\{" + "driver_id_or_external_id" + "\\}", localVarApiClient.escapeString(driverIdOrExternalId.toString()));

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
    private okhttp3.Call deactivateDriverValidateBeforeCall(String accessToken, String driverIdOrExternalId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling deactivateDriver(Async)");
        }
        
        // verify the required parameter 'driverIdOrExternalId' is set
        if (driverIdOrExternalId == null) {
            throw new ApiException("Missing the required parameter 'driverIdOrExternalId' when calling deactivateDriver(Async)");
        }
        

        okhttp3.Call localVarCall = deactivateDriverCall(accessToken, driverIdOrExternalId, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Deactivate a driver with the given id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deactivateDriver(String accessToken, String driverIdOrExternalId) throws ApiException {
        deactivateDriverWithHttpInfo(accessToken, driverIdOrExternalId);
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Deactivate a driver with the given id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deactivateDriverWithHttpInfo(String accessToken, String driverIdOrExternalId) throws ApiException {
        okhttp3.Call localVarCall = deactivateDriverValidateBeforeCall(accessToken, driverIdOrExternalId, null, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} (asynchronously)
     * Deactivate a driver with the given id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call deactivateDriverAsync(String accessToken, String driverIdOrExternalId, final ApiCallback<Void> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = deactivateDriverValidateBeforeCall(accessToken, driverIdOrExternalId, _progressListener, _progressRequestListener);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAllDeactivatedDrivers
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getAllDeactivatedDriversCall(String accessToken, Long groupId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/drivers/inactive";

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
    private okhttp3.Call getAllDeactivatedDriversValidateBeforeCall(String accessToken, Long groupId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getAllDeactivatedDrivers(Async)");
        }
        

        okhttp3.Call localVarCall = getAllDeactivatedDriversCall(accessToken, groupId, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/drivers/inactive
     * Fetch all deactivated drivers for the group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @return List&lt;Driver&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Driver> getAllDeactivatedDrivers(String accessToken, Long groupId) throws ApiException {
        ApiResponse<List<Driver>> localVarResp = getAllDeactivatedDriversWithHttpInfo(accessToken, groupId);
        return localVarResp.getData();
    }

    /**
     * /fleet/drivers/inactive
     * Fetch all deactivated drivers for the group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @return ApiResponse&lt;List&lt;Driver&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Driver>> getAllDeactivatedDriversWithHttpInfo(String accessToken, Long groupId) throws ApiException {
        okhttp3.Call localVarCall = getAllDeactivatedDriversValidateBeforeCall(accessToken, groupId, null, null);
        Type localVarReturnType = new TypeToken<List<Driver>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/drivers/inactive (asynchronously)
     * Fetch all deactivated drivers for the group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getAllDeactivatedDriversAsync(String accessToken, Long groupId, final ApiCallback<List<Driver>> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getAllDeactivatedDriversValidateBeforeCall(accessToken, groupId, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Driver>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDeactivatedDriverById
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getDeactivatedDriverByIdCall(String accessToken, String driverIdOrExternalId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/drivers/inactive/{driver_id_or_external_id}"
            .replaceAll("\\{" + "driver_id_or_external_id" + "\\}", localVarApiClient.escapeString(driverIdOrExternalId.toString()));

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
    private okhttp3.Call getDeactivatedDriverByIdValidateBeforeCall(String accessToken, String driverIdOrExternalId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getDeactivatedDriverById(Async)");
        }
        
        // verify the required parameter 'driverIdOrExternalId' is set
        if (driverIdOrExternalId == null) {
            throw new ApiException("Missing the required parameter 'driverIdOrExternalId' when calling getDeactivatedDriverById(Async)");
        }
        

        okhttp3.Call localVarCall = getDeactivatedDriverByIdCall(accessToken, driverIdOrExternalId, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Fetch deactivated driver by id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @return Driver
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Driver getDeactivatedDriverById(String accessToken, String driverIdOrExternalId) throws ApiException {
        ApiResponse<Driver> localVarResp = getDeactivatedDriverByIdWithHttpInfo(accessToken, driverIdOrExternalId);
        return localVarResp.getData();
    }

    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Fetch deactivated driver by id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @return ApiResponse&lt;Driver&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Driver> getDeactivatedDriverByIdWithHttpInfo(String accessToken, String driverIdOrExternalId) throws ApiException {
        okhttp3.Call localVarCall = getDeactivatedDriverByIdValidateBeforeCall(accessToken, driverIdOrExternalId, null, null);
        Type localVarReturnType = new TypeToken<Driver>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} (asynchronously)
     * Fetch deactivated driver by id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getDeactivatedDriverByIdAsync(String accessToken, String driverIdOrExternalId, final ApiCallback<Driver> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getDeactivatedDriverByIdValidateBeforeCall(accessToken, driverIdOrExternalId, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<Driver>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDriverById
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getDriverByIdCall(String accessToken, String driverIdOrExternalId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/drivers/{driver_id_or_external_id}"
            .replaceAll("\\{" + "driver_id_or_external_id" + "\\}", localVarApiClient.escapeString(driverIdOrExternalId.toString()));

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
    private okhttp3.Call getDriverByIdValidateBeforeCall(String accessToken, String driverIdOrExternalId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getDriverById(Async)");
        }
        
        // verify the required parameter 'driverIdOrExternalId' is set
        if (driverIdOrExternalId == null) {
            throw new ApiException("Missing the required parameter 'driverIdOrExternalId' when calling getDriverById(Async)");
        }
        

        okhttp3.Call localVarCall = getDriverByIdCall(accessToken, driverIdOrExternalId, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Fetch driver by id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @return Driver
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Driver getDriverById(String accessToken, String driverIdOrExternalId) throws ApiException {
        ApiResponse<Driver> localVarResp = getDriverByIdWithHttpInfo(accessToken, driverIdOrExternalId);
        return localVarResp.getData();
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Fetch driver by id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @return ApiResponse&lt;Driver&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Driver> getDriverByIdWithHttpInfo(String accessToken, String driverIdOrExternalId) throws ApiException {
        okhttp3.Call localVarCall = getDriverByIdValidateBeforeCall(accessToken, driverIdOrExternalId, null, null);
        Type localVarReturnType = new TypeToken<Driver>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} (asynchronously)
     * Fetch driver by id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getDriverByIdAsync(String accessToken, String driverIdOrExternalId, final ApiCallback<Driver> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getDriverByIdValidateBeforeCall(accessToken, driverIdOrExternalId, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<Driver>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for reactivateDriverById
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param reactivateDriverParam  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call reactivateDriverByIdCall(String accessToken, String driverIdOrExternalId, InlineObject4 reactivateDriverParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = reactivateDriverParam;

        // create path and map variables
        String localVarPath = "/fleet/drivers/inactive/{driver_id_or_external_id}"
            .replaceAll("\\{" + "driver_id_or_external_id" + "\\}", localVarApiClient.escapeString(driverIdOrExternalId.toString()));

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
    private okhttp3.Call reactivateDriverByIdValidateBeforeCall(String accessToken, String driverIdOrExternalId, InlineObject4 reactivateDriverParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling reactivateDriverById(Async)");
        }
        
        // verify the required parameter 'driverIdOrExternalId' is set
        if (driverIdOrExternalId == null) {
            throw new ApiException("Missing the required parameter 'driverIdOrExternalId' when calling reactivateDriverById(Async)");
        }
        
        // verify the required parameter 'reactivateDriverParam' is set
        if (reactivateDriverParam == null) {
            throw new ApiException("Missing the required parameter 'reactivateDriverParam' when calling reactivateDriverById(Async)");
        }
        

        okhttp3.Call localVarCall = reactivateDriverByIdCall(accessToken, driverIdOrExternalId, reactivateDriverParam, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Reactivate the inactive driver having id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param reactivateDriverParam  (required)
     * @return Driver
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Driver reactivateDriverById(String accessToken, String driverIdOrExternalId, InlineObject4 reactivateDriverParam) throws ApiException {
        ApiResponse<Driver> localVarResp = reactivateDriverByIdWithHttpInfo(accessToken, driverIdOrExternalId, reactivateDriverParam);
        return localVarResp.getData();
    }

    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Reactivate the inactive driver having id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param reactivateDriverParam  (required)
     * @return ApiResponse&lt;Driver&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Driver> reactivateDriverByIdWithHttpInfo(String accessToken, String driverIdOrExternalId, InlineObject4 reactivateDriverParam) throws ApiException {
        okhttp3.Call localVarCall = reactivateDriverByIdValidateBeforeCall(accessToken, driverIdOrExternalId, reactivateDriverParam, null, null);
        Type localVarReturnType = new TypeToken<Driver>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} (asynchronously)
     * Reactivate the inactive driver having id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param reactivateDriverParam  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call reactivateDriverByIdAsync(String accessToken, String driverIdOrExternalId, InlineObject4 reactivateDriverParam, final ApiCallback<Driver> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = reactivateDriverByIdValidateBeforeCall(accessToken, driverIdOrExternalId, reactivateDriverParam, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<Driver>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
