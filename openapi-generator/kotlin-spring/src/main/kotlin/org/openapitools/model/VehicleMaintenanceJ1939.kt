package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.VehicleMaintenanceJ1939CheckEngineLight
import org.openapitools.model.VehicleMaintenanceJ1939DiagnosticTroubleCodes
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * J1939 based data. Null if no data is available.
 * @param checkEngineLight 
 * @param diagnosticTroubleCodes J1939 DTCs.
 */
data class VehicleMaintenanceJ1939 (

        @JsonProperty("checkEngineLight") val checkEngineLight: VehicleMaintenanceJ1939CheckEngineLight? = null,

        @JsonProperty("diagnosticTroubleCodes") val diagnosticTroubleCodes: List<VehicleMaintenanceJ1939DiagnosticTroubleCodes>? = null
) {

}

