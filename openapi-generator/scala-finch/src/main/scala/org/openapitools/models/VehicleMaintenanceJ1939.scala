package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.VehicleMaintenanceJ1939CheckEngineLight
import org.openapitools.models.VehicleMaintenanceJ1939DiagnosticTroubleCodes
import scala.collection.immutable.Seq

/**
 * J1939 based data. Null if no data is available.
 * @param checkEngineLight 
 * @param diagnosticTroubleCodes J1939 DTCs.
 */
case class VehicleMaintenanceJ1939(checkEngineLight: Option[VehicleMaintenanceJ1939CheckEngineLight],
                diagnosticTroubleCodes: Option[Seq[VehicleMaintenanceJ1939DiagnosticTroubleCodes]]
                )

object VehicleMaintenanceJ1939 {
    /**
     * Creates the codec for converting VehicleMaintenanceJ1939 from and to JSON.
     */
    implicit val decoder: Decoder[VehicleMaintenanceJ1939] = deriveDecoder
    implicit val encoder: ObjectEncoder[VehicleMaintenanceJ1939] = deriveEncoder
}
