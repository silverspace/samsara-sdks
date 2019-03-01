package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param severity Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action
 * @param operatorAction Recommended operator action
 * @param description Description of the alarm
 * @param alarmCode ID of the alarm
 */
data class AssetReeferResponseReeferStatsAlarms (

        @JsonProperty("severity") val severity: Long? = null,

        @JsonProperty("operatorAction") val operatorAction: String? = null,

        @JsonProperty("description") val description: String? = null,

        @JsonProperty("alarmCode") val alarmCode: Long? = null
) {

}

