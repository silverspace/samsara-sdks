package io.swagger.model;

import io.swagger.annotations.ApiModel;

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
  * List of harsh events
 **/
@ApiModel(description="List of harsh events")
public class SafetyReportHarshEvent  {
  
  @ApiModelProperty(example = "Harsh Braking", value = "Type of the harsh event")
 /**
   * Type of the harsh event
  **/
  private String harshEventType = null;

  @ApiModelProperty(example = "1535590776000", value = "Timestamp that the harsh event occurred in Unix milliseconds since epoch")
 /**
   * Timestamp that the harsh event occurred in Unix milliseconds since epoch
  **/
  private Integer timestampMs = null;

  @ApiModelProperty(example = "212014918086169", value = "Vehicle associated with the harsh event")
 /**
   * Vehicle associated with the harsh event
  **/
  private Integer vehicleId = null;
 /**
   * Type of the harsh event
   * @return harshEventType
  **/
  @JsonProperty("harshEventType")
  public String getHarshEventType() {
    return harshEventType;
  }

  public void setHarshEventType(String harshEventType) {
    this.harshEventType = harshEventType;
  }

  public SafetyReportHarshEvent harshEventType(String harshEventType) {
    this.harshEventType = harshEventType;
    return this;
  }

 /**
   * Timestamp that the harsh event occurred in Unix milliseconds since epoch
   * @return timestampMs
  **/
  @JsonProperty("timestampMs")
  public Integer getTimestampMs() {
    return timestampMs;
  }

  public void setTimestampMs(Integer timestampMs) {
    this.timestampMs = timestampMs;
  }

  public SafetyReportHarshEvent timestampMs(Integer timestampMs) {
    this.timestampMs = timestampMs;
    return this;
  }

 /**
   * Vehicle associated with the harsh event
   * @return vehicleId
  **/
  @JsonProperty("vehicleId")
  public Integer getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
  }

  public SafetyReportHarshEvent vehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

