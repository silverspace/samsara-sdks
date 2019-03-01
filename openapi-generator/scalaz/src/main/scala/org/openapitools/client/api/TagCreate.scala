package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import TagCreate._

case class TagCreate (
  /* The assets that belong to this tag. */
  assets: Option[List[TaggedAssetBase]],
/* The drivers that belong to this tag. */
  drivers: Option[List[TaggedDriverBase]],
/* The machines that belong to this tag. */
  machines: Option[List[TaggedMachineBase]],
/* Name of this tag. */
  name: String,
/* If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag. */
  parentTagId: Option[Long],
/* The sensors that belong to this tag. */
  sensors: Option[List[TaggedSensorBase]],
/* The vehicles that belong to this tag. */
  vehicles: Option[List[TaggedVehicleBase]])

object TagCreate {
  import DateTimeCodecs._

  implicit val TagCreateCodecJson: CodecJson[TagCreate] = CodecJson.derive[TagCreate]
  implicit val TagCreateDecoder: EntityDecoder[TagCreate] = jsonOf[TagCreate]
  implicit val TagCreateEncoder: EntityEncoder[TagCreate] = jsonEncoderOf[TagCreate]
}
