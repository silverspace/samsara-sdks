package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AssetReeferResponseReeferStatsAlarms._

case class AssetReeferResponseReeferStatsAlarms (
  /* Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action */
  severity: Option[Long],
/* Recommended operator action */
  operatorAction: Option[String],
/* Description of the alarm */
  description: Option[String],
/* ID of the alarm */
  alarmCode: Option[Long])

object AssetReeferResponseReeferStatsAlarms {
  import DateTimeCodecs._

  implicit val AssetReeferResponseReeferStatsAlarmsCodecJson: CodecJson[AssetReeferResponseReeferStatsAlarms] = CodecJson.derive[AssetReeferResponseReeferStatsAlarms]
  implicit val AssetReeferResponseReeferStatsAlarmsDecoder: EntityDecoder[AssetReeferResponseReeferStatsAlarms] = jsonOf[AssetReeferResponseReeferStatsAlarms]
  implicit val AssetReeferResponseReeferStatsAlarmsEncoder: EntityEncoder[AssetReeferResponseReeferStatsAlarms] = jsonEncoderOf[AssetReeferResponseReeferStatsAlarms]
}
