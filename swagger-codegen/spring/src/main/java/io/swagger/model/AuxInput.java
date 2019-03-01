package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Digital value of an aux input.
 */
@ApiModel(description = "Digital value of an aux input.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class AuxInput   {
  @JsonProperty("timeMs")
  private BigDecimal timeMs = null;

  @JsonProperty("value")
  private Boolean value = null;

  public AuxInput timeMs(BigDecimal timeMs) {
    this.timeMs = timeMs;
    return this;
  }

  /**
   * Timestamp in Unix epoch milliseconds.
   * @return timeMs
  **/
  @ApiModelProperty(example = "1.546542978484E12", required = true, value = "Timestamp in Unix epoch milliseconds.")
  @NotNull

  @Valid

  public BigDecimal getTimeMs() {
    return timeMs;
  }

  public void setTimeMs(BigDecimal timeMs) {
    this.timeMs = timeMs;
  }

  public AuxInput value(Boolean value) {
    this.value = value;
    return this;
  }

  /**
   * Boolean representing the digital value of the aux input.
   * @return value
  **/
  @ApiModelProperty(example = "true", required = true, value = "Boolean representing the digital value of the aux input.")
  @NotNull


  public Boolean isValue() {
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

