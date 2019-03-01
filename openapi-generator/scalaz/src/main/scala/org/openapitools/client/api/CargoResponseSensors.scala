package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import CargoResponseSensors._

case class CargoResponseSensors (
  /* Flag indicating whether the current cargo is empty or loaded. */
  cargoEmpty: Option[Boolean],
/* Name of the sensor. */
  name: Option[String],
/* ID of the sensor. */
  id: Option[Long])

object CargoResponseSensors {
  import DateTimeCodecs._

  implicit val CargoResponseSensorsCodecJson: CodecJson[CargoResponseSensors] = CodecJson.derive[CargoResponseSensors]
  implicit val CargoResponseSensorsDecoder: EntityDecoder[CargoResponseSensors] = jsonOf[CargoResponseSensors]
  implicit val CargoResponseSensorsEncoder: EntityEncoder[CargoResponseSensors] = jsonEncoderOf[CargoResponseSensors]
}
