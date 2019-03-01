package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineResponse2003._

case class InlineResponse2003 (
  /* Group ID to query. */
  groupId: Option[Long],
vehicles: Option[List[VehicleLocation]])

object InlineResponse2003 {
  import DateTimeCodecs._

  implicit val InlineResponse2003CodecJson: CodecJson[InlineResponse2003] = CodecJson.derive[InlineResponse2003]
  implicit val InlineResponse2003Decoder: EntityDecoder[InlineResponse2003] = jsonOf[InlineResponse2003]
  implicit val InlineResponse2003Encoder: EntityEncoder[InlineResponse2003] = jsonEncoderOf[InlineResponse2003]
}
