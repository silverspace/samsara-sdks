package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.User;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/users")


@io.swagger.annotations.Api(description = "the users API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public interface UsersApi  {
   
    @DELETE
    @Path("/{userId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/users/{userId:[0-9]+}", notes = "Remove a user from the organization.", response = Void.class, tags={ "Users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The user was successfully removed.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response deleteUserById( @NotNull @QueryParam("access_token") String accessToken, @PathParam("userId") Long userId,@Context SecurityContext securityContext);
    @GET
    @Path("/{userId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/users/{userId:[0-9]+}", notes = "Get a user.", response = User.class, tags={ "Users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "User record.", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getUserById( @NotNull @QueryParam("access_token") String accessToken, @PathParam("userId") Long userId,@Context SecurityContext securityContext);
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/users", notes = "List all users in the organization.", response = User.class, responseContainer = "List", tags={ "Users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of users.", response = User.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response listUsers( @NotNull @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext);
}
