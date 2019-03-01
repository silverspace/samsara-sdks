package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineResponse2006._

case class InlineResponse2006 (
  dataInputs: Option[List[DataInputHistoryResponse]])

object InlineResponse2006 {
  import DateTimeCodecs._

  implicit val InlineResponse2006CodecJson: CodecJson[InlineResponse2006] = CodecJson.derive[InlineResponse2006]
  implicit val InlineResponse2006Decoder: EntityDecoder[InlineResponse2006] = jsonOf[InlineResponse2006]
  implicit val InlineResponse2006Encoder: EntityEncoder[InlineResponse2006] = jsonEncoderOf[InlineResponse2006]
}
