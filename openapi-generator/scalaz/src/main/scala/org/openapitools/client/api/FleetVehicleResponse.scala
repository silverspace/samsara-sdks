package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import FleetVehicleResponse._

case class FleetVehicleResponse (
  externalIds: Option[Map[String, String]],
/* Harsh event detection setting. */
  harshAccelSetting: Option[String],
/* ID of the vehicle. */
  id: Long,
/* Name of the vehicle. */
  name: String,
vehicleInfo: Option[FleetVehicleResponseVehicleInfo])

object FleetVehicleResponse {
  import DateTimeCodecs._

  implicit val FleetVehicleResponseCodecJson: CodecJson[FleetVehicleResponse] = CodecJson.derive[FleetVehicleResponse]
  implicit val FleetVehicleResponseDecoder: EntityDecoder[FleetVehicleResponse] = jsonOf[FleetVehicleResponse]
  implicit val FleetVehicleResponseEncoder: EntityEncoder[FleetVehicleResponse] = jsonEncoderOf[FleetVehicleResponse]
}
