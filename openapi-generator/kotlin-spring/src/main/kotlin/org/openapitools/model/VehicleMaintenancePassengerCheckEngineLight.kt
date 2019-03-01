package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Passenger vehicle check engine light.
 * @param isOn 
 */
data class VehicleMaintenancePassengerCheckEngineLight (

        @JsonProperty("isOn") val isOn: Boolean? = null
) {

}

