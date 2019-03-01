package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param driverId Driver ID to query.
 * @param endMs End of the time range, specified in milliseconds UNIX time.
 * @param groupId Group ID to query.
 * @param startMs Beginning of the time range, specified in milliseconds UNIX time.
 */
case class InlineObject6(driverId: Long,
                endMs: Int,
                groupId: Long,
                startMs: Int
                )

object InlineObject6 {
    /**
     * Creates the codec for converting InlineObject6 from and to JSON.
     */
    implicit val decoder: Decoder[InlineObject6] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineObject6] = deriveEncoder
}
