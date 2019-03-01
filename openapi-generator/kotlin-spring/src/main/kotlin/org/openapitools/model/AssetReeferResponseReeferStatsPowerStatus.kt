package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param changedAtMs Timestamp in Unix milliseconds since epoch.
 * @param status Power status of the reefer.
 */
data class AssetReeferResponseReeferStatsPowerStatus (

        @JsonProperty("changedAtMs") val changedAtMs: Long? = null,

        @JsonProperty("status") val status: String? = null
) {

}

