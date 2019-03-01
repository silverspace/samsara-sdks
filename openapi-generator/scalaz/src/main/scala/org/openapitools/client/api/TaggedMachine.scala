package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import TaggedMachine._

case class TaggedMachine (
  /* The ID of the Machine being tagged. */
  id: Long,
/* Name of the Machine being tagged. */
  name: Option[String])

object TaggedMachine {
  import DateTimeCodecs._

  implicit val TaggedMachineCodecJson: CodecJson[TaggedMachine] = CodecJson.derive[TaggedMachine]
  implicit val TaggedMachineDecoder: EntityDecoder[TaggedMachine] = jsonOf[TaggedMachine]
  implicit val TaggedMachineEncoder: EntityEncoder[TaggedMachine] = jsonEncoderOf[TaggedMachine]
}
