package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.HumidityResponseSensors
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Contains the current humidity of a sensor.
 * @param groupId 
 * @param sensors 
 */
data class HumidityResponse (

        @JsonProperty("groupId") val groupId: Long? = null,

        @JsonProperty("sensors") val sensors: List<HumidityResponseSensors>? = null
) {

}

