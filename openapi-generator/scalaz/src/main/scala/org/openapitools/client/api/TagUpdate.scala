package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import TagUpdate._

case class TagUpdate (
  /* The assets that belong to this tag. */
  assets: Option[List[TaggedAssetBase]],
/* The drivers that belong to this tag. */
  drivers: Option[List[TaggedDriverBase]],
/* The machines that belong to this tag. */
  machines: Option[List[TaggedMachineBase]],
/* Updated name of this tag. */
  name: Option[String],
/* If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag. */
  parentTagId: Option[Long],
/* The sensors that belong to this tag. */
  sensors: Option[List[TaggedSensorBase]],
/* The vehicles that belong to this tag. */
  vehicles: Option[List[TaggedVehicleBase]])

object TagUpdate {
  import DateTimeCodecs._

  implicit val TagUpdateCodecJson: CodecJson[TagUpdate] = CodecJson.derive[TagUpdate]
  implicit val TagUpdateDecoder: EntityDecoder[TagUpdate] = jsonOf[TagUpdate]
  implicit val TagUpdateEncoder: EntityEncoder[TagUpdate] = jsonEncoderOf[TagUpdate]
}
