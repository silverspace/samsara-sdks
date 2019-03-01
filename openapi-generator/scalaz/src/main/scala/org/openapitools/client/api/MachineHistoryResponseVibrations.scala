package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import MachineHistoryResponseVibrations._

case class MachineHistoryResponseVibrations (
  X: Option[Double],
Y: Option[Double],
Z: Option[Double],
time: Option[Long])

object MachineHistoryResponseVibrations {
  import DateTimeCodecs._

  implicit val MachineHistoryResponseVibrationsCodecJson: CodecJson[MachineHistoryResponseVibrations] = CodecJson.derive[MachineHistoryResponseVibrations]
  implicit val MachineHistoryResponseVibrationsDecoder: EntityDecoder[MachineHistoryResponseVibrations] = jsonOf[MachineHistoryResponseVibrations]
  implicit val MachineHistoryResponseVibrationsEncoder: EntityEncoder[MachineHistoryResponseVibrations] = jsonEncoderOf[MachineHistoryResponseVibrations]
}
