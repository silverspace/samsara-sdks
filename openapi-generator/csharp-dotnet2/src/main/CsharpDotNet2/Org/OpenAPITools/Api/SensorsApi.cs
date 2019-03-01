using System;
using System.Collections.Generic;
using RestSharp;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ISensorsApi
    {
        /// <summary>
        /// /sensors/list Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>InlineResponse2008</returns>
        InlineResponse2008 GetSensors (string accessToken, InlineObject23 groupParam);
        /// <summary>
        /// /sensors/cargo Get cargo monitor status (empty / full) for requested sensors.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>CargoResponse</returns>
        CargoResponse GetSensorsCargo (string accessToken, InlineObject19 sensorParam);
        /// <summary>
        /// /sensors/door Get door monitor status (closed / open) for requested sensors.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>DoorResponse</returns>
        DoorResponse GetSensorsDoor (string accessToken, InlineObject20 sensorParam);
        /// <summary>
        /// /sensors/history Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam"></param>
        /// <returns>SensorHistoryResponse</returns>
        SensorHistoryResponse GetSensorsHistory (string accessToken, InlineObject21 historyParam);
        /// <summary>
        /// /sensors/humidity Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>HumidityResponse</returns>
        HumidityResponse GetSensorsHumidity (string accessToken, InlineObject22 sensorParam);
        /// <summary>
        /// /sensors/temperature Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>TemperatureResponse</returns>
        TemperatureResponse GetSensorsTemperature (string accessToken, InlineObject24 sensorParam);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class SensorsApi : ISensorsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SensorsApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public SensorsApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="SensorsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public SensorsApi(String basePath)
        {
            this.ApiClient = new ApiClient(basePath);
        }
    
        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public void SetBasePath(String basePath)
        {
            this.ApiClient.BasePath = basePath;
        }
    
        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public String GetBasePath(String basePath)
        {
            return this.ApiClient.BasePath;
        }
    
        /// <summary>
        /// Gets or sets the API client.
        /// </summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; set;}
    
        /// <summary>
        /// /sensors/list Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="groupParam"></param> 
        /// <returns>InlineResponse2008</returns>            
        public InlineResponse2008 GetSensors (string accessToken, InlineObject23 groupParam)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling GetSensors");
            
            // verify the required parameter 'groupParam' is set
            if (groupParam == null) throw new ApiException(400, "Missing required parameter 'groupParam' when calling GetSensors");
            
    
            var path = "/sensors/list";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
                                    postBody = ApiClient.Serialize(groupParam); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetSensors: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetSensors: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse2008) ApiClient.Deserialize(response.Content, typeof(InlineResponse2008), response.Headers);
        }
    
        /// <summary>
        /// /sensors/cargo Get cargo monitor status (empty / full) for requested sensors.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="sensorParam"></param> 
        /// <returns>CargoResponse</returns>            
        public CargoResponse GetSensorsCargo (string accessToken, InlineObject19 sensorParam)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling GetSensorsCargo");
            
            // verify the required parameter 'sensorParam' is set
            if (sensorParam == null) throw new ApiException(400, "Missing required parameter 'sensorParam' when calling GetSensorsCargo");
            
    
            var path = "/sensors/cargo";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
                                    postBody = ApiClient.Serialize(sensorParam); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetSensorsCargo: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetSensorsCargo: " + response.ErrorMessage, response.ErrorMessage);
    
            return (CargoResponse) ApiClient.Deserialize(response.Content, typeof(CargoResponse), response.Headers);
        }
    
        /// <summary>
        /// /sensors/door Get door monitor status (closed / open) for requested sensors.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="sensorParam"></param> 
        /// <returns>DoorResponse</returns>            
        public DoorResponse GetSensorsDoor (string accessToken, InlineObject20 sensorParam)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling GetSensorsDoor");
            
            // verify the required parameter 'sensorParam' is set
            if (sensorParam == null) throw new ApiException(400, "Missing required parameter 'sensorParam' when calling GetSensorsDoor");
            
    
            var path = "/sensors/door";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
                                    postBody = ApiClient.Serialize(sensorParam); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetSensorsDoor: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetSensorsDoor: " + response.ErrorMessage, response.ErrorMessage);
    
            return (DoorResponse) ApiClient.Deserialize(response.Content, typeof(DoorResponse), response.Headers);
        }
    
        /// <summary>
        /// /sensors/history Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="historyParam"></param> 
        /// <returns>SensorHistoryResponse</returns>            
        public SensorHistoryResponse GetSensorsHistory (string accessToken, InlineObject21 historyParam)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling GetSensorsHistory");
            
            // verify the required parameter 'historyParam' is set
            if (historyParam == null) throw new ApiException(400, "Missing required parameter 'historyParam' when calling GetSensorsHistory");
            
    
            var path = "/sensors/history";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
                                    postBody = ApiClient.Serialize(historyParam); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetSensorsHistory: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetSensorsHistory: " + response.ErrorMessage, response.ErrorMessage);
    
            return (SensorHistoryResponse) ApiClient.Deserialize(response.Content, typeof(SensorHistoryResponse), response.Headers);
        }
    
        /// <summary>
        /// /sensors/humidity Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="sensorParam"></param> 
        /// <returns>HumidityResponse</returns>            
        public HumidityResponse GetSensorsHumidity (string accessToken, InlineObject22 sensorParam)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling GetSensorsHumidity");
            
            // verify the required parameter 'sensorParam' is set
            if (sensorParam == null) throw new ApiException(400, "Missing required parameter 'sensorParam' when calling GetSensorsHumidity");
            
    
            var path = "/sensors/humidity";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
                                    postBody = ApiClient.Serialize(sensorParam); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetSensorsHumidity: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetSensorsHumidity: " + response.ErrorMessage, response.ErrorMessage);
    
            return (HumidityResponse) ApiClient.Deserialize(response.Content, typeof(HumidityResponse), response.Headers);
        }
    
        /// <summary>
        /// /sensors/temperature Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="sensorParam"></param> 
        /// <returns>TemperatureResponse</returns>            
        public TemperatureResponse GetSensorsTemperature (string accessToken, InlineObject24 sensorParam)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling GetSensorsTemperature");
            
            // verify the required parameter 'sensorParam' is set
            if (sensorParam == null) throw new ApiException(400, "Missing required parameter 'sensorParam' when calling GetSensorsTemperature");
            
    
            var path = "/sensors/temperature";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
                                    postBody = ApiClient.Serialize(sensorParam); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetSensorsTemperature: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetSensorsTemperature: " + response.ErrorMessage, response.ErrorMessage);
    
            return (TemperatureResponse) ApiClient.Deserialize(response.Content, typeof(TemperatureResponse), response.Headers);
        }
    
    }
}
