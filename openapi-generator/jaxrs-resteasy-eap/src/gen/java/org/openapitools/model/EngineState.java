package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="The state of the vehicle over time. State can be Running, Off, or Idle.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public class EngineState   {
  

  private Object timeMs;

  /**
   * Gets or Sets value
   */
  public enum ValueEnum {
    RUNNING("Running"),

        OFF("Off"),

        IDLE("Idle");
    private String value;

    ValueEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }


  private ValueEnum value;

  /**
   * Timestamp in Unix epoch milliseconds.
   **/
  
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
   **/
  
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
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

