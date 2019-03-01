package io.swagger.api;

import io.swagger.model.CargoResponse;
import io.swagger.model.DoorResponse;
import io.swagger.model.GroupParam;
import io.swagger.model.HistoryParam1;
import io.swagger.model.HumidityResponse;
import io.swagger.model.InlineResponse2008;
import io.swagger.model.SensorHistoryResponse;
import io.swagger.model.SensorParam;
import io.swagger.model.TemperatureResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/sensors")
@Api(description = "the sensors API")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2019-03-01T04:20:18.722Z")
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
    public Response getSensors(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid GroupParam groupParam) {
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
    public Response getSensorsCargo(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid SensorParam sensorParam) {
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
    public Response getSensorsDoor(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid SensorParam sensorParam) {
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
    public Response getSensorsHistory(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid HistoryParam1 historyParam) {
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
    public Response getSensorsHumidity(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid SensorParam sensorParam) {
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
    public Response getSensorsTemperature(@QueryParam("access_token") @NotNull   @ApiParam("Samsara API access token.")  String accessToken,@Valid SensorParam sensorParam) {
        return Response.ok().entity("magic!").build();
    }
}
