package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import VehicleMaintenanceJ1939DiagnosticTroubleCodes._

case class VehicleMaintenanceJ1939DiagnosticTroubleCodes (
  spnDescription: Option[String],
fmiText: Option[String],
spnId: Option[Integer],
occurrenceCount: Option[Integer],
txId: Option[Integer],
fmiId: Option[Integer])

object VehicleMaintenanceJ1939DiagnosticTroubleCodes {
  import DateTimeCodecs._

  implicit val VehicleMaintenanceJ1939DiagnosticTroubleCodesCodecJson: CodecJson[VehicleMaintenanceJ1939DiagnosticTroubleCodes] = CodecJson.derive[VehicleMaintenanceJ1939DiagnosticTroubleCodes]
  implicit val VehicleMaintenanceJ1939DiagnosticTroubleCodesDecoder: EntityDecoder[VehicleMaintenanceJ1939DiagnosticTroubleCodes] = jsonOf[VehicleMaintenanceJ1939DiagnosticTroubleCodes]
  implicit val VehicleMaintenanceJ1939DiagnosticTroubleCodesEncoder: EntityEncoder[VehicleMaintenanceJ1939DiagnosticTroubleCodes] = jsonEncoderOf[VehicleMaintenanceJ1939DiagnosticTroubleCodes]
}
