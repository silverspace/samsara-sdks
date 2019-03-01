package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject22._

case class InlineObject22 (
  /* Group ID to query. */
  groupId: Long,
/* List of sensor IDs to query. */
  sensors: List[Long])

object InlineObject22 {
  import DateTimeCodecs._

  implicit val InlineObject22CodecJson: CodecJson[InlineObject22] = CodecJson.derive[InlineObject22]
  implicit val InlineObject22Decoder: EntityDecoder[InlineObject22] = jsonOf[InlineObject22]
  implicit val InlineObject22Encoder: EntityEncoder[InlineObject22] = jsonEncoderOf[InlineObject22]
}
