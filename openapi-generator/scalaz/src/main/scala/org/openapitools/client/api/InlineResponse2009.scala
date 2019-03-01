package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineResponse2009._

case class InlineResponse2009 (
  tags: Option[List[Tag]])

object InlineResponse2009 {
  import DateTimeCodecs._

  implicit val InlineResponse2009CodecJson: CodecJson[InlineResponse2009] = CodecJson.derive[InlineResponse2009]
  implicit val InlineResponse2009Decoder: EntityDecoder[InlineResponse2009] = jsonOf[InlineResponse2009]
  implicit val InlineResponse2009Encoder: EntityEncoder[InlineResponse2009] = jsonEncoderOf[InlineResponse2009]
}
