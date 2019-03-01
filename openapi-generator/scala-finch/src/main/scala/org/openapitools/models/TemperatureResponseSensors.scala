package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param probeTemperature Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.
 * @param name Name of the sensor.
 * @param id ID of the sensor.
 * @param ambientTemperature Currently reported ambient temperature in millidegrees celsius.
 */
case class TemperatureResponseSensors(probeTemperature: Option[Int],
                name: Option[String],
                id: Option[Long],
                ambientTemperature: Option[Int]
                )

object TemperatureResponseSensors {
    /**
     * Creates the codec for converting TemperatureResponseSensors from and to JSON.
     */
    implicit val decoder: Decoder[TemperatureResponseSensors] = deriveDecoder
    implicit val encoder: ObjectEncoder[TemperatureResponseSensors] = deriveEncoder
}
