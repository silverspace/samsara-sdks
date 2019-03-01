package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Digital value of an aux input.
 * @param timeMs Timestamp in Unix epoch milliseconds.
 * @param value Boolean representing the digital value of the aux input.
 */
data class AuxInput (

        @get:NotNull 
        @JsonProperty("timeMs") val timeMs: Any,

        @get:NotNull 
        @JsonProperty("value") val value: Boolean
) {

}

