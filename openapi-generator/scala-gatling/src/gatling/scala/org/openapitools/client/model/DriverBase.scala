
package org.openapitools.client.model


case class DriverBase (
    /* Flag indicating this driver may use Adverse Weather exemptions in ELD logs. */
    _eldAdverseWeatherExemptionEnabled: Option[Boolean],
    /* Flag indicating this driver may use Big Day excemptions in ELD logs. */
    _eldBigDayExemptionEnabled: Option[Boolean],
    /* 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours. */
    _eldDayStartHour: Option[Integer],
    /* Flag indicating this driver is exempt from the Electronic Logging Mandate. */
    _eldExempt: Option[Boolean],
    /* Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt). */
    _eldExemptReason: Option[String],
    /* Flag indicating this driver may select the Personal Conveyance duty status in ELD logs. */
    _eldPcEnabled: Option[Boolean],
    /* Flag indicating this driver may select the Yard Move duty status in ELD logs. */
    _eldYmEnabled: Option[Boolean],
    /* Dictionary of external IDs (string key-value pairs) */
    _externalIds: Option[Map[String, String]],
    /* ID of the group if the organization has multiple groups (uncommon). */
    _groupId: Option[Long],
    /* Driver's state issued license number. */
    _licenseNumber: Option[String],
    /* Abbreviation of state that issued driver's license. */
    _licenseState: Option[String],
    /* Driver's name. */
    _name: String,
    /* Notes about the driver. */
    _notes: Option[String],
    /* Driver's phone number. Please include only digits, ex. 4157771234 */
    _phone: Option[String],
    /* Driver's login username into the driver app. */
    _username: Option[String],
    /* ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon). */
    _vehicleId: Option[Long]
)
object DriverBase {
    def toStringBody(var_eldAdverseWeatherExemptionEnabled: Object, var_eldBigDayExemptionEnabled: Object, var_eldDayStartHour: Object, var_eldExempt: Object, var_eldExemptReason: Object, var_eldPcEnabled: Object, var_eldYmEnabled: Object, var_externalIds: Object, var_groupId: Object, var_licenseNumber: Object, var_licenseState: Object, var_name: Object, var_notes: Object, var_phone: Object, var_username: Object, var_vehicleId: Object) =
        s"""
        | {
        | "eldAdverseWeatherExemptionEnabled":$var_eldAdverseWeatherExemptionEnabled,"eldBigDayExemptionEnabled":$var_eldBigDayExemptionEnabled,"eldDayStartHour":$var_eldDayStartHour,"eldExempt":$var_eldExempt,"eldExemptReason":$var_eldExemptReason,"eldPcEnabled":$var_eldPcEnabled,"eldYmEnabled":$var_eldYmEnabled,"externalIds":$var_externalIds,"groupId":$var_groupId,"licenseNumber":$var_licenseNumber,"licenseState":$var_licenseState,"name":$var_name,"notes":$var_notes,"phone":$var_phone,"username":$var_username,"vehicleId":$var_vehicleId
        | }
        """.stripMargin
}
