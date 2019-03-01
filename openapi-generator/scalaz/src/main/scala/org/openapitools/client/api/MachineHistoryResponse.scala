package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import MachineHistoryResponse._

case class MachineHistoryResponse (
  machines: Option[List[MachineHistoryResponseMachines]])

object MachineHistoryResponse {
  import DateTimeCodecs._

  implicit val MachineHistoryResponseCodecJson: CodecJson[MachineHistoryResponse] = CodecJson.derive[MachineHistoryResponse]
  implicit val MachineHistoryResponseDecoder: EntityDecoder[MachineHistoryResponse] = jsonOf[MachineHistoryResponse]
  implicit val MachineHistoryResponseEncoder: EntityEncoder[MachineHistoryResponse] = jsonEncoderOf[MachineHistoryResponse]
}
