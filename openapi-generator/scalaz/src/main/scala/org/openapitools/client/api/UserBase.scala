package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import UserBase._

case class UserBase (
  /* The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration. */
  authType: AuthType,
/* The email address of this user. */
  email: String,
/* The first and last name of the user. */
  name: Option[String],
/* The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. */
  organizationRoleId: Option[String])

object UserBase {
  import DateTimeCodecs._
  sealed trait AuthType
  case object Default extends AuthType
  case object Saml extends AuthType

  object AuthType {
    def toAuthType(s: String): Option[AuthType] = s match {
      case "Default" => Some(Default)
      case "Saml" => Some(Saml)
      case _ => None
    }

    def fromAuthType(x: AuthType): String = x match {
      case Default => "Default"
      case Saml => "Saml"
    }
  }

  implicit val AuthTypeEnumEncoder: EncodeJson[AuthType] =
    EncodeJson[AuthType](is => StringEncodeJson(AuthType.fromAuthType(is)))

  implicit val AuthTypeEnumDecoder: DecodeJson[AuthType] =
    DecodeJson.optionDecoder[AuthType](n => n.string.flatMap(jStr => AuthType.toAuthType(jStr)), "AuthType failed to de-serialize")

  implicit val UserBaseCodecJson: CodecJson[UserBase] = CodecJson.derive[UserBase]
  implicit val UserBaseDecoder: EntityDecoder[UserBase] = jsonOf[UserBase]
  implicit val UserBaseEncoder: EntityEncoder[UserBase] = jsonEncoderOf[UserBase]
}
