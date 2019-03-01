package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param spnDescription 
 * @param fmiText 
 * @param spnId 
 * @param occurrenceCount 
 * @param txId 
 * @param fmiId 
 */
data class VehicleMaintenanceJ1939DiagnosticTroubleCodes (

        @JsonProperty("spnDescription") val spnDescription: String? = null,

        @JsonProperty("fmiText") val fmiText: String? = null,

        @JsonProperty("spnId") val spnId: Int? = null,

        @JsonProperty("occurrenceCount") val occurrenceCount: Int? = null,

        @JsonProperty("txId") val txId: Int? = null,

        @JsonProperty("fmiId") val fmiId: Int? = null
) {

}

