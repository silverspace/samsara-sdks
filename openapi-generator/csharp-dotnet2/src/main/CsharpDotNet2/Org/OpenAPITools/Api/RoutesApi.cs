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
    public interface IRoutesApi
    {
        /// <summary>
        /// /fleet/dispatch/routes Create a new dispatch route.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        DispatchRoute CreateDispatchRoute (string accessToken, DispatchRouteCreate createDispatchRouteParams);
        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes Create a new dispatch route for the driver with driver_id.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        DispatchRoute CreateDriverDispatchRoute (string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams);
        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes Create a new dispatch route for the vehicle with vehicle_id.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        DispatchRoute CreateVehicleDispatchRoute (string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams);
        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Delete a dispatch route and its associated jobs.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns></returns>
        void DeleteDispatchRouteById (string accessToken, long? routeId);
        /// <summary>
        /// /fleet/dispatch/routes Fetch all of the dispatch routes for the group.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon).</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.</param>
        /// <returns>List&lt;DispatchRoute&gt;</returns>
        List<DispatchRoute> FetchAllDispatchRoutes (string accessToken, long? groupId, long? endTime, long? duration);
        /// <summary>
        /// /fleet/dispatch/routes/job_updates Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon).</param>
        /// <param name="sequenceId">Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.</param>
        /// <param name="include">Optionally set include&#x3D;route to include route object in response payload.</param>
        /// <returns>AllRouteJobUpdates</returns>
        AllRouteJobUpdates FetchAllRouteJobUpdates (string accessToken, long? groupId, string sequenceId, string include);
        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+} Fetch a dispatch route by id.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>DispatchRoute</returns>
        DispatchRoute GetDispatchRouteById (string accessToken, long? routeId);
        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/history Fetch the history of a dispatch route.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the route with history.</param>
        /// <param name="startTime">Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.</param>
        /// <param name="endTime">Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.</param>
        /// <returns>DispatchRouteHistory</returns>
        DispatchRouteHistory GetDispatchRouteHistory (string accessToken, long? routeId, long? startTime, long? endTime);
        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes Fetch all of the dispatch routes for a given driver.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.</param>
        /// <returns>List&lt;DispatchRoute&gt;</returns>
        List<DispatchRoute> GetDispatchRoutesByDriverId (string accessToken, long? driverId, long? endTime, long? duration);
        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes Fetch all of the dispatch routes for a given vehicle.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.</param>
        /// <returns>List&lt;DispatchRoute&gt;</returns>
        List<DispatchRoute> GetDispatchRoutesByVehicleId (string accessToken, long? vehicleId, long? endTime, long? duration);
        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Update a dispatch route and its associated jobs.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <param name="updateDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        DispatchRoute UpdateDispatchRouteById (string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class RoutesApi : IRoutesApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RoutesApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public RoutesApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="RoutesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public RoutesApi(String basePath)
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
        /// /fleet/dispatch/routes Create a new dispatch route.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="createDispatchRouteParams"></param> 
        /// <returns>DispatchRoute</returns>            
        public DispatchRoute CreateDispatchRoute (string accessToken, DispatchRouteCreate createDispatchRouteParams)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling CreateDispatchRoute");
            
            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null) throw new ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling CreateDispatchRoute");
            
    
            var path = "/fleet/dispatch/routes";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
                                    postBody = ApiClient.Serialize(createDispatchRouteParams); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateDispatchRoute: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateDispatchRoute: " + response.ErrorMessage, response.ErrorMessage);
    
            return (DispatchRoute) ApiClient.Deserialize(response.Content, typeof(DispatchRoute), response.Headers);
        }
    
        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes Create a new dispatch route for the driver with driver_id.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="driverId">ID of the driver with the associated routes.</param> 
        /// <param name="createDispatchRouteParams"></param> 
        /// <returns>DispatchRoute</returns>            
        public DispatchRoute CreateDriverDispatchRoute (string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling CreateDriverDispatchRoute");
            
            // verify the required parameter 'driverId' is set
            if (driverId == null) throw new ApiException(400, "Missing required parameter 'driverId' when calling CreateDriverDispatchRoute");
            
            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null) throw new ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling CreateDriverDispatchRoute");
            
    
            var path = "/fleet/drivers/{driver_id}/dispatch/routes";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "driver_id" + "}", ApiClient.ParameterToString(driverId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
                                    postBody = ApiClient.Serialize(createDispatchRouteParams); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateDriverDispatchRoute: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateDriverDispatchRoute: " + response.ErrorMessage, response.ErrorMessage);
    
            return (DispatchRoute) ApiClient.Deserialize(response.Content, typeof(DispatchRoute), response.Headers);
        }
    
        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes Create a new dispatch route for the vehicle with vehicle_id.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param> 
        /// <param name="createDispatchRouteParams"></param> 
        /// <returns>DispatchRoute</returns>            
        public DispatchRoute CreateVehicleDispatchRoute (string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling CreateVehicleDispatchRoute");
            
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null) throw new ApiException(400, "Missing required parameter 'vehicleId' when calling CreateVehicleDispatchRoute");
            
            // verify the required parameter 'createDispatchRouteParams' is set
            if (createDispatchRouteParams == null) throw new ApiException(400, "Missing required parameter 'createDispatchRouteParams' when calling CreateVehicleDispatchRoute");
            
    
            var path = "/fleet/vehicles/{vehicle_id}/dispatch/routes";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "vehicle_id" + "}", ApiClient.ParameterToString(vehicleId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
                                    postBody = ApiClient.Serialize(createDispatchRouteParams); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateVehicleDispatchRoute: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateVehicleDispatchRoute: " + response.ErrorMessage, response.ErrorMessage);
    
            return (DispatchRoute) ApiClient.Deserialize(response.Content, typeof(DispatchRoute), response.Headers);
        }
    
        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Delete a dispatch route and its associated jobs.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="routeId">ID of the dispatch route.</param> 
        /// <returns></returns>            
        public void DeleteDispatchRouteById (string accessToken, long? routeId)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling DeleteDispatchRouteById");
            
            // verify the required parameter 'routeId' is set
            if (routeId == null) throw new ApiException(400, "Missing required parameter 'routeId' when calling DeleteDispatchRouteById");
            
    
            var path = "/fleet/dispatch/routes/{route_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "route_id" + "}", ApiClient.ParameterToString(routeId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteDispatchRouteById: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteDispatchRouteById: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// /fleet/dispatch/routes Fetch all of the dispatch routes for the group.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon).</param> 
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.</param> 
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.</param> 
        /// <returns>List&lt;DispatchRoute&gt;</returns>            
        public List<DispatchRoute> FetchAllDispatchRoutes (string accessToken, long? groupId, long? endTime, long? duration)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling FetchAllDispatchRoutes");
            
    
            var path = "/fleet/dispatch/routes";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
 if (groupId != null) queryParams.Add("group_id", ApiClient.ParameterToString(groupId)); // query parameter
 if (endTime != null) queryParams.Add("end_time", ApiClient.ParameterToString(endTime)); // query parameter
 if (duration != null) queryParams.Add("duration", ApiClient.ParameterToString(duration)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling FetchAllDispatchRoutes: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling FetchAllDispatchRoutes: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<DispatchRoute>) ApiClient.Deserialize(response.Content, typeof(List<DispatchRoute>), response.Headers);
        }
    
        /// <summary>
        /// /fleet/dispatch/routes/job_updates Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon).</param> 
        /// <param name="sequenceId">Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.</param> 
        /// <param name="include">Optionally set include&#x3D;route to include route object in response payload.</param> 
        /// <returns>AllRouteJobUpdates</returns>            
        public AllRouteJobUpdates FetchAllRouteJobUpdates (string accessToken, long? groupId, string sequenceId, string include)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling FetchAllRouteJobUpdates");
            
    
            var path = "/fleet/dispatch/routes/job_updates";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
 if (groupId != null) queryParams.Add("group_id", ApiClient.ParameterToString(groupId)); // query parameter
 if (sequenceId != null) queryParams.Add("sequence_id", ApiClient.ParameterToString(sequenceId)); // query parameter
 if (include != null) queryParams.Add("include", ApiClient.ParameterToString(include)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling FetchAllRouteJobUpdates: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling FetchAllRouteJobUpdates: " + response.ErrorMessage, response.ErrorMessage);
    
            return (AllRouteJobUpdates) ApiClient.Deserialize(response.Content, typeof(AllRouteJobUpdates), response.Headers);
        }
    
        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+} Fetch a dispatch route by id.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="routeId">ID of the dispatch route.</param> 
        /// <returns>DispatchRoute</returns>            
        public DispatchRoute GetDispatchRouteById (string accessToken, long? routeId)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling GetDispatchRouteById");
            
            // verify the required parameter 'routeId' is set
            if (routeId == null) throw new ApiException(400, "Missing required parameter 'routeId' when calling GetDispatchRouteById");
            
    
            var path = "/fleet/dispatch/routes/{route_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "route_id" + "}", ApiClient.ParameterToString(routeId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetDispatchRouteById: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetDispatchRouteById: " + response.ErrorMessage, response.ErrorMessage);
    
            return (DispatchRoute) ApiClient.Deserialize(response.Content, typeof(DispatchRoute), response.Headers);
        }
    
        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/history Fetch the history of a dispatch route.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="routeId">ID of the route with history.</param> 
        /// <param name="startTime">Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.</param> 
        /// <param name="endTime">Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.</param> 
        /// <returns>DispatchRouteHistory</returns>            
        public DispatchRouteHistory GetDispatchRouteHistory (string accessToken, long? routeId, long? startTime, long? endTime)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling GetDispatchRouteHistory");
            
            // verify the required parameter 'routeId' is set
            if (routeId == null) throw new ApiException(400, "Missing required parameter 'routeId' when calling GetDispatchRouteHistory");
            
    
            var path = "/fleet/dispatch/routes/{route_id}/history";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "route_id" + "}", ApiClient.ParameterToString(routeId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
 if (startTime != null) queryParams.Add("start_time", ApiClient.ParameterToString(startTime)); // query parameter
 if (endTime != null) queryParams.Add("end_time", ApiClient.ParameterToString(endTime)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetDispatchRouteHistory: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetDispatchRouteHistory: " + response.ErrorMessage, response.ErrorMessage);
    
            return (DispatchRouteHistory) ApiClient.Deserialize(response.Content, typeof(DispatchRouteHistory), response.Headers);
        }
    
        /// <summary>
        /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes Fetch all of the dispatch routes for a given driver.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="driverId">ID of the driver with the associated routes.</param> 
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.</param> 
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.</param> 
        /// <returns>List&lt;DispatchRoute&gt;</returns>            
        public List<DispatchRoute> GetDispatchRoutesByDriverId (string accessToken, long? driverId, long? endTime, long? duration)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling GetDispatchRoutesByDriverId");
            
            // verify the required parameter 'driverId' is set
            if (driverId == null) throw new ApiException(400, "Missing required parameter 'driverId' when calling GetDispatchRoutesByDriverId");
            
    
            var path = "/fleet/drivers/{driver_id}/dispatch/routes";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "driver_id" + "}", ApiClient.ParameterToString(driverId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
 if (endTime != null) queryParams.Add("end_time", ApiClient.ParameterToString(endTime)); // query parameter
 if (duration != null) queryParams.Add("duration", ApiClient.ParameterToString(duration)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetDispatchRoutesByDriverId: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetDispatchRoutesByDriverId: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<DispatchRoute>) ApiClient.Deserialize(response.Content, typeof(List<DispatchRoute>), response.Headers);
        }
    
        /// <summary>
        /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes Fetch all of the dispatch routes for a given vehicle.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param> 
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.</param> 
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.</param> 
        /// <returns>List&lt;DispatchRoute&gt;</returns>            
        public List<DispatchRoute> GetDispatchRoutesByVehicleId (string accessToken, long? vehicleId, long? endTime, long? duration)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling GetDispatchRoutesByVehicleId");
            
            // verify the required parameter 'vehicleId' is set
            if (vehicleId == null) throw new ApiException(400, "Missing required parameter 'vehicleId' when calling GetDispatchRoutesByVehicleId");
            
    
            var path = "/fleet/vehicles/{vehicle_id}/dispatch/routes";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "vehicle_id" + "}", ApiClient.ParameterToString(vehicleId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
 if (endTime != null) queryParams.Add("end_time", ApiClient.ParameterToString(endTime)); // query parameter
 if (duration != null) queryParams.Add("duration", ApiClient.ParameterToString(duration)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetDispatchRoutesByVehicleId: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetDispatchRoutesByVehicleId: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<DispatchRoute>) ApiClient.Deserialize(response.Content, typeof(List<DispatchRoute>), response.Headers);
        }
    
        /// <summary>
        /// /fleet/dispatch/routes/{route_id:[0-9]+}/ Update a dispatch route and its associated jobs.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="routeId">ID of the dispatch route.</param> 
        /// <param name="updateDispatchRouteParams"></param> 
        /// <returns>DispatchRoute</returns>            
        public DispatchRoute UpdateDispatchRouteById (string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling UpdateDispatchRouteById");
            
            // verify the required parameter 'routeId' is set
            if (routeId == null) throw new ApiException(400, "Missing required parameter 'routeId' when calling UpdateDispatchRouteById");
            
            // verify the required parameter 'updateDispatchRouteParams' is set
            if (updateDispatchRouteParams == null) throw new ApiException(400, "Missing required parameter 'updateDispatchRouteParams' when calling UpdateDispatchRouteById");
            
    
            var path = "/fleet/dispatch/routes/{route_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "route_id" + "}", ApiClient.ParameterToString(routeId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
                                    postBody = ApiClient.Serialize(updateDispatchRouteParams); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateDispatchRouteById: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateDispatchRouteById: " + response.ErrorMessage, response.ErrorMessage);
    
            return (DispatchRoute) ApiClient.Deserialize(response.Content, typeof(DispatchRoute), response.Headers);
        }
    
    }
}
