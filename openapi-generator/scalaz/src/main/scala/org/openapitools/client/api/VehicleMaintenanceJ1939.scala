package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import VehicleMaintenanceJ1939._

case class VehicleMaintenanceJ1939 (
  checkEngineLight: Option[VehicleMaintenanceJ1939CheckEngineLight],
/* J1939 DTCs. */
  diagnosticTroubleCodes: Option[List[VehicleMaintenanceJ1939DiagnosticTroubleCodes]])

object VehicleMaintenanceJ1939 {
  import DateTimeCodecs._

  implicit val VehicleMaintenanceJ1939CodecJson: CodecJson[VehicleMaintenanceJ1939] = CodecJson.derive[VehicleMaintenanceJ1939]
  implicit val VehicleMaintenanceJ1939Decoder: EntityDecoder[VehicleMaintenanceJ1939] = jsonOf[VehicleMaintenanceJ1939]
  implicit val VehicleMaintenanceJ1939Encoder: EntityEncoder[VehicleMaintenanceJ1939] = jsonEncoderOf[VehicleMaintenanceJ1939]
}
