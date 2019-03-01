package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineResponse200._

case class InlineResponse200 (
  assets: Option[List[Asset]])

object InlineResponse200 {
  import DateTimeCodecs._

  implicit val InlineResponse200CodecJson: CodecJson[InlineResponse200] = CodecJson.derive[InlineResponse200]
  implicit val InlineResponse200Decoder: EntityDecoder[InlineResponse200] = jsonOf[InlineResponse200]
  implicit val InlineResponse200Encoder: EntityEncoder[InlineResponse200] = jsonEncoderOf[InlineResponse200]
}
