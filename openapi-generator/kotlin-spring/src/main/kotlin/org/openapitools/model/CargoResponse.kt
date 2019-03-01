package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CargoResponseSensors
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Contains the current cargo status of a sensor.
 * @param groupId 
 * @param sensors 
 */
data class CargoResponse (

        @JsonProperty("groupId") val groupId: Long? = null,

        @JsonProperty("sensors") val sensors: List<CargoResponseSensors>? = null
) {

}

