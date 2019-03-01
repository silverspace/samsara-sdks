package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param fuelPercentage Fuel percentage of the reefer.
 * @param changedAtMs Timestamp in Unix milliseconds since epoch.
 */
data class AssetReeferResponseReeferStatsFuelPercentage (

        @JsonProperty("fuelPercentage") val fuelPercentage: Long? = null,

        @JsonProperty("changedAtMs") val changedAtMs: Long? = null
) {

}

