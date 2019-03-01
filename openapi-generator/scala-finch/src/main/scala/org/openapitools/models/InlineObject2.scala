package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param address The address of the entry to add, as it would be recognized if provided to maps.google.com.
 * @param groupId Group ID to query.
 * @param name Name of the location to add to the address book.
 * @param radius Radius in meters of the address (used for matching vehicle trip stops to this location).
 */
case class InlineObject2(address: String,
                groupId: Long,
                name: String,
                radius: Int
                )

object InlineObject2 {
    /**
     * Creates the codec for converting InlineObject2 from and to JSON.
     */
    implicit val decoder: Decoder[InlineObject2] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineObject2] = deriveEncoder
}
