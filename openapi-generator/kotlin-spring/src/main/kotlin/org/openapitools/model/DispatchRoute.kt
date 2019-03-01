package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DispatchJob
import org.openapitools.model.DispatchRouteBase
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param actualEndMs The time in Unix epoch milliseconds that the route actually ended.
 * @param actualStartMs The time in Unix epoch milliseconds that the route actually started.
 * @param driverId ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
 * @param groupId ID of the group if the organization has multiple groups (optional).
 * @param name Descriptive name of this route.
 * @param scheduledEndMs The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
 * @param scheduledMeters The distance expected to be traveled for this route in meters.
 * @param scheduledStartMs The time in Unix epoch milliseconds that the route is scheduled to start.
 * @param startLocationAddress The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
 * @param startLocationAddressId ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
 * @param startLocationLat Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
 * @param startLocationLng Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
 * @param startLocationName The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
 * @param trailerId ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
 * @param vehicleId ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
 * @param dispatchJobs The dispatch jobs associated with this route.
 * @param id ID of the Samsara dispatch route.
 */
data class DispatchRoute (

        @get:NotNull 
        @JsonProperty("name") val name: String,

        @get:NotNull 
        @JsonProperty("scheduled_end_ms") val scheduledEndMs: Long,

        @get:NotNull 
        @JsonProperty("scheduled_start_ms") val scheduledStartMs: Long,

        @get:NotNull 
        @JsonProperty("dispatch_jobs") val dispatchJobs: List<DispatchJob>,

        @get:NotNull 
        @JsonProperty("id") val id: Long,

        @JsonProperty("actual_end_ms") val actualEndMs: Long? = null,

        @JsonProperty("actual_start_ms") val actualStartMs: Long? = null,

        @JsonProperty("driver_id") val driverId: Long? = null,

        @JsonProperty("group_id") val groupId: Long? = null,

        @JsonProperty("scheduled_meters") val scheduledMeters: Long? = null,

        @JsonProperty("start_location_address") val startLocationAddress: String? = null,

        @JsonProperty("start_location_address_id") val startLocationAddressId: Long? = null,

        @JsonProperty("start_location_lat") val startLocationLat: Double? = null,

        @JsonProperty("start_location_lng") val startLocationLng: Double? = null,

        @JsonProperty("start_location_name") val startLocationName: String? = null,

        @JsonProperty("trailer_id") val trailerId: Long? = null,

        @JsonProperty("vehicle_id") val vehicleId: Long? = null
) {

}

