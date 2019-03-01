package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AssetCable
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Basic information of an asset
 * @param assetSerialNumber Serial number of the host asset
 * @param cable The cable connected to the asset
 * @param engineHours Engine hours
 * @param id Asset ID
 * @param name Asset name
 */
data class Asset (

        @get:NotNull 
        @JsonProperty("id") val id: Long,

        @JsonProperty("assetSerialNumber") val assetSerialNumber: String? = null,

        @JsonProperty("cable") val cable: List<AssetCable>? = null,

        @JsonProperty("engineHours") val engineHours: Int? = null,

        @JsonProperty("name") val name: String? = null
) {

}

