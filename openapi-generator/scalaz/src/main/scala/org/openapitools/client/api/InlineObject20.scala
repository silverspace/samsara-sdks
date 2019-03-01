package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject20._

case class InlineObject20 (
  /* Group ID to query. */
  groupId: Long,
/* List of sensor IDs to query. */
  sensors: List[Long])

object InlineObject20 {
  import DateTimeCodecs._

  implicit val InlineObject20CodecJson: CodecJson[InlineObject20] = CodecJson.derive[InlineObject20]
  implicit val InlineObject20Decoder: EntityDecoder[InlineObject20] = jsonOf[InlineObject20]
  implicit val InlineObject20Encoder: EntityEncoder[InlineObject20] = jsonEncoderOf[InlineObject20]
}
