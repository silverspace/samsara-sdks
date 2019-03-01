package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.TripResponseTrips
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Contains the trips for the vehicle in the requested timeframe. A trip is represented as an object that contains startMs, startLocation, startAddress, startCoordinates, endMs, endLocation, endAddress and endCoordinates.
 * @param trips 
 */
data class TripResponse (

        @JsonProperty("trips") val trips: List<TripResponseTrips>? = null
) {

}

