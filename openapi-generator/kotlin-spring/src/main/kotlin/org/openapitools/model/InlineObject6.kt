package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param driverId Driver ID to query.
 * @param endMs End of the time range, specified in milliseconds UNIX time.
 * @param groupId Group ID to query.
 * @param startMs Beginning of the time range, specified in milliseconds UNIX time.
 */
data class InlineObject6 (

        @get:NotNull 
        @JsonProperty("driverId") val driverId: Long,

        @get:NotNull 
        @JsonProperty("endMs") val endMs: Int,

        @get:NotNull 
        @JsonProperty("groupId") val groupId: Long,

        @get:NotNull 
        @JsonProperty("startMs") val startMs: Int
) {

}

