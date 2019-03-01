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
    public interface ITagsApiSync : IApiAccessor
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
        void DeleteTagById (string accessToken, long tagId);

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
        ApiResponse<Object> DeleteTagByIdWithHttpInfo (string accessToken, long tagId);
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
        Tag GetTagById (string accessToken, long tagId);

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
        ApiResponse<Tag> GetTagByIdWithHttpInfo (string accessToken, long tagId);
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
        Tag ModifyTagById (string accessToken, long tagId, TagModify tagModifyParams);

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
        ApiResponse<Tag> ModifyTagByIdWithHttpInfo (string accessToken, long tagId, TagModify tagModifyParams);
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
        Tag UpdateTagById (string accessToken, long tagId, TagUpdate updateTagParams);

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
        ApiResponse<Tag> UpdateTagByIdWithHttpInfo (string accessToken, long tagId, TagUpdate updateTagParams);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ITagsApiAsync : IApiAccessor
    {
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
        System.Threading.Tasks.Task DeleteTagByIdAsync (string accessToken, long tagId);

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
        System.Threading.Tasks.Task<ApiResponse<Object>> DeleteTagByIdAsyncWithHttpInfo (string accessToken, long tagId);
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
        System.Threading.Tasks.Task<Tag> GetTagByIdAsync (string accessToken, long tagId);

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
        System.Threading.Tasks.Task<ApiResponse<Tag>> GetTagByIdAsyncWithHttpInfo (string accessToken, long tagId);
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
        System.Threading.Tasks.Task<Tag> ModifyTagByIdAsync (string accessToken, long tagId, TagModify tagModifyParams);

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
        System.Threading.Tasks.Task<ApiResponse<Tag>> ModifyTagByIdAsyncWithHttpInfo (string accessToken, long tagId, TagModify tagModifyParams);
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
        System.Threading.Tasks.Task<Tag> UpdateTagByIdAsync (string accessToken, long tagId, TagUpdate updateTagParams);

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
        System.Threading.Tasks.Task<ApiResponse<Tag>> UpdateTagByIdAsyncWithHttpInfo (string accessToken, long tagId, TagUpdate updateTagParams);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ITagsApi : ITagsApiSync, ITagsApiAsync
    {

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
        public TagsApi() : this((string) null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TagsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public TagsApi(String basePath)
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
        /// Initializes a new instance of the <see cref="TagsApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public TagsApi(Org.OpenAPITools.Client.Configuration configuration)
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
        public TagsApi(Org.OpenAPITools.Client.ISynchronousClient client,Org.OpenAPITools.Client.IAsynchronousClient asyncClient, Org.OpenAPITools.Client.IReadableConfiguration configuration)
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
        /// /tags Create a new tag for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagCreateParams"></param>
        /// <returns>Tag</returns>
        public Tag CreateTag (string accessToken, TagCreate tagCreateParams)
        {
             Org.OpenAPITools.Client.ApiResponse<Tag> localVarResponse = CreateTagWithHttpInfo(accessToken, tagCreateParams);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /tags Create a new tag for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagCreateParams"></param>
        /// <returns>ApiResponse of Tag</returns>
        public Org.OpenAPITools.Client.ApiResponse< Tag > CreateTagWithHttpInfo (string accessToken, TagCreate tagCreateParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling TagsApi->CreateTag");

            // verify the required parameter 'tagCreateParams' is set
            if (tagCreateParams == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'tagCreateParams' when calling TagsApi->CreateTag");

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
            requestOptions.Data = tagCreateParams;


            // make the HTTP request

            var response = this.Client.Post< Tag >("/tags", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("CreateTag", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<Tag> localVarResponse = await CreateTagAsyncWithHttpInfo(accessToken, tagCreateParams);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /tags Create a new tag for the group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagCreateParams"></param>
        /// <returns>Task of ApiResponse (Tag)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Tag>> CreateTagAsyncWithHttpInfo (string accessToken, TagCreate tagCreateParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling TagsApi->CreateTag");

            // verify the required parameter 'tagCreateParams' is set
            if (tagCreateParams == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'tagCreateParams' when calling TagsApi->CreateTag");


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
            requestOptions.Data = tagCreateParams;


            // make the HTTP request

            var response = await this.AsynchronousClient.PostAsync<Tag>("/tags", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("CreateTag", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Permanently deletes a tag.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns></returns>
        public void DeleteTagById (string accessToken, long tagId)
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
        public Org.OpenAPITools.Client.ApiResponse<Object> DeleteTagByIdWithHttpInfo (string accessToken, long tagId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling TagsApi->DeleteTagById");

            // verify the required parameter 'tagId' is set
            if (tagId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'tagId' when calling TagsApi->DeleteTagById");

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

            if (tagId != null)
                requestOptions.PathParameters.Add("tag_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(tagId)); // path parameter
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

            var response = this.Client.Delete<Object>("/tags/{tag_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("DeleteTagById", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Permanently deletes a tag.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeleteTagByIdAsync (string accessToken, long tagId)
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Object>> DeleteTagByIdAsyncWithHttpInfo (string accessToken, long tagId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling TagsApi->DeleteTagById");

            // verify the required parameter 'tagId' is set
            if (tagId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'tagId' when calling TagsApi->DeleteTagById");


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
            
            if (tagId != null)
                requestOptions.PathParameters.Add("tag_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(tagId)); // path parameter
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

            var response = await this.AsynchronousClient.DeleteAsync<Object>("/tags/{tag_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("DeleteTagById", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<InlineResponse2009> localVarResponse = GetAllTagsWithHttpInfo(accessToken, groupId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /tags Fetch all of the tags for a group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>ApiResponse of InlineResponse2009</returns>
        public Org.OpenAPITools.Client.ApiResponse< InlineResponse2009 > GetAllTagsWithHttpInfo (string accessToken, long? groupId = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling TagsApi->GetAllTags");

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

            var response = this.Client.Get< InlineResponse2009 >("/tags", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetAllTags", response);
                if (exception != null) throw exception;
            }

            return response;
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
             Org.OpenAPITools.Client.ApiResponse<InlineResponse2009> localVarResponse = await GetAllTagsAsyncWithHttpInfo(accessToken, groupId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /tags Fetch all of the tags for a group.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>Task of ApiResponse (InlineResponse2009)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<InlineResponse2009>> GetAllTagsAsyncWithHttpInfo (string accessToken, long? groupId = null)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling TagsApi->GetAllTags");


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

            var response = await this.AsynchronousClient.GetAsync<InlineResponse2009>("/tags", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetAllTags", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Fetch a tag by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns>Tag</returns>
        public Tag GetTagById (string accessToken, long tagId)
        {
             Org.OpenAPITools.Client.ApiResponse<Tag> localVarResponse = GetTagByIdWithHttpInfo(accessToken, tagId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Fetch a tag by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns>ApiResponse of Tag</returns>
        public Org.OpenAPITools.Client.ApiResponse< Tag > GetTagByIdWithHttpInfo (string accessToken, long tagId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling TagsApi->GetTagById");

            // verify the required parameter 'tagId' is set
            if (tagId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'tagId' when calling TagsApi->GetTagById");

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

            if (tagId != null)
                requestOptions.PathParameters.Add("tag_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(tagId)); // path parameter
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

            var response = this.Client.Get< Tag >("/tags/{tag_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetTagById", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Fetch a tag by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns>Task of Tag</returns>
        public async System.Threading.Tasks.Task<Tag> GetTagByIdAsync (string accessToken, long tagId)
        {
             Org.OpenAPITools.Client.ApiResponse<Tag> localVarResponse = await GetTagByIdAsyncWithHttpInfo(accessToken, tagId);
             return localVarResponse.Data;

        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Fetch a tag by id.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns>Task of ApiResponse (Tag)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Tag>> GetTagByIdAsyncWithHttpInfo (string accessToken, long tagId)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling TagsApi->GetTagById");

            // verify the required parameter 'tagId' is set
            if (tagId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'tagId' when calling TagsApi->GetTagById");


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
            
            if (tagId != null)
                requestOptions.PathParameters.Add("tag_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(tagId)); // path parameter
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

            var response = await this.AsynchronousClient.GetAsync<Tag>("/tags/{tag_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("GetTagById", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Add or delete specific members from a tag, or modify the name of a tag.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <param name="tagModifyParams"></param>
        /// <returns>Tag</returns>
        public Tag ModifyTagById (string accessToken, long tagId, TagModify tagModifyParams)
        {
             Org.OpenAPITools.Client.ApiResponse<Tag> localVarResponse = ModifyTagByIdWithHttpInfo(accessToken, tagId, tagModifyParams);
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
        public Org.OpenAPITools.Client.ApiResponse< Tag > ModifyTagByIdWithHttpInfo (string accessToken, long tagId, TagModify tagModifyParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling TagsApi->ModifyTagById");

            // verify the required parameter 'tagId' is set
            if (tagId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'tagId' when calling TagsApi->ModifyTagById");

            // verify the required parameter 'tagModifyParams' is set
            if (tagModifyParams == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'tagModifyParams' when calling TagsApi->ModifyTagById");

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

            if (tagId != null)
                requestOptions.PathParameters.Add("tag_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(tagId)); // path parameter
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
            requestOptions.Data = tagModifyParams;


            // make the HTTP request

            var response = this.Client.Patch< Tag >("/tags/{tag_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("ModifyTagById", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Add or delete specific members from a tag, or modify the name of a tag.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <param name="tagModifyParams"></param>
        /// <returns>Task of Tag</returns>
        public async System.Threading.Tasks.Task<Tag> ModifyTagByIdAsync (string accessToken, long tagId, TagModify tagModifyParams)
        {
             Org.OpenAPITools.Client.ApiResponse<Tag> localVarResponse = await ModifyTagByIdAsyncWithHttpInfo(accessToken, tagId, tagModifyParams);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Tag>> ModifyTagByIdAsyncWithHttpInfo (string accessToken, long tagId, TagModify tagModifyParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling TagsApi->ModifyTagById");

            // verify the required parameter 'tagId' is set
            if (tagId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'tagId' when calling TagsApi->ModifyTagById");

            // verify the required parameter 'tagModifyParams' is set
            if (tagModifyParams == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'tagModifyParams' when calling TagsApi->ModifyTagById");


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
            
            if (tagId != null)
                requestOptions.PathParameters.Add("tag_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(tagId)); // path parameter
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
            requestOptions.Data = tagModifyParams;


            // make the HTTP request

            var response = await this.AsynchronousClient.PatchAsync<Tag>("/tags/{tag_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("ModifyTagById", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <param name="updateTagParams"></param>
        /// <returns>Tag</returns>
        public Tag UpdateTagById (string accessToken, long tagId, TagUpdate updateTagParams)
        {
             Org.OpenAPITools.Client.ApiResponse<Tag> localVarResponse = UpdateTagByIdWithHttpInfo(accessToken, tagId, updateTagParams);
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
        public Org.OpenAPITools.Client.ApiResponse< Tag > UpdateTagByIdWithHttpInfo (string accessToken, long tagId, TagUpdate updateTagParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling TagsApi->UpdateTagById");

            // verify the required parameter 'tagId' is set
            if (tagId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'tagId' when calling TagsApi->UpdateTagById");

            // verify the required parameter 'updateTagParams' is set
            if (updateTagParams == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'updateTagParams' when calling TagsApi->UpdateTagById");

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

            if (tagId != null)
                requestOptions.PathParameters.Add("tag_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(tagId)); // path parameter
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
            requestOptions.Data = updateTagParams;


            // make the HTTP request

            var response = this.Client.Put< Tag >("/tags/{tag_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("UpdateTagById", response);
                if (exception != null) throw exception;
            }

            return response;
        }

        /// <summary>
        /// /tags/{tag_id:[0-9]+} Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <param name="updateTagParams"></param>
        /// <returns>Task of Tag</returns>
        public async System.Threading.Tasks.Task<Tag> UpdateTagByIdAsync (string accessToken, long tagId, TagUpdate updateTagParams)
        {
             Org.OpenAPITools.Client.ApiResponse<Tag> localVarResponse = await UpdateTagByIdAsyncWithHttpInfo(accessToken, tagId, updateTagParams);
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
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Tag>> UpdateTagByIdAsyncWithHttpInfo (string accessToken, long tagId, TagUpdate updateTagParams)
        {
            // verify the required parameter 'accessToken' is set
            if (accessToken == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'accessToken' when calling TagsApi->UpdateTagById");

            // verify the required parameter 'tagId' is set
            if (tagId == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'tagId' when calling TagsApi->UpdateTagById");

            // verify the required parameter 'updateTagParams' is set
            if (updateTagParams == null)
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'updateTagParams' when calling TagsApi->UpdateTagById");


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
            
            if (tagId != null)
                requestOptions.PathParameters.Add("tag_id", Org.OpenAPITools.Client.ClientUtils.ParameterToString(tagId)); // path parameter
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
            requestOptions.Data = updateTagParams;


            // make the HTTP request

            var response = await this.AsynchronousClient.PutAsync<Tag>("/tags/{tag_id}", requestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception exception = this.ExceptionFactory("UpdateTagById", response);
                if (exception != null) throw exception;
            }

            return response;
        }

    }
}
