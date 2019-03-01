package org.openapitools.api;

import org.openapitools.model.CargoResponse;
import org.openapitools.model.DoorResponse;
import org.openapitools.model.HumidityResponse;
import org.openapitools.model.InlineObject19;
import org.openapitools.model.InlineObject20;
import org.openapitools.model.InlineObject21;
import org.openapitools.model.InlineObject22;
import org.openapitools.model.InlineObject23;
import org.openapitools.model.InlineObject24;
import org.openapitools.model.InlineResponse2008;
import org.openapitools.model.SensorHistoryResponse;
import org.openapitools.model.TemperatureResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/sensors")
@Api(description = "the sensors API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2019-03-01T05:35:42.406Z[GMT]")
public class SensorsApi {

    @POST
    @Path("/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/sensors/list", notes = "Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.", response = InlineResponse2008.class, tags={ "Sensors",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects.", response = InlineResponse2008.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getSensors(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid InlineObject23 groupParam) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/cargo")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/sensors/cargo", notes = "Get cargo monitor status (empty / full) for requested sensors.", response = CargoResponse.class, tags={ "Sensors",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects containing the current cargo status reported by each sensor.", response = CargoResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getSensorsCargo(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid InlineObject19 sensorParam) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/door")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/sensors/door", notes = "Get door monitor status (closed / open) for requested sensors.", response = DoorResponse.class, tags={ "Sensors",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects containing the current door status reported by each sensor.", response = DoorResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getSensorsDoor(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid InlineObject20 sensorParam) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/history")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/sensors/history", notes = "Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.", response = SensorHistoryResponse.class, tags={ "Sensors",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of results objects, each containing a time and a datapoint for each requested sensor/field pair.", response = SensorHistoryResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getSensorsHistory(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid InlineObject21 historyParam) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/humidity")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/sensors/humidity", notes = "Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.", response = HumidityResponse.class, tags={ "Sensors",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects containing the current humidity reported by each sensor.", response = HumidityResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getSensorsHumidity(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid InlineObject22 sensorParam) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/temperature")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/sensors/temperature", notes = "Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.", response = TemperatureResponse.class, tags={ "Sensors" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects containing the current temperature reported by each sensor.", response = TemperatureResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class)
    })
    public Response getSensorsTemperature(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid InlineObject24 sensorParam) {
        return Response.ok().entity("magic!").build();
    }
}
