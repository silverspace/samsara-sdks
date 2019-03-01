package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.HumidityResponseSensors;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Contains the current humidity of a sensor.
 */
@ApiModel(description = "Contains the current humidity of a sensor.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class HumidityResponse   {
  @JsonProperty("groupId")
  private Long groupId;

  @JsonProperty("sensors")
  
  private List<HumidityResponseSensors> sensors = null;

  public HumidityResponse groupId(Long groupId) {
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

  public HumidityResponse sensors(List<HumidityResponseSensors> sensors) {
    this.sensors = sensors;
    return this;
  }

  public HumidityResponse addSensorsItem(HumidityResponseSensors sensorsItem) {
    if (this.sensors == null) {
      this.sensors = new ArrayList<>();
    }
    this.sensors.add(sensorsItem);
    return this;
  }

   /**
   * Get sensors
   * @return sensors
  **/
  @ApiModelProperty(value = "")
  public List<HumidityResponseSensors> getSensors() {
    return sensors;
  }

  public void setSensors(List<HumidityResponseSensors> sensors) {
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
    HumidityResponse humidityResponse = (HumidityResponse) o;
    return Objects.equals(this.groupId, humidityResponse.groupId) &&
        Objects.equals(this.sensors, humidityResponse.sensors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, sensors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HumidityResponse {\n");
    
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

