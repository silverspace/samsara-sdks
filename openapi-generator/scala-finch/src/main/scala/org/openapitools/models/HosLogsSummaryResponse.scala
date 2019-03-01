package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.HosLogsSummaryResponseDrivers
import scala.collection.immutable.Seq

/**
 * 
 * @param drivers 
 */
case class HosLogsSummaryResponse(drivers: Option[Seq[HosLogsSummaryResponseDrivers]]
                )

object HosLogsSummaryResponse {
    /**
     * Creates the codec for converting HosLogsSummaryResponse from and to JSON.
     */
    implicit val decoder: Decoder[HosLogsSummaryResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[HosLogsSummaryResponse] = deriveEncoder
}
