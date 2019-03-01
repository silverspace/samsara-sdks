package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.TaggedAssetBase
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param id The ID of the Asset being tagged.
 * @param name Name of the Asset being tagged.
 */
data class TaggedAsset (

        @get:NotNull 
        @JsonProperty("id") val id: Long,

        @JsonProperty("name") val name: String? = null
) {

}

