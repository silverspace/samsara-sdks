package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class DataInputHistoryResponsePoints   {
  
  private Double value;
  private Long timeMs;

  public DataInputHistoryResponsePoints () {

  }

  public DataInputHistoryResponsePoints (Double value, Long timeMs) {
    this.value = value;
    this.timeMs = timeMs;
  }

    
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }

    
  @JsonProperty("timeMs")
  public Long getTimeMs() {
    return timeMs;
  }
  public void setTimeMs(Long timeMs) {
    this.timeMs = timeMs;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
