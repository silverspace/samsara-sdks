package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Digital value of an aux input.
 * @param timeMs Timestamp in Unix epoch milliseconds.
 * @param value Boolean representing the digital value of the aux input.
 */
case class AuxInput(timeMs: Object,
                value: Boolean
                )

object AuxInput {
    /**
     * Creates the codec for converting AuxInput from and to JSON.
     */
    implicit val decoder: Decoder[AuxInput] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuxInput] = deriveEncoder
}
