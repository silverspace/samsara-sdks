package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param engineHours Engine hours of the reefer.
 * @param changedAtMs Timestamp in Unix milliseconds since epoch.
 */
case class AssetReeferResponseReeferStatsEngineHours(engineHours: Option[Long],
                changedAtMs: Option[Long]
                )

object AssetReeferResponseReeferStatsEngineHours {
    /**
     * Creates the codec for converting AssetReeferResponseReeferStatsEngineHours from and to JSON.
     */
    implicit val decoder: Decoder[AssetReeferResponseReeferStatsEngineHours] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssetReeferResponseReeferStatsEngineHours] = deriveEncoder
}
