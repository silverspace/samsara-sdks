package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * List of harsh events
 **/
@ApiModel(description = "List of harsh events")
public class SafetyReportHarshEvent   {
  
  private @Valid String harshEventType;
  private @Valid Integer timestampMs;
  private @Valid Integer vehicleId;

  /**
   * Type of the harsh event
   **/
  public SafetyReportHarshEvent harshEventType(String harshEventType) {
    this.harshEventType = harshEventType;
    return this;
  }

  
  @ApiModelProperty(example = "Harsh Braking", value = "Type of the harsh event")
  @JsonProperty("harshEventType")
  public String getHarshEventType() {
    return harshEventType;
  }
  public void setHarshEventType(String harshEventType) {
    this.harshEventType = harshEventType;
  }

  /**
   * Timestamp that the harsh event occurred in Unix milliseconds since epoch
   **/
  public SafetyReportHarshEvent timestampMs(Integer timestampMs) {
    this.timestampMs = timestampMs;
    return this;
  }

  
  @ApiModelProperty(example = "1535590776000", value = "Timestamp that the harsh event occurred in Unix milliseconds since epoch")
  @JsonProperty("timestampMs")
  public Integer getTimestampMs() {
    return timestampMs;
  }
  public void setTimestampMs(Integer timestampMs) {
    this.timestampMs = timestampMs;
  }

  /**
   * Vehicle associated with the harsh event
   **/
  public SafetyReportHarshEvent vehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  
  @ApiModelProperty(example = "212014918086169", value = "Vehicle associated with the harsh event")
  @JsonProperty("vehicleId")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

