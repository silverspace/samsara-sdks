package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.Sensor;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class InlineResponse2008   {
  
  private List<Sensor> sensors = new ArrayList<>();

  public InlineResponse2008 () {

  }

  public InlineResponse2008 (List<Sensor> sensors) {
    this.sensors = sensors;
  }

    
  @JsonProperty("sensors")
  public List<Sensor> getSensors() {
    return sensors;
  }
  public void setSensors(List<Sensor> sensors) {
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
    InlineResponse2008 inlineResponse2008 = (InlineResponse2008) o;
    return Objects.equals(sensors, inlineResponse2008.sensors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sensors);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
