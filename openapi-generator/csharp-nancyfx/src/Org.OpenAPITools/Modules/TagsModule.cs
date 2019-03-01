using System;
using Nancy;
using Nancy.ModelBinding;
using System.Collections.Generic;
using Sharpility.Base;
using Org.OpenAPITools.v1.Models;
using Org.OpenAPITools.v1.Utils;
using NodaTime;

namespace Org.OpenAPITools.v1.Modules
{ 

    /// <summary>
    /// Module processing requests of Tags domain.
    /// </summary>
    public sealed class TagsModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public TagsModule(TagsService service) : base("/v1")
        { 
            Post["/tags"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var tagCreateParams = this.Bind<TagCreate>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'CreateTag'");
                
                Preconditions.IsNotNull(tagCreateParams, "Required parameter: 'tagCreateParams' is missing at 'CreateTag'");
                
                return service.CreateTag(Context, accessToken, tagCreateParams);
            };

            Delete["/tags/{tag_id}"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var tagId = Parameters.ValueOf<long?>(parameters, Context.Request, "tagId", ParameterType.Path);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'DeleteTagById'");
                
                Preconditions.IsNotNull(tagId, "Required parameter: 'tagId' is missing at 'DeleteTagById'");
                
                service.DeleteTagById(Context, accessToken, tagId);
                return new Response { ContentType = "application/json"};
            };

            Get["/tags"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var groupId = Parameters.ValueOf<long?>(parameters, Context.Request, "groupId", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetAllTags'");
                
                return service.GetAllTags(Context, accessToken, groupId);
            };

            Get["/tags/{tag_id}"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var tagId = Parameters.ValueOf<long?>(parameters, Context.Request, "tagId", ParameterType.Path);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetTagById'");
                
                Preconditions.IsNotNull(tagId, "Required parameter: 'tagId' is missing at 'GetTagById'");
                
                return service.GetTagById(Context, accessToken, tagId);
            };

            Patch["/tags/{tag_id}"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var tagId = Parameters.ValueOf<long?>(parameters, Context.Request, "tagId", ParameterType.Path);
                var tagModifyParams = this.Bind<TagModify>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'ModifyTagById'");
                
                Preconditions.IsNotNull(tagId, "Required parameter: 'tagId' is missing at 'ModifyTagById'");
                
                Preconditions.IsNotNull(tagModifyParams, "Required parameter: 'tagModifyParams' is missing at 'ModifyTagById'");
                
                return service.ModifyTagById(Context, accessToken, tagId, tagModifyParams);
            };

            Put["/tags/{tag_id}"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var tagId = Parameters.ValueOf<long?>(parameters, Context.Request, "tagId", ParameterType.Path);
                var updateTagParams = this.Bind<TagUpdate>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'UpdateTagById'");
                
                Preconditions.IsNotNull(tagId, "Required parameter: 'tagId' is missing at 'UpdateTagById'");
                
                Preconditions.IsNotNull(updateTagParams, "Required parameter: 'updateTagParams' is missing at 'UpdateTagById'");
                
                return service.UpdateTagById(Context, accessToken, tagId, updateTagParams);
            };
        }
    }

    /// <summary>
    /// Service handling Tags requests.
    /// </summary>
    public interface TagsService
    {
        /// <summary>
        /// Create a new tag for the group.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagCreateParams"></param>
        /// <returns>Tag</returns>
        Tag CreateTag(NancyContext context, string accessToken, TagCreate tagCreateParams);

        /// <summary>
        /// Permanently deletes a tag.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns></returns>
        void DeleteTagById(NancyContext context, string accessToken, long? tagId);

        /// <summary>
        /// Fetch all of the tags for a group.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>InlineResponse2009</returns>
        InlineResponse2009 GetAllTags(NancyContext context, string accessToken, long? groupId);

        /// <summary>
        /// Fetch a tag by id.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <returns>Tag</returns>
        Tag GetTagById(NancyContext context, string accessToken, long? tagId);

        /// <summary>
        /// Add or delete specific members from a tag, or modify the name of a tag.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <param name="tagModifyParams"></param>
        /// <returns>Tag</returns>
        Tag ModifyTagById(NancyContext context, string accessToken, long? tagId, TagModify tagModifyParams);

        /// <summary>
        /// Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tagId">ID of the tag.</param>
        /// <param name="updateTagParams"></param>
        /// <returns>Tag</returns>
        Tag UpdateTagById(NancyContext context, string accessToken, long? tagId, TagUpdate updateTagParams);
    }

    /// <summary>
    /// Abstraction of TagsService.
    /// </summary>
    public abstract class AbstractTagsService: TagsService
    {
        public virtual Tag CreateTag(NancyContext context, string accessToken, TagCreate tagCreateParams)
        {
            return CreateTag(accessToken, tagCreateParams);
        }

        public virtual void DeleteTagById(NancyContext context, string accessToken, long? tagId)
        {
            DeleteTagById(accessToken, tagId);
        }

        public virtual InlineResponse2009 GetAllTags(NancyContext context, string accessToken, long? groupId)
        {
            return GetAllTags(accessToken, groupId);
        }

        public virtual Tag GetTagById(NancyContext context, string accessToken, long? tagId)
        {
            return GetTagById(accessToken, tagId);
        }

        public virtual Tag ModifyTagById(NancyContext context, string accessToken, long? tagId, TagModify tagModifyParams)
        {
            return ModifyTagById(accessToken, tagId, tagModifyParams);
        }

        public virtual Tag UpdateTagById(NancyContext context, string accessToken, long? tagId, TagUpdate updateTagParams)
        {
            return UpdateTagById(accessToken, tagId, updateTagParams);
        }

        protected abstract Tag CreateTag(string accessToken, TagCreate tagCreateParams);

        protected abstract void DeleteTagById(string accessToken, long? tagId);

        protected abstract InlineResponse2009 GetAllTags(string accessToken, long? groupId);

        protected abstract Tag GetTagById(string accessToken, long? tagId);

        protected abstract Tag ModifyTagById(string accessToken, long? tagId, TagModify tagModifyParams);

        protected abstract Tag UpdateTagById(string accessToken, long? tagId, TagUpdate updateTagParams);
    }

}
