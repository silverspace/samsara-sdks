package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssetReeferResponseReeferStatsAlarms
import scala.collection.immutable.Seq

/**
 * 
 * @param alarms 
 * @param changedAtMs Timestamp when the alarms were reported, in Unix milliseconds since epoch
 */
case class AssetReeferResponseReeferStatsAlarms1(alarms: Option[Seq[AssetReeferResponseReeferStatsAlarms]],
                changedAtMs: Option[Long]
                )

object AssetReeferResponseReeferStatsAlarms1 {
    /**
     * Creates the codec for converting AssetReeferResponseReeferStatsAlarms1 from and to JSON.
     */
    implicit val decoder: Decoder[AssetReeferResponseReeferStatsAlarms1] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssetReeferResponseReeferStatsAlarms1] = deriveEncoder
}
