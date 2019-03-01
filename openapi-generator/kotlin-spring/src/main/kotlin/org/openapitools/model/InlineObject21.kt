package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.SensorsHistorySeries
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param endMs End of the time range, specified in milliseconds UNIX time.
 * @param fillMissing 
 * @param groupId Group ID to query.
 * @param series 
 * @param startMs Beginning of the time range, specified in milliseconds UNIX time.
 * @param stepMs Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.
 */
data class InlineObject21 (

        @get:NotNull 
        @JsonProperty("endMs") val endMs: Int,

        @get:NotNull 
        @JsonProperty("groupId") val groupId: Long,

        @get:NotNull 
        @JsonProperty("series") val series: List<SensorsHistorySeries>,

        @get:NotNull 
        @JsonProperty("startMs") val startMs: Int,

        @get:NotNull 
        @JsonProperty("stepMs") val stepMs: Int,

        @JsonProperty("fillMissing") val fillMissing: InlineObject21.FillMissing? = null
) {

    /**
    * 
    * Values: withNull,withPrevious
    */
    enum class FillMissing(val value: String) {
    
        @JsonProperty("withNull") withNull("withNull"),
    
        @JsonProperty("withPrevious") withPrevious("withPrevious");
    
    }

}

