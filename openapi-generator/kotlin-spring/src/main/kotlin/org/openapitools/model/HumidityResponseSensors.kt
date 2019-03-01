package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param name Name of the sensor.
 * @param humidity Currently reported relative humidity in percent, from 0-100.
 * @param id ID of the sensor.
 */
data class HumidityResponseSensors (

        @JsonProperty("name") val name: String? = null,

        @JsonProperty("humidity") val humidity: Int? = null,

        @JsonProperty("id") val id: Long? = null
) {

}

