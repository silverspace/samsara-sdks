package org.openapitools.api

import org.openapitools.model.Address
import org.openapitools.model.AllRouteJobUpdates
import org.openapitools.model.AssetReeferResponse
import org.openapitools.model.Contact
import org.openapitools.model.DispatchRoute
import org.openapitools.model.DispatchRouteCreate
import org.openapitools.model.DispatchRouteHistory
import org.openapitools.model.Document
import org.openapitools.model.DocumentCreate
import org.openapitools.model.DocumentType
import org.openapitools.model.Driver
import org.openapitools.model.DriverDailyLogResponse
import org.openapitools.model.DriverForCreate
import org.openapitools.model.DriverSafetyScoreResponse
import org.openapitools.model.DriversResponse
import org.openapitools.model.DriversSummaryResponse
import org.openapitools.model.DvirBase
import org.openapitools.model.DvirListResponse
import org.openapitools.model.FleetVehicleLocation
import org.openapitools.model.FleetVehicleResponse
import org.openapitools.model.HosAuthenticationLogsResponse
import org.openapitools.model.HosLogsResponse
import org.openapitools.model.HosLogsSummaryResponse
import org.openapitools.model.InlineObject
import org.openapitools.model.InlineObject1
import org.openapitools.model.InlineObject10
import org.openapitools.model.InlineObject11
import org.openapitools.model.InlineObject12
import org.openapitools.model.InlineObject13
import org.openapitools.model.InlineObject14
import org.openapitools.model.InlineObject15
import org.openapitools.model.InlineObject16
import org.openapitools.model.InlineObject2
import org.openapitools.model.InlineObject3
import org.openapitools.model.InlineObject4
import org.openapitools.model.InlineObject5
import org.openapitools.model.InlineObject6
import org.openapitools.model.InlineObject7
import org.openapitools.model.InlineObject8
import org.openapitools.model.InlineObject9
import org.openapitools.model.InlineResponse200
import org.openapitools.model.InlineResponse2001
import org.openapitools.model.InlineResponse2002
import org.openapitools.model.InlineResponse2003
import org.openapitools.model.InlineResponse2004
import org.openapitools.model.InlineResponse2005
import org.openapitools.model.TripResponse
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
class FleetApiController() {


