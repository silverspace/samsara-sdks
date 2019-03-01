package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import TaggedSensor._

case class TaggedSensor (
  /* The ID of the Sensor being tagged. */
  id: Long,
/* Name of the Sensor being tagged. */
  name: Option[String])

object TaggedSensor {
  import DateTimeCodecs._

  implicit val TaggedSensorCodecJson: CodecJson[TaggedSensor] = CodecJson.derive[TaggedSensor]
  implicit val TaggedSensorDecoder: EntityDecoder[TaggedSensor] = jsonOf[TaggedSensor]
  implicit val TaggedSensorEncoder: EntityEncoder[TaggedSensor] = jsonEncoderOf[TaggedSensor]
}
