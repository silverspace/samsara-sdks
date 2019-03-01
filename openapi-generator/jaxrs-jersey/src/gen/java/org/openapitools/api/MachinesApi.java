package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.MachinesApiService;
import org.openapitools.api.factories.MachinesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.InlineObject17;
import org.openapitools.model.InlineObject18;
import org.openapitools.model.InlineResponse2007;
import org.openapitools.model.MachineHistoryResponse;

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

@Path("/machines")


@io.swagger.annotations.Api(description = "the machines API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T05:35:19.593Z[GMT]")
public class MachinesApi  {
   private final MachinesApiService delegate;

   public MachinesApi(@Context ServletConfig servletContext) {
      MachinesApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("MachinesApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (MachinesApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = MachinesApiServiceFactory.getMachinesApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/machines/list", notes = "Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.", response = InlineResponse2007.class, tags={ "Industrial", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of machine objects.", response = InlineResponse2007.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getMachines(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject18 groupParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getMachines(accessToken,groupParam,securityContext);
    }
    @POST
    @Path("/history")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/machines/history", notes = "Get historical data for machine objects. This method returns a set of historical data for all machines in a group", response = MachineHistoryResponse.class, tags={ "Industrial", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of machine results objects, each containing a time and a datapoint.", response = MachineHistoryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getMachinesHistory(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject17 historyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getMachinesHistory(accessToken,historyParam,securityContext);
    }
}
