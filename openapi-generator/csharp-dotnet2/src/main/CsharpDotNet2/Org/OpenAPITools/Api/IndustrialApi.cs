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
    public interface IIndustrialApi
    {
        /// <summary>
        /// /industrial/data Fetch all of the data inputs for a group.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon).</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.</param>
        /// <returns>InlineResponse2006</returns>
        InlineResponse2006 GetAllDataInputs (string accessToken, long? groupId, long? startMs, long? endMs);
        /// <summary>
        /// /industrial/data/{data_input_id:[0-9]+} Fetch datapoints from a given data input.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="dataInputId">ID of the data input</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.</param>
        /// <returns>DataInputHistoryResponse</returns>
        DataInputHistoryResponse GetDataInput (string accessToken, long? dataInputId, long? startMs, long? endMs);
        /// <summary>
        /// /machines/list Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>InlineResponse2007</returns>
        InlineResponse2007 GetMachines (string accessToken, InlineObject18 groupParam);
        /// <summary>
        /// /machines/history Get historical data for machine objects. This method returns a set of historical data for all machines in a group
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam"></param>
        /// <returns>MachineHistoryResponse</returns>
        MachineHistoryResponse GetMachinesHistory (string accessToken, InlineObject17 historyParam);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class IndustrialApi : IIndustrialApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="IndustrialApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public IndustrialApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="IndustrialApi"/> class.
        /// </summary>
        /// <returns></returns>
        public IndustrialApi(String basePath)
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
        /// /industrial/data Fetch all of the data inputs for a group.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon).</param> 
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.</param> 
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.</param> 
        /// <returns>InlineResponse2006</returns>            
        public InlineResponse2006 GetAllDataInputs (string accessToken, long? groupId, long? startMs, long? endMs)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling GetAllDataInputs");
            
    
            var path = "/industrial/data";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
 if (groupId != null) queryParams.Add("group_id", ApiClient.ParameterToString(groupId)); // query parameter
 if (startMs != null) queryParams.Add("startMs", ApiClient.ParameterToString(startMs)); // query parameter
 if (endMs != null) queryParams.Add("endMs", ApiClient.ParameterToString(endMs)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetAllDataInputs: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetAllDataInputs: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse2006) ApiClient.Deserialize(response.Content, typeof(InlineResponse2006), response.Headers);
        }
    
        /// <summary>
        /// /industrial/data/{data_input_id:[0-9]+} Fetch datapoints from a given data input.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="dataInputId">ID of the data input</param> 
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.</param> 
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.</param> 
        /// <returns>DataInputHistoryResponse</returns>            
        public DataInputHistoryResponse GetDataInput (string accessToken, long? dataInputId, long? startMs, long? endMs)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling GetDataInput");
            
            // verify the required parameter 'dataInputId' is set
            if (dataInputId == null) throw new ApiException(400, "Missing required parameter 'dataInputId' when calling GetDataInput");
            
    
            var path = "/industrial/data/{data_input_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "data_input_id" + "}", ApiClient.ParameterToString(dataInputId));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetDataInput: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetDataInput: " + response.ErrorMessage, response.ErrorMessage);
    
            return (DataInputHistoryResponse) ApiClient.Deserialize(response.Content, typeof(DataInputHistoryResponse), response.Headers);
        }
    
        /// <summary>
        /// /machines/list Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="groupParam"></param> 
        /// <returns>InlineResponse2007</returns>            
        public InlineResponse2007 GetMachines (string accessToken, InlineObject18 groupParam)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling GetMachines");
            
            // verify the required parameter 'groupParam' is set
            if (groupParam == null) throw new ApiException(400, "Missing required parameter 'groupParam' when calling GetMachines");
            
    
            var path = "/machines/list";
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetMachines: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetMachines: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse2007) ApiClient.Deserialize(response.Content, typeof(InlineResponse2007), response.Headers);
        }
    
        /// <summary>
        /// /machines/history Get historical data for machine objects. This method returns a set of historical data for all machines in a group
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="historyParam"></param> 
        /// <returns>MachineHistoryResponse</returns>            
        public MachineHistoryResponse GetMachinesHistory (string accessToken, InlineObject17 historyParam)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling GetMachinesHistory");
            
            // verify the required parameter 'historyParam' is set
            if (historyParam == null) throw new ApiException(400, "Missing required parameter 'historyParam' when calling GetMachinesHistory");
            
    
            var path = "/machines/history";
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetMachinesHistory: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetMachinesHistory: " + response.ErrorMessage, response.ErrorMessage);
    
            return (MachineHistoryResponse) ApiClient.Deserialize(response.Content, typeof(MachineHistoryResponse), response.Headers);
        }
    
    }
}
