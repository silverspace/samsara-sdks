package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AssetCurrentLocationsResponse
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param assets 
 */
data class InlineResponse2001 (

        @JsonProperty("assets") val assets: List<AssetCurrentLocationsResponse>? = null
) {

}

