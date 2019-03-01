package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DriverBase;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.TagIds;
import java.util.List;
@Canonical
class DriverForCreate {

  /* Flag indicating this driver may use Adverse Weather exemptions in ELD logs. */
  Boolean eldAdverseWeatherExemptionEnabled = null

  /* Flag indicating this driver may use Big Day excemptions in ELD logs. */
  Boolean eldBigDayExemptionEnabled = null

  /* 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours. */
  Integer eldDayStartHour = null

  /* Flag indicating this driver is exempt from the Electronic Logging Mandate. */
  Boolean eldExempt = null

  /* Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt). */
  String eldExemptReason = null

  /* Flag indicating this driver may select the Personal Conveyance duty status in ELD logs. */
  Boolean eldPcEnabled = false

  /* Flag indicating this driver may select the Yard Move duty status in ELD logs. */
  Boolean eldYmEnabled = false

  /* Dictionary of external IDs (string key-value pairs) */
  Map<String, String> externalIds = new HashMap<String, String>()

  /* ID of the group if the organization has multiple groups (uncommon). */
  Long groupId = null

  /* Driver's state issued license number. */
  String licenseNumber = null

  /* Abbreviation of state that issued driver's license. */
  String licenseState = null

  /* Driver's name. */
  String name = null

  /* Notes about the driver. */
  String notes = null

  /* Driver's phone number. Please include only digits, ex. 4157771234 */
  String phone = null

  /* Driver's login username into the driver app. */
  String username = null

  /* ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon). */
  Long vehicleId = null

  /* Driver's password for the driver app. */
  String password = null

    TagIds tagIds = null
  

}

