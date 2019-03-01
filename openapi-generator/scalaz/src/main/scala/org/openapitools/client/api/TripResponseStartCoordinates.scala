package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import TripResponseStartCoordinates._

case class TripResponseStartCoordinates (
  latitude: Option[Double],
longitude: Option[Double])

object TripResponseStartCoordinates {
  import DateTimeCodecs._

  implicit val TripResponseStartCoordinatesCodecJson: CodecJson[TripResponseStartCoordinates] = CodecJson.derive[TripResponseStartCoordinates]
  implicit val TripResponseStartCoordinatesDecoder: EntityDecoder[TripResponseStartCoordinates] = jsonOf[TripResponseStartCoordinates]
  implicit val TripResponseStartCoordinatesEncoder: EntityEncoder[TripResponseStartCoordinates] = jsonEncoderOf[TripResponseStartCoordinates]
}
