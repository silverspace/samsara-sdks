package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param value 
 * @param timeMs 
 */
data class DataInputHistoryResponsePoints (

        @JsonProperty("value") val value: Double? = null,

        @JsonProperty("timeMs") val timeMs: Long? = null
) {

}

