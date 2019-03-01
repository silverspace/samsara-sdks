package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public class SensorHistoryResponseResults   {
  

  private List<Long> series = new ArrayList<Long>();

  private Integer timeMs;

  /**
   * List of datapoints, one for each requested (sensor, field) pair.
   **/
  
  @ApiModelProperty(value = "List of datapoints, one for each requested (sensor, field) pair.")
  @JsonProperty("series")
  public List<Long> getSeries() {
    return series;
  }
  public void setSeries(List<Long> series) {
    this.series = series;
  }

  /**
   * Timestamp in UNIX milliseconds.
   **/
  
  @ApiModelProperty(example = "1453449599999", value = "Timestamp in UNIX milliseconds.")
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

