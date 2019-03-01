package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import TaggedDriver._

case class TaggedDriver (
  /* The ID of the Driver being tagged. */
  id: Long,
/* Name of the Driver being tagged. */
  name: Option[String])

object TaggedDriver {
  import DateTimeCodecs._

  implicit val TaggedDriverCodecJson: CodecJson[TaggedDriver] = CodecJson.derive[TaggedDriver]
  implicit val TaggedDriverDecoder: EntityDecoder[TaggedDriver] = jsonOf[TaggedDriver]
  implicit val TaggedDriverEncoder: EntityEncoder[TaggedDriver] = jsonEncoderOf[TaggedDriver]
}
