package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import HosAuthenticationLogsResponseAuthenticationLogs._

case class HosAuthenticationLogsResponseAuthenticationLogs (
  /* The log type - one of 'signin' or 'signout' */
  actionType: Option[String],
/* Address at which the log was recorded, if applicable. */
  address: Option[String],
/* City in which the log was recorded, if applicable. */
  city: Option[String],
/* The time at which the event was recorded in UNIX milliseconds. */
  happenedAtMs: Option[Long],
/* Address name from the group address book at which the log was recorded, if applicable. */
  addressName: Option[String],
/* State in which the log was recorded, if applicable. */
  state: Option[String])

object HosAuthenticationLogsResponseAuthenticationLogs {
  import DateTimeCodecs._

  implicit val HosAuthenticationLogsResponseAuthenticationLogsCodecJson: CodecJson[HosAuthenticationLogsResponseAuthenticationLogs] = CodecJson.derive[HosAuthenticationLogsResponseAuthenticationLogs]
  implicit val HosAuthenticationLogsResponseAuthenticationLogsDecoder: EntityDecoder[HosAuthenticationLogsResponseAuthenticationLogs] = jsonOf[HosAuthenticationLogsResponseAuthenticationLogs]
  implicit val HosAuthenticationLogsResponseAuthenticationLogsEncoder: EntityEncoder[HosAuthenticationLogsResponseAuthenticationLogs] = jsonEncoderOf[HosAuthenticationLogsResponseAuthenticationLogs]
}
