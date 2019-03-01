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
case class InlineObject19(groupId: Long,
                sensors: Seq[Long]
                )

object InlineObject19 {
    /**
     * Creates the codec for converting InlineObject19 from and to JSON.
     */
    implicit val decoder: Decoder[InlineObject19] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineObject19] = deriveEncoder
}
