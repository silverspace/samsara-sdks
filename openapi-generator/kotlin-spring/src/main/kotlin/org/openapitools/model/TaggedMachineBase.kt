package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param id The ID of the Machine being tagged.
 */
data class TaggedMachineBase (

        @get:NotNull 
        @JsonProperty("id") val id: Long
) {

}

