package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject9._

case class InlineObject9 (
  /* Group ID to query. */
  groupId: Long)

object InlineObject9 {
  import DateTimeCodecs._

  implicit val InlineObject9CodecJson: CodecJson[InlineObject9] = CodecJson.derive[InlineObject9]
  implicit val InlineObject9Decoder: EntityDecoder[InlineObject9] = jsonOf[InlineObject9]
  implicit val InlineObject9Encoder: EntityEncoder[InlineObject9] = jsonEncoderOf[InlineObject9]
}
