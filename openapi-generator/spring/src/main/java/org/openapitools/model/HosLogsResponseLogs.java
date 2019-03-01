package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HosLogsResponseLogs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

public class HosLogsResponseLogs   {
  @JsonProperty("locLng")
  private Double locLng;

  @JsonProperty("logStartMs")
  private Long logStartMs;

  @JsonProperty("driverId")
  private Long driverId;

  @JsonProperty("statusType")
  private String statusType;

  @JsonProperty("locCity")
  private String locCity;

  @JsonProperty("groupId")
  private Long groupId;

  @JsonProperty("locName")
  private String locName;

  @JsonProperty("locLat")
  private Double locLat;

  @JsonProperty("remark")
  private String remark;

  @JsonProperty("locState")
  private String locState;

  @JsonProperty("vehicleId")
  private Long vehicleId;

  @JsonProperty("codriverIds")
  @Valid
  private List<Long> codriverIds = null;

  public HosLogsResponseLogs locLng(Double locLng) {
    this.locLng = locLng;
    return this;
  }

  /**
   * Longitude at which the log was recorded.
   * @return locLng
  */
  @ApiModelProperty(example = "-98.502888123", value = "Longitude at which the log was recorded.")


  public Double getLocLng() {
    return locLng;
  }

  public void setLocLng(Double locLng) {
    this.locLng = locLng;
  }

  public HosLogsResponseLogs logStartMs(Long logStartMs) {
    this.logStartMs = logStartMs;
    return this;
  }

  /**
   * The time at which the log/HOS status started in UNIX milliseconds.
   * @return logStartMs
  */
  @ApiModelProperty(example = "1462881998034", value = "The time at which the log/HOS status started in UNIX milliseconds.")


  public Long getLogStartMs() {
    return logStartMs;
  }

  public void setLogStartMs(Long logStartMs) {
    this.logStartMs = logStartMs;
  }

  public HosLogsResponseLogs driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

  /**
   * ID of the driver.
   * @return driverId
  */
  @ApiModelProperty(example = "444", value = "ID of the driver.")


  public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public HosLogsResponseLogs statusType(String statusType) {
    this.statusType = statusType;
    return this;
  }

  /**
   * The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
   * @return statusType
  */
  @ApiModelProperty(example = "OFF_DUTY", value = "The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.")


  public String getStatusType() {
    return statusType;
  }

  public void setStatusType(String statusType) {
    this.statusType = statusType;
  }

  public HosLogsResponseLogs locCity(String locCity) {
    this.locCity = locCity;
    return this;
  }

  /**
   * City in which the log was recorded.
   * @return locCity
  */
  @ApiModelProperty(example = "Ahwatukee", value = "City in which the log was recorded.")


  public String getLocCity() {
    return locCity;
  }

  public void setLocCity(String locCity) {
    this.locCity = locCity;
  }

  public HosLogsResponseLogs groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * ID of the group.
   * @return groupId
  */
  @ApiModelProperty(example = "101", value = "ID of the group.")


  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public HosLogsResponseLogs locName(String locName) {
    this.locName = locName;
    return this;
  }

  /**
   * Name of location at which the log was recorded.
   * @return locName
  */
  @ApiModelProperty(example = "McLean Site A", value = "Name of location at which the log was recorded.")


  public String getLocName() {
    return locName;
  }

  public void setLocName(String locName) {
    this.locName = locName;
  }

  public HosLogsResponseLogs locLat(Double locLat) {
    this.locLat = locLat;
    return this;
  }

  /**
   * Latitude at which the log was recorded.
   * @return locLat
  */
  @ApiModelProperty(example = "23.413702345", value = "Latitude at which the log was recorded.")


  public Double getLocLat() {
    return locLat;
  }

  public void setLocLat(Double locLat) {
    this.locLat = locLat;
  }

  public HosLogsResponseLogs remark(String remark) {
    this.remark = remark;
    return this;
  }

  /**
   * Remark associated with the log entry.
   * @return remark
  */
  @ApiModelProperty(example = "Lunch Break", value = "Remark associated with the log entry.")


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public HosLogsResponseLogs locState(String locState) {
    this.locState = locState;
    return this;
  }

  /**
   * State in which the log was recorded.
   * @return locState
  */
  @ApiModelProperty(example = "Arizona", value = "State in which the log was recorded.")


  public String getLocState() {
    return locState;
  }

  public void setLocState(String locState) {
    this.locState = locState;
  }

  public HosLogsResponseLogs vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  /**
   * ID of the vehicle.
   * @return vehicleId
  */
  @ApiModelProperty(example = "112", value = "ID of the vehicle.")


  public Long getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

  public HosLogsResponseLogs codriverIds(List<Long> codriverIds) {
    this.codriverIds = codriverIds;
    return this;
  }

  public HosLogsResponseLogs addCodriverIdsItem(Long codriverIdsItem) {
    if (this.codriverIds == null) {
      this.codriverIds = new ArrayList<>();
    }
    this.codriverIds.add(codriverIdsItem);
    return this;
  }

  /**
   * Get codriverIds
   * @return codriverIds
  */
  @ApiModelProperty(value = "")


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
    return Objects.equals(this.locLng, hosLogsResponseLogs.locLng) &&
        Objects.equals(this.logStartMs, hosLogsResponseLogs.logStartMs) &&
        Objects.equals(this.driverId, hosLogsResponseLogs.driverId) &&
        Objects.equals(this.statusType, hosLogsResponseLogs.statusType) &&
        Objects.equals(this.locCity, hosLogsResponseLogs.locCity) &&
        Objects.equals(this.groupId, hosLogsResponseLogs.groupId) &&
        Objects.equals(this.locName, hosLogsResponseLogs.locName) &&
        Objects.equals(this.locLat, hosLogsResponseLogs.locLat) &&
        Objects.equals(this.remark, hosLogsResponseLogs.remark) &&
        Objects.equals(this.locState, hosLogsResponseLogs.locState) &&
        Objects.equals(this.vehicleId, hosLogsResponseLogs.vehicleId) &&
        Objects.equals(this.codriverIds, hosLogsResponseLogs.codriverIds);
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

