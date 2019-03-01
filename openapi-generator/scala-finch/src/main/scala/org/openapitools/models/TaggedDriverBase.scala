package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id The ID of the Driver being tagged.
 */
case class TaggedDriverBase(id: Long
                )

object TaggedDriverBase {
    /**
     * Creates the codec for converting TaggedDriverBase from and to JSON.
     */
    implicit val decoder: Decoder[TaggedDriverBase] = deriveDecoder
    implicit val encoder: ObjectEncoder[TaggedDriverBase] = deriveEncoder
}
