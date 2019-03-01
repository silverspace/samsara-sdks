package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DoorResponseSensors
import scala.collection.immutable.Seq

/**
 * Contains the current door status of a sensor.
 * @param groupId 
 * @param sensors 
 */
case class DoorResponse(groupId: Option[Long],
                sensors: Option[Seq[DoorResponseSensors]]
                )

object DoorResponse {
    /**
     * Creates the codec for converting DoorResponse from and to JSON.
     */
    implicit val decoder: Decoder[DoorResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[DoorResponse] = deriveEncoder
}
