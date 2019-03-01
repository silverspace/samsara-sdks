package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Sensor
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param sensors 
 */
data class InlineResponse2008 (

        @JsonProperty("sensors") val sensors: List<Sensor>? = null
) {

}

