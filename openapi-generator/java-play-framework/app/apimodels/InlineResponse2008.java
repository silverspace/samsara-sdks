package apimodels;

import apimodels.Sensor;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * InlineResponse2008
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class InlineResponse2008   {
  @JsonProperty("sensors")
  private List<Sensor> sensors = null;

  public InlineResponse2008 sensors(List<Sensor> sensors) {
    this.sensors = sensors;
    return this;
  }

  public InlineResponse2008 addSensorsItem(Sensor sensorsItem) {
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
  public List<Sensor> getSensors() {
    return sensors;
  }

  public void setSensors(List<Sensor> sensors) {
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
    InlineResponse2008 inlineResponse2008 = (InlineResponse2008) o;
    return Objects.equals(sensors, inlineResponse2008.sensors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sensors);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008 {\n");
    
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

