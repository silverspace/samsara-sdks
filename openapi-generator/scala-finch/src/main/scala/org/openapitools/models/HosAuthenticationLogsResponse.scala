package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.HosAuthenticationLogsResponseAuthenticationLogs
import scala.collection.immutable.Seq

/**
 * 
 * @param authenticationLogs 
 */
case class HosAuthenticationLogsResponse(authenticationLogs: Option[Seq[HosAuthenticationLogsResponseAuthenticationLogs]]
                )

object HosAuthenticationLogsResponse {
    /**
     * Creates the codec for converting HosAuthenticationLogsResponse from and to JSON.
     */
    implicit val decoder: Decoder[HosAuthenticationLogsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[HosAuthenticationLogsResponse] = deriveEncoder
}
