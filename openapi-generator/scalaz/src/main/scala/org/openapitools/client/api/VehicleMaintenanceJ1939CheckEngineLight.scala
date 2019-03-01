package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import VehicleMaintenanceJ1939CheckEngineLight._

case class VehicleMaintenanceJ1939CheckEngineLight (
  protectIsOn: Option[Boolean],
stopIsOn: Option[Boolean],
warningIsOn: Option[Boolean],
emissionsIsOn: Option[Boolean])

object VehicleMaintenanceJ1939CheckEngineLight {
  import DateTimeCodecs._

  implicit val VehicleMaintenanceJ1939CheckEngineLightCodecJson: CodecJson[VehicleMaintenanceJ1939CheckEngineLight] = CodecJson.derive[VehicleMaintenanceJ1939CheckEngineLight]
  implicit val VehicleMaintenanceJ1939CheckEngineLightDecoder: EntityDecoder[VehicleMaintenanceJ1939CheckEngineLight] = jsonOf[VehicleMaintenanceJ1939CheckEngineLight]
  implicit val VehicleMaintenanceJ1939CheckEngineLightEncoder: EntityEncoder[VehicleMaintenanceJ1939CheckEngineLight] = jsonEncoderOf[VehicleMaintenanceJ1939CheckEngineLight]
}
