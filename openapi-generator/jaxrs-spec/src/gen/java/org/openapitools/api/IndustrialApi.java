package org.openapitools.api;

import org.openapitools.model.DataInputHistoryResponse;
import org.openapitools.model.InlineResponse2006;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/industrial")
@Api(description = "the industrial API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2019-03-01T05:35:42.406Z[GMT]")
public class IndustrialApi {

    @GET
    @Path("/data")
    @Produces({ "application/json" })
    @ApiOperation(value = "/industrial/data", notes = "Fetch all of the data inputs for a group.", response = InlineResponse2006.class, tags={ "Industrial",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of data inputs.", response = InlineResponse2006.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getAllDataInputs(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@QueryParam("group_id")   @ApiParam("Optional group ID if the organization has multiple groups (uncommon).")  Long groupId,@QueryParam("startMs")   @ApiParam("Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.")  Long startMs,@QueryParam("endMs")   @ApiParam("Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.")  Long endMs) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/data/{data_input_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "/industrial/data/{data_input_id:[0-9]+}", notes = "Fetch datapoints from a given data input.", response = DataInputHistoryResponse.class, tags={ "Industrial" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns datapoints for the given data input", response = DataInputHistoryResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getDataInput(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@PathParam("data_input_id") @ApiParam("ID of the data input") Long dataInputId,@QueryParam("startMs")   @ApiParam("Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.")  Long startMs,@QueryParam("endMs")   @ApiParam("Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.")  Long endMs) {
        return Response.ok().entity("magic!").build();
    }
}
