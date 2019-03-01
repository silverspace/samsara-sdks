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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-03-01T05:34:49.851Z[GMT]")
public class Driver   {
  
  private Boolean eldAdverseWeatherExemptionEnabled;
  private Boolean eldBigDayExemptionEnabled;
  private Integer eldDayStartHour;
  private Boolean eldExempt;
  private String eldExemptReason;
  private Boolean eldPcEnabled = false;
  private Boolean eldYmEnabled = false;
  private Map<String, String> externalIds = new HashMap<String, String>();
  private Long groupId;
  private String licenseNumber;
  private String licenseState;
  private String name;
  private String notes;
  private String phone;
  private String username;
  private Long vehicleId;
  private Long id;
  private Boolean isDeactivated;
  private List<TagMetadata> tags = new ArrayList<TagMetadata>();

  /**
   * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
   **/
  public Driver eldAdverseWeatherExemptionEnabled(Boolean eldAdverseWeatherExemptionEnabled) {
    this.eldAdverseWeatherExemptionEnabled = eldAdverseWeatherExemptionEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "Flag indicating this driver may use Adverse Weather exemptions in ELD logs.")
  @JsonProperty("eldAdverseWeatherExemptionEnabled")
  public Boolean getEldAdverseWeatherExemptionEnabled() {
    return eldAdverseWeatherExemptionEnabled;
  }
  public void setEldAdverseWeatherExemptionEnabled(Boolean eldAdverseWeatherExemptionEnabled) {
    this.eldAdverseWeatherExemptionEnabled = eldAdverseWeatherExemptionEnabled;
  }

  /**
   * Flag indicating this driver may use Big Day excemptions in ELD logs.
   **/
  public Driver eldBigDayExemptionEnabled(Boolean eldBigDayExemptionEnabled) {
    this.eldBigDayExemptionEnabled = eldBigDayExemptionEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "Flag indicating this driver may use Big Day excemptions in ELD logs.")
  @JsonProperty("eldBigDayExemptionEnabled")
  public Boolean getEldBigDayExemptionEnabled() {
    return eldBigDayExemptionEnabled;
  }
  public void setEldBigDayExemptionEnabled(Boolean eldBigDayExemptionEnabled) {
    this.eldBigDayExemptionEnabled = eldBigDayExemptionEnabled;
  }

  /**
   * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
   **/
  public Driver eldDayStartHour(Integer eldDayStartHour) {
    this.eldDayStartHour = eldDayStartHour;
    return this;
  }

  
  @ApiModelProperty(value = "0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.")
  @JsonProperty("eldDayStartHour")
  public Integer getEldDayStartHour() {
    return eldDayStartHour;
  }
  public void setEldDayStartHour(Integer eldDayStartHour) {
    this.eldDayStartHour = eldDayStartHour;
  }

  /**
   * Flag indicating this driver is exempt from the Electronic Logging Mandate.
   **/
  public Driver eldExempt(Boolean eldExempt) {
    this.eldExempt = eldExempt;
    return this;
  }

  
  @ApiModelProperty(value = "Flag indicating this driver is exempt from the Electronic Logging Mandate.")
  @JsonProperty("eldExempt")
  public Boolean getEldExempt() {
    return eldExempt;
  }
  public void setEldExempt(Boolean eldExempt) {
    this.eldExempt = eldExempt;
  }

  /**
   * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
   **/
  public Driver eldExemptReason(String eldExemptReason) {
    this.eldExemptReason = eldExemptReason;
    return this;
  }

  
  @ApiModelProperty(value = "Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).")
  @JsonProperty("eldExemptReason")
  public String getEldExemptReason() {
    return eldExemptReason;
  }
  public void setEldExemptReason(String eldExemptReason) {
    this.eldExemptReason = eldExemptReason;
  }

