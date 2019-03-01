package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param driverId ID of the driver.
 * @param distanceMiles Distance driven in miles, rounded to two decimal places.
 * @param driveMs Duration in milliseconds that driver was driving during the requested time range
 * @param activeMs Duration in milliseconds that driver was on duty or driving during the requested time range
 * @param driverUsername Username of the driver.
 * @param groupId Group of the driver.
 * @param driverName Name of the driver.
 * @param onDutyMs Duration in milliseconds that driver was on duty during the requested time range
 */
case class DriversSummaryResponseSummaries(driverId: Option[Long],
                distanceMiles: Option[Double],
                driveMs: Option[Long],
                activeMs: Option[Long],
                driverUsername: Option[String],
                groupId: Option[Long],
                driverName: Option[String],
                onDutyMs: Option[Long]
                )

object DriversSummaryResponseSummaries {
    /**
     * Creates the codec for converting DriversSummaryResponseSummaries from and to JSON.
     */
    implicit val decoder: Decoder[DriversSummaryResponseSummaries] = deriveDecoder
    implicit val encoder: ObjectEncoder[DriversSummaryResponseSummaries] = deriveEncoder
}
