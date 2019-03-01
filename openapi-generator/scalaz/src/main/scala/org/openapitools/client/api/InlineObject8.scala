package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject8._

case class InlineObject8 (
  /* Driver ID to query. */
  driverId: Long,
/* End of the time range, specified in milliseconds UNIX time. */
  endMs: Integer,
/* Group ID to query. */
  groupId: Long,
/* Beginning of the time range, specified in milliseconds UNIX time. */
  startMs: Integer)

object InlineObject8 {
  import DateTimeCodecs._

  implicit val InlineObject8CodecJson: CodecJson[InlineObject8] = CodecJson.derive[InlineObject8]
  implicit val InlineObject8Decoder: EntityDecoder[InlineObject8] = jsonOf[InlineObject8]
  implicit val InlineObject8Encoder: EntityEncoder[InlineObject8] = jsonEncoderOf[InlineObject8]
}
