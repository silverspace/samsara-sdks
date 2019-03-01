package org.openapitools.api

import org.openapitools.model.Driver
import org.openapitools.model.DriverForCreate
import org.openapitools.model.InlineObject4
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
class DriversApiController() {


    @RequestMapping(
            value = ["/fleet/drivers/create"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun createDriver(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody createDriverParam: DriverForCreate): ResponseEntity<Driver> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/drivers/{driver_id_or_external_id}"],
            produces = ["application/json"], 
            method = [RequestMethod.DELETE])
    fun deactivateDriver(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("driver_id_or_external_id") driverIdOrExternalId: String): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/drivers/inactive"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getAllDeactivatedDrivers(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @RequestParam(value = "group_id", required = false, defaultValue="null") groupId: Long): ResponseEntity<List<Driver>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/drivers/inactive/{driver_id_or_external_id}"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getDeactivatedDriverById(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("driver_id_or_external_id") driverIdOrExternalId: String): ResponseEntity<Driver> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/drivers/{driver_id_or_external_id}"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getDriverById(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("driver_id_or_external_id") driverIdOrExternalId: String): ResponseEntity<Driver> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/drivers/inactive/{driver_id_or_external_id}"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.PUT])
    fun reactivateDriverById(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("driver_id_or_external_id") driverIdOrExternalId: String, @Valid @RequestBody reactivateDriverParam: InlineObject4): ResponseEntity<Driver> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
