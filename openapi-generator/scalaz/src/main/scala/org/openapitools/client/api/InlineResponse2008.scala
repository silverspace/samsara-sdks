package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineResponse2008._

case class InlineResponse2008 (
  sensors: Option[List[Sensor]])

object InlineResponse2008 {
  import DateTimeCodecs._

  implicit val InlineResponse2008CodecJson: CodecJson[InlineResponse2008] = CodecJson.derive[InlineResponse2008]
  implicit val InlineResponse2008Decoder: EntityDecoder[InlineResponse2008] = jsonOf[InlineResponse2008]
  implicit val InlineResponse2008Encoder: EntityEncoder[InlineResponse2008] = jsonEncoderOf[InlineResponse2008]
}
