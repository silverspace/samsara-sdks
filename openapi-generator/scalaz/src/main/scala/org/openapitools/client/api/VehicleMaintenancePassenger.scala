package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import VehicleMaintenancePassenger._

case class VehicleMaintenancePassenger (
  checkEngineLight: Option[VehicleMaintenancePassengerCheckEngineLight],
/* Passenger vehicle DTCs. */
  diagnosticTroubleCodes: Option[List[VehicleMaintenancePassengerDiagnosticTroubleCodes]])

object VehicleMaintenancePassenger {
  import DateTimeCodecs._

  implicit val VehicleMaintenancePassengerCodecJson: CodecJson[VehicleMaintenancePassenger] = CodecJson.derive[VehicleMaintenancePassenger]
  implicit val VehicleMaintenancePassengerDecoder: EntityDecoder[VehicleMaintenancePassenger] = jsonOf[VehicleMaintenancePassenger]
  implicit val VehicleMaintenancePassengerEncoder: EntityEncoder[VehicleMaintenancePassenger] = jsonEncoderOf[VehicleMaintenancePassenger]
}
