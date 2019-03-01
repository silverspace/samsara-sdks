package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.TaggedSensorBase
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param id The ID of the Sensor being tagged.
 * @param name Name of the Sensor being tagged.
 */
data class TaggedSensor (

        @get:NotNull 
        @JsonProperty("id") val id: Long,

        @JsonProperty("name") val name: String? = null
) {

}

