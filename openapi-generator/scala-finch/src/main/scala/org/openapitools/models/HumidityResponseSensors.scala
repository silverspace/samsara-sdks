package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param name Name of the sensor.
 * @param humidity Currently reported relative humidity in percent, from 0-100.
 * @param id ID of the sensor.
 */
case class HumidityResponseSensors(name: Option[String],
                humidity: Option[Int],
                id: Option[Long]
                )

object HumidityResponseSensors {
    /**
     * Creates the codec for converting HumidityResponseSensors from and to JSON.
     */
    implicit val decoder: Decoder[HumidityResponseSensors] = deriveDecoder
    implicit val encoder: ObjectEncoder[HumidityResponseSensors] = deriveEncoder
}
