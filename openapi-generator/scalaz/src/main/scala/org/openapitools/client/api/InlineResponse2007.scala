package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineResponse2007._

case class InlineResponse2007 (
  machines: Option[List[Machine]])

object InlineResponse2007 {
  import DateTimeCodecs._

  implicit val InlineResponse2007CodecJson: CodecJson[InlineResponse2007] = CodecJson.derive[InlineResponse2007]
  implicit val InlineResponse2007Decoder: EntityDecoder[InlineResponse2007] = jsonOf[InlineResponse2007]
  implicit val InlineResponse2007Encoder: EntityEncoder[InlineResponse2007] = jsonEncoderOf[InlineResponse2007]
}
