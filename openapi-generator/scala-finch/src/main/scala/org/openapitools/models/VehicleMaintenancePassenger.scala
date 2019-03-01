package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.VehicleMaintenancePassengerCheckEngineLight
import org.openapitools.models.VehicleMaintenancePassengerDiagnosticTroubleCodes
import scala.collection.immutable.Seq

/**
 * Passenger vehicle data. Null if no data is available.
 * @param checkEngineLight 
 * @param diagnosticTroubleCodes Passenger vehicle DTCs.
 */
case class VehicleMaintenancePassenger(checkEngineLight: Option[VehicleMaintenancePassengerCheckEngineLight],
                diagnosticTroubleCodes: Option[Seq[VehicleMaintenancePassengerDiagnosticTroubleCodes]]
                )

object VehicleMaintenancePassenger {
    /**
     * Creates the codec for converting VehicleMaintenancePassenger from and to JSON.
     */
    implicit val decoder: Decoder[VehicleMaintenancePassenger] = deriveDecoder
    implicit val encoder: ObjectEncoder[VehicleMaintenancePassenger] = deriveEncoder
}
