package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param parentTagId The ID of this tag.
 * @param name Name of this tag.
 * @param id The ID of this tag.
 */
data class UserTagRoleTag (

        @get:NotNull 
        @JsonProperty("name") val name: String,

        @get:NotNull 
        @JsonProperty("id") val id: Long,

        @JsonProperty("parentTagId") val parentTagId: Long? = null
) {

}

