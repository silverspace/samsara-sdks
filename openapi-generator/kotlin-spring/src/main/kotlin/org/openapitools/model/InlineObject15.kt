package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param endMs End of the time range, specified in milliseconds UNIX time.
 * @param groupId Group ID to query.
 * @param startMs Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs
 * @param vehicleId Vehicle ID to query.
 */
data class InlineObject15 (

        @get:NotNull 
        @JsonProperty("endMs") val endMs: Int,

        @get:NotNull 
        @JsonProperty("groupId") val groupId: Long,

        @get:NotNull 
        @JsonProperty("startMs") val startMs: Int,

        @get:NotNull 
        @JsonProperty("vehicleId") val vehicleId: Long
) {

}

