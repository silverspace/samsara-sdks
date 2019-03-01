package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id The ID of the address being tagged.
 */
case class TaggedAddressBase(id: Long
                )

object TaggedAddressBase {
    /**
     * Creates the codec for converting TaggedAddressBase from and to JSON.
     */
    implicit val decoder: Decoder[TaggedAddressBase] = deriveDecoder
    implicit val encoder: ObjectEncoder[TaggedAddressBase] = deriveEncoder
}
