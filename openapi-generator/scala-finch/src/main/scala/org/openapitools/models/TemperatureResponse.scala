package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TemperatureResponseSensors
import scala.collection.immutable.Seq

/**
 * Contains the current temperatures of a sensor.
 * @param groupId 
 * @param sensors 
 */
case class TemperatureResponse(groupId: Option[Long],
                sensors: Option[Seq[TemperatureResponseSensors]]
                )

object TemperatureResponse {
    /**
     * Creates the codec for converting TemperatureResponse from and to JSON.
     */
    implicit val decoder: Decoder[TemperatureResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[TemperatureResponse] = deriveEncoder
}
