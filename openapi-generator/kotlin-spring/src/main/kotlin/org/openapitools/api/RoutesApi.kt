package org.openapitools.api

import org.openapitools.model.AllRouteJobUpdates
import org.openapitools.model.DispatchRoute
import org.openapitools.model.DispatchRouteCreate
import org.openapitools.model.DispatchRouteHistory
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
class RoutesApiController() {


    @RequestMapping(
            value = ["/fleet/dispatch/routes"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun createDispatchRoute(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody createDispatchRouteParams: DispatchRouteCreate): ResponseEntity<DispatchRoute> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/drivers/{driver_id}/dispatch/routes"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun createDriverDispatchRoute(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("driver_id") driverId: Long, @Valid @RequestBody createDispatchRouteParams: DispatchRouteCreate): ResponseEntity<DispatchRoute> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/vehicles/{vehicle_id}/dispatch/routes"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun createVehicleDispatchRoute(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("vehicle_id") vehicleId: Long, @Valid @RequestBody createDispatchRouteParams: DispatchRouteCreate): ResponseEntity<DispatchRoute> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/dispatch/routes/{route_id}"],
            produces = ["application/json"], 
            method = [RequestMethod.DELETE])
    fun deleteDispatchRouteById(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("route_id") routeId: Long): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/dispatch/routes"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun fetchAllDispatchRoutes(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @RequestParam(value = "group_id", required = false, defaultValue="null") groupId: Long, @RequestParam(value = "end_time", required = false, defaultValue="null") endTime: Long, @RequestParam(value = "duration", required = false, defaultValue="null") duration: Long): ResponseEntity<List<DispatchRoute>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/dispatch/routes/job_updates"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun fetchAllRouteJobUpdates(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @RequestParam(value = "group_id", required = false, defaultValue="null") groupId: Long, @RequestParam(value = "sequence_id", required = false, defaultValue="null") sequenceId: String, @RequestParam(value = "include", required = false, defaultValue="null") include: String): ResponseEntity<AllRouteJobUpdates> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/dispatch/routes/{route_id}"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getDispatchRouteById(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("route_id") routeId: Long): ResponseEntity<DispatchRoute> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/dispatch/routes/{route_id}/history"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getDispatchRouteHistory(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("route_id") routeId: Long, @RequestParam(value = "start_time", required = false, defaultValue="null") startTime: Long, @RequestParam(value = "end_time", required = false, defaultValue="null") endTime: Long): ResponseEntity<DispatchRouteHistory> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/drivers/{driver_id}/dispatch/routes"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getDispatchRoutesByDriverId(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("driver_id") driverId: Long, @RequestParam(value = "end_time", required = false, defaultValue="null") endTime: Long, @RequestParam(value = "duration", required = false, defaultValue="null") duration: Long): ResponseEntity<List<DispatchRoute>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/vehicles/{vehicle_id}/dispatch/routes"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getDispatchRoutesByVehicleId(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("vehicle_id") vehicleId: Long, @RequestParam(value = "end_time", required = false, defaultValue="null") endTime: Long, @RequestParam(value = "duration", required = false, defaultValue="null") duration: Long): ResponseEntity<List<DispatchRoute>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/dispatch/routes/{route_id}"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.PUT])
    fun updateDispatchRouteById(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("route_id") routeId: Long, @Valid @RequestBody updateDispatchRouteParams: DispatchRoute): ResponseEntity<DispatchRoute> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
