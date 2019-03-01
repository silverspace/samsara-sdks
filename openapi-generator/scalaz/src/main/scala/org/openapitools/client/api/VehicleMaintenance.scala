package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import VehicleMaintenance._

case class VehicleMaintenance (
  /* ID of the vehicle. */
  id: Long,
j1939: Option[VehicleMaintenanceJ1939],
passenger: Option[VehicleMaintenancePassenger])

object VehicleMaintenance {
  import DateTimeCodecs._

  implicit val VehicleMaintenanceCodecJson: CodecJson[VehicleMaintenance] = CodecJson.derive[VehicleMaintenance]
  implicit val VehicleMaintenanceDecoder: EntityDecoder[VehicleMaintenance] = jsonOf[VehicleMaintenance]
  implicit val VehicleMaintenanceEncoder: EntityEncoder[VehicleMaintenance] = jsonEncoderOf[VehicleMaintenance]
}
