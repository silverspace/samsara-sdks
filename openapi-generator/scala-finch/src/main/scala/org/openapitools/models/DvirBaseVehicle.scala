package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The vehicle on which DVIR was done.
 * @param name The vehicle on which DVIR was done.
 * @param id The vehicle id on which DVIR was done.
 */
case class DvirBaseVehicle(name: Option[String],
                id: Option[Long]
                )

object DvirBaseVehicle {
    /**
     * Creates the codec for converting DvirBaseVehicle from and to JSON.
     */
    implicit val decoder: Decoder[DvirBaseVehicle] = deriveDecoder
    implicit val encoder: ObjectEncoder[DvirBaseVehicle] = deriveEncoder
}
