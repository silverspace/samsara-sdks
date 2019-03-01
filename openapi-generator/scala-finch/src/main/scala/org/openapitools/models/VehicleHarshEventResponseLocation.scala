package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param address Address of location where the harsh event occurred
 * @param latitude Latitude of location where the harsh event occurred
 * @param longitude Longitude of location where the harsh event occurred
 */
case class VehicleHarshEventResponseLocation(address: Option[String],
                latitude: Option[String],
                longitude: Option[String]
                )

object VehicleHarshEventResponseLocation {
    /**
     * Creates the codec for converting VehicleHarshEventResponseLocation from and to JSON.
     */
    implicit val decoder: Decoder[VehicleHarshEventResponseLocation] = deriveDecoder
    implicit val encoder: ObjectEncoder[VehicleHarshEventResponseLocation] = deriveEncoder
}
