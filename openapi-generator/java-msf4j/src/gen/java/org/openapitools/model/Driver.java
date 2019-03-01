package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.DriverBase;
import org.openapitools.model.TagMetadata;

/**
 * Driver
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class Driver   {
  @JsonProperty("eldAdverseWeatherExemptionEnabled")
  private Boolean eldAdverseWeatherExemptionEnabled;

  @JsonProperty("eldBigDayExemptionEnabled")
  private Boolean eldBigDayExemptionEnabled;

  @JsonProperty("eldDayStartHour")
  private Integer eldDayStartHour;

  @JsonProperty("eldExempt")
  private Boolean eldExempt;

  @JsonProperty("eldExemptReason")
  private String eldExemptReason;

  @JsonProperty("eldPcEnabled")
  private Boolean eldPcEnabled = false;

  @JsonProperty("eldYmEnabled")
  private Boolean eldYmEnabled = false;

  @JsonProperty("externalIds")
  private Map<String, String> externalIds = null;

  @JsonProperty("groupId")
  private Long groupId;

  @JsonProperty("licenseNumber")
  private String licenseNumber;

  @JsonProperty("licenseState")
  private String licenseState;

  @JsonProperty("name")
  private String name;

  @JsonProperty("notes")
  private String notes;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("username")
  private String username;

  @JsonProperty("vehicleId")
  private Long vehicleId;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("isDeactivated")
  private Boolean isDeactivated;

  @JsonProperty("tags")
  private List<TagMetadata> tags = null;

  public Driver eldAdverseWeatherExemptionEnabled(Boolean eldAdverseWeatherExemptionEnabled) {
    this.eldAdverseWeatherExemptionEnabled = eldAdverseWeatherExemptionEnabled;
    return this;
  }

   /**
   * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
   * @return eldAdverseWeatherExemptionEnabled
  **/
  @ApiModelProperty(value = "Flag indicating this driver may use Adverse Weather exemptions in ELD logs.")
  public Boolean getEldAdverseWeatherExemptionEnabled() {
    return eldAdverseWeatherExemptionEnabled;
  }

  public void setEldAdverseWeatherExemptionEnabled(Boolean eldAdverseWeatherExemptionEnabled) {
    this.eldAdverseWeatherExemptionEnabled = eldAdverseWeatherExemptionEnabled;
  }

  public Driver eldBigDayExemptionEnabled(Boolean eldBigDayExemptionEnabled) {
    this.eldBigDayExemptionEnabled = eldBigDayExemptionEnabled;
    return this;
  }

   /**
   * Flag indicating this driver may use Big Day excemptions in ELD logs.
   * @return eldBigDayExemptionEnabled
  **/
  @ApiModelProperty(value = "Flag indicating this driver may use Big Day excemptions in ELD logs.")
  public Boolean getEldBigDayExemptionEnabled() {
    return eldBigDayExemptionEnabled;
  }

  public void setEldBigDayExemptionEnabled(Boolean eldBigDayExemptionEnabled) {
    this.eldBigDayExemptionEnabled = eldBigDayExemptionEnabled;
  }

  public Driver eldDayStartHour(Integer eldDayStartHour) {
    this.eldDayStartHour = eldDayStartHour;
    return this;
  }

   /**
   * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
   * @return eldDayStartHour
  **/
  @ApiModelProperty(value = "0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.")
  public Integer getEldDayStartHour() {
    return eldDayStartHour;
  }

  public void setEldDayStartHour(Integer eldDayStartHour) {
    this.eldDayStartHour = eldDayStartHour;
  }

  public Driver eldExempt(Boolean eldExempt) {
    this.eldExempt = eldExempt;
    return this;
  }

   /**
   * Flag indicating this driver is exempt from the Electronic Logging Mandate.
   * @return eldExempt
  **/
  @ApiModelProperty(value = "Flag indicating this driver is exempt from the Electronic Logging Mandate.")
  public Boolean getEldExempt() {
    return eldExempt;
  }

  public void setEldExempt(Boolean eldExempt) {
    this.eldExempt = eldExempt;
  }

  public Driver eldExemptReason(String eldExemptReason) {
    this.eldExemptReason = eldExemptReason;
    return this;
  }

   /**
   * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
   * @return eldExemptReason
  **/
  @ApiModelProperty(value = "Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).")
  public String getEldExemptReason() {
    return eldExemptReason;
  }

  public void setEldExemptReason(String eldExemptReason) {
    this.eldExemptReason = eldExemptReason;
  }

  public Driver eldPcEnabled(Boolean eldPcEnabled) {
    this.eldPcEnabled = eldPcEnabled;
    return this;
  }

   /**
   * Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
   * @return eldPcEnabled
  **/
  @ApiModelProperty(value = "Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.")
  public Boolean getEldPcEnabled() {
    return eldPcEnabled;
  }

  public void setEldPcEnabled(Boolean eldPcEnabled) {
    this.eldPcEnabled = eldPcEnabled;
  }

  public Driver eldYmEnabled(Boolean eldYmEnabled) {
    this.eldYmEnabled = eldYmEnabled;
    return this;
  }

   /**
   * Flag indicating this driver may select the Yard Move duty status in ELD logs.
   * @return eldYmEnabled
  **/
  @ApiModelProperty(value = "Flag indicating this driver may select the Yard Move duty status in ELD logs.")
  public Boolean getEldYmEnabled() {
    return eldYmEnabled;
  }

  public void setEldYmEnabled(Boolean eldYmEnabled) {
    this.eldYmEnabled = eldYmEnabled;
  }

  public Driver externalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
    return this;
  }

  public Driver putExternalIdsItem(String key, String externalIdsItem) {
    if (this.externalIds == null) {
      this.externalIds = new HashMap<String, String>();
    }
    this.externalIds.put(key, externalIdsItem);
    return this;
  }

   /**
   * Dictionary of external IDs (string key-value pairs)
   * @return externalIds
  **/
  @ApiModelProperty(example = "{\"maintenanceId\":\"250020\",\"payrollId\":\"123\"}", value = "Dictionary of external IDs (string key-value pairs)")
  public Map<String, String> getExternalIds() {
    return externalIds;
  }

  public void setExternalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
  }

  public Driver groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * ID of the group if the organization has multiple groups (uncommon).
   * @return groupId
  **/
  @ApiModelProperty(example = "101", value = "ID of the group if the organization has multiple groups (uncommon).")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public Driver licenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
    return this;
  }

   /**
   * Driver's state issued license number.
   * @return licenseNumber
  **/
  @ApiModelProperty(example = "E1234567", value = "Driver's state issued license number.")
  public String getLicenseNumber() {
    return licenseNumber;
  }

  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }

  public Driver licenseState(String licenseState) {
    this.licenseState = licenseState;
    return this;
  }

   /**
   * Abbreviation of state that issued driver's license.
   * @return licenseState
  **/
  @ApiModelProperty(example = "CA", value = "Abbreviation of state that issued driver's license.")
  public String getLicenseState() {
    return licenseState;
  }

  public void setLicenseState(String licenseState) {
    this.licenseState = licenseState;
  }

  public Driver name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Driver's name.
   * @return name
  **/
  @ApiModelProperty(example = "Susan Jones", required = true, value = "Driver's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Driver notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Notes about the driver.
   * @return notes
  **/
  @ApiModelProperty(example = "Also goes by the nickname 'Furious Fred'.", value = "Notes about the driver.")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Driver phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Driver's phone number. Please include only digits, ex. 4157771234
   * @return phone
  **/
  @ApiModelProperty(example = "5558234327", value = "Driver's phone number. Please include only digits, ex. 4157771234")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Driver username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Driver's login username into the driver app.
   * @return username
  **/
  @ApiModelProperty(example = "Susan Jones", value = "Driver's login username into the driver app.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Driver vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
   * @return vehicleId
  **/
  @ApiModelProperty(example = "444", value = "ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).")
  public Long getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

  public Driver id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the driver.
   * @return id
  **/
  @ApiModelProperty(example = "556", required = true, value = "ID of the driver.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Driver isDeactivated(Boolean isDeactivated) {
    this.isDeactivated = isDeactivated;
    return this;
  }

   /**
   * True if the driver account has been deactivated.
   * @return isDeactivated
  **/
  @ApiModelProperty(value = "True if the driver account has been deactivated.")
  public Boolean getIsDeactivated() {
    return isDeactivated;
  }

  public void setIsDeactivated(Boolean isDeactivated) {
    this.isDeactivated = isDeactivated;
  }

  public Driver tags(List<TagMetadata> tags) {
    this.tags = tags;
    return this;
  }

  public Driver addTagsItem(TagMetadata tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagMetadata>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<TagMetadata> getTags() {
    return tags;
  }

  public void setTags(List<TagMetadata> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Driver driver = (Driver) o;
    return Objects.equals(this.eldAdverseWeatherExemptionEnabled, driver.eldAdverseWeatherExemptionEnabled) &&
        Objects.equals(this.eldBigDayExemptionEnabled, driver.eldBigDayExemptionEnabled) &&
        Objects.equals(this.eldDayStartHour, driver.eldDayStartHour) &&
        Objects.equals(this.eldExempt, driver.eldExempt) &&
        Objects.equals(this.eldExemptReason, driver.eldExemptReason) &&
        Objects.equals(this.eldPcEnabled, driver.eldPcEnabled) &&
        Objects.equals(this.eldYmEnabled, driver.eldYmEnabled) &&
        Objects.equals(this.externalIds, driver.externalIds) &&
        Objects.equals(this.groupId, driver.groupId) &&
        Objects.equals(this.licenseNumber, driver.licenseNumber) &&
        Objects.equals(this.licenseState, driver.licenseState) &&
        Objects.equals(this.name, driver.name) &&
        Objects.equals(this.notes, driver.notes) &&
        Objects.equals(this.phone, driver.phone) &&
        Objects.equals(this.username, driver.username) &&
        Objects.equals(this.vehicleId, driver.vehicleId) &&
        Objects.equals(this.id, driver.id) &&
        Objects.equals(this.isDeactivated, driver.isDeactivated) &&
        Objects.equals(this.tags, driver.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eldAdverseWeatherExemptionEnabled, eldBigDayExemptionEnabled, eldDayStartHour, eldExempt, eldExemptReason, eldPcEnabled, eldYmEnabled, externalIds, groupId, licenseNumber, licenseState, name, notes, phone, username, vehicleId, id, isDeactivated, tags);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

