package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param dtcShortCode 
 * @param dtcId 
 * @param dtcDescription 
 */
case class VehicleMaintenancePassengerDiagnosticTroubleCodes(dtcShortCode: Option[String],
                dtcId: Option[Int],
                dtcDescription: Option[String]
                )

object VehicleMaintenancePassengerDiagnosticTroubleCodes {
    /**
     * Creates the codec for converting VehicleMaintenancePassengerDiagnosticTroubleCodes from and to JSON.
     */
    implicit val decoder: Decoder[VehicleMaintenancePassengerDiagnosticTroubleCodes] = deriveDecoder
    implicit val encoder: ObjectEncoder[VehicleMaintenancePassengerDiagnosticTroubleCodes] = deriveEncoder
}
