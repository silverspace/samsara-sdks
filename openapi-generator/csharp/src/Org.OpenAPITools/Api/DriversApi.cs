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
    public interface IDriversApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// /fleet/drivers/create
        /// </summary>
        /// <remarks>
        /// Create a new driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDriverParam">Driver creation body</param>
        /// <returns>Driver</returns>
        Driver CreateDriver (string accessToken, DriverForCreate createDriverParam);

        /// <summary>
        /// /fleet/drivers/create
        /// </summary>
        /// <remarks>
        /// Create a new driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDriverParam">Driver creation body</param>
        /// <returns>ApiResponse of Driver</returns>
        ApiResponse<Driver> CreateDriverWithHttpInfo (string accessToken, DriverForCreate createDriverParam);
        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Deactivate a driver with the given id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns></returns>
        void DeactivateDriver (string accessToken, string driverIdOrExternalId);

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Deactivate a driver with the given id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> DeactivateDriverWithHttpInfo (string accessToken, string driverIdOrExternalId);
        /// <summary>
        /// /fleet/drivers/inactive
        /// </summary>
        /// <remarks>
        /// Fetch all deactivated drivers for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>List&lt;Driver&gt;</returns>
        List<Driver> GetAllDeactivatedDrivers (string accessToken, long? groupId = null);

        /// <summary>
        /// /fleet/drivers/inactive
        /// </summary>
        /// <remarks>
        /// Fetch all deactivated drivers for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>ApiResponse of List&lt;Driver&gt;</returns>
        ApiResponse<List<Driver>> GetAllDeactivatedDriversWithHttpInfo (string accessToken, long? groupId = null);
        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch deactivated driver by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Driver</returns>
        Driver GetDeactivatedDriverById (string accessToken, string driverIdOrExternalId);

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch deactivated driver by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>ApiResponse of Driver</returns>
        ApiResponse<Driver> GetDeactivatedDriverByIdWithHttpInfo (string accessToken, string driverIdOrExternalId);
        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch driver by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Driver</returns>
        Driver GetDriverById (string accessToken, string driverIdOrExternalId);

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch driver by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>ApiResponse of Driver</returns>
        ApiResponse<Driver> GetDriverByIdWithHttpInfo (string accessToken, string driverIdOrExternalId);
        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Reactivate the inactive driver having id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <param name="reactivateDriverParam"></param>
        /// <returns>Driver</returns>
        Driver ReactivateDriverById (string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam);

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Reactivate the inactive driver having id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <param name="reactivateDriverParam"></param>
        /// <returns>ApiResponse of Driver</returns>
        ApiResponse<Driver> ReactivateDriverByIdWithHttpInfo (string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// /fleet/drivers/create
        /// </summary>
        /// <remarks>
        /// Create a new driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDriverParam">Driver creation body</param>
        /// <returns>Task of Driver</returns>
        System.Threading.Tasks.Task<Driver> CreateDriverAsync (string accessToken, DriverForCreate createDriverParam);

        /// <summary>
        /// /fleet/drivers/create
        /// </summary>
        /// <remarks>
        /// Create a new driver.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDriverParam">Driver creation body</param>
        /// <returns>Task of ApiResponse (Driver)</returns>
        System.Threading.Tasks.Task<ApiResponse<Driver>> CreateDriverAsyncWithHttpInfo (string accessToken, DriverForCreate createDriverParam);
        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Deactivate a driver with the given id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task DeactivateDriverAsync (string accessToken, string driverIdOrExternalId);

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Deactivate a driver with the given id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> DeactivateDriverAsyncWithHttpInfo (string accessToken, string driverIdOrExternalId);
        /// <summary>
        /// /fleet/drivers/inactive
        /// </summary>
        /// <remarks>
        /// Fetch all deactivated drivers for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of List&lt;Driver&gt;</returns>
        System.Threading.Tasks.Task<List<Driver>> GetAllDeactivatedDriversAsync (string accessToken, long? groupId = null);

        /// <summary>
        /// /fleet/drivers/inactive
        /// </summary>
        /// <remarks>
        /// Fetch all deactivated drivers for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;Driver&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<Driver>>> GetAllDeactivatedDriversAsyncWithHttpInfo (string accessToken, long? groupId = null);
        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch deactivated driver by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of Driver</returns>
        System.Threading.Tasks.Task<Driver> GetDeactivatedDriverByIdAsync (string accessToken, string driverIdOrExternalId);

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch deactivated driver by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of ApiResponse (Driver)</returns>
        System.Threading.Tasks.Task<ApiResponse<Driver>> GetDeactivatedDriverByIdAsyncWithHttpInfo (string accessToken, string driverIdOrExternalId);
        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch driver by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of Driver</returns>
        System.Threading.Tasks.Task<Driver> GetDriverByIdAsync (string accessToken, string driverIdOrExternalId);

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch driver by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of ApiResponse (Driver)</returns>
        System.Threading.Tasks.Task<ApiResponse<Driver>> GetDriverByIdAsyncWithHttpInfo (string accessToken, string driverIdOrExternalId);
        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Reactivate the inactive driver having id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <param name="reactivateDriverParam"></param>
        /// <returns>Task of Driver</returns>
        System.Threading.Tasks.Task<Driver> ReactivateDriverByIdAsync (string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam);

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        /// </summary>
        /// <remarks>
        /// Reactivate the inactive driver having id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <param name="reactivateDriverParam"></param>
        /// <returns>Task of ApiResponse (Driver)</returns>
        System.Threading.Tasks.Task<ApiResponse<Driver>> ReactivateDriverByIdAsyncWithHttpInfo (string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class DriversApi : IDriversApi
    {
        private Org.OpenAPITools.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="DriversApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DriversApi(String basePath)
        {
            this.Configuration = new Org.OpenAPITools.Client.Configuration { BasePath = basePath };

            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DriversApi"/> class
        /// </summary>
        /// <returns></returns>
        public DriversApi()
        {
            this.Configuration = Org.OpenAPITools.Client.Configuration.Default;

            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DriversApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public DriversApi(Org.OpenAPITools.Client.Configuration configuration = null)
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
        /// /fleet/drivers/create Create a new driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDriverParam">Driver creation body</param>
        /// <returns>Driver</returns>
        public Driver CreateDriver (string accessToken, DriverForCreate createDriverParam)
        {
             ApiResponse<Driver> localVarResponse = CreateDriverWithHttpInfo(accessToken, createDriverParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/create Create a new driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDriverParam">Driver creation body</param>
        /// <returns>ApiResponse of Driver</returns>
        public ApiResponse< Driver > CreateDriverWithHttpInfo (string accessToken, DriverForCreate createDriverParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling DriversApi->CreateDriver");
            // verify the required parameter 'createDriverParam' is set
            if (createDriverParam == null)
                throw new ApiException(400, "Missing required parameter 'createDriverParam' when calling DriversApi->CreateDriver");

            var localVarPath = "/fleet/drivers/create";
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
            if (createDriverParam != null && createDriverParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(createDriverParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = createDriverParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateDriver", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Driver>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Driver) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Driver)));
        }

        /// <summary>
        /// /fleet/drivers/create Create a new driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDriverParam">Driver creation body</param>
        /// <returns>Task of Driver</returns>
        public async System.Threading.Tasks.Task<Driver> CreateDriverAsync (string accessToken, DriverForCreate createDriverParam)
        {
             ApiResponse<Driver> localVarResponse = await CreateDriverAsyncWithHttpInfo(accessToken, createDriverParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/create Create a new driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDriverParam">Driver creation body</param>
        /// <returns>Task of ApiResponse (Driver)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Driver>> CreateDriverAsyncWithHttpInfo (string accessToken, DriverForCreate createDriverParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling DriversApi->CreateDriver");
            // verify the required parameter 'createDriverParam' is set
            if (createDriverParam == null)
                throw new ApiException(400, "Missing required parameter 'createDriverParam' when calling DriversApi->CreateDriver");

            var localVarPath = "/fleet/drivers/create";
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
            if (createDriverParam != null && createDriverParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(createDriverParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = createDriverParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateDriver", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Driver>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Driver) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Driver)));
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Deactivate a driver with the given id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns></returns>
        public void DeactivateDriver (string accessToken, string driverIdOrExternalId)
        {
             DeactivateDriverWithHttpInfo(accessToken, driverIdOrExternalId);
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Deactivate a driver with the given id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> DeactivateDriverWithHttpInfo (string accessToken, string driverIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling DriversApi->DeactivateDriver");
            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling DriversApi->DeactivateDriver");

            var localVarPath = "/fleet/drivers/{driver_id_or_external_id}";
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

            if (driverIdOrExternalId != null) localVarPathParams.Add("driver_id_or_external_id", this.Configuration.ApiClient.ParameterToString(driverIdOrExternalId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeactivateDriver", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Deactivate a driver with the given id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeactivateDriverAsync (string accessToken, string driverIdOrExternalId)
        {
             await DeactivateDriverAsyncWithHttpInfo(accessToken, driverIdOrExternalId);

        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Deactivate a driver with the given id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> DeactivateDriverAsyncWithHttpInfo (string accessToken, string driverIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling DriversApi->DeactivateDriver");
            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling DriversApi->DeactivateDriver");

            var localVarPath = "/fleet/drivers/{driver_id_or_external_id}";
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

            if (driverIdOrExternalId != null) localVarPathParams.Add("driver_id_or_external_id", this.Configuration.ApiClient.ParameterToString(driverIdOrExternalId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeactivateDriver", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// /fleet/drivers/inactive Fetch all deactivated drivers for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>List&lt;Driver&gt;</returns>
        public List<Driver> GetAllDeactivatedDrivers (string accessToken, long? groupId = null)
        {
             ApiResponse<List<Driver>> localVarResponse = GetAllDeactivatedDriversWithHttpInfo(accessToken, groupId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/inactive Fetch all deactivated drivers for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>ApiResponse of List&lt;Driver&gt;</returns>
        public ApiResponse< List<Driver> > GetAllDeactivatedDriversWithHttpInfo (string accessToken, long? groupId = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling DriversApi->GetAllDeactivatedDrivers");

            var localVarPath = "/fleet/drivers/inactive";
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

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "group_id", groupId)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAllDeactivatedDrivers", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<Driver>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<Driver>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<Driver>)));
        }

        /// <summary>
        /// /fleet/drivers/inactive Fetch all deactivated drivers for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of List&lt;Driver&gt;</returns>
        public async System.Threading.Tasks.Task<List<Driver>> GetAllDeactivatedDriversAsync (string accessToken, long? groupId = null)
        {
             ApiResponse<List<Driver>> localVarResponse = await GetAllDeactivatedDriversAsyncWithHttpInfo(accessToken, groupId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/inactive Fetch all deactivated drivers for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;Driver&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<Driver>>> GetAllDeactivatedDriversAsyncWithHttpInfo (string accessToken, long? groupId = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling DriversApi->GetAllDeactivatedDrivers");

            var localVarPath = "/fleet/drivers/inactive";
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

            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (groupId != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "group_id", groupId)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAllDeactivatedDrivers", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<Driver>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<Driver>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<Driver>)));
        }

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Fetch deactivated driver by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Driver</returns>
        public Driver GetDeactivatedDriverById (string accessToken, string driverIdOrExternalId)
        {
             ApiResponse<Driver> localVarResponse = GetDeactivatedDriverByIdWithHttpInfo(accessToken, driverIdOrExternalId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Fetch deactivated driver by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>ApiResponse of Driver</returns>
        public ApiResponse< Driver > GetDeactivatedDriverByIdWithHttpInfo (string accessToken, string driverIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling DriversApi->GetDeactivatedDriverById");
            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling DriversApi->GetDeactivatedDriverById");

            var localVarPath = "/fleet/drivers/inactive/{driver_id_or_external_id}";
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

            if (driverIdOrExternalId != null) localVarPathParams.Add("driver_id_or_external_id", this.Configuration.ApiClient.ParameterToString(driverIdOrExternalId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDeactivatedDriverById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Driver>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Driver) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Driver)));
        }

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Fetch deactivated driver by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of Driver</returns>
        public async System.Threading.Tasks.Task<Driver> GetDeactivatedDriverByIdAsync (string accessToken, string driverIdOrExternalId)
        {
             ApiResponse<Driver> localVarResponse = await GetDeactivatedDriverByIdAsyncWithHttpInfo(accessToken, driverIdOrExternalId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Fetch deactivated driver by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of ApiResponse (Driver)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Driver>> GetDeactivatedDriverByIdAsyncWithHttpInfo (string accessToken, string driverIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling DriversApi->GetDeactivatedDriverById");
            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling DriversApi->GetDeactivatedDriverById");

            var localVarPath = "/fleet/drivers/inactive/{driver_id_or_external_id}";
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

            if (driverIdOrExternalId != null) localVarPathParams.Add("driver_id_or_external_id", this.Configuration.ApiClient.ParameterToString(driverIdOrExternalId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDeactivatedDriverById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Driver>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Driver) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Driver)));
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Fetch driver by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Driver</returns>
        public Driver GetDriverById (string accessToken, string driverIdOrExternalId)
        {
             ApiResponse<Driver> localVarResponse = GetDriverByIdWithHttpInfo(accessToken, driverIdOrExternalId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Fetch driver by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>ApiResponse of Driver</returns>
        public ApiResponse< Driver > GetDriverByIdWithHttpInfo (string accessToken, string driverIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling DriversApi->GetDriverById");
            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling DriversApi->GetDriverById");

            var localVarPath = "/fleet/drivers/{driver_id_or_external_id}";
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

            if (driverIdOrExternalId != null) localVarPathParams.Add("driver_id_or_external_id", this.Configuration.ApiClient.ParameterToString(driverIdOrExternalId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDriverById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Driver>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Driver) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Driver)));
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Fetch driver by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of Driver</returns>
        public async System.Threading.Tasks.Task<Driver> GetDriverByIdAsync (string accessToken, string driverIdOrExternalId)
        {
             ApiResponse<Driver> localVarResponse = await GetDriverByIdAsyncWithHttpInfo(accessToken, driverIdOrExternalId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Fetch driver by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of ApiResponse (Driver)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Driver>> GetDriverByIdAsyncWithHttpInfo (string accessToken, string driverIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling DriversApi->GetDriverById");
            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling DriversApi->GetDriverById");

            var localVarPath = "/fleet/drivers/{driver_id_or_external_id}";
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

            if (driverIdOrExternalId != null) localVarPathParams.Add("driver_id_or_external_id", this.Configuration.ApiClient.ParameterToString(driverIdOrExternalId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetDriverById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Driver>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Driver) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Driver)));
        }

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Reactivate the inactive driver having id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <param name="reactivateDriverParam"></param>
        /// <returns>Driver</returns>
        public Driver ReactivateDriverById (string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam)
        {
             ApiResponse<Driver> localVarResponse = ReactivateDriverByIdWithHttpInfo(accessToken, driverIdOrExternalId, reactivateDriverParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Reactivate the inactive driver having id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <param name="reactivateDriverParam"></param>
        /// <returns>ApiResponse of Driver</returns>
        public ApiResponse< Driver > ReactivateDriverByIdWithHttpInfo (string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling DriversApi->ReactivateDriverById");
            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling DriversApi->ReactivateDriverById");
            // verify the required parameter 'reactivateDriverParam' is set
            if (reactivateDriverParam == null)
                throw new ApiException(400, "Missing required parameter 'reactivateDriverParam' when calling DriversApi->ReactivateDriverById");

            var localVarPath = "/fleet/drivers/inactive/{driver_id_or_external_id}";
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

            if (driverIdOrExternalId != null) localVarPathParams.Add("driver_id_or_external_id", this.Configuration.ApiClient.ParameterToString(driverIdOrExternalId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (reactivateDriverParam != null && reactivateDriverParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(reactivateDriverParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = reactivateDriverParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ReactivateDriverById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Driver>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Driver) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Driver)));
        }

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Reactivate the inactive driver having id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <param name="reactivateDriverParam"></param>
        /// <returns>Task of Driver</returns>
        public async System.Threading.Tasks.Task<Driver> ReactivateDriverByIdAsync (string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam)
        {
             ApiResponse<Driver> localVarResponse = await ReactivateDriverByIdAsyncWithHttpInfo(accessToken, driverIdOrExternalId, reactivateDriverParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Reactivate the inactive driver having id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <param name="reactivateDriverParam"></param>
        /// <returns>Task of ApiResponse (Driver)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Driver>> ReactivateDriverByIdAsyncWithHttpInfo (string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling DriversApi->ReactivateDriverById");
            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling DriversApi->ReactivateDriverById");
            // verify the required parameter 'reactivateDriverParam' is set
            if (reactivateDriverParam == null)
                throw new ApiException(400, "Missing required parameter 'reactivateDriverParam' when calling DriversApi->ReactivateDriverById");

            var localVarPath = "/fleet/drivers/inactive/{driver_id_or_external_id}";
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

            if (driverIdOrExternalId != null) localVarPathParams.Add("driver_id_or_external_id", this.Configuration.ApiClient.ParameterToString(driverIdOrExternalId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (reactivateDriverParam != null && reactivateDriverParam.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(reactivateDriverParam); // http body (model) parameter
            }
            else
            {
                localVarPostBody = reactivateDriverParam; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ReactivateDriverById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Driver>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Driver) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Driver)));
        }

    }
}
