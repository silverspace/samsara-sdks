package io.swagger.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DriverBase  {
  
  @ApiModelProperty(value = "Flag indicating this driver may use Adverse Weather exemptions in ELD logs.")
 /**
   * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
  **/
  private Boolean eldAdverseWeatherExemptionEnabled = null;

  @ApiModelProperty(value = "Flag indicating this driver may use Big Day excemptions in ELD logs.")
 /**
   * Flag indicating this driver may use Big Day excemptions in ELD logs.
  **/
  private Boolean eldBigDayExemptionEnabled = null;

  @ApiModelProperty(value = "0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.")
 /**
   * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
  **/
  private Integer eldDayStartHour = null;

  @ApiModelProperty(value = "Flag indicating this driver is exempt from the Electronic Logging Mandate.")
 /**
   * Flag indicating this driver is exempt from the Electronic Logging Mandate.
  **/
  private Boolean eldExempt = null;

  @ApiModelProperty(value = "Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).")
 /**
   * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
  **/
  private String eldExemptReason = null;

  @ApiModelProperty(value = "Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.")
 /**
   * Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
  **/
  private Boolean eldPcEnabled = false;

  @ApiModelProperty(value = "Flag indicating this driver may select the Yard Move duty status in ELD logs.")
 /**
   * Flag indicating this driver may select the Yard Move duty status in ELD logs.
  **/
  private Boolean eldYmEnabled = false;

  @ApiModelProperty(example = "{\"maintenanceId\":\"250020\",\"payrollId\":\"123\"}", value = "Dictionary of external IDs (string key-value pairs)")
 /**
   * Dictionary of external IDs (string key-value pairs)
  **/
  private Map<String, String> externalIds = null;

  @ApiModelProperty(example = "101", value = "ID of the group if the organization has multiple groups (uncommon).")
 /**
   * ID of the group if the organization has multiple groups (uncommon).
  **/
  private Long groupId = null;

  @ApiModelProperty(example = "E1234567", value = "Driver's state issued license number.")
 /**
   * Driver's state issued license number.
  **/
  private String licenseNumber = null;

  @ApiModelProperty(example = "CA", value = "Abbreviation of state that issued driver's license.")
 /**
   * Abbreviation of state that issued driver's license.
  **/
  private String licenseState = null;

  @ApiModelProperty(example = "Susan Jones", required = true, value = "Driver's name.")
 /**
   * Driver's name.
  **/
  private String name = null;

  @ApiModelProperty(example = "Also goes by the nickname 'Furious Fred'.", value = "Notes about the driver.")
 /**
   * Notes about the driver.
  **/
  private String notes = null;

  @ApiModelProperty(example = "5558234327", value = "Driver's phone number. Please include only digits, ex. 4157771234")
 /**
   * Driver's phone number. Please include only digits, ex. 4157771234
  **/
  private String phone = null;

  @ApiModelProperty(example = "Susan Jones", value = "Driver's login username into the driver app.")
 /**
   * Driver's login username into the driver app.
  **/
  private String username = null;

  @ApiModelProperty(example = "444", value = "ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).")
 /**
   * ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
  **/
  private Long vehicleId = null;
 /**
   * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
   * @return eldAdverseWeatherExemptionEnabled
  **/
  @JsonProperty("eldAdverseWeatherExemptionEnabled")
  public Boolean isEldAdverseWeatherExemptionEnabled() {
    return eldAdverseWeatherExemptionEnabled;
  }

  public void setEldAdverseWeatherExemptionEnabled(Boolean eldAdverseWeatherExemptionEnabled) {
    this.eldAdverseWeatherExemptionEnabled = eldAdverseWeatherExemptionEnabled;
  }

  public DriverBase eldAdverseWeatherExemptionEnabled(Boolean eldAdverseWeatherExemptionEnabled) {
    this.eldAdverseWeatherExemptionEnabled = eldAdverseWeatherExemptionEnabled;
    return this;
  }

 /**
   * Flag indicating this driver may use Big Day excemptions in ELD logs.
   * @return eldBigDayExemptionEnabled
  **/
  @JsonProperty("eldBigDayExemptionEnabled")
  public Boolean isEldBigDayExemptionEnabled() {
    return eldBigDayExemptionEnabled;
  }

  public void setEldBigDayExemptionEnabled(Boolean eldBigDayExemptionEnabled) {
    this.eldBigDayExemptionEnabled = eldBigDayExemptionEnabled;
  }

  public DriverBase eldBigDayExemptionEnabled(Boolean eldBigDayExemptionEnabled) {
    this.eldBigDayExemptionEnabled = eldBigDayExemptionEnabled;
    return this;
  }

 /**
   * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
   * @return eldDayStartHour
  **/
  @JsonProperty("eldDayStartHour")
  public Integer getEldDayStartHour() {
    return eldDayStartHour;
  }

  public void setEldDayStartHour(Integer eldDayStartHour) {
    this.eldDayStartHour = eldDayStartHour;
  }

  public DriverBase eldDayStartHour(Integer eldDayStartHour) {
    this.eldDayStartHour = eldDayStartHour;
    return this;
  }

 /**
   * Flag indicating this driver is exempt from the Electronic Logging Mandate.
   * @return eldExempt
  **/
  @JsonProperty("eldExempt")
  public Boolean isEldExempt() {
    return eldExempt;
  }

  public void setEldExempt(Boolean eldExempt) {
    this.eldExempt = eldExempt;
  }

  public DriverBase eldExempt(Boolean eldExempt) {
    this.eldExempt = eldExempt;
    return this;
  }

 /**
   * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
   * @return eldExemptReason
  **/
  @JsonProperty("eldExemptReason")
  public String getEldExemptReason() {
    return eldExemptReason;
  }

  public void setEldExemptReason(String eldExemptReason) {
    this.eldExemptReason = eldExemptReason;
  }

  public DriverBase eldExemptReason(String eldExemptReason) {
    this.eldExemptReason = eldExemptReason;
    return this;
  }

 /**
   * Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
   * @return eldPcEnabled
  **/
  @JsonProperty("eldPcEnabled")
  public Boolean isEldPcEnabled() {
    return eldPcEnabled;
  }

  public void setEldPcEnabled(Boolean eldPcEnabled) {
    this.eldPcEnabled = eldPcEnabled;
  }

  public DriverBase eldPcEnabled(Boolean eldPcEnabled) {
    this.eldPcEnabled = eldPcEnabled;
    return this;
  }

 /**
   * Flag indicating this driver may select the Yard Move duty status in ELD logs.
   * @return eldYmEnabled
  **/
  @JsonProperty("eldYmEnabled")
  public Boolean isEldYmEnabled() {
    return eldYmEnabled;
  }

  public void setEldYmEnabled(Boolean eldYmEnabled) {
    this.eldYmEnabled = eldYmEnabled;
  }

  public DriverBase eldYmEnabled(Boolean eldYmEnabled) {
    this.eldYmEnabled = eldYmEnabled;
    return this;
  }

 /**
   * Dictionary of external IDs (string key-value pairs)
   * @return externalIds
  **/
  @JsonProperty("externalIds")
  public Map<String, String> getExternalIds() {
    return externalIds;
  }

  public void setExternalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
  }

  public DriverBase externalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
    return this;
  }

  public DriverBase putExternalIdsItem(String key, String externalIdsItem) {
    this.externalIds.put(key, externalIdsItem);
    return this;
  }

 /**
   * ID of the group if the organization has multiple groups (uncommon).
   * @return groupId
  **/
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public DriverBase groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

 /**
   * Driver&#39;s state issued license number.
   * @return licenseNumber
  **/
  @JsonProperty("licenseNumber")
  public String getLicenseNumber() {
    return licenseNumber;
  }

  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }

  public DriverBase licenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
    return this;
  }

 /**
   * Abbreviation of state that issued driver&#39;s license.
   * @return licenseState
  **/
  @JsonProperty("licenseState")
  public String getLicenseState() {
    return licenseState;
  }

  public void setLicenseState(String licenseState) {
    this.licenseState = licenseState;
  }

  public DriverBase licenseState(String licenseState) {
    this.licenseState = licenseState;
    return this;
  }

 /**
   * Driver&#39;s name.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DriverBase name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Notes about the driver.
   * @return notes
  **/
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public DriverBase notes(String notes) {
    this.notes = notes;
    return this;
  }

 /**
   * Driver&#39;s phone number. Please include only digits, ex. 4157771234
   * @return phone
  **/
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public DriverBase phone(String phone) {
    this.phone = phone;
    return this;
  }

 /**
   * Driver&#39;s login username into the driver app.
   * @return username
  **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public DriverBase username(String username) {
    this.username = username;
    return this;
  }

 /**
   * ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
   * @return vehicleId
  **/
  @JsonProperty("vehicleId")
  public Long getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

  public DriverBase vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverBase {\n");
    
    sb.append("    eldAdverseWeatherExemptionEnabled: ").append(toIndentedString(eldAdverseWeatherExemptionEnabled)).append("\n");
    sb.append("    eldBigDayExemptionEnabled: ").append(toIndentedString(eldBigDayExemptionEnabled)).append("\n");
    sb.append("    eldDayStartHour: ").append(toIndentedString(eldDayStartHour)).append("\n");
    sb.append("    eldExempt: ").append(toIndentedString(eldExempt)).append("\n");
    sb.append("    eldExemptReason: ").append(toIndentedString(eldExemptReason)).append("\n");
    sb.append("    eldPcEnabled: ").append(toIndentedString(eldPcEnabled)).append("\n");
    sb.append("    eldYmEnabled: ").append(toIndentedString(eldYmEnabled)).append("\n");
    sb.append("    externalIds: ").append(toIndentedString(externalIds)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    licenseNumber: ").append(toIndentedString(licenseNumber)).append("\n");
    sb.append("    licenseState: ").append(toIndentedString(licenseState)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

