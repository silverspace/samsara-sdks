package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id The ID of the Sensor being tagged.
 */
case class TaggedSensorBase(id: Long
                )

object TaggedSensorBase {
    /**
     * Creates the codec for converting TaggedSensorBase from and to JSON.
     */
    implicit val decoder: Decoder[TaggedSensorBase] = deriveDecoder
    implicit val encoder: ObjectEncoder[TaggedSensorBase] = deriveEncoder
}
