package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.AuxInput;

/**
 * A list of aux input values over a timerange.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class AuxInputSeries   {
  


  public enum NameEnum {
    EMERGENCY_LIGHTS("Emergency Lights"),
    EMERGENCY_ALARM("Emergency Alarm"),
    STOP_PADDLE("Stop Paddle"),
    POWER_TAKE_OFF("Power Take-Off"),
    PLOW("Plow"),
    SWEEPER("Sweeper"),
    SALTER("Salter"),
    BOOM("Boom");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private NameEnum name;
  private List<AuxInput> values = new ArrayList<>();

  public AuxInputSeries () {

  }

  public AuxInputSeries (NameEnum name, List<AuxInput> values) {
    this.name = name;
    this.values = values;
  }

    
  @JsonProperty("name")
  public NameEnum getName() {
    return name;
  }
  public void setName(NameEnum name) {
    this.name = name;
  }

    
  @JsonProperty("values")
  public List<AuxInput> getValues() {
    return values;
  }
  public void setValues(List<AuxInput> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuxInputSeries auxInputSeries = (AuxInputSeries) o;
    return Objects.equals(name, auxInputSeries.name) &&
        Objects.equals(values, auxInputSeries.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuxInputSeries {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
