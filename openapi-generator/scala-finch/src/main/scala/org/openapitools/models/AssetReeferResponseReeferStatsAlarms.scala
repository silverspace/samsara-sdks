package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param severity Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action
 * @param operatorAction Recommended operator action
 * @param description Description of the alarm
 * @param alarmCode ID of the alarm
 */
case class AssetReeferResponseReeferStatsAlarms(severity: Option[Long],
                operatorAction: Option[String],
                description: Option[String],
                alarmCode: Option[Long]
                )

object AssetReeferResponseReeferStatsAlarms {
    /**
     * Creates the codec for converting AssetReeferResponseReeferStatsAlarms from and to JSON.
     */
    implicit val decoder: Decoder[AssetReeferResponseReeferStatsAlarms] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssetReeferResponseReeferStatsAlarms] = deriveEncoder
}
