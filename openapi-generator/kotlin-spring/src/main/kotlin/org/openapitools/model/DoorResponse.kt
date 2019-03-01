package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DoorResponseSensors
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Contains the current door status of a sensor.
 * @param groupId 
 * @param sensors 
 */
data class DoorResponse (

        @JsonProperty("groupId") val groupId: Long? = null,

        @JsonProperty("sensors") val sensors: List<DoorResponseSensors>? = null
) {

}

