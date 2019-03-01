package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * List of harsh events
 * @param harshEventType Type of the harsh event
 * @param timestampMs Timestamp that the harsh event occurred in Unix milliseconds since epoch
 * @param vehicleId Vehicle associated with the harsh event
 */
data class SafetyReportHarshEvent (

        @JsonProperty("harshEventType") val harshEventType: String? = null,

        @JsonProperty("timestampMs") val timestampMs: Int? = null,

        @JsonProperty("vehicleId") val vehicleId: Int? = null
) {

}

