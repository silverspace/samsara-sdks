package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TaggedAssetBase

/**
 * 
 * @param id The ID of the Asset being tagged.
 * @param name Name of the Asset being tagged.
 */
case class TaggedAsset(id: Long,
                name: Option[String]
                )

object TaggedAsset {
    /**
     * Creates the codec for converting TaggedAsset from and to JSON.
     */
    implicit val decoder: Decoder[TaggedAsset] = deriveDecoder
    implicit val encoder: ObjectEncoder[TaggedAsset] = deriveEncoder
}
