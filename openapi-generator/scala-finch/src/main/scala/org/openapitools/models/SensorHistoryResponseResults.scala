package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param series List of datapoints, one for each requested (sensor, field) pair.
 * @param timeMs Timestamp in UNIX milliseconds.
 */
case class SensorHistoryResponseResults(series: Option[Seq[Long]],
                timeMs: Option[Int]
                )

object SensorHistoryResponseResults {
    /**
     * Creates the codec for converting SensorHistoryResponseResults from and to JSON.
     */
    implicit val decoder: Decoder[SensorHistoryResponseResults] = deriveDecoder
    implicit val encoder: ObjectEncoder[SensorHistoryResponseResults] = deriveEncoder
}
