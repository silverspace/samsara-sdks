package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The state of the vehicle over time. State can be Running, Off, or Idle.
 */
@ApiModel(description = "The state of the vehicle over time. State can be Running, Off, or Idle.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

public class EngineState   {
  @JsonProperty("timeMs")
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

    @JsonCreator
    public static ValueEnum fromValue(String text) {
      for (ValueEnum b : ValueEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("value")
  private ValueEnum value;

  public EngineState timeMs(Object timeMs) {
    this.timeMs = timeMs;
    return this;
  }

  /**
   * Timestamp in Unix epoch milliseconds.
   * @return timeMs
  */
  @ApiModelProperty(example = "1546542978484", required = true, value = "Timestamp in Unix epoch milliseconds.")
  @NotNull


  public Object getTimeMs() {
    return timeMs;
  }

  public void setTimeMs(Object timeMs) {
    this.timeMs = timeMs;
  }

  public EngineState value(ValueEnum value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(this.timeMs, engineState.timeMs) &&
        Objects.equals(this.value, engineState.value);
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

