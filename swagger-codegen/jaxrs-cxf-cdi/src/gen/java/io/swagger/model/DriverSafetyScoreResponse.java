package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.model.SafetyReportHarshEvent;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * Safety score details for a driver
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "Safety score details for a driver")

public class DriverSafetyScoreResponse   {
  
  private Integer crashCount = null;
  private Integer driverId = null;
  private Integer harshAccelCount = null;
  private Integer harshBrakingCount = null;
  private List<SafetyReportHarshEvent> harshEvents = new ArrayList<SafetyReportHarshEvent>();
  private Integer harshTurningCount = null;
  private Integer safetyScore = null;
  private String safetyScoreRank = null;
  private Integer timeOverSpeedLimitMs = null;
  private Integer totalDistanceDrivenMeters = null;
  private Integer totalHarshEventCount = null;
  private Integer totalTimeDrivenMs = null;

  /**
   * Crash event count
   **/
  public DriverSafetyScoreResponse crashCount(Integer crashCount) {
    this.crashCount = crashCount;
    return this;
  }

  
  @ApiModelProperty(example = "0", value = "Crash event count")
  @JsonProperty("crashCount")
  public Integer getCrashCount() {
    return crashCount;
  }
  public void setCrashCount(Integer crashCount) {
    this.crashCount = crashCount;
  }

  /**
   * Driver ID
   **/
  public DriverSafetyScoreResponse driverId(Integer driverId) {
    this.driverId = driverId;
    return this;
  }

  
  @ApiModelProperty(example = "1234", value = "Driver ID")
  @JsonProperty("driverId")
  public Integer getDriverId() {
    return driverId;
  }
  public void setDriverId(Integer driverId) {
    this.driverId = driverId;
  }

  /**
   * Harsh acceleration event count
   **/
  public DriverSafetyScoreResponse harshAccelCount(Integer harshAccelCount) {
    this.harshAccelCount = harshAccelCount;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "Harsh acceleration event count")
  @JsonProperty("harshAccelCount")
  public Integer getHarshAccelCount() {
    return harshAccelCount;
  }
  public void setHarshAccelCount(Integer harshAccelCount) {
    this.harshAccelCount = harshAccelCount;
  }

  /**
   * Harsh braking event count
   **/
  public DriverSafetyScoreResponse harshBrakingCount(Integer harshBrakingCount) {
    this.harshBrakingCount = harshBrakingCount;
    return this;
  }

  
  @ApiModelProperty(example = "2", value = "Harsh braking event count")
  @JsonProperty("harshBrakingCount")
  public Integer getHarshBrakingCount() {
    return harshBrakingCount;
  }
  public void setHarshBrakingCount(Integer harshBrakingCount) {
    this.harshBrakingCount = harshBrakingCount;
  }

