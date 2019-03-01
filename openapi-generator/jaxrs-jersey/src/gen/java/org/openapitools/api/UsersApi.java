package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.UsersApiService;
import org.openapitools.api.factories.UsersApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.User;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/users")


@io.swagger.annotations.Api(description = "the users API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T05:35:19.593Z[GMT]")
public class UsersApi  {
   private final UsersApiService delegate;

   public UsersApi(@Context ServletConfig servletContext) {
      UsersApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("UsersApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (UsersApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = UsersApiServiceFactory.getUsersApi();
      }

      this.delegate = delegate;
   }

    @DELETE
    @Path("/{userId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/users/{userId:[0-9]+}", notes = "Remove a user from the organization.", response = Void.class, tags={ "Users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The user was successfully removed.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response deleteUserById(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the user.",required=true) @PathParam("userId") Long userId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteUserById(accessToken,userId,securityContext);
    }
    @GET
    @Path("/{userId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/users/{userId:[0-9]+}", notes = "Get a user.", response = User.class, tags={ "Users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "User record.", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getUserById(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the user.",required=true) @PathParam("userId") Long userId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUserById(accessToken,userId,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/users", notes = "List all users in the organization.", response = User.class, responseContainer = "List", tags={ "Users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of users.", response = User.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response listUsers(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listUsers(accessToken,securityContext);
    }
}
