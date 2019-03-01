package org.openapitools.api

import org.openapitools.model.DriverSafetyScoreResponse
import org.openapitools.model.VehicleHarshEventResponse
import org.openapitools.model.VehicleSafetyScoreResponse
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
class SafetyApiController() {


    @RequestMapping(
            value = ["/fleet/drivers/{driverId}/safety/score"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getDriverSafetyScore( @PathVariable("driverId") driverId: Long,@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String,@NotNull  @RequestParam(value = "startMs", required = true, defaultValue="null") startMs: Long,@NotNull  @RequestParam(value = "endMs", required = true, defaultValue="null") endMs: Long): ResponseEntity<DriverSafetyScoreResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/vehicles/{vehicleId}/safety/harsh_event"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getVehicleHarshEvent( @PathVariable("vehicleId") vehicleId: Long,@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String,@NotNull  @RequestParam(value = "timestamp", required = true, defaultValue="null") timestamp: Long): ResponseEntity<VehicleHarshEventResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/vehicles/{vehicleId}/safety/score"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getVehicleSafetyScore( @PathVariable("vehicleId") vehicleId: Long,@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String,@NotNull  @RequestParam(value = "startMs", required = true, defaultValue="null") startMs: Long,@NotNull  @RequestParam(value = "endMs", required = true, defaultValue="null") endMs: Long): ResponseEntity<VehicleSafetyScoreResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
