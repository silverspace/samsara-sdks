package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Contains information about a sensor.
 * @param id ID of the sensor.
 * @param macAddress MAC address of the sensor.
 * @param name Name of the sensor.
 */
data class Sensor (

        @get:NotNull 
        @JsonProperty("id") val id: Long,

        @JsonProperty("macAddress") val macAddress: String? = null,

        @JsonProperty("name") val name: String? = null
) {

}

