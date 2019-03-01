package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AuxInput;
import javax.validation.constraints.*;

/**
 * A list of aux input values over a timerange.
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "A list of aux input values over a timerange.")

public class AuxInputSeries   {
  

@XmlType(name="NameEnum")
@XmlEnum(String.class)
public enum NameEnum {

    @XmlEnumValue("Emergency Lights") EMERGENCY_LIGHTS(String.valueOf("Emergency Lights")), @XmlEnumValue("Emergency Alarm") EMERGENCY_ALARM(String.valueOf("Emergency Alarm")), @XmlEnumValue("Stop Paddle") STOP_PADDLE(String.valueOf("Stop Paddle")), @XmlEnumValue("Power Take-Off") POWER_TAKE_OFF(String.valueOf("Power Take-Off")), @XmlEnumValue("Plow") PLOW(String.valueOf("Plow")), @XmlEnumValue("Sweeper") SWEEPER(String.valueOf("Sweeper")), @XmlEnumValue("Salter") SALTER(String.valueOf("Salter")), @XmlEnumValue("Boom") BOOM(String.valueOf("Boom"));


    private String value;

    NameEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NameEnum fromValue(String v) {
        for (NameEnum b : NameEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "'");
    }
}

  private NameEnum name;

  private List<AuxInput> values = new ArrayList<AuxInput>();


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

  public AuxInputSeries addValuesItem(AuxInput valuesItem) {
    this.values.add(valuesItem);
    return this;
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

