package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import VehicleHarshEventResponse._

case class VehicleHarshEventResponse (
  /* URL for downloading the forward facing video */
  downloadForwardVideoUrl: Option[String],
/* URL for downloading the inward facing video */
  downloadInwardVideoUrl: Option[String],
/* URL for downloading the tracked inward facing video */
  downloadTrackedInwardVideoUrl: Option[String],
/* Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event] */
  harshEventType: String,
/* URL of the associated incident report page */
  incidentReportUrl: String,
/* Whether the driver was deemed distracted during this harsh event */
  isDistracted: Option[Boolean],
location: Option[VehicleHarshEventResponseLocation])

object VehicleHarshEventResponse {
  import DateTimeCodecs._

  implicit val VehicleHarshEventResponseCodecJson: CodecJson[VehicleHarshEventResponse] = CodecJson.derive[VehicleHarshEventResponse]
  implicit val VehicleHarshEventResponseDecoder: EntityDecoder[VehicleHarshEventResponse] = jsonOf[VehicleHarshEventResponse]
  implicit val VehicleHarshEventResponseEncoder: EntityEncoder[VehicleHarshEventResponse] = jsonEncoderOf[VehicleHarshEventResponse]
}
