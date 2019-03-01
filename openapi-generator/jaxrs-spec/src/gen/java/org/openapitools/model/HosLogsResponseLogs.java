package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class HosLogsResponseLogs   {
  
  private @Valid Double locLng;
  private @Valid Long logStartMs;
  private @Valid Long driverId;
  private @Valid String statusType;
  private @Valid String locCity;
  private @Valid Long groupId;
  private @Valid String locName;
  private @Valid Double locLat;
  private @Valid String remark;
  private @Valid String locState;
  private @Valid Long vehicleId;
  private @Valid List<Long> codriverIds = new ArrayList<Long>();

  /**
   * Longitude at which the log was recorded.
   **/
  public HosLogsResponseLogs locLng(Double locLng) {
    this.locLng = locLng;
    return this;
  }

  
  @ApiModelProperty(example = "-98.502888123", value = "Longitude at which the log was recorded.")
  @JsonProperty("locLng")
  public Double getLocLng() {
    return locLng;
  }
  public void setLocLng(Double locLng) {
    this.locLng = locLng;
  }

  /**
   * The time at which the log/HOS status started in UNIX milliseconds.
   **/
  public HosLogsResponseLogs logStartMs(Long logStartMs) {
    this.logStartMs = logStartMs;
    return this;
  }

  
  @ApiModelProperty(example = "1462881998034", value = "The time at which the log/HOS status started in UNIX milliseconds.")
  @JsonProperty("logStartMs")
  public Long getLogStartMs() {
    return logStartMs;
  }
  public void setLogStartMs(Long logStartMs) {
    this.logStartMs = logStartMs;
  }

  /**
   * ID of the driver.
   **/
  public HosLogsResponseLogs driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

  
  @ApiModelProperty(example = "444", value = "ID of the driver.")
  @JsonProperty("driverId")
  public Long getDriverId() {
    return driverId;
  }
  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  /**
   * The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.
   **/
  public HosLogsResponseLogs statusType(String statusType) {
    this.statusType = statusType;
    return this;
  }

  
  @ApiModelProperty(example = "OFF_DUTY", value = "The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.")
  @JsonProperty("statusType")
  public String getStatusType() {
    return statusType;
  }
  public void setStatusType(String statusType) {
    this.statusType = statusType;
  }

  /**
   * City in which the log was recorded.
   **/
  public HosLogsResponseLogs locCity(String locCity) {
    this.locCity = locCity;
    return this;
  }

  
  @ApiModelProperty(example = "Ahwatukee", value = "City in which the log was recorded.")
  @JsonProperty("locCity")
  public String getLocCity() {
    return locCity;
  }
  public void setLocCity(String locCity) {
    this.locCity = locCity;
  }

  /**
   * ID of the group.
   **/
  public HosLogsResponseLogs groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  
  @ApiModelProperty(example = "101", value = "ID of the group.")
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  /**
   * Name of location at which the log was recorded.
   **/
  public HosLogsResponseLogs locName(String locName) {
    this.locName = locName;
    return this;
  }

  
  @ApiModelProperty(example = "McLean Site A", value = "Name of location at which the log was recorded.")
  @JsonProperty("locName")
  public String getLocName() {
    return locName;
  }
  public void setLocName(String locName) {
    this.locName = locName;
  }

  /**
   * Latitude at which the log was recorded.
   **/
  public HosLogsResponseLogs locLat(Double locLat) {
    this.locLat = locLat;
    return this;
  }

  
  @ApiModelProperty(example = "23.413702345", value = "Latitude at which the log was recorded.")
  @JsonProperty("locLat")
  public Double getLocLat() {
    return locLat;
  }
  public void setLocLat(Double locLat) {
    this.locLat = locLat;
  }

  /**
   * Remark associated with the log entry.
   **/
  public HosLogsResponseLogs remark(String remark) {
    this.remark = remark;
    return this;
  }

  
  @ApiModelProperty(example = "Lunch Break", value = "Remark associated with the log entry.")
  @JsonProperty("remark")
  public String getRemark() {
    return remark;
  }
  public void setRemark(String remark) {
    this.remark = remark;
  }

  /**
   * State in which the log was recorded.
   **/
  public HosLogsResponseLogs locState(String locState) {
    this.locState = locState;
    return this;
  }

  
  @ApiModelProperty(example = "Arizona", value = "State in which the log was recorded.")
  @JsonProperty("locState")
  public String getLocState() {
    return locState;
  }
  public void setLocState(String locState) {
    this.locState = locState;
  }

  /**
   * ID of the vehicle.
   **/
  public HosLogsResponseLogs vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  
  @ApiModelProperty(example = "112", value = "ID of the vehicle.")
  @JsonProperty("vehicleId")
  public Long getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

  /**
   **/
  public HosLogsResponseLogs codriverIds(List<Long> codriverIds) {
    this.codriverIds = codriverIds;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("codriverIds")
  public List<Long> getCodriverIds() {
    return codriverIds;
  }
  public void setCodriverIds(List<Long> codriverIds) {
    this.codriverIds = codriverIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HosLogsResponseLogs hosLogsResponseLogs = (HosLogsResponseLogs) o;
    return Objects.equals(locLng, hosLogsResponseLogs.locLng) &&
        Objects.equals(logStartMs, hosLogsResponseLogs.logStartMs) &&
        Objects.equals(driverId, hosLogsResponseLogs.driverId) &&
        Objects.equals(statusType, hosLogsResponseLogs.statusType) &&
        Objects.equals(locCity, hosLogsResponseLogs.locCity) &&
        Objects.equals(groupId, hosLogsResponseLogs.groupId) &&
        Objects.equals(locName, hosLogsResponseLogs.locName) &&
        Objects.equals(locLat, hosLogsResponseLogs.locLat) &&
        Objects.equals(remark, hosLogsResponseLogs.remark) &&
        Objects.equals(locState, hosLogsResponseLogs.locState) &&
        Objects.equals(vehicleId, hosLogsResponseLogs.vehicleId) &&
        Objects.equals(codriverIds, hosLogsResponseLogs.codriverIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locLng, logStartMs, driverId, statusType, locCity, groupId, locName, locLat, remark, locState, vehicleId, codriverIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HosLogsResponseLogs {\n");
    
    sb.append("    locLng: ").append(toIndentedString(locLng)).append("\n");
    sb.append("    logStartMs: ").append(toIndentedString(logStartMs)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    statusType: ").append(toIndentedString(statusType)).append("\n");
    sb.append("    locCity: ").append(toIndentedString(locCity)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    locName: ").append(toIndentedString(locName)).append("\n");
    sb.append("    locLat: ").append(toIndentedString(locLat)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    locState: ").append(toIndentedString(locState)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    codriverIds: ").append(toIndentedString(codriverIds)).append("\n");
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

