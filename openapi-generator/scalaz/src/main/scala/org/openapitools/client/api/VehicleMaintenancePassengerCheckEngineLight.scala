package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import VehicleMaintenancePassengerCheckEngineLight._

case class VehicleMaintenancePassengerCheckEngineLight (
  isOn: Option[Boolean])

object VehicleMaintenancePassengerCheckEngineLight {
  import DateTimeCodecs._

  implicit val VehicleMaintenancePassengerCheckEngineLightCodecJson: CodecJson[VehicleMaintenancePassengerCheckEngineLight] = CodecJson.derive[VehicleMaintenancePassengerCheckEngineLight]
  implicit val VehicleMaintenancePassengerCheckEngineLightDecoder: EntityDecoder[VehicleMaintenancePassengerCheckEngineLight] = jsonOf[VehicleMaintenancePassengerCheckEngineLight]
  implicit val VehicleMaintenancePassengerCheckEngineLightEncoder: EntityEncoder[VehicleMaintenancePassengerCheckEngineLight] = jsonEncoderOf[VehicleMaintenancePassengerCheckEngineLight]
}
