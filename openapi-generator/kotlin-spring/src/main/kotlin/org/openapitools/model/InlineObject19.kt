package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param groupId Group ID to query.
 * @param sensors List of sensor IDs to query.
 */
data class InlineObject19 (

        @get:NotNull 
        @JsonProperty("groupId") val groupId: Long,

        @get:NotNull 
        @JsonProperty("sensors") val sensors: List<Long>
) {

}

