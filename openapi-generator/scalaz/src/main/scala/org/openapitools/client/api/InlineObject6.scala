package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject6._

case class InlineObject6 (
  /* Driver ID to query. */
  driverId: Long,
/* End of the time range, specified in milliseconds UNIX time. */
  endMs: Integer,
/* Group ID to query. */
  groupId: Long,
/* Beginning of the time range, specified in milliseconds UNIX time. */
  startMs: Integer)

object InlineObject6 {
  import DateTimeCodecs._

  implicit val InlineObject6CodecJson: CodecJson[InlineObject6] = CodecJson.derive[InlineObject6]
  implicit val InlineObject6Decoder: EntityDecoder[InlineObject6] = jsonOf[InlineObject6]
  implicit val InlineObject6Encoder: EntityEncoder[InlineObject6] = jsonEncoderOf[InlineObject6]
}
