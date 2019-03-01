package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DriversSummaryResponseSummaries
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

public class DriversSummaryResponseSummaries   {
  @JsonProperty("driverId")
  private Long driverId;

  @JsonProperty("distanceMiles")
  private Double distanceMiles;

  @JsonProperty("driveMs")
  private Long driveMs;

  @JsonProperty("activeMs")
  private Long activeMs;

  @JsonProperty("driverUsername")
  private String driverUsername;

  @JsonProperty("groupId")
  private Long groupId;

  @JsonProperty("driverName")
  private String driverName;

  @JsonProperty("onDutyMs")
  private Long onDutyMs;

  public DriversSummaryResponseSummaries driverId(Long driverId) {
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

  public DriversSummaryResponseSummaries distanceMiles(Double distanceMiles) {
    this.distanceMiles = distanceMiles;
    return this;
  }

  /**
   * Distance driven in miles, rounded to two decimal places.
   * @return distanceMiles
  */
  @ApiModelProperty(example = "123.24", value = "Distance driven in miles, rounded to two decimal places.")


  public Double getDistanceMiles() {
    return distanceMiles;
  }

  public void setDistanceMiles(Double distanceMiles) {
    this.distanceMiles = distanceMiles;
  }

  public DriversSummaryResponseSummaries driveMs(Long driveMs) {
    this.driveMs = driveMs;
    return this;
  }

  /**
   * Duration in milliseconds that driver was driving during the requested time range
   * @return driveMs
  */
  @ApiModelProperty(example = "21600000", value = "Duration in milliseconds that driver was driving during the requested time range")


  public Long getDriveMs() {
    return driveMs;
  }

  public void setDriveMs(Long driveMs) {
    this.driveMs = driveMs;
  }

  public DriversSummaryResponseSummaries activeMs(Long activeMs) {
    this.activeMs = activeMs;
    return this;
  }

  /**
   * Duration in milliseconds that driver was on duty or driving during the requested time range
   * @return activeMs
  */
  @ApiModelProperty(example = "43200000", value = "Duration in milliseconds that driver was on duty or driving during the requested time range")


  public Long getActiveMs() {
    return activeMs;
  }

  public void setActiveMs(Long activeMs) {
    this.activeMs = activeMs;
  }

  public DriversSummaryResponseSummaries driverUsername(String driverUsername) {
    this.driverUsername = driverUsername;
    return this;
  }

  /**
   * Username of the driver.
   * @return driverUsername
  */
  @ApiModelProperty(example = "fjacobs", value = "Username of the driver.")


  public String getDriverUsername() {
    return driverUsername;
  }

  public void setDriverUsername(String driverUsername) {
    this.driverUsername = driverUsername;
  }

  public DriversSummaryResponseSummaries groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Group of the driver.
   * @return groupId
  */
  @ApiModelProperty(example = "111", value = "Group of the driver.")


  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public DriversSummaryResponseSummaries driverName(String driverName) {
    this.driverName = driverName;
    return this;
  }

  /**
   * Name of the driver.
   * @return driverName
  */
  @ApiModelProperty(example = "Fred Jacobs", value = "Name of the driver.")


  public String getDriverName() {
    return driverName;
  }

  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

  public DriversSummaryResponseSummaries onDutyMs(Long onDutyMs) {
    this.onDutyMs = onDutyMs;
    return this;
  }

  /**
   * Duration in milliseconds that driver was on duty during the requested time range
   * @return onDutyMs
  */
  @ApiModelProperty(example = "21600000", value = "Duration in milliseconds that driver was on duty during the requested time range")


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
    return Objects.equals(this.driverId, driversSummaryResponseSummaries.driverId) &&
        Objects.equals(this.distanceMiles, driversSummaryResponseSummaries.distanceMiles) &&
        Objects.equals(this.driveMs, driversSummaryResponseSummaries.driveMs) &&
        Objects.equals(this.activeMs, driversSummaryResponseSummaries.activeMs) &&
        Objects.equals(this.driverUsername, driversSummaryResponseSummaries.driverUsername) &&
        Objects.equals(this.groupId, driversSummaryResponseSummaries.groupId) &&
        Objects.equals(this.driverName, driversSummaryResponseSummaries.driverName) &&
        Objects.equals(this.onDutyMs, driversSummaryResponseSummaries.onDutyMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driverId, distanceMiles, driveMs, activeMs, driverUsername, groupId, driverName, onDutyMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriversSummaryResponseSummaries {\n");
    
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    distanceMiles: ").append(toIndentedString(distanceMiles)).append("\n");
    sb.append("    driveMs: ").append(toIndentedString(driveMs)).append("\n");
    sb.append("    activeMs: ").append(toIndentedString(activeMs)).append("\n");
    sb.append("    driverUsername: ").append(toIndentedString(driverUsername)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    driverName: ").append(toIndentedString(driverName)).append("\n");
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

