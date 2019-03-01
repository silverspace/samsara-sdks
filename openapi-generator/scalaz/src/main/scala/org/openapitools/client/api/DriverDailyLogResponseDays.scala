package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DriverDailyLogResponseDays._

case class DriverDailyLogResponseDays (
  /* Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0. */
  certifiedAtMs: Option[Long],
/* End of the HOS day, specified in milliseconds UNIX time. */
  endMs: Option[Integer],
/* End of the HOS day, specified in milliseconds UNIX time. */
  startMs: Option[Integer],
/* List of trailer ID's associated with the driver for the day. */
  trailerIds: Option[Any],
/* Hours spent on duty or driving, rounded to two decimal places. */
  activeHours: Option[Double],
/* Distance driven in miles, rounded to two decimal places. */
  distanceMiles: Option[Double],
/* Milliseconds spent on duty or driving. */
  activeMs: Option[Long],
/* Whether this HOS day chart was certified by the driver. */
  certified: Option[Boolean],
/* List of vehicle ID's associated with the driver for the day. */
  vehicleIds: Option[Any])

object DriverDailyLogResponseDays {
  import DateTimeCodecs._

  implicit val DriverDailyLogResponseDaysCodecJson: CodecJson[DriverDailyLogResponseDays] = CodecJson.derive[DriverDailyLogResponseDays]
  implicit val DriverDailyLogResponseDaysDecoder: EntityDecoder[DriverDailyLogResponseDays] = jsonOf[DriverDailyLogResponseDays]
  implicit val DriverDailyLogResponseDaysEncoder: EntityEncoder[DriverDailyLogResponseDays] = jsonEncoderOf[DriverDailyLogResponseDays]
}
