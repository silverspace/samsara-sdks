package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AssetReeferResponseReeferStatsSetPoint._

case class AssetReeferResponseReeferStatsSetPoint (
  /* Set point temperature in millidegree Celsius. */
  tempInMilliC: Option[Long],
/* Timestamp in Unix milliseconds since epoch. */
  changedAtMs: Option[Long])

object AssetReeferResponseReeferStatsSetPoint {
  import DateTimeCodecs._

  implicit val AssetReeferResponseReeferStatsSetPointCodecJson: CodecJson[AssetReeferResponseReeferStatsSetPoint] = CodecJson.derive[AssetReeferResponseReeferStatsSetPoint]
  implicit val AssetReeferResponseReeferStatsSetPointDecoder: EntityDecoder[AssetReeferResponseReeferStatsSetPoint] = jsonOf[AssetReeferResponseReeferStatsSetPoint]
  implicit val AssetReeferResponseReeferStatsSetPointEncoder: EntityEncoder[AssetReeferResponseReeferStatsSetPoint] = jsonEncoderOf[AssetReeferResponseReeferStatsSetPoint]
}
