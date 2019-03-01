package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param fuelPercentage Fuel percentage of the reefer.
 * @param changedAtMs Timestamp in Unix milliseconds since epoch.
 */
case class AssetReeferResponseReeferStatsFuelPercentage(fuelPercentage: Option[Long],
                changedAtMs: Option[Long]
                )

object AssetReeferResponseReeferStatsFuelPercentage {
    /**
     * Creates the codec for converting AssetReeferResponseReeferStatsFuelPercentage from and to JSON.
     */
    implicit val decoder: Decoder[AssetReeferResponseReeferStatsFuelPercentage] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssetReeferResponseReeferStatsFuelPercentage] = deriveEncoder
}
