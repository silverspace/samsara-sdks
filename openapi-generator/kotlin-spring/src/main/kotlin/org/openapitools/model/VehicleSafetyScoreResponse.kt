package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.SafetyReportHarshEvent
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Safety score details for a vehicle
 * @param crashCount Crash event count
 * @param harshAccelCount Harsh acceleration event count
 * @param harshBrakingCount Harsh braking event count
 * @param harshEvents 
 * @param harshTurningCount Harsh turning event count
 * @param safetyScore Safety Score
 * @param safetyScoreRank Safety Score Rank
 * @param timeOverSpeedLimitMs Amount of time driven over the speed limit in milliseconds
 * @param totalDistanceDrivenMeters Total distance driven in meters
 * @param totalHarshEventCount Total harsh event count
 * @param totalTimeDrivenMs Amount of time driven in milliseconds
 * @param vehicleId Vehicle ID
 */
data class VehicleSafetyScoreResponse (

        @JsonProperty("crashCount") val crashCount: Int? = null,

        @JsonProperty("harshAccelCount") val harshAccelCount: Int? = null,

        @JsonProperty("harshBrakingCount") val harshBrakingCount: Int? = null,

        @JsonProperty("harshEvents") val harshEvents: List<SafetyReportHarshEvent>? = null,

        @JsonProperty("harshTurningCount") val harshTurningCount: Int? = null,

        @JsonProperty("safetyScore") val safetyScore: Int? = null,

        @JsonProperty("safetyScoreRank") val safetyScoreRank: String? = null,

        @JsonProperty("timeOverSpeedLimitMs") val timeOverSpeedLimitMs: Int? = null,

        @JsonProperty("totalDistanceDrivenMeters") val totalDistanceDrivenMeters: Int? = null,

        @JsonProperty("totalHarshEventCount") val totalHarshEventCount: Int? = null,

        @JsonProperty("totalTimeDrivenMs") val totalTimeDrivenMs: Int? = null,

        @JsonProperty("vehicleId") val vehicleId: Int? = null
) {

}

