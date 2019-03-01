package io.swagger.api;

import io.swagger.model.DataInputHistoryResponse;
import io.swagger.model.InlineResponse2006;
import io.swagger.api.IndustrialApiService;

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
@Path("/industrial")
@RequestScoped

@Api(description = "the industrial API")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-03-01T04:20:11.959Z")

public class IndustrialApi  {

  @Context SecurityContext securityContext;

  @Inject IndustrialApiService delegate;


    @GET
    @Path("/data")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/industrial/data", notes = "Fetch all of the data inputs for a group.", response = InlineResponse2006.class, tags={ "Industrial",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of data inputs.", response = InlineResponse2006.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getAllDataInputs( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken,  @ApiParam(value = "Optional group ID if the organization has multiple groups (uncommon).")  @QueryParam("group_id") Long groupId,  @ApiParam(value = "Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.")  @QueryParam("startMs") Long startMs,  @ApiParam(value = "Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.")  @QueryParam("endMs") Long endMs) {
        return delegate.getAllDataInputs(accessToken, groupId, startMs, endMs, securityContext);
    }

    @GET
    @Path("/data/{data_input_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/industrial/data/{data_input_id:[0-9]+}", notes = "Fetch datapoints from a given data input.", response = DataInputHistoryResponse.class, tags={ "Industrial" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns datapoints for the given data input", response = DataInputHistoryResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getDataInput( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "ID of the data input",required=true) @PathParam("data_input_id") Long dataInputId,  @ApiParam(value = "Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.")  @QueryParam("startMs") Long startMs,  @ApiParam(value = "Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.")  @QueryParam("endMs") Long endMs) {
        return delegate.getDataInput(accessToken, dataInputId, startMs, endMs, securityContext);
    }
}
