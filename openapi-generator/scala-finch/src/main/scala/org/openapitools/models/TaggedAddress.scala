package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TaggedAddressBase

/**
 * 
 * @param id The ID of the address being tagged.
 * @param name Name of the address being tagged.
 */
case class TaggedAddress(id: Long,
                name: Option[String]
                )

object TaggedAddress {
    /**
     * Creates the codec for converting TaggedAddress from and to JSON.
     */
    implicit val decoder: Decoder[TaggedAddress] = deriveDecoder
    implicit val encoder: ObjectEncoder[TaggedAddress] = deriveEncoder
}
