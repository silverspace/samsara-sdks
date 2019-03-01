package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 */
data class DispatchJobCreate (

        @get:NotNull 
        @JsonProperty("scheduled_arrival_time_ms") val scheduledArrivalTimeMs: Long,

        @JsonProperty("destination_address") val destinationAddress: String? = null,

        @JsonProperty("destination_address_id") val destinationAddressId: Long? = null,

        @JsonProperty("destination_lat") val destinationLat: Double? = null,

        @JsonProperty("destination_lng") val destinationLng: Double? = null,

        @JsonProperty("destination_name") val destinationName: String? = null,

        @JsonProperty("notes") val notes: String? = null,

        @JsonProperty("scheduled_departure_time_ms") val scheduledDepartureTimeMs: Long? = null
) {

}

