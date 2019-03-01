package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AssetReeferResponse._

case class AssetReeferResponse (
  /* Asset type */
  assetType: Option[String],
/* Asset ID */
  id: Option[Integer],
/* Asset name */
  name: Option[String],
reeferStats: Option[AssetReeferResponseReeferStats])

object AssetReeferResponse {
  import DateTimeCodecs._

  implicit val AssetReeferResponseCodecJson: CodecJson[AssetReeferResponse] = CodecJson.derive[AssetReeferResponse]
  implicit val AssetReeferResponseDecoder: EntityDecoder[AssetReeferResponse] = jsonOf[AssetReeferResponse]
  implicit val AssetReeferResponseEncoder: EntityEncoder[AssetReeferResponse] = jsonEncoderOf[AssetReeferResponse]
}
