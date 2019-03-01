package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import UserTagRole._

case class UserTagRole (
  /* The name of the role the user has been granted on this tag. */
  role: Option[String],
/* The id of the role the user has been granted on this tag. */
  roleId: String,
tag: UserTagRoleTag)

object UserTagRole {
  import DateTimeCodecs._

  implicit val UserTagRoleCodecJson: CodecJson[UserTagRole] = CodecJson.derive[UserTagRole]
  implicit val UserTagRoleDecoder: EntityDecoder[UserTagRole] = jsonOf[UserTagRole]
  implicit val UserTagRoleEncoder: EntityEncoder[UserTagRole] = jsonEncoderOf[UserTagRole]
}
