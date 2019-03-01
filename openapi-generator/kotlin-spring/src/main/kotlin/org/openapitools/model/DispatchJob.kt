package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DispatchJobCreate
import org.openapitools.model.JobStatus
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param destinationAddress The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
 * @param destinationAddressId ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
 * @param destinationLat Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
 * @param destinationLng Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
 * @param destinationName The name of the job destination. If provided, it will take precedence over the name of the address book entry.
 * @param notes Notes regarding the details of this job.
 * @param scheduledArrivalTimeMs The time at which the assigned driver is scheduled to arrive at the job destination.
 * @param scheduledDepartureTimeMs The time at which the assigned driver is scheduled to depart from the job destination.
 * @param arrivedAtMs The time at which the driver arrived at the job destination.
 * @param completedAtMs The time at which the job was marked complete (e.g. started driving to the next destination).
 * @param dispatchRouteId ID of the route that this job belongs to.
 * @param driverId ID of the driver assigned to the dispatch job.
 * @param enRouteAtMs The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
 * @param estimatedArrivalMs The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
 * @param fleetViewerUrl Fleet viewer url of the dispatch job.
 * @param groupId 
 * @param id ID of the Samsara dispatch job.
 * @param jobState 
 * @param skippedAtMs The time at which the job was marked skipped.
 * @param vehicleId ID of the vehicle used for the dispatch job.
 */
data class DispatchJob (

        @get:NotNull 
        @JsonProperty("scheduled_arrival_time_ms") val scheduledArrivalTimeMs: Long,

        @get:NotNull 
        @JsonProperty("dispatch_route_id") val dispatchRouteId: Long,

        @get:NotNull 
        @JsonProperty("group_id") val groupId: Long,

        @get:NotNull 
        @JsonProperty("id") val id: Long,

        @get:NotNull 
        @JsonProperty("job_state") val jobState: JobStatus,

        @JsonProperty("destination_address") val destinationAddress: String? = null,

        @JsonProperty("destination_address_id") val destinationAddressId: Long? = null,

        @JsonProperty("destination_lat") val destinationLat: Double? = null,

        @JsonProperty("destination_lng") val destinationLng: Double? = null,

        @JsonProperty("destination_name") val destinationName: String? = null,

        @JsonProperty("notes") val notes: String? = null,

        @JsonProperty("scheduled_departure_time_ms") val scheduledDepartureTimeMs: Long? = null,

        @JsonProperty("arrived_at_ms") val arrivedAtMs: Long? = null,

        @JsonProperty("completed_at_ms") val completedAtMs: Long? = null,

        @JsonProperty("driver_id") val driverId: Long? = null,

        @JsonProperty("en_route_at_ms") val enRouteAtMs: Long? = null,

        @JsonProperty("estimated_arrival_ms") val estimatedArrivalMs: Long? = null,

        @JsonProperty("fleet_viewer_url") val fleetViewerUrl: String? = null,

        @JsonProperty("skipped_at_ms") val skippedAtMs: Long? = null,

        @JsonProperty("vehicle_id") val vehicleId: Long? = null
) {

}

