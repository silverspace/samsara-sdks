package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CargoResponseSensors;

/**
 * Contains the current cargo status of a sensor.
 */
@ApiModel(description = "Contains the current cargo status of a sensor.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class CargoResponse   {
  @JsonProperty("groupId")
  private Long groupId;

  @JsonProperty("sensors")
  private List<CargoResponseSensors> sensors = null;

  public CargoResponse groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @ApiModelProperty(example = "101", value = "")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public CargoResponse sensors(List<CargoResponseSensors> sensors) {
    this.sensors = sensors;
    return this;
  }

  public CargoResponse addSensorsItem(CargoResponseSensors sensorsItem) {
    if (this.sensors == null) {
      this.sensors = new ArrayList<CargoResponseSensors>();
    }
    this.sensors.add(sensorsItem);
    return this;
  }

   /**
   * Get sensors
   * @return sensors
  **/
  @ApiModelProperty(value = "")
  public List<CargoResponseSensors> getSensors() {
    return sensors;
  }

  public void setSensors(List<CargoResponseSensors> sensors) {
    this.sensors = sensors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CargoResponse cargoResponse = (CargoResponse) o;
    return Objects.equals(this.groupId, cargoResponse.groupId) &&
        Objects.equals(this.sensors, cargoResponse.sensors);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

