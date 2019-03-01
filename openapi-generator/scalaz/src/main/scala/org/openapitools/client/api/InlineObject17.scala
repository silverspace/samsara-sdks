package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject17._

case class InlineObject17 (
  /* End of the time range, specified in milliseconds UNIX time. */
  endMs: Integer,
/* Group ID to query. */
  groupId: Long,
/* Beginning of the time range, specified in milliseconds UNIX time. */
  startMs: Integer)

object InlineObject17 {
  import DateTimeCodecs._

  implicit val InlineObject17CodecJson: CodecJson[InlineObject17] = CodecJson.derive[InlineObject17]
  implicit val InlineObject17Decoder: EntityDecoder[InlineObject17] = jsonOf[InlineObject17]
  implicit val InlineObject17Encoder: EntityEncoder[InlineObject17] = jsonEncoderOf[InlineObject17]
}
