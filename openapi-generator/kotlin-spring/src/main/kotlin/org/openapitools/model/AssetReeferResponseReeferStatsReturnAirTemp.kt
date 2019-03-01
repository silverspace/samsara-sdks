package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param tempInMilliC Return air temperature in millidegree Celsius.
 * @param changedAtMs Timestamp in Unix milliseconds since epoch.
 */
data class AssetReeferResponseReeferStatsReturnAirTemp (

        @JsonProperty("tempInMilliC") val tempInMilliC: Long? = null,

        @JsonProperty("changedAtMs") val changedAtMs: Long? = null
) {

}

