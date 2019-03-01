package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssetReeferResponseReeferStats

/**
 * Reefer-specific asset details
 * @param assetType Asset type
 * @param id Asset ID
 * @param name Asset name
 * @param reeferStats 
 */
case class AssetReeferResponse(assetType: Option[String],
                id: Option[Int],
                name: Option[String],
                reeferStats: Option[AssetReeferResponseReeferStats]
                )

object AssetReeferResponse {
    /**
     * Creates the codec for converting AssetReeferResponse from and to JSON.
     */
    implicit val decoder: Decoder[AssetReeferResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssetReeferResponse] = deriveEncoder
}
