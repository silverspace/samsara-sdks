package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject3._

case class InlineObject3 (
  /* Group ID to query. */
  groupId: Long)

object InlineObject3 {
  import DateTimeCodecs._

  implicit val InlineObject3CodecJson: CodecJson[InlineObject3] = CodecJson.derive[InlineObject3]
  implicit val InlineObject3Decoder: EntityDecoder[InlineObject3] = jsonOf[InlineObject3]
  implicit val InlineObject3Encoder: EntityEncoder[InlineObject3] = jsonEncoderOf[InlineObject3]
}
