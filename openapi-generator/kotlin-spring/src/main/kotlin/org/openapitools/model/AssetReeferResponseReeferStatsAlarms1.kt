package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AssetReeferResponseReeferStatsAlarms
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param alarms 
 * @param changedAtMs Timestamp when the alarms were reported, in Unix milliseconds since epoch
 */
data class AssetReeferResponseReeferStatsAlarms1 (

        @JsonProperty("alarms") val alarms: List<AssetReeferResponseReeferStatsAlarms>? = null,

        @JsonProperty("changedAtMs") val changedAtMs: Long? = null
) {

}

