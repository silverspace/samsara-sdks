/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
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
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

@Validated
@Api(value = "sensors", description = "the sensors API")
public interface SensorsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "/sensors/list", nickname = "getSensors", notes = "Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.", response = InlineResponse2008.class, tags={ "Sensors", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects.", response = InlineResponse2008.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/sensors/list",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<InlineResponse2008> getSensors(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )  @Valid @RequestBody InlineObject23 groupParam) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"sensors\" : [ {    \"macAddress\" : \"11:11:11:11:11:11\",    \"name\" : \"Freezer ABC\",    \"id\" : 123  }, {    \"macAddress\" : \"11:11:11:11:11:11\",    \"name\" : \"Freezer ABC\",    \"id\" : 123  } ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "/sensors/cargo", nickname = "getSensorsCargo", notes = "Get cargo monitor status (empty / full) for requested sensors.", response = CargoResponse.class, tags={ "Sensors", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects containing the current cargo status reported by each sensor.", response = CargoResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/sensors/cargo",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<CargoResponse> getSensorsCargo(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )  @Valid @RequestBody InlineObject19 sensorParam) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"sensors\" : [ {    \"cargoEmpty\" : true,    \"name\" : \"Trailer Cargo Sensor\",    \"id\" : 122  }, {    \"cargoEmpty\" : true,    \"name\" : \"Trailer Cargo Sensor\",    \"id\" : 122  } ],  \"groupId\" : 101}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "/sensors/door", nickname = "getSensorsDoor", notes = "Get door monitor status (closed / open) for requested sensors.", response = DoorResponse.class, tags={ "Sensors", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects containing the current door status reported by each sensor.", response = DoorResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/sensors/door",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<DoorResponse> getSensorsDoor(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )  @Valid @RequestBody InlineObject20 sensorParam) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"sensors\" : [ {    \"doorClosed\" : true,    \"name\" : \"Trailer Door Sensor\",    \"id\" : 122  }, {    \"doorClosed\" : true,    \"name\" : \"Trailer Door Sensor\",    \"id\" : 122  } ],  \"groupId\" : 101}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "/sensors/history", nickname = "getSensorsHistory", notes = "Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.", response = SensorHistoryResponse.class, tags={ "Sensors", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of results objects, each containing a time and a datapoint for each requested sensor/field pair.", response = SensorHistoryResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/sensors/history",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<SensorHistoryResponse> getSensorsHistory(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )  @Valid @RequestBody InlineObject21 historyParam) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"results\" : [ {    \"series\" : [ 1, 1 ],    \"timeMs\" : 1453449599999  }, {    \"series\" : [ 1, 1 ],    \"timeMs\" : 1453449599999  } ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "/sensors/humidity", nickname = "getSensorsHumidity", notes = "Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.", response = HumidityResponse.class, tags={ "Sensors", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects containing the current humidity reported by each sensor.", response = HumidityResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/sensors/humidity",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<HumidityResponse> getSensorsHumidity(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )  @Valid @RequestBody InlineObject22 sensorParam) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"sensors\" : [ {    \"name\" : \"Freezer Humidity Sensor\",    \"humidity\" : 53,    \"id\" : 122  }, {    \"name\" : \"Freezer Humidity Sensor\",    \"humidity\" : 53,    \"id\" : 122  } ],  \"groupId\" : 101}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "/sensors/temperature", nickname = "getSensorsTemperature", notes = "Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.", response = TemperatureResponse.class, tags={ "Sensors", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sensor objects containing the current temperature reported by each sensor.", response = TemperatureResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = String.class) })
    @RequestMapping(value = "/sensors/temperature",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<TemperatureResponse> getSensorsTemperature(@NotNull @ApiParam(value = "Samsara API access token.", required = true) @Valid @RequestParam(value = "access_token", required = true) String accessToken,@ApiParam(value = "" ,required=true )  @Valid @RequestBody InlineObject24 sensorParam) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"sensors\" : [ {    \"probeTemperature\" : -20145,    \"name\" : \"Freezer Temp Sensor\",    \"id\" : 122,    \"ambientTemperature\" : 11057  }, {    \"probeTemperature\" : -20145,    \"name\" : \"Freezer Temp Sensor\",    \"id\" : 122,    \"ambientTemperature\" : 11057  } ],  \"groupId\" : 101}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
