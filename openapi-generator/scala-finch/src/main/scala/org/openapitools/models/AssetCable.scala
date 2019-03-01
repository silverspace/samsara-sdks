package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param assetType Asset type
 */
case class AssetCable(assetType: Option[String]
                )

object AssetCable {
    /**
     * Creates the codec for converting AssetCable from and to JSON.
     */
    implicit val decoder: Decoder[AssetCable] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssetCable] = deriveEncoder
}
