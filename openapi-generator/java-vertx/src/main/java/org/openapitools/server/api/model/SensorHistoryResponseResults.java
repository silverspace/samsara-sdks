package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class SensorHistoryResponseResults   {
  
  private List<Long> series = new ArrayList<>();
  private Integer timeMs;

  public SensorHistoryResponseResults () {

  }

  public SensorHistoryResponseResults (List<Long> series, Integer timeMs) {
    this.series = series;
    this.timeMs = timeMs;
  }

    
  @JsonProperty("series")
  public List<Long> getSeries() {
    return series;
  }
  public void setSeries(List<Long> series) {
    this.series = series;
  }

    
  @JsonProperty("timeMs")
  public Integer getTimeMs() {
    return timeMs;
  }
  public void setTimeMs(Integer timeMs) {
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
    SensorHistoryResponseResults sensorHistoryResponseResults = (SensorHistoryResponseResults) o;
    return Objects.equals(series, sensorHistoryResponseResults.series) &&
        Objects.equals(timeMs, sensorHistoryResponseResults.timeMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(series, timeMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensorHistoryResponseResults {\n");
    
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
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
