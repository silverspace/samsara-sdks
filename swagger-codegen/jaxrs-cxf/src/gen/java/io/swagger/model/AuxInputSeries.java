package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.AuxInput;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * A list of aux input values over a timerange.
 **/
@ApiModel(description="A list of aux input values over a timerange.")
public class AuxInputSeries  {
  

@XmlType(name="NameEnum")
@XmlEnum(String.class)
public enum NameEnum {

@XmlEnumValue("Emergency Lights") EMERGENCY_LIGHTS(String.valueOf("Emergency Lights")), @XmlEnumValue("Emergency Alarm") EMERGENCY_ALARM(String.valueOf("Emergency Alarm")), @XmlEnumValue("Stop Paddle") STOP_PADDLE(String.valueOf("Stop Paddle")), @XmlEnumValue("Power Take-Off") POWER_TAKE_OFF(String.valueOf("Power Take-Off")), @XmlEnumValue("Plow") PLOW(String.valueOf("Plow")), @XmlEnumValue("Sweeper") SWEEPER(String.valueOf("Sweeper")), @XmlEnumValue("Salter") SALTER(String.valueOf("Salter")), @XmlEnumValue("Boom") BOOM(String.valueOf("Boom"));


    private String value;

    NameEnum (String v) {
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
        return null;
    }
}

  @ApiModelProperty(example = "Boom", required = true, value = "The name of the aux input.")
 /**
   * The name of the aux input.
  **/
  private NameEnum name = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<AuxInput> values = new ArrayList<AuxInput>();
 /**
   * The name of the aux input.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    if (name == null) {
      return null;
    }
    return name.value();
  }

  public void setName(NameEnum name) {
    this.name = name;
  }

  public AuxInputSeries name(NameEnum name) {
    this.name = name;
    return this;
  }

 /**
   * Get values
   * @return values
  **/
  @JsonProperty("values")
  @NotNull
  public List<AuxInput> getValues() {
    return values;
  }

  public void setValues(List<AuxInput> values) {
    this.values = values;
  }

  public AuxInputSeries values(List<AuxInput> values) {
    this.values = values;
    return this;
  }

  public AuxInputSeries addValuesItem(AuxInput valuesItem) {
    this.values.add(valuesItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

