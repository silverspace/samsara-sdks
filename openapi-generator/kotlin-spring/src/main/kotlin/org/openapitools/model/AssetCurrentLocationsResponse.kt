package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AssetCable
import org.openapitools.model.AssetCurrentLocation
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Basic information of an asset
 * @param cable The cable connected to the asset
 * @param engineHours Engine hours
 * @param id Asset ID
 * @param location Current location of an asset
 * @param name Asset name
 */
data class AssetCurrentLocationsResponse (

        @get:NotNull 
        @JsonProperty("id") val id: Long,

        @JsonProperty("cable") val cable: List<AssetCable>? = null,

        @JsonProperty("engineHours") val engineHours: Int? = null,

        @JsonProperty("location") val location: List<AssetCurrentLocation>? = null,

        @JsonProperty("name") val name: String? = null
) {

}

