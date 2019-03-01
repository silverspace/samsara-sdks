package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import TaggedAsset._

case class TaggedAsset (
  /* The ID of the Asset being tagged. */
  id: Long,
/* Name of the Asset being tagged. */
  name: Option[String])

object TaggedAsset {
  import DateTimeCodecs._

  implicit val TaggedAssetCodecJson: CodecJson[TaggedAsset] = CodecJson.derive[TaggedAsset]
  implicit val TaggedAssetDecoder: EntityDecoder[TaggedAsset] = jsonOf[TaggedAsset]
  implicit val TaggedAssetEncoder: EntityEncoder[TaggedAsset] = jsonEncoderOf[TaggedAsset]
}
