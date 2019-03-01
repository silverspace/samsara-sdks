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
case class InlineObject18(groupId: Long
                )

object InlineObject18 {
    /**
     * Creates the codec for converting InlineObject18 from and to JSON.
     */
    implicit val decoder: Decoder[InlineObject18] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineObject18] = deriveEncoder
}
