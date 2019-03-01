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
    public interface IUsersApi
    {
        /// <summary>
        /// /users/{userId:[0-9]+} Remove a user from the organization.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="userId">ID of the user.</param>
        /// <returns></returns>
        void DeleteUserById (string accessToken, long? userId);
        /// <summary>
        /// /users/{userId:[0-9]+} Get a user.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="userId">ID of the user.</param>
        /// <returns>User</returns>
        User GetUserById (string accessToken, long? userId);
        /// <summary>
        /// /user_roles Get all roles in the organization.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>List&lt;UserRole&gt;</returns>
        List<UserRole> ListUserRoles (string accessToken);
        /// <summary>
        /// /users List all users in the organization.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>List&lt;User&gt;</returns>
        List<User> ListUsers (string accessToken);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class UsersApi : IUsersApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UsersApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public UsersApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="UsersApi"/> class.
        /// </summary>
        /// <returns></returns>
        public UsersApi(String basePath)
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
        /// /users/{userId:[0-9]+} Remove a user from the organization.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="userId">ID of the user.</param> 
        /// <returns></returns>            
        public void DeleteUserById (string accessToken, long? userId)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling DeleteUserById");
            
            // verify the required parameter 'userId' is set
            if (userId == null) throw new ApiException(400, "Missing required parameter 'userId' when calling DeleteUserById");
            
    
            var path = "/users/{userId}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "userId" + "}", ApiClient.ParameterToString(userId));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteUserById: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteUserById: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// /users/{userId:[0-9]+} Get a user.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="userId">ID of the user.</param> 
        /// <returns>User</returns>            
        public User GetUserById (string accessToken, long? userId)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling GetUserById");
            
            // verify the required parameter 'userId' is set
            if (userId == null) throw new ApiException(400, "Missing required parameter 'userId' when calling GetUserById");
            
    
            var path = "/users/{userId}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "userId" + "}", ApiClient.ParameterToString(userId));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetUserById: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetUserById: " + response.ErrorMessage, response.ErrorMessage);
    
            return (User) ApiClient.Deserialize(response.Content, typeof(User), response.Headers);
        }
    
        /// <summary>
        /// /user_roles Get all roles in the organization.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <returns>List&lt;UserRole&gt;</returns>            
        public List<UserRole> ListUserRoles (string accessToken)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling ListUserRoles");
            
    
            var path = "/user_roles";
            path = path.Replace("{format}", "json");
                
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
                throw new ApiException ((int)response.StatusCode, "Error calling ListUserRoles: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ListUserRoles: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<UserRole>) ApiClient.Deserialize(response.Content, typeof(List<UserRole>), response.Headers);
        }
    
        /// <summary>
        /// /users List all users in the organization.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <returns>List&lt;User&gt;</returns>            
        public List<User> ListUsers (string accessToken)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling ListUsers");
            
    
            var path = "/users";
            path = path.Replace("{format}", "json");
                
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
                throw new ApiException ((int)response.StatusCode, "Error calling ListUsers: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ListUsers: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<User>) ApiClient.Deserialize(response.Content, typeof(List<User>), response.Headers);
        }
    
    }
}
