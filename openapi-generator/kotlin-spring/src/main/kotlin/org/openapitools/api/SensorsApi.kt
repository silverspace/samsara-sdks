package org.openapitools.api

import org.openapitools.model.CargoResponse
import org.openapitools.model.DoorResponse
import org.openapitools.model.HumidityResponse
import org.openapitools.model.InlineObject19
import org.openapitools.model.InlineObject20
import org.openapitools.model.InlineObject21
import org.openapitools.model.InlineObject22
import org.openapitools.model.InlineObject23
import org.openapitools.model.InlineObject24
import org.openapitools.model.InlineResponse2008
import org.openapitools.model.SensorHistoryResponse
import org.openapitools.model.TemperatureResponse
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestPart
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.web.multipart.MultipartFile
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.*

import kotlin.collections.List
import kotlin.collections.Map

@Controller
@Validated
@RequestMapping("\${api.base-path:/v1}")
class SensorsApiController() {


    @RequestMapping(
            value = ["/sensors/list"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun getSensors(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody groupParam: InlineObject23): ResponseEntity<InlineResponse2008> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/sensors/cargo"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun getSensorsCargo(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody sensorParam: InlineObject19): ResponseEntity<CargoResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/sensors/door"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun getSensorsDoor(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody sensorParam: InlineObject20): ResponseEntity<DoorResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/sensors/history"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun getSensorsHistory(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody historyParam: InlineObject21): ResponseEntity<SensorHistoryResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/sensors/humidity"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun getSensorsHumidity(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody sensorParam: InlineObject22): ResponseEntity<HumidityResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/sensors/temperature"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun getSensorsTemperature(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody sensorParam: InlineObject24): ResponseEntity<TemperatureResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