  /**
   * Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
   **/
  public Driver eldPcEnabled(Boolean eldPcEnabled) {
    this.eldPcEnabled = eldPcEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.")
  @JsonProperty("eldPcEnabled")
  public Boolean getEldPcEnabled() {
    return eldPcEnabled;
  }
  public void setEldPcEnabled(Boolean eldPcEnabled) {
    this.eldPcEnabled = eldPcEnabled;
  }

  /**
   * Flag indicating this driver may select the Yard Move duty status in ELD logs.
   **/
  public Driver eldYmEnabled(Boolean eldYmEnabled) {
    this.eldYmEnabled = eldYmEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "Flag indicating this driver may select the Yard Move duty status in ELD logs.")
  @JsonProperty("eldYmEnabled")
  public Boolean getEldYmEnabled() {
    return eldYmEnabled;
  }
  public void setEldYmEnabled(Boolean eldYmEnabled) {
    this.eldYmEnabled = eldYmEnabled;
  }

  /**
   * Dictionary of external IDs (string key-value pairs)
   **/
  public Driver externalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
    return this;
  }

  
  @ApiModelProperty(example = "{\"maintenanceId\":\"250020\",\"payrollId\":\"123\"}", value = "Dictionary of external IDs (string key-value pairs)")
  @JsonProperty("externalIds")
  public Map<String, String> getExternalIds() {
    return externalIds;
  }
  public void setExternalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
  }

  /**
   * ID of the group if the organization has multiple groups (uncommon).
   **/
  public Driver groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  
  @ApiModelProperty(example = "101", value = "ID of the group if the organization has multiple groups (uncommon).")
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  /**
   * Driver's state issued license number.
   **/
  public Driver licenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
    return this;
  }

  
  @ApiModelProperty(example = "E1234567", value = "Driver's state issued license number.")
  @JsonProperty("licenseNumber")
  public String getLicenseNumber() {
    return licenseNumber;
  }
  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }

  /**
   * Abbreviation of state that issued driver's license.
   **/
  public Driver licenseState(String licenseState) {
    this.licenseState = licenseState;
    return this;
  }

  
  @ApiModelProperty(example = "CA", value = "Abbreviation of state that issued driver's license.")
  @JsonProperty("licenseState")
  public String getLicenseState() {
    return licenseState;
  }
  public void setLicenseState(String licenseState) {
    this.licenseState = licenseState;
  }

  /**
   * Driver's name.
   **/
  public Driver name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Susan Jones", required = true, value = "Driver's name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Notes about the driver.
   **/
  public Driver notes(String notes) {
    this.notes = notes;
    return this;
  }

  
  @ApiModelProperty(example = "Also goes by the nickname 'Furious Fred'.", value = "Notes about the driver.")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   * Driver's phone number. Please include only digits, ex. 4157771234
   **/
  public Driver phone(String phone) {
    this.phone = phone;
    return this;
  }

  
  @ApiModelProperty(example = "5558234327", value = "Driver's phone number. Please include only digits, ex. 4157771234")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * Driver's login username into the driver app.
   **/
  public Driver username(String username) {
    this.username = username;
    return this;
  }

  
  @ApiModelProperty(example = "Susan Jones", value = "Driver's login username into the driver app.")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
   **/
  public Driver vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  
  @ApiModelProperty(example = "444", value = "ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).")
  @JsonProperty("vehicleId")
  public Long getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

  /**
   * ID of the driver.
   **/
  public Driver id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "556", required = true, value = "ID of the driver.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * True if the driver account has been deactivated.
   **/
  public Driver isDeactivated(Boolean isDeactivated) {
    this.isDeactivated = isDeactivated;
    return this;
  }

  
  @ApiModelProperty(value = "True if the driver account has been deactivated.")
  @JsonProperty("isDeactivated")
  public Boolean getIsDeactivated() {
    return isDeactivated;
  }
  public void setIsDeactivated(Boolean isDeactivated) {
    this.isDeactivated = isDeactivated;
  }

  /**
   **/
  public Driver tags(List<TagMetadata> tags) {
    this.tags = tags;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tags")
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
    return Objects.equals(eldAdverseWeatherExemptionEnabled, driver.eldAdverseWeatherExemptionEnabled) &&
        Objects.equals(eldBigDayExemptionEnabled, driver.eldBigDayExemptionEnabled) &&
        Objects.equals(eldDayStartHour, driver.eldDayStartHour) &&
        Objects.equals(eldExempt, driver.eldExempt) &&
        Objects.equals(eldExemptReason, driver.eldExemptReason) &&
        Objects.equals(eldPcEnabled, driver.eldPcEnabled) &&
        Objects.equals(eldYmEnabled, driver.eldYmEnabled) &&
        Objects.equals(externalIds, driver.externalIds) &&
        Objects.equals(groupId, driver.groupId) &&
        Objects.equals(licenseNumber, driver.licenseNumber) &&
        Objects.equals(licenseState, driver.licenseState) &&
        Objects.equals(name, driver.name) &&
        Objects.equals(notes, driver.notes) &&
        Objects.equals(phone, driver.phone) &&
        Objects.equals(username, driver.username) &&
        Objects.equals(vehicleId, driver.vehicleId) &&
        Objects.equals(id, driver.id) &&
        Objects.equals(isDeactivated, driver.isDeactivated) &&
        Objects.equals(tags, driver.tags);
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

