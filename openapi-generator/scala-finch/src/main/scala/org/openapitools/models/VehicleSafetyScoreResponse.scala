package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.SafetyReportHarshEvent
import scala.collection.immutable.Seq

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
case class VehicleSafetyScoreResponse(crashCount: Option[Int],
                harshAccelCount: Option[Int],
                harshBrakingCount: Option[Int],
                harshEvents: Option[Seq[SafetyReportHarshEvent]],
                harshTurningCount: Option[Int],
                safetyScore: Option[Int],
                safetyScoreRank: Option[String],
                timeOverSpeedLimitMs: Option[Int],
                totalDistanceDrivenMeters: Option[Int],
                totalHarshEventCount: Option[Int],
                totalTimeDrivenMs: Option[Int],
                vehicleId: Option[Int]
                )

object VehicleSafetyScoreResponse {
    /**
     * Creates the codec for converting VehicleSafetyScoreResponse from and to JSON.
     */
    implicit val decoder: Decoder[VehicleSafetyScoreResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[VehicleSafetyScoreResponse] = deriveEncoder
}
