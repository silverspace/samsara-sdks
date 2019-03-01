package org.openapitools.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.DriverBase;
import org.openapitools.model.TagMetadata;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Driver  {
  
  @ApiModelProperty(value = "Flag indicating this driver may use Adverse Weather exemptions in ELD logs.")
 /**
   * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
  **/
  private Boolean eldAdverseWeatherExemptionEnabled;

  @ApiModelProperty(value = "Flag indicating this driver may use Big Day excemptions in ELD logs.")
 /**
   * Flag indicating this driver may use Big Day excemptions in ELD logs.
  **/
  private Boolean eldBigDayExemptionEnabled;

  @ApiModelProperty(value = "0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.")
 /**
   * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
  **/
  private Integer eldDayStartHour;

  @ApiModelProperty(value = "Flag indicating this driver is exempt from the Electronic Logging Mandate.")
 /**
   * Flag indicating this driver is exempt from the Electronic Logging Mandate.
  **/
  private Boolean eldExempt;

  @ApiModelProperty(value = "Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).")
 /**
   * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
  **/
  private String eldExemptReason;

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
  private Long groupId;

  @ApiModelProperty(example = "E1234567", value = "Driver's state issued license number.")
 /**
   * Driver's state issued license number.
  **/
  private String licenseNumber;

  @ApiModelProperty(example = "CA", value = "Abbreviation of state that issued driver's license.")
 /**
   * Abbreviation of state that issued driver's license.
  **/
  private String licenseState;

  @ApiModelProperty(example = "Susan Jones", required = true, value = "Driver's name.")
 /**
   * Driver's name.
  **/
  private String name;

  @ApiModelProperty(example = "Also goes by the nickname 'Furious Fred'.", value = "Notes about the driver.")
 /**
   * Notes about the driver.
  **/
  private String notes;

  @ApiModelProperty(example = "5558234327", value = "Driver's phone number. Please include only digits, ex. 4157771234")
 /**
   * Driver's phone number. Please include only digits, ex. 4157771234
  **/
  private String phone;

  @ApiModelProperty(example = "Susan Jones", value = "Driver's login username into the driver app.")
 /**
   * Driver's login username into the driver app.
  **/
  private String username;

  @ApiModelProperty(example = "444", value = "ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).")
 /**
   * ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
  **/
  private Long vehicleId;

  @ApiModelProperty(example = "556", required = true, value = "ID of the driver.")
 /**
   * ID of the driver.
  **/
  private Long id;

  @ApiModelProperty(value = "True if the driver account has been deactivated.")
 /**
   * True if the driver account has been deactivated.
  **/
  private Boolean isDeactivated;

  @ApiModelProperty(value = "")
  private List<TagMetadata> tags = null;
 /**
   * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
   * @return eldAdverseWeatherExemptionEnabled
  **/
  @JsonProperty("eldAdverseWeatherExemptionEnabled")
  public Boolean getEldAdverseWeatherExemptionEnabled() {
    return eldAdverseWeatherExemptionEnabled;
  }

  public void setEldAdverseWeatherExemptionEnabled(Boolean eldAdverseWeatherExemptionEnabled) {
    this.eldAdverseWeatherExemptionEnabled = eldAdverseWeatherExemptionEnabled;
  }

  public Driver eldAdverseWeatherExemptionEnabled(Boolean eldAdverseWeatherExemptionEnabled) {
    this.eldAdverseWeatherExemptionEnabled = eldAdverseWeatherExemptionEnabled;
    return this;
  }

 /**
   * Flag indicating this driver may use Big Day excemptions in ELD logs.
   * @return eldBigDayExemptionEnabled
  **/
  @JsonProperty("eldBigDayExemptionEnabled")
  public Boolean getEldBigDayExemptionEnabled() {
    return eldBigDayExemptionEnabled;
  }

  public void setEldBigDayExemptionEnabled(Boolean eldBigDayExemptionEnabled) {
    this.eldBigDayExemptionEnabled = eldBigDayExemptionEnabled;
  }

  public Driver eldBigDayExemptionEnabled(Boolean eldBigDayExemptionEnabled) {
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

  public Driver eldDayStartHour(Integer eldDayStartHour) {
    this.eldDayStartHour = eldDayStartHour;
    return this;
  }

 /**
   * Flag indicating this driver is exempt from the Electronic Logging Mandate.
   * @return eldExempt
  **/
  @JsonProperty("eldExempt")
  public Boolean getEldExempt() {
    return eldExempt;
  }

  public void setEldExempt(Boolean eldExempt) {
    this.eldExempt = eldExempt;
  }

  public Driver eldExempt(Boolean eldExempt) {
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

  public Driver eldExemptReason(String eldExemptReason) {
    this.eldExemptReason = eldExemptReason;
    return this;
  }

 /**
   * Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
   * @return eldPcEnabled
  **/
  @JsonProperty("eldPcEnabled")
  public Boolean getEldPcEnabled() {
    return eldPcEnabled;
  }

  public void setEldPcEnabled(Boolean eldPcEnabled) {
    this.eldPcEnabled = eldPcEnabled;
  }

  public Driver eldPcEnabled(Boolean eldPcEnabled) {
    this.eldPcEnabled = eldPcEnabled;
    return this;
  }

 /**
   * Flag indicating this driver may select the Yard Move duty status in ELD logs.
   * @return eldYmEnabled
  **/
  @JsonProperty("eldYmEnabled")
  public Boolean getEldYmEnabled() {
    return eldYmEnabled;
  }

  public void setEldYmEnabled(Boolean eldYmEnabled) {
    this.eldYmEnabled = eldYmEnabled;
  }

  public Driver eldYmEnabled(Boolean eldYmEnabled) {
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

  public Driver externalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
    return this;
  }

  public Driver putExternalIdsItem(String key, String externalIdsItem) {
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

  public Driver groupId(Long groupId) {
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

  public Driver licenseNumber(String licenseNumber) {
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

  public Driver licenseState(String licenseState) {
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

  public Driver name(String name) {
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

  public Driver notes(String notes) {
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

  public Driver phone(String phone) {
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

  public Driver username(String username) {
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

  public Driver vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

 /**
   * ID of the driver.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Driver id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * True if the driver account has been deactivated.
   * @return isDeactivated
  **/
  @JsonProperty("isDeactivated")
  public Boolean getIsDeactivated() {
    return isDeactivated;
  }

  public void setIsDeactivated(Boolean isDeactivated) {
    this.isDeactivated = isDeactivated;
  }

  public Driver isDeactivated(Boolean isDeactivated) {
    this.isDeactivated = isDeactivated;
    return this;
  }

 /**
   * Get tags
   * @return tags
  **/
  @JsonProperty("tags")
  public List<TagMetadata> getTags() {
    return tags;
  }

  public void setTags(List<TagMetadata> tags) {
    this.tags = tags;
  }

  public Driver tags(List<TagMetadata> tags) {
    this.tags = tags;
    return this;
  }

  public Driver addTagsItem(TagMetadata tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Driver {\n");
    
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
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDeactivated: ").append(toIndentedString(isDeactivated)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

