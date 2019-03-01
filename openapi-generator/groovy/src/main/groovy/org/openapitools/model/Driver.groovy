package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.openapitools.model.DriverBase;
import org.openapitools.model.TagMetadata;

@Canonical
class Driver {
    /* Flag indicating this driver may use Adverse Weather exemptions in ELD logs. */
    Boolean eldAdverseWeatherExemptionEnabled

    /* Flag indicating this driver may use Big Day excemptions in ELD logs. */
    Boolean eldBigDayExemptionEnabled

    /* 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours. */
    Integer eldDayStartHour

    /* Flag indicating this driver is exempt from the Electronic Logging Mandate. */
    Boolean eldExempt

    /* Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt). */
    String eldExemptReason

    /* Flag indicating this driver may select the Personal Conveyance duty status in ELD logs. */
    Boolean eldPcEnabled = false

    /* Flag indicating this driver may select the Yard Move duty status in ELD logs. */
    Boolean eldYmEnabled = false

    /* Dictionary of external IDs (string key-value pairs) */
    Map<String, String> externalIds = new HashMap<String, String>()

    /* ID of the group if the organization has multiple groups (uncommon). */
    Long groupId

    /* Driver's state issued license number. */
    String licenseNumber

    /* Abbreviation of state that issued driver's license. */
    String licenseState

    /* Driver's name. */
    String name

    /* Notes about the driver. */
    String notes

    /* Driver's phone number. Please include only digits, ex. 4157771234 */
    String phone

    /* Driver's login username into the driver app. */
    String username

    /* ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon). */
    Long vehicleId

    /* ID of the driver. */
    Long id

    /* True if the driver account has been deactivated. */
    Boolean isDeactivated

    List<TagMetadata> tags = new ArrayList<TagMetadata>()

}
