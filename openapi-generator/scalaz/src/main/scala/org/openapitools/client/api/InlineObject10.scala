package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject10._

case class InlineObject10 (
  /* Group ID to query. */
  groupId: Long)

object InlineObject10 {
  import DateTimeCodecs._

  implicit val InlineObject10CodecJson: CodecJson[InlineObject10] = CodecJson.derive[InlineObject10]
  implicit val InlineObject10Decoder: EntityDecoder[InlineObject10] = jsonOf[InlineObject10]
  implicit val InlineObject10Encoder: EntityEncoder[InlineObject10] = jsonEncoderOf[InlineObject10]
}
