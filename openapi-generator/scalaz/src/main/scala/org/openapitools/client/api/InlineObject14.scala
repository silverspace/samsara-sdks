package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject14._

case class InlineObject14 (
  /* Group ID to query. */
  groupId: Long,
vehicles: List[Vehicle])

object InlineObject14 {
  import DateTimeCodecs._

  implicit val InlineObject14CodecJson: CodecJson[InlineObject14] = CodecJson.derive[InlineObject14]
  implicit val InlineObject14Decoder: EntityDecoder[InlineObject14] = jsonOf[InlineObject14]
  implicit val InlineObject14Encoder: EntityEncoder[InlineObject14] = jsonEncoderOf[InlineObject14]
}
