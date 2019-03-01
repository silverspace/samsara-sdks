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
case class InlineObject9(groupId: Long
                )

object InlineObject9 {
    /**
     * Creates the codec for converting InlineObject9 from and to JSON.
     */
    implicit val decoder: Decoder[InlineObject9] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineObject9] = deriveEncoder
}
