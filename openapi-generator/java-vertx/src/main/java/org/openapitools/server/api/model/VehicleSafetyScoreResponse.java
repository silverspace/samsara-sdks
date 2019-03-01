package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.SafetyReportHarshEvent;

/**
 * Safety score details for a vehicle
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class VehicleSafetyScoreResponse   {
  
  private Integer crashCount;
  private Integer harshAccelCount;
  private Integer harshBrakingCount;
  private List<SafetyReportHarshEvent> harshEvents = new ArrayList<>();
  private Integer harshTurningCount;
  private Integer safetyScore;
  private String safetyScoreRank;
  private Integer timeOverSpeedLimitMs;
  private Integer totalDistanceDrivenMeters;
  private Integer totalHarshEventCount;
  private Integer totalTimeDrivenMs;
  private Integer vehicleId;

  public VehicleSafetyScoreResponse () {

  }

  public VehicleSafetyScoreResponse (Integer crashCount, Integer harshAccelCount, Integer harshBrakingCount, List<SafetyReportHarshEvent> harshEvents, Integer harshTurningCount, Integer safetyScore, String safetyScoreRank, Integer timeOverSpeedLimitMs, Integer totalDistanceDrivenMeters, Integer totalHarshEventCount, Integer totalTimeDrivenMs, Integer vehicleId) {
    this.crashCount = crashCount;
    this.harshAccelCount = harshAccelCount;
    this.harshBrakingCount = harshBrakingCount;
    this.harshEvents = harshEvents;
    this.harshTurningCount = harshTurningCount;
    this.safetyScore = safetyScore;
    this.safetyScoreRank = safetyScoreRank;
    this.timeOverSpeedLimitMs = timeOverSpeedLimitMs;
    this.totalDistanceDrivenMeters = totalDistanceDrivenMeters;
    this.totalHarshEventCount = totalHarshEventCount;
    this.totalTimeDrivenMs = totalTimeDrivenMs;
    this.vehicleId = vehicleId;
  }

    
  @JsonProperty("crashCount")
  public Integer getCrashCount() {
    return crashCount;
  }
  public void setCrashCount(Integer crashCount) {
    this.crashCount = crashCount;
  }

    
  @JsonProperty("harshAccelCount")
  public Integer getHarshAccelCount() {
    return harshAccelCount;
  }
  public void setHarshAccelCount(Integer harshAccelCount) {
    this.harshAccelCount = harshAccelCount;
  }

    
  @JsonProperty("harshBrakingCount")
  public Integer getHarshBrakingCount() {
    return harshBrakingCount;
  }
  public void setHarshBrakingCount(Integer harshBrakingCount) {
    this.harshBrakingCount = harshBrakingCount;
  }

    
  @JsonProperty("harshEvents")
  public List<SafetyReportHarshEvent> getHarshEvents() {
    return harshEvents;
  }
  public void setHarshEvents(List<SafetyReportHarshEvent> harshEvents) {
    this.harshEvents = harshEvents;
  }

    
  @JsonProperty("harshTurningCount")
  public Integer getHarshTurningCount() {
    return harshTurningCount;
  }
  public void setHarshTurningCount(Integer harshTurningCount) {
    this.harshTurningCount = harshTurningCount;
  }

    
  @JsonProperty("safetyScore")
  public Integer getSafetyScore() {
    return safetyScore;
  }
  public void setSafetyScore(Integer safetyScore) {
    this.safetyScore = safetyScore;
  }

    
  @JsonProperty("safetyScoreRank")
  public String getSafetyScoreRank() {
    return safetyScoreRank;
  }
  public void setSafetyScoreRank(String safetyScoreRank) {
    this.safetyScoreRank = safetyScoreRank;
  }

    
  @JsonProperty("timeOverSpeedLimitMs")
  public Integer getTimeOverSpeedLimitMs() {
    return timeOverSpeedLimitMs;
  }
  public void setTimeOverSpeedLimitMs(Integer timeOverSpeedLimitMs) {
    this.timeOverSpeedLimitMs = timeOverSpeedLimitMs;
  }

    
  @JsonProperty("totalDistanceDrivenMeters")
  public Integer getTotalDistanceDrivenMeters() {
    return totalDistanceDrivenMeters;
  }
  public void setTotalDistanceDrivenMeters(Integer totalDistanceDrivenMeters) {
    this.totalDistanceDrivenMeters = totalDistanceDrivenMeters;
  }

    
  @JsonProperty("totalHarshEventCount")
  public Integer getTotalHarshEventCount() {
    return totalHarshEventCount;
  }
  public void setTotalHarshEventCount(Integer totalHarshEventCount) {
    this.totalHarshEventCount = totalHarshEventCount;
  }

    
  @JsonProperty("totalTimeDrivenMs")
  public Integer getTotalTimeDrivenMs() {
    return totalTimeDrivenMs;
  }
  public void setTotalTimeDrivenMs(Integer totalTimeDrivenMs) {
    this.totalTimeDrivenMs = totalTimeDrivenMs;
  }

    
  @JsonProperty("vehicleId")
  public Integer getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleSafetyScoreResponse vehicleSafetyScoreResponse = (VehicleSafetyScoreResponse) o;
    return Objects.equals(crashCount, vehicleSafetyScoreResponse.crashCount) &&
        Objects.equals(harshAccelCount, vehicleSafetyScoreResponse.harshAccelCount) &&
        Objects.equals(harshBrakingCount, vehicleSafetyScoreResponse.harshBrakingCount) &&
        Objects.equals(harshEvents, vehicleSafetyScoreResponse.harshEvents) &&
        Objects.equals(harshTurningCount, vehicleSafetyScoreResponse.harshTurningCount) &&
        Objects.equals(safetyScore, vehicleSafetyScoreResponse.safetyScore) &&
        Objects.equals(safetyScoreRank, vehicleSafetyScoreResponse.safetyScoreRank) &&
        Objects.equals(timeOverSpeedLimitMs, vehicleSafetyScoreResponse.timeOverSpeedLimitMs) &&
        Objects.equals(totalDistanceDrivenMeters, vehicleSafetyScoreResponse.totalDistanceDrivenMeters) &&
        Objects.equals(totalHarshEventCount, vehicleSafetyScoreResponse.totalHarshEventCount) &&
        Objects.equals(totalTimeDrivenMs, vehicleSafetyScoreResponse.totalTimeDrivenMs) &&
        Objects.equals(vehicleId, vehicleSafetyScoreResponse.vehicleId);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
