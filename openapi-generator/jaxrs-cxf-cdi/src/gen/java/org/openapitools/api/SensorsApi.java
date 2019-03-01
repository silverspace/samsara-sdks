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
import org.openapitools.api.SensorsApiService;

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
@Path("/sensors")
@RequestScoped

@Api(description = "the sensors API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-03-01T05:35:11.852Z[GMT]")

public class SensorsApi  {

  @Context SecurityContext securityContext;

  @Inject SensorsApiService delegate;


    @POST
    @Path("/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/sensors/list", notes = "Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.", response = InlineResponse2008.class, tags={ "Sensors",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects.", response = InlineResponse2008.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getSensors( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "" ,required=true) InlineObject23 groupParam) {
        return delegate.getSensors(accessToken, groupParam, securityContext);
    }

    @POST
    @Path("/cargo")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/sensors/cargo", notes = "Get cargo monitor status (empty / full) for requested sensors.", response = CargoResponse.class, tags={ "Sensors",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects containing the current cargo status reported by each sensor.", response = CargoResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getSensorsCargo( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "" ,required=true) InlineObject19 sensorParam) {
        return delegate.getSensorsCargo(accessToken, sensorParam, securityContext);
    }

    @POST
    @Path("/door")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/sensors/door", notes = "Get door monitor status (closed / open) for requested sensors.", response = DoorResponse.class, tags={ "Sensors",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects containing the current door status reported by each sensor.", response = DoorResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getSensorsDoor( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "" ,required=true) InlineObject20 sensorParam) {
        return delegate.getSensorsDoor(accessToken, sensorParam, securityContext);
    }

    @POST
    @Path("/history")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/sensors/history", notes = "Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.", response = SensorHistoryResponse.class, tags={ "Sensors",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of results objects, each containing a time and a datapoint for each requested sensor/field pair.", response = SensorHistoryResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getSensorsHistory( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "" ,required=true) InlineObject21 historyParam) {
        return delegate.getSensorsHistory(accessToken, historyParam, securityContext);
    }

    @POST
    @Path("/humidity")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/sensors/humidity", notes = "Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.", response = HumidityResponse.class, tags={ "Sensors",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects containing the current humidity reported by each sensor.", response = HumidityResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getSensorsHumidity( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "" ,required=true) InlineObject22 sensorParam) {
        return delegate.getSensorsHumidity(accessToken, sensorParam, securityContext);
    }

    @POST
    @Path("/temperature")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "/sensors/temperature", notes = "Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.", response = TemperatureResponse.class, tags={ "Sensors" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects containing the current temperature reported by each sensor.", response = TemperatureResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getSensorsTemperature( @NotNull @ApiParam(value = "Samsara API access token.",required=true)  @QueryParam("access_token") String accessToken, @ApiParam(value = "" ,required=true) InlineObject24 sensorParam) {
        return delegate.getSensorsTemperature(accessToken, sensorParam, securityContext);
    }
}
