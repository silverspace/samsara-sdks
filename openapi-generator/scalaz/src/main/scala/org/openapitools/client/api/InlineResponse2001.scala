package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineResponse2001._

case class InlineResponse2001 (
  assets: Option[List[AssetCurrentLocationsResponse]])

object InlineResponse2001 {
  import DateTimeCodecs._

  implicit val InlineResponse2001CodecJson: CodecJson[InlineResponse2001] = CodecJson.derive[InlineResponse2001]
  implicit val InlineResponse2001Decoder: EntityDecoder[InlineResponse2001] = jsonOf[InlineResponse2001]
  implicit val InlineResponse2001Encoder: EntityEncoder[InlineResponse2001] = jsonEncoderOf[InlineResponse2001]
}
