package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject13._

case class InlineObject13 (
  /* Group ID to query. */
  groupId: Long)

object InlineObject13 {
  import DateTimeCodecs._

  implicit val InlineObject13CodecJson: CodecJson[InlineObject13] = CodecJson.derive[InlineObject13]
  implicit val InlineObject13Decoder: EntityDecoder[InlineObject13] = jsonOf[InlineObject13]
  implicit val InlineObject13Encoder: EntityEncoder[InlineObject13] = jsonEncoderOf[InlineObject13]
}
