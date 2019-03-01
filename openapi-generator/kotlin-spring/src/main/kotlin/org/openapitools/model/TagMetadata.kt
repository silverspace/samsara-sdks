package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param id The ID of this tag.
 * @param name Name of this tag.
 */
data class TagMetadata (

        @get:NotNull 
        @JsonProperty("id") val id: Long,

        @get:NotNull 
        @JsonProperty("name") val name: String
) {

}

