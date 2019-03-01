package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List of harsh events
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class SafetyReportHarshEvent   {
  
  private String harshEventType;
  private Integer timestampMs;
  private Integer vehicleId;

  public SafetyReportHarshEvent () {

  }

  public SafetyReportHarshEvent (String harshEventType, Integer timestampMs, Integer vehicleId) {
    this.harshEventType = harshEventType;
    this.timestampMs = timestampMs;
    this.vehicleId = vehicleId;
  }

    
  @JsonProperty("harshEventType")
  public String getHarshEventType() {
    return harshEventType;
  }
  public void setHarshEventType(String harshEventType) {
    this.harshEventType = harshEventType;
  }

    
  @JsonProperty("timestampMs")
  public Integer getTimestampMs() {
    return timestampMs;
  }
  public void setTimestampMs(Integer timestampMs) {
    this.timestampMs = timestampMs;
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
    SafetyReportHarshEvent safetyReportHarshEvent = (SafetyReportHarshEvent) o;
    return Objects.equals(harshEventType, safetyReportHarshEvent.harshEventType) &&
        Objects.equals(timestampMs, safetyReportHarshEvent.timestampMs) &&
        Objects.equals(vehicleId, safetyReportHarshEvent.vehicleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(harshEventType, timestampMs, vehicleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SafetyReportHarshEvent {\n");
    
    sb.append("    harshEventType: ").append(toIndentedString(harshEventType)).append("\n");
    sb.append("    timestampMs: ").append(toIndentedString(timestampMs)).append("\n");
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
