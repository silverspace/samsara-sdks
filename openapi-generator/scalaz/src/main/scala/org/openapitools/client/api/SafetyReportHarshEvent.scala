package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import SafetyReportHarshEvent._

case class SafetyReportHarshEvent (
  /* Type of the harsh event */
  harshEventType: Option[String],
/* Timestamp that the harsh event occurred in Unix milliseconds since epoch */
  timestampMs: Option[Integer],
/* Vehicle associated with the harsh event */
  vehicleId: Option[Integer])

object SafetyReportHarshEvent {
  import DateTimeCodecs._

  implicit val SafetyReportHarshEventCodecJson: CodecJson[SafetyReportHarshEvent] = CodecJson.derive[SafetyReportHarshEvent]
  implicit val SafetyReportHarshEventDecoder: EntityDecoder[SafetyReportHarshEvent] = jsonOf[SafetyReportHarshEvent]
  implicit val SafetyReportHarshEventEncoder: EntityEncoder[SafetyReportHarshEvent] = jsonEncoderOf[SafetyReportHarshEvent]
}
