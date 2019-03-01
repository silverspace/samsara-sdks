package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param doorClosed Flag indicating whether the current door is closed or open.
 * @param name Name of the sensor.
 * @param id ID of the sensor.
 */
case class DoorResponseSensors(doorClosed: Option[Boolean],
                name: Option[String],
                id: Option[Long]
                )

object DoorResponseSensors {
    /**
     * Creates the codec for converting DoorResponseSensors from and to JSON.
     */
    implicit val decoder: Decoder[DoorResponseSensors] = deriveDecoder
    implicit val encoder: ObjectEncoder[DoorResponseSensors] = deriveEncoder
}
