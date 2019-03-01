package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.AuxInput;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * A list of aux input values over a timerange.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "A list of aux input values over a timerange.")

public class AuxInputSeries   {
  

public enum NameEnum {

    EMERGENCY_LIGHTS(String.valueOf("Emergency Lights")), EMERGENCY_ALARM(String.valueOf("Emergency Alarm")), STOP_PADDLE(String.valueOf("Stop Paddle")), POWER_TAKE_OFF(String.valueOf("Power Take-Off")), PLOW(String.valueOf("Plow")), SWEEPER(String.valueOf("Sweeper")), SALTER(String.valueOf("Salter")), BOOM(String.valueOf("Boom"));


    private String value;

    NameEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static NameEnum fromValue(String v) {
        for (NameEnum b : NameEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  private @Valid NameEnum name = null;
  private @Valid List<AuxInput> values = new ArrayList<AuxInput>();

  /**
   * The name of the aux input.
   **/
  public AuxInputSeries name(NameEnum name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Boom", required = true, value = "The name of the aux input.")
  @JsonProperty("name")
  @NotNull
  public NameEnum getName() {
    return name;
  }
  public void setName(NameEnum name) {
    this.name = name;
  }

  /**
   **/
  public AuxInputSeries values(List<AuxInput> values) {
    this.values = values;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("values")
  @NotNull
  public List<AuxInput> getValues() {
    return values;
  }
  public void setValues(List<AuxInput> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

