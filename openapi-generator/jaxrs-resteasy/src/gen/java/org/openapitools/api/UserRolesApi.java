package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.UserRolesApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.UserRole;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/user_roles")


@io.swagger.annotations.Api(description = "the user_roles API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T05:35:27.523Z[GMT]")
public class UserRolesApi  {

    @Inject UserRolesApiService service;

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/user_roles", notes = "Get all roles in the organization.", response = UserRole.class, responseContainer = "List", tags={ "Users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of user roles.", response = UserRole.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response listUserRoles( @NotNull  @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listUserRoles(accessToken,securityContext);
    }
}
