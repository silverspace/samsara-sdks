package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject23._

case class InlineObject23 (
  /* Group ID to query. */
  groupId: Long)

object InlineObject23 {
  import DateTimeCodecs._

  implicit val InlineObject23CodecJson: CodecJson[InlineObject23] = CodecJson.derive[InlineObject23]
  implicit val InlineObject23Decoder: EntityDecoder[InlineObject23] = jsonOf[InlineObject23]
  implicit val InlineObject23Encoder: EntityEncoder[InlineObject23] = jsonEncoderOf[InlineObject23]
}
