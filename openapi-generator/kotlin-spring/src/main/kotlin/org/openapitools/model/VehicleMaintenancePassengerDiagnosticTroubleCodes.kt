package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param dtcShortCode 
 * @param dtcId 
 * @param dtcDescription 
 */
data class VehicleMaintenancePassengerDiagnosticTroubleCodes (

        @JsonProperty("dtcShortCode") val dtcShortCode: String? = null,

        @JsonProperty("dtcId") val dtcId: Int? = null,

        @JsonProperty("dtcDescription") val dtcDescription: String? = null
) {

}

