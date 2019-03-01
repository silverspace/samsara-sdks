package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UserRolesApiService;
import io.swagger.api.factories.UserRolesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.UserRole;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/user_roles")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the user_roles API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T04:29:05.032Z")
public class UserRolesApi  {
   private final UserRolesApiService delegate;

   public UserRolesApi(@Context ServletConfig servletContext) {
      UserRolesApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("UserRolesApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (UserRolesApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = UserRolesApiServiceFactory.getUserRolesApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/user_roles", notes = "Get all roles in the organization.", response = UserRole.class, responseContainer = "List", tags={ "Users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of user roles.", response = UserRole.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response listUserRoles(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listUserRoles(accessToken,securityContext);
    }
}
