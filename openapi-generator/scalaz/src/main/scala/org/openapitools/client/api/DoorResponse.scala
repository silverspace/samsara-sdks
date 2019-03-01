package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DoorResponse._

case class DoorResponse (
  groupId: Option[Long],
sensors: Option[List[DoorResponseSensors]])

object DoorResponse {
  import DateTimeCodecs._

  implicit val DoorResponseCodecJson: CodecJson[DoorResponse] = CodecJson.derive[DoorResponse]
  implicit val DoorResponseDecoder: EntityDecoder[DoorResponse] = jsonOf[DoorResponse]
  implicit val DoorResponseEncoder: EntityEncoder[DoorResponse] = jsonEncoderOf[DoorResponse]
}
