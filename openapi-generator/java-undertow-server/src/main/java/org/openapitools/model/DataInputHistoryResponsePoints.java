package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-03-01T05:34:49.851Z[GMT]")
public class DataInputHistoryResponsePoints   {
  
  private Double value;
  private Long timeMs;

  /**
   **/
  public DataInputHistoryResponsePoints value(Double value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(example = "12.332", value = "")
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }

  /**
   **/
  public DataInputHistoryResponsePoints timeMs(Long timeMs) {
    this.timeMs = timeMs;
    return this;
  }

  
  @ApiModelProperty(example = "1453449599999", value = "")
  @JsonProperty("timeMs")
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
    return Objects.equals(value, dataInputHistoryResponsePoints.value) &&
        Objects.equals(timeMs, dataInputHistoryResponsePoints.timeMs);
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