  /**
   **/
  public DriverSafetyScoreResponse harshEvents(List<SafetyReportHarshEvent> harshEvents) {
    this.harshEvents = harshEvents;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("harshEvents")
  public List<SafetyReportHarshEvent> getHarshEvents() {
    return harshEvents;
  }
  public void setHarshEvents(List<SafetyReportHarshEvent> harshEvents) {
    this.harshEvents = harshEvents;
  }

  /**
   * Harsh turning event count
   **/
  public DriverSafetyScoreResponse harshTurningCount(Integer harshTurningCount) {
    this.harshTurningCount = harshTurningCount;
    return this;
  }

  
  @ApiModelProperty(example = "0", value = "Harsh turning event count")
  @JsonProperty("harshTurningCount")
  public Integer getHarshTurningCount() {
    return harshTurningCount;
  }
  public void setHarshTurningCount(Integer harshTurningCount) {
    this.harshTurningCount = harshTurningCount;
  }

  /**
   * Safety Score
   **/
  public DriverSafetyScoreResponse safetyScore(Integer safetyScore) {
    this.safetyScore = safetyScore;
    return this;
  }

  
  @ApiModelProperty(example = "97", value = "Safety Score")
  @JsonProperty("safetyScore")
  public Integer getSafetyScore() {
    return safetyScore;
  }
  public void setSafetyScore(Integer safetyScore) {
    this.safetyScore = safetyScore;
  }

  /**
   * Safety Score Rank
   **/
  public DriverSafetyScoreResponse safetyScoreRank(String safetyScoreRank) {
    this.safetyScoreRank = safetyScoreRank;
    return this;
  }

  
  @ApiModelProperty(example = "26", value = "Safety Score Rank")
  @JsonProperty("safetyScoreRank")
  public String getSafetyScoreRank() {
    return safetyScoreRank;
  }
  public void setSafetyScoreRank(String safetyScoreRank) {
    this.safetyScoreRank = safetyScoreRank;
  }

  /**
   * Amount of time driven over the speed limit in milliseconds
   **/
  public DriverSafetyScoreResponse timeOverSpeedLimitMs(Integer timeOverSpeedLimitMs) {
    this.timeOverSpeedLimitMs = timeOverSpeedLimitMs;
    return this;
  }

  
  @ApiModelProperty(example = "3769", value = "Amount of time driven over the speed limit in milliseconds")
  @JsonProperty("timeOverSpeedLimitMs")
  public Integer getTimeOverSpeedLimitMs() {
    return timeOverSpeedLimitMs;
  }
  public void setTimeOverSpeedLimitMs(Integer timeOverSpeedLimitMs) {
    this.timeOverSpeedLimitMs = timeOverSpeedLimitMs;
  }

  /**
   * Total distance driven in meters
   **/
  public DriverSafetyScoreResponse totalDistanceDrivenMeters(Integer totalDistanceDrivenMeters) {
    this.totalDistanceDrivenMeters = totalDistanceDrivenMeters;
    return this;
  }

  
  @ApiModelProperty(example = "291836", value = "Total distance driven in meters")
  @JsonProperty("totalDistanceDrivenMeters")
  public Integer getTotalDistanceDrivenMeters() {
    return totalDistanceDrivenMeters;
  }
  public void setTotalDistanceDrivenMeters(Integer totalDistanceDrivenMeters) {
    this.totalDistanceDrivenMeters = totalDistanceDrivenMeters;
  }

  /**
   * Total harsh event count
   **/
  public DriverSafetyScoreResponse totalHarshEventCount(Integer totalHarshEventCount) {
    this.totalHarshEventCount = totalHarshEventCount;
    return this;
  }

  
  @ApiModelProperty(example = "3", value = "Total harsh event count")
  @JsonProperty("totalHarshEventCount")
  public Integer getTotalHarshEventCount() {
    return totalHarshEventCount;
  }
  public void setTotalHarshEventCount(Integer totalHarshEventCount) {
    this.totalHarshEventCount = totalHarshEventCount;
  }

  /**
   * Amount of time driven in milliseconds
   **/
  public DriverSafetyScoreResponse totalTimeDrivenMs(Integer totalTimeDrivenMs) {
    this.totalTimeDrivenMs = totalTimeDrivenMs;
    return this;
  }

  
  @ApiModelProperty(example = "19708293", value = "Amount of time driven in milliseconds")
  @JsonProperty("totalTimeDrivenMs")
  public Integer getTotalTimeDrivenMs() {
    return totalTimeDrivenMs;
  }
  public void setTotalTimeDrivenMs(Integer totalTimeDrivenMs) {
    this.totalTimeDrivenMs = totalTimeDrivenMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverSafetyScoreResponse driverSafetyScoreResponse = (DriverSafetyScoreResponse) o;
    return Objects.equals(crashCount, driverSafetyScoreResponse.crashCount) &&
        Objects.equals(driverId, driverSafetyScoreResponse.driverId) &&
        Objects.equals(harshAccelCount, driverSafetyScoreResponse.harshAccelCount) &&
        Objects.equals(harshBrakingCount, driverSafetyScoreResponse.harshBrakingCount) &&
        Objects.equals(harshEvents, driverSafetyScoreResponse.harshEvents) &&
        Objects.equals(harshTurningCount, driverSafetyScoreResponse.harshTurningCount) &&
        Objects.equals(safetyScore, driverSafetyScoreResponse.safetyScore) &&
        Objects.equals(safetyScoreRank, driverSafetyScoreResponse.safetyScoreRank) &&
        Objects.equals(timeOverSpeedLimitMs, driverSafetyScoreResponse.timeOverSpeedLimitMs) &&
        Objects.equals(totalDistanceDrivenMeters, driverSafetyScoreResponse.totalDistanceDrivenMeters) &&
        Objects.equals(totalHarshEventCount, driverSafetyScoreResponse.totalHarshEventCount) &&
        Objects.equals(totalTimeDrivenMs, driverSafetyScoreResponse.totalTimeDrivenMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crashCount, driverId, harshAccelCount, harshBrakingCount, harshEvents, harshTurningCount, safetyScore, safetyScoreRank, timeOverSpeedLimitMs, totalDistanceDrivenMeters, totalHarshEventCount, totalTimeDrivenMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverSafetyScoreResponse {\n");
    
    sb.append("    crashCount: ").append(toIndentedString(crashCount)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    harshAccelCount: ").append(toIndentedString(harshAccelCount)).append("\n");
    sb.append("    harshBrakingCount: ").append(toIndentedString(harshBrakingCount)).append("\n");
    sb.append("    harshEvents: ").append(toIndentedString(harshEvents)).append("\n");
    sb.append("    harshTurningCount: ").append(toIndentedString(harshTurningCount)).append("\n");
    sb.append("    safetyScore: ").append(toIndentedString(safetyScore)).append("\n");
    sb.append("    safetyScoreRank: ").append(toIndentedString(safetyScoreRank)).append("\n");
    sb.append("    timeOverSpeedLimitMs: ").append(toIndentedString(timeOverSpeedLimitMs)).append("\n");
    sb.append("    totalDistanceDrivenMeters: ").append(toIndentedString(totalDistanceDrivenMeters)).append("\n");
    sb.append("    totalHarshEventCount: ").append(toIndentedString(totalHarshEventCount)).append("\n");
    sb.append("    totalTimeDrivenMs: ").append(toIndentedString(totalTimeDrivenMs)).append("\n");
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

