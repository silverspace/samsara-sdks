package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Contains the location, in latitude and longitude, of a vehicle.
 * @param heading Heading in degrees.
 * @param id ID of the vehicle.
 * @param latitude Latitude in decimal degrees.
 * @param location Text representation of nearest identifiable location to (latitude, longitude) coordinates.
 * @param longitude Longitude in decimal degrees.
 * @param name Name of the vehicle.
 * @param odometerMeters The number of meters reported by the odometer.
 * @param onTrip Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
 * @param speed Speed in miles per hour.
 * @param time The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
 * @param vin Vehicle Identification Number (VIN) of the vehicle.
 */
data class VehicleLocation (

        @get:NotNull 
        @JsonProperty("id") val id: Long,

        @JsonProperty("heading") val heading: Double? = null,

        @JsonProperty("latitude") val latitude: Double? = null,

        @JsonProperty("location") val location: String? = null,

        @JsonProperty("longitude") val longitude: Double? = null,

        @JsonProperty("name") val name: String? = null,

        @JsonProperty("odometerMeters") val odometerMeters: Long? = null,

        @JsonProperty("onTrip") val onTrip: Boolean? = null,

        @JsonProperty("speed") val speed: Double? = null,

        @JsonProperty("time") val time: Int? = null,

        @JsonProperty("vin") val vin: String? = null
) {

}

