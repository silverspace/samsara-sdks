package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param address Address of location where the harsh event occurred
 * @param latitude Latitude of location where the harsh event occurred
 * @param longitude Longitude of location where the harsh event occurred
 */
data class VehicleHarshEventResponseLocation (

        @JsonProperty("address") val address: String? = null,

        @JsonProperty("latitude") val latitude: String? = null,

        @JsonProperty("longitude") val longitude: String? = null
) {

}

