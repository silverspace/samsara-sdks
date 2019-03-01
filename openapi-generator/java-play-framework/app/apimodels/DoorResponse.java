package apimodels;

import apimodels.DoorResponseSensors;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Contains the current door status of a sensor.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DoorResponse   {
  @JsonProperty("groupId")
  private Long groupId;

  @JsonProperty("sensors")
  private List<DoorResponseSensors> sensors = null;

  public DoorResponse groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
    public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public DoorResponse sensors(List<DoorResponseSensors> sensors) {
    this.sensors = sensors;
    return this;
  }

  public DoorResponse addSensorsItem(DoorResponseSensors sensorsItem) {
    if (sensors == null) {
      sensors = new ArrayList<>();
    }
    sensors.add(sensorsItem);
    return this;
  }

   /**
   * Get sensors
   * @return sensors
  **/
  @Valid
  public List<DoorResponseSensors> getSensors() {
    return sensors;
  }

  public void setSensors(List<DoorResponseSensors> sensors) {
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
    DoorResponse doorResponse = (DoorResponse) o;
    return Objects.equals(groupId, doorResponse.groupId) &&
        Objects.equals(sensors, doorResponse.sensors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, sensors);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

