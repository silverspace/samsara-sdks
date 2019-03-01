package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import TripResponseEndCoordinates._

case class TripResponseEndCoordinates (
  latitude: Option[Double],
longitude: Option[Double])

object TripResponseEndCoordinates {
  import DateTimeCodecs._

  implicit val TripResponseEndCoordinatesCodecJson: CodecJson[TripResponseEndCoordinates] = CodecJson.derive[TripResponseEndCoordinates]
  implicit val TripResponseEndCoordinatesDecoder: EntityDecoder[TripResponseEndCoordinates] = jsonOf[TripResponseEndCoordinates]
  implicit val TripResponseEndCoordinatesEncoder: EntityEncoder[TripResponseEndCoordinates] = jsonEncoderOf[TripResponseEndCoordinates]
}
