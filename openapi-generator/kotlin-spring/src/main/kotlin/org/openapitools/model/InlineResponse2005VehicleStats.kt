package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AuxInputSeries
import org.openapitools.model.EngineState
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param engineState 
 * @param auxInput2 
 * @param vehicleId ID of the vehicle.
 * @param auxInput1 
 */
data class InlineResponse2005VehicleStats (

        @get:NotNull 
        @JsonProperty("vehicleId") val vehicleId: Long,

        @JsonProperty("engineState") val engineState: List<EngineState>? = null,

        @JsonProperty("auxInput2") val auxInput2: AuxInputSeries? = null,

        @JsonProperty("auxInput1") val auxInput1: AuxInputSeries? = null
) {

}

