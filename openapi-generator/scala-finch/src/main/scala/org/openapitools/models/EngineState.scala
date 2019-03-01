package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The state of the vehicle over time. State can be Running, Off, or Idle.
 * @param timeMs Timestamp in Unix epoch milliseconds.
 * @param value 
 */
case class EngineState(timeMs: Object,
                value: String
                )

object EngineState {
    /**
     * Creates the codec for converting EngineState from and to JSON.
     */
    implicit val decoder: Decoder[EngineState] = deriveDecoder
    implicit val encoder: ObjectEncoder[EngineState] = deriveEncoder
}
