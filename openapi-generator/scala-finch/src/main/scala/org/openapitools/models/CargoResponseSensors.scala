package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param cargoEmpty Flag indicating whether the current cargo is empty or loaded.
 * @param name Name of the sensor.
 * @param id ID of the sensor.
 */
case class CargoResponseSensors(cargoEmpty: Option[Boolean],
                name: Option[String],
                id: Option[Long]
                )

object CargoResponseSensors {
    /**
     * Creates the codec for converting CargoResponseSensors from and to JSON.
     */
    implicit val decoder: Decoder[CargoResponseSensors] = deriveDecoder
    implicit val encoder: ObjectEncoder[CargoResponseSensors] = deriveEncoder
}
