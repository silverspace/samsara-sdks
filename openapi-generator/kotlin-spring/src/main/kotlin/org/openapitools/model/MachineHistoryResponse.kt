package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.MachineHistoryResponseMachines
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Contains the results for a machine history request
 * @param machines 
 */
data class MachineHistoryResponse (

        @JsonProperty("machines") val machines: List<MachineHistoryResponseMachines>? = null
) {

}

