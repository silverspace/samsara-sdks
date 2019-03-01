package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import TaggedVehicle._

case class TaggedVehicle (
  /* The ID of the Vehicle being tagged. */
  id: Long,
/* Name of the Vehicle being tagged. */
  name: Option[String])

object TaggedVehicle {
  import DateTimeCodecs._

  implicit val TaggedVehicleCodecJson: CodecJson[TaggedVehicle] = CodecJson.derive[TaggedVehicle]
  implicit val TaggedVehicleDecoder: EntityDecoder[TaggedVehicle] = jsonOf[TaggedVehicle]
  implicit val TaggedVehicleEncoder: EntityEncoder[TaggedVehicle] = jsonEncoderOf[TaggedVehicle]
}
