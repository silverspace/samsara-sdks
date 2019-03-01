package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.CargoResponseSensors;

/**
 * Contains the current cargo status of a sensor.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class CargoResponse   {
  
  private Long groupId;
  private List<CargoResponseSensors> sensors = new ArrayList<>();

  public CargoResponse () {

  }

  public CargoResponse (Long groupId, List<CargoResponseSensors> sensors) {
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
  public List<CargoResponseSensors> getSensors() {
    return sensors;
  }
  public void setSensors(List<CargoResponseSensors> sensors) {
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
    CargoResponse cargoResponse = (CargoResponse) o;
    return Objects.equals(groupId, cargoResponse.groupId) &&
        Objects.equals(sensors, cargoResponse.sensors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, sensors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CargoResponse {\n");
    
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
