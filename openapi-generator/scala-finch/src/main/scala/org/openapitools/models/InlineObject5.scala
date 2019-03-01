package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param endMs End time (ms) of queried time period.
 * @param orgId Org ID to query.
 * @param startMs Start time (ms) of queried time period.
 */
case class InlineObject5(endMs: Long,
                orgId: Long,
                startMs: Long
                )

object InlineObject5 {
    /**
     * Creates the codec for converting InlineObject5 from and to JSON.
     */
    implicit val decoder: Decoder[InlineObject5] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineObject5] = deriveEncoder
}
