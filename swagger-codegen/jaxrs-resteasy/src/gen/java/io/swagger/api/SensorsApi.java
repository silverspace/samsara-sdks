package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.SensorsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.CargoResponse;
import io.swagger.model.DoorResponse;
import io.swagger.model.GroupParam;
import io.swagger.model.HistoryParam1;
import io.swagger.model.HumidityResponse;
import io.swagger.model.InlineResponse2008;
import io.swagger.model.SensorHistoryResponse;
import io.swagger.model.SensorParam;
import io.swagger.model.TemperatureResponse;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;

@Path("/sensors")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the sensors API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public class SensorsApi  {

    @Inject SensorsApiService service;

    @POST
    @Path("/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/sensors/list", notes = "Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.", response = InlineResponse2008.class, tags={ "Sensors", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of sensor objects.", response = InlineResponse2008.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getSensors( @NotNull  @QueryParam("access_token") String accessToken,@ApiParam(value = "Group ID to query." ,required=true) GroupParam groupParam,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getSensors(accessToken,groupParam,securityContext);
    }
    @POST
    @Path("/cargo")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/sensors/cargo", notes = "Get cargo monitor status (empty / full) for requested sensors.", response = CargoResponse.class, tags={ "Sensors", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of sensor objects containing the current cargo status reported by each sensor.", response = CargoResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getSensorsCargo( @NotNull  @QueryParam("access_token") String accessToken,@ApiParam(value = "Group ID and list of sensor IDs to query." ,required=true) SensorParam sensorParam,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getSensorsCargo(accessToken,sensorParam,securityContext);
    }
    @POST
    @Path("/door")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/sensors/door", notes = "Get door monitor status (closed / open) for requested sensors.", response = DoorResponse.class, tags={ "Sensors", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of sensor objects containing the current door status reported by each sensor.", response = DoorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getSensorsDoor( @NotNull  @QueryParam("access_token") String accessToken,@ApiParam(value = "Group ID and list of sensor IDs to query." ,required=true) SensorParam sensorParam,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getSensorsDoor(accessToken,sensorParam,securityContext);
    }
    @POST
    @Path("/history")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/sensors/history", notes = "Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.", response = SensorHistoryResponse.class, tags={ "Sensors", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of results objects, each containing a time and a datapoint for each requested sensor/field pair.", response = SensorHistoryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getSensorsHistory( @NotNull  @QueryParam("access_token") String accessToken,@ApiParam(value = "Group ID, time range and resolution, and list of sensor ID, field pairs to query." ,required=true) HistoryParam1 historyParam,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getSensorsHistory(accessToken,historyParam,securityContext);
    }
    @POST
    @Path("/humidity")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/sensors/humidity", notes = "Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.", response = HumidityResponse.class, tags={ "Sensors", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of sensor objects containing the current humidity reported by each sensor.", response = HumidityResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getSensorsHumidity( @NotNull  @QueryParam("access_token") String accessToken,@ApiParam(value = "Group ID and list of sensor IDs to query." ,required=true) SensorParam sensorParam,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getSensorsHumidity(accessToken,sensorParam,securityContext);
    }
    @POST
    @Path("/temperature")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/sensors/temperature", notes = "Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.", response = TemperatureResponse.class, tags={ "Sensors", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of sensor objects containing the current temperature reported by each sensor.", response = TemperatureResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getSensorsTemperature( @NotNull  @QueryParam("access_token") String accessToken,@ApiParam(value = "Group ID and list of sensor IDs to query." ,required=true) SensorParam sensorParam,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getSensorsTemperature(accessToken,sensorParam,securityContext);
    }
}
