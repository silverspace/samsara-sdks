package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import TagModifyDelete._

case class TagModifyDelete (
  /* The assets to be removed from this tag. */
  assets: Option[List[TaggedAssetBase]],
/* The sensors to be removed from this tag. */
  sensors: Option[List[TaggedSensorBase]],
/* The vehicles to be removed from this tag. */
  vehicles: Option[List[TaggedVehicleBase]],
/* The machines to be removed from this tag. */
  machines: Option[List[TaggedMachineBase]],
/* The drivers to be removed from this tag. */
  drivers: Option[List[TaggedDriverBase]])

object TagModifyDelete {
  import DateTimeCodecs._

  implicit val TagModifyDeleteCodecJson: CodecJson[TagModifyDelete] = CodecJson.derive[TagModifyDelete]
  implicit val TagModifyDeleteDecoder: EntityDecoder[TagModifyDelete] = jsonOf[TagModifyDelete]
  implicit val TagModifyDeleteEncoder: EntityEncoder[TagModifyDelete] = jsonEncoderOf[TagModifyDelete]
}
