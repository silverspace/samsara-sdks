package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Passenger vehicle check engine light.
 * @param isOn 
 */
case class VehicleMaintenancePassengerCheckEngineLight(isOn: Option[Boolean]
                )

object VehicleMaintenancePassengerCheckEngineLight {
    /**
     * Creates the codec for converting VehicleMaintenancePassengerCheckEngineLight from and to JSON.
     */
    implicit val decoder: Decoder[VehicleMaintenancePassengerCheckEngineLight] = deriveDecoder
    implicit val encoder: ObjectEncoder[VehicleMaintenancePassengerCheckEngineLight] = deriveEncoder
}
