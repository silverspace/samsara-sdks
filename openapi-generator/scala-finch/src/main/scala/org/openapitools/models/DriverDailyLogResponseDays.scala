package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param certifiedAtMs Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
 * @param endMs End of the HOS day, specified in milliseconds UNIX time.
 * @param startMs End of the HOS day, specified in milliseconds UNIX time.
 * @param trailerIds List of trailer ID's associated with the driver for the day.
 * @param activeHours Hours spent on duty or driving, rounded to two decimal places.
 * @param distanceMiles Distance driven in miles, rounded to two decimal places.
 * @param activeMs Milliseconds spent on duty or driving.
 * @param certified Whether this HOS day chart was certified by the driver.
 * @param vehicleIds List of vehicle ID's associated with the driver for the day.
 */
case class DriverDailyLogResponseDays(certifiedAtMs: Option[Long],
                endMs: Option[Int],
                startMs: Option[Int],
                trailerIds: Option[Object],
                activeHours: Option[Double],
                distanceMiles: Option[Double],
                activeMs: Option[Long],
                certified: Option[Boolean],
                vehicleIds: Option[Object]
                )

object DriverDailyLogResponseDays {
    /**
     * Creates the codec for converting DriverDailyLogResponseDays from and to JSON.
     */
    implicit val decoder: Decoder[DriverDailyLogResponseDays] = deriveDecoder
    implicit val encoder: ObjectEncoder[DriverDailyLogResponseDays] = deriveEncoder
}
