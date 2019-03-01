package io.swagger.api;

import io.swagger.model.InlineResponse2009;
import io.swagger.model.Tag;
import io.swagger.model.TagCreate;
import io.swagger.model.TagModify;
import io.swagger.model.TagUpdate;
import io.swagger.api.TagsApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/tags")
@RequestScoped

@Api(description = "the tags API")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-03-01T04:20:11.959Z")

public class TagsApi  {

  @Context SecurityContext securityContext;

  @Inject TagsApiService delegate;


    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/tags", notes = "Create a new tag for the group.", response = Tag.class, tags={ "Tags",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Newly created tag object, including the new tag ID.", response = Tag.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response createTag( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "" ,required=true) TagCreate tagCreateParams) {
        return delegate.createTag(accessToken, tagCreateParams, securityContext);
    }

    @DELETE
    @Path("/{tag_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/tags/{tag_id:[0-9]+}", notes = "Permanently deletes a tag.", response = Void.class, tags={ "Tags",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully deleted the tag. No response body is returned.", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response deleteTagById( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the tag.",required=true) @PathParam("tag_id") Long tagId) {
        return delegate.deleteTagById(accessToken, tagId, securityContext);
    }

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/tags", notes = "Fetch all of the tags for a group.", response = InlineResponse2009.class, tags={ "Tags",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of tags.", response = InlineResponse2009.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getAllTags( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken,  @ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).")  @QueryParam("group_id") Long groupId) {
        return delegate.getAllTags(accessToken, groupId, securityContext);
    }

    @GET
    @Path("/{tag_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/tags/{tag_id:[0-9]+}", notes = "Fetch a tag by id.", response = Tag.class, tags={ "Tags",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The tag corresponding to tag_id.", response = Tag.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getTagById( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the tag.",required=true) @PathParam("tag_id") Long tagId) {
        return delegate.getTagById(accessToken, tagId, securityContext);
    }

    @PATCH
    @Path("/{tag_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/tags/{tag_id:[0-9]+}", notes = "Add or delete specific members from a tag, or modify the name of a tag.", response = Tag.class, tags={ "Tags",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The updated tag data.", response = Tag.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response modifyTagById( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the tag.",required=true) @PathParam("tag_id") Long tagId, @ApiParam(value = "" ,required=true) TagModify tagModifyParams) {
        return delegate.modifyTagById(accessToken, tagId, tagModifyParams, securityContext);
    }

    @PUT
    @Path("/{tag_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/tags/{tag_id:[0-9]+}", notes = "Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.", response = Tag.class, tags={ "Tags" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The updated tag data.", response = Tag.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response updateTagById( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the tag.",required=true) @PathParam("tag_id") Long tagId, @ApiParam(value = "" ,required=true) TagUpdate updateTagParams) {
        return delegate.updateTagById(accessToken, tagId, updateTagParams, securityContext);
    }
}
