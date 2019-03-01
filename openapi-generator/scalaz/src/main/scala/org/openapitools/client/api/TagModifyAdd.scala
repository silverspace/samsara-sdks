package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import TagModifyAdd._

case class TagModifyAdd (
  /* The assets to be added to this tag. */
  assets: Option[List[TaggedAssetBase]],
/* The sensors to be added to this tag. */
  sensors: Option[List[TaggedSensorBase]],
/* The vehicles to be added to this tag. */
  vehicles: Option[List[TaggedVehicleBase]],
/* The machines to be added to this tag. */
  machines: Option[List[TaggedMachineBase]],
/* The drivers to be added to this tag. */
  drivers: Option[List[TaggedDriverBase]])

object TagModifyAdd {
  import DateTimeCodecs._

  implicit val TagModifyAddCodecJson: CodecJson[TagModifyAdd] = CodecJson.derive[TagModifyAdd]
  implicit val TagModifyAddDecoder: EntityDecoder[TagModifyAdd] = jsonOf[TagModifyAdd]
  implicit val TagModifyAddEncoder: EntityEncoder[TagModifyAdd] = jsonEncoderOf[TagModifyAdd]
}
