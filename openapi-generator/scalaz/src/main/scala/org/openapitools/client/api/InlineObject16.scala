package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject16._

case class InlineObject16 (
  externalIds: Option[Map[String, String]],
/* Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic */
  harshAccelSetting: Option[Integer],
/* Name */
  name: Option[String])

object InlineObject16 {
  import DateTimeCodecs._

  implicit val InlineObject16CodecJson: CodecJson[InlineObject16] = CodecJson.derive[InlineObject16]
  implicit val InlineObject16Decoder: EntityDecoder[InlineObject16] = jsonOf[InlineObject16]
  implicit val InlineObject16Encoder: EntityEncoder[InlineObject16] = jsonEncoderOf[InlineObject16]
}
