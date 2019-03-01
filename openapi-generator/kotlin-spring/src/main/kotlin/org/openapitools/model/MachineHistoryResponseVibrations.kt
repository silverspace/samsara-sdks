package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param X 
 * @param Y 
 * @param Z 
 * @param time 
 */
data class MachineHistoryResponseVibrations (

        @JsonProperty("X") val X: Double? = null,

        @JsonProperty("Y") val Y: Double? = null,

        @JsonProperty("Z") val Z: Double? = null,

        @JsonProperty("time") val time: Long? = null
) {

}

