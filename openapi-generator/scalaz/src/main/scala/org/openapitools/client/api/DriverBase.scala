package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DriverBase._

case class DriverBase (
  /* Flag indicating this driver may use Adverse Weather exemptions in ELD logs. */
  eldAdverseWeatherExemptionEnabled: Option[Boolean],
/* Flag indicating this driver may use Big Day excemptions in ELD logs. */
  eldBigDayExemptionEnabled: Option[Boolean],
/* 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours. */
  eldDayStartHour: Option[Integer],
/* Flag indicating this driver is exempt from the Electronic Logging Mandate. */
  eldExempt: Option[Boolean],
/* Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt). */
  eldExemptReason: Option[String],
/* Flag indicating this driver may select the Personal Conveyance duty status in ELD logs. */
  eldPcEnabled: Option[Boolean],
/* Flag indicating this driver may select the Yard Move duty status in ELD logs. */
  eldYmEnabled: Option[Boolean],
/* Dictionary of external IDs (string key-value pairs) */
  externalIds: Option[Map[String, String]],
/* ID of the group if the organization has multiple groups (uncommon). */
  groupId: Option[Long],
/* Driver's state issued license number. */
  licenseNumber: Option[String],
/* Abbreviation of state that issued driver's license. */
  licenseState: Option[String],
/* Driver's name. */
  name: String,
/* Notes about the driver. */
  notes: Option[String],
/* Driver's phone number. Please include only digits, ex. 4157771234 */
  phone: Option[String],
/* Driver's login username into the driver app. */
  username: Option[String],
/* ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon). */
  vehicleId: Option[Long])

object DriverBase {
  import DateTimeCodecs._

  implicit val DriverBaseCodecJson: CodecJson[DriverBase] = CodecJson.derive[DriverBase]
  implicit val DriverBaseDecoder: EntityDecoder[DriverBase] = jsonOf[DriverBase]
  implicit val DriverBaseEncoder: EntityEncoder[DriverBase] = jsonEncoderOf[DriverBase]
}
