package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * List of harsh events
 * @param harshEventType Type of the harsh event
 * @param timestampMs Timestamp that the harsh event occurred in Unix milliseconds since epoch
 * @param vehicleId Vehicle associated with the harsh event
 */
case class SafetyReportHarshEvent(harshEventType: Option[String],
                timestampMs: Option[Int],
                vehicleId: Option[Int]
                )

object SafetyReportHarshEvent {
    /**
     * Creates the codec for converting SafetyReportHarshEvent from and to JSON.
     */
    implicit val decoder: Decoder[SafetyReportHarshEvent] = deriveDecoder
    implicit val encoder: ObjectEncoder[SafetyReportHarshEvent] = deriveEncoder
}
