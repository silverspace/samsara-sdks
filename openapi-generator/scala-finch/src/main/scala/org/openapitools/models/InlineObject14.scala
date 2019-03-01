package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Vehicle
import scala.collection.immutable.Seq

/**
 * 
 * @param groupId Group ID to query.
 * @param vehicles 
 */
case class InlineObject14(groupId: Long,
                vehicles: Seq[Vehicle]
                )

object InlineObject14 {
    /**
     * Creates the codec for converting InlineObject14 from and to JSON.
     */
    implicit val decoder: Decoder[InlineObject14] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineObject14] = deriveEncoder
}
