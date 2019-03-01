package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Contains the location and speed of a vehicle at a particular time
 * @param latitude The latitude of the location in degrees.
 * @param location The best effort (street,city,state) for the latitude and longitude.
 * @param longitude The longitude of the location in degrees.
 * @param speedMilesPerHour The speed calculated from GPS that the asset was traveling at in miles per hour.
 * @param timeMs Time in Unix milliseconds since epoch when the asset was at the location.
 */
data class FleetVehicleLocation (

        @JsonProperty("latitude") val latitude: Double? = null,

        @JsonProperty("location") val location: String? = null,

        @JsonProperty("longitude") val longitude: Double? = null,

        @JsonProperty("speedMilesPerHour") val speedMilesPerHour: Double? = null,

        @JsonProperty("timeMs") val timeMs: Long? = null
) {

}

