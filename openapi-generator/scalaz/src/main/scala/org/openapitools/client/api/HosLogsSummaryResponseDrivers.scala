package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import HosLogsSummaryResponseDrivers._

case class HosLogsSummaryResponseDrivers (
  /* The amount of time (in ms) remaining until the driver cannot drive without a rest break. */
  timeUntilBreak: Option[Long],
/* Name of the vehicle. */
  vehicleName: Option[String],
/* The amount of driving time in violation today (in ms). */
  drivingInViolationToday: Option[Long],
/* ID of the driver. */
  driverId: Option[Long],
/* The amount of remaining cycle time (in ms). */
  cycleRemaining: Option[Long],
/* Name of the driver. */
  driverName: Option[String],
/* The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`. */
  dutyStatus: Option[String],
/* The amount of cycle time (in ms) available tomorrow. */
  cycleTomorrow: Option[Long],
/* The amount of remaining shift drive time (in ms). */
  shiftDriveRemaining: Option[Long],
/* The amount of time (in ms) that the driver has been in the current `dutyStatus`. */
  timeInCurrentStatus: Option[Long],
/* The amount of driving time in violation in this cycle (in ms). */
  drivingInViolationCycle: Option[Long],
/* The amount of remaining shift time (in ms). */
  shiftRemaining: Option[Long])

object HosLogsSummaryResponseDrivers {
  import DateTimeCodecs._

  implicit val HosLogsSummaryResponseDriversCodecJson: CodecJson[HosLogsSummaryResponseDrivers] = CodecJson.derive[HosLogsSummaryResponseDrivers]
  implicit val HosLogsSummaryResponseDriversDecoder: EntityDecoder[HosLogsSummaryResponseDrivers] = jsonOf[HosLogsSummaryResponseDrivers]
  implicit val HosLogsSummaryResponseDriversEncoder: EntityEncoder[HosLogsSummaryResponseDrivers] = jsonEncoderOf[HosLogsSummaryResponseDrivers]
}
