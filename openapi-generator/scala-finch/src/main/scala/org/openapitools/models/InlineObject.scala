package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AddressesAddresses
import scala.collection.immutable.Seq

/**
 * 
 * @param addresses 
 */
case class InlineObject(addresses: Seq[AddressesAddresses]
                )

object InlineObject {
    /**
     * Creates the codec for converting InlineObject from and to JSON.
     */
    implicit val decoder: Decoder[InlineObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineObject] = deriveEncoder
}
