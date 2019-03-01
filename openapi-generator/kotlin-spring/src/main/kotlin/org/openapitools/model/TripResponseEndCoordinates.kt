package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * End (latitude, longitude) in decimal degrees.
 * @param latitude 
 * @param longitude 
 */
data class TripResponseEndCoordinates (

        @JsonProperty("latitude") val latitude: Double? = null,

        @JsonProperty("longitude") val longitude: Double? = null
) {

}

