package org.openapitools.api;

import org.openapitools.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/users")
@Api(description = "the users API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2019-03-01T05:35:42.406Z[GMT]")
public class UsersApi {

    @DELETE
    @Path("/{userId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "/users/{userId:[0-9]+}", notes = "Remove a user from the organization.", response = Void.class, tags={ "Users",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The user was successfully removed.", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response deleteUserById(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("userId") @ApiParam("ID of the user.") Long userId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{userId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "/users/{userId:[0-9]+}", notes = "Get a user.", response = User.class, tags={ "Users",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User record.", response = User.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getUserById(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("userId") @ApiParam("ID of the user.") Long userId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "/users", notes = "List all users in the organization.", response = User.class, responseContainer = "List", tags={ "Users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of users.", response = User.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response listUsers(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken) {
        return Response.ok().entity("magic!").build();
    }
}
