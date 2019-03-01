package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param engineHours Engine hours of the reefer.
 * @param changedAtMs Timestamp in Unix milliseconds since epoch.
 */
data class AssetReeferResponseReeferStatsEngineHours (

        @JsonProperty("engineHours") val engineHours: Long? = null,

        @JsonProperty("changedAtMs") val changedAtMs: Long? = null
) {

}

