package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param series List of datapoints, one for each requested (sensor, field) pair.
 * @param timeMs Timestamp in UNIX milliseconds.
 */
data class SensorHistoryResponseResults (

        @JsonProperty("series") val series: List<Long>? = null,

        @JsonProperty("timeMs") val timeMs: Int? = null
) {

}

