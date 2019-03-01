package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import VehicleMaintenancePassengerDiagnosticTroubleCodes._

case class VehicleMaintenancePassengerDiagnosticTroubleCodes (
  dtcShortCode: Option[String],
dtcId: Option[Integer],
dtcDescription: Option[String])

object VehicleMaintenancePassengerDiagnosticTroubleCodes {
  import DateTimeCodecs._

  implicit val VehicleMaintenancePassengerDiagnosticTroubleCodesCodecJson: CodecJson[VehicleMaintenancePassengerDiagnosticTroubleCodes] = CodecJson.derive[VehicleMaintenancePassengerDiagnosticTroubleCodes]
  implicit val VehicleMaintenancePassengerDiagnosticTroubleCodesDecoder: EntityDecoder[VehicleMaintenancePassengerDiagnosticTroubleCodes] = jsonOf[VehicleMaintenancePassengerDiagnosticTroubleCodes]
  implicit val VehicleMaintenancePassengerDiagnosticTroubleCodesEncoder: EntityEncoder[VehicleMaintenancePassengerDiagnosticTroubleCodes] = jsonEncoderOf[VehicleMaintenancePassengerDiagnosticTroubleCodes]
}
