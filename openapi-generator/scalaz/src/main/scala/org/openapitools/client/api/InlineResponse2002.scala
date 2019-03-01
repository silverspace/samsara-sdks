package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineResponse2002._

case class InlineResponse2002 (
  pagination: Option[Pagination],
/* Group ID to query. */
  groupId: Option[Long],
vehicles: Option[List[Vehicle]])

object InlineResponse2002 {
  import DateTimeCodecs._

  implicit val InlineResponse2002CodecJson: CodecJson[InlineResponse2002] = CodecJson.derive[InlineResponse2002]
  implicit val InlineResponse2002Decoder: EntityDecoder[InlineResponse2002] = jsonOf[InlineResponse2002]
  implicit val InlineResponse2002Encoder: EntityEncoder[InlineResponse2002] = jsonEncoderOf[InlineResponse2002]
}
