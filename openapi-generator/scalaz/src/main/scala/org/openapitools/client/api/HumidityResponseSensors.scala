package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import HumidityResponseSensors._

case class HumidityResponseSensors (
  /* Name of the sensor. */
  name: Option[String],
/* Currently reported relative humidity in percent, from 0-100. */
  humidity: Option[Integer],
/* ID of the sensor. */
  id: Option[Long])

object HumidityResponseSensors {
  import DateTimeCodecs._

  implicit val HumidityResponseSensorsCodecJson: CodecJson[HumidityResponseSensors] = CodecJson.derive[HumidityResponseSensors]
  implicit val HumidityResponseSensorsDecoder: EntityDecoder[HumidityResponseSensors] = jsonOf[HumidityResponseSensors]
  implicit val HumidityResponseSensorsEncoder: EntityEncoder[HumidityResponseSensors] = jsonEncoderOf[HumidityResponseSensors]
}
