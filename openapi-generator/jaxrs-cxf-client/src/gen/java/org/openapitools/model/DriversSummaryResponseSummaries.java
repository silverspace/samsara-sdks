package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DriversSummaryResponseSummaries  {
  
  @ApiModelProperty(example = "444", value = "ID of the driver.")
 /**
   * ID of the driver.
  **/
  private Long driverId;

  @ApiModelProperty(example = "123.24", value = "Distance driven in miles, rounded to two decimal places.")
 /**
   * Distance driven in miles, rounded to two decimal places.
  **/
  private Double distanceMiles;

  @ApiModelProperty(example = "21600000", value = "Duration in milliseconds that driver was driving during the requested time range")
 /**
   * Duration in milliseconds that driver was driving during the requested time range
  **/
  private Long driveMs;

  @ApiModelProperty(example = "43200000", value = "Duration in milliseconds that driver was on duty or driving during the requested time range")
 /**
   * Duration in milliseconds that driver was on duty or driving during the requested time range
  **/
  private Long activeMs;

  @ApiModelProperty(example = "fjacobs", value = "Username of the driver.")
 /**
   * Username of the driver.
  **/
  private String driverUsername;

  @ApiModelProperty(example = "111", value = "Group of the driver.")
 /**
   * Group of the driver.
  **/
  private Long groupId;

  @ApiModelProperty(example = "Fred Jacobs", value = "Name of the driver.")
 /**
   * Name of the driver.
  **/
  private String driverName;

  @ApiModelProperty(example = "21600000", value = "Duration in milliseconds that driver was on duty during the requested time range")
 /**
   * Duration in milliseconds that driver was on duty during the requested time range
  **/
  private Long onDutyMs;
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

  public DriversSummaryResponseSummaries driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

 /**
   * Distance driven in miles, rounded to two decimal places.
   * @return distanceMiles
  **/
  @JsonProperty("distanceMiles")
  public Double getDistanceMiles() {
    return distanceMiles;
  }

  public void setDistanceMiles(Double distanceMiles) {
    this.distanceMiles = distanceMiles;
  }

  public DriversSummaryResponseSummaries distanceMiles(Double distanceMiles) {
    this.distanceMiles = distanceMiles;
    return this;
  }

 /**
   * Duration in milliseconds that driver was driving during the requested time range
   * @return driveMs
  **/
  @JsonProperty("driveMs")
  public Long getDriveMs() {
    return driveMs;
  }

  public void setDriveMs(Long driveMs) {
    this.driveMs = driveMs;
  }

  public DriversSummaryResponseSummaries driveMs(Long driveMs) {
    this.driveMs = driveMs;
    return this;
  }

 /**
   * Duration in milliseconds that driver was on duty or driving during the requested time range
   * @return activeMs
  **/
  @JsonProperty("activeMs")
  public Long getActiveMs() {
    return activeMs;
  }

  public void setActiveMs(Long activeMs) {
    this.activeMs = activeMs;
  }

  public DriversSummaryResponseSummaries activeMs(Long activeMs) {
    this.activeMs = activeMs;
    return this;
  }

 /**
   * Username of the driver.
   * @return driverUsername
  **/
  @JsonProperty("driverUsername")
  public String getDriverUsername() {
    return driverUsername;
  }

  public void setDriverUsername(String driverUsername) {
    this.driverUsername = driverUsername;
  }

  public DriversSummaryResponseSummaries driverUsername(String driverUsername) {
    this.driverUsername = driverUsername;
    return this;
  }

 /**
   * Group of the driver.
   * @return groupId
  **/
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public DriversSummaryResponseSummaries groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

 /**
   * Name of the driver.
   * @return driverName
  **/
  @JsonProperty("driverName")
  public String getDriverName() {
    return driverName;
  }

  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

  public DriversSummaryResponseSummaries driverName(String driverName) {
    this.driverName = driverName;
    return this;
  }

 /**
   * Duration in milliseconds that driver was on duty during the requested time range
   * @return onDutyMs
  **/
  @JsonProperty("onDutyMs")
  public Long getOnDutyMs() {
    return onDutyMs;
  }

  public void setOnDutyMs(Long onDutyMs) {
    this.onDutyMs = onDutyMs;
  }

  public DriversSummaryResponseSummaries onDutyMs(Long onDutyMs) {
    this.onDutyMs = onDutyMs;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

