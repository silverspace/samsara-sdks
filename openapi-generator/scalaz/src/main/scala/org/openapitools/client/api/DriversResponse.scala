package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DriversResponse._

case class DriversResponse (
  drivers: Option[List[Driver]])

object DriversResponse {
  import DateTimeCodecs._

  implicit val DriversResponseCodecJson: CodecJson[DriversResponse] = CodecJson.derive[DriversResponse]
  implicit val DriversResponseDecoder: EntityDecoder[DriversResponse] = jsonOf[DriversResponse]
  implicit val DriversResponseEncoder: EntityEncoder[DriversResponse] = jsonEncoderOf[DriversResponse]
}
