package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * J1939 check engine lights.
 * @param protectIsOn 
 * @param stopIsOn 
 * @param warningIsOn 
 * @param emissionsIsOn 
 */
data class VehicleMaintenanceJ1939CheckEngineLight (

        @JsonProperty("protectIsOn") val protectIsOn: Boolean? = null,

        @JsonProperty("stopIsOn") val stopIsOn: Boolean? = null,

        @JsonProperty("warningIsOn") val warningIsOn: Boolean? = null,

        @JsonProperty("emissionsIsOn") val emissionsIsOn: Boolean? = null
) {

}

