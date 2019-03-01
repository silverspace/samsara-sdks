package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param endMs End time (ms) of queried time period.
 * @param orgId Org ID to query.
 * @param startMs Start time (ms) of queried time period.
 */
data class InlineObject5 (

        @get:NotNull 
        @JsonProperty("endMs") val endMs: Long,

        @get:NotNull 
        @JsonProperty("orgId") val orgId: Long,

        @get:NotNull 
        @JsonProperty("startMs") val startMs: Long
) {

}

