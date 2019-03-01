package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import Contact._

case class Contact (
  /* Email address of the contact */
  email: Option[String],
/* First name of the contact */
  firstName: Option[String],
/* ID of the contact */
  id: Option[Long],
/* Last name of the contact */
  lastName: Option[String],
/* Phone number of the contact */
  phone: Option[String])

object Contact {
  import DateTimeCodecs._

  implicit val ContactCodecJson: CodecJson[Contact] = CodecJson.derive[Contact]
  implicit val ContactDecoder: EntityDecoder[Contact] = jsonOf[Contact]
  implicit val ContactEncoder: EntityEncoder[Contact] = jsonEncoderOf[Contact]
}
