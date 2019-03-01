/* 
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |- -- -- -- -- -- --|- -- -- -- -- -- -- -- -|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using samsara.Client;
using samsara.Model;

namespace samsara.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IIndustrialApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// /industrial/data
        /// </summary>
        /// <remarks>
        /// Fetch all of the data inputs for a group.
        /// </remarks>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>InlineResponse2006</returns>
        InlineResponse2006 GetAllDataInputs (string accessToken, long? groupId = null, long? startMs = null, long? endMs = null);

        /// <summary>
        /// /industrial/data
        /// </summary>
        /// <remarks>
        /// Fetch all of the data inputs for a group.
        /// </remarks>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>ApiResponse of InlineResponse2006</returns>
        ApiResponse<InlineResponse2006> GetAllDataInputsWithHttpInfo (string accessToken, long? groupId = null, long? startMs = null, long? endMs = null);
        /// <summary>
        /// /industrial/data/{data_input_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch datapoints from a given data input.
        /// </remarks>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="dataInputId">ID of the data input</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>DataInputHistoryResponse</returns>
        DataInputHistoryResponse GetDataInput (string accessToken, long? dataInputId, long? startMs = null, long? endMs = null);

        /// <summary>
        /// /industrial/data/{data_input_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch datapoints from a given data input.
        /// </remarks>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="dataInputId">ID of the data input</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>ApiResponse of DataInputHistoryResponse</returns>
        ApiResponse<DataInputHistoryResponse> GetDataInputWithHttpInfo (string accessToken, long? dataInputId, long? startMs = null, long? endMs = null);
        /// <summary>
        /// /machines/list
        /// </summary>
        /// <remarks>
        /// Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
        /// </remarks>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam">Group ID to query.</param>
        /// <returns>InlineResponse2007</returns>
        InlineResponse2007 GetMachines (string accessToken, GroupParam groupParam);

        /// <summary>
        /// /machines/list
        /// </summary>
        /// <remarks>
        /// Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
        /// </remarks>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam">Group ID to query.</param>
        /// <returns>ApiResponse of InlineResponse2007</returns>
        ApiResponse<InlineResponse2007> GetMachinesWithHttpInfo (string accessToken, GroupParam groupParam);
        /// <summary>
        /// /machines/history
        /// </summary>
        /// <remarks>
        /// Get historical data for machine objects. This method returns a set of historical data for all machines in a group
        /// </remarks>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam">Group ID and time range to query for events</param>
        /// <returns>MachineHistoryResponse</returns>
        MachineHistoryResponse GetMachinesHistory (string accessToken, HistoryParam historyParam);

        /// <summary>
        /// /machines/history
        /// </summary>
        /// <remarks>
        /// Get historical data for machine objects. This method returns a set of historical data for all machines in a group
        /// </remarks>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam">Group ID and time range to query for events</param>
        /// <returns>ApiResponse of MachineHistoryResponse</returns>
        ApiResponse<MachineHistoryResponse> GetMachinesHistoryWithHttpInfo (string accessToken, HistoryParam historyParam);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// /industrial/data
        /// </summary>
        /// <remarks>
        /// Fetch all of the data inputs for a group.
        /// </remarks>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>Task of InlineResponse2006</returns>
        System.Threading.Tasks.Task<InlineResponse2006> GetAllDataInputsAsync (string accessToken, long? groupId = null, long? startMs = null, long? endMs = null);

        /// <summary>
        /// /industrial/data
        /// </summary>
        /// <remarks>
        /// Fetch all of the data inputs for a group.
        /// </remarks>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>Task of ApiResponse (InlineResponse2006)</returns>
        System.Threading.Tasks.Task<ApiResponse<InlineResponse2006>> GetAllDataInputsAsyncWithHttpInfo (string accessToken, long? groupId = null, long? startMs = null, long? endMs = null);
        /// <summary>
        /// /industrial/data/{data_input_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch datapoints from a given data input.
        /// </remarks>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="dataInputId">ID of the data input</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>Task of DataInputHistoryResponse</returns>
        System.Threading.Tasks.Task<DataInputHistoryResponse> GetDataInputAsync (string accessToken, long? dataInputId, long? startMs = null, long? endMs = null);

        /// <summary>
        /// /industrial/data/{data_input_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch datapoints from a given data input.
        /// </remarks>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="dataInputId">ID of the data input</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>Task of ApiResponse (DataInputHistoryResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<DataInputHistoryResponse>> GetDataInputAsyncWithHttpInfo (string accessToken, long? dataInputId, long? startMs = null, long? endMs = null);
        /// <summary>
        /// /machines/list
        /// </summary>
        /// <remarks>
        /// Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
        /// </remarks>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam">Group ID to query.</param>
        /// <returns>Task of InlineResponse2007</returns>
        System.Threading.Tasks.Task<InlineResponse2007> GetMachinesAsync (string accessToken, GroupParam groupParam);

        /// <summary>
        /// /machines/list
        /// </summary>
        /// <remarks>
        /// Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
        /// </remarks>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam">Group ID to query.</param>
        /// <returns>Task of ApiResponse (InlineResponse2007)</returns>
        System.Threading.Tasks.Task<ApiResponse<InlineResponse2007>> GetMachinesAsyncWithHttpInfo (string accessToken, GroupParam groupParam);
        /// <summary>
        /// /machines/history
        /// </summary>
        /// <remarks>
        /// Get historical data for machine objects. This method returns a set of historical data for all machines in a group
        /// </remarks>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam">Group ID and time range to query for events</param>
        /// <returns>Task of MachineHistoryResponse</returns>
        System.Threading.Tasks.Task<MachineHistoryResponse> GetMachinesHistoryAsync (string accessToken, HistoryParam historyParam);

        /// <summary>
        /// /machines/history
        /// </summary>
        /// <remarks>
        /// Get historical data for machine objects. This method returns a set of historical data for all machines in a group
        /// </remarks>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam">Group ID and time range to query for events</param>
        /// <returns>Task of ApiResponse (MachineHistoryResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<MachineHistoryResponse>> GetMachinesHistoryAsyncWithHttpInfo (string accessToken, HistoryParam historyParam);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class IndustrialApi : IIndustrialApi
    {
        private samsara.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="IndustrialApi"/> class.
        /// </summary>
        /// <returns></returns>
        public IndustrialApi(String basePath)
        {
            this.Configuration = new samsara.Client.Configuration { BasePath = basePath };

            ExceptionFactory = samsara.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="IndustrialApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public IndustrialApi(samsara.Client.Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = samsara.Client.Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = samsara.Client.Configuration.DefaultExceptionFactory;
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
        public samsara.Client.Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public samsara.Client.ExceptionFactory ExceptionFactory
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
        /// /industrial/data Fetch all of the data inputs for a group.
        /// </summary>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>InlineResponse2006</returns>
        public InlineResponse2006 GetAllDataInputs (string accessToken, long? groupId = null, long? startMs = null, long? endMs = null)
        {
             ApiResponse<InlineResponse2006> localVarResponse = GetAllDataInputsWithHttpInfo(accessToken, groupId, startMs, endMs);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /industrial/data Fetch all of the data inputs for a group.
        /// </summary>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>ApiResponse of InlineResponse2006</returns>
        public ApiResponse< InlineResponse2006 > GetAllDataInputsWithHttpInfo (string accessToken, long? groupId = null, long? startMs = null, long? endMs = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling IndustrialApi->GetAllDataInputs");

            var localVarPath = "/industrial/data";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "group_id", groupId)); // query parameter
            if (startMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "startMs", startMs)); // query parameter
            if (endMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endMs", endMs)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAllDataInputs", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<InlineResponse2006>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (InlineResponse2006) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(InlineResponse2006)));
        }

        /// <summary>
        /// /industrial/data Fetch all of the data inputs for a group.
        /// </summary>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>Task of InlineResponse2006</returns>
        public async System.Threading.Tasks.Task<InlineResponse2006> GetAllDataInputsAsync (string accessToken, long? groupId = null, long? startMs = null, long? endMs = null)
        {
             ApiResponse<InlineResponse2006> localVarResponse = await GetAllDataInputsAsyncWithHttpInfo(accessToken, groupId, startMs, endMs);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /industrial/data Fetch all of the data inputs for a group.
        /// </summary>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>Task of ApiResponse (InlineResponse2006)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<InlineResponse2006>> GetAllDataInputsAsyncWithHttpInfo (string accessToken, long? groupId = null, long? startMs = null, long? endMs = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling IndustrialApi->GetAllDataInputs");

            var localVarPath = "/industrial/data";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "group_id", groupId)); // query parameter
            if (startMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "startMs", startMs)); // query parameter
            if (endMs != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "endMs", endMs)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAllDataInputs", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<InlineResponse2006>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (InlineResponse2006) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(InlineResponse2006)));
        }

        /// <summary>
        /// /industrial/data/{data_input_id:[0-9]+} Fetch datapoints from a given data input.
        /// </summary>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="dataInputId">ID of the data input</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>DataInputHistoryResponse</returns>
        public DataInputHistoryResponse GetDataInput (string accessToken, long? dataInputId, long? startMs = null, long? endMs = null)
        {
             ApiResponse<DataInputHistoryResponse> localVarResponse = GetDataInputWithHttpInfo(accessToken, dataInputId, startMs, endMs);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /industrial/data/{data_input_id:[0-9]+} Fetch datapoints from a given data input.
        /// </summary>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="dataInputId">ID of the data input</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>ApiResponse of DataInputHistoryResponse</returns>
        public ApiResponse< DataInputHistoryResponse > GetDataInputWithHttpInfo (string accessToken, long? dataInputId, long? startMs = null, long? endMs = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling IndustrialApi->GetDataInput");
            // verify the required parameter 'dataInputId' is set
            if (dataInputId == null)
                throw new ApiException(400, "Missing required parameter 'dataInputId' when calling IndustrialApi->GetDataInput");

            var localVarPath = "/industrial/data/{data_input_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (dataInputId != null) localVarPathParams.Add("data_input_id", this.Configuration.ApiClient.ParameterToString(dataInputId)); // path parameter
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
                Exception exception = ExceptionFactory("GetDataInput", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DataInputHistoryResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (DataInputHistoryResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DataInputHistoryResponse)));
        }

        /// <summary>
        /// /industrial/data/{data_input_id:[0-9]+} Fetch datapoints from a given data input.
        /// </summary>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="dataInputId">ID of the data input</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>Task of DataInputHistoryResponse</returns>
        public async System.Threading.Tasks.Task<DataInputHistoryResponse> GetDataInputAsync (string accessToken, long? dataInputId, long? startMs = null, long? endMs = null)
        {
             ApiResponse<DataInputHistoryResponse> localVarResponse = await GetDataInputAsyncWithHttpInfo(accessToken, dataInputId, startMs, endMs);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /industrial/data/{data_input_id:[0-9]+} Fetch datapoints from a given data input.
        /// </summary>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="dataInputId">ID of the data input</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>Task of ApiResponse (DataInputHistoryResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<DataInputHistoryResponse>> GetDataInputAsyncWithHttpInfo (string accessToken, long? dataInputId, long? startMs = null, long? endMs = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling IndustrialApi->GetDataInput");
            // verify the required parameter 'dataInputId' is set
            if (dataInputId == null)
                throw new ApiException(400, "Missing required parameter 'dataInputId' when calling IndustrialApi->GetDataInput");

            var localVarPath = "/industrial/data/{data_input_id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (dataInputId != null) localVarPathParams.Add("data_input_id", this.Configuration.ApiClient.ParameterToString(dataInputId)); // path parameter
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
                Exception exception = ExceptionFactory("GetDataInput", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DataInputHistoryResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (DataInputHistoryResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(DataInputHistoryResponse)));
        }

        /// <summary>
        /// /machines/list Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
        /// </summary>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam">Group ID to query.</param>
        /// <returns>InlineResponse2007</returns>
        public InlineResponse2007 GetMachines (string accessToken, GroupParam groupParam)
        {
             ApiResponse<InlineResponse2007> localVarResponse = GetMachinesWithHttpInfo(accessToken, groupParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /machines/list Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
        /// </summary>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam">Group ID to query.</param>
        /// <returns>ApiResponse of InlineResponse2007</returns>
        public ApiResponse< InlineResponse2007 > GetMachinesWithHttpInfo (string accessToken, GroupParam groupParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling IndustrialApi->GetMachines");
            // verify the required parameter 'groupParam' is set
            if (groupParam == null)
                throw new ApiException(400, "Missing required parameter 'groupParam' when calling IndustrialApi->GetMachines");

            var localVarPath = "/machines/list";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupParam != null && groupParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(groupParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = groupParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetMachines", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<InlineResponse2007>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (InlineResponse2007) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(InlineResponse2007)));
        }

        /// <summary>
        /// /machines/list Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
        /// </summary>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam">Group ID to query.</param>
        /// <returns>Task of InlineResponse2007</returns>
        public async System.Threading.Tasks.Task<InlineResponse2007> GetMachinesAsync (string accessToken, GroupParam groupParam)
        {
             ApiResponse<InlineResponse2007> localVarResponse = await GetMachinesAsyncWithHttpInfo(accessToken, groupParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /machines/list Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
        /// </summary>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam">Group ID to query.</param>
        /// <returns>Task of ApiResponse (InlineResponse2007)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<InlineResponse2007>> GetMachinesAsyncWithHttpInfo (string accessToken, GroupParam groupParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling IndustrialApi->GetMachines");
            // verify the required parameter 'groupParam' is set
            if (groupParam == null)
                throw new ApiException(400, "Missing required parameter 'groupParam' when calling IndustrialApi->GetMachines");

            var localVarPath = "/machines/list";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupParam != null && groupParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(groupParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = groupParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetMachines", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<InlineResponse2007>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (InlineResponse2007) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(InlineResponse2007)));
        }

        /// <summary>
        /// /machines/history Get historical data for machine objects. This method returns a set of historical data for all machines in a group
        /// </summary>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam">Group ID and time range to query for events</param>
        /// <returns>MachineHistoryResponse</returns>
        public MachineHistoryResponse GetMachinesHistory (string accessToken, HistoryParam historyParam)
        {
             ApiResponse<MachineHistoryResponse> localVarResponse = GetMachinesHistoryWithHttpInfo(accessToken, historyParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /machines/history Get historical data for machine objects. This method returns a set of historical data for all machines in a group
        /// </summary>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam">Group ID and time range to query for events</param>
        /// <returns>ApiResponse of MachineHistoryResponse</returns>
        public ApiResponse< MachineHistoryResponse > GetMachinesHistoryWithHttpInfo (string accessToken, HistoryParam historyParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling IndustrialApi->GetMachinesHistory");
            // verify the required parameter 'historyParam' is set
            if (historyParam == null)
                throw new ApiException(400, "Missing required parameter 'historyParam' when calling IndustrialApi->GetMachinesHistory");

            var localVarPath = "/machines/history";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (historyParam != null && historyParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(historyParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = historyParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetMachinesHistory", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MachineHistoryResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (MachineHistoryResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MachineHistoryResponse)));
        }

        /// <summary>
        /// /machines/history Get historical data for machine objects. This method returns a set of historical data for all machines in a group
        /// </summary>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam">Group ID and time range to query for events</param>
        /// <returns>Task of MachineHistoryResponse</returns>
        public async System.Threading.Tasks.Task<MachineHistoryResponse> GetMachinesHistoryAsync (string accessToken, HistoryParam historyParam)
        {
             ApiResponse<MachineHistoryResponse> localVarResponse = await GetMachinesHistoryAsyncWithHttpInfo(accessToken, historyParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /machines/history Get historical data for machine objects. This method returns a set of historical data for all machines in a group
        /// </summary>
        /// <exception cref="samsara.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam">Group ID and time range to query for events</param>
        /// <returns>Task of ApiResponse (MachineHistoryResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<MachineHistoryResponse>> GetMachinesHistoryAsyncWithHttpInfo (string accessToken, HistoryParam historyParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling IndustrialApi->GetMachinesHistory");
            // verify the required parameter 'historyParam' is set
            if (historyParam == null)
                throw new ApiException(400, "Missing required parameter 'historyParam' when calling IndustrialApi->GetMachinesHistory");

            var localVarPath = "/machines/history";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (historyParam != null && historyParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(historyParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = historyParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetMachinesHistory", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<MachineHistoryResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (MachineHistoryResponse) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(MachineHistoryResponse)));
        }

    }
}
