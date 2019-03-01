package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.HumidityResponseSensors
import scala.collection.immutable.Seq

/**
 * Contains the current humidity of a sensor.
 * @param groupId 
 * @param sensors 
 */
case class HumidityResponse(groupId: Option[Long],
                sensors: Option[Seq[HumidityResponseSensors]]
                )

object HumidityResponse {
    /**
     * Creates the codec for converting HumidityResponse from and to JSON.
     */
    implicit val decoder: Decoder[HumidityResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[HumidityResponse] = deriveEncoder
}
