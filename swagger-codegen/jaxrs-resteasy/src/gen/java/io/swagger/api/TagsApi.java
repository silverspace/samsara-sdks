package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.TagsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.InlineResponse2009;
import io.swagger.model.Tag;
import io.swagger.model.TagCreate;
import io.swagger.model.TagModify;
import io.swagger.model.TagUpdate;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;

@Path("/tags")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the tags API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public class TagsApi  {

    @Inject TagsApiService service;

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/tags", notes = "Create a new tag for the group.", response = Tag.class, tags={ "Tags", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Newly created tag object, including the new tag ID.", response = Tag.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response createTag( @NotNull  @QueryParam("access_token") String accessToken,@ApiParam(value = "" ,required=true) TagCreate tagCreateParams,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createTag(accessToken,tagCreateParams,securityContext);
    }
    @DELETE
    @Path("/{tag_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/tags/{tag_id:[0-9]+}", notes = "Permanently deletes a tag.", response = Void.class, tags={ "Tags", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successfully deleted the tag. No response body is returned.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response deleteTagById( @NotNull  @QueryParam("access_token") String accessToken, @PathParam("tag_id") Long tagId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteTagById(accessToken,tagId,securityContext);
    }
    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/tags", notes = "Fetch all of the tags for a group.", response = InlineResponse2009.class, tags={ "Tags", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of tags.", response = InlineResponse2009.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getAllTags( @NotNull  @QueryParam("access_token") String accessToken,  @QueryParam("group_id") Long groupId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAllTags(accessToken,groupId,securityContext);
    }
    @GET
    @Path("/{tag_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/tags/{tag_id:[0-9]+}", notes = "Fetch a tag by id.", response = Tag.class, tags={ "Tags", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The tag corresponding to tag_id.", response = Tag.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getTagById( @NotNull  @QueryParam("access_token") String accessToken, @PathParam("tag_id") Long tagId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTagById(accessToken,tagId,securityContext);
    }
    @PATCH
    @Path("/{tag_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/tags/{tag_id:[0-9]+}", notes = "Add or delete specific members from a tag, or modify the name of a tag.", response = Tag.class, tags={ "Tags", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The updated tag data.", response = Tag.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response modifyTagById( @NotNull  @QueryParam("access_token") String accessToken, @PathParam("tag_id") Long tagId,@ApiParam(value = "" ,required=true) TagModify tagModifyParams,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.modifyTagById(accessToken,tagId,tagModifyParams,securityContext);
    }
    @PUT
    @Path("/{tag_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/tags/{tag_id:[0-9]+}", notes = "Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.", response = Tag.class, tags={ "Tags", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The updated tag data.", response = Tag.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response updateTagById( @NotNull  @QueryParam("access_token") String accessToken, @PathParam("tag_id") Long tagId,@ApiParam(value = "" ,required=true) TagUpdate updateTagParams,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateTagById(accessToken,tagId,updateTagParams,securityContext);
    }
}
