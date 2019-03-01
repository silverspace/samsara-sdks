package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Contains information about a machine.
 * @param id ID of the machine.
 * @param name Name of the machine.
 * @param notes Notes about the machine
 */
data class Machine (

        @get:NotNull 
        @JsonProperty("id") val id: Long,

        @JsonProperty("name") val name: String? = null,

        @JsonProperty("notes") val notes: String? = null
) {

}

