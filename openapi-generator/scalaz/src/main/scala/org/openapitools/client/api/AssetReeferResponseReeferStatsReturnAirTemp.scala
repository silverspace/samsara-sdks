package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AssetReeferResponseReeferStatsReturnAirTemp._

case class AssetReeferResponseReeferStatsReturnAirTemp (
  /* Return air temperature in millidegree Celsius. */
  tempInMilliC: Option[Long],
/* Timestamp in Unix milliseconds since epoch. */
  changedAtMs: Option[Long])

object AssetReeferResponseReeferStatsReturnAirTemp {
  import DateTimeCodecs._

  implicit val AssetReeferResponseReeferStatsReturnAirTempCodecJson: CodecJson[AssetReeferResponseReeferStatsReturnAirTemp] = CodecJson.derive[AssetReeferResponseReeferStatsReturnAirTemp]
  implicit val AssetReeferResponseReeferStatsReturnAirTempDecoder: EntityDecoder[AssetReeferResponseReeferStatsReturnAirTemp] = jsonOf[AssetReeferResponseReeferStatsReturnAirTemp]
  implicit val AssetReeferResponseReeferStatsReturnAirTempEncoder: EntityEncoder[AssetReeferResponseReeferStatsReturnAirTemp] = jsonEncoderOf[AssetReeferResponseReeferStatsReturnAirTemp]
}
