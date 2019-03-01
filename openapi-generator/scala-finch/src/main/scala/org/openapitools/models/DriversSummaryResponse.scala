package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DriversSummaryResponseSummaries
import scala.collection.immutable.Seq

/**
 * 
 * @param Summaries 
 */
case class DriversSummaryResponse(Summaries: Option[Seq[DriversSummaryResponseSummaries]]
                )

object DriversSummaryResponse {
    /**
     * Creates the codec for converting DriversSummaryResponse from and to JSON.
     */
    implicit val decoder: Decoder[DriversSummaryResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[DriversSummaryResponse] = deriveEncoder
}
