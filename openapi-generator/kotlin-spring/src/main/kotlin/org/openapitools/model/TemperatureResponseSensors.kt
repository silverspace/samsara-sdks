package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param probeTemperature Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.
 * @param name Name of the sensor.
 * @param id ID of the sensor.
 * @param ambientTemperature Currently reported ambient temperature in millidegrees celsius.
 */
data class TemperatureResponseSensors (

        @JsonProperty("probeTemperature") val probeTemperature: Int? = null,

        @JsonProperty("name") val name: String? = null,

        @JsonProperty("id") val id: Long? = null,

        @JsonProperty("ambientTemperature") val ambientTemperature: Int? = null
) {

}

