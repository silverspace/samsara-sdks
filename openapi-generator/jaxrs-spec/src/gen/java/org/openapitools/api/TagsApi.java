package org.openapitools.api;

import org.openapitools.model.InlineResponse2009;
import org.openapitools.model.Tag;
import org.openapitools.model.TagCreate;
import org.openapitools.model.TagModify;
import org.openapitools.model.TagUpdate;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/tags")
@Api(description = "the tags API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2019-03-01T05:35:42.406Z[GMT]")
public class TagsApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/tags", notes = "Create a new tag for the group.", response = Tag.class, tags={ "Tags",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Newly created tag object, including the new tag ID.", response = Tag.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response createTag(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid TagCreate tagCreateParams) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{tag_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "/tags/{tag_id:[0-9]+}", notes = "Permanently deletes a tag.", response = Void.class, tags={ "Tags",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully deleted the tag. No response body is returned.", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response deleteTagById(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("tag_id") @ApiParam("ID of the tag.") Long tagId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "/tags", notes = "Fetch all of the tags for a group.", response = InlineResponse2009.class, tags={ "Tags",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of tags.", response = InlineResponse2009.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getAllTags(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@QueryParam("group_id")   @ApiParam("Optional group ID if the organization has multiple groups (uncommon).")  Long groupId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{tag_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "/tags/{tag_id:[0-9]+}", notes = "Fetch a tag by id.", response = Tag.class, tags={ "Tags",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The tag corresponding to tag_id.", response = Tag.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getTagById(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("tag_id") @ApiParam("ID of the tag.") Long tagId) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{tag_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/tags/{tag_id:[0-9]+}", notes = "Add or delete specific members from a tag, or modify the name of a tag.", response = Tag.class, tags={ "Tags",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The updated tag data.", response = Tag.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response modifyTagById(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("tag_id") @ApiParam("ID of the tag.") Long tagId,@Valid TagModify tagModifyParams) {
        return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{tag_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/tags/{tag_id:[0-9]+}", notes = "Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.", response = Tag.class, tags={ "Tags" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The updated tag data.", response = Tag.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response updateTagById(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("tag_id") @ApiParam("ID of the tag.") Long tagId,@Valid TagUpdate updateTagParams) {
        return Response.ok().entity("magic!").build();
    }
}
