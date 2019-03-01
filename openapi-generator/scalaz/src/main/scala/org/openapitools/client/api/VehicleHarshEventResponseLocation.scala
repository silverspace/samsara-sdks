package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import VehicleHarshEventResponseLocation._

case class VehicleHarshEventResponseLocation (
  /* Address of location where the harsh event occurred */
  address: Option[String],
/* Latitude of location where the harsh event occurred */
  latitude: Option[String],
/* Longitude of location where the harsh event occurred */
  longitude: Option[String])

object VehicleHarshEventResponseLocation {
  import DateTimeCodecs._

  implicit val VehicleHarshEventResponseLocationCodecJson: CodecJson[VehicleHarshEventResponseLocation] = CodecJson.derive[VehicleHarshEventResponseLocation]
  implicit val VehicleHarshEventResponseLocationDecoder: EntityDecoder[VehicleHarshEventResponseLocation] = jsonOf[VehicleHarshEventResponseLocation]
  implicit val VehicleHarshEventResponseLocationEncoder: EntityEncoder[VehicleHarshEventResponseLocation] = jsonEncoderOf[VehicleHarshEventResponseLocation]
}
