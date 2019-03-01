package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DvirBaseVehicle._

case class DvirBaseVehicle (
  /* The vehicle on which DVIR was done. */
  name: Option[String],
/* The vehicle id on which DVIR was done. */
  id: Option[Long])

object DvirBaseVehicle {
  import DateTimeCodecs._

  implicit val DvirBaseVehicleCodecJson: CodecJson[DvirBaseVehicle] = CodecJson.derive[DvirBaseVehicle]
  implicit val DvirBaseVehicleDecoder: EntityDecoder[DvirBaseVehicle] = jsonOf[DvirBaseVehicle]
  implicit val DvirBaseVehicleEncoder: EntityEncoder[DvirBaseVehicle] = jsonEncoderOf[DvirBaseVehicle]
}
