package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TaggedSensorBase

/**
 * 
 * @param id The ID of the Sensor being tagged.
 * @param name Name of the Sensor being tagged.
 */
case class TaggedSensor(id: Long,
                name: Option[String]
                )

object TaggedSensor {
    /**
     * Creates the codec for converting TaggedSensor from and to JSON.
     */
    implicit val decoder: Decoder[TaggedSensor] = deriveDecoder
    implicit val encoder: ObjectEncoder[TaggedSensor] = deriveEncoder
}
