package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HosLogsResponseLogs  {
  
  @ApiModelProperty(value = "")
  private List<Long> codriverIds = null;

  @ApiModelProperty(example = "444", value = "ID of the driver.")
 /**
   * ID of the driver.
  **/
  private Long driverId = null;

  @ApiModelProperty(example = "101", value = "ID of the group.")
 /**
   * ID of the group.
  **/
  private Long groupId = null;

  @ApiModelProperty(example = "Ahwatukee", value = "City in which the log was recorded.")
 /**
   * City in which the log was recorded.
  **/
  private String locCity = null;

  @ApiModelProperty(example = "23.413702345", value = "Latitude at which the log was recorded.")
 /**
   * Latitude at which the log was recorded.
  **/
  private Double locLat = null;

  @ApiModelProperty(example = "-98.502888123", value = "Longitude at which the log was recorded.")
 /**
   * Longitude at which the log was recorded.
  **/
  private Double locLng = null;

  @ApiModelProperty(example = "McLean Site A", value = "Name of location at which the log was recorded.")
 /**
   * Name of location at which the log was recorded.
  **/
  private String locName = null;

  @ApiModelProperty(example = "Arizona", value = "State in which the log was recorded.")
 /**
   * State in which the log was recorded.
  **/
  private String locState = null;

  @ApiModelProperty(example = "1462881998034", value = "The time at which the log/HOS status started in UNIX milliseconds.")
 /**
   * The time at which the log/HOS status started in UNIX milliseconds.
  **/
  private Long logStartMs = null;

  @ApiModelProperty(example = "Lunch Break", value = "Remark associated with the log entry.")
 /**
   * Remark associated with the log entry.
  **/
  private String remark = null;

  @ApiModelProperty(example = "OFF_DUTY", value = "The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.")
 /**
   * The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
  **/
  private String statusType = null;

  @ApiModelProperty(example = "112", value = "ID of the vehicle.")
 /**
   * ID of the vehicle.
  **/
  private Long vehicleId = null;
 /**
   * Get codriverIds
   * @return codriverIds
  **/
  @JsonProperty("codriverIds")
  public List<Long> getCodriverIds() {
    return codriverIds;
  }

  public void setCodriverIds(List<Long> codriverIds) {
    this.codriverIds = codriverIds;
  }

  public HosLogsResponseLogs codriverIds(List<Long> codriverIds) {
    this.codriverIds = codriverIds;
    return this;
  }

  public HosLogsResponseLogs addCodriverIdsItem(Long codriverIdsItem) {
    this.codriverIds.add(codriverIdsItem);
    return this;
  }

 /**
   * ID of the driver.
   * @return driverId
  **/
  @JsonProperty("driverId")
  public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public HosLogsResponseLogs driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

 /**
   * ID of the group.
   * @return groupId
  **/
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public HosLogsResponseLogs groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

 /**
   * City in which the log was recorded.
   * @return locCity
  **/
  @JsonProperty("locCity")
  public String getLocCity() {
    return locCity;
  }

  public void setLocCity(String locCity) {
    this.locCity = locCity;
  }

  public HosLogsResponseLogs locCity(String locCity) {
    this.locCity = locCity;
    return this;
  }

 /**
   * Latitude at which the log was recorded.
   * @return locLat
  **/
  @JsonProperty("locLat")
  public Double getLocLat() {
    return locLat;
  }

  public void setLocLat(Double locLat) {
    this.locLat = locLat;
  }

  public HosLogsResponseLogs locLat(Double locLat) {
    this.locLat = locLat;
    return this;
  }

 /**
   * Longitude at which the log was recorded.
   * @return locLng
  **/
  @JsonProperty("locLng")
  public Double getLocLng() {
    return locLng;
  }

  public void setLocLng(Double locLng) {
    this.locLng = locLng;
  }

  public HosLogsResponseLogs locLng(Double locLng) {
    this.locLng = locLng;
    return this;
  }

 /**
   * Name of location at which the log was recorded.
   * @return locName
  **/
  @JsonProperty("locName")
  public String getLocName() {
    return locName;
  }

  public void setLocName(String locName) {
    this.locName = locName;
  }

  public HosLogsResponseLogs locName(String locName) {
    this.locName = locName;
    return this;
  }

 /**
   * State in which the log was recorded.
   * @return locState
  **/
  @JsonProperty("locState")
  public String getLocState() {
    return locState;
  }

  public void setLocState(String locState) {
    this.locState = locState;
  }

  public HosLogsResponseLogs locState(String locState) {
    this.locState = locState;
    return this;
  }

 /**
   * The time at which the log/HOS status started in UNIX milliseconds.
   * @return logStartMs
  **/
  @JsonProperty("logStartMs")
  public Long getLogStartMs() {
    return logStartMs;
  }

  public void setLogStartMs(Long logStartMs) {
    this.logStartMs = logStartMs;
  }

  public HosLogsResponseLogs logStartMs(Long logStartMs) {
    this.logStartMs = logStartMs;
    return this;
  }

 /**
   * Remark associated with the log entry.
   * @return remark
  **/
  @JsonProperty("remark")
  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public HosLogsResponseLogs remark(String remark) {
    this.remark = remark;
    return this;
  }

 /**
   * The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.
   * @return statusType
  **/
  @JsonProperty("statusType")
  public String getStatusType() {
    return statusType;
  }

  public void setStatusType(String statusType) {
    this.statusType = statusType;
  }

  public HosLogsResponseLogs statusType(String statusType) {
    this.statusType = statusType;
    return this;
  }

 /**
   * ID of the vehicle.
   * @return vehicleId
  **/
  @JsonProperty("vehicleId")
  public Long getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

  public HosLogsResponseLogs vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

