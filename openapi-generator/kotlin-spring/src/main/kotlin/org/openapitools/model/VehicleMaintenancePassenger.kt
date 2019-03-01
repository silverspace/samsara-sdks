package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.VehicleMaintenancePassengerCheckEngineLight
import org.openapitools.model.VehicleMaintenancePassengerDiagnosticTroubleCodes
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Passenger vehicle data. Null if no data is available.
 * @param checkEngineLight 
 * @param diagnosticTroubleCodes Passenger vehicle DTCs.
 */
data class VehicleMaintenancePassenger (

        @JsonProperty("checkEngineLight") val checkEngineLight: VehicleMaintenancePassengerCheckEngineLight? = null,

        @JsonProperty("diagnosticTroubleCodes") val diagnosticTroubleCodes: List<VehicleMaintenancePassengerDiagnosticTroubleCodes>? = null
) {

}

