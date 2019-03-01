package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject4._

case class InlineObject4 (
  /* True indicates that this driver should be reactivated. */
  reactivate: Boolean)

object InlineObject4 {
  import DateTimeCodecs._

  implicit val InlineObject4CodecJson: CodecJson[InlineObject4] = CodecJson.derive[InlineObject4]
  implicit val InlineObject4Decoder: EntityDecoder[InlineObject4] = jsonOf[InlineObject4]
  implicit val InlineObject4Encoder: EntityEncoder[InlineObject4] = jsonEncoderOf[InlineObject4]
}
