package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineResponse2004._

case class InlineResponse2004 (
  vehicles: Option[List[VehicleMaintenance]])

object InlineResponse2004 {
  import DateTimeCodecs._

  implicit val InlineResponse2004CodecJson: CodecJson[InlineResponse2004] = CodecJson.derive[InlineResponse2004]
  implicit val InlineResponse2004Decoder: EntityDecoder[InlineResponse2004] = jsonOf[InlineResponse2004]
  implicit val InlineResponse2004Encoder: EntityEncoder[InlineResponse2004] = jsonEncoderOf[InlineResponse2004]
}
