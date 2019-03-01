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
    public interface ITagsApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// /tags
        /// </summary>
        /// <remarks>
        /// Create a new tag for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagCreateParams"></param>
        /// <returns>Tag</returns>
        Tag CreateTag (string accessToken, TagCreate tagCreateParams);

        /// <summary>
        /// /tags
        /// </summary>
        /// <remarks>
        /// Create a new tag for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagCreateParams"></param>
        /// <returns>ApiResponse of Tag</returns>
        ApiResponse<Tag> CreateTagWithHttpInfo (string accessToken, TagCreate tagCreateParams);
        /// <summary>
        /// /tags/{tag_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Permanently deletes a tag.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns></returns>
        void DeleteTagById (string accessToken, long? tagId);

        /// <summary>
        /// /tags/{tag_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Permanently deletes a tag.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> DeleteTagByIdWithHttpInfo (string accessToken, long? tagId);
        /// <summary>
        /// /tags
        /// </summary>
        /// <remarks>
        /// Fetch all of the tags for a group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>InlineResponse2009</returns>
        InlineResponse2009 GetAllTags (string accessToken, long? groupId = null);

        /// <summary>
        /// /tags
        /// </summary>
        /// <remarks>
        /// Fetch all of the tags for a group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>ApiResponse of InlineResponse2009</returns>
        ApiResponse<InlineResponse2009> GetAllTagsWithHttpInfo (string accessToken, long? groupId = null);
        /// <summary>
        /// /tags/{tag_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch a tag by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns>Tag</returns>
        Tag GetTagById (string accessToken, long? tagId);

        /// <summary>
        /// /tags/{tag_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch a tag by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns>ApiResponse of Tag</returns>
        ApiResponse<Tag> GetTagByIdWithHttpInfo (string accessToken, long? tagId);
        /// <summary>
        /// /tags/{tag_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Add or delete specific members from a tag, or modify the name of a tag.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <param name="tagModifyParams"></param>
        /// <returns>Tag</returns>
        Tag ModifyTagById (string accessToken, long? tagId, TagModify tagModifyParams);

        /// <summary>
        /// /tags/{tag_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Add or delete specific members from a tag, or modify the name of a tag.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <param name="tagModifyParams"></param>
        /// <returns>ApiResponse of Tag</returns>
        ApiResponse<Tag> ModifyTagByIdWithHttpInfo (string accessToken, long? tagId, TagModify tagModifyParams);
        /// <summary>
        /// /tags/{tag_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <param name="updateTagParams"></param>
        /// <returns>Tag</returns>
        Tag UpdateTagById (string accessToken, long? tagId, TagUpdate updateTagParams);

        /// <summary>
        /// /tags/{tag_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <param name="updateTagParams"></param>
        /// <returns>ApiResponse of Tag</returns>
        ApiResponse<Tag> UpdateTagByIdWithHttpInfo (string accessToken, long? tagId, TagUpdate updateTagParams);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// /tags
        /// </summary>
        /// <remarks>
        /// Create a new tag for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagCreateParams"></param>
        /// <returns>Task of Tag</returns>
        System.Threading.Tasks.Task<Tag> CreateTagAsync (string accessToken, TagCreate tagCreateParams);

        /// <summary>
        /// /tags
        /// </summary>
        /// <remarks>
        /// Create a new tag for the group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagCreateParams"></param>
        /// <returns>Task of ApiResponse (Tag)</returns>
        System.Threading.Tasks.Task<ApiResponse<Tag>> CreateTagAsyncWithHttpInfo (string accessToken, TagCreate tagCreateParams);
        /// <summary>
        /// /tags/{tag_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Permanently deletes a tag.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task DeleteTagByIdAsync (string accessToken, long? tagId);

        /// <summary>
        /// /tags/{tag_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Permanently deletes a tag.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> DeleteTagByIdAsyncWithHttpInfo (string accessToken, long? tagId);
        /// <summary>
        /// /tags
        /// </summary>
        /// <remarks>
        /// Fetch all of the tags for a group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of InlineResponse2009</returns>
        System.Threading.Tasks.Task<InlineResponse2009> GetAllTagsAsync (string accessToken, long? groupId = null);

        /// <summary>
        /// /tags
        /// </summary>
        /// <remarks>
        /// Fetch all of the tags for a group.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of ApiResponse (InlineResponse2009)</returns>
        System.Threading.Tasks.Task<ApiResponse<InlineResponse2009>> GetAllTagsAsyncWithHttpInfo (string accessToken, long? groupId = null);
        /// <summary>
        /// /tags/{tag_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch a tag by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns>Task of Tag</returns>
        System.Threading.Tasks.Task<Tag> GetTagByIdAsync (string accessToken, long? tagId);

        /// <summary>
        /// /tags/{tag_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Fetch a tag by id.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns>Task of ApiResponse (Tag)</returns>
        System.Threading.Tasks.Task<ApiResponse<Tag>> GetTagByIdAsyncWithHttpInfo (string accessToken, long? tagId);
        /// <summary>
        /// /tags/{tag_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Add or delete specific members from a tag, or modify the name of a tag.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <param name="tagModifyParams"></param>
        /// <returns>Task of Tag</returns>
        System.Threading.Tasks.Task<Tag> ModifyTagByIdAsync (string accessToken, long? tagId, TagModify tagModifyParams);

        /// <summary>
        /// /tags/{tag_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Add or delete specific members from a tag, or modify the name of a tag.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <param name="tagModifyParams"></param>
        /// <returns>Task of ApiResponse (Tag)</returns>
        System.Threading.Tasks.Task<ApiResponse<Tag>> ModifyTagByIdAsyncWithHttpInfo (string accessToken, long? tagId, TagModify tagModifyParams);
        /// <summary>
        /// /tags/{tag_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <param name="updateTagParams"></param>
        /// <returns>Task of Tag</returns>
        System.Threading.Tasks.Task<Tag> UpdateTagByIdAsync (string accessToken, long? tagId, TagUpdate updateTagParams);

        /// <summary>
        /// /tags/{tag_id:[0-9]+}
        /// </summary>
        /// <remarks>
        /// Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <param name="updateTagParams"></param>
        /// <returns>Task of ApiResponse (Tag)</returns>
        System.Threading.Tasks.Task<ApiResponse<Tag>> UpdateTagByIdAsyncWithHttpInfo (string accessToken, long? tagId, TagUpdate updateTagParams);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class TagsApi : ITagsApi
    {
        private Org.OpenAPITools.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="TagsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public TagsApi(String basePath)
        {
            this.Configuration = new Org.OpenAPITools.Client.Configuration { BasePath = basePath };

            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TagsApi"/> class
        /// </summary>
        /// <returns></returns>
        public TagsApi()
        {
            this.Configuration = Org.OpenAPITools.Client.Configuration.Default;

            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TagsApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public TagsApi(Org.OpenAPITools.Client.Configuration configuration = null)
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
        /// /tags Create a new tag for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagCreateParams"></param>
        /// <returns>Tag</returns>
        public Tag CreateTag (string accessToken, TagCreate tagCreateParams)
        {
             ApiResponse<Tag> localVarResponse = CreateTagWithHttpInfo(accessToken, tagCreateParams);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /tags Create a new tag for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagCreateParams"></param>
        /// <returns>ApiResponse of Tag</returns>
        public ApiResponse< Tag > CreateTagWithHttpInfo (string accessToken, TagCreate tagCreateParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling TagsApi->CreateTag");
            // verify the required parameter 'tagCreateParams' is set
            if (tagCreateParams == null)
                throw new ApiException(400, "Missing required parameter 'tagCreateParams' when calling TagsApi->CreateTag");

            var localVarPath = "/tags";
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
            if (tagCreateParams != null && tagCreateParams.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(tagCreateParams); // http body (model) parameter
            }
            else
            {
                localVarPostBody = tagCreateParams; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateTag", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Tag>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Tag) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Tag)));
        }

        /// <summary>
        /// /tags Create a new tag for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagCreateParams"></param>
        /// <returns>Task of Tag</returns>
        public async System.Threading.Tasks.Task<Tag> CreateTagAsync (string accessToken, TagCreate tagCreateParams)
        {
             ApiResponse<Tag> localVarResponse = await CreateTagAsyncWithHttpInfo(accessToken, tagCreateParams);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /tags Create a new tag for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagCreateParams"></param>
        /// <returns>Task of ApiResponse (Tag)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Tag>> CreateTagAsyncWithHttpInfo (string accessToken, TagCreate tagCreateParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling TagsApi->CreateTag");
            // verify the required parameter 'tagCreateParams' is set
            if (tagCreateParams == null)
                throw new ApiException(400, "Missing required parameter 'tagCreateParams' when calling TagsApi->CreateTag");

            var localVarPath = "/tags";
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
            if (tagCreateParams != null && tagCreateParams.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(tagCreateParams); // http body (model) parameter
            }
            else
            {
                localVarPostBody = tagCreateParams; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateTag", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Tag>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Tag) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Tag)));
        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Permanently deletes a tag.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns></returns>
        public void DeleteTagById (string accessToken, long? tagId)
        {
             DeleteTagByIdWithHttpInfo(accessToken, tagId);
        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Permanently deletes a tag.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> DeleteTagByIdWithHttpInfo (string accessToken, long? tagId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling TagsApi->DeleteTagById");
            // verify the required parameter 'tagId' is set
            if (tagId == null)
                throw new ApiException(400, "Missing required parameter 'tagId' when calling TagsApi->DeleteTagById");

            var localVarPath = "/tags/{tag_id}";
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

            if (tagId != null) localVarPathParams.Add("tag_id", this.Configuration.ApiClient.ParameterToString(tagId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeleteTagById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Permanently deletes a tag.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeleteTagByIdAsync (string accessToken, long? tagId)
        {
             await DeleteTagByIdAsyncWithHttpInfo(accessToken, tagId);

        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Permanently deletes a tag.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> DeleteTagByIdAsyncWithHttpInfo (string accessToken, long? tagId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling TagsApi->DeleteTagById");
            // verify the required parameter 'tagId' is set
            if (tagId == null)
                throw new ApiException(400, "Missing required parameter 'tagId' when calling TagsApi->DeleteTagById");

            var localVarPath = "/tags/{tag_id}";
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

            if (tagId != null) localVarPathParams.Add("tag_id", this.Configuration.ApiClient.ParameterToString(tagId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeleteTagById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// /tags Fetch all of the tags for a group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>InlineResponse2009</returns>
        public InlineResponse2009 GetAllTags (string accessToken, long? groupId = null)
        {
             ApiResponse<InlineResponse2009> localVarResponse = GetAllTagsWithHttpInfo(accessToken, groupId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /tags Fetch all of the tags for a group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>ApiResponse of InlineResponse2009</returns>
        public ApiResponse< InlineResponse2009 > GetAllTagsWithHttpInfo (string accessToken, long? groupId = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling TagsApi->GetAllTags");

            var localVarPath = "/tags";
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
                Exception exception = ExceptionFactory("GetAllTags", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<InlineResponse2009>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (InlineResponse2009) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(InlineResponse2009)));
        }

        /// <summary>
        /// /tags Fetch all of the tags for a group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of InlineResponse2009</returns>
        public async System.Threading.Tasks.Task<InlineResponse2009> GetAllTagsAsync (string accessToken, long? groupId = null)
        {
             ApiResponse<InlineResponse2009> localVarResponse = await GetAllTagsAsyncWithHttpInfo(accessToken, groupId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /tags Fetch all of the tags for a group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of ApiResponse (InlineResponse2009)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<InlineResponse2009>> GetAllTagsAsyncWithHttpInfo (string accessToken, long? groupId = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling TagsApi->GetAllTags");

            var localVarPath = "/tags";
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
                Exception exception = ExceptionFactory("GetAllTags", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<InlineResponse2009>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (InlineResponse2009) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(InlineResponse2009)));
        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Fetch a tag by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns>Tag</returns>
        public Tag GetTagById (string accessToken, long? tagId)
        {
             ApiResponse<Tag> localVarResponse = GetTagByIdWithHttpInfo(accessToken, tagId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Fetch a tag by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns>ApiResponse of Tag</returns>
        public ApiResponse< Tag > GetTagByIdWithHttpInfo (string accessToken, long? tagId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling TagsApi->GetTagById");
            // verify the required parameter 'tagId' is set
            if (tagId == null)
                throw new ApiException(400, "Missing required parameter 'tagId' when calling TagsApi->GetTagById");

            var localVarPath = "/tags/{tag_id}";
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

            if (tagId != null) localVarPathParams.Add("tag_id", this.Configuration.ApiClient.ParameterToString(tagId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetTagById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Tag>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Tag) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Tag)));
        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Fetch a tag by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns>Task of Tag</returns>
        public async System.Threading.Tasks.Task<Tag> GetTagByIdAsync (string accessToken, long? tagId)
        {
             ApiResponse<Tag> localVarResponse = await GetTagByIdAsyncWithHttpInfo(accessToken, tagId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Fetch a tag by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns>Task of ApiResponse (Tag)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Tag>> GetTagByIdAsyncWithHttpInfo (string accessToken, long? tagId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling TagsApi->GetTagById");
            // verify the required parameter 'tagId' is set
            if (tagId == null)
                throw new ApiException(400, "Missing required parameter 'tagId' when calling TagsApi->GetTagById");

            var localVarPath = "/tags/{tag_id}";
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

            if (tagId != null) localVarPathParams.Add("tag_id", this.Configuration.ApiClient.ParameterToString(tagId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetTagById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Tag>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Tag) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Tag)));
        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Add or delete specific members from a tag, or modify the name of a tag.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <param name="tagModifyParams"></param>
        /// <returns>Tag</returns>
        public Tag ModifyTagById (string accessToken, long? tagId, TagModify tagModifyParams)
        {
             ApiResponse<Tag> localVarResponse = ModifyTagByIdWithHttpInfo(accessToken, tagId, tagModifyParams);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Add or delete specific members from a tag, or modify the name of a tag.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <param name="tagModifyParams"></param>
        /// <returns>ApiResponse of Tag</returns>
        public ApiResponse< Tag > ModifyTagByIdWithHttpInfo (string accessToken, long? tagId, TagModify tagModifyParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling TagsApi->ModifyTagById");
            // verify the required parameter 'tagId' is set
            if (tagId == null)
                throw new ApiException(400, "Missing required parameter 'tagId' when calling TagsApi->ModifyTagById");
            // verify the required parameter 'tagModifyParams' is set
            if (tagModifyParams == null)
                throw new ApiException(400, "Missing required parameter 'tagModifyParams' when calling TagsApi->ModifyTagById");

            var localVarPath = "/tags/{tag_id}";
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

            if (tagId != null) localVarPathParams.Add("tag_id", this.Configuration.ApiClient.ParameterToString(tagId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (tagModifyParams != null && tagModifyParams.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(tagModifyParams); // http body (model) parameter
            }
            else
            {
                localVarPostBody = tagModifyParams; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.PATCH, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ModifyTagById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Tag>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Tag) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Tag)));
        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Add or delete specific members from a tag, or modify the name of a tag.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <param name="tagModifyParams"></param>
        /// <returns>Task of Tag</returns>
        public async System.Threading.Tasks.Task<Tag> ModifyTagByIdAsync (string accessToken, long? tagId, TagModify tagModifyParams)
        {
             ApiResponse<Tag> localVarResponse = await ModifyTagByIdAsyncWithHttpInfo(accessToken, tagId, tagModifyParams);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Add or delete specific members from a tag, or modify the name of a tag.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <param name="tagModifyParams"></param>
        /// <returns>Task of ApiResponse (Tag)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Tag>> ModifyTagByIdAsyncWithHttpInfo (string accessToken, long? tagId, TagModify tagModifyParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling TagsApi->ModifyTagById");
            // verify the required parameter 'tagId' is set
            if (tagId == null)
                throw new ApiException(400, "Missing required parameter 'tagId' when calling TagsApi->ModifyTagById");
            // verify the required parameter 'tagModifyParams' is set
            if (tagModifyParams == null)
                throw new ApiException(400, "Missing required parameter 'tagModifyParams' when calling TagsApi->ModifyTagById");

            var localVarPath = "/tags/{tag_id}";
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

            if (tagId != null) localVarPathParams.Add("tag_id", this.Configuration.ApiClient.ParameterToString(tagId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (tagModifyParams != null && tagModifyParams.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(tagModifyParams); // http body (model) parameter
            }
            else
            {
                localVarPostBody = tagModifyParams; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.PATCH, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ModifyTagById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Tag>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Tag) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Tag)));
        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <param name="updateTagParams"></param>
        /// <returns>Tag</returns>
        public Tag UpdateTagById (string accessToken, long? tagId, TagUpdate updateTagParams)
        {
             ApiResponse<Tag> localVarResponse = UpdateTagByIdWithHttpInfo(accessToken, tagId, updateTagParams);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <param name="updateTagParams"></param>
        /// <returns>ApiResponse of Tag</returns>
        public ApiResponse< Tag > UpdateTagByIdWithHttpInfo (string accessToken, long? tagId, TagUpdate updateTagParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling TagsApi->UpdateTagById");
            // verify the required parameter 'tagId' is set
            if (tagId == null)
                throw new ApiException(400, "Missing required parameter 'tagId' when calling TagsApi->UpdateTagById");
            // verify the required parameter 'updateTagParams' is set
            if (updateTagParams == null)
                throw new ApiException(400, "Missing required parameter 'updateTagParams' when calling TagsApi->UpdateTagById");

            var localVarPath = "/tags/{tag_id}";
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

            if (tagId != null) localVarPathParams.Add("tag_id", this.Configuration.ApiClient.ParameterToString(tagId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (updateTagParams != null && updateTagParams.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(updateTagParams); // http body (model) parameter
            }
            else
            {
                localVarPostBody = updateTagParams; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("UpdateTagById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Tag>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Tag) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Tag)));
        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <param name="updateTagParams"></param>
        /// <returns>Task of Tag</returns>
        public async System.Threading.Tasks.Task<Tag> UpdateTagByIdAsync (string accessToken, long? tagId, TagUpdate updateTagParams)
        {
             ApiResponse<Tag> localVarResponse = await UpdateTagByIdAsyncWithHttpInfo(accessToken, tagId, updateTagParams);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <param name="updateTagParams"></param>
        /// <returns>Task of ApiResponse (Tag)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Tag>> UpdateTagByIdAsyncWithHttpInfo (string accessToken, long? tagId, TagUpdate updateTagParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new ApiException(400, "Missing required parameter 'accessToken' when calling TagsApi->UpdateTagById");
            // verify the required parameter 'tagId' is set
            if (tagId == null)
                throw new ApiException(400, "Missing required parameter 'tagId' when calling TagsApi->UpdateTagById");
            // verify the required parameter 'updateTagParams' is set
            if (updateTagParams == null)
                throw new ApiException(400, "Missing required parameter 'updateTagParams' when calling TagsApi->UpdateTagById");

            var localVarPath = "/tags/{tag_id}";
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

            if (tagId != null) localVarPathParams.Add("tag_id", this.Configuration.ApiClient.ParameterToString(tagId)); // path parameter
            if (accessToken != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "access_token", accessToken)); // query parameter
            if (updateTagParams != null && updateTagParams.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(updateTagParams); // http body (model) parameter
            }
            else
            {
                localVarPostBody = updateTagParams; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("UpdateTagById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Tag>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Tag) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Tag)));
        }

    }
}
