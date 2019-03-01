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
    public interface ITagsApi
    {
        /// <summary>
        /// /tags Create a new tag for the group.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagCreateParams"></param>
        /// <returns>Tag</returns>
        Tag CreateTag (string accessToken, TagCreate tagCreateParams);
        /// <summary>
        /// /tags/{tag_id:[0-9]+} Permanently deletes a tag.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns></returns>
        void DeleteTagById (string accessToken, long? tagId);
        /// <summary>
        /// /tags Fetch all of the tags for a group.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon).</param>
        /// <returns>InlineResponse2009</returns>
        InlineResponse2009 GetAllTags (string accessToken, long? groupId);
        /// <summary>
        /// /tags/{tag_id:[0-9]+} Fetch a tag by id.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns>Tag</returns>
        Tag GetTagById (string accessToken, long? tagId);
        /// <summary>
        /// /tags/{tag_id:[0-9]+} Add or delete specific members from a tag, or modify the name of a tag.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <param name="tagModifyParams"></param>
        /// <returns>Tag</returns>
        Tag ModifyTagById (string accessToken, long? tagId, TagModify tagModifyParams);
        /// <summary>
        /// /tags/{tag_id:[0-9]+} Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <param name="updateTagParams"></param>
        /// <returns>Tag</returns>
        Tag UpdateTagById (string accessToken, long? tagId, TagUpdate updateTagParams);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class TagsApi : ITagsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TagsApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public TagsApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="TagsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public TagsApi(String basePath)
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
        /// /tags Create a new tag for the group.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="tagCreateParams"></param> 
        /// <returns>Tag</returns>            
        public Tag CreateTag (string accessToken, TagCreate tagCreateParams)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling CreateTag");
            
            // verify the required parameter 'tagCreateParams' is set
            if (tagCreateParams == null) throw new ApiException(400, "Missing required parameter 'tagCreateParams' when calling CreateTag");
            
    
            var path = "/tags";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
                                    postBody = ApiClient.Serialize(tagCreateParams); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateTag: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CreateTag: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Tag) ApiClient.Deserialize(response.Content, typeof(Tag), response.Headers);
        }
    
        /// <summary>
        /// /tags/{tag_id:[0-9]+} Permanently deletes a tag.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="tagId">ID of the tag.</param> 
        /// <returns></returns>            
        public void DeleteTagById (string accessToken, long? tagId)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling DeleteTagById");
            
            // verify the required parameter 'tagId' is set
            if (tagId == null) throw new ApiException(400, "Missing required parameter 'tagId' when calling DeleteTagById");
            
    
            var path = "/tags/{tag_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "tag_id" + "}", ApiClient.ParameterToString(tagId));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteTagById: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteTagById: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// /tags Fetch all of the tags for a group.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon).</param> 
        /// <returns>InlineResponse2009</returns>            
        public InlineResponse2009 GetAllTags (string accessToken, long? groupId)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling GetAllTags");
            
    
            var path = "/tags";
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetAllTags: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetAllTags: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse2009) ApiClient.Deserialize(response.Content, typeof(InlineResponse2009), response.Headers);
        }
    
        /// <summary>
        /// /tags/{tag_id:[0-9]+} Fetch a tag by id.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="tagId">ID of the tag.</param> 
        /// <returns>Tag</returns>            
        public Tag GetTagById (string accessToken, long? tagId)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling GetTagById");
            
            // verify the required parameter 'tagId' is set
            if (tagId == null) throw new ApiException(400, "Missing required parameter 'tagId' when calling GetTagById");
            
    
            var path = "/tags/{tag_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "tag_id" + "}", ApiClient.ParameterToString(tagId));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetTagById: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetTagById: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Tag) ApiClient.Deserialize(response.Content, typeof(Tag), response.Headers);
        }
    
        /// <summary>
        /// /tags/{tag_id:[0-9]+} Add or delete specific members from a tag, or modify the name of a tag.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="tagId">ID of the tag.</param> 
        /// <param name="tagModifyParams"></param> 
        /// <returns>Tag</returns>            
        public Tag ModifyTagById (string accessToken, long? tagId, TagModify tagModifyParams)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling ModifyTagById");
            
            // verify the required parameter 'tagId' is set
            if (tagId == null) throw new ApiException(400, "Missing required parameter 'tagId' when calling ModifyTagById");
            
            // verify the required parameter 'tagModifyParams' is set
            if (tagModifyParams == null) throw new ApiException(400, "Missing required parameter 'tagModifyParams' when calling ModifyTagById");
            
    
            var path = "/tags/{tag_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "tag_id" + "}", ApiClient.ParameterToString(tagId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
                                    postBody = ApiClient.Serialize(tagModifyParams); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PATCH, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ModifyTagById: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ModifyTagById: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Tag) ApiClient.Deserialize(response.Content, typeof(Tag), response.Headers);
        }
    
        /// <summary>
        /// /tags/{tag_id:[0-9]+} Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
        /// </summary>
        /// <param name="accessToken">Samsara API access token.</param> 
        /// <param name="tagId">ID of the tag.</param> 
        /// <param name="updateTagParams"></param> 
        /// <returns>Tag</returns>            
        public Tag UpdateTagById (string accessToken, long? tagId, TagUpdate updateTagParams)
        {
            
            // verify the required parameter 'accessToken' is set
            if (accessToken == null) throw new ApiException(400, "Missing required parameter 'accessToken' when calling UpdateTagById");
            
            // verify the required parameter 'tagId' is set
            if (tagId == null) throw new ApiException(400, "Missing required parameter 'tagId' when calling UpdateTagById");
            
            // verify the required parameter 'updateTagParams' is set
            if (updateTagParams == null) throw new ApiException(400, "Missing required parameter 'updateTagParams' when calling UpdateTagById");
            
    
            var path = "/tags/{tag_id}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "tag_id" + "}", ApiClient.ParameterToString(tagId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (accessToken != null) queryParams.Add("access_token", ApiClient.ParameterToString(accessToken)); // query parameter
                                    postBody = ApiClient.Serialize(updateTagParams); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateTagById: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UpdateTagById: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Tag) ApiClient.Deserialize(response.Content, typeof(Tag), response.Headers);
        }
    
    }
}
