package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * List of harsh events
 */
@ApiModel(description = "List of harsh events")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class SafetyReportHarshEvent   {
  @JsonProperty("harshEventType")
  private String harshEventType;

  @JsonProperty("timestampMs")
  private Integer timestampMs;

  @JsonProperty("vehicleId")
  private Integer vehicleId;

  public SafetyReportHarshEvent harshEventType(String harshEventType) {
    this.harshEventType = harshEventType;
    return this;
  }

   /**
   * Type of the harsh event
   * @return harshEventType
  **/
  @ApiModelProperty(example = "Harsh Braking", value = "Type of the harsh event")
  public String getHarshEventType() {
    return harshEventType;
  }

  public void setHarshEventType(String harshEventType) {
    this.harshEventType = harshEventType;
  }

  public SafetyReportHarshEvent timestampMs(Integer timestampMs) {
    this.timestampMs = timestampMs;
    return this;
  }

   /**
   * Timestamp that the harsh event occurred in Unix milliseconds since epoch
   * @return timestampMs
  **/
  @ApiModelProperty(example = "1535590776000", value = "Timestamp that the harsh event occurred in Unix milliseconds since epoch")
  public Integer getTimestampMs() {
    return timestampMs;
  }

  public void setTimestampMs(Integer timestampMs) {
    this.timestampMs = timestampMs;
  }

  public SafetyReportHarshEvent vehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * Vehicle associated with the harsh event
   * @return vehicleId
  **/
  @ApiModelProperty(example = "212014918086169", value = "Vehicle associated with the harsh event")
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
    return Objects.equals(this.harshEventType, safetyReportHarshEvent.harshEventType) &&
        Objects.equals(this.timestampMs, safetyReportHarshEvent.timestampMs) &&
        Objects.equals(this.vehicleId, safetyReportHarshEvent.vehicleId);
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

