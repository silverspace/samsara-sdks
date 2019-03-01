package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject5._

case class InlineObject5 (
  /* End time (ms) of queried time period. */
  endMs: Long,
/* Org ID to query. */
  orgId: Long,
/* Start time (ms) of queried time period. */
  startMs: Long)

object InlineObject5 {
  import DateTimeCodecs._

  implicit val InlineObject5CodecJson: CodecJson[InlineObject5] = CodecJson.derive[InlineObject5]
  implicit val InlineObject5Decoder: EntityDecoder[InlineObject5] = jsonOf[InlineObject5]
  implicit val InlineObject5Encoder: EntityEncoder[InlineObject5] = jsonEncoderOf[InlineObject5]
}
