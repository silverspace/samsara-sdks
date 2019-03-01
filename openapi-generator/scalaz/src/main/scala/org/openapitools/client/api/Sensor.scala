package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import Sensor._

case class Sensor (
  /* ID of the sensor. */
  id: Long,
/* MAC address of the sensor. */
  macAddress: Option[String],
/* Name of the sensor. */
  name: Option[String])

object Sensor {
  import DateTimeCodecs._

  implicit val SensorCodecJson: CodecJson[Sensor] = CodecJson.derive[Sensor]
  implicit val SensorDecoder: EntityDecoder[Sensor] = jsonOf[Sensor]
  implicit val SensorEncoder: EntityEncoder[Sensor] = jsonEncoderOf[Sensor]
}
