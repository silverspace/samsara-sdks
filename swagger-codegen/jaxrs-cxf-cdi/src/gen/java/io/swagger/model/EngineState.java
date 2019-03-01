package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import javax.validation.constraints.*;

/**
 * The state of the vehicle over time. State can be Running, Off, or Idle.
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "The state of the vehicle over time. State can be Running, Off, or Idle.")

public class EngineState   {
  
  private BigDecimal timeMs = null;

@XmlType(name="ValueEnum")
@XmlEnum(String.class)
public enum ValueEnum {

    @XmlEnumValue("Running") RUNNING(String.valueOf("Running")), @XmlEnumValue("Off") OFF(String.valueOf("Off")), @XmlEnumValue("Idle") IDLE(String.valueOf("Idle"));


    private String value;

    ValueEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ValueEnum fromValue(String v) {
        for (ValueEnum b : ValueEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  private ValueEnum value = null;

  /**
   * Timestamp in Unix epoch milliseconds.
   **/
  public EngineState timeMs(BigDecimal timeMs) {
    this.timeMs = timeMs;
    return this;
  }

  
  @ApiModelProperty(example = "1.546542978484E12", required = true, value = "Timestamp in Unix epoch milliseconds.")
  @JsonProperty("timeMs")
  @NotNull
  public BigDecimal getTimeMs() {
    return timeMs;
  }
  public void setTimeMs(BigDecimal timeMs) {
    this.timeMs = timeMs;
  }

  /**
   **/
  public EngineState value(ValueEnum value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("value")
  @NotNull
  public ValueEnum getValue() {
    return value;
  }
  public void setValue(ValueEnum value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EngineState engineState = (EngineState) o;
    return Objects.equals(timeMs, engineState.timeMs) &&
        Objects.equals(value, engineState.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeMs, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EngineState {\n");
    
    sb.append("    timeMs: ").append(toIndentedString(timeMs)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

