package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import HumidityResponse._

case class HumidityResponse (
  groupId: Option[Long],
sensors: Option[List[HumidityResponseSensors]])

object HumidityResponse {
  import DateTimeCodecs._

  implicit val HumidityResponseCodecJson: CodecJson[HumidityResponse] = CodecJson.derive[HumidityResponse]
  implicit val HumidityResponseDecoder: EntityDecoder[HumidityResponse] = jsonOf[HumidityResponse]
  implicit val HumidityResponseEncoder: EntityEncoder[HumidityResponse] = jsonEncoderOf[HumidityResponse]
}
