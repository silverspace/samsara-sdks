package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * J1939 check engine lights.
 * @param protectIsOn 
 * @param stopIsOn 
 * @param warningIsOn 
 * @param emissionsIsOn 
 */
case class VehicleMaintenanceJ1939CheckEngineLight(protectIsOn: Option[Boolean],
                stopIsOn: Option[Boolean],
                warningIsOn: Option[Boolean],
                emissionsIsOn: Option[Boolean]
                )

object VehicleMaintenanceJ1939CheckEngineLight {
    /**
     * Creates the codec for converting VehicleMaintenanceJ1939CheckEngineLight from and to JSON.
     */
    implicit val decoder: Decoder[VehicleMaintenanceJ1939CheckEngineLight] = deriveDecoder
    implicit val encoder: ObjectEncoder[VehicleMaintenanceJ1939CheckEngineLight] = deriveEncoder
}
