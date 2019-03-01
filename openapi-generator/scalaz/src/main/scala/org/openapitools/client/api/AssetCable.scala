package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AssetCable._

case class AssetCable (
  /* Asset type */
  assetType: Option[String])

object AssetCable {
  import DateTimeCodecs._

  implicit val AssetCableCodecJson: CodecJson[AssetCable] = CodecJson.derive[AssetCable]
  implicit val AssetCableDecoder: EntityDecoder[AssetCable] = jsonOf[AssetCable]
  implicit val AssetCableEncoder: EntityEncoder[AssetCable] = jsonEncoderOf[AssetCable]
}
