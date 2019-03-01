package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.SensorHistoryResponseResults
import scala.collection.immutable.Seq

/**
 * Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair.
 * @param results 
 */
case class SensorHistoryResponse(results: Option[Seq[SensorHistoryResponseResults]]
                )

object SensorHistoryResponse {
    /**
     * Creates the codec for converting SensorHistoryResponse from and to JSON.
     */
    implicit val decoder: Decoder[SensorHistoryResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[SensorHistoryResponse] = deriveEncoder
}
