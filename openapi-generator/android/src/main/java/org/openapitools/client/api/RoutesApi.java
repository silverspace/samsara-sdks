/**
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

import org.openapitools.client.ApiInvoker;
import org.openapitools.client.ApiException;
import org.openapitools.client.Pair;

import org.openapitools.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.openapitools.client.model.AllRouteJobUpdates;
import org.openapitools.client.model.DispatchRoute;
import org.openapitools.client.model.DispatchRouteCreate;
import org.openapitools.client.model.DispatchRouteHistory;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class RoutesApi {
  String basePath = "https://api.samsara.com/v1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * /fleet/dispatch/routes
  * Create a new dispatch route.
   * @param accessToken Samsara API access token.
   * @param createDispatchRouteParams 
   * @return DispatchRoute
  */
  public DispatchRoute createDispatchRoute (String accessToken, DispatchRouteCreate createDispatchRouteParams) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = createDispatchRouteParams;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling createDispatchRoute",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling createDispatchRoute"));
    }
    // verify the required parameter 'createDispatchRouteParams' is set
    if (createDispatchRouteParams == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'createDispatchRouteParams' when calling createDispatchRoute",
        new ApiException(400, "Missing the required parameter 'createDispatchRouteParams' when calling createDispatchRoute"));
    }

    // create path and map variables
    String path = "/fleet/dispatch/routes";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (DispatchRoute) ApiInvoker.deserialize(localVarResponse, "", DispatchRoute.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * /fleet/dispatch/routes
   * Create a new dispatch route.
   * @param accessToken Samsara API access token.   * @param createDispatchRouteParams 
  */
  public void createDispatchRoute (String accessToken, DispatchRouteCreate createDispatchRouteParams, final Response.Listener<DispatchRoute> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = createDispatchRouteParams;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling createDispatchRoute",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling createDispatchRoute"));
    }
    // verify the required parameter 'createDispatchRouteParams' is set
    if (createDispatchRouteParams == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'createDispatchRouteParams' when calling createDispatchRoute",
        new ApiException(400, "Missing the required parameter 'createDispatchRouteParams' when calling createDispatchRoute"));
    }

    // create path and map variables
    String path = "/fleet/dispatch/routes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));


    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((DispatchRoute) ApiInvoker.deserialize(localVarResponse,  "", DispatchRoute.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
  * Create a new dispatch route for the driver with driver_id.
   * @param accessToken Samsara API access token.
   * @param driverId ID of the driver with the associated routes.
   * @param createDispatchRouteParams 
   * @return DispatchRoute
  */
  public DispatchRoute createDriverDispatchRoute (String accessToken, Long driverId, DispatchRouteCreate createDispatchRouteParams) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = createDispatchRouteParams;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling createDriverDispatchRoute",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling createDriverDispatchRoute"));
    }
    // verify the required parameter 'driverId' is set
    if (driverId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'driverId' when calling createDriverDispatchRoute",
        new ApiException(400, "Missing the required parameter 'driverId' when calling createDriverDispatchRoute"));
    }
    // verify the required parameter 'createDispatchRouteParams' is set
    if (createDispatchRouteParams == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'createDispatchRouteParams' when calling createDriverDispatchRoute",
        new ApiException(400, "Missing the required parameter 'createDispatchRouteParams' when calling createDriverDispatchRoute"));
    }

    // create path and map variables
    String path = "/fleet/drivers/{driver_id}/dispatch/routes".replaceAll("\\{" + "driver_id" + "\\}", apiInvoker.escapeString(driverId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (DispatchRoute) ApiInvoker.deserialize(localVarResponse, "", DispatchRoute.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
   * Create a new dispatch route for the driver with driver_id.
   * @param accessToken Samsara API access token.   * @param driverId ID of the driver with the associated routes.   * @param createDispatchRouteParams 
  */
  public void createDriverDispatchRoute (String accessToken, Long driverId, DispatchRouteCreate createDispatchRouteParams, final Response.Listener<DispatchRoute> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = createDispatchRouteParams;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling createDriverDispatchRoute",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling createDriverDispatchRoute"));
    }
    // verify the required parameter 'driverId' is set
    if (driverId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'driverId' when calling createDriverDispatchRoute",
        new ApiException(400, "Missing the required parameter 'driverId' when calling createDriverDispatchRoute"));
    }
    // verify the required parameter 'createDispatchRouteParams' is set
    if (createDispatchRouteParams == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'createDispatchRouteParams' when calling createDriverDispatchRoute",
        new ApiException(400, "Missing the required parameter 'createDispatchRouteParams' when calling createDriverDispatchRoute"));
    }

    // create path and map variables
    String path = "/fleet/drivers/{driver_id}/dispatch/routes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "driver_id" + "\\}", apiInvoker.escapeString(driverId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));


    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((DispatchRoute) ApiInvoker.deserialize(localVarResponse,  "", DispatchRoute.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
  * Create a new dispatch route for the vehicle with vehicle_id.
   * @param accessToken Samsara API access token.
   * @param vehicleId ID of the vehicle with the associated routes.
   * @param createDispatchRouteParams 
   * @return DispatchRoute
  */
  public DispatchRoute createVehicleDispatchRoute (String accessToken, Long vehicleId, DispatchRouteCreate createDispatchRouteParams) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = createDispatchRouteParams;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling createVehicleDispatchRoute",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling createVehicleDispatchRoute"));
    }
    // verify the required parameter 'vehicleId' is set
    if (vehicleId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'vehicleId' when calling createVehicleDispatchRoute",
        new ApiException(400, "Missing the required parameter 'vehicleId' when calling createVehicleDispatchRoute"));
    }
    // verify the required parameter 'createDispatchRouteParams' is set
    if (createDispatchRouteParams == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'createDispatchRouteParams' when calling createVehicleDispatchRoute",
        new ApiException(400, "Missing the required parameter 'createDispatchRouteParams' when calling createVehicleDispatchRoute"));
    }

    // create path and map variables
    String path = "/fleet/vehicles/{vehicle_id}/dispatch/routes".replaceAll("\\{" + "vehicle_id" + "\\}", apiInvoker.escapeString(vehicleId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (DispatchRoute) ApiInvoker.deserialize(localVarResponse, "", DispatchRoute.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
   * Create a new dispatch route for the vehicle with vehicle_id.
   * @param accessToken Samsara API access token.   * @param vehicleId ID of the vehicle with the associated routes.   * @param createDispatchRouteParams 
  */
  public void createVehicleDispatchRoute (String accessToken, Long vehicleId, DispatchRouteCreate createDispatchRouteParams, final Response.Listener<DispatchRoute> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = createDispatchRouteParams;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling createVehicleDispatchRoute",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling createVehicleDispatchRoute"));
    }
    // verify the required parameter 'vehicleId' is set
    if (vehicleId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'vehicleId' when calling createVehicleDispatchRoute",
        new ApiException(400, "Missing the required parameter 'vehicleId' when calling createVehicleDispatchRoute"));
    }
    // verify the required parameter 'createDispatchRouteParams' is set
    if (createDispatchRouteParams == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'createDispatchRouteParams' when calling createVehicleDispatchRoute",
        new ApiException(400, "Missing the required parameter 'createDispatchRouteParams' when calling createVehicleDispatchRoute"));
    }

    // create path and map variables
    String path = "/fleet/vehicles/{vehicle_id}/dispatch/routes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "vehicle_id" + "\\}", apiInvoker.escapeString(vehicleId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));


    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((DispatchRoute) ApiInvoker.deserialize(localVarResponse,  "", DispatchRoute.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * /fleet/dispatch/routes/{route_id:[0-9]+}/
  * Delete a dispatch route and its associated jobs.
   * @param accessToken Samsara API access token.
   * @param routeId ID of the dispatch route.
   * @return void
  */
  public void deleteDispatchRouteById (String accessToken, Long routeId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling deleteDispatchRouteById",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling deleteDispatchRouteById"));
    }
    // verify the required parameter 'routeId' is set
    if (routeId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'routeId' when calling deleteDispatchRouteById",
        new ApiException(400, "Missing the required parameter 'routeId' when calling deleteDispatchRouteById"));
    }

    // create path and map variables
    String path = "/fleet/dispatch/routes/{route_id}".replaceAll("\\{" + "route_id" + "\\}", apiInvoker.escapeString(routeId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return ;
      } else {
         return ;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * /fleet/dispatch/routes/{route_id:[0-9]+}/
   * Delete a dispatch route and its associated jobs.
   * @param accessToken Samsara API access token.   * @param routeId ID of the dispatch route.
  */
  public void deleteDispatchRouteById (String accessToken, Long routeId, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling deleteDispatchRouteById",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling deleteDispatchRouteById"));
    }
    // verify the required parameter 'routeId' is set
    if (routeId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'routeId' when calling deleteDispatchRouteById",
        new ApiException(400, "Missing the required parameter 'routeId' when calling deleteDispatchRouteById"));
    }

    // create path and map variables
    String path = "/fleet/dispatch/routes/{route_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "route_id" + "\\}", apiInvoker.escapeString(routeId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
              responseListener.onResponse(localVarResponse);
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * /fleet/dispatch/routes
  * Fetch all of the dispatch routes for the group.
   * @param accessToken Samsara API access token.
   * @param groupId Optional group ID if the organization has multiple groups (uncommon).
   * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
   * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
   * @return List<DispatchRoute>
  */
  public List<DispatchRoute> fetchAllDispatchRoutes (String accessToken, Long groupId, Long endTime, Long duration) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling fetchAllDispatchRoutes",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling fetchAllDispatchRoutes"));
    }

    // create path and map variables
    String path = "/fleet/dispatch/routes";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "group_id", groupId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_time", endTime));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "duration", duration));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (List<DispatchRoute>) ApiInvoker.deserialize(localVarResponse, "array", DispatchRoute.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * /fleet/dispatch/routes
   * Fetch all of the dispatch routes for the group.
   * @param accessToken Samsara API access token.   * @param groupId Optional group ID if the organization has multiple groups (uncommon).   * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.   * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
  */
  public void fetchAllDispatchRoutes (String accessToken, Long groupId, Long endTime, Long duration, final Response.Listener<List<DispatchRoute>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling fetchAllDispatchRoutes",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling fetchAllDispatchRoutes"));
    }

    // create path and map variables
    String path = "/fleet/dispatch/routes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "group_id", groupId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_time", endTime));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "duration", duration));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<DispatchRoute>) ApiInvoker.deserialize(localVarResponse,  "array", DispatchRoute.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * /fleet/dispatch/routes/job_updates
  * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
   * @param accessToken Samsara API access token.
   * @param groupId Optional group ID if the organization has multiple groups (uncommon).
   * @param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
   * @param include Optionally set include&#x3D;route to include route object in response payload.
   * @return AllRouteJobUpdates
  */
  public AllRouteJobUpdates fetchAllRouteJobUpdates (String accessToken, Long groupId, String sequenceId, String include) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling fetchAllRouteJobUpdates",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling fetchAllRouteJobUpdates"));
    }

    // create path and map variables
    String path = "/fleet/dispatch/routes/job_updates";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "group_id", groupId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sequence_id", sequenceId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "include", include));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (AllRouteJobUpdates) ApiInvoker.deserialize(localVarResponse, "", AllRouteJobUpdates.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * /fleet/dispatch/routes/job_updates
   * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
   * @param accessToken Samsara API access token.   * @param groupId Optional group ID if the organization has multiple groups (uncommon).   * @param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.   * @param include Optionally set include&#x3D;route to include route object in response payload.
  */
  public void fetchAllRouteJobUpdates (String accessToken, Long groupId, String sequenceId, String include, final Response.Listener<AllRouteJobUpdates> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling fetchAllRouteJobUpdates",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling fetchAllRouteJobUpdates"));
    }

    // create path and map variables
    String path = "/fleet/dispatch/routes/job_updates".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "group_id", groupId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sequence_id", sequenceId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "include", include));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((AllRouteJobUpdates) ApiInvoker.deserialize(localVarResponse,  "", AllRouteJobUpdates.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * /fleet/dispatch/routes/{route_id:[0-9]+}
  * Fetch a dispatch route by id.
   * @param accessToken Samsara API access token.
   * @param routeId ID of the dispatch route.
   * @return DispatchRoute
  */
  public DispatchRoute getDispatchRouteById (String accessToken, Long routeId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getDispatchRouteById",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getDispatchRouteById"));
    }
    // verify the required parameter 'routeId' is set
    if (routeId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'routeId' when calling getDispatchRouteById",
        new ApiException(400, "Missing the required parameter 'routeId' when calling getDispatchRouteById"));
    }

    // create path and map variables
    String path = "/fleet/dispatch/routes/{route_id}".replaceAll("\\{" + "route_id" + "\\}", apiInvoker.escapeString(routeId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (DispatchRoute) ApiInvoker.deserialize(localVarResponse, "", DispatchRoute.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * /fleet/dispatch/routes/{route_id:[0-9]+}
   * Fetch a dispatch route by id.
   * @param accessToken Samsara API access token.   * @param routeId ID of the dispatch route.
  */
  public void getDispatchRouteById (String accessToken, Long routeId, final Response.Listener<DispatchRoute> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getDispatchRouteById",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getDispatchRouteById"));
    }
    // verify the required parameter 'routeId' is set
    if (routeId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'routeId' when calling getDispatchRouteById",
        new ApiException(400, "Missing the required parameter 'routeId' when calling getDispatchRouteById"));
    }

    // create path and map variables
    String path = "/fleet/dispatch/routes/{route_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "route_id" + "\\}", apiInvoker.escapeString(routeId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((DispatchRoute) ApiInvoker.deserialize(localVarResponse,  "", DispatchRoute.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * /fleet/dispatch/routes/{route_id:[0-9]+}/history
  * Fetch the history of a dispatch route.
   * @param accessToken Samsara API access token.
   * @param routeId ID of the route with history.
   * @param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
   * @param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
   * @return DispatchRouteHistory
  */
  public DispatchRouteHistory getDispatchRouteHistory (String accessToken, Long routeId, Long startTime, Long endTime) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getDispatchRouteHistory",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getDispatchRouteHistory"));
    }
    // verify the required parameter 'routeId' is set
    if (routeId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'routeId' when calling getDispatchRouteHistory",
        new ApiException(400, "Missing the required parameter 'routeId' when calling getDispatchRouteHistory"));
    }

    // create path and map variables
    String path = "/fleet/dispatch/routes/{route_id}/history".replaceAll("\\{" + "route_id" + "\\}", apiInvoker.escapeString(routeId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "start_time", startTime));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_time", endTime));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (DispatchRouteHistory) ApiInvoker.deserialize(localVarResponse, "", DispatchRouteHistory.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * /fleet/dispatch/routes/{route_id:[0-9]+}/history
   * Fetch the history of a dispatch route.
   * @param accessToken Samsara API access token.   * @param routeId ID of the route with history.   * @param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.   * @param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
  */
  public void getDispatchRouteHistory (String accessToken, Long routeId, Long startTime, Long endTime, final Response.Listener<DispatchRouteHistory> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getDispatchRouteHistory",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getDispatchRouteHistory"));
    }
    // verify the required parameter 'routeId' is set
    if (routeId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'routeId' when calling getDispatchRouteHistory",
        new ApiException(400, "Missing the required parameter 'routeId' when calling getDispatchRouteHistory"));
    }

    // create path and map variables
    String path = "/fleet/dispatch/routes/{route_id}/history".replaceAll("\\{format\\}","json").replaceAll("\\{" + "route_id" + "\\}", apiInvoker.escapeString(routeId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "start_time", startTime));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_time", endTime));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((DispatchRouteHistory) ApiInvoker.deserialize(localVarResponse,  "", DispatchRouteHistory.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
  * Fetch all of the dispatch routes for a given driver.
   * @param accessToken Samsara API access token.
   * @param driverId ID of the driver with the associated routes.
   * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
   * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
   * @return List<DispatchRoute>
  */
  public List<DispatchRoute> getDispatchRoutesByDriverId (String accessToken, Long driverId, Long endTime, Long duration) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getDispatchRoutesByDriverId",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getDispatchRoutesByDriverId"));
    }
    // verify the required parameter 'driverId' is set
    if (driverId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'driverId' when calling getDispatchRoutesByDriverId",
        new ApiException(400, "Missing the required parameter 'driverId' when calling getDispatchRoutesByDriverId"));
    }

    // create path and map variables
    String path = "/fleet/drivers/{driver_id}/dispatch/routes".replaceAll("\\{" + "driver_id" + "\\}", apiInvoker.escapeString(driverId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_time", endTime));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "duration", duration));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (List<DispatchRoute>) ApiInvoker.deserialize(localVarResponse, "array", DispatchRoute.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
   * Fetch all of the dispatch routes for a given driver.
   * @param accessToken Samsara API access token.   * @param driverId ID of the driver with the associated routes.   * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.   * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
  */
  public void getDispatchRoutesByDriverId (String accessToken, Long driverId, Long endTime, Long duration, final Response.Listener<List<DispatchRoute>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getDispatchRoutesByDriverId",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getDispatchRoutesByDriverId"));
    }
    // verify the required parameter 'driverId' is set
    if (driverId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'driverId' when calling getDispatchRoutesByDriverId",
        new ApiException(400, "Missing the required parameter 'driverId' when calling getDispatchRoutesByDriverId"));
    }

    // create path and map variables
    String path = "/fleet/drivers/{driver_id}/dispatch/routes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "driver_id" + "\\}", apiInvoker.escapeString(driverId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_time", endTime));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "duration", duration));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<DispatchRoute>) ApiInvoker.deserialize(localVarResponse,  "array", DispatchRoute.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
  * Fetch all of the dispatch routes for a given vehicle.
   * @param accessToken Samsara API access token.
   * @param vehicleId ID of the vehicle with the associated routes.
   * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
   * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
   * @return List<DispatchRoute>
  */
  public List<DispatchRoute> getDispatchRoutesByVehicleId (String accessToken, Long vehicleId, Long endTime, Long duration) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getDispatchRoutesByVehicleId",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getDispatchRoutesByVehicleId"));
    }
    // verify the required parameter 'vehicleId' is set
    if (vehicleId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'vehicleId' when calling getDispatchRoutesByVehicleId",
        new ApiException(400, "Missing the required parameter 'vehicleId' when calling getDispatchRoutesByVehicleId"));
    }

    // create path and map variables
    String path = "/fleet/vehicles/{vehicle_id}/dispatch/routes".replaceAll("\\{" + "vehicle_id" + "\\}", apiInvoker.escapeString(vehicleId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_time", endTime));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "duration", duration));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (List<DispatchRoute>) ApiInvoker.deserialize(localVarResponse, "array", DispatchRoute.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
   * Fetch all of the dispatch routes for a given vehicle.
   * @param accessToken Samsara API access token.   * @param vehicleId ID of the vehicle with the associated routes.   * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.   * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
  */
  public void getDispatchRoutesByVehicleId (String accessToken, Long vehicleId, Long endTime, Long duration, final Response.Listener<List<DispatchRoute>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getDispatchRoutesByVehicleId",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getDispatchRoutesByVehicleId"));
    }
    // verify the required parameter 'vehicleId' is set
    if (vehicleId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'vehicleId' when calling getDispatchRoutesByVehicleId",
        new ApiException(400, "Missing the required parameter 'vehicleId' when calling getDispatchRoutesByVehicleId"));
    }

    // create path and map variables
    String path = "/fleet/vehicles/{vehicle_id}/dispatch/routes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "vehicle_id" + "\\}", apiInvoker.escapeString(vehicleId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_time", endTime));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "duration", duration));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<DispatchRoute>) ApiInvoker.deserialize(localVarResponse,  "array", DispatchRoute.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * /fleet/dispatch/routes/{route_id:[0-9]+}/
  * Update a dispatch route and its associated jobs.
   * @param accessToken Samsara API access token.
   * @param routeId ID of the dispatch route.
   * @param updateDispatchRouteParams 
   * @return DispatchRoute
  */
  public DispatchRoute updateDispatchRouteById (String accessToken, Long routeId, DispatchRoute updateDispatchRouteParams) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = updateDispatchRouteParams;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling updateDispatchRouteById",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling updateDispatchRouteById"));
    }
    // verify the required parameter 'routeId' is set
    if (routeId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'routeId' when calling updateDispatchRouteById",
        new ApiException(400, "Missing the required parameter 'routeId' when calling updateDispatchRouteById"));
    }
    // verify the required parameter 'updateDispatchRouteParams' is set
    if (updateDispatchRouteParams == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'updateDispatchRouteParams' when calling updateDispatchRouteById",
        new ApiException(400, "Missing the required parameter 'updateDispatchRouteParams' when calling updateDispatchRouteById"));
    }

    // create path and map variables
    String path = "/fleet/dispatch/routes/{route_id}".replaceAll("\\{" + "route_id" + "\\}", apiInvoker.escapeString(routeId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (DispatchRoute) ApiInvoker.deserialize(localVarResponse, "", DispatchRoute.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * /fleet/dispatch/routes/{route_id:[0-9]+}/
   * Update a dispatch route and its associated jobs.
   * @param accessToken Samsara API access token.   * @param routeId ID of the dispatch route.   * @param updateDispatchRouteParams 
  */
  public void updateDispatchRouteById (String accessToken, Long routeId, DispatchRoute updateDispatchRouteParams, final Response.Listener<DispatchRoute> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = updateDispatchRouteParams;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling updateDispatchRouteById",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling updateDispatchRouteById"));
    }
    // verify the required parameter 'routeId' is set
    if (routeId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'routeId' when calling updateDispatchRouteById",
        new ApiException(400, "Missing the required parameter 'routeId' when calling updateDispatchRouteById"));
    }
    // verify the required parameter 'updateDispatchRouteParams' is set
    if (updateDispatchRouteParams == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'updateDispatchRouteParams' when calling updateDispatchRouteById",
        new ApiException(400, "Missing the required parameter 'updateDispatchRouteParams' when calling updateDispatchRouteById"));
    }

    // create path and map variables
    String path = "/fleet/dispatch/routes/{route_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "route_id" + "\\}", apiInvoker.escapeString(routeId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));


    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((DispatchRoute) ApiInvoker.deserialize(localVarResponse,  "", DispatchRoute.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
