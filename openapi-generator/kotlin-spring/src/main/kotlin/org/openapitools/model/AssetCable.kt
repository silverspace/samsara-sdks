package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param assetType Asset type
 */
data class AssetCable (

        @JsonProperty("assetType") val assetType: String? = null
) {

}

