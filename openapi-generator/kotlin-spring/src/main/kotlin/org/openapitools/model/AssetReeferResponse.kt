package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AssetReeferResponseReeferStats
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Reefer-specific asset details
 * @param assetType Asset type
 * @param id Asset ID
 * @param name Asset name
 * @param reeferStats 
 */
data class AssetReeferResponse (

        @JsonProperty("assetType") val assetType: String? = null,

        @JsonProperty("id") val id: Int? = null,

        @JsonProperty("name") val name: String? = null,

        @JsonProperty("reeferStats") val reeferStats: AssetReeferResponseReeferStats? = null
) {

}

