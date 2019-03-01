package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject15._

case class InlineObject15 (
  /* End of the time range, specified in milliseconds UNIX time. */
  endMs: Integer,
/* Group ID to query. */
  groupId: Long,
/* Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs */
  startMs: Integer,
/* Vehicle ID to query. */
  vehicleId: Long)

object InlineObject15 {
  import DateTimeCodecs._

  implicit val InlineObject15CodecJson: CodecJson[InlineObject15] = CodecJson.derive[InlineObject15]
  implicit val InlineObject15Decoder: EntityDecoder[InlineObject15] = jsonOf[InlineObject15]
  implicit val InlineObject15Encoder: EntityEncoder[InlineObject15] = jsonEncoderOf[InlineObject15]
}
