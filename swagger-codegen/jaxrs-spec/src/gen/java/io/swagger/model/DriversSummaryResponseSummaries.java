package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DriversSummaryResponseSummaries   {
  
  private @Valid Long activeMs = null;
  private @Valid Double distanceMiles = null;
  private @Valid Long driveMs = null;
  private @Valid Long driverId = null;
  private @Valid String driverName = null;
  private @Valid String driverUsername = null;
  private @Valid Long groupId = null;
  private @Valid Long onDutyMs = null;

  /**
   * Duration in milliseconds that driver was on duty or driving during the requested time range
   **/
  public DriversSummaryResponseSummaries activeMs(Long activeMs) {
    this.activeMs = activeMs;
    return this;
  }

  
  @ApiModelProperty(example = "43200000", value = "Duration in milliseconds that driver was on duty or driving during the requested time range")
  @JsonProperty("activeMs")
  public Long getActiveMs() {
    return activeMs;
  }
  public void setActiveMs(Long activeMs) {
    this.activeMs = activeMs;
  }

  /**
   * Distance driven in miles, rounded to two decimal places.
   **/
  public DriversSummaryResponseSummaries distanceMiles(Double distanceMiles) {
    this.distanceMiles = distanceMiles;
    return this;
  }

  
  @ApiModelProperty(example = "123.24", value = "Distance driven in miles, rounded to two decimal places.")
  @JsonProperty("distanceMiles")
  public Double getDistanceMiles() {
    return distanceMiles;
  }
  public void setDistanceMiles(Double distanceMiles) {
    this.distanceMiles = distanceMiles;
  }

  /**
   * Duration in milliseconds that driver was driving during the requested time range
   **/
  public DriversSummaryResponseSummaries driveMs(Long driveMs) {
    this.driveMs = driveMs;
    return this;
  }

  
  @ApiModelProperty(example = "21600000", value = "Duration in milliseconds that driver was driving during the requested time range")
  @JsonProperty("driveMs")
  public Long getDriveMs() {
    return driveMs;
  }
  public void setDriveMs(Long driveMs) {
    this.driveMs = driveMs;
  }

  /**
   * ID of the driver.
   **/
  public DriversSummaryResponseSummaries driverId(Long driverId) {
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
   * Name of the driver.
   **/
  public DriversSummaryResponseSummaries driverName(String driverName) {
    this.driverName = driverName;
    return this;
  }

  
  @ApiModelProperty(example = "Fred Jacobs", value = "Name of the driver.")
  @JsonProperty("driverName")
  public String getDriverName() {
    return driverName;
  }
  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

  /**
   * Username of the driver.
   **/
  public DriversSummaryResponseSummaries driverUsername(String driverUsername) {
    this.driverUsername = driverUsername;
    return this;
  }

  
  @ApiModelProperty(example = "fjacobs", value = "Username of the driver.")
  @JsonProperty("driverUsername")
  public String getDriverUsername() {
    return driverUsername;
  }
  public void setDriverUsername(String driverUsername) {
    this.driverUsername = driverUsername;
  }

  /**
   * Group of the driver.
   **/
  public DriversSummaryResponseSummaries groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  
  @ApiModelProperty(example = "111", value = "Group of the driver.")
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  /**
   * Duration in milliseconds that driver was on duty during the requested time range
   **/
  public DriversSummaryResponseSummaries onDutyMs(Long onDutyMs) {
    this.onDutyMs = onDutyMs;
    return this;
  }

  
  @ApiModelProperty(example = "21600000", value = "Duration in milliseconds that driver was on duty during the requested time range")
  @JsonProperty("onDutyMs")
  public Long getOnDutyMs() {
    return onDutyMs;
  }
  public void setOnDutyMs(Long onDutyMs) {
    this.onDutyMs = onDutyMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriversSummaryResponseSummaries driversSummaryResponseSummaries = (DriversSummaryResponseSummaries) o;
    return Objects.equals(activeMs, driversSummaryResponseSummaries.activeMs) &&
        Objects.equals(distanceMiles, driversSummaryResponseSummaries.distanceMiles) &&
        Objects.equals(driveMs, driversSummaryResponseSummaries.driveMs) &&
        Objects.equals(driverId, driversSummaryResponseSummaries.driverId) &&
        Objects.equals(driverName, driversSummaryResponseSummaries.driverName) &&
        Objects.equals(driverUsername, driversSummaryResponseSummaries.driverUsername) &&
        Objects.equals(groupId, driversSummaryResponseSummaries.groupId) &&
        Objects.equals(onDutyMs, driversSummaryResponseSummaries.onDutyMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeMs, distanceMiles, driveMs, driverId, driverName, driverUsername, groupId, onDutyMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriversSummaryResponseSummaries {\n");
    
    sb.append("    activeMs: ").append(toIndentedString(activeMs)).append("\n");
    sb.append("    distanceMiles: ").append(toIndentedString(distanceMiles)).append("\n");
    sb.append("    driveMs: ").append(toIndentedString(driveMs)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    driverName: ").append(toIndentedString(driverName)).append("\n");
    sb.append("    driverUsername: ").append(toIndentedString(driverUsername)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    onDutyMs: ").append(toIndentedString(onDutyMs)).append("\n");
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

