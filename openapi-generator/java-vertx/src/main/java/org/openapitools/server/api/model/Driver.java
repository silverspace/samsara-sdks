package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.server.api.model.DriverBase;
import org.openapitools.server.api.model.TagMetadata;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Driver   {
  
  private Boolean eldAdverseWeatherExemptionEnabled;
  private Boolean eldBigDayExemptionEnabled;
  private Integer eldDayStartHour;
  private Boolean eldExempt;
  private String eldExemptReason;
  private Boolean eldPcEnabled = false;
  private Boolean eldYmEnabled = false;
  private Map<String, String> externalIds = new HashMap<>();
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
  private List<TagMetadata> tags = new ArrayList<>();

  public Driver () {

  }

  public Driver (Boolean eldAdverseWeatherExemptionEnabled, Boolean eldBigDayExemptionEnabled, Integer eldDayStartHour, Boolean eldExempt, String eldExemptReason, Boolean eldPcEnabled, Boolean eldYmEnabled, Map<String, String> externalIds, Long groupId, String licenseNumber, String licenseState, String name, String notes, String phone, String username, Long vehicleId, Long id, Boolean isDeactivated, List<TagMetadata> tags) {
    this.eldAdverseWeatherExemptionEnabled = eldAdverseWeatherExemptionEnabled;
    this.eldBigDayExemptionEnabled = eldBigDayExemptionEnabled;
    this.eldDayStartHour = eldDayStartHour;
    this.eldExempt = eldExempt;
    this.eldExemptReason = eldExemptReason;
    this.eldPcEnabled = eldPcEnabled;
    this.eldYmEnabled = eldYmEnabled;
    this.externalIds = externalIds;
    this.groupId = groupId;
    this.licenseNumber = licenseNumber;
    this.licenseState = licenseState;
    this.name = name;
    this.notes = notes;
    this.phone = phone;
    this.username = username;
    this.vehicleId = vehicleId;
    this.id = id;
    this.isDeactivated = isDeactivated;
    this.tags = tags;
  }

    
  @JsonProperty("eldAdverseWeatherExemptionEnabled")
  public Boolean getEldAdverseWeatherExemptionEnabled() {
    return eldAdverseWeatherExemptionEnabled;
  }
  public void setEldAdverseWeatherExemptionEnabled(Boolean eldAdverseWeatherExemptionEnabled) {
    this.eldAdverseWeatherExemptionEnabled = eldAdverseWeatherExemptionEnabled;
  }

    
  @JsonProperty("eldBigDayExemptionEnabled")
  public Boolean getEldBigDayExemptionEnabled() {
    return eldBigDayExemptionEnabled;
  }
  public void setEldBigDayExemptionEnabled(Boolean eldBigDayExemptionEnabled) {
    this.eldBigDayExemptionEnabled = eldBigDayExemptionEnabled;
  }

    
  @JsonProperty("eldDayStartHour")
  public Integer getEldDayStartHour() {
    return eldDayStartHour;
  }
  public void setEldDayStartHour(Integer eldDayStartHour) {
    this.eldDayStartHour = eldDayStartHour;
  }

    
  @JsonProperty("eldExempt")
  public Boolean getEldExempt() {
    return eldExempt;
  }
  public void setEldExempt(Boolean eldExempt) {
    this.eldExempt = eldExempt;
  }

    
  @JsonProperty("eldExemptReason")
  public String getEldExemptReason() {
    return eldExemptReason;
  }
  public void setEldExemptReason(String eldExemptReason) {
    this.eldExemptReason = eldExemptReason;
  }

    
  @JsonProperty("eldPcEnabled")
  public Boolean getEldPcEnabled() {
    return eldPcEnabled;
  }
  public void setEldPcEnabled(Boolean eldPcEnabled) {
    this.eldPcEnabled = eldPcEnabled;
  }

    
  @JsonProperty("eldYmEnabled")
  public Boolean getEldYmEnabled() {
    return eldYmEnabled;
  }
  public void setEldYmEnabled(Boolean eldYmEnabled) {
    this.eldYmEnabled = eldYmEnabled;
  }

    
  @JsonProperty("externalIds")
  public Map<String, String> getExternalIds() {
    return externalIds;
  }
  public void setExternalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
  }

    
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

    
  @JsonProperty("licenseNumber")
  public String getLicenseNumber() {
    return licenseNumber;
  }
  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }

    
  @JsonProperty("licenseState")
  public String getLicenseState() {
    return licenseState;
  }
  public void setLicenseState(String licenseState) {
    this.licenseState = licenseState;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

    
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

    
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

    
  @JsonProperty("vehicleId")
  public Long getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("isDeactivated")
  public Boolean getIsDeactivated() {
    return isDeactivated;
  }
  public void setIsDeactivated(Boolean isDeactivated) {
    this.isDeactivated = isDeactivated;
  }

    
  @JsonProperty("tags")
  public List<TagMetadata> getTags() {
    return tags;
  }
  public void setTags(List<TagMetadata> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
