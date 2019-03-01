package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import UserRole._

case class UserRole (
  id: Option[String],
name: Option[String])

object UserRole {
  import DateTimeCodecs._

  implicit val UserRoleCodecJson: CodecJson[UserRole] = CodecJson.derive[UserRole]
  implicit val UserRoleDecoder: EntityDecoder[UserRole] = jsonOf[UserRole]
  implicit val UserRoleEncoder: EntityEncoder[UserRole] = jsonEncoderOf[UserRole]
}
