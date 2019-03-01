package org.openapitools.model;

import io.swagger.annotations.ApiModel;
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
  * Digital value of an aux input.
 **/
@ApiModel(description="Digital value of an aux input.")
public class AuxInput  {
  
  @ApiModelProperty(example = "1546542978484", required = true, value = "Timestamp in Unix epoch milliseconds.")
 /**
   * Timestamp in Unix epoch milliseconds.
  **/
  private Object timeMs;

  @ApiModelProperty(example = "true", required = true, value = "Boolean representing the digital value of the aux input.")
 /**
   * Boolean representing the digital value of the aux input.
  **/
  private Boolean value;
 /**
   * Timestamp in Unix epoch milliseconds.
   * @return timeMs
  **/
  @JsonProperty("timeMs")
  @NotNull
  public Object getTimeMs() {
    return timeMs;
  }

  public void setTimeMs(Object timeMs) {
    this.timeMs = timeMs;
  }

  public AuxInput timeMs(Object timeMs) {
    this.timeMs = timeMs;
    return this;
  }

 /**
   * Boolean representing the digital value of the aux input.
   * @return value
  **/
  @JsonProperty("value")
  @NotNull
  public Boolean getValue() {
    return value;
  }

  public void setValue(Boolean value) {
    this.value = value;
  }

  public AuxInput value(Boolean value) {
    this.value = value;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuxInput {\n");
    
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

