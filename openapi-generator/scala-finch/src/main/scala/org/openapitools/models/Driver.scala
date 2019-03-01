package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DriverBase
import org.openapitools.models.TagMetadata
import scala.collection.immutable.Seq

/**
 * 
 * @param eldAdverseWeatherExemptionEnabled Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
 * @param eldBigDayExemptionEnabled Flag indicating this driver may use Big Day excemptions in ELD logs.
 * @param eldDayStartHour 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
 * @param eldExempt Flag indicating this driver is exempt from the Electronic Logging Mandate.
 * @param eldExemptReason Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
 * @param eldPcEnabled Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
 * @param eldYmEnabled Flag indicating this driver may select the Yard Move duty status in ELD logs.
 * @param externalIds Dictionary of external IDs (string key-value pairs)
 * @param groupId ID of the group if the organization has multiple groups (uncommon).
 * @param licenseNumber Driver's state issued license number.
 * @param licenseState Abbreviation of state that issued driver's license.
 * @param name Driver's name.
 * @param notes Notes about the driver.
 * @param phone Driver's phone number. Please include only digits, ex. 4157771234
 * @param username Driver's login username into the driver app.
 * @param vehicleId ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
 * @param id ID of the driver.
 * @param isDeactivated True if the driver account has been deactivated.
 * @param tags 
 */
case class Driver(eldAdverseWeatherExemptionEnabled: Option[Boolean],
                eldBigDayExemptionEnabled: Option[Boolean],
                eldDayStartHour: Option[Int],
                eldExempt: Option[Boolean],
                eldExemptReason: Option[String],
                eldPcEnabled: Option[Boolean],
                eldYmEnabled: Option[Boolean],
                externalIds: Option[Map[String, String]],
                groupId: Option[Long],
                licenseNumber: Option[String],
                licenseState: Option[String],
                name: String,
                notes: Option[String],
                phone: Option[String],
                username: Option[String],
                vehicleId: Option[Long],
                id: Long,
                isDeactivated: Option[Boolean],
                tags: Option[Seq[TagMetadata]]
                )

object Driver {
    /**
     * Creates the codec for converting Driver from and to JSON.
     */
    implicit val decoder: Decoder[Driver] = deriveDecoder
    implicit val encoder: ObjectEncoder[Driver] = deriveEncoder
}
