package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import Machine._

case class Machine (
  /* ID of the machine. */
  id: Long,
/* Name of the machine. */
  name: Option[String],
/* Notes about the machine */
  notes: Option[String])

object Machine {
  import DateTimeCodecs._

  implicit val MachineCodecJson: CodecJson[Machine] = CodecJson.derive[Machine]
  implicit val MachineDecoder: EntityDecoder[Machine] = jsonOf[Machine]
  implicit val MachineEncoder: EntityEncoder[Machine] = jsonEncoderOf[Machine]
}
