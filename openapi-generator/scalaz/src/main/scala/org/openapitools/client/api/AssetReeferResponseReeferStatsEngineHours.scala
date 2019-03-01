package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AssetReeferResponseReeferStatsEngineHours._

case class AssetReeferResponseReeferStatsEngineHours (
  /* Engine hours of the reefer. */
  engineHours: Option[Long],
/* Timestamp in Unix milliseconds since epoch. */
  changedAtMs: Option[Long])

object AssetReeferResponseReeferStatsEngineHours {
  import DateTimeCodecs._

  implicit val AssetReeferResponseReeferStatsEngineHoursCodecJson: CodecJson[AssetReeferResponseReeferStatsEngineHours] = CodecJson.derive[AssetReeferResponseReeferStatsEngineHours]
  implicit val AssetReeferResponseReeferStatsEngineHoursDecoder: EntityDecoder[AssetReeferResponseReeferStatsEngineHours] = jsonOf[AssetReeferResponseReeferStatsEngineHours]
  implicit val AssetReeferResponseReeferStatsEngineHoursEncoder: EntityEncoder[AssetReeferResponseReeferStatsEngineHours] = jsonEncoderOf[AssetReeferResponseReeferStatsEngineHours]
}
