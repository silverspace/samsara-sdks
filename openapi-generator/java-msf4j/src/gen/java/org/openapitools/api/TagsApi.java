package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.TagsApiService;
import org.openapitools.api.factories.TagsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.InlineResponse2009;
import org.openapitools.model.Tag;
import org.openapitools.model.TagCreate;
import org.openapitools.model.TagModify;
import org.openapitools.model.TagUpdate;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/tags")


@io.swagger.annotations.Api(description = "the tags API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class TagsApi  {
   private final TagsApiService delegate = TagsApiServiceFactory.getTagsApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/tags", notes = "Create a new tag for the group.", response = Tag.class, tags={ "Tags", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Newly created tag object, including the new tag ID.", response = Tag.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Tag.class) })
    public Response createTag(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) TagCreate tagCreateParams
)
    throws NotFoundException {
        return delegate.createTag(accessToken,tagCreateParams);
    }
    @DELETE
    @Path("/{tag_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/tags/{tag_id:[0-9]+}", notes = "Permanently deletes a tag.", response = Void.class, tags={ "Tags", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successfully deleted the tag. No response body is returned.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Void.class) })
    public Response deleteTagById(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the tag.",required=true) @PathParam("tag_id") Long tagId
)
    throws NotFoundException {
        return delegate.deleteTagById(accessToken,tagId);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/tags", notes = "Fetch all of the tags for a group.", response = InlineResponse2009.class, tags={ "Tags", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of tags.", response = InlineResponse2009.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = InlineResponse2009.class) })
    public Response getAllTags(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).") @QueryParam("group_id") Long groupId
)
    throws NotFoundException {
        return delegate.getAllTags(accessToken,groupId);
    }
    @GET
    @Path("/{tag_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/tags/{tag_id:[0-9]+}", notes = "Fetch a tag by id.", response = Tag.class, tags={ "Tags", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The tag corresponding to tag_id.", response = Tag.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Tag.class) })
    public Response getTagById(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the tag.",required=true) @PathParam("tag_id") Long tagId
)
    throws NotFoundException {
        return delegate.getTagById(accessToken,tagId);
    }
    @PATCH
    @Path("/{tag_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/tags/{tag_id:[0-9]+}", notes = "Add or delete specific members from a tag, or modify the name of a tag.", response = Tag.class, tags={ "Tags", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The updated tag data.", response = Tag.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Tag.class) })
    public Response modifyTagById(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the tag.",required=true) @PathParam("tag_id") Long tagId
,@ApiParam(value = "" ,required=true) TagModify tagModifyParams
)
    throws NotFoundException {
        return delegate.modifyTagById(accessToken,tagId,tagModifyParams);
    }
    @PUT
    @Path("/{tag_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/tags/{tag_id:[0-9]+}", notes = "Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.", response = Tag.class, tags={ "Tags", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The updated tag data.", response = Tag.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Tag.class) })
    public Response updateTagById(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the tag.",required=true) @PathParam("tag_id") Long tagId
,@ApiParam(value = "" ,required=true) TagUpdate updateTagParams
)
    throws NotFoundException {
        return delegate.updateTagById(accessToken,tagId,updateTagParams);
    }
}
