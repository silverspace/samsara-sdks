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
    public interface ISensorsApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// /sensors/list
        /// </summary>
        /// <remarks>
        /// Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>InlineResponse2008</returns>
        InlineResponse2008 GetSensors (string accessToken, InlineObject23 groupParam);

        /// <summary>
        /// /sensors/list
        /// </summary>
        /// <remarks>
        /// Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>ApiResponse of InlineResponse2008</returns>
        ApiResponse<InlineResponse2008> GetSensorsWithHttpInfo (string accessToken, InlineObject23 groupParam);
        /// <summary>
        /// /sensors/cargo
        /// </summary>
        /// <remarks>
        /// Get cargo monitor status (empty / full) for requested sensors.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>CargoResponse</returns>
        CargoResponse GetSensorsCargo (string accessToken, InlineObject19 sensorParam);

        /// <summary>
        /// /sensors/cargo
        /// </summary>
        /// <remarks>
        /// Get cargo monitor status (empty / full) for requested sensors.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>ApiResponse of CargoResponse</returns>
        ApiResponse<CargoResponse> GetSensorsCargoWithHttpInfo (string accessToken, InlineObject19 sensorParam);
        /// <summary>
        /// /sensors/door
        /// </summary>
        /// <remarks>
        /// Get door monitor status (closed / open) for requested sensors.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>DoorResponse</returns>
        DoorResponse GetSensorsDoor (string accessToken, InlineObject20 sensorParam);

        /// <summary>
        /// /sensors/door
        /// </summary>
        /// <remarks>
        /// Get door monitor status (closed / open) for requested sensors.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>ApiResponse of DoorResponse</returns>
        ApiResponse<DoorResponse> GetSensorsDoorWithHttpInfo (string accessToken, InlineObject20 sensorParam);
        /// <summary>
        /// /sensors/history
        /// </summary>
        /// <remarks>
        /// Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam"></param>
        /// <returns>SensorHistoryResponse</returns>
        SensorHistoryResponse GetSensorsHistory (string accessToken, InlineObject21 historyParam);

        /// <summary>
        /// /sensors/history
        /// </summary>
        /// <remarks>
        /// Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam"></param>
        /// <returns>ApiResponse of SensorHistoryResponse</returns>
        ApiResponse<SensorHistoryResponse> GetSensorsHistoryWithHttpInfo (string accessToken, InlineObject21 historyParam);
        /// <summary>
        /// /sensors/humidity
        /// </summary>
        /// <remarks>
        /// Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>HumidityResponse</returns>
        HumidityResponse GetSensorsHumidity (string accessToken, InlineObject22 sensorParam);

        /// <summary>
        /// /sensors/humidity
        /// </summary>
        /// <remarks>
        /// Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>ApiResponse of HumidityResponse</returns>
        ApiResponse<HumidityResponse> GetSensorsHumidityWithHttpInfo (string accessToken, InlineObject22 sensorParam);
        /// <summary>
        /// /sensors/temperature
        /// </summary>
        /// <remarks>
        /// Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>TemperatureResponse</returns>
        TemperatureResponse GetSensorsTemperature (string accessToken, InlineObject24 sensorParam);

        /// <summary>
        /// /sensors/temperature
        /// </summary>
        /// <remarks>
        /// Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>ApiResponse of TemperatureResponse</returns>
        ApiResponse<TemperatureResponse> GetSensorsTemperatureWithHttpInfo (string accessToken, InlineObject24 sensorParam);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ISensorsApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// /sensors/list
        /// </summary>
        /// <remarks>
        /// Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>Task of InlineResponse2008</returns>
        System.Threading.Tasks.Task<InlineResponse2008> GetSensorsAsync (string accessToken, InlineObject23 groupParam);

        /// <summary>
        /// /sensors/list
        /// </summary>
        /// <remarks>
        /// Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>Task of ApiResponse (InlineResponse2008)</returns>
        System.Threading.Tasks.Task<ApiResponse<InlineResponse2008>> GetSensorsAsyncWithHttpInfo (string accessToken, InlineObject23 groupParam);
        /// <summary>
        /// /sensors/cargo
        /// </summary>
        /// <remarks>
        /// Get cargo monitor status (empty / full) for requested sensors.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>Task of CargoResponse</returns>
        System.Threading.Tasks.Task<CargoResponse> GetSensorsCargoAsync (string accessToken, InlineObject19 sensorParam);

        /// <summary>
        /// /sensors/cargo
        /// </summary>
        /// <remarks>
        /// Get cargo monitor status (empty / full) for requested sensors.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>Task of ApiResponse (CargoResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<CargoResponse>> GetSensorsCargoAsyncWithHttpInfo (string accessToken, InlineObject19 sensorParam);
        /// <summary>
        /// /sensors/door
        /// </summary>
        /// <remarks>
        /// Get door monitor status (closed / open) for requested sensors.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>Task of DoorResponse</returns>
        System.Threading.Tasks.Task<DoorResponse> GetSensorsDoorAsync (string accessToken, InlineObject20 sensorParam);

        /// <summary>
        /// /sensors/door
        /// </summary>
        /// <remarks>
        /// Get door monitor status (closed / open) for requested sensors.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>Task of ApiResponse (DoorResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<DoorResponse>> GetSensorsDoorAsyncWithHttpInfo (string accessToken, InlineObject20 sensorParam);
        /// <summary>
        /// /sensors/history
        /// </summary>
        /// <remarks>
        /// Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam"></param>
        /// <returns>Task of SensorHistoryResponse</returns>
        System.Threading.Tasks.Task<SensorHistoryResponse> GetSensorsHistoryAsync (string accessToken, InlineObject21 historyParam);

        /// <summary>
        /// /sensors/history
        /// </summary>
        /// <remarks>
        /// Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam"></param>
        /// <returns>Task of ApiResponse (SensorHistoryResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<SensorHistoryResponse>> GetSensorsHistoryAsyncWithHttpInfo (string accessToken, InlineObject21 historyParam);
        /// <summary>
        /// /sensors/humidity
        /// </summary>
        /// <remarks>
        /// Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>Task of HumidityResponse</returns>
        System.Threading.Tasks.Task<HumidityResponse> GetSensorsHumidityAsync (string accessToken, InlineObject22 sensorParam);

        /// <summary>
        /// /sensors/humidity
        /// </summary>
        /// <remarks>
        /// Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>Task of ApiResponse (HumidityResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<HumidityResponse>> GetSensorsHumidityAsyncWithHttpInfo (string accessToken, InlineObject22 sensorParam);
        /// <summary>
        /// /sensors/temperature
        /// </summary>
        /// <remarks>
        /// Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>Task of TemperatureResponse</returns>
        System.Threading.Tasks.Task<TemperatureResponse> GetSensorsTemperatureAsync (string accessToken, InlineObject24 sensorParam);

        /// <summary>
        /// /sensors/temperature
        /// </summary>
        /// <remarks>
        /// Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>Task of ApiResponse (TemperatureResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<TemperatureResponse>> GetSensorsTemperatureAsyncWithHttpInfo (string accessToken, InlineObject24 sensorParam);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ISensorsApi : ISensorsApiSync, ISensorsApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class SensorsApi : ISensorsApi
    {
        private Org.OpenAPITools.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="SensorsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public SensorsApi() : this((string) null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="SensorsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public SensorsApi(String basePath)
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
        /// Initializes a new instance of the <see cref="SensorsApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public SensorsApi(Org.OpenAPITools.Client.Configuration configuration)
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
        public SensorsApi(Org.OpenAPITools.Client.ISynchronousClient client,Org.OpenAPITools.Client.IAsynchronousClient asyncClient, Org.OpenAPITools.Client.IReadableConfiguration configuration)
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
        /// /sensors/list Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>InlineResponse2008</returns>
        public InlineResponse2008 GetSensors (string accessToken, InlineObject23 groupParam)
        {
             Org.OpenAPITools.Client.ApiResponse<InlineResponse2008> localVarResponse = GetSensorsWithHttpInfo(accessToken, groupParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /sensors/list Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>ApiResponse of InlineResponse2008</returns>
        public Org.OpenAPITools.Client.ApiResponse< InlineResponse2008 > GetSensorsWithHttpInfo (string accessToken, InlineObject23 groupParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling SensorsApi->GetSensors");

            // verify the required parameter 'groupParam' is set
            if (groupParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'groupParam' when calling SensorsApi->GetSensors");

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

            var response = this.Client.Post< InlineResponse2008 >("/sensors/list", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetSensors", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /sensors/list Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>Task of InlineResponse2008</returns>
        public async System.Threading.Tasks.Task<InlineResponse2008> GetSensorsAsync (string accessToken, InlineObject23 groupParam)
        {
             Org.OpenAPITools.Client.ApiResponse<InlineResponse2008> localVarResponse = await GetSensorsAsyncWithHttpInfo(accessToken, groupParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /sensors/list Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>Task of ApiResponse (InlineResponse2008)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<InlineResponse2008>> GetSensorsAsyncWithHttpInfo (string accessToken, InlineObject23 groupParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling SensorsApi->GetSensors");

            // verify the required parameter 'groupParam' is set
            if (groupParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'groupParam' when calling SensorsApi->GetSensors");


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

            var response = await this.AsynchronousClient.PostAsync<InlineResponse2008>("/sensors/list", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetSensors", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /sensors/cargo Get cargo monitor status (empty / full) for requested sensors.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>CargoResponse</returns>
        public CargoResponse GetSensorsCargo (string accessToken, InlineObject19 sensorParam)
        {
             Org.OpenAPITools.Client.ApiResponse<CargoResponse> localVarResponse = GetSensorsCargoWithHttpInfo(accessToken, sensorParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /sensors/cargo Get cargo monitor status (empty / full) for requested sensors.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>ApiResponse of CargoResponse</returns>
        public Org.OpenAPITools.Client.ApiResponse< CargoResponse > GetSensorsCargoWithHttpInfo (string accessToken, InlineObject19 sensorParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling SensorsApi->GetSensorsCargo");

            // verify the required parameter 'sensorParam' is set
            if (sensorParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'sensorParam' when calling SensorsApi->GetSensorsCargo");

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
            requestOptions.Data = sensorParam;


            // make the HTTP request

            var response = this.Client.Post< CargoResponse >("/sensors/cargo", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetSensorsCargo", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /sensors/cargo Get cargo monitor status (empty / full) for requested sensors.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>Task of CargoResponse</returns>
        public async System.Threading.Tasks.Task<CargoResponse> GetSensorsCargoAsync (string accessToken, InlineObject19 sensorParam)
        {
             Org.OpenAPITools.Client.ApiResponse<CargoResponse> localVarResponse = await GetSensorsCargoAsyncWithHttpInfo(accessToken, sensorParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /sensors/cargo Get cargo monitor status (empty / full) for requested sensors.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>Task of ApiResponse (CargoResponse)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<CargoResponse>> GetSensorsCargoAsyncWithHttpInfo (string accessToken, InlineObject19 sensorParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling SensorsApi->GetSensorsCargo");

            // verify the required parameter 'sensorParam' is set
            if (sensorParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'sensorParam' when calling SensorsApi->GetSensorsCargo");


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
            requestOptions.Data = sensorParam;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<CargoResponse>("/sensors/cargo", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetSensorsCargo", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /sensors/door Get door monitor status (closed / open) for requested sensors.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>DoorResponse</returns>
        public DoorResponse GetSensorsDoor (string accessToken, InlineObject20 sensorParam)
        {
             Org.OpenAPITools.Client.ApiResponse<DoorResponse> localVarResponse = GetSensorsDoorWithHttpInfo(accessToken, sensorParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /sensors/door Get door monitor status (closed / open) for requested sensors.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>ApiResponse of DoorResponse</returns>
        public Org.OpenAPITools.Client.ApiResponse< DoorResponse > GetSensorsDoorWithHttpInfo (string accessToken, InlineObject20 sensorParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling SensorsApi->GetSensorsDoor");

            // verify the required parameter 'sensorParam' is set
            if (sensorParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'sensorParam' when calling SensorsApi->GetSensorsDoor");

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
            requestOptions.Data = sensorParam;


            // make the HTTP request

            var response = this.Client.Post< DoorResponse >("/sensors/door", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetSensorsDoor", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /sensors/door Get door monitor status (closed / open) for requested sensors.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>Task of DoorResponse</returns>
        public async System.Threading.Tasks.Task<DoorResponse> GetSensorsDoorAsync (string accessToken, InlineObject20 sensorParam)
        {
             Org.OpenAPITools.Client.ApiResponse<DoorResponse> localVarResponse = await GetSensorsDoorAsyncWithHttpInfo(accessToken, sensorParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /sensors/door Get door monitor status (closed / open) for requested sensors.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>Task of ApiResponse (DoorResponse)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<DoorResponse>> GetSensorsDoorAsyncWithHttpInfo (string accessToken, InlineObject20 sensorParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling SensorsApi->GetSensorsDoor");

            // verify the required parameter 'sensorParam' is set
            if (sensorParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'sensorParam' when calling SensorsApi->GetSensorsDoor");


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
            requestOptions.Data = sensorParam;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<DoorResponse>("/sensors/door", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetSensorsDoor", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /sensors/history Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam"></param>
        /// <returns>SensorHistoryResponse</returns>
        public SensorHistoryResponse GetSensorsHistory (string accessToken, InlineObject21 historyParam)
        {
             Org.OpenAPITools.Client.ApiResponse<SensorHistoryResponse> localVarResponse = GetSensorsHistoryWithHttpInfo(accessToken, historyParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /sensors/history Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam"></param>
        /// <returns>ApiResponse of SensorHistoryResponse</returns>
        public Org.OpenAPITools.Client.ApiResponse< SensorHistoryResponse > GetSensorsHistoryWithHttpInfo (string accessToken, InlineObject21 historyParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling SensorsApi->GetSensorsHistory");

            // verify the required parameter 'historyParam' is set
            if (historyParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'historyParam' when calling SensorsApi->GetSensorsHistory");

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

            var response = this.Client.Post< SensorHistoryResponse >("/sensors/history", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetSensorsHistory", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /sensors/history Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam"></param>
        /// <returns>Task of SensorHistoryResponse</returns>
        public async System.Threading.Tasks.Task<SensorHistoryResponse> GetSensorsHistoryAsync (string accessToken, InlineObject21 historyParam)
        {
             Org.OpenAPITools.Client.ApiResponse<SensorHistoryResponse> localVarResponse = await GetSensorsHistoryAsyncWithHttpInfo(accessToken, historyParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /sensors/history Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam"></param>
        /// <returns>Task of ApiResponse (SensorHistoryResponse)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<SensorHistoryResponse>> GetSensorsHistoryAsyncWithHttpInfo (string accessToken, InlineObject21 historyParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling SensorsApi->GetSensorsHistory");

            // verify the required parameter 'historyParam' is set
            if (historyParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'historyParam' when calling SensorsApi->GetSensorsHistory");


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

            var response = await this.AsynchronousClient.PostAsync<SensorHistoryResponse>("/sensors/history", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetSensorsHistory", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /sensors/humidity Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>HumidityResponse</returns>
        public HumidityResponse GetSensorsHumidity (string accessToken, InlineObject22 sensorParam)
        {
             Org.OpenAPITools.Client.ApiResponse<HumidityResponse> localVarResponse = GetSensorsHumidityWithHttpInfo(accessToken, sensorParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /sensors/humidity Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>ApiResponse of HumidityResponse</returns>
        public Org.OpenAPITools.Client.ApiResponse< HumidityResponse > GetSensorsHumidityWithHttpInfo (string accessToken, InlineObject22 sensorParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling SensorsApi->GetSensorsHumidity");

            // verify the required parameter 'sensorParam' is set
            if (sensorParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'sensorParam' when calling SensorsApi->GetSensorsHumidity");

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
            requestOptions.Data = sensorParam;


            // make the HTTP request

            var response = this.Client.Post< HumidityResponse >("/sensors/humidity", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetSensorsHumidity", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /sensors/humidity Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>Task of HumidityResponse</returns>
        public async System.Threading.Tasks.Task<HumidityResponse> GetSensorsHumidityAsync (string accessToken, InlineObject22 sensorParam)
        {
             Org.OpenAPITools.Client.ApiResponse<HumidityResponse> localVarResponse = await GetSensorsHumidityAsyncWithHttpInfo(accessToken, sensorParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /sensors/humidity Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>Task of ApiResponse (HumidityResponse)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<HumidityResponse>> GetSensorsHumidityAsyncWithHttpInfo (string accessToken, InlineObject22 sensorParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling SensorsApi->GetSensorsHumidity");

            // verify the required parameter 'sensorParam' is set
            if (sensorParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'sensorParam' when calling SensorsApi->GetSensorsHumidity");


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
            requestOptions.Data = sensorParam;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<HumidityResponse>("/sensors/humidity", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetSensorsHumidity", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /sensors/temperature Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>TemperatureResponse</returns>
        public TemperatureResponse GetSensorsTemperature (string accessToken, InlineObject24 sensorParam)
        {
             Org.OpenAPITools.Client.ApiResponse<TemperatureResponse> localVarResponse = GetSensorsTemperatureWithHttpInfo(accessToken, sensorParam);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /sensors/temperature Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>ApiResponse of TemperatureResponse</returns>
        public Org.OpenAPITools.Client.ApiResponse< TemperatureResponse > GetSensorsTemperatureWithHttpInfo (string accessToken, InlineObject24 sensorParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling SensorsApi->GetSensorsTemperature");

            // verify the required parameter 'sensorParam' is set
            if (sensorParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'sensorParam' when calling SensorsApi->GetSensorsTemperature");

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
            requestOptions.Data = sensorParam;


            // make the HTTP request

            var response = this.Client.Post< TemperatureResponse >("/sensors/temperature", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetSensorsTemperature", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /sensors/temperature Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>Task of TemperatureResponse</returns>
        public async System.Threading.Tasks.Task<TemperatureResponse> GetSensorsTemperatureAsync (string accessToken, InlineObject24 sensorParam)
        {
             Org.OpenAPITools.Client.ApiResponse<TemperatureResponse> localVarResponse = await GetSensorsTemperatureAsyncWithHttpInfo(accessToken, sensorParam);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /sensors/temperature Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>Task of ApiResponse (TemperatureResponse)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<TemperatureResponse>> GetSensorsTemperatureAsyncWithHttpInfo (string accessToken, InlineObject24 sensorParam)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling SensorsApi->GetSensorsTemperature");

            // verify the required parameter 'sensorParam' is set
            if (sensorParam == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'sensorParam' when calling SensorsApi->GetSensorsTemperature");


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
            requestOptions.Data = sensorParam;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<TemperatureResponse>("/sensors/temperature", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetSensorsTemperature", response);
                if (exception != null) throw exception;
            }

            return response;
        }

    }
}
