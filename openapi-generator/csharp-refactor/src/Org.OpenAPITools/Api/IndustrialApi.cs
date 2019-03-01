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
using System.Net;
using System.Net.Mime;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IIndustrialApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// /industrial/data
        /// </summary>
        /// <remarks>
        /// Fetch all of the data inputs for a group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
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
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
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
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="dataInputId">ID of the data input</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>DataInputHistoryResponse</returns>
        DataInputHistoryResponse GetDataInput (string accessToken, long dataInputId, long? startMs = null, long? endMs = null);

        /// <summary>
        /// /industrial/data/{data_input_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch datapoints from a given data input.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="dataInputId">ID of the data input</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>ApiResponse of DataInputHistoryResponse</returns>
        ApiResponse<DataInputHistoryResponse> GetDataInputWithHttpInfo (string accessToken, long dataInputId, long? startMs = null, long? endMs = null);
        /// <summary>
        /// /machines/list
        /// </summary>
        /// <remarks>
        /// Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>InlineResponse2007</returns>
        InlineResponse2007 GetMachines (string accessToken, InlineObject18 groupParam);

        /// <summary>
        /// /machines/list
        /// </summary>
        /// <remarks>
        /// Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>ApiResponse of InlineResponse2007</returns>
        ApiResponse<InlineResponse2007> GetMachinesWithHttpInfo (string accessToken, InlineObject18 groupParam);
        /// <summary>
        /// /machines/history
        /// </summary>
        /// <remarks>
        /// Get historical data for machine objects. This method returns a set of historical data for all machines in a group
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam"></param>
        /// <returns>MachineHistoryResponse</returns>
        MachineHistoryResponse GetMachinesHistory (string accessToken, InlineObject17 historyParam);

        /// <summary>
        /// /machines/history
        /// </summary>
        /// <remarks>
        /// Get historical data for machine objects. This method returns a set of historical data for all machines in a group
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam"></param>
        /// <returns>ApiResponse of MachineHistoryResponse</returns>
        ApiResponse<MachineHistoryResponse> GetMachinesHistoryWithHttpInfo (string accessToken, InlineObject17 historyParam);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IIndustrialApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// /industrial/data
        /// </summary>
        /// <remarks>
        /// Fetch all of the data inputs for a group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
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
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
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
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="dataInputId">ID of the data input</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>Task of DataInputHistoryResponse</returns>
        System.Threading.Tasks.Task<DataInputHistoryResponse> GetDataInputAsync (string accessToken, long dataInputId, long? startMs = null, long? endMs = null);

        /// <summary>
        /// /industrial/data/{data_input_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch datapoints from a given data input.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="dataInputId">ID of the data input</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>Task of ApiResponse (DataInputHistoryResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<DataInputHistoryResponse>> GetDataInputAsyncWithHttpInfo (string accessToken, long dataInputId, long? startMs = null, long? endMs = null);
        /// <summary>
        /// /machines/list
        /// </summary>
        /// <remarks>
        /// Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>Task of InlineResponse2007</returns>
        System.Threading.Tasks.Task<InlineResponse2007> GetMachinesAsync (string accessToken, InlineObject18 groupParam);

        /// <summary>
        /// /machines/list
        /// </summary>
        /// <remarks>
        /// Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>Task of ApiResponse (InlineResponse2007)</returns>
        System.Threading.Tasks.Task<ApiResponse<InlineResponse2007>> GetMachinesAsyncWithHttpInfo (string accessToken, InlineObject18 groupParam);
        /// <summary>
        /// /machines/history
        /// </summary>
        /// <remarks>
        /// Get historical data for machine objects. This method returns a set of historical data for all machines in a group
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam"></param>
        /// <returns>Task of MachineHistoryResponse</returns>
        System.Threading.Tasks.Task<MachineHistoryResponse> GetMachinesHistoryAsync (string accessToken, InlineObject17 historyParam);

        /// <summary>
        /// /machines/history
        /// </summary>
        /// <remarks>
        /// Get historical data for machine objects. This method returns a set of historical data for all machines in a group
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam"></param>
        /// <returns>Task of ApiResponse (MachineHistoryResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<MachineHistoryResponse>> GetMachinesHistoryAsyncWithHttpInfo (string accessToken, InlineObject17 historyParam);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IIndustrialApi : IIndustrialApiSync, IIndustrialApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class IndustrialApi : IIndustrialApi
    {
        private Org.OpenAPITools.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="IndustrialApi"/> class.
        /// </summary>
        /// <returns></returns>
        public IndustrialApi() : this((string) null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="IndustrialApi"/> class.
        /// </summary>
        /// <returns></returns>
        public IndustrialApi(String basePath)
        {
            this.Configuration = Org.OpenAPITools.Client.Configuration.MergeConfigurations(
                Org.OpenAPITools.Client.GlobalConfiguration.Instance,
                new Org.OpenAPITools.Client.Configuration { BasePath = basePath }
            );
            this.Client = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="IndustrialApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public IndustrialApi(Org.OpenAPITools.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = Org.OpenAPITools.Client.Configuration.MergeConfigurations(
                Org.OpenAPITools.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="PetApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public IndustrialApi(Org.OpenAPITools.Client.ISynchronousClient client,Org.OpenAPITools.Client.IAsynchronousClient asyncClient, Org.OpenAPITools.Client.IReadableConfiguration configuration)
        {
            if(client == null) throw new ArgumentNullException("client");
            if(asyncClient == null) throw new ArgumentNullException("asyncClient");
            if(configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public Org.OpenAPITools.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public Org.OpenAPITools.Client.ISynchronousClient Client { get; set; }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.BasePath;
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Org.OpenAPITools.Client.IReadableConfiguration Configuration {get; set;}

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
        /// /industrial/data Fetch all of the data inputs for a group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>InlineResponse2006</returns>
        public InlineResponse2006 GetAllDataInputs (string accessToken, long? groupId = null, long? startMs = null, long? endMs = null)
        {
             Org.OpenAPITools.Client.ApiResponse<InlineResponse2006> localVarResponse = GetAllDataInputsWithHttpInfo(accessToken, groupId, startMs, endMs);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /industrial/data Fetch all of the data inputs for a group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>ApiResponse of InlineResponse2006</returns>
        public Org.OpenAPITools.Client.ApiResponse< InlineResponse2006 > GetAllDataInputsWithHttpInfo (string accessToken, long? groupId = null, long? startMs = null, long? endMs = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling IndustrialApi->GetAllDataInputs");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (groupId != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "group_id", groupId))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "startMs", startMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "endMs", endMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< InlineResponse2006 >("/industrial/data", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetAllDataInputs", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /industrial/data Fetch all of the data inputs for a group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>Task of InlineResponse2006</returns>
        public async System.Threading.Tasks.Task<InlineResponse2006> GetAllDataInputsAsync (string accessToken, long? groupId = null, long? startMs = null, long? endMs = null)
        {
             Org.OpenAPITools.Client.ApiResponse<InlineResponse2006> localVarResponse = await GetAllDataInputsAsyncWithHttpInfo(accessToken, groupId, startMs, endMs);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /industrial/data Fetch all of the data inputs for a group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>Task of ApiResponse (InlineResponse2006)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<InlineResponse2006>> GetAllDataInputsAsyncWithHttpInfo (string accessToken, long? groupId = null, long? startMs = null, long? endMs = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling IndustrialApi->GetAllDataInputs");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (groupId != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "group_id", groupId))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "startMs", startMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "endMs", endMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<InlineResponse2006>("/industrial/data", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetAllDataInputs", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /industrial/data/{data_input_id:[0-9]+} Fetch datapoints from a given data input.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="dataInputId">ID of the data input</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>DataInputHistoryResponse</returns>
        public DataInputHistoryResponse GetDataInput (string accessToken, long dataInputId, long? startMs = null, long? endMs = null)
        {
             Org.OpenAPITools.Client.ApiResponse<DataInputHistoryResponse> localVarResponse = GetDataInputWithHttpInfo(accessToken, dataInputId, startMs, endMs);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /industrial/data/{data_input_id:[0-9]+} Fetch datapoints from a given data input.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="dataInputId">ID of the data input</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>ApiResponse of DataInputHistoryResponse</returns>
        public Org.OpenAPITools.Client.ApiResponse< DataInputHistoryResponse > GetDataInputWithHttpInfo (string accessToken, long dataInputId, long? startMs = null, long? endMs = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling IndustrialApi->GetDataInput");

            // verify the required parameter 'dataInputId' is set
            if (dataInputId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'dataInputId' when calling IndustrialApi->GetDataInput");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (dataInputId != null)
                requestOptions.PathParameters.Add("data_input_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(dataInputId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "startMs", startMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "endMs", endMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = this.Client.Get< DataInputHistoryResponse >("/industrial/data/{data_input_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDataInput", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /industrial/data/{data_input_id:[0-9]+} Fetch datapoints from a given data input.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="dataInputId">ID of the data input</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>Task of DataInputHistoryResponse</returns>
        public async System.Threading.Tasks.Task<DataInputHistoryResponse> GetDataInputAsync (string accessToken, long dataInputId, long? startMs = null, long? endMs = null)
        {
             Org.OpenAPITools.Client.ApiResponse<DataInputHistoryResponse> localVarResponse = await GetDataInputAsyncWithHttpInfo(accessToken, dataInputId, startMs, endMs);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /industrial/data/{data_input_id:[0-9]+} Fetch datapoints from a given data input.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="dataInputId">ID of the data input</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>Task of ApiResponse (DataInputHistoryResponse)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<DataInputHistoryResponse>> GetDataInputAsyncWithHttpInfo (string accessToken, long dataInputId, long? startMs = null, long? endMs = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling IndustrialApi->GetDataInput");

            // verify the required parameter 'dataInputId' is set
            if (dataInputId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'dataInputId' when calling IndustrialApi->GetDataInput");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (dataInputId != null)
                requestOptions.PathParameters.Add("data_input_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(dataInputId)); // path parameter
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (startMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "startMs", startMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            if (endMs != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "endMs", endMs))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<DataInputHistoryResponse>("/industrial/data/{data_input_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDataInput", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /machines/list Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>InlineResponse2007</returns>
        public InlineResponse2007 GetMachines (string accessToken, InlineObject18 groupParam)
        {
             Org.OpenAPITools.Client.ApiResponse<InlineResponse2007> localVarResponse = GetMachinesWithHttpInfo(accessToken, groupParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /machines/list Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>ApiResponse of InlineResponse2007</returns>
        public Org.OpenAPITools.Client.ApiResponse< InlineResponse2007 > GetMachinesWithHttpInfo (string accessToken, InlineObject18 groupParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling IndustrialApi->GetMachines");

            // verify the required parameter 'groupParam' is set
            if (groupParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'groupParam' when calling IndustrialApi->GetMachines");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = groupParam;


            // make the HTTP request

            var response = this.Client.Post< InlineResponse2007 >("/machines/list", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetMachines", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /machines/list Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>Task of InlineResponse2007</returns>
        public async System.Threading.Tasks.Task<InlineResponse2007> GetMachinesAsync (string accessToken, InlineObject18 groupParam)
        {
             Org.OpenAPITools.Client.ApiResponse<InlineResponse2007> localVarResponse = await GetMachinesAsyncWithHttpInfo(accessToken, groupParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /machines/list Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>Task of ApiResponse (InlineResponse2007)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<InlineResponse2007>> GetMachinesAsyncWithHttpInfo (string accessToken, InlineObject18 groupParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling IndustrialApi->GetMachines");

            // verify the required parameter 'groupParam' is set
            if (groupParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'groupParam' when calling IndustrialApi->GetMachines");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = groupParam;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<InlineResponse2007>("/machines/list", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetMachines", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /machines/history Get historical data for machine objects. This method returns a set of historical data for all machines in a group
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam"></param>
        /// <returns>MachineHistoryResponse</returns>
        public MachineHistoryResponse GetMachinesHistory (string accessToken, InlineObject17 historyParam)
        {
             Org.OpenAPITools.Client.ApiResponse<MachineHistoryResponse> localVarResponse = GetMachinesHistoryWithHttpInfo(accessToken, historyParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /machines/history Get historical data for machine objects. This method returns a set of historical data for all machines in a group
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam"></param>
        /// <returns>ApiResponse of MachineHistoryResponse</returns>
        public Org.OpenAPITools.Client.ApiResponse< MachineHistoryResponse > GetMachinesHistoryWithHttpInfo (string accessToken, InlineObject17 historyParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling IndustrialApi->GetMachinesHistory");

            // verify the required parameter 'historyParam' is set
            if (historyParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'historyParam' when calling IndustrialApi->GetMachinesHistory");

            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };

            var localVarConentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(@contentTypes);
            if (localVarConentType != null) requestOptions.HeaderParameters.Add("Content-Type", localVarConentType);

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(@accepts);
            if (localVarAccept != null) requestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = historyParam;


            // make the HTTP request

            var response = this.Client.Post< MachineHistoryResponse >("/machines/history", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetMachinesHistory", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /machines/history Get historical data for machine objects. This method returns a set of historical data for all machines in a group
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam"></param>
        /// <returns>Task of MachineHistoryResponse</returns>
        public async System.Threading.Tasks.Task<MachineHistoryResponse> GetMachinesHistoryAsync (string accessToken, InlineObject17 historyParam)
        {
             Org.OpenAPITools.Client.ApiResponse<MachineHistoryResponse> localVarResponse = await GetMachinesHistoryAsyncWithHttpInfo(accessToken, historyParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /machines/history Get historical data for machine objects. This method returns a set of historical data for all machines in a group
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam"></param>
        /// <returns>Task of ApiResponse (MachineHistoryResponse)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<MachineHistoryResponse>> GetMachinesHistoryAsyncWithHttpInfo (string accessToken, InlineObject17 historyParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling IndustrialApi->GetMachinesHistory");

            // verify the required parameter 'historyParam' is set
            if (historyParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'historyParam' when calling IndustrialApi->GetMachinesHistory");


            Org.OpenAPITools.Client.RequestOptions requestOptions = new Org.OpenAPITools.Client.RequestOptions();

            String[] @contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] @accepts = new String[] {
                "application/json"
            };
            
            foreach (var contentType in @contentTypes)
                requestOptions.HeaderParameters.Add("Content-Type", contentType);
            
            foreach (var accept in @accepts)
                requestOptions.HeaderParameters.Add("Accept", accept);
            
            if (accessToken != null)
            {
                foreach (var kvp in Org.OpenAPITools.Client.ClientUtils.ParameterToMultiMap("", "access_token", accessToken))
                {
                    foreach (var value in kvp.Value)
                    {
                        requestOptions.QueryParameters.Add(kvp.Key, value);
                    }
                }
            }
            requestOptions.Data = historyParam;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<MachineHistoryResponse>("/machines/history", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetMachinesHistory", response);
                if (exception != null) throw exception;
            }

            return response;
        }

    }
}
