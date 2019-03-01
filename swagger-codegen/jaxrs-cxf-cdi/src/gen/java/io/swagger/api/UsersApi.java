package io.swagger.api;

import io.swagger.model.User;
import io.swagger.api.UsersApiService;

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
@Path("/users")
@RequestScoped

@Api(description = "the users API")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-03-01T04:20:11.959Z")

public class UsersApi  {

  @Context SecurityContext securityContext;

  @Inject UsersApiService delegate;


    @DELETE
    @Path("/{userId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/users/{userId:[0-9]+}", notes = "Remove a user from the organization.", response = Void.class, tags={ "Users",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The user was successfully removed.", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response deleteUserById( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the user.",required=true) @PathParam("userId") Long userId) {
        return delegate.deleteUserById(accessToken, userId, securityContext);
    }

    @GET
    @Path("/{userId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/users/{userId:[0-9]+}", notes = "Get a user.", response = User.class, tags={ "Users",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User record.", response = User.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getUserById( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the user.",required=true) @PathParam("userId") Long userId) {
        return delegate.getUserById(accessToken, userId, securityContext);
    }

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/users", notes = "List all users in the organization.", response = User.class, responseContainer = "List", tags={ "Users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of users.", response = User.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response listUsers( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken) {
        return delegate.listUsers(accessToken, securityContext);
    }
}
