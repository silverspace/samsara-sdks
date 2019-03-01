package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Contains information about a sensor.
 * @param id ID of the sensor.
 * @param macAddress MAC address of the sensor.
 * @param name Name of the sensor.
 */
case class Sensor(id: Long,
                macAddress: Option[String],
                name: Option[String]
                )

object Sensor {
    /**
     * Creates the codec for converting Sensor from and to JSON.
     */
    implicit val decoder: Decoder[Sensor] = deriveDecoder
    implicit val encoder: ObjectEncoder[Sensor] = deriveEncoder
}
