package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param id The ID of the Asset being tagged.
 */
data class TaggedAssetBase (

        @get:NotNull 
        @JsonProperty("id") val id: Long
) {

}