    @RequestMapping(
            value = ["/fleet/add_address"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun addFleetAddress(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody addressParam: InlineObject2): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/addresses"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun addOrganizationAddresses(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody addresses: InlineObject): ResponseEntity<List<Address>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/dispatch/routes"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun createDispatchRoute(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody createDispatchRouteParams: DispatchRouteCreate): ResponseEntity<DispatchRoute> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/drivers/create"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun createDriver(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody createDriverParam: DriverForCreate): ResponseEntity<Driver> {
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
            value = ["/fleet/drivers/{driver_id}/documents"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun createDriverDocument(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("driver_id") driverId: Long, @Valid @RequestBody createDocumentParams: DocumentCreate): ResponseEntity<Document> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/maintenance/dvirs"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun createDvir(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody createDvirParam: InlineObject12): ResponseEntity<DvirBase> {
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
            value = ["/fleet/drivers/{driver_id_or_external_id}"],
            produces = ["application/json"], 
            method = [RequestMethod.DELETE])
    fun deactivateDriver(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("driver_id_or_external_id") driverIdOrExternalId: String): ResponseEntity<Unit> {
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
            value = ["/addresses/{addressId}"],
            produces = ["application/json"], 
            method = [RequestMethod.DELETE])
    fun deleteOrganizationAddress(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("addressId") addressId: Long): ResponseEntity<Unit> {
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
            value = ["/fleet/assets/locations"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getAllAssetCurrentLocations(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @RequestParam(value = "group_id", required = false, defaultValue="null") groupId: Long): ResponseEntity<InlineResponse2001> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/assets"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getAllAssets(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @RequestParam(value = "group_id", required = false, defaultValue="null") groupId: Long): ResponseEntity<InlineResponse200> {
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
            value = ["/fleet/assets/{asset_id}/locations"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getAssetLocation(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("asset_id") assetId: Long,@NotNull  @RequestParam(value = "startMs", required = true, defaultValue="null") startMs: Long,@NotNull  @RequestParam(value = "endMs", required = true, defaultValue="null") endMs: Long): ResponseEntity<List<Any>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/assets/{asset_id}/reefer"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getAssetReefer(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("asset_id") assetId: Long,@NotNull  @RequestParam(value = "startMs", required = true, defaultValue="null") startMs: Long,@NotNull  @RequestParam(value = "endMs", required = true, defaultValue="null") endMs: Long): ResponseEntity<AssetReeferResponse> {
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
            value = ["/fleet/drivers/{driver_id_or_external_id}"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getDriverById(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("driver_id_or_external_id") driverIdOrExternalId: String): ResponseEntity<Driver> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/drivers/document_types"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getDriverDocumentTypesByOrgId(): ResponseEntity<List<DocumentType>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/drivers/documents"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getDriverDocumentsByOrgId(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @RequestParam(value = "endMs", required = false, defaultValue="null") endMs: Long, @RequestParam(value = "durationMs", required = false, defaultValue="null") durationMs: Long): ResponseEntity<List<Document>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/drivers/{driverId}/safety/score"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getDriverSafetyScore( @PathVariable("driverId") driverId: Long,@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String,@NotNull  @RequestParam(value = "startMs", required = true, defaultValue="null") startMs: Long,@NotNull  @RequestParam(value = "endMs", required = true, defaultValue="null") endMs: Long): ResponseEntity<DriverSafetyScoreResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/maintenance/dvirs"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getDvirs(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String,@NotNull  @RequestParam(value = "end_ms", required = true, defaultValue="null") endMs: Int,@NotNull  @RequestParam(value = "duration_ms", required = true, defaultValue="null") durationMs: Int, @RequestParam(value = "group_id", required = false, defaultValue="null") groupId: Int): ResponseEntity<DvirListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/drivers"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun getFleetDrivers(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody groupDriversParam: InlineObject3): ResponseEntity<DriversResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/drivers/{driver_id}/hos_daily_logs"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun getFleetDriversHosDailyLogs(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("driver_id") driverId: Long, @Valid @RequestBody hosLogsParam: InlineObject6): ResponseEntity<DriverDailyLogResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/drivers/summary"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun getFleetDriversSummary(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody driversSummaryParam: InlineObject5, @RequestParam(value = "snap_to_day_bounds", required = false, defaultValue="null") snapToDayBounds: Boolean): ResponseEntity<DriversSummaryResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/hos_authentication_logs"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun getFleetHosAuthenticationLogs(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody hosAuthenticationLogsParam: InlineObject7): ResponseEntity<HosAuthenticationLogsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/hos_logs"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun getFleetHosLogs(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody hosLogsParam: InlineObject8): ResponseEntity<HosLogsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/hos_logs_summary"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun getFleetHosLogsSummary(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody hosLogsParam: InlineObject9): ResponseEntity<HosLogsSummaryResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/locations"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun getFleetLocations(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody groupParam: InlineObject11): ResponseEntity<InlineResponse2003> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/maintenance/list"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun getFleetMaintenanceList(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody groupParam: InlineObject13): ResponseEntity<InlineResponse2004> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/trips"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun getFleetTrips(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody tripsParam: InlineObject15): ResponseEntity<TripResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/vehicles/{vehicle_id_or_external_id}"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getFleetVehicle(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("vehicle_id_or_external_id") vehicleIdOrExternalId: String): ResponseEntity<FleetVehicleResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/addresses/{addressId}"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getOrganizationAddress(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("addressId") addressId: Long): ResponseEntity<Address> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/addresses"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getOrganizationAddresses(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String): ResponseEntity<List<Address>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/contacts/{contact_id}"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getOrganizationContact(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("contact_id") contactId: Long): ResponseEntity<Contact> {
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
            value = ["/fleet/vehicles/{vehicle_id}/locations"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getVehicleLocations(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("vehicle_id") vehicleId: Long,@NotNull  @RequestParam(value = "startMs", required = true, defaultValue="null") startMs: Long,@NotNull  @RequestParam(value = "endMs", required = true, defaultValue="null") endMs: Long): ResponseEntity<List<FleetVehicleLocation>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/vehicles/{vehicleId}/safety/score"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getVehicleSafetyScore( @PathVariable("vehicleId") vehicleId: Long,@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String,@NotNull  @RequestParam(value = "startMs", required = true, defaultValue="null") startMs: Long,@NotNull  @RequestParam(value = "endMs", required = true, defaultValue="null") endMs: Long): ResponseEntity<VehicleSafetyScoreResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/vehicles/stats"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getVehicleStats(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String,@NotNull  @RequestParam(value = "startMs", required = true, defaultValue="null") startMs: Int,@NotNull  @RequestParam(value = "endMs", required = true, defaultValue="null") endMs: Int, @RequestParam(value = "series", required = false, defaultValue="null") series: String, @RequestParam(value = "tagIds", required = false, defaultValue="null") tagIds: String, @RequestParam(value = "startingAfter", required = false, defaultValue="null") startingAfter: String, @RequestParam(value = "endingBefore", required = false, defaultValue="null") endingBefore: String, @RequestParam(value = "limit", required = false, defaultValue="null") limit: Long): ResponseEntity<InlineResponse2005> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/vehicles/locations"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getVehiclesLocations(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String,@NotNull  @RequestParam(value = "startMs", required = true, defaultValue="null") startMs: Int,@NotNull  @RequestParam(value = "endMs", required = true, defaultValue="null") endMs: Int): ResponseEntity<List<Any>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/contacts"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun listContacts(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String): ResponseEntity<List<Contact>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/list"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun listFleet(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody groupParam: InlineObject10, @RequestParam(value = "startingAfter", required = false, defaultValue="null") startingAfter: String, @RequestParam(value = "endingBefore", required = false, defaultValue="null") endingBefore: String, @RequestParam(value = "limit", required = false, defaultValue="null") limit: Long): ResponseEntity<InlineResponse2002> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/vehicles/{vehicle_id_or_external_id}"],
            produces = ["application/json"], 
            consumes = ["application/json", "application/merge-patch+json"],
            method = [RequestMethod.PATCH])
    fun patchFleetVehicle(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("vehicle_id_or_external_id") vehicleIdOrExternalId: String, @Valid @RequestBody &#x60;data&#x60;: InlineObject16): ResponseEntity<FleetVehicleResponse> {
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


    @RequestMapping(
            value = ["/fleet/dispatch/routes/{route_id}"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.PUT])
    fun updateDispatchRouteById(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("route_id") routeId: Long, @Valid @RequestBody updateDispatchRouteParams: DispatchRoute): ResponseEntity<DispatchRoute> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/addresses/{addressId}"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.PATCH])
    fun updateOrganizationAddress(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @PathVariable("addressId") addressId: Long, @Valid @RequestBody address: InlineObject1): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/fleet/set_data"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun updateVehicles(@NotNull  @RequestParam(value = "access_token", required = true, defaultValue="null") accessToken: String, @Valid @RequestBody vehicleUpdateParam: InlineObject14): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
