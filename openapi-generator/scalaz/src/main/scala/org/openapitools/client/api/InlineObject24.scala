package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject24._

case class InlineObject24 (
  /* Group ID to query. */
  groupId: Long,
/* List of sensor IDs to query. */
  sensors: List[Long])

object InlineObject24 {
  import DateTimeCodecs._

  implicit val InlineObject24CodecJson: CodecJson[InlineObject24] = CodecJson.derive[InlineObject24]
  implicit val InlineObject24Decoder: EntityDecoder[InlineObject24] = jsonOf[InlineObject24]
  implicit val InlineObject24Encoder: EntityEncoder[InlineObject24] = jsonEncoderOf[InlineObject24]
}
