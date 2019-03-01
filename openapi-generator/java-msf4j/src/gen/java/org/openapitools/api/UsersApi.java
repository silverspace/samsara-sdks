package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.UsersApiService;
import org.openapitools.api.factories.UsersApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.User;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/users")


@io.swagger.annotations.Api(description = "the users API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class UsersApi  {
   private final UsersApiService delegate = UsersApiServiceFactory.getUsersApi();

    @DELETE
    @Path("/{userId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/users/{userId:[0-9]+}", notes = "Remove a user from the organization.", response = Void.class, tags={ "Users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The user was successfully removed.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Void.class) })
    public Response deleteUserById(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the user.",required=true) @PathParam("userId") Long userId
)
    throws NotFoundException {
        return delegate.deleteUserById(accessToken,userId);
    }
    @GET
    @Path("/{userId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/users/{userId:[0-9]+}", notes = "Get a user.", response = User.class, tags={ "Users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "User record.", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = User.class) })
    public Response getUserById(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the user.",required=true) @PathParam("userId") Long userId
)
    throws NotFoundException {
        return delegate.getUserById(accessToken,userId);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/users", notes = "List all users in the organization.", response = User.class, responseContainer = "List", tags={ "Users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of users.", response = User.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = User.class, responseContainer = "List") })
    public Response listUsers(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
)
    throws NotFoundException {
        return delegate.listUsers(accessToken);
    }
}
