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
    public interface IAssetsApi
    {
        /// <summary>
        /// /fleet/assets/locations Fetch current locations of all assets for the group.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon).</param>
        /// <returns>InlineResponse2001</returns>
        InlineResponse2001 GetAllAssetCurrentLocations (string accessToken, long? groupId);
        /// <summary>
        /// /fleet/assets Fetch all of the assets for the group.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon).</param>
        /// <returns>InlineResponse200</returns>
        InlineResponse200 GetAllAssets (string accessToken, long? groupId);
        /// <summary>
        /// /fleet/assets/{assetId:[0-9]+}/locations Fetch the historical locations for the asset.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="assetId">ID of the asset</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>List&lt;Object&gt;</returns>
        List<Object> GetAssetLocation (string accessToken, long? assetId, long? startMs, long? endMs);
        /// <summary>
        /// /fleet/assets/{assetId:[0-9]+}/reefer Fetch the reefer-specific stats of an asset.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="assetId">ID of the asset</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>AssetReeferResponse</returns>
        AssetReeferResponse GetAssetReefer (string accessToken, long? assetId, long? startMs, long? endMs);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class AssetsApi : IAssetsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AssetsApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public AssetsApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="AssetsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public AssetsApi(String basePath)
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
        /// /fleet/assets/locations Fetch current locations of all assets for the group.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon).</param> 
        /// <returns>InlineResponse2001</returns>            
        public InlineResponse2001 GetAllAssetCurrentLocations (string accessToken, long? groupId)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling GetAllAssetCurrentLocations");
            
    
            var path = "/fleet/assets/locations";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
 if (groupId != null) queryParams.Add("group_id", ApiClient.ParameterToString(groupId)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetAllAssetCurrentLocations: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetAllAssetCurrentLocations: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse2001) ApiClient.Deserialize(response.Content, typeof(InlineResponse2001), response.Headers);
        }
    
        /// <summary>
        /// /fleet/assets Fetch all of the assets for the group.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon).</param> 
        /// <returns>InlineResponse200</returns>            
        public InlineResponse200 GetAllAssets (string accessToken, long? groupId)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling GetAllAssets");
            
    
            var path = "/fleet/assets";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
 if (groupId != null) queryParams.Add("group_id", ApiClient.ParameterToString(groupId)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetAllAssets: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetAllAssets: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse200) ApiClient.Deserialize(response.Content, typeof(InlineResponse200), response.Headers);
        }
    
        /// <summary>
        /// /fleet/assets/{assetId:[0-9]+}/locations Fetch the historical locations for the asset.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="assetId">ID of the asset</param> 
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param> 
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param> 
        /// <returns>List&lt;Object&gt;</returns>            
        public List<Object> GetAssetLocation (string accessToken, long? assetId, long? startMs, long? endMs)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling GetAssetLocation");
            
            // verify the required parameter 'assetId' is set
            if (assetId == null) throw new ApiException(400, "Missing required parameter 'assetId' when calling GetAssetLocation");
            
            // verify the required parameter 'startMs' is set
            if (startMs == null) throw new ApiException(400, "Missing required parameter 'startMs' when calling GetAssetLocation");
            
            // verify the required parameter 'endMs' is set
            if (endMs == null) throw new ApiException(400, "Missing required parameter 'endMs' when calling GetAssetLocation");
            
    
            var path = "/fleet/assets/{asset_id}/locations";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "asset_id" + "}", ApiClient.ParameterToString(assetId));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetAssetLocation: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetAssetLocation: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<Object>) ApiClient.Deserialize(response.Content, typeof(List<Object>), response.Headers);
        }
    
        /// <summary>
        /// /fleet/assets/{assetId:[0-9]+}/reefer Fetch the reefer-specific stats of an asset.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="assetId">ID of the asset</param> 
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param> 
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param> 
        /// <returns>AssetReeferResponse</returns>            
        public AssetReeferResponse GetAssetReefer (string accessToken, long? assetId, long? startMs, long? endMs)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling GetAssetReefer");
            
            // verify the required parameter 'assetId' is set
            if (assetId == null) throw new ApiException(400, "Missing required parameter 'assetId' when calling GetAssetReefer");
            
            // verify the required parameter 'startMs' is set
            if (startMs == null) throw new ApiException(400, "Missing required parameter 'startMs' when calling GetAssetReefer");
            
            // verify the required parameter 'endMs' is set
            if (endMs == null) throw new ApiException(400, "Missing required parameter 'endMs' when calling GetAssetReefer");
            
    
            var path = "/fleet/assets/{asset_id}/reefer";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "asset_id" + "}", ApiClient.ParameterToString(assetId));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetAssetReefer: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetAssetReefer: " + response.ErrorMessage, response.ErrorMessage);
    
            return (AssetReeferResponse) ApiClient.Deserialize(response.Content, typeof(AssetReeferResponse), response.Headers);
        }
    
    }
}
