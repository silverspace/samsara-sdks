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

import org.openapitools.client.model.DataInputHistoryResponse;
import org.openapitools.client.model.InlineObject17;
import org.openapitools.client.model.InlineObject18;
import org.openapitools.client.model.InlineResponse2006;
import org.openapitools.client.model.InlineResponse2007;
import org.openapitools.client.model.MachineHistoryResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class IndustrialApi {
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
  * /industrial/data
  * Fetch all of the data inputs for a group.
   * @param accessToken Samsara API access token.
   * @param groupId Optional group ID if the organization has multiple groups (uncommon).
   * @param startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
   * @param endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
   * @return InlineResponse2006
  */
  public InlineResponse2006 getAllDataInputs (String accessToken, Long groupId, Long startMs, Long endMs) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getAllDataInputs",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getAllDataInputs"));
    }

    // create path and map variables
    String path = "/industrial/data";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "group_id", groupId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "startMs", startMs));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "endMs", endMs));
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
         return (InlineResponse2006) ApiInvoker.deserialize(localVarResponse, "", InlineResponse2006.class);
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
   * /industrial/data
   * Fetch all of the data inputs for a group.
   * @param accessToken Samsara API access token.   * @param groupId Optional group ID if the organization has multiple groups (uncommon).   * @param startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.   * @param endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
  */
  public void getAllDataInputs (String accessToken, Long groupId, Long startMs, Long endMs, final Response.Listener<InlineResponse2006> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getAllDataInputs",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getAllDataInputs"));
    }

    // create path and map variables
    String path = "/industrial/data".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "group_id", groupId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "startMs", startMs));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "endMs", endMs));


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
              responseListener.onResponse((InlineResponse2006) ApiInvoker.deserialize(localVarResponse,  "", InlineResponse2006.class));
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
  * /industrial/data/{data_input_id:[0-9]+}
  * Fetch datapoints from a given data input.
   * @param accessToken Samsara API access token.
   * @param dataInputId ID of the data input
   * @param startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
   * @param endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
   * @return DataInputHistoryResponse
  */
  public DataInputHistoryResponse getDataInput (String accessToken, Long dataInputId, Long startMs, Long endMs) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getDataInput",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getDataInput"));
    }
    // verify the required parameter 'dataInputId' is set
    if (dataInputId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'dataInputId' when calling getDataInput",
        new ApiException(400, "Missing the required parameter 'dataInputId' when calling getDataInput"));
    }

    // create path and map variables
    String path = "/industrial/data/{data_input_id}".replaceAll("\\{" + "data_input_id" + "\\}", apiInvoker.escapeString(dataInputId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "startMs", startMs));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "endMs", endMs));
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
         return (DataInputHistoryResponse) ApiInvoker.deserialize(localVarResponse, "", DataInputHistoryResponse.class);
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
   * /industrial/data/{data_input_id:[0-9]+}
   * Fetch datapoints from a given data input.
   * @param accessToken Samsara API access token.   * @param dataInputId ID of the data input   * @param startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.   * @param endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
  */
  public void getDataInput (String accessToken, Long dataInputId, Long startMs, Long endMs, final Response.Listener<DataInputHistoryResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getDataInput",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getDataInput"));
    }
    // verify the required parameter 'dataInputId' is set
    if (dataInputId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'dataInputId' when calling getDataInput",
        new ApiException(400, "Missing the required parameter 'dataInputId' when calling getDataInput"));
    }

    // create path and map variables
    String path = "/industrial/data/{data_input_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "data_input_id" + "\\}", apiInvoker.escapeString(dataInputId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "startMs", startMs));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "endMs", endMs));


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
              responseListener.onResponse((DataInputHistoryResponse) ApiInvoker.deserialize(localVarResponse,  "", DataInputHistoryResponse.class));
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
  * /machines/list
  * Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
   * @param accessToken Samsara API access token.
   * @param groupParam 
   * @return InlineResponse2007
  */
  public InlineResponse2007 getMachines (String accessToken, InlineObject18 groupParam) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = groupParam;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getMachines",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getMachines"));
    }
    // verify the required parameter 'groupParam' is set
    if (groupParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'groupParam' when calling getMachines",
        new ApiException(400, "Missing the required parameter 'groupParam' when calling getMachines"));
    }

    // create path and map variables
    String path = "/machines/list";

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
         return (InlineResponse2007) ApiInvoker.deserialize(localVarResponse, "", InlineResponse2007.class);
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
   * /machines/list
   * Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
   * @param accessToken Samsara API access token.   * @param groupParam 
  */
  public void getMachines (String accessToken, InlineObject18 groupParam, final Response.Listener<InlineResponse2007> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = groupParam;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getMachines",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getMachines"));
    }
    // verify the required parameter 'groupParam' is set
    if (groupParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'groupParam' when calling getMachines",
        new ApiException(400, "Missing the required parameter 'groupParam' when calling getMachines"));
    }

    // create path and map variables
    String path = "/machines/list".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((InlineResponse2007) ApiInvoker.deserialize(localVarResponse,  "", InlineResponse2007.class));
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
  * /machines/history
  * Get historical data for machine objects. This method returns a set of historical data for all machines in a group
   * @param accessToken Samsara API access token.
   * @param historyParam 
   * @return MachineHistoryResponse
  */
  public MachineHistoryResponse getMachinesHistory (String accessToken, InlineObject17 historyParam) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = historyParam;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getMachinesHistory",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getMachinesHistory"));
    }
    // verify the required parameter 'historyParam' is set
    if (historyParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'historyParam' when calling getMachinesHistory",
        new ApiException(400, "Missing the required parameter 'historyParam' when calling getMachinesHistory"));
    }

    // create path and map variables
    String path = "/machines/history";

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
         return (MachineHistoryResponse) ApiInvoker.deserialize(localVarResponse, "", MachineHistoryResponse.class);
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
   * /machines/history
   * Get historical data for machine objects. This method returns a set of historical data for all machines in a group
   * @param accessToken Samsara API access token.   * @param historyParam 
  */
  public void getMachinesHistory (String accessToken, InlineObject17 historyParam, final Response.Listener<MachineHistoryResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = historyParam;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getMachinesHistory",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getMachinesHistory"));
    }
    // verify the required parameter 'historyParam' is set
    if (historyParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'historyParam' when calling getMachinesHistory",
        new ApiException(400, "Missing the required parameter 'historyParam' when calling getMachinesHistory"));
    }

    // create path and map variables
    String path = "/machines/history".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((MachineHistoryResponse) ApiInvoker.deserialize(localVarResponse,  "", MachineHistoryResponse.class));
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
