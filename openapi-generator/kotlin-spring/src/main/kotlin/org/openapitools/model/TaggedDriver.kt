package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.TaggedDriverBase
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param id The ID of the Driver being tagged.
 * @param name Name of the Driver being tagged.
 */
data class TaggedDriver (

        @get:NotNull 
        @JsonProperty("id") val id: Long,

        @JsonProperty("name") val name: String? = null
) {

}

