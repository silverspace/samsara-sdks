using System;
using System.Collections.Generic;
using RestSharp;
using IO.Swagger.Client;
using samsara.Model;

namespace samsara.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ISafetyApi
    {
        /// <summary>
        /// /fleet/drivers/{driverId:[0-9]+}/safety/score Fetch the safety score for the driver.
        /// </summary>
        /// <param name="driverId">ID of the driver</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>DriverSafetyScoreResponse</returns>
        DriverSafetyScoreResponse GetDriverSafetyScore (long? driverId, string accessToken, long? startMs, long? endMs);
        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event Fetch harsh event details for a vehicle.
        /// </summary>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="timestamp">Timestamp in milliseconds representing the timestamp of a harsh event.</param>
        /// <returns>VehicleHarshEventResponse</returns>
        VehicleHarshEventResponse GetVehicleHarshEvent (long? vehicleId, string accessToken, long? timestamp);
        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score Fetch the safety score for the vehicle.
        /// </summary>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>VehicleSafetyScoreResponse</returns>
        VehicleSafetyScoreResponse GetVehicleSafetyScore (long? vehicleId, string accessToken, long? startMs, long? endMs);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class SafetyApi : ISafetyApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SafetyApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public SafetyApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="SafetyApi"/> class.
        /// </summary>
        /// <returns></returns>
        public SafetyApi(String basePath)
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
        /// /fleet/drivers/{driverId:[0-9]+}/safety/score Fetch the safety score for the driver.
        /// </summary>
        /// <param name="driverId">ID of the driver</param> 
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param> 
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param> 
        /// <returns>DriverSafetyScoreResponse</returns>            
        public DriverSafetyScoreResponse GetDriverSafetyScore (long? driverId, string accessToken, long? startMs, long? endMs)
        {
            
            // verify the required parameter 'driverId' is set
            if (driverId == null) throw new ApiException(400, "Missing required parameter 'driverId' when calling GetDriverSafetyScore");
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling GetDriverSafetyScore");
            
            // verify the required parameter 'startMs' is set
            if (startMs == null) throw new ApiException(400, "Missing required parameter 'startMs' when calling GetDriverSafetyScore");
            
            // verify the required parameter 'endMs' is set
            if (endMs == null) throw new ApiException(400, "Missing required parameter 'endMs' when calling GetDriverSafetyScore");
            
    
            var path = "/fleet/drivers/{driverId}/safety/score";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "driverId" + "}", ApiClient.ParameterToString(driverId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
 if (startMs != null) queryParams.Add("startMs", ApiClient.ParameterToString(startMs)); // query parameter
 if (endMs != null) queryParams.Add("endMs", ApiClient.ParameterToString(endMs)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetDriverSafetyScore: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetDriverSafetyScore: " + response.ErrorMessage, response.ErrorMessage);
    
            return (DriverSafetyScoreResponse) ApiClient.Deserialize(response.Content, typeof(DriverSafetyScoreResponse), response.Headers);
        }
    
        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event Fetch harsh event details for a vehicle.
        /// </summary>
        /// <param name="vehicleId">ID of the vehicle</param> 
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="timestamp">Timestamp in milliseconds representing the timestamp of a harsh event.</param> 
        /// <returns>VehicleHarshEventResponse</returns>            
        public VehicleHarshEventResponse GetVehicleHarshEvent (long? vehicleId, string accessToken, long? timestamp)
        {
            
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null) throw new ApiException(400, "Missing required parameter 'vehicleId' when calling GetVehicleHarshEvent");
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling GetVehicleHarshEvent");
            
            // verify the required parameter 'timestamp' is set
            if (timestamp == null) throw new ApiException(400, "Missing required parameter 'timestamp' when calling GetVehicleHarshEvent");
            
    
            var path = "/fleet/vehicles/{vehicleId}/safety/harsh_event";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "vehicleId" + "}", ApiClient.ParameterToString(vehicleId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
 if (timestamp != null) queryParams.Add("timestamp", ApiClient.ParameterToString(timestamp)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetVehicleHarshEvent: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetVehicleHarshEvent: " + response.ErrorMessage, response.ErrorMessage);
    
            return (VehicleHarshEventResponse) ApiClient.Deserialize(response.Content, typeof(VehicleHarshEventResponse), response.Headers);
        }
    
        /// <summary>
        /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score Fetch the safety score for the vehicle.
        /// </summary>
        /// <param name="vehicleId">ID of the vehicle</param> 
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param> 
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param> 
        /// <returns>VehicleSafetyScoreResponse</returns>            
        public VehicleSafetyScoreResponse GetVehicleSafetyScore (long? vehicleId, string accessToken, long? startMs, long? endMs)
        {
            
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null) throw new ApiException(400, "Missing required parameter 'vehicleId' when calling GetVehicleSafetyScore");
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling GetVehicleSafetyScore");
            
            // verify the required parameter 'startMs' is set
            if (startMs == null) throw new ApiException(400, "Missing required parameter 'startMs' when calling GetVehicleSafetyScore");
            
            // verify the required parameter 'endMs' is set
            if (endMs == null) throw new ApiException(400, "Missing required parameter 'endMs' when calling GetVehicleSafetyScore");
            
    
            var path = "/fleet/vehicles/{vehicleId}/safety/score";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "vehicleId" + "}", ApiClient.ParameterToString(vehicleId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
 if (startMs != null) queryParams.Add("startMs", ApiClient.ParameterToString(startMs)); // query parameter
 if (endMs != null) queryParams.Add("endMs", ApiClient.ParameterToString(endMs)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetVehicleSafetyScore: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetVehicleSafetyScore: " + response.ErrorMessage, response.ErrorMessage);
    
            return (VehicleSafetyScoreResponse) ApiClient.Deserialize(response.Content, typeof(VehicleSafetyScoreResponse), response.Headers);
        }
    
    }
}
