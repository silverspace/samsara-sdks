package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AssetReeferResponseReeferStatsAlarms1._

case class AssetReeferResponseReeferStatsAlarms1 (
  alarms: Option[List[AssetReeferResponseReeferStatsAlarms]],
/* Timestamp when the alarms were reported, in Unix milliseconds since epoch */
  changedAtMs: Option[Long])

object AssetReeferResponseReeferStatsAlarms1 {
  import DateTimeCodecs._

  implicit val AssetReeferResponseReeferStatsAlarms1CodecJson: CodecJson[AssetReeferResponseReeferStatsAlarms1] = CodecJson.derive[AssetReeferResponseReeferStatsAlarms1]
  implicit val AssetReeferResponseReeferStatsAlarms1Decoder: EntityDecoder[AssetReeferResponseReeferStatsAlarms1] = jsonOf[AssetReeferResponseReeferStatsAlarms1]
  implicit val AssetReeferResponseReeferStatsAlarms1Encoder: EntityEncoder[AssetReeferResponseReeferStatsAlarms1] = jsonEncoderOf[AssetReeferResponseReeferStatsAlarms1]
}
