package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.TemperatureResponseSensors
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Contains the current temperatures of a sensor.
 * @param groupId 
 * @param sensors 
 */
data class TemperatureResponse (

        @JsonProperty("groupId") val groupId: Long? = null,

        @JsonProperty("sensors") val sensors: List<TemperatureResponseSensors>? = null
) {

}

