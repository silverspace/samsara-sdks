package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param endMs End of the time range, specified in milliseconds UNIX time.
 * @param groupId Group ID to query.
 * @param startMs Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs
 * @param vehicleId Vehicle ID to query.
 */
case class InlineObject15(endMs: Int,
                groupId: Long,
                startMs: Int,
                vehicleId: Long
                )

object InlineObject15 {
    /**
     * Creates the codec for converting InlineObject15 from and to JSON.
     */
    implicit val decoder: Decoder[InlineObject15] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineObject15] = deriveEncoder
}
