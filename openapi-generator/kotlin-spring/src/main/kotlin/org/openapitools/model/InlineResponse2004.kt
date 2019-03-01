package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.VehicleMaintenance
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param vehicles 
 */
data class InlineResponse2004 (

        @JsonProperty("vehicles") val vehicles: List<VehicleMaintenance>? = null
) {

}

