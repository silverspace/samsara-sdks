package apimodels;

import apimodels.SafetyReportHarshEvent;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Safety score details for a vehicle
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
    if (harshEvents == null) {
      harshEvents = new ArrayList<>();
    }
    harshEvents.add(harshEventsItem);
    return this;
  }

   /**
   * Get harshEvents
   * @return harshEvents
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

