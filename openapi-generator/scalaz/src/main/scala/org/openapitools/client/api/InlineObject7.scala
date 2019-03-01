package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject7._

case class InlineObject7 (
  /* Driver ID to query. */
  driverId: Long,
/* End of the time range, specified in milliseconds UNIX time. */
  endMs: Integer,
/* Group ID to query. */
  groupId: Long,
/* Beginning of the time range, specified in milliseconds UNIX time. */
  startMs: Integer)

object InlineObject7 {
  import DateTimeCodecs._

  implicit val InlineObject7CodecJson: CodecJson[InlineObject7] = CodecJson.derive[InlineObject7]
  implicit val InlineObject7Decoder: EntityDecoder[InlineObject7] = jsonOf[InlineObject7]
  implicit val InlineObject7Encoder: EntityEncoder[InlineObject7] = jsonEncoderOf[InlineObject7]
}
