package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class DriversSummaryResponseSummaries   {
  
  private Long driverId;
  private Double distanceMiles;
  private Long driveMs;
  private Long activeMs;
  private String driverUsername;
  private Long groupId;
  private String driverName;
  private Long onDutyMs;

  public DriversSummaryResponseSummaries () {

  }

  public DriversSummaryResponseSummaries (Long driverId, Double distanceMiles, Long driveMs, Long activeMs, String driverUsername, Long groupId, String driverName, Long onDutyMs) {
    this.driverId = driverId;
    this.distanceMiles = distanceMiles;
    this.driveMs = driveMs;
    this.activeMs = activeMs;
    this.driverUsername = driverUsername;
    this.groupId = groupId;
    this.driverName = driverName;
    this.onDutyMs = onDutyMs;
  }

    
  @JsonProperty("driverId")
  public Long getDriverId() {
    return driverId;
  }
  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

    
  @JsonProperty("distanceMiles")
  public Double getDistanceMiles() {
    return distanceMiles;
  }
  public void setDistanceMiles(Double distanceMiles) {
    this.distanceMiles = distanceMiles;
  }

    
  @JsonProperty("driveMs")
  public Long getDriveMs() {
    return driveMs;
  }
  public void setDriveMs(Long driveMs) {
    this.driveMs = driveMs;
  }

    
  @JsonProperty("activeMs")
  public Long getActiveMs() {
    return activeMs;
  }
  public void setActiveMs(Long activeMs) {
    this.activeMs = activeMs;
  }

    
  @JsonProperty("driverUsername")
  public String getDriverUsername() {
    return driverUsername;
  }
  public void setDriverUsername(String driverUsername) {
    this.driverUsername = driverUsername;
  }

    
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

    
  @JsonProperty("driverName")
  public String getDriverName() {
    return driverName;
  }
  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

    
  @JsonProperty("onDutyMs")
  public Long getOnDutyMs() {
    return onDutyMs;
  }
  public void setOnDutyMs(Long onDutyMs) {
    this.onDutyMs = onDutyMs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriversSummaryResponseSummaries driversSummaryResponseSummaries = (DriversSummaryResponseSummaries) o;
    return Objects.equals(driverId, driversSummaryResponseSummaries.driverId) &&
        Objects.equals(distanceMiles, driversSummaryResponseSummaries.distanceMiles) &&
        Objects.equals(driveMs, driversSummaryResponseSummaries.driveMs) &&
        Objects.equals(activeMs, driversSummaryResponseSummaries.activeMs) &&
        Objects.equals(driverUsername, driversSummaryResponseSummaries.driverUsername) &&
        Objects.equals(groupId, driversSummaryResponseSummaries.groupId) &&
        Objects.equals(driverName, driversSummaryResponseSummaries.driverName) &&
        Objects.equals(onDutyMs, driversSummaryResponseSummaries.onDutyMs);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
