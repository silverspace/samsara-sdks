package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.TemperatureResponseSensors;

/**
 * Contains the current temperatures of a sensor.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class TemperatureResponse   {
  
  private Long groupId;
  private List<TemperatureResponseSensors> sensors = new ArrayList<>();

  public TemperatureResponse () {

  }

  public TemperatureResponse (Long groupId, List<TemperatureResponseSensors> sensors) {
    this.groupId = groupId;
    this.sensors = sensors;
  }

    
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

    
  @JsonProperty("sensors")
  public List<TemperatureResponseSensors> getSensors() {
    return sensors;
  }
  public void setSensors(List<TemperatureResponseSensors> sensors) {
    this.sensors = sensors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemperatureResponse temperatureResponse = (TemperatureResponse) o;
    return Objects.equals(groupId, temperatureResponse.groupId) &&
        Objects.equals(sensors, temperatureResponse.sensors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, sensors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemperatureResponse {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    sensors: ").append(toIndentedString(sensors)).append("\n");
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
