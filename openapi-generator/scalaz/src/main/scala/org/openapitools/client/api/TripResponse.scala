package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import TripResponse._

case class TripResponse (
  trips: Option[List[TripResponseTrips]])

object TripResponse {
  import DateTimeCodecs._

  implicit val TripResponseCodecJson: CodecJson[TripResponse] = CodecJson.derive[TripResponse]
  implicit val TripResponseDecoder: EntityDecoder[TripResponse] = jsonOf[TripResponse]
  implicit val TripResponseEncoder: EntityEncoder[TripResponse] = jsonEncoderOf[TripResponse]
}
