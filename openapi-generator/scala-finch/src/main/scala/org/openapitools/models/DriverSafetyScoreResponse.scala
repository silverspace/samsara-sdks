package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.SafetyReportHarshEvent
import scala.collection.immutable.Seq

/**
 * Safety score details for a driver
 * @param crashCount Crash event count
 * @param driverId Driver ID
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
 */
case class DriverSafetyScoreResponse(crashCount: Option[Int],
                driverId: Option[Int],
                harshAccelCount: Option[Int],
                harshBrakingCount: Option[Int],
                harshEvents: Option[Seq[SafetyReportHarshEvent]],
                harshTurningCount: Option[Int],
                safetyScore: Option[Int],
                safetyScoreRank: Option[String],
                timeOverSpeedLimitMs: Option[Int],
                totalDistanceDrivenMeters: Option[Int],
                totalHarshEventCount: Option[Int],
                totalTimeDrivenMs: Option[Int]
                )

object DriverSafetyScoreResponse {
    /**
     * Creates the codec for converting DriverSafetyScoreResponse from and to JSON.
     */
    implicit val decoder: Decoder[DriverSafetyScoreResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[DriverSafetyScoreResponse] = deriveEncoder
}
