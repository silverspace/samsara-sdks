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


import io.swagger.client.model.Address;
import io.swagger.client.model.AddressParam;
import io.swagger.client.model.Addresses;
import io.swagger.client.model.AllRouteJobUpdates;
import io.swagger.client.model.AssetLocationResponse;
import io.swagger.client.model.AssetReeferResponse;
import io.swagger.client.model.Contact;
import io.swagger.client.model.CreateDvirParam;
import io.swagger.client.model.CurrentDriver;
import io.swagger.client.model.Data;
import io.swagger.client.model.DispatchRoute;
import io.swagger.client.model.DispatchRouteCreate;
import io.swagger.client.model.DispatchRouteHistory;
import io.swagger.client.model.DispatchRoutes;
import io.swagger.client.model.Document;
import io.swagger.client.model.DocumentCreate;
import io.swagger.client.model.DocumentTypes;
import io.swagger.client.model.Documents;
import io.swagger.client.model.Driver;
import io.swagger.client.model.DriverDailyLogResponse;
import io.swagger.client.model.DriverForCreate;
import io.swagger.client.model.DriverSafetyScoreResponse;
import io.swagger.client.model.DriversResponse;
import io.swagger.client.model.DriversSummaryParam;
import io.swagger.client.model.DriversSummaryResponse;
import io.swagger.client.model.DvirBase;
import io.swagger.client.model.DvirListResponse;
import io.swagger.client.model.FleetVehicleLocations;
import io.swagger.client.model.FleetVehicleResponse;
import io.swagger.client.model.FleetVehiclesLocations;
import io.swagger.client.model.GroupDriversParam;
import io.swagger.client.model.GroupParam;
import io.swagger.client.model.HosAuthenticationLogsParam;
import io.swagger.client.model.HosAuthenticationLogsResponse;
import io.swagger.client.model.HosLogsParam;
import io.swagger.client.model.HosLogsParam1;
import io.swagger.client.model.HosLogsParam2;
import io.swagger.client.model.HosLogsResponse;
import io.swagger.client.model.HosLogsSummaryResponse;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse2004;
import io.swagger.client.model.InlineResponse2005;
import io.swagger.client.model.ReactivateDriverParam;
import io.swagger.client.model.TripResponse;
import io.swagger.client.model.TripsParam;
import io.swagger.client.model.VehicleHarshEventResponse;
import io.swagger.client.model.VehicleSafetyScoreResponse;
import io.swagger.client.model.VehicleUpdateParam;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FleetApi {
    private ApiClient apiClient;

    public FleetApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FleetApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addFleetAddress
     * @param accessToken Samsara API access token. (required)
     * @param addressParam  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addFleetAddressCall(String accessToken, AddressParam addressParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = addressParam;

        // create path and map variables
        String localVarPath = "/fleet/add_address";

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
    private com.squareup.okhttp.Call addFleetAddressValidateBeforeCall(String accessToken, AddressParam addressParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling addFleetAddress(Async)");
        }
        
        // verify the required parameter 'addressParam' is set
        if (addressParam == null) {
            throw new ApiException("Missing the required parameter 'addressParam' when calling addFleetAddress(Async)");
        }
        

        com.squareup.okhttp.Call call = addFleetAddressCall(accessToken, addressParam, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /fleet/add_address
     * This method adds an address book entry to the specified group.
     * @param accessToken Samsara API access token. (required)
     * @param addressParam  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void addFleetAddress(String accessToken, AddressParam addressParam) throws ApiException {
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
    public ApiResponse<Void> addFleetAddressWithHttpInfo(String accessToken, AddressParam addressParam) throws ApiException {
        com.squareup.okhttp.Call call = addFleetAddressValidateBeforeCall(accessToken, addressParam, null, null);
        return apiClient.execute(call);
    }

    /**
     * /fleet/add_address (asynchronously)
     * This method adds an address book entry to the specified group.
     * @param accessToken Samsara API access token. (required)
     * @param addressParam  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addFleetAddressAsync(String accessToken, AddressParam addressParam, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addFleetAddressValidateBeforeCall(accessToken, addressParam, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for addOrganizationAddresses
     * @param accessToken Samsara API access token. (required)
     * @param addresses List of addresses/geofences to add. Geofences can be circular or a polygon.  For each address, only one of &#39;circle&#39; or &#39;polygon&#39; should be provided. If both are provided, the geofence will be saved as a polygon. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addOrganizationAddressesCall(String accessToken, Addresses addresses, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = addresses;

        // create path and map variables
        String localVarPath = "/addresses";

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
    private com.squareup.okhttp.Call addOrganizationAddressesValidateBeforeCall(String accessToken, Addresses addresses, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling addOrganizationAddresses(Async)");
        }
        
        // verify the required parameter 'addresses' is set
        if (addresses == null) {
            throw new ApiException("Missing the required parameter 'addresses' when calling addOrganizationAddresses(Async)");
        }
        

        com.squareup.okhttp.Call call = addOrganizationAddressesCall(accessToken, addresses, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /addresses
     * Add one or more addresses to the organization
     * @param accessToken Samsara API access token. (required)
     * @param addresses List of addresses/geofences to add. Geofences can be circular or a polygon.  For each address, only one of &#39;circle&#39; or &#39;polygon&#39; should be provided. If both are provided, the geofence will be saved as a polygon. (required)
     * @return List&lt;Address&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Address> addOrganizationAddresses(String accessToken, Addresses addresses) throws ApiException {
        ApiResponse<List<Address>> resp = addOrganizationAddressesWithHttpInfo(accessToken, addresses);
        return resp.getData();
    }

    /**
     * /addresses
     * Add one or more addresses to the organization
     * @param accessToken Samsara API access token. (required)
     * @param addresses List of addresses/geofences to add. Geofences can be circular or a polygon.  For each address, only one of &#39;circle&#39; or &#39;polygon&#39; should be provided. If both are provided, the geofence will be saved as a polygon. (required)
     * @return ApiResponse&lt;List&lt;Address&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Address>> addOrganizationAddressesWithHttpInfo(String accessToken, Addresses addresses) throws ApiException {
        com.squareup.okhttp.Call call = addOrganizationAddressesValidateBeforeCall(accessToken, addresses, null, null);
        Type localVarReturnType = new TypeToken<List<Address>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /addresses (asynchronously)
     * Add one or more addresses to the organization
     * @param accessToken Samsara API access token. (required)
     * @param addresses List of addresses/geofences to add. Geofences can be circular or a polygon.  For each address, only one of &#39;circle&#39; or &#39;polygon&#39; should be provided. If both are provided, the geofence will be saved as a polygon. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addOrganizationAddressesAsync(String accessToken, Addresses addresses, final ApiCallback<List<Address>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addOrganizationAddressesValidateBeforeCall(accessToken, addresses, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Address>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createDispatchRoute
     * @param accessToken Samsara API access token. (required)
     * @param createDispatchRouteParams  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createDispatchRouteCall(String accessToken, DispatchRouteCreate createDispatchRouteParams, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createDispatchRouteParams;

        // create path and map variables
        String localVarPath = "/fleet/dispatch/routes";

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
    private com.squareup.okhttp.Call createDispatchRouteValidateBeforeCall(String accessToken, DispatchRouteCreate createDispatchRouteParams, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling createDispatchRoute(Async)");
        }
        
        // verify the required parameter 'createDispatchRouteParams' is set
        if (createDispatchRouteParams == null) {
            throw new ApiException("Missing the required parameter 'createDispatchRouteParams' when calling createDispatchRoute(Async)");
        }
        

        com.squareup.okhttp.Call call = createDispatchRouteCall(accessToken, createDispatchRouteParams, progressListener, progressRequestListener);
        return call;

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
        ApiResponse<DispatchRoute> resp = createDispatchRouteWithHttpInfo(accessToken, createDispatchRouteParams);
        return resp.getData();
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
        com.squareup.okhttp.Call call = createDispatchRouteValidateBeforeCall(accessToken, createDispatchRouteParams, null, null);
        Type localVarReturnType = new TypeToken<DispatchRoute>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/dispatch/routes (asynchronously)
     * Create a new dispatch route.
     * @param accessToken Samsara API access token. (required)
     * @param createDispatchRouteParams  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createDispatchRouteAsync(String accessToken, DispatchRouteCreate createDispatchRouteParams, final ApiCallback<DispatchRoute> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createDispatchRouteValidateBeforeCall(accessToken, createDispatchRouteParams, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DispatchRoute>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createDriver
     * @param accessToken Samsara API access token. (required)
     * @param createDriverParam Driver creation body (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createDriverCall(String accessToken, DriverForCreate createDriverParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createDriverParam;

        // create path and map variables
        String localVarPath = "/fleet/drivers/create";

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
    private com.squareup.okhttp.Call createDriverValidateBeforeCall(String accessToken, DriverForCreate createDriverParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling createDriver(Async)");
        }
        
        // verify the required parameter 'createDriverParam' is set
        if (createDriverParam == null) {
            throw new ApiException("Missing the required parameter 'createDriverParam' when calling createDriver(Async)");
        }
        

        com.squareup.okhttp.Call call = createDriverCall(accessToken, createDriverParam, progressListener, progressRequestListener);
        return call;

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
        ApiResponse<Driver> resp = createDriverWithHttpInfo(accessToken, createDriverParam);
        return resp.getData();
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
        com.squareup.okhttp.Call call = createDriverValidateBeforeCall(accessToken, createDriverParam, null, null);
        Type localVarReturnType = new TypeToken<Driver>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/drivers/create (asynchronously)
     * Create a new driver.
     * @param accessToken Samsara API access token. (required)
     * @param createDriverParam Driver creation body (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createDriverAsync(String accessToken, DriverForCreate createDriverParam, final ApiCallback<Driver> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createDriverValidateBeforeCall(accessToken, createDriverParam, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Driver>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createDriverDispatchRoute
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver with the associated routes. (required)
     * @param createDispatchRouteParams  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createDriverDispatchRouteCall(String accessToken, Long driverId, DispatchRouteCreate createDispatchRouteParams, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createDispatchRouteParams;

        // create path and map variables
        String localVarPath = "/fleet/drivers/{driver_id}/dispatch/routes"
            .replaceAll("\\{" + "driver_id" + "\\}", apiClient.escapeString(driverId.toString()));

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
    private com.squareup.okhttp.Call createDriverDispatchRouteValidateBeforeCall(String accessToken, Long driverId, DispatchRouteCreate createDispatchRouteParams, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        com.squareup.okhttp.Call call = createDriverDispatchRouteCall(accessToken, driverId, createDispatchRouteParams, progressListener, progressRequestListener);
        return call;

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
        ApiResponse<DispatchRoute> resp = createDriverDispatchRouteWithHttpInfo(accessToken, driverId, createDispatchRouteParams);
        return resp.getData();
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
        com.squareup.okhttp.Call call = createDriverDispatchRouteValidateBeforeCall(accessToken, driverId, createDispatchRouteParams, null, null);
        Type localVarReturnType = new TypeToken<DispatchRoute>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes (asynchronously)
     * Create a new dispatch route for the driver with driver_id.
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver with the associated routes. (required)
     * @param createDispatchRouteParams  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createDriverDispatchRouteAsync(String accessToken, Long driverId, DispatchRouteCreate createDispatchRouteParams, final ApiCallback<DispatchRoute> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createDriverDispatchRouteValidateBeforeCall(accessToken, driverId, createDispatchRouteParams, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DispatchRoute>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createDriverDocument
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver for whom the document is created. (required)
     * @param createDocumentParams To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createDriverDocumentCall(String accessToken, Long driverId, DocumentCreate createDocumentParams, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createDocumentParams;

        // create path and map variables
        String localVarPath = "/fleet/drivers/{driver_id}/documents"
            .replaceAll("\\{" + "driver_id" + "\\}", apiClient.escapeString(driverId.toString()));

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
    private com.squareup.okhttp.Call createDriverDocumentValidateBeforeCall(String accessToken, Long driverId, DocumentCreate createDocumentParams, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        com.squareup.okhttp.Call call = createDriverDocumentCall(accessToken, driverId, createDocumentParams, progressListener, progressRequestListener);
        return call;

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
        ApiResponse<Document> resp = createDriverDocumentWithHttpInfo(accessToken, driverId, createDocumentParams);
        return resp.getData();
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
        com.squareup.okhttp.Call call = createDriverDocumentValidateBeforeCall(accessToken, driverId, createDocumentParams, null, null);
        Type localVarReturnType = new TypeToken<Document>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/documents (asynchronously)
     * Create a driver document for the given driver.
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver for whom the document is created. (required)
     * @param createDocumentParams To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createDriverDocumentAsync(String accessToken, Long driverId, DocumentCreate createDocumentParams, final ApiCallback<Document> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createDriverDocumentValidateBeforeCall(accessToken, driverId, createDocumentParams, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Document>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createDvir
     * @param accessToken Samsara API access token. (required)
     * @param createDvirParam DVIR creation body (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createDvirCall(String accessToken, CreateDvirParam createDvirParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createDvirParam;

        // create path and map variables
        String localVarPath = "/fleet/maintenance/dvirs";

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
    private com.squareup.okhttp.Call createDvirValidateBeforeCall(String accessToken, CreateDvirParam createDvirParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling createDvir(Async)");
        }
        
        // verify the required parameter 'createDvirParam' is set
        if (createDvirParam == null) {
            throw new ApiException("Missing the required parameter 'createDvirParam' when calling createDvir(Async)");
        }
        

        com.squareup.okhttp.Call call = createDvirCall(accessToken, createDvirParam, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /fleet/maintenance/dvirs
     * Create a new dvir, marking a vehicle or trailer safe or unsafe.
     * @param accessToken Samsara API access token. (required)
     * @param createDvirParam DVIR creation body (required)
     * @return DvirBase
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DvirBase createDvir(String accessToken, CreateDvirParam createDvirParam) throws ApiException {
        ApiResponse<DvirBase> resp = createDvirWithHttpInfo(accessToken, createDvirParam);
        return resp.getData();
    }

    /**
     * /fleet/maintenance/dvirs
     * Create a new dvir, marking a vehicle or trailer safe or unsafe.
     * @param accessToken Samsara API access token. (required)
     * @param createDvirParam DVIR creation body (required)
     * @return ApiResponse&lt;DvirBase&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DvirBase> createDvirWithHttpInfo(String accessToken, CreateDvirParam createDvirParam) throws ApiException {
        com.squareup.okhttp.Call call = createDvirValidateBeforeCall(accessToken, createDvirParam, null, null);
        Type localVarReturnType = new TypeToken<DvirBase>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/maintenance/dvirs (asynchronously)
     * Create a new dvir, marking a vehicle or trailer safe or unsafe.
     * @param accessToken Samsara API access token. (required)
     * @param createDvirParam DVIR creation body (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createDvirAsync(String accessToken, CreateDvirParam createDvirParam, final ApiCallback<DvirBase> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createDvirValidateBeforeCall(accessToken, createDvirParam, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DvirBase>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createVehicleDispatchRoute
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param createDispatchRouteParams  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createVehicleDispatchRouteCall(String accessToken, Long vehicleId, DispatchRouteCreate createDispatchRouteParams, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createDispatchRouteParams;

        // create path and map variables
        String localVarPath = "/fleet/vehicles/{vehicle_id}/dispatch/routes"
            .replaceAll("\\{" + "vehicle_id" + "\\}", apiClient.escapeString(vehicleId.toString()));

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
    private com.squareup.okhttp.Call createVehicleDispatchRouteValidateBeforeCall(String accessToken, Long vehicleId, DispatchRouteCreate createDispatchRouteParams, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        com.squareup.okhttp.Call call = createVehicleDispatchRouteCall(accessToken, vehicleId, createDispatchRouteParams, progressListener, progressRequestListener);
        return call;

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
        ApiResponse<DispatchRoute> resp = createVehicleDispatchRouteWithHttpInfo(accessToken, vehicleId, createDispatchRouteParams);
        return resp.getData();
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
        com.squareup.okhttp.Call call = createVehicleDispatchRouteValidateBeforeCall(accessToken, vehicleId, createDispatchRouteParams, null, null);
        Type localVarReturnType = new TypeToken<DispatchRoute>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes (asynchronously)
     * Create a new dispatch route for the vehicle with vehicle_id.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param createDispatchRouteParams  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createVehicleDispatchRouteAsync(String accessToken, Long vehicleId, DispatchRouteCreate createDispatchRouteParams, final ApiCallback<DispatchRoute> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createVehicleDispatchRouteValidateBeforeCall(accessToken, vehicleId, createDispatchRouteParams, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DispatchRoute>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deactivateDriver
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deactivateDriverCall(String accessToken, String driverIdOrExternalId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/drivers/{driver_id_or_external_id}"
            .replaceAll("\\{" + "driver_id_or_external_id" + "\\}", apiClient.escapeString(driverIdOrExternalId.toString()));

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
    private com.squareup.okhttp.Call deactivateDriverValidateBeforeCall(String accessToken, String driverIdOrExternalId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling deactivateDriver(Async)");
        }
        
        // verify the required parameter 'driverIdOrExternalId' is set
        if (driverIdOrExternalId == null) {
            throw new ApiException("Missing the required parameter 'driverIdOrExternalId' when calling deactivateDriver(Async)");
        }
        

        com.squareup.okhttp.Call call = deactivateDriverCall(accessToken, driverIdOrExternalId, progressListener, progressRequestListener);
        return call;

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
        com.squareup.okhttp.Call call = deactivateDriverValidateBeforeCall(accessToken, driverIdOrExternalId, null, null);
        return apiClient.execute(call);
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} (asynchronously)
     * Deactivate a driver with the given id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deactivateDriverAsync(String accessToken, String driverIdOrExternalId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deactivateDriverValidateBeforeCall(accessToken, driverIdOrExternalId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteDispatchRouteById
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the dispatch route. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteDispatchRouteByIdCall(String accessToken, Long routeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/dispatch/routes/{route_id}"
            .replaceAll("\\{" + "route_id" + "\\}", apiClient.escapeString(routeId.toString()));

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
    private com.squareup.okhttp.Call deleteDispatchRouteByIdValidateBeforeCall(String accessToken, Long routeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling deleteDispatchRouteById(Async)");
        }
        
        // verify the required parameter 'routeId' is set
        if (routeId == null) {
            throw new ApiException("Missing the required parameter 'routeId' when calling deleteDispatchRouteById(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteDispatchRouteByIdCall(accessToken, routeId, progressListener, progressRequestListener);
        return call;

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
        com.squareup.okhttp.Call call = deleteDispatchRouteByIdValidateBeforeCall(accessToken, routeId, null, null);
        return apiClient.execute(call);
    }

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/ (asynchronously)
     * Delete a dispatch route and its associated jobs.
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the dispatch route. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteDispatchRouteByIdAsync(String accessToken, Long routeId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteDispatchRouteByIdValidateBeforeCall(accessToken, routeId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteOrganizationAddress
     * @param accessToken Samsara API access token. (required)
     * @param addressId ID of the address/geofence (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteOrganizationAddressCall(String accessToken, Long addressId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/addresses/{addressId}"
            .replaceAll("\\{" + "addressId" + "\\}", apiClient.escapeString(addressId.toString()));

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
    private com.squareup.okhttp.Call deleteOrganizationAddressValidateBeforeCall(String accessToken, Long addressId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling deleteOrganizationAddress(Async)");
        }
        
        // verify the required parameter 'addressId' is set
        if (addressId == null) {
            throw new ApiException("Missing the required parameter 'addressId' when calling deleteOrganizationAddress(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteOrganizationAddressCall(accessToken, addressId, progressListener, progressRequestListener);
        return call;

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
        com.squareup.okhttp.Call call = deleteOrganizationAddressValidateBeforeCall(accessToken, addressId, null, null);
        return apiClient.execute(call);
    }

    /**
     * /addresses/{addressId} (asynchronously)
     * Delete an address.
     * @param accessToken Samsara API access token. (required)
     * @param addressId ID of the address/geofence (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteOrganizationAddressAsync(String accessToken, Long addressId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteOrganizationAddressValidateBeforeCall(accessToken, addressId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for fetchAllDispatchRoutes
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call fetchAllDispatchRoutesCall(String accessToken, Long groupId, Long endTime, Long duration, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/dispatch/routes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (groupId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("group_id", groupId));
        if (endTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_time", endTime));
        if (duration != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("duration", duration));

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
    private com.squareup.okhttp.Call fetchAllDispatchRoutesValidateBeforeCall(String accessToken, Long groupId, Long endTime, Long duration, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling fetchAllDispatchRoutes(Async)");
        }
        

        com.squareup.okhttp.Call call = fetchAllDispatchRoutesCall(accessToken, groupId, endTime, duration, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /fleet/dispatch/routes
     * Fetch all of the dispatch routes for the group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @return DispatchRoutes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DispatchRoutes fetchAllDispatchRoutes(String accessToken, Long groupId, Long endTime, Long duration) throws ApiException {
        ApiResponse<DispatchRoutes> resp = fetchAllDispatchRoutesWithHttpInfo(accessToken, groupId, endTime, duration);
        return resp.getData();
    }

    /**
     * /fleet/dispatch/routes
     * Fetch all of the dispatch routes for the group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @return ApiResponse&lt;DispatchRoutes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DispatchRoutes> fetchAllDispatchRoutesWithHttpInfo(String accessToken, Long groupId, Long endTime, Long duration) throws ApiException {
        com.squareup.okhttp.Call call = fetchAllDispatchRoutesValidateBeforeCall(accessToken, groupId, endTime, duration, null, null);
        Type localVarReturnType = new TypeToken<DispatchRoutes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/dispatch/routes (asynchronously)
     * Fetch all of the dispatch routes for the group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call fetchAllDispatchRoutesAsync(String accessToken, Long groupId, Long endTime, Long duration, final ApiCallback<DispatchRoutes> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = fetchAllDispatchRoutesValidateBeforeCall(accessToken, groupId, endTime, duration, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DispatchRoutes>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for fetchAllRouteJobUpdates
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)
     * @param include Optionally set include&#x3D;route to include route object in response payload. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call fetchAllRouteJobUpdatesCall(String accessToken, Long groupId, String sequenceId, String include, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/dispatch/routes/job_updates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (groupId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("group_id", groupId));
        if (sequenceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sequence_id", sequenceId));
        if (include != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("include", include));

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
    private com.squareup.okhttp.Call fetchAllRouteJobUpdatesValidateBeforeCall(String accessToken, Long groupId, String sequenceId, String include, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling fetchAllRouteJobUpdates(Async)");
        }
        

        com.squareup.okhttp.Call call = fetchAllRouteJobUpdatesCall(accessToken, groupId, sequenceId, include, progressListener, progressRequestListener);
        return call;

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
        ApiResponse<AllRouteJobUpdates> resp = fetchAllRouteJobUpdatesWithHttpInfo(accessToken, groupId, sequenceId, include);
        return resp.getData();
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
        com.squareup.okhttp.Call call = fetchAllRouteJobUpdatesValidateBeforeCall(accessToken, groupId, sequenceId, include, null, null);
        Type localVarReturnType = new TypeToken<AllRouteJobUpdates>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/dispatch/routes/job_updates (asynchronously)
     * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)
     * @param include Optionally set include&#x3D;route to include route object in response payload. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call fetchAllRouteJobUpdatesAsync(String accessToken, Long groupId, String sequenceId, String include, final ApiCallback<AllRouteJobUpdates> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = fetchAllRouteJobUpdatesValidateBeforeCall(accessToken, groupId, sequenceId, include, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AllRouteJobUpdates>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllAssetCurrentLocations
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllAssetCurrentLocationsCall(String accessToken, Long groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/assets/locations";

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
    private com.squareup.okhttp.Call getAllAssetCurrentLocationsValidateBeforeCall(String accessToken, Long groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getAllAssetCurrentLocations(Async)");
        }
        

        com.squareup.okhttp.Call call = getAllAssetCurrentLocationsCall(accessToken, groupId, progressListener, progressRequestListener);
        return call;

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
        ApiResponse<InlineResponse2001> resp = getAllAssetCurrentLocationsWithHttpInfo(accessToken, groupId);
        return resp.getData();
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
        com.squareup.okhttp.Call call = getAllAssetCurrentLocationsValidateBeforeCall(accessToken, groupId, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/assets/locations (asynchronously)
     * Fetch current locations of all assets for the group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllAssetCurrentLocationsAsync(String accessToken, Long groupId, final ApiCallback<InlineResponse2001> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllAssetCurrentLocationsValidateBeforeCall(accessToken, groupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllAssets
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllAssetsCall(String accessToken, Long groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/assets";

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
    private com.squareup.okhttp.Call getAllAssetsValidateBeforeCall(String accessToken, Long groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getAllAssets(Async)");
        }
        

        com.squareup.okhttp.Call call = getAllAssetsCall(accessToken, groupId, progressListener, progressRequestListener);
        return call;

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
        ApiResponse<InlineResponse200> resp = getAllAssetsWithHttpInfo(accessToken, groupId);
        return resp.getData();
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
        com.squareup.okhttp.Call call = getAllAssetsValidateBeforeCall(accessToken, groupId, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/assets (asynchronously)
     * Fetch all of the assets for the group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllAssetsAsync(String accessToken, Long groupId, final ApiCallback<InlineResponse200> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllAssetsValidateBeforeCall(accessToken, groupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllDeactivatedDrivers
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllDeactivatedDriversCall(String accessToken, Long groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/drivers/inactive";

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
    private com.squareup.okhttp.Call getAllDeactivatedDriversValidateBeforeCall(String accessToken, Long groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getAllDeactivatedDrivers(Async)");
        }
        

        com.squareup.okhttp.Call call = getAllDeactivatedDriversCall(accessToken, groupId, progressListener, progressRequestListener);
        return call;

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
        ApiResponse<List<Driver>> resp = getAllDeactivatedDriversWithHttpInfo(accessToken, groupId);
        return resp.getData();
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
        com.squareup.okhttp.Call call = getAllDeactivatedDriversValidateBeforeCall(accessToken, groupId, null, null);
        Type localVarReturnType = new TypeToken<List<Driver>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/drivers/inactive (asynchronously)
     * Fetch all deactivated drivers for the group.
     * @param accessToken Samsara API access token. (required)
     * @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllDeactivatedDriversAsync(String accessToken, Long groupId, final ApiCallback<List<Driver>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllDeactivatedDriversValidateBeforeCall(accessToken, groupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Driver>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAssetLocation
     * @param accessToken Samsara API access token. (required)
     * @param assetId ID of the asset (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAssetLocationCall(String accessToken, Long assetId, Long startMs, Long endMs, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/assets/{asset_id}/locations"
            .replaceAll("\\{" + "asset_id" + "\\}", apiClient.escapeString(assetId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (startMs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("startMs", startMs));
        if (endMs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("endMs", endMs));

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
    private com.squareup.okhttp.Call getAssetLocationValidateBeforeCall(String accessToken, Long assetId, Long startMs, Long endMs, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        com.squareup.okhttp.Call call = getAssetLocationCall(accessToken, assetId, startMs, endMs, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /fleet/assets/{assetId:[0-9]+}/locations
     * Fetch the historical locations for the asset.
     * @param accessToken Samsara API access token. (required)
     * @param assetId ID of the asset (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @return AssetLocationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AssetLocationResponse getAssetLocation(String accessToken, Long assetId, Long startMs, Long endMs) throws ApiException {
        ApiResponse<AssetLocationResponse> resp = getAssetLocationWithHttpInfo(accessToken, assetId, startMs, endMs);
        return resp.getData();
    }

    /**
     * /fleet/assets/{assetId:[0-9]+}/locations
     * Fetch the historical locations for the asset.
     * @param accessToken Samsara API access token. (required)
     * @param assetId ID of the asset (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @return ApiResponse&lt;AssetLocationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AssetLocationResponse> getAssetLocationWithHttpInfo(String accessToken, Long assetId, Long startMs, Long endMs) throws ApiException {
        com.squareup.okhttp.Call call = getAssetLocationValidateBeforeCall(accessToken, assetId, startMs, endMs, null, null);
        Type localVarReturnType = new TypeToken<AssetLocationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/assets/{assetId:[0-9]+}/locations (asynchronously)
     * Fetch the historical locations for the asset.
     * @param accessToken Samsara API access token. (required)
     * @param assetId ID of the asset (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAssetLocationAsync(String accessToken, Long assetId, Long startMs, Long endMs, final ApiCallback<AssetLocationResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAssetLocationValidateBeforeCall(accessToken, assetId, startMs, endMs, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AssetLocationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAssetReefer
     * @param accessToken Samsara API access token. (required)
     * @param assetId ID of the asset (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAssetReeferCall(String accessToken, Long assetId, Long startMs, Long endMs, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/assets/{asset_id}/reefer"
            .replaceAll("\\{" + "asset_id" + "\\}", apiClient.escapeString(assetId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (startMs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("startMs", startMs));
        if (endMs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("endMs", endMs));

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
    private com.squareup.okhttp.Call getAssetReeferValidateBeforeCall(String accessToken, Long assetId, Long startMs, Long endMs, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        com.squareup.okhttp.Call call = getAssetReeferCall(accessToken, assetId, startMs, endMs, progressListener, progressRequestListener);
        return call;

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
        ApiResponse<AssetReeferResponse> resp = getAssetReeferWithHttpInfo(accessToken, assetId, startMs, endMs);
        return resp.getData();
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
        com.squareup.okhttp.Call call = getAssetReeferValidateBeforeCall(accessToken, assetId, startMs, endMs, null, null);
        Type localVarReturnType = new TypeToken<AssetReeferResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/assets/{assetId:[0-9]+}/reefer (asynchronously)
     * Fetch the reefer-specific stats of an asset.
     * @param accessToken Samsara API access token. (required)
     * @param assetId ID of the asset (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAssetReeferAsync(String accessToken, Long assetId, Long startMs, Long endMs, final ApiCallback<AssetReeferResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAssetReeferValidateBeforeCall(accessToken, assetId, startMs, endMs, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AssetReeferResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDeactivatedDriverById
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDeactivatedDriverByIdCall(String accessToken, String driverIdOrExternalId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/drivers/inactive/{driver_id_or_external_id}"
            .replaceAll("\\{" + "driver_id_or_external_id" + "\\}", apiClient.escapeString(driverIdOrExternalId.toString()));

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
    private com.squareup.okhttp.Call getDeactivatedDriverByIdValidateBeforeCall(String accessToken, String driverIdOrExternalId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getDeactivatedDriverById(Async)");
        }
        
        // verify the required parameter 'driverIdOrExternalId' is set
        if (driverIdOrExternalId == null) {
            throw new ApiException("Missing the required parameter 'driverIdOrExternalId' when calling getDeactivatedDriverById(Async)");
        }
        

        com.squareup.okhttp.Call call = getDeactivatedDriverByIdCall(accessToken, driverIdOrExternalId, progressListener, progressRequestListener);
        return call;

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
        ApiResponse<Driver> resp = getDeactivatedDriverByIdWithHttpInfo(accessToken, driverIdOrExternalId);
        return resp.getData();
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
        com.squareup.okhttp.Call call = getDeactivatedDriverByIdValidateBeforeCall(accessToken, driverIdOrExternalId, null, null);
        Type localVarReturnType = new TypeToken<Driver>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} (asynchronously)
     * Fetch deactivated driver by id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDeactivatedDriverByIdAsync(String accessToken, String driverIdOrExternalId, final ApiCallback<Driver> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDeactivatedDriverByIdValidateBeforeCall(accessToken, driverIdOrExternalId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Driver>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDispatchRouteById
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the dispatch route. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDispatchRouteByIdCall(String accessToken, Long routeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/dispatch/routes/{route_id}"
            .replaceAll("\\{" + "route_id" + "\\}", apiClient.escapeString(routeId.toString()));

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
    private com.squareup.okhttp.Call getDispatchRouteByIdValidateBeforeCall(String accessToken, Long routeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getDispatchRouteById(Async)");
        }
        
        // verify the required parameter 'routeId' is set
        if (routeId == null) {
            throw new ApiException("Missing the required parameter 'routeId' when calling getDispatchRouteById(Async)");
        }
        

        com.squareup.okhttp.Call call = getDispatchRouteByIdCall(accessToken, routeId, progressListener, progressRequestListener);
        return call;

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
        ApiResponse<DispatchRoute> resp = getDispatchRouteByIdWithHttpInfo(accessToken, routeId);
        return resp.getData();
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
        com.squareup.okhttp.Call call = getDispatchRouteByIdValidateBeforeCall(accessToken, routeId, null, null);
        Type localVarReturnType = new TypeToken<DispatchRoute>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+} (asynchronously)
     * Fetch a dispatch route by id.
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the dispatch route. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDispatchRouteByIdAsync(String accessToken, Long routeId, final ApiCallback<DispatchRoute> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDispatchRouteByIdValidateBeforeCall(accessToken, routeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DispatchRoute>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDispatchRouteHistory
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the route with history. (required)
     * @param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)
     * @param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDispatchRouteHistoryCall(String accessToken, Long routeId, Long startTime, Long endTime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/dispatch/routes/{route_id}/history"
            .replaceAll("\\{" + "route_id" + "\\}", apiClient.escapeString(routeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (startTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_time", startTime));
        if (endTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_time", endTime));

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
    private com.squareup.okhttp.Call getDispatchRouteHistoryValidateBeforeCall(String accessToken, Long routeId, Long startTime, Long endTime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getDispatchRouteHistory(Async)");
        }
        
        // verify the required parameter 'routeId' is set
        if (routeId == null) {
            throw new ApiException("Missing the required parameter 'routeId' when calling getDispatchRouteHistory(Async)");
        }
        

        com.squareup.okhttp.Call call = getDispatchRouteHistoryCall(accessToken, routeId, startTime, endTime, progressListener, progressRequestListener);
        return call;

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
        ApiResponse<DispatchRouteHistory> resp = getDispatchRouteHistoryWithHttpInfo(accessToken, routeId, startTime, endTime);
        return resp.getData();
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
        com.squareup.okhttp.Call call = getDispatchRouteHistoryValidateBeforeCall(accessToken, routeId, startTime, endTime, null, null);
        Type localVarReturnType = new TypeToken<DispatchRouteHistory>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/history (asynchronously)
     * Fetch the history of a dispatch route.
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the route with history. (required)
     * @param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)
     * @param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDispatchRouteHistoryAsync(String accessToken, Long routeId, Long startTime, Long endTime, final ApiCallback<DispatchRouteHistory> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDispatchRouteHistoryValidateBeforeCall(accessToken, routeId, startTime, endTime, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DispatchRouteHistory>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDispatchRoutesByDriverId
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver with the associated routes. (required)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDispatchRoutesByDriverIdCall(String accessToken, Long driverId, Long endTime, Long duration, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/drivers/{driver_id}/dispatch/routes"
            .replaceAll("\\{" + "driver_id" + "\\}", apiClient.escapeString(driverId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (endTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_time", endTime));
        if (duration != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("duration", duration));

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
    private com.squareup.okhttp.Call getDispatchRoutesByDriverIdValidateBeforeCall(String accessToken, Long driverId, Long endTime, Long duration, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getDispatchRoutesByDriverId(Async)");
        }
        
        // verify the required parameter 'driverId' is set
        if (driverId == null) {
            throw new ApiException("Missing the required parameter 'driverId' when calling getDispatchRoutesByDriverId(Async)");
        }
        

        com.squareup.okhttp.Call call = getDispatchRoutesByDriverIdCall(accessToken, driverId, endTime, duration, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * Fetch all of the dispatch routes for a given driver.
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver with the associated routes. (required)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @return DispatchRoutes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DispatchRoutes getDispatchRoutesByDriverId(String accessToken, Long driverId, Long endTime, Long duration) throws ApiException {
        ApiResponse<DispatchRoutes> resp = getDispatchRoutesByDriverIdWithHttpInfo(accessToken, driverId, endTime, duration);
        return resp.getData();
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
     * Fetch all of the dispatch routes for a given driver.
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver with the associated routes. (required)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @return ApiResponse&lt;DispatchRoutes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DispatchRoutes> getDispatchRoutesByDriverIdWithHttpInfo(String accessToken, Long driverId, Long endTime, Long duration) throws ApiException {
        com.squareup.okhttp.Call call = getDispatchRoutesByDriverIdValidateBeforeCall(accessToken, driverId, endTime, duration, null, null);
        Type localVarReturnType = new TypeToken<DispatchRoutes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes (asynchronously)
     * Fetch all of the dispatch routes for a given driver.
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver with the associated routes. (required)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDispatchRoutesByDriverIdAsync(String accessToken, Long driverId, Long endTime, Long duration, final ApiCallback<DispatchRoutes> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDispatchRoutesByDriverIdValidateBeforeCall(accessToken, driverId, endTime, duration, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DispatchRoutes>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDispatchRoutesByVehicleId
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDispatchRoutesByVehicleIdCall(String accessToken, Long vehicleId, Long endTime, Long duration, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/vehicles/{vehicle_id}/dispatch/routes"
            .replaceAll("\\{" + "vehicle_id" + "\\}", apiClient.escapeString(vehicleId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (endTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_time", endTime));
        if (duration != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("duration", duration));

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
    private com.squareup.okhttp.Call getDispatchRoutesByVehicleIdValidateBeforeCall(String accessToken, Long vehicleId, Long endTime, Long duration, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getDispatchRoutesByVehicleId(Async)");
        }
        
        // verify the required parameter 'vehicleId' is set
        if (vehicleId == null) {
            throw new ApiException("Missing the required parameter 'vehicleId' when calling getDispatchRoutesByVehicleId(Async)");
        }
        

        com.squareup.okhttp.Call call = getDispatchRoutesByVehicleIdCall(accessToken, vehicleId, endTime, duration, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * Fetch all of the dispatch routes for a given vehicle.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @return DispatchRoutes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DispatchRoutes getDispatchRoutesByVehicleId(String accessToken, Long vehicleId, Long endTime, Long duration) throws ApiException {
        ApiResponse<DispatchRoutes> resp = getDispatchRoutesByVehicleIdWithHttpInfo(accessToken, vehicleId, endTime, duration);
        return resp.getData();
    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
     * Fetch all of the dispatch routes for a given vehicle.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @return ApiResponse&lt;DispatchRoutes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DispatchRoutes> getDispatchRoutesByVehicleIdWithHttpInfo(String accessToken, Long vehicleId, Long endTime, Long duration) throws ApiException {
        com.squareup.okhttp.Call call = getDispatchRoutesByVehicleIdValidateBeforeCall(accessToken, vehicleId, endTime, duration, null, null);
        Type localVarReturnType = new TypeToken<DispatchRoutes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes (asynchronously)
     * Fetch all of the dispatch routes for a given vehicle.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
     * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDispatchRoutesByVehicleIdAsync(String accessToken, Long vehicleId, Long endTime, Long duration, final ApiCallback<DispatchRoutes> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDispatchRoutesByVehicleIdValidateBeforeCall(accessToken, vehicleId, endTime, duration, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DispatchRoutes>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDriverById
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDriverByIdCall(String accessToken, String driverIdOrExternalId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/drivers/{driver_id_or_external_id}"
            .replaceAll("\\{" + "driver_id_or_external_id" + "\\}", apiClient.escapeString(driverIdOrExternalId.toString()));

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
    private com.squareup.okhttp.Call getDriverByIdValidateBeforeCall(String accessToken, String driverIdOrExternalId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getDriverById(Async)");
        }
        
        // verify the required parameter 'driverIdOrExternalId' is set
        if (driverIdOrExternalId == null) {
            throw new ApiException("Missing the required parameter 'driverIdOrExternalId' when calling getDriverById(Async)");
        }
        

        com.squareup.okhttp.Call call = getDriverByIdCall(accessToken, driverIdOrExternalId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Fetch driver by id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @return CurrentDriver
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CurrentDriver getDriverById(String accessToken, String driverIdOrExternalId) throws ApiException {
        ApiResponse<CurrentDriver> resp = getDriverByIdWithHttpInfo(accessToken, driverIdOrExternalId);
        return resp.getData();
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Fetch driver by id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @return ApiResponse&lt;CurrentDriver&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CurrentDriver> getDriverByIdWithHttpInfo(String accessToken, String driverIdOrExternalId) throws ApiException {
        com.squareup.okhttp.Call call = getDriverByIdValidateBeforeCall(accessToken, driverIdOrExternalId, null, null);
        Type localVarReturnType = new TypeToken<CurrentDriver>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} (asynchronously)
     * Fetch driver by id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDriverByIdAsync(String accessToken, String driverIdOrExternalId, final ApiCallback<CurrentDriver> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDriverByIdValidateBeforeCall(accessToken, driverIdOrExternalId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CurrentDriver>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDriverDocumentTypesByOrgId
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDriverDocumentTypesByOrgIdCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/drivers/document_types";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call getDriverDocumentTypesByOrgIdValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getDriverDocumentTypesByOrgIdCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * /fleet/drivers/document_types
     * Fetch all of the document types.
     * @return DocumentTypes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentTypes getDriverDocumentTypesByOrgId() throws ApiException {
        ApiResponse<DocumentTypes> resp = getDriverDocumentTypesByOrgIdWithHttpInfo();
        return resp.getData();
    }

    /**
     * /fleet/drivers/document_types
     * Fetch all of the document types.
     * @return ApiResponse&lt;DocumentTypes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentTypes> getDriverDocumentTypesByOrgIdWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getDriverDocumentTypesByOrgIdValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<DocumentTypes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/drivers/document_types (asynchronously)
     * Fetch all of the document types.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDriverDocumentTypesByOrgIdAsync(final ApiCallback<DocumentTypes> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDriverDocumentTypesByOrgIdValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentTypes>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDriverDocumentsByOrgId
     * @param accessToken Samsara API access token. (required)
     * @param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)
     * @param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDriverDocumentsByOrgIdCall(String accessToken, Long endMs, Long durationMs, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/drivers/documents";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (endMs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("endMs", endMs));
        if (durationMs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("durationMs", durationMs));

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
    private com.squareup.okhttp.Call getDriverDocumentsByOrgIdValidateBeforeCall(String accessToken, Long endMs, Long durationMs, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getDriverDocumentsByOrgId(Async)");
        }
        

        com.squareup.okhttp.Call call = getDriverDocumentsByOrgIdCall(accessToken, endMs, durationMs, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /fleet/drivers/documents
     * Fetch all of the documents.
     * @param accessToken Samsara API access token. (required)
     * @param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)
     * @param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)
     * @return Documents
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Documents getDriverDocumentsByOrgId(String accessToken, Long endMs, Long durationMs) throws ApiException {
        ApiResponse<Documents> resp = getDriverDocumentsByOrgIdWithHttpInfo(accessToken, endMs, durationMs);
        return resp.getData();
    }

    /**
     * /fleet/drivers/documents
     * Fetch all of the documents.
     * @param accessToken Samsara API access token. (required)
     * @param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)
     * @param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)
     * @return ApiResponse&lt;Documents&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Documents> getDriverDocumentsByOrgIdWithHttpInfo(String accessToken, Long endMs, Long durationMs) throws ApiException {
        com.squareup.okhttp.Call call = getDriverDocumentsByOrgIdValidateBeforeCall(accessToken, endMs, durationMs, null, null);
        Type localVarReturnType = new TypeToken<Documents>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/drivers/documents (asynchronously)
     * Fetch all of the documents.
     * @param accessToken Samsara API access token. (required)
     * @param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)
     * @param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDriverDocumentsByOrgIdAsync(String accessToken, Long endMs, Long durationMs, final ApiCallback<Documents> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDriverDocumentsByOrgIdValidateBeforeCall(accessToken, endMs, durationMs, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Documents>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDriverSafetyScore
     * @param driverId ID of the driver (required)
     * @param accessToken Samsara API access token. (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDriverSafetyScoreCall(Long driverId, String accessToken, Long startMs, Long endMs, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/drivers/{driverId}/safety/score"
            .replaceAll("\\{" + "driverId" + "\\}", apiClient.escapeString(driverId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (startMs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("startMs", startMs));
        if (endMs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("endMs", endMs));

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
    private com.squareup.okhttp.Call getDriverSafetyScoreValidateBeforeCall(Long driverId, String accessToken, Long startMs, Long endMs, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        com.squareup.okhttp.Call call = getDriverSafetyScoreCall(driverId, accessToken, startMs, endMs, progressListener, progressRequestListener);
        return call;

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
        ApiResponse<DriverSafetyScoreResponse> resp = getDriverSafetyScoreWithHttpInfo(driverId, accessToken, startMs, endMs);
        return resp.getData();
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
        com.squareup.okhttp.Call call = getDriverSafetyScoreValidateBeforeCall(driverId, accessToken, startMs, endMs, null, null);
        Type localVarReturnType = new TypeToken<DriverSafetyScoreResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/drivers/{driverId:[0-9]+}/safety/score (asynchronously)
     * Fetch the safety score for the driver.
     * @param driverId ID of the driver (required)
     * @param accessToken Samsara API access token. (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDriverSafetyScoreAsync(Long driverId, String accessToken, Long startMs, Long endMs, final ApiCallback<DriverSafetyScoreResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDriverSafetyScoreValidateBeforeCall(driverId, accessToken, startMs, endMs, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DriverSafetyScoreResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDvirs
     * @param accessToken Samsara API access token. (required)
     * @param endMs time in millis until the last dvir log. (required)
     * @param durationMs time in millis which corresponds to the duration before the end_ms. (required)
     * @param groupId Group ID to query. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDvirsCall(String accessToken, Integer endMs, Integer durationMs, Integer groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/maintenance/dvirs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (endMs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_ms", endMs));
        if (durationMs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("duration_ms", durationMs));
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
    private com.squareup.okhttp.Call getDvirsValidateBeforeCall(String accessToken, Integer endMs, Integer durationMs, Integer groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        com.squareup.okhttp.Call call = getDvirsCall(accessToken, endMs, durationMs, groupId, progressListener, progressRequestListener);
        return call;

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
        ApiResponse<DvirListResponse> resp = getDvirsWithHttpInfo(accessToken, endMs, durationMs, groupId);
        return resp.getData();
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
        com.squareup.okhttp.Call call = getDvirsValidateBeforeCall(accessToken, endMs, durationMs, groupId, null, null);
        Type localVarReturnType = new TypeToken<DvirListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/maintenance/dvirs (asynchronously)
     * Get DVIRs for the org within provided time constraints
     * @param accessToken Samsara API access token. (required)
     * @param endMs time in millis until the last dvir log. (required)
     * @param durationMs time in millis which corresponds to the duration before the end_ms. (required)
     * @param groupId Group ID to query. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDvirsAsync(String accessToken, Integer endMs, Integer durationMs, Integer groupId, final ApiCallback<DvirListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDvirsValidateBeforeCall(accessToken, endMs, durationMs, groupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DvirListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFleetDrivers
     * @param accessToken Samsara API access token. (required)
     * @param groupDriversParam  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFleetDriversCall(String accessToken, GroupDriversParam groupDriversParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = groupDriversParam;

        // create path and map variables
        String localVarPath = "/fleet/drivers";

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
    private com.squareup.okhttp.Call getFleetDriversValidateBeforeCall(String accessToken, GroupDriversParam groupDriversParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getFleetDrivers(Async)");
        }
        
        // verify the required parameter 'groupDriversParam' is set
        if (groupDriversParam == null) {
            throw new ApiException("Missing the required parameter 'groupDriversParam' when calling getFleetDrivers(Async)");
        }
        

        com.squareup.okhttp.Call call = getFleetDriversCall(accessToken, groupDriversParam, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /fleet/drivers
     * Get all the drivers for the specified group.
     * @param accessToken Samsara API access token. (required)
     * @param groupDriversParam  (required)
     * @return DriversResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DriversResponse getFleetDrivers(String accessToken, GroupDriversParam groupDriversParam) throws ApiException {
        ApiResponse<DriversResponse> resp = getFleetDriversWithHttpInfo(accessToken, groupDriversParam);
        return resp.getData();
    }

    /**
     * /fleet/drivers
     * Get all the drivers for the specified group.
     * @param accessToken Samsara API access token. (required)
     * @param groupDriversParam  (required)
     * @return ApiResponse&lt;DriversResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DriversResponse> getFleetDriversWithHttpInfo(String accessToken, GroupDriversParam groupDriversParam) throws ApiException {
        com.squareup.okhttp.Call call = getFleetDriversValidateBeforeCall(accessToken, groupDriversParam, null, null);
        Type localVarReturnType = new TypeToken<DriversResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/drivers (asynchronously)
     * Get all the drivers for the specified group.
     * @param accessToken Samsara API access token. (required)
     * @param groupDriversParam  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFleetDriversAsync(String accessToken, GroupDriversParam groupDriversParam, final ApiCallback<DriversResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFleetDriversValidateBeforeCall(accessToken, groupDriversParam, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DriversResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFleetDriversHosDailyLogs
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver with HOS logs. (required)
     * @param hosLogsParam  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFleetDriversHosDailyLogsCall(String accessToken, Long driverId, HosLogsParam hosLogsParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = hosLogsParam;

        // create path and map variables
        String localVarPath = "/fleet/drivers/{driver_id}/hos_daily_logs"
            .replaceAll("\\{" + "driver_id" + "\\}", apiClient.escapeString(driverId.toString()));

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
    private com.squareup.okhttp.Call getFleetDriversHosDailyLogsValidateBeforeCall(String accessToken, Long driverId, HosLogsParam hosLogsParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        com.squareup.okhttp.Call call = getFleetDriversHosDailyLogsCall(accessToken, driverId, hosLogsParam, progressListener, progressRequestListener);
        return call;

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
    public DriverDailyLogResponse getFleetDriversHosDailyLogs(String accessToken, Long driverId, HosLogsParam hosLogsParam) throws ApiException {
        ApiResponse<DriverDailyLogResponse> resp = getFleetDriversHosDailyLogsWithHttpInfo(accessToken, driverId, hosLogsParam);
        return resp.getData();
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
    public ApiResponse<DriverDailyLogResponse> getFleetDriversHosDailyLogsWithHttpInfo(String accessToken, Long driverId, HosLogsParam hosLogsParam) throws ApiException {
        com.squareup.okhttp.Call call = getFleetDriversHosDailyLogsValidateBeforeCall(accessToken, driverId, hosLogsParam, null, null);
        Type localVarReturnType = new TypeToken<DriverDailyLogResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs (asynchronously)
     * Get summarized daily HOS charts for a specified driver.
     * @param accessToken Samsara API access token. (required)
     * @param driverId ID of the driver with HOS logs. (required)
     * @param hosLogsParam  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFleetDriversHosDailyLogsAsync(String accessToken, Long driverId, HosLogsParam hosLogsParam, final ApiCallback<DriverDailyLogResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFleetDriversHosDailyLogsValidateBeforeCall(accessToken, driverId, hosLogsParam, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DriverDailyLogResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFleetDriversSummary
     * @param accessToken Samsara API access token. (required)
     * @param driversSummaryParam Org ID and time range to query. (required)
     * @param snapToDayBounds Snap query result to HOS day boundaries. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFleetDriversSummaryCall(String accessToken, DriversSummaryParam driversSummaryParam, Boolean snapToDayBounds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = driversSummaryParam;

        // create path and map variables
        String localVarPath = "/fleet/drivers/summary";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (snapToDayBounds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("snap_to_day_bounds", snapToDayBounds));

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
    private com.squareup.okhttp.Call getFleetDriversSummaryValidateBeforeCall(String accessToken, DriversSummaryParam driversSummaryParam, Boolean snapToDayBounds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getFleetDriversSummary(Async)");
        }
        
        // verify the required parameter 'driversSummaryParam' is set
        if (driversSummaryParam == null) {
            throw new ApiException("Missing the required parameter 'driversSummaryParam' when calling getFleetDriversSummary(Async)");
        }
        

        com.squareup.okhttp.Call call = getFleetDriversSummaryCall(accessToken, driversSummaryParam, snapToDayBounds, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /fleet/drivers/summary
     * Get the distance and time each driver in an organization has driven in a given time period.
     * @param accessToken Samsara API access token. (required)
     * @param driversSummaryParam Org ID and time range to query. (required)
     * @param snapToDayBounds Snap query result to HOS day boundaries. (optional)
     * @return DriversSummaryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DriversSummaryResponse getFleetDriversSummary(String accessToken, DriversSummaryParam driversSummaryParam, Boolean snapToDayBounds) throws ApiException {
        ApiResponse<DriversSummaryResponse> resp = getFleetDriversSummaryWithHttpInfo(accessToken, driversSummaryParam, snapToDayBounds);
        return resp.getData();
    }

    /**
     * /fleet/drivers/summary
     * Get the distance and time each driver in an organization has driven in a given time period.
     * @param accessToken Samsara API access token. (required)
     * @param driversSummaryParam Org ID and time range to query. (required)
     * @param snapToDayBounds Snap query result to HOS day boundaries. (optional)
     * @return ApiResponse&lt;DriversSummaryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DriversSummaryResponse> getFleetDriversSummaryWithHttpInfo(String accessToken, DriversSummaryParam driversSummaryParam, Boolean snapToDayBounds) throws ApiException {
        com.squareup.okhttp.Call call = getFleetDriversSummaryValidateBeforeCall(accessToken, driversSummaryParam, snapToDayBounds, null, null);
        Type localVarReturnType = new TypeToken<DriversSummaryResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/drivers/summary (asynchronously)
     * Get the distance and time each driver in an organization has driven in a given time period.
     * @param accessToken Samsara API access token. (required)
     * @param driversSummaryParam Org ID and time range to query. (required)
     * @param snapToDayBounds Snap query result to HOS day boundaries. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFleetDriversSummaryAsync(String accessToken, DriversSummaryParam driversSummaryParam, Boolean snapToDayBounds, final ApiCallback<DriversSummaryResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFleetDriversSummaryValidateBeforeCall(accessToken, driversSummaryParam, snapToDayBounds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DriversSummaryResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFleetHosAuthenticationLogs
     * @param accessToken Samsara API access token. (required)
     * @param hosAuthenticationLogsParam  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFleetHosAuthenticationLogsCall(String accessToken, HosAuthenticationLogsParam hosAuthenticationLogsParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = hosAuthenticationLogsParam;

        // create path and map variables
        String localVarPath = "/fleet/hos_authentication_logs";

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
    private com.squareup.okhttp.Call getFleetHosAuthenticationLogsValidateBeforeCall(String accessToken, HosAuthenticationLogsParam hosAuthenticationLogsParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getFleetHosAuthenticationLogs(Async)");
        }
        
        // verify the required parameter 'hosAuthenticationLogsParam' is set
        if (hosAuthenticationLogsParam == null) {
            throw new ApiException("Missing the required parameter 'hosAuthenticationLogsParam' when calling getFleetHosAuthenticationLogs(Async)");
        }
        

        com.squareup.okhttp.Call call = getFleetHosAuthenticationLogsCall(accessToken, hosAuthenticationLogsParam, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /fleet/hos_authentication_logs
     * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
     * @param accessToken Samsara API access token. (required)
     * @param hosAuthenticationLogsParam  (required)
     * @return HosAuthenticationLogsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HosAuthenticationLogsResponse getFleetHosAuthenticationLogs(String accessToken, HosAuthenticationLogsParam hosAuthenticationLogsParam) throws ApiException {
        ApiResponse<HosAuthenticationLogsResponse> resp = getFleetHosAuthenticationLogsWithHttpInfo(accessToken, hosAuthenticationLogsParam);
        return resp.getData();
    }

    /**
     * /fleet/hos_authentication_logs
     * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
     * @param accessToken Samsara API access token. (required)
     * @param hosAuthenticationLogsParam  (required)
     * @return ApiResponse&lt;HosAuthenticationLogsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HosAuthenticationLogsResponse> getFleetHosAuthenticationLogsWithHttpInfo(String accessToken, HosAuthenticationLogsParam hosAuthenticationLogsParam) throws ApiException {
        com.squareup.okhttp.Call call = getFleetHosAuthenticationLogsValidateBeforeCall(accessToken, hosAuthenticationLogsParam, null, null);
        Type localVarReturnType = new TypeToken<HosAuthenticationLogsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/hos_authentication_logs (asynchronously)
     * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
     * @param accessToken Samsara API access token. (required)
     * @param hosAuthenticationLogsParam  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFleetHosAuthenticationLogsAsync(String accessToken, HosAuthenticationLogsParam hosAuthenticationLogsParam, final ApiCallback<HosAuthenticationLogsResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFleetHosAuthenticationLogsValidateBeforeCall(accessToken, hosAuthenticationLogsParam, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HosAuthenticationLogsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFleetHosLogs
     * @param accessToken Samsara API access token. (required)
     * @param hosLogsParam  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFleetHosLogsCall(String accessToken, HosLogsParam1 hosLogsParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = hosLogsParam;

        // create path and map variables
        String localVarPath = "/fleet/hos_logs";

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
    private com.squareup.okhttp.Call getFleetHosLogsValidateBeforeCall(String accessToken, HosLogsParam1 hosLogsParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getFleetHosLogs(Async)");
        }
        
        // verify the required parameter 'hosLogsParam' is set
        if (hosLogsParam == null) {
            throw new ApiException("Missing the required parameter 'hosLogsParam' when calling getFleetHosLogs(Async)");
        }
        

        com.squareup.okhttp.Call call = getFleetHosLogsCall(accessToken, hosLogsParam, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /fleet/hos_logs
     * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
     * @param accessToken Samsara API access token. (required)
     * @param hosLogsParam  (required)
     * @return HosLogsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HosLogsResponse getFleetHosLogs(String accessToken, HosLogsParam1 hosLogsParam) throws ApiException {
        ApiResponse<HosLogsResponse> resp = getFleetHosLogsWithHttpInfo(accessToken, hosLogsParam);
        return resp.getData();
    }

    /**
     * /fleet/hos_logs
     * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
     * @param accessToken Samsara API access token. (required)
     * @param hosLogsParam  (required)
     * @return ApiResponse&lt;HosLogsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HosLogsResponse> getFleetHosLogsWithHttpInfo(String accessToken, HosLogsParam1 hosLogsParam) throws ApiException {
        com.squareup.okhttp.Call call = getFleetHosLogsValidateBeforeCall(accessToken, hosLogsParam, null, null);
        Type localVarReturnType = new TypeToken<HosLogsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/hos_logs (asynchronously)
     * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
     * @param accessToken Samsara API access token. (required)
     * @param hosLogsParam  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFleetHosLogsAsync(String accessToken, HosLogsParam1 hosLogsParam, final ApiCallback<HosLogsResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFleetHosLogsValidateBeforeCall(accessToken, hosLogsParam, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HosLogsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFleetHosLogsSummary
     * @param accessToken Samsara API access token. (required)
     * @param hosLogsParam  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFleetHosLogsSummaryCall(String accessToken, HosLogsParam2 hosLogsParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = hosLogsParam;

        // create path and map variables
        String localVarPath = "/fleet/hos_logs_summary";

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
    private com.squareup.okhttp.Call getFleetHosLogsSummaryValidateBeforeCall(String accessToken, HosLogsParam2 hosLogsParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getFleetHosLogsSummary(Async)");
        }
        
        // verify the required parameter 'hosLogsParam' is set
        if (hosLogsParam == null) {
            throw new ApiException("Missing the required parameter 'hosLogsParam' when calling getFleetHosLogsSummary(Async)");
        }
        

        com.squareup.okhttp.Call call = getFleetHosLogsSummaryCall(accessToken, hosLogsParam, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /fleet/hos_logs_summary
     * Get the current HOS status for all drivers in the group.
     * @param accessToken Samsara API access token. (required)
     * @param hosLogsParam  (required)
     * @return HosLogsSummaryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HosLogsSummaryResponse getFleetHosLogsSummary(String accessToken, HosLogsParam2 hosLogsParam) throws ApiException {
        ApiResponse<HosLogsSummaryResponse> resp = getFleetHosLogsSummaryWithHttpInfo(accessToken, hosLogsParam);
        return resp.getData();
    }

    /**
     * /fleet/hos_logs_summary
     * Get the current HOS status for all drivers in the group.
     * @param accessToken Samsara API access token. (required)
     * @param hosLogsParam  (required)
     * @return ApiResponse&lt;HosLogsSummaryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HosLogsSummaryResponse> getFleetHosLogsSummaryWithHttpInfo(String accessToken, HosLogsParam2 hosLogsParam) throws ApiException {
        com.squareup.okhttp.Call call = getFleetHosLogsSummaryValidateBeforeCall(accessToken, hosLogsParam, null, null);
        Type localVarReturnType = new TypeToken<HosLogsSummaryResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/hos_logs_summary (asynchronously)
     * Get the current HOS status for all drivers in the group.
     * @param accessToken Samsara API access token. (required)
     * @param hosLogsParam  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFleetHosLogsSummaryAsync(String accessToken, HosLogsParam2 hosLogsParam, final ApiCallback<HosLogsSummaryResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFleetHosLogsSummaryValidateBeforeCall(accessToken, hosLogsParam, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HosLogsSummaryResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFleetLocations
     * @param accessToken Samsara API access token. (required)
     * @param groupParam Group ID to query. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFleetLocationsCall(String accessToken, GroupParam groupParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = groupParam;

        // create path and map variables
        String localVarPath = "/fleet/locations";

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
    private com.squareup.okhttp.Call getFleetLocationsValidateBeforeCall(String accessToken, GroupParam groupParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getFleetLocations(Async)");
        }
        
        // verify the required parameter 'groupParam' is set
        if (groupParam == null) {
            throw new ApiException("Missing the required parameter 'groupParam' when calling getFleetLocations(Async)");
        }
        

        com.squareup.okhttp.Call call = getFleetLocationsCall(accessToken, groupParam, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /fleet/locations
     * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam Group ID to query. (required)
     * @return InlineResponse2003
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2003 getFleetLocations(String accessToken, GroupParam groupParam) throws ApiException {
        ApiResponse<InlineResponse2003> resp = getFleetLocationsWithHttpInfo(accessToken, groupParam);
        return resp.getData();
    }

    /**
     * /fleet/locations
     * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam Group ID to query. (required)
     * @return ApiResponse&lt;InlineResponse2003&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2003> getFleetLocationsWithHttpInfo(String accessToken, GroupParam groupParam) throws ApiException {
        com.squareup.okhttp.Call call = getFleetLocationsValidateBeforeCall(accessToken, groupParam, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2003>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/locations (asynchronously)
     * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam Group ID to query. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFleetLocationsAsync(String accessToken, GroupParam groupParam, final ApiCallback<InlineResponse2003> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFleetLocationsValidateBeforeCall(accessToken, groupParam, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2003>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFleetMaintenanceList
     * @param accessToken Samsara API access token. (required)
     * @param groupParam Group ID to query. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFleetMaintenanceListCall(String accessToken, GroupParam groupParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = groupParam;

        // create path and map variables
        String localVarPath = "/fleet/maintenance/list";

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
    private com.squareup.okhttp.Call getFleetMaintenanceListValidateBeforeCall(String accessToken, GroupParam groupParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getFleetMaintenanceList(Async)");
        }
        
        // verify the required parameter 'groupParam' is set
        if (groupParam == null) {
            throw new ApiException("Missing the required parameter 'groupParam' when calling getFleetMaintenanceList(Async)");
        }
        

        com.squareup.okhttp.Call call = getFleetMaintenanceListCall(accessToken, groupParam, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /fleet/maintenance/list
     * Get list of the vehicles with any engine faults or check light data.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam Group ID to query. (required)
     * @return InlineResponse2004
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2004 getFleetMaintenanceList(String accessToken, GroupParam groupParam) throws ApiException {
        ApiResponse<InlineResponse2004> resp = getFleetMaintenanceListWithHttpInfo(accessToken, groupParam);
        return resp.getData();
    }

    /**
     * /fleet/maintenance/list
     * Get list of the vehicles with any engine faults or check light data.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam Group ID to query. (required)
     * @return ApiResponse&lt;InlineResponse2004&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2004> getFleetMaintenanceListWithHttpInfo(String accessToken, GroupParam groupParam) throws ApiException {
        com.squareup.okhttp.Call call = getFleetMaintenanceListValidateBeforeCall(accessToken, groupParam, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2004>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/maintenance/list (asynchronously)
     * Get list of the vehicles with any engine faults or check light data.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam Group ID to query. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFleetMaintenanceListAsync(String accessToken, GroupParam groupParam, final ApiCallback<InlineResponse2004> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFleetMaintenanceListValidateBeforeCall(accessToken, groupParam, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2004>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFleetTrips
     * @param accessToken Samsara API access token. (required)
     * @param tripsParam Group ID, vehicle ID and time range to query. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFleetTripsCall(String accessToken, TripsParam tripsParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = tripsParam;

        // create path and map variables
        String localVarPath = "/fleet/trips";

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
    private com.squareup.okhttp.Call getFleetTripsValidateBeforeCall(String accessToken, TripsParam tripsParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getFleetTrips(Async)");
        }
        
        // verify the required parameter 'tripsParam' is set
        if (tripsParam == null) {
            throw new ApiException("Missing the required parameter 'tripsParam' when calling getFleetTrips(Async)");
        }
        

        com.squareup.okhttp.Call call = getFleetTripsCall(accessToken, tripsParam, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /fleet/trips
     * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
     * @param accessToken Samsara API access token. (required)
     * @param tripsParam Group ID, vehicle ID and time range to query. (required)
     * @return TripResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TripResponse getFleetTrips(String accessToken, TripsParam tripsParam) throws ApiException {
        ApiResponse<TripResponse> resp = getFleetTripsWithHttpInfo(accessToken, tripsParam);
        return resp.getData();
    }

    /**
     * /fleet/trips
     * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
     * @param accessToken Samsara API access token. (required)
     * @param tripsParam Group ID, vehicle ID and time range to query. (required)
     * @return ApiResponse&lt;TripResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TripResponse> getFleetTripsWithHttpInfo(String accessToken, TripsParam tripsParam) throws ApiException {
        com.squareup.okhttp.Call call = getFleetTripsValidateBeforeCall(accessToken, tripsParam, null, null);
        Type localVarReturnType = new TypeToken<TripResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/trips (asynchronously)
     * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
     * @param accessToken Samsara API access token. (required)
     * @param tripsParam Group ID, vehicle ID and time range to query. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFleetTripsAsync(String accessToken, TripsParam tripsParam, final ApiCallback<TripResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFleetTripsValidateBeforeCall(accessToken, tripsParam, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TripResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFleetVehicle
     * @param accessToken Samsara API access token. (required)
     * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFleetVehicleCall(String accessToken, String vehicleIdOrExternalId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/vehicles/{vehicle_id_or_external_id}"
            .replaceAll("\\{" + "vehicle_id_or_external_id" + "\\}", apiClient.escapeString(vehicleIdOrExternalId.toString()));

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
    private com.squareup.okhttp.Call getFleetVehicleValidateBeforeCall(String accessToken, String vehicleIdOrExternalId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getFleetVehicle(Async)");
        }
        
        // verify the required parameter 'vehicleIdOrExternalId' is set
        if (vehicleIdOrExternalId == null) {
            throw new ApiException("Missing the required parameter 'vehicleIdOrExternalId' when calling getFleetVehicle(Async)");
        }
        

        com.squareup.okhttp.Call call = getFleetVehicleCall(accessToken, vehicleIdOrExternalId, progressListener, progressRequestListener);
        return call;

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
        ApiResponse<FleetVehicleResponse> resp = getFleetVehicleWithHttpInfo(accessToken, vehicleIdOrExternalId);
        return resp.getData();
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
        com.squareup.okhttp.Call call = getFleetVehicleValidateBeforeCall(accessToken, vehicleIdOrExternalId, null, null);
        Type localVarReturnType = new TypeToken<FleetVehicleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+} (asynchronously)
     * Gets a specific vehicle.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFleetVehicleAsync(String accessToken, String vehicleIdOrExternalId, final ApiCallback<FleetVehicleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFleetVehicleValidateBeforeCall(accessToken, vehicleIdOrExternalId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FleetVehicleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOrganizationAddress
     * @param accessToken Samsara API access token. (required)
     * @param addressId ID of the address/geofence (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOrganizationAddressCall(String accessToken, Long addressId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/addresses/{addressId}"
            .replaceAll("\\{" + "addressId" + "\\}", apiClient.escapeString(addressId.toString()));

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
    private com.squareup.okhttp.Call getOrganizationAddressValidateBeforeCall(String accessToken, Long addressId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getOrganizationAddress(Async)");
        }
        
        // verify the required parameter 'addressId' is set
        if (addressId == null) {
            throw new ApiException("Missing the required parameter 'addressId' when calling getOrganizationAddress(Async)");
        }
        

        com.squareup.okhttp.Call call = getOrganizationAddressCall(accessToken, addressId, progressListener, progressRequestListener);
        return call;

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
        ApiResponse<Address> resp = getOrganizationAddressWithHttpInfo(accessToken, addressId);
        return resp.getData();
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
        com.squareup.okhttp.Call call = getOrganizationAddressValidateBeforeCall(accessToken, addressId, null, null);
        Type localVarReturnType = new TypeToken<Address>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /addresses/{addressId} (asynchronously)
     * Fetch an address by its id.
     * @param accessToken Samsara API access token. (required)
     * @param addressId ID of the address/geofence (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOrganizationAddressAsync(String accessToken, Long addressId, final ApiCallback<Address> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOrganizationAddressValidateBeforeCall(accessToken, addressId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Address>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOrganizationAddresses
     * @param accessToken Samsara API access token. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOrganizationAddressesCall(String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/addresses";

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
    private com.squareup.okhttp.Call getOrganizationAddressesValidateBeforeCall(String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getOrganizationAddresses(Async)");
        }
        

        com.squareup.okhttp.Call call = getOrganizationAddressesCall(accessToken, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /addresses
     * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
     * @param accessToken Samsara API access token. (required)
     * @return List&lt;Address&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Address> getOrganizationAddresses(String accessToken) throws ApiException {
        ApiResponse<List<Address>> resp = getOrganizationAddressesWithHttpInfo(accessToken);
        return resp.getData();
    }

    /**
     * /addresses
     * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
     * @param accessToken Samsara API access token. (required)
     * @return ApiResponse&lt;List&lt;Address&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Address>> getOrganizationAddressesWithHttpInfo(String accessToken) throws ApiException {
        com.squareup.okhttp.Call call = getOrganizationAddressesValidateBeforeCall(accessToken, null, null);
        Type localVarReturnType = new TypeToken<List<Address>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /addresses (asynchronously)
     * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
     * @param accessToken Samsara API access token. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOrganizationAddressesAsync(String accessToken, final ApiCallback<List<Address>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOrganizationAddressesValidateBeforeCall(accessToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Address>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOrganizationContact
     * @param accessToken Samsara API access token. (required)
     * @param contactId ID of the contact (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOrganizationContactCall(String accessToken, Long contactId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/contacts/{contact_id}"
            .replaceAll("\\{" + "contact_id" + "\\}", apiClient.escapeString(contactId.toString()));

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
    private com.squareup.okhttp.Call getOrganizationContactValidateBeforeCall(String accessToken, Long contactId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getOrganizationContact(Async)");
        }
        
        // verify the required parameter 'contactId' is set
        if (contactId == null) {
            throw new ApiException("Missing the required parameter 'contactId' when calling getOrganizationContact(Async)");
        }
        

        com.squareup.okhttp.Call call = getOrganizationContactCall(accessToken, contactId, progressListener, progressRequestListener);
        return call;

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
        ApiResponse<Contact> resp = getOrganizationContactWithHttpInfo(accessToken, contactId);
        return resp.getData();
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
        com.squareup.okhttp.Call call = getOrganizationContactValidateBeforeCall(accessToken, contactId, null, null);
        Type localVarReturnType = new TypeToken<Contact>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /contacts/{contact_id} (asynchronously)
     * Fetch a contact by its id.
     * @param accessToken Samsara API access token. (required)
     * @param contactId ID of the contact (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOrganizationContactAsync(String accessToken, Long contactId, final ApiCallback<Contact> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOrganizationContactValidateBeforeCall(accessToken, contactId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Contact>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getVehicleHarshEvent
     * @param vehicleId ID of the vehicle (required)
     * @param accessToken Samsara API access token. (required)
     * @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVehicleHarshEventCall(Long vehicleId, String accessToken, Long timestamp, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/vehicles/{vehicleId}/safety/harsh_event"
            .replaceAll("\\{" + "vehicleId" + "\\}", apiClient.escapeString(vehicleId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (timestamp != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("timestamp", timestamp));

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
    private com.squareup.okhttp.Call getVehicleHarshEventValidateBeforeCall(Long vehicleId, String accessToken, Long timestamp, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        com.squareup.okhttp.Call call = getVehicleHarshEventCall(vehicleId, accessToken, timestamp, progressListener, progressRequestListener);
        return call;

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
        ApiResponse<VehicleHarshEventResponse> resp = getVehicleHarshEventWithHttpInfo(vehicleId, accessToken, timestamp);
        return resp.getData();
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
        com.squareup.okhttp.Call call = getVehicleHarshEventValidateBeforeCall(vehicleId, accessToken, timestamp, null, null);
        Type localVarReturnType = new TypeToken<VehicleHarshEventResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event (asynchronously)
     * Fetch harsh event details for a vehicle.
     * @param vehicleId ID of the vehicle (required)
     * @param accessToken Samsara API access token. (required)
     * @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVehicleHarshEventAsync(Long vehicleId, String accessToken, Long timestamp, final ApiCallback<VehicleHarshEventResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVehicleHarshEventValidateBeforeCall(vehicleId, accessToken, timestamp, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VehicleHarshEventResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getVehicleLocations
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) (required)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVehicleLocationsCall(String accessToken, Long vehicleId, Long startMs, Long endMs, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/vehicles/{vehicle_id}/locations"
            .replaceAll("\\{" + "vehicle_id" + "\\}", apiClient.escapeString(vehicleId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (startMs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("startMs", startMs));
        if (endMs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("endMs", endMs));

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
    private com.squareup.okhttp.Call getVehicleLocationsValidateBeforeCall(String accessToken, Long vehicleId, Long startMs, Long endMs, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        com.squareup.okhttp.Call call = getVehicleLocationsCall(accessToken, vehicleId, startMs, endMs, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) (required)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) (required)
     * @return FleetVehicleLocations
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FleetVehicleLocations getVehicleLocations(String accessToken, Long vehicleId, Long startMs, Long endMs) throws ApiException {
        ApiResponse<FleetVehicleLocations> resp = getVehicleLocationsWithHttpInfo(accessToken, vehicleId, startMs, endMs);
        return resp.getData();
    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) (required)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) (required)
     * @return ApiResponse&lt;FleetVehicleLocations&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FleetVehicleLocations> getVehicleLocationsWithHttpInfo(String accessToken, Long vehicleId, Long startMs, Long endMs) throws ApiException {
        com.squareup.okhttp.Call call = getVehicleLocationsValidateBeforeCall(accessToken, vehicleId, startMs, endMs, null, null);
        Type localVarReturnType = new TypeToken<FleetVehicleLocations>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+}/locations (asynchronously)
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleId ID of the vehicle with the associated routes. (required)
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) (required)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVehicleLocationsAsync(String accessToken, Long vehicleId, Long startMs, Long endMs, final ApiCallback<FleetVehicleLocations> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVehicleLocationsValidateBeforeCall(accessToken, vehicleId, startMs, endMs, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FleetVehicleLocations>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getVehicleSafetyScore
     * @param vehicleId ID of the vehicle (required)
     * @param accessToken Samsara API access token. (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVehicleSafetyScoreCall(Long vehicleId, String accessToken, Long startMs, Long endMs, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/vehicles/{vehicleId}/safety/score"
            .replaceAll("\\{" + "vehicleId" + "\\}", apiClient.escapeString(vehicleId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (startMs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("startMs", startMs));
        if (endMs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("endMs", endMs));

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
    private com.squareup.okhttp.Call getVehicleSafetyScoreValidateBeforeCall(Long vehicleId, String accessToken, Long startMs, Long endMs, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        com.squareup.okhttp.Call call = getVehicleSafetyScoreCall(vehicleId, accessToken, startMs, endMs, progressListener, progressRequestListener);
        return call;

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
        ApiResponse<VehicleSafetyScoreResponse> resp = getVehicleSafetyScoreWithHttpInfo(vehicleId, accessToken, startMs, endMs);
        return resp.getData();
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
        com.squareup.okhttp.Call call = getVehicleSafetyScoreValidateBeforeCall(vehicleId, accessToken, startMs, endMs, null, null);
        Type localVarReturnType = new TypeToken<VehicleSafetyScoreResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score (asynchronously)
     * Fetch the safety score for the vehicle.
     * @param vehicleId ID of the vehicle (required)
     * @param accessToken Samsara API access token. (required)
     * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
     * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVehicleSafetyScoreAsync(Long vehicleId, String accessToken, Long startMs, Long endMs, final ApiCallback<VehicleSafetyScoreResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVehicleSafetyScoreValidateBeforeCall(vehicleId, accessToken, startMs, endMs, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VehicleSafetyScoreResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
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
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVehicleStatsCall(String accessToken, Integer startMs, Integer endMs, String series, String tagIds, String startingAfter, String endingBefore, Long limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/vehicles/stats";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (startMs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("startMs", startMs));
        if (endMs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("endMs", endMs));
        if (series != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("series", series));
        if (tagIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("tagIds", tagIds));
        if (startingAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("startingAfter", startingAfter));
        if (endingBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("endingBefore", endingBefore));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

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
    private com.squareup.okhttp.Call getVehicleStatsValidateBeforeCall(String accessToken, Integer startMs, Integer endMs, String series, String tagIds, String startingAfter, String endingBefore, Long limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        com.squareup.okhttp.Call call = getVehicleStatsCall(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit, progressListener, progressRequestListener);
        return call;

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
        ApiResponse<InlineResponse2005> resp = getVehicleStatsWithHttpInfo(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit);
        return resp.getData();
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
        com.squareup.okhttp.Call call = getVehicleStatsValidateBeforeCall(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2005>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
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
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVehicleStatsAsync(String accessToken, Integer startMs, Integer endMs, String series, String tagIds, String startingAfter, String endingBefore, Long limit, final ApiCallback<InlineResponse2005> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVehicleStatsValidateBeforeCall(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2005>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getVehiclesLocations
     * @param accessToken Samsara API access token. (required)
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) (required)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVehiclesLocationsCall(String accessToken, Integer startMs, Integer endMs, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fleet/vehicles/locations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (startMs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("startMs", startMs));
        if (endMs != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("endMs", endMs));

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
    private com.squareup.okhttp.Call getVehiclesLocationsValidateBeforeCall(String accessToken, Integer startMs, Integer endMs, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        com.squareup.okhttp.Call call = getVehiclesLocationsCall(accessToken, startMs, endMs, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /fleet/vehicles/locations
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
     * @param accessToken Samsara API access token. (required)
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) (required)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) (required)
     * @return FleetVehiclesLocations
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FleetVehiclesLocations getVehiclesLocations(String accessToken, Integer startMs, Integer endMs) throws ApiException {
        ApiResponse<FleetVehiclesLocations> resp = getVehiclesLocationsWithHttpInfo(accessToken, startMs, endMs);
        return resp.getData();
    }

    /**
     * /fleet/vehicles/locations
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
     * @param accessToken Samsara API access token. (required)
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) (required)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) (required)
     * @return ApiResponse&lt;FleetVehiclesLocations&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FleetVehiclesLocations> getVehiclesLocationsWithHttpInfo(String accessToken, Integer startMs, Integer endMs) throws ApiException {
        com.squareup.okhttp.Call call = getVehiclesLocationsValidateBeforeCall(accessToken, startMs, endMs, null, null);
        Type localVarReturnType = new TypeToken<FleetVehiclesLocations>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/vehicles/locations (asynchronously)
     * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
     * @param accessToken Samsara API access token. (required)
     * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) (required)
     * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVehiclesLocationsAsync(String accessToken, Integer startMs, Integer endMs, final ApiCallback<FleetVehiclesLocations> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVehiclesLocationsValidateBeforeCall(accessToken, startMs, endMs, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FleetVehiclesLocations>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listContacts
     * @param accessToken Samsara API access token. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listContactsCall(String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/contacts";

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
    private com.squareup.okhttp.Call listContactsValidateBeforeCall(String accessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling listContacts(Async)");
        }
        

        com.squareup.okhttp.Call call = listContactsCall(accessToken, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /contacts
     * Fetch all contacts for the organization.
     * @param accessToken Samsara API access token. (required)
     * @return List&lt;Contact&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Contact> listContacts(String accessToken) throws ApiException {
        ApiResponse<List<Contact>> resp = listContactsWithHttpInfo(accessToken);
        return resp.getData();
    }

    /**
     * /contacts
     * Fetch all contacts for the organization.
     * @param accessToken Samsara API access token. (required)
     * @return ApiResponse&lt;List&lt;Contact&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Contact>> listContactsWithHttpInfo(String accessToken) throws ApiException {
        com.squareup.okhttp.Call call = listContactsValidateBeforeCall(accessToken, null, null);
        Type localVarReturnType = new TypeToken<List<Contact>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /contacts (asynchronously)
     * Fetch all contacts for the organization.
     * @param accessToken Samsara API access token. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listContactsAsync(String accessToken, final ApiCallback<List<Contact>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listContactsValidateBeforeCall(accessToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Contact>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listFleet
     * @param accessToken Samsara API access token. (required)
     * @param groupParam Group ID to query. (required)
     * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
     * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
     * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listFleetCall(String accessToken, GroupParam groupParam, String startingAfter, String endingBefore, Long limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = groupParam;

        // create path and map variables
        String localVarPath = "/fleet/list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
        if (startingAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("startingAfter", startingAfter));
        if (endingBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("endingBefore", endingBefore));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

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
    private com.squareup.okhttp.Call listFleetValidateBeforeCall(String accessToken, GroupParam groupParam, String startingAfter, String endingBefore, Long limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling listFleet(Async)");
        }
        
        // verify the required parameter 'groupParam' is set
        if (groupParam == null) {
            throw new ApiException("Missing the required parameter 'groupParam' when calling listFleet(Async)");
        }
        

        com.squareup.okhttp.Call call = listFleetCall(accessToken, groupParam, startingAfter, endingBefore, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /fleet/list
     * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam Group ID to query. (required)
     * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
     * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
     * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
     * @return InlineResponse2002
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2002 listFleet(String accessToken, GroupParam groupParam, String startingAfter, String endingBefore, Long limit) throws ApiException {
        ApiResponse<InlineResponse2002> resp = listFleetWithHttpInfo(accessToken, groupParam, startingAfter, endingBefore, limit);
        return resp.getData();
    }

    /**
     * /fleet/list
     * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam Group ID to query. (required)
     * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
     * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
     * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
     * @return ApiResponse&lt;InlineResponse2002&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2002> listFleetWithHttpInfo(String accessToken, GroupParam groupParam, String startingAfter, String endingBefore, Long limit) throws ApiException {
        com.squareup.okhttp.Call call = listFleetValidateBeforeCall(accessToken, groupParam, startingAfter, endingBefore, limit, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/list (asynchronously)
     * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
     * @param accessToken Samsara API access token. (required)
     * @param groupParam Group ID to query. (required)
     * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
     * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
     * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listFleetAsync(String accessToken, GroupParam groupParam, String startingAfter, String endingBefore, Long limit, final ApiCallback<InlineResponse2002> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listFleetValidateBeforeCall(accessToken, groupParam, startingAfter, endingBefore, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for patchFleetVehicle
     * @param accessToken Samsara API access token. (required)
     * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     * @param data  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call patchFleetVehicleCall(String accessToken, String vehicleIdOrExternalId, Data data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;

        // create path and map variables
        String localVarPath = "/fleet/vehicles/{vehicle_id_or_external_id}"
            .replaceAll("\\{" + "vehicle_id_or_external_id" + "\\}", apiClient.escapeString(vehicleIdOrExternalId.toString()));

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
            "application/json", "application/merge-patch+json"
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
    private com.squareup.okhttp.Call patchFleetVehicleValidateBeforeCall(String accessToken, String vehicleIdOrExternalId, Data data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        com.squareup.okhttp.Call call = patchFleetVehicleCall(accessToken, vehicleIdOrExternalId, data, progressListener, progressRequestListener);
        return call;

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
    public FleetVehicleResponse patchFleetVehicle(String accessToken, String vehicleIdOrExternalId, Data data) throws ApiException {
        ApiResponse<FleetVehicleResponse> resp = patchFleetVehicleWithHttpInfo(accessToken, vehicleIdOrExternalId, data);
        return resp.getData();
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
    public ApiResponse<FleetVehicleResponse> patchFleetVehicleWithHttpInfo(String accessToken, String vehicleIdOrExternalId, Data data) throws ApiException {
        com.squareup.okhttp.Call call = patchFleetVehicleValidateBeforeCall(accessToken, vehicleIdOrExternalId, data, null, null);
        Type localVarReturnType = new TypeToken<FleetVehicleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+} (asynchronously)
     * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
     * @param data  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call patchFleetVehicleAsync(String accessToken, String vehicleIdOrExternalId, Data data, final ApiCallback<FleetVehicleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = patchFleetVehicleValidateBeforeCall(accessToken, vehicleIdOrExternalId, data, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FleetVehicleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for reactivateDriverById
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param reactivateDriverParam Driver reactivation body (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call reactivateDriverByIdCall(String accessToken, String driverIdOrExternalId, ReactivateDriverParam reactivateDriverParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = reactivateDriverParam;

        // create path and map variables
        String localVarPath = "/fleet/drivers/inactive/{driver_id_or_external_id}"
            .replaceAll("\\{" + "driver_id_or_external_id" + "\\}", apiClient.escapeString(driverIdOrExternalId.toString()));

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
    private com.squareup.okhttp.Call reactivateDriverByIdValidateBeforeCall(String accessToken, String driverIdOrExternalId, ReactivateDriverParam reactivateDriverParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        com.squareup.okhttp.Call call = reactivateDriverByIdCall(accessToken, driverIdOrExternalId, reactivateDriverParam, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Reactivate the inactive driver having id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param reactivateDriverParam Driver reactivation body (required)
     * @return CurrentDriver
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CurrentDriver reactivateDriverById(String accessToken, String driverIdOrExternalId, ReactivateDriverParam reactivateDriverParam) throws ApiException {
        ApiResponse<CurrentDriver> resp = reactivateDriverByIdWithHttpInfo(accessToken, driverIdOrExternalId, reactivateDriverParam);
        return resp.getData();
    }

    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
     * Reactivate the inactive driver having id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param reactivateDriverParam Driver reactivation body (required)
     * @return ApiResponse&lt;CurrentDriver&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CurrentDriver> reactivateDriverByIdWithHttpInfo(String accessToken, String driverIdOrExternalId, ReactivateDriverParam reactivateDriverParam) throws ApiException {
        com.squareup.okhttp.Call call = reactivateDriverByIdValidateBeforeCall(accessToken, driverIdOrExternalId, reactivateDriverParam, null, null);
        Type localVarReturnType = new TypeToken<CurrentDriver>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} (asynchronously)
     * Reactivate the inactive driver having id.
     * @param accessToken Samsara API access token. (required)
     * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
     * @param reactivateDriverParam Driver reactivation body (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call reactivateDriverByIdAsync(String accessToken, String driverIdOrExternalId, ReactivateDriverParam reactivateDriverParam, final ApiCallback<CurrentDriver> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = reactivateDriverByIdValidateBeforeCall(accessToken, driverIdOrExternalId, reactivateDriverParam, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CurrentDriver>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateDispatchRouteById
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the dispatch route. (required)
     * @param updateDispatchRouteParams  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateDispatchRouteByIdCall(String accessToken, Long routeId, DispatchRoute updateDispatchRouteParams, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = updateDispatchRouteParams;

        // create path and map variables
        String localVarPath = "/fleet/dispatch/routes/{route_id}"
            .replaceAll("\\{" + "route_id" + "\\}", apiClient.escapeString(routeId.toString()));

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
    private com.squareup.okhttp.Call updateDispatchRouteByIdValidateBeforeCall(String accessToken, Long routeId, DispatchRoute updateDispatchRouteParams, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        com.squareup.okhttp.Call call = updateDispatchRouteByIdCall(accessToken, routeId, updateDispatchRouteParams, progressListener, progressRequestListener);
        return call;

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
        ApiResponse<DispatchRoute> resp = updateDispatchRouteByIdWithHttpInfo(accessToken, routeId, updateDispatchRouteParams);
        return resp.getData();
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
        com.squareup.okhttp.Call call = updateDispatchRouteByIdValidateBeforeCall(accessToken, routeId, updateDispatchRouteParams, null, null);
        Type localVarReturnType = new TypeToken<DispatchRoute>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * /fleet/dispatch/routes/{route_id:[0-9]+}/ (asynchronously)
     * Update a dispatch route and its associated jobs.
     * @param accessToken Samsara API access token. (required)
     * @param routeId ID of the dispatch route. (required)
     * @param updateDispatchRouteParams  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateDispatchRouteByIdAsync(String accessToken, Long routeId, DispatchRoute updateDispatchRouteParams, final ApiCallback<DispatchRoute> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateDispatchRouteByIdValidateBeforeCall(accessToken, routeId, updateDispatchRouteParams, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DispatchRoute>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateOrganizationAddress
     * @param accessToken Samsara API access token. (required)
     * @param address Update parts of an address&#39;s value. If the geofence &#39;circle&#39; or &#39;polygon&#39; key is specified, the update will change the type of geofence accordingly. (required)
     * @param addressId ID of the address/geofence (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateOrganizationAddressCall(String accessToken, Address address, Long addressId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = address;

        // create path and map variables
        String localVarPath = "/addresses/{addressId}"
            .replaceAll("\\{" + "addressId" + "\\}", apiClient.escapeString(addressId.toString()));

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
    private com.squareup.okhttp.Call updateOrganizationAddressValidateBeforeCall(String accessToken, Address address, Long addressId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling updateOrganizationAddress(Async)");
        }
        
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new ApiException("Missing the required parameter 'address' when calling updateOrganizationAddress(Async)");
        }
        
        // verify the required parameter 'addressId' is set
        if (addressId == null) {
            throw new ApiException("Missing the required parameter 'addressId' when calling updateOrganizationAddress(Async)");
        }
        

        com.squareup.okhttp.Call call = updateOrganizationAddressCall(accessToken, address, addressId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /addresses/{addressId}
     * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
     * @param accessToken Samsara API access token. (required)
     * @param address Update parts of an address&#39;s value. If the geofence &#39;circle&#39; or &#39;polygon&#39; key is specified, the update will change the type of geofence accordingly. (required)
     * @param addressId ID of the address/geofence (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateOrganizationAddress(String accessToken, Address address, Long addressId) throws ApiException {
        updateOrganizationAddressWithHttpInfo(accessToken, address, addressId);
    }

    /**
     * /addresses/{addressId}
     * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
     * @param accessToken Samsara API access token. (required)
     * @param address Update parts of an address&#39;s value. If the geofence &#39;circle&#39; or &#39;polygon&#39; key is specified, the update will change the type of geofence accordingly. (required)
     * @param addressId ID of the address/geofence (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateOrganizationAddressWithHttpInfo(String accessToken, Address address, Long addressId) throws ApiException {
        com.squareup.okhttp.Call call = updateOrganizationAddressValidateBeforeCall(accessToken, address, addressId, null, null);
        return apiClient.execute(call);
    }

    /**
     * /addresses/{addressId} (asynchronously)
     * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
     * @param accessToken Samsara API access token. (required)
     * @param address Update parts of an address&#39;s value. If the geofence &#39;circle&#39; or &#39;polygon&#39; key is specified, the update will change the type of geofence accordingly. (required)
     * @param addressId ID of the address/geofence (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateOrganizationAddressAsync(String accessToken, Address address, Long addressId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateOrganizationAddressValidateBeforeCall(accessToken, address, addressId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for updateVehicles
     * @param accessToken Samsara API access token. (required)
     * @param vehicleUpdateParam  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateVehiclesCall(String accessToken, VehicleUpdateParam vehicleUpdateParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = vehicleUpdateParam;

        // create path and map variables
        String localVarPath = "/fleet/set_data";

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
    private com.squareup.okhttp.Call updateVehiclesValidateBeforeCall(String accessToken, VehicleUpdateParam vehicleUpdateParam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling updateVehicles(Async)");
        }
        
        // verify the required parameter 'vehicleUpdateParam' is set
        if (vehicleUpdateParam == null) {
            throw new ApiException("Missing the required parameter 'vehicleUpdateParam' when calling updateVehicles(Async)");
        }
        

        com.squareup.okhttp.Call call = updateVehiclesCall(accessToken, vehicleUpdateParam, progressListener, progressRequestListener);
        return call;

    }

    /**
     * /fleet/set_data
     * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleUpdateParam  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateVehicles(String accessToken, VehicleUpdateParam vehicleUpdateParam) throws ApiException {
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
    public ApiResponse<Void> updateVehiclesWithHttpInfo(String accessToken, VehicleUpdateParam vehicleUpdateParam) throws ApiException {
        com.squareup.okhttp.Call call = updateVehiclesValidateBeforeCall(accessToken, vehicleUpdateParam, null, null);
        return apiClient.execute(call);
    }

    /**
     * /fleet/set_data (asynchronously)
     * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
     * @param accessToken Samsara API access token. (required)
     * @param vehicleUpdateParam  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateVehiclesAsync(String accessToken, VehicleUpdateParam vehicleUpdateParam, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateVehiclesValidateBeforeCall(accessToken, vehicleUpdateParam, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
