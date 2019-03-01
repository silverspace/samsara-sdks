/**
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

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.CurrentDriver;
import io.swagger.client.model.Driver;
import io.swagger.client.model.DriverForCreate;
import io.swagger.client.model.ErrorResponse;
import io.swagger.client.model.ReactivateDriverParam;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class DriversApi {
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
  * /fleet/drivers/create
  * Create a new driver.
   * @param accessToken Samsara API access token.
   * @param createDriverParam Driver creation body
   * @return Driver
  */
  public Driver createDriver (String accessToken, DriverForCreate createDriverParam) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = createDriverParam;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling createDriver",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling createDriver"));
    }
    // verify the required parameter 'createDriverParam' is set
    if (createDriverParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'createDriverParam' when calling createDriver",
        new ApiException(400, "Missing the required parameter 'createDriverParam' when calling createDriver"));
    }

    // create path and map variables
    String path = "/fleet/drivers/create";

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
         return (Driver) ApiInvoker.deserialize(localVarResponse, "", Driver.class);
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
   * /fleet/drivers/create
   * Create a new driver.
   * @param accessToken Samsara API access token.   * @param createDriverParam Driver creation body
  */
  public void createDriver (String accessToken, DriverForCreate createDriverParam, final Response.Listener<Driver> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = createDriverParam;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling createDriver",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling createDriver"));
    }
    // verify the required parameter 'createDriverParam' is set
    if (createDriverParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'createDriverParam' when calling createDriver",
        new ApiException(400, "Missing the required parameter 'createDriverParam' when calling createDriver"));
    }

    // create path and map variables
    String path = "/fleet/drivers/create".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((Driver) ApiInvoker.deserialize(localVarResponse,  "", Driver.class));
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
  * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  * Deactivate a driver with the given id.
   * @param accessToken Samsara API access token.
   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
   * @return void
  */
  public void deactivateDriver (String accessToken, String driverIdOrExternalId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling deactivateDriver",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling deactivateDriver"));
    }
    // verify the required parameter 'driverIdOrExternalId' is set
    if (driverIdOrExternalId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'driverIdOrExternalId' when calling deactivateDriver",
        new ApiException(400, "Missing the required parameter 'driverIdOrExternalId' when calling deactivateDriver"));
    }

    // create path and map variables
    String path = "/fleet/drivers/{driver_id_or_external_id}".replaceAll("\\{" + "driver_id_or_external_id" + "\\}", apiInvoker.escapeString(driverIdOrExternalId.toString()));

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
   * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
   * Deactivate a driver with the given id.
   * @param accessToken Samsara API access token.   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
  */
  public void deactivateDriver (String accessToken, String driverIdOrExternalId, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling deactivateDriver",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling deactivateDriver"));
    }
    // verify the required parameter 'driverIdOrExternalId' is set
    if (driverIdOrExternalId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'driverIdOrExternalId' when calling deactivateDriver",
        new ApiException(400, "Missing the required parameter 'driverIdOrExternalId' when calling deactivateDriver"));
    }

    // create path and map variables
    String path = "/fleet/drivers/{driver_id_or_external_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "driver_id_or_external_id" + "\\}", apiInvoker.escapeString(driverIdOrExternalId.toString()));

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
  * /fleet/drivers/inactive
  * Fetch all deactivated drivers for the group.
   * @param accessToken Samsara API access token.
   * @param groupId Optional group ID if the organization has multiple groups (uncommon).
   * @return List<Driver>
  */
  public List<Driver> getAllDeactivatedDrivers (String accessToken, Long groupId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getAllDeactivatedDrivers",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getAllDeactivatedDrivers"));
    }

    // create path and map variables
    String path = "/fleet/drivers/inactive";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "group_id", groupId));
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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (List<Driver>) ApiInvoker.deserialize(localVarResponse, "array", Driver.class);
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
   * /fleet/drivers/inactive
   * Fetch all deactivated drivers for the group.
   * @param accessToken Samsara API access token.   * @param groupId Optional group ID if the organization has multiple groups (uncommon).
  */
  public void getAllDeactivatedDrivers (String accessToken, Long groupId, final Response.Listener<List<Driver>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getAllDeactivatedDrivers",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getAllDeactivatedDrivers"));
    }

    // create path and map variables
    String path = "/fleet/drivers/inactive".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "group_id", groupId));


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
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<Driver>) ApiInvoker.deserialize(localVarResponse,  "array", Driver.class));
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
  * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  * Fetch deactivated driver by id.
   * @param accessToken Samsara API access token.
   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
   * @return Driver
  */
  public Driver getDeactivatedDriverById (String accessToken, String driverIdOrExternalId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getDeactivatedDriverById",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getDeactivatedDriverById"));
    }
    // verify the required parameter 'driverIdOrExternalId' is set
    if (driverIdOrExternalId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'driverIdOrExternalId' when calling getDeactivatedDriverById",
        new ApiException(400, "Missing the required parameter 'driverIdOrExternalId' when calling getDeactivatedDriverById"));
    }

    // create path and map variables
    String path = "/fleet/drivers/inactive/{driver_id_or_external_id}".replaceAll("\\{" + "driver_id_or_external_id" + "\\}", apiInvoker.escapeString(driverIdOrExternalId.toString()));

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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Driver) ApiInvoker.deserialize(localVarResponse, "", Driver.class);
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
   * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
   * Fetch deactivated driver by id.
   * @param accessToken Samsara API access token.   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
  */
  public void getDeactivatedDriverById (String accessToken, String driverIdOrExternalId, final Response.Listener<Driver> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getDeactivatedDriverById",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getDeactivatedDriverById"));
    }
    // verify the required parameter 'driverIdOrExternalId' is set
    if (driverIdOrExternalId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'driverIdOrExternalId' when calling getDeactivatedDriverById",
        new ApiException(400, "Missing the required parameter 'driverIdOrExternalId' when calling getDeactivatedDriverById"));
    }

    // create path and map variables
    String path = "/fleet/drivers/inactive/{driver_id_or_external_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "driver_id_or_external_id" + "\\}", apiInvoker.escapeString(driverIdOrExternalId.toString()));

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
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Driver) ApiInvoker.deserialize(localVarResponse,  "", Driver.class));
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
  * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  * Fetch driver by id.
   * @param accessToken Samsara API access token.
   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
   * @return CurrentDriver
  */
  public CurrentDriver getDriverById (String accessToken, String driverIdOrExternalId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getDriverById",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getDriverById"));
    }
    // verify the required parameter 'driverIdOrExternalId' is set
    if (driverIdOrExternalId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'driverIdOrExternalId' when calling getDriverById",
        new ApiException(400, "Missing the required parameter 'driverIdOrExternalId' when calling getDriverById"));
    }

    // create path and map variables
    String path = "/fleet/drivers/{driver_id_or_external_id}".replaceAll("\\{" + "driver_id_or_external_id" + "\\}", apiInvoker.escapeString(driverIdOrExternalId.toString()));

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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (CurrentDriver) ApiInvoker.deserialize(localVarResponse, "", CurrentDriver.class);
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
   * /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
   * Fetch driver by id.
   * @param accessToken Samsara API access token.   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
  */
  public void getDriverById (String accessToken, String driverIdOrExternalId, final Response.Listener<CurrentDriver> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getDriverById",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getDriverById"));
    }
    // verify the required parameter 'driverIdOrExternalId' is set
    if (driverIdOrExternalId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'driverIdOrExternalId' when calling getDriverById",
        new ApiException(400, "Missing the required parameter 'driverIdOrExternalId' when calling getDriverById"));
    }

    // create path and map variables
    String path = "/fleet/drivers/{driver_id_or_external_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "driver_id_or_external_id" + "\\}", apiInvoker.escapeString(driverIdOrExternalId.toString()));

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
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((CurrentDriver) ApiInvoker.deserialize(localVarResponse,  "", CurrentDriver.class));
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
  * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  * Reactivate the inactive driver having id.
   * @param accessToken Samsara API access token.
   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
   * @param reactivateDriverParam Driver reactivation body
   * @return CurrentDriver
  */
  public CurrentDriver reactivateDriverById (String accessToken, String driverIdOrExternalId, ReactivateDriverParam reactivateDriverParam) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = reactivateDriverParam;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling reactivateDriverById",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling reactivateDriverById"));
    }
    // verify the required parameter 'driverIdOrExternalId' is set
    if (driverIdOrExternalId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'driverIdOrExternalId' when calling reactivateDriverById",
        new ApiException(400, "Missing the required parameter 'driverIdOrExternalId' when calling reactivateDriverById"));
    }
    // verify the required parameter 'reactivateDriverParam' is set
    if (reactivateDriverParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'reactivateDriverParam' when calling reactivateDriverById",
        new ApiException(400, "Missing the required parameter 'reactivateDriverParam' when calling reactivateDriverById"));
    }

    // create path and map variables
    String path = "/fleet/drivers/inactive/{driver_id_or_external_id}".replaceAll("\\{" + "driver_id_or_external_id" + "\\}", apiInvoker.escapeString(driverIdOrExternalId.toString()));

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
         return (CurrentDriver) ApiInvoker.deserialize(localVarResponse, "", CurrentDriver.class);
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
   * /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
   * Reactivate the inactive driver having id.
   * @param accessToken Samsara API access token.   * @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.   * @param reactivateDriverParam Driver reactivation body
  */
  public void reactivateDriverById (String accessToken, String driverIdOrExternalId, ReactivateDriverParam reactivateDriverParam, final Response.Listener<CurrentDriver> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = reactivateDriverParam;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling reactivateDriverById",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling reactivateDriverById"));
    }
    // verify the required parameter 'driverIdOrExternalId' is set
    if (driverIdOrExternalId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'driverIdOrExternalId' when calling reactivateDriverById",
        new ApiException(400, "Missing the required parameter 'driverIdOrExternalId' when calling reactivateDriverById"));
    }
    // verify the required parameter 'reactivateDriverParam' is set
    if (reactivateDriverParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'reactivateDriverParam' when calling reactivateDriverById",
        new ApiException(400, "Missing the required parameter 'reactivateDriverParam' when calling reactivateDriverById"));
    }

    // create path and map variables
    String path = "/fleet/drivers/inactive/{driver_id_or_external_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "driver_id_or_external_id" + "\\}", apiInvoker.escapeString(driverIdOrExternalId.toString()));

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
              responseListener.onResponse((CurrentDriver) ApiInvoker.deserialize(localVarResponse,  "", CurrentDriver.class));
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
