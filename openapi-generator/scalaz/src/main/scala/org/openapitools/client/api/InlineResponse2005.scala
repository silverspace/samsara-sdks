package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineResponse2005._

case class InlineResponse2005 (
  pagination: Option[Pagination],
vehicleStats: List[InlineResponse2005VehicleStats])

object InlineResponse2005 {
  import DateTimeCodecs._

  implicit val InlineResponse2005CodecJson: CodecJson[InlineResponse2005] = CodecJson.derive[InlineResponse2005]
  implicit val InlineResponse2005Decoder: EntityDecoder[InlineResponse2005] = jsonOf[InlineResponse2005]
  implicit val InlineResponse2005Encoder: EntityEncoder[InlineResponse2005] = jsonEncoderOf[InlineResponse2005]
}
