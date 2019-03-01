package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import TaggedVehicleBase._

case class TaggedVehicleBase (
  /* The ID of the Vehicle being tagged. */
  id: Long)

object TaggedVehicleBase {
  import DateTimeCodecs._

  implicit val TaggedVehicleBaseCodecJson: CodecJson[TaggedVehicleBase] = CodecJson.derive[TaggedVehicleBase]
  implicit val TaggedVehicleBaseDecoder: EntityDecoder[TaggedVehicleBase] = jsonOf[TaggedVehicleBase]
  implicit val TaggedVehicleBaseEncoder: EntityEncoder[TaggedVehicleBase] = jsonEncoderOf[TaggedVehicleBase]
}
