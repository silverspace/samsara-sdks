package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.SensorHistoryResponseResults
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair.
 * @param results 
 */
data class SensorHistoryResponse (

        @JsonProperty("results") val results: List<SensorHistoryResponseResults>? = null
) {

}

