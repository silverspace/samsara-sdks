package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param tempInMilliC Return air temperature in millidegree Celsius.
 * @param changedAtMs Timestamp in Unix milliseconds since epoch.
 */
case class AssetReeferResponseReeferStatsReturnAirTemp(tempInMilliC: Option[Long],
                changedAtMs: Option[Long]
                )

object AssetReeferResponseReeferStatsReturnAirTemp {
    /**
     * Creates the codec for converting AssetReeferResponseReeferStatsReturnAirTemp from and to JSON.
     */
    implicit val decoder: Decoder[AssetReeferResponseReeferStatsReturnAirTemp] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssetReeferResponseReeferStatsReturnAirTemp] = deriveEncoder
}
