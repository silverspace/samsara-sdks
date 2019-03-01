package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DoorResponseSensors;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Contains the current door status of a sensor.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public class DoorResponse   {
  

  private Long groupId;

  private List<DoorResponseSensors> sensors = new ArrayList<DoorResponseSensors>();

  /**
   **/
  
  @ApiModelProperty(example = "101", value = "")
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sensors")
  public List<DoorResponseSensors> getSensors() {
    return sensors;
  }
  public void setSensors(List<DoorResponseSensors> sensors) {
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
    DoorResponse doorResponse = (DoorResponse) o;
    return Objects.equals(groupId, doorResponse.groupId) &&
        Objects.equals(sensors, doorResponse.sensors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, sensors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoorResponse {\n");
    
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

