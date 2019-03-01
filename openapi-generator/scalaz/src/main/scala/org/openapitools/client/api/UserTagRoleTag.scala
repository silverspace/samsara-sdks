package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import UserTagRoleTag._

case class UserTagRoleTag (
  /* The ID of this tag. */
  parentTagId: Option[Long],
/* Name of this tag. */
  name: String,
/* The ID of this tag. */
  id: Long)

object UserTagRoleTag {
  import DateTimeCodecs._

  implicit val UserTagRoleTagCodecJson: CodecJson[UserTagRoleTag] = CodecJson.derive[UserTagRoleTag]
  implicit val UserTagRoleTagDecoder: EntityDecoder[UserTagRoleTag] = jsonOf[UserTagRoleTag]
  implicit val UserTagRoleTagEncoder: EntityEncoder[UserTagRoleTag] = jsonEncoderOf[UserTagRoleTag]
}
