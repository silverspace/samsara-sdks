/*
 * SamsaraAPI.PCL
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
using System;
using System.Collections.Generic;
using System.Dynamic;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json.Converters;
using SamsaraAPI.PCL;
using SamsaraAPI.PCL.Utilities;
using SamsaraAPI.PCL.Http.Request;
using SamsaraAPI.PCL.Http.Response;
using SamsaraAPI.PCL.Http.Client;
using SamsaraAPI.PCL.Exceptions;

namespace SamsaraAPI.PCL.Controllers
{
    public partial class TagsController: BaseController
    {
        #region Singleton Pattern

        //private static variables for the singleton pattern
        private static object syncObject = new object();
        private static TagsController instance = null;

        /// <summary>
        /// Singleton pattern implementation
        /// </summary>
        internal static TagsController Instance
        {
            get
            {
                lock (syncObject)
                {
                    if (null == instance)
                    {
                        instance = new TagsController();
                    }
                }
                return instance;
            }
        }

        #endregion Singleton Pattern

        /// <summary>
        /// Permanently deletes a tag.
        /// </summary>
        /// <param name="accessToken">Required parameter: Samsara API access token.</param>
        /// <param name="tagId">Required parameter: ID of the tag.</param>
        /// <return>Returns the void response from the API call</return>
        public void DeleteTagById(string accessToken, long tagId)
        {
            Task t = DeleteTagByIdAsync(accessToken, tagId);
            APIHelper.RunTaskSynchronously(t);
        }

        /// <summary>
        /// Permanently deletes a tag.
        /// </summary>
        /// <param name="accessToken">Required parameter: Samsara API access token.</param>
        /// <param name="tagId">Required parameter: ID of the tag.</param>
        /// <return>Returns the void response from the API call</return>
        public async Task DeleteTagByIdAsync(string accessToken, long tagId)
        {
            //the base uri for api requests
            string _baseUri = Configuration.BaseUri;

            //prepare query string for API call
            StringBuilder _queryBuilder = new StringBuilder(_baseUri);
            _queryBuilder.Append("/tags/{tag_id}");

            //process optional template parameters
            APIHelper.AppendUrlWithTemplateParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "tag_id", tagId }
            });

            //process optional query parameters
            APIHelper.AppendUrlWithQueryParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "access_token", accessToken },
                { "access_token", Configuration.AccessToken }
            },ArrayDeserializationFormat,ParameterSeparator);


            //validate and preprocess url
            string _queryUrl = APIHelper.CleanUrl(_queryBuilder);

            //append request with appropriate headers and parameters
            var _headers = new Dictionary<string,string>()
            {
                { "user-agent", "APIMATIC 2.0" }
            };

            //prepare the API call request to fetch the response
            HttpRequest _request = ClientInstance.Delete(_queryUrl, _headers, null);

            //invoke request and get response
            HttpStringResponse _response = (HttpStringResponse) await ClientInstance.ExecuteAsStringAsync(_request).ConfigureAwait(false);
            HttpContext _context = new HttpContext(_request,_response);

            //Error handling using HTTP status codes
            if ((_response.StatusCode < 200) || (_response.StatusCode > 208)) //[200,208] = HTTP OK
                throw new APIException(@"Unexpected error.", _context);

            //handle errors defined at the API level
            base.ValidateResponse(_response, _context);

        }

        /// <summary>
        /// Fetch a tag by id.
        /// </summary>
        /// <param name="accessToken">Required parameter: Samsara API access token.</param>
        /// <param name="tagId">Required parameter: ID of the tag.</param>
        /// <return>Returns the Models.Tag response from the API call</return>
        public Models.Tag GetTagById(string accessToken, long tagId)
        {
            Task<Models.Tag> t = GetTagByIdAsync(accessToken, tagId);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Fetch a tag by id.
        /// </summary>
        /// <param name="accessToken">Required parameter: Samsara API access token.</param>
        /// <param name="tagId">Required parameter: ID of the tag.</param>
        /// <return>Returns the Models.Tag response from the API call</return>
        public async Task<Models.Tag> GetTagByIdAsync(string accessToken, long tagId)
        {
            //the base uri for api requests
            string _baseUri = Configuration.BaseUri;

            //prepare query string for API call
            StringBuilder _queryBuilder = new StringBuilder(_baseUri);
            _queryBuilder.Append("/tags/{tag_id}");

            //process optional template parameters
            APIHelper.AppendUrlWithTemplateParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "tag_id", tagId }
            });

            //process optional query parameters
            APIHelper.AppendUrlWithQueryParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "access_token", accessToken },
                { "access_token", Configuration.AccessToken }
            },ArrayDeserializationFormat,ParameterSeparator);


            //validate and preprocess url
            string _queryUrl = APIHelper.CleanUrl(_queryBuilder);

            //append request with appropriate headers and parameters
            var _headers = new Dictionary<string,string>()
            {
                { "user-agent", "APIMATIC 2.0" },
                { "accept", "application/json" }
            };

            //prepare the API call request to fetch the response
            HttpRequest _request = ClientInstance.Get(_queryUrl,_headers);

            //invoke request and get response
            HttpStringResponse _response = (HttpStringResponse) await ClientInstance.ExecuteAsStringAsync(_request).ConfigureAwait(false);
            HttpContext _context = new HttpContext(_request,_response);

            //Error handling using HTTP status codes
            if ((_response.StatusCode < 200) || (_response.StatusCode > 208)) //[200,208] = HTTP OK
                throw new APIException(@"Unexpected error.", _context);

            //handle errors defined at the API level
            base.ValidateResponse(_response, _context);

            try
            {
                return APIHelper.JsonDeserialize<Models.Tag>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

        /// <summary>
        /// Add or delete specific members from a tag, or modify the name of a tag.
        /// </summary>
        /// <param name="accessToken">Required parameter: Samsara API access token.</param>
        /// <param name="tagId">Required parameter: ID of the tag.</param>
        /// <param name="tagModifyParams">Required parameter: Example: </param>
        /// <return>Returns the Models.Tag response from the API call</return>
        public Models.Tag ModifyTagById(string accessToken, long tagId, Models.TagModify tagModifyParams)
        {
            Task<Models.Tag> t = ModifyTagByIdAsync(accessToken, tagId, tagModifyParams);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Add or delete specific members from a tag, or modify the name of a tag.
        /// </summary>
        /// <param name="accessToken">Required parameter: Samsara API access token.</param>
        /// <param name="tagId">Required parameter: ID of the tag.</param>
        /// <param name="tagModifyParams">Required parameter: Example: </param>
        /// <return>Returns the Models.Tag response from the API call</return>
        public async Task<Models.Tag> ModifyTagByIdAsync(string accessToken, long tagId, Models.TagModify tagModifyParams)
        {
            //the base uri for api requests
            string _baseUri = Configuration.BaseUri;

            //prepare query string for API call
            StringBuilder _queryBuilder = new StringBuilder(_baseUri);
            _queryBuilder.Append("/tags/{tag_id}");

            //process optional template parameters
            APIHelper.AppendUrlWithTemplateParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "tag_id", tagId }
            });

            //process optional query parameters
            APIHelper.AppendUrlWithQueryParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "access_token", accessToken },
                { "access_token", Configuration.AccessToken }
            },ArrayDeserializationFormat,ParameterSeparator);


            //validate and preprocess url
            string _queryUrl = APIHelper.CleanUrl(_queryBuilder);

            //append request with appropriate headers and parameters
            var _headers = new Dictionary<string,string>()
            {
                { "user-agent", "APIMATIC 2.0" },
                { "accept", "application/json" },
                { "content-type", "application/json; charset=utf-8" }
            };

            //append body params
            var _body = APIHelper.JsonSerialize(tagModifyParams);

            //prepare the API call request to fetch the response
            HttpRequest _request = ClientInstance.PatchBody(_queryUrl, _headers, _body);

            //invoke request and get response
            HttpStringResponse _response = (HttpStringResponse) await ClientInstance.ExecuteAsStringAsync(_request).ConfigureAwait(false);
            HttpContext _context = new HttpContext(_request,_response);

            //Error handling using HTTP status codes
            if ((_response.StatusCode < 200) || (_response.StatusCode > 208)) //[200,208] = HTTP OK
                throw new APIException(@"Unexpected error.", _context);

            //handle errors defined at the API level
            base.ValidateResponse(_response, _context);

            try
            {
                return APIHelper.JsonDeserialize<Models.Tag>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

        /// <summary>
        /// Create a new tag for the group.
        /// </summary>
        /// <param name="accessToken">Required parameter: Samsara API access token.</param>
        /// <param name="tagCreateParams">Required parameter: Example: </param>
        /// <return>Returns the Models.Tag response from the API call</return>
        public Models.Tag CreateTag(string accessToken, Models.TagCreate tagCreateParams)
        {
            Task<Models.Tag> t = CreateTagAsync(accessToken, tagCreateParams);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Create a new tag for the group.
        /// </summary>
        /// <param name="accessToken">Required parameter: Samsara API access token.</param>
        /// <param name="tagCreateParams">Required parameter: Example: </param>
        /// <return>Returns the Models.Tag response from the API call</return>
        public async Task<Models.Tag> CreateTagAsync(string accessToken, Models.TagCreate tagCreateParams)
        {
            //the base uri for api requests
            string _baseUri = Configuration.BaseUri;

            //prepare query string for API call
            StringBuilder _queryBuilder = new StringBuilder(_baseUri);
            _queryBuilder.Append("/tags");

            //process optional query parameters
            APIHelper.AppendUrlWithQueryParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "access_token", accessToken },
                { "access_token", Configuration.AccessToken }
            },ArrayDeserializationFormat,ParameterSeparator);


            //validate and preprocess url
            string _queryUrl = APIHelper.CleanUrl(_queryBuilder);

            //append request with appropriate headers and parameters
            var _headers = new Dictionary<string,string>()
            {
                { "user-agent", "APIMATIC 2.0" },
                { "accept", "application/json" },
                { "content-type", "application/json; charset=utf-8" }
            };

            //append body params
            var _body = APIHelper.JsonSerialize(tagCreateParams);

            //prepare the API call request to fetch the response
            HttpRequest _request = ClientInstance.PostBody(_queryUrl, _headers, _body);

            //invoke request and get response
            HttpStringResponse _response = (HttpStringResponse) await ClientInstance.ExecuteAsStringAsync(_request).ConfigureAwait(false);
            HttpContext _context = new HttpContext(_request,_response);

            //Error handling using HTTP status codes
            if ((_response.StatusCode < 200) || (_response.StatusCode > 208)) //[200,208] = HTTP OK
                throw new APIException(@"Unexpected error.", _context);

            //handle errors defined at the API level
            base.ValidateResponse(_response, _context);

            try
            {
                return APIHelper.JsonDeserialize<Models.Tag>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

        /// <summary>
        /// Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
        /// </summary>
        /// <param name="accessToken">Required parameter: Samsara API access token.</param>
        /// <param name="tagId">Required parameter: ID of the tag.</param>
        /// <param name="updateTagParams">Required parameter: Example: </param>
        /// <return>Returns the Models.Tag response from the API call</return>
        public Models.Tag UpdateTagById(string accessToken, long tagId, Models.TagUpdate updateTagParams)
        {
            Task<Models.Tag> t = UpdateTagByIdAsync(accessToken, tagId, updateTagParams);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
        /// </summary>
        /// <param name="accessToken">Required parameter: Samsara API access token.</param>
        /// <param name="tagId">Required parameter: ID of the tag.</param>
        /// <param name="updateTagParams">Required parameter: Example: </param>
        /// <return>Returns the Models.Tag response from the API call</return>
        public async Task<Models.Tag> UpdateTagByIdAsync(string accessToken, long tagId, Models.TagUpdate updateTagParams)
        {
            //the base uri for api requests
            string _baseUri = Configuration.BaseUri;

            //prepare query string for API call
            StringBuilder _queryBuilder = new StringBuilder(_baseUri);
            _queryBuilder.Append("/tags/{tag_id}");

            //process optional template parameters
            APIHelper.AppendUrlWithTemplateParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "tag_id", tagId }
            });

            //process optional query parameters
            APIHelper.AppendUrlWithQueryParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "access_token", accessToken },
                { "access_token", Configuration.AccessToken }
            },ArrayDeserializationFormat,ParameterSeparator);


            //validate and preprocess url
            string _queryUrl = APIHelper.CleanUrl(_queryBuilder);

            //append request with appropriate headers and parameters
            var _headers = new Dictionary<string,string>()
            {
                { "user-agent", "APIMATIC 2.0" },
                { "accept", "application/json" },
                { "content-type", "application/json; charset=utf-8" }
            };

            //append body params
            var _body = APIHelper.JsonSerialize(updateTagParams);

            //prepare the API call request to fetch the response
            HttpRequest _request = ClientInstance.PutBody(_queryUrl, _headers, _body);

            //invoke request and get response
            HttpStringResponse _response = (HttpStringResponse) await ClientInstance.ExecuteAsStringAsync(_request).ConfigureAwait(false);
            HttpContext _context = new HttpContext(_request,_response);

            //Error handling using HTTP status codes
            if ((_response.StatusCode < 200) || (_response.StatusCode > 208)) //[200,208] = HTTP OK
                throw new APIException(@"Unexpected error.", _context);

            //handle errors defined at the API level
            base.ValidateResponse(_response, _context);

            try
            {
                return APIHelper.JsonDeserialize<Models.Tag>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

        /// <summary>
        /// Fetch all of the tags for a group.
        /// </summary>
        /// <param name="accessToken">Required parameter: Samsara API access token.</param>
        /// <param name="groupId">Optional parameter: Optional group ID if the organization has multiple groups (uncommon).</param>
        /// <return>Returns the Models.GetAllTagsResponse response from the API call</return>
        public Models.GetAllTagsResponse GetAllTags(string accessToken, long? groupId = null)
        {
            Task<Models.GetAllTagsResponse> t = GetAllTagsAsync(accessToken, groupId);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Fetch all of the tags for a group.
        /// </summary>
        /// <param name="accessToken">Required parameter: Samsara API access token.</param>
        /// <param name="groupId">Optional parameter: Optional group ID if the organization has multiple groups (uncommon).</param>
        /// <return>Returns the Models.GetAllTagsResponse response from the API call</return>
        public async Task<Models.GetAllTagsResponse> GetAllTagsAsync(string accessToken, long? groupId = null)
        {
            //the base uri for api requests
            string _baseUri = Configuration.BaseUri;

            //prepare query string for API call
            StringBuilder _queryBuilder = new StringBuilder(_baseUri);
            _queryBuilder.Append("/tags");

            //process optional query parameters
            APIHelper.AppendUrlWithQueryParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "access_token", accessToken },
                { "group_id", groupId },
                { "access_token", Configuration.AccessToken }
            },ArrayDeserializationFormat,ParameterSeparator);


            //validate and preprocess url
            string _queryUrl = APIHelper.CleanUrl(_queryBuilder);

            //append request with appropriate headers and parameters
            var _headers = new Dictionary<string,string>()
            {
                { "user-agent", "APIMATIC 2.0" },
                { "accept", "application/json" }
            };

            //prepare the API call request to fetch the response
            HttpRequest _request = ClientInstance.Get(_queryUrl,_headers);

            //invoke request and get response
            HttpStringResponse _response = (HttpStringResponse) await ClientInstance.ExecuteAsStringAsync(_request).ConfigureAwait(false);
            HttpContext _context = new HttpContext(_request,_response);

            //Error handling using HTTP status codes
            if ((_response.StatusCode < 200) || (_response.StatusCode > 208)) //[200,208] = HTTP OK
                throw new APIException(@"Unexpected error.", _context);

            //handle errors defined at the API level
            base.ValidateResponse(_response, _context);

            try
            {
                return APIHelper.JsonDeserialize<Models.GetAllTagsResponse>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

    }
} 