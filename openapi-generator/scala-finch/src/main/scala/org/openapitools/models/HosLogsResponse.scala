package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.HosLogsResponseLogs
import scala.collection.immutable.Seq

/**
 * 
 * @param logs 
 */
case class HosLogsResponse(logs: Option[Seq[HosLogsResponseLogs]]
                )

object HosLogsResponse {
    /**
     * Creates the codec for converting HosLogsResponse from and to JSON.
     */
    implicit val decoder: Decoder[HosLogsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[HosLogsResponse] = deriveEncoder
}
