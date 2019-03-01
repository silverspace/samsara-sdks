package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param year Year of the vehicle.
 * @param model Model of the Vehicle.
 * @param vin Vehicle Identification Number.
 * @param make Make of the vehicle.
 */
case class FleetVehicleResponseVehicleInfo(year: Option[Long],
                model: Option[String],
                vin: Option[String],
                make: Option[String]
                )

object FleetVehicleResponseVehicleInfo {
    /**
     * Creates the codec for converting FleetVehicleResponseVehicleInfo from and to JSON.
     */
    implicit val decoder: Decoder[FleetVehicleResponseVehicleInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[FleetVehicleResponseVehicleInfo] = deriveEncoder
}
