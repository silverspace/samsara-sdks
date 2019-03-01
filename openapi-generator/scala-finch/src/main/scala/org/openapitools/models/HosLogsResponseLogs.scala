package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param locLng Longitude at which the log was recorded.
 * @param logStartMs The time at which the log/HOS status started in UNIX milliseconds.
 * @param driverId ID of the driver.
 * @param statusType The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
 * @param locCity City in which the log was recorded.
 * @param groupId ID of the group.
 * @param locName Name of location at which the log was recorded.
 * @param locLat Latitude at which the log was recorded.
 * @param remark Remark associated with the log entry.
 * @param locState State in which the log was recorded.
 * @param vehicleId ID of the vehicle.
 * @param codriverIds 
 */
case class HosLogsResponseLogs(locLng: Option[Double],
                logStartMs: Option[Long],
                driverId: Option[Long],
                statusType: Option[String],
                locCity: Option[String],
                groupId: Option[Long],
                locName: Option[String],
                locLat: Option[Double],
                remark: Option[String],
                locState: Option[String],
                vehicleId: Option[Long],
                codriverIds: Option[Seq[Long]]
                )

object HosLogsResponseLogs {
    /**
     * Creates the codec for converting HosLogsResponseLogs from and to JSON.
     */
    implicit val decoder: Decoder[HosLogsResponseLogs] = deriveDecoder
    implicit val encoder: ObjectEncoder[HosLogsResponseLogs] = deriveEncoder
}
