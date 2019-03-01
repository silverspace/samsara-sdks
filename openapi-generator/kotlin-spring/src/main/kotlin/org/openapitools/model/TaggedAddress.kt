package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.TaggedAddressBase
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param id The ID of the address being tagged.
 * @param name Name of the address being tagged.
 */
data class TaggedAddress (

        @get:NotNull 
        @JsonProperty("id") val id: Long,

        @JsonProperty("name") val name: String? = null
) {

}

