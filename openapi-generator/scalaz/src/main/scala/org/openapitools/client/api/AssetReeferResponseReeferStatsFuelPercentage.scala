package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AssetReeferResponseReeferStatsFuelPercentage._

case class AssetReeferResponseReeferStatsFuelPercentage (
  /* Fuel percentage of the reefer. */
  fuelPercentage: Option[Long],
/* Timestamp in Unix milliseconds since epoch. */
  changedAtMs: Option[Long])

object AssetReeferResponseReeferStatsFuelPercentage {
  import DateTimeCodecs._

  implicit val AssetReeferResponseReeferStatsFuelPercentageCodecJson: CodecJson[AssetReeferResponseReeferStatsFuelPercentage] = CodecJson.derive[AssetReeferResponseReeferStatsFuelPercentage]
  implicit val AssetReeferResponseReeferStatsFuelPercentageDecoder: EntityDecoder[AssetReeferResponseReeferStatsFuelPercentage] = jsonOf[AssetReeferResponseReeferStatsFuelPercentage]
  implicit val AssetReeferResponseReeferStatsFuelPercentageEncoder: EntityEncoder[AssetReeferResponseReeferStatsFuelPercentage] = jsonEncoderOf[AssetReeferResponseReeferStatsFuelPercentage]
}
