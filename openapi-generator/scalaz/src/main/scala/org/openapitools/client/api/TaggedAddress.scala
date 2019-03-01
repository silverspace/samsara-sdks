package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import TaggedAddress._

case class TaggedAddress (
  /* The ID of the address being tagged. */
  id: Long,
/* Name of the address being tagged. */
  name: Option[String])

object TaggedAddress {
  import DateTimeCodecs._

  implicit val TaggedAddressCodecJson: CodecJson[TaggedAddress] = CodecJson.derive[TaggedAddress]
  implicit val TaggedAddressDecoder: EntityDecoder[TaggedAddress] = jsonOf[TaggedAddress]
  implicit val TaggedAddressEncoder: EntityEncoder[TaggedAddress] = jsonEncoderOf[TaggedAddress]
}
