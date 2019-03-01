package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param tempInMilliC Set point temperature in millidegree Celsius.
 * @param changedAtMs Timestamp in Unix milliseconds since epoch.
 */
case class AssetReeferResponseReeferStatsSetPoint(tempInMilliC: Option[Long],
                changedAtMs: Option[Long]
                )

object AssetReeferResponseReeferStatsSetPoint {
    /**
     * Creates the codec for converting AssetReeferResponseReeferStatsSetPoint from and to JSON.
     */
    implicit val decoder: Decoder[AssetReeferResponseReeferStatsSetPoint] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssetReeferResponseReeferStatsSetPoint] = deriveEncoder
}
