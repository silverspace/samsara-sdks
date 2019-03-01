package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.SafetyReportHarshEvent;
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

/**
  * Safety score details for a vehicle
 **/
@ApiModel(description="Safety score details for a vehicle")
public class VehicleSafetyScoreResponse  {
  
  @ApiModelProperty(example = "0", value = "Crash event count")
 /**
   * Crash event count
  **/
  private Integer crashCount = null;

  @ApiModelProperty(example = "1", value = "Harsh acceleration event count")
 /**
   * Harsh acceleration event count
  **/
  private Integer harshAccelCount = null;

  @ApiModelProperty(example = "2", value = "Harsh braking event count")
 /**
   * Harsh braking event count
  **/
  private Integer harshBrakingCount = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<SafetyReportHarshEvent> harshEvents = null;

  @ApiModelProperty(example = "0", value = "Harsh turning event count")
 /**
   * Harsh turning event count
  **/
  private Integer harshTurningCount = null;

  @ApiModelProperty(example = "97", value = "Safety Score")
 /**
   * Safety Score
  **/
  private Integer safetyScore = null;

  @ApiModelProperty(example = "26", value = "Safety Score Rank")
 /**
   * Safety Score Rank
  **/
  private String safetyScoreRank = null;

  @ApiModelProperty(example = "3769", value = "Amount of time driven over the speed limit in milliseconds")
 /**
   * Amount of time driven over the speed limit in milliseconds
  **/
  private Integer timeOverSpeedLimitMs = null;

  @ApiModelProperty(example = "291836", value = "Total distance driven in meters")
 /**
   * Total distance driven in meters
  **/
  private Integer totalDistanceDrivenMeters = null;

  @ApiModelProperty(example = "3", value = "Total harsh event count")
 /**
   * Total harsh event count
  **/
  private Integer totalHarshEventCount = null;

  @ApiModelProperty(example = "19708293", value = "Amount of time driven in milliseconds")
 /**
   * Amount of time driven in milliseconds
  **/
  private Integer totalTimeDrivenMs = null;

  @ApiModelProperty(example = "4321", value = "Vehicle ID")
 /**
   * Vehicle ID
  **/
  private Integer vehicleId = null;
 /**
   * Crash event count
   * @return crashCount
  **/
  @JsonProperty("crashCount")
  public Integer getCrashCount() {
    return crashCount;
  }

  public void setCrashCount(Integer crashCount) {
    this.crashCount = crashCount;
  }

  public VehicleSafetyScoreResponse crashCount(Integer crashCount) {
    this.crashCount = crashCount;
    return this;
  }

 /**
   * Harsh acceleration event count
   * @return harshAccelCount
  **/
  @JsonProperty("harshAccelCount")
  public Integer getHarshAccelCount() {
    return harshAccelCount;
  }

  public void setHarshAccelCount(Integer harshAccelCount) {
    this.harshAccelCount = harshAccelCount;
  }

  public VehicleSafetyScoreResponse harshAccelCount(Integer harshAccelCount) {
    this.harshAccelCount = harshAccelCount;
    return this;
  }

 /**
   * Harsh braking event count
   * @return harshBrakingCount
  **/
  @JsonProperty("harshBrakingCount")
  public Integer getHarshBrakingCount() {
    return harshBrakingCount;
  }

  public void setHarshBrakingCount(Integer harshBrakingCount) {
    this.harshBrakingCount = harshBrakingCount;
  }

  public VehicleSafetyScoreResponse harshBrakingCount(Integer harshBrakingCount) {
    this.harshBrakingCount = harshBrakingCount;
    return this;
  }

 /**
   * Get harshEvents
   * @return harshEvents
  **/
  @JsonProperty("harshEvents")
  public List<SafetyReportHarshEvent> getHarshEvents() {
    return harshEvents;
  }

  public void setHarshEvents(List<SafetyReportHarshEvent> harshEvents) {
    this.harshEvents = harshEvents;
  }

  public VehicleSafetyScoreResponse harshEvents(List<SafetyReportHarshEvent> harshEvents) {
    this.harshEvents = harshEvents;
    return this;
  }

  public VehicleSafetyScoreResponse addHarshEventsItem(SafetyReportHarshEvent harshEventsItem) {
    this.harshEvents.add(harshEventsItem);
    return this;
  }

