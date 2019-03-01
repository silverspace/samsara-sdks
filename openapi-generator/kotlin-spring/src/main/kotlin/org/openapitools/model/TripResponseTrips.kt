package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.TripResponseEndCoordinates
import org.openapitools.model.TripResponseStartCoordinates
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param endOdometer Odometer reading at the end of the trip.
 * @param distanceMeters Length of the trip in meters.
 * @param endMs End of the trip in UNIX milliseconds.
 * @param startMs Beginning of the trip in UNIX milliseconds.
 * @param fuelConsumedMl Amount in milliliters of fuel consumed on this trip.
 * @param startAddress Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
 * @param startCoordinates 
 * @param endCoordinates 
 * @param startOdometer Odometer reading at the beginning of the trip.
 * @param driverId ID of the driver.
 * @param startLocation Geocoded street address of start (latitude, longitude) coordinates.
 * @param tollMeters Length in meters trip spent on toll roads.
 * @param endAddress Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
 * @param endLocation Geocoded street address of start (latitude, longitude) coordinates.
 */
data class TripResponseTrips (

        @JsonProperty("endOdometer") val endOdometer: Int? = null,

        @JsonProperty("distanceMeters") val distanceMeters: Int? = null,

        @JsonProperty("endMs") val endMs: Int? = null,

        @JsonProperty("startMs") val startMs: Int? = null,

        @JsonProperty("fuelConsumedMl") val fuelConsumedMl: Int? = null,

        @JsonProperty("startAddress") val startAddress: String? = null,

        @JsonProperty("startCoordinates") val startCoordinates: TripResponseStartCoordinates? = null,

        @JsonProperty("endCoordinates") val endCoordinates: TripResponseEndCoordinates? = null,

        @JsonProperty("startOdometer") val startOdometer: Int? = null,

        @JsonProperty("driverId") val driverId: Int? = null,

        @JsonProperty("startLocation") val startLocation: String? = null,

        @JsonProperty("tollMeters") val tollMeters: Int? = null,

        @JsonProperty("endAddress") val endAddress: String? = null,

        @JsonProperty("endLocation") val endLocation: String? = null
) {

}

