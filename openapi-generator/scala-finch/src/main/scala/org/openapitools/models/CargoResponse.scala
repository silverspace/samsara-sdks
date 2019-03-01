package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CargoResponseSensors
import scala.collection.immutable.Seq

/**
 * Contains the current cargo status of a sensor.
 * @param groupId 
 * @param sensors 
 */
case class CargoResponse(groupId: Option[Long],
                sensors: Option[Seq[CargoResponseSensors]]
                )

object CargoResponse {
    /**
     * Creates the codec for converting CargoResponse from and to JSON.
     */
    implicit val decoder: Decoder[CargoResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CargoResponse] = deriveEncoder
}
