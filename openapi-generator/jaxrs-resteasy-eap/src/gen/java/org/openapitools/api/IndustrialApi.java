package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.DataInputHistoryResponse;
import org.openapitools.model.InlineResponse2006;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/industrial")


@io.swagger.annotations.Api(description = "the industrial API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public interface IndustrialApi  {
   
    @GET
    @Path("/data")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/industrial/data", notes = "Fetch all of the data inputs for a group.", response = InlineResponse2006.class, tags={ "Industrial", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of data inputs.", response = InlineResponse2006.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getAllDataInputs( @NotNull @QueryParam("access_token") String accessToken, @QueryParam("group_id") Long groupId, @QueryParam("startMs") Long startMs, @QueryParam("endMs") Long endMs,@Context SecurityContext securityContext);
    @GET
    @Path("/data/{data_input_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/industrial/data/{data_input_id:[0-9]+}", notes = "Fetch datapoints from a given data input.", response = DataInputHistoryResponse.class, tags={ "Industrial", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns datapoints for the given data input", response = DataInputHistoryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDataInput( @NotNull @QueryParam("access_token") String accessToken, @PathParam("data_input_id") Long dataInputId, @QueryParam("startMs") Long startMs, @QueryParam("endMs") Long endMs,@Context SecurityContext securityContext);
}
