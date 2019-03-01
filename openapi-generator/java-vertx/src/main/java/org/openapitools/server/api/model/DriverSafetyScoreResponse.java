package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.SafetyReportHarshEvent;

/**
 * Safety score details for a driver
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class DriverSafetyScoreResponse   {
  
  private Integer crashCount;
  private Integer driverId;
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

  public DriverSafetyScoreResponse () {

  }

  public DriverSafetyScoreResponse (Integer crashCount, Integer driverId, Integer harshAccelCount, Integer harshBrakingCount, List<SafetyReportHarshEvent> harshEvents, Integer harshTurningCount, Integer safetyScore, String safetyScoreRank, Integer timeOverSpeedLimitMs, Integer totalDistanceDrivenMeters, Integer totalHarshEventCount, Integer totalTimeDrivenMs) {
    this.crashCount = crashCount;
    this.driverId = driverId;
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
  }

    
  @JsonProperty("crashCount")
  public Integer getCrashCount() {
    return crashCount;
  }
  public void setCrashCount(Integer crashCount) {
    this.crashCount = crashCount;
  }

    
  @JsonProperty("driverId")
  public Integer getDriverId() {
    return driverId;
  }
  public void setDriverId(Integer driverId) {
    this.driverId = driverId;
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


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
