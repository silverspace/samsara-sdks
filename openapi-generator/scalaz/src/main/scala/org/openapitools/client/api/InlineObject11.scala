package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject11._

case class InlineObject11 (
  /* Group ID to query. */
  groupId: Long)

object InlineObject11 {
  import DateTimeCodecs._

  implicit val InlineObject11CodecJson: CodecJson[InlineObject11] = CodecJson.derive[InlineObject11]
  implicit val InlineObject11Decoder: EntityDecoder[InlineObject11] = jsonOf[InlineObject11]
  implicit val InlineObject11Encoder: EntityEncoder[InlineObject11] = jsonEncoderOf[InlineObject11]
}
