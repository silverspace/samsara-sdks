package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import HosLogsResponseLogs._

case class HosLogsResponseLogs (
  /* Longitude at which the log was recorded. */
  locLng: Option[Double],
/* The time at which the log/HOS status started in UNIX milliseconds. */
  logStartMs: Option[Long],
/* ID of the driver. */
  driverId: Option[Long],
/* The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`. */
  statusType: Option[String],
/* City in which the log was recorded. */
  locCity: Option[String],
/* ID of the group. */
  groupId: Option[Long],
/* Name of location at which the log was recorded. */
  locName: Option[String],
/* Latitude at which the log was recorded. */
  locLat: Option[Double],
/* Remark associated with the log entry. */
  remark: Option[String],
/* State in which the log was recorded. */
  locState: Option[String],
/* ID of the vehicle. */
  vehicleId: Option[Long],
codriverIds: Option[List[Long]])

object HosLogsResponseLogs {
  import DateTimeCodecs._

  implicit val HosLogsResponseLogsCodecJson: CodecJson[HosLogsResponseLogs] = CodecJson.derive[HosLogsResponseLogs]
  implicit val HosLogsResponseLogsDecoder: EntityDecoder[HosLogsResponseLogs] = jsonOf[HosLogsResponseLogs]
  implicit val HosLogsResponseLogsEncoder: EntityEncoder[HosLogsResponseLogs] = jsonEncoderOf[HosLogsResponseLogs]
}
