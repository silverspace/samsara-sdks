package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param doorClosed Flag indicating whether the current door is closed or open.
 * @param name Name of the sensor.
 * @param id ID of the sensor.
 */
data class DoorResponseSensors (

        @JsonProperty("doorClosed") val doorClosed: Boolean? = null,

        @JsonProperty("name") val name: String? = null,

        @JsonProperty("id") val id: Long? = null
) {

}

