package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import TaggedAddressBase._

case class TaggedAddressBase (
  /* The ID of the address being tagged. */
  id: Long)

object TaggedAddressBase {
  import DateTimeCodecs._

  implicit val TaggedAddressBaseCodecJson: CodecJson[TaggedAddressBase] = CodecJson.derive[TaggedAddressBase]
  implicit val TaggedAddressBaseDecoder: EntityDecoder[TaggedAddressBase] = jsonOf[TaggedAddressBase]
  implicit val TaggedAddressBaseEncoder: EntityEncoder[TaggedAddressBase] = jsonEncoderOf[TaggedAddressBase]
}
