package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.IndustrialApiService;
import io.swagger.api.factories.IndustrialApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.DataInputHistoryResponse;
import io.swagger.model.InlineResponse2006;

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

@Path("/industrial")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the industrial API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T04:29:05.032Z")
public class IndustrialApi  {
   private final IndustrialApiService delegate;

   public IndustrialApi(@Context ServletConfig servletContext) {
      IndustrialApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("IndustrialApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (IndustrialApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = IndustrialApiServiceFactory.getIndustrialApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/data")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/industrial/data", notes = "Fetch all of the data inputs for a group.", response = InlineResponse2006.class, tags={ "Industrial", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of data inputs.", response = InlineResponse2006.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getAllDataInputs(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).") @QueryParam("group_id") Long groupId
,@ApiParam(value = "Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.") @QueryParam("startMs") Long startMs
,@ApiParam(value = "Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.") @QueryParam("endMs") Long endMs
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllDataInputs(accessToken,groupId,startMs,endMs,securityContext);
    }
    @GET
    @Path("/data/{data_input_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/industrial/data/{data_input_id:[0-9]+}", notes = "Fetch datapoints from a given data input.", response = DataInputHistoryResponse.class, tags={ "Industrial", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns datapoints for the given data input", response = DataInputHistoryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDataInput(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of the data input",required=true) @PathParam("data_input_id") Long dataInputId
,@ApiParam(value = "Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.") @QueryParam("startMs") Long startMs
,@ApiParam(value = "Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.") @QueryParam("endMs") Long endMs
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getDataInput(accessToken,dataInputId,startMs,endMs,securityContext);
    }
}
