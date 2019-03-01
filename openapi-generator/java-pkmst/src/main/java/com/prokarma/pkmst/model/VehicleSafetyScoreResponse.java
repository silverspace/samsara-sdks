package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.SafetyReportHarshEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Safety score details for a vehicle
 */
@ApiModel(description = "Safety score details for a vehicle")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class VehicleSafetyScoreResponse   {
  @JsonProperty("crashCount")
  private Integer crashCount;

  @JsonProperty("harshAccelCount")
  private Integer harshAccelCount;

  @JsonProperty("harshBrakingCount")
  private Integer harshBrakingCount;

  @JsonProperty("harshEvents")
  
  private List<SafetyReportHarshEvent> harshEvents = null;

  @JsonProperty("harshTurningCount")
  private Integer harshTurningCount;

  @JsonProperty("safetyScore")
  private Integer safetyScore;

  @JsonProperty("safetyScoreRank")
  private String safetyScoreRank;

  @JsonProperty("timeOverSpeedLimitMs")
  private Integer timeOverSpeedLimitMs;

  @JsonProperty("totalDistanceDrivenMeters")
  private Integer totalDistanceDrivenMeters;

  @JsonProperty("totalHarshEventCount")
  private Integer totalHarshEventCount;

  @JsonProperty("totalTimeDrivenMs")
  private Integer totalTimeDrivenMs;

  @JsonProperty("vehicleId")
  private Integer vehicleId;

  public VehicleSafetyScoreResponse crashCount(Integer crashCount) {
    this.crashCount = crashCount;
    return this;
  }

   /**
   * Crash event count
   * @return crashCount
  **/
  @ApiModelProperty(example = "0", value = "Crash event count")
  public Integer getCrashCount() {
    return crashCount;
  }

  public void setCrashCount(Integer crashCount) {
    this.crashCount = crashCount;
  }

  public VehicleSafetyScoreResponse harshAccelCount(Integer harshAccelCount) {
    this.harshAccelCount = harshAccelCount;
    return this;
  }

   /**
   * Harsh acceleration event count
   * @return harshAccelCount
  **/
  @ApiModelProperty(example = "1", value = "Harsh acceleration event count")
  public Integer getHarshAccelCount() {
    return harshAccelCount;
  }

  public void setHarshAccelCount(Integer harshAccelCount) {
    this.harshAccelCount = harshAccelCount;
  }

  public VehicleSafetyScoreResponse harshBrakingCount(Integer harshBrakingCount) {
    this.harshBrakingCount = harshBrakingCount;
    return this;
  }

   /**
   * Harsh braking event count
   * @return harshBrakingCount
  **/
  @ApiModelProperty(example = "2", value = "Harsh braking event count")
  public Integer getHarshBrakingCount() {
    return harshBrakingCount;
  }

  public void setHarshBrakingCount(Integer harshBrakingCount) {
    this.harshBrakingCount = harshBrakingCount;
  }

  public VehicleSafetyScoreResponse harshEvents(List<SafetyReportHarshEvent> harshEvents) {
    this.harshEvents = harshEvents;
    return this;
  }

  public VehicleSafetyScoreResponse addHarshEventsItem(SafetyReportHarshEvent harshEventsItem) {
    if (this.harshEvents == null) {
      this.harshEvents = new ArrayList<>();
    }
    this.harshEvents.add(harshEventsItem);
    return this;
  }

   /**
   * Get harshEvents
   * @return harshEvents
  **/
  @ApiModelProperty(value = "")
  public List<SafetyReportHarshEvent> getHarshEvents() {
    return harshEvents;
  }

  public void setHarshEvents(List<SafetyReportHarshEvent> harshEvents) {
    this.harshEvents = harshEvents;
  }

  public VehicleSafetyScoreResponse harshTurningCount(Integer harshTurningCount) {
    this.harshTurningCount = harshTurningCount;
    return this;
  }

   /**
   * Harsh turning event count
   * @return harshTurningCount
  **/
  @ApiModelProperty(example = "0", value = "Harsh turning event count")
  public Integer getHarshTurningCount() {
    return harshTurningCount;
  }

  public void setHarshTurningCount(Integer harshTurningCount) {
    this.harshTurningCount = harshTurningCount;
  }

  public VehicleSafetyScoreResponse safetyScore(Integer safetyScore) {
    this.safetyScore = safetyScore;
    return this;
  }

   /**
   * Safety Score
   * @return safetyScore
  **/
  @ApiModelProperty(example = "97", value = "Safety Score")
  public Integer getSafetyScore() {
    return safetyScore;
  }

  public void setSafetyScore(Integer safetyScore) {
    this.safetyScore = safetyScore;
  }

  public VehicleSafetyScoreResponse safetyScoreRank(String safetyScoreRank) {
    this.safetyScoreRank = safetyScoreRank;
    return this;
  }

   /**
   * Safety Score Rank
   * @return safetyScoreRank
  **/
  @ApiModelProperty(example = "26", value = "Safety Score Rank")
  public String getSafetyScoreRank() {
    return safetyScoreRank;
  }

  public void setSafetyScoreRank(String safetyScoreRank) {
    this.safetyScoreRank = safetyScoreRank;
  }

  public VehicleSafetyScoreResponse timeOverSpeedLimitMs(Integer timeOverSpeedLimitMs) {
    this.timeOverSpeedLimitMs = timeOverSpeedLimitMs;
    return this;
  }

   /**
   * Amount of time driven over the speed limit in milliseconds
   * @return timeOverSpeedLimitMs
  **/
  @ApiModelProperty(example = "3769", value = "Amount of time driven over the speed limit in milliseconds")
  public Integer getTimeOverSpeedLimitMs() {
    return timeOverSpeedLimitMs;
  }

  public void setTimeOverSpeedLimitMs(Integer timeOverSpeedLimitMs) {
    this.timeOverSpeedLimitMs = timeOverSpeedLimitMs;
  }

  public VehicleSafetyScoreResponse totalDistanceDrivenMeters(Integer totalDistanceDrivenMeters) {
    this.totalDistanceDrivenMeters = totalDistanceDrivenMeters;
    return this;
  }

   /**
   * Total distance driven in meters
   * @return totalDistanceDrivenMeters
  **/
  @ApiModelProperty(example = "291836", value = "Total distance driven in meters")
  public Integer getTotalDistanceDrivenMeters() {
    return totalDistanceDrivenMeters;
  }

  public void setTotalDistanceDrivenMeters(Integer totalDistanceDrivenMeters) {
    this.totalDistanceDrivenMeters = totalDistanceDrivenMeters;
  }

  public VehicleSafetyScoreResponse totalHarshEventCount(Integer totalHarshEventCount) {
    this.totalHarshEventCount = totalHarshEventCount;
    return this;
  }

   /**
   * Total harsh event count
   * @return totalHarshEventCount
  **/
  @ApiModelProperty(example = "3", value = "Total harsh event count")
  public Integer getTotalHarshEventCount() {
    return totalHarshEventCount;
  }

  public void setTotalHarshEventCount(Integer totalHarshEventCount) {
    this.totalHarshEventCount = totalHarshEventCount;
  }

  public VehicleSafetyScoreResponse totalTimeDrivenMs(Integer totalTimeDrivenMs) {
    this.totalTimeDrivenMs = totalTimeDrivenMs;
    return this;
  }

   /**
   * Amount of time driven in milliseconds
   * @return totalTimeDrivenMs
  **/
  @ApiModelProperty(example = "19708293", value = "Amount of time driven in milliseconds")
  public Integer getTotalTimeDrivenMs() {
    return totalTimeDrivenMs;
  }

  public void setTotalTimeDrivenMs(Integer totalTimeDrivenMs) {
    this.totalTimeDrivenMs = totalTimeDrivenMs;
  }

  public VehicleSafetyScoreResponse vehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * Vehicle ID
   * @return vehicleId
  **/
  @ApiModelProperty(example = "4321", value = "Vehicle ID")
  public Integer getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Integer vehicleId) {
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
    VehicleSafetyScoreResponse vehicleSafetyScoreResponse = (VehicleSafetyScoreResponse) o;
    return Objects.equals(this.crashCount, vehicleSafetyScoreResponse.crashCount) &&
        Objects.equals(this.harshAccelCount, vehicleSafetyScoreResponse.harshAccelCount) &&
        Objects.equals(this.harshBrakingCount, vehicleSafetyScoreResponse.harshBrakingCount) &&
        Objects.equals(this.harshEvents, vehicleSafetyScoreResponse.harshEvents) &&
        Objects.equals(this.harshTurningCount, vehicleSafetyScoreResponse.harshTurningCount) &&
        Objects.equals(this.safetyScore, vehicleSafetyScoreResponse.safetyScore) &&
        Objects.equals(this.safetyScoreRank, vehicleSafetyScoreResponse.safetyScoreRank) &&
        Objects.equals(this.timeOverSpeedLimitMs, vehicleSafetyScoreResponse.timeOverSpeedLimitMs) &&
        Objects.equals(this.totalDistanceDrivenMeters, vehicleSafetyScoreResponse.totalDistanceDrivenMeters) &&
        Objects.equals(this.totalHarshEventCount, vehicleSafetyScoreResponse.totalHarshEventCount) &&
        Objects.equals(this.totalTimeDrivenMs, vehicleSafetyScoreResponse.totalTimeDrivenMs) &&
        Objects.equals(this.vehicleId, vehicleSafetyScoreResponse.vehicleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crashCount, harshAccelCount, harshBrakingCount, harshEvents, harshTurningCount, safetyScore, safetyScoreRank, timeOverSpeedLimitMs, totalDistanceDrivenMeters, totalHarshEventCount, totalTimeDrivenMs, vehicleId);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

