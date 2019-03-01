package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssetReeferResponseReeferStatsAlarms1
import org.openapitools.models.AssetReeferResponseReeferStatsEngineHours
import org.openapitools.models.AssetReeferResponseReeferStatsFuelPercentage
import org.openapitools.models.AssetReeferResponseReeferStatsPowerStatus
import org.openapitools.models.AssetReeferResponseReeferStatsReturnAirTemp
import org.openapitools.models.AssetReeferResponseReeferStatsSetPoint
import scala.collection.immutable.Seq

/**
 * 
 * @param fuelPercentage Fuel percentage of the reefer
 * @param powerStatus Power status of the reefer
 * @param engineHours Engine hours of the reefer
 * @param setPoint Set point temperature of the reefer
 * @param returnAirTemp Return air temperature of the reefer
 * @param alarms Reefer alarms
 */
case class AssetReeferResponseReeferStats(fuelPercentage: Option[Seq[AssetReeferResponseReeferStatsFuelPercentage]],
                powerStatus: Option[Seq[AssetReeferResponseReeferStatsPowerStatus]],
                engineHours: Option[Seq[AssetReeferResponseReeferStatsEngineHours]],
                setPoint: Option[Seq[AssetReeferResponseReeferStatsSetPoint]],
                returnAirTemp: Option[Seq[AssetReeferResponseReeferStatsReturnAirTemp]],
                alarms: Option[Seq[AssetReeferResponseReeferStatsAlarms1]]
                )

object AssetReeferResponseReeferStats {
    /**
     * Creates the codec for converting AssetReeferResponseReeferStats from and to JSON.
     */
    implicit val decoder: Decoder[AssetReeferResponseReeferStats] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssetReeferResponseReeferStats] = deriveEncoder
}
