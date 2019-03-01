package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import MachineHistoryResponseMachines._

case class MachineHistoryResponseMachines (
  /* Machine name */
  name: Option[String],
/* Machine ID */
  id: Option[Integer],
/* List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s */
  vibrations: Option[List[MachineHistoryResponseVibrations]])

object MachineHistoryResponseMachines {
  import DateTimeCodecs._

  implicit val MachineHistoryResponseMachinesCodecJson: CodecJson[MachineHistoryResponseMachines] = CodecJson.derive[MachineHistoryResponseMachines]
  implicit val MachineHistoryResponseMachinesDecoder: EntityDecoder[MachineHistoryResponseMachines] = jsonOf[MachineHistoryResponseMachines]
  implicit val MachineHistoryResponseMachinesEncoder: EntityEncoder[MachineHistoryResponseMachines] = jsonEncoderOf[MachineHistoryResponseMachines]
}
