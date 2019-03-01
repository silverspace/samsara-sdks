package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import AuxInput._

case class AuxInput (
  /* Timestamp in Unix epoch milliseconds. */
  timeMs: Any,
/* Boolean representing the digital value of the aux input. */
  value: Boolean)

object AuxInput {
  import DateTimeCodecs._

  implicit val AuxInputCodecJson: CodecJson[AuxInput] = CodecJson.derive[AuxInput]
  implicit val AuxInputDecoder: EntityDecoder[AuxInput] = jsonOf[AuxInput]
  implicit val AuxInputEncoder: EntityEncoder[AuxInput] = jsonEncoderOf[AuxInput]
}
