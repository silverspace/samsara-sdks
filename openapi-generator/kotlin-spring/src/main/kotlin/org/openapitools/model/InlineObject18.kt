package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param groupId Group ID to query.
 */
data class InlineObject18 (

        @get:NotNull 
        @JsonProperty("groupId") val groupId: Long
) {

}

