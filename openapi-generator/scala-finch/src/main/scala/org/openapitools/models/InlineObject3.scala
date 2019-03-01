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
case class InlineObject3(groupId: Long
                )

object InlineObject3 {
    /**
     * Creates the codec for converting InlineObject3 from and to JSON.
     */
    implicit val decoder: Decoder[InlineObject3] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineObject3] = deriveEncoder
}
