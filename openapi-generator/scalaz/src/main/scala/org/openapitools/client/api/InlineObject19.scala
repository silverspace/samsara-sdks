package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject19._

case class InlineObject19 (
  /* Group ID to query. */
  groupId: Long,
/* List of sensor IDs to query. */
  sensors: List[Long])

object InlineObject19 {
  import DateTimeCodecs._

  implicit val InlineObject19CodecJson: CodecJson[InlineObject19] = CodecJson.derive[InlineObject19]
  implicit val InlineObject19Decoder: EntityDecoder[InlineObject19] = jsonOf[InlineObject19]
  implicit val InlineObject19Encoder: EntityEncoder[InlineObject19] = jsonEncoderOf[InlineObject19]
}
