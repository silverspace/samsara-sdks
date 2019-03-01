package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.DriverBase;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class DriverForCreate   {
  
  private Boolean eldAdverseWeatherExemptionEnabled;

  private Boolean eldBigDayExemptionEnabled;

  private Integer eldDayStartHour;

  private Boolean eldExempt;

  private String eldExemptReason;

  private Boolean eldPcEnabled = false;

  private Boolean eldYmEnabled = false;

  private Map<String, String> externalIds = null;

  private Long groupId;

  private String licenseNumber;

  private String licenseState;

  private String name;

  private String notes;

  private String phone;

  private String username;

  private Long vehicleId;

  private String password;

  private List<Long> tagIds = null;


  /**
   * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
   **/
  public DriverForCreate eldAdverseWeatherExemptionEnabled(Boolean eldAdverseWeatherExemptionEnabled) {
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
  public DriverForCreate eldBigDayExemptionEnabled(Boolean eldBigDayExemptionEnabled) {
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
  public DriverForCreate eldDayStartHour(Integer eldDayStartHour) {
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
  public DriverForCreate eldExempt(Boolean eldExempt) {
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
  public DriverForCreate eldExemptReason(String eldExemptReason) {
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
  public DriverForCreate eldPcEnabled(Boolean eldPcEnabled) {
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
  public DriverForCreate eldYmEnabled(Boolean eldYmEnabled) {
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
  public DriverForCreate externalIds(Map<String, String> externalIds) {
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


  public DriverForCreate putExternalIdsItem(String key, String externalIdsItem) {
    if (this.externalIds == null) {
      this.externalIds = new HashMap<String, String>();
    }
    this.externalIds.put(key, externalIdsItem);
    return this;
  }

  /**
   * ID of the group if the organization has multiple groups (uncommon).
   **/
  public DriverForCreate groupId(Long groupId) {
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
   * Driver&#39;s state issued license number.
   **/
  public DriverForCreate licenseNumber(String licenseNumber) {
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
   * Abbreviation of state that issued driver&#39;s license.
   **/
  public DriverForCreate licenseState(String licenseState) {
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
   * Driver&#39;s name.
   **/
  public DriverForCreate name(String name) {
    this.name = name;
    return this;
  }

  
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
  public DriverForCreate notes(String notes) {
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
   * Driver&#39;s phone number. Please include only digits, ex. 4157771234
   **/
  public DriverForCreate phone(String phone) {
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
   * Driver&#39;s login username into the driver app.
   **/
  public DriverForCreate username(String username) {
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
  public DriverForCreate vehicleId(Long vehicleId) {
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
   * Driver&#39;s password for the driver app.
   **/
  public DriverForCreate password(String password) {
    this.password = password;
    return this;
  }

  
  @ApiModelProperty(example = "mypassword", required = true, value = "Driver's password for the driver app.")
  @JsonProperty("password")
  @NotNull
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }


  /**
   * A list of tag IDs.
   **/
  public DriverForCreate tagIds(List<Long> tagIds) {
    this.tagIds = tagIds;
    return this;
  }

  
  @ApiModelProperty(value = "A list of tag IDs.")
  @JsonProperty("tagIds")
  public List<Long> getTagIds() {
    return tagIds;
  }
  public void setTagIds(List<Long> tagIds) {
    this.tagIds = tagIds;
  }

  public DriverForCreate addTagIdsItem(Long tagIdsItem) {
    if (this.tagIds == null) {
      this.tagIds = new ArrayList<Long>();
    }
    this.tagIds.add(tagIdsItem);
    return this;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverForCreate driverForCreate = (DriverForCreate) o;
    return Objects.equals(eldAdverseWeatherExemptionEnabled, driverForCreate.eldAdverseWeatherExemptionEnabled) &&
        Objects.equals(eldBigDayExemptionEnabled, driverForCreate.eldBigDayExemptionEnabled) &&
        Objects.equals(eldDayStartHour, driverForCreate.eldDayStartHour) &&
        Objects.equals(eldExempt, driverForCreate.eldExempt) &&
        Objects.equals(eldExemptReason, driverForCreate.eldExemptReason) &&
        Objects.equals(eldPcEnabled, driverForCreate.eldPcEnabled) &&
        Objects.equals(eldYmEnabled, driverForCreate.eldYmEnabled) &&
        Objects.equals(externalIds, driverForCreate.externalIds) &&
        Objects.equals(groupId, driverForCreate.groupId) &&
        Objects.equals(licenseNumber, driverForCreate.licenseNumber) &&
        Objects.equals(licenseState, driverForCreate.licenseState) &&
        Objects.equals(name, driverForCreate.name) &&
        Objects.equals(notes, driverForCreate.notes) &&
        Objects.equals(phone, driverForCreate.phone) &&
        Objects.equals(username, driverForCreate.username) &&
        Objects.equals(vehicleId, driverForCreate.vehicleId) &&
        Objects.equals(password, driverForCreate.password) &&
        Objects.equals(tagIds, driverForCreate.tagIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eldAdverseWeatherExemptionEnabled, eldBigDayExemptionEnabled, eldDayStartHour, eldExempt, eldExemptReason, eldPcEnabled, eldYmEnabled, externalIds, groupId, licenseNumber, licenseState, name, notes, phone, username, vehicleId, password, tagIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverForCreate {\n");
    
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
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
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

