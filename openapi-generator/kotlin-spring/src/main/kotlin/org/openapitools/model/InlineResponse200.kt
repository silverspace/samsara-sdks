package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Asset
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param assets 
 */
data class InlineResponse200 (

        @JsonProperty("assets") val assets: List<Asset>? = null
) {

}

