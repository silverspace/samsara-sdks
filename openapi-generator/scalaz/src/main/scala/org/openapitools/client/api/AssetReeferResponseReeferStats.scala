package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AssetReeferResponseReeferStats._

case class AssetReeferResponseReeferStats (
  /* Fuel percentage of the reefer */
  fuelPercentage: Option[List[AssetReeferResponseReeferStatsFuelPercentage]],
/* Power status of the reefer */
  powerStatus: Option[List[AssetReeferResponseReeferStatsPowerStatus]],
/* Engine hours of the reefer */
  engineHours: Option[List[AssetReeferResponseReeferStatsEngineHours]],
/* Set point temperature of the reefer */
  setPoint: Option[List[AssetReeferResponseReeferStatsSetPoint]],
/* Return air temperature of the reefer */
  returnAirTemp: Option[List[AssetReeferResponseReeferStatsReturnAirTemp]],
/* Reefer alarms */
  alarms: Option[List[AssetReeferResponseReeferStatsAlarms1]])

object AssetReeferResponseReeferStats {
  import DateTimeCodecs._

  implicit val AssetReeferResponseReeferStatsCodecJson: CodecJson[AssetReeferResponseReeferStats] = CodecJson.derive[AssetReeferResponseReeferStats]
  implicit val AssetReeferResponseReeferStatsDecoder: EntityDecoder[AssetReeferResponseReeferStats] = jsonOf[AssetReeferResponseReeferStats]
  implicit val AssetReeferResponseReeferStatsEncoder: EntityEncoder[AssetReeferResponseReeferStats] = jsonEncoderOf[AssetReeferResponseReeferStats]
}
