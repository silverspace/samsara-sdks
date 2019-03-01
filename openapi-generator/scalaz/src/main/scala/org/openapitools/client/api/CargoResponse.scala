package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import CargoResponse._

case class CargoResponse (
  groupId: Option[Long],
sensors: Option[List[CargoResponseSensors]])

object CargoResponse {
  import DateTimeCodecs._

  implicit val CargoResponseCodecJson: CodecJson[CargoResponse] = CodecJson.derive[CargoResponse]
  implicit val CargoResponseDecoder: EntityDecoder[CargoResponse] = jsonOf[CargoResponse]
  implicit val CargoResponseEncoder: EntityEncoder[CargoResponse] = jsonEncoderOf[CargoResponse]
}
