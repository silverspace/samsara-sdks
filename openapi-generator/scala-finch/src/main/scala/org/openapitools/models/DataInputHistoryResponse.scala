package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DataInputHistoryResponsePoints
import scala.collection.immutable.Seq

/**
 * 
 * @param id The ID of this data input
 * @param name Name of this data input
 * @param points Data points from this data input
 */
case class DataInputHistoryResponse(id: Option[Long],
                name: String,
                points: Option[Seq[DataInputHistoryResponsePoints]]
                )

object DataInputHistoryResponse {
    /**
     * Creates the codec for converting DataInputHistoryResponse from and to JSON.
     */
    implicit val decoder: Decoder[DataInputHistoryResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[DataInputHistoryResponse] = deriveEncoder
}
