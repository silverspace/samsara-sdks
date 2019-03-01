package org.openapitools.model;

import io.swagger.annotations.ApiModel;

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
  * The state of the vehicle over time. State can be Running, Off, or Idle.
 **/
@ApiModel(description="The state of the vehicle over time. State can be Running, Off, or Idle.")
public class EngineState  {
  
  @ApiModelProperty(example = "1546542978484", required = true, value = "Timestamp in Unix epoch milliseconds.")
 /**
   * Timestamp in Unix epoch milliseconds.
  **/
  private Object timeMs;

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
        throw new IllegalArgumentException("Unexpected value '" + v + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private ValueEnum value;
 /**
   * Timestamp in Unix epoch milliseconds.
   * @return timeMs
  **/
  @JsonProperty("timeMs")
  public Object getTimeMs() {
    return timeMs;
  }

  public void setTimeMs(Object timeMs) {
    this.timeMs = timeMs;
  }

  public EngineState timeMs(Object timeMs) {
    this.timeMs = timeMs;
    return this;
  }

 /**
   * Get value
   * @return value
  **/
  @JsonProperty("value")
  public String getValue() {
    if (value == null) {
      return null;
    }
    return value.value();
  }

  public void setValue(ValueEnum value) {
    this.value = value;
  }

  public EngineState value(ValueEnum value) {
    this.value = value;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

