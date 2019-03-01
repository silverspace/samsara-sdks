package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import TaggedAssetBase._

case class TaggedAssetBase (
  /* The ID of the Asset being tagged. */
  id: Long)

object TaggedAssetBase {
  import DateTimeCodecs._

  implicit val TaggedAssetBaseCodecJson: CodecJson[TaggedAssetBase] = CodecJson.derive[TaggedAssetBase]
  implicit val TaggedAssetBaseDecoder: EntityDecoder[TaggedAssetBase] = jsonOf[TaggedAssetBase]
  implicit val TaggedAssetBaseEncoder: EntityEncoder[TaggedAssetBase] = jsonEncoderOf[TaggedAssetBase]
}
