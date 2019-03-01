package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.TaggedMachineBase
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param id The ID of the Machine being tagged.
 * @param name Name of the Machine being tagged.
 */
data class TaggedMachine (

        @get:NotNull 
        @JsonProperty("id") val id: Long,

        @JsonProperty("name") val name: String? = null
) {

}

