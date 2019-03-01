package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param groupId Group ID to query.
 * @param sensors List of sensor IDs to query.
 */
case class InlineObject22(groupId: Long,
                sensors: Seq[Long]
                )

object InlineObject22 {
    /**
     * Creates the codec for converting InlineObject22 from and to JSON.
     */
    implicit val decoder: Decoder[InlineObject22] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineObject22] = deriveEncoder
}
