package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import TaggedMachineBase._

case class TaggedMachineBase (
  /* The ID of the Machine being tagged. */
  id: Long)

object TaggedMachineBase {
  import DateTimeCodecs._

  implicit val TaggedMachineBaseCodecJson: CodecJson[TaggedMachineBase] = CodecJson.derive[TaggedMachineBase]
  implicit val TaggedMachineBaseDecoder: EntityDecoder[TaggedMachineBase] = jsonOf[TaggedMachineBase]
  implicit val TaggedMachineBaseEncoder: EntityEncoder[TaggedMachineBase] = jsonEncoderOf[TaggedMachineBase]
}
