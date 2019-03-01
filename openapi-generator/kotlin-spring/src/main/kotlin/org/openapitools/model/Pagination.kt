package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param endCursor Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request's 'starting_after' query parameter.
 * @param hasNextPage True if there are more pages of results after this response.
 * @param hasPrevPage True if there are more pages of results before this response.
 * @param startCursor Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request's 'ending_before' query parameter.
 */
data class Pagination (

        @get:NotNull 
        @JsonProperty("endCursor") val endCursor: String,

        @get:NotNull 
        @JsonProperty("hasNextPage") val hasNextPage: Boolean,

        @get:NotNull 
        @JsonProperty("hasPrevPage") val hasPrevPage: Boolean,

        @get:NotNull 
        @JsonProperty("startCursor") val startCursor: String
) {

}

