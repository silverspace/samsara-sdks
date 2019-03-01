package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DriversSummaryResponseSummaries._

case class DriversSummaryResponseSummaries (
  /* ID of the driver. */
  driverId: Option[Long],
/* Distance driven in miles, rounded to two decimal places. */
  distanceMiles: Option[Double],
/* Duration in milliseconds that driver was driving during the requested time range */
  driveMs: Option[Long],
/* Duration in milliseconds that driver was on duty or driving during the requested time range */
  activeMs: Option[Long],
/* Username of the driver. */
  driverUsername: Option[String],
/* Group of the driver. */
  groupId: Option[Long],
/* Name of the driver. */
  driverName: Option[String],
/* Duration in milliseconds that driver was on duty during the requested time range */
  onDutyMs: Option[Long])

object DriversSummaryResponseSummaries {
  import DateTimeCodecs._

  implicit val DriversSummaryResponseSummariesCodecJson: CodecJson[DriversSummaryResponseSummaries] = CodecJson.derive[DriversSummaryResponseSummaries]
  implicit val DriversSummaryResponseSummariesDecoder: EntityDecoder[DriversSummaryResponseSummaries] = jsonOf[DriversSummaryResponseSummaries]
  implicit val DriversSummaryResponseSummariesEncoder: EntityEncoder[DriversSummaryResponseSummaries] = jsonEncoderOf[DriversSummaryResponseSummaries]
}
