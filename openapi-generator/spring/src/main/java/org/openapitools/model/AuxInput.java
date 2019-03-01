package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Digital value of an aux input.
 */
@ApiModel(description = "Digital value of an aux input.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

public class AuxInput   {
  @JsonProperty("timeMs")
  private Object timeMs;

  @JsonProperty("value")
  private Boolean value;

  public AuxInput timeMs(Object timeMs) {
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

  public AuxInput value(Boolean value) {
    this.value = value;
    return this;
  }

  /**
   * Boolean representing the digital value of the aux input.
   * @return value
  */
  @ApiModelProperty(example = "true", required = true, value = "Boolean representing the digital value of the aux input.")
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
    return Objects.equals(this.timeMs, auxInput.timeMs) &&
        Objects.equals(this.value, auxInput.value);
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

