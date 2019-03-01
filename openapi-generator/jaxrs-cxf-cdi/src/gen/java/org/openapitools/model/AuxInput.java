package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Digital value of an aux input.
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "Digital value of an aux input.")

public class AuxInput   {
  
  private Object timeMs;

  private Boolean value;


  /**
   * Timestamp in Unix epoch milliseconds.
   **/
  public AuxInput timeMs(Object timeMs) {
    this.timeMs = timeMs;
    return this;
  }

  
  @ApiModelProperty(example = "1546542978484", required = true, value = "Timestamp in Unix epoch milliseconds.")
  @JsonProperty("timeMs")
  @NotNull
  public Object getTimeMs() {
    return timeMs;
  }
  public void setTimeMs(Object timeMs) {
    this.timeMs = timeMs;
  }


  /**
   * Boolean representing the digital value of the aux input.
   **/
  public AuxInput value(Boolean value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(example = "true", required = true, value = "Boolean representing the digital value of the aux input.")
  @JsonProperty("value")
  @NotNull
  public Boolean getValue() {
    return value;
  }
  public void setValue(Boolean value) {
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
    AuxInput auxInput = (AuxInput) o;
    return Objects.equals(timeMs, auxInput.timeMs) &&
        Objects.equals(value, auxInput.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeMs, value);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

