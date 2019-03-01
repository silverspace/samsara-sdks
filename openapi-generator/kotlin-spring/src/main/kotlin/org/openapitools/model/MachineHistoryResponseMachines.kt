package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.MachineHistoryResponseVibrations
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param name Machine name
 * @param id Machine ID
 * @param vibrations List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s
 */
data class MachineHistoryResponseMachines (

        @JsonProperty("name") val name: String? = null,

        @JsonProperty("id") val id: Int? = null,

        @JsonProperty("vibrations") val vibrations: List<MachineHistoryResponseVibrations>? = null
) {

}

