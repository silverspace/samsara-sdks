package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TaggedDriverBase

/**
 * 
 * @param id The ID of the Driver being tagged.
 * @param name Name of the Driver being tagged.
 */
case class TaggedDriver(id: Long,
                name: Option[String]
                )

object TaggedDriver {
    /**
     * Creates the codec for converting TaggedDriver from and to JSON.
     */
    implicit val decoder: Decoder[TaggedDriver] = deriveDecoder
    implicit val encoder: ObjectEncoder[TaggedDriver] = deriveEncoder
}
