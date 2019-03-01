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
import io.swagger.client.model.ErrorResponse;
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

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class FleetApi {
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
  * /fleet/add_address
  * This method adds an address book entry to the specified group.
   * @param accessToken Samsara API access token.
   * @param addressParam 
   * @return void
  */
  public void addFleetAddress (String accessToken, AddressParam addressParam) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = addressParam;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling addFleetAddress",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling addFleetAddress"));
    }
    // verify the required parameter 'addressParam' is set
    if (addressParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'addressParam' when calling addFleetAddress",
        new ApiException(400, "Missing the required parameter 'addressParam' when calling addFleetAddress"));
    }

    // create path and map variables
    String path = "/fleet/add_address";

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
   * /fleet/add_address
   * This method adds an address book entry to the specified group.
   * @param accessToken Samsara API access token.   * @param addressParam 
  */
  public void addFleetAddress (String accessToken, AddressParam addressParam, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = addressParam;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling addFleetAddress",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling addFleetAddress"));
    }
    // verify the required parameter 'addressParam' is set
    if (addressParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'addressParam' when calling addFleetAddress",
        new ApiException(400, "Missing the required parameter 'addressParam' when calling addFleetAddress"));
    }

    // create path and map variables
    String path = "/fleet/add_address".replaceAll("\\{format\\}","json");

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
  * /addresses
  * Add one or more addresses to the organization
   * @param accessToken Samsara API access token.
   * @param addresses List of addresses/geofences to add. Geofences can be circular or a polygon.  For each address, only one of &#39;circle&#39; or &#39;polygon&#39; should be provided. If both are provided, the geofence will be saved as a polygon.
   * @return List<Address>
  */
  public List<Address> addOrganizationAddresses (String accessToken, Addresses addresses) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = addresses;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling addOrganizationAddresses",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling addOrganizationAddresses"));
    }
    // verify the required parameter 'addresses' is set
    if (addresses == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'addresses' when calling addOrganizationAddresses",
        new ApiException(400, "Missing the required parameter 'addresses' when calling addOrganizationAddresses"));
    }

    // create path and map variables
    String path = "/addresses";

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
         return (List<Address>) ApiInvoker.deserialize(localVarResponse, "array", Address.class);
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
   * /addresses
   * Add one or more addresses to the organization
   * @param accessToken Samsara API access token.   * @param addresses List of addresses/geofences to add. Geofences can be circular or a polygon.  For each address, only one of &#39;circle&#39; or &#39;polygon&#39; should be provided. If both are provided, the geofence will be saved as a polygon.
  */
  public void addOrganizationAddresses (String accessToken, Addresses addresses, final Response.Listener<List<Address>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = addresses;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling addOrganizationAddresses",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling addOrganizationAddresses"));
    }
    // verify the required parameter 'addresses' is set
    if (addresses == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'addresses' when calling addOrganizationAddresses",
        new ApiException(400, "Missing the required parameter 'addresses' when calling addOrganizationAddresses"));
    }

    // create path and map variables
    String path = "/addresses".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((List<Address>) ApiInvoker.deserialize(localVarResponse,  "array", Address.class));
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
  * /fleet/drivers/{driver_id:[0-9]+}/documents
  * Create a driver document for the given driver.
   * @param accessToken Samsara API access token.
   * @param driverId ID of the driver for whom the document is created.
   * @param createDocumentParams To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
   * @return Document
  */
  public Document createDriverDocument (String accessToken, Long driverId, DocumentCreate createDocumentParams) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = createDocumentParams;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling createDriverDocument",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling createDriverDocument"));
    }
    // verify the required parameter 'driverId' is set
    if (driverId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'driverId' when calling createDriverDocument",
        new ApiException(400, "Missing the required parameter 'driverId' when calling createDriverDocument"));
    }
    // verify the required parameter 'createDocumentParams' is set
    if (createDocumentParams == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'createDocumentParams' when calling createDriverDocument",
        new ApiException(400, "Missing the required parameter 'createDocumentParams' when calling createDriverDocument"));
    }

    // create path and map variables
    String path = "/fleet/drivers/{driver_id}/documents".replaceAll("\\{" + "driver_id" + "\\}", apiInvoker.escapeString(driverId.toString()));

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
         return (Document) ApiInvoker.deserialize(localVarResponse, "", Document.class);
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
   * /fleet/drivers/{driver_id:[0-9]+}/documents
   * Create a driver document for the given driver.
   * @param accessToken Samsara API access token.   * @param driverId ID of the driver for whom the document is created.   * @param createDocumentParams To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
  */
  public void createDriverDocument (String accessToken, Long driverId, DocumentCreate createDocumentParams, final Response.Listener<Document> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = createDocumentParams;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling createDriverDocument",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling createDriverDocument"));
    }
    // verify the required parameter 'driverId' is set
    if (driverId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'driverId' when calling createDriverDocument",
        new ApiException(400, "Missing the required parameter 'driverId' when calling createDriverDocument"));
    }
    // verify the required parameter 'createDocumentParams' is set
    if (createDocumentParams == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'createDocumentParams' when calling createDriverDocument",
        new ApiException(400, "Missing the required parameter 'createDocumentParams' when calling createDriverDocument"));
    }

    // create path and map variables
    String path = "/fleet/drivers/{driver_id}/documents".replaceAll("\\{format\\}","json").replaceAll("\\{" + "driver_id" + "\\}", apiInvoker.escapeString(driverId.toString()));

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
              responseListener.onResponse((Document) ApiInvoker.deserialize(localVarResponse,  "", Document.class));
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
  * /fleet/maintenance/dvirs
  * Create a new dvir, marking a vehicle or trailer safe or unsafe.
   * @param accessToken Samsara API access token.
   * @param createDvirParam DVIR creation body
   * @return DvirBase
  */
  public DvirBase createDvir (String accessToken, CreateDvirParam createDvirParam) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = createDvirParam;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling createDvir",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling createDvir"));
    }
    // verify the required parameter 'createDvirParam' is set
    if (createDvirParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'createDvirParam' when calling createDvir",
        new ApiException(400, "Missing the required parameter 'createDvirParam' when calling createDvir"));
    }

    // create path and map variables
    String path = "/fleet/maintenance/dvirs";

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
         return (DvirBase) ApiInvoker.deserialize(localVarResponse, "", DvirBase.class);
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
   * /fleet/maintenance/dvirs
   * Create a new dvir, marking a vehicle or trailer safe or unsafe.
   * @param accessToken Samsara API access token.   * @param createDvirParam DVIR creation body
  */
  public void createDvir (String accessToken, CreateDvirParam createDvirParam, final Response.Listener<DvirBase> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = createDvirParam;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling createDvir",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling createDvir"));
    }
    // verify the required parameter 'createDvirParam' is set
    if (createDvirParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'createDvirParam' when calling createDvir",
        new ApiException(400, "Missing the required parameter 'createDvirParam' when calling createDvir"));
    }

    // create path and map variables
    String path = "/fleet/maintenance/dvirs".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((DvirBase) ApiInvoker.deserialize(localVarResponse,  "", DvirBase.class));
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
  * /addresses/{addressId}
  * Delete an address.
   * @param accessToken Samsara API access token.
   * @param addressId ID of the address/geofence
   * @return void
  */
  public void deleteOrganizationAddress (String accessToken, Long addressId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling deleteOrganizationAddress",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling deleteOrganizationAddress"));
    }
    // verify the required parameter 'addressId' is set
    if (addressId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'addressId' when calling deleteOrganizationAddress",
        new ApiException(400, "Missing the required parameter 'addressId' when calling deleteOrganizationAddress"));
    }

    // create path and map variables
    String path = "/addresses/{addressId}".replaceAll("\\{" + "addressId" + "\\}", apiInvoker.escapeString(addressId.toString()));

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
   * /addresses/{addressId}
   * Delete an address.
   * @param accessToken Samsara API access token.   * @param addressId ID of the address/geofence
  */
  public void deleteOrganizationAddress (String accessToken, Long addressId, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling deleteOrganizationAddress",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling deleteOrganizationAddress"));
    }
    // verify the required parameter 'addressId' is set
    if (addressId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'addressId' when calling deleteOrganizationAddress",
        new ApiException(400, "Missing the required parameter 'addressId' when calling deleteOrganizationAddress"));
    }

    // create path and map variables
    String path = "/addresses/{addressId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "addressId" + "\\}", apiInvoker.escapeString(addressId.toString()));

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
  * /fleet/dispatch/routes
  * Fetch all of the dispatch routes for the group.
   * @param accessToken Samsara API access token.
   * @param groupId Optional group ID if the organization has multiple groups (uncommon).
   * @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
   * @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
   * @return DispatchRoutes
  */
  public DispatchRoutes fetchAllDispatchRoutes (String accessToken, Long groupId, Long endTime, Long duration) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
         return (DispatchRoutes) ApiInvoker.deserialize(localVarResponse, "", DispatchRoutes.class);
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
  public void fetchAllDispatchRoutes (String accessToken, Long groupId, Long endTime, Long duration, final Response.Listener<DispatchRoutes> responseListener, final Response.ErrorListener errorListener) {
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
              responseListener.onResponse((DispatchRoutes) ApiInvoker.deserialize(localVarResponse,  "", DispatchRoutes.class));
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
  * /fleet/assets/locations
  * Fetch current locations of all assets for the group.
   * @param accessToken Samsara API access token.
   * @param groupId Optional group ID if the organization has multiple groups (uncommon).
   * @return InlineResponse2001
  */
  public InlineResponse2001 getAllAssetCurrentLocations (String accessToken, Long groupId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getAllAssetCurrentLocations",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getAllAssetCurrentLocations"));
    }

    // create path and map variables
    String path = "/fleet/assets/locations";

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
         return (InlineResponse2001) ApiInvoker.deserialize(localVarResponse, "", InlineResponse2001.class);
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
   * /fleet/assets/locations
   * Fetch current locations of all assets for the group.
   * @param accessToken Samsara API access token.   * @param groupId Optional group ID if the organization has multiple groups (uncommon).
  */
  public void getAllAssetCurrentLocations (String accessToken, Long groupId, final Response.Listener<InlineResponse2001> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getAllAssetCurrentLocations",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getAllAssetCurrentLocations"));
    }

    // create path and map variables
    String path = "/fleet/assets/locations".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((InlineResponse2001) ApiInvoker.deserialize(localVarResponse,  "", InlineResponse2001.class));
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
  * /fleet/assets
  * Fetch all of the assets for the group.
   * @param accessToken Samsara API access token.
   * @param groupId Optional group ID if the organization has multiple groups (uncommon).
   * @return InlineResponse200
  */
  public InlineResponse200 getAllAssets (String accessToken, Long groupId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getAllAssets",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getAllAssets"));
    }

    // create path and map variables
    String path = "/fleet/assets";

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
         return (InlineResponse200) ApiInvoker.deserialize(localVarResponse, "", InlineResponse200.class);
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
   * /fleet/assets
   * Fetch all of the assets for the group.
   * @param accessToken Samsara API access token.   * @param groupId Optional group ID if the organization has multiple groups (uncommon).
  */
  public void getAllAssets (String accessToken, Long groupId, final Response.Listener<InlineResponse200> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getAllAssets",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getAllAssets"));
    }

    // create path and map variables
    String path = "/fleet/assets".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((InlineResponse200) ApiInvoker.deserialize(localVarResponse,  "", InlineResponse200.class));
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
  * /fleet/assets/{assetId:[0-9]+}/locations
  * Fetch the historical locations for the asset.
   * @param accessToken Samsara API access token.
   * @param assetId ID of the asset
   * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
   * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
   * @return AssetLocationResponse
  */
  public AssetLocationResponse getAssetLocation (String accessToken, Long assetId, Long startMs, Long endMs) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getAssetLocation",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getAssetLocation"));
    }
    // verify the required parameter 'assetId' is set
    if (assetId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'assetId' when calling getAssetLocation",
        new ApiException(400, "Missing the required parameter 'assetId' when calling getAssetLocation"));
    }
    // verify the required parameter 'startMs' is set
    if (startMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startMs' when calling getAssetLocation",
        new ApiException(400, "Missing the required parameter 'startMs' when calling getAssetLocation"));
    }
    // verify the required parameter 'endMs' is set
    if (endMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endMs' when calling getAssetLocation",
        new ApiException(400, "Missing the required parameter 'endMs' when calling getAssetLocation"));
    }

    // create path and map variables
    String path = "/fleet/assets/{asset_id}/locations".replaceAll("\\{" + "asset_id" + "\\}", apiInvoker.escapeString(assetId.toString()));

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
         return (AssetLocationResponse) ApiInvoker.deserialize(localVarResponse, "", AssetLocationResponse.class);
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
   * /fleet/assets/{assetId:[0-9]+}/locations
   * Fetch the historical locations for the asset.
   * @param accessToken Samsara API access token.   * @param assetId ID of the asset   * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.   * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
  */
  public void getAssetLocation (String accessToken, Long assetId, Long startMs, Long endMs, final Response.Listener<AssetLocationResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getAssetLocation",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getAssetLocation"));
    }
    // verify the required parameter 'assetId' is set
    if (assetId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'assetId' when calling getAssetLocation",
        new ApiException(400, "Missing the required parameter 'assetId' when calling getAssetLocation"));
    }
    // verify the required parameter 'startMs' is set
    if (startMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startMs' when calling getAssetLocation",
        new ApiException(400, "Missing the required parameter 'startMs' when calling getAssetLocation"));
    }
    // verify the required parameter 'endMs' is set
    if (endMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endMs' when calling getAssetLocation",
        new ApiException(400, "Missing the required parameter 'endMs' when calling getAssetLocation"));
    }

    // create path and map variables
    String path = "/fleet/assets/{asset_id}/locations".replaceAll("\\{format\\}","json").replaceAll("\\{" + "asset_id" + "\\}", apiInvoker.escapeString(assetId.toString()));

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
              responseListener.onResponse((AssetLocationResponse) ApiInvoker.deserialize(localVarResponse,  "", AssetLocationResponse.class));
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
  * /fleet/assets/{assetId:[0-9]+}/reefer
  * Fetch the reefer-specific stats of an asset.
   * @param accessToken Samsara API access token.
   * @param assetId ID of the asset
   * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
   * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
   * @return AssetReeferResponse
  */
  public AssetReeferResponse getAssetReefer (String accessToken, Long assetId, Long startMs, Long endMs) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getAssetReefer",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getAssetReefer"));
    }
    // verify the required parameter 'assetId' is set
    if (assetId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'assetId' when calling getAssetReefer",
        new ApiException(400, "Missing the required parameter 'assetId' when calling getAssetReefer"));
    }
    // verify the required parameter 'startMs' is set
    if (startMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startMs' when calling getAssetReefer",
        new ApiException(400, "Missing the required parameter 'startMs' when calling getAssetReefer"));
    }
    // verify the required parameter 'endMs' is set
    if (endMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endMs' when calling getAssetReefer",
        new ApiException(400, "Missing the required parameter 'endMs' when calling getAssetReefer"));
    }

    // create path and map variables
    String path = "/fleet/assets/{asset_id}/reefer".replaceAll("\\{" + "asset_id" + "\\}", apiInvoker.escapeString(assetId.toString()));

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
         return (AssetReeferResponse) ApiInvoker.deserialize(localVarResponse, "", AssetReeferResponse.class);
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
   * /fleet/assets/{assetId:[0-9]+}/reefer
   * Fetch the reefer-specific stats of an asset.
   * @param accessToken Samsara API access token.   * @param assetId ID of the asset   * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.   * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
  */
  public void getAssetReefer (String accessToken, Long assetId, Long startMs, Long endMs, final Response.Listener<AssetReeferResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getAssetReefer",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getAssetReefer"));
    }
    // verify the required parameter 'assetId' is set
    if (assetId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'assetId' when calling getAssetReefer",
        new ApiException(400, "Missing the required parameter 'assetId' when calling getAssetReefer"));
    }
    // verify the required parameter 'startMs' is set
    if (startMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startMs' when calling getAssetReefer",
        new ApiException(400, "Missing the required parameter 'startMs' when calling getAssetReefer"));
    }
    // verify the required parameter 'endMs' is set
    if (endMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endMs' when calling getAssetReefer",
        new ApiException(400, "Missing the required parameter 'endMs' when calling getAssetReefer"));
    }

    // create path and map variables
    String path = "/fleet/assets/{asset_id}/reefer".replaceAll("\\{format\\}","json").replaceAll("\\{" + "asset_id" + "\\}", apiInvoker.escapeString(assetId.toString()));

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
              responseListener.onResponse((AssetReeferResponse) ApiInvoker.deserialize(localVarResponse,  "", AssetReeferResponse.class));
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
   * @return DispatchRoutes
  */
  public DispatchRoutes getDispatchRoutesByDriverId (String accessToken, Long driverId, Long endTime, Long duration) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
         return (DispatchRoutes) ApiInvoker.deserialize(localVarResponse, "", DispatchRoutes.class);
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
  public void getDispatchRoutesByDriverId (String accessToken, Long driverId, Long endTime, Long duration, final Response.Listener<DispatchRoutes> responseListener, final Response.ErrorListener errorListener) {
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
              responseListener.onResponse((DispatchRoutes) ApiInvoker.deserialize(localVarResponse,  "", DispatchRoutes.class));
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
   * @return DispatchRoutes
  */
  public DispatchRoutes getDispatchRoutesByVehicleId (String accessToken, Long vehicleId, Long endTime, Long duration) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
         return (DispatchRoutes) ApiInvoker.deserialize(localVarResponse, "", DispatchRoutes.class);
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
  public void getDispatchRoutesByVehicleId (String accessToken, Long vehicleId, Long endTime, Long duration, final Response.Listener<DispatchRoutes> responseListener, final Response.ErrorListener errorListener) {
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
              responseListener.onResponse((DispatchRoutes) ApiInvoker.deserialize(localVarResponse,  "", DispatchRoutes.class));
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
  * /fleet/drivers/document_types
  * Fetch all of the document types.
   * @return DocumentTypes
  */
  public DocumentTypes getDriverDocumentTypesByOrgId () throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/fleet/drivers/document_types";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
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
         return (DocumentTypes) ApiInvoker.deserialize(localVarResponse, "", DocumentTypes.class);
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
   * /fleet/drivers/document_types
   * Fetch all of the document types.

  */
  public void getDriverDocumentTypesByOrgId (final Response.Listener<DocumentTypes> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/fleet/drivers/document_types".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



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
              responseListener.onResponse((DocumentTypes) ApiInvoker.deserialize(localVarResponse,  "", DocumentTypes.class));
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
  * /fleet/drivers/documents
  * Fetch all of the documents.
   * @param accessToken Samsara API access token.
   * @param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
   * @param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
   * @return Documents
  */
  public Documents getDriverDocumentsByOrgId (String accessToken, Long endMs, Long durationMs) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getDriverDocumentsByOrgId",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getDriverDocumentsByOrgId"));
    }

    // create path and map variables
    String path = "/fleet/drivers/documents";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "endMs", endMs));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "durationMs", durationMs));
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
         return (Documents) ApiInvoker.deserialize(localVarResponse, "", Documents.class);
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
   * /fleet/drivers/documents
   * Fetch all of the documents.
   * @param accessToken Samsara API access token.   * @param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.   * @param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
  */
  public void getDriverDocumentsByOrgId (String accessToken, Long endMs, Long durationMs, final Response.Listener<Documents> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getDriverDocumentsByOrgId",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getDriverDocumentsByOrgId"));
    }

    // create path and map variables
    String path = "/fleet/drivers/documents".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "endMs", endMs));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "durationMs", durationMs));


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
              responseListener.onResponse((Documents) ApiInvoker.deserialize(localVarResponse,  "", Documents.class));
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
  * /fleet/drivers/{driverId:[0-9]+}/safety/score
  * Fetch the safety score for the driver.
   * @param driverId ID of the driver
   * @param accessToken Samsara API access token.
   * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
   * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
   * @return DriverSafetyScoreResponse
  */
  public DriverSafetyScoreResponse getDriverSafetyScore (Long driverId, String accessToken, Long startMs, Long endMs) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'driverId' is set
    if (driverId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'driverId' when calling getDriverSafetyScore",
        new ApiException(400, "Missing the required parameter 'driverId' when calling getDriverSafetyScore"));
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getDriverSafetyScore",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getDriverSafetyScore"));
    }
    // verify the required parameter 'startMs' is set
    if (startMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startMs' when calling getDriverSafetyScore",
        new ApiException(400, "Missing the required parameter 'startMs' when calling getDriverSafetyScore"));
    }
    // verify the required parameter 'endMs' is set
    if (endMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endMs' when calling getDriverSafetyScore",
        new ApiException(400, "Missing the required parameter 'endMs' when calling getDriverSafetyScore"));
    }

    // create path and map variables
    String path = "/fleet/drivers/{driverId}/safety/score".replaceAll("\\{" + "driverId" + "\\}", apiInvoker.escapeString(driverId.toString()));

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
         return (DriverSafetyScoreResponse) ApiInvoker.deserialize(localVarResponse, "", DriverSafetyScoreResponse.class);
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
   * /fleet/drivers/{driverId:[0-9]+}/safety/score
   * Fetch the safety score for the driver.
   * @param driverId ID of the driver   * @param accessToken Samsara API access token.   * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.   * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
  */
  public void getDriverSafetyScore (Long driverId, String accessToken, Long startMs, Long endMs, final Response.Listener<DriverSafetyScoreResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'driverId' is set
    if (driverId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'driverId' when calling getDriverSafetyScore",
        new ApiException(400, "Missing the required parameter 'driverId' when calling getDriverSafetyScore"));
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getDriverSafetyScore",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getDriverSafetyScore"));
    }
    // verify the required parameter 'startMs' is set
    if (startMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startMs' when calling getDriverSafetyScore",
        new ApiException(400, "Missing the required parameter 'startMs' when calling getDriverSafetyScore"));
    }
    // verify the required parameter 'endMs' is set
    if (endMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endMs' when calling getDriverSafetyScore",
        new ApiException(400, "Missing the required parameter 'endMs' when calling getDriverSafetyScore"));
    }

    // create path and map variables
    String path = "/fleet/drivers/{driverId}/safety/score".replaceAll("\\{format\\}","json").replaceAll("\\{" + "driverId" + "\\}", apiInvoker.escapeString(driverId.toString()));

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
              responseListener.onResponse((DriverSafetyScoreResponse) ApiInvoker.deserialize(localVarResponse,  "", DriverSafetyScoreResponse.class));
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
  * /fleet/maintenance/dvirs
  * Get DVIRs for the org within provided time constraints
   * @param accessToken Samsara API access token.
   * @param endMs time in millis until the last dvir log.
   * @param durationMs time in millis which corresponds to the duration before the end_ms.
   * @param groupId Group ID to query.
   * @return DvirListResponse
  */
  public DvirListResponse getDvirs (String accessToken, Integer endMs, Integer durationMs, Integer groupId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getDvirs",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getDvirs"));
    }
    // verify the required parameter 'endMs' is set
    if (endMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endMs' when calling getDvirs",
        new ApiException(400, "Missing the required parameter 'endMs' when calling getDvirs"));
    }
    // verify the required parameter 'durationMs' is set
    if (durationMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'durationMs' when calling getDvirs",
        new ApiException(400, "Missing the required parameter 'durationMs' when calling getDvirs"));
    }

    // create path and map variables
    String path = "/fleet/maintenance/dvirs";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_ms", endMs));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "duration_ms", durationMs));
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
         return (DvirListResponse) ApiInvoker.deserialize(localVarResponse, "", DvirListResponse.class);
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
   * /fleet/maintenance/dvirs
   * Get DVIRs for the org within provided time constraints
   * @param accessToken Samsara API access token.   * @param endMs time in millis until the last dvir log.   * @param durationMs time in millis which corresponds to the duration before the end_ms.   * @param groupId Group ID to query.
  */
  public void getDvirs (String accessToken, Integer endMs, Integer durationMs, Integer groupId, final Response.Listener<DvirListResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getDvirs",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getDvirs"));
    }
    // verify the required parameter 'endMs' is set
    if (endMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endMs' when calling getDvirs",
        new ApiException(400, "Missing the required parameter 'endMs' when calling getDvirs"));
    }
    // verify the required parameter 'durationMs' is set
    if (durationMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'durationMs' when calling getDvirs",
        new ApiException(400, "Missing the required parameter 'durationMs' when calling getDvirs"));
    }

    // create path and map variables
    String path = "/fleet/maintenance/dvirs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_ms", endMs));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "duration_ms", durationMs));
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
              responseListener.onResponse((DvirListResponse) ApiInvoker.deserialize(localVarResponse,  "", DvirListResponse.class));
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
  * /fleet/drivers
  * Get all the drivers for the specified group.
   * @param accessToken Samsara API access token.
   * @param groupDriversParam 
   * @return DriversResponse
  */
  public DriversResponse getFleetDrivers (String accessToken, GroupDriversParam groupDriversParam) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = groupDriversParam;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getFleetDrivers",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getFleetDrivers"));
    }
    // verify the required parameter 'groupDriversParam' is set
    if (groupDriversParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'groupDriversParam' when calling getFleetDrivers",
        new ApiException(400, "Missing the required parameter 'groupDriversParam' when calling getFleetDrivers"));
    }

    // create path and map variables
    String path = "/fleet/drivers";

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
         return (DriversResponse) ApiInvoker.deserialize(localVarResponse, "", DriversResponse.class);
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
   * /fleet/drivers
   * Get all the drivers for the specified group.
   * @param accessToken Samsara API access token.   * @param groupDriversParam 
  */
  public void getFleetDrivers (String accessToken, GroupDriversParam groupDriversParam, final Response.Listener<DriversResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = groupDriversParam;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getFleetDrivers",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getFleetDrivers"));
    }
    // verify the required parameter 'groupDriversParam' is set
    if (groupDriversParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'groupDriversParam' when calling getFleetDrivers",
        new ApiException(400, "Missing the required parameter 'groupDriversParam' when calling getFleetDrivers"));
    }

    // create path and map variables
    String path = "/fleet/drivers".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((DriversResponse) ApiInvoker.deserialize(localVarResponse,  "", DriversResponse.class));
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
  * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
  * Get summarized daily HOS charts for a specified driver.
   * @param accessToken Samsara API access token.
   * @param driverId ID of the driver with HOS logs.
   * @param hosLogsParam 
   * @return DriverDailyLogResponse
  */
  public DriverDailyLogResponse getFleetDriversHosDailyLogs (String accessToken, Long driverId, HosLogsParam hosLogsParam) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = hosLogsParam;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getFleetDriversHosDailyLogs",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getFleetDriversHosDailyLogs"));
    }
    // verify the required parameter 'driverId' is set
    if (driverId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'driverId' when calling getFleetDriversHosDailyLogs",
        new ApiException(400, "Missing the required parameter 'driverId' when calling getFleetDriversHosDailyLogs"));
    }
    // verify the required parameter 'hosLogsParam' is set
    if (hosLogsParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'hosLogsParam' when calling getFleetDriversHosDailyLogs",
        new ApiException(400, "Missing the required parameter 'hosLogsParam' when calling getFleetDriversHosDailyLogs"));
    }

    // create path and map variables
    String path = "/fleet/drivers/{driver_id}/hos_daily_logs".replaceAll("\\{" + "driver_id" + "\\}", apiInvoker.escapeString(driverId.toString()));

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
         return (DriverDailyLogResponse) ApiInvoker.deserialize(localVarResponse, "", DriverDailyLogResponse.class);
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
   * /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
   * Get summarized daily HOS charts for a specified driver.
   * @param accessToken Samsara API access token.   * @param driverId ID of the driver with HOS logs.   * @param hosLogsParam 
  */
  public void getFleetDriversHosDailyLogs (String accessToken, Long driverId, HosLogsParam hosLogsParam, final Response.Listener<DriverDailyLogResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = hosLogsParam;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getFleetDriversHosDailyLogs",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getFleetDriversHosDailyLogs"));
    }
    // verify the required parameter 'driverId' is set
    if (driverId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'driverId' when calling getFleetDriversHosDailyLogs",
        new ApiException(400, "Missing the required parameter 'driverId' when calling getFleetDriversHosDailyLogs"));
    }
    // verify the required parameter 'hosLogsParam' is set
    if (hosLogsParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'hosLogsParam' when calling getFleetDriversHosDailyLogs",
        new ApiException(400, "Missing the required parameter 'hosLogsParam' when calling getFleetDriversHosDailyLogs"));
    }

    // create path and map variables
    String path = "/fleet/drivers/{driver_id}/hos_daily_logs".replaceAll("\\{format\\}","json").replaceAll("\\{" + "driver_id" + "\\}", apiInvoker.escapeString(driverId.toString()));

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
              responseListener.onResponse((DriverDailyLogResponse) ApiInvoker.deserialize(localVarResponse,  "", DriverDailyLogResponse.class));
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
  * /fleet/drivers/summary
  * Get the distance and time each driver in an organization has driven in a given time period.
   * @param accessToken Samsara API access token.
   * @param driversSummaryParam Org ID and time range to query.
   * @param snapToDayBounds Snap query result to HOS day boundaries.
   * @return DriversSummaryResponse
  */
  public DriversSummaryResponse getFleetDriversSummary (String accessToken, DriversSummaryParam driversSummaryParam, Boolean snapToDayBounds) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = driversSummaryParam;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getFleetDriversSummary",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getFleetDriversSummary"));
    }
    // verify the required parameter 'driversSummaryParam' is set
    if (driversSummaryParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'driversSummaryParam' when calling getFleetDriversSummary",
        new ApiException(400, "Missing the required parameter 'driversSummaryParam' when calling getFleetDriversSummary"));
    }

    // create path and map variables
    String path = "/fleet/drivers/summary";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "snap_to_day_bounds", snapToDayBounds));
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
         return (DriversSummaryResponse) ApiInvoker.deserialize(localVarResponse, "", DriversSummaryResponse.class);
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
   * /fleet/drivers/summary
   * Get the distance and time each driver in an organization has driven in a given time period.
   * @param accessToken Samsara API access token.   * @param driversSummaryParam Org ID and time range to query.   * @param snapToDayBounds Snap query result to HOS day boundaries.
  */
  public void getFleetDriversSummary (String accessToken, DriversSummaryParam driversSummaryParam, Boolean snapToDayBounds, final Response.Listener<DriversSummaryResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = driversSummaryParam;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getFleetDriversSummary",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getFleetDriversSummary"));
    }
    // verify the required parameter 'driversSummaryParam' is set
    if (driversSummaryParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'driversSummaryParam' when calling getFleetDriversSummary",
        new ApiException(400, "Missing the required parameter 'driversSummaryParam' when calling getFleetDriversSummary"));
    }

    // create path and map variables
    String path = "/fleet/drivers/summary".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "snap_to_day_bounds", snapToDayBounds));


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
              responseListener.onResponse((DriversSummaryResponse) ApiInvoker.deserialize(localVarResponse,  "", DriversSummaryResponse.class));
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
  * /fleet/hos_authentication_logs
  * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
   * @param accessToken Samsara API access token.
   * @param hosAuthenticationLogsParam 
   * @return HosAuthenticationLogsResponse
  */
  public HosAuthenticationLogsResponse getFleetHosAuthenticationLogs (String accessToken, HosAuthenticationLogsParam hosAuthenticationLogsParam) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = hosAuthenticationLogsParam;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getFleetHosAuthenticationLogs",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getFleetHosAuthenticationLogs"));
    }
    // verify the required parameter 'hosAuthenticationLogsParam' is set
    if (hosAuthenticationLogsParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'hosAuthenticationLogsParam' when calling getFleetHosAuthenticationLogs",
        new ApiException(400, "Missing the required parameter 'hosAuthenticationLogsParam' when calling getFleetHosAuthenticationLogs"));
    }

    // create path and map variables
    String path = "/fleet/hos_authentication_logs";

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
         return (HosAuthenticationLogsResponse) ApiInvoker.deserialize(localVarResponse, "", HosAuthenticationLogsResponse.class);
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
   * /fleet/hos_authentication_logs
   * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
   * @param accessToken Samsara API access token.   * @param hosAuthenticationLogsParam 
  */
  public void getFleetHosAuthenticationLogs (String accessToken, HosAuthenticationLogsParam hosAuthenticationLogsParam, final Response.Listener<HosAuthenticationLogsResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = hosAuthenticationLogsParam;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getFleetHosAuthenticationLogs",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getFleetHosAuthenticationLogs"));
    }
    // verify the required parameter 'hosAuthenticationLogsParam' is set
    if (hosAuthenticationLogsParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'hosAuthenticationLogsParam' when calling getFleetHosAuthenticationLogs",
        new ApiException(400, "Missing the required parameter 'hosAuthenticationLogsParam' when calling getFleetHosAuthenticationLogs"));
    }

    // create path and map variables
    String path = "/fleet/hos_authentication_logs".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((HosAuthenticationLogsResponse) ApiInvoker.deserialize(localVarResponse,  "", HosAuthenticationLogsResponse.class));
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
  * /fleet/hos_logs
  * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
   * @param accessToken Samsara API access token.
   * @param hosLogsParam 
   * @return HosLogsResponse
  */
  public HosLogsResponse getFleetHosLogs (String accessToken, HosLogsParam1 hosLogsParam) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = hosLogsParam;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getFleetHosLogs",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getFleetHosLogs"));
    }
    // verify the required parameter 'hosLogsParam' is set
    if (hosLogsParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'hosLogsParam' when calling getFleetHosLogs",
        new ApiException(400, "Missing the required parameter 'hosLogsParam' when calling getFleetHosLogs"));
    }

    // create path and map variables
    String path = "/fleet/hos_logs";

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
         return (HosLogsResponse) ApiInvoker.deserialize(localVarResponse, "", HosLogsResponse.class);
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
   * /fleet/hos_logs
   * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
   * @param accessToken Samsara API access token.   * @param hosLogsParam 
  */
  public void getFleetHosLogs (String accessToken, HosLogsParam1 hosLogsParam, final Response.Listener<HosLogsResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = hosLogsParam;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getFleetHosLogs",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getFleetHosLogs"));
    }
    // verify the required parameter 'hosLogsParam' is set
    if (hosLogsParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'hosLogsParam' when calling getFleetHosLogs",
        new ApiException(400, "Missing the required parameter 'hosLogsParam' when calling getFleetHosLogs"));
    }

    // create path and map variables
    String path = "/fleet/hos_logs".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((HosLogsResponse) ApiInvoker.deserialize(localVarResponse,  "", HosLogsResponse.class));
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
  * /fleet/hos_logs_summary
  * Get the current HOS status for all drivers in the group.
   * @param accessToken Samsara API access token.
   * @param hosLogsParam 
   * @return HosLogsSummaryResponse
  */
  public HosLogsSummaryResponse getFleetHosLogsSummary (String accessToken, HosLogsParam2 hosLogsParam) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = hosLogsParam;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getFleetHosLogsSummary",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getFleetHosLogsSummary"));
    }
    // verify the required parameter 'hosLogsParam' is set
    if (hosLogsParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'hosLogsParam' when calling getFleetHosLogsSummary",
        new ApiException(400, "Missing the required parameter 'hosLogsParam' when calling getFleetHosLogsSummary"));
    }

    // create path and map variables
    String path = "/fleet/hos_logs_summary";

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
         return (HosLogsSummaryResponse) ApiInvoker.deserialize(localVarResponse, "", HosLogsSummaryResponse.class);
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
   * /fleet/hos_logs_summary
   * Get the current HOS status for all drivers in the group.
   * @param accessToken Samsara API access token.   * @param hosLogsParam 
  */
  public void getFleetHosLogsSummary (String accessToken, HosLogsParam2 hosLogsParam, final Response.Listener<HosLogsSummaryResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = hosLogsParam;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getFleetHosLogsSummary",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getFleetHosLogsSummary"));
    }
    // verify the required parameter 'hosLogsParam' is set
    if (hosLogsParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'hosLogsParam' when calling getFleetHosLogsSummary",
        new ApiException(400, "Missing the required parameter 'hosLogsParam' when calling getFleetHosLogsSummary"));
    }

    // create path and map variables
    String path = "/fleet/hos_logs_summary".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((HosLogsSummaryResponse) ApiInvoker.deserialize(localVarResponse,  "", HosLogsSummaryResponse.class));
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
  * /fleet/locations
  * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
   * @param accessToken Samsara API access token.
   * @param groupParam Group ID to query.
   * @return InlineResponse2003
  */
  public InlineResponse2003 getFleetLocations (String accessToken, GroupParam groupParam) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = groupParam;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getFleetLocations",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getFleetLocations"));
    }
    // verify the required parameter 'groupParam' is set
    if (groupParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'groupParam' when calling getFleetLocations",
        new ApiException(400, "Missing the required parameter 'groupParam' when calling getFleetLocations"));
    }

    // create path and map variables
    String path = "/fleet/locations";

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
         return (InlineResponse2003) ApiInvoker.deserialize(localVarResponse, "", InlineResponse2003.class);
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
   * /fleet/locations
   * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
   * @param accessToken Samsara API access token.   * @param groupParam Group ID to query.
  */
  public void getFleetLocations (String accessToken, GroupParam groupParam, final Response.Listener<InlineResponse2003> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = groupParam;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getFleetLocations",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getFleetLocations"));
    }
    // verify the required parameter 'groupParam' is set
    if (groupParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'groupParam' when calling getFleetLocations",
        new ApiException(400, "Missing the required parameter 'groupParam' when calling getFleetLocations"));
    }

    // create path and map variables
    String path = "/fleet/locations".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((InlineResponse2003) ApiInvoker.deserialize(localVarResponse,  "", InlineResponse2003.class));
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
  * /fleet/maintenance/list
  * Get list of the vehicles with any engine faults or check light data.
   * @param accessToken Samsara API access token.
   * @param groupParam Group ID to query.
   * @return InlineResponse2004
  */
  public InlineResponse2004 getFleetMaintenanceList (String accessToken, GroupParam groupParam) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = groupParam;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getFleetMaintenanceList",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getFleetMaintenanceList"));
    }
    // verify the required parameter 'groupParam' is set
    if (groupParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'groupParam' when calling getFleetMaintenanceList",
        new ApiException(400, "Missing the required parameter 'groupParam' when calling getFleetMaintenanceList"));
    }

    // create path and map variables
    String path = "/fleet/maintenance/list";

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
         return (InlineResponse2004) ApiInvoker.deserialize(localVarResponse, "", InlineResponse2004.class);
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
   * /fleet/maintenance/list
   * Get list of the vehicles with any engine faults or check light data.
   * @param accessToken Samsara API access token.   * @param groupParam Group ID to query.
  */
  public void getFleetMaintenanceList (String accessToken, GroupParam groupParam, final Response.Listener<InlineResponse2004> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = groupParam;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getFleetMaintenanceList",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getFleetMaintenanceList"));
    }
    // verify the required parameter 'groupParam' is set
    if (groupParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'groupParam' when calling getFleetMaintenanceList",
        new ApiException(400, "Missing the required parameter 'groupParam' when calling getFleetMaintenanceList"));
    }

    // create path and map variables
    String path = "/fleet/maintenance/list".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((InlineResponse2004) ApiInvoker.deserialize(localVarResponse,  "", InlineResponse2004.class));
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
  * /fleet/trips
  * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
   * @param accessToken Samsara API access token.
   * @param tripsParam Group ID, vehicle ID and time range to query.
   * @return TripResponse
  */
  public TripResponse getFleetTrips (String accessToken, TripsParam tripsParam) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = tripsParam;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getFleetTrips",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getFleetTrips"));
    }
    // verify the required parameter 'tripsParam' is set
    if (tripsParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'tripsParam' when calling getFleetTrips",
        new ApiException(400, "Missing the required parameter 'tripsParam' when calling getFleetTrips"));
    }

    // create path and map variables
    String path = "/fleet/trips";

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
         return (TripResponse) ApiInvoker.deserialize(localVarResponse, "", TripResponse.class);
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
   * /fleet/trips
   * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
   * @param accessToken Samsara API access token.   * @param tripsParam Group ID, vehicle ID and time range to query.
  */
  public void getFleetTrips (String accessToken, TripsParam tripsParam, final Response.Listener<TripResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = tripsParam;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getFleetTrips",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getFleetTrips"));
    }
    // verify the required parameter 'tripsParam' is set
    if (tripsParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'tripsParam' when calling getFleetTrips",
        new ApiException(400, "Missing the required parameter 'tripsParam' when calling getFleetTrips"));
    }

    // create path and map variables
    String path = "/fleet/trips".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((TripResponse) ApiInvoker.deserialize(localVarResponse,  "", TripResponse.class));
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
  * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  * Gets a specific vehicle.
   * @param accessToken Samsara API access token.
   * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
   * @return FleetVehicleResponse
  */
  public FleetVehicleResponse getFleetVehicle (String accessToken, String vehicleIdOrExternalId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getFleetVehicle",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getFleetVehicle"));
    }
    // verify the required parameter 'vehicleIdOrExternalId' is set
    if (vehicleIdOrExternalId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'vehicleIdOrExternalId' when calling getFleetVehicle",
        new ApiException(400, "Missing the required parameter 'vehicleIdOrExternalId' when calling getFleetVehicle"));
    }

    // create path and map variables
    String path = "/fleet/vehicles/{vehicle_id_or_external_id}".replaceAll("\\{" + "vehicle_id_or_external_id" + "\\}", apiInvoker.escapeString(vehicleIdOrExternalId.toString()));

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
         return (FleetVehicleResponse) ApiInvoker.deserialize(localVarResponse, "", FleetVehicleResponse.class);
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
   * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
   * Gets a specific vehicle.
   * @param accessToken Samsara API access token.   * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
  */
  public void getFleetVehicle (String accessToken, String vehicleIdOrExternalId, final Response.Listener<FleetVehicleResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getFleetVehicle",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getFleetVehicle"));
    }
    // verify the required parameter 'vehicleIdOrExternalId' is set
    if (vehicleIdOrExternalId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'vehicleIdOrExternalId' when calling getFleetVehicle",
        new ApiException(400, "Missing the required parameter 'vehicleIdOrExternalId' when calling getFleetVehicle"));
    }

    // create path and map variables
    String path = "/fleet/vehicles/{vehicle_id_or_external_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "vehicle_id_or_external_id" + "\\}", apiInvoker.escapeString(vehicleIdOrExternalId.toString()));

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
              responseListener.onResponse((FleetVehicleResponse) ApiInvoker.deserialize(localVarResponse,  "", FleetVehicleResponse.class));
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
  * /addresses/{addressId}
  * Fetch an address by its id.
   * @param accessToken Samsara API access token.
   * @param addressId ID of the address/geofence
   * @return Address
  */
  public Address getOrganizationAddress (String accessToken, Long addressId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getOrganizationAddress",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getOrganizationAddress"));
    }
    // verify the required parameter 'addressId' is set
    if (addressId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'addressId' when calling getOrganizationAddress",
        new ApiException(400, "Missing the required parameter 'addressId' when calling getOrganizationAddress"));
    }

    // create path and map variables
    String path = "/addresses/{addressId}".replaceAll("\\{" + "addressId" + "\\}", apiInvoker.escapeString(addressId.toString()));

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
         return (Address) ApiInvoker.deserialize(localVarResponse, "", Address.class);
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
   * /addresses/{addressId}
   * Fetch an address by its id.
   * @param accessToken Samsara API access token.   * @param addressId ID of the address/geofence
  */
  public void getOrganizationAddress (String accessToken, Long addressId, final Response.Listener<Address> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getOrganizationAddress",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getOrganizationAddress"));
    }
    // verify the required parameter 'addressId' is set
    if (addressId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'addressId' when calling getOrganizationAddress",
        new ApiException(400, "Missing the required parameter 'addressId' when calling getOrganizationAddress"));
    }

    // create path and map variables
    String path = "/addresses/{addressId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "addressId" + "\\}", apiInvoker.escapeString(addressId.toString()));

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
              responseListener.onResponse((Address) ApiInvoker.deserialize(localVarResponse,  "", Address.class));
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
  * /addresses
  * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
   * @param accessToken Samsara API access token.
   * @return List<Address>
  */
  public List<Address> getOrganizationAddresses (String accessToken) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getOrganizationAddresses",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getOrganizationAddresses"));
    }

    // create path and map variables
    String path = "/addresses";

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
         return (List<Address>) ApiInvoker.deserialize(localVarResponse, "array", Address.class);
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
   * /addresses
   * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
   * @param accessToken Samsara API access token.
  */
  public void getOrganizationAddresses (String accessToken, final Response.Listener<List<Address>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getOrganizationAddresses",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getOrganizationAddresses"));
    }

    // create path and map variables
    String path = "/addresses".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((List<Address>) ApiInvoker.deserialize(localVarResponse,  "array", Address.class));
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
  * /contacts/{contact_id}
  * Fetch a contact by its id.
   * @param accessToken Samsara API access token.
   * @param contactId ID of the contact
   * @return Contact
  */
  public Contact getOrganizationContact (String accessToken, Long contactId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getOrganizationContact",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getOrganizationContact"));
    }
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'contactId' when calling getOrganizationContact",
        new ApiException(400, "Missing the required parameter 'contactId' when calling getOrganizationContact"));
    }

    // create path and map variables
    String path = "/contacts/{contact_id}".replaceAll("\\{" + "contact_id" + "\\}", apiInvoker.escapeString(contactId.toString()));

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
         return (Contact) ApiInvoker.deserialize(localVarResponse, "", Contact.class);
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
   * /contacts/{contact_id}
   * Fetch a contact by its id.
   * @param accessToken Samsara API access token.   * @param contactId ID of the contact
  */
  public void getOrganizationContact (String accessToken, Long contactId, final Response.Listener<Contact> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getOrganizationContact",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getOrganizationContact"));
    }
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'contactId' when calling getOrganizationContact",
        new ApiException(400, "Missing the required parameter 'contactId' when calling getOrganizationContact"));
    }

    // create path and map variables
    String path = "/contacts/{contact_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "contact_id" + "\\}", apiInvoker.escapeString(contactId.toString()));

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
              responseListener.onResponse((Contact) ApiInvoker.deserialize(localVarResponse,  "", Contact.class));
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
  * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
  * Fetch harsh event details for a vehicle.
   * @param vehicleId ID of the vehicle
   * @param accessToken Samsara API access token.
   * @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event.
   * @return VehicleHarshEventResponse
  */
  public VehicleHarshEventResponse getVehicleHarshEvent (Long vehicleId, String accessToken, Long timestamp) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'vehicleId' is set
    if (vehicleId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'vehicleId' when calling getVehicleHarshEvent",
        new ApiException(400, "Missing the required parameter 'vehicleId' when calling getVehicleHarshEvent"));
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getVehicleHarshEvent",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getVehicleHarshEvent"));
    }
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'timestamp' when calling getVehicleHarshEvent",
        new ApiException(400, "Missing the required parameter 'timestamp' when calling getVehicleHarshEvent"));
    }

    // create path and map variables
    String path = "/fleet/vehicles/{vehicleId}/safety/harsh_event".replaceAll("\\{" + "vehicleId" + "\\}", apiInvoker.escapeString(vehicleId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "timestamp", timestamp));
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
         return (VehicleHarshEventResponse) ApiInvoker.deserialize(localVarResponse, "", VehicleHarshEventResponse.class);
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
   * /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
   * Fetch harsh event details for a vehicle.
   * @param vehicleId ID of the vehicle   * @param accessToken Samsara API access token.   * @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event.
  */
  public void getVehicleHarshEvent (Long vehicleId, String accessToken, Long timestamp, final Response.Listener<VehicleHarshEventResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'vehicleId' is set
    if (vehicleId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'vehicleId' when calling getVehicleHarshEvent",
        new ApiException(400, "Missing the required parameter 'vehicleId' when calling getVehicleHarshEvent"));
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getVehicleHarshEvent",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getVehicleHarshEvent"));
    }
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'timestamp' when calling getVehicleHarshEvent",
        new ApiException(400, "Missing the required parameter 'timestamp' when calling getVehicleHarshEvent"));
    }

    // create path and map variables
    String path = "/fleet/vehicles/{vehicleId}/safety/harsh_event".replaceAll("\\{format\\}","json").replaceAll("\\{" + "vehicleId" + "\\}", apiInvoker.escapeString(vehicleId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "timestamp", timestamp));


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
              responseListener.onResponse((VehicleHarshEventResponse) ApiInvoker.deserialize(localVarResponse,  "", VehicleHarshEventResponse.class));
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
  * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
  * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
   * @param accessToken Samsara API access token.
   * @param vehicleId ID of the vehicle with the associated routes.
   * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
   * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
   * @return FleetVehicleLocations
  */
  public FleetVehicleLocations getVehicleLocations (String accessToken, Long vehicleId, Long startMs, Long endMs) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getVehicleLocations",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getVehicleLocations"));
    }
    // verify the required parameter 'vehicleId' is set
    if (vehicleId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'vehicleId' when calling getVehicleLocations",
        new ApiException(400, "Missing the required parameter 'vehicleId' when calling getVehicleLocations"));
    }
    // verify the required parameter 'startMs' is set
    if (startMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startMs' when calling getVehicleLocations",
        new ApiException(400, "Missing the required parameter 'startMs' when calling getVehicleLocations"));
    }
    // verify the required parameter 'endMs' is set
    if (endMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endMs' when calling getVehicleLocations",
        new ApiException(400, "Missing the required parameter 'endMs' when calling getVehicleLocations"));
    }

    // create path and map variables
    String path = "/fleet/vehicles/{vehicle_id}/locations".replaceAll("\\{" + "vehicle_id" + "\\}", apiInvoker.escapeString(vehicleId.toString()));

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
         return (FleetVehicleLocations) ApiInvoker.deserialize(localVarResponse, "", FleetVehicleLocations.class);
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
   * /fleet/vehicles/{vehicle_id:[0-9]+}/locations
   * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
   * @param accessToken Samsara API access token.   * @param vehicleId ID of the vehicle with the associated routes.   * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)   * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
  */
  public void getVehicleLocations (String accessToken, Long vehicleId, Long startMs, Long endMs, final Response.Listener<FleetVehicleLocations> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getVehicleLocations",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getVehicleLocations"));
    }
    // verify the required parameter 'vehicleId' is set
    if (vehicleId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'vehicleId' when calling getVehicleLocations",
        new ApiException(400, "Missing the required parameter 'vehicleId' when calling getVehicleLocations"));
    }
    // verify the required parameter 'startMs' is set
    if (startMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startMs' when calling getVehicleLocations",
        new ApiException(400, "Missing the required parameter 'startMs' when calling getVehicleLocations"));
    }
    // verify the required parameter 'endMs' is set
    if (endMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endMs' when calling getVehicleLocations",
        new ApiException(400, "Missing the required parameter 'endMs' when calling getVehicleLocations"));
    }

    // create path and map variables
    String path = "/fleet/vehicles/{vehicle_id}/locations".replaceAll("\\{format\\}","json").replaceAll("\\{" + "vehicle_id" + "\\}", apiInvoker.escapeString(vehicleId.toString()));

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
              responseListener.onResponse((FleetVehicleLocations) ApiInvoker.deserialize(localVarResponse,  "", FleetVehicleLocations.class));
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
  * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
  * Fetch the safety score for the vehicle.
   * @param vehicleId ID of the vehicle
   * @param accessToken Samsara API access token.
   * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
   * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
   * @return VehicleSafetyScoreResponse
  */
  public VehicleSafetyScoreResponse getVehicleSafetyScore (Long vehicleId, String accessToken, Long startMs, Long endMs) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'vehicleId' is set
    if (vehicleId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'vehicleId' when calling getVehicleSafetyScore",
        new ApiException(400, "Missing the required parameter 'vehicleId' when calling getVehicleSafetyScore"));
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getVehicleSafetyScore",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getVehicleSafetyScore"));
    }
    // verify the required parameter 'startMs' is set
    if (startMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startMs' when calling getVehicleSafetyScore",
        new ApiException(400, "Missing the required parameter 'startMs' when calling getVehicleSafetyScore"));
    }
    // verify the required parameter 'endMs' is set
    if (endMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endMs' when calling getVehicleSafetyScore",
        new ApiException(400, "Missing the required parameter 'endMs' when calling getVehicleSafetyScore"));
    }

    // create path and map variables
    String path = "/fleet/vehicles/{vehicleId}/safety/score".replaceAll("\\{" + "vehicleId" + "\\}", apiInvoker.escapeString(vehicleId.toString()));

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
         return (VehicleSafetyScoreResponse) ApiInvoker.deserialize(localVarResponse, "", VehicleSafetyScoreResponse.class);
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
   * /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
   * Fetch the safety score for the vehicle.
   * @param vehicleId ID of the vehicle   * @param accessToken Samsara API access token.   * @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.   * @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
  */
  public void getVehicleSafetyScore (Long vehicleId, String accessToken, Long startMs, Long endMs, final Response.Listener<VehicleSafetyScoreResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'vehicleId' is set
    if (vehicleId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'vehicleId' when calling getVehicleSafetyScore",
        new ApiException(400, "Missing the required parameter 'vehicleId' when calling getVehicleSafetyScore"));
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getVehicleSafetyScore",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getVehicleSafetyScore"));
    }
    // verify the required parameter 'startMs' is set
    if (startMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startMs' when calling getVehicleSafetyScore",
        new ApiException(400, "Missing the required parameter 'startMs' when calling getVehicleSafetyScore"));
    }
    // verify the required parameter 'endMs' is set
    if (endMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endMs' when calling getVehicleSafetyScore",
        new ApiException(400, "Missing the required parameter 'endMs' when calling getVehicleSafetyScore"));
    }

    // create path and map variables
    String path = "/fleet/vehicles/{vehicleId}/safety/score".replaceAll("\\{format\\}","json").replaceAll("\\{" + "vehicleId" + "\\}", apiInvoker.escapeString(vehicleId.toString()));

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
              responseListener.onResponse((VehicleSafetyScoreResponse) ApiInvoker.deserialize(localVarResponse,  "", VehicleSafetyScoreResponse.class));
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
  * /fleet/vehicles/stats
  * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
   * @param accessToken Samsara API access token.
   * @param startMs Time in Unix epoch milliseconds for the start of the query.
   * @param endMs Time in Unix epoch milliseconds for the end of the query.
   * @param series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2
   * @param tagIds Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3
   * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
   * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
   * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
   * @return InlineResponse2005
  */
  public InlineResponse2005 getVehicleStats (String accessToken, Integer startMs, Integer endMs, String series, String tagIds, String startingAfter, String endingBefore, Long limit) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getVehicleStats",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getVehicleStats"));
    }
    // verify the required parameter 'startMs' is set
    if (startMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startMs' when calling getVehicleStats",
        new ApiException(400, "Missing the required parameter 'startMs' when calling getVehicleStats"));
    }
    // verify the required parameter 'endMs' is set
    if (endMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endMs' when calling getVehicleStats",
        new ApiException(400, "Missing the required parameter 'endMs' when calling getVehicleStats"));
    }

    // create path and map variables
    String path = "/fleet/vehicles/stats";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "startMs", startMs));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "endMs", endMs));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "series", series));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tagIds", tagIds));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "startingAfter", startingAfter));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "endingBefore", endingBefore));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
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
         return (InlineResponse2005) ApiInvoker.deserialize(localVarResponse, "", InlineResponse2005.class);
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
   * /fleet/vehicles/stats
   * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
   * @param accessToken Samsara API access token.   * @param startMs Time in Unix epoch milliseconds for the start of the query.   * @param endMs Time in Unix epoch milliseconds for the end of the query.   * @param series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2   * @param tagIds Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3   * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.   * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.   * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
  */
  public void getVehicleStats (String accessToken, Integer startMs, Integer endMs, String series, String tagIds, String startingAfter, String endingBefore, Long limit, final Response.Listener<InlineResponse2005> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getVehicleStats",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getVehicleStats"));
    }
    // verify the required parameter 'startMs' is set
    if (startMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startMs' when calling getVehicleStats",
        new ApiException(400, "Missing the required parameter 'startMs' when calling getVehicleStats"));
    }
    // verify the required parameter 'endMs' is set
    if (endMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endMs' when calling getVehicleStats",
        new ApiException(400, "Missing the required parameter 'endMs' when calling getVehicleStats"));
    }

    // create path and map variables
    String path = "/fleet/vehicles/stats".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "startMs", startMs));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "endMs", endMs));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "series", series));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tagIds", tagIds));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "startingAfter", startingAfter));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "endingBefore", endingBefore));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));


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
              responseListener.onResponse((InlineResponse2005) ApiInvoker.deserialize(localVarResponse,  "", InlineResponse2005.class));
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
  * /fleet/vehicles/locations
  * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
   * @param accessToken Samsara API access token.
   * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
   * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
   * @return FleetVehiclesLocations
  */
  public FleetVehiclesLocations getVehiclesLocations (String accessToken, Integer startMs, Integer endMs) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getVehiclesLocations",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getVehiclesLocations"));
    }
    // verify the required parameter 'startMs' is set
    if (startMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startMs' when calling getVehiclesLocations",
        new ApiException(400, "Missing the required parameter 'startMs' when calling getVehiclesLocations"));
    }
    // verify the required parameter 'endMs' is set
    if (endMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endMs' when calling getVehiclesLocations",
        new ApiException(400, "Missing the required parameter 'endMs' when calling getVehiclesLocations"));
    }

    // create path and map variables
    String path = "/fleet/vehicles/locations";

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
         return (FleetVehiclesLocations) ApiInvoker.deserialize(localVarResponse, "", FleetVehiclesLocations.class);
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
   * /fleet/vehicles/locations
   * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
   * @param accessToken Samsara API access token.   * @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)   * @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
  */
  public void getVehiclesLocations (String accessToken, Integer startMs, Integer endMs, final Response.Listener<FleetVehiclesLocations> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling getVehiclesLocations",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling getVehiclesLocations"));
    }
    // verify the required parameter 'startMs' is set
    if (startMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startMs' when calling getVehiclesLocations",
        new ApiException(400, "Missing the required parameter 'startMs' when calling getVehiclesLocations"));
    }
    // verify the required parameter 'endMs' is set
    if (endMs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endMs' when calling getVehiclesLocations",
        new ApiException(400, "Missing the required parameter 'endMs' when calling getVehiclesLocations"));
    }

    // create path and map variables
    String path = "/fleet/vehicles/locations".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((FleetVehiclesLocations) ApiInvoker.deserialize(localVarResponse,  "", FleetVehiclesLocations.class));
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
  * /contacts
  * Fetch all contacts for the organization.
   * @param accessToken Samsara API access token.
   * @return List<Contact>
  */
  public List<Contact> listContacts (String accessToken) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling listContacts",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling listContacts"));
    }

    // create path and map variables
    String path = "/contacts";

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
         return (List<Contact>) ApiInvoker.deserialize(localVarResponse, "array", Contact.class);
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
   * /contacts
   * Fetch all contacts for the organization.
   * @param accessToken Samsara API access token.
  */
  public void listContacts (String accessToken, final Response.Listener<List<Contact>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling listContacts",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling listContacts"));
    }

    // create path and map variables
    String path = "/contacts".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((List<Contact>) ApiInvoker.deserialize(localVarResponse,  "array", Contact.class));
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
  * /fleet/list
  * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
   * @param accessToken Samsara API access token.
   * @param groupParam Group ID to query.
   * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
   * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
   * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
   * @return InlineResponse2002
  */
  public InlineResponse2002 listFleet (String accessToken, GroupParam groupParam, String startingAfter, String endingBefore, Long limit) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = groupParam;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling listFleet",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling listFleet"));
    }
    // verify the required parameter 'groupParam' is set
    if (groupParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'groupParam' when calling listFleet",
        new ApiException(400, "Missing the required parameter 'groupParam' when calling listFleet"));
    }

    // create path and map variables
    String path = "/fleet/list";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "startingAfter", startingAfter));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "endingBefore", endingBefore));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
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
         return (InlineResponse2002) ApiInvoker.deserialize(localVarResponse, "", InlineResponse2002.class);
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
   * /fleet/list
   * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
   * @param accessToken Samsara API access token.   * @param groupParam Group ID to query.   * @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.   * @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.   * @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
  */
  public void listFleet (String accessToken, GroupParam groupParam, String startingAfter, String endingBefore, Long limit, final Response.Listener<InlineResponse2002> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = groupParam;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling listFleet",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling listFleet"));
    }
    // verify the required parameter 'groupParam' is set
    if (groupParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'groupParam' when calling listFleet",
        new ApiException(400, "Missing the required parameter 'groupParam' when calling listFleet"));
    }

    // create path and map variables
    String path = "/fleet/list".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "startingAfter", startingAfter));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "endingBefore", endingBefore));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));


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
              responseListener.onResponse((InlineResponse2002) ApiInvoker.deserialize(localVarResponse,  "", InlineResponse2002.class));
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
  * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
   * @param accessToken Samsara API access token.
   * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
   * @param data 
   * @return FleetVehicleResponse
  */
  public FleetVehicleResponse patchFleetVehicle (String accessToken, String vehicleIdOrExternalId, Data data) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = data;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling patchFleetVehicle",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling patchFleetVehicle"));
    }
    // verify the required parameter 'vehicleIdOrExternalId' is set
    if (vehicleIdOrExternalId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'vehicleIdOrExternalId' when calling patchFleetVehicle",
        new ApiException(400, "Missing the required parameter 'vehicleIdOrExternalId' when calling patchFleetVehicle"));
    }
    // verify the required parameter 'data' is set
    if (data == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'data' when calling patchFleetVehicle",
        new ApiException(400, "Missing the required parameter 'data' when calling patchFleetVehicle"));
    }

    // create path and map variables
    String path = "/fleet/vehicles/{vehicle_id_or_external_id}".replaceAll("\\{" + "vehicle_id_or_external_id" + "\\}", apiInvoker.escapeString(vehicleIdOrExternalId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));
    String[] contentTypes = {
      "application/json",
      "application/merge-patch+json"
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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (FleetVehicleResponse) ApiInvoker.deserialize(localVarResponse, "", FleetVehicleResponse.class);
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
   * /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
   * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
   * @param accessToken Samsara API access token.   * @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.   * @param data 
  */
  public void patchFleetVehicle (String accessToken, String vehicleIdOrExternalId, Data data, final Response.Listener<FleetVehicleResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = data;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling patchFleetVehicle",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling patchFleetVehicle"));
    }
    // verify the required parameter 'vehicleIdOrExternalId' is set
    if (vehicleIdOrExternalId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'vehicleIdOrExternalId' when calling patchFleetVehicle",
        new ApiException(400, "Missing the required parameter 'vehicleIdOrExternalId' when calling patchFleetVehicle"));
    }
    // verify the required parameter 'data' is set
    if (data == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'data' when calling patchFleetVehicle",
        new ApiException(400, "Missing the required parameter 'data' when calling patchFleetVehicle"));
    }

    // create path and map variables
    String path = "/fleet/vehicles/{vehicle_id_or_external_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "vehicle_id_or_external_id" + "\\}", apiInvoker.escapeString(vehicleIdOrExternalId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_token", accessToken));


    String[] contentTypes = {
      "application/json","application/merge-patch+json"
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
      apiInvoker.invokeAPI(basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((FleetVehicleResponse) ApiInvoker.deserialize(localVarResponse,  "", FleetVehicleResponse.class));
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
  /**
  * /addresses/{addressId}
  * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
   * @param accessToken Samsara API access token.
   * @param address Update parts of an address&#39;s value. If the geofence &#39;circle&#39; or &#39;polygon&#39; key is specified, the update will change the type of geofence accordingly.
   * @param addressId ID of the address/geofence
   * @return void
  */
  public void updateOrganizationAddress (String accessToken, Address address, Long addressId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = address;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling updateOrganizationAddress",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling updateOrganizationAddress"));
    }
    // verify the required parameter 'address' is set
    if (address == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'address' when calling updateOrganizationAddress",
        new ApiException(400, "Missing the required parameter 'address' when calling updateOrganizationAddress"));
    }
    // verify the required parameter 'addressId' is set
    if (addressId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'addressId' when calling updateOrganizationAddress",
        new ApiException(400, "Missing the required parameter 'addressId' when calling updateOrganizationAddress"));
    }

    // create path and map variables
    String path = "/addresses/{addressId}".replaceAll("\\{" + "addressId" + "\\}", apiInvoker.escapeString(addressId.toString()));

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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType, authNames);
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
   * /addresses/{addressId}
   * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
   * @param accessToken Samsara API access token.   * @param address Update parts of an address&#39;s value. If the geofence &#39;circle&#39; or &#39;polygon&#39; key is specified, the update will change the type of geofence accordingly.   * @param addressId ID of the address/geofence
  */
  public void updateOrganizationAddress (String accessToken, Address address, Long addressId, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = address;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling updateOrganizationAddress",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling updateOrganizationAddress"));
    }
    // verify the required parameter 'address' is set
    if (address == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'address' when calling updateOrganizationAddress",
        new ApiException(400, "Missing the required parameter 'address' when calling updateOrganizationAddress"));
    }
    // verify the required parameter 'addressId' is set
    if (addressId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'addressId' when calling updateOrganizationAddress",
        new ApiException(400, "Missing the required parameter 'addressId' when calling updateOrganizationAddress"));
    }

    // create path and map variables
    String path = "/addresses/{addressId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "addressId" + "\\}", apiInvoker.escapeString(addressId.toString()));

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
      apiInvoker.invokeAPI(basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType, authNames,
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
  * /fleet/set_data
  * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
   * @param accessToken Samsara API access token.
   * @param vehicleUpdateParam 
   * @return void
  */
  public void updateVehicles (String accessToken, VehicleUpdateParam vehicleUpdateParam) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = vehicleUpdateParam;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling updateVehicles",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling updateVehicles"));
    }
    // verify the required parameter 'vehicleUpdateParam' is set
    if (vehicleUpdateParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'vehicleUpdateParam' when calling updateVehicles",
        new ApiException(400, "Missing the required parameter 'vehicleUpdateParam' when calling updateVehicles"));
    }

    // create path and map variables
    String path = "/fleet/set_data";

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
   * /fleet/set_data
   * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
   * @param accessToken Samsara API access token.   * @param vehicleUpdateParam 
  */
  public void updateVehicles (String accessToken, VehicleUpdateParam vehicleUpdateParam, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = vehicleUpdateParam;

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accessToken' when calling updateVehicles",
        new ApiException(400, "Missing the required parameter 'accessToken' when calling updateVehicles"));
    }
    // verify the required parameter 'vehicleUpdateParam' is set
    if (vehicleUpdateParam == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'vehicleUpdateParam' when calling updateVehicles",
        new ApiException(400, "Missing the required parameter 'vehicleUpdateParam' when calling updateVehicles"));
    }

    // create path and map variables
    String path = "/fleet/set_data".replaceAll("\\{format\\}","json");

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
}
