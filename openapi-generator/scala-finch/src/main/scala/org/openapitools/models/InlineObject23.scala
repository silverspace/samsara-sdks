package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param groupId Group ID to query.
 */
case class InlineObject23(groupId: Long
                )

object InlineObject23 {
    /**
     * Creates the codec for converting InlineObject23 from and to JSON.
     */
    implicit val decoder: Decoder[InlineObject23] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineObject23] = deriveEncoder
}
