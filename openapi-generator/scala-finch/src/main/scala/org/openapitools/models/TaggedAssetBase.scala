package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id The ID of the Asset being tagged.
 */
case class TaggedAssetBase(id: Long
                )

object TaggedAssetBase {
    /**
     * Creates the codec for converting TaggedAssetBase from and to JSON.
     */
    implicit val decoder: Decoder[TaggedAssetBase] = deriveDecoder
    implicit val encoder: ObjectEncoder[TaggedAssetBase] = deriveEncoder
}
