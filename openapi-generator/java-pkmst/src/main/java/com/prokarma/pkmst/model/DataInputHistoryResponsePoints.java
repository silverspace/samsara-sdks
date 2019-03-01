package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * DataInputHistoryResponsePoints
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class DataInputHistoryResponsePoints   {
  @JsonProperty("value")
  private Double value;

  @JsonProperty("timeMs")
  private Long timeMs;

  public DataInputHistoryResponsePoints value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "12.332", value = "")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public DataInputHistoryResponsePoints timeMs(Long timeMs) {
    this.timeMs = timeMs;
    return this;
  }

   /**
   * Get timeMs
   * @return timeMs
  **/
  @ApiModelProperty(example = "1453449599999", value = "")
  public Long getTimeMs() {
    return timeMs;
  }

  public void setTimeMs(Long timeMs) {
    this.timeMs = timeMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataInputHistoryResponsePoints dataInputHistoryResponsePoints = (DataInputHistoryResponsePoints) o;
    return Objects.equals(this.value, dataInputHistoryResponsePoints.value) &&
        Objects.equals(this.timeMs, dataInputHistoryResponsePoints.timeMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, timeMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataInputHistoryResponsePoints {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    timeMs: ").append(toIndentedString(timeMs)).append("\n");
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

