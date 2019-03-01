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


import org.openapitools.client.model.Address;
import org.openapitools.client.model.AllRouteJobUpdates;
import org.openapitools.client.model.AssetReeferResponse;
import org.openapitools.client.model.Contact;
import org.openapitools.client.model.DispatchRoute;
import org.openapitools.client.model.DispatchRouteCreate;
import org.openapitools.client.model.DispatchRouteHistory;
import org.openapitools.client.model.Document;
import org.openapitools.client.model.DocumentCreate;
import org.openapitools.client.model.DocumentType;
import org.openapitools.client.model.Driver;
import org.openapitools.client.model.DriverDailyLogResponse;
import org.openapitools.client.model.DriverForCreate;
import org.openapitools.client.model.DriverSafetyScoreResponse;
import org.openapitools.client.model.DriversResponse;
import org.openapitools.client.model.DriversSummaryResponse;
import org.openapitools.client.model.DvirBase;
import org.openapitools.client.model.DvirListResponse;
import org.openapitools.client.model.FleetVehicleLocation;
import org.openapitools.client.model.FleetVehicleResponse;
import org.openapitools.client.model.HosAuthenticationLogsResponse;
import org.openapitools.client.model.HosLogsResponse;
import org.openapitools.client.model.HosLogsSummaryResponse;
import org.openapitools.client.model.InlineObject;
import org.openapitools.client.model.InlineObject1;
import org.openapitools.client.model.InlineObject10;
import org.openapitools.client.model.InlineObject11;
import org.openapitools.client.model.InlineObject12;
import org.openapitools.client.model.InlineObject13;
import org.openapitools.client.model.InlineObject14;
import org.openapitools.client.model.InlineObject15;
import org.openapitools.client.model.InlineObject16;
import org.openapitools.client.model.InlineObject2;
import org.openapitools.client.model.InlineObject3;
import org.openapitools.client.model.InlineObject4;
import org.openapitools.client.model.InlineObject5;
import org.openapitools.client.model.InlineObject6;
import org.openapitools.client.model.InlineObject7;
import org.openapitools.client.model.InlineObject8;
import org.openapitools.client.model.InlineObject9;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.InlineResponse2001;
import org.openapitools.client.model.InlineResponse2002;
import org.openapitools.client.model.InlineResponse2003;
import org.openapitools.client.model.InlineResponse2004;
import org.openapitools.client.model.InlineResponse2005;
import org.openapitools.client.model.TripResponse;
import org.openapitools.client.model.VehicleHarshEventResponse;
import org.openapitools.client.model.VehicleSafetyScoreResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FleetApi {
    private ApiClient localVarApiClient;

    public FleetApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FleetApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for addFleetAddress
     * @param accessToken Samsara API access token. (required)
     * @param addressParam  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call addFleetAddressCall(String accessToken, InlineObject2 addressParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = addressParam;

        // create path and map variables
        String localVarPath = "/fleet/add_address";

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
    private okhttp3.Call addFleetAddressValidateBeforeCall(String accessToken, InlineObject2 addressParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling addFleetAddress(Async)");
        }
        
        // verify the required parameter 'addressParam' is set
        if (addressParam == null) {
            throw new ApiException("Missing the required parameter 'addressParam' when calling addFleetAddress(Async)");
        }
        

        okhttp3.Call localVarCall = addFleetAddressCall(accessToken, addressParam, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/add_address
     * This method adds an address book entry to the specified group.
     * @param accessToken Samsara API access token. (required)
     * @param addressParam  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void addFleetAddress(String accessToken, InlineObject2 addressParam) throws ApiException {
        addFleetAddressWithHttpInfo(accessToken, addressParam);
    }

    /**
     * /fleet/add_address
     * This method adds an address book entry to the specified group.
     * @param accessToken Samsara API access token. (required)
     * @param addressParam  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> addFleetAddressWithHttpInfo(String accessToken, InlineObject2 addressParam) throws ApiException {
        okhttp3.Call localVarCall = addFleetAddressValidateBeforeCall(accessToken, addressParam, null, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * /fleet/add_address (asynchronously)
     * This method adds an address book entry to the specified group.
     * @param accessToken Samsara API access token. (required)
     * @param addressParam  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call addFleetAddressAsync(String accessToken, InlineObject2 addressParam, final ApiCallback<Void> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = addFleetAddressValidateBeforeCall(accessToken, addressParam, _progressListener, _progressRequestListener);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for addOrganizationAddresses
     * @param accessToken Samsara API access token. (required)
     * @param addresses  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call addOrganizationAddressesCall(String accessToken, InlineObject addresses, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = addresses;

        // create path and map variables
        String localVarPath = "/addresses";

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
    private okhttp3.Call addOrganizationAddressesValidateBeforeCall(String accessToken, InlineObject addresses, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling addOrganizationAddresses(Async)");
        }
        
        // verify the required parameter 'addresses' is set
        if (addresses == null) {
            throw new ApiException("Missing the required parameter 'addresses' when calling addOrganizationAddresses(Async)");
        }
        

        okhttp3.Call localVarCall = addOrganizationAddressesCall(accessToken, addresses, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /addresses
     * Add one or more addresses to the organization
     * @param accessToken Samsara API access token. (required)
     * @param addresses  (required)
     * @return List&lt;Address&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Address> addOrganizationAddresses(String accessToken, InlineObject addresses) throws ApiException {
        ApiResponse<List<Address>> localVarResp = addOrganizationAddressesWithHttpInfo(accessToken, addresses);
        return localVarResp.getData();
    }

    /**
     * /addresses
     * Add one or more addresses to the organization
     * @param accessToken Samsara API access token. (required)
     * @param addresses  (required)
     * @return ApiResponse&lt;List&lt;Address&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Address>> addOrganizationAddressesWithHttpInfo(String accessToken, InlineObject addresses) throws ApiException {
        okhttp3.Call localVarCall = addOrganizationAddressesValidateBeforeCall(accessToken, addresses, null, null);
        Type localVarReturnType = new TypeToken<List<Address>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /addresses (asynchronously)
     * Add one or more addresses to the organization
     * @param accessToken Samsara API access token. (required)
     * @param addresses  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call addOrganizationAddressesAsync(String accessToken, InlineObject addresses, final ApiCallback<List<Address>> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = addOrganizationAddressesValidateBeforeCall(accessToken, addresses, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Address>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
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
     * Build call for createDriverDocument
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver for whom the document is created. (required)
     * @param createDocumentParams To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call createDriverDocumentCall(String accessToken, Long driverId, DocumentCreate createDocumentParams, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = createDocumentParams;

        // create path and map variables
        String localVarPath = "/fleet/drivers/{driver_id}/documents"
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
    private okhttp3.Call createDriverDocumentValidateBeforeCall(String accessToken, Long driverId, DocumentCreate createDocumentParams, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling createDriverDocument(Async)");
        }
        
        // verify the required parameter 'driverId' is set
        if (driverId == null) {
            throw new ApiException("Missing the required parameter 'driverId' when calling createDriverDocument(Async)");
        }
        
        // verify the required parameter 'createDocumentParams' is set
        if (createDocumentParams == null) {
            throw new ApiException("Missing the required parameter 'createDocumentParams' when calling createDriverDocument(Async)");
        }
        

        okhttp3.Call localVarCall = createDriverDocumentCall(accessToken, driverId, createDocumentParams, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/documents
     * Create a driver document for the given driver.
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver for whom the document is created. (required)
     * @param createDocumentParams To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. (required)
     * @return Document
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Document createDriverDocument(String accessToken, Long driverId, DocumentCreate createDocumentParams) throws ApiException {
        ApiResponse<Document> localVarResp = createDriverDocumentWithHttpInfo(accessToken, driverId, createDocumentParams);
        return localVarResp.getData();
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/documents
     * Create a driver document for the given driver.
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver for whom the document is created. (required)
     * @param createDocumentParams To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. (required)
     * @return ApiResponse&lt;Document&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Document> createDriverDocumentWithHttpInfo(String accessToken, Long driverId, DocumentCreate createDocumentParams) throws ApiException {
        okhttp3.Call localVarCall = createDriverDocumentValidateBeforeCall(accessToken, driverId, createDocumentParams, null, null);
        Type localVarReturnType = new TypeToken<Document>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/documents (asynchronously)
     * Create a driver document for the given driver.
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver for whom the document is created. (required)
     * @param createDocumentParams To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call createDriverDocumentAsync(String accessToken, Long driverId, DocumentCreate createDocumentParams, final ApiCallback<Document> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = createDriverDocumentValidateBeforeCall(accessToken, driverId, createDocumentParams, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<Document>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createDvir
     * @param accessToken Samsara API access token. (required)
     * @param createDvirParam  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call createDvirCall(String accessToken, InlineObject12 createDvirParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = createDvirParam;

        // create path and map variables
        String localVarPath = "/fleet/maintenance/dvirs";

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
    private okhttp3.Call createDvirValidateBeforeCall(String accessToken, InlineObject12 createDvirParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling createDvir(Async)");
        }
        
        // verify the required parameter 'createDvirParam' is set
        if (createDvirParam == null) {
            throw new ApiException("Missing the required parameter 'createDvirParam' when calling createDvir(Async)");
        }
        

        okhttp3.Call localVarCall = createDvirCall(accessToken, createDvirParam, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/maintenance/dvirs
     * Create a new dvir, marking a vehicle or trailer safe or unsafe.
     * @param accessToken Samsara API access token. (required)
     * @param createDvirParam  (required)
     * @return DvirBase
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DvirBase createDvir(String accessToken, InlineObject12 createDvirParam) throws ApiException {
        ApiResponse<DvirBase> localVarResp = createDvirWithHttpInfo(accessToken, createDvirParam);
        return localVarResp.getData();
    }

    /**
     * /fleet/maintenance/dvirs
     * Create a new dvir, marking a vehicle or trailer safe or unsafe.
     * @param accessToken Samsara API access token. (required)
     * @param createDvirParam  (required)
     * @return ApiResponse&lt;DvirBase&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DvirBase> createDvirWithHttpInfo(String accessToken, InlineObject12 createDvirParam) throws ApiException {
        okhttp3.Call localVarCall = createDvirValidateBeforeCall(accessToken, createDvirParam, null, null);
        Type localVarReturnType = new TypeToken<DvirBase>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/maintenance/dvirs (asynchronously)
     * Create a new dvir, marking a vehicle or trailer safe or unsafe.
     * @param accessToken Samsara API access token. (required)
     * @param createDvirParam  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call createDvirAsync(String accessToken, InlineObject12 createDvirParam, final ApiCallback<DvirBase> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = createDvirValidateBeforeCall(accessToken, createDvirParam, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<DvirBase>(){}.getType();
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
     * Build call for deleteOrganizationAddress
     * @param accessToken Samsara API access token. (required)
     * @param addressId ID of the address/geofence (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call deleteOrganizationAddressCall(String accessToken, Long addressId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/addresses/{addressId}"
            .replaceAll("\\{" + "addressId" + "\\}", localVarApiClient.escapeString(addressId.toString()));

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
    private okhttp3.Call deleteOrganizationAddressValidateBeforeCall(String accessToken, Long addressId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling deleteOrganizationAddress(Async)");
        }
        
        // verify the required parameter 'addressId' is set
        if (addressId == null) {
            throw new ApiException("Missing the required parameter 'addressId' when calling deleteOrganizationAddress(Async)");
        }
        

        okhttp3.Call localVarCall = deleteOrganizationAddressCall(accessToken, addressId, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /addresses/{addressId}
     * Delete an address.
     * @param accessToken Samsara API access token. (required)
     * @param addressId ID of the address/geofence (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteOrganizationAddress(String accessToken, Long addressId) throws ApiException {
        deleteOrganizationAddressWithHttpInfo(accessToken, addressId);
    }

    /**
     * /addresses/{addressId}
     * Delete an address.
     * @param accessToken Samsara API access token. (required)
     * @param addressId ID of the address/geofence (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteOrganizationAddressWithHttpInfo(String accessToken, Long addressId) throws ApiException {
        okhttp3.Call localVarCall = deleteOrganizationAddressValidateBeforeCall(accessToken, addressId, null, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * /addresses/{addressId} (asynchronously)
     * Delete an address.
     * @param accessToken Samsara API access token. (required)
     * @param addressId ID of the address/geofence (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call deleteOrganizationAddressAsync(String accessToken, Long addressId, final ApiCallback<Void> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = deleteOrganizationAddressValidateBeforeCall(accessToken, addressId, _progressListener, _progressRequestListener);
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
     * Build call for getAllAssetCurrentLocations
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getAllAssetCurrentLocationsCall(String accessToken, Long groupId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/assets/locations";

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
    private okhttp3.Call getAllAssetCurrentLocationsValidateBeforeCall(String accessToken, Long groupId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getAllAssetCurrentLocations(Async)");
        }
        

        okhttp3.Call localVarCall = getAllAssetCurrentLocationsCall(accessToken, groupId, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/assets/locations
     * Fetch current locations of all assets for the group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @return InlineResponse2001
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2001 getAllAssetCurrentLocations(String accessToken, Long groupId) throws ApiException {
        ApiResponse<InlineResponse2001> localVarResp = getAllAssetCurrentLocationsWithHttpInfo(accessToken, groupId);
        return localVarResp.getData();
    }

    /**
     * /fleet/assets/locations
     * Fetch current locations of all assets for the group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @return ApiResponse&lt;InlineResponse2001&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2001> getAllAssetCurrentLocationsWithHttpInfo(String accessToken, Long groupId) throws ApiException {
        okhttp3.Call localVarCall = getAllAssetCurrentLocationsValidateBeforeCall(accessToken, groupId, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/assets/locations (asynchronously)
     * Fetch current locations of all assets for the group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getAllAssetCurrentLocationsAsync(String accessToken, Long groupId, final ApiCallback<InlineResponse2001> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getAllAssetCurrentLocationsValidateBeforeCall(accessToken, groupId, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAllAssets
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getAllAssetsCall(String accessToken, Long groupId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/assets";

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
    private okhttp3.Call getAllAssetsValidateBeforeCall(String accessToken, Long groupId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getAllAssets(Async)");
        }
        

        okhttp3.Call localVarCall = getAllAssetsCall(accessToken, groupId, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/assets
     * Fetch all of the assets for the group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @return InlineResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse200 getAllAssets(String accessToken, Long groupId) throws ApiException {
        ApiResponse<InlineResponse200> localVarResp = getAllAssetsWithHttpInfo(accessToken, groupId);
        return localVarResp.getData();
    }

    /**
     * /fleet/assets
     * Fetch all of the assets for the group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse200> getAllAssetsWithHttpInfo(String accessToken, Long groupId) throws ApiException {
        okhttp3.Call localVarCall = getAllAssetsValidateBeforeCall(accessToken, groupId, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/assets (asynchronously)
     * Fetch all of the assets for the group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getAllAssetsAsync(String accessToken, Long groupId, final ApiCallback<InlineResponse200> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getAllAssetsValidateBeforeCall(accessToken, groupId, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
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
     * Build call for getAssetLocation
     * @param accessToken Samsara API access token. (required)
     * @param assetId ID of the asset (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getAssetLocationCall(String accessToken, Long assetId, Long startMs, Long endMs, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/assets/{asset_id}/locations"
            .replaceAll("\\{" + "asset_id" + "\\}", localVarApiClient.escapeString(assetId.toString()));

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
    private okhttp3.Call getAssetLocationValidateBeforeCall(String accessToken, Long assetId, Long startMs, Long endMs, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getAssetLocation(Async)");
        }
        
        // verify the required parameter 'assetId' is set
        if (assetId == null) {
            throw new ApiException("Missing the required parameter 'assetId' when calling getAssetLocation(Async)");
        }
        
        // verify the required parameter 'startMs' is set
        if (startMs == null) {
            throw new ApiException("Missing the required parameter 'startMs' when calling getAssetLocation(Async)");
        }
        
        // verify the required parameter 'endMs' is set
        if (endMs == null) {
            throw new ApiException("Missing the required parameter 'endMs' when calling getAssetLocation(Async)");
        }
        

        okhttp3.Call localVarCall = getAssetLocationCall(accessToken, assetId, startMs, endMs, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/assets/{assetId:[0-9]+}/locations
     * Fetch the historical locations for the asset.
     * @param accessToken Samsara API access token. (required)
     * @param assetId ID of the asset (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @return List&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Object> getAssetLocation(String accessToken, Long assetId, Long startMs, Long endMs) throws ApiException {
        ApiResponse<List<Object>> localVarResp = getAssetLocationWithHttpInfo(accessToken, assetId, startMs, endMs);
        return localVarResp.getData();
    }

    /**
     * /fleet/assets/{assetId:[0-9]+}/locations
     * Fetch the historical locations for the asset.
     * @param accessToken Samsara API access token. (required)
     * @param assetId ID of the asset (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @return ApiResponse&lt;List&lt;Object&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Object>> getAssetLocationWithHttpInfo(String accessToken, Long assetId, Long startMs, Long endMs) throws ApiException {
        okhttp3.Call localVarCall = getAssetLocationValidateBeforeCall(accessToken, assetId, startMs, endMs, null, null);
        Type localVarReturnType = new TypeToken<List<Object>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/assets/{assetId:[0-9]+}/locations (asynchronously)
     * Fetch the historical locations for the asset.
     * @param accessToken Samsara API access token. (required)
     * @param assetId ID of the asset (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getAssetLocationAsync(String accessToken, Long assetId, Long startMs, Long endMs, final ApiCallback<List<Object>> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getAssetLocationValidateBeforeCall(accessToken, assetId, startMs, endMs, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Object>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAssetReefer
     * @param accessToken Samsara API access token. (required)
     * @param assetId ID of the asset (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getAssetReeferCall(String accessToken, Long assetId, Long startMs, Long endMs, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/assets/{asset_id}/reefer"
            .replaceAll("\\{" + "asset_id" + "\\}", localVarApiClient.escapeString(assetId.toString()));

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
    private okhttp3.Call getAssetReeferValidateBeforeCall(String accessToken, Long assetId, Long startMs, Long endMs, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getAssetReefer(Async)");
        }
        
        // verify the required parameter 'assetId' is set
        if (assetId == null) {
            throw new ApiException("Missing the required parameter 'assetId' when calling getAssetReefer(Async)");
        }
        
        // verify the required parameter 'startMs' is set
        if (startMs == null) {
            throw new ApiException("Missing the required parameter 'startMs' when calling getAssetReefer(Async)");
        }
        
        // verify the required parameter 'endMs' is set
        if (endMs == null) {
            throw new ApiException("Missing the required parameter 'endMs' when calling getAssetReefer(Async)");
        }
        

        okhttp3.Call localVarCall = getAssetReeferCall(accessToken, assetId, startMs, endMs, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/assets/{assetId:[0-9]+}/reefer
     * Fetch the reefer-specific stats of an asset.
     * @param accessToken Samsara API access token. (required)
     * @param assetId ID of the asset (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @return AssetReeferResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AssetReeferResponse getAssetReefer(String accessToken, Long assetId, Long startMs, Long endMs) throws ApiException {
        ApiResponse<AssetReeferResponse> localVarResp = getAssetReeferWithHttpInfo(accessToken, assetId, startMs, endMs);
        return localVarResp.getData();
    }

    /**
     * /fleet/assets/{assetId:[0-9]+}/reefer
     * Fetch the reefer-specific stats of an asset.
     * @param accessToken Samsara API access token. (required)
     * @param assetId ID of the asset (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @return ApiResponse&lt;AssetReeferResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AssetReeferResponse> getAssetReeferWithHttpInfo(String accessToken, Long assetId, Long startMs, Long endMs) throws ApiException {
        okhttp3.Call localVarCall = getAssetReeferValidateBeforeCall(accessToken, assetId, startMs, endMs, null, null);
        Type localVarReturnType = new TypeToken<AssetReeferResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/assets/{assetId:[0-9]+}/reefer (asynchronously)
     * Fetch the reefer-specific stats of an asset.
     * @param accessToken Samsara API access token. (required)
     * @param assetId ID of the asset (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getAssetReeferAsync(String accessToken, Long assetId, Long startMs, Long endMs, final ApiCallback<AssetReeferResponse> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getAssetReeferValidateBeforeCall(accessToken, assetId, startMs, endMs, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<AssetReeferResponse>(){}.getType();
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
     * Build call for getDriverDocumentTypesByOrgId
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getDriverDocumentTypesByOrgIdCall(final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/drivers/document_types";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
    private okhttp3.Call getDriverDocumentTypesByOrgIdValidateBeforeCall(final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        

        okhttp3.Call localVarCall = getDriverDocumentTypesByOrgIdCall(_progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/drivers/document_types
     * Fetch all of the document types.
     * @return List&lt;DocumentType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<DocumentType> getDriverDocumentTypesByOrgId() throws ApiException {
        ApiResponse<List<DocumentType>> localVarResp = getDriverDocumentTypesByOrgIdWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * /fleet/drivers/document_types
     * Fetch all of the document types.
     * @return ApiResponse&lt;List&lt;DocumentType&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<DocumentType>> getDriverDocumentTypesByOrgIdWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getDriverDocumentTypesByOrgIdValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<DocumentType>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/drivers/document_types (asynchronously)
     * Fetch all of the document types.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getDriverDocumentTypesByOrgIdAsync(final ApiCallback<List<DocumentType>> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getDriverDocumentTypesByOrgIdValidateBeforeCall(_progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<List<DocumentType>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDriverDocumentsByOrgId
     * @param accessToken Samsara API access token. (required)
     * @param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)
     * @param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getDriverDocumentsByOrgIdCall(String accessToken, Long endMs, Long durationMs, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/drivers/documents";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("access_token", accessToken));
        }

        if (endMs != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("endMs", endMs));
        }

        if (durationMs != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("durationMs", durationMs));
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
    private okhttp3.Call getDriverDocumentsByOrgIdValidateBeforeCall(String accessToken, Long endMs, Long durationMs, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getDriverDocumentsByOrgId(Async)");
        }
        

        okhttp3.Call localVarCall = getDriverDocumentsByOrgIdCall(accessToken, endMs, durationMs, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/drivers/documents
     * Fetch all of the documents.
     * @param accessToken Samsara API access token. (required)
     * @param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)
     * @param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)
     * @return List&lt;Document&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Document> getDriverDocumentsByOrgId(String accessToken, Long endMs, Long durationMs) throws ApiException {
        ApiResponse<List<Document>> localVarResp = getDriverDocumentsByOrgIdWithHttpInfo(accessToken, endMs, durationMs);
        return localVarResp.getData();
    }

    /**
     * /fleet/drivers/documents
     * Fetch all of the documents.
     * @param accessToken Samsara API access token. (required)
     * @param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)
     * @param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)
     * @return ApiResponse&lt;List&lt;Document&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Document>> getDriverDocumentsByOrgIdWithHttpInfo(String accessToken, Long endMs, Long durationMs) throws ApiException {
        okhttp3.Call localVarCall = getDriverDocumentsByOrgIdValidateBeforeCall(accessToken, endMs, durationMs, null, null);
        Type localVarReturnType = new TypeToken<List<Document>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/drivers/documents (asynchronously)
     * Fetch all of the documents.
     * @param accessToken Samsara API access token. (required)
     * @param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)
     * @param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getDriverDocumentsByOrgIdAsync(String accessToken, Long endMs, Long durationMs, final ApiCallback<List<Document>> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getDriverDocumentsByOrgIdValidateBeforeCall(accessToken, endMs, durationMs, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Document>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
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
     * Build call for getDvirs
     * @param accessToken Samsara API access token. (required)
     * @param endMs time in millis until the last dvir log. (required)
     * @param durationMs time in millis which corresponds to the duration before the end_ms. (required)
     * @param groupId Group ID to query. (optional)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getDvirsCall(String accessToken, Integer endMs, Integer durationMs, Integer groupId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/maintenance/dvirs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("access_token", accessToken));
        }

        if (endMs != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_ms", endMs));
        }

        if (durationMs != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("duration_ms", durationMs));
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
    private okhttp3.Call getDvirsValidateBeforeCall(String accessToken, Integer endMs, Integer durationMs, Integer groupId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getDvirs(Async)");
        }
        
        // verify the required parameter 'endMs' is set
        if (endMs == null) {
            throw new ApiException("Missing the required parameter 'endMs' when calling getDvirs(Async)");
        }
        
        // verify the required parameter 'durationMs' is set
        if (durationMs == null) {
            throw new ApiException("Missing the required parameter 'durationMs' when calling getDvirs(Async)");
        }
        

        okhttp3.Call localVarCall = getDvirsCall(accessToken, endMs, durationMs, groupId, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/maintenance/dvirs
     * Get DVIRs for the org within provided time constraints
     * @param accessToken Samsara API access token. (required)
     * @param endMs time in millis until the last dvir log. (required)
     * @param durationMs time in millis which corresponds to the duration before the end_ms. (required)
     * @param groupId Group ID to query. (optional)
     * @return DvirListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DvirListResponse getDvirs(String accessToken, Integer endMs, Integer durationMs, Integer groupId) throws ApiException {
        ApiResponse<DvirListResponse> localVarResp = getDvirsWithHttpInfo(accessToken, endMs, durationMs, groupId);
        return localVarResp.getData();
    }

    /**
     * /fleet/maintenance/dvirs
     * Get DVIRs for the org within provided time constraints
     * @param accessToken Samsara API access token. (required)
     * @param endMs time in millis until the last dvir log. (required)
     * @param durationMs time in millis which corresponds to the duration before the end_ms. (required)
     * @param groupId Group ID to query. (optional)
     * @return ApiResponse&lt;DvirListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DvirListResponse> getDvirsWithHttpInfo(String accessToken, Integer endMs, Integer durationMs, Integer groupId) throws ApiException {
        okhttp3.Call localVarCall = getDvirsValidateBeforeCall(accessToken, endMs, durationMs, groupId, null, null);
        Type localVarReturnType = new TypeToken<DvirListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/maintenance/dvirs (asynchronously)
     * Get DVIRs for the org within provided time constraints
     * @param accessToken Samsara API access token. (required)
     * @param endMs time in millis until the last dvir log. (required)
     * @param durationMs time in millis which corresponds to the duration before the end_ms. (required)
     * @param groupId Group ID to query. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getDvirsAsync(String accessToken, Integer endMs, Integer durationMs, Integer groupId, final ApiCallback<DvirListResponse> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getDvirsValidateBeforeCall(accessToken, endMs, durationMs, groupId, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<DvirListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFleetDrivers
     * @param accessToken Samsara API access token. (required)
     * @param groupDriversParam  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getFleetDriversCall(String accessToken, InlineObject3 groupDriversParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = groupDriversParam;

        // create path and map variables
        String localVarPath = "/fleet/drivers";

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
    private okhttp3.Call getFleetDriversValidateBeforeCall(String accessToken, InlineObject3 groupDriversParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getFleetDrivers(Async)");
        }
        
        // verify the required parameter 'groupDriversParam' is set
        if (groupDriversParam == null) {
            throw new ApiException("Missing the required parameter 'groupDriversParam' when calling getFleetDrivers(Async)");
        }
        

        okhttp3.Call localVarCall = getFleetDriversCall(accessToken, groupDriversParam, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/drivers
     * Get all the drivers for the specified group.
     * @param accessToken Samsara API access token. (required)
     * @param groupDriversParam  (required)
     * @return DriversResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DriversResponse getFleetDrivers(String accessToken, InlineObject3 groupDriversParam) throws ApiException {
        ApiResponse<DriversResponse> localVarResp = getFleetDriversWithHttpInfo(accessToken, groupDriversParam);
        return localVarResp.getData();
    }

    /**
     * /fleet/drivers
     * Get all the drivers for the specified group.
     * @param accessToken Samsara API access token. (required)
     * @param groupDriversParam  (required)
     * @return ApiResponse&lt;DriversResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DriversResponse> getFleetDriversWithHttpInfo(String accessToken, InlineObject3 groupDriversParam) throws ApiException {
        okhttp3.Call localVarCall = getFleetDriversValidateBeforeCall(accessToken, groupDriversParam, null, null);
        Type localVarReturnType = new TypeToken<DriversResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/drivers (asynchronously)
     * Get all the drivers for the specified group.
     * @param accessToken Samsara API access token. (required)
     * @param groupDriversParam  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getFleetDriversAsync(String accessToken, InlineObject3 groupDriversParam, final ApiCallback<DriversResponse> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getFleetDriversValidateBeforeCall(accessToken, groupDriversParam, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<DriversResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFleetDriversHosDailyLogs
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver with HOS logs. (required)
     * @param hosLogsParam  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getFleetDriversHosDailyLogsCall(String accessToken, Long driverId, InlineObject6 hosLogsParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = hosLogsParam;

        // create path and map variables
        String localVarPath = "/fleet/drivers/{driver_id}/hos_daily_logs"
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
    private okhttp3.Call getFleetDriversHosDailyLogsValidateBeforeCall(String accessToken, Long driverId, InlineObject6 hosLogsParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getFleetDriversHosDailyLogs(Async)");
        }
        
        // verify the required parameter 'driverId' is set
        if (driverId == null) {
            throw new ApiException("Missing the required parameter 'driverId' when calling getFleetDriversHosDailyLogs(Async)");
        }
        
        // verify the required parameter 'hosLogsParam' is set
        if (hosLogsParam == null) {
            throw new ApiException("Missing the required parameter 'hosLogsParam' when calling getFleetDriversHosDailyLogs(Async)");
        }
        

        okhttp3.Call localVarCall = getFleetDriversHosDailyLogsCall(accessToken, driverId, hosLogsParam, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     * Get summarized daily HOS charts for a specified driver.
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver with HOS logs. (required)
     * @param hosLogsParam  (required)
     * @return DriverDailyLogResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DriverDailyLogResponse getFleetDriversHosDailyLogs(String accessToken, Long driverId, InlineObject6 hosLogsParam) throws ApiException {
        ApiResponse<DriverDailyLogResponse> localVarResp = getFleetDriversHosDailyLogsWithHttpInfo(accessToken, driverId, hosLogsParam);
        return localVarResp.getData();
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
     * Get summarized daily HOS charts for a specified driver.
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver with HOS logs. (required)
     * @param hosLogsParam  (required)
     * @return ApiResponse&lt;DriverDailyLogResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DriverDailyLogResponse> getFleetDriversHosDailyLogsWithHttpInfo(String accessToken, Long driverId, InlineObject6 hosLogsParam) throws ApiException {
        okhttp3.Call localVarCall = getFleetDriversHosDailyLogsValidateBeforeCall(accessToken, driverId, hosLogsParam, null, null);
        Type localVarReturnType = new TypeToken<DriverDailyLogResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs (asynchronously)
     * Get summarized daily HOS charts for a specified driver.
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver with HOS logs. (required)
     * @param hosLogsParam  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getFleetDriversHosDailyLogsAsync(String accessToken, Long driverId, InlineObject6 hosLogsParam, final ApiCallback<DriverDailyLogResponse> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getFleetDriversHosDailyLogsValidateBeforeCall(accessToken, driverId, hosLogsParam, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<DriverDailyLogResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFleetDriversSummary
     * @param accessToken Samsara API access token. (required)
     * @param driversSummaryParam  (required)
     * @param snapToDayBounds Snap query result to HOS day boundaries. (optional)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getFleetDriversSummaryCall(String accessToken, InlineObject5 driversSummaryParam, Boolean snapToDayBounds, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = driversSummaryParam;

        // create path and map variables
        String localVarPath = "/fleet/drivers/summary";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("access_token", accessToken));
        }

        if (snapToDayBounds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("snap_to_day_bounds", snapToDayBounds));
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
    private okhttp3.Call getFleetDriversSummaryValidateBeforeCall(String accessToken, InlineObject5 driversSummaryParam, Boolean snapToDayBounds, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getFleetDriversSummary(Async)");
        }
        
        // verify the required parameter 'driversSummaryParam' is set
        if (driversSummaryParam == null) {
            throw new ApiException("Missing the required parameter 'driversSummaryParam' when calling getFleetDriversSummary(Async)");
        }
        

        okhttp3.Call localVarCall = getFleetDriversSummaryCall(accessToken, driversSummaryParam, snapToDayBounds, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/drivers/summary
     * Get the distance and time each driver in an organization has driven in a given time period.
     * @param accessToken Samsara API access token. (required)
     * @param driversSummaryParam  (required)
     * @param snapToDayBounds Snap query result to HOS day boundaries. (optional)
     * @return DriversSummaryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DriversSummaryResponse getFleetDriversSummary(String accessToken, InlineObject5 driversSummaryParam, Boolean snapToDayBounds) throws ApiException {
        ApiResponse<DriversSummaryResponse> localVarResp = getFleetDriversSummaryWithHttpInfo(accessToken, driversSummaryParam, snapToDayBounds);
        return localVarResp.getData();
    }

    /**
     * /fleet/drivers/summary
     * Get the distance and time each driver in an organization has driven in a given time period.
     * @param accessToken Samsara API access token. (required)
     * @param driversSummaryParam  (required)
     * @param snapToDayBounds Snap query result to HOS day boundaries. (optional)
     * @return ApiResponse&lt;DriversSummaryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DriversSummaryResponse> getFleetDriversSummaryWithHttpInfo(String accessToken, InlineObject5 driversSummaryParam, Boolean snapToDayBounds) throws ApiException {
        okhttp3.Call localVarCall = getFleetDriversSummaryValidateBeforeCall(accessToken, driversSummaryParam, snapToDayBounds, null, null);
        Type localVarReturnType = new TypeToken<DriversSummaryResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/drivers/summary (asynchronously)
     * Get the distance and time each driver in an organization has driven in a given time period.
     * @param accessToken Samsara API access token. (required)
     * @param driversSummaryParam  (required)
     * @param snapToDayBounds Snap query result to HOS day boundaries. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getFleetDriversSummaryAsync(String accessToken, InlineObject5 driversSummaryParam, Boolean snapToDayBounds, final ApiCallback<DriversSummaryResponse> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getFleetDriversSummaryValidateBeforeCall(accessToken, driversSummaryParam, snapToDayBounds, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<DriversSummaryResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFleetHosAuthenticationLogs
     * @param accessToken Samsara API access token. (required)
     * @param hosAuthenticationLogsParam  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getFleetHosAuthenticationLogsCall(String accessToken, InlineObject7 hosAuthenticationLogsParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = hosAuthenticationLogsParam;

        // create path and map variables
        String localVarPath = "/fleet/hos_authentication_logs";

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
    private okhttp3.Call getFleetHosAuthenticationLogsValidateBeforeCall(String accessToken, InlineObject7 hosAuthenticationLogsParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getFleetHosAuthenticationLogs(Async)");
        }
        
        // verify the required parameter 'hosAuthenticationLogsParam' is set
        if (hosAuthenticationLogsParam == null) {
            throw new ApiException("Missing the required parameter 'hosAuthenticationLogsParam' when calling getFleetHosAuthenticationLogs(Async)");
        }
        

        okhttp3.Call localVarCall = getFleetHosAuthenticationLogsCall(accessToken, hosAuthenticationLogsParam, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/hos_authentication_logs
     * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
     * @param accessToken Samsara API access token. (required)
     * @param hosAuthenticationLogsParam  (required)
     * @return HosAuthenticationLogsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HosAuthenticationLogsResponse getFleetHosAuthenticationLogs(String accessToken, InlineObject7 hosAuthenticationLogsParam) throws ApiException {
        ApiResponse<HosAuthenticationLogsResponse> localVarResp = getFleetHosAuthenticationLogsWithHttpInfo(accessToken, hosAuthenticationLogsParam);
        return localVarResp.getData();
    }

    /**
     * /fleet/hos_authentication_logs
     * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
     * @param accessToken Samsara API access token. (required)
     * @param hosAuthenticationLogsParam  (required)
     * @return ApiResponse&lt;HosAuthenticationLogsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HosAuthenticationLogsResponse> getFleetHosAuthenticationLogsWithHttpInfo(String accessToken, InlineObject7 hosAuthenticationLogsParam) throws ApiException {
        okhttp3.Call localVarCall = getFleetHosAuthenticationLogsValidateBeforeCall(accessToken, hosAuthenticationLogsParam, null, null);
        Type localVarReturnType = new TypeToken<HosAuthenticationLogsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/hos_authentication_logs (asynchronously)
     * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
     * @param accessToken Samsara API access token. (required)
     * @param hosAuthenticationLogsParam  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getFleetHosAuthenticationLogsAsync(String accessToken, InlineObject7 hosAuthenticationLogsParam, final ApiCallback<HosAuthenticationLogsResponse> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getFleetHosAuthenticationLogsValidateBeforeCall(accessToken, hosAuthenticationLogsParam, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<HosAuthenticationLogsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFleetHosLogs
     * @param accessToken Samsara API access token. (required)
     * @param hosLogsParam  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getFleetHosLogsCall(String accessToken, InlineObject8 hosLogsParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = hosLogsParam;

        // create path and map variables
        String localVarPath = "/fleet/hos_logs";

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
    private okhttp3.Call getFleetHosLogsValidateBeforeCall(String accessToken, InlineObject8 hosLogsParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getFleetHosLogs(Async)");
        }
        
        // verify the required parameter 'hosLogsParam' is set
        if (hosLogsParam == null) {
            throw new ApiException("Missing the required parameter 'hosLogsParam' when calling getFleetHosLogs(Async)");
        }
        

        okhttp3.Call localVarCall = getFleetHosLogsCall(accessToken, hosLogsParam, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/hos_logs
     * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
     * @param accessToken Samsara API access token. (required)
     * @param hosLogsParam  (required)
     * @return HosLogsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HosLogsResponse getFleetHosLogs(String accessToken, InlineObject8 hosLogsParam) throws ApiException {
        ApiResponse<HosLogsResponse> localVarResp = getFleetHosLogsWithHttpInfo(accessToken, hosLogsParam);
        return localVarResp.getData();
    }

    /**
     * /fleet/hos_logs
     * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
     * @param accessToken Samsara API access token. (required)
     * @param hosLogsParam  (required)
     * @return ApiResponse&lt;HosLogsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HosLogsResponse> getFleetHosLogsWithHttpInfo(String accessToken, InlineObject8 hosLogsParam) throws ApiException {
        okhttp3.Call localVarCall = getFleetHosLogsValidateBeforeCall(accessToken, hosLogsParam, null, null);
        Type localVarReturnType = new TypeToken<HosLogsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/hos_logs (asynchronously)
     * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
     * @param accessToken Samsara API access token. (required)
     * @param hosLogsParam  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getFleetHosLogsAsync(String accessToken, InlineObject8 hosLogsParam, final ApiCallback<HosLogsResponse> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getFleetHosLogsValidateBeforeCall(accessToken, hosLogsParam, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<HosLogsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFleetHosLogsSummary
     * @param accessToken Samsara API access token. (required)
     * @param hosLogsParam  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getFleetHosLogsSummaryCall(String accessToken, InlineObject9 hosLogsParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = hosLogsParam;

        // create path and map variables
        String localVarPath = "/fleet/hos_logs_summary";

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
    private okhttp3.Call getFleetHosLogsSummaryValidateBeforeCall(String accessToken, InlineObject9 hosLogsParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getFleetHosLogsSummary(Async)");
        }
        
        // verify the required parameter 'hosLogsParam' is set
        if (hosLogsParam == null) {
            throw new ApiException("Missing the required parameter 'hosLogsParam' when calling getFleetHosLogsSummary(Async)");
        }
        

        okhttp3.Call localVarCall = getFleetHosLogsSummaryCall(accessToken, hosLogsParam, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/hos_logs_summary
     * Get the current HOS status for all drivers in the group.
     * @param accessToken Samsara API access token. (required)
     * @param hosLogsParam  (required)
     * @return HosLogsSummaryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HosLogsSummaryResponse getFleetHosLogsSummary(String accessToken, InlineObject9 hosLogsParam) throws ApiException {
        ApiResponse<HosLogsSummaryResponse> localVarResp = getFleetHosLogsSummaryWithHttpInfo(accessToken, hosLogsParam);
        return localVarResp.getData();
    }

    /**
     * /fleet/hos_logs_summary
     * Get the current HOS status for all drivers in the group.
     * @param accessToken Samsara API access token. (required)
     * @param hosLogsParam  (required)
     * @return ApiResponse&lt;HosLogsSummaryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HosLogsSummaryResponse> getFleetHosLogsSummaryWithHttpInfo(String accessToken, InlineObject9 hosLogsParam) throws ApiException {
        okhttp3.Call localVarCall = getFleetHosLogsSummaryValidateBeforeCall(accessToken, hosLogsParam, null, null);
        Type localVarReturnType = new TypeToken<HosLogsSummaryResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/hos_logs_summary (asynchronously)
     * Get the current HOS status for all drivers in the group.
     * @param accessToken Samsara API access token. (required)
     * @param hosLogsParam  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getFleetHosLogsSummaryAsync(String accessToken, InlineObject9 hosLogsParam, final ApiCallback<HosLogsSummaryResponse> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getFleetHosLogsSummaryValidateBeforeCall(accessToken, hosLogsParam, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<HosLogsSummaryResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFleetLocations
     * @param accessToken Samsara API access token. (required)
     * @param groupParam  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getFleetLocationsCall(String accessToken, InlineObject11 groupParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = groupParam;

        // create path and map variables
        String localVarPath = "/fleet/locations";

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
    private okhttp3.Call getFleetLocationsValidateBeforeCall(String accessToken, InlineObject11 groupParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getFleetLocations(Async)");
        }
        
        // verify the required parameter 'groupParam' is set
        if (groupParam == null) {
            throw new ApiException("Missing the required parameter 'groupParam' when calling getFleetLocations(Async)");
        }
        

        okhttp3.Call localVarCall = getFleetLocationsCall(accessToken, groupParam, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/locations
     * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam  (required)
     * @return InlineResponse2003
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2003 getFleetLocations(String accessToken, InlineObject11 groupParam) throws ApiException {
        ApiResponse<InlineResponse2003> localVarResp = getFleetLocationsWithHttpInfo(accessToken, groupParam);
        return localVarResp.getData();
    }

    /**
     * /fleet/locations
     * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam  (required)
     * @return ApiResponse&lt;InlineResponse2003&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2003> getFleetLocationsWithHttpInfo(String accessToken, InlineObject11 groupParam) throws ApiException {
        okhttp3.Call localVarCall = getFleetLocationsValidateBeforeCall(accessToken, groupParam, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2003>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/locations (asynchronously)
     * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getFleetLocationsAsync(String accessToken, InlineObject11 groupParam, final ApiCallback<InlineResponse2003> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getFleetLocationsValidateBeforeCall(accessToken, groupParam, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2003>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFleetMaintenanceList
     * @param accessToken Samsara API access token. (required)
     * @param groupParam  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getFleetMaintenanceListCall(String accessToken, InlineObject13 groupParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = groupParam;

        // create path and map variables
        String localVarPath = "/fleet/maintenance/list";

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
    private okhttp3.Call getFleetMaintenanceListValidateBeforeCall(String accessToken, InlineObject13 groupParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getFleetMaintenanceList(Async)");
        }
        
        // verify the required parameter 'groupParam' is set
        if (groupParam == null) {
            throw new ApiException("Missing the required parameter 'groupParam' when calling getFleetMaintenanceList(Async)");
        }
        

        okhttp3.Call localVarCall = getFleetMaintenanceListCall(accessToken, groupParam, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/maintenance/list
     * Get list of the vehicles with any engine faults or check light data.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam  (required)
     * @return InlineResponse2004
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2004 getFleetMaintenanceList(String accessToken, InlineObject13 groupParam) throws ApiException {
        ApiResponse<InlineResponse2004> localVarResp = getFleetMaintenanceListWithHttpInfo(accessToken, groupParam);
        return localVarResp.getData();
    }

    /**
     * /fleet/maintenance/list
     * Get list of the vehicles with any engine faults or check light data.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam  (required)
     * @return ApiResponse&lt;InlineResponse2004&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2004> getFleetMaintenanceListWithHttpInfo(String accessToken, InlineObject13 groupParam) throws ApiException {
        okhttp3.Call localVarCall = getFleetMaintenanceListValidateBeforeCall(accessToken, groupParam, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2004>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/maintenance/list (asynchronously)
     * Get list of the vehicles with any engine faults or check light data.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getFleetMaintenanceListAsync(String accessToken, InlineObject13 groupParam, final ApiCallback<InlineResponse2004> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getFleetMaintenanceListValidateBeforeCall(accessToken, groupParam, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2004>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFleetTrips
     * @param accessToken Samsara API access token. (required)
     * @param tripsParam  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getFleetTripsCall(String accessToken, InlineObject15 tripsParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = tripsParam;

        // create path and map variables
        String localVarPath = "/fleet/trips";

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
    private okhttp3.Call getFleetTripsValidateBeforeCall(String accessToken, InlineObject15 tripsParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getFleetTrips(Async)");
        }
        
        // verify the required parameter 'tripsParam' is set
        if (tripsParam == null) {
            throw new ApiException("Missing the required parameter 'tripsParam' when calling getFleetTrips(Async)");
        }
        

        okhttp3.Call localVarCall = getFleetTripsCall(accessToken, tripsParam, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/trips
     * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
     * @param accessToken Samsara API access token. (required)
     * @param tripsParam  (required)
     * @return TripResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TripResponse getFleetTrips(String accessToken, InlineObject15 tripsParam) throws ApiException {
        ApiResponse<TripResponse> localVarResp = getFleetTripsWithHttpInfo(accessToken, tripsParam);
        return localVarResp.getData();
    }

    /**
     * /fleet/trips
     * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
     * @param accessToken Samsara API access token. (required)
     * @param tripsParam  (required)
     * @return ApiResponse&lt;TripResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TripResponse> getFleetTripsWithHttpInfo(String accessToken, InlineObject15 tripsParam) throws ApiException {
        okhttp3.Call localVarCall = getFleetTripsValidateBeforeCall(accessToken, tripsParam, null, null);
        Type localVarReturnType = new TypeToken<TripResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/trips (asynchronously)
     * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
     * @param accessToken Samsara API access token. (required)
     * @param tripsParam  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getFleetTripsAsync(String accessToken, InlineObject15 tripsParam, final ApiCallback<TripResponse> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getFleetTripsValidateBeforeCall(accessToken, tripsParam, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<TripResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFleetVehicle
     * @param accessToken Samsara API access token. (required)
     * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getFleetVehicleCall(String accessToken, String vehicleIdOrExternalId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/vehicles/{vehicle_id_or_external_id}"
            .replaceAll("\\{" + "vehicle_id_or_external_id" + "\\}", localVarApiClient.escapeString(vehicleIdOrExternalId.toString()));

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
    private okhttp3.Call getFleetVehicleValidateBeforeCall(String accessToken, String vehicleIdOrExternalId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getFleetVehicle(Async)");
        }
        
        // verify the required parameter 'vehicleIdOrExternalId' is set
        if (vehicleIdOrExternalId == null) {
            throw new ApiException("Missing the required parameter 'vehicleIdOrExternalId' when calling getFleetVehicle(Async)");
        }
        

        okhttp3.Call localVarCall = getFleetVehicleCall(accessToken, vehicleIdOrExternalId, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Gets a specific vehicle.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     * @return FleetVehicleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FleetVehicleResponse getFleetVehicle(String accessToken, String vehicleIdOrExternalId) throws ApiException {
        ApiResponse<FleetVehicleResponse> localVarResp = getFleetVehicleWithHttpInfo(accessToken, vehicleIdOrExternalId);
        return localVarResp.getData();
    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Gets a specific vehicle.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     * @return ApiResponse&lt;FleetVehicleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FleetVehicleResponse> getFleetVehicleWithHttpInfo(String accessToken, String vehicleIdOrExternalId) throws ApiException {
        okhttp3.Call localVarCall = getFleetVehicleValidateBeforeCall(accessToken, vehicleIdOrExternalId, null, null);
        Type localVarReturnType = new TypeToken<FleetVehicleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+} (asynchronously)
     * Gets a specific vehicle.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getFleetVehicleAsync(String accessToken, String vehicleIdOrExternalId, final ApiCallback<FleetVehicleResponse> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getFleetVehicleValidateBeforeCall(accessToken, vehicleIdOrExternalId, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<FleetVehicleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getOrganizationAddress
     * @param accessToken Samsara API access token. (required)
     * @param addressId ID of the address/geofence (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getOrganizationAddressCall(String accessToken, Long addressId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/addresses/{addressId}"
            .replaceAll("\\{" + "addressId" + "\\}", localVarApiClient.escapeString(addressId.toString()));

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
    private okhttp3.Call getOrganizationAddressValidateBeforeCall(String accessToken, Long addressId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getOrganizationAddress(Async)");
        }
        
        // verify the required parameter 'addressId' is set
        if (addressId == null) {
            throw new ApiException("Missing the required parameter 'addressId' when calling getOrganizationAddress(Async)");
        }
        

        okhttp3.Call localVarCall = getOrganizationAddressCall(accessToken, addressId, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /addresses/{addressId}
     * Fetch an address by its id.
     * @param accessToken Samsara API access token. (required)
     * @param addressId ID of the address/geofence (required)
     * @return Address
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Address getOrganizationAddress(String accessToken, Long addressId) throws ApiException {
        ApiResponse<Address> localVarResp = getOrganizationAddressWithHttpInfo(accessToken, addressId);
        return localVarResp.getData();
    }

    /**
     * /addresses/{addressId}
     * Fetch an address by its id.
     * @param accessToken Samsara API access token. (required)
     * @param addressId ID of the address/geofence (required)
     * @return ApiResponse&lt;Address&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Address> getOrganizationAddressWithHttpInfo(String accessToken, Long addressId) throws ApiException {
        okhttp3.Call localVarCall = getOrganizationAddressValidateBeforeCall(accessToken, addressId, null, null);
        Type localVarReturnType = new TypeToken<Address>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /addresses/{addressId} (asynchronously)
     * Fetch an address by its id.
     * @param accessToken Samsara API access token. (required)
     * @param addressId ID of the address/geofence (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getOrganizationAddressAsync(String accessToken, Long addressId, final ApiCallback<Address> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getOrganizationAddressValidateBeforeCall(accessToken, addressId, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<Address>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getOrganizationAddresses
     * @param accessToken Samsara API access token. (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getOrganizationAddressesCall(String accessToken, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/addresses";

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
    private okhttp3.Call getOrganizationAddressesValidateBeforeCall(String accessToken, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getOrganizationAddresses(Async)");
        }
        

        okhttp3.Call localVarCall = getOrganizationAddressesCall(accessToken, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /addresses
     * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
     * @param accessToken Samsara API access token. (required)
     * @return List&lt;Address&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Address> getOrganizationAddresses(String accessToken) throws ApiException {
        ApiResponse<List<Address>> localVarResp = getOrganizationAddressesWithHttpInfo(accessToken);
        return localVarResp.getData();
    }

    /**
     * /addresses
     * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
     * @param accessToken Samsara API access token. (required)
     * @return ApiResponse&lt;List&lt;Address&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Address>> getOrganizationAddressesWithHttpInfo(String accessToken) throws ApiException {
        okhttp3.Call localVarCall = getOrganizationAddressesValidateBeforeCall(accessToken, null, null);
        Type localVarReturnType = new TypeToken<List<Address>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /addresses (asynchronously)
     * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
     * @param accessToken Samsara API access token. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getOrganizationAddressesAsync(String accessToken, final ApiCallback<List<Address>> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getOrganizationAddressesValidateBeforeCall(accessToken, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Address>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getOrganizationContact
     * @param accessToken Samsara API access token. (required)
     * @param contactId ID of the contact (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getOrganizationContactCall(String accessToken, Long contactId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/contacts/{contact_id}"
            .replaceAll("\\{" + "contact_id" + "\\}", localVarApiClient.escapeString(contactId.toString()));

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
    private okhttp3.Call getOrganizationContactValidateBeforeCall(String accessToken, Long contactId, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getOrganizationContact(Async)");
        }
        
        // verify the required parameter 'contactId' is set
        if (contactId == null) {
            throw new ApiException("Missing the required parameter 'contactId' when calling getOrganizationContact(Async)");
        }
        

        okhttp3.Call localVarCall = getOrganizationContactCall(accessToken, contactId, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /contacts/{contact_id}
     * Fetch a contact by its id.
     * @param accessToken Samsara API access token. (required)
     * @param contactId ID of the contact (required)
     * @return Contact
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Contact getOrganizationContact(String accessToken, Long contactId) throws ApiException {
        ApiResponse<Contact> localVarResp = getOrganizationContactWithHttpInfo(accessToken, contactId);
        return localVarResp.getData();
    }

    /**
     * /contacts/{contact_id}
     * Fetch a contact by its id.
     * @param accessToken Samsara API access token. (required)
     * @param contactId ID of the contact (required)
     * @return ApiResponse&lt;Contact&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Contact> getOrganizationContactWithHttpInfo(String accessToken, Long contactId) throws ApiException {
        okhttp3.Call localVarCall = getOrganizationContactValidateBeforeCall(accessToken, contactId, null, null);
        Type localVarReturnType = new TypeToken<Contact>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /contacts/{contact_id} (asynchronously)
     * Fetch a contact by its id.
     * @param accessToken Samsara API access token. (required)
     * @param contactId ID of the contact (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getOrganizationContactAsync(String accessToken, Long contactId, final ApiCallback<Contact> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getOrganizationContactValidateBeforeCall(accessToken, contactId, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<Contact>(){}.getType();
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
     * Build call for getVehicleLocations
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) (required)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getVehicleLocationsCall(String accessToken, Long vehicleId, Long startMs, Long endMs, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/vehicles/{vehicle_id}/locations"
            .replaceAll("\\{" + "vehicle_id" + "\\}", localVarApiClient.escapeString(vehicleId.toString()));

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
    private okhttp3.Call getVehicleLocationsValidateBeforeCall(String accessToken, Long vehicleId, Long startMs, Long endMs, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getVehicleLocations(Async)");
        }
        
        // verify the required parameter 'vehicleId' is set
        if (vehicleId == null) {
            throw new ApiException("Missing the required parameter 'vehicleId' when calling getVehicleLocations(Async)");
        }
        
        // verify the required parameter 'startMs' is set
        if (startMs == null) {
            throw new ApiException("Missing the required parameter 'startMs' when calling getVehicleLocations(Async)");
        }
        
        // verify the required parameter 'endMs' is set
        if (endMs == null) {
            throw new ApiException("Missing the required parameter 'endMs' when calling getVehicleLocations(Async)");
        }
        

        okhttp3.Call localVarCall = getVehicleLocationsCall(accessToken, vehicleId, startMs, endMs, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) (required)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) (required)
     * @return List&lt;FleetVehicleLocation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<FleetVehicleLocation> getVehicleLocations(String accessToken, Long vehicleId, Long startMs, Long endMs) throws ApiException {
        ApiResponse<List<FleetVehicleLocation>> localVarResp = getVehicleLocationsWithHttpInfo(accessToken, vehicleId, startMs, endMs);
        return localVarResp.getData();
    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) (required)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) (required)
     * @return ApiResponse&lt;List&lt;FleetVehicleLocation&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<FleetVehicleLocation>> getVehicleLocationsWithHttpInfo(String accessToken, Long vehicleId, Long startMs, Long endMs) throws ApiException {
        okhttp3.Call localVarCall = getVehicleLocationsValidateBeforeCall(accessToken, vehicleId, startMs, endMs, null, null);
        Type localVarReturnType = new TypeToken<List<FleetVehicleLocation>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations (asynchronously)
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) (required)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getVehicleLocationsAsync(String accessToken, Long vehicleId, Long startMs, Long endMs, final ApiCallback<List<FleetVehicleLocation>> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getVehicleLocationsValidateBeforeCall(accessToken, vehicleId, startMs, endMs, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<List<FleetVehicleLocation>>(){}.getType();
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
    /**
     * Build call for getVehicleStats
     * @param accessToken Samsara API access token. (required)
     * @param startMs Time in Unix epoch milliseconds for the start of the query. (required)
     * @param endMs Time in Unix epoch milliseconds for the end of the query. (required)
     * @param series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional)
     * @param tagIds Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional)
     * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
     * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
     * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getVehicleStatsCall(String accessToken, Integer startMs, Integer endMs, String series, String tagIds, String startingAfter, String endingBefore, Long limit, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/vehicles/stats";

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

        if (series != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("series", series));
        }

        if (tagIds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tagIds", tagIds));
        }

        if (startingAfter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startingAfter", startingAfter));
        }

        if (endingBefore != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("endingBefore", endingBefore));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
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
    private okhttp3.Call getVehicleStatsValidateBeforeCall(String accessToken, Integer startMs, Integer endMs, String series, String tagIds, String startingAfter, String endingBefore, Long limit, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getVehicleStats(Async)");
        }
        
        // verify the required parameter 'startMs' is set
        if (startMs == null) {
            throw new ApiException("Missing the required parameter 'startMs' when calling getVehicleStats(Async)");
        }
        
        // verify the required parameter 'endMs' is set
        if (endMs == null) {
            throw new ApiException("Missing the required parameter 'endMs' when calling getVehicleStats(Async)");
        }
        

        okhttp3.Call localVarCall = getVehicleStatsCall(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/vehicles/stats
     * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
     * @param accessToken Samsara API access token. (required)
     * @param startMs Time in Unix epoch milliseconds for the start of the query. (required)
     * @param endMs Time in Unix epoch milliseconds for the end of the query. (required)
     * @param series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional)
     * @param tagIds Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional)
     * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
     * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
     * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
     * @return InlineResponse2005
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2005 getVehicleStats(String accessToken, Integer startMs, Integer endMs, String series, String tagIds, String startingAfter, String endingBefore, Long limit) throws ApiException {
        ApiResponse<InlineResponse2005> localVarResp = getVehicleStatsWithHttpInfo(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit);
        return localVarResp.getData();
    }

    /**
     * /fleet/vehicles/stats
     * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
     * @param accessToken Samsara API access token. (required)
     * @param startMs Time in Unix epoch milliseconds for the start of the query. (required)
     * @param endMs Time in Unix epoch milliseconds for the end of the query. (required)
     * @param series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional)
     * @param tagIds Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional)
     * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
     * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
     * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
     * @return ApiResponse&lt;InlineResponse2005&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2005> getVehicleStatsWithHttpInfo(String accessToken, Integer startMs, Integer endMs, String series, String tagIds, String startingAfter, String endingBefore, Long limit) throws ApiException {
        okhttp3.Call localVarCall = getVehicleStatsValidateBeforeCall(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2005>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/vehicles/stats (asynchronously)
     * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
     * @param accessToken Samsara API access token. (required)
     * @param startMs Time in Unix epoch milliseconds for the start of the query. (required)
     * @param endMs Time in Unix epoch milliseconds for the end of the query. (required)
     * @param series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional)
     * @param tagIds Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional)
     * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
     * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
     * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getVehicleStatsAsync(String accessToken, Integer startMs, Integer endMs, String series, String tagIds, String startingAfter, String endingBefore, Long limit, final ApiCallback<InlineResponse2005> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getVehicleStatsValidateBeforeCall(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2005>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVehiclesLocations
     * @param accessToken Samsara API access token. (required)
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) (required)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getVehiclesLocationsCall(String accessToken, Integer startMs, Integer endMs, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/fleet/vehicles/locations";

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
    private okhttp3.Call getVehiclesLocationsValidateBeforeCall(String accessToken, Integer startMs, Integer endMs, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getVehiclesLocations(Async)");
        }
        
        // verify the required parameter 'startMs' is set
        if (startMs == null) {
            throw new ApiException("Missing the required parameter 'startMs' when calling getVehiclesLocations(Async)");
        }
        
        // verify the required parameter 'endMs' is set
        if (endMs == null) {
            throw new ApiException("Missing the required parameter 'endMs' when calling getVehiclesLocations(Async)");
        }
        

        okhttp3.Call localVarCall = getVehiclesLocationsCall(accessToken, startMs, endMs, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/vehicles/locations
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
     * @param accessToken Samsara API access token. (required)
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) (required)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) (required)
     * @return List&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Object> getVehiclesLocations(String accessToken, Integer startMs, Integer endMs) throws ApiException {
        ApiResponse<List<Object>> localVarResp = getVehiclesLocationsWithHttpInfo(accessToken, startMs, endMs);
        return localVarResp.getData();
    }

    /**
     * /fleet/vehicles/locations
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
     * @param accessToken Samsara API access token. (required)
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) (required)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) (required)
     * @return ApiResponse&lt;List&lt;Object&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Object>> getVehiclesLocationsWithHttpInfo(String accessToken, Integer startMs, Integer endMs) throws ApiException {
        okhttp3.Call localVarCall = getVehiclesLocationsValidateBeforeCall(accessToken, startMs, endMs, null, null);
        Type localVarReturnType = new TypeToken<List<Object>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/vehicles/locations (asynchronously)
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
     * @param accessToken Samsara API access token. (required)
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) (required)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getVehiclesLocationsAsync(String accessToken, Integer startMs, Integer endMs, final ApiCallback<List<Object>> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = getVehiclesLocationsValidateBeforeCall(accessToken, startMs, endMs, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Object>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listContacts
     * @param accessToken Samsara API access token. (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call listContactsCall(String accessToken, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/contacts";

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
    private okhttp3.Call listContactsValidateBeforeCall(String accessToken, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling listContacts(Async)");
        }
        

        okhttp3.Call localVarCall = listContactsCall(accessToken, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /contacts
     * Fetch all contacts for the organization.
     * @param accessToken Samsara API access token. (required)
     * @return List&lt;Contact&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Contact> listContacts(String accessToken) throws ApiException {
        ApiResponse<List<Contact>> localVarResp = listContactsWithHttpInfo(accessToken);
        return localVarResp.getData();
    }

    /**
     * /contacts
     * Fetch all contacts for the organization.
     * @param accessToken Samsara API access token. (required)
     * @return ApiResponse&lt;List&lt;Contact&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Contact>> listContactsWithHttpInfo(String accessToken) throws ApiException {
        okhttp3.Call localVarCall = listContactsValidateBeforeCall(accessToken, null, null);
        Type localVarReturnType = new TypeToken<List<Contact>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /contacts (asynchronously)
     * Fetch all contacts for the organization.
     * @param accessToken Samsara API access token. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call listContactsAsync(String accessToken, final ApiCallback<List<Contact>> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = listContactsValidateBeforeCall(accessToken, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Contact>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listFleet
     * @param accessToken Samsara API access token. (required)
     * @param groupParam  (required)
     * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
     * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
     * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call listFleetCall(String accessToken, InlineObject10 groupParam, String startingAfter, String endingBefore, Long limit, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = groupParam;

        // create path and map variables
        String localVarPath = "/fleet/list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("access_token", accessToken));
        }

        if (startingAfter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startingAfter", startingAfter));
        }

        if (endingBefore != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("endingBefore", endingBefore));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
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
    private okhttp3.Call listFleetValidateBeforeCall(String accessToken, InlineObject10 groupParam, String startingAfter, String endingBefore, Long limit, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling listFleet(Async)");
        }
        
        // verify the required parameter 'groupParam' is set
        if (groupParam == null) {
            throw new ApiException("Missing the required parameter 'groupParam' when calling listFleet(Async)");
        }
        

        okhttp3.Call localVarCall = listFleetCall(accessToken, groupParam, startingAfter, endingBefore, limit, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/list
     * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam  (required)
     * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
     * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
     * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
     * @return InlineResponse2002
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2002 listFleet(String accessToken, InlineObject10 groupParam, String startingAfter, String endingBefore, Long limit) throws ApiException {
        ApiResponse<InlineResponse2002> localVarResp = listFleetWithHttpInfo(accessToken, groupParam, startingAfter, endingBefore, limit);
        return localVarResp.getData();
    }

    /**
     * /fleet/list
     * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam  (required)
     * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
     * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
     * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
     * @return ApiResponse&lt;InlineResponse2002&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2002> listFleetWithHttpInfo(String accessToken, InlineObject10 groupParam, String startingAfter, String endingBefore, Long limit) throws ApiException {
        okhttp3.Call localVarCall = listFleetValidateBeforeCall(accessToken, groupParam, startingAfter, endingBefore, limit, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/list (asynchronously)
     * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam  (required)
     * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
     * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
     * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call listFleetAsync(String accessToken, InlineObject10 groupParam, String startingAfter, String endingBefore, Long limit, final ApiCallback<InlineResponse2002> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = listFleetValidateBeforeCall(accessToken, groupParam, startingAfter, endingBefore, limit, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for patchFleetVehicle
     * @param accessToken Samsara API access token. (required)
     * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     * @param data  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call patchFleetVehicleCall(String accessToken, String vehicleIdOrExternalId, InlineObject16 data, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = data;

        // create path and map variables
        String localVarPath = "/fleet/vehicles/{vehicle_id_or_external_id}"
            .replaceAll("\\{" + "vehicle_id_or_external_id" + "\\}", localVarApiClient.escapeString(vehicleIdOrExternalId.toString()));

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
            "application/json", "application/merge-patch+json"
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
    private okhttp3.Call patchFleetVehicleValidateBeforeCall(String accessToken, String vehicleIdOrExternalId, InlineObject16 data, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling patchFleetVehicle(Async)");
        }
        
        // verify the required parameter 'vehicleIdOrExternalId' is set
        if (vehicleIdOrExternalId == null) {
            throw new ApiException("Missing the required parameter 'vehicleIdOrExternalId' when calling patchFleetVehicle(Async)");
        }
        
        // verify the required parameter 'data' is set
        if (data == null) {
            throw new ApiException("Missing the required parameter 'data' when calling patchFleetVehicle(Async)");
        }
        

        okhttp3.Call localVarCall = patchFleetVehicleCall(accessToken, vehicleIdOrExternalId, data, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     * @param data  (required)
     * @return FleetVehicleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FleetVehicleResponse patchFleetVehicle(String accessToken, String vehicleIdOrExternalId, InlineObject16 data) throws ApiException {
        ApiResponse<FleetVehicleResponse> localVarResp = patchFleetVehicleWithHttpInfo(accessToken, vehicleIdOrExternalId, data);
        return localVarResp.getData();
    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     * @param data  (required)
     * @return ApiResponse&lt;FleetVehicleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FleetVehicleResponse> patchFleetVehicleWithHttpInfo(String accessToken, String vehicleIdOrExternalId, InlineObject16 data) throws ApiException {
        okhttp3.Call localVarCall = patchFleetVehicleValidateBeforeCall(accessToken, vehicleIdOrExternalId, data, null, null);
        Type localVarReturnType = new TypeToken<FleetVehicleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+} (asynchronously)
     * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     * @param data  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call patchFleetVehicleAsync(String accessToken, String vehicleIdOrExternalId, InlineObject16 data, final ApiCallback<FleetVehicleResponse> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = patchFleetVehicleValidateBeforeCall(accessToken, vehicleIdOrExternalId, data, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<FleetVehicleResponse>(){}.getType();
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
    /**
     * Build call for updateOrganizationAddress
     * @param accessToken Samsara API access token. (required)
     * @param addressId ID of the address/geofence (required)
     * @param address  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call updateOrganizationAddressCall(String accessToken, Long addressId, InlineObject1 address, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = address;

        // create path and map variables
        String localVarPath = "/addresses/{addressId}"
            .replaceAll("\\{" + "addressId" + "\\}", localVarApiClient.escapeString(addressId.toString()));

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
    private okhttp3.Call updateOrganizationAddressValidateBeforeCall(String accessToken, Long addressId, InlineObject1 address, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling updateOrganizationAddress(Async)");
        }
        
        // verify the required parameter 'addressId' is set
        if (addressId == null) {
            throw new ApiException("Missing the required parameter 'addressId' when calling updateOrganizationAddress(Async)");
        }
        
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new ApiException("Missing the required parameter 'address' when calling updateOrganizationAddress(Async)");
        }
        

        okhttp3.Call localVarCall = updateOrganizationAddressCall(accessToken, addressId, address, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /addresses/{addressId}
     * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
     * @param accessToken Samsara API access token. (required)
     * @param addressId ID of the address/geofence (required)
     * @param address  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateOrganizationAddress(String accessToken, Long addressId, InlineObject1 address) throws ApiException {
        updateOrganizationAddressWithHttpInfo(accessToken, addressId, address);
    }

    /**
     * /addresses/{addressId}
     * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
     * @param accessToken Samsara API access token. (required)
     * @param addressId ID of the address/geofence (required)
     * @param address  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateOrganizationAddressWithHttpInfo(String accessToken, Long addressId, InlineObject1 address) throws ApiException {
        okhttp3.Call localVarCall = updateOrganizationAddressValidateBeforeCall(accessToken, addressId, address, null, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * /addresses/{addressId} (asynchronously)
     * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
     * @param accessToken Samsara API access token. (required)
     * @param addressId ID of the address/geofence (required)
     * @param address  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call updateOrganizationAddressAsync(String accessToken, Long addressId, InlineObject1 address, final ApiCallback<Void> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = updateOrganizationAddressValidateBeforeCall(accessToken, addressId, address, _progressListener, _progressRequestListener);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateVehicles
     * @param accessToken Samsara API access token. (required)
     * @param vehicleUpdateParam  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call updateVehiclesCall(String accessToken, InlineObject14 vehicleUpdateParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = vehicleUpdateParam;

        // create path and map variables
        String localVarPath = "/fleet/set_data";

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
    private okhttp3.Call updateVehiclesValidateBeforeCall(String accessToken, InlineObject14 vehicleUpdateParam, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling updateVehicles(Async)");
        }
        
        // verify the required parameter 'vehicleUpdateParam' is set
        if (vehicleUpdateParam == null) {
            throw new ApiException("Missing the required parameter 'vehicleUpdateParam' when calling updateVehicles(Async)");
        }
        

        okhttp3.Call localVarCall = updateVehiclesCall(accessToken, vehicleUpdateParam, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * /fleet/set_data
     * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleUpdateParam  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateVehicles(String accessToken, InlineObject14 vehicleUpdateParam) throws ApiException {
        updateVehiclesWithHttpInfo(accessToken, vehicleUpdateParam);
    }

    /**
     * /fleet/set_data
     * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleUpdateParam  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateVehiclesWithHttpInfo(String accessToken, InlineObject14 vehicleUpdateParam) throws ApiException {
        okhttp3.Call localVarCall = updateVehiclesValidateBeforeCall(accessToken, vehicleUpdateParam, null, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * /fleet/set_data (asynchronously)
     * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleUpdateParam  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call updateVehiclesAsync(String accessToken, InlineObject14 vehicleUpdateParam, final ApiCallback<Void> _callback) throws ApiException {

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

        okhttp3.Call localVarCall = updateVehiclesValidateBeforeCall(accessToken, vehicleUpdateParam, _progressListener, _progressRequestListener);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
