package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param timeUntilBreak The amount of time (in ms) remaining until the driver cannot drive without a rest break.
 * @param vehicleName Name of the vehicle.
 * @param drivingInViolationToday The amount of driving time in violation today (in ms).
 * @param driverId ID of the driver.
 * @param cycleRemaining The amount of remaining cycle time (in ms).
 * @param driverName Name of the driver.
 * @param dutyStatus The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
 * @param cycleTomorrow The amount of cycle time (in ms) available tomorrow.
 * @param shiftDriveRemaining The amount of remaining shift drive time (in ms).
 * @param timeInCurrentStatus The amount of time (in ms) that the driver has been in the current `dutyStatus`.
 * @param drivingInViolationCycle The amount of driving time in violation in this cycle (in ms).
 * @param shiftRemaining The amount of remaining shift time (in ms).
 */
case class HosLogsSummaryResponseDrivers(timeUntilBreak: Option[Long],
                vehicleName: Option[String],
                drivingInViolationToday: Option[Long],
                driverId: Option[Long],
                cycleRemaining: Option[Long],
                driverName: Option[String],
                dutyStatus: Option[String],
                cycleTomorrow: Option[Long],
                shiftDriveRemaining: Option[Long],
                timeInCurrentStatus: Option[Long],
                drivingInViolationCycle: Option[Long],
                shiftRemaining: Option[Long]
                )

object HosLogsSummaryResponseDrivers {
    /**
     * Creates the codec for converting HosLogsSummaryResponseDrivers from and to JSON.
     */
    implicit val decoder: Decoder[HosLogsSummaryResponseDrivers] = deriveDecoder
    implicit val encoder: ObjectEncoder[HosLogsSummaryResponseDrivers] = deriveEncoder
}
