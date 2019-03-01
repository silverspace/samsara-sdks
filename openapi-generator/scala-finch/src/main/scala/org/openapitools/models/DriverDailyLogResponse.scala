package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DriverDailyLogResponseDays
import scala.collection.immutable.Seq

/**
 * 
 * @param days 
 */
case class DriverDailyLogResponse(days: Option[Seq[DriverDailyLogResponseDays]]
                )

object DriverDailyLogResponse {
    /**
     * Creates the codec for converting DriverDailyLogResponse from and to JSON.
     */
    implicit val decoder: Decoder[DriverDailyLogResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[DriverDailyLogResponse] = deriveEncoder
}
