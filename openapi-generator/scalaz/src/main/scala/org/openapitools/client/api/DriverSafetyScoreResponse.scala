package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DriverSafetyScoreResponse._

case class DriverSafetyScoreResponse (
  /* Crash event count */
  crashCount: Option[Integer],
/* Driver ID */
  driverId: Option[Integer],
/* Harsh acceleration event count */
  harshAccelCount: Option[Integer],
/* Harsh braking event count */
  harshBrakingCount: Option[Integer],
harshEvents: Option[List[SafetyReportHarshEvent]],
/* Harsh turning event count */
  harshTurningCount: Option[Integer],
/* Safety Score */
  safetyScore: Option[Integer],
/* Safety Score Rank */
  safetyScoreRank: Option[String],
/* Amount of time driven over the speed limit in milliseconds */
  timeOverSpeedLimitMs: Option[Integer],
/* Total distance driven in meters */
  totalDistanceDrivenMeters: Option[Integer],
/* Total harsh event count */
  totalHarshEventCount: Option[Integer],
/* Amount of time driven in milliseconds */
  totalTimeDrivenMs: Option[Integer])

object DriverSafetyScoreResponse {
  import DateTimeCodecs._

  implicit val DriverSafetyScoreResponseCodecJson: CodecJson[DriverSafetyScoreResponse] = CodecJson.derive[DriverSafetyScoreResponse]
  implicit val DriverSafetyScoreResponseDecoder: EntityDecoder[DriverSafetyScoreResponse] = jsonOf[DriverSafetyScoreResponse]
  implicit val DriverSafetyScoreResponseEncoder: EntityEncoder[DriverSafetyScoreResponse] = jsonEncoderOf[DriverSafetyScoreResponse]
}
