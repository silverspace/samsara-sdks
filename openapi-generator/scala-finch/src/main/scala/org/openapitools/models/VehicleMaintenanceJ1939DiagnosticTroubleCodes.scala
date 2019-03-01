package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param spnDescription 
 * @param fmiText 
 * @param spnId 
 * @param occurrenceCount 
 * @param txId 
 * @param fmiId 
 */
case class VehicleMaintenanceJ1939DiagnosticTroubleCodes(spnDescription: Option[String],
                fmiText: Option[String],
                spnId: Option[Int],
                occurrenceCount: Option[Int],
                txId: Option[Int],
                fmiId: Option[Int]
                )

object VehicleMaintenanceJ1939DiagnosticTroubleCodes {
    /**
     * Creates the codec for converting VehicleMaintenanceJ1939DiagnosticTroubleCodes from and to JSON.
     */
    implicit val decoder: Decoder[VehicleMaintenanceJ1939DiagnosticTroubleCodes] = deriveDecoder
    implicit val encoder: ObjectEncoder[VehicleMaintenanceJ1939DiagnosticTroubleCodes] = deriveEncoder
}
