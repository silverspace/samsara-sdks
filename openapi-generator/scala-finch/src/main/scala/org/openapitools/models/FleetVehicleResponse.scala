package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.FleetVehicleResponseVehicleInfo
import scala.collection.immutable.Seq

/**
 * A vehicle object as returned for fleet/vehicle
 * @param externalIds 
 * @param harshAccelSetting Harsh event detection setting.
 * @param id ID of the vehicle.
 * @param name Name of the vehicle.
 * @param vehicleInfo 
 */
case class FleetVehicleResponse(externalIds: Option[Map[String, String]],
                harshAccelSetting: Option[String],
                id: Long,
                name: String,
                vehicleInfo: Option[FleetVehicleResponseVehicleInfo]
                )

object FleetVehicleResponse {
    /**
     * Creates the codec for converting FleetVehicleResponse from and to JSON.
     */
    implicit val decoder: Decoder[FleetVehicleResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[FleetVehicleResponse] = deriveEncoder
}
