package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.SensorsApiService;
import org.openapitools.api.factories.SensorsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

@Path("/sensors")


@io.swagger.annotations.Api(description = "the sensors API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T05:35:19.593Z[GMT]")
public class SensorsApi  {
   private final SensorsApiService delegate;

   public SensorsApi(@Context ServletConfig servletContext) {
      SensorsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("SensorsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (SensorsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = SensorsApiServiceFactory.getSensorsApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/sensors/list", notes = "Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.", response = InlineResponse2008.class, tags={ "Sensors", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of sensor objects.", response = InlineResponse2008.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getSensors(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject23 groupParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getSensors(accessToken,groupParam,securityContext);
    }
    @POST
    @Path("/cargo")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/sensors/cargo", notes = "Get cargo monitor status (empty / full) for requested sensors.", response = CargoResponse.class, tags={ "Sensors", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of sensor objects containing the current cargo status reported by each sensor.", response = CargoResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getSensorsCargo(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject19 sensorParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getSensorsCargo(accessToken,sensorParam,securityContext);
    }
    @POST
    @Path("/door")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/sensors/door", notes = "Get door monitor status (closed / open) for requested sensors.", response = DoorResponse.class, tags={ "Sensors", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of sensor objects containing the current door status reported by each sensor.", response = DoorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getSensorsDoor(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject20 sensorParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getSensorsDoor(accessToken,sensorParam,securityContext);
    }
    @POST
    @Path("/history")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/sensors/history", notes = "Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.", response = SensorHistoryResponse.class, tags={ "Sensors", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of results objects, each containing a time and a datapoint for each requested sensor/field pair.", response = SensorHistoryResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getSensorsHistory(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject21 historyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getSensorsHistory(accessToken,historyParam,securityContext);
    }
    @POST
    @Path("/humidity")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/sensors/humidity", notes = "Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.", response = HumidityResponse.class, tags={ "Sensors", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of sensor objects containing the current humidity reported by each sensor.", response = HumidityResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getSensorsHumidity(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject22 sensorParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getSensorsHumidity(accessToken,sensorParam,securityContext);
    }
    @POST
    @Path("/temperature")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "/sensors/temperature", notes = "Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.", response = TemperatureResponse.class, tags={ "Sensors", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of sensor objects containing the current temperature reported by each sensor.", response = TemperatureResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    public Response getSensorsTemperature(@ApiParam(value = "Samsara API access token.",required=true) @QueryParam("access_token") String accessToken
,@ApiParam(value = "" ,required=true) @NotNull @Valid InlineObject24 sensorParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getSensorsTemperature(accessToken,sensorParam,securityContext);
    }
}
