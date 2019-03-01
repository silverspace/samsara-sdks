package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public class DriverBase   {
  
  private Boolean eldAdverseWeatherExemptionEnabled = null;
  private Boolean eldBigDayExemptionEnabled = null;
  private Integer eldDayStartHour = null;
  private Boolean eldExempt = null;
  private String eldExemptReason = null;
  private Boolean eldPcEnabled = false;
  private Boolean eldYmEnabled = false;
  private Map<String, String> externalIds = new HashMap<String, String>();
  private Long groupId = null;
  private String licenseNumber = null;
  private String licenseState = null;
  private String name = null;
  private String notes = null;
  private String phone = null;
  private String username = null;
  private Long vehicleId = null;

  /**
   * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
   **/
  
  @ApiModelProperty(value = "Flag indicating this driver may use Adverse Weather exemptions in ELD logs.")
  @JsonProperty("eldAdverseWeatherExemptionEnabled")
  public Boolean isEldAdverseWeatherExemptionEnabled() {
    return eldAdverseWeatherExemptionEnabled;
  }
  public void setEldAdverseWeatherExemptionEnabled(Boolean eldAdverseWeatherExemptionEnabled) {
    this.eldAdverseWeatherExemptionEnabled = eldAdverseWeatherExemptionEnabled;
  }

  /**
   * Flag indicating this driver may use Big Day excemptions in ELD logs.
   **/
  
  @ApiModelProperty(value = "Flag indicating this driver may use Big Day excemptions in ELD logs.")
  @JsonProperty("eldBigDayExemptionEnabled")
  public Boolean isEldBigDayExemptionEnabled() {
    return eldBigDayExemptionEnabled;
  }
  public void setEldBigDayExemptionEnabled(Boolean eldBigDayExemptionEnabled) {
    this.eldBigDayExemptionEnabled = eldBigDayExemptionEnabled;
  }

  /**
   * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
   **/
  
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
  
  @ApiModelProperty(value = "Flag indicating this driver is exempt from the Electronic Logging Mandate.")
  @JsonProperty("eldExempt")
  public Boolean isEldExempt() {
    return eldExempt;
  }
  public void setEldExempt(Boolean eldExempt) {
    this.eldExempt = eldExempt;
  }

  /**
   * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
   **/
  
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
  
  @ApiModelProperty(value = "Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.")
  @JsonProperty("eldPcEnabled")
  public Boolean isEldPcEnabled() {
    return eldPcEnabled;
  }
  public void setEldPcEnabled(Boolean eldPcEnabled) {
    this.eldPcEnabled = eldPcEnabled;
  }

  /**
   * Flag indicating this driver may select the Yard Move duty status in ELD logs.
   **/
  
  @ApiModelProperty(value = "Flag indicating this driver may select the Yard Move duty status in ELD logs.")
  @JsonProperty("eldYmEnabled")
  public Boolean isEldYmEnabled() {
    return eldYmEnabled;
  }
  public void setEldYmEnabled(Boolean eldYmEnabled) {
    this.eldYmEnabled = eldYmEnabled;
  }

  /**
   * Dictionary of external IDs (string key-value pairs)
   **/
  
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
  
  @ApiModelProperty(example = "101", value = "ID of the group if the organization has multiple groups (uncommon).")
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  /**
   * Driver&#39;s state issued license number.
   **/
  
  @ApiModelProperty(example = "E1234567", value = "Driver's state issued license number.")
  @JsonProperty("licenseNumber")
  public String getLicenseNumber() {
    return licenseNumber;
  }
  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }

  /**
   * Abbreviation of state that issued driver&#39;s license.
   **/
  
  @ApiModelProperty(example = "CA", value = "Abbreviation of state that issued driver's license.")
  @JsonProperty("licenseState")
  public String getLicenseState() {
    return licenseState;
  }
  public void setLicenseState(String licenseState) {
    this.licenseState = licenseState;
  }

  /**
   * Driver&#39;s name.
   **/
  
  @ApiModelProperty(example = "Susan Jones", required = true, value = "Driver's name.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Notes about the driver.
   **/
  
  @ApiModelProperty(example = "Also goes by the nickname 'Furious Fred'.", value = "Notes about the driver.")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   * Driver&#39;s phone number. Please include only digits, ex. 4157771234
   **/
  
  @ApiModelProperty(example = "5558234327", value = "Driver's phone number. Please include only digits, ex. 4157771234")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * Driver&#39;s login username into the driver app.
   **/
  
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
  
  @ApiModelProperty(example = "444", value = "ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).")
  @JsonProperty("vehicleId")
  public Long getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverBase driverBase = (DriverBase) o;
    return Objects.equals(eldAdverseWeatherExemptionEnabled, driverBase.eldAdverseWeatherExemptionEnabled) &&
        Objects.equals(eldBigDayExemptionEnabled, driverBase.eldBigDayExemptionEnabled) &&
        Objects.equals(eldDayStartHour, driverBase.eldDayStartHour) &&
        Objects.equals(eldExempt, driverBase.eldExempt) &&
        Objects.equals(eldExemptReason, driverBase.eldExemptReason) &&
        Objects.equals(eldPcEnabled, driverBase.eldPcEnabled) &&
        Objects.equals(eldYmEnabled, driverBase.eldYmEnabled) &&
        Objects.equals(externalIds, driverBase.externalIds) &&
        Objects.equals(groupId, driverBase.groupId) &&
        Objects.equals(licenseNumber, driverBase.licenseNumber) &&
        Objects.equals(licenseState, driverBase.licenseState) &&
        Objects.equals(name, driverBase.name) &&
        Objects.equals(notes, driverBase.notes) &&
        Objects.equals(phone, driverBase.phone) &&
        Objects.equals(username, driverBase.username) &&
        Objects.equals(vehicleId, driverBase.vehicleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eldAdverseWeatherExemptionEnabled, eldBigDayExemptionEnabled, eldDayStartHour, eldExempt, eldExemptReason, eldPcEnabled, eldYmEnabled, externalIds, groupId, licenseNumber, licenseState, name, notes, phone, username, vehicleId);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

