package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DoorResponseSensors._

case class DoorResponseSensors (
  /* Flag indicating whether the current door is closed or open. */
  doorClosed: Option[Boolean],
/* Name of the sensor. */
  name: Option[String],
/* ID of the sensor. */
  id: Option[Long])

object DoorResponseSensors {
  import DateTimeCodecs._

  implicit val DoorResponseSensorsCodecJson: CodecJson[DoorResponseSensors] = CodecJson.derive[DoorResponseSensors]
  implicit val DoorResponseSensorsDecoder: EntityDecoder[DoorResponseSensors] = jsonOf[DoorResponseSensors]
  implicit val DoorResponseSensorsEncoder: EntityEncoder[DoorResponseSensors] = jsonEncoderOf[DoorResponseSensors]
}
