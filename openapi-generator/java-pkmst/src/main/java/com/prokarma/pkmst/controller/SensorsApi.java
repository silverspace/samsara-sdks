/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CargoResponse;
import com.prokarma.pkmst.model.DoorResponse;
import com.prokarma.pkmst.model.HumidityResponse;
import com.prokarma.pkmst.model.InlineObject19;
import com.prokarma.pkmst.model.InlineObject20;
import com.prokarma.pkmst.model.InlineObject21;
import com.prokarma.pkmst.model.InlineObject22;
import com.prokarma.pkmst.model.InlineObject23;
import com.prokarma.pkmst.model.InlineObject24;
import com.prokarma.pkmst.model.InlineResponse2008;
import com.prokarma.pkmst.model.SensorHistoryResponse;
import com.prokarma.pkmst.model.TemperatureResponse;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import java.util.List;
/**
 * Provides the info about api methods
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

@Api(value = "Sensors", description = "the Sensors API")
public interface SensorsApi {

    @ApiOperation(value = "/sensors/list", notes = "Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.", response = InlineResponse2008.class, tags={ "Sensors", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects.", response = InlineResponse2008.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/sensors/list",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2008> getSensors(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )   @RequestBody InlineObject23 groupParam, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "/sensors/cargo", notes = "Get cargo monitor status (empty / full) for requested sensors.", response = CargoResponse.class, tags={ "Sensors", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects containing the current cargo status reported by each sensor.", response = CargoResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/sensors/cargo",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<CargoResponse> getSensorsCargo(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )   @RequestBody InlineObject19 sensorParam, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "/sensors/door", notes = "Get door monitor status (closed / open) for requested sensors.", response = DoorResponse.class, tags={ "Sensors", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects containing the current door status reported by each sensor.", response = DoorResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/sensors/door",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<DoorResponse> getSensorsDoor(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )   @RequestBody InlineObject20 sensorParam, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "/sensors/history", notes = "Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.", response = SensorHistoryResponse.class, tags={ "Sensors", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of results objects, each containing a time and a datapoint for each requested sensor/field pair.", response = SensorHistoryResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/sensors/history",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<SensorHistoryResponse> getSensorsHistory(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )   @RequestBody InlineObject21 historyParam, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "/sensors/humidity", notes = "Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.", response = HumidityResponse.class, tags={ "Sensors", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects containing the current humidity reported by each sensor.", response = HumidityResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/sensors/humidity",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<HumidityResponse> getSensorsHumidity(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )   @RequestBody InlineObject22 sensorParam, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "/sensors/temperature", notes = "Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.", response = TemperatureResponse.class, tags={ "Sensors", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects containing the current temperature reported by each sensor.", response = TemperatureResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/sensors/temperature",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<TemperatureResponse> getSensorsTemperature(@ApiParam(value = "Samsara API access token.", required = true)  @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )   @RequestBody InlineObject24 sensorParam, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}