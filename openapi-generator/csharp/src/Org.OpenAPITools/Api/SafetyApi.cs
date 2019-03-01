/* 
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |- -- -- -- -- -- --|- -- -- -- -- -- -- -- -|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ISafetyApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// /fleet/drivers/{driverId:[0-9]+}/safety/score
        /// </summary>
        /// <remarks>
        /// Fetch the safety score for the driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="driverId">ID of the driver</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>DriverSafetyScoreResponse</returns>
        DriverSafetyScoreResponse GetDriverSafetyScore (long? driverId, string accessToken, long? startMs, long? endMs);

        /// <summary>
        /// /fleet/drivers/{driverId:[0-9]+}/safety/score
        /// </summary>
        /// <remarks>
        /// Fetch the safety score for the driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="driverId">ID of the driver</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>ApiResponse of DriverSafetyScoreResponse</returns>
        ApiResponse<DriverSafetyScoreResponse> GetDriverSafetyScoreWithHttpInfo (long? driverId, string accessToken, long? startMs, long? endMs);
        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
        /// </summary>
        /// <remarks>
        /// Fetch harsh event details for a vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="timestamp">Timestamp in milliseconds representing the timestamp of a harsh event.</param>
        /// <returns>VehicleHarshEventResponse</returns>
        VehicleHarshEventResponse GetVehicleHarshEvent (long? vehicleId, string accessToken, long? timestamp);

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
        /// </summary>
        /// <remarks>
        /// Fetch harsh event details for a vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="timestamp">Timestamp in milliseconds representing the timestamp of a harsh event.</param>
        /// <returns>ApiResponse of VehicleHarshEventResponse</returns>
        ApiResponse<VehicleHarshEventResponse> GetVehicleHarshEventWithHttpInfo (long? vehicleId, string accessToken, long? timestamp);
        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
        /// </summary>
        /// <remarks>
        /// Fetch the safety score for the vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>VehicleSafetyScoreResponse</returns>
        VehicleSafetyScoreResponse GetVehicleSafetyScore (long? vehicleId, string accessToken, long? startMs, long? endMs);

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
        /// </summary>
        /// <remarks>
        /// Fetch the safety score for the vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>ApiResponse of VehicleSafetyScoreResponse</returns>
        ApiResponse<VehicleSafetyScoreResponse> GetVehicleSafetyScoreWithHttpInfo (long? vehicleId, string accessToken, long? startMs, long? endMs);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// /fleet/drivers/{driverId:[0-9]+}/safety/score
        /// </summary>
        /// <remarks>
        /// Fetch the safety score for the driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="driverId">ID of the driver</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>Task of DriverSafetyScoreResponse</returns>
        System.Threading.Tasks.Task<DriverSafetyScoreResponse> GetDriverSafetyScoreAsync (long? driverId, string accessToken, long? startMs, long? endMs);

        /// <summary>
        /// /fleet/drivers/{driverId:[0-9]+}/safety/score
        /// </summary>
        /// <remarks>
        /// Fetch the safety score for the driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="driverId">ID of the driver</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>Task of ApiResponse (DriverSafetyScoreResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<DriverSafetyScoreResponse>> GetDriverSafetyScoreAsyncWithHttpInfo (long? driverId, string accessToken, long? startMs, long? endMs);
        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
        /// </summary>
        /// <remarks>
        /// Fetch harsh event details for a vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="timestamp">Timestamp in milliseconds representing the timestamp of a harsh event.</param>
        /// <returns>Task of VehicleHarshEventResponse</returns>
        System.Threading.Tasks.Task<VehicleHarshEventResponse> GetVehicleHarshEventAsync (long? vehicleId, string accessToken, long? timestamp);

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
        /// </summary>
        /// <remarks>
        /// Fetch harsh event details for a vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="timestamp">Timestamp in milliseconds representing the timestamp of a harsh event.</param>
        /// <returns>Task of ApiResponse (VehicleHarshEventResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<VehicleHarshEventResponse>> GetVehicleHarshEventAsyncWithHttpInfo (long? vehicleId, string accessToken, long? timestamp);
        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
        /// </summary>
        /// <remarks>
        /// Fetch the safety score for the vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>Task of VehicleSafetyScoreResponse</returns>
        System.Threading.Tasks.Task<VehicleSafetyScoreResponse> GetVehicleSafetyScoreAsync (long? vehicleId, string accessToken, long? startMs, long? endMs);

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
        /// </summary>
        /// <remarks>
        /// Fetch the safety score for the vehicle.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>Task of ApiResponse (VehicleSafetyScoreResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<VehicleSafetyScoreResponse>> GetVehicleSafetyScoreAsyncWithHttpInfo (long? vehicleId, string accessToken, long? startMs, long? endMs);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class SafetyApi : ISafetyApi
    {
        private Org.OpenAPITools.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="SafetyApi"/> class.
        /// </summary>
        /// <returns></returns>
        public SafetyApi(String basePath)
        {
            this.Configuration = new Org.OpenAPITools.Client.Configuration { BasePath = basePath };

            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="SafetyApi"/> class
        /// </summary>
        /// <returns></returns>
        public SafetyApi()
        {
            this.Configuration = Org.OpenAPITools.Client.Configuration.Default;

            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="SafetyApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public SafetyApi(Org.OpenAPITools.Client.Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = Org.OpenAPITools.Client.Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        [Obsolete("SetBasePath is deprecated, please do 'Configuration.ApiClient = new ApiClient(\"http://new-path\")' instead.")]
        public void SetBasePath(String basePath)
        {
            // do nothing
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Org.OpenAPITools.Client.Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public Org.OpenAPITools.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public IDictionary<String, String> DefaultHeader()
        {
            return new ReadOnlyDictionary<string, string>(this.Configuration.DefaultHeader);
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        /// /fleet/drivers/{driverId:[0-9]+}/safety/score Fetch the safety score for the driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="driverId">ID of the driver</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>DriverSafetyScoreResponse</returns>
        public DriverSafetyScoreResponse GetDriverSafetyScore (long? driverId, string accessToken, long? startMs, long? endMs)
        {
             ApiResponse<DriverSafetyScoreResponse> localVarResponse = GetDriverSafetyScoreWithHttpInfo(driverId, accessToken, startMs, endMs);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/{driverId:[0-9]+}/safety/score Fetch the safety score for the driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="driverId">ID of the driver</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>ApiResponse of DriverSafetyScoreResponse</returns>
        public ApiResponse< DriverSafetyScoreResponse > GetDriverSafetyScoreWithHttpInfo (long? driverId, string accessToken, long? startMs, long? endMs)
        {
            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new ApiException(400, "Missing required parameter 'driverId' when calling SafetyApi->GetDriverSafetyScore");
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling SafetyApi->GetDriverSafetyScore");
            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new ApiException(400, "Missing required parameter 'startMs' when calling SafetyApi->GetDriverSafetyScore");
            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new ApiException(400, "Missing required parameter 'endMs' when calling SafetyApi->GetDriverSafetyScore");

            var localVarPath = "/fleet/drivers/{driverId}/safety/score";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (driverId != null) localVarPathParams.Add("driverId", this.Configuration.ApiClient.ParameterToString(driverId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (startMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "startMs", startMs)); // query parameter
            if (endMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endMs", endMs)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDriverSafetyScore", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DriverSafetyScoreResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DriverSafetyScoreResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DriverSafetyScoreResponse)));
        }

        /// <summary>
        /// /fleet/drivers/{driverId:[0-9]+}/safety/score Fetch the safety score for the driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="driverId">ID of the driver</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>Task of DriverSafetyScoreResponse</returns>
        public async System.Threading.Tasks.Task<DriverSafetyScoreResponse> GetDriverSafetyScoreAsync (long? driverId, string accessToken, long? startMs, long? endMs)
        {
             ApiResponse<DriverSafetyScoreResponse> localVarResponse = await GetDriverSafetyScoreAsyncWithHttpInfo(driverId, accessToken, startMs, endMs);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/{driverId:[0-9]+}/safety/score Fetch the safety score for the driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="driverId">ID of the driver</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>Task of ApiResponse (DriverSafetyScoreResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<DriverSafetyScoreResponse>> GetDriverSafetyScoreAsyncWithHttpInfo (long? driverId, string accessToken, long? startMs, long? endMs)
        {
            // verify the required parameter 'driverId' is set
            if (driverId == null)
                throw new ApiException(400, "Missing required parameter 'driverId' when calling SafetyApi->GetDriverSafetyScore");
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling SafetyApi->GetDriverSafetyScore");
            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new ApiException(400, "Missing required parameter 'startMs' when calling SafetyApi->GetDriverSafetyScore");
            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new ApiException(400, "Missing required parameter 'endMs' when calling SafetyApi->GetDriverSafetyScore");

            var localVarPath = "/fleet/drivers/{driverId}/safety/score";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (driverId != null) localVarPathParams.Add("driverId", this.Configuration.ApiClient.ParameterToString(driverId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (startMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "startMs", startMs)); // query parameter
            if (endMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endMs", endMs)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDriverSafetyScore", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DriverSafetyScoreResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (DriverSafetyScoreResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DriverSafetyScoreResponse)));
        }

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event Fetch harsh event details for a vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="timestamp">Timestamp in milliseconds representing the timestamp of a harsh event.</param>
        /// <returns>VehicleHarshEventResponse</returns>
        public VehicleHarshEventResponse GetVehicleHarshEvent (long? vehicleId, string accessToken, long? timestamp)
        {
             ApiResponse<VehicleHarshEventResponse> localVarResponse = GetVehicleHarshEventWithHttpInfo(vehicleId, accessToken, timestamp);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event Fetch harsh event details for a vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="timestamp">Timestamp in milliseconds representing the timestamp of a harsh event.</param>
        /// <returns>ApiResponse of VehicleHarshEventResponse</returns>
        public ApiResponse< VehicleHarshEventResponse > GetVehicleHarshEventWithHttpInfo (long? vehicleId, string accessToken, long? timestamp)
        {
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new ApiException(400, "Missing required parameter 'vehicleId' when calling SafetyApi->GetVehicleHarshEvent");
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling SafetyApi->GetVehicleHarshEvent");
            // verify the required parameter 'timestamp' is set
            if (timestamp == null)
                throw new ApiException(400, "Missing required parameter 'timestamp' when calling SafetyApi->GetVehicleHarshEvent");

            var localVarPath = "/fleet/vehicles/{vehicleId}/safety/harsh_event";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (vehicleId != null) localVarPathParams.Add("vehicleId", this.Configuration.ApiClient.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (timestamp != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "timestamp", timestamp)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVehicleHarshEvent", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<VehicleHarshEventResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (VehicleHarshEventResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(VehicleHarshEventResponse)));
        }

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event Fetch harsh event details for a vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="timestamp">Timestamp in milliseconds representing the timestamp of a harsh event.</param>
        /// <returns>Task of VehicleHarshEventResponse</returns>
        public async System.Threading.Tasks.Task<VehicleHarshEventResponse> GetVehicleHarshEventAsync (long? vehicleId, string accessToken, long? timestamp)
        {
             ApiResponse<VehicleHarshEventResponse> localVarResponse = await GetVehicleHarshEventAsyncWithHttpInfo(vehicleId, accessToken, timestamp);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event Fetch harsh event details for a vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="timestamp">Timestamp in milliseconds representing the timestamp of a harsh event.</param>
        /// <returns>Task of ApiResponse (VehicleHarshEventResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<VehicleHarshEventResponse>> GetVehicleHarshEventAsyncWithHttpInfo (long? vehicleId, string accessToken, long? timestamp)
        {
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new ApiException(400, "Missing required parameter 'vehicleId' when calling SafetyApi->GetVehicleHarshEvent");
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling SafetyApi->GetVehicleHarshEvent");
            // verify the required parameter 'timestamp' is set
            if (timestamp == null)
                throw new ApiException(400, "Missing required parameter 'timestamp' when calling SafetyApi->GetVehicleHarshEvent");

            var localVarPath = "/fleet/vehicles/{vehicleId}/safety/harsh_event";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (vehicleId != null) localVarPathParams.Add("vehicleId", this.Configuration.ApiClient.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (timestamp != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "timestamp", timestamp)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVehicleHarshEvent", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<VehicleHarshEventResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (VehicleHarshEventResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(VehicleHarshEventResponse)));
        }

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score Fetch the safety score for the vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>VehicleSafetyScoreResponse</returns>
        public VehicleSafetyScoreResponse GetVehicleSafetyScore (long? vehicleId, string accessToken, long? startMs, long? endMs)
        {
             ApiResponse<VehicleSafetyScoreResponse> localVarResponse = GetVehicleSafetyScoreWithHttpInfo(vehicleId, accessToken, startMs, endMs);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score Fetch the safety score for the vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>ApiResponse of VehicleSafetyScoreResponse</returns>
        public ApiResponse< VehicleSafetyScoreResponse > GetVehicleSafetyScoreWithHttpInfo (long? vehicleId, string accessToken, long? startMs, long? endMs)
        {
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new ApiException(400, "Missing required parameter 'vehicleId' when calling SafetyApi->GetVehicleSafetyScore");
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling SafetyApi->GetVehicleSafetyScore");
            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new ApiException(400, "Missing required parameter 'startMs' when calling SafetyApi->GetVehicleSafetyScore");
            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new ApiException(400, "Missing required parameter 'endMs' when calling SafetyApi->GetVehicleSafetyScore");

            var localVarPath = "/fleet/vehicles/{vehicleId}/safety/score";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (vehicleId != null) localVarPathParams.Add("vehicleId", this.Configuration.ApiClient.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (startMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "startMs", startMs)); // query parameter
            if (endMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endMs", endMs)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVehicleSafetyScore", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<VehicleSafetyScoreResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (VehicleSafetyScoreResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(VehicleSafetyScoreResponse)));
        }

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score Fetch the safety score for the vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>Task of VehicleSafetyScoreResponse</returns>
        public async System.Threading.Tasks.Task<VehicleSafetyScoreResponse> GetVehicleSafetyScoreAsync (long? vehicleId, string accessToken, long? startMs, long? endMs)
        {
             ApiResponse<VehicleSafetyScoreResponse> localVarResponse = await GetVehicleSafetyScoreAsyncWithHttpInfo(vehicleId, accessToken, startMs, endMs);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score Fetch the safety score for the vehicle.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>Task of ApiResponse (VehicleSafetyScoreResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<VehicleSafetyScoreResponse>> GetVehicleSafetyScoreAsyncWithHttpInfo (long? vehicleId, string accessToken, long? startMs, long? endMs)
        {
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null)
                throw new ApiException(400, "Missing required parameter 'vehicleId' when calling SafetyApi->GetVehicleSafetyScore");
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling SafetyApi->GetVehicleSafetyScore");
            // verify the required parameter 'startMs' is set
            if (startMs == null)
                throw new ApiException(400, "Missing required parameter 'startMs' when calling SafetyApi->GetVehicleSafetyScore");
            // verify the required parameter 'endMs' is set
            if (endMs == null)
                throw new ApiException(400, "Missing required parameter 'endMs' when calling SafetyApi->GetVehicleSafetyScore");

            var localVarPath = "/fleet/vehicles/{vehicleId}/safety/score";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (vehicleId != null) localVarPathParams.Add("vehicleId", this.Configuration.ApiClient.ParameterToString(vehicleId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (startMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "startMs", startMs)); // query parameter
            if (endMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endMs", endMs)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetVehicleSafetyScore", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<VehicleSafetyScoreResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (VehicleSafetyScoreResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(VehicleSafetyScoreResponse)));
        }

    }
}
