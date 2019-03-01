package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import TemperatureResponseSensors._

case class TemperatureResponseSensors (
  /* Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported. */
  probeTemperature: Option[Integer],
/* Name of the sensor. */
  name: Option[String],
/* ID of the sensor. */
  id: Option[Long],
/* Currently reported ambient temperature in millidegrees celsius. */
  ambientTemperature: Option[Integer])

object TemperatureResponseSensors {
  import DateTimeCodecs._

  implicit val TemperatureResponseSensorsCodecJson: CodecJson[TemperatureResponseSensors] = CodecJson.derive[TemperatureResponseSensors]
  implicit val TemperatureResponseSensorsDecoder: EntityDecoder[TemperatureResponseSensors] = jsonOf[TemperatureResponseSensors]
  implicit val TemperatureResponseSensorsEncoder: EntityEncoder[TemperatureResponseSensors] = jsonEncoderOf[TemperatureResponseSensors]
}
