package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param cargoEmpty Flag indicating whether the current cargo is empty or loaded.
 * @param name Name of the sensor.
 * @param id ID of the sensor.
 */
data class CargoResponseSensors (

        @JsonProperty("cargoEmpty") val cargoEmpty: Boolean? = null,

        @JsonProperty("name") val name: String? = null,

        @JsonProperty("id") val id: Long? = null
) {

}

