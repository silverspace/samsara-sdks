package io.swagger.api;

import io.swagger.model.UserRole;
import io.swagger.api.UserRolesApiService;

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
@Path("/user_roles")
@RequestScoped

@Api(description = "the user_roles API")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-03-01T04:20:11.959Z")

public class UserRolesApi  {

  @Context SecurityContext securityContext;

  @Inject UserRolesApiService delegate;


    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/user_roles", notes = "Get all roles in the organization.", response = UserRole.class, responseContainer = "List", tags={ "Users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of user roles.", response = UserRole.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response listUserRoles( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken) {
        return delegate.listUserRoles(accessToken, securityContext);
    }
}
