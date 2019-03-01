package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import Tag._

case class Tag (
  /* The addresses that belong to this tag. */
  addresses: Option[List[TaggedAddress]],
/* The assets that belong to this tag. */
  assets: Option[List[TaggedAsset]],
/* The drivers that belong to this tag. */
  drivers: Option[List[TaggedDriver]],
/* The GroupID that this tag belongs to. */
  groupId: Option[Long],
/* The ID of this tag. */
  id: Long,
/* The machines that belong to this tag. */
  machines: Option[List[TaggedMachine]],
/* Name of this tag. */
  name: String,
/* If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag. */
  parentTagId: Option[Long],
/* The sensors that belong to this tag. */
  sensors: Option[List[TaggedSensor]],
/* The vehicles that belong to this tag. */
  vehicles: Option[List[TaggedVehicle]])

object Tag {
  import DateTimeCodecs._

  implicit val TagCodecJson: CodecJson[Tag] = CodecJson.derive[Tag]
  implicit val TagDecoder: EntityDecoder[Tag] = jsonOf[Tag]
  implicit val TagEncoder: EntityEncoder[Tag] = jsonEncoderOf[Tag]
}
