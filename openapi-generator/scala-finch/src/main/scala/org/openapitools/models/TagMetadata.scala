package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id The ID of this tag.
 * @param name Name of this tag.
 */
case class TagMetadata(id: Long,
                name: String
                )

object TagMetadata {
    /**
     * Creates the codec for converting TagMetadata from and to JSON.
     */
    implicit val decoder: Decoder[TagMetadata] = deriveDecoder
    implicit val encoder: ObjectEncoder[TagMetadata] = deriveEncoder
}
