package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param year Year of the vehicle.
 * @param model Model of the Vehicle.
 * @param vin Vehicle Identification Number.
 * @param make Make of the vehicle.
 */
data class FleetVehicleResponseVehicleInfo (

        @JsonProperty("year") val year: Long? = null,

        @JsonProperty("model") val model: String? = null,

        @JsonProperty("vin") val vin: String? = null,

        @JsonProperty("make") val make: String? = null
) {

}

