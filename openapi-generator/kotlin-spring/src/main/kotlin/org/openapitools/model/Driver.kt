package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DriverBase
import org.openapitools.model.TagMetadata
import javax.validation.Valid
import javax.validation.constraints.*

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
data class Driver (

        @get:NotNull 
        @JsonProperty("name") val name: String,

        @get:NotNull 
        @JsonProperty("id") val id: Long,

        @JsonProperty("eldAdverseWeatherExemptionEnabled") val eldAdverseWeatherExemptionEnabled: Boolean? = null,

        @JsonProperty("eldBigDayExemptionEnabled") val eldBigDayExemptionEnabled: Boolean? = null,

        @JsonProperty("eldDayStartHour") val eldDayStartHour: Int? = null,

        @JsonProperty("eldExempt") val eldExempt: Boolean? = null,

        @JsonProperty("eldExemptReason") val eldExemptReason: String? = null,

        @JsonProperty("eldPcEnabled") val eldPcEnabled: Boolean? = null,

        @JsonProperty("eldYmEnabled") val eldYmEnabled: Boolean? = null,

        @JsonProperty("externalIds") val externalIds: Map<kotlin.String, String>? = null,

        @JsonProperty("groupId") val groupId: Long? = null,

        @JsonProperty("licenseNumber") val licenseNumber: String? = null,

        @JsonProperty("licenseState") val licenseState: String? = null,

        @JsonProperty("notes") val notes: String? = null,

        @JsonProperty("phone") val phone: String? = null,

        @JsonProperty("username") val username: String? = null,

        @JsonProperty("vehicleId") val vehicleId: Long? = null,

        @JsonProperty("isDeactivated") val isDeactivated: Boolean? = null,

        @JsonProperty("tags") val tags: List<TagMetadata>? = null
) {

}

