package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject18._

case class InlineObject18 (
  /* Group ID to query. */
  groupId: Long)

object InlineObject18 {
  import DateTimeCodecs._

  implicit val InlineObject18CodecJson: CodecJson[InlineObject18] = CodecJson.derive[InlineObject18]
  implicit val InlineObject18Decoder: EntityDecoder[InlineObject18] = jsonOf[InlineObject18]
  implicit val InlineObject18Encoder: EntityEncoder[InlineObject18] = jsonEncoderOf[InlineObject18]
}
