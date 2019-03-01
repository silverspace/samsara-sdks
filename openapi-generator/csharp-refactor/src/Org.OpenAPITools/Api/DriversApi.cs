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
    public interface IDriversApiSync : IApiAccessor
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
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDriversApiAsync : IApiAccessor
    {
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
    public interface IDriversApi : IDriversApiSync, IDriversApiAsync
    {

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
        public DriversApi() : this((string) null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DriversApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DriversApi(String basePath)
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
        /// Initializes a new instance of the <see cref="DriversApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public DriversApi(Org.OpenAPITools.Client.Configuration configuration)
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
        public DriversApi(Org.OpenAPITools.Client.ISynchronousClient client,Org.OpenAPITools.Client.IAsynchronousClient asyncClient, Org.OpenAPITools.Client.IReadableConfiguration configuration)
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
        /// /fleet/drivers/create Create a new driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDriverParam">Driver creation body</param>
        /// <returns>Driver</returns>
        public Driver CreateDriver (string accessToken, DriverForCreate createDriverParam)
        {
             Org.OpenAPITools.Client.ApiResponse<Driver> localVarResponse = CreateDriverWithHttpInfo(accessToken, createDriverParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/create Create a new driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDriverParam">Driver creation body</param>
        /// <returns>ApiResponse of Driver</returns>
        public Org.OpenAPITools.Client.ApiResponse< Driver > CreateDriverWithHttpInfo (string accessToken, DriverForCreate createDriverParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling DriversApi->CreateDriver");

            // verify the required parameter 'createDriverParam' is set
            if (createDriverParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'createDriverParam' when calling DriversApi->CreateDriver");

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
            requestOptions.Data = createDriverParam;


            // make the HTTP request

            var response = this.Client.Post< Driver >("/fleet/drivers/create", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("CreateDriver", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<Driver> localVarResponse = await CreateDriverAsyncWithHttpInfo(accessToken, createDriverParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/create Create a new driver.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDriverParam">Driver creation body</param>
        /// <returns>Task of ApiResponse (Driver)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Driver>> CreateDriverAsyncWithHttpInfo (string accessToken, DriverForCreate createDriverParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling DriversApi->CreateDriver");

            // verify the required parameter 'createDriverParam' is set
            if (createDriverParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'createDriverParam' when calling DriversApi->CreateDriver");


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
            requestOptions.Data = createDriverParam;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<Driver>("/fleet/drivers/create", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("CreateDriver", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public Org.OpenAPITools.Client.ApiResponse<Object> DeactivateDriverWithHttpInfo (string accessToken, string driverIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling DriversApi->DeactivateDriver");

            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling DriversApi->DeactivateDriver");

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

            if (driverIdOrExternalId != null)
                requestOptions.PathParameters.Add("driver_id_or_external_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverIdOrExternalId)); // path parameter
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


            // make the HTTP request

            var response = this.Client.Delete<Object>("/fleet/drivers/{driver_id_or_external_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("DeactivateDriver", response);
                if (exception != null) throw exception;
            }

            return response;
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Object>> DeactivateDriverAsyncWithHttpInfo (string accessToken, string driverIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling DriversApi->DeactivateDriver");

            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling DriversApi->DeactivateDriver");


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
            
            if (driverIdOrExternalId != null)
                requestOptions.PathParameters.Add("driver_id_or_external_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverIdOrExternalId)); // path parameter
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


            // make the HTTP request

            var response = await this.AsynchronousClient.DeleteAsync<Object>("/fleet/drivers/{driver_id_or_external_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("DeactivateDriver", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<List<Driver>> localVarResponse = GetAllDeactivatedDriversWithHttpInfo(accessToken, groupId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/inactive Fetch all deactivated drivers for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>ApiResponse of List&lt;Driver&gt;</returns>
        public Org.OpenAPITools.Client.ApiResponse< List<Driver> > GetAllDeactivatedDriversWithHttpInfo (string accessToken, long? groupId = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling DriversApi->GetAllDeactivatedDrivers");

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


            // make the HTTP request

            var response = this.Client.Get< List<Driver> >("/fleet/drivers/inactive", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetAllDeactivatedDrivers", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<List<Driver>> localVarResponse = await GetAllDeactivatedDriversAsyncWithHttpInfo(accessToken, groupId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/inactive Fetch all deactivated drivers for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;Driver&gt;)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<List<Driver>>> GetAllDeactivatedDriversAsyncWithHttpInfo (string accessToken, long? groupId = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling DriversApi->GetAllDeactivatedDrivers");


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


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<List<Driver>>("/fleet/drivers/inactive", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetAllDeactivatedDrivers", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<Driver> localVarResponse = GetDeactivatedDriverByIdWithHttpInfo(accessToken, driverIdOrExternalId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Fetch deactivated driver by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>ApiResponse of Driver</returns>
        public Org.OpenAPITools.Client.ApiResponse< Driver > GetDeactivatedDriverByIdWithHttpInfo (string accessToken, string driverIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling DriversApi->GetDeactivatedDriverById");

            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling DriversApi->GetDeactivatedDriverById");

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

            if (driverIdOrExternalId != null)
                requestOptions.PathParameters.Add("driver_id_or_external_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverIdOrExternalId)); // path parameter
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


            // make the HTTP request

            var response = this.Client.Get< Driver >("/fleet/drivers/inactive/{driver_id_or_external_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDeactivatedDriverById", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<Driver> localVarResponse = await GetDeactivatedDriverByIdAsyncWithHttpInfo(accessToken, driverIdOrExternalId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Fetch deactivated driver by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of ApiResponse (Driver)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Driver>> GetDeactivatedDriverByIdAsyncWithHttpInfo (string accessToken, string driverIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling DriversApi->GetDeactivatedDriverById");

            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling DriversApi->GetDeactivatedDriverById");


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
            
            if (driverIdOrExternalId != null)
                requestOptions.PathParameters.Add("driver_id_or_external_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverIdOrExternalId)); // path parameter
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


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<Driver>("/fleet/drivers/inactive/{driver_id_or_external_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDeactivatedDriverById", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<Driver> localVarResponse = GetDriverByIdWithHttpInfo(accessToken, driverIdOrExternalId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Fetch driver by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>ApiResponse of Driver</returns>
        public Org.OpenAPITools.Client.ApiResponse< Driver > GetDriverByIdWithHttpInfo (string accessToken, string driverIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling DriversApi->GetDriverById");

            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling DriversApi->GetDriverById");

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

            if (driverIdOrExternalId != null)
                requestOptions.PathParameters.Add("driver_id_or_external_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverIdOrExternalId)); // path parameter
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


            // make the HTTP request

            var response = this.Client.Get< Driver >("/fleet/drivers/{driver_id_or_external_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDriverById", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<Driver> localVarResponse = await GetDriverByIdAsyncWithHttpInfo(accessToken, driverIdOrExternalId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+} Fetch driver by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Task of ApiResponse (Driver)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Driver>> GetDriverByIdAsyncWithHttpInfo (string accessToken, string driverIdOrExternalId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling DriversApi->GetDriverById");

            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling DriversApi->GetDriverById");


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
            
            if (driverIdOrExternalId != null)
                requestOptions.PathParameters.Add("driver_id_or_external_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverIdOrExternalId)); // path parameter
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


            // make the HTTP request

            var response = await this.AsynchronousClient.GetAsync<Driver>("/fleet/drivers/{driver_id_or_external_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetDriverById", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<Driver> localVarResponse = ReactivateDriverByIdWithHttpInfo(accessToken, driverIdOrExternalId, reactivateDriverParam);
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
        public Org.OpenAPITools.Client.ApiResponse< Driver > ReactivateDriverByIdWithHttpInfo (string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling DriversApi->ReactivateDriverById");

            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling DriversApi->ReactivateDriverById");

            // verify the required parameter 'reactivateDriverParam' is set
            if (reactivateDriverParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'reactivateDriverParam' when calling DriversApi->ReactivateDriverById");

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

            if (driverIdOrExternalId != null)
                requestOptions.PathParameters.Add("driver_id_or_external_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverIdOrExternalId)); // path parameter
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
            requestOptions.Data = reactivateDriverParam;


            // make the HTTP request

            var response = this.Client.Put< Driver >("/fleet/drivers/inactive/{driver_id_or_external_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("ReactivateDriverById", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<Driver> localVarResponse = await ReactivateDriverByIdAsyncWithHttpInfo(accessToken, driverIdOrExternalId, reactivateDriverParam);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Driver>> ReactivateDriverByIdAsyncWithHttpInfo (string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling DriversApi->ReactivateDriverById");

            // verify the required parameter 'driverIdOrExternalId' is set
            if (driverIdOrExternalId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'driverIdOrExternalId' when calling DriversApi->ReactivateDriverById");

            // verify the required parameter 'reactivateDriverParam' is set
            if (reactivateDriverParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'reactivateDriverParam' when calling DriversApi->ReactivateDriverById");


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
            
            if (driverIdOrExternalId != null)
                requestOptions.PathParameters.Add("driver_id_or_external_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(driverIdOrExternalId)); // path parameter
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
            requestOptions.Data = reactivateDriverParam;


            // make the HTTP request

            var response = await this.AsynchronousClient.PutAsync<Driver>("/fleet/drivers/inactive/{driver_id_or_external_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("ReactivateDriverById", response);
                if (exception != null) throw exception;
            }

            return response;
        }

    }
}