 /**
   * Harsh turning event count
   * @return harshTurningCount
  **/
  @JsonProperty("harshTurningCount")
  public Integer getHarshTurningCount() {
    return harshTurningCount;
  }

  public void setHarshTurningCount(Integer harshTurningCount) {
    this.harshTurningCount = harshTurningCount;
  }

  public VehicleSafetyScoreResponse harshTurningCount(Integer harshTurningCount) {
    this.harshTurningCount = harshTurningCount;
    return this;
  }

 /**
   * Safety Score
   * @return safetyScore
  **/
  @JsonProperty("safetyScore")
  public Integer getSafetyScore() {
    return safetyScore;
  }

  public void setSafetyScore(Integer safetyScore) {
    this.safetyScore = safetyScore;
  }

  public VehicleSafetyScoreResponse safetyScore(Integer safetyScore) {
    this.safetyScore = safetyScore;
    return this;
  }

 /**
   * Safety Score Rank
   * @return safetyScoreRank
  **/
  @JsonProperty("safetyScoreRank")
  public String getSafetyScoreRank() {
    return safetyScoreRank;
  }

  public void setSafetyScoreRank(String safetyScoreRank) {
    this.safetyScoreRank = safetyScoreRank;
  }

  public VehicleSafetyScoreResponse safetyScoreRank(String safetyScoreRank) {
    this.safetyScoreRank = safetyScoreRank;
    return this;
  }

 /**
   * Amount of time driven over the speed limit in milliseconds
   * @return timeOverSpeedLimitMs
  **/
  @JsonProperty("timeOverSpeedLimitMs")
  public Integer getTimeOverSpeedLimitMs() {
    return timeOverSpeedLimitMs;
  }

  public void setTimeOverSpeedLimitMs(Integer timeOverSpeedLimitMs) {
    this.timeOverSpeedLimitMs = timeOverSpeedLimitMs;
  }

  public VehicleSafetyScoreResponse timeOverSpeedLimitMs(Integer timeOverSpeedLimitMs) {
    this.timeOverSpeedLimitMs = timeOverSpeedLimitMs;
    return this;
  }

 /**
   * Total distance driven in meters
   * @return totalDistanceDrivenMeters
  **/
  @JsonProperty("totalDistanceDrivenMeters")
  public Integer getTotalDistanceDrivenMeters() {
    return totalDistanceDrivenMeters;
  }

  public void setTotalDistanceDrivenMeters(Integer totalDistanceDrivenMeters) {
    this.totalDistanceDrivenMeters = totalDistanceDrivenMeters;
  }

  public VehicleSafetyScoreResponse totalDistanceDrivenMeters(Integer totalDistanceDrivenMeters) {
    this.totalDistanceDrivenMeters = totalDistanceDrivenMeters;
    return this;
  }

 /**
   * Total harsh event count
   * @return totalHarshEventCount
  **/
  @JsonProperty("totalHarshEventCount")
  public Integer getTotalHarshEventCount() {
    return totalHarshEventCount;
  }

  public void setTotalHarshEventCount(Integer totalHarshEventCount) {
    this.totalHarshEventCount = totalHarshEventCount;
  }

  public VehicleSafetyScoreResponse totalHarshEventCount(Integer totalHarshEventCount) {
    this.totalHarshEventCount = totalHarshEventCount;
    return this;
  }

 /**
   * Amount of time driven in milliseconds
   * @return totalTimeDrivenMs
  **/
  @JsonProperty("totalTimeDrivenMs")
  public Integer getTotalTimeDrivenMs() {
    return totalTimeDrivenMs;
  }

  public void setTotalTimeDrivenMs(Integer totalTimeDrivenMs) {
    this.totalTimeDrivenMs = totalTimeDrivenMs;
  }

  public VehicleSafetyScoreResponse totalTimeDrivenMs(Integer totalTimeDrivenMs) {
    this.totalTimeDrivenMs = totalTimeDrivenMs;
    return this;
  }

 /**
   * Vehicle ID
   * @return vehicleId
  **/
  @JsonProperty("vehicleId")
  public Integer getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
  }

  public VehicleSafetyScoreResponse vehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleSafetyScoreResponse {\n");
    
    sb.append("    crashCount: ").append(toIndentedString(crashCount)).append("\n");
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

