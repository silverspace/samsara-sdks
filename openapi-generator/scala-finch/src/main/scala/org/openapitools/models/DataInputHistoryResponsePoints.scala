package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param value 
 * @param timeMs 
 */
case class DataInputHistoryResponsePoints(value: Option[Double],
                timeMs: Option[Long]
                )

object DataInputHistoryResponsePoints {
    /**
     * Creates the codec for converting DataInputHistoryResponsePoints from and to JSON.
     */
    implicit val decoder: Decoder[DataInputHistoryResponsePoints] = deriveDecoder
    implicit val encoder: ObjectEncoder[DataInputHistoryResponsePoints] = deriveEncoder
}
