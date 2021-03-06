package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineObject._

case class InlineObject (
  addresses: List[AddressesAddresses])

object InlineObject {
  import DateTimeCodecs._

  implicit val InlineObjectCodecJson: CodecJson[InlineObject] = CodecJson.derive[InlineObject]
  implicit val InlineObjectDecoder: EntityDecoder[InlineObject] = jsonOf[InlineObject]
  implicit val InlineObjectEncoder: EntityEncoder[InlineObject] = jsonEncoderOf[InlineObject]
}
