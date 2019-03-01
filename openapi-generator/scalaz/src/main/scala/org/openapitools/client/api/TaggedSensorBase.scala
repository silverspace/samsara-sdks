package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import TaggedSensorBase._

case class TaggedSensorBase (
  /* The ID of the Sensor being tagged. */
  id: Long)

object TaggedSensorBase {
  import DateTimeCodecs._

  implicit val TaggedSensorBaseCodecJson: CodecJson[TaggedSensorBase] = CodecJson.derive[TaggedSensorBase]
  implicit val TaggedSensorBaseDecoder: EntityDecoder[TaggedSensorBase] = jsonOf[TaggedSensorBase]
  implicit val TaggedSensorBaseEncoder: EntityEncoder[TaggedSensorBase] = jsonEncoderOf[TaggedSensorBase]
}
