package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AssetReeferResponseReeferStatsPowerStatus._

case class AssetReeferResponseReeferStatsPowerStatus (
  /* Timestamp in Unix milliseconds since epoch. */
  changedAtMs: Option[Long],
/* Power status of the reefer. */
  status: Option[String])

object AssetReeferResponseReeferStatsPowerStatus {
  import DateTimeCodecs._

  implicit val AssetReeferResponseReeferStatsPowerStatusCodecJson: CodecJson[AssetReeferResponseReeferStatsPowerStatus] = CodecJson.derive[AssetReeferResponseReeferStatsPowerStatus]
  implicit val AssetReeferResponseReeferStatsPowerStatusDecoder: EntityDecoder[AssetReeferResponseReeferStatsPowerStatus] = jsonOf[AssetReeferResponseReeferStatsPowerStatus]
  implicit val AssetReeferResponseReeferStatsPowerStatusEncoder: EntityEncoder[AssetReeferResponseReeferStatsPowerStatus] = jsonEncoderOf[AssetReeferResponseReeferStatsPowerStatus]
}
