package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public class HosLogsResponseLogs   {
  
  private List<Long> codriverIds = new ArrayList<Long>();
  private Long driverId = null;
  private Long groupId = null;
  private String locCity = null;
  private Double locLat = null;
  private Double locLng = null;
  private String locName = null;
  private String locState = null;
  private Long logStartMs = null;
  private String remark = null;
  private String statusType = null;
  private Long vehicleId = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codriverIds")
  public List<Long> getCodriverIds() {
    return codriverIds;
  }
  public void setCodriverIds(List<Long> codriverIds) {
    this.codriverIds = codriverIds;
  }

  /**
   * ID of the driver.
   **/
  
  @ApiModelProperty(example = "444", value = "ID of the driver.")
  @JsonProperty("driverId")
  public Long getDriverId() {
    return driverId;
  }
  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  /**
   * ID of the group.
   **/
  
  @ApiModelProperty(example = "101", value = "ID of the group.")
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  /**
   * City in which the log was recorded.
   **/
  
  @ApiModelProperty(example = "Ahwatukee", value = "City in which the log was recorded.")
  @JsonProperty("locCity")
  public String getLocCity() {
    return locCity;
  }
  public void setLocCity(String locCity) {
    this.locCity = locCity;
  }

  /**
   * Latitude at which the log was recorded.
   **/
  
  @ApiModelProperty(example = "23.413702345", value = "Latitude at which the log was recorded.")
  @JsonProperty("locLat")
  public Double getLocLat() {
    return locLat;
  }
  public void setLocLat(Double locLat) {
    this.locLat = locLat;
  }

  /**
   * Longitude at which the log was recorded.
   **/
  
  @ApiModelProperty(example = "-98.502888123", value = "Longitude at which the log was recorded.")
  @JsonProperty("locLng")
  public Double getLocLng() {
    return locLng;
  }
  public void setLocLng(Double locLng) {
    this.locLng = locLng;
  }

  /**
   * Name of location at which the log was recorded.
   **/
  
  @ApiModelProperty(example = "McLean Site A", value = "Name of location at which the log was recorded.")
  @JsonProperty("locName")
  public String getLocName() {
    return locName;
  }
  public void setLocName(String locName) {
    this.locName = locName;
  }

  /**
   * State in which the log was recorded.
   **/
  
  @ApiModelProperty(example = "Arizona", value = "State in which the log was recorded.")
  @JsonProperty("locState")
  public String getLocState() {
    return locState;
  }
  public void setLocState(String locState) {
    this.locState = locState;
  }

  /**
   * The time at which the log/HOS status started in UNIX milliseconds.
   **/
  
  @ApiModelProperty(example = "1462881998034", value = "The time at which the log/HOS status started in UNIX milliseconds.")
  @JsonProperty("logStartMs")
  public Long getLogStartMs() {
    return logStartMs;
  }
  public void setLogStartMs(Long logStartMs) {
    this.logStartMs = logStartMs;
  }

  /**
   * Remark associated with the log entry.
   **/
  
  @ApiModelProperty(example = "Lunch Break", value = "Remark associated with the log entry.")
  @JsonProperty("remark")
  public String getRemark() {
    return remark;
  }
  public void setRemark(String remark) {
    this.remark = remark;
  }

  /**
   * The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.
   **/
  
  @ApiModelProperty(example = "OFF_DUTY", value = "The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.")
  @JsonProperty("statusType")
  public String getStatusType() {
    return statusType;
  }
  public void setStatusType(String statusType) {
    this.statusType = statusType;
  }

  /**
   * ID of the vehicle.
   **/
  
  @ApiModelProperty(example = "112", value = "ID of the vehicle.")
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
    HosLogsResponseLogs hosLogsResponseLogs = (HosLogsResponseLogs) o;
    return Objects.equals(codriverIds, hosLogsResponseLogs.codriverIds) &&
        Objects.equals(driverId, hosLogsResponseLogs.driverId) &&
        Objects.equals(groupId, hosLogsResponseLogs.groupId) &&
        Objects.equals(locCity, hosLogsResponseLogs.locCity) &&
        Objects.equals(locLat, hosLogsResponseLogs.locLat) &&
        Objects.equals(locLng, hosLogsResponseLogs.locLng) &&
        Objects.equals(locName, hosLogsResponseLogs.locName) &&
        Objects.equals(locState, hosLogsResponseLogs.locState) &&
        Objects.equals(logStartMs, hosLogsResponseLogs.logStartMs) &&
        Objects.equals(remark, hosLogsResponseLogs.remark) &&
        Objects.equals(statusType, hosLogsResponseLogs.statusType) &&
        Objects.equals(vehicleId, hosLogsResponseLogs.vehicleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codriverIds, driverId, groupId, locCity, locLat, locLng, locName, locState, logStartMs, remark, statusType, vehicleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HosLogsResponseLogs {\n");
    
    sb.append("    codriverIds: ").append(toIndentedString(codriverIds)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    locCity: ").append(toIndentedString(locCity)).append("\n");
    sb.append("    locLat: ").append(toIndentedString(locLat)).append("\n");
    sb.append("    locLng: ").append(toIndentedString(locLng)).append("\n");
    sb.append("    locName: ").append(toIndentedString(locName)).append("\n");
    sb.append("    locState: ").append(toIndentedString(locState)).append("\n");
    sb.append("    logStartMs: ").append(toIndentedString(logStartMs)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    statusType: ").append(toIndentedString(statusType)).append("\n");
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

